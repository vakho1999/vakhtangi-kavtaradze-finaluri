package com.example.finaluri2.Service;

public interface service {
    AddModelout AddModel(AddModelIN addModelInput);

    DeleteModelout DeleteModel(DeleteModelIN deleteModelInput);

    GetModelout getModels(GetModelIN getModelInput);

}