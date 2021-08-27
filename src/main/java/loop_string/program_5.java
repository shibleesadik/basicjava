package loop_string;

//  <html>
//<body>
//<div>
//<p>Transaction Successful</p>
//<p>Trnx ID: TXN5164870</p>
//</div>
//
//
//</body>
//</html>
//
//
//Extract only transaction ID from the HTML
public class program_5 {
    public static void main(String[] args) {
        String content = " <html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        int pos = content.indexOf("TXN");
        System.out.println(content.substring(pos, 72));
//        content = content.replaceAll("[^\\d]", " ");
//        content = content.trim();
//        System.out.println(content);

    }
}
