package org.pahappa.systems.pahappapricifypro.models.sector;

import org.sers.webutils.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sectors")
public class Sector extends BaseEntity {
    private String SectorName;
    private String SectorDescription;

    @Column(name = "sector_name")
    public String getSectorName() {
        return SectorName;
    }

    public void setSectorName(String sectorName) {
        SectorName = sectorName;
    }

    @Column(name = "sector_description")
    public String getSectorDescription() {
        return SectorDescription;
    }

    public void setSectorDescription(String sectorDescription) {
        SectorDescription = sectorDescription;
    }
}
