package org.pahappa.systems.pahappapricifypro.views.components;

import lombok.Getter;
import lombok.Setter;
import org.pahappa.systems.pahappapricifypro.core.services.ComponentService;
import org.pahappa.systems.pahappapricifypro.core.services.SectorService;
import org.pahappa.systems.pahappapricifypro.models.component.Component;
import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.pahappa.systems.pahappapricifypro.security.HyperLinks;
import org.pahappa.systems.pahappapricifypro.views.dialogs.DialogForm;
import org.sers.webutils.server.core.utils.ApplicationContextProvider;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "componentDialog")
@SessionScoped
@Getter
@Setter
public class ComponentDialog extends DialogForm<Component> {
    private ComponentService componentService;
    private SectorService sectorService;
    private Sector selectedSector;


    @PostConstruct
    public void init(){
        this.componentService = ApplicationContextProvider.getBean(ComponentService.class);
    }

    public ComponentDialog() {
        super(HyperLinks.COMPONENT_FORM, 600, 600);
        model = new Component();
    }


    @Override
    public void persist() {
        try {
            if (selectedSector != null) {
                super.model.setSector(selectedSector); // Set the selected sector to the component
            }
            this.componentService.saveInstance(super.model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void resetModal(){
        super.resetModal();
    }


}
