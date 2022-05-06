
public class CoverCompareTo {
	public int New_CompareTo(String a,String b) {
		int len_S1=a.length();
		int len_S2=b.length();
		int min_len=len_S1<len_S2?len_S1:len_S2;
		for(int i=0;i<min_len;i++) {
			if(a.charAt(i)>b.charAt(i)) {
				return 1;
			}else if(a.charAt(i)<b.charAt(i)) {
				return -1;
			}
		}
		if(len_S1>len_S2) {
			return 1;
		}else if(len_S1<len_S2) {
			return -1;
		}
		return 0;
	}
}
