package nomeNoConsole;

public class NomeNoConsole {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * LetraC.getLetraC();
		System.out.println();
		LetraA.getLetraA();
		
		System.out.println();
		System.out.println();
		
		LetraR.getLetraR();
		
		System.out.println();
		System.out.println();
		
		LetraL.getLetraL();
		
		System.out.println();
		System.out.println();
		
		LetraI.getLetraI();
		
		System.out.println();
		System.out.println();
		
		LetraN.getLetraN();
		 */
		

		String espaco = " ";
		char x = '○';
		int altura = 152;
		int largura = 25;
		char cobrinha = '§';
		int cont = 0;
		
		
		while(cont <= 239) {
			
			Thread.sleep(100);
			
		for(int linha = 0; linha < largura; linha++) {
			for(int col = 0; col < altura; col++) {
				
				
				if(linha == 0 || col == 0 || linha == 24 || col == 151) {//136
					System.out.print("♦");
					
				}else if((linha == 7 && col == 5) || // Letra C
						(linha == 7 && col == 6) ||
						(linha == 7 && col == 7) ||
						(linha == 7 && col == 8) ||
						(linha == 7 && col == 9) ||
						(linha == 7 && col == 10) ||
						(linha == 7 && col == 11) ||
						(linha == 7 && col == 12) ||
						(linha == 7 && col == 13) ||
						(linha == 8 && col == 5) ||
						(linha == 9 && col == 5) ||
						(linha == 10 && col == 5) ||
						(linha == 11 && col == 5) ||
						(linha == 12 && col == 5) ||
						(linha == 13 && col == 5) ||
						(linha == 14 && col == 5) ||
						(linha == 15 && col == 5) ||
						(linha == 16 && col == 5) ||
						(linha == 16 && col == 6) ||
						(linha == 16 && col == 7) ||
						(linha == 16 && col == 8) ||
						(linha == 16 && col == 9) ||
						(linha == 16 && col == 10) ||
						(linha == 16 && col == 11) ||
						(linha == 16 && col == 12) ||
						(linha == 16 && col == 13) 
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 29) || // Letra A
						(linha == 7 && col == 30) ||
						(linha == 7 && col == 31) ||
						(linha == 8 && col == 32) ||
						(linha == 8 && col == 28) ||
						(linha == 9 && col == 27) ||
						(linha == 9 && col == 33) ||
						(linha == 10 && col == 26) ||
						(linha == 10 && col == 34) ||
						(linha == 11 && col == 25) ||
						(linha == 11 && col == 35) ||
						(linha == 12 && col == 24) ||
						(linha == 12 && col == 26) ||
						(linha == 12 && col == 27) ||
						(linha == 12 && col == 28) ||
						(linha == 12 && col == 29) ||
						(linha == 12 && col == 30) ||
						(linha == 12 && col == 31) ||
						(linha == 12 && col == 32) ||
						(linha == 12 && col == 33) ||
						(linha == 12 && col == 34) ||
						(linha == 12 && col == 36) ||
						(linha == 13 && col == 23) ||
						(linha == 13 && col == 37) ||
						(linha == 14 && col == 22) ||
						(linha == 14 && col == 38) ||
						(linha == 15 && col == 21) ||
						(linha == 15 && col == 39) ||
						(linha == 16 && col == 20) ||
						(linha == 16 && col == 40)   
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 50) || // Letra R
						(linha == 7 && col == 51) ||
						(linha == 7 && col == 52) ||
						(linha == 7 && col == 53) ||
						(linha == 7 && col == 54) ||
						(linha == 7 && col == 55) ||
						(linha == 7 && col == 56) ||
						(linha == 7 && col == 57) ||
						(linha == 7 && col == 58) ||
						(linha == 7 && col == 59) ||
						(linha == 8 && col == 59) ||
						(linha == 8 && col == 50) ||
						(linha == 9 && col == 59) ||
						(linha == 9 && col == 50) ||
						(linha == 10 && col == 59) ||
						(linha == 10 && col == 50) ||
						(linha == 11 && col == 59) ||
						(linha == 11 && col == 50) ||
						(linha == 12 && col == 50) ||
						(linha == 12 && col == 52) ||
						(linha == 12 && col == 53) ||
						(linha == 12 && col == 54) ||
						(linha == 12 && col == 55) ||
						(linha == 12 && col == 56) ||
						(linha == 12 && col == 57) ||
						(linha == 12 && col == 59) ||
						(linha == 13 && col == 50) ||
						(linha == 13 && col == 56) ||
						(linha == 14 && col == 57) ||
						(linha == 14 && col == 50) ||
						(linha == 15 && col == 50) ||
						(linha == 15 && col == 58) ||
						(linha == 16 && col == 50) ||
						(linha == 16 && col == 59)
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 69) || // Letra L
						(linha == 8 && col == 69) ||
						(linha == 9 && col == 69) ||
						(linha == 10 && col == 69) ||
						(linha == 11 && col == 69) ||
						(linha == 12 && col == 69) ||
						(linha == 13 && col == 69) ||
						(linha == 14 && col == 69) ||
						(linha == 15 && col == 69) ||
						(linha == 16 && col == 69) ||
						(linha == 16 && col == 70) ||
						(linha == 16 && col == 71) ||
						(linha == 16 && col == 72) ||
						(linha == 16 && col == 73) ||
						(linha == 16 && col == 74) ||
						(linha == 16 && col == 75) ||
						(linha == 16 && col == 76) ||
						(linha == 16 && col == 77) ||
						(linha == 16 && col == 78) ||
						(linha == 16 && col == 79)
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 89) || // Letra I
						(linha == 9 && col == 89) ||
						(linha == 10 && col == 89) ||
						(linha == 11 && col == 89) ||
						(linha == 12 && col == 89) ||
						(linha == 13 && col == 89) ||
						(linha == 14 && col == 89) ||
						(linha == 15 && col == 89) ||
						(linha == 16 && col == 89)
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 99) || // Letra N
						(linha == 8 && col == 99) ||
						(linha == 9 && col == 99) ||
						(linha == 10 && col == 99) ||
						(linha == 11 && col == 99) ||
						(linha == 12 && col == 99) ||
						(linha == 13 && col == 99) ||
						(linha == 14 && col == 99) ||
						(linha == 15 && col == 99) ||
						(linha == 16 && col == 99) ||
						(linha == 8 && col == 101) ||
						(linha == 9 && col == 102) ||
						(linha == 10 && col == 103) ||
						(linha == 11 && col == 104) ||
						(linha == 12 && col == 105) ||
						(linha == 13 && col == 106) ||
						(linha == 14 && col == 107) ||
						(linha == 15 && col == 108) ||
						(linha == 16 && col == 109) ||
						(linha == 7 && col == 110) ||
						(linha == 8 && col == 110) ||
						(linha == 9 && col == 110) ||
						(linha == 10 && col == 110) ||
						(linha == 11 && col == 110) ||
						(linha == 12 && col == 110) ||
						(linha == 13 && col == 110) ||
						(linha == 14 && col == 110) ||
						(linha == 15 && col == 110) ||
						(linha == 16 && col == 110)
						) {
					System.out.print(x);
				}else if((linha == 7 && col == 120) || // Letra I
						(linha == 9 && col == 120) ||
						(linha == 10 && col == 120) ||
						(linha == 11 && col == 120) ||
						(linha == 12 && col == 120) ||
						(linha == 13 && col == 120) ||
						(linha == 14 && col == 120) ||
						(linha == 15 && col == 120) ||
						(linha == 16 && col == 120)
						) {
					System.out.print(x);
				}else if((linha == 11 && col == 3 && cont == 0)|| // Snake
						(linha == 12 && col == 3 && cont == 1)||
						(linha == 13 && col == 3 && cont == 2)||
						(linha == 14 && col == 3 && cont == 3)||
						(linha == 15 && col == 3 && cont == 4)||
						(linha == 16 && col == 3 && cont == 5)||
						(linha == 17 && col == 3 && cont == 6)||
						(linha == 18 && col == 3 && cont == 7)||
						(linha == 18 && col == 4 && cont == 8)||
						(linha == 18 && col == 5 && cont == 9)||
						(linha == 18 && col == 6 && cont == 10)||
						(linha == 18 && col == 7 && cont == 11)||
						(linha == 18 && col == 8 && cont == 12)||
						(linha == 18 && col == 9 && cont == 13)||
						(linha == 18 && col == 10 && cont == 14)||
						(linha == 18 && col == 11 && cont == 15)||
						(linha == 18 && col == 12 && cont == 16)||
						(linha == 18 && col == 13 && cont == 17)||
						(linha == 18 && col == 14 && cont == 18)||
						(linha == 18 && col == 15 && cont == 19)||
						(linha == 18 && col == 16 && cont == 20)||
						(linha == 17 && col == 16 && cont == 21)||
						(linha == 16 && col == 16 && cont == 22)||
						(linha == 15 && col == 16 && cont == 23)||
						(linha == 14 && col == 16 && cont == 24)||
						(linha == 13 && col == 16 && cont == 25)||
						(linha == 12 && col == 16 && cont == 26)||
						(linha == 11 && col == 16 && cont == 27)||
						(linha == 10 && col == 16 && cont == 28)||
						(linha == 9 && col == 16 && cont == 29)||
						(linha == 8 && col == 16 && cont == 30)||
						(linha == 7 && col == 16 && cont == 31)||
						(linha == 6 && col == 16 && cont == 32)||
						(linha == 5 && col == 16 && cont == 33)||
						(linha == 5 && col == 17 && cont == 34)||
						(linha == 5 && col == 18 && cont == 35)||
						(linha == 5 && col == 19 && cont == 36)||
						(linha == 5 && col == 20 && cont == 37)||
						(linha == 5 && col == 21 && cont == 38)||
						(linha == 5 && col == 22 && cont == 39)||
						(linha == 5 && col == 23 && cont == 40)||
						(linha == 5 && col == 24 && cont == 41)||
						(linha == 5 && col == 25 && cont == 42)||
						(linha == 5 && col == 26 && cont == 43)||
						(linha == 5 && col == 27 && cont == 44)||
						(linha == 5 && col == 28 && cont == 45)||
						(linha == 5 && col == 29 && cont == 46)||
						(linha == 5 && col == 30 && cont == 47)||
						(linha == 5 && col == 31 && cont == 48)||
						(linha == 5 && col == 32 && cont == 49)||
						(linha == 5 && col == 33 && cont == 50)||
						(linha == 5 && col == 34 && cont == 51)||
						(linha == 5 && col == 35 && cont == 52)||
						(linha == 5 && col == 36 && cont == 53)||
						(linha == 5 && col == 37 && cont == 54)||
						(linha == 5 && col == 38 && cont == 55)||
						(linha == 5 && col == 39 && cont == 56)||
						(linha == 5 && col == 40 && cont == 57)||
						(linha == 5 && col == 41 && cont == 58)||
						(linha == 5 && col == 42 && cont == 59)||
						(linha == 5 && col == 43 && cont == 60)||
						(linha == 5 && col == 44 && cont == 61)||
						(linha == 5 && col == 45 && cont == 62)||
						(linha == 6 && col == 45 && cont == 63)||
						(linha == 7 && col == 45 && cont == 64)||
						(linha == 8 && col == 45 && cont == 65)||
						(linha == 9 && col == 45 && cont == 66)||
						(linha == 10 && col == 45 && cont == 67)||
						(linha == 11 && col == 45 && cont == 68)||
						(linha == 12 && col == 45 && cont == 69)||
						(linha == 13 && col == 45 && cont == 70)||
						(linha == 14 && col == 45 && cont == 71)||
						(linha == 15 && col == 45 && cont == 72)||
						(linha == 16 && col == 45 && cont == 73)||
						(linha == 17 && col == 45 && cont == 74)||
						(linha == 18 && col == 45 && cont == 75)||
						(linha == 18 && col == 46 && cont == 76)||
						(linha == 18 && col == 47 && cont == 77)||
						(linha == 18 && col == 48 && cont == 78)||
						(linha == 18 && col == 49 && cont == 79)||
						(linha == 18 && col == 50 && cont == 80)||
						(linha == 18 && col == 51 && cont == 81)||
						(linha == 18 && col == 52 && cont == 82)||
						(linha == 18 && col == 53 && cont == 83)||
						(linha == 18 && col == 54 && cont == 84)||
						(linha == 18 && col == 55 && cont == 85)||
						(linha == 18 && col == 56 && cont == 86)||
						(linha == 18 && col == 57 && cont == 87)||
						(linha == 18 && col == 58 && cont == 88)||
						(linha == 18 && col == 59 && cont == 89)||
						(linha == 18 && col == 60 && cont == 90)||
						(linha == 18 && col == 61 && cont == 91)||
						(linha == 18 && col == 62 && cont == 92)||
						(linha == 18 && col == 63 && cont == 93)||
						(linha == 18 && col == 64 && cont == 94)||
						(linha == 18 && col == 65 && cont == 95)||
						(linha == 17 && col == 65 && cont == 96)||
						(linha == 16 && col == 65 && cont == 97)||
						(linha == 15 && col == 65 && cont == 98)||
						(linha == 14 && col == 65 && cont == 99)||
						(linha == 13 && col == 65 && cont == 100)||
						(linha == 12 && col == 65 && cont == 101)||
						(linha == 11 && col == 65 && cont == 102)||
						(linha == 10 && col == 65 && cont == 103)||
						(linha == 9 && col == 65 && cont == 104)||
						(linha == 8 && col == 65 && cont == 105)||
						(linha == 7 && col == 65 && cont == 106)||
						(linha == 6 && col == 65 && cont == 107)||
						(linha == 5 && col == 65 && cont == 108)||
						(linha == 5 && col == 66 && cont == 109)||
						(linha == 5 && col == 67 && cont == 110)||
						(linha == 5 && col == 68 && cont == 111)||
						(linha == 5 && col == 69 && cont == 112)||
						(linha == 5 && col == 70 && cont == 113)||
						(linha == 5 && col == 71 && cont == 114)||
						(linha == 5 && col == 72 && cont == 115)||
						(linha == 5 && col == 73 && cont == 116)||
						(linha == 5 && col == 74 && cont == 117)||
						(linha == 5 && col == 75 && cont == 118)||
						(linha == 5 && col == 76 && cont == 119)||
						(linha == 5 && col == 77 && cont == 120)||
						(linha == 5 && col == 78 && cont == 121)||
						(linha == 5 && col == 79 && cont == 122)||
						(linha == 5 && col == 80 && cont == 123)||
						(linha == 5 && col == 81 && cont == 124)||
						(linha == 5 && col == 82 && cont == 125)||
						(linha == 5 && col == 83 && cont == 126)||
						(linha == 6 && col == 83 && cont == 127)||
						(linha == 7 && col == 83 && cont == 128)||
						(linha == 8 && col == 83 && cont == 129)||
						(linha == 9 && col == 83 && cont == 130)||
						(linha == 10 && col == 83 && cont == 131)||
						(linha == 11 && col == 83 && cont == 132)||
						(linha == 12 && col == 83 && cont == 133)||
						(linha == 13 && col == 83 && cont == 134)||
						(linha == 14 && col == 83 && cont == 135)||
						(linha == 15 && col == 83 && cont == 136)||
						(linha == 16 && col == 83 && cont == 137)||
						(linha == 17 && col == 83 && cont == 138)||
						(linha == 18 && col == 83 && cont == 139)||
						(linha == 18 && col == 84 && cont == 140)||
						(linha == 18 && col == 85 && cont == 141)||
						(linha == 18 && col == 86 && cont == 142)||
						(linha == 18 && col == 87 && cont == 143)||
						(linha == 18 && col == 88 && cont == 144)||
						(linha == 18 && col == 89 && cont == 145)||
						(linha == 18 && col == 90 && cont == 146)||
						(linha == 18 && col == 91 && cont == 147)||
						(linha == 18 && col == 92 && cont == 148)||
						(linha == 18 && col == 93 && cont == 149)||
						(linha == 18 && col == 94 && cont == 150)||
						(linha == 17 && col == 94 && cont == 151)||
						(linha == 16 && col == 94 && cont == 152)||
						(linha == 15 && col == 94 && cont == 153)||
						(linha == 14 && col == 94 && cont == 154)||
						(linha == 13 && col == 94 && cont == 155)||
						(linha == 12 && col == 94 && cont == 156)||
						(linha == 11 && col == 94 && cont == 157)||
						(linha == 10 && col == 94 && cont == 158)||
						(linha == 9 && col == 94 && cont == 159)||
						(linha == 8 && col == 94 && cont == 160)||
						(linha == 7 && col == 94 && cont == 161)||
						(linha == 6 && col == 94 && cont == 162)||
						(linha == 5 && col == 94 && cont == 163)||
						(linha == 5 && col == 95 && cont == 164)||
						(linha == 5 && col == 96 && cont == 165)||
						(linha == 5 && col == 97 && cont == 166)||
						(linha == 5 && col == 98 && cont == 167)||
						(linha == 5 && col == 99 && cont == 168)||
						(linha == 5 && col == 100 && cont == 169)||
						(linha == 5 && col == 101 && cont == 170)||
						(linha == 5 && col == 102 && cont == 171)||
						(linha == 5 && col == 103 && cont == 172)||
						(linha == 5 && col == 104 && cont == 173)||
						(linha == 5 && col == 105 && cont == 174)||
						(linha == 5 && col == 106 && cont == 175)||
						(linha == 5 && col == 107 && cont == 176)||
						(linha == 5 && col == 108 && cont == 177)||
						(linha == 5 && col == 109 && cont == 178)||
						(linha == 5 && col == 110 && cont == 179)||
						(linha == 5 && col == 111 && cont == 180)||
						(linha == 5 && col == 112 && cont == 181)||
						(linha == 5 && col == 113 && cont == 182)||
						(linha == 5 && col == 114 && cont == 183)||
						(linha == 5 && col == 115 && cont == 184)||
						(linha == 6 && col == 115 && cont == 185)||
						(linha == 7 && col == 115 && cont == 186)||
						(linha == 8 && col == 115 && cont == 187)||
						(linha == 9 && col == 115 && cont == 188)||
						(linha == 10 && col == 115 && cont == 189)||
						(linha == 11 && col == 115 && cont == 190)||
						(linha == 12 && col == 115 && cont == 191)||
						(linha == 13 && col == 115 && cont == 192)||
						(linha == 14 && col == 115 && cont == 193)||
						(linha == 15 && col == 115 && cont == 194)||
						(linha == 16 && col == 115 && cont == 195)||
						(linha == 17 && col == 115 && cont == 196)||
						(linha == 18 && col == 115 && cont == 197)||
						(linha == 18 && col == 116 && cont == 198)||
						(linha == 18 && col == 117 && cont == 199)||
						(linha == 18 && col == 118 && cont == 200)||
						(linha == 18 && col == 119 && cont == 201)||
						(linha == 18 && col == 120 && cont == 202)||
						(linha == 18 && col == 121 && cont == 203)||
						(linha == 18 && col == 122 && cont == 204)||
						(linha == 18 && col == 123 && cont == 205)||
						(linha == 18 && col == 124 && cont == 206)||
						(linha == 18 && col == 125 && cont == 207)||
						(linha == 18 && col == 126 && cont == 208)||
						(linha == 18 && col == 127 && cont == 209)||
						(linha == 17 && col == 127 && cont == 210)||
						(linha == 16 && col == 127 && cont == 211)||
						(linha == 15 && col == 127 && cont == 212)||
						(linha == 14 && col == 127 && cont == 213)||
						(linha == 13 && col == 127 && cont == 214)||
						(linha == 12 && col == 127 && cont == 215)||
						(linha == 11 && col == 127 && cont == 216)||
						(linha == 11 && col == 128 && cont == 217)||
						(linha == 11 && col == 129 && cont == 218)||
						(linha == 11 && col == 130 && cont == 219)||
						(linha == 11 && col == 131 && cont == 220)||
						(linha == 11 && col == 132 && cont == 221)||
						(linha == 11 && col == 133 && cont == 222)||
						(linha == 11 && col == 134 && cont == 223)||
						(linha == 11 && col == 135 && cont == 224)||
						(linha == 11 && col == 136 && cont == 225)||
						(linha == 11 && col == 137 && cont == 226)||
						(linha == 11 && col == 138 && cont == 227)||
						(linha == 11 && col == 139 && cont == 228)||
						(linha == 11 && col == 140 && cont == 229)||
						(linha == 11 && col == 141 && cont == 230)||
						(linha == 11 && col == 142 && cont == 231)||
						(linha == 11 && col == 143 && cont == 232)||
						(linha == 11 && col == 144 && cont == 233)||
						(linha == 11 && col == 145 && cont == 234)||
						(linha == 11 && col == 146 && cont == 235)||
						(linha == 11 && col == 147 && cont == 236)||
						(linha == 11 && col == 148 && cont == 237)||
						(linha == 11 && col == 149 && cont == 238)||
						(linha == 11 && col == 150 && cont == 239)
						
						
						){
					
					System.out.print(cobrinha);
					
					
					
				}else {
					System.out.print(espaco);
				}
				
				
			}
			System.out.println(" ");
			
			
		}
		cont++;
	}//while
		
		

	}
}
