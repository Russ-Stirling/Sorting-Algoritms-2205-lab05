package rstirli2_lab05;

import java.util.Comparator;

public class rstirli2_lab05_IntegerComparator  implements Comparator  {
	
	public int compare (Object o1, Object o2)
    {
        int n = ((Integer) o1).intValue();
        int m = ((Integer)o2).intValue();
        
        if (n<m)
        {
        	return -1;
        }
        
        else if (n>m)
        {
        	return 1;
        }
        
        else
        {
        	return 0;
        }
    }

}
