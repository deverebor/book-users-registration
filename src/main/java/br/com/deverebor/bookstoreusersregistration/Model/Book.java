package br.com.deverebor.bookstoreusersregistration.Model;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String label;
    private String pageQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(String pageQuantity) {
        this.pageQuantity = pageQuantity;
    }
}
