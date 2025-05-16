package id.my.shianime.fragment.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {
    private val _page = MutableLiveData<Int>(1)
    val page: LiveData<Int> get() = _page
    fun setPage(value: Int) {
        _page.value = value
    }

    private val _loading = MutableLiveData<Boolean>(true)
    val isLoading: LiveData<Boolean> get() = _loading
    fun toggleLoading() {
        _loading.value = !_loading.value!!
    }
}
