class employee
{
    private int empid;
    public void setEmpid(int eid){
        empid=eid;
    }                                      //"set" and "get" creqt karte h
    public int getEmpid() {
        return empid;
    }
}
class company {
    public static void main(String[] args) {
        employee e=new employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}