package com.roboresume.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    GeneralRepository generalRepository;

    @Autowired
    EducationRepository educationRepository;

    @Autowired
    ExperienceRepository experienceRepository;

    @Autowired
    SkillRepository skillRepository;


    @RequestMapping("/")
    public String displayGenerals(Model model) {
        model.addAttribute("generals", generalRepository.findAll());
        return "display";
    }

    @RequestMapping("/")
    public String displayEducations(Model model) {
        model.addAttribute("educations", educationRepository.findAll());
        return "display";
    }

    @RequestMapping("/")
    public String displayExperiences(Model model) {
        model.addAttribute("experiences", experienceRepository.findAll());
        return "display";
    }

    @RequestMapping("/")
    public String displaySkills(Model model) {
        model.addAttribute("skills", skillRepository.findAll());
        return "display";
    }


    //add to forms

    @GetMapping("/add")
    public String generalForm(Model model) {
        model.addAttribute("general", new General());
        return "generalform";
    }

    @GetMapping("/add")
    public String educationForm(Model model) {
        model.addAttribute("education", new Education());
        return "educationform";
    }

    @GetMapping("/add")
    public String experienceForm(Model model) {
        model.addAttribute("experience", new Experience());
        return "experienceform";
    }

    @GetMapping("/add")
    public String skillForm(Model model) {
        model.addAttribute("skill", new Skill());
        return "skillform";
    }

    //process actions

    @PostMapping("/process")
    public String processForm (@Valid General general, BindingResult result)
    {
        if (result.hasErrors()){
            return "generalform";
        }
        generalRepository.save(general);
        return "redirect:/";
    }

    @PostMapping("/process")
    public String processForm (@Valid Education education, BindingResult result)
    {
        if (result.hasErrors()){
            return "educationform";
        }
        educationRepository.save(education);
        return "redirect:/";
    }

    @PostMapping("/process")
    public String processForm (@Valid Experience experience, BindingResult result)
    {
        if (result.hasErrors()){
            return "experienceform";
        }
        experienceRepository.save(experience);
        return "redirect:/";
    }

    @PostMapping("/process")
    public String processForm (@Valid Skill skill, BindingResult result)
    {
        if (result.hasErrors()){
            return "skillform";
        }
        skillRepository.save(skill);
        return "redirect:/";
    }

    //show

    @RequestMapping("/detail/{id}")
    public String showGeneral(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("general", generalRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/detail/{id}")
    public String showEducation(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("education", educationRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/detail/{id}")
    public String showExperience(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("experience", experienceRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/detail/{id}")
    public String showSkill(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("skill", skillRepository.findOne(id));
        return "show";
    }


    //update

    @RequestMapping("/update/{id}")
    public String updateGeneral(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("general", generalRepository.findOne(id));
        return "generalform";
    }

    @RequestMapping("/update/{id}")
    public String updateEducation(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("education", educationRepository.findOne(id));
        return "educationform";
    }

    @RequestMapping("/update/{id}")
    public String updateExperience(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("experience", experienceRepository.findOne(id));
        return "experienceform";
    }

    @RequestMapping("/update/{id}")
    public String updateSkill(@PathVariable("id") long id, Model model)
    {
        model.addAttribute("skill", skillRepository.findOne(id));
        return "skillform";
    }

    //delete

    @RequestMapping("/delete/{id}")
    public String delGeneral(@PathVariable("id") long id, Model model)
    {
        generalRepository.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delEducation(@PathVariable("id") long id, Model model)
    {
        educationRepository.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delExperience(@PathVariable("id") long id, Model model)
    {
        experienceRepository.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delSkill(@PathVariable("id") long id, Model model)
    {
        skillRepository.delete(id);
        return "redirect:/";
    }



}
