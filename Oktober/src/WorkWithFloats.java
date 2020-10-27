public class WorkWithFloats {
    public static void main(String[] args) {
        float[] values = {1.0f, 1.15f, 1.9f, 11f, 19f, 120f};

        for (float f : values) {
            System.out.print(f + " ");
            System.out.print(Math.round(f) + " ");
            System.out.print(Math.floor(f) + " ");
            System.out.print(Math.ceil(f) + " ");
            System.out.println();
        }
        System.out.println();

        float factor = .1f;
//was wollte man damit zeigen?
        for (float f : values) {
            System.out.print(f + " ");
            System.out.print(factor * Math.round(f / factor) + " ");
            System.out.printf("%.2f ", factor * Math.floor(f / factor));
            System.out.printf("%.2f ", factor * Math.ceil(f / factor));
            System.out.println();
        }
    }


}
