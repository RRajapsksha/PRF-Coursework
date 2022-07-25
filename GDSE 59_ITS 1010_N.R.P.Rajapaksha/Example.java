import java.util.Scanner;

class Example{

    static int count = -1;
    static String sId[] = new String[100];
    static String sName[] = new String[100];
    static int sPrMark[][] = new int [100][1];
    static int sPrMark2[][] = new int [100][1];    
    static int sDbMarks[][] = new int [100][1];
    static int sDbMarks2[][] = new int [100][1];
    static int stuTotal[][] = new int[100][1];
    static double stuAvg[][] = new double[100][1];
    static int rank[] = new int [100];

    public static void main(String[] args){

        mainMenu ();

    }


    public static void mainMenu(){



        Scanner input = new Scanner(System.in);

        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
        System.out.println(" [1] Add New Student \t\t\t\t [2] Add New Student With Marks");
        System.out.println(" [3] Add Marks \t\t\t\t\t [4] Update Student Details");
        System.out.println(" [5] Update Marks \t\t\t\t [6] Delete Student");
        System.out.println(" [7] Print Student Details \t\t\t [8] Print Student Ranks");
        System.out.println(" [9] Best in Programming Fundamentals \t\t [10] Best in Data Managment System");

        System.out.println();

        System.out.print(" Enter an option to continue > ");
        int option = input.nextInt();

        clearConsole();

        switch(option){

            case 1 :
                addStudent();
                break;

            case 2 :
                addStunMarks();
                break;
            case 3 :
                addMarks();
                break;
            case 4 :
                updateStDetails();
                break;
            case 5 :
                updateMarks();
                break;
            case 6 :
                deleteStudent();
                break;
            case 7 :
                printStuDetails();
                break;
            case 8 :
				printRank();
				break;
			case 9 : 
				bestPrf();
				break;
			case 10 :
				bestDbms();
				break;
        }
    }

    public static void addStuHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tADD NEW STUDENT\t\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void addStuWithMarkHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" |\t\t\t\t\t\tADD NEW STUDENT WITH MARKS\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void addMarkHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" |\t\t\t\t\t\tADD MARKS\t\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void updateStDetailsHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" |\t\t\t\t\t\tUPDATE STUDENT DETAILS\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void updateMarkHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tUPDATE MARKS\t\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void deleteStuHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tDELETE STUDENT\t\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }

