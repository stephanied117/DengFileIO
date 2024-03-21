public class Webpage {
    private String name;
    private String content;

    public Webpage(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("Name: " + name + "\n");
        System.out.println(content);
    }
}
