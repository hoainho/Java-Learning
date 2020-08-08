import java.util.Scanner;

class HOCSINH {
    String name;
    String birdday;
    String rollNo;
    String email;
    float averageMark;

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }
        else
        {
            System.err.println("Nhap sai vui long nhap lai (Example:  remalw@gmail.com)");
            return false;
        }
    }

    public float getAverageMark() {
        return averageMark;
    }

    public String getBirdday() {
        return birdday;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setAverageMark(float averageMark) {
        if(averageMark >= 0 && averageMark <= 10 )
        {
            this.averageMark = averageMark;
            return true;
        }
        else
        {
            System.err.println("Nhap sai diem trung binh (0 <= DIEM <=10) \t");
            return false;
        }
    }

    public void setBirdday(String birdday) {
        this.birdday = birdday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo != null && rollNo.length() == 7){
            this.rollNo = rollNo;
            return true;
        }
        else
        {
            System.err.println("Nhap sai vui long nhap lai (Example:  18DTHE2) \t");
            return false;
        }
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ho va ten sinh vien : ");
        name = input.nextLine();
        System.out.print("Nhap dia chi email :");
        while(true){
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if(check) {
                break;
            }
        }
        System.out.print("Nhap Nam sinh : ");
        birdday = input.nextLine();
        System.out.print("Nhap MSSV : ");
        while(true){
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if(check){
                break;
            }
        };
        System.out.print("Nhap Diem Trung Binh : ");
        while(true){
            float averageMarkInput = input.nextFloat();
            boolean check = setAverageMark(averageMarkInput);
            if(check){
                break;
            }
        }

    }
    public void output(){
        System.out.print("\n\tTEN : " + name + "\n\tMSSV :" + rollNo +"\n\tEMAIL :" + email + "\n\tDIEM TRUNG BINH :" +averageMark + "\n\tNAM SINH :" + birdday );
    }
    public boolean checkScholaship(){
        if(averageMark >= 8){
            return true;
        }
        return false;
    }
}
