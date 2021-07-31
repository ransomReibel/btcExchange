import java.util.Scanner;

public class Exchange {
	
	public static Scanner myObj = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Welcome to RRR Exchange");
		System.out.println("Press 1 to see coin prices and your Initial Balances");
		System.out.println("Press 2-6 to purchase BTC, ETH, HEX, CEL, DOT");
		System.out.println("Press 7-11 to sell BTC, ETH, HEX, CEL, DOT");
		System.out.println("When finished, press 0 to exit");
		Scanner myObj = new Scanner(System.in);
		int name = 1;
		
		//Initial Bal
		int str1 = 1;
		
		//Buy BTC
		int str2 = 2;
		
		//Buy ETH
		int str3 = 3;
		
		//Buy HEX
		int str4 = 4;
		
		//Buy CEL
		int str5 = 5;
		
		//Buy Dot
		int str6 = 6;
		
		//Sell BTC
		int str7 = 7;
		
		//Sell ETH
		int str8 = 8;
		
		//Sell HEX
		int str9 = 9;
		
		//Sell CEL
		int str10 = 10;
		
		//Sell DOT
		int str11 = 11;
		
		while(name>0) {
			name = myObj.nextInt();
		
		
		
			Agent a = new Agent();
		
			//Initial balances
			if(name == str1) {
				System.out.println("USD Price" + " " + a.cryptoPrices[0] + " " + "BTC Price" + " " + a.cryptoPrices[1]+ " " + "ETH Price" + " " + a.cryptoPrices[2]+ " " + "HEX Price" + " " +a.cryptoPrices[3]+ " " + "CEL Price" + " " + a.cryptoPrices[4]+ " " + "DOT Price" + " "  + a.cryptoPrices[5]);
			
				System.out.println("INITIAL BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);	
			}
					
					
					//Buy BTC
					if (name == str2) {
						a.buyBTC(); {
							
						}
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
					}
					
					//Buy ETH
					if (name == str3) {
						a.buyETH(); {
			
						}
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);		
					}
					
					//Buy HEX
					if (name == str4) {
						a.buyHEX(); {
							
						}
					
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
					}	
					
					//Buy CEL
					if (name == str5) {
						a.buyCEL(); {
							
						}
					
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
					
					}
					
					//Buy DOT
					if (name == str6) {
						a.buyDOT(); {
							
						}
						
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
					
					}
					
					//Sell BTC
					if (name == str7) {
						a.sellBTC(); {
							
						}
			
						System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
					
					}
					
					//Sell ETH
							if (name == str8) {
								a.sellETH(); {
									
								}
								
								System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
							
							}
							
					//Sell HEX
							if (name == str9) {
								a.sellHEX(); {
									
								}
								
								System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
							
							}
							
					//Sell CEL
							if (name == str10) {
								a.sellCEL(); {
									
								}
								
								System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
							
							}
							
					//Sell DOT
							if (name == str11) {
								a.sellDOT(); {
									
								}
								
								System.out.println("UPDATED BALANCES:" + " " + "USD Bal" + " " + a.cryptoBal[0] + " " + "BTC Bal" + " " + a.cryptoBal[1]+ " " + "ETH Bal" + " " + a.cryptoBal[2]+ " " + "HEX Bal" + " " +a.cryptoBal[3]+ " " + "CEL Bal" + " " + a.cryptoBal[4]+ " " + "DOT Bal" + " "  + a.cryptoBal[5]);
							
							}
		
						
		}
		
		//Goodbye
		System.out.println("Goodbye...");
	}
	
	
}
