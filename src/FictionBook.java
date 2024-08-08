public class FictionBook extends Book {
    private String Category;
    public FictionBook(String bookCode,String name,double price,String author,String Category){
        super(bookCode, name, price, author);
        this.Category = Category;
    }
    public String getCategory(){
        return Category;
    }
    public void setCategory(String category){
        Category = category;
    }

    @Override
    public double getAmount() {
        return getPrice()*93/100;
    }
}
