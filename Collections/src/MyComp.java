import java.util.Comparator;

public class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=(String)o2;
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2)
		return -1;
		else if(i1>i2)
			return 1;
		else
			return s1.compareTo(s2);
	}

}
