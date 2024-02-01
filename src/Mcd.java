public class Mcd {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calculoMCD(){

        int x = Math.max(num1, num2);
        int y = Math.min(num1, num2);

        int resultado = 0;
        do {
            resultado = y;
            y = x % y;
            x = resultado;
        } while (y != 0);

        return resultado;
    }
}
