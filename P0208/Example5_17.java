package P0208;

interface Advertisement{
    public abstract void showAdvertisement();
    public String getCorpName();
}

class AdvertisementBoard{
    Advertisement advertisement;
    public void setAdvertisement(Advertisement advertisement){
        this.advertisement=advertisement;
    }
    public void show(){
        if (advertisement!=null){
            System.out.println("广告牌显示"+advertisement.getCorpName()+"公司的广告词");
            advertisement.showAdvertisement();
        }
        else {
            System.out.println("广告牌无广告");
        }
    }
}

class PhilipsCorp implements Advertisement{
    public void showAdvertisement(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        System.out.println("没有最好,只有更好");
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
    }
    public String getCorpName(){
        return "飞利浦";
    }
}

class LenovoCorp implements Advertisement{
    public void showAdvertisement(){
        System.out.println("**************");
        System.out.println("让世界变得很小");
        System.out.println("**************");
    }
    public String getCorpName(){
        return "联想";
    }
}

public class Example5_17 {
    public static void main(String[] args) {
        AdvertisementBoard advertisementBoard=new AdvertisementBoard();
        advertisementBoard.setAdvertisement(new PhilipsCorp());
        advertisementBoard.show();
        advertisementBoard.setAdvertisement(new LenovoCorp());
        advertisementBoard.show();
    }
}
