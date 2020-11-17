package Builder.pattern;

public class ConcreteBuilderASCII implements Builder {
	private ASCIIString string;
	
	@Override
	public void initialize() {
		string = new ASCIIString();
	}
	
	@Override
	public void Build(char token) {
		string.appendString(ASCIIfy(token));
	}
	
	@Override
	public String getResult() {
		return string.getResult();
	}
	
	private String ASCIIfy(char c) {
		c = Character.toLowerCase(c);
		switch (c) {
			case 'a':
				return " AAAA |" + "A    A|" + "A    A|" + "AAAAAA|" + "A    A|" + "A    A|" + "A    A|";
			case 'b':
				return "BBBB |" + "B   B|" + "B  B |" + "BBBBB|" + "B   B|" + "B  B |" + "BBBB |";
			case 'c':
				return " CCC |" + "C   C|" + "C    |" + "C    |" + "C    |" + "C   C|" + " CCC |";
			case 'd':
				return "DDD  |" + "D   D|" + "D   D|" + "D   D|" + "D   D|" + "D   D|" + "DDD  |";
			case 'e':
				return "EEEEE|" + "E    |" + "E    |" + "EEEEE|" + "E    |" + "E    |" + "EEEEE|";
			case 'f':
				return "FFFFF|" + "F    |" + "FFFFF|" + "F    |" + "F    |" + "F    |" + "F    |";
			case 'g':
				return " GGG |" + "G   G|" + "G    |" + "G  GG|" + "G   G|" + "G   G|" + " GGG |";
			case 'h':
				return "H   H|" + "H   H|" + "HHHHH|" + "H   H|" + "H   H|" + "H   H|" + "H   H|";
			case 'i':
				return "IIIII|" + "  I  |" + "  I  |" + "  I  |" + "  I  |" + "  I  |" + "IIIII|";
			case 'j':
				return "JJJJJ|" + "    J|" + "    J|" + "    J|" + "J   J|" + "J   J|" + " JJJ |";
			case 'k':
				return "K   K|" + "K  K |" + "KK   |" + "K K  |" + "K  K |" + "K   K|" + "K   K|";
			case 'l':
				return "L    |" + "L    |" + "L    |" + "L    |" + "L    |" + "L    |" + "LLLLL|";
			case 'm':
				return "M   M|" + "MM MM|" + "M M M|" + "M   M|" + "M   M|" + "M   M|" + "M   M|";
			case 'n':
				return "N   N|" + "NN  N|" + "N N N|" + "N  NN|" + "N   N|" + "N   N|" + "N   N|";
			case 'o':
				return " OOO |" + "O   O|" + "O   O|" + "O   O|" + "O   O|" + "O   O|" + " OOO |";
			case 'p':
				return "PPPPP|" + "P   P|" + "P   P|" + "PPPPP|" + "P    |" + "P    |" + "P    |";
			case 'q':
				return " QQQ |" + "Q   Q|" + "Q   Q|" + "Q   Q|" + "Q   Q|" + "Q  Q |" + " QQ Q|";
			case 'r':
				return "RRRR |" + "R   R|" + "R   R|" + "RRRR |" + "R   R|" + "R   R|" + "R   R|";
			case 's':
				return "SSSSS|" + "S    |" + "S    |" + "SSSSS|" + "    S|" + "    S|" + "SSSSS|";
			case 't':
				return "TTTTT|" + "  T  |" + "  T  |" + "  T  |" + "  T  |" + "  T  |" + "  T  |";
			case 'u':
				return "U   U|" + "U   U|" + "U   U|" + "U   U|" + "U   U|" + "U   U|" + " UUU |";
			case 'v':
				return "V   V|" + "V   V|" + "V   V|" + "V   V|" + "V   V|" + " V V |" + "  V  |";
			case 'w':
				return "W   W|" + "W   W|" + "W   W|" + "W   W|" + "W W W|" + "WWWWW|" + "W   W|";
			case 'x':
				return "X   X|" + "X   X|" + " XXX |" + " X X |" + "X   X|" + "X   X|" + "X   X|";
			case 'y':
				return "Y   Y|" + "Y   Y|" + " YYY |" + "  Y  |" + "  Y  |" + "  Y  |" + "  Y  |";
			case 'z':
				return "ZZZZZ|" + "    Z|" + "   Z |" + "  Z  |" + " Z   |" + "Z    |" + "ZZZZZ|";
			default:
				return "     |" + "     |" + "     |" + "     |" + "     |" + "     |" + "     |";
		}
	}
}
