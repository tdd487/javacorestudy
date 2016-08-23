package com.tdd.IO;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/8.
 */
public class TextFileTest {
    public static void main(String args[]){
        Employee[] e= new Employee[3];
        e[0] = new Employee("Fei XiaoZhu",5500,1989,12,27);
        e[1] = new Employee("Shou XiaoDong",6200,1990,06,05);
        e[2] = new Employee("Zhang DaPao",10000,1989,11,27);
    }
    private static void writeData(Employee[] employees, PrintWriter out){
        out.print(employees.length);
        for(Employee e:employees){
            writeEmployee(out, e);
        }
    }

    public static void writeEmployee(PrintWriter out,Employee e){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(e.getHireDay());
        out.println(e.getName()+"|"+e.getSalary()+"|"+calendar.get(Calendar.YEAR)+"|"+(calendar.get(Calendar.MONTH)+1)+
                "|"+calendar.get(Calendar.DAY_OF_MONTH));
    }

    public static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        int year = Integer.parseInt(tokens[2]);
        int month = Integer.parseInt(tokens[3]);
        int day = Integer.parseInt(tokens[4]);
        return  new Employee(name,salary,year,month,day);
    }
}
