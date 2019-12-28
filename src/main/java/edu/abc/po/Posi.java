package edu.abc.po;

public class Posi {

    private String posId;

    private String posName;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    @Override
    public String toString() {
        return "Posi{" +
                "posId='" + posId + '\'' +
                ", posName='" + posName + '\'' +
                '}';
    }
}
