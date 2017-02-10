package niuke_3;

public class Rotation {

		public boolean chkRotation(String A, int lena, String B, int lenb){
			
			String temp = A + A;
			if(temp.contains(B)){
				return true;
			}
			
			
			
			return false;
		}

}
