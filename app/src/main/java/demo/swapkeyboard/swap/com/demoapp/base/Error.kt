package demo.swapkeyboard.swap.com.demoapp.base

data class Error(val errorCode: String, val errorMessage: String, val listInnerErrors: List<Error> = emptyList()){

    companion object {
        const val INTERNAL_ERROR = "INTERNAL_ERROR"
    }
}