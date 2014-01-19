import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ex1 {

	private static String[][] findSortedMinimalCover(Date[][] arrayOfTimeInterval){
		SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy");
		
		String[][] sortedString = new String[1][2];
		
		Date[][] sorted = new Date[1][2];
		sorted[0][0] = arrayOfTimeInterval[0][0];
		sorted[0][1] = arrayOfTimeInterval[0][1];
		
		for(int i=1; i<arrayOfTimeInterval.length; i++){
			if(sorted[0][0].compareTo(arrayOfTimeInterval[i][0])>0){
				sorted[0][0] = arrayOfTimeInterval[i][0];
			} 
			
			if(sorted[0][1].compareTo(arrayOfTimeInterval[i][1])<0){
				sorted[0][1] = arrayOfTimeInterval[i][1];
			}
		}
		
		sortedString[0][0]= format.format(sorted[0][0]);
		sortedString[0][1]= format.format(sorted[0][1]);
		
		return sortedString;
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy");
		
		
		Date[][] arrayOfTimeInterval = new Date[3][2];		
		arrayOfTimeInterval[0][0] = format.parse("December 1, 2013");
		arrayOfTimeInterval[0][1] = format.parse("March 2, 2014");
		arrayOfTimeInterval[1][0] = format.parse("January 21, 2013");
		arrayOfTimeInterval[1][1] = format.parse("January 22, 2014");
		arrayOfTimeInterval[2][0] = format.parse("January 1, 2013");
		arrayOfTimeInterval[2][1] = format.parse("December 1, 2014");
		
		String[][] sortedMinimal = findSortedMinimalCover(arrayOfTimeInterval);
	    System.out.println(sortedMinimal[0][0]+" , " + sortedMinimal[0][1]);
		
	}

}
