package Week1.src.homework;


public class stringsDemo {
    public static void main(String[] args) {

    String message = "Bugün hava çok güzel.";
    System.out.println(message);

    // System.out.println(message.length());
    // System.out.println("5. Eleman : " + message.charAt(4));
    // System.out.println(message.concat("Yaşasın"));
    // System.out.println(message.startsWith("B"));
    // System.out.println(message.endsWith("."));
    // char characters[] = new char[5];
    // message.getChars(0, 5, characters, 0);
    // System.out.println(characters);
    // System.out.println(message.indexOf("av"));
    // System.out.println(message.lastIndexOf('a'));

    System.out.println(message.replace(' ','-'));
    System.out.println(message.substring(2,6));

    for(String kelime:message.split(" ")){
        System.out.println(kelime);
    }

    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());
    System.out.println(message.trim());


}
}