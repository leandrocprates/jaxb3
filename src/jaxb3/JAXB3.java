/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaxb3;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import teste.pacote.App;
import teste.pacote.Carrier;
import teste.pacote.CarrierGroup;

/**
 *
 * @author lprates
 */
public class JAXB3 {


        public static void main(String[] args) throws JAXBException {

            JAXBContext context = JAXBContext.newInstance(App.class);

            /*Geração do arquivo xml*/
            Marshaller marshaller = context.createMarshaller();

            App app = new App();
            app.setAppid("teste appid ");
            app.setCaptureMO(true);
            app.setDomain("dominio");
            app.setName("meu nome");
            
            app.getMoConfig().setCaptureMOMode("captura");
            app.getMoConfig().setDispatcherConfigMOId(2);
            app.getMoConfig().setDispatcherConfigMOName("nome dispatcher");

            app.getMoConfig().getLookUpActionConfig().setCurrentContext("currentContext");
            app.getMoConfig().getLookUpActionConfig().setKeyword("keyword");
            
            app.getMoConfig().getLaPoolConfig().setSessionTime(1000);
            app.getMoConfig().getLaPoolConfig().setSessionTimeUnit("sessionimeUnit");
            
            app.getMoConfig().getAppProperties().setAppConfigId(10);
            app.getMoConfig().getAppProperties().setMtAppConfigId(5);

            /***Fim Mo ***/
            
            Carrier carrier=new Carrier();
            carrier.setId(1);
            carrier.setLa(50600);
            carrier.setLaPool(57777);
            carrier.setDispatcherConfigMTName("dispatcher configname");
            carrier.setDispatcherConfigMTId(5);
            
            
            CarrierGroup carrierGroup=new CarrierGroup();
            carrierGroup.setId(1);
            carrierGroup.setCarrier(carrier);

            app.getMtConfig().setLongMessages(true);
            app.getMtConfig().getCarriers().getCarrierGroups().add(carrierGroup);
            
            marshaller.marshal(app, new File("C:\\Users\\lprates\\Documents\\NetBeansProjects\\JAXB3\\teste.xml"));


            /*Leitura do arquivo xml*/
            //Unmarshaller unmarshaller = context.createUnmarshaller();

            //Conta conta2 = (Conta) unmarshaller.unmarshal(new File("conta.xml"));

            //System.out.println(conta2.getLimite());
            //System.out.println(conta2.getSaldo());
            //System.out.println(conta2.getCliente().getNome());


        }

        
}
