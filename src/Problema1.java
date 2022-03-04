
public class Problema1 {

    private int min = 1;
    private int max = 20;

    public Problema1(){}

    public Problema1(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String problema1(int min, int max){
        String texto = "";

        for (int i = min; i <= max; i++){
            if(i % 3 == 0){
                texto += "Fizz";
            }
            else if (i % 5 == 0){
                texto += "Buzz";
            }
            if (i % 5 == 0 && i % 3 == 0){
                texto += "FizzBuzz";
            }
            else{
                texto += i;
            }
        }
        System.out.println(texto);
        return texto;
    }
}
