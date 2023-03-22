package parcialFinal.e4Proxy;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("Brenda", "vsdhb214.");
        User user2 = new User("Nicole", "vdb 0.");
        User user3 = new User("Brandon", "dbv2.");

        Proxy proxy = new Proxy();

        proxy.serverUser(user1);
        proxy.serverUser(user2);
        proxy.serverUser(user3);
    }
}
