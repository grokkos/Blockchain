/**
 * Created by George Rokkos 24/01/2018
 */
import java.util.Date;
public class BasicBlock {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public BasicBlock(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash(){
        String calculateHash = Util.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
        return calculateHash;
    }


}
