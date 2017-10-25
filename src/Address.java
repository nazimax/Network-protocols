/**
 * Created by kissi on 25/10/17.
 */
public class Address {
    private String adrIp;
    private String adrMac;

    public Address(String adrIp, String adrMac) {
        this.adrIp = adrIp;
        this.adrMac = adrMac;
    }

    public Address(String adrIp) {
        this.adrIp = adrIp;
    }

    public String getAdrIp() {
        return adrIp;
    }

    public void setAdrIp(String adrIp) {
        this.adrIp = adrIp;
    }

    public String getAdrMac() {
        return adrMac;
    }

    public void setAdrMac(String adrMac) {
        this.adrMac = adrMac;

    }

    @Override
    public String toString() {
        return adrMac+" | "+adrIp;
    }
}
