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
    private String defaultComponentName;
    private String additionalComponentName;
    private double componentPrice;
    private String componentDescription;
    private Sector sector;

    @Column(name = "default_component_name")
    public String getDefaultComponentName() {
        return defaultComponentName;
    }

    public void setDefaultComponentName(String defaultComponentName) {
        this.defaultComponentName = defaultComponentName;
    }

    @Column(name = "additional_component_name")
    public String getAdditionalComponentName() {
        return additionalComponentName;
    }

    public void setAdditionalComponentName(String additionalComponentName) {
        this.additionalComponentName = additionalComponentName;
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
