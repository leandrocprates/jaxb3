package teste.pacote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lprates
 */
@XmlRootElement(name="carrier")
public class Carrier {
        
    private int id;

    private String domain;

    private int la;

    private int laPool;

    private int dispatcherConfigMTId;

    private String dispatcherConfigMTName;

    
    @XmlAttribute(name="id")    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute(name="domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @XmlElement(name="la")
    public int getLa() {
        return la;
    }

    public void setLa(int la) {
        this.la = la;
    }

    @XmlElement(name="laPool")
    public int getLaPool() {
        return laPool;
    }

    public void setLaPool(int laPool) {
        this.laPool = laPool;
    }

    @XmlElement(name="dispatcherConfigMTId")
    public int getDispatcherConfigMTId() {
        return dispatcherConfigMTId;
    }

    public void setDispatcherConfigMTId(int dispatcherConfigMTId) {
        this.dispatcherConfigMTId = dispatcherConfigMTId;
    }

    @XmlElement(name="dispatcherConfigMTName")
    public String getDispatcherConfigMTName() {
        return dispatcherConfigMTName;
    }

    public void setDispatcherConfigMTName(String dispatcherConfigMTName) {
        this.dispatcherConfigMTName = dispatcherConfigMTName;
    }
        
        
        
    
}
