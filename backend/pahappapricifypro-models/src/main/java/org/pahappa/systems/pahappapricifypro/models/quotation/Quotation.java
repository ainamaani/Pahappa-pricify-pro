package org.pahappa.systems.pahappapricifypro.models.quotation;

import org.pahappa.systems.pahappapricifypro.models.client.Client;
import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.sers.webutils.model.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "quotations")
public class Quotation extends BaseEntity {
    private double TotalAmount;
    private String additionalComments;
    private Sector sector;
    private Client client;

    @Column(name = "total_amount")
    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }

    @Column(name = "additional_comments")
    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    @OneToOne
    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @ManyToOne
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
