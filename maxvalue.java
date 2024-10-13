public class Main {
	public static void main(String[] args) {
		int[] array = {1,3,5,2,1};

		int i = 0;
		int ans = 0;
		while(i<array.length) {
			if(array[i] > ans) {
				ans = array[i];
			}
			i++;
		}
		System.out.print(ans);
	}

}
