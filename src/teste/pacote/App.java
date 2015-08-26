package teste.pacote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lprates
 */
@XmlRootElement(name="app")
public class App {

    
    private String appid;
    
    
    private String name;
    
    
    private String domain;
    
    
    private boolean captureMO;
    
    private MoConfig moConfig;
    private MtConfig mtConfig;

    
    public App(){
        moConfig=new MoConfig();
        mtConfig=new MtConfig();
    }
    
    
    @XmlElement(name="appid")
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @XmlElement(name="captureMo")
    public boolean isCaptureMO() {
        return captureMO;
    }

    public void setCaptureMO(boolean captureMO) {
        this.captureMO = captureMO;
    }

    
    
    public MoConfig getMoConfig() {
        return moConfig;
    }

    public void setMoConfig(MoConfig moConfig) {
        this.moConfig = moConfig;
    }

    
    public MtConfig getMtConfig() {
        return mtConfig;
    }

    public void setMtConfig(MtConfig mtConfig) {
        this.mtConfig = mtConfig;
    }
    
    
    

}
