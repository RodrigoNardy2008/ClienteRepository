package br.com.fatec.sistemacomercioweb.controller;

import br.com.fatec.sistemacomercioweb.model.Produto;
import br.com.fatec.sistemacomercioweb.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
 private final ProdutoService service;
 public ProdutoController(ProdutoService service) {
 this.service = service;
 }
 @GetMapping
 public String listarTodos(Model model) {
 model.addAttribute("produtos", service.listarTodos());
 return "produtos/lista";
 }
 @GetMapping("/novo")
 public String novo(Model model) {
 model.addAttribute("produto", new Produto());
 return "produtos/formulario";
 }
 @PostMapping("/salvar")
 public String salvar(@ModelAttribute Produto produto) {
 service.cadastrar(produto);
 return "redirect:/produtos";
 }
}