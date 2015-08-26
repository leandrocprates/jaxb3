package teste.pacote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import teste.pacote.AppProperties;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lprates
 */
@XmlRootElement(name="moConfig")
public class MoConfig {
    
    
    private String captureMOMode;
    
    
    private LookUpActionConfig lookUpActionConfig;
    
    private LAPoolConfig laPoolConfig;
    
    private AppProperties appProperties;
    
    private int dispatcherConfigMOId;
    
    private String dispatcherConfigMOName;

    
    public MoConfig(){
        lookUpActionConfig = new LookUpActionConfig();
        laPoolConfig = new LAPoolConfig();
        appProperties = new AppProperties();
    }
    
    
    @XmlElement(name="captureMOMode")
    public String getCaptureMOMode() {
        return captureMOMode;
    }

    public void setCaptureMOMode(String captureMOMode) {
        this.captureMOMode = captureMOMode;
    }

    public LookUpActionConfig getLookUpActionConfig() {
        return lookUpActionConfig;
    }

    public void setLookUpActionConfig(LookUpActionConfig lookUpActionConfig) {
        this.lookUpActionConfig = lookUpActionConfig;
    }

    public LAPoolConfig getLaPoolConfig() {
        return laPoolConfig;
    }

    public void setLaPoolConfig(LAPoolConfig laPoolConfig) {
        this.laPoolConfig = laPoolConfig;
    }

    public AppProperties getAppProperties() {
        return appProperties;
    }

    public void setAppProperties(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    
    @XmlElement(name="dispatcherConfigMOId")
    public int getDispatcherConfigMOId() {
        return dispatcherConfigMOId;
    }

    public void setDispatcherConfigMOId(int dispatcherConfigMOId) {
        this.dispatcherConfigMOId = dispatcherConfigMOId;
    }

    @XmlElement(name="dispatcherConfigMOName")
    public String getDispatcherConfigMOName() {
        return dispatcherConfigMOName;
    }

    public void setDispatcherConfigMOName(String dispatcherConfigMOName) {
        this.dispatcherConfigMOName = dispatcherConfigMOName;
    }
    
    
}
