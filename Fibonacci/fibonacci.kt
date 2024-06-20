fun main(){
        var x = 0
        var y = 1
        var z = 0
    fun fibonacci(limit: Int){
        
        
        if(limit > 0){
            print("$y, ")
            z = x + y
            x = y
            y = z
            fibonacci(limit - 1)
        }
    }
    fibonacci(5) 
}
