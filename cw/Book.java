class Book extends Entity {
    private String author;
    private int pageCount;
    public Book(String name, int id, String author, int pageCount) {
        super(name, id);
        this.author = author;
        this.pageCount = pageCount;
    }
    public void performOperation() {
        pageCount -= 10;
        System.out.println("Reading " + name + " by " + author + ". Pages left: " + pageCount);
    }
    public int getPageCount() {
        return pageCount;
    }
}
