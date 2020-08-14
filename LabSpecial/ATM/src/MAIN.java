import Components.Calculate;
import Constaint.Money;
import Introduce.myIntroduce;
public class MAIN {
    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        //Render
        Money m = new Money();
        Calculate render = new Calculate();
        render.inputMoney();
    }
}
