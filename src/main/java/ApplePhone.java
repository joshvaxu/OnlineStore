/**
 * Created by tianjf on 2016/10/29.
 */
public class ApplePhone extends Phone {
    private String name = "";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return super.getName();
    }

    public void setParentName(String parentName) {
        super.setName(parentName);
    }
}
