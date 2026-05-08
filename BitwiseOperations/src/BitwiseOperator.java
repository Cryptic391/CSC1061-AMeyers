
public class BitwiseOperator {
	
	private static final int NUM_LIGHTS = 32;
	

	public static void main(String[] args) {
		
		boolean[] xmasLts = new boolean[NUM_LIGHTS];
		
		//Turn all on
		for(int i = 0; i < NUM_LIGHTS; i++) {
			xmasLts[i] = true;
		}
		
		for(int i = 0; i < NUM_LIGHTS; i++) {
			System.out.printf("%-6b",xmasLts[i]);
		}
		System.out.println();
		
		//Turn off all even lights
		
		for(int i =0; i <NUM_LIGHTS; i++) {
			if(i % 2 == 0) {
				xmasLts[i] = false;
			}
		}
		
		for(int i = 0; i < NUM_LIGHTS; i++) {
			System.out.printf("%-6b",xmasLts[i]);
		}
		System.out.println();
		
		/******************************************/
		
		int xmasBts = 0xFFFF
		
	}

}
