package exercises8Kyu;

public class AbbreviateATwoWordName {
  public static String abbrevName(String name) {
	    return name.split("\\s+")[0].substring(0,1).toUpperCase() + "." + name.split("\\s+")[1].substring(0,1).toUpperCase();
	  }
}
