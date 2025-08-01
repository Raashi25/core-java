class Page {
    int pageNumber;
    String layout;
    Article article;

    public void getPageInfo() {
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Layout: " + layout);
        article.getArticleInfo();
    }
}
