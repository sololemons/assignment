package org.example;

public class assignment {
    public static  void main (String[]args){

        String RegNo="C026-01-0909/2022";
        Long Telephone=01001000100L;
        String Namei="Ngandu Solomon ndimu";
        String date1="28/04/2020";


        int Qty=4;
        int Qty1=10;
        int Qty2=9;
        int Qty3=10;


        int UnitPrice=20;
        int UnitPrice1=50;
        int UnitPrice2=30;
        int UnitPrice3=80;




        int amount=   Qty*UnitPrice;
        int amount1=   Qty1*UnitPrice1;
        int amount2=   Qty2*UnitPrice2;
        int amount3=   Qty3*UnitPrice3;

float Vate = 0.16F;
        int Sub_Total  = amount + amount1 +amount2 + amount3;
        int Vat= (int) (Vate * Sub_Total);
        int Total= Sub_Total+Vat;

        String Item="Pencil";
        String Item1="Duster";

        String Item2="Pens";
         String Item3="Crayons";



        System.out.println("**************Adamson Computers Ltd ***********************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla..  Quezon City  * Tel No :123-4567");
        System.out.println("                 VAT REG. TIN 908-765-4321-0000         ");
        System.out.println("                          SALES INVOICE    ");
        System.out.println("");
        System.out.println("");

        System.out.println("Sold to:"+RegNo    +"                               "+     "Date:" +date1                );
        System.out.println("Address:"+Namei     +"                               "+     "Contact Number:"+Telephone       );
        System.out.println("========================================================================================================");
        System.out.println("Qty               |   Item Description          |  Unit Price                       |Amount   ");
        System.out.println("========================================================================================================");

        System.out.println(Qty +"                 "+ "|"  +Item +"                       "+"|"+UnitPrice +"                                 "+"|" +amount  );
        System.out.println(Qty1 +"                "+ "|"  +Item1 +"                       "+"|"+UnitPrice1 +"                                 "+"|" +amount1  );
        System.out.println(Qty2 +"                 "+ "|"  +Item2 +"                         "+"|"+UnitPrice2 +"                                 "+"|" +amount2  );
        System.out.println(Qty3 +"                "+ "|"  +Item3 +"                      "+"|"+UnitPrice3 +"                                 "+"|" +amount3  );


        System.out.println("==========================================================================================================");
        System.out.println("                                                                            |Sub Total    |"     + Sub_Total  );
        System.out.println("                                                                            |=================================== ");
        System.out.println("                                                                            |VAT(16%)     |"     + Vat     );
        System.out.println("                                                                            |====================================");
        System.out.println("                                                                            |Total Amount |"    + Total);
        System.out.println("                                                                            |===================================== ");

    }
}
