package br.com.biblioteca.bibliocrab.api.livro;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.modelo.livro.Livro;
import br.com.biblioteca.bibliocrab.modelo.livro.LivroService;

@RestController
@CrossOrigin
@RequestMapping("/livro")
public class LivroController {
    
    @Autowired
    private LivroService livroService;

   @GetMapping
   public Iterable<Livro> listarTodos() {
       return livroService.listarTodos();
   }

    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro){
    return livroService.save(livro);
  }
  
   @GetMapping("/{id}")
   public Livro obterPorID(@PathVariable Long id) {

       return livroService.obterPorID(id);
   }

   /*Livros livros = request.build();
   livros.setCategoriaLivros(categoriaLivrosService.obterPorID(request.getIdCategoria()));
   livrosService.update(id, livros);*/



   /*@PostMapping
   public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

    Cliente cliente = clienteService.save(request.build());
       return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
   }



    @PutMapping("/{id}")
   public ResponseEntity<Cliente> update(@PathVariable("id") Long id, @RequestBody ClienteRequest request) {

    clienteService.update(id, request.build());
       return ResponseEntity.ok().build();
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id) {

    clienteService.delete(id);
      return ResponseEntity.ok().build();
   }*/
}