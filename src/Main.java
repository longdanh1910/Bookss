public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("pb01", "Java Programming", 120, "Teo", "Java", "linhtinh");
        ProgrammingBook pb2 = new ProgrammingBook("pb02", "C++ Programming", 90, "Ti", "C++", "linhtinh");
        ProgrammingBook pb3 = new ProgrammingBook("pb03", "JS Programming", 100, "Ta", "JS", "linhtinh");

        FictionBook fb1 = new FictionBook("FB001", "Fiction One", 100, "Ngao", "Viễn tưởng 1");
        FictionBook fb2 = new FictionBook("FB002", "Fiction Two", 90, "Chim", "Viễn tưởng 2");
        FictionBook fb3 = new FictionBook("FB003", "Fiction Three", 110, "Ho", "Viễn tưởng 1");


        Book[] books = {pb1, pb2, pb3, fb1, fb2, fb3};
        double sum = 0;
        for (Book book : books) {
            sum += book.getAmount();
        }
        System.out.println("Tổng tiền 6 quyển sách là" + sum);
        int countJavaLang = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage().equals("Java")) {
                countJavaLang++;
            }
        }
        System.out.println("Số sách có ngôn ngữ java là: " + countJavaLang);
    }

}