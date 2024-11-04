public class Client {
    public static void main(String[] args) {
        Article article = new Article();

        // Adding various components to the article
        article.addComponent(new Paragraph("This is the first paragraph of the article."));
        article.addComponent(new Picture("image1.jpg"));
        article.addComponent(new Paragraph("This is the second paragraph of the article."));
        article.addComponent(new Picture("image2.jpg"));

        ArticleIterator iterator = (ArticleIterator) article.iterator();
        while (iterator.hasNext()) {
            ArticleComponent component = iterator.next();
            component.display();
        }
    }
}