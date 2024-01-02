package serialization_and_deserializationcom.jspiders.serialization.object;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int eId;
    private String eName;
    private String eDept;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }
}
