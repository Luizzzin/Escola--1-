package com.escola.Escola.controller;

import com.escola.Escola.service.AlunoService;

public class AlunoController {
    private final AlunoService _alunoService;

    public AlunoController(AlunoService _alunoService) {
        this._alunoService = _alunoService;
    }
}
