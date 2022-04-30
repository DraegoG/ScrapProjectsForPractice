public class MultiThreading {
    public static void main(String[] args) {

        for(int i =0 ; i<3; i++){
            MultiThreadingUsingThreadClass mttc = new MultiThreadingUsingThreadClass();
            mttc.start();
        }

        for(int i =0 ; i<3; i++){
            Thread object =  new Thread(new MultiThreadingUsingRunnableInterface());
            object.start();
        }
    }


}

class MultiThreadingUsingThreadClass extends Thread{
    public void run(){
        System.out.println("thread started using Thread class");
    }
}


class MultiThreadingUsingRunnableInterface implements Runnable{
    public void run(){
        System.out.println("thread started using runnable");
    }
}