package composition.example2;

public class Exercise {

    class House {
//        Scissors scissors; //weak
//        Electricity electrocity; //strong
//        Internet internet; // weak
//        Heating heating; // strong
    }



}

class Room{
    //strong
    int doors;
    int window;

    void openDoor(){};
    void  openWindow(){};
}

class ElecTech{
    //weak
    int TV;
    int PC;
    int person;
    int headset;
}


