package homeprojects.servicedashboard.servicemanager.controller;

import homeprojects.servicedashboard.servicemanager.model.MiningEquipment;
import homeprojects.servicedashboard.servicemanager.service.MiningEquipmentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MiningEquipmentController {


    private MiningEquipmentService miningEquipmentService;

    public MiningEquipmentController(MiningEquipmentService miningEquipmentService) {
        super();
        this.miningEquipmentService = miningEquipmentService;
    }

    @GetMapping({"/MiningDashboardIndex"})
    public String viewMiningEquipmentList(Model model,RedirectAttributes redirectAttributes) {
        model.addAttribute("MiningDashboardIndex",miningEquipmentService.getAllMiningEquipment());
        redirectAttributes.addFlashAttribute("save", "Продуктът е успешно създаден!");
        return "MiningDashboardIndex";
    }

    @GetMapping("/MiningDashboardIndex/addMiningEquipment")
    public String addMiningEquipment(Model model){
        model.addAttribute("miningEquipment",new MiningEquipment());
        return "Add_Mining_Equipment";
    }

    @PostMapping("/MiningDashboardIndex")
    public String saveMiningEquipment(@ModelAttribute("miningEquipment") MiningEquipment miningEquipment){
        miningEquipmentService.saveMiningEquipment(miningEquipment);
        return "redirect:/MiningDashboardIndex";
    }

    @GetMapping("/MiningDashboardIndex/editMiningEquipment/{id}")
    public String editMiningEquipment(@PathVariable Long id, Model model){
        model.addAttribute("miningEquipment",miningEquipmentService.getMiningEquipmentById(id));

        return "Edit_Mining_Equipment";
    }

    @PostMapping("/MiningDashboardIndex/{id}")
    public String updateMiningEquipment(@PathVariable Long id, @ModelAttribute("miningEquipment") MiningEquipment miningEquipment, Model model){

        MiningEquipment existingMiningEquipment=miningEquipmentService.getMiningEquipmentById(id);

        existingMiningEquipment.setMiningEquipmentId(id);
        existingMiningEquipment.setBrand(miningEquipment.getBrand());
        existingMiningEquipment.setModel(miningEquipment.getModel());
        existingMiningEquipment.setChargingPort(miningEquipment.getChargingPort());
        existingMiningEquipment.setMiningEquipmentType(miningEquipment.getMiningEquipmentType());
        existingMiningEquipment.setAnyDeskId(miningEquipment.getAnyDeskId());
        existingMiningEquipment.setAnyDeskPassword(miningEquipment.getAnyDeskPassword());

        miningEquipmentService.updateMiningEquipment(existingMiningEquipment);

        return "redirect:/MiningDashboardIndex";
    }

    @GetMapping("/MiningDashboardIndex/{id}")
    public String deleteMiningEquipment(@PathVariable Long id,RedirectAttributes redirectAttributes){

        miningEquipmentService.deleteMiningEquipmentById(id);
        redirectAttributes.addFlashAttribute("delete", "Продуктът е успешно изтрит!");

        return "redirect:/MiningDashboardIndex";
    }
}

