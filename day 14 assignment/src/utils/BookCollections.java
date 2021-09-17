package utils;


import static utils.Validations.*;
import static com.app.core.BookType.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import com.app.core.BookStore;



public class BookCollections {

	
	
	public static ArrayList<BookStore> populateSampleData() {
		ArrayList<BookStore> list = new ArrayList<>();
		try {  // HISTORY,AUTO_BIOGRAPHY,COIMIC,FANTASY,HORROR
					//  //String title, BookType catagory, double price, Date pdate, String authorNmae, int quantity
			list.add(new BookStore("Bhagat_Singh",HISTORY,350.0,convertDate("1-1-2021"),"Chtan_Bhagat",11));
			list.add(new BookStore("Leader",AUTO_BIOGRAPHY,250.0,convertDate("1-10-2017"),"Abhishek_Shelar",9));
			list.add(new BookStore("To_the_Moon",COMIC,400.0,convertDate("17-11-2020"),"Swap_Shelar",15));
			list.add(new BookStore("Rouge_nation",HISTORY,100.0,convertDate("15-3-2011"),"Chtan Bhagat",12));
			list.add(new BookStore("All_Mighty",HORROR,300.0,convertDate("16-7-2015"),"Abhishek_Shelar",7));
			list.add(new BookStore("Dont_Know",AUTO_BIOGRAPHY,350.0,convertDate("19-11-2018"),"Chtan Bhagat",8));
			list.add(new BookStore("Whatever",FANTASY,450.0,convertDate("30-10-2014"),"Chtan Bhagat",7));
			list.add(new BookStore("Okayyyy",COMIC,500.0,convertDate("21-6-2013"),"Abhishek_Shelar",18));
			
		} catch (ParseException e) {
			System.out.println("err in sample data " + e);
		}
		return list;
	}
	//add a static method to copy sample data from list ---> map
	public static HashMap<String,BookStore> populateMap(ArrayList<BookStore> books)
	{
		HashMap<String,BookStore> map=new HashMap<>();
		for(BookStore a : books) 
			System.out.println("Added "+map.put(a.getTitle(), a));
		return map;
	}
}
