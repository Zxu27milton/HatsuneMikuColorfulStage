public class Song {

    String name;
    String producer;
    int length;
    boolean virtualsinger;

    public Song (){

    }

    public void printInfo() {
        System.out.println("\n" + name + ":");
        if (virtualsinger == true) {
            System.out.println("This " + length + " minute song is by "
                    + producer + " and is fully covered by a virtual singer");
        }
        else {
            System.out.println("This " + length + " minute song is by "
                    + producer + " and is not fully covered by a virtual singer");
        }
    }
}
