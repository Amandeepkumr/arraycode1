package TestPK;
import java.util.Scanner;
public class Aman
{
public static void main(String args[])
{
String[][] empTable = new String[][] 
{

{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},

{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},

{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},

{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},

{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},

{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},

{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
};
String[][] daTable = new String[][] {

{"e", "Engineer", "20000"},

{"c", "Consultant", "32000"},

{"k", "Clerk", "12000"},

{"r", "Receptionist", "15000"},

{"m", "Manager", "40000"}
};
Scanner sc= new Scanner(System.in);
System.out.println("Amandeep Kumar");
System.out.println("18BCS2040");
System.out.print("Enter employee code- ");
    int EmpNo= sc.nextInt();
int rowSize = empTable.length;
int flag=-1;
for (int i = 0; i < rowSize; i++) {
if (EmpNo == Integer.parseInt(empTable[i][0])) {
        flag=i;
break;
      }}
  if(flag!=-1){
System.out.println("Emp No Emp Name Department Designation Salary");
String des="";
int da=0;
int basic=Integer.parseInt(empTable[flag][5]);
int hra=Integer.parseInt(empTable[flag][6]);
int it=Integer.parseInt(empTable[flag][7]);
for(int i=0;i<daTable[0].length;i++)
if(empTable[flag][3]==daTable[i][0]){
des=daTable[i][1];
da=Integer.parseInt(daTable[i][2]);
break;
}
int totalSal=da+basic+hra-it;
    switch(flag)
    {
    case 0: System.out.println(empTable[0][0]+"   "+empTable[0][1]+"    "+empTable[0][4]+"      "+des+"     "+totalSal); break;
    case 1: System.out.println(empTable[1][0]+"   "+empTable[1][1]+"    "+empTable[1][4]+"      "+des+"     "+totalSal); break;
    case 2: System.out.println(empTable[2][0]+"   "+empTable[2][1]+"    "+empTable[2][4]+"      "+des+"     "+totalSal); break;
    case 3: System.out.println(empTable[3][0]+"   "+empTable[3][1]+"    "+empTable[3][4]+"      "+des+"     "+totalSal); break;
    case 4: System.out.println(empTable[4][0]+"   "+empTable[4][1]+"    "+empTable[4][4]+"      "+des+"     "+totalSal); break;
    case 5: System.out.println(empTable[5][0]+"   "+empTable[5][1]+"    "+empTable[5][4]+"      "+des+"     "+totalSal); break;
    case 6: System.out.println(empTable[6][0]+"   "+empTable[6][1]+"    "+empTable[6][4]+"      "+des+"     "+totalSal); break;
    default: System.out.println("There is no employee with empid : "+EmpNo); break;
    }
  }
else{
System.out.println("There is no employee with empid : "+EmpNo);

    }
  }
}
