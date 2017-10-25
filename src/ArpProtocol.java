/**
 * Created by kissi on 25/10/17.
 */
public class ArpProtocol {
private String adrIp;
private String adrMac;

    public ArpProtocol(String adrIp) {
        this.adrIp = adrIp;

    }

    public ArpProtocol(String adrIp, String adrMac) {
        this.adrIp = adrIp;
        this.adrMac = adrMac;
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




}
