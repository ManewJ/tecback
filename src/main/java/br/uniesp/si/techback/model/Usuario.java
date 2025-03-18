package br.uniesp.si.techback.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;

        private String titulo;

        private Integer anolancamento;


    }
}
