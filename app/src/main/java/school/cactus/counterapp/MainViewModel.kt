package school.cactus.counterapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // state
    private var _counter = MutableLiveData<Int>()
    var counter: LiveData<String> = Transformations.map(_counter) {
        it.toString()
    }

    init {
        _counter.value = 0
    }

    fun onClickMeButtonClicked() {
        _counter.value = _counter.value!! + 1 // business logic
    }
}