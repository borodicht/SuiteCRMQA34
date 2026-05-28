package dto;

public class Account {

    private String name;
    private String phone;
    private String fax;
    private String street;
    private String description;
    private String type;
    private String industry;

    public Account(String name, String phone, String fax, String street, String description, String type, String industry) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.street = street;
        this.description = description;
        this.type = type;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
