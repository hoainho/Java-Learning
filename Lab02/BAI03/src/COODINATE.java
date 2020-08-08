public class COODINATE {
    int x =0 ,y =0;

    public void COODINATE(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void Tong (COODINATE td){
        int TongX = this.getX() + td.getX();
        int TongY = this.getY() + td.getY();

    }

}
