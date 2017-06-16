/**
 * Created by Li-Mac on 2017/6/16.
 */
public interface Taste {
    public void good();
    public default void defaultMethod(){
        System.out.println("Default Method!");
    }
}
