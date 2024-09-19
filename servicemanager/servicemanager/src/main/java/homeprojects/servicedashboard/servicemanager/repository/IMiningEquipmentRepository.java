package homeprojects.servicedashboard.servicemanager.repository;

import homeprojects.servicedashboard.servicemanager.model.MiningEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMiningEquipmentRepository extends JpaRepository<MiningEquipment,Long> {
}
