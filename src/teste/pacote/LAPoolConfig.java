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
@XmlRootElement(name="LAPoolConfig")
public class LAPoolConfig {
 
    private int sessionTime;
    
    private String sessionTimeUnit;

    
    @XmlElement(name="sessionTime")
    public int getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(int sessionTime) {
        this.sessionTime = sessionTime;
    }

    @XmlElement(name="sessionTimeUnit")
    public String getSessionTimeUnit() {
        return sessionTimeUnit;
    }

    public void setSessionTimeUnit(String sessionTimeUnit) {
        this.sessionTimeUnit = sessionTimeUnit;
    }
    
    
}
