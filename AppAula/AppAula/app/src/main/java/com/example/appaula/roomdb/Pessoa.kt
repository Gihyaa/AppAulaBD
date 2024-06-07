package com.example.appaula.roomdb

// Importa as anotações necessárias para definir uma entidade Room
import androidx.room.Entity
import androidx.room.PrimaryKey

// Anota a classe Pessoa como uma entidade Room
@Entity
data class Pessoa(
    // Define o campo nome da entidade
    val nome: String,
    // Define o campo telefone da entidade
    val telefone: String,
    // Define o campo id como chave primária, com autoincremento automático
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
