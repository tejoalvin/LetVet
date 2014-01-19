
public class ex2 {

	private static String countAndCensorWords(String rawText, String[] censoredWords){
		String[] asterisk = new String[censoredWords.length];
		String answer = "";
		
		for(int i=0;i<censoredWords.length; i++){
			asterisk[i] = "";
			for(int j=0; j<censoredWords[i].length(); j++){
				asterisk[i] += "*";
			}
		}
		
		String[] censoredText = rawText.split(" ");
		String text ="";
		
		for(int i=0; i<censoredText.length; i++){
			for(int j=0; j<censoredWords.length; j++){
				if(censoredText[i].equals(censoredWords[j])){
					censoredText[i] = asterisk[j];
				}
			}
			text += censoredText[i]+" ";
		}
		
		answer = "total_words: " + censoredText.length + ",\ncensored_text: " + text +",\ncensored_words: " + censoredWords.length;
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rawText = "bath has no bathrooms in bath";
		String[] censoredWords = {"bath"};
		
		System.out.println(countAndCensorWords(rawText, censoredWords));
		
	}

}
