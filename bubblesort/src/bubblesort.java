
public class bubblesort {
	public static void main(String[] args) {
		int var[] = new int[20];
		int temp=0;
		for(int i=0; i<20; i++){
			var[i]=(int) (Math.random()*100)+1;
		}
		for(int i=0; i<19; ++i){
			
			System.out.print(var[i]+" ");
			if(var[i]>var[i+1]){
				temp = var[i];
				var[i]=var[i+1];
				var[i+1] = temp;
				i=-1;
				System.out.print("\n");
			}
		}

	}
}
