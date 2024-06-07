package com.example.appaula.roomdb

// Importa as anotações necessárias do Room
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
// Importa o tipo Flow da biblioteca kotlinx.coroutines
import kotlinx.coroutines.flow.Flow

// Marca a interface como um DAO (Data Access Object) do Room
@Dao
interface PessoaDao {

    // Anota o método para inserir ou atualizar uma entidade Pessoa no banco de dados
    @Upsert
    suspend fun  upsertPessoa(pessoa: Pessoa)

    // Anota o método para deletar uma entidade Pessoa do banco de dados
    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    // Anota o método para consultar todas as entidades Pessoa do banco de dados
    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}