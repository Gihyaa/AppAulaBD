package com.example.appaula.viewModel

// Importa a classe Pessoa que representa a entidade do banco de dados
import com.example.appaula.roomdb.Pessoa
// Importa a classe PessoaDataBase que fornece acesso ao banco de dados
import com.example.appaula.roomdb.PessoaDataBase

// Declara a classe Repository como um data class, que armazena o banco de dados PessoaDataBase
data class Repository(private val db:PessoaDataBase){

    // Função suspensa para inserir ou atualizar um objeto Pessoa no banco de dados
    suspend fun upsertPessoa(pessoa: Pessoa){
        // Chama o método upsertPessoa do DAO para realizar a operação
        db.pessoaDao().upsertPessoa(pessoa)
    }

    // Função suspensa para deletar um objeto Pessoa do banco de dados
    suspend fun deletePessoa(pessoa: Pessoa){
        // Chama o método deletePessoa do DAO para realizar a operação
        db.pessoaDao().deletePessoa(pessoa)
    }

    // Função para obter todos os objetos Pessoa do banco de dados
    // Retorna um Flow que pode ser observado para atualizações
    fun getAllPessoa() = db.pessoaDao().getAllPessoa()
}
