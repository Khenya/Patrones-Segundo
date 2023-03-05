package patronesddi.State.Ejemplo;

public class TarjetaVideo {

    private int percentageUse;
    private String total;
    private String description;

    public TarjetaVideo(){}
    public TarjetaVideo(int percentageUse, String total, String description) {
        this.percentageUse = percentageUse;
        this.total = total;
        this.description = description;
    }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("TarjetaVideo> total: "+total);
        System.out.println("TarjetaVideo> description: "+description);
        System.out.println("TarjetaVideo> percentageUse: "+percentageUse+"%");
    }
}
