public class WeightConverter {
    public static void main(String[] args) {
        float result1 = call((float)777.5f);
        float result2 = call((float)888.5f);
        float total=result1+result2;
        System.out.println("total: "+total);
    }
    public static float call(float x){
        System.out.println("pounds: "+x);
        float y = (x/2.2f);
        System.out.println("kilos: "+y);
        return y;
    }
}
