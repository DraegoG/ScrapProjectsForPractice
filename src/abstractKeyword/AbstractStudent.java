package abstractKeyword;

public  abstract class AbstractStudent {
    public void dailySchedule(){
        //ensuring to follow the same steps in a particular order
        getUp();
        getFreshenUp();
        study();
        sleep();
    }
    abstract void getUp();
    abstract  void getFreshenUp();
    abstract void study();
    abstract void sleep();
}
