import java.util.Locale;

public class international_local2{
	public static void main(String[] args) {
		Locale defaultLocale = Locale.getDefault();
	      	Locale enLocale = new Locale("en", "US");  
	      	Locale frLocale = new Locale("fr", "FR");  
	      	Locale esLocale = new Locale("es", "ES");

	      	System.out.println(defaultLocale.getDisplayLanguage(enLocale));
	      	System.out.println(defaultLocale.getDisplayLanguage(frLocale));
	      	System.out.println(defaultLocale.getDisplayLanguage(esLocale));
	}
}
