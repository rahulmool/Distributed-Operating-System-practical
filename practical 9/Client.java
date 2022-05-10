import java.io.File;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.StandardOpenOption;

public class Client {

    public static void main( String[] args ) throws Throwable {
        File f = new File("file.txt");
        FileChannel channel = FileChannel.open( f.toPath(), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE );

        MappedByteBuffer b = channel.map( MapMode.READ_WRITE, 0, 4096 );
        CharBuffer charBuf = b.asCharBuffer();
        System.out.println("File name: "+f.getName());
        System.out.println("Reading from file....");
        // Prints 'Hello server'
        char c;
        while( ( c = charBuf.get() ) != 0 ) {
            System.out.print( c );
        }
        System.out.println();

        charBuf.put( 0, '\0' );
    }

}


