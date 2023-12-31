import java.util.*;
class colour
{
	
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String purple = "\u001B[35m";
	static String skblue = "\u001B[36m";
	static String orange="\u001B[38;5;202m";
	static String bold="\033[0;1m";
}
class flights extends colour
{
	static Scanner sc=new Scanner(System.in);
	//System.out.print(colour.blue);
	static String USER_ID = "User123";
	private String PASSWORD = "Welcome@123"; 
	static String userId;
	private String passWord;
	String MOBILE;
	String EMAIL;
	String DEPARTURE;
	String DESTINATION;
	int dd;
	int mm;
	int yyyy;
	int passengers;
	int journey;
	int space;
	int DD;
	int MM;
	int YYYY;
	int trip;
	int c;
	int d;
	int ar_time;
	int de_time;
	int AR_TIME;
	int DE_TIME;
	String contact;
	String fclass;
	double total_fare;
	static
	{
	    System.out.println("\n\n\n");
		System.out.println(bold+"\u001B[5m"+orange+"   	                                         * *          "+bold+def+"\u001B[5m"+"* * * * * *  "+bold+"\u001B[5m"+green+"     * * * * * *                    ");
		System.out.println(bold+"\u001B[5m"+orange+" 	                                        * * *         "+bold+def+"\u001B[5m"+"* * * * * *  "+bold+"\u001B[5m"+green+"     * * * * * *                     ");
		System.out.println(bold+"\u001B[5m"+orange+" 	                                       * * * *        "+bold+def+"\u001B[5m"+"    * *      "+bold+"\u001B[5m"+green+"     * *    * *                      ");
		System.out.println(bold+"\u001B[5m"+orange+"	                                      * *   * *       "+bold+def+"\u001B[5m"+"    * *      "+bold+"\u001B[5m"+green+"     * * * * *                       ");
		System.out.println(bold+"\u001B[5m"+orange+"	                                     * * * * * *      "+bold+def+"\u001B[5m"+"    * *      "+bold+"\u001B[5m"+green+"     * * * * *                       ");
		System.out.println(bold+"\u001B[5m"+orange+"	                                    * *       * *     "+bold+def+"\u001B[5m"+"* * * * * *  "+bold+"\u001B[5m"+green+"     * *     * *                     ");
		System.out.println(bold+"\u001B[5m"+orange+"	                                   * *         * *    "+bold+def+"\u001B[5m"+"* * * * * *  "+bold+"\u001B[5m"+green+"     * *      * *                    ");
		System.out.println(def);
		System.out.println(bold+"\u001B[5m"+orange+"	                           * * * * * *   **       * *  "+bold+def+"\u001B[5m"+" * * * * *     "+bold+"\u001B[5m"+green+" * * * * * *        * *                         ");
		System.out.println(bold+"\u001B[5m"+orange+"	                           * * * * * *   * * *    * *  "+bold+def+"\u001B[5m"+" * * * * * *    "+bold+"\u001B[5m"+green+"* * * * * *       * * *                        ");
		System.out.println(bold+"\u001B[5m"+orange+"	                               * *       * * * *  * *  "+bold+def+"\u001B[5m"+" * *       * *  "+bold+"\u001B[5m"+green+"    * *          * * * *                       ");
		System.out.println(bold+"\u001B[5m"+orange+"	                               * *       * *  * * * *  "+bold+def+"\u001B[5m"+" * *       * *  "+bold+"\u001B[5m"+green+"    * *         * *   * *                      ");
		System.out.println(bold+"\u001B[5m"+orange+"	                               * *       * *   * ** *  "+bold+def+"\u001B[5m"+" * *       * *  "+bold+"\u001B[5m"+green+"    * *        * * * * * *                     ");
		System.out.println(bold+"\u001B[5m"+orange+"	                           * * * * * *   * *    * * *  "+bold+def+"\u001B[5m"+" * * * * *  *   "+bold+"\u001B[5m"+green+"* * * * * *   * *       * *                    ");
		System.out.println(bold+"\u001B[5m"+orange+"	                           * * * * * *   * *      * *  "+bold+def+"\u001B[5m"+" * * * * *     "+bold+"\u001B[5m"+green+" * * * * * *  * *         * *                   ");
		System.out.println(def);
		System.out.println(bold+"\u001B[5m"+orange+"                       * *         * * * * * *   * * * * * * "+bold+def+"\u001B[5m"+" * *        * * * * * *"+bold+"\u001B[5m"+green+"  * *     * *  * * * * *  * * * * *         ");
		System.out.println(bold+"\u001B[5m"+orange+"                      * * *        * * * * * *   * * * * * * "+bold+def+"\u001B[5m"+" * *        * * * * * *"+bold+"\u001B[5m"+green+"  * * *   * *  * * * * *  * * * * *          ");
		System.out.println(bold+"\u001B[5m"+orange+"                     * * * *           * *       * *   * *   "+bold+def+"\u001B[5m"+" * *            * *    "+bold+"\u001B[5m"+green+"  * * * * * *  * *        * *                ");
		System.out.println(bold+"\u001B[5m"+orange+"                    * *   * *          * *       * * * *     "+bold+def+"\u001B[5m"+" * *            * *    "+bold+"\u001B[5m"+green+"  * *  * ** *  * * * * *  * * * * *          ");
		System.out.println(bold+"\u001B[5m"+orange+"                   * * * * * *         * *       * * ** *    "+bold+def+"\u001B[5m"+" * *            * *    "+bold+"\u001B[5m"+green+"  * *   * * *  * * * * *  * * * * *          ");
		System.out.println(bold+"\u001B[5m"+orange+"                  * * * * * * *        * *       * *   * *   "+bold+def+"\u001B[5m"+" * *            * *    "+bold+"\u001B[5m"+green+"  * *    ** *  * *              * *          ");
		System.out.println(bold+"\u001B[5m"+orange+"                 * *         * *   * * * * * *   * *    * *  "+bold+def+"\u001B[5m"+" * * * * *  * * * * * *"+bold+"\u001B[5m"+green+"  * *     * *  * * * * *  * * * * *          ");
		System.out.println(bold+"\u001B[5m"+orange+"                * *           * *  * * * * * *   * *     * * "+bold+def+"\u001B[5m"+" * * * * *  * * * * * *"+bold+"\u001B[5m"+green+"  * *      **  * * * * *  * * * * *          ");
		System.out.print(def+"\n\n");
		System.out.println(bold+"									- WE WILL NEVER LET YOU WALK WE WILL LET YOU FLY"); 
	
	}
	void registration()
	{
		// first name ,last name, age, country , mobile no (with validation , with country code) , gender , email adress(with validation) ,create user id, 		//	password creation ,otp 
		System.out.println(colour.yellow);
		System.out.println("		ENTER FIRST NAME");
		System.out.print("		");
		System.out.print(colour.skblue);
		String first_name=sc.next();
		System.out.print(colour.yellow);
		System.out.println("		ENTER LAST NAME");
		System.out.print("		");
		System.out.print(colour.skblue);
		String last_name=sc.next();
		age();
		gender();
		mobile_valid();
		email_valid();
		user_id();
		password();
		System.out.println(colour.yellow);
		System.out.println("		1. LOGIN\n		2 . EXIT");
		System.out.print(colour.blue);
		String logi=sc.next();
		if(logi .equals ("1"))
		{
			pre_login();
		}
	}
	void gender()
	{
		System.out.println(colour.yellow);
		System.out.println("		ENTER YOUR GENDER\n		1 . Male\n		2 . Female ");
		System.out.print(colour.skblue);
		int gender=sc.nextInt();
		if(gender !=1 && gender !=2)
		{
			System.out.println(colour.red);
			System.out.println("		INVALID GENDER TYPE  \n		PLEASE TRY AGAIN");
			gender();
		}  
	}
	void age()
	{
		System.out.println(colour.yellow);
	    System.out.println("		ENTER YOUR AGE");
		System.out.print("		");
		System.out.print(colour.skblue);
		int age=sc.nextInt();
		if(age <17 || age >80)
		{
			System.out.println(colour.red);
			System.out.println("		AGE MUST BE IN RANGE OF 18 - 80 \n		PLEASE TRY AGAIN");
			age();
		}
	}
	void password()
	{
		System.out.println(colour.yellow);
		System.out.println("		CREATE YOUR PASSWORD\n		( password must contain 1 capital letter , 1 number and 1 special character )");
		System.out.print("		");
		System.out.print(colour.skblue);
		String password=sc.next();
		int passcode=password.length();
		int c=0,d=0,e=0,f=0;
		for(int i=(passcode-1);i>=0;i--)
		{
			char passCode=password.charAt(i);
			if(passCode >='A' && passCode <='Z')
				c++;
			else if(passCode >='a' && passCode <='z')
				d++;
			else if(passCode >='0' && passCode <='9')
				e++;
			else
				f++;
		}
		if(c!=0 && d!=0 && e!=0 && f!=0)
		{
			System.out.println(colour.green);
			System.out.println("		YOUR PASSWORD HAS BEEN CREATED");
			passWord=password;
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		YOU HAVE ENTERED WEAK PASSWORD , PLEASE TRY AGAIN");
			password();
		}
	}
	void user_id()
	{
		System.out.println(colour.yellow);
		System.out.println("		CREATE YOUR USER ID\n		( user id must consists of 1 capital letter , and 1 number )");
		System.out.print("		");
		System.out.print(colour.skblue);
		String user_id=sc.next();
		int u_id=user_id.length();
		int c=0,d=0,e=0,f=0;
		for(int i=(u_id-1);i>=0;i--)
		{
			char us_id=user_id.charAt(i);
			if(us_id >='A' && us_id <='Z')
				c++;
			else if(us_id >='a' && us_id <='z')
				d++;
			else if(us_id >='0' && us_id <='9')
				e++;
			else
				f++;
		}
		if(c!=0 && d!=0 && e!=0 && f==0)
		{
			System.out.println(colour.green);
			System.out.println("		YOUR USER ID HAS BEEN CREATED");
			userId=user_id;
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID USER ID , PLEASE TRY AGAIN");
			user_id();
		}
	}
	void mobile_valid()
	{
		System.out.println(colour.yellow);
		System.out.println("		ENTER YOUR 10 DIGIT MOBILE NUMBER");
		System.out.print("		");
		System.out.print(colour.skblue);
		String mobile_num=sc.next();
		int length_mobile=mobile_num.length();
		if(length_mobile==10)
		{
			System.out.println(colour.green);
			System.out.println("		MOBILE NUMBER VERIFIED SUCESSFULLY \n		OTP HAS BEEN SENT TO YOUR MOBILE NUMBER");
			otp_verify();
			MOBILE=mobile_num;
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID MOBILE NUMBER \n		PLEASE TRY AGAIN");
			mobile_valid();
		}
	}
	void otp_verify()
	{
		int random_otp=(int)(Math.random()*10000);
		if(random_otp>=1000 && random_otp<=9999)
		{
			System.out.println(colour.yellow);
			System.out.println("		YOUR OTP : "+random_otp+"\n"+"		ENTER OTP");
			System.out.print("		");
			System.out.print(colour.skblue);
			int user_otp=sc.nextInt();
			if(user_otp==random_otp)
			{
				System.out.println(colour.green);
				System.out.println("		OTP HAS BEEN VERIFIED");
			}
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED INVALID OTP");
				System.out.println("		PLEASE TRY AGAIN");
				otp_verify();
			}
		}
		else
		{
			otp_verify();
		}
	}
	void email_valid()
	{
		System.out.println(colour.yellow);
		System.out.println("		ENTER YOUR EMAIL ADRESS");
		System.out.println("		(ex : abc@gmail.com)");
		System.out.print("		");
		System.out.print(colour.skblue);
		String email=sc.next();
		int length_email=email.length();
		if(length_email > 12)
		{
			String validation="";
			int c=0;
			for(int i=(length_email-1);i>(length_email-11);i--)
			{
				char mail=email.charAt(i);
				validation=mail+validation;
			
			}
			for(int i=(length_email-11);i>=0;i--)
			{
				char mail=email.charAt(i);
				if((mail <= 'a' || mail >='z') || (mail <='1' || mail >='9'))
					c++;
			}
			if(validation .equals ("@gmail.com") && c!=0)
			{
				System.out.println(colour.green);
				System.out.println("		EMAIL ID VERIFIED SUCESSFULLY \n		OTP HAS BEEN SENT TO YOUR EMAIL ID");
				otp_verify();
				EMAIL = email;
			}
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED INVALID EMAIL ID  \n		PLEASE TRY AGAIN");
				email_valid();
			}
		}
		else
		{	System.out.println(colour.red);
			System.out.println("		ENTER VALID MAIL ID");
			email_valid();
		}	
	}
	void pre_login()
	{
		System.out.println(colour.yellow);
		System.out.println("		1 . login\n		2 . Forgot user Id\n		3 . exit");
		System.out.print(colour.blue);
		int use=sc.nextInt();
		if(use == 1)
		{
			System.out.println(colour.skblue);
			System.out.print("		Enter userid : ");
			String regUsername = sc.next();
			if((regUsername .equals (this.USER_ID)) || (regUsername .equals (this.userId)))
			{
				pre_login1();
			} 
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED WRONG USER ID  \n		PLEASE TRY AGAIN");
				pre_login();
			}
		}
		else if(use == 2)
		{
			System.out.println(colour.skblue);
			System.out.println("		ENTER YOUR REGISTERED MOBILE NUMBER OR EMAIL ID");
			String mobile_email = sc.next();
			if(mobile_email .equals (this.MOBILE) || mobile_email .equals (this.EMAIL))
			{
				System.out.println(colour.green);
				System.out.println("		OTP HAS BEEN SENT SUCESSFULLY");
				otp_verify();
				System.out.println(colour.skblue);
				System.out.println("		YOUR USER ID : "+this.userId);
				pre_login();
			}
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED INCORRECT CREDENTIALS \n		PLEASE TRY AGAIN");
				pre_login();
			}
		}
	}
	void pre_login1()
	{
		System.out.println(colour.yellow);
		System.out.println("		1 . Enter password\n		2 . Forgot password\n		3 . exit");
		System.out.print(colour.blue);
		int use=sc.nextInt();
		if(use == 1)
		{
			System.out.println(colour.skblue);
			System.out.print("		Enter password : ");
			String password = sc.next();
			if((password .equals (this.PASSWORD)) || (password .equals (this.passWord)))
			{
				System.out.println(colour.green);
				System.out.println("		LOGIN SUCESSFUL");
				login();
			} 
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED WRONG PASSWORD \n		PLEASE TRY AGAIN");
				pre_login1();
			}
		}
		else if(use == 2)
		{
			System.out.println(colour.blue);
			System.out.println("		ENTER YOUR REGISTERED MOBILE NUMBER OR EMAIL ID");
			String mobile_email = sc.next();
			if(mobile_email .equals (this.MOBILE) || mobile_email .equals (this.EMAIL))
			{
				System.out.println(colour.green);
				System.out.println("		OTP HAS BEEN SENT SUCESSFULLY");
				otp_verify();
				System.out.println(colour.skblue);
				System.out.println("		YOUR PASSWORD : "+this.passWord);
				pre_login1();
			}
			else
			{
				System.out.println(colour.red);
				System.out.println("		YOU HAVE ENTERED INCORRECT CREDENTIALS \n		PLEASE TRY AGAIN");
				pre_login1();
			}
		}
		else if(use ==3)
		{
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID CHOICE  \n		PLEASE TRY AGAIN");
			pre_login1();
		}	
	}
	void login()
	{
		System.out.println(colour.yellow);
                System.out.println("		1 . Booking\n		2 . exit");
		System.out.print(colour.blue);
		int book=sc.nextInt();
		if(book==1)
		{
			home();
		}
		else if(book == 2)
		{
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
			login();
		}
	}
	void home()
	{
		/* national or international , from , to , date , travelling class */
		System.out.println(colour.yellow);
		System.out.println("		Select Type of Trip");
		System.out.println(colour.blue);
		System.out.println("		1. National -> National\n		2. National -> International");
		int n = sc.nextInt();
		switch(n)
		{
			case 1: this.journey=1;NN(); break;	
			case 2: this.journey=2;NI(); break;
			default :
			{
				System.out.println(colour.red);
				System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
				home();
			}
		}
	}
	void NN()
	{
		System.out.println(colour.yellow);
		System.out.println("		1.One Way Trip \n		2.Round Trip");
		System.out.print(colour.blue);
		int y = sc.nextInt();
		if(y==1)
		{
			this.trip=1;
			OW();
		}
		else if(y==2)
		{
			this.trip=2;
			RT();
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
			NN();
		}
	}
	void NI()
	{
		System.out.println(colour.yellow);
		System.out.println("		Select 1.One Way Trip \n		2.Round Trip");
		System.out.print(colour.blue);
		int y = sc.nextInt();
		if(y==1)
		{
			this.trip=1;
			OW1();
		}
		else if(y==2)
		{
			this.trip=2;
			RT1();
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
			NI();
		}
	}
	void RT1()
	{
		System.out.println(colour.yellow);
		System.out.println("		Enter From Address");
		this.DEPARTURE=states();
		System.out.println(colour.yellow);
		System.out.println("		Enter Destination Address");
		this.DESTINATION=countries();
		System.out.println(colour.yellow);
		System.out.println("		Enter Departure Date");
		calender();
		System.out.println(colour.yellow);
		System.out.println("		Enter Return Date");
		CALENDER();
		System.out.println(colour.yellow);
		System.out.println("		Enter no. of travellers");
		int a = Adult();
		int c = Children();
		int d = Infant();
		this.passengers=(a+d+c);
		System.out.println(colour.blue);
		System.out.println("		Select Cabin class");
		cls();
	}
	void OW1()
	{
		System.out.println(colour.yellow);
		System.out.println("		Select Departure");
		this.DEPARTURE=states();
		System.out.println(colour.yellow);
		System.out.println("		Select Destination");
		this.DESTINATION=countries();
		System.out.println(colour.yellow);
		System.out.println("		Enter Departure Date");
		calender();
		System.out.println(colour.yellow);
		System.out.println("		Enter no. of travellers");
		int a = Adult();
		int c = Children();
		int d = Infant();
		this.passengers=(a+d+c);
		System.out.println(colour.blue);
		System.out.println("		Select Cabin class");
		cls();
	}
	String countries()
	{
		System.out.println(colour.skblue);
		System.out.println("		1.Africa\n		2.America\n		3.Asia\n		4.Saudi Arabia\n		5.Europe\n		6.Australia");
		int con = sc.nextInt();
		String countries="";
		switch(con)
		{
			case 1: System.out.println("		Batna Airport (BLJ)");countries="BLJ";
				break;
			case 2: System.out.println("		Santa Maria Airport (AJU)");countries="AJU";
				break;
			case 3: System.out.println("		Changi Airport (SIN)");countries="SIN";
				break;
			case 4: System.out.println("		Abha International Airport (AHB)");countries="AHB";
				break;
			case 5: System.out.println("		London City Airport (LCY)");countries="LCY";
				break;
			case 6: System.out.println("		Sydney Airport (SYD)");countries="SYD";
				break;
			default: System.out.println("		you have Entered invalid input \nplease try again");countries();
		}
		return countries;
	}
	void RT()
	{
		System.out.println(colour.yellow);
		System.out.println("		Enter From Address");
		this.DEPARTURE=states();
		System.out.println(colour.yellow);
		System.out.println("		Enter Destination Address");
		this.DESTINATION=states();
		if(this.DEPARTURE == this.DESTINATION)
		{
			System.out.println(colour.red);
			System.out.println("		departure and destination can't be the same");
			RT();
		}
		else
		{
			cabin();
		}
	}
	void cabin()
	{
		System.out.println(colour.yellow);
		System.out.println("		Enter Departure Date");
		calender();
		System.out.println(colour.yellow);
		System.out.println("		Enter Return Date");
		CALENDER();
		System.out.println(colour.yellow);
		System.out.println("		Enter no. of travellers");
		int a = Adult();
		int c = Children();
		int d = Infant();
		this.passengers=(a+d+c);
		System.out.print(colour.blue);
		System.out.println("		Select Cabin class");
		cls();
	}
	void OW()
	{
		System.out.println(colour.yellow);
		System.out.println("		Select Departure");
		this.DEPARTURE=states();
		System.out.println(colour.yellow);
		System.out.println("		Select Destination");
		this.DESTINATION=states();
		if(this.DEPARTURE == this.DESTINATION)
		{
			System.out.println(colour.red);
			System.out.println("		departure and destination can't be the same");
			OW();
		}
		else
		{
			WO();
		}
	}
	void CALENDER()
	{
		this.DD = DATE();
		this.MM = MONTH();
		this.YYYY = YEAR();
		System.out.println(colour.blue);
		System.out.println("		"+this.DD+" / "+this.MM+" / "+this.YYYY);
	}
	int DATE()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY DATE");
		System.out.print("		");
		int date=sc.nextInt();
		if(date < 1 || date > 31)
		{
			System.out.println("		DATE MUST BE IN RANGE OF 1 - 31 "+"\n"+"		PLEASE TRY AGAIN");
			return date();
		}
		return date;
	}
	int MONTH()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY MONTH");
		System.out.print("		");
		int month=sc.nextInt();
		if(month < 1 || month > 12)
		{
			System.out.println("		MONTH MUST BE IN A RANGE OF 1 - 12"+"\n"+"		PLEASE TRY AGAIN");
			return month();
		}
		return month;
	}
	int YEAR()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY YEAR");
		System.out.print("		");
		int year=sc.nextInt();
		if(year < 2023 || year > 2024)
		{
			System.out.println("		YEAR MUST BE VALID"+"\n"+"		PLEASE TRY AGAIN");
			return year();
		}
		return year;
	}
	void WO()
	{
		System.out.println(colour.yellow);
		System.out.println("		Enter Departure Date");
		calender();
		System.out.println(colour.yellow);
		System.out.println("		Enter no. of travellers");
		int a = Adult();
		int c = Children();
		int d = Infant();
		this.passengers=(a+d+c);
		System.out.println(colour.blue);
		System.out.println("		Select Cabin class");
		cls();
	}
	int Adult()
	{
		System.out.println(colour.skblue);
		System.out.println("		Enter no.of Adult(12+ years) passengers");
		System.out.print("		");
		int p1=sc.nextInt();
		return p1;
	}
	int Children()
	{
		System.out.println(colour.skblue);
		System.out.println("		Enter no. of Children(2-12years) passengers");
		System.out.print("		");
		int p2=sc.nextInt();
		return p2;
	}
	int Infant()
	{
		System.out.println(colour.skblue);
		System.out.println("		Enter no. of Infant (0-2years) passengers");
		System.out.print("		");
		int p3=sc.nextInt();
		return p3;
	}
	void calender()
	{
		this.dd = date();
		this.mm = month();
		this.yyyy = year();
		System.out.println(colour.blue);
		System.out.println("		"+"\n		"+this.dd+" / "+this.mm+" / "+this.yyyy);
	}
	int date()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY DATE");
		System.out.print("		");
		int date=sc.nextInt();
		if(date < 1 || date > 31)
		{
			System.out.println("		DATE MUST BE IN RANGE OF 1 - 31 "+"\n"+"		PLEASE TRY AGAIN");
			return date();
		}
		return date;
	}
	int month()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY MONTH");
		System.out.print("		");
		int month=sc.nextInt();
		if(month < 1 || month > 12)
		{
			System.out.println("		MONTH MUST BE IN A RANGE OF 1 - 12"+"\n"+"		PLEASE TRY AGAIN");
			return month();
		}
		return month;
	}
	int year()
	{
		System.out.println(colour.skblue);
		System.out.println("		ENTER JOURNEY YEAR");
		System.out.print("		");
		int year=sc.nextInt();
		if(year < 2023 || year > 2024)
		{
			System.out.println("		YEAR MUST BE VALID"+"\n"+"		PLEASE TRY AGAIN");
			return year();
		}
		return year;
	}
	String states()
	{
		System.out.println(colour.skblue);
		System.out.println("		1.AndhraPradesh\n		2.Telangana\n		3.Karnataka\n		4.Kerela\n		5.Maharastra\n		6.TamilNadu\n		7.Goa\n		8.Gujarat\n		9.Manipur\n		10.Odisha\n		11.Punjab\n		12.Rajasthan\n		13.Delhi\n		14.Jammu and Kashmir\n		15.Uttar Pradesh");
		System.out.println(colour.blue);
		int state = sc.nextInt();
		String states="";
		switch(state)
		{
			case 1: System.out.println("		Tirupati International Airport (TIR)");states="TIR";
				break;
			case 2: System.out.println("		Rajiv Gandhi International Airport(HYD)");states="HYD";
				break;
			case 3: System.out.println("		Kempegowda International Airport (BLR)");states="BLR";
				break;
			case 4: System.out.println("		Cochin International Airport (COK)");states="COK";
				break;
			case 5: System.out.println("		Chhatrapati Shivaji Maharaj International Airport (BOM)");states="BOM";
				break;
			case 6: System.out.println("		Chennai International Airport (MAA)");states="MAA";
				break;
			case 7: System.out.println("		Manohar International Airport (GOX)");states="GOX";
				break;
			case 8: System.out.println("		Sardar Vallabhbhai Patel International Airport (AMD)");states="AMD";
				break;
			case 9: System.out.println("		Imphal International Airport (IMF)");states="IMF";
				break;
			case 10: System.out.println("		Biju Patnaik International Airport (BBI)");states="BBI";
				break;
			case 11: System.out.println("		Sri Guru Ram Dass Jee International Airport (ATQ)");states="ATQ";
				break;
			case 12: System.out.println("		Jaipur International Airport (JAI)");states="JAI";
				break;
			case 13: System.out.println("		Indira Gandhi International Airport (DEL)");states="DEL";
				break;
			case 14: System.out.println("		Sheikh ul-Alam International Airport (SXR)");states="SXR";
				break;
			case 15: System.out.println("		Chaudhary Charan Singh International Airport (LKO)");states="LKO";
				break;
			default: System.out.println("		you have Enterd invalid input \nplease try again");states();
		}
		return states;
	}
	void cls()
	{
		System.out.println(colour.yellow);
		System.out.println("		1.Economy\n		2.Premium Economy\n		3.Business");
		System.out.print(colour.blue);
		int x = sc.nextInt();
		if(x==1)
		{
			System.out.println(colour.skblue);
			System.out.println("		Economy");
			this.space = 1;
			this.fclass="Economy";
		}
		else if(x==2)
		{
			System.out.println(colour.skblue);
			System.out.println("		Premium Economy");
			this.space = 2;
			this.fclass="Premium Economy";
		}
		else if(x==3)
		{
			System.out.println(colour.skblue);
			System.out.println("		Business");
			this.space = 3;
			this.fclass ="Business";
		}
		filter();
	}
	void filter()
	{
		int a=0;
		int b=24;
		flights(a,b);
	}
	void flights(int a,int b)
	{
		/* flight symbol , starting and ending time , price, duration*/
		int d=0;
		int x;
		int y;
		int ddd;
		int DDD;
		int mmm;
		int MMM;
		if(this.journey==1)
		{
			if(this.space==1)
				this.c=(int)(Math.random()*4000);
			else if(this.space==2)
				this.c=(int)(Math.random()*8000);
			else
				this.c=(int)(Math.random()*15000);
			if(this.trip==1)
			{
				for(int i=a;i<b;i+=6)
				{
					x=i;
					y=x+2;
					if(y==24)
					{
						y=0;
						ddd=this.dd+1;
						if(this.dd==31)
							mmm=this.mm+1;
						else 
							mmm=this.mm;
					}
					else 
					{
						ddd=this.dd;
						mmm=this.mm;
					}
					if(ddd==32)
						ddd=1;
		    			d++;
					System.out.print(colour.skblue);
		    			System.out.println("   "+d+"\n");
		    			System.out.println("                   *   ");
		    			System.out.print("           * * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println(x+":00 hr                             2H 0MIN                              "+y+":00 hr");
					System.out.print(colour.skblue);
		    			System.out.println("               * *     ");
		    			System.out.print("             *   *             ");
					System.out.print(colour.yellow);
		    			System.out.println("("+this.DEPARTURE+")                              ----------                           ("+this.DESTINATION+")");
					System.out.print(colour.skblue);
		    			System.out.println("           *     *     ");
		    			System.out.print("     * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println("                                            RS  "+this.c);
					System.out.print(colour.skblue);
		    			System.out.print("         *                     ");
					System.out.print(colour.yellow);
					System.out.println(this.dd+" "+(travel(this.mm))+"                                                                    "+(ddd)+" "+travel(mmm));
					System.out.print(colour.skblue);
		    			System.out.println("         *             ");
		    			System.out.println("\n");
				}
				System.out.println(colour.yellow);
				System.out.println("		CHOOOSE YOUR FLIGHT");
				System.out.print(colour.blue);
				int fly_select=sc.nextInt();
				if(fly_select <= d)
				{
					if(fly_select==1)
					{
						this.ar_time=0;
						this.de_time=2;
					}
					else if(fly_select==2)
					{
						this.ar_time=6;
						this.de_time=8;
					}
					else if(fly_select==3)
					{
						this.ar_time=12;
						this.de_time=14;
					}
					else if(fly_select==4)
					{
						this.ar_time=18;
						this.de_time=20;
					}
					primary_contact();
				}
				else
				{
					System.out.println(colour.red);
					System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
					flights(a,b);
				}
			}
			else if(this.trip==2)
			{
				for(int i=a;i<b;i+=6)
				{
					x=i;
					y=x+2;
					if(y==24)
					{
						y=0;
						ddd=this.dd+1;
						if(this.dd==31)
							mmm=this.mm+1;
						else 
							mmm=this.mm;
					}
					else 
					{
						ddd=this.dd;
						mmm=this.mm;
					}
					if(ddd==32)
						ddd=1;
		    			d++;
					System.out.print(colour.skblue);
		    			System.out.println("   "+d+"\n");
		    			System.out.println("                   *   ");
		    			System.out.print("           * * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println(x+":00 hr                             2H 0MIN                              "+y+":00 hr");
					System.out.print(colour.skblue);
		    			System.out.println("               * *     ");
		    			System.out.print("             *   *             ");
					System.out.print(colour.yellow);
		    			System.out.println("("+this.DEPARTURE+")                              ----------                               ("+this.DESTINATION+")");
					System.out.print(colour.skblue);
		    			System.out.println("           *     *     ");
		    			System.out.print("     * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println("                                            RS  "+c);
					System.out.print(colour.skblue);
		    			System.out.print("         *                     ");
					System.out.print(colour.yellow);
					System.out.println(this.dd+" "+(travel(this.mm))+"                                                                    "+(ddd)+" "+travel(mmm));
					System.out.print(colour.skblue);
		    			System.out.println("         *             ");
		    			System.out.println("\n");
				}
				System.out.print(colour.yellow);
				System.out.println("		CHOOOSE YOUR FLIGHT");
				System.out.print(colour.blue);
				int fly_select=sc.nextInt();
				if(fly_select <= d)
				{
					if(fly_select==1)
					{
						this.ar_time=0;
						this.de_time=2;
					}
					else if(fly_select==2)
					{
						this.ar_time=6;
						this.de_time=8;
					}
					else if(fly_select==3)
					{
						this.ar_time=12;
						this.de_time=14;
					}
					else if(fly_select==4)
					{
						this.ar_time=18;
						this.de_time=20;
					}
					int e=0;
					for(int i=a;i<b;i+=6)
					{
						x=i;
						y=x+2;
						if(y==24)
						{
							y=0;
							DDD=this.DD+1;
							if(this.DD==31)
								MMM=this.MM+1;
							else
								MMM=this.MM;
						}
						else 
						{
							DDD=this.DD;
							MMM=this.MM;
						}
						if(DDD==32)
							DDD=1;		
		    				e++;
						System.out.print(colour.skblue);
		    				System.out.println("   "+e+"\n");
		    				System.out.println("                   *   ");
		    				System.out.print("           * * * *             ");
						System.out.print(colour.yellow);
		    				System.out.println(x+":00 hr                             2H 0MIN                              "+y+":00 hr");
						System.out.print(colour.skblue);
		    				System.out.println("               * *     ");
		    				System.out.print("             *   *             ");
						System.out.print(colour.yellow);
		    				System.out.println("("+this.DESTINATION+")                              ----------                             ("+this.DEPARTURE+")");
						System.out.print(colour.skblue);
		    				System.out.println("           *     *     ");
		    				System.out.print("     * * *             ");
						System.out.print(colour.yellow);
		    				System.out.println("                                            RS  "+c);
						System.out.print(colour.skblue);
		    				System.out.print("         *                     ");
						System.out.print(colour.yellow);
						System.out.println(this.DD+" "+(travel(this.MM))+"                                                                    "+(DDD)+" "+travel(MMM));
						System.out.print(colour.skblue);
		    				System.out.println("         *             ");
		    				System.out.println("\n");
					}
					System.out.print(colour.yellow);
					System.out.println("		CHOOSE YOUR RETURN FLIGHT");
					System.out.print(colour.blue);
					int selection=sc.nextInt();
					if(selection > 0)
					{
						this.c=(2*c);
						if(selection==1)
						{
						this.AR_TIME=0;
						this.DE_TIME=2;
						}
						else if(selection==2)
						{
						this.AR_TIME=6;
						this.DE_TIME=8;
						}
						else if(selection==3)
						{
						this.AR_TIME=12;
						this.DE_TIME=14;
						}
						else if(selection==4)
						{
						this.AR_TIME=18;
						this.DE_TIME=20;
						}
						primary_contact();
					}
				}
				else
				{
					System.out.println(colour.red);
					System.out.println("		INVALID CHOICE \nPLEASE TRY AGAIN");
					flights(a,b);
				}
			}
		}
		else if(this.journey==2)
		{
			if(this.space==1)
				this.c=(int)(Math.random()*18000);
			else if(this.space==2)
				this.c=(int)(Math.random()*25000);
			else
				this.c=(int)(Math.random()*40000);
			if(this.trip==1)
			{
				for(int i=a;i<b;i+=8)
				{
					x=i;
					y=x+8;
					if(y==24)
					{
						y=0;
						ddd=this.dd+1;
						if(this.dd==31)
							mmm=this.mm+1;
						else 
							mmm=this.mm;
					}
					else 
					{
						ddd=this.dd;
						mmm=this.mm;
					}
					if(ddd==32)
						ddd=1;
		    			d++;
					System.out.print(colour.skblue);
		    			System.out.println("   "+d+"\n");	
		    			System.out.println("                   *   ");
		    			System.out.print("           * * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println(x+":00 hr                             8H 0MIN                              "+y+":00 hr");
					System.out.print(colour.skblue);
		    			System.out.println("               * *     ");
		    			System.out.print("             *   *             ");
					System.out.print(colour.yellow);
		    			System.out.println("("+this.DEPARTURE+")                              ----------                             ("+this.DESTINATION+")");
					System.out.print(colour.skblue);
		    			System.out.println("           *     *     ");
		    			System.out.print("     * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println("                                            RS  "+this.c);
					System.out.print(colour.skblue);
		    			System.out.print("         *                     ");
					System.out.print(colour.yellow);
					System.out.println(this.dd+" "+(travel(this.mm))+"                                                                    "+(ddd)+" "+travel(mmm));
					System.out.print(colour.skblue);
		    			System.out.println("         *             ");
		    			System.out.println("\n");
				}
				System.out.print(colour.yellow);
				System.out.println("		CHOOOSE YOUR FLIGHT");
				System.out.print(colour.blue);
				int fly_select=sc.nextInt();
				if(fly_select <= d)
				{
					if(fly_select==1)
					{
						this.ar_time=0;
						this.de_time=8;
					}
					else if(fly_select==2)
					{
						this.ar_time=8;
						this.de_time=16;
					}
					else if(fly_select==3)
					{
						this.ar_time=16;
						this.de_time=0;
					}
					primary_contact();
				}
				else
				{
					System.out.println(colour.red);
					System.out.println("		INVALID CHOICE \nPLEASE TRY AGAIN");
					flights(a,b);
				}
			}
			else if(this.trip==2)
			{
				for(int i=a;i<b;i+=8)
				{
					x=i;
					y=x+8;
					if(y==24)
					{
						y=0;
						ddd=this.dd+1;
						if(this.dd==31)
							mmm=this.mm+1;
						else 
							mmm=this.mm;
					}
					else 
					{
						ddd=this.dd;
						mmm=this.mm;
					}
					if(ddd==32)
						ddd=1;
		    			d++;
					System.out.print(colour.skblue);
		    			System.out.println("   "+d+"\n");
		    			System.out.println("                   *   ");
		    			System.out.print("           * * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println(x+":00 hr                             8H 0MIN                              "+y+":00 hr");
					System.out.print(colour.skblue);
		    			System.out.println("               * *     ");
		    			System.out.print("             *   *             ");
					System.out.print(colour.yellow);
		    			System.out.println("("+this.DEPARTURE+")                              ----------                             ("+this.DESTINATION+")");
					System.out.print(colour.skblue);
		    			System.out.println("           *     *     ");
		    			System.out.print("     * * *             ");
					System.out.print(colour.yellow);
		    			System.out.println("                                            RS  "+c);
					System.out.print(colour.skblue);
		    			System.out.print("         *                     ");
					System.out.print(colour.yellow);
					System.out.println(this.dd+" "+(travel(this.mm))+"                                                                    "+(ddd)+" "+travel(mmm));
					System.out.print(colour.skblue);
		    			System.out.println("         *             ");
		    			System.out.println("\n");
				}
				System.out.print(colour.yellow);
				System.out.println("		CHOOOSE YOUR FLIGHT");
				System.out.print(colour.blue);
				int fly_select=sc.nextInt();
				if(fly_select <= d)
				{
					if(fly_select==1)
					{
						this.ar_time=0;
						this.de_time=8;
					}
					else if(fly_select==2)
					{
						this.ar_time=8;
						this.de_time=16;
					}
					else if(fly_select==3)
					{
						this.ar_time=16;
						this.de_time=0;
					}
					int e=0;
					for(int i=a;i<b;i+=8)
					{
						x=i;
						y=x+8;
						if(y==24)
						{
							y=0;
							DDD=this.DD+1;
							if(this.DD==31)
								MMM=this.MM+1;
							else
								MMM=this.MM;
						}
						else 
						{
							DDD=this.DD;
							MMM=this.MM;
						}
						if(DDD==32)
							DDD=1;
		    				e++;
						System.out.print(colour.skblue);
		    				System.out.println("   "+e+"\n");
		    				System.out.println("                   *   ");
		    				System.out.print("           * * * *             ");
						System.out.print(colour.yellow);
		    				System.out.println(x+":00 hr                             8H 0MIN                              "+y+":00 hr");
						System.out.print(colour.skblue);
		    				System.out.println("               * *     ");
		    				System.out.print("             *   *             ");
						System.out.print(colour.yellow);
		    				System.out.println("("+this.DESTINATION+")                              ----------                             ("+this.DEPARTURE+")");
						System.out.print(colour.skblue);
		    				System.out.println("           *     *     ");
		    				System.out.print("     * * *             ");
						System.out.print(colour.yellow);
		    				System.out.println("                                            RS  "+c);
						System.out.print(colour.skblue);
		    				System.out.print("         *                     ");
						System.out.print(colour.yellow);
						System.out.println(this.DD+" "+(travel(this.MM))+"                                                                    "+(DDD)+" "+travel(MMM));
						System.out.print(colour.skblue);
		    				System.out.println("         *             ");
		    				System.out.println("\n");
					}
					System.out.print(colour.yellow);
					System.out.println("		CHOOSE YOUR RETURN FLIGHT");
					int selection=sc.nextInt();
					if(selection <=e)
					{
						this.c=(2*c);
						if(selection ==1)
						{
							this.AR_TIME=0;
							this.DE_TIME=8;
						}
						else if(selection ==2)
						{
							this.AR_TIME=8;
							this.DE_TIME=16;
						}
						else if(selection ==3)
						{
							this.AR_TIME=16;
							this.DE_TIME=0;
						}
						primary_contact();
					}
					else
					{
						System.out.println(colour.red);
						System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
						flights(a,b);
					}
				}
				else
				{
					System.out.println(colour.red);
					System.out.println("		INVALID CHOICE \nPLEASE TRY AGAIN");
					flights(a,b);
				}
			}
		}
		else
			this.c=(int)(Math.random()*200);
	}
	String travel(int a)
	{
		if(a==1)
			return "JAN";
		else if(a==2)
			return "FEB";
		else if(a==3)
			return "MAR";
		else if(a==4)
			return "APR";
		else if(a==5)
			return "MAY";
		else if(a==6)
			return "JUN";
		else if(a==7)
			return "JUL";
		else if(a==8)
			return "AUG";
		else if(a==9)
			return "SEP";
		else if(a==10)
			return "OCT";
		else if(a==11)
			return "NOV";
		else
			return "DEC";
	}
	void passenger_details()
	{
		/* name , age, gender*/
		this.d=this.c;
		String pass1="",pass2="",pass3="",pass4="",pass5="";
		int age1=0,age2=0,age3=0,age4=0,age5=0;
		for(int i=1;i<=passengers;i++)
		{
			System.out.println(colour.yellow);
			System.out.println("		ENTER PASSENGER NAME");
			System.out.print("		");
			System.out.print(colour.skblue);
			String passen=sc.next();
			System.out.print(colour.yellow);
			System.out.println("		ENTER AGE");
			System.out.print("		");
			System.out.print(colour.skblue);
			int age=sc.nextInt();
			if(i==1)
			{
				pass1=passen;
				age1=age;
			}
			else if(i==2)
			{
				pass2=passen;
				age2=age;
				d+=c;
			}
			else if(i==3)
			{
				pass3=passen;
				age3=age;
				d+=c;
			}
			else if(i==4)
			{
				pass4=passen;
				age4=age;
				d+=c;
			}
			else if(i==5)
			{
				pass5=passen;
				age5=age;
				d+=c;
			}
		}
		payments(pass1,pass2,pass3,pass4,pass5,age1,age2,age3,age4,age5);
		
	}
	void primary_contact()
	{
		System.out.println(colour.purple);
		System.out.println("            CONTACT INFORMATION              ");
		System.out.println(colour.yellow);
		System.out.println("		ENTER MOBILE NUMBER : ");
		System.out.print("		");
		System.out.print(colour.skblue);
		this.contact=sc.next();
		System.out.print(colour.skblue);
		if(this.contact.length()==10)
		{
			System.out.println(colour.green);
			System.out.println("		OTP HAS BEEN SENT TO YOUR MOBILE NUMBER");
			otp_verify();
			passenger_details();
		}
		else
		{
			System.out.println(colour.red);
			System.out.println("		INVALID MOBILE NUMBER \n		PLEASE TRY AGAIN");
			primary_contact();
		}
	}
	void payments(String a,String b,String c,String d,String e,int a1,int a2,int a3,int a4,int a5)
	{
		System.out.print(colour.purple);
		System.out.println("\n\n		Amount  Rs  "+total_pay());
		System.out.print(colour.blue);
		System.out.println("		1 . continue with payment \n		2 . exit");
		int x=sc.nextInt();
		if(x==1)
		{
		System.out.print(colour.yellow);
		System.out.println("		redirecting to payments\n");
		System.out.print(colour.blue);
		System.out.println("		1 . upi apps \n		2 . upi adress");
		int pay=sc.nextInt();
		if(pay==1)
		{
			System.out.print(colour.skblue);
			System.out.println("		1 . google pay \n		2 . phonpe \n		3 . paytm \n		4 . amazon");
			System.out.print(colour.blue);
			int upi_app=sc.nextInt();
			if(upi_app >=1 && upi_app <=4)
			{
				System.out.println(colour.yellow);
				System.out.println("		ENTER YOUR 10 DIGIT MOBILE NUMBER");
				System.out.print("		");
				System.out.print(colour.skblue);
				String mobile_num=sc.next();
				int length_mobile=mobile_num.length();
				if(length_mobile==10)
				{
					System.out.println(colour.green);
					System.out.println("		MOBILE NUMBER VERIFIED SUCESSFULLY \n		OTP HAS BEEN SENT TO YOUR MOBILE NUMBER");
					otp_verify();
					System.out.print(colour.yellow);
					System.out.println("		PAYMENT SUCESSFUL\n\n\n\n");
					receipt(a,b,c,d,e,a1,a2,a3,a4,a5);
				}
				else
				{
					System.out.println(colour.red);
					System.out.println("		INVALID MOBILE NUMBER \n		PLEASE TRY AGAIN");
					payments(a,b,c,d,e,a1,a2,a3,a4,a5);
				}
				
			}
			else
			{
				System.out.print(colour.red);
				System.out.println("		INVALID PAYMENT METHOD \n		PLEASE TRY AGAIN");
				payments(a,b,c,d,e,a1,a2,a3,a4,a5);
			}
		}
		else if(pay==2)
		{
			System.out.print(colour.yellow);
			System.out.println("		enter upi adress \n		( ex : 1234567890@ybl )");
			System.out.print("		");
			System.out.print(colour.skblue);
			String upi_ad=sc.next();
			otp_verify();
			System.out.print(colour.green);
			System.out.println("		PAYMENT SUCESSFUL\n\n\n\n");
			receipt(a,b,c,d,e,a1,a2,a3,a4,a5);
		}
		else
		{
			System.out.print(colour.red);
			System.out.println("		INVLAID PAYMENT METHOD \n		PLEASE TRY AGAIN");
			payments(a,b,c,d,e,a1,a2,a3,a4,a5);
		}
		}
		else if(x==2)
		{
			System.exit(0);
		}
		else
		{
			System.out.print(colour.red);
			System.out.println("		INVALID CHOICE \n		PLEASE TRY AGAIN");
			payments(a,b,c,d,e,a1,a2,a3,a4,a5);
		}
	}
	double total_pay()
	{
		double base_fare=d;
		double surcharge=(0.2)*base_fare;
		double fuel_charge=(0.1)*base_fare;
		double ticket=(0.05)*base_fare;
		this.total_fare=d+surcharge+fuel_charge+ticket;
		return total_fare;
	}
	void receipt(String a,String b,String c,String d,String e,int a1,int a2,int a3,int a4,int a5)
	{
		System.out.print(colour.purple);
		System.out.println("                       		Plane E-Ticket              \n\n\n");
		System.out.print(colour.blue);
		System.out.println("	Flight Details    \n");
		System.out.println("	Route  \n\n");
		System.out.print(colour.yellow);
		System.out.println("	From 						Departure Date						Arrival Date  \n");
		System.out.print(colour.skblue);
		System.out.println("	"+this.DEPARTURE+"						   "+(this.dd+" "+(travel(this.mm))+"						  "+this.dd+" "+(travel(this.mm)+"\n")));
		System.out.print(colour.yellow);
		System.out.println("	To						Departure Time						Arrival Time\n");
		System.out.print(colour.skblue);
		System.out.println("	"+this.DESTINATION+"						    "+this.ar_time+" : 00		 				  "+this.de_time+" : 00\n");
		System.out.print(colour.yellow);
		System.out.println("	Seat Class					Extra Baggage Allowance	\n");
		System.out.print(colour.skblue);
		System.out.println("	"+this.fclass+" Class				     8 kg\n\n\n");
		if(this.trip==2)
		{
			System.out.print(colour.yellow);
			System.out.println("\n\n\n\n\n	Return ticket\n\n");
			System.out.print(colour.blue);
			System.out.println("	Flight Details    \n");
			System.out.println("	Route  \n\n");
			System.out.print(colour.yellow);
			System.out.println("	From 						Departure Date						Arrival Date  \n");
			System.out.print(colour.skblue);
			System.out.println("	"+this.DESTINATION+"						   "+(this.DD+" "+(travel(this.MM))+"						  "+this.DD+" "+(travel(this.MM)+"\n")));
			System.out.print(colour.yellow);
			System.out.println("	To						Departure Time						Arrival Time\n");
			System.out.print(colour.skblue);
			System.out.println("	"+this.DEPARTURE+"						     "+this.AR_TIME+" : 00  		 		       	     	"+this.DE_TIME+" : 00\n");
			System.out.print(colour.yellow);
			System.out.println("	Seat Class					Extra Baggage Allowance	\n");
			System.out.print(colour.skblue);
			System.out.println("	"+this.fclass+" Class				    8 kg\n\n\n\n");
		}
		System.out.print(colour.purple);
		System.out.println("					Plane Ticket Purchase		\n");
		System.out.print(colour.yellow);
		System.out.println("	Fare Breakdown\n");
		System.out.print(colour.skblue);
		System.out.println("		Base Fare			-	Rs "+this.d+"\n");
		System.out.println("		Passenger Service charge	-	Rs 0\n");
		System.out.printf("		Surcharge			-	Rs %.2f\n\n",(0.2)*this.d);
		System.out.printf("		Fuel Surcharge			-	Rs %.2f\n\n",(0.1)*this.d);
		System.out.printf("		Ticketing Service Charge        -	Rs %.2f\n\n",(0.05)*this.d);
		System.out.println("		Total Amount			-	Rs "+this.total_fare+"\n\n\n\n\n");
		System.out.print(colour.green);
		System.out.println("								THANKYOU FOR MAKING US YOUR AIRLINE CHOICE ! ");
		System.out.println("									  HAVE A SAFE FLIGHT!");
	}
	public static void main(String[]args)
	{
		flights obj=new flights();
		System.out.println(colour.yellow);
                System.out.println("		1 . Register");
                System.out.println("		2 . Login");
                System.out.print("	      	Enter one number : ");
		System.out.print(colour.blue);
                int choice = sc.nextInt();
                switch (choice)
                {
                        case 1: obj.registration(); break;
                       	case 2: 
			{
				System.out.print(colour.green);
				System.out.println("\n		YOUR USER ID : "+USER_ID);
				System.out.println("		YOUR PASSWORD :"+obj.PASSWORD);
				obj.pre_login(); 
				break;
			}
                        default:
			{
				System.out.println(colour.red);
                    		System.out.println("		Invalid choice. Please try again.");
				main(args);
			}
                }
	}
}