//import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class RunTest {

	@Test
	public void testMain() {
		String[] argsArray = {
				"-tsvg", "D:\\Desktop\\New folder\\uml.txt"
		};
		try {
			net.sourceforge.plantuml.Run.main(argsArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String uml = "Drawing UML with PlantUML\r\n" + 
			"Language Reference Guide\r\n" + 
			"(Version 8023)\r\n" + 
			"PlantUML is an Open Source project that allows to quickly write:\r\n" + 
			"• Sequence diagram,\r\n" + 
			"• Usecase diagram,\r\n" + 
			"• Class diagram,\r\n" + 
			"• Activity diagram,\r\n" + 
			"• Component diagram,\r\n" + 
			"• State diagram,\r\n" + 
			"• Object diagram.\r\n" + 
			"Diagrams are defined using a simple and intuitive language.\r\n" + 
			"1 SEQUENCE DIAGRAM\r\n" + 
			"1 Sequence Diagram\r\n" + 
			"1.1 Basic examples\r\n" + 
			"The sequence \"->\" is used to draw a message between two participants. Participants do not have to be\r\n" + 
			"explicitly declared.\r\n" + 
			"To have a dotted arrow, you use -->\r\n" + 
			"It is also possible to use <- and <--. That does not change the drawing, but may improve readability.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob --> Alice: Authentication Response\r\n" + 
			"Alice -> Bob: Another authentication Request\r\n" + 
			"Alice <-- Bob: another authentication Response\r\n" + 
			"@enduml\r\n" + 
			"1.2 Comments\r\n" + 
			"Everything that starts with simple quote ' is a comment.\r\n" + 
			"You can also put comments on several lines using /' to start and '/ to end.\r\n" + 
			"1.3 Declaring participant\r\n" + 
			"It is possible to change participant order using the participant keyword.\r\n" + 
			"It is also possible to use other keywords to declare a participant:\r\n" + 
			"• actor\r\n" + 
			"• boundary\r\n" + 
			"• control\r\n" + 
			"• entity\r\n" + 
			"• database\r\n" + 
			"@startuml\r\n" + 
			"actor Foo1\r\n" + 
			"boundary Foo2\r\n" + 
			"control Foo3\r\n" + 
			"entity Foo4\r\n" + 
			"database Foo5\r\n" + 
			"Foo1 -> Foo2 : To boundary\r\n" + 
			"Foo1 -> Foo3 : To control\r\n" + 
			"Foo1 -> Foo4 : To entity\r\n" + 
			"Foo1 -> Foo5 : To database\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 1 of 120\r\n" + 
			"1.4 Use non-letters in participants 1 SEQUENCE DIAGRAM\r\n" + 
			"You can rename a participant using the as keyword.\r\n" + 
			"You can also change the background color of actor or participant.\r\n" + 
			"@startuml\r\n" + 
			"actor Bob #red\r\n" + 
			"' The only difference between actor\r\n" + 
			"'and participant is the drawing\r\n" + 
			"participant Alice\r\n" + 
			"participant \"I have a really\\nlong name\" as L #99FF99\r\n" + 
			"/' You can also declare:\r\n" + 
			"participant L as \"I have a really\\nlong name\" #99FF99\r\n" + 
			"'/\r\n" + 
			"Alice->Bob: Authentication Request\r\n" + 
			"Bob->Alice: Authentication Response\r\n" + 
			"Bob->L: Log transaction\r\n" + 
			"@enduml\r\n" + 
			"1.4 Use non-letters in participants\r\n" + 
			"You can use quotes to define participants. And you can use the as keyword to give an alias to those\r\n" + 
			"participants.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> \"Bob()\" : Hello\r\n" + 
			"\"Bob()\" -> \"This is very\\nlong\" as Long\r\n" + 
			"' You can also declare:\r\n" + 
			"' \"Bob()\" -> Long as \"This is very\\nlong\"\r\n" + 
			"Long --> \"Bob()\" : ok\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 2 of 120\r\n" + 
			"1.5 Message to Self 1 SEQUENCE DIAGRAM\r\n" + 
			"1.5 Message to Self\r\n" + 
			"A participant can send a message to itself.\r\n" + 
			"It is also possible to have multi-line using \\n.\r\n" + 
			"@startuml\r\n" + 
			"Alice->Alice: This is a signal to self.\\nIt also demonstrates\\nmultiline \\ntext\r\n" + 
			"@enduml\r\n" + 
			"1.6 Change arrow style\r\n" + 
			"You can change arrow style by several ways:\r\n" + 
			"• add a final x to denote a lost message\r\n" + 
			"• use \\ or / instead of < or > to have only the bottom or top part of the arrow\r\n" + 
			"• repeat the arrow head (for example, >> or //) head to have a thin drawing\r\n" + 
			"• use -- instead of - to have a dotted arrow\r\n" + 
			"• add a final ”o” at arrow head\r\n" + 
			"• use bidirectional arrow\r\n" + 
			"@startuml\r\n" + 
			"Bob ->x Alice\r\n" + 
			"Bob -> Alice\r\n" + 
			"Bob ->> Alice\r\n" + 
			"Bob -\\ Alice\r\n" + 
			"Bob \\\\- Alice\r\n" + 
			"Bob //-- Alice\r\n" + 
			"Bob ->o Alice\r\n" + 
			"Bob o\\\\-- Alice\r\n" + 
			"Bob <-> Alice\r\n" + 
			"Bob <->o Alice\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 3 of 120\r\n" + 
			"1.7 Change arrow color 1 SEQUENCE DIAGRAM\r\n" + 
			"1.7 Change arrow color\r\n" + 
			"You can change the color of individual arrows using the following notation:\r\n" + 
			"@startuml\r\n" + 
			"Bob -[#red]> Alice : hello\r\n" + 
			"Alice -[#0000FF]->Bob : ok\r\n" + 
			"@enduml\r\n" + 
			"1.8 Message sequence numbering\r\n" + 
			"The keyword autonumber is used to automatically add number to messages.\r\n" + 
			"@startuml\r\n" + 
			"autonumber\r\n" + 
			"Bob -> Alice : Authentication Request\r\n" + 
			"Bob <- Alice : Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"You can specify a startnumber with autonumber 'start' , and also an increment with autonumber\r\n" + 
			"'start' 'increment'.\r\n" + 
			"@startuml\r\n" + 
			"autonumber\r\n" + 
			"Bob -> Alice : Authentication Request\r\n" + 
			"Bob <- Alice : Authentication Response\r\n" + 
			"autonumber 15\r\n" + 
			"Bob -> Alice : Another authentication Request\r\n" + 
			"Bob <- Alice : Another authentication Response\r\n" + 
			"autonumber 40 10\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 4 of 120\r\n" + 
			"1.9 Title 1 SEQUENCE DIAGRAM\r\n" + 
			"Bob -> Alice : Yet another authentication Request\r\n" + 
			"Bob <- Alice : Yet another authentication Response\r\n" + 
			"@enduml\r\n" + 
			"You can specify a format for your number by using between double-quote.\r\n" + 
			"The formatting is done with the Java class DecimalFormat (’0’ means digit, ’#’ means digit and zero\r\n" + 
			"if absent).\r\n" + 
			"You can use some html tag in the format.\r\n" + 
			"@startuml\r\n" + 
			"autonumber \"<b>[000]\"\r\n" + 
			"Bob -> Alice : Authentication Request\r\n" + 
			"Bob <- Alice : Authentication Response\r\n" + 
			"autonumber 15 \"<b>(<u>##</u>)\"\r\n" + 
			"Bob -> Alice : Another authentication Request\r\n" + 
			"Bob <- Alice : Another authentication Response\r\n" + 
			"autonumber 40 10 \"<font color=red><b>Message 0 \"\r\n" + 
			"Bob -> Alice : Yet another authentication Request\r\n" + 
			"Bob <- Alice : Yet another authentication Response\r\n" + 
			"@enduml\r\n" + 
			"1.9 Title\r\n" + 
			"The title keywords is used to put a title.\r\n" + 
			"@startuml\r\n" + 
			"title Simple communication example\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 5 of 120\r\n" + 
			"1.10 Legend the diagram 1 SEQUENCE DIAGRAM\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob --> Alice: Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"1.10 Legend the diagram\r\n" + 
			"The legend and end legend are keywords is used to put a legend.\r\n" + 
			"You can optionally specify to have left, right or center alignment for the legend.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob : Hello\r\n" + 
			"legend right\r\n" + 
			"Short\r\n" + 
			"legend\r\n" + 
			"endlegend\r\n" + 
			"@enduml\r\n" + 
			"1.11 Splitting diagrams\r\n" + 
			"The newpage keyword is used to split a diagram into several images.\r\n" + 
			"You can put a title for the new page just after the newpage keyword.\r\n" + 
			"This is very handy with Word to print long diagram on several pages.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob : message 1\r\n" + 
			"Alice -> Bob : message 2\r\n" + 
			"newpage\r\n" + 
			"Alice -> Bob : message 3\r\n" + 
			"Alice -> Bob : message 4\r\n" + 
			"newpage A title for the\\nlast page\r\n" + 
			"Alice -> Bob : message 5\r\n" + 
			"Alice -> Bob : message 6\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 6 of 120\r\n" + 
			"1.12 Grouping message 1 SEQUENCE DIAGRAM\r\n" + 
			"1.12 Grouping message\r\n" + 
			"It is possible to group messages together using the following keywords:\r\n" + 
			"• alt/else\r\n" + 
			"• opt\r\n" + 
			"• loop\r\n" + 
			"• par\r\n" + 
			"• break\r\n" + 
			"• critical\r\n" + 
			"• group, followed by a text to be displayed\r\n" + 
			"It is possible a add a text that will be displayed into the header (except for group).\r\n" + 
			"The end keyword is used to close the group.\r\n" + 
			"Note that it is possible to nest groups.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"alt successful case\r\n" + 
			"Bob -> Alice: Authentication Accepted\r\n" + 
			"else some kind of failure\r\n" + 
			"Bob -> Alice: Authentication Failure\r\n" + 
			"group My own label\r\n" + 
			"Alice -> Log : Log attack start\r\n" + 
			"loop 1000 times\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 7 of 120\r\n" + 
			"1.13 Notes on messages 1 SEQUENCE DIAGRAM\r\n" + 
			"Alice -> Bob: DNS Attack\r\n" + 
			"end\r\n" + 
			"Alice -> Log : Log attack end\r\n" + 
			"end\r\n" + 
			"else Another type of failure\r\n" + 
			"Bob -> Alice: Please repeat\r\n" + 
			"end\r\n" + 
			"@enduml\r\n" + 
			"1.13 Notes on messages\r\n" + 
			"It is possible to put notes on message using the note left or note right keywords just after the message.\r\n" + 
			"You can have a multi-line note using the end note keywords.\r\n" + 
			"@startuml\r\n" + 
			"Alice->Bob : hello\r\n" + 
			"note left: this is a first note\r\n" + 
			"Bob->Alice : ok\r\n" + 
			"note right: this is another note\r\n" + 
			"Bob->Bob : I am thinking\r\n" + 
			"note left\r\n" + 
			"a note\r\n" + 
			"can also be defined\r\n" + 
			"on several lines\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 8 of 120\r\n" + 
			"1.14 Some other notes 1 SEQUENCE DIAGRAM\r\n" + 
			"1.14 Some other notes\r\n" + 
			"It is also possible to place notes relative to participant with note left of , note right of or note\r\n" + 
			"over keywords.\r\n" + 
			"It is possible to highlight a note by changing its background color.\r\n" + 
			"You can also have a multi-line note using the end note keywords.\r\n" + 
			"@startuml\r\n" + 
			"participant Alice\r\n" + 
			"participant Bob\r\n" + 
			"note left of Alice #aqua\r\n" + 
			"This is displayed\r\n" + 
			"left of Alice.\r\n" + 
			"end note\r\n" + 
			"note right of Alice: This is displayed right of Alice.\r\n" + 
			"note over Alice: This is displayed over Alice.\r\n" + 
			"note over Alice, Bob #FFAAAA: This is displayed\\n over Bob and Alice.\r\n" + 
			"note over Bob, Alice\r\n" + 
			"This is yet another\r\n" + 
			"example of\r\n" + 
			"a long note.\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 9 of 120\r\n" + 
			"1.15 Changing notes shape 1 SEQUENCE DIAGRAM\r\n" + 
			"1.15 Changing notes shape\r\n" + 
			"You can use hnote and rnote keywords to change note shapes.\r\n" + 
			"@startuml\r\n" + 
			"caller -> server : conReq\r\n" + 
			"hnote over caller : idle\r\n" + 
			"caller <- server : conConf\r\n" + 
			"rnote over server\r\n" + 
			"\"r\" as rectangle\r\n" + 
			"\"h\" as hexagon\r\n" + 
			"endrnote\r\n" + 
			"@enduml\r\n" + 
			"1.16 Creole and HTML\r\n" + 
			"It is also possible to use creole formatting:\r\n" + 
			"@startuml\r\n" + 
			"participant Alice\r\n" + 
			"participant \"The **Famous** Bob\" as Bob\r\n" + 
			"Alice -> Bob : hello --there--\r\n" + 
			"... Some ~~long delay~~ ...\r\n" + 
			"Bob -> Alice : ok\r\n" + 
			"note left\r\n" + 
			"This is **bold**\r\n" + 
			"This is //italics//\r\n" + 
			"This is \"\"monospaced\"\"\r\n" + 
			"This is --stroked --\r\n" + 
			"This is __underlined__\r\n" + 
			"This is ~~waved~~\r\n" + 
			"end note\r\n" + 
			"Alice -> Bob : A //well formatted// message\r\n" + 
			"note right of Alice\r\n" + 
			"This is <back:cadetblue ><size:18>displayed </size></back>\r\n" + 
			"__left of__ Alice.\r\n" + 
			"end note\r\n" + 
			"note left of Bob\r\n" + 
			"<u:red>This</u> is <color #118888>displayed </color>\r\n" + 
			"**<color purple>left of</color> <s:red>Alice </strike> Bob**.\r\n" + 
			"end note\r\n" + 
			"note over Alice, Bob\r\n" + 
			"<w:#FF33FF>This is hosted </w> by <img sourceforge.jpg>\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 10 of 120\r\n" + 
			"1.17 Divider 1 SEQUENCE DIAGRAM\r\n" + 
			"1.17 Divider\r\n" + 
			"If you want, you can split a diagram using == separator to divide your diagram into logical steps.\r\n" + 
			"@startuml\r\n" + 
			"== Initialization ==\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob --> Alice: Authentication Response\r\n" + 
			"== Repetition ==\r\n" + 
			"Alice -> Bob: Another authentication Request\r\n" + 
			"Alice <-- Bob: another authentication Response\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 11 of 120\r\n" + 
			"1.18 Reference 1 SEQUENCE DIAGRAM\r\n" + 
			"1.18 Reference\r\n" + 
			"You can use reference in a diagram, using the keyword ref over.\r\n" + 
			"@startuml\r\n" + 
			"participant Alice\r\n" + 
			"actor Bob\r\n" + 
			"ref over Alice, Bob : init\r\n" + 
			"Alice -> Bob : hello\r\n" + 
			"ref over Bob\r\n" + 
			"This can be on\r\n" + 
			"several lines\r\n" + 
			"end ref\r\n" + 
			"@enduml\r\n" + 
			"1.19 Delay\r\n" + 
			"You can use ... to indicate a delay in the diagram. And it is also possible to put a message with this\r\n" + 
			"delay.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"...\r\n" + 
			"Bob --> Alice: Authentication Response\r\n" + 
			"...5 minutes latter...\r\n" + 
			"Bob --> Alice: Bye !\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 12 of 120\r\n" + 
			"1.20 Space 1 SEQUENCE DIAGRAM\r\n" + 
			"1.20 Space\r\n" + 
			"You can use ||| to indicate some spacing in the diagram.\r\n" + 
			"It is also possible to specify a number of pixel to be used.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob: message 1\r\n" + 
			"Bob --> Alice: ok\r\n" + 
			"|||\r\n" + 
			"Alice -> Bob: message 2\r\n" + 
			"Bob --> Alice: ok\r\n" + 
			"||45||\r\n" + 
			"Alice -> Bob: message 3\r\n" + 
			"Bob --> Alice: ok\r\n" + 
			"@enduml\r\n" + 
			"1.21 Lifeline Activation and Destruction\r\n" + 
			"The activate and deactivate are used to denote participant activation.\r\n" + 
			"Once a participant is activated, its lifeline appears.\r\n" + 
			"The activate and deactivate apply on the previous message.\r\n" + 
			"The destroy denote the end of the lifeline of a participant.\r\n" + 
			"@startuml\r\n" + 
			"participant User\r\n" + 
			"User -> A: DoWork\r\n" + 
			"activate A\r\n" + 
			"A -> B: << createRequest >>\r\n" + 
			"activate B\r\n" + 
			"B -> C: DoWork\r\n" + 
			"activate C\r\n" + 
			"C --> B: WorkDone\r\n" + 
			"destroy C\r\n" + 
			"B --> A: RequestCreated\r\n" + 
			"deactivate B\r\n" + 
			"A -> User: Done\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 13 of 120\r\n" + 
			"1.22 Participant creation 1 SEQUENCE DIAGRAM\r\n" + 
			"Nested lifeline can be used, and it is possible to add a color on the lifeline.\r\n" + 
			"@startuml\r\n" + 
			"participant User\r\n" + 
			"User -> A: DoWork\r\n" + 
			"activate A #FFBBBB\r\n" + 
			"A -> A: Internal call\r\n" + 
			"activate A #DarkSalmon\r\n" + 
			"A -> B: << createRequest >>\r\n" + 
			"activate B\r\n" + 
			"B --> A: RequestCreated\r\n" + 
			"deactivate B\r\n" + 
			"deactivate A\r\n" + 
			"A -> User: Done\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"1.22 Participant creation\r\n" + 
			"You can use the create keyword just before the first reception of a message to emphasize the fact that\r\n" + 
			"this message is actually creating this new object.\r\n" + 
			"@startuml\r\n" + 
			"Bob -> Alice : hello\r\n" + 
			"create Other\r\n" + 
			"Alice -> Other : new\r\n" + 
			"create control String\r\n" + 
			"Alice -> String\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 14 of 120\r\n" + 
			"1.23 Incoming and outgoing messages 1 SEQUENCE DIAGRAM\r\n" + 
			"note right : You can also put notes!\r\n" + 
			"Alice --> Bob : ok\r\n" + 
			"@enduml\r\n" + 
			"1.23 Incoming and outgoing messages\r\n" + 
			"You can use incoming or outgoing arrows if you want to focus on a part of the diagram.\r\n" + 
			"Use square brackets to denote the left ”[” or the right ”]” side of the diagram.\r\n" + 
			"@startuml\r\n" + 
			"[-> A: DoWork\r\n" + 
			"activate A\r\n" + 
			"A -> A: Internal call\r\n" + 
			"activate A\r\n" + 
			"A ->] : << createRequest >>\r\n" + 
			"A<--] : RequestCreated\r\n" + 
			"deactivate A\r\n" + 
			"[<- A: Done\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"You can also have the following syntax:\r\n" + 
			"@startuml\r\n" + 
			"[-> Bob\r\n" + 
			"[o-> Bob\r\n" + 
			"[o->o Bob\r\n" + 
			"[x-> Bob\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 15 of 120\r\n" + 
			"1.24 Stereotypes and Spots 1 SEQUENCE DIAGRAM\r\n" + 
			"[<- Bob\r\n" + 
			"[x<- Bob\r\n" + 
			"Bob ->]\r\n" + 
			"Bob ->o]\r\n" + 
			"Bob o->o]\r\n" + 
			"Bob ->x]\r\n" + 
			"Bob <-]\r\n" + 
			"Bob x<-]\r\n" + 
			"@enduml\r\n" + 
			"1.24 Stereotypes and Spots\r\n" + 
			"It is possible to add stereotypes to participants using << and >>.\r\n" + 
			"In the stereotype, you can add a spotted character in a colored circle using the syntax (X,color).\r\n" + 
			"@startuml\r\n" + 
			"participant \"Famous Bob\" as Bob << Generated >>\r\n" + 
			"participant Alice << (C,#ADD1B2) Testable >>\r\n" + 
			"Bob->Alice: First message\r\n" + 
			"@enduml\r\n" + 
			"By default, the guillemet character is used to display the stereotype. You can change this behavious\r\n" + 
			"using the skinparam guillemet:\r\n" + 
			"@startuml\r\n" + 
			"skinparam guillemet false\r\n" + 
			"participant \"Famous Bob\" as Bob << Generated >>\r\n" + 
			"participant Alice << (C,#ADD1B2) Testable >>\r\n" + 
			"Bob->Alice: First message\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 16 of 120\r\n" + 
			"1.25 More information on titles 1 SEQUENCE DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"participant Bob << (C,#ADD1B2) >>\r\n" + 
			"participant Alice << (C,#ADD1B2) >>\r\n" + 
			"Bob->Alice: First message\r\n" + 
			"@enduml\r\n" + 
			"1.25 More information on titles\r\n" + 
			"You can use creole formatting in the title.\r\n" + 
			"@startuml\r\n" + 
			"title __Simple__ **communication** example\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob -> Alice: Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"You can add newline using \\n in the title description.\r\n" + 
			"@startuml\r\n" + 
			"title __Simple__ communication example\\non several lines\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob -> Alice: Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 17 of 120\r\n" + 
			"1.26 Participants encompass 1 SEQUENCE DIAGRAM\r\n" + 
			"You can also define title on several lines using title and end title keywords.\r\n" + 
			"@startuml\r\n" + 
			"title\r\n" + 
			"<u>Simple </u> communication example\r\n" + 
			"on <i>several </i> lines and using <font color=red>html</font>\r\n" + 
			"This is hosted by <img:sourceforge.jpg>\r\n" + 
			"end title\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob -> Alice: Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"1.26 Participants encompass\r\n" + 
			"It is possible to draw a box around some participants, using box and end box commands.\r\n" + 
			"You can add an optional title or a optional background color, after the box keyword.\r\n" + 
			"@startuml\r\n" + 
			"box \"Internal Service\" #LightBlue\r\n" + 
			"participant Bob\r\n" + 
			"participant Alice\r\n" + 
			"end box\r\n" + 
			"participant Other\r\n" + 
			"Bob -> Alice : hello\r\n" + 
			"Alice -> Other : hello\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 18 of 120\r\n" + 
			"1.27 Removing Footer 1 SEQUENCE DIAGRAM\r\n" + 
			"1.27 Removing Footer\r\n" + 
			"You can use the hide footbox keywords to remove the footer of the diagram.\r\n" + 
			"@startuml\r\n" + 
			"hide footbox\r\n" + 
			"title Footer removed\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"Bob --> Alice: Authentication Response\r\n" + 
			"@enduml\r\n" + 
			"1.28 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command:\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"@startuml\r\n" + 
			"skinparam backgroundColor #EEEBDC\r\n" + 
			"skinparam sequence {\r\n" + 
			"ArrowColor DeepSkyBlue\r\n" + 
			"ActorBorderColor DeepSkyBlue\r\n" + 
			"LifeLineBorderColor blue\r\n" + 
			"LifeLineBackgroundColor #A9DCDF\r\n" + 
			"ParticipantBorderColor DeepSkyBlue\r\n" + 
			"ParticipantBackgroundColor DodgerBlue\r\n" + 
			"ParticipantFontName Impact\r\n" + 
			"ParticipantFontSize 17\r\n" + 
			"ParticipantFontColor #A9DCDF\r\n" + 
			"ActorBackgroundColor aqua\r\n" + 
			"ActorFontColor DeepSkyBlue\r\n" + 
			"ActorFontSize 17\r\n" + 
			"ActorFontName Aapex\r\n" + 
			"}\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 19 of 120\r\n" + 
			"1.28 Skinparam 1 SEQUENCE DIAGRAM\r\n" + 
			"actor User\r\n" + 
			"participant \"First Class\" as A\r\n" + 
			"participant \"Second Class\" as B\r\n" + 
			"participant \"Last Class\" as C\r\n" + 
			"User -> A: DoWork\r\n" + 
			"activate A\r\n" + 
			"A -> B: Create Request\r\n" + 
			"activate B\r\n" + 
			"B -> C: DoWork\r\n" + 
			"activate C\r\n" + 
			"C --> B: WorkDone\r\n" + 
			"destroy C\r\n" + 
			"B --> A: Request Created\r\n" + 
			"deactivate B\r\n" + 
			"A --> User: Done\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 20 of 120\r\n" + 
			"2 USE CASE DIAGRAM\r\n" + 
			"2 Use Case Diagram\r\n" + 
			"2.1 Usecases\r\n" + 
			"Use cases are enclosed using between parentheses (because two parentheses looks like an oval).\r\n" + 
			"You can also use the usecase keyword to define a usecase. And you can define an alias, using the as\r\n" + 
			"keyword. This alias will be used latter, when defining relations.\r\n" + 
			"@startuml\r\n" + 
			"(First usecase)\r\n" + 
			"(Another usecase) as (UC2)\r\n" + 
			"usecase UC3\r\n" + 
			"usecase (Last\\nusecase) as UC4\r\n" + 
			"@enduml\r\n" + 
			"2.2 Actors\r\n" + 
			"Actor are enclosed using between two points.\r\n" + 
			"You can also use the actor keyword to define an actor. And you can define an alias, using the as\r\n" + 
			"keyword. This alias will be used latter, when defining relations.\r\n" + 
			"We will see later that the actor definitions are optional.\r\n" + 
			"@startuml\r\n" + 
			":First Actor:\r\n" + 
			":Another\\nactor: as Men2\r\n" + 
			"actor Men3\r\n" + 
			"actor :Last actor: as Men4\r\n" + 
			"@enduml\r\n" + 
			"2.3 Usecases description\r\n" + 
			"If you want to have description on several lines, you can use quotes.\r\n" + 
			"You can also use the following separators: -- .. == __. And you can put titles within the separators.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 21 of 120\r\n" + 
			"2.4 Basic example 2 USE CASE DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"usecase UC1 as \"You can use\r\n" + 
			"several lines to define your usecase.\r\n" + 
			"You can also use separators.\r\n" + 
			"--\r\n" + 
			"Several separators are possible.\r\n" + 
			"==\r\n" + 
			"And you can add titles:\r\n" + 
			"..Conclusion..\r\n" + 
			"This allows large description.\"\r\n" + 
			"@enduml\r\n" + 
			"2.4 Basic example\r\n" + 
			"To link actors and use cases, the arrow --> is used.\r\n" + 
			"The more dashes \"-\" in the arrow, the longer the arrow. You can add a label on the arrow, by adding\r\n" + 
			"a ”:” character in the arrow definition.\r\n" + 
			"In this example, you see that User has not been defined before, and is used as an actor.\r\n" + 
			"@startuml\r\n" + 
			"User -> (Start)\r\n" + 
			"User --> (Use the application) : A small label\r\n" + 
			":Main Admin: ---> (Use the application) : This is\\nyet another\\nlabel\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 22 of 120\r\n" + 
			"2.5 Extension 2 USE CASE DIAGRAM\r\n" + 
			"2.5 Extension\r\n" + 
			"If one actor/use case extends another one, you can use the symbol <|-- (which stands for ).\r\n" + 
			"@startuml\r\n" + 
			":Main Admin: as Admin\r\n" + 
			"(Use the application) as (Use)\r\n" + 
			"User <|-- Admin\r\n" + 
			"(Start) <|-- (Use)\r\n" + 
			"@enduml\r\n" + 
			"2.6 Using notes\r\n" + 
			"You can use the note left of , note right of , note top of , note bottom of keywords to define\r\n" + 
			"notes related to a single object.\r\n" + 
			"A note can be also define alone with the note keywords, then linked to other objects using the ..\r\n" + 
			"symbol.\r\n" + 
			"@startuml\r\n" + 
			":Main Admin: as Admin\r\n" + 
			"(Use the application) as (Use)\r\n" + 
			"User -> (Start)\r\n" + 
			"User --> (Use)\r\n" + 
			"Admin ---> (Use)\r\n" + 
			"note right of Admin : This is an example.\r\n" + 
			"note right of (Use)\r\n" + 
			"A note can also\r\n" + 
			"be on several lines\r\n" + 
			"end note\r\n" + 
			"note \"This note is connected\\nto several objects.\" as N2\r\n" + 
			"(Start) .. N2\r\n" + 
			"N2 .. (Use)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 23 of 120\r\n" + 
			"2.7 Stereotypes 2 USE CASE DIAGRAM\r\n" + 
			"2.7 Stereotypes\r\n" + 
			"You can add stereotypes while defining actors and use cases using ” << ” and ” >> ”.\r\n" + 
			"@startuml\r\n" + 
			"User << Human >>\r\n" + 
			":Main Database: as MySql << Application >>\r\n" + 
			"(Start) << One Shot >>\r\n" + 
			"(Use the application) as (Use) << Main >>\r\n" + 
			"User -> (Start)\r\n" + 
			"User --> (Use)\r\n" + 
			"MySql --> (Use)\r\n" + 
			"@enduml\r\n" + 
			"2.8 Changing arrows direction\r\n" + 
			"By default, links between classes have two dashes -- and are vertically oriented. It is possible to use\r\n" + 
			"horizontal link by putting a single dash (or dot) like this:\r\n" + 
			"@startuml\r\n" + 
			":user: --> (Use case 1)\r\n" + 
			":user: -> (Use case 2)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 24 of 120\r\n" + 
			"2.8 Changing arrows direction 2 USE CASE DIAGRAM\r\n" + 
			"You can also change directions by reversing the link:\r\n" + 
			"@startuml\r\n" + 
			"(Use case 1) <.. :user:\r\n" + 
			"(Use case 2) <- :user:\r\n" + 
			"@enduml\r\n" + 
			"It is also possible to change arrow direction by adding left, right, up or down keywords inside the\r\n" + 
			"arrow:\r\n" + 
			"@startuml\r\n" + 
			":user: -left-> (dummyLeft)\r\n" + 
			":user: -right-> (dummyRight)\r\n" + 
			":user: -up-> (dummyUp)\r\n" + 
			":user: -down-> (dummyDown)\r\n" + 
			"@enduml\r\n" + 
			"You can shorten the arrow by using only the first character of the direction (for example, -d- instead\r\n" + 
			"of -down-) or the two first characters (-do-).\r\n" + 
			"Please note that you should not abuse this functionality : Graphviz gives usually good results without\r\n" + 
			"tweaking.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 25 of 120\r\n" + 
			"2.9 Title the diagram 2 USE CASE DIAGRAM\r\n" + 
			"2.9 Title the diagram\r\n" + 
			"The title keywords is used to put a title.\r\n" + 
			"You can use title and end title keywords for a longer title, as in sequence diagrams.\r\n" + 
			"@startuml\r\n" + 
			"title Simple <b>Usecase </b>\\nwith one actor\r\n" + 
			"\"Use the application\" as (Use)\r\n" + 
			"User -> (Use)\r\n" + 
			"@enduml\r\n" + 
			"2.10 Splitting diagrams\r\n" + 
			"The newpage keywords to split your diagram into several pages or images.\r\n" + 
			"@startuml\r\n" + 
			":actor1: --> (Usecase1)\r\n" + 
			"newpage\r\n" + 
			":actor2: --> (Usecase2)\r\n" + 
			"@enduml\r\n" + 
			"2.11 Left to right direction\r\n" + 
			"The general default behavior when building diagram is top to bottom.\r\n" + 
			"@startuml\r\n" + 
			"'default\r\n" + 
			"top to bottom direction\r\n" + 
			"user1 --> (Usecase 1)\r\n" + 
			"user2 --> (Usecase 2)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 26 of 120\r\n" + 
			"2.12 Skinparam 2 USE CASE DIAGRAM\r\n" + 
			"You may change to left to right using the left to right direction command. The result is often\r\n" + 
			"better with this direction.\r\n" + 
			"@startuml\r\n" + 
			"left to right direction\r\n" + 
			"user1 --> (Usecase 1)\r\n" + 
			"user2 --> (Usecase 2)\r\n" + 
			"@enduml\r\n" + 
			"2.12 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"You can define specific color and fonts for stereotyped actors and usecases.\r\n" + 
			"@startuml\r\n" + 
			"skinparam handwritten true\r\n" + 
			"skinparam usecase {\r\n" + 
			"BackgroundColor DarkSeaGreen\r\n" + 
			"BorderColor DarkSlateGray\r\n" + 
			"BackgroundColor << Main >> YellowGreen\r\n" + 
			"BorderColor << Main >> YellowGreen\r\n" + 
			"ArrowColor Olive\r\n" + 
			"ActorBorderColor black\r\n" + 
			"ActorFontName Courier\r\n" + 
			"ActorBackgroundColor << Human >> Gold\r\n" + 
			"}\r\n" + 
			"User << Human >>\r\n" + 
			":Main Database: as MySql << Application >>\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 27 of 120\r\n" + 
			"2.13 Complete example 2 USE CASE DIAGRAM\r\n" + 
			"(Start) << One Shot >>\r\n" + 
			"(Use the application) as (Use) << Main >>\r\n" + 
			"User -> (Start)\r\n" + 
			"User --> (Use)\r\n" + 
			"MySql --> (Use)\r\n" + 
			"@enduml\r\n" + 
			"2.13 Complete example\r\n" + 
			"@startuml\r\n" + 
			"left to right direction\r\n" + 
			"skinparam packageStyle rect\r\n" + 
			"actor customer\r\n" + 
			"actor clerk\r\n" + 
			"rectangle checkout {\r\n" + 
			"customer -- (checkout)\r\n" + 
			"(checkout) .> (payment) : include\r\n" + 
			"(help) .> (checkout) : extends\r\n" + 
			"(checkout) -- clerk\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 28 of 120\r\n" + 
			"3 CLASS DIAGRAM\r\n" + 
			"3 Class Diagram\r\n" + 
			"3.1 Relations between classes\r\n" + 
			"Relations between classes are defined using the following symbols :\r\n" + 
			"Extension <|--\r\n" + 
			"Composition *--\r\n" + 
			"Aggregation o--\r\n" + 
			"It is possible to replace -- by .. to have a dotted line.\r\n" + 
			"Knowing those rules, it is possible to draw the following drawings:\r\n" + 
			"@startuml\r\n" + 
			"scale 800 width\r\n" + 
			"Class01 <|-- Class02\r\n" + 
			"Class03 *-- Class04\r\n" + 
			"Class05 o-- Class06\r\n" + 
			"Class07 .. Class08\r\n" + 
			"Class09 -- Class10\r\n" + 
			"Class11 <|.. Class12\r\n" + 
			"Class13 --> Class14\r\n" + 
			"Class15 ..> Class16\r\n" + 
			"Class17 ..|> Class18\r\n" + 
			"Class19 <--* Class20\r\n" + 
			"@enduml\r\n" + 
			"3.2 Label on relations\r\n" + 
			"It is possible a add a label on the relation, using ”:”, followed by the text of the label.\r\n" + 
			"For cardinality, you can use double-quotes \"\" on each side of the relation.\r\n" + 
			"@startuml\r\n" + 
			"Class01 \"1\" *-- \"many\" Class02 : contains\r\n" + 
			"Class03 o-- Class04 : aggregation\r\n" + 
			"Class05 --> \"1\" Class06\r\n" + 
			"@enduml\r\n" + 
			"You can add an extra arrow pointing at one object showing which object acts on the other object,\r\n" + 
			"using < or > at the begin or at the end of the label.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 29 of 120\r\n" + 
			"3.2 Label on relations 3 CLASS DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"class Car\r\n" + 
			"Driver - Car : drives >\r\n" + 
			"Car *- Wheel : have 4 >\r\n" + 
			"Car -- Person : < owns\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 30 of 120\r\n" + 
			"3.3 Adding methods 3 CLASS DIAGRAM\r\n" + 
			"3.3 Adding methods\r\n" + 
			"To declare fields and methods, you can use the symbol \":\" followed by the field’s or method’s name.\r\n" + 
			"The system checks for parenthesis to choose between methods and fields.\r\n" + 
			"@startuml\r\n" + 
			"Object <|-- ArrayList\r\n" + 
			"Object : equals()\r\n" + 
			"ArrayList : Object[] elementData\r\n" + 
			"ArrayList : size()\r\n" + 
			"@enduml\r\n" + 
			"It is also possible to group between brackets { all fields and methods.\r\n" + 
			"Note that the syntax is highly flexible about type/name order.\r\n" + 
			"@startuml\r\n" + 
			"class Dummy {\r\n" + 
			"String data\r\n" + 
			"void methods()\r\n" + 
			"}\r\n" + 
			"class Flight {\r\n" + 
			"flightNumber : Integer\r\n" + 
			"departureTime : Date\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 31 of 120\r\n" + 
			"3.4 Defining visibility 3 CLASS DIAGRAM\r\n" + 
			"3.4 Defining visibility\r\n" + 
			"When you define methods or fields, you can use characters to define the visibility of the corresponding\r\n" + 
			"item:\r\n" + 
			"- private\r\n" + 
			"# protected\r\n" + 
			"? package private\r\n" + 
			"+ public\r\n" + 
			"@startuml\r\n" + 
			"class Dummy {\r\n" + 
			"-field1\r\n" + 
			"#field2\r\n" + 
			"~method1()\r\n" + 
			"+method2()\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"You can turn off this feature using the skinparam classAttributeIconSize 0 command :\r\n" + 
			"@startuml\r\n" + 
			"skinparam classAttributeIconSize 0\r\n" + 
			"class Dummy {\r\n" + 
			"-field1\r\n" + 
			"#field2\r\n" + 
			"~method1()\r\n" + 
			"+method2()\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 32 of 120\r\n" + 
			"3.5 Abstract and Static 3 CLASS DIAGRAM\r\n" + 
			"3.5 Abstract and Static\r\n" + 
			"You can define static or abstract methods or fields using the static or abstract modifier.\r\n" + 
			"These modifiers can be used at the start or at the end of the line. You can also use classifier instead\r\n" + 
			"of static.\r\n" + 
			"@startuml\r\n" + 
			"class Dummy {\r\n" + 
			"{static} String id\r\n" + 
			"{abstract} void methods()\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 33 of 120\r\n" + 
			"3.6 Advanced class body 3 CLASS DIAGRAM\r\n" + 
			"3.6 Advanced class body\r\n" + 
			"By default, methods and fields are automatically regrouped by PlantUML. You can use separators to\r\n" + 
			"define your own way of ordering fields and methods. The following separators are possible : -- ..\r\n" + 
			"== __.\r\n" + 
			"You can also use titles within the separators:\r\n" + 
			"@startuml\r\n" + 
			"class Foo1 {\r\n" + 
			"You can use\r\n" + 
			"several lines\r\n" + 
			"..\r\n" + 
			"as you want\r\n" + 
			"and group\r\n" + 
			"==\r\n" + 
			"things together.\r\n" + 
			"__\r\n" + 
			"You can have as many groups\r\n" + 
			"as you want\r\n" + 
			"--\r\n" + 
			"End of class\r\n" + 
			"}\r\n" + 
			"class User {\r\n" + 
			".. Simple Getter ..\r\n" + 
			"+ getName()\r\n" + 
			"+ getAddress()\r\n" + 
			".. Some setter ..\r\n" + 
			"+ setName()\r\n" + 
			"__ private data __\r\n" + 
			"int age\r\n" + 
			"-- encrypted --\r\n" + 
			"String password\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 34 of 120\r\n" + 
			"3.7 Notes and stereotypes 3 CLASS DIAGRAM\r\n" + 
			"3.7 Notes and stereotypes\r\n" + 
			"Stereotypes are defined with the class keyword, ” << ” and ” >> ”.\r\n" + 
			"You can also define notes using note left of , note right of , note top of , note bottom of\r\n" + 
			"keywords.\r\n" + 
			"You can also define a note on the last defined class using note left, note right, note top, note\r\n" + 
			"bottom.\r\n" + 
			"A note can be also define alone with the note keywords, then linked to other objects using the ..\r\n" + 
			"symbol.\r\n" + 
			"@startuml\r\n" + 
			"class Object << general >>\r\n" + 
			"Object <|--- ArrayList\r\n" + 
			"note top of Object : In java, every class\\nextends this one.\r\n" + 
			"note \"This is a floating note\" as N1\r\n" + 
			"note \"This note is connected\\nto several objects.\" as N2\r\n" + 
			"Object .. N2\r\n" + 
			"N2 .. ArrayList\r\n" + 
			"class Foo\r\n" + 
			"note left: On last defined class\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 35 of 120\r\n" + 
			"3.8 More on notes 3 CLASS DIAGRAM\r\n" + 
			"3.8 More on notes\r\n" + 
			"It is also possible to use few html tags like :\r\n" + 
			"• <b>\r\n" + 
			"• <u>\r\n" + 
			"• <i>\r\n" + 
			"• <s>, <del>, <strike>\r\n" + 
			"• <font color=\"AAAAAA\"> or <font color=\"colorName\">\r\n" + 
			"• <color:AAAAAA> or <color:colorName>\r\n" + 
			"• <size:nn> to change font size\r\n" + 
			"• <img src=\"file\"> or <img:file> : the file must be accessible by the filesystem\r\n" + 
			"You can also have a note on several lines You can also define a note on the last defined class using\r\n" + 
			"note left, note right, note top, note bottom.\r\n" + 
			"@startuml\r\n" + 
			"class Foo\r\n" + 
			"note left: On last defined class\r\n" + 
			"note top of Object\r\n" + 
			"In java, <size:18>every </size> <u>class </u>\r\n" + 
			"<b>extends </b>\r\n" + 
			"<i>this</i> one.\r\n" + 
			"end note\r\n" + 
			"note as N1\r\n" + 
			"This note is <u>also</u>\r\n" + 
			"<b><color:royalBlue >on several </color>\r\n" + 
			"<s>words </s> lines\r\n" + 
			"And this is hosted by <img:sourceforge.jpg>\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 36 of 120\r\n" + 
			"3.9 Note on links 3 CLASS DIAGRAM\r\n" + 
			"3.9 Note on links\r\n" + 
			"It is possible to add a note on a link, just after the link definition, using note on link.\r\n" + 
			"You can also use note left on link, note right on link, note top on link, note bottom on\r\n" + 
			"link if you want to change the relative position of the note with the label.\r\n" + 
			"@startuml\r\n" + 
			"class Dummy\r\n" + 
			"Dummy --> Foo : A link\r\n" + 
			"note on link #red: note that is red\r\n" + 
			"Dummy --> Foo2 : Another link\r\n" + 
			"note right on link #blue\r\n" + 
			"this is my note on right link\r\n" + 
			"and in blue\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 37 of 120\r\n" + 
			"3.10 Abstract class and interface 3 CLASS DIAGRAM\r\n" + 
			"3.10 Abstract class and interface\r\n" + 
			"You can declare a class as abstract using \"abstract\" or \"abstract class\" keywords.\r\n" + 
			"The class will be printed in italic.\r\n" + 
			"You can use the interface, annotation and enum keywords too.\r\n" + 
			"@startuml\r\n" + 
			"abstract class AbstractList\r\n" + 
			"abstract AbstractCollection\r\n" + 
			"interface List\r\n" + 
			"interface Collection\r\n" + 
			"List <|-- AbstractList\r\n" + 
			"Collection <|-- AbstractCollection\r\n" + 
			"Collection <|- List\r\n" + 
			"AbstractCollection <|- AbstractList\r\n" + 
			"AbstractList <|-- ArrayList\r\n" + 
			"class ArrayList {\r\n" + 
			"Object[] elementData\r\n" + 
			"size()\r\n" + 
			"}\r\n" + 
			"enum TimeUnit {\r\n" + 
			"DAYS\r\n" + 
			"HOURS\r\n" + 
			"MINUTES\r\n" + 
			"}\r\n" + 
			"annotation SuppressWarnings\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 38 of 120\r\n" + 
			"3.11 Using non-letters 3 CLASS DIAGRAM\r\n" + 
			"3.11 Using non-letters\r\n" + 
			"If you want to use non-letters in the class (or enum...) display, you can either :\r\n" + 
			"• Use the as keyword in the class definition\r\n" + 
			"• Put quotes \"\" around the class name\r\n" + 
			"@startuml\r\n" + 
			"class \"This is my class\" as class1\r\n" + 
			"class class2 as \"It works this way too\"\r\n" + 
			"class2 *-- \"foo/dummy\" : use\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 39 of 120\r\n" + 
			"3.12 Hide attributes, methods... 3 CLASS DIAGRAM\r\n" + 
			"3.12 Hide attributes, methods...\r\n" + 
			"You can parameterize the display of classes using the hide/show command.\r\n" + 
			"The basic command is: hide empty members. This command will hide attributes or methods if\r\n" + 
			"they are empty.\r\n" + 
			"Instead of empty members, you can use:\r\n" + 
			"• empty fields or empty attributes for empty fields,\r\n" + 
			"• empty methods for empty methods,\r\n" + 
			"• fields or attributes which will hide fields, even if they are described,\r\n" + 
			"• methods which will hide methods, even if they are described,\r\n" + 
			"• members which will hide fields and methods, even if they are described,\r\n" + 
			"• circle for the circled character in front of class name,\r\n" + 
			"• stereotype for the stereotype.\r\n" + 
			"You can also provide, just after the hide or show keyword:\r\n" + 
			"• class for all classes,\r\n" + 
			"• interface for all interfaces,\r\n" + 
			"• enum for all enums,\r\n" + 
			"• <<foo1>> for classes which are stereotyped with foo1,\r\n" + 
			"• an existing class name.\r\n" + 
			"You can use several show/hide commands to define rules and exceptions.\r\n" + 
			"@startuml\r\n" + 
			"class Dummy1 {\r\n" + 
			"+myMethods()\r\n" + 
			"}\r\n" + 
			"class Dummy2 {\r\n" + 
			"+hiddenMethod()\r\n" + 
			"}\r\n" + 
			"class Dummy3 <<Serializable >> {\r\n" + 
			"String name\r\n" + 
			"}\r\n" + 
			"hide members\r\n" + 
			"hide <<Serializable >> circle\r\n" + 
			"show Dummy1 methods\r\n" + 
			"show <<Serializable >> fields\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 40 of 120\r\n" + 
			"3.13 Hide classes 3 CLASS DIAGRAM\r\n" + 
			"3.13 Hide classes\r\n" + 
			"You can also use the show/hide commands to hide classes.\r\n" + 
			"This may be useful if you define a large !included file, and if you want to hide come classes after\r\n" + 
			"file inclusion.\r\n" + 
			"@startuml\r\n" + 
			"class Foo1\r\n" + 
			"class Foo2\r\n" + 
			"Foo2 *-- Foo1\r\n" + 
			"hide Foo2\r\n" + 
			"@enduml\r\n" + 
			"3.14 Use generics\r\n" + 
			"You can also use bracket < and > to define generics usage in a class.\r\n" + 
			"@startuml\r\n" + 
			"class Foo<? extends Element > {\r\n" + 
			"int size()\r\n" + 
			"}\r\n" + 
			"Foo *- Element\r\n" + 
			"@enduml\r\n" + 
			"3.15 Specific Spot\r\n" + 
			"Usually, a spotted character (C, I, E or A) is used for classes, interface, enum and abstract classes.\r\n" + 
			"But you can define your own spot for a class when you define the stereotype, adding a single\r\n" + 
			"character and a color, like in this example:\r\n" + 
			"@startuml\r\n" + 
			"class System << (S,#FF7700) Singleton >>\r\n" + 
			"class Date << (D,orchid) >>\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 41 of 120\r\n" + 
			"3.16 Packages 3 CLASS DIAGRAM\r\n" + 
			"3.16 Packages\r\n" + 
			"You can define a package using the package keyword, and optionally declare a background color\r\n" + 
			"for your package (Using a html color code or name).\r\n" + 
			"Note that package definitions can be nested.\r\n" + 
			"@startuml\r\n" + 
			"package \"Classic Collections\" #DDDDDD {\r\n" + 
			"Object <|-- ArrayList\r\n" + 
			"}\r\n" + 
			"package net.sourceforge.plantuml {\r\n" + 
			"Object <|-- Demo1\r\n" + 
			"Demo1 *- Demo2\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"3.17 Packages style\r\n" + 
			"There are different styles available for packages.\r\n" + 
			"You can specify them either by setting a default style with the command : skinparam packageStyle,\r\n" + 
			"or by using a stereotype on the package:\r\n" + 
			"@startuml\r\n" + 
			"package foo1 <<Node>> {\r\n" + 
			"class Class1\r\n" + 
			"}\r\n" + 
			"package foo2 <<Rect>> {\r\n" + 
			"class Class2\r\n" + 
			"}\r\n" + 
			"package foo3 <<Folder>> {\r\n" + 
			"class Class3\r\n" + 
			"}\r\n" + 
			"package foo4 <<Frame>> {\r\n" + 
			"class Class4\r\n" + 
			"}\r\n" + 
			"package foo5 <<Cloud>> {\r\n" + 
			"class Class5\r\n" + 
			"}\r\n" + 
			"package foo6 <<Database >> {\r\n" + 
			"class Class6\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 42 of 120\r\n" + 
			"3.18 Namespaces 3 CLASS DIAGRAM\r\n" + 
			"You can also define links between packages, like in the following example:\r\n" + 
			"@startuml\r\n" + 
			"skinparam packageStyle rect\r\n" + 
			"package foo1.foo2 {\r\n" + 
			"}\r\n" + 
			"package foo1.foo2.foo3 {\r\n" + 
			"class Object\r\n" + 
			"}\r\n" + 
			"foo1.foo2 +-- foo1.foo2.foo3\r\n" + 
			"@enduml\r\n" + 
			"3.18 Namespaces\r\n" + 
			"In packages, the name of a class is the unique identifier of this class. It means that you cannot have\r\n" + 
			"two classes with the very same name in different packages.\r\n" + 
			"In that case, you should use namespaces instead of packages.\r\n" + 
			"You can refer to classes from other namespaces by fully qualify them. Classes from the default\r\n" + 
			"namespace are qualified with a starting dot.\r\n" + 
			"Note that you don’t have to explicitly create namespace : a fully qualified class is automatically\r\n" + 
			"put in the right namespace.\r\n" + 
			"@startuml\r\n" + 
			"class BaseClass\r\n" + 
			"namespace net.dummy #DDDDDD {\r\n" + 
			".BaseClass <|-- Person\r\n" + 
			"Meeting o-- Person\r\n" + 
			".BaseClass <|- Meeting\r\n" + 
			"}\r\n" + 
			"namespace net.foo {\r\n" + 
			"net.dummy.Person <|- Person\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 43 of 120\r\n" + 
			"3.19 Automatic namespace creation 3 CLASS DIAGRAM\r\n" + 
			".BaseClass <|-- Person\r\n" + 
			"net.dummy.Meeting o-- Person\r\n" + 
			"}\r\n" + 
			"BaseClass <|-- net.unused.Person\r\n" + 
			"@enduml\r\n" + 
			"3.19 Automatic namespace creation\r\n" + 
			"You can define another separator (other than the dot) using the command : set namespaceSeparator\r\n" + 
			"???.\r\n" + 
			"@startuml\r\n" + 
			"set namespaceSeparator ::\r\n" + 
			"class X1::X2::foo {\r\n" + 
			"some info\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"You can disable automatic package creation using the command set namespaceSeparator none.\r\n" + 
			"@startuml\r\n" + 
			"set namespaceSeparator none\r\n" + 
			"class X1.X2.foo {\r\n" + 
			"some info\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 44 of 120\r\n" + 
			"3.20 Lollipop interface 3 CLASS DIAGRAM\r\n" + 
			"3.20 Lollipop interface\r\n" + 
			"You can also define lollipops interface on classes, using the following syntax:\r\n" + 
			"• bar ()- foo\r\n" + 
			"• bar ()-- foo\r\n" + 
			"• foo -() bar\r\n" + 
			"@startuml\r\n" + 
			"class foo\r\n" + 
			"bar ()- foo\r\n" + 
			"@enduml\r\n" + 
			"3.21 Changing arrows direction\r\n" + 
			"By default, links between classes have two dashes -- and are vertically oriented. It is possible to\r\n" + 
			"use horizontal link by putting a single dash (or dot) like this:\r\n" + 
			"@startuml\r\n" + 
			"Room o- Student\r\n" + 
			"Room *-- Chair\r\n" + 
			"@enduml\r\n" + 
			"You can also change directions by reversing the link:\r\n" + 
			"@startuml\r\n" + 
			"Student -o Room\r\n" + 
			"Chair --* Room\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 45 of 120\r\n" + 
			"3.22 Title the diagram 3 CLASS DIAGRAM\r\n" + 
			"It is also possible to change arrow direction by adding left, right, up or down keywords inside the\r\n" + 
			"arrow:\r\n" + 
			"@startuml\r\n" + 
			"foo -left-> dummyLeft\r\n" + 
			"foo -right-> dummyRight\r\n" + 
			"foo -up-> dummyUp\r\n" + 
			"foo -down-> dummyDown\r\n" + 
			"@enduml\r\n" + 
			"You can shorten the arrow by using only the first character of the direction (for example, -dinstead of -down-) or the two first characters (-do-).\r\n" + 
			"Please note that you should not abuse this functionality : Graphviz gives usually good results\r\n" + 
			"without tweaking.\r\n" + 
			"3.22 Title the diagram\r\n" + 
			"The title keyword is used to put a title.\r\n" + 
			"You can use title and end title keywords for a longer title, as in sequence diagrams.\r\n" + 
			"@startuml\r\n" + 
			"title Simple <b>example </b>\\nof title\r\n" + 
			"Object <|-- ArrayList\r\n" + 
			"@enduml\r\n" + 
			"3.23 Legend the diagram\r\n" + 
			"The legend and end legend are keywords is used to put a legend.\r\n" + 
			"You can optionally specify to have left, right or center alignment for the legend.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 46 of 120\r\n" + 
			"3.24 Association classes 3 CLASS DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"Object <|- ArrayList\r\n" + 
			"legend right\r\n" + 
			"<b>Object </b> and <b>ArrayList </b>\r\n" + 
			"are simple class\r\n" + 
			"endlegend\r\n" + 
			"@enduml\r\n" + 
			"3.24 Association classes\r\n" + 
			"You can define association class after that a relation has been defined between two classes, like in\r\n" + 
			"this example:\r\n" + 
			"@startuml\r\n" + 
			"class Student {\r\n" + 
			"Name\r\n" + 
			"}\r\n" + 
			"Student \"0..*\" - \"1..*\" Course\r\n" + 
			"(Student , Course) .. Enrollment\r\n" + 
			"class Enrollment {\r\n" + 
			"drop()\r\n" + 
			"cancel()\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"You can define it in another direction:\r\n" + 
			"@startuml\r\n" + 
			"class Student {\r\n" + 
			"Name\r\n" + 
			"}\r\n" + 
			"Student \"0..*\" -- \"1..*\" Course\r\n" + 
			"(Student , Course) . Enrollment\r\n" + 
			"class Enrollment {\r\n" + 
			"drop()\r\n" + 
			"cancel()\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 47 of 120\r\n" + 
			"3.25 Skinparam 3 CLASS DIAGRAM\r\n" + 
			"3.25 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"@startuml\r\n" + 
			"skinparam class {\r\n" + 
			"BackgroundColor PaleGreen\r\n" + 
			"ArrowColor SeaGreen\r\n" + 
			"BorderColor SpringGreen\r\n" + 
			"}\r\n" + 
			"skinparam stereotypeCBackgroundColor YellowGreen\r\n" + 
			"Class01 \"1\" *-- \"many\" Class02 : contains\r\n" + 
			"Class03 o-- Class04 : aggregation\r\n" + 
			"@enduml\r\n" + 
			"3.26 Skinned Stereotypes\r\n" + 
			"You can define specific color and fonts for stereotyped classes.\r\n" + 
			"@startuml\r\n" + 
			"skinparam class {\r\n" + 
			"BackgroundColor PaleGreen\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 48 of 120\r\n" + 
			"3.27 Color gradient 3 CLASS DIAGRAM\r\n" + 
			"ArrowColor SeaGreen\r\n" + 
			"BorderColor SpringGreen\r\n" + 
			"BackgroundColor <<Foo>> Wheat\r\n" + 
			"BorderColor <<Foo>> Tomato\r\n" + 
			"}\r\n" + 
			"skinparam stereotypeCBackgroundColor YellowGreen\r\n" + 
			"skinparam stereotypeCBackgroundColor << Foo >> DimGray\r\n" + 
			"Class01 << Foo >>\r\n" + 
			"Class01 \"1\" *-- \"many\" Class02 : contains\r\n" + 
			"Class03 <<Foo>> o-- Class04 : aggregation\r\n" + 
			"@enduml\r\n" + 
			"3.27 Color gradient\r\n" + 
			"It’s possible to declare individual color for classes or note using the notation.\r\n" + 
			"You can use either standard color name or RGB code.\r\n" + 
			"You can also use color gradient in background, with the following syntax: two colors names separated\r\n" + 
			"either by:\r\n" + 
			"• |,\r\n" + 
			"• /,\r\n" + 
			"• \\,\r\n" + 
			"• or -\r\n" + 
			"depending the direction of the gradient.\r\n" + 
			"For example, you could have:\r\n" + 
			"@startuml\r\n" + 
			"skinparam backgroundcolor AntiqueWhite/Gold\r\n" + 
			"skinparam classBackgroundColor Wheat|CornflowerBlue\r\n" + 
			"class Foo #red-green\r\n" + 
			"note left of Foo #blue\\9932CC {\r\n" + 
			"this is my\r\n" + 
			"note on this class\r\n" + 
			"}\r\n" + 
			"package example #GreenYellow/LightGoldenRodYellow {\r\n" + 
			"class Dummy\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 49 of 120\r\n" + 
			"3.28 Splitting large files 3 CLASS DIAGRAM\r\n" + 
			"3.28 Splitting large files\r\n" + 
			"Sometimes, you will get some very large image files.\r\n" + 
			"You can use the ”page (hpages)x(vpages)” command to split the generated image into several\r\n" + 
			"files :\r\n" + 
			"hpages is a number that indicated the number of horizontal pages, and vpages is a number that\r\n" + 
			"indicated the number of vertical pages.\r\n" + 
			"@startuml\r\n" + 
			"' Split into 4 pages\r\n" + 
			"page 2x2\r\n" + 
			"class BaseClass\r\n" + 
			"namespace net.dummy #DDDDDD {\r\n" + 
			".BaseClass <|-- Person\r\n" + 
			"Meeting o-- Person\r\n" + 
			".BaseClass <|- Meeting\r\n" + 
			"}\r\n" + 
			"namespace net.foo {\r\n" + 
			"net.dummy.Person <|- Person\r\n" + 
			".BaseClass <|-- Person\r\n" + 
			"net.dummy.Meeting o-- Person\r\n" + 
			"}\r\n" + 
			"BaseClass <|-- net.unused.Person\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 50 of 120\r\n" + 
			"3.28 Splitting large files 3 CLASS DIAGRAM\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 51 of 120\r\n" + 
			"4 ACTIVITY DIAGRAM\r\n" + 
			"4 Activity Diagram\r\n" + 
			"4.1 Simple Activity\r\n" + 
			"You can use (*) for the starting point and ending point of the activity diagram.\r\n" + 
			"In some occasion, you may want to use (*top) to force the starting point to be at the top of the\r\n" + 
			"diagram.\r\n" + 
			"Use --> for arrows.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> \"First Activity\"\r\n" + 
			"\"First Activity\" --> (*)\r\n" + 
			"@enduml\r\n" + 
			"4.2 Label on arrows\r\n" + 
			"By default, an arrow starts at the last used activity.\r\n" + 
			"You can put a label on an arrow using brackets [ and ] just after the arrow definition.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> \"First Activity\"\r\n" + 
			"-->[You can put also labels] \"Second Activity\"\r\n" + 
			"--> (*)\r\n" + 
			"@enduml\r\n" + 
			"4.3 Changing arrow direction\r\n" + 
			"You can use -> for horizontal arrows. It is possible to force arrow’s direction using the following\r\n" + 
			"syntax:\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 52 of 120\r\n" + 
			"4.4 Branches 4 ACTIVITY DIAGRAM\r\n" + 
			"• -down-> (default arrow)\r\n" + 
			"• -right-> or ->\r\n" + 
			"• -left->\r\n" + 
			"• -up->\r\n" + 
			"@startuml\r\n" + 
			"(*) -up-> \"First Activity\"\r\n" + 
			"-right-> \"Second Activity\"\r\n" + 
			"--> \"Third Activity\"\r\n" + 
			"-left-> (*)\r\n" + 
			"@enduml\r\n" + 
			"4.4 Branches\r\n" + 
			"You can use if/then/else keywords to define branches.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> \"Initialization\"\r\n" + 
			"if \"Some Test\" then\r\n" + 
			"-->[true] \"Some Activity\"\r\n" + 
			"--> \"Another activity\"\r\n" + 
			"-right-> (*)\r\n" + 
			"else\r\n" + 
			"->[false] \"Something else\"\r\n" + 
			"-->[Ending process] (*)\r\n" + 
			"endif\r\n" + 
			"@enduml\r\n" + 
			"Unfortunately, you will have to sometimes repeat the same activity in the diagram text:\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 53 of 120\r\n" + 
			"4.5 More on Branches 4 ACTIVITY DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"(*) --> \"check input\"\r\n" + 
			"If \"input is verbose\" then\r\n" + 
			"--> [Yes] \"turn on verbosity\"\r\n" + 
			"--> \"run command\"\r\n" + 
			"else\r\n" + 
			"--> \"run command\"\r\n" + 
			"Endif\r\n" + 
			"-->(*)\r\n" + 
			"@enduml\r\n" + 
			"4.5 More on Branches\r\n" + 
			"By default, a branch is connected to the last defined activity, but it is possible to override this and\r\n" + 
			"to define a link with the if keywords.\r\n" + 
			"It is also possible to nest branches.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> if \"Some Test\" then\r\n" + 
			"-->[true] \"activity 1\"\r\n" + 
			"if \"\" then\r\n" + 
			"-> \"activity 3\" as a3\r\n" + 
			"else\r\n" + 
			"if \"Other test\" then\r\n" + 
			"-left-> \"activity 5\"\r\n" + 
			"else\r\n" + 
			"--> \"activity 6\"\r\n" + 
			"endif\r\n" + 
			"endif\r\n" + 
			"else\r\n" + 
			"->[false] \"activity 2\"\r\n" + 
			"endif\r\n" + 
			"a3 --> if \"last test\" then\r\n" + 
			"--> \"activity 7\"\r\n" + 
			"else\r\n" + 
			"-> \"activity 8\"\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 54 of 120\r\n" + 
			"4.6 Synchronization 4 ACTIVITY DIAGRAM\r\n" + 
			"endif\r\n" + 
			"@enduml\r\n" + 
			"4.6 Synchronization\r\n" + 
			"You can use === code === to display synchronization bars.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> ===B1===\r\n" + 
			"--> \"Parallel Activity 1\"\r\n" + 
			"--> ===B2===\r\n" + 
			"===B1=== --> \"Parallel Activity 2\"\r\n" + 
			"--> ===B2===\r\n" + 
			"--> (*)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 55 of 120\r\n" + 
			"4.7 Long activity description 4 ACTIVITY DIAGRAM\r\n" + 
			"4.7 Long activity description\r\n" + 
			"When you declare activities, you can span on several lines the description text. You can also add\r\n" + 
			"\\n in the description.\r\n" + 
			"You can also give a short code to the activity with the as keyword. This code can be used latter\r\n" + 
			"in the diagram description.\r\n" + 
			"@startuml\r\n" + 
			"(*) -left-> \"this <size:20>activity </size>\r\n" + 
			"is <b>very</b> <color:red>long2 </color>\r\n" + 
			"and defined on several lines\r\n" + 
			"that contains many <i>text</i>\" as A1\r\n" + 
			"-up-> \"Another activity\\n on several lines\"\r\n" + 
			"A1 --> \"Short activity <img:sourceforge.jpg>\"\r\n" + 
			"@enduml\r\n" + 
			"4.8 Notes\r\n" + 
			"You can add notes on a activity using the commands note left, note right, note top or note\r\n" + 
			"bottom, just after the description of the activity you want to note.\r\n" + 
			"If you want to put a note on the starting point, define the note at the very beginning of the diagram\r\n" + 
			"description.\r\n" + 
			"You can also have a note on several lines, using the endnote keywords.\r\n" + 
			"@startuml\r\n" + 
			"(*) --> \"Some Activity\"\r\n" + 
			"note right: This activity has to be defined\r\n" + 
			"\"Some Activity\" --> (*)\r\n" + 
			"note left\r\n" + 
			"This note is on\r\n" + 
			"several lines\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 56 of 120\r\n" + 
			"4.9 Partition 4 ACTIVITY DIAGRAM\r\n" + 
			"4.9 Partition\r\n" + 
			"You can define a partition using the partition keyword, and optionally declare a background color\r\n" + 
			"for your partition (Using a html color code or name)\r\n" + 
			"When you declare activities, they are automatically put in the last used partition.\r\n" + 
			"You can close the partition definition using a closing bracket }.\r\n" + 
			"@startuml\r\n" + 
			"partition Conductor {\r\n" + 
			"(*) --> \"Climbs on Platform\"\r\n" + 
			"--> === S1 ===\r\n" + 
			"--> Bows\r\n" + 
			"}\r\n" + 
			"partition Audience LightSkyBlue {\r\n" + 
			"=== S1 === --> Applauds\r\n" + 
			"}\r\n" + 
			"partition Conductor {\r\n" + 
			"Bows --> === S2 ===\r\n" + 
			"--> WavesArmes\r\n" + 
			"Applauds --> === S2 ===\r\n" + 
			"}\r\n" + 
			"partition Orchestra #CCCCEE {\r\n" + 
			"WavesArmes --> Introduction\r\n" + 
			"--> \"Play music\"\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 57 of 120\r\n" + 
			"4.10 Title the diagram 4 ACTIVITY DIAGRAM\r\n" + 
			"4.10 Title the diagram\r\n" + 
			"The title keywords is used to put a title.\r\n" + 
			"You can use title and end title keywords for a longer title, as in sequence diagrams.\r\n" + 
			"@startuml\r\n" + 
			"title Simple example\\nof title\r\n" + 
			"(*) --> \"First activity\"\r\n" + 
			"--> (*)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 58 of 120\r\n" + 
			"4.11 Skinparam 4 ACTIVITY DIAGRAM\r\n" + 
			"4.11 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"You can define specific color and fonts for stereotyped activities.\r\n" + 
			"@startuml\r\n" + 
			"skinparam backgroundColor #AAFFFF\r\n" + 
			"skinparam activity {\r\n" + 
			"StartColor red\r\n" + 
			"BarColor SaddleBrown\r\n" + 
			"EndColor Silver\r\n" + 
			"BackgroundColor Peru\r\n" + 
			"BackgroundColor << Begin >> Olive\r\n" + 
			"BorderColor Peru\r\n" + 
			"FontName Impact\r\n" + 
			"}\r\n" + 
			"(*) --> \"Climbs on Platform\" << Begin >>\r\n" + 
			"--> === S1 ===\r\n" + 
			"--> Bows\r\n" + 
			"--> === S2 ===\r\n" + 
			"--> WavesArmes\r\n" + 
			"--> (*)\r\n" + 
			"@enduml\r\n" + 
			"4.12 Octagon\r\n" + 
			"You can change the shape of activities to octagon using the skinparam activityShape octagon\r\n" + 
			"command.\r\n" + 
			"@startuml\r\n" + 
			"'Default is skinparam activityShape roundBox\r\n" + 
			"skinparam activityShape octagon\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 59 of 120\r\n" + 
			"4.13 Complete example 4 ACTIVITY DIAGRAM\r\n" + 
			"(*) --> \"First Activity\"\r\n" + 
			"\"First Activity\" --> (*)\r\n" + 
			"@enduml\r\n" + 
			"4.13 Complete example\r\n" + 
			"@startuml\r\n" + 
			"title Servlet Container\r\n" + 
			"(*) --> \"ClickServlet.handleRequest()\"\r\n" + 
			"--> \"new Page\"\r\n" + 
			"if \"Page.onSecurityCheck\" then\r\n" + 
			"->[true] \"Page.onInit()\"\r\n" + 
			"if \"isForward?\" then\r\n" + 
			"->[no] \"Process controls\"\r\n" + 
			"if \"continue processing?\" then\r\n" + 
			"-->[yes] ===RENDERING===\r\n" + 
			"else\r\n" + 
			"-->[no] ===REDIRECT_CHECK===\r\n" + 
			"endif\r\n" + 
			"else\r\n" + 
			"-->[yes] ===RENDERING===\r\n" + 
			"endif\r\n" + 
			"if \"is Post?\" then\r\n" + 
			"-->[yes] \"Page.onPost()\"\r\n" + 
			"--> \"Page.onRender()\" as render\r\n" + 
			"--> ===REDIRECT_CHECK===\r\n" + 
			"else\r\n" + 
			"-->[no] \"Page.onGet()\"\r\n" + 
			"--> render\r\n" + 
			"endif\r\n" + 
			"else\r\n" + 
			"-->[false] ===REDIRECT_CHECK===\r\n" + 
			"endif\r\n" + 
			"if \"Do redirect?\" then\r\n" + 
			"->[yes] \"redirect request\"\r\n" + 
			"--> ==BEFORE_DESTROY===\r\n" + 
			"else\r\n" + 
			"if \"Do Forward?\" then\r\n" + 
			"-left->[yes] \"Forward request\"\r\n" + 
			"--> ==BEFORE_DESTROY===\r\n" + 
			"else\r\n" + 
			"-right ->[no] \"Render page template\"\r\n" + 
			"--> ==BEFORE_DESTROY===\r\n" + 
			"endif\r\n" + 
			"endif\r\n" + 
			"--> \"Page.onDestroy()\"\r\n" + 
			"-->(*)\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 60 of 120\r\n" + 
			"4.13 Complete example 4 ACTIVITY DIAGRAM\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 61 of 120\r\n" + 
			"4.13 Complete example 4 ACTIVITY DIAGRAM\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 62 of 120\r\n" + 
			"5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5 Activity Diagram (beta)\r\n" + 
			"Current syntax for activity diagram has several limitations and drawbacks (for example, it’s difficult\r\n" + 
			"to maintain).\r\n" + 
			"So a completely new syntax and implementation is proposed as beta version to users (starting\r\n" + 
			"with V7947), so that we could define a better format and syntax.\r\n" + 
			"Another advantage of this new implementation is that it’s done without the need of having Graphviz\r\n" + 
			"installed (as for sequence diagrams).\r\n" + 
			"The new syntax will replace the old one. However, for compatibility reason, the old syntax will still\r\n" + 
			"be recognized, to ensure ascending compatibility.\r\n" + 
			"Users are simply encouraged to migrate to the new syntax.\r\n" + 
			"5.1 Simple Activity\r\n" + 
			"Activities label starts with : and ends with ;.\r\n" + 
			"Text formatting can be done using creole wiki syntax.\r\n" + 
			"They are implicitly linked in their definition order.\r\n" + 
			"@startuml\r\n" + 
			":Hello world;\r\n" + 
			":This is on defined on\r\n" + 
			"several **lines**;\r\n" + 
			"@enduml\r\n" + 
			"5.2 Start/Stop\r\n" + 
			"You can use start and stop keywords to denote the beginning and the end of a diagram.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			":Hello world;\r\n" + 
			":This is on defined on\r\n" + 
			"several **lines**;\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 63 of 120\r\n" + 
			"5.3 Conditional 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.3 Conditional\r\n" + 
			"You can use if, then and else keywords to put tests if your diagram. Labels can be provided\r\n" + 
			"using parentheses.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"if (Graphviz installed?) then (yes)\r\n" + 
			":process all\\ndiagrams;\r\n" + 
			"else (no)\r\n" + 
			":process only\r\n" + 
			"__sequence__ and __activity__ diagrams;\r\n" + 
			"endif\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"You can use the elseif keyword to have several tests :\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"if (condition A) then (yes)\r\n" + 
			":Text 1;\r\n" + 
			"elseif (condition B) then (yes)\r\n" + 
			":Text 2;\r\n" + 
			"stop\r\n" + 
			"elseif (condition C) then (yes)\r\n" + 
			":Text 3;\r\n" + 
			"elseif (condition D) then (yes)\r\n" + 
			":Text 4;\r\n" + 
			"else (nothing)\r\n" + 
			":Text else;\r\n" + 
			"endif\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 64 of 120\r\n" + 
			"5.4 Repeat loop 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.4 Repeat loop\r\n" + 
			"You can use repeat and repeatwhile keywords to have repeat loops.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"repeat\r\n" + 
			":read data;\r\n" + 
			":generate diagrams;\r\n" + 
			"repeat while (more data?)\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"5.5 While loop\r\n" + 
			"You can use while and end while keywords to have repeat loops.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"while (data available?)\r\n" + 
			":read data;\r\n" + 
			":generate diagrams;\r\n" + 
			"endwhile\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 65 of 120\r\n" + 
			"5.6 Parallel processing 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"It is possible to provide a label after the endwhile keyword, or using the is keyword.\r\n" + 
			"@startuml\r\n" + 
			"while (check filesize ?) is (not empty)\r\n" + 
			":read file;\r\n" + 
			"endwhile (empty)\r\n" + 
			":close file;\r\n" + 
			"@enduml\r\n" + 
			"5.6 Parallel processing\r\n" + 
			"You can use fork, fork again and end fork keywords to denote parallel processing.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"if (multiprocessor?) then (yes)\r\n" + 
			"fork\r\n" + 
			":Treatment 1;\r\n" + 
			"fork again\r\n" + 
			":Treatment 2;\r\n" + 
			"end fork\r\n" + 
			"else (monoproc)\r\n" + 
			":Treatment 1;\r\n" + 
			":Treatment 2;\r\n" + 
			"endif\r\n" + 
			"@enduml\r\n" + 
			"5.7 Notes\r\n" + 
			"Text formatting can be done using creole wiki syntax.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			":foo1;\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 66 of 120\r\n" + 
			"5.8 Title Legend 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"note left: This is a note\r\n" + 
			":foo2;\r\n" + 
			"note right\r\n" + 
			"This note is on several\r\n" + 
			"//lines// and can\r\n" + 
			"contain <b>HTML</b>\r\n" + 
			"====\r\n" + 
			"* Calling the method \"\"foo()\"\" is prohibited\r\n" + 
			"end note\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"5.8 Title Legend\r\n" + 
			"You can add title, header, footer, legend to a diagram:\r\n" + 
			"@startuml\r\n" + 
			"title this is my title\r\n" + 
			"if (condition?) then (yes)\r\n" + 
			":yes;\r\n" + 
			"else (no)\r\n" + 
			":no;\r\n" + 
			"note right\r\n" + 
			"this is a note\r\n" + 
			"end note\r\n" + 
			"endif\r\n" + 
			"stop\r\n" + 
			"legend\r\n" + 
			"this is the legend\r\n" + 
			"endlegend\r\n" + 
			"footer dummy footer\r\n" + 
			"header\r\n" + 
			"this is\r\n" + 
			"a long __dummy__ header\r\n" + 
			"end header\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 67 of 120\r\n" + 
			"5.9 Colors 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.9 Colors\r\n" + 
			"You can use specify a color for some activities.\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			":starting progress;\r\n" + 
			"#HotPink:reading configuration files\r\n" + 
			"These files should edited at this point!;\r\n" + 
			"#AAAAAA:ending of the process;\r\n" + 
			"@enduml\r\n" + 
			"5.10 Arrows\r\n" + 
			"Using the -> notation, you can add texts to arrow, and change their color.\r\n" + 
			"@startuml\r\n" + 
			":foo1;\r\n" + 
			"-> You can put text on arrows;\r\n" + 
			"if (test) then\r\n" + 
			"-[#blue]->\r\n" + 
			":foo2;\r\n" + 
			"-[#green]-> The text can\r\n" + 
			"also be on several lines\r\n" + 
			"and **very** long...;\r\n" + 
			":foo3;\r\n" + 
			"else\r\n" + 
			"-[#black]->\r\n" + 
			":foo4;\r\n" + 
			"endif\r\n" + 
			"-[#gray]->\r\n" + 
			":foo5;\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 68 of 120\r\n" + 
			"5.11 Grouping 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.11 Grouping\r\n" + 
			"You can group activity together by defining partition:\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			"partition Initialization {\r\n" + 
			":read config file;\r\n" + 
			":init internal variable;\r\n" + 
			"}\r\n" + 
			"partition Running {\r\n" + 
			":wait for user interaction;\r\n" + 
			":print information;\r\n" + 
			"}\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 69 of 120\r\n" + 
			"5.12 Swimlanes 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.12 Swimlanes\r\n" + 
			"Using pipe |, you can define swimlanes.\r\n" + 
			"It’s also possible to change swimlanes color.\r\n" + 
			"@startuml\r\n" + 
			"|Swimlane1|\r\n" + 
			"start\r\n" + 
			":foo1;\r\n" + 
			"|#AntiqueWhite|Swimlane2|\r\n" + 
			":foo2;\r\n" + 
			":foo3;\r\n" + 
			"|Swimlane1|\r\n" + 
			":foo4;\r\n" + 
			"|Swimlane2|\r\n" + 
			":foo5;\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"5.13 Detach\r\n" + 
			"It’s possible to remove an arrow using the detach keyword.\r\n" + 
			"@startuml\r\n" + 
			":start;\r\n" + 
			"fork\r\n" + 
			":foo1;\r\n" + 
			":foo2;\r\n" + 
			"fork again\r\n" + 
			":foo3;\r\n" + 
			"detach\r\n" + 
			"endfork\r\n" + 
			"if (foo4) then\r\n" + 
			":foo5;\r\n" + 
			"detach\r\n" + 
			"endif\r\n" + 
			":foo6;\r\n" + 
			"detach\r\n" + 
			":foo7;\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 70 of 120\r\n" + 
			"5.14 SDL 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"5.14 SDL\r\n" + 
			"By changing the final ; separator, you can set different rendering for the activity:\r\n" + 
			"• |\r\n" + 
			"• <\r\n" + 
			"• >\r\n" + 
			"• /\r\n" + 
			"• ]\r\n" + 
			"• }\r\n" + 
			"@startuml\r\n" + 
			":Ready;\r\n" + 
			":next(o)|\r\n" + 
			":Receiving;\r\n" + 
			"split\r\n" + 
			":nak(i)<\r\n" + 
			":ack(o)>\r\n" + 
			"split again\r\n" + 
			":ack(i)<\r\n" + 
			":next(o)\r\n" + 
			"on several line|\r\n" + 
			":i := i + 1]\r\n" + 
			":ack(o)>\r\n" + 
			"split again\r\n" + 
			":err(i)<\r\n" + 
			":nak(o)>\r\n" + 
			"split again\r\n" + 
			":foo/\r\n" + 
			"split again\r\n" + 
			":i > 5}\r\n" + 
			"stop\r\n" + 
			"end split\r\n" + 
			":finish;\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 71 of 120\r\n" + 
			"5.15 Complete example 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"5.15 Complete example\r\n" + 
			"@startuml\r\n" + 
			"start\r\n" + 
			":ClickServlet.handleRequest();\r\n" + 
			":new page;\r\n" + 
			"if (Page.onSecurityCheck) then (true)\r\n" + 
			":Page.onInit();\r\n" + 
			"if (isForward?) then (no)\r\n" + 
			":Process controls;\r\n" + 
			"if (continue processing?) then (no)\r\n" + 
			"stop\r\n" + 
			"endif\r\n" + 
			"if (isPost?) then (yes)\r\n" + 
			":Page.onPost();\r\n" + 
			"else (no)\r\n" + 
			":Page.onGet();\r\n" + 
			"endif\r\n" + 
			":Page.onRender();\r\n" + 
			"endif\r\n" + 
			"else (false)\r\n" + 
			"endif\r\n" + 
			"if (do redirect?) then (yes)\r\n" + 
			":redirect process;\r\n" + 
			"else\r\n" + 
			"if (do forward?) then (yes)\r\n" + 
			":Forward request;\r\n" + 
			"else (no)\r\n" + 
			":Render page template;\r\n" + 
			"endif\r\n" + 
			"endif\r\n" + 
			"stop\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 72 of 120\r\n" + 
			"5.15 Complete example 5 ACTIVITY DIAGRAM (BETA)\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 73 of 120\r\n" + 
			"6 COMPONENT DIAGRAM\r\n" + 
			"6 Component Diagram\r\n" + 
			"6.1 Components\r\n" + 
			"Components must be bracketed.\r\n" + 
			"You can also use the component keyword to defines a component. And you can define an alias,\r\n" + 
			"using the as keyword. This alias will be used latter, when defining relations.\r\n" + 
			"@startuml\r\n" + 
			"[First component]\r\n" + 
			"[Another component] as Comp2\r\n" + 
			"component Comp3\r\n" + 
			"component [Last\\ncomponent] as Comp4\r\n" + 
			"@enduml\r\n" + 
			"6.2 Interfaces\r\n" + 
			"Interface can be defined using the () symbol (because this looks like a circle).\r\n" + 
			"You can also use the interface keyword to defines an interface. And you can define an alias, using\r\n" + 
			"the as keyword. This alias will be used latter, when defining relations.\r\n" + 
			"We will see latter that interface definition is optional.\r\n" + 
			"@startuml\r\n" + 
			"() \"First Interface\"\r\n" + 
			"() \"Another interface\" as Interf2\r\n" + 
			"interface Interf3\r\n" + 
			"interface \"Last\\ninterface\" as Interf4\r\n" + 
			"@enduml\r\n" + 
			"6.3 Basic example\r\n" + 
			"Links between elements are made using combinations of dotted line (..), straight line (--), and\r\n" + 
			"arrows (-->) symbols.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 74 of 120\r\n" + 
			"6.4 Using notes 6 COMPONENT DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"DataAccess - [First Component]\r\n" + 
			"[First Component] ..> HTTP : use\r\n" + 
			"@enduml\r\n" + 
			"6.4 Using notes\r\n" + 
			"You can use the note left of , note right of , note top of , note bottom of keywords to\r\n" + 
			"define notes related to a single object.\r\n" + 
			"A note can be also define alone with the note keywords, then linked to other objects using the ..\r\n" + 
			"symbol.\r\n" + 
			"@startuml\r\n" + 
			"interface \"Data Access\" as DA\r\n" + 
			"DA - [First Component]\r\n" + 
			"[First Component] ..> HTTP : use\r\n" + 
			"note left of HTTP : Web Service only\r\n" + 
			"note right of [First Component]\r\n" + 
			"A note can also\r\n" + 
			"be on several lines\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"6.5 Grouping Components\r\n" + 
			"You can use several keywords to group components and interfaces together:\r\n" + 
			"• package\r\n" + 
			"• node\r\n" + 
			"• folder\r\n" + 
			"• frame\r\n" + 
			"• cloud\r\n" + 
			"• database\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 75 of 120\r\n" + 
			"6.5 Grouping Components 6 COMPONENT DIAGRAM\r\n" + 
			"@startuml\r\n" + 
			"package \"Some Group\" {\r\n" + 
			"HTTP - [First Component]\r\n" + 
			"[Another Component]\r\n" + 
			"}\r\n" + 
			"node \"Other Groups\" {\r\n" + 
			"FTP - [Second Component]\r\n" + 
			"[First Component] --> FTP\r\n" + 
			"}\r\n" + 
			"cloud {\r\n" + 
			"[Example 1]\r\n" + 
			"}\r\n" + 
			"database \"MySql\" {\r\n" + 
			"folder \"This is my folder\" {\r\n" + 
			"[Folder 3]\r\n" + 
			"}\r\n" + 
			"frame \"Foo\" {\r\n" + 
			"[Frame 4]\r\n" + 
			"}\r\n" + 
			"}\r\n" + 
			"[Another Component] --> [Example 1]\r\n" + 
			"[Example 1] --> [Folder 3]\r\n" + 
			"[Folder 3] --> [Frame 4]\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 76 of 120\r\n" + 
			"6.6 Changing arrows direction 6 COMPONENT DIAGRAM\r\n" + 
			"6.6 Changing arrows direction\r\n" + 
			"By default, links between classes have two dashes -- and are vertically oriented. It is possible to\r\n" + 
			"use horizontal link by putting a single dash (or dot) like this:\r\n" + 
			"@startuml\r\n" + 
			"[Component] --> Interface1\r\n" + 
			"[Component] -> Interface2\r\n" + 
			"@enduml\r\n" + 
			"You can also change directions by reversing the link:\r\n" + 
			"@startuml\r\n" + 
			"Interface1 <-- [Component]\r\n" + 
			"Interface2 <- [Component]\r\n" + 
			"@enduml\r\n" + 
			"It is also possible to change arrow direction by adding left, right, up or down keywords inside the\r\n" + 
			"arrow:\r\n" + 
			"@startuml\r\n" + 
			"[Component] -left-> left\r\n" + 
			"[Component] -right-> right\r\n" + 
			"[Component] -up-> up\r\n" + 
			"[Component] -down-> down\r\n" + 
			"@enduml\r\n" + 
			"You can shorten the arrow by using only the first character of the direction (for example, -dinstead of -down-) or the two first characters (-do-).\r\n" + 
			"Please note that you should not abuse this functionality : Graphviz gives usually good results\r\n" + 
			"without tweaking.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 77 of 120\r\n" + 
			"6.7 Title the diagram 6 COMPONENT DIAGRAM\r\n" + 
			"6.7 Title the diagram\r\n" + 
			"The title keywords is used to put a title.\r\n" + 
			"You can use title and end title keywords for a longer title, as in sequence diagrams.\r\n" + 
			"@startuml\r\n" + 
			"title Very simple component\\ndiagram\r\n" + 
			"interface \"Data Access\" as DA\r\n" + 
			"DA - [First Component]\r\n" + 
			"[First Component] ..> HTTP : use\r\n" + 
			"@enduml\r\n" + 
			"6.8 Use UML2 notation\r\n" + 
			"The skinparam componentStyle uml2 command is used to switch to UML2 notation.\r\n" + 
			"@startuml\r\n" + 
			"skinparam componentStyle uml2\r\n" + 
			"interface \"Data Access\" as DA\r\n" + 
			"DA - [First Component]\r\n" + 
			"[First Component] ..> HTTP : use\r\n" + 
			"@enduml\r\n" + 
			"6.9 Individual colors\r\n" + 
			"You can specify a color after component definition.\r\n" + 
			"@startuml\r\n" + 
			"component [Web Server] #Yellow\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 78 of 120\r\n" + 
			"6.10 Skinparam 6 COMPONENT DIAGRAM\r\n" + 
			"6.10 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"You can define specific color and fonts for stereotyped components and interfaces.\r\n" + 
			"@startuml\r\n" + 
			"skinparam component {\r\n" + 
			"FontSize 13\r\n" + 
			"InterfaceBackgroundColor RosyBrown\r\n" + 
			"InterfaceBorderColor orange\r\n" + 
			"BackgroundColor <<Apache>> Red\r\n" + 
			"BorderColor <<Apache>> #FF6655\r\n" + 
			"FontName Courier\r\n" + 
			"BorderColor black\r\n" + 
			"BackgroundColor gold\r\n" + 
			"ArrowFontName Impact\r\n" + 
			"ArrowColor #FF6655\r\n" + 
			"ArrowFontColor #777777\r\n" + 
			"}\r\n" + 
			"() \"Data Access\" as DA\r\n" + 
			"DA - [First Component]\r\n" + 
			"[First Component] ..> () HTTP : use\r\n" + 
			"HTTP - [Web Server] << Apache >>\r\n" + 
			"@enduml\r\n" + 
			"@startuml\r\n" + 
			"[AA] <<static lib>>\r\n" + 
			"[BB] <<shared lib>>\r\n" + 
			"[CC] <<static lib>>\r\n" + 
			"node node1\r\n" + 
			"node node2 <<shared node>>\r\n" + 
			"database Production\r\n" + 
			"skinparam component {\r\n" + 
			"backgroundColor <<static lib>> DarkKhaki\r\n" + 
			"backgroundColor <<shared lib>> Green\r\n" + 
			"}\r\n" + 
			"skinparam node {\r\n" + 
			"borderColor Green\r\n" + 
			"backgroundColor Yellow\r\n" + 
			"backgroundColor <<shared node>> Magenta\r\n" + 
			"}\r\n" + 
			"skinparam databaseBackgroundColor Aqua\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 79 of 120\r\n" + 
			"6.10 Skinparam 6 COMPONENT DIAGRAM\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 80 of 120\r\n" + 
			"7 STATE DIAGRAM\r\n" + 
			"7 State Diagram\r\n" + 
			"7.1 Simple State\r\n" + 
			"You can use [*] for the starting point and ending point of the state diagram.\r\n" + 
			"Use --> for arrows.\r\n" + 
			"@startuml\r\n" + 
			"[*] --> State1\r\n" + 
			"State1 --> [*]\r\n" + 
			"State1 : this is a string\r\n" + 
			"State1 : this is another string\r\n" + 
			"State1 -> State2\r\n" + 
			"State2 --> [*]\r\n" + 
			"@enduml\r\n" + 
			"7.2 Composite state\r\n" + 
			"A state can also be composite. You have to define it using the state keywords and brackets.\r\n" + 
			"@startuml\r\n" + 
			"scale 350 width\r\n" + 
			"[*] --> NotShooting\r\n" + 
			"state NotShooting {\r\n" + 
			"[*] --> Idle\r\n" + 
			"Idle --> Configuring : EvConfig\r\n" + 
			"Configuring --> Idle : EvConfig\r\n" + 
			"}\r\n" + 
			"state Configuring {\r\n" + 
			"[*] --> NewValueSelection\r\n" + 
			"NewValueSelection --> NewValuePreview : EvNewValue\r\n" + 
			"NewValuePreview --> NewValueSelection : EvNewValueRejected\r\n" + 
			"NewValuePreview --> NewValueSelection : EvNewValueSaved\r\n" + 
			"state NewValuePreview {\r\n" + 
			"State1 -> State2\r\n" + 
			"}\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 81 of 120\r\n" + 
			"7.3 Long name 7 STATE DIAGRAM\r\n" + 
			"7.3 Long name\r\n" + 
			"You can also use the state keyword to use long description for states.\r\n" + 
			"@startuml\r\n" + 
			"scale 600 width\r\n" + 
			"[*] -> State1\r\n" + 
			"State1 --> State2 : Succeeded\r\n" + 
			"State1 --> [*] : Aborted\r\n" + 
			"State2 --> State3 : Succeeded\r\n" + 
			"State2 --> [*] : Aborted\r\n" + 
			"state State3 {\r\n" + 
			"state \"Accumulate Enough Data\\nLong State Name\" as long1\r\n" + 
			"long1 : Just a test\r\n" + 
			"[*] --> long1\r\n" + 
			"long1 --> long1 : New Data\r\n" + 
			"long1 --> ProcessData : Enough Data\r\n" + 
			"}\r\n" + 
			"State3 --> State3 : Failed\r\n" + 
			"State3 --> [*] : Succeeded / Save Result\r\n" + 
			"State3 --> [*] : Aborted\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 82 of 120\r\n" + 
			"7.4 Concurrent state 7 STATE DIAGRAM\r\n" + 
			"7.4 Concurrent state\r\n" + 
			"You can define concurrent state into a composite state using either -- or || symbol as separator.\r\n" + 
			"@startuml\r\n" + 
			"[*] --> Active\r\n" + 
			"state Active {\r\n" + 
			"[*] -> NumLockOff\r\n" + 
			"NumLockOff --> NumLockOn : EvNumLockPressed\r\n" + 
			"NumLockOn --> NumLockOff : EvNumLockPressed\r\n" + 
			"--\r\n" + 
			"[*] -> CapsLockOff\r\n" + 
			"CapsLockOff --> CapsLockOn : EvCapsLockPressed\r\n" + 
			"CapsLockOn --> CapsLockOff : EvCapsLockPressed\r\n" + 
			"--\r\n" + 
			"[*] -> ScrollLockOff\r\n" + 
			"ScrollLockOff --> ScrollLockOn : EvCapsLockPressed\r\n" + 
			"ScrollLockOn --> ScrollLockOff : EvCapsLockPressed\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 83 of 120\r\n" + 
			"7.5 Arrow direction 7 STATE DIAGRAM\r\n" + 
			"7.5 Arrow direction\r\n" + 
			"You can use -> for horizontal arrows. It is possible to force arrow’s direction using the following\r\n" + 
			"syntax:\r\n" + 
			"• -down-> (default arrow)\r\n" + 
			"• -right-> or ->\r\n" + 
			"• -left->\r\n" + 
			"• -up->\r\n" + 
			"@startuml\r\n" + 
			"[*] -up-> First\r\n" + 
			"First -right-> Second\r\n" + 
			"Second --> Third\r\n" + 
			"Third -left-> Last\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 84 of 120\r\n" + 
			"7.6 Note 7 STATE DIAGRAM\r\n" + 
			"You can shorten the arrow by using only the first character of the direction (for example, -dinstead of -down-) or the two first characters (-do-).\r\n" + 
			"Please note that you should not abuse this functionality : Graphviz gives usually good results\r\n" + 
			"without tweaking.\r\n" + 
			"7.6 Note\r\n" + 
			"You can also define notes using note left of, note right of, note top of, note bottom of\r\n" + 
			"keywords.\r\n" + 
			"You can also define notes on several lines.\r\n" + 
			"@startuml\r\n" + 
			"[*] --> Active\r\n" + 
			"Active --> Inactive\r\n" + 
			"note left of Active : this is a short\\nnote\r\n" + 
			"note right of Inactive\r\n" + 
			"A note can also\r\n" + 
			"be defined on\r\n" + 
			"several lines\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"You can also have floating notes.\r\n" + 
			"@startuml\r\n" + 
			"state foo\r\n" + 
			"note \"This is a floating note\" as N1\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 85 of 120\r\n" + 
			"7.7 More in notes 7 STATE DIAGRAM\r\n" + 
			"7.7 More in notes\r\n" + 
			"You can put notes on composite states.\r\n" + 
			"@startuml\r\n" + 
			"[*] --> NotShooting\r\n" + 
			"state \"Not Shooting State\" as NotShooting {\r\n" + 
			"state \"Idle mode\" as Idle\r\n" + 
			"state \"Configuring mode\" as Configuring\r\n" + 
			"[*] --> Idle\r\n" + 
			"Idle --> Configuring : EvConfig\r\n" + 
			"Configuring --> Idle : EvConfig\r\n" + 
			"}\r\n" + 
			"note right of NotShooting : This is a note on a composite state\r\n" + 
			"@enduml\r\n" + 
			"7.8 Skinparam\r\n" + 
			"You can use the skinparam command to change colors and fonts for the drawing.\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file,\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"You can define specific color and fonts for stereotyped states.\r\n" + 
			"@startuml\r\n" + 
			"skinparam backgroundColor LightYellow\r\n" + 
			"skinparam state {\r\n" + 
			"StartColor MediumBlue\r\n" + 
			"EndColor Red\r\n" + 
			"BackgroundColor Peru\r\n" + 
			"BackgroundColor <<Warning >> Olive\r\n" + 
			"BorderColor Gray\r\n" + 
			"FontName Impact\r\n" + 
			"}\r\n" + 
			"[*] --> NotShooting\r\n" + 
			"state \"Not Shooting State\" as NotShooting {\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 86 of 120\r\n" + 
			"7.8 Skinparam 7 STATE DIAGRAM\r\n" + 
			"state \"Idle mode\" as Idle <<Warning >>\r\n" + 
			"state \"Configuring mode\" as Configuring\r\n" + 
			"[*] --> Idle\r\n" + 
			"Idle --> Configuring : EvConfig\r\n" + 
			"Configuring --> Idle : EvConfig\r\n" + 
			"}\r\n" + 
			"NotShooting --> [*]\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 87 of 120\r\n" + 
			"8 OBJECT DIAGRAM\r\n" + 
			"8 Object Diagram\r\n" + 
			"8.1 Definition of objects\r\n" + 
			"You define instance of objects using the object keywords.\r\n" + 
			"@startuml\r\n" + 
			"object firstObject\r\n" + 
			"object \"My Second Object\" as o2\r\n" + 
			"@enduml\r\n" + 
			"8.2 Relations between objects\r\n" + 
			"Relations between objects are defined using the following symbols :\r\n" + 
			"Extension <|--\r\n" + 
			"Composition *--\r\n" + 
			"Aggregation o--\r\n" + 
			"It is possible to replace -- by .. to have a dotted line.\r\n" + 
			"Knowing those rules, it is possible to draw the following drawings.\r\n" + 
			"It is possible a add a label on the relation, using ” : ”, followed by the text of the label.\r\n" + 
			"For cardinality, you can use double-quotes \"\" on each side of the relation.\r\n" + 
			"@startuml\r\n" + 
			"object Object01\r\n" + 
			"object Object02\r\n" + 
			"object Object03\r\n" + 
			"object Object04\r\n" + 
			"object Object05\r\n" + 
			"object Object06\r\n" + 
			"object Object07\r\n" + 
			"object Object08\r\n" + 
			"Object01 <|-- Object02\r\n" + 
			"Object03 *-- Object04\r\n" + 
			"Object05 o-- \"4\" Object06\r\n" + 
			"Object07 .. Object08 : some labels\r\n" + 
			"@enduml\r\n" + 
			"8.3 Adding fields\r\n" + 
			"To declare fields, you can use the symbol \":\" followed by the field’s name.\r\n" + 
			"@startuml\r\n" + 
			"object user\r\n" + 
			"user : name = \"Dummy\"\r\n" + 
			"user : id = 123\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 88 of 120\r\n" + 
			"8.4 Common features with class diagrams 8 OBJECT DIAGRAM\r\n" + 
			"It is also possible to ground between brackets { all fields.\r\n" + 
			"@startuml\r\n" + 
			"object user {\r\n" + 
			"name = \"Dummy\"\r\n" + 
			"id = 123\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"8.4 Common features with class diagrams\r\n" + 
			"• Visibility\r\n" + 
			"• Defines notes\r\n" + 
			"• Use packages\r\n" + 
			"• Title the diagram\r\n" + 
			"• Skin the output\r\n" + 
			"• Split the image\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 89 of 120\r\n" + 
			"9 COMMON COMMANDS\r\n" + 
			"9 Common commands\r\n" + 
			"9.1 Footer and header\r\n" + 
			"You can use the commands header or footer to add a footer or a header on any generated diagram.\r\n" + 
			"You can optionally specify if you want a center, left or right footer/header, by adding a keyword.\r\n" + 
			"As for title, it is possible to define a header or a footer on several lines.\r\n" + 
			"It is also possible to put some HTML into the header or footer.\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob: Authentication Request\r\n" + 
			"header\r\n" + 
			"<font color=red>Warning:</font>\r\n" + 
			"Do not use in production.\r\n" + 
			"endheader\r\n" + 
			"center footer Generated for demonstration\r\n" + 
			"@enduml\r\n" + 
			"9.2 Zoom\r\n" + 
			"You can use the scale command to zoom the generated image.\r\n" + 
			"You can use either a number or a fraction to define the scale factor. You can also specify either\r\n" + 
			"width or height (in pixel). And you can also give both width and height : the image is scaled to fit\r\n" + 
			"inside the specified dimension.\r\n" + 
			"• scale 1.5\r\n" + 
			"• scale 2/3\r\n" + 
			"• scale 200 width\r\n" + 
			"• scale 200 height\r\n" + 
			"• scale 200*100\r\n" + 
			"@startuml\r\n" + 
			"scale 180*90\r\n" + 
			"Bob->Alice : hello\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 90 of 120\r\n" + 
			"10 SALT\r\n" + 
			"10 Salt\r\n" + 
			"Salt is a subproject included in PlantUML that may help you to design graphical interface.\r\n" + 
			"You can use either @startsalt keyword, or @startuml followed by a line with salt keyword.\r\n" + 
			"10.1 Basic widgets\r\n" + 
			"A window must start and end with brackets. You can then define:\r\n" + 
			"• Button using [ and ].\r\n" + 
			"• Radio button using ( and ).\r\n" + 
			"• Checkbox using [ and ].\r\n" + 
			"• User text area using \"\r\n" + 
			"@startuml\r\n" + 
			"salt\r\n" + 
			"{\r\n" + 
			"Just plain text\r\n" + 
			"[This is my button]\r\n" + 
			"() Unchecked radio\r\n" + 
			"(X) Checked radio\r\n" + 
			"[] Unchecked box\r\n" + 
			"[X] Checked box\r\n" + 
			"\"Enter text here \"\r\n" + 
			"^This is a droplist^\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"The goal of this tool is to discuss about simple and sample windows.\r\n" + 
			"10.2 Using grid\r\n" + 
			"A table is automatically created when you use an opening bracket {.\r\n" + 
			"And you have to use | to separate columns.\r\n" + 
			"For example:\r\n" + 
			"@startsalt\r\n" + 
			"{\r\n" + 
			"Login | \"MyName \"\r\n" + 
			"Password | \"**** \"\r\n" + 
			"[Cancel] | [ OK ]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 91 of 120\r\n" + 
			"10.3 Using separator 10 SALT\r\n" + 
			"Just after the opening bracket, you can use a character to define if you want to draw lines or columns\r\n" + 
			"of the grid :\r\n" + 
			"# To display all vertical and horizontal lines\r\n" + 
			"! To display all vertical lines\r\n" + 
			"- To display all horizontal lines\r\n" + 
			"+ To display external lines\r\n" + 
			"@startsalt\r\n" + 
			"{+\r\n" + 
			"Login | \"MyName \"\r\n" + 
			"Password | \"**** \"\r\n" + 
			"[Cancel] | [ OK ]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"10.3 Using separator\r\n" + 
			"You can use several horizontal lines as separator.\r\n" + 
			"@startsalt\r\n" + 
			"{\r\n" + 
			"Text1\r\n" + 
			"..\r\n" + 
			"\"Some field\"\r\n" + 
			"==\r\n" + 
			"Note on usage\r\n" + 
			"~~\r\n" + 
			"Another text\r\n" + 
			"--\r\n" + 
			"[Ok]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"10.4 Tree widget\r\n" + 
			"To have a Tree, you have to start with {T and to use + to denote hierarchy.\r\n" + 
			"@startsalt\r\n" + 
			"{\r\n" + 
			"{T\r\n" + 
			"+ World\r\n" + 
			"++ America\r\n" + 
			"+++ Canada\r\n" + 
			"+++ USA\r\n" + 
			"++++ New York\r\n" + 
			"++++ Boston\r\n" + 
			"+++ Mexico\r\n" + 
			"++ Europe\r\n" + 
			"+++ Italy\r\n" + 
			"+++ Germany\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 92 of 120\r\n" + 
			"10.5 Enclosing brackets 10 SALT\r\n" + 
			"++++ Berlin\r\n" + 
			"++ Africa\r\n" + 
			"}\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"10.5 Enclosing brackets\r\n" + 
			"You can define subelements by opening a new opening bracket.\r\n" + 
			"@startsalt\r\n" + 
			"{\r\n" + 
			"Name | \" \"\r\n" + 
			"Modifiers: | { (X) public | () default | () private | () protected\r\n" + 
			"[] abstract | [] final | [] static }\r\n" + 
			"Superclass: | { \"java.lang.Object \" | [Browse...] }\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"10.6 Adding tabs\r\n" + 
			"You can add tabs using {/ notation. Note that you can use HTML code to have bold text.\r\n" + 
			"@startsalt\r\n" + 
			"{+\r\n" + 
			"{/ <b>General | Fullscreen | Behavior | Saving }\r\n" + 
			"{\r\n" + 
			"{ Open image in: | ^Smart Mode^ }\r\n" + 
			"[X] Smooth images when zoomed\r\n" + 
			"[X] Confirm image deletion\r\n" + 
			"[ ] Show hidden images\r\n" + 
			"}\r\n" + 
			"[Close]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"Tab could also be vertically oriented:\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 93 of 120\r\n" + 
			"10.7 Using menu 10 SALT\r\n" + 
			"@startsalt\r\n" + 
			"{+\r\n" + 
			"{/ <b>General\r\n" + 
			"Fullscreen\r\n" + 
			"Behavior\r\n" + 
			"Saving } |\r\n" + 
			"{\r\n" + 
			"{ Open image in: | ^Smart Mode^ }\r\n" + 
			"[X] Smooth images when zoomed\r\n" + 
			"[X] Confirm image deletion\r\n" + 
			"[ ] Show hidden images\r\n" + 
			"[Close]\r\n" + 
			"}\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"10.7 Using menu\r\n" + 
			"You can add a menu by using {* notation.\r\n" + 
			"@startsalt\r\n" + 
			"{+\r\n" + 
			"{* File | Edit | Source | Refactor }\r\n" + 
			"{/ General | Fullscreen | Behavior | Saving }\r\n" + 
			"{\r\n" + 
			"{ Open image in: | ^Smart Mode^ }\r\n" + 
			"[X] Smooth images when zoomed\r\n" + 
			"[X] Confirm image deletion\r\n" + 
			"[ ] Show hidden images\r\n" + 
			"}\r\n" + 
			"[Close]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"It is also possible to open a menu:\r\n" + 
			"@startsalt\r\n" + 
			"{+\r\n" + 
			"{* File | Edit | Source | Refactor\r\n" + 
			"Refactor | New | Open File | - | Close | Close All }\r\n" + 
			"{/ General | Fullscreen | Behavior | Saving }\r\n" + 
			"{\r\n" + 
			"{ Open image in: | ^Smart Mode^ }\r\n" + 
			"[X] Smooth images when zoomed\r\n" + 
			"[X] Confirm image deletion\r\n" + 
			"[ ] Show hidden images\r\n" + 
			"}\r\n" + 
			"[Close]\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 94 of 120\r\n" + 
			"10.8 Advanced table 10 SALT\r\n" + 
			"10.8 Advanced table\r\n" + 
			"You can use two special notations for table :\r\n" + 
			"• * to indicate that a cell with span with left\r\n" + 
			"• . to denotate an empty cell\r\n" + 
			"@startsalt\r\n" + 
			"{#\r\n" + 
			". | Column 2 | Column 3\r\n" + 
			"Row header 1 | value 1 | value 2\r\n" + 
			"Row header 2 | A long cell | *\r\n" + 
			"}\r\n" + 
			"@endsalt\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 95 of 120\r\n" + 
			"11 CREOLE\r\n" + 
			"11 Creole\r\n" + 
			"A light Creole engine have been integrated into PlantUML to have a standardized way of defining\r\n" + 
			"text style.\r\n" + 
			"All diagrams are now supporting this syntax.\r\n" + 
			"(Note that ascending compatibility with HTML syntax is preserved)\r\n" + 
			"11.1 Emphasized text\r\n" + 
			"@startuml\r\n" + 
			"Alice -> Bob : hello --there--\r\n" + 
			"... Some ~~long delay~~ ...\r\n" + 
			"Bob -> Alice : ok\r\n" + 
			"note left\r\n" + 
			"This is **bold**\r\n" + 
			"This is //italics//\r\n" + 
			"This is \"\"monospaced\"\"\r\n" + 
			"This is --stroked --\r\n" + 
			"This is __underlined__\r\n" + 
			"This is ~~waved~~\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"11.2 List\r\n" + 
			"@startuml\r\n" + 
			"object demo {\r\n" + 
			"* Bullet list\r\n" + 
			"* Second item\r\n" + 
			"** Sub item\r\n" + 
			"}\r\n" + 
			"legend\r\n" + 
			"# Numbered list\r\n" + 
			"# Second item\r\n" + 
			"## Sub item\r\n" + 
			"## Another sub item\r\n" + 
			"# Third item\r\n" + 
			"end legend\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 96 of 120\r\n" + 
			"11.3 Escape character 11 CREOLE\r\n" + 
			"11.3 Escape character\r\n" + 
			"You can use the tilde ~ to escape special creole characters.\r\n" + 
			"@startuml\r\n" + 
			"object demo {\r\n" + 
			"This is not ~___underscored__.\r\n" + 
			"This is not ~\"\"monospaced\"\".\r\n" + 
			"}\r\n" + 
			"@enduml\r\n" + 
			"11.4 Horizontal lines\r\n" + 
			"@startuml\r\n" + 
			"database DB1 as \"\r\n" + 
			"You can have horizontal line\r\n" + 
			"----\r\n" + 
			"Or double line\r\n" + 
			"====\r\n" + 
			"Or strong line\r\n" + 
			"____\r\n" + 
			"Or dotted line\r\n" + 
			"..My title..\r\n" + 
			"Enjoy!\r\n" + 
			"\"\r\n" + 
			"note right\r\n" + 
			"This is working also in notes\r\n" + 
			"You can also add title in all these lines\r\n" + 
			"==Title==\r\n" + 
			"--Another title--\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 97 of 120\r\n" + 
			"11.5 Headings 11 CREOLE\r\n" + 
			"11.5 Headings\r\n" + 
			"@startuml\r\n" + 
			"usecase UC1 as \"\r\n" + 
			"= Extra-large heading\r\n" + 
			"Some text\r\n" + 
			"== Large heading\r\n" + 
			"Other text\r\n" + 
			"=== Medium heading\r\n" + 
			"Information\r\n" + 
			"....\r\n" + 
			"==== Small heading\"\r\n" + 
			"@enduml\r\n" + 
			"11.6 Legacy HTML\r\n" + 
			"Some HTML tags are also working:\r\n" + 
			"• <b> for bold text\r\n" + 
			"• <u> or <u:AAAAAA> or <u:colorName> for underline\r\n" + 
			"• <i> for italic\r\n" + 
			"• <s> or <s:AAAAAA> or <s:colorName> for strike text\r\n" + 
			"• <w> or <w:AAAAAA> or <w:colorName> for wave underline text <!–\r\n" + 
			"• <font color=\"AAAAAA\"> or <font color=\"colorName\"> –>\r\n" + 
			"• <color:AAAAAA> or <color:colorName>\r\n" + 
			"• <back:AAAAAA> or <back:colorName> for background color\r\n" + 
			"• <size:nn> to change font size\r\n" + 
			"• <img:file> : the file must be accessible by the filesystem\r\n" + 
			"• <img:http://url> : the URL must be available from the Internet\r\n" + 
			"@startuml\r\n" + 
			":* You can change <color:red>text color </color>\r\n" + 
			"* You can change <back:cadetblue >background color </back>\r\n" + 
			"* You can change <size:18>size</size>\r\n" + 
			"* You use <u>legacy </u> <b>HTML <i>tag</i></b>\r\n" + 
			"* You use <u:red>color </u> <s:green>in HTML</s> <w:#0000FF>tag</w>\r\n" + 
			"----\r\n" + 
			"* Use image : <img:sourceforge.jpg>\r\n" + 
			";\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 98 of 120\r\n" + 
			"11.7 Table 11 CREOLE\r\n" + 
			"11.7 Table\r\n" + 
			"@startuml\r\n" + 
			"skinparam titleFontSize 14\r\n" + 
			"title\r\n" + 
			"Example of simple table\r\n" + 
			"|= |= table |= header |\r\n" + 
			"| a | table | row |\r\n" + 
			"| b | table | row |\r\n" + 
			"end title\r\n" + 
			"[*] --> State1\r\n" + 
			"@enduml\r\n" + 
			"11.8 OpenIconic\r\n" + 
			"OpenIconic is an very nice open source icon set. Those icons have been integrated into the creole\r\n" + 
			"parser, so you can use them out-of-the-box. You can use the following syntax: <&ICON_NAME>.\r\n" + 
			"@startuml\r\n" + 
			"title: <size:20><&heart>Use of OpenIconic <&heart ></size>\r\n" + 
			"class Wifi\r\n" + 
			"note left\r\n" + 
			"Click on <&wifi>\r\n" + 
			"end note\r\n" + 
			"@enduml\r\n" + 
			"The complete list is available on OpenIconic Website, or you can use the following special diagram:\r\n" + 
			"@startuml\r\n" + 
			"listopeniconic\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 99 of 120\r\n" + 
			"11.8 OpenIconic 11 CREOLE\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 100 of 120\r\n" + 
			"11.9 Defining and using sprites 11 CREOLE\r\n" + 
			"11.9 Defining and using sprites\r\n" + 
			"A Sprite is a small graphic element that can be used in diagrams.\r\n" + 
			"In PlantUML, sprites are monochrome and can have either 4, 8 or 16 gray level.\r\n" + 
			"To define a sprite, you have to use a hexadecimal digit between 0 and F per pixel.\r\n" + 
			"Then you can use the sprite using <$XXX> where XXX is the name of the sprite.\r\n" + 
			"@startuml\r\n" + 
			"sprite $foo1 {\r\n" + 
			"FFFFFFFFFFFFFFF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"F0123456789ABCF\r\n" + 
			"FFFFFFFFFFFFFFF\r\n" + 
			"}\r\n" + 
			"Alice -> Bob : Testing <$foo1>\r\n" + 
			"@enduml\r\n" + 
			"11.10 Encoding Sprite\r\n" + 
			"To encode sprite, you can use the command line like:\r\n" + 
			"java -jar plantuml.jar -encodesprite 16z foo.png\r\n" + 
			"where foo.png if the image file you want to use (it will be converted to gray automatically).\r\n" + 
			"After -encodesprite, you have to specify a format: 4, 8, 16, 4z, 8z or 16z.\r\n" + 
			"The number indicates the gray level and the optionnal z is used to enable compression in sprite\r\n" + 
			"definition.\r\n" + 
			"11.11 Importing Sprite\r\n" + 
			"You can also launch the GUI to generate a sprite from an existing image.\r\n" + 
			"Click in the menubar then on File/Open Sprite Window.\r\n" + 
			"After copying an image into you clipboard, several possible definitions of the corresponding sprite\r\n" + 
			"will be displayed : you will just have to pickup the one you want.\r\n" + 
			"11.12 Examples\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 101 of 120\r\n" + 
			"11.12 Examples 11 CREOLE\r\n" + 
			"@startuml\r\n" + 
			"sprite $printer [15x15/8z] NOtH3W0W208HxFz_kMAhj7lHWpa1XC716sz0Pq4MVPEWfBHIuxP3L6kbTcizR8tAhzaqFvXwvFfPEqm0\r\n" + 
			"start\r\n" + 
			":click on <$printer > to print the page;\r\n" + 
			"@enduml\r\n" + 
			"@startuml\r\n" + 
			"sprite $bug [15x15/16z] PKzR2i0m2BFMi15p__FEjQEqB1z27aeqCqixa8S4OT7C53cKpsHpaYPDJY_12MHM -BLRyywPhrrlw3qumqNThmXgd1TOterAZmOW8sgiJafogofWRwtV3nCF\r\n" + 
			"sprite $printer [15x15/8z] NOtH3W0W208HxFz_kMAhj7lHWpa1XC716sz0Pq4MVPEWfBHIuxP3L6kbTcizR8tAhzaqFvXwvFfPEqm0\r\n" + 
			"sprite $disk {\r\n" + 
			"444445566677881\r\n" + 
			"436000000009991\r\n" + 
			"43600000000ACA1\r\n" + 
			"53700000001A7A1\r\n" + 
			"53700000012B8A1\r\n" + 
			"53800000123B8A1\r\n" + 
			"63800001233C9A1\r\n" + 
			"634999AABBC99B1\r\n" + 
			"744566778899AB1\r\n" + 
			"7456AAAAA99AAB1\r\n" + 
			"8566AFC228AABB1\r\n" + 
			"8567AC8118BBBB1\r\n" + 
			"867BD4433BBBBB1\r\n" + 
			"39AAAAABBBBBBC1\r\n" + 
			"}\r\n" + 
			"title Use of sprites (<$printer >, <$bug >...)\r\n" + 
			"class Example {\r\n" + 
			"Can have some bug : <$bug>\r\n" + 
			"Click on <$disk> to save\r\n" + 
			"}\r\n" + 
			"note left : The printer <$printer > is available\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 102 of 120\r\n" + 
			"12 CHANGING FONTS AND COLORS\r\n" + 
			"12 Changing fonts and colors\r\n" + 
			"12.1 Usage\r\n" + 
			"You can change colors and font of the drawing using the skinparam command. Example:\r\n" + 
			"skinparam backgroundColor yellow\r\n" + 
			"You can use this command :\r\n" + 
			"• In the diagram definition, like any other commands,\r\n" + 
			"• In an included file (see Preprocessing),\r\n" + 
			"• In a configuration file, provided in the command line or the ANT task.\r\n" + 
			"12.2 Nested\r\n" + 
			"To avoid repetition, it is possible to nest definition. So the following definition :\r\n" + 
			"skinparam xxxxParam1 value1\r\n" + 
			"skinparam xxxxParam2 value2\r\n" + 
			"skinparam xxxxParam3 value3\r\n" + 
			"skinparam xxxxParam4 value4\r\n" + 
			"is strictly equivalent to:\r\n" + 
			"skinparam xxxx {\r\n" + 
			"Param1 value1\r\n" + 
			"Param2 value2\r\n" + 
			"Param3 value3\r\n" + 
			"Param4 value4\r\n" + 
			"}\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 103 of 120\r\n" + 
			"12.3 Color 12 CHANGING FONTS AND COLORS\r\n" + 
			"12.3 Color\r\n" + 
			"You can use either standard color name or RGB code.\r\n" + 
			"Parameter name Default Color Comment\r\n" + 
			"Value\r\n" + 
			"backgroundColor white Background of the page\r\n" + 
			"activityArrowColor #A80036 Color of arrows in activity diagrams\r\n" + 
			"activityBackgroundColor #FEFECE Background of activities\r\n" + 
			"activityBorderColor #A80036 Color of activity borders\r\n" + 
			"activityStartColor black Starting circle in activity diagrams\r\n" + 
			"activityEndColor black Ending circle in activity diagrams\r\n" + 
			"activityBarColor black Synchronization bar in activity diagrams\r\n" + 
			"usecaseArrowColor #A80036 Color of arrows in usecase diagrams\r\n" + 
			"usecaseActorBackgroundColor #FEFECE Head’s color of actor in usecase diagrams\r\n" + 
			"usecaseActorBorderColor #A80036 Color of actor borders in usecase diagrams\r\n" + 
			"usecaseBackgroundColor #FEFECE Background of usecases\r\n" + 
			"usecaseBorderColor #A80036 Color of usecase borders in usecase diagrams\r\n" + 
			"classArrowColor #A80036 Color of arrows in class diagrams\r\n" + 
			"classBackgroundColor #FEFECE Background of classes/interface/enum in class diagrams\r\n" + 
			"classBorderColor #A80036 Borders of classes/interface/enum in class diagrams\r\n" + 
			"packageBackgroundColor #FEFECE Background of packages in class diagrams\r\n" + 
			"packageBorderColor #A80036 Borders of packages in class diagrams\r\n" + 
			"stereotypeCBackgroundColor #ADD1B2 Background of class spots in class diagrams\r\n" + 
			"stereotypeABackgroundColor #A9DCDF Background of abstract class spots in class diagrams\r\n" + 
			"stereotypeIBackgroundColor #B4A7E5 Background of interface spots in class diagrams\r\n" + 
			"stereotypeEBackgroundColor #EB937F Background of enum spots in class diagrams\r\n" + 
			"componentArrowColor #A80036 Color of arrows in component diagrams\r\n" + 
			"componentBackgroundColor #FEFECE Background of components\r\n" + 
			"componentBorderColor #A80036 Borders of components\r\n" + 
			"componentInterfaceBackgroundColor #FEFECE Background of interface in component diagrams\r\n" + 
			"componentInterfaceBorderColor #A80036 Border of interface in component diagrams\r\n" + 
			"noteBackgroundColor #FBFB77 Background of notes\r\n" + 
			"noteBorderColor #A80036 Border of notes\r\n" + 
			"stateBackgroundColor #FEFECE Background of states in state diagrams\r\n" + 
			"stateBorderColor #A80036 Border of states in state diagrams\r\n" + 
			"stateArrowColor #A80036 Colors of arrows in state diagrams\r\n" + 
			"stateStartColor black Starting circle in state diagrams\r\n" + 
			"stateEndColor black Ending circle in state diagrams\r\n" + 
			"sequenceArrowColor #A80036 Color of arrows in sequence diagrams\r\n" + 
			"sequenceActorBackgroundColor #FEFECE Head’s color of actor in sequence diagrams\r\n" + 
			"sequenceActorBorderColor #A80036 Border of actor in sequence diagrams\r\n" + 
			"sequenceGroupBackgroundColor #EEEEEE Header color of alt/opt/loop in sequence diagrams\r\n" + 
			"sequenceLifeLineBackgroundColor white Background of life line in sequence diagrams\r\n" + 
			"sequenceLifeLineBorderColor #A80036 Border of life line in sequence diagrams\r\n" + 
			"sequenceParticipantBackgroundColor #FEFECE Background of participant in sequence diagrams\r\n" + 
			"sequenceParticipantBorderColor #A80036 Border of participant in sequence diagrams\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 104 of 120\r\n" + 
			"12.4 Font color, name and size 12 CHANGING FONTS AND COLORS\r\n" + 
			"12.4 Font color, name and size\r\n" + 
			"You can change the font for the drawing using xxxFontColor, xxxFontSize and xxxFontName\r\n" + 
			"parameters.\r\n" + 
			"Example:\r\n" + 
			"skinparam classFontColor red\r\n" + 
			"skinparam classFontSize 10\r\n" + 
			"skinparam classFontName Aapex\r\n" + 
			"You can also change the default font for all fonts using skinparam defaultFontName.\r\n" + 
			"Example:\r\n" + 
			"skinparam defaultFontName Aapex\r\n" + 
			"Please note the fontname is highly system dependent, so do not over use it, if you look for portability.\r\n" + 
			"Parameter Default Comment\r\n" + 
			"Name Value\r\n" + 
			"activityFontColor black\r\n" + 
			"Used for activity box activityFontSize 14\r\n" + 
			"activityFontStyle plain\r\n" + 
			"activityFontName\r\n" + 
			"activityArrowFontColor black\r\n" + 
			"Used for text on arrows in activity diagrams activityArrowFontSize 13\r\n" + 
			"activityArrowFontStyle plain\r\n" + 
			"activityArrowFontName\r\n" + 
			"circledCharacterFontColor black\r\n" + 
			"Used for text in circle for class, enum and others\r\n" + 
			"circledCharacterFontSize 17\r\n" + 
			"circledCharacterFontStyle bold\r\n" + 
			"circledCharacterFontName Courier\r\n" + 
			"circledCharacterRadius 11\r\n" + 
			"classArrowFontColor black\r\n" + 
			"Used for text on arrows in class diagrams classArrowFontSize 10\r\n" + 
			"classArrowFontStyle plain\r\n" + 
			"classArrowFontName\r\n" + 
			"classAttributeFontColor black\r\n" + 
			"Class attributes and methods classAttributeFontSize 10\r\n" + 
			"classAttributeIconSize 10\r\n" + 
			"classAttributeFontStyle plain\r\n" + 
			"classAttributeFontName\r\n" + 
			"classFontColor black\r\n" + 
			"Used for classes name classFontSize 12\r\n" + 
			"classFontStyle plain\r\n" + 
			"classFontName\r\n" + 
			"classStereotypeFontColor black\r\n" + 
			"Used for stereotype in classes classStereotypeFontSize 12\r\n" + 
			"classStereotypeFontStyle italic\r\n" + 
			"classStereotypeFontName\r\n" + 
			"componentFontColor black\r\n" + 
			"Used for components name componentFontSize 14\r\n" + 
			"componentFontStyle plain\r\n" + 
			"componentFontName\r\n" + 
			"componentStereotypeFontColor black\r\n" + 
			"Used for stereotype in components componentStereotypeFontSize 14\r\n" + 
			"componentStereotypeFontStyle italic\r\n" + 
			"componentStereotypeFontName\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 105 of 120\r\n" + 
			"12.4 Font color, name and size 12 CHANGING FONTS AND COLORS\r\n" + 
			"componentArrowFontColor black\r\n" + 
			"Used for text on arrows in component diagrams componentArrowFontSize 13\r\n" + 
			"componentArrowFontStyle plain\r\n" + 
			"componentArrowFontName\r\n" + 
			"noteFontColor black\r\n" + 
			"Used for notes in all diagrams but sequence diagrams noteFontSize 13\r\n" + 
			"noteFontStyle plain\r\n" + 
			"noteFontName\r\n" + 
			"packageFontColor black\r\n" + 
			"Used for package and partition names packageFontSize 14\r\n" + 
			"packageFontStyle plain\r\n" + 
			"packageFontName\r\n" + 
			"sequenceActorFontColor black\r\n" + 
			"Used for actor in sequence diagrams sequenceActorFontSize 13\r\n" + 
			"sequenceActorFontStyle plain\r\n" + 
			"sequenceActorFontName\r\n" + 
			"sequenceDividerFontColor black\r\n" + 
			"Used for text on dividers in sequence diagrams sequenceDividerFontSize 13\r\n" + 
			"sequenceDividerFontStyle bold\r\n" + 
			"sequenceDividerFontName\r\n" + 
			"sequenceArrowFontColor black\r\n" + 
			"Used for text on arrows in sequence diagrams sequenceArrowFontSize 13\r\n" + 
			"sequenceArrowFontStyle plain\r\n" + 
			"sequenceArrowFontName\r\n" + 
			"sequenceGroupingFontColor black\r\n" + 
			"Used for text for ”else” in sequence diagrams sequenceGroupingFontSize 11\r\n" + 
			"sequenceGroupingFontStyle plain\r\n" + 
			"sequenceGroupingFontName\r\n" + 
			"sequenceGroupingHeaderFontColor black\r\n" + 
			"Used for text for ”alt/opt/loop” headers in sequence diagrams sequenceGroupingHeaderFontSize 13\r\n" + 
			"sequenceGroupingHeaderFontStyle plain\r\n" + 
			"sequenceGroupingHeaderFontName\r\n" + 
			"sequenceParticipantFontColor black\r\n" + 
			"Used for text on participant in sequence diagrams sequenceParticipantFontSize 13\r\n" + 
			"sequenceParticipantFontStyle plain\r\n" + 
			"sequenceParticipantFontName\r\n" + 
			"sequenceTitleFontColor black\r\n" + 
			"Used for titles in sequence diagrams sequenceTitleFontSize 13\r\n" + 
			"sequenceTitleFontStyle plain\r\n" + 
			"sequenceTitleFontName\r\n" + 
			"titleFontColor black\r\n" + 
			"Used for titles in all diagrams but sequence diagrams titleFontSize 18\r\n" + 
			"titleFontStyle plain\r\n" + 
			"titleFontName\r\n" + 
			"stateFontColor black\r\n" + 
			"Used for states in state diagrams stateFontSize 14\r\n" + 
			"stateFontStyle plain\r\n" + 
			"stateFontName\r\n" + 
			"stateArrowFontColor black\r\n" + 
			"Used for text on arrows in state diagrams stateArrowFontSize 13\r\n" + 
			"stateArrowFontStyle plain\r\n" + 
			"stateArrowFontName\r\n" + 
			"stateAttributeFontColor black\r\n" + 
			"Used for states description in state diagrams stateAttributeFontSize 12\r\n" + 
			"stateAttributeFontStyle plain\r\n" + 
			"stateAttributeFontName\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 106 of 120\r\n" + 
			"12.4 Font color, name and size 12 CHANGING FONTS AND COLORS\r\n" + 
			"usecaseFontColor black\r\n" + 
			"Used for usecase labels in usecase diagrams usecaseFontSize 14\r\n" + 
			"usecaseFontStyle plain\r\n" + 
			"usecaseFontName\r\n" + 
			"usecaseStereotypeFontColor black\r\n" + 
			"Used for stereotype in usecase usecaseStereotypeFontSize 14\r\n" + 
			"usecaseStereotypeFontStyle italic\r\n" + 
			"usecaseStereotypeFontName\r\n" + 
			"usecaseActorFontColor black\r\n" + 
			"Used for actor labels in usecase diagrams usecaseActorFontSize 14\r\n" + 
			"usecaseActorFontStyle plain\r\n" + 
			"usecaseActorFontName\r\n" + 
			"usecaseActorStereotypeFontColor black\r\n" + 
			"Used for stereotype for actor usecaseActorStereotypeFontSize 14\r\n" + 
			"usecaseActorStereotypeFontStyle italic\r\n" + 
			"usecaseActorStereotypeFontName\r\n" + 
			"usecaseArrowFontColor black\r\n" + 
			"Used for text on arrows in usecase diagrams usecaseArrowFontSize 13\r\n" + 
			"usecaseArrowFontStyle plain\r\n" + 
			"usecaseArrowFontName\r\n" + 
			"footerFontColor black\r\n" + 
			"Used for footer footerFontSize 10\r\n" + 
			"footerFontStyle plain\r\n" + 
			"footerFontName\r\n" + 
			"headerFontColor black\r\n" + 
			"Used for header headerFontSize 10\r\n" + 
			"headerFontStyle plain\r\n" + 
			"headerFontName\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 107 of 120\r\n" + 
			"12.5 Black and White 12 CHANGING FONTS AND COLORS\r\n" + 
			"12.5 Black and White\r\n" + 
			"You can force the use of a black white output using the skinparam monochrome true command.\r\n" + 
			"@startuml\r\n" + 
			"skinparam monochrome true\r\n" + 
			"actor User\r\n" + 
			"participant \"First Class\" as A\r\n" + 
			"participant \"Second Class\" as B\r\n" + 
			"participant \"Last Class\" as C\r\n" + 
			"User -> A: DoWork\r\n" + 
			"activate A\r\n" + 
			"A -> B: Create Request\r\n" + 
			"activate B\r\n" + 
			"B -> C: DoWork\r\n" + 
			"activate C\r\n" + 
			"C --> B: WorkDone\r\n" + 
			"destroy C\r\n" + 
			"B --> A: Request Created\r\n" + 
			"deactivate B\r\n" + 
			"A --> User: Done\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 108 of 120\r\n" + 
			"13 PREPROCESSING\r\n" + 
			"13 Preprocessing\r\n" + 
			"Some minor preprocessing capabilities are included in PlantUML, and available for all diagrams.\r\n" + 
			"Those functionnalities are very similar to the C language preprocessor, except that the special\r\n" + 
			"character (#) has been changed to the exclamation mark (!).\r\n" + 
			"13.1 Including files\r\n" + 
			"Use the !include directive to include file in your diagram.\r\n" + 
			"Imagine you have the very same class that appears in many diagrams. Instead of duplicating the\r\n" + 
			"description of this class, you can define a file that contains the description.\r\n" + 
			"@startuml\r\n" + 
			"!include List.iuml\r\n" + 
			"List <|.. ArrayList\r\n" + 
			"@enduml\r\n" + 
			"File List.iuml: interface List List : int size() List : void clear()\r\n" + 
			"The file List.iuml can be included in many diagrams, and any modification in this file will change\r\n" + 
			"all diagrams that include it.\r\n" + 
			"You can also put several @startuml/@enduml text block in an included file and then specify which\r\n" + 
			"block you want to include adding !0 where 0 is the block number.\r\n" + 
			"For example, if you use !include foo.txt!1, the second @startuml/@enduml block within foo.txt\r\n" + 
			"will be included.\r\n" + 
			"13.2 Including URL\r\n" + 
			"Use the !includeurl directive to include file from Internet/Intranet in your diagram.\r\n" + 
			"You can also use !includeurl http://someurl.com/mypath!0 to specify which @startuml/@enduml\r\n" + 
			"block from http://someurl.com/mypath you want to include. The !0 notation denotes the first\r\n" + 
			"diagram.\r\n" + 
			"13.3 Constant definition\r\n" + 
			"You can define constant using the !define directive. As in C language, a constant name can only\r\n" + 
			"use alphanumeric and underscore characters, and cannot start with a digit.\r\n" + 
			"@startuml\r\n" + 
			"!define SEQUENCE (S,#AAAAAA) Database Sequence\r\n" + 
			"!define TABLE (T,#FFAAAA) Database Table\r\n" + 
			"class USER << TABLE >>\r\n" + 
			"class ACCOUNT << TABLE >>\r\n" + 
			"class UID << SEQUENCE >>\r\n" + 
			"USER \"1\" -- \"*\" ACCOUNT\r\n" + 
			"USER -> UID\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 109 of 120\r\n" + 
			"13.4 Macro definition 13 PREPROCESSING\r\n" + 
			"Of course, you can use the !include directive to define all your constants in a single file that you\r\n" + 
			"include in your diagram.\r\n" + 
			"Constant can be undefined with the !undef XXX directive.\r\n" + 
			"You can also specify constants within the command line, with the -D flags.\r\n" + 
			"java -jar plantuml.jar -DTITLE=\"My title\" atest1.txt\r\n" + 
			"Note that the -D flag must be put after the ”-jar plantuml.jar” section.\r\n" + 
			"13.4 Macro definition\r\n" + 
			"You can also define macro with arguments.\r\n" + 
			"@startuml\r\n" + 
			"!define module(x) component x <<module>>\r\n" + 
			"module(ABC)\r\n" + 
			"module(XYZ)\r\n" + 
			"@enduml\r\n" + 
			"Macro can have several arguments.\r\n" + 
			"@startuml\r\n" + 
			"!define send(a,b,c) a->b : c\r\n" + 
			"send(Alice, Bob, Hello)\r\n" + 
			"send(Bob, Alice, ok)\r\n" + 
			"@enduml\r\n" + 
			"13.5 Macro on several lines\r\n" + 
			"You can also define macro on several lines using !definelong and !enddefinelong.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 110 of 120\r\n" + 
			"13.6 Conditions 13 PREPROCESSING\r\n" + 
			"@startuml\r\n" + 
			"!define DOUBLE(x) x x\r\n" + 
			"!definelong AUTHEN(x,y)\r\n" + 
			"x -> y : DOUBLE(hello)\r\n" + 
			"y -> x : ok\r\n" + 
			"!enddefinelong\r\n" + 
			"AUTHEN(Bob,Alice)\r\n" + 
			"@enduml\r\n" + 
			"13.6 Conditions\r\n" + 
			"You can use !ifdef XXX and !endif directives to have conditionnal drawings.\r\n" + 
			"The lines between those two directives will be included only if the constant after the !ifdef directive\r\n" + 
			"has been defined before.\r\n" + 
			"You can also provide a !else part which will be included if the constant has not been defined.\r\n" + 
			"@startuml\r\n" + 
			"!include ArrayList.iuml\r\n" + 
			"@enduml\r\n" + 
			"File ArrayList.iuml:\r\n" + 
			"class ArrayList\r\n" + 
			"!ifdef SHOW_METHODS\r\n" + 
			"ArrayList : int size()\r\n" + 
			"ArrayList : void clear()\r\n" + 
			"!endif\r\n" + 
			"You can then use the !define directive to activate the conditionnal part of the diagram.\r\n" + 
			"@startuml\r\n" + 
			"!define SHOW_METHODS\r\n" + 
			"!include ArrayList.iuml\r\n" + 
			"@enduml\r\n" + 
			"You can also use the !ifndef directive that includes lines if the provided constant has NOT been\r\n" + 
			"defined.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 111 of 120\r\n" + 
			"13.7 Search path 13 PREPROCESSING\r\n" + 
			"13.7 Search path\r\n" + 
			"You can specify the java property ”plantuml.include.path” in the command line.\r\n" + 
			"For example:\r\n" + 
			"java -Dplantuml.include.path=\"c:/mydir\" -jar plantuml.jar atest1.txt\r\n" + 
			"Note the this -D option has to put before the -jar option. -D options after the -jar option will be\r\n" + 
			"used to define constants within plantuml preprocessor.\r\n" + 
			"13.8 Advanced features\r\n" + 
			"It is possible to append text to a macro argument using the ## syntax.\r\n" + 
			"@startuml\r\n" + 
			"!definelong COMP_TEXTGENCOMP(name)\r\n" + 
			"[name] << Comp >>\r\n" + 
			"interface Ifc << IfcType >> AS name##Ifc\r\n" + 
			"name##Ifc - [name]\r\n" + 
			"!enddefinelong\r\n" + 
			"COMP_TEXTGENCOMP(dummy)\r\n" + 
			"@enduml\r\n" + 
			"A macro can be defined by another macro.\r\n" + 
			"@startuml\r\n" + 
			"!define DOUBLE(x) x x\r\n" + 
			"!definelong AUTHEN(x,y)\r\n" + 
			"x -> y : DOUBLE(hello)\r\n" + 
			"y -> x : ok\r\n" + 
			"!enddefinelong\r\n" + 
			"AUTHEN(Bob,Alice)\r\n" + 
			"@enduml\r\n" + 
			"A macro can be polymorphic with argument count.\r\n" + 
			"@startuml\r\n" + 
			"!define module(x) component x <<module>>\r\n" + 
			"!define module(x,y) component x as y <<module>>\r\n" + 
			"module(foo)\r\n" + 
			"module(bar, barcode)\r\n" + 
			"@enduml\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 112 of 120\r\n" + 
			"13.8 Advanced features 13 PREPROCESSING\r\n" + 
			"You can use system environment variable or constant definition when using include:\r\n" + 
			"!include %windir%/test1.txt\r\n" + 
			"!define PLANTUML_HOME /home/foo\r\n" + 
			"!include PLANTUML_HOME/test1.txt\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 113 of 120\r\n" + 
			"14 INTERNATIONALIZATION\r\n" + 
			"14 Internationalization\r\n" + 
			"The PlantUML language use letters to define actor, usecase and so on. But letters are not only A-Z\r\n" + 
			"latin characters, it could be any kind of letter from any language.\r\n" + 
			"@startuml\r\n" + 
			"skinparam backgroundColor #EEEBDC\r\n" + 
			"actor ???\r\n" + 
			"participant \" ??? \" as A\r\n" + 
			"participant \" ??? \" as B\r\n" + 
			"participant \" ?? ?? ? \" as ????\r\n" + 
			"??? -> A: ? ? ? ? ? ?\r\n" + 
			"activate A\r\n" + 
			"A -> B: ????\r\n" + 
			"activate B\r\n" + 
			"B -> ???? : ????\r\n" + 
			"activate ????\r\n" + 
			"???? --> B: ? ? ? ? ? ?\r\n" + 
			"destroy ????\r\n" + 
			"B --> A: ????\r\n" + 
			"deactivate B\r\n" + 
			"A --> ??? : ??\r\n" + 
			"deactivate A\r\n" + 
			"@enduml\r\n" + 
			"14.1 Charset\r\n" + 
			"The default charset used when reading the text files containing the UML text description is system\r\n" + 
			"dependent. Normally, it should just be fine, but in some case, you may want to the use another\r\n" + 
			"charset. For example, with the command line:\r\n" + 
			"java -jar plantuml.jar -charset UTF-8 files.txt\r\n" + 
			"Or, with the ant task:\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 114 of 120\r\n" + 
			"14.1 Charset 14 INTERNATIONALIZATION\r\n" + 
			"<target name=\"main\">\r\n" + 
			"<plantuml dir=\"./src\" charset=\"UTF-8\" />\r\n" + 
			"</target>\r\n" + 
			"Depending of your Java installation, the following charset should be available: ISO-8859-1, UTF-8,\r\n" + 
			"UTF-16BE, UTF-16LE, UTF-16.\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 115 of 120\r\n" + 
			"15 COLOR NAMES\r\n" + 
			"15 Color Names\r\n" + 
			"Here is the list of colors recognized by PlantUML. Note that color names are case insensitive.\r\n" + 
			"AliceBlue GhostWhite NavajoWhite\r\n" + 
			"AntiqueWhite GoldenRod Navy\r\n" + 
			"Aquamarine Gold OldLace\r\n" + 
			"Aqua Gray OliveDrab\r\n" + 
			"Azure GreenYellow Olive\r\n" + 
			"Beige Green OrangeRed\r\n" + 
			"Bisque HoneyDew Orange\r\n" + 
			"Black HotPink Orchid\r\n" + 
			"BlanchedAlmond IndianRed PaleGoldenRod\r\n" + 
			"BlueViolet Indigo PaleGreen\r\n" + 
			"Blue Ivory PaleTurquoise\r\n" + 
			"Brown Khaki PaleVioletRed\r\n" + 
			"BurlyWood LavenderBlush PapayaWhip\r\n" + 
			"CadetBlue Lavender PeachPuff\r\n" + 
			"Chartreuse LawnGreen Peru\r\n" + 
			"Chocolate LemonChiffon Pink\r\n" + 
			"Coral LightBlue Plum\r\n" + 
			"CornflowerBlue LightCoral PowderBlue\r\n" + 
			"Cornsilk LightCyan Purple\r\n" + 
			"Crimson LightGoldenRodYellow Red\r\n" + 
			"Cyan LightGreen RosyBrown\r\n" + 
			"DarkBlue LightGray RoyalBlue\r\n" + 
			"DarkCyan LightPink SaddleBrown\r\n" + 
			"DarkGoldenRod LightSalmon Salmon\r\n" + 
			"DarkGray LightSeaGreen SandyBrown\r\n" + 
			"DarkGreen LightSkyBlue SeaGreen\r\n" + 
			"DarkKhaki LightSlateGray SeaShell\r\n" + 
			"DarkMagenta LightSteelBlue Sienna\r\n" + 
			"DarkOliveGreen LightYellow Silver\r\n" + 
			"DarkOrchid LimeGreen SkyBlue\r\n" + 
			"DarkRed Lime SlateBlue\r\n" + 
			"DarkSalmon Linen SlateGray\r\n" + 
			"DarkSeaGreen Magenta Snow\r\n" + 
			"DarkSlateBlue Maroon SpringGreen\r\n" + 
			"DarkSlateGray MediumAquaMarine SteelBlue\r\n" + 
			"DarkTurquoise MediumBlue Tan\r\n" + 
			"DarkViolet MediumOrchid Teal\r\n" + 
			"Darkorange MediumPurple Thistle\r\n" + 
			"DeepPink MediumSeaGreen Tomato\r\n" + 
			"DeepSkyBlue MediumSlateBlue Turquoise\r\n" + 
			"DimGray MediumSpringGreen Violet\r\n" + 
			"DodgerBlue MediumTurquoise Wheat\r\n" + 
			"FireBrick MediumVioletRed WhiteSmoke\r\n" + 
			"FloralWhite MidnightBlue White\r\n" + 
			"ForestGreen MintCream YellowGreen\r\n" + 
			"Fuchsia MistyRose Yellow\r\n" + 
			"Gainsboro Moccasin\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 116 of 120\r\n" + 
			"CONTENTS CONTENTS\r\n" + 
			"Contents\r\n" + 
			"1 Sequence Diagram 1\r\n" + 
			"1.1 Basic examples . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 1\r\n" + 
			"1.2 Comments . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 1\r\n" + 
			"1.3 Declaring participant . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 1\r\n" + 
			"1.4 Use non-letters in participants . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 2\r\n" + 
			"1.5 Message to Self . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 3\r\n" + 
			"1.6 Change arrow style . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 3\r\n" + 
			"1.7 Change arrow color . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 4\r\n" + 
			"1.8 Message sequence numbering . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 4\r\n" + 
			"1.9 Title . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 5\r\n" + 
			"1.10 Legend the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 6\r\n" + 
			"1.11 Splitting diagrams . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 6\r\n" + 
			"1.12 Grouping message . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 7\r\n" + 
			"1.13 Notes on messages . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 8\r\n" + 
			"1.14 Some other notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 9\r\n" + 
			"1.15 Changing notes shape . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 10\r\n" + 
			"1.16 Creole and HTML . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 10\r\n" + 
			"1.17 Divider . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 11\r\n" + 
			"1.18 Reference . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 12\r\n" + 
			"1.19 Delay . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 12\r\n" + 
			"1.20 Space . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 13\r\n" + 
			"1.21 Lifeline Activation and Destruction . . . . . . . . . . . . . . . . . . . . . . . . . . . . 13\r\n" + 
			"1.22 Participant creation . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 14\r\n" + 
			"1.23 Incoming and outgoing messages . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 15\r\n" + 
			"1.24 Stereotypes and Spots . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 16\r\n" + 
			"1.25 More information on titles . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 17\r\n" + 
			"1.26 Participants encompass . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 18\r\n" + 
			"1.27 Removing Footer . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 19\r\n" + 
			"1.28 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 19\r\n" + 
			"2 Use Case Diagram 21\r\n" + 
			"2.1 Usecases . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 21\r\n" + 
			"2.2 Actors . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 21\r\n" + 
			"2.3 Usecases description . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 21\r\n" + 
			"2.4 Basic example . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 22\r\n" + 
			"2.5 Extension . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 23\r\n" + 
			"2.6 Using notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 23\r\n" + 
			"2.7 Stereotypes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 24\r\n" + 
			"2.8 Changing arrows direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 24\r\n" + 
			"2.9 Title the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 26\r\n" + 
			"2.10 Splitting diagrams . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 26\r\n" + 
			"2.11 Left to right direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 26\r\n" + 
			"2.12 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 27\r\n" + 
			"2.13 Complete example . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 28\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 117 of 120\r\n" + 
			"CONTENTS CONTENTS\r\n" + 
			"3 Class Diagram 29\r\n" + 
			"3.1 Relations between classes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 29\r\n" + 
			"3.2 Label on relations . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 29\r\n" + 
			"3.3 Adding methods . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 31\r\n" + 
			"3.4 Defining visibility . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 32\r\n" + 
			"3.5 Abstract and Static . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 33\r\n" + 
			"3.6 Advanced class body . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 34\r\n" + 
			"3.7 Notes and stereotypes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 35\r\n" + 
			"3.8 More on notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 36\r\n" + 
			"3.9 Note on links . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 37\r\n" + 
			"3.10 Abstract class and interface . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 38\r\n" + 
			"3.11 Using non-letters . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 39\r\n" + 
			"3.12 Hide attributes, methods... . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 40\r\n" + 
			"3.13 Hide classes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 41\r\n" + 
			"3.14 Use generics . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 41\r\n" + 
			"3.15 Specific Spot . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 41\r\n" + 
			"3.16 Packages . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 42\r\n" + 
			"3.17 Packages style . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 42\r\n" + 
			"3.18 Namespaces . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 43\r\n" + 
			"3.19 Automatic namespace creation . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 44\r\n" + 
			"3.20 Lollipop interface . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 45\r\n" + 
			"3.21 Changing arrows direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 45\r\n" + 
			"3.22 Title the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 46\r\n" + 
			"3.23 Legend the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 46\r\n" + 
			"3.24 Association classes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 47\r\n" + 
			"3.25 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 48\r\n" + 
			"3.26 Skinned Stereotypes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 48\r\n" + 
			"3.27 Color gradient . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 49\r\n" + 
			"3.28 Splitting large files . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 50\r\n" + 
			"4 Activity Diagram 52\r\n" + 
			"4.1 Simple Activity . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 52\r\n" + 
			"4.2 Label on arrows . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 52\r\n" + 
			"4.3 Changing arrow direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 52\r\n" + 
			"4.4 Branches . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 53\r\n" + 
			"4.5 More on Branches . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 54\r\n" + 
			"4.6 Synchronization . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 55\r\n" + 
			"4.7 Long activity description . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 56\r\n" + 
			"4.8 Notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 56\r\n" + 
			"4.9 Partition . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 57\r\n" + 
			"4.10 Title the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 58\r\n" + 
			"4.11 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 59\r\n" + 
			"4.12 Octagon . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 59\r\n" + 
			"4.13 Complete example . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 60\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 118 of 120\r\n" + 
			"CONTENTS CONTENTS\r\n" + 
			"5 Activity Diagram (beta) 63\r\n" + 
			"5.1 Simple Activity . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 63\r\n" + 
			"5.2 Start/Stop . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 63\r\n" + 
			"5.3 Conditional . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 64\r\n" + 
			"5.4 Repeat loop . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 65\r\n" + 
			"5.5 While loop . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 65\r\n" + 
			"5.6 Parallel processing . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 66\r\n" + 
			"5.7 Notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 66\r\n" + 
			"5.8 Title Legend . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 67\r\n" + 
			"5.9 Colors . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 68\r\n" + 
			"5.10 Arrows . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 68\r\n" + 
			"5.11 Grouping . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 69\r\n" + 
			"5.12 Swimlanes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 70\r\n" + 
			"5.13 Detach . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 70\r\n" + 
			"5.14 SDL . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 71\r\n" + 
			"5.15 Complete example . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 72\r\n" + 
			"6 Component Diagram 74\r\n" + 
			"6.1 Components . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 74\r\n" + 
			"6.2 Interfaces . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 74\r\n" + 
			"6.3 Basic example . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 74\r\n" + 
			"6.4 Using notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 75\r\n" + 
			"6.5 Grouping Components . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 75\r\n" + 
			"6.6 Changing arrows direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 77\r\n" + 
			"6.7 Title the diagram . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 78\r\n" + 
			"6.8 Use UML2 notation . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 78\r\n" + 
			"6.9 Individual colors . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 78\r\n" + 
			"6.10 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 79\r\n" + 
			"7 State Diagram 81\r\n" + 
			"7.1 Simple State . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 81\r\n" + 
			"7.2 Composite state . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 81\r\n" + 
			"7.3 Long name . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 82\r\n" + 
			"7.4 Concurrent state . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 83\r\n" + 
			"7.5 Arrow direction . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 84\r\n" + 
			"7.6 Note . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 85\r\n" + 
			"7.7 More in notes . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 86\r\n" + 
			"7.8 Skinparam . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 86\r\n" + 
			"8 Object Diagram 88\r\n" + 
			"8.1 Definition of objects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 88\r\n" + 
			"8.2 Relations between objects . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 88\r\n" + 
			"8.3 Adding fields . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 88\r\n" + 
			"8.4 Common features with class diagrams . . . . . . . . . . . . . . . . . . . . . . . . . . 89\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 119 of 120\r\n" + 
			"CONTENTS CONTENTS\r\n" + 
			"9 Common commands 90\r\n" + 
			"9.1 Footer and header . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 90\r\n" + 
			"9.2 Zoom . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 90\r\n" + 
			"10 Salt 91\r\n" + 
			"10.1 Basic widgets . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 91\r\n" + 
			"10.2 Using grid . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 91\r\n" + 
			"10.3 Using separator . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 92\r\n" + 
			"10.4 Tree widget . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 92\r\n" + 
			"10.5 Enclosing brackets . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 93\r\n" + 
			"10.6 Adding tabs . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 93\r\n" + 
			"10.7 Using menu . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 94\r\n" + 
			"10.8 Advanced table . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 95\r\n" + 
			"11 Creole 96\r\n" + 
			"11.1 Emphasized text . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 96\r\n" + 
			"11.2 List . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 96\r\n" + 
			"11.3 Escape character . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 97\r\n" + 
			"11.4 Horizontal lines . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 97\r\n" + 
			"11.5 Headings . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 98\r\n" + 
			"11.6 Legacy HTML . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 98\r\n" + 
			"11.7 Table . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 99\r\n" + 
			"11.8 OpenIconic . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 99\r\n" + 
			"11.9 Defining and using sprites . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 101\r\n" + 
			"11.10Encoding Sprite . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 101\r\n" + 
			"11.11Importing Sprite . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 101\r\n" + 
			"11.12Examples . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 101\r\n" + 
			"12 Changing fonts and colors 103\r\n" + 
			"12.1 Usage . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 103\r\n" + 
			"12.2 Nested . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 103\r\n" + 
			"12.3 Color . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 104\r\n" + 
			"12.4 Font color, name and size . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 105\r\n" + 
			"12.5 Black and White . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 108\r\n" + 
			"13 Preprocessing 109\r\n" + 
			"13.1 Including files . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 109\r\n" + 
			"13.2 Including URL . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 109\r\n" + 
			"13.3 Constant definition . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 109\r\n" + 
			"13.4 Macro definition . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 110\r\n" + 
			"13.5 Macro on several lines . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 110\r\n" + 
			"13.6 Conditions . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 111\r\n" + 
			"13.7 Search path . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 112\r\n" + 
			"13.8 Advanced features . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 112\r\n" + 
			"14 Internationalization 114\r\n" + 
			"14.1 Charset . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 114\r\n" + 
			"15 Color Names 116\r\n" + 
			"PlantUML Language Reference Guide (Version 8023) 120 of 120"; 

}
