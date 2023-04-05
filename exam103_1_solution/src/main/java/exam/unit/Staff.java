package exam.unit;

import exam.base.OrgUnit;

// ข้อ 4
// สร้าง class Staff ที่มี attribute 4 ตัว ทุกตัวเป็น private
// 1. id ที่เป็น int
// 2. firstname ที่เป็น String
// 3. lastname ที่เป็น String
// 4. affiliation ที่เป็น OrgUnit


// ข้อ 4.1--------------------------------------------------------------
public class Staff {
    private int id;
    private String firstname;

    private String lastname;

    private OrgUnit affiliation;

    //รับ constructor

    public Staff(int id, String firstname, String lastname, OrgUnit affiliation) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.affiliation = affiliation;
    }

    //สร้าง getter และ setter ทั้งหมด
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public OrgUnit getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(OrgUnit affiliation) {
        this.affiliation = affiliation;
    }




}
