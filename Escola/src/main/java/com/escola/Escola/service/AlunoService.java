package com.escola.Escola.service;

import com.escola.Escola.Interface.AlunoRepository;
import com.escola.Escola.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/alunos")
public class AlunoService {
    private final AlunoRepository _repository;

    public AlunoService(AlunoRepository repository) {
        this._repository = repository;
    }

    public List<Aluno> listarTodos(){
        return _repository.findAll();
    }

    public Aluno salvar(Aluno aluno){
        return _repository.save(aluno);
    }

    public void deletar(Long id){
        _repository.deleteById(id);
    }
    public Aluno buscarPorId(Long id){
        return _repository.findById(id).orElse(null);
    }
}
