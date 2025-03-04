package classesObjects.level1;

import java.util.Scanner;

class items{
    int itemcode;
    String itemname;
    int itemprice;

    void display() {
        System.out.println("itemcode: " + itemcode);
        System.out.println("itemname: " +itemname);
        System.out.println("itemprice: " + itemprice);
    }
}

public class Track {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        items item1 = new items();

    }
}
