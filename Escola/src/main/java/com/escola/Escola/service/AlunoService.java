package com.escola.Escola.service;

import com.escola.Escola.Interface.AlunoRepository;
import com.escola.Escola.model.Aluno;

import java.util.List;

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
