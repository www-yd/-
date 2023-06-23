public class Animalbuy{
	public static void main(String[] args){
		int dog=2,cat=3,rabbit=5;
		for (int i=0;i<46;i++)
			for (int j=0;j<=(90-dog*i)/3;j++)
				for(int k=0;k<=(90-dog*i-cat*j)/5;k++)
					if(i*2+j*3+k*5 == 90) System.out.println("dog"+(i+1)+","+"cat"+(j+1)+","+"rabbit"+(k+1));
	}
}