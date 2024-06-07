package com.example.appaula.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.appaula.roomdb.Pessoa
import kotlinx.coroutines.launch

//Declara a classe PessoaViewModel que herda de ViewModel
class PessoaViewModel(private val repository: Repository): ViewModel() {
    //Função que retorna todos os objetos Pessoa como LiveData
    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext)

    //Função para inserir ou atualizar um objeto Pessoa
    fun upsertPessoa(pessoa: Pessoa){
        //Inicia uma corrotina no escopo do ViewModel
        viewModelScope.launch {
            //Chama o método do repositório para inserir ou atualizar o objeto Pessoa
            repository.upsertPessoa(pessoa)
        }
    }

    //Função para deletar um objeto Pessoa
    fun deletePessoa(pessoa: Pessoa){
        viewModelScope.launch {
            //Chama o método do repositório para deletar o objeto Pessoa
            repository.deletePessoa(pessoa)
        }
    }
}