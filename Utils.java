import java.util.function.Predicate;
import java.util.Arrays;

public class Utils{

  /**
   * Search values for the first value for which pred holds.
   */
  public static <T> T search(Iterable<T> values, Predicate<? super T> pred) throws Exception {

    for (T val: values){
      if (pred.test(val)){
        return val;
      }
    }

    return null;

    // ...
  } // search(Iterable<T>, Predicate<? super T>)


  /**
 * Search for val in values, return the index of an instance of val.
 *
 * @param values
 *   A sorted array of integers
 * @param val
 *   An integer we're searching for
 * @result
 *   index, an integer
 * @throws Exception
 *   If there is no i s.t. values[i] == val
 * @pre
 *   values is sorted in increasing order.  That is, values[i] <
 *   values[i+1] for all reasonable i.
 * @post
 *   values[index] == val
 */
public static int binarySearch (int[] vals, int i){
  int lowerBound = 0;
  int upperBound = vals.length;
  int val = upperBound/2;


  try{
    while (val != i){
        val = vals[upperBound/2];
        if(val == 1 && val != i){
          return -1;
        }
        else if(val > i){
          lowerBound = val;
        }
        else if(val < i){
          upperBound = val;
        } 
      
    }
  } catch(Exception e) {}

  return upperBound/2;
} // binarySearch


}