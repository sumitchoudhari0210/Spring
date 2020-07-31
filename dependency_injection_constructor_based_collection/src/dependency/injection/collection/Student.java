package dependency.injection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private List mylist;

	private Map mymap;

	private Set myset;

	public Student(List mylist, Map mymap, Set myset) {
		super();
		this.mylist = mylist;
		this.mymap = mymap;
		this.myset = myset;
	}

	@Override
	public String toString() {
		
		return "list-"+mylist+",map-"+mymap+",set-"+myset+"";
	}
	



}
