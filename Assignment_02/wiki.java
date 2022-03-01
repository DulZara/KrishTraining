import java.util.Scanner;
class Wiki{	
	public static void main(String[] args){
	
		Scanner distence = new Scanner(System.in);
		int length;
		
		
		
		System.out.println("Enter the wiki's distence");
		length = distence.nextInt();

		

		System.out.println("Wikis Distence = " +length );
		
		int t = 0;
		int d = 0;
		
		for(int i=0; d<length; i++){
			
			if(d<length){
				
				d=d+5;
				if(d<length){
					t=t+1;
					d=d+3;
					if(d<length){
						t=t+2;
						d=d+1;
						if(d<length){
							t=t+3;
						}
					}
					else{
					break;
					}
				}	
				else{
					
					break;
				}
			}	
					else{
					
					break;
					}
			
				
			
			
		}
			System.out.println("wiki's take " +t+ " Seconds to complete jump");
		
		
		
	
		
	}
	
}