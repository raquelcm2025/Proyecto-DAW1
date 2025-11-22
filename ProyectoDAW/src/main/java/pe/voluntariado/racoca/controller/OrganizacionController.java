package pe.voluntariado.racoca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.voluntariado.racoca.model.Organizacion;

@Controller
public class OrganizacionController {

    @GetMapping("/organizacion/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("organizacion", new Organizacion());
        return "registro-organizacion";
    }

  //  @PostMapping("/organizacion/registro")
    //public String procesarFormulario(@ModelAttribute Organizacion organizacion,
                                 //    Model model) {

        // guarda en BD, por ahora solo se muestra.
      //  System.out.println("Organizacion registrada: " + organizacion.getNombre());

        //model.addAttribute("organizacion", organizacion);
        //return "registro-exitoso";
  //  }
}
