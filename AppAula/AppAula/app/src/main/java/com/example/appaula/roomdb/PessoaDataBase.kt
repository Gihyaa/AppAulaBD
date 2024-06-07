package com.example.appaula.roomdb

// Importa a anotação Database do Room
import androidx.room.Database
// Importa a classe RoomDatabase do Room
import androidx.room.RoomDatabase

// Anota a classe como um banco de dados do Room
@Database(
    // Define as entidades (tabelas) que fazem parte do banco de dados
    entities = [Pessoa::class],
    // Define a versão do banco de dados
    version = 1
)

// Classe abstrata que estende RoomDatabase para representar o banco de dados
abstract class PessoaDataBase: RoomDatabase() {
    // Define um método abstrato para fornecer acesso ao DAO correspondente
    abstract fun pessoaDao(): PessoaDao
}