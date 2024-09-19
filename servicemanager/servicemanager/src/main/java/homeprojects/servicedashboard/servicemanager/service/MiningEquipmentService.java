package homeprojects.servicedashboard.servicemanager.service;

import homeprojects.servicedashboard.servicemanager.model.MiningEquipment;
import homeprojects.servicedashboard.servicemanager.repository.IMiningEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface MiningEquipmentService {

    List<MiningEquipment> getAllMiningEquipment();

    MiningEquipment saveMiningEquipment(MiningEquipment miningEquipment);

    MiningEquipment getMiningEquipmentById(Long id);

    MiningEquipment updateMiningEquipment(MiningEquipment miningEquipment);

    void deleteMiningEquipmentById(Long id);
}
