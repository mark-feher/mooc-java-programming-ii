public class Book{
    private String bookName;
    private int bookAgeRecommendation;

    public Book(String bookName, int bookAgeRecommendation) {
        this.bookName = bookName;
        this.bookAgeRecommendation = bookAgeRecommendation;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookAgeRecommendation() {
        return this.bookAgeRecommendation;
    }

    @Override
    public String toString() {
        return this.bookName + " (recommended for " + bookAgeRecommendation +
                " year-olds or older)";
    }
}
