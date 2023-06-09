package main;

import exam.base.Group;
import exam.base.Loggable;
import exam.base.OrgUnit;
import exam.unit.Department;
import exam.unit.School;
import exam.unit.Staff;


public class MainOrgTest {
    public static void main(String[] args) {
        // ข้อ 3
        // สร้าง method 4 ตัว ที่มีการเรียกใช้งาน method ใน class ต่างๆ

        // ข้อ 3
        // test method ทุกตัวที่อยู่ใน class แม่ แล้วก็ไปใน class ลูก

//        testSchool();
//        testDepartment();
//        testSchoolAsOrgUnit();
//        testDepartmentAsLoggable();
//        testStaff();
          testDepartmentGroup();

    }
 // ข้อ 6
    private static void testDepartmentGroup() {
        //สร้าง object ของ DepartmentGroup ที่มี capacity เป็น 10
        Group<Department> departmentGroup = new Group<>(4);
        Department department1 = new Department(1,"IT",new School(1,"KMUTT"));
        Department department2 = new Department(2,"CS",new School(1,"KMUTT"));
        Department department3 = new Department(3,"IS",new School(1,"KMUTT"));
        Department department4 = new Department(4,"SE",new School(1,"KMUTT"));
        Department department5 = new Department(5,"EE",new School(1,"KMUTT"));
        Department department6 = new Department(6,"ME",new School(1,"KMUTT"));
        System.out.println("Append department1:" + departmentGroup.append(department1));
        System.out.println("Append department1:" + departmentGroup.append(department1));
        System.out.println("Append department2:" + departmentGroup.append(department2));
        System.out.println("Append department3:" + departmentGroup.append(department3));
        System.out.println("Append department4:" + departmentGroup.append(department4));
        System.out.println("Append department5:" + departmentGroup.append(department5));

        System.out.println("find(department3) : " + departmentGroup.find(department3));
        System.out.println("find(department6) : " + departmentGroup.find(department6));

        System.out.println("remove(department6) : " + departmentGroup.remove(department6));
        System.out.println("get(3):" + departmentGroup.get(3).getName());
        System.out.println("get(10):" + departmentGroup.get(10));

        for (int i=0; i<departmentGroup.getSize(); i++){
            Department department = departmentGroup.get(i);
            System.out.printf("(%d) %s - %s",department.getCode(),department.getName(),department.getSchool().getName());

        }




    }

    //ข้อ 4.2
    private static void testStaff() {
        //สร้าง object ของ Staff ที่มี affiliation เป็น School
        Staff staff = new Staff(1,"Meen","Kongkam",
                new School(1,"KMUTT"));

    //test ทุกตัว
        //getId
        System.out.println("getId :"  + staff.getId());
        staff.setId(100);
        System.out.println("After setId getId :"  + staff.getId());
        //getFirstname
        System.out.println("getFirstname :"  + staff.getFirstname());
        staff.setFirstname("Tester");
        System.out.println("After setFirstname getFirstname :"  + staff.getFirstname());
        //getLastname
        System.out.println("getLastname :"  + staff.getLastname());
        staff.setLastname("Jing Jing");
        System.out.println("After setLastname getLastname :"  + staff.getLastname());
        //getAffiliation
        System.out.println("getAffiliation :"  + staff.getAffiliation().getClass().getSimpleName());
        staff.setAffiliation(new Department(100,"IT",new School(2,"Bangna Shcool")));
        System.out.println("After setAffiliation getAffiliation :"  + staff.getAffiliation().getClass().getSimpleName());
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

        Loggable loggable = department;

        System.out.println("getLog : "  + loggable.getLog());
        loggable.clearLog();
        System.out.println("After clearLog getLog : "  + loggable.getLog());


    }


}
