public class Projecr {

    private String make;
    private String model;
    private String color;

    public Projecr(String make, String model, String color) {
        this.make=(make==null || make.isEmpty())? "Unkown ":make;
        this.model=(model==null || model.isEmpty())? "Unkown ":model;
        this.color=(color==null || color.isEmpty())? "unknown ":color;
    }

    public static void main(String[] args) {

        Projecr p = new Projecr("", "", "");
        System.out.println(p.make);
        System.out.println(p.model);
        System.out.println(p.color);

    }
}
