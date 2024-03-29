package parcialFinal.e5Adapter;

public class Client {
    public static void main(String[] args) {
        AplicacionAndroid android = new AplicacionAndroid();
        android.login();
        android.reportes();
        android.logout();

        AplicacionIOS ios = new AplicacionIOS();
        ios.login();
        ios.reportes();
        ios.logout();

        AplicacionWindowsPhone windowsPhone = new AplicacionWindowsPhone();
        windowsPhone.login();
        windowsPhone.reportes();
        windowsPhone.logout();

        AplicacionWeb web = new AplicacionWeb();
        AplicacionAdapter webAdapter = new AplicacionAdapter(web);
        webAdapter.login();
        webAdapter.reportes();
        webAdapter.logout();

        AplicacionEscritorio escritorio = new AplicacionEscritorio();
        AplicacionAdapter escritoriAdapter = new AplicacionAdapter(escritorio);
        escritoriAdapter.login();
        escritoriAdapter.reportes();
        escritoriAdapter.logout();

        
    }
}
