package communityuni.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Trần Duy Thanh");
		map.put(2, "Nguyễn Văn Hùng");
		map.put(3, "Đỗ Công Thành");
		map.put(4, "Nguyễn Cẩm Hương");
		map.put(5, "Phạm Thị Xuân Diệu");
		
		//String ten=map.get(1);
		if(map.containsKey(6)==false)
			map.put(6, "Obama");
		Collection<String>dsTen= map.values();
		for(String x : dsTen)
			System.out.println(x);
	}

}
