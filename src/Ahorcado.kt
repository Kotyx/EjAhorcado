fun main(){
    var palabra= arrayOf("e","c","h","a","r","o","n")
    var letra=""
    var ban= mutableListOf("","","","","","","","","","","","","","","","","","","")
    var resul= arrayOf("","","","","","","")
    var cadres=""
    var cadpal=""
    var i=0
    var cont=0
    var contb=0
    for(i in palabra.indices){
        resul[i]="_"
    }
    for(i in palabra.indices){
        cadpal=cadpal+palabra[i]
    }
    while(cadres.compareTo(cadpal) != 0){
        letra = readLine() as String
        if(letra in ban){
            println("YA DIJISTE LA LETRA PELOTUDOOO")
        }
        for(i in palabra.indices) {
            if (palabra[i] == letra) {
                resul[i] = letra
                ban[contb] = letra
                contb = contb + 1
            }
        }
        for(i in resul.indices){
            print(resul[i])
            cadres=cadres+resul[i]
        }
        print(resul)
        cont++
    }
    println("Conseguido en $cont intentos")
}