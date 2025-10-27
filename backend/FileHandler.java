package backend;
import java.util.*;

public interface FileHandler<T> 
{
    void addtofile(List<T> data,String filename);
    List<T> readfile(String filename);
}
    

