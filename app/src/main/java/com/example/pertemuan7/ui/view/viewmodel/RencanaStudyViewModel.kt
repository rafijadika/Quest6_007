package com.example.pertemuan7.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan7.Modell.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {

    // StateFlow untuk menyimpan data KRS
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()


    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { currentState ->
            currentState.copy(mataKuliah = mkPilihan)
        }
    }


    fun setKelas(kelasPilihan: String) {
        _krsState.update { currentState ->
            currentState.copy(kelas = kelasPilihan)
        }
    }


    fun saveDataKRS(data: MutableList<String>) {
        if (data.size >= 2) {
            _krsState.update { currentState ->
                currentState.copy(
                    mataKuliah = data[0],
                    kelas = data[1]
                )
            }
        } else {
            // Log error atau tambahkan validasi untuk input yang tidak sesuai
            throw IllegalArgumentException("Data KRS tidak valid. Pastikan semua data sudah dipilih.")
        }
    }
}
