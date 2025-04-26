package com.escola.Escola.controller;

import com.escola.Escola.model.Aluno;
import com.escola.Escola.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AlunoController {
    private final AlunoService _alunoService;

    public AlunoController(AlunoService _alunoService) {
        this._alunoService = _alunoService;
    }

    @GetMapping
    public List<Aluno> listar() {
        return _alunoService.listarTodos();
    }
    @PostMapping
    public Aluno criar (@RequestBody Aluno aluno){
        return _alunoService.salvar(aluno);
    }
    @GetMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno novoaluno){
        Aluno alunoExistente = _alunoService.buscarPorId(id);
        if (alunoExistente == null)return null ;

        alunoExistente.setNomeAluno(novoaluno.getNomeAluno());
        alunoExistente.setEmailAluno(novoaluno.getEmailAluno());
        alunoExistente.setTelefoneAluno(novoaluno.getTelefoneAluno());
        return _alunoService.salvar(alunoExistente);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        _alunoService.deletar(id);
    }



}
