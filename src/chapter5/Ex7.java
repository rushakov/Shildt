package chapter5;

public class Ex7 {
    class Encode {
        public void doShit(){
            String msg = "Это просто текст";
            String encmsg = "";
            char encchar;
            String decmsg = "";
            String key = "qwertyu";
            System.out.println("Исходное сообщение: "+msg);

            for(int i=0; i <msg.length(); i++) {
                encchar = msg.charAt(i);
                for (int j=0; j<key.length();j++ ) {
                    encchar = (char) (encchar^key.charAt(j));
                    //System.out.println("Encoded char #"+i+" iteration #"+j+": "+encchar);
                }
                encmsg = encmsg + encchar;
            }
            System.out.println("Encoded message: "+encmsg);

            for(int i=0; i <msg.length(); i++) {
                encchar = encmsg.charAt(i);
                for (int j=0; j<key.length();j++ ) {
                    encchar = (char) (encchar^key.charAt(j));
                    //System.out.println("Encoded char #"+i+" iteration #"+j+": "+encchar);
                }
                decmsg = decmsg + encchar;
            }
            System.out.println("Decoded message: "+decmsg);
        }
    }
    public static void main(String [] args){
        new Ex7().new Encode().doShit();
    }
}
