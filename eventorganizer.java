package tugaspr;


//angga sukhapratama
//kelas1C
//mapel algoritma

public class eventorganizer {


    private int CUSTID;
    private String CUSTNAME;
    private String CUSTADDR;
    private String CUSTEMAIL;
    private int CUSTPHONE;


    public int getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(int CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTADDR() {
        return CUSTADDR;
    }

    public void setCUSTADDR(String CUSTADDR) {
        this.CUSTADDR = CUSTADDR;
    }

    public String getCUSTEMAIL() {
        return CUSTEMAIL;
    }

    public void setCUSTEMAIL(String CUSTEMAIL) {
        this.CUSTEMAIL = CUSTEMAIL;
    }

    public int getCUSTPHONE() {
        return CUSTPHONE;
    }

    public void setCUSTPHONE(int CUSTPHONE) {
        this.CUSTPHONE = CUSTPHONE;
    }

    public eventorganizer(){

    }

    public eventorganizer(int CUSTID, String CUSTNAME, String CUSTADDR, String EMAIL, int CUSTPHONE) {
        this.CUSTID = CUSTID;
        this.CUSTNAME = CUSTNAME;
        this.CUSTADDR = CUSTADDR;
        this.CUSTEMAIL = CUSTEMAIL;
        this.CUSTPHONE = CUSTPHONE;
    }

    public void PrintGuests(eventorganizer[]tamu){
        System.out.println("Daftar Tamu");
        for(int index = 0; index < tamu.length; index++){
            System.out.println(" ------tamu "+ (index+1) + "------");
            System.out.println(" nama ID: " + getCUSTID());
            System.out.println("Nama anda : " + getCUSTNAME());
            System.out.println("Alamat anda : " + getCUSTADDR());
            System.out.println("Email anda : " + getCUSTEMAIL());
            System.out.println(" no telephon : " + getCUSTPHONE());

        }
    }
//        public eventorganizer (){
//        this.CUSTID = 0;
//        this.CUSTNAME ="";


//        public void printguest (eventorganizer[] guests){
//            System.out.println("daftar kehadiran");
//        for (eventorganizer  guest : guests){
//            System.out.println("nama id "+ guest.getCUSTID());
//            System.out.println("nama anda "+ guest.getCUSTNAME());
//            System.out.println("alamat "+ guest.getCUSTADDR());
//            System.out.println("email "+ guest.getCUSTEMAIL());
//            System.out.println("no telephon "+ guest.getCUSTPHONE());
//            System.out.println();
//        }
//        }
//    void printguest() {
//        System.out.println("nama id : " + this.CUSTID);
//        System.out.println("Nama anda: " + this.CUSTNAME);
//        System.out.println("alamat    : " + this.CUSTADDR);
//        System.out.println("email    : " + this.CUSTEMAIL);
//        System.out.println("no telephon    : " + this.CUSTPHONE);
//    }
//
//    ArrayList<eventorganizer> printguest = new ArrayList<eventorganizer>();
//    void tambahtamu(eventorganizer data){
//        this.printguest.add(data);
//



    }




