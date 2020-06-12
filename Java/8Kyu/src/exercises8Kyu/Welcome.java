package exercises8Kyu;

import java.util.HashMap;

public class Welcome {
	  public static String greet(String language){
		    HashMap<String, String> greeting = new HashMap<>();
		    greeting.put("english", "Welcome");
		    greeting.put("czech", "Vitejte");
		    greeting.put("danish", "Velkomst");
		    greeting.put("dutch", "Welkom");
		    greeting.put("estonian", "Tere tulemast");
		    greeting.put("finnish", "Tervetuloa");
		    greeting.put("flemish", "Welgekomen");
		    greeting.put("french", "Bienvenue");
		    greeting.put("german", "Willkommen");
		    greeting.put("irish", "Failte");
		    greeting.put("italian", "Benvenuto");
		    greeting.put("latvian", "Gaidits");
		    greeting.put("lithuanian", "Laukiamas");
		    greeting.put("polish", "Witamy");
		    greeting.put("spanish", "Bienvenido");
		    greeting.put("swedish", "Valkommen");
		    greeting.put("welsh", "Croeso");
		    
		    if (greeting.containsKey(language)) {
		      return greeting.get(language);
		    }
		    return greeting.get("english");
		   }
}
