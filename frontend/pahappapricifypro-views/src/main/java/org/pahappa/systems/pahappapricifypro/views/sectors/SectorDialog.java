package org.pahappa.systems.pahappapricifypro.views.sectors;

import org.pahappa.systems.pahappapricifypro.core.services.SectorService;
import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.pahappa.systems.pahappapricifypro.views.dialogs.DialogForm;
import org.sers.webutils.server.core.utils.ApplicationContextProvider;

import javax.annotation.PostConstruct;

import lombok.Getter;
import lombok.Setter;
import org.pahappa.systems.pahappapricifypro.security.HyperLinks;
import org.pahappa.systems.pahappapricifypro.views.dialogs.DialogForm;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.model.exception.ValidationFailedException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sectorDialog")
@SessionScoped
@Getter
@Setter

public class SectorDialog extends DialogForm<Sector> {
    private SectorService sectorService;

    @PostConstruct
    public void init(){
        this.sectorService = ApplicationContextProvider.getBean(SectorService.class);
    }

    public SectorDialog() {
        super(HyperLinks.SECTOR_FORM, 600, 600);
    }

    @Override
    public void persist() {
        try{
            System.out.println("in persist");
            this.sectorService.saveInstance(super.model);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void resetModal(){
        super.resetModal();
        super.model = new Sector();
    }
}
