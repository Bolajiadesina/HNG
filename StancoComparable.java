/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stancouniv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StancoComparable {

    int option;
    int choose, deci;
    String name;
    Double age;
    Date dateofreg;
    String nm, ag, dt;
    Pattern mypattern;
    StancoPattern sp;
    StancoSortByAge sba;
    StancoSortByName sbn;
    StancoSortByDateOfReg sbd;

    public void StancoComparable() {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Welcome to Stanco University");
        System.out.println("");
        System.out.println("Press 1 to enter student information");
        System.out.println("Press 2 to view Student Lists");

        option = scan.nextInt();

        switch (option) {
            case 1:
                AddInfo();
            case 2:
                ViewStudent();

                ArrayList<StancoUni> stancoList = new ArrayList();

                StancoUni s1 = new StancoUni("Adesina", 20, new Date("02/01/2014"));
                StancoUni s2 = new StancoUni("Adesanya", 27, new Date("09/06/2015"));
                StancoUni s3 = new StancoUni("Buhari", 25, new Date("07/04/2011"));
                StancoUni s4 = new StancoUni("Atiku", 24, new Date("25/12/2014"));
                StancoUni s5 = new StancoUni("Sowore", 26, new Date("14/06/2018"));
                StancoUni s6 = new StancoUni("Duke", 22, new Date("30/03/2016"));
                StancoUni s7 = new StancoUni("Trump", 26, new Date("82/01/2015"));

                stancoList.add(s1);
                stancoList.add(s2);
                stancoList.add(s3);
                stancoList.add(s4);
                stancoList.add(s5);
                stancoList.add(s6);
                stancoList.add(s7);

                ListIterator iterator = stancoList.listIterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());

                }

                StancoUni stanco = (StancoUni) iterator.next();
                Collections.sort(stancoList, new StancoSortByName());
                System.out.println("List of Student sort By Name \n");

                iterator = stancoList.listIterator();
                while (iterator.hasNext());
                 {
                    System.out.println(iterator.next());

                    System.out.println(stanco);
                }

                Collections.sort(stancoList, new StancoSortByAge());
                System.out.println("List of Student sort By Name \n");

                iterator = stancoList.listIterator();
                while (iterator.hasNext());
                 {
                    System.out.println(iterator.next());

                    System.out.println(stanco);

                }

                Collections.sort(stancoList, new StancoSortByDateOfReg());
                System.out.println("List of Student sort By Name \n");

                iterator = stancoList.listIterator();
                while (iterator.hasNext());
                 {
                    System.out.println(iterator.next());

                    System.out.println(stanco);
                }

        }

    }

    public void AddInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        nm = sc.next();
        System.out.println("Enter you date of Birth ");
        sp = new StancoPattern();
        ag = sc.next();
        System.out.println("Enter Date of Registration ");
        Dateofreg();

    }

    public void Dateofreg() {
        Scanner scanner = new Scanner(System.in);
        String patternString = "([0-9])+([0-9])+([0-9])";
        System.out.println("Date of Registration (dd:mm:yyyy)");

        String valiDateReg = scanner.next();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(valiDateReg);
        int i = 5;

        if (matcher.matches()) {
            System.out.println(" Registration is Successful");

        } else {

            System.out.println("Please Enter the Correct Format");
        }

        StancoComparable();

    }

    public void ViewStudent() {
        Scanner ma = new Scanner(System.in);
        System.out.println("Enter 1 View Student Sorted by Name");
        System.out.println("Enter 2 View Student Sorted by Age");
        System.out.println("Enter 3 View Student Sorted by Date of Registration");

        deci = ma.nextInt();
        switch (deci) {
            case 1:
                sbn = new StancoSortByName();
            case 2:
                sba = new StancoSortByAge();
            case 3:
                sbd = new StancoSortByDateOfReg();
                break;

        }

    }

    public static void main(String[] args) {
        StancoComparable st = new StancoComparable();

        st.StancoComparable();

    }

}
