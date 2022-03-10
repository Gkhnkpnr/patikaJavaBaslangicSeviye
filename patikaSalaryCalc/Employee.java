package com.company;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary > 1000.0){
            return this.salary * 0.03;
        }else{
            return 0;
        }
    }

    int bonus(){
        if (this.workHours > 40){
            int bonus = (workHours - 40)*30;
            return bonus;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        if (2021 - this.hireYear < 10){
            return this.salary * 0.05;
        }else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            return this.salary * 0.10;
        }else{
            return this.salary * 0.15;
        }
    }

    String printInfo(){
        String info = "Calisan bilgileri : \n" +
                "Adi : "+this.name +"\n" +
                "Maasi : "+this.salary +"\n"+
                "Calisma Saati : "+this.workHours+"\n"+
                "Baslangic Yili : "+this.hireYear+"\n"+
                "Vergi Tutari : "+tax()+"\n"+
                "Bonus Tutari : "+bonus()+"\n"+
                "Maas Artisi : "+raiseSalary()+"\n"+
                "Vergi ve Bonuslar ile Birlekte Maas : "+(this.salary + bonus() - tax())+"\n"+
                "Toplam Maas : "+(this.salary + (bonus()+raiseSalary()) - tax());
        return info;
    }


}
