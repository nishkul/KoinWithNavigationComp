/*interface Presenter

class MyPresenter(val repository : Repository) : Presenter

class DataRepository()*/

interface Presenter {

    fun showPresenter()
}


class MyPresenter(val repositary: Repository) : Presenter {
    override fun showPresenter() {
        System.out.println(">>>>>>>  I create showPresenter")
        repositary.createRepo()
    }

}

class Repository() {

    fun createRepo() {
        System.out.println(">>>>>>> I create Repository")
    }

}

class NetWorkCall() {

    fun createNetork() {
        System.out.println(">>>>>>> I create NetWorkCall")
    }

}

class Utils() {

    init {
        System.out.println(">>>>>>> I create Utils")

    }

    fun createUtils() {
        System.out.println(">>>>>>> I calling  Utils")
    }

}