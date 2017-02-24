package offer_solution;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNotRepeatingChar {

	//在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置 
	public static int firstNotRepeatingChar(String str){
		if (str.length() == 0) {
			return -1;
		}
		
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			//判断是不是位于map里面，如果添加在里面
			if (map.containsKey(str.charAt(i))) {
				//取出它取出出现的数字
				int time = map.get(str.charAt(i));
				//将出现的次数+1,重新存到里面去
				map.put(str.charAt(i), ++time);
				
			} else {
				//如果没有包含在里面的话，则添加进去，将所在的符号，和他存入进去的数字
				map.put(str.charAt(i), 1);
			}
		}
		int pos = -1;
		int i = 0;
		
		for (; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}
		
		
		return pos;
	}
	public static void main(String[] args) {
		
		String str = "bbccdadee";
		System.out.println(FirstNotRepeatingChar.firstNotRepeatingChar(str));
	}

}
