/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 *
 * If you like this project or if you find it useful, you can support us at:
 *
 * http://plantuml.com/patreon (only 1$ per month!)
 * http://plantuml.com/paypal
 *
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 *
 */
package net.sourceforge.plantuml.tim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sourceforge.plantuml.tim.expression.TValue;
import net.sourceforge.plantuml.tim.expression.TokenStack;

public class EaterFunctionCall extends Eater {

	private final List<TValue> values = new ArrayList<TValue>();
	private final boolean isLegacyDefine;
	private final boolean unquoted;

	public EaterFunctionCall(String s, boolean isLegacyDefine, boolean unquoted) {
		super(s);
		this.isLegacyDefine = isLegacyDefine;
		this.unquoted = unquoted;
	}

	@Override
	public void execute(TContext context, TMemory memory) throws EaterException {
		skipUntilChar('(');
		checkAndEatChar('(');
		skipSpaces();
		if (peekChar() == ')') {
			checkAndEatChar(')');
			return;
		}
		while (true) {
			skipSpaces();
			if (isLegacyDefine || unquoted) {
				final TValue result = TValue.fromString(eatAndGetOptionalQuotedString());
				values.add(result);
			} else {
				final TokenStack tokens = TokenStack.eatUntilCloseParenthesisOrComma(this).withoutSpace();
				tokens.guessFunctions();
				final TValue result = tokens.getResult(context, memory);
				values.add(result);
			}
			skipSpaces();
			final char ch = eatOneChar();
			if (ch == ',') {
				continue;
			}
			if (ch == ')') {
				break;
			}
			throw new EaterException("call001");
		}
	}

	private void executeLegacyDefine(TContext context, TMemory memory) throws EaterException {
		while (true) {
			skipSpaces();
			final TValue result = TValue.fromString(eatAndGetOptionalQuotedString());
			values.add(result);
			skipSpaces();
			final char ch = eatOneChar();
			if (ch == ',') {
				continue;
			}
			if (ch == ')') {
				break;
			}
			throw new EaterException("call001");
		}
	}

	public final List<TValue> getValues2() {
		return Collections.unmodifiableList(values);
	}

}
