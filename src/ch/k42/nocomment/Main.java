package ch.k42.nocomment;

/**
 * Created with IntelliJ IDEA.
 * User: Thomas
 * Date: 27.09.13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        String str = "{\n" +
                    "  \"Herausgeber\": \"Xema\"," + "//* stupid comment **a/ */" + "\n" +
                    "  \"Nummer\": \"1234-5678-9012-3456\",\n" +
                    "  \"Deckung\": 2e+6,\n" +
                    "  \"Währung\": \"EURO\",\n" +
                    "  \"Inhaber\": {\n" +
                    "    \"Name\": \"Mustermann\",\n" +
                    "    \"Vorname\": \"Max\",\n" +
                    "    \"männlich\": true,\n" +
                    "    \"Hobbys\": [ \"R\\\"/*   */eiten\", \"Go///lfen\", \"Lesen\" ],\n" +
                    "    \"Alter\": 42,\n" +
                    "    \"Kinder\": [],\n" +
                    "    \"Partner\": null\n" +
                    "  }\n" +
                    "}";

        System.out.println(str);
        System.out.println(Nimmersatt.friss(str));
    }
}
