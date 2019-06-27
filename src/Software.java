public final class Software extends Product {

    private String programmer;
    private String platform;
    private String os;

    @Override
    public String toString(){
        return "\n\nOS:\t" + getOs() + "\nPlatform:\t" + getPlatform() + "\nProgramed by:\t" + getProgrammer() +"\n" + super.toString() + "---------------------------";
    }
    //@Override
//    public boolean equals(Software obj){
//        if(obj == null){ return false; }
//        if(this.getClass() != obj.getClass()){ return false;}
//        if(programmer != (obj).programmer){return false;}
//        if(platform != (obj).platform){return false;}
//        if(os != (obj).os){return false;}
//        else{return true;}
//    }

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
