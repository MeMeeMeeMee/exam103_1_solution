package main;

import exam.base.OrgUnit;
import exam.unit.Department;
import exam.unit.School;

public class MainOrgTest {
    public static void main(String[] args) {
        // ข้อ 3
        // สร้าง method 4 ตัว ที่มีการเรียกใช้งาน method ใน class ต่างๆ

        // ข้อ 3
        // test method ทุกตัวที่อยู่ใน class แม่ แล้วก็ไปใน class ลูก

        //testSchool();
        //testDepartment();
        testSchoolAsOrgUnit();
        //testDepartmentAsLoggable();
    }

    // ข้อ 3.1
    private static void testSchool(){ //tests that School objects work correctly as School.
        //test method ที่อยู่ใน class แม่ หมดแล้ว----------------------------------------------
        School school = new School(1, "KMUTT");
        System.out.println("getCode :"  + school.getCode());
        System.out.println("getName :"  + school.getName());
        school.setName("SIT");
        System.out.println("After setName :"  + school.getName());
        System.out.println("getLog :"  + school.getLog());
        school.clearLog();
        System.out.println("After clearLog :"  + school.getLog());

        //test method ที่อยู่ใน class ลูก หมดแล้ว----------------------------------------------
        System.out.println("getBalance :"  + school.getBalance());

        school.earn(10000D); //  ได้เงินมา 10,000 บาท
        System.out.println("After earn getBalance :"  + school.getBalance());
        System.out.println("After earn getLog :"  + school.getLog());

        school.spend(5000D); //  ใช้เงิน 5,000 บาท
        System.out.println("After spend getBalance :"  + school.getBalance());
        System.out.println("After spend getLog :"  + school.getLog());




    }

    // ข้อ 3.2
    private static void testDepartment(){ //tests that School objects work correctly as School.
        //สร้าง ตัวแปร
        School school = new School(1, "KMUTT");
        Department department = new Department(1, "KMUTT", school);

        //test method ที่อยู่ใน class แม่ หมดแล้ว----------------------------------------------

        System.out.println("getCode :"  + department.getCode());
        System.out.println("getName :"  + department.getName());
        department.setName("SIT");
        System.out.println("After setName :"  + department.getName());
        System.out.println("getLog :"  + department.getLog());
        department.clearLog();
        System.out.println("After clearLog :"  + department.getLog());

        //test method ที่อยู่ใน class ลูก หมดแล้ว----------------------------------------------
        System.out.println("getSchool :"  + department.getSchool().getName());
        School newSchool = new School(200, "Bangmod School");
        department.setSchool(newSchool);
        System.out.println("After setSchool getSchool :"  + department.getSchool().getName());
        System.out.println("After setSchool getLog :"  + department.getLog());


    }

    // ข้อ 3.3

    private static void testSchoolAsOrgUnit(){ //tests that School objects work correctly as OrgUnit.
        School school = new School(1, "Bangmod School");
        System.out.println("getCode :"  + school.getCode());
        System.out.println("getName :"  + school.getName());
        school.setName("SIT School");
        System.out.println("After setName :"  + school.getName());
        System.out.println("getLog :"  + school.getLog());
        school.clearLog();
        System.out.println("After clearLog :"  + school.getLog());

        //test method ที่อยู่ใน class ลูก หมดแล้ว----------------------------------------------
        System.out.println("getBalance :"  + school.getBalance());

        school.earn(10000D); //  ได้เงินมา 10,000 บาท
        System.out.println("After earn getBalance :"  + school.getBalance());
        System.out.println("After earn getLog :"  + school.getLog());

        school.spend(5000D); //  ใช้เงิน 5,000 บาท
        System.out.println("After spend getBalance :"  + school.getBalance());
        System.out.println("After spend getLog :"  + school.getLog());



        OrgUnit orgUnit = school;
        System.out.println("getCode :"  + orgUnit.getCode());
        System.out.println("getName :"  + orgUnit.getName());
        orgUnit.setName("SIT School");
        System.out.println("After setName :"  + orgUnit.getName());
        System.out.println("getLog :"  + orgUnit.getLog());
        orgUnit.clearLog();
        System.out.println("After clearLog :"  + orgUnit.getLog());

        //test method ที่อยู่ใน class ลูก หมดแล้ว----------------------------------------------
        System.out.println("getBalance :"  + ((School) orgUnit).getBalance());

        ((School) orgUnit).earn(10000D); //  ได้เงินมา 10,000 บาท
        System.out.println("After earn getBalance :"  + ((School) orgUnit).getBalance());
        System.out.println("After earn getLog :"  + orgUnit.getLog());

        ((School) orgUnit).spend(5000D); //  ใช้เงิน 5,000 บาท
        System.out.println("After spend getBalance :"  + ((School) orgUnit).getBalance());
        System.out.println("After spend getLog :"  + orgUnit.getLog());



    }

    // ข้อ 3.4
    private static void testDepartmentAsLoggable(){ //tests that Department objects work correctly as Loggable


    }


}
