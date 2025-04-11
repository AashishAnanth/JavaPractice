public class StringOperations {
    public static void main (String[] args) {
        String name = "Aashish";
        char first = 'A';
        char last = 'z';
        String middle = name.substring(1, name.length() - 1);
        String newName = first + middle + last;
        System.out.println(newName);

        String url = "www.vatutors.org";
        System.out.println(url);
        String address = url.substring(4, url.lastIndexOf(".")) + "1331";
        System.out.println(address);
    }
}
// Status: Complete!