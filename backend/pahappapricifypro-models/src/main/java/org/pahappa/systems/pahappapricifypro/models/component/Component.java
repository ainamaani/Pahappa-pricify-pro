package org.pahappa.systems.pahappapricifypro.models.component;

import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.sers.webutils.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "components")
public class Component extends BaseEntity {

    private String componentType;
    private double componentPrice;
    private String componentDescription;
    private Sector sector;

    @Column(name = "component_type")
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    @Column(name = "component_price")
    public double getComponentPrice() {
        return componentPrice;
    }

    public void setComponentPrice(double componentPrice) {
        this.componentPrice = componentPrice;
    }

    @Column(name = "component_description")
    public String getComponentDescription() {
        return componentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    @ManyToOne
    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
