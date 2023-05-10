import java.util.Scanner;
import java.util.ArrayList;

class account{
    Scanner input;
    private long stk;
    private String ttk;
    private double sotien;
    private String trangthai;
    public account(long stk, String ttk, double sotien, String trangthai){
        this.stk = stk;
        this.ttk = ttk;
        this.sotien = sotien;
        this.trangthai = trangthai;
    }
    public long getstk(){
        return stk;
    }
    public void setstk(long stk){
        this.stk = stk;
    }
    public String getttk(){
        return ttk;
    }
    public void setttk(String ttk){
        this.ttk = ttk;
    }
    public double getsotien(){
        return sotien;
    }
    public void setsotien(double sotien){
        this.sotien = sotien;
    }
    public String gettrangthai(){
        return trangthai;
    }
    public void settrangthai(String trangthai){
        this.trangthai = trangthai;
    }
    public String toString(){
        return "Tai khoan [So tai khoan: " + stk + ", Ten tai khoan: " + ttk + ", So tien: " + sotien
                + ", Trang thai: " + trangthai + "]";
    }
    public void nap(){
        input = new Scanner(System.in);
        int tiennap;
        System.out.println("Tien nap: ");
        tiennap = input.nextInt();
        sotien += tiennap;
    }
    public void rut(){
        input = new Scanner(System.in);
        int tienrut;
        System.out.println("Tien rut: ");
        tienrut = input.nextInt();
        sotien -= tienrut;
    }
}
class listaccount{
    ArrayList<account> listaccount;
    Scanner input;
    account ac;
    int chon;
    public listaccount(){
        listaccount = new ArrayList<>();
        input = new Scanner(System.in);
    }
    public void nhap(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.println("1: Them tai khoan ngan hang");
            System.out.println("2: Nap tien");
            System.out.println("3: Rut tien");
            System.out.println("0: Thoat");
            chon = input.nextInt();
            switch(chon){
            case 1:
            {
                long stk;
                String ttk;
                double sotien;
                String trangthai;
                System.out.println("Nhap so tai khoan: ");
                stk = input.nextLong();
                System.out.println("Nhap ten tai khoan: ");
                input.nextLine();
                ttk = input.nextLine();
                System.out.println("Nhap so tien: ");
                sotien = input.nextDouble();
                System.out.println("Nhap trang thai: ");
                input.nextLine();
                trangthai = input.nextLine();
                ac = new account(stk, ttk, sotien, trangthai);
                listaccount.add(ac);
                System.out.println("Them tai khoan thanh cong");
            }
                break;
                
            case 2:
            {
                for(account ac : listaccount){
                    ac.nap();
                }
            }
                break;
                
            case 3:
            {
                for(account ac : listaccount){
                    ac.rut();
                }
            }
                break;
            }
        }
    }
    public void in(){
        for(account ac : listaccount){
            System.out.println(ac.toString());
        }
    }
}
class Main{
    public static void main(String[]args){
        listaccount lac = new listaccount();
        lac.nhap(3);
        lac.in();
    }
}