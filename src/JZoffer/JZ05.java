//替换空格
package JZoffer;

public class JZ05 {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] newStr = new char[3*length];
        int index = 0;
        int i = 0;
        for(i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                newStr[index++] = '%';
                newStr[index++] = '2';
                newStr[index++] = '0';
            }
            else
                newStr[index++] = c;
        }
        String str = new String(newStr, 0, index);
        return str;
    }
}
