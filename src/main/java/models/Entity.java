package models;

import org.springframework.web.bind.annotation.RequestParam;

public class Entity {
    private String Fb50, Rb50, Fb50m, Rb50m, Fb27, Rb27, Fb12, Rb12, Fb5, Rb5;

    public Entity() {
    }

    public Entity(String fb50, String rb50, String fb50m, String rb50m, String fb27, String rb27, String fb12, String rb12, String fb5, String rb5) {
        Fb50 = fb50;
        Rb50 = rb50;
        Fb50m = fb50m;
        Rb50m = rb50m;
        Fb27 = fb27;
        Rb27 = rb27;
        Fb12 = fb12;
        Rb12 = rb12;
        Fb5 = fb5;
        Rb5 = rb5;
    }

    public String getFb50() {
        return Fb50;
    }

    public void setFb50(String fb50) {
        Fb50 = fb50;
    }

    public String getRb50() {
        return Rb50;
    }

    public void setRb50(String rb50) {
        Rb50 = rb50;
    }

    public String getFb50m() {
        return Fb50m;
    }

    public void setFb50m(String fb50m) {
        Fb50m = fb50m;
    }

    public String getRb50m() {
        return Rb50m;
    }

    public void setRb50m(String rb50m) {
        Rb50m = rb50m;
    }

    public String getFb27() {
        return Fb27;
    }

    public void setFb27(String fb27) {
        Fb27 = fb27;
    }

    public String getRb27() {
        return Rb27;
    }

    public void setRb27(String rb27) {
        Rb27 = rb27;
    }

    public String getFb12() {
        return Fb12;
    }

    public void setFb12(String fb12) {
        Fb12 = fb12;
    }

    public String getRb12() {
        return Rb12;
    }

    public void setRb12(String rb12) {
        Rb12 = rb12;
    }

    public String getFb5() {
        return Fb5;
    }

    public void setFb5(String fb5) {
        Fb5 = fb5;
    }

    public String getRb5() {
        return Rb5;
    }

    public void setRb5(String rb5) {
        Rb5 = rb5;
    }
}
