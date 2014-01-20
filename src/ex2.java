
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
		
		//splitting the text into an array by splitting it in the whitespace
		String[] censoredText = rawText.split(" ");
		String text ="";
		
		//comparing all of the text that needed to be censored with the censored words
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
		String rawText = "bath has no bathrooms";
		String[] censoredWords = {"bath"};
		
		System.out.println(countAndCensorWords(rawText, censoredWords));
		
	}

}
