package homeprojects.servicedashboard.servicemanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import homeprojects.servicedashboard.servicemanager.enums.MiningEquipmentTypeEnum;
import jakarta.persistence.*;
import org.springframework.context.annotation.PropertySource;

@Entity
@Table(name="mining_equipment")
public class MiningEquipment {

    @Id
    @JsonProperty(value="Id")
    @Column(name="miningEquipmentId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long miningEquipmentId;

    @JsonProperty(value = "Brand")
    @Column(name = "brand")
    private String brand;

    @JsonProperty(value = "Model")
    @Column(name = "model")
    private String model;

    @JsonProperty(value = "ChargingPort")
    @Column(name = "charging_port")
    private int chargingPort;

    @JsonProperty(value = "MiningEquipmentType")
    @Column(name = "mining_equipment_type")
    private MiningEquipmentTypeEnum miningEquipmentType;

    @JsonProperty(value = "AnyDeskId")
    @Column(name = "anydesk_id")
    private String anyDeskId;

    @JsonProperty(value = "AnyDeskPassword")
    @Column(name = "anydesk_password")
    private String anyDeskPassword;

    public MiningEquipment(){

    }
    public MiningEquipment(Long miningEquipmentId, String brand, String model, int chargingPort, MiningEquipmentTypeEnum miningEquipmentType, String anyDeskId, String anyDeskPassword) {
        this.miningEquipmentId = miningEquipmentId;
        this.brand = brand;
        this.model = model;
        this.chargingPort = chargingPort;
        this.miningEquipmentType = miningEquipmentType;
        this.anyDeskId = anyDeskId;
        this.anyDeskPassword = anyDeskPassword;
    }

    public Long getMiningEquipmentId() {
        return miningEquipmentId;
    }

    public void setMiningEquipmentId(Long miningEquipmentId) {
        this.miningEquipmentId = miningEquipmentId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(int chargingPort) {
        this.chargingPort = chargingPort;
    }

    public MiningEquipmentTypeEnum getMiningEquipmentType() {
        return miningEquipmentType;
    }

    public void setMiningEquipmentType(MiningEquipmentTypeEnum miningEquipmentType) {
        this.miningEquipmentType = miningEquipmentType;
    }

    public String getAnyDeskId() {
        return anyDeskId;
    }

    public void setAnyDeskId(String anyDeskId) {
        this.anyDeskId = anyDeskId;
    }

    public String getAnyDeskPassword() {
        return anyDeskPassword;
    }

    public void setAnyDeskPassword(String anyDeskPassword) {
        this.anyDeskPassword = anyDeskPassword;
    }
}
