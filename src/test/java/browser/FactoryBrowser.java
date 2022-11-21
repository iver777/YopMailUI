package browser;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser = null;
        switch (browserType.toLowerCase()){
            case "chrome":
                browser= new Chrome();
                break;
            case "headless":
                browser=new HeadLess();
                break;
            case "grid":
                browser=new Grid();
                break;

        }
        return browser;
    }

}
