package com.example.pertemuan7.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan7.Modell.Mahasiswa
import com.example.pertemuan7.navigation.MahasiswaApp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {


    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())


    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswaStateUI.asStateFlow()


    fun saveDataMahasiswa(ls: MutableList<String>){
        _mahasiswaStateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2]
            )
        }
    }
}