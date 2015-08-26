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
@XmlRootElement(name="appProperties")
public class AppProperties {
    
    private int appConfigId;
    
    private int mtAppConfigId;

    
    @XmlElement(name="appConfigId")
    public int getAppConfigId() {
        return appConfigId;
    }

    public void setAppConfigId(int appConfigId) {
        this.appConfigId = appConfigId;
    }

    @XmlElement(name="mtAppConfigId")
    public int getMtAppConfigId() {
        return mtAppConfigId;
    }

    public void setMtAppConfigId(int mtAppConfigId) {
        this.mtAppConfigId = mtAppConfigId;
    }
    
}
