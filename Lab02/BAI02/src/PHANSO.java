

public class PHANSO {

    private int tu,mau;
    public PHANSO(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getTu() {
        return tu;
    }
    public void output(){
        System.out.print("\nPhan so : \t");
        System.out.println(tu + "/" + mau);
    }
    public int USCLN (int a , int b){
        while( a!= b)
        {
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return  a;
    }
    public void RutGon(){
        int i = USCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu() / i );
        this.setMau(this.getMau() /i );
    }
    public void CongPS( PHANSO ps){

        int ts = this.getTu() * ps.getMau() + this.getMau()* ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PHANSO Tong = new PHANSO(ts,ms);
        Tong.RutGon();
        System.out.print("\n\n\tTong hai phan so la : " + Tong.tu + "/" + Tong.mau );
    }
    public void TruPS( PHANSO ps){

        int ts = this.getTu() * ps.getMau() - this.getMau()* ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PHANSO Hieu = new PHANSO(ts,ms);
        Hieu.RutGon();
        System.out.print("\n\n\tHieu hai phan so la : " + Hieu.tu + "/" + Hieu.mau );
    }
    public void NhanPS( PHANSO ps){

        int ts = this.getTu() * ps.getTu() ;
        int ms = this.getMau() * ps.getMau();
        PHANSO Tich = new PHANSO(ts,ms);
        Tich.RutGon();
        System.out.print("\n\n\tTich hai phan so la : " + Tich.tu + "/" + Tich.mau );
    }
    public void ChiaPS( PHANSO ps){

        int ts = this.getTu() * ps.getMau() ;
        int ms = this.getMau() * ps.getTu();
        PHANSO Chia = new PHANSO(ts,ms);
        Chia.RutGon();
        System.out.print("\n\n\tChia hai phan so la : " + Chia.tu + "/" + Chia.mau );
    }
}
