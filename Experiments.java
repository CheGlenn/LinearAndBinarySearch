import java.util.ArrayList;
import java.util.Arrays;
import java.beans.Transient;
import java.io.PrintWriter;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;




public class Experiments {

  public static void main(String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);
    String[] tmp = 
    new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                   "foxtrot", "golf", "hotel", "india",
                   "juliett", "kilo", "lima", "mike", 
                   "november", "oscar", "papa", "quebec",
                   "romeo", "sierra", "tango", "uniform",
                   "victor", "whiskey", "xray", "yankee", "zulu" };
ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));

  String ex1b = Utils.search(strings, (s) -> s.length() == 6);
  String ex1d = Utils.search(strings, (s) -> s.contains("u"));
  pen.println(ex1b);
  pen.println(ex1d);
  }

  @Test
  public void binarySearchTest(){
    for(int i = 0; i < 32; i++){
      int[] ints = new int[i+1];
      for(int j = 0; j < i; j++){
        ints[j] = i*2;
      }

      assertEquals(Utils.binarySearch(ints, 2*i),i);
    }
  

  }
  
}
