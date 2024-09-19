package homeprojects.servicedashboard.servicemanager.service.impl;

import homeprojects.servicedashboard.servicemanager.model.MiningEquipment;
import homeprojects.servicedashboard.servicemanager.repository.IMiningEquipmentRepository;
import homeprojects.servicedashboard.servicemanager.service.MiningEquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiningEquipmentServiceImpl implements MiningEquipmentService {

    private IMiningEquipmentRepository miningEquipmentRepository;

    public MiningEquipmentServiceImpl(IMiningEquipmentRepository miningEquipmentRepository) {
        super();
        this.miningEquipmentRepository = miningEquipmentRepository;
    }

    @Override
    public List<MiningEquipment> getAllMiningEquipment() {
        return miningEquipmentRepository.findAll();
    }

    @Override
    public MiningEquipment saveMiningEquipment(MiningEquipment miningEquipment) {
        return miningEquipmentRepository.save(miningEquipment);
    }

    @Override
    public MiningEquipment getMiningEquipmentById(Long id) {
        return miningEquipmentRepository.findById(id).get();
    }

    @Override
    public MiningEquipment updateMiningEquipment(MiningEquipment miningEquipment) {
        return miningEquipmentRepository.save(miningEquipment);
    }

    @Override
    public void deleteMiningEquipmentById(Long id) {
        miningEquipmentRepository.deleteById(id);
    }
}
