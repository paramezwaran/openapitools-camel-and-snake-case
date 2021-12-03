package com.param.rest.openapi.camelandsnakecase.api;

import com.param.rest.openapi.camelandsnakecase.camelcase.model.PetCamelCase;
import com.param.rest.openapi.camelandsnakecase.snakecase.model.PetSnakeCase;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Validated
public class PetCamelCaseController {

    @PostMapping(path = "/camelCase/pet",consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public String createPet(@Valid @RequestBody PetCamelCase petCamelCase){
        return "SUCCESS";
    }
}
