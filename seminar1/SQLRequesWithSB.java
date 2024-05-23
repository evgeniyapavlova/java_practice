/**
 * SQLRequesWithSB
 */
public class SQLRequesWithSB {

    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";
        QUERY = "select * from students where ";
        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder sb = new StringBuilder();

        sb.append(QUERY);

        PARAMS = PARAMS.replace("\"", "")
                .replace("{", "")
                .replace("}", "");

        String[] arr = PARAMS.split(",");

        boolean isStart = true;
        for (String string : arr) {
            if (string.indexOf("null") != -1) {
                continue;
            } else {
                String[] strArr = string.trim().split(":");
                if (!isStart) {
                    sb.append(" and ");
                }
                sb.append(String.format("%s='%s'", strArr[0], strArr[1]));
                isStart = false;
            }

        }

        return sb;
    }
}