package org.pahappa.systems.pahappapricifypro.models.client;

import org.pahappa.systems.pahappapricifypro.models.constants.ClientGender;
import org.pahappa.systems.pahappapricifypro.models.quotation.Quotation;
import org.sers.webutils.model.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity {
    private String clientFirstName;
    private String clientLastName;
    private String companyName;
    private String clientContact;
    private String clientLocation;
    private ClientGender clientGender;


    @Column(name = "client_first_name")
    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    @Column(name = "client_last_name")
    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name = "client_contact")
    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    @Column(name = "client_location")
    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "client_gender")
    public ClientGender getClientGender() {
        return clientGender;
    }

    public void setClientGender(ClientGender clientGender) {
        this.clientGender = clientGender;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", clientContact='" + clientContact + '\'' +
                ", clientLocation='" + clientLocation + '\'' +
                ", clientGender=" + clientGender +
                '}';
    }
}
