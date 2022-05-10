import java.io.PipedOutputStream;

public class Process1 implements Runnable {
    final PipedOutputStream output;
    Process1(PipedOutputStream output){
        this.output = output;
        System.out.println("Process 1 Instantiated");
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            output.write("Hello world, pipe!".getBytes());
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    
}
