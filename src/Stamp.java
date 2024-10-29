public class Stamp {

    String stampname;
    String vocaloid;
    int number;
    boolean dialogue;

    public Stamp () {

    }

    public void printInfo() {
        System.out.println("\n" + stampname + ":");
        if (dialogue == true) {
            System.out.println("These " + number + " stamps featuring " + vocaloid +
                    " contain dialogue");
        }
        else {
            System.out.println("These " + number + " stamps featuring " + vocaloid +
                    " do not contain dialogue");
        }
    }

}
