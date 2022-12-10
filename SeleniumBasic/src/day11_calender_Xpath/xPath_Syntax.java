package day11_calender_Xpath;


public class xPath_Syntax {
//	Xpath:
//		XML--> its used to store data ---> form node ---> present in XML tree --->path of the node in xml tree is known as xpath
//		HTML--> Xpath also support HTML
//
//		Xpath -->	
//				1. Absolute xpath --> starting from root till the target element
//				2. Relative xpath --> starting from anywhere till the target element
//				
//		Absolute Xpath Examples: vtiger:
//		/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[1]/input
//		html>body>div:nth-of-type(1)>div:nth-of-type(3)>div:nth-of-type(1)>div>div:nth-of-type(2)>form>div:nth-of-type(1)>input
//
//		Google:
//		/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
//		html>body>div:nth-of-type(1)>div:nth-of-type(3)>form>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div>div:nth-of-type(2)>input
//
//		Relative xpath Examples:
//		/html/body/div/div/div/div/div/div/form/div/input
//			//or
//		/html/body//div[1]/div/div[2]/form/div[1]/input
//		//form/div/input
//		/html/body//form/div/input
//		/html//form/div/input
//
//		Google:
//		/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
//		/html/body/div[1]//div[1]/div[1]/div/div[2]/input
//
//		Xpath by Attribute:
//		//htmltag[@AN='AV']
//
//		<input maxlength="10" name="UserName" type="text">
//		//input[@name='Username']
//		//input[@type='text']
//
//		<input type="text" value="" class="_3704LK" title="Search for products, brands and more" name="q" autocomplete="off" placeholder="Search for products, brands and more">
//
//		//input[@type='text'] //or
//		//input[@class='']
//		//input[@title='']
//		//input[@name='']
//		//input[@placeholder='']
//			   
//		**When we want to identify the element using more than one attribute
//		//htmltag[@PN='PV' or @PN='PV']
//		//input[@name='username' or @type='text']
//		//htmltag[@PN='PV' and @PN='PV']
//		//input[@name='username' and @type='text']
//
//		Syntax#1:
//		//htmltag[@PN='PV']
//
//		Example1:
//		HTML Code:
//		<input id="username" type="text" name="username" placeholder="Username">
//
//		Expressions:
//		//input[@id='username']		//or
//		//input[@type='text']		//or
//		//input[@name='username']	//or
//		//input[@placeholder='Username']
//
//		Example2:
//		<a href="https://www.google.com">Go To Google</a>
//
//		Expressions:
//		//a[@href='https://www.google.com']
//
//
//		Syntax#2:
//		//htmltag[text()='InnerText']
//
//		Example2:
//		<a href="https://www.google.com">Go To Google</a>
//
//		Expressions:
//		//a[text()='Go To Google']
//
//
//
//		Syntax#3:
//		//htmltag[contains(arg1,arg2)]
//
//		where: arg1---> source, i.e: it can be any attribute followed by '@' or
//						text() without '@'
//			   arg2---> target String(innert text/ attribute value)
//
//		Example1:
//		<a href="https://www.google.com">  Go To Google  </a>
//
//		Expressions:
//		//a[contains(text(),'Go To Google')]
//		//a[contains(text(),'Go')]
//		//a[contains(text(),'To')]
//		//a[contains(text(),'Go To')]
//		//a[contains(text(),'To Google')]
//		//a[contains(text(),'Google')]
//
//
//		Example2:
//		<div class="ab_LoginPage" id="demo123"></div>
//									 "432demo"
//									 "abc_demo_87"
//									 
//		Expressions:
//		//div[contains(@id,'demo')]							 
//
//
//		Syntax#4:
//		//*[@PN='PV'] 	//or
//		//htmltag[@*='PV']		//or
//		//*[@*='PV']
//
//		example:
//		<input class="input--style-5" type="text" id="fname" name="first_name">
//
//		//*[@name='first_name']
//
//		//*[@id='fname']
//
//		//input[@*='first_name']
//
//		//*[@*='first_name']
//		 
//		Syntax#5  
//		//htmltag[starts-with(arg1,arg2)]
//		where: 
//		arg1: source i.e: indicate any attribute preceded by '@' 
//				or text()
//		arg2: target string
//
//		Example1:
//		HTML code:
//		<input type="text" class="inputtext_256">
//						   class="inputtext_avf"
//						   class="inputtext_1rg3"
//		xpath expression:
//		//input[starts-with(@class,'inputtext')]
//
//		Example2:
//		<a href="/pages/greetingmsg">Good Morning XYZ</a>
//									 Good Noon XYZ
//									 Good Afternoon XYZ
//									 Good Evening XYZ
//		xpath expression:
//		//a[starts-with(text(),'Good')]
//
//
//		Syntax#6
//		//htmltag[@AN='AV' OR @AN='AV' OR text()='innertext'...]
//		//htmltag[@AN='AV' AND @AN='AV' and text()='innertext'...]
//
//		Example1: 
//		HTML code:
//		<input type="text" class="inputtext" name="firstname">
//		<input type="text" class="inputtext" name="firstname">
//
//		Xpath expression:
//		//input[@type='text' and @name='firstname']
//
//
//		Example2: 
//		HTML code:
//		<a href="/pages/create/registration_form">Create a Page</a>
//		<a href="/pages/create/registration_form">Upload a Page</a>
//
//		Xpath expression:
//		//a[@href='/pages/create/registration_form'] --->2
//
//		//a[@href='/pages/create/registration_form' and text()='Create a Page']
//
//
//
//		Syntax#7 following and preceding
//		//xpathofrequiredparentobject//following::xpathofrequiredchildobject
//
//		example:
//		//input[@name='email']//following::input
//
//		//input[@name='email']//following::input[@name='firstname']
//
//		Syntax:
//		//xpathofrequiredobject//preceding::xpathofrequiredparentobject
//
//		//input[@name='firstname']//preceding::input
//
//		//input[@name='firstname']//preceding::input[@name='email']
//
//		Syntax#8following-sibling and preceding-sibling
//		//xpathofrequiredparentobject//following-sibling::xpathofdirectchildobject
//
//		//xpathofrequiredobject//preceding-sibling::xpathofimmediateparentobject
//
//		Example: for following-sibling
//		//input[@id='check']//following::input 	-5matchings
//		1.login btn ---->input tag
//		2. cancel btn --->input tag
//		3. Remember checkbox ---> input tag
//		4. Forgot btn ---> input tag
//		5. SignUp btn ---> input tag
//
//		//input[@id='check']//following-sibling::input 	-2matchings
//		1.login btn
//		2. cancel btn
//
//
//		Example: for preceding-sibling
//		//input[@value='Sign Up']//preceding::input 	-5matchings
//		1.login btn ---->input tag
//		2. cancel btn --->input tag
//		3. Remember checkbox ---> input tag
//		4. Forgot btn ---> input tag
//		5. SignUp btn ---> input tag
//
//		//input[@value='Sign Up']//preceding-sibling::input 	-1matchings
//		1.Forgot btn
//
//
//		Syntax#9 child
//
//		//xpathofrequiredparentobject//child::xpathofrequiredchildobject
//
//		Example1: from GSMArena
//		//div[contains(@class,'brandmenu-v2')]/ul//child::a
//				//or for specific child
//		//div[contains(@class,'brandmenu-v2')]/ul//child::a[text()='Samsung']
//
//
//
//		Syntax#10 parent
//
//		//xpathofrequiredobject//parent::xpathofrequiredprenetobject
//
//		Example1: from vtiger login page
//
//		//input[@id="username"]//parent::div//child::label
//
//
//		Syntax#11: normalize-space
//
//		//htmltag[normalize-space(args)='String']
//
//		where: args- can be any funtion of xpath or any attribute(@)
//
//		example: from dummy page
//		//a[normalize-space(text())='LinkAsText']
//
//
//		Syntax#12: Dependent & independent
//
//
//

//				select.selectByVisibleText("textVisibleOntheScreen");
//						//or
//				select.selectByValue("string");
//						//or
//				select.selectByIndex(indexnumber);
//				
//				select.getFirstSelectedOption()----->returns WebElement
//				
//		List<WebElement> options=select.getOptions()----->returns List<WebElement>
//				
//				use size() to get the count of options
//				int count=options.size()
//				
//				
//				use get(index) to get specific WebElement from list
//				options.get(0)
//				
//				to retrive the text from webElement use getText()
//				options.get(0).getText()
//				
//}
//public class xPath_Syntax {
//	Xpath:
//		XML--> its used to store data ---> form node ---> present in XML tree --->path of the node in xml tree is known as xpath
//		HTML--> Xpath also support HTML
//
//		Xpath -->	
//				1. Absolute xpath --> starting from root till the target element
//				2. Relative xpath --> starting from anywhere till the target element
//				
//		Absolute Xpath Examples: vtiger:
//		/html/body/div[1]/div[3]/div[1]/div/div[2]/form/div[1]/input
//		html>body>div:nth-of-type(1)>div:nth-of-type(3)>div:nth-of-type(1)>div>div:nth-of-type(2)>form>div:nth-of-type(1)>input
//
//		Google:
//		/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
//		html>body>div:nth-of-type(1)>div:nth-of-type(3)>form>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div>div:nth-of-type(2)>input
//
//		Relative xpath Examples:
//		/html/body/div/div/div/div/div/div/form/div/input
//			//or
//		/html/body//div[1]/div/div[2]/form/div[1]/input
//		//form/div/input
//		/html/body//form/div/input
//		/html//form/div/input
//
//		Google:
//		/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
//		/html/body/div[1]//div[1]/div[1]/div/div[2]/input
//
//		Xpath by Attribute:
//		//htmltag[@AN='AV']
//
//		<input maxlength="10" name="UserName" type="text">
//		//input[@name='Username']
//		//input[@type='text']
//
//		<input type="text" value="" class="_3704LK" title="Search for products, brands and more" name="q" autocomplete="off" placeholder="Search for products, brands and more">
//
//		//input[@type='text'] //or
//		//input[@class='']
//		//input[@title='']
//		//input[@name='']
//		//input[@placeholder='']
//			   
//		**When we want to identify the element using more than one attribute
//		//htmltag[@PN='PV' or @PN='PV']
//		//input[@name='username' or @type='text']
//		//htmltag[@PN='PV' and @PN='PV']
//		//input[@name='username' and @type='text']
//
//		Syntax#1:
//		//htmltag[@PN='PV']
//
//		Example1:
//		HTML Code:
//		<input id="username" type="text" name="username" placeholder="Username">
//
//		Expressions:
//		//input[@id='username']		//or
//		//input[@type='text']		//or
//		//input[@name='username']	//or
//		//input[@placeholder='Username']
//
//		Example2:
//		<a href="https://www.google.com">Go To Google</a>
//
//		Expressions:
//		//a[@href='https://www.google.com']
//
//
//		Syntax#2:
//		//htmltag[text()='InnerText']
//
//		Example2:
//		<a href="https://www.google.com">Go To Google</a>
//
//		Expressions:
//		//a[text()='Go To Google']
//
//
//
//		Syntax#3:
//		//htmltag[contains(arg1,arg2)]
//
//		where: arg1---> source, i.e: it can be any attribute followed by '@' or
//						text() without '@'
//			   arg2---> target String(innert text/ attribute value)
//
//		Example1:
//		<a href="https://www.google.com">  Go To Google  </a>
//
//		Expressions:
//		//a[contains(text(),'Go To Google')]
//		//a[contains(text(),'Go')]
//		//a[contains(text(),'To')]
//		//a[contains(text(),'Go To')]
//		//a[contains(text(),'To Google')]
//		//a[contains(text(),'Google')]
//
//
//		Example2:
//		<div class="ab_LoginPage" id="demo123"></div>
//									 "432demo"
//									 "abc_demo_87"
//									 
//		Expressions:
//		//div[contains(@id,'demo')]							 
//
//
//		Syntax#4:
//		//*[@PN='PV'] 	//or
//		//htmltag[@*='PV']		//or
//		//*[@*='PV']
//
//		example:
//		<input class="input--style-5" type="text" id="fname" name="first_name">
//
//		//*[@name='first_name']
//
//		//*[@id='fname']
//
//		//input[@*='first_name']
//
//		//*[@*='first_name']
//		 
//		Syntax#5  
//		//htmltag[starts-with(arg1,arg2)]
//		where: 
//		arg1: source i.e: indicate any attribute preceded by '@' 
//				or text()
//		arg2: target string
//
//		Example1:
//		HTML code:
//		<input type="text" class="inputtext_256">
//						   class="inputtext_avf"
//						   class="inputtext_1rg3"
//		xpath expression:
//		//input[starts-with(@class,'inputtext')]
//
//		Example2:
//		<a href="/pages/greetingmsg">Good Morning XYZ</a>
//									 Good Noon XYZ
//									 Good Afternoon XYZ
//									 Good Evening XYZ
//		xpath expression:
//		//a[starts-with(text(),'Good')]
//
//
//		Syntax#6
//		//htmltag[@AN='AV' OR @AN='AV' OR text()='innertext'...]
//		//htmltag[@AN='AV' AND @AN='AV' and text()='innertext'...]
//
//		Example1: 
//		HTML code:
//		<input type="text" class="inputtext" name="firstname">
//		<input type="text" class="inputtext" name="firstname">
//
//		Xpath expression:
//		//input[@type='text' and @name='firstname']
//
//
//		Example2: 
//		HTML code:
//		<a href="/pages/create/registration_form">Create a Page</a>
//		<a href="/pages/create/registration_form">Upload a Page</a>
//
//		Xpath expression:
//		//a[@href='/pages/create/registration_form'] --->2
//
//		//a[@href='/pages/create/registration_form' and text()='Create a Page']
//
//
//
//		Syntax#7 following and preceding
//		//xpathofrequiredparentobject//following::xpathofrequiredchildobject
//
//		example:
//		//input[@name='email']//following::input
//
//		//input[@name='email']//following::input[@name='firstname']
//
//		Syntax:
//		//xpathofrequiredobject//preceding::xpathofrequiredparentobject
//
//		//input[@name='firstname']//preceding::input
//
//		//input[@name='firstname']//preceding::input[@name='email']
//
//		Syntax#8following-sibling and preceding-sibling
//		//xpathofrequiredparentobject//following-sibling::xpathofdirectchildobject
//
//		//xpathofrequiredobject//preceding-sibling::xpathofimmediateparentobject
//
//		Example: for following-sibling
//		//input[@id='check']//following::input 	-5matchings
//		1.login btn ---->input tag
//		2. cancel btn --->input tag
//		3. Remember checkbox ---> input tag
//		4. Forgot btn ---> input tag
//		5. SignUp btn ---> input tag
//
//		//input[@id='check']//following-sibling::input 	-2matchings
//		1.login btn
//		2. cancel btn
//
//
//		Example: for preceding-sibling
//		//input[@value='Sign Up']//preceding::input 	-5matchings
//		1.login btn ---->input tag
//		2. cancel btn --->input tag
//		3. Remember checkbox ---> input tag
//		4. Forgot btn ---> input tag
//		5. SignUp btn ---> input tag
//
//		//input[@value='Sign Up']//preceding-sibling::input 	-1matchings
//		1.Forgot btn
//
//
//		Syntax#9 child
//
//		//xpathofrequiredparentobject//child::xpathofrequiredchildobject
//
//		Example1: from GSMArena
//		//div[contains(@class,'brandmenu-v2')]/ul//child::a
//				//or for specific child
//		//div[contains(@class,'brandmenu-v2')]/ul//child::a[text()='Samsung']
//
//
//
//		Syntax#10 parent
//
//		//xpathofrequiredobject//parent::xpathofrequiredprenetobject
//
//		Example1: from vtiger login page
//
//		//input[@id="username"]//parent::div//child::label
//
//
//		Syntax#11: normalize-space
//
//		//htmltag[normalize-space(args)='String']
//
//		where: args- can be any funtion of xpath or any attribute(@)
//
//		example: from dummy page
//		//a[normalize-space(text())='LinkAsText']
//
//
//		Syntax#12: Dependent & independent
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//				select.selectByVisibleText("textVisibleOntheScreen");
//						//or
//				select.selectByValue("string");
//						//or
//				select.selectByIndex(indexnumber);
//				
//				select.getFirstSelectedOption()----->returns WebElement
//				
//		List<WebElement> options=select.getOptions()----->returns List<WebElement>
//				
//				use size() to get the count of options
//				int count=options.size()
//				
//				
//				use get(index) to get specific WebElement from list
//				options.get(0)
//				
//				to retrive the text from webElement use getText()
//				options.get(0).getText()
				























}
