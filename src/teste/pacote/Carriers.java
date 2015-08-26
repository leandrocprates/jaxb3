package teste.pacote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lprates
 */
@XmlRootElement(name="carriers")
public class Carriers {
    
    private List<CarrierGroup> carrierGroups;
    
    public Carriers(){
        carrierGroups = new ArrayList<CarrierGroup>();
    }
    
    public List<CarrierGroup> getCarrierGroups() {
        return carrierGroups;
    }

    public void setCarrierGroups(List<CarrierGroup> carrierGroups) {
        this.carrierGroups = carrierGroups;
    }
    
}
