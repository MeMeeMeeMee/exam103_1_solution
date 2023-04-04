package exam.base;

public abstract class OrgUnit implements Loggable{
    //ข้อ 1
    //การเพิ่ม Abstract Class ให้กับ OrgUnit
    //import ตัวลูกทั้ง2
    //นำตัวที่ ซ้ำในตัวลูก ทั้งสอง มาใส่ใน class แม่
    //แล้วลบตัวที่เหมือนกันออกจาก class ลูก


    //attributes------------------------------
    private final int code;
    private String name;
    protected String logging = "";


    //constructor-----------------------------
    public OrgUnit(int code, String name){
        this.code = code;
        this.name = name;
    }


    //methods---------------------------------
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override // ควรใส่ @Override ทุกครั้งเมื่อมี method ใน interface
    public String getLog() {
        return logging;
    }

    @Override //reset the existing logging to an empty string. empty string คือ
    public void clearLog() {
        this.logging = "";
    }

}
