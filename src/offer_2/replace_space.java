package offer_2;

public class replace_space {
	public String replaceSpace(StringBuffer str){
		StringBuffer newStringBuffer = new StringBuffer();
		for(int i = 0; i < str.toString().length(); i++){
			char a = str.charAt(i);
			if (String.valueOf(a).equals(" ")) {
				newStringBuffer.append("20%");
			} else {
				newStringBuffer.append(a);
			}
		}
		return newStringBuffer.toString();		
	}
}
