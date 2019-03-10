package br.ufc.quixada.dadm.rogaldornquotes.entity;

public class Quote {

    private Integer id;
    private String quote;
    private String source;

    public Quote() {
    }

    public Quote(String quote, String source) {
        this.quote = quote;
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
