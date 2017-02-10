package offer_12;

public class Solution {

	double base;
	int exponet;
	
	public double Power(double base, int exponent){
		if (exponent == 0) {
			return 1;
		} else if (exponent > 0) {
			double num = base;
			for (int i = 0; i < exponent; i++) {
				num = num*base;
			}
			return num;
		} else {
			double num = base;
			int flag = -exponent;
			for (int i = 0; i < flag; i++) {
				num = num*base;
			}
			return 1/num;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
