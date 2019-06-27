public final class Book extends Product {

    private String author;
    private int pages;
    private String title;

    @Override
    public String toString(){

        return  "\nBookDetails:\n" + "Book Title:\t" + getTitle() + "\nAuthor:\t" + getAuthor() + "\nPages:\t" + getPages() + "\n" + super.toString() + "---------------------------" ;
    }

    //@Override
    public boolean equals(Book obj){
        if(obj == null){ return false; }
        if(this.getClass() != obj.getClass()){ return false;}
        if(author != (obj).author){return false;}
        if(pages != (obj).pages){return false;}
        if(title != (obj).title){return false;}
        else{return true;}
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
