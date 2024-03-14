package Entity;

import jakarta.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Branch {

    @Id
    private String branchId;
    private String branchNmae;
    private String location;

    public Branch() {
    }

    public Branch(String branchId, String branchNmae, String location) {
        this.branchId = branchId;
        this.branchNmae = branchNmae;
        this.location = location;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchNmae() {
        return branchNmae;
    }

    public void setBranchNmae(String branchNmae) {
        this.branchNmae = branchNmae;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
