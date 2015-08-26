package teste.pacote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import teste.pacote.Carriers;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lprates
 */
@XmlRootElement(name="mtConfig")
public class MtConfig {
    
    
    private boolean longMessages;
    
    private Carriers carriers;

    public MtConfig(){
        carriers = new Carriers ();
    }
    
    
    @XmlElement(name="longMessages")
    public boolean isLongMessages() {
        return longMessages;
    }

    public void setLongMessages(boolean longMessages) {
        this.longMessages = longMessages;
    }

    public Carriers getCarriers() {
        return carriers;
    }

    public void setCarriers(Carriers carriers) {
        this.carriers = carriers;
    }
 
 
    
    
}