    public static void printStuDetailHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }
    
     public static void printRankHead(){
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tPRINT STUDENTS' RANK\t\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
    }
    
    public static void bestPrfHead(){
		System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
	}
	
    public static void bestDbmsHead(){
		System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");
        System.out.println(" | \t\t\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t\t\t  |");
        System.out.println(" ------------------------------------------------------------------------------------------------------------------  ");

        System.out.println();
	}



    // Option 01
    public static void addStudent(){

        Scanner input = new Scanner(System.in);


        addStuHead();

        boolean a = false;
        char op = 'a';


        for (int i = count+1; i< sId.length; i++) {
            System.out.print(" Enter Student ID : ");
            sId[i] = input.next();




            int temp = 0;
            for (int j = temp; j<i; j++) {
                if (sId[i].equals(sId[j])){
                    System.out.println(" The Student ID already exists");
                    System.out.println();
                    a = true;
                }
            }

            if (a){
                i--;
                a = false;
            }else {
                System.out.print(" Enter Student Name : ");
                sName[i] = input.next();

                System.out.println();
                System.out.println();

                System.out.print("Student has been added successfully. Do you want to add a new student (Y/n) : ");
                op=input.next().charAt(0);
                clearConsole();

                if(op=='Y' || op=='y'){
                    clearConsole();
                    addStuHead();
                }else if(op=='N' || op=='n'){
                    count = i;
                    mainMenu ();
                }




            }


        }



    }

    // Option 02
    public static void addStunMarks(){

        Scanner input = new Scanner(System.in);


        addStuWithMarkHead();

        boolean a = false;
        boolean b = false;
        char op = 'a';

        for (int i = count+1; i< sId.length; i++) {
            System.out.print(" Enter Student ID : ");
            sId[i] = input.next();



            int temp = 0;
            for (int j = temp; j<i; j++) {
                if (sId[i].equals(sId[j])){
                    System.out.println(" The Student ID already exists");
                    System.out.println();
                    a = true;
                }
            }

            if (a){
                i--;
                a = false;
            }else {
                System.out.print(" Enter Student Name : ");
                sName[i] = input.next();
                System.out.println();
                System.out.println();

                for (int j = 0; j<1; j++) {
                    System.out.print("Programming Fundamental Marks : ");
                    sPrMark[i][j] = input.nextInt();


                    if (sPrMark[i][j] > 100 || sPrMark[i][j] < 0) {
                        System.out.println("Invalid marks, please enter correct marks.");
                        System.out.println();
                        j--;
                    }
                }

                for (int j = 0; j<1; j++) {
                    System.out.print("Database Management System Marks : ");
                    sDbMarks[i][j] = input.nextInt();

                    if (sDbMarks[i][j] > 100 || sDbMarks[i][j] < 0) {
                        System.out.println("Invalid marks, please enter correct marks.");
                        System.out.println();
                        j--;
                    }
                }
                System.out.println();
                System.out.print("Student has been added successfully. Do you want to add a new student (Y/n) : ");
                op=input.next().charAt(0);
                clearConsole();

                if(op=='Y' || op=='y'){
                    clearConsole();
                    addStuWithMarkHead();
                }else if(op=='N' || op=='n'){
                    count = i;
                    mainMenu ();
                }


            }



        }

    }

    // Option 03
    public static void addMarks(){

        Scanner input = new Scanner(System.in);

        addMarkHead();

		int condition = 0;
        char op = 'a';

        for (int i = 0; i< sId.length; i++){

            System.out.print("Enter Student ID : ");
            String id = input.next();

			for (int x = 0; x< sId.length; x++){
            if (id.equals(sId[x])){
				condition = 1;
                System.out.println("Student Name : " + sName[x]);
                System.out.println();
                System.out.println();

                if (sPrMark[x][0] != 0){
                    System.out.println("This student's marks have been already added. \nIf you want to update the marks, please use [4] Update Marks option.");
                    System.out.println();
                    System.out.println();
                    System.out.print("Do you want to add marks for another student? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        //i = 0;
                        clearConsole();
                        addMarkHead();
                    }else if(op=='N' || op=='n'){
                        mainMenu ();
                    }
                }else{
                    for (int j = 0; j<1; j++) {
                        System.out.print(" Programming Fundamental Marks    : ");
                        sPrMark[i][j] = input.nextInt();


                        if (sPrMark[i][j] > 100 || sPrMark[i][j] < 0) {
                            System.out.println("Invalid marks, please enter correct marks.");
                            System.out.println();
                            j--;
                        }
                    }

                    for (int j = 0; j<1; j++) {
                        System.out.print(" Database Management System Marks : ");
                        sDbMarks[i][j] = input.nextInt();

                        if (sDbMarks[i][j] > 100 || sDbMarks[i][j] < 0) {
                            System.out.println("Invalid marks, please enter correct marks.");
                            System.out.println();
                            j--;
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.print("Marks have been added. Do you want to add marks for another student? (Y/n) ");
                    op=input.next().charAt(0);


                    if(op=='Y' || op=='y'){

                        clearConsole();
                        //i = 0;
                        addMarkHead();
                    }else if(op=='N' || op=='n'){
                        clearConsole();
                        mainMenu ();
                    }
                }
            }
		}
            if(condition == 0){
                System.out.print("Invalid Student ID. Do you want to search again? (Y/n) ");
                op=input.next().charAt(0);


                if(op=='Y' || op=='y'){
                    //i = 0;
                    System.out.println();
                    System.out.println();
                }else if(op=='N' || op=='n'){
                    clearConsole();
                    mainMenu ();
                }
            }
        }
    }

    // Option 04
    public static void updateStDetails(){
        Scanner input = new Scanner(System.in);

        updateStDetailsHead();

		int condition = 0;
        char op = 'a';

        for (int i = 0; i< sId.length; i++){

            System.out.print(" Enter Student ID : ");
            String id = input.next();

			for (int x = 0; x < sId.length; x++){
				if (id.equals(sId[x])){
					condition = 1;
					System.out.println(" Student name     : " + sName[x]);
					System.out.println();
					System.out.println();
					System.out.print(" Enter the new student name : ");
					sName[x] = input.next();
					System.out.println();
					System.out.print("Student details has been updated successfully. \nDo you want to update another student details? (Y/n) ");
					op=input.next().charAt(0);
						clearConsole();

					if(op=='Y' || op=='y'){
						i = 0;
						updateStDetailsHead();
						System.out.println();
					}else if(op=='N' || op=='n'){
						mainMenu ();
					}
				 }				
			}
			
				if(condition == 0){
                System.out.print(" Invalid Student ID. Do you want to search again? (Y/n) ");
                op=input.next().charAt(0);


                if(op=='Y' || op=='y'){
                    //i = 0;
                    System.out.println();
                    System.out.println();
                }else if(op=='N' || op=='n'){
                    mainMenu ();
                }
            
			
		}

        }
    }

    // Option 05
    public static void updateMarks(){

        Scanner input = new Scanner(System.in);

        updateMarkHead();

		int condition = 0;
        char op = 'a';

        for (int i = 0; i < sId.length; i++){

            System.out.print(" Enter Student ID : ");
            String id = input.next();

			for (int m = 0; m < sId.length; m++){
            if(id.equals(sId[m])){
				condition = 1;
                if(sPrMark[m][0] != 0){
                    System.out.println(" Student Name     : " + sName[m]);
                    System.out.println();
                    System.out.println();
                    System.out.println(" Programming Fundamental Marks    : " + sPrMark[m][0]);
                    System.out.println(" Database Management System Marks : " + sDbMarks[m][0]);
                    System.out.println();

                    for(int x = 0; x<1; x++){
                        System.out.print(" Enter new Programming Fundamental Marks    : ");
                        sPrMark[m][0] = input.nextInt();


                        if (sPrMark[m][0] > 100 || sPrMark[m][0] < 0) {
                            System.out.println("Invalid marks, please enter correct marks.");
                            System.out.println();
                            x--;
                        }

                    }

                    for(int x = 0; x<1; x++){
                        System.out.print(" Enter new Database Management System Marks : ");
                        sDbMarks[m][0] = input.nextInt();

                        if (sDbMarks[m][0] > 100 || sDbMarks[m][0] < 0) {
                            System.out.println(" Invalid marks, please enter correct marks.");
                            System.out.println();
                            x--;
                        }
                    }
                    System.out.println();
                    System.out.print(" Marks have been updated successfully. \n Do you want to update marks for another student? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        i = 0;
                        updateMarkHead();
                        System.out.println();

                    }else if(op=='N' || op=='n'){
                        mainMenu ();
                    }
                }else{
                    System.out.println();
                    System.out.println(" This student's marks yet to be added.");
                    System.out.print(" Do you want to update the marks of another student? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        i = 0;
                        updateMarkHead();
                        System.out.println();

                    }else if(op=='N' || op=='n'){
                        mainMenu ();
                    }
                }

            }				
			}
			

            if(condition == 0){
                System.out.print(" Invalid Student ID. Do you want to search again? (Y/n) ");
                op=input.next().charAt(0);


                if(op=='Y' || op=='y'){
                    //i = 0;
                    System.out.println();
                    System.out.println();
                }else if(op=='N' || op=='n'){
                    mainMenu ();
                }
            }
        }

    }

    // Option 06
    public static void deleteStudent(){

        Scanner input = new Scanner(System.in);

        deleteStuHead();

		int condition = 0;
        char op = 'a';

        for (int x = 0; x < sId.length; x++){

            System.out.print(" Enter Student ID : ");
            String id = input.next();
			
			for (int i = 0; i < sId.length; i++){
            if(id.equals(sId[i])){
				condition = 1;
                sId[i] = null;
                sName[i] = null;
                sPrMark[i][0] = 0;
                sDbMarks[i][0] = 0;
                System.out.print(" Student has been deleteed successfully. \n Do you want to delete another student? (Y/n) ");
                op=input.next().charAt(0);
                clearConsole();

                if(op=='Y' || op=='y'){
                    i = 0;
                    deleteStuHead();
                    System.out.println();

                }else if(op=='N' || op=='n'){
                    mainMenu ();
                }
            }				
			}
			
				if(condition == 0){
                System.out.print(" Invalid student ID. Do you want to search again? (Y/n) ");
                op=input.next().charAt(0);
                clearConsole();

                if(op=='Y' || op=='y'){
                    
                    deleteStuHead();
                    System.out.println();

                }else if(op=='N' || op=='n'){
                    mainMenu ();
                }
            }

        }
    }

   // Option 07
    public static void printStuDetails(){
        Scanner input = new Scanner(System.in);

        printStuDetailHead();

		int condition = 0;
        char op = 'a';



			for (int i = 0; i < sId.length; i++){

            stuTotal[i][0] = sPrMark[i][0] + sDbMarks[i][0];
            stuAvg[i][0] = stuTotal[i][0]/2;
		}

            for (int j = 0; j< rank.length; j++) {
				
                rank[j] = sPrMark[j][0] + sDbMarks[j][0];
                
            }
            
            int temp;
            for (int x = 0; x < rank.length; x++) {
                for (int j = x + 1; j < rank.length; j++) {

                    if (rank[x] < rank[j]) {
                        temp = rank[x];
                        rank[x] = rank[j];
                        rank[j] = temp;
                    }
                }
            }
            

            for (int m = 0; m< rank.length; m++) {
				System.out.print(" Enter Student ID : ");
				String id = input.next();
				
				for (int i = 0; i < sId.length; i++){
					
					
					if(id.equals(sId[i])){
						
						if(sPrMark[i][0] != 0){

						System.out.println(" Student Name : " + sName[i]);
						System.out.println(" +------------------------------------+-------------------------+");
						System.out.println(" | Programming Fundamentals Marks     |                       " + sPrMark[i][0] + "|");
						System.out.println(" | Database Management System Marks   |                       " + sDbMarks[i][0] + "|");
						System.out.println(" | Total Marks                        |                      " + stuTotal[i][0] + "|");
						System.out.println(" | Total Average                      |                     " + stuAvg[i][0] + "|");
						
						for (int x = 0; x < rank.length; x++){
							if(stuTotal[i][0] == rank[x]){
                            System.out.println(" | Rank                               |                    " + (x+1) + "    |");								
							}
							
						}
						
						System.out.println(" +------------------------------------+-------------------------+");
						System.out.println();
						System.out.print(" Do you want to search again? (Y/n) ");
						op=input.next().charAt(0);
						clearConsole();

						if(op =='Y' || op=='y'){
							printStuDetailHead();
							System.out.println();
							break;
						}else if(op=='N' || op=='n'){
							mainMenu ();
						}
						}else{
							System.out.print(" Marks yet to be added. \n\n Do you want to search another student? (Y/n) ");
							op=input.next().charAt(0);
							clearConsole();

							if(op=='Y' || op=='y'){
								i = 0;
								printStuDetailHead();
								System.out.println();

							}else if(op=='N' || op=='n'){
								mainMenu ();
							}
						}
					}
					
				}
			}
            
		}

	// Option 08
	public static void printRank(){
		
		Scanner input = new Scanner(System.in);
		printRankHead();
        char op = 'a';

         System.out.println(" +---------------+---------------+---------------+-------------+-----------+");
         System.out.println(" |\tRank\t |\tID\t |\tName\t | Total Marks | Avg. Marks|"); 
         System.out.println(" +---------------+---------------+---------------+-------------+-----------+"); 

			for (int m = 0; m < rank.length; m++) {
				stuTotal[m][0] = sPrMark[m][0] + sDbMarks[m][0];
				stuAvg[m][0] = stuTotal[m][0]/2;
			}

            for (int j = 0; j< rank.length; j++) {
                rank[j] = sPrMark[j][0] + sDbMarks[j][0];
            }
            int temp;

            for (int x = 0; x < rank.length; x++) {

                for (int j = x + 1; j < rank.length; j++) {

                    if (rank[x] < rank[j]) {
                        temp = rank[x];
                        rank[x] = rank[j];
                        rank[j] = temp;
                    }
                }
            }
 
                    
                    for (int m = 0; m < rank.length; m++) {      
					for (int x = 0; x < rank.length; x++) {
						
                        if (rank[m]==stuTotal[x][0] && sPrMark[x][0] != 0) {
						
						System.out.println(" |\t"+(m+1)+"\t |\t"+sId[x]+"\t |\t"+sName[x]+"\t |\t"+stuTotal[x][0]+"    |   "+stuAvg[x][0]+"    |");
						System.out.println(" +---------------+---------------+---------------+-------------+-----------+");
                            
                        }
                    }
				                  
                   }
                    System.out.println();
                    System.out.println();
                    System.out.print(" Do you want to go back to main menu? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        mainMenu ();
                    }else if(op=='N' || op=='n'){
                        
                    }
            
            
        }		
	
	// Option 09
	public static void bestPrf(){
			Scanner input = new Scanner(System.in);
			bestPrfHead();
			char op = 'a';
        	
				int temp;
				for (int m = 0; m < rank.length; m++) {
					temp = sPrMark[m][0];
					sPrMark2[m][0] = temp;
				}
				
				int temp2;
				for (int x = 0; x < rank.length; x++) {

					for (int j = x + 1; j < rank.length; j++) {

						if (sPrMark2[x][0] < sPrMark2[j][0]) {
							temp2 = sPrMark2[x][0];
							sPrMark2[x][0] = sPrMark2[j][0];
							sPrMark2[j][0] = temp2;
						}
					}
					//System.out.print( sPrMark2[x][0] + " , ");
				}

            
				System.out.println(" +---------------+---------------+-------------+-----------+");
				System.out.println(" |\tID\t |\tName\t | PRF Marks   | DBMS Marks|"); 
				System.out.println(" +---------------+---------------+-------------+-----------+");  
				 
				for (int i = 0; i < sId.length; i++){
					for (int x = 0; x < sId.length; x++){
						if(sPrMark2[i][0] == sPrMark[x][0] && sDbMarks[x][0] != 0){
							 
								System.out.println(" |\t"+sId[x]+"\t |\t"+sName[x]+"\t |\t"+sPrMark2[i][0]+"     |   "+sDbMarks[x][0]+"      |");
								System.out.println(" +---------------+---------------+-------------+-----------+");
								
						}
					}
					 
				}
		           System.out.println();
                    System.out.println();
                    System.out.print(" Do you want to go back to main menu? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        mainMenu ();
                    }else if(op=='N' || op=='n'){
                        
                    }
	}

	// Option 10
	public static void bestDbms(){
			Scanner input = new Scanner(System.in);
			bestDbmsHead();
			char op = 'a';
        	
				int temp;
				for (int m = 0; m < rank.length; m++) {
					temp = sDbMarks[m][0];
					sDbMarks2[m][0] = temp;
				}
				
				int temp2;
				for (int x = 0; x < rank.length; x++) {

					for (int j = x + 1; j < rank.length; j++) {

						if (sDbMarks2[x][0] < sDbMarks2[j][0]) {
							temp2 = sDbMarks2[x][0];
							sDbMarks2[x][0] = sDbMarks2[j][0];
							sDbMarks2[j][0] = temp2;
						}
					}
					//System.out.print( sPrMark2[x][0] + " , ");
				}

            
				System.out.println(" +---------------+---------------+-------------+-----------+");
				System.out.println(" |\tID\t |\tName\t | DBM Marks   | PRF Marks |"); 
				System.out.println(" +---------------+---------------+-------------+-----------+");  
				 
				for (int i = 0; i < sId.length; i++){
					for (int x = 0; x < sId.length; x++){
						if(sDbMarks2[i][0] == sDbMarks[x][0] && sPrMark[x][0] != 0){
							 
								System.out.println(" |\t"+sId[x]+"\t |\t"+sName[x]+"\t |\t"+sDbMarks2[i][0]+"     |   "+sPrMark[x][0]+"      |");
								System.out.println(" +---------------+---------------+-------------+-----------+");
								
						}
					}
					 
				}
		           System.out.println();
                    System.out.println();
                    System.out.print(" Do you want to go back to main menu? (Y/n) ");
                    op=input.next().charAt(0);
                    clearConsole();

                    if(op=='Y' || op=='y'){
                        mainMenu ();
                    }else if(op=='N' || op=='n'){
                        
                    }
	}


    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();

        }
    }

}

