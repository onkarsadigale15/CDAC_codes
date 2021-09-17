package utils;

import java.text.ParseException;
import java.util.Date;
import static com.app.core.BookStore.sdf;
import com.app.core.BookType;

public class Validations {
	
	public static BookType convertType(String booktype) {
		return BookType.valueOf(booktype.toUpperCase());
		
	}
	public static Date convertDate(String date)throws ParseException {
		return sdf.parse(date);
	}

}
