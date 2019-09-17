public class Main {

    public static void main(String[] args) {
        System.out.println(0x7ffffff); //134217727
        System.out.println(0x7ffffff>>>24); //右移24位获取高8位 ----7
        System.out.println(0x7ffffff>>>16);//134217727 / 2^16
        System.out.println(0x7ffffff>>>8);//  134217727/ 2^8
        System.out.println(0x7ffffff>>>0);//  34217727/ 2^0
        System.out.println(134217727 / 256);
    }
}
