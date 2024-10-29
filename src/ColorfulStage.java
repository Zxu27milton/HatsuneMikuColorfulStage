public class ColorfulStage {

    String location;
    boolean isOnline;


    public static void main(String[] args) {

        ColorfulStage myStore1;
        myStore1 = new ColorfulStage();
        myStore1.location = "mall";
        myStore1.isOnline = true;
        System.out.println("\nLocation: My vocaloid merch selling store is at the " + myStore1.location +
                " the fact that my store is online is true.");
    }

    public ColorfulStage(){
        Song Song1;
        Song1 = new Song();
        Song1.name = "Mirror Magic";
        Song1.producer = "Hitoshizuku x Yama";
        Song1.length = 3;
        Song1.virtualsinger = true;
        Song1.printInfo();


        Stamp Stamp1;
        Stamp1 = new Stamp();
        Stamp1.stampname = "Stamp 1";
        Stamp1.vocaloid = "Len";
        Stamp1.number = 3;
        Stamp1.dialogue = true;
        Stamp1.printInfo();
    }
}