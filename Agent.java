import java.lang.reflect.Array;

public class Agent extends Client {
	
	public Agent() {
	}

	// Crypto Prices BTC,ETH,HEX,CEL,DOT
	float[] cryptoPrices = {(float) 1, (float) 49000,(float) 2000,(float) 0.1,(float) 6,(float) 12.33};
	
	// Buy BTC Function
	public void buyBTC() {
		if(cryptoBal[0]>=cryptoPrices[1]) {
			Array.set(cryptoBal, 1, cryptoBal[1]+1);
			Array.set(cryptoBal, 0, cryptoBal[0]-cryptoPrices[1]);
			System.out.println(" You purchased 1 BTC");
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	// Buy ETH Function
	public void buyETH() {
		if(cryptoBal[0]>=cryptoPrices[2]) {
			Array.set(cryptoBal, 2, cryptoBal[2]+1);
			Array.set(cryptoBal, 0, cryptoBal[0]-cryptoPrices[2]);
			System.out.println(" You purchased 1 ETH");
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	// Buy HEX Function
	public void buyHEX() {
		if(cryptoBal[0]>=cryptoPrices[3]) {
			Array.set(cryptoBal, 3, cryptoBal[3]+1); 
			Array.set(cryptoBal, 0, cryptoBal[0]-cryptoPrices[3]);
			System.out.println(" You purchased 1 HEX");
		}
		
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	// Buy CEL Function
	public void buyCEL() {
		if(cryptoBal[0]>=cryptoPrices[4]) {
			Array.set(cryptoBal, 4, cryptoBal[4]+1);
			Array.set(cryptoBal, 0, cryptoBal[0]-cryptoPrices[4]);
			System.out.println(" You purchased 1 CEL");
		}
		
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	
	// Buy DOT Function
	public void buyDOT() {
		if(cryptoBal[0]>=cryptoPrices[5]) {
			Array.set(cryptoBal, 5, cryptoBal[5]+1);
			Array.set(cryptoBal, 0, cryptoBal[0]-cryptoPrices[5]);
			System.out.println(" You purchased 1 DOT");
		}
		
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	// Sell BTC Function
	public void sellBTC() {
		if(cryptoBal[1]>=1) {
		Array.set(cryptoBal, 1, cryptoBal[1]-1);
		Array.set(cryptoBal, 0, cryptoBal[0]+cryptoPrices[1]);
		System.out.println(" You sold 1 BTC");
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
		
	// Sell ETH Function
	public void sellETH() {
		if(cryptoBal[2]>=1) {
		Array.set(cryptoBal, 2, cryptoBal[2]-1);
		Array.set(cryptoBal, 0, cryptoBal[0]+cryptoPrices[2]);
		System.out.println(" You sold 1 ETH");
		}
		else {
		System.out.println("Insufficient Funds");
		}
	}
	
	
	// Sell HEX Function
	public void sellHEX() {
		if(cryptoBal[3]>=1) {
		Array.set(cryptoBal, 3, cryptoBal[3]-1);
		Array.set(cryptoBal, 0, cryptoBal[0]+cryptoPrices[3]);
		System.out.println(" You sold 1 HEX");
		}
		else {
		System.out.println("Insufficient Funds");
		}
	}
	
	// Sell CEL Function
	public void sellCEL() {
		if(cryptoBal[4]>=1) {
		Array.set(cryptoBal, 4, cryptoBal[4]-1);
		Array.set(cryptoBal, 0, cryptoBal[0]+cryptoPrices[4]);
		System.out.println(" You sold 1 CEL");
		}
		else {
		System.out.println("Insufficient Funds");
		}
	}

	// Sell DOT Function
	public void sellDOT() {
		if(cryptoBal[5]>=1) {
		Array.set(cryptoBal, 5, cryptoBal[5]-1);
		Array.set(cryptoBal, 0, cryptoBal[0]+cryptoPrices[5]);
		System.out.println(" You sold 1 DOT");
		}
		else {
		System.out.println("Insufficient Funds");
		}	
	}	
}