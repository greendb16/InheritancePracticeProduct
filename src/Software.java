public class Software extends Product {

    private String programmer;
    private String platform;
    private String os;

    @Override
    public String toString(){
        return "\n\nOS:\t" + getOs() + "\nPlatform:\t" + getPlatform() + "\nProgramed by:\t" + getProgrammer() +"\n" + super.toString() + "---------------------------";
    }

    public String getProgrammer() {
        return programmer; }

    public void setProgrammer(String programmer) {
        this.programmer = programmer; }

    public String getPlatform() {
        return platform; }

    public void setPlatform(String platform) {
        this.platform = platform; }

    public String getOs() {
        return os; }

    public void setOs(String os) {
        this.os = os; }
}
