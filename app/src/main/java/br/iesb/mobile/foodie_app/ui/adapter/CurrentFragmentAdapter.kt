package br.iesb.mobile.foodie_app.ui.adapter

class CurrentFragmentAdapter {

    companion object {

        private lateinit var current:String

        fun setCurrentFragment (s:String){
            current = s
        }
        fun getCurrentFragment(): String {
            return current
        }

    }


}