package o1;

public class Preflix {
	public static void main(String[] args) {
		String[] array = { "flower", "flow", "flight" };
		String getPreflix = getTheLongestPreflix(array);
		System.out.println("the longest preflix is:" + getPreflix);
	}

	public static String getTheLongestPreflix(String[] arrs) {
		if (arrs.length == 0) {
			return "";
		}
		String preflix = arrs[0];
		for (int i = 1; i < arrs.length; i++) {
			while (arrs[i].indexOf(preflix) != 0) {
				preflix = preflix.substring(0, preflix.length() - 1);
			}
		}//new
		return preflix;
	}

}
