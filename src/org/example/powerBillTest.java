package org.example;
import java.util.Scanner;
public class powerBillTest {
    public static void main(String[] args){
        powerConsumption pc = new powerConsumption();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of Electricity Supply:-");
        String PowerType = sc.next();
        System.out.println("Enter the Unit Consumption:-");
        int unitConsumption= sc.nextInt();
        System.out.println("The Electricity Bill For "+PowerType+" Of Unit "+unitConsumption+" is;- "+pc.powerPrice(PowerType, unitConsumption));

    }
}
