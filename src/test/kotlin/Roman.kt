class Roman {
    fun convert(s: String): Int {
        val letter: CharArray = s.toCharArray()
        var arab = 0

        for(i in 0..letter.lastIndex) {
            if (letter[i] == 'I') {
                arab += 1;
                continue;
            }

            if (letter[i] == 'V') {
                arab += 5;
                if(i == 0)
                continue;
                if(letter[i-1] == 'I'){
                    arab -= 2
                    continue;
                }
            }
            if (letter[i] == 'X') {
                arab += 10;
                if(i == 0)
                    continue;
                if(letter[i-1] == 'I'){
                    arab -= 2
                    continue;
                }
            }
            if (letter[i] == 'L') {
                arab += 50;
                if(i == 0)
                    continue;
                if(letter[i-1] == 'X'){
                    arab -= 20
                    continue;
                }
            }

            if (letter[i] == 'C') {
                arab += 100;
                if(i == 0)
                    continue;
                if(letter[i-1] == 'X'){
                    arab -= 20
                    continue;
                }
            }

            if (letter[i] == 'D') {
                arab += 500;
                if(i == 0)
                    continue;
                if(letter[i-1] == 'C'){
                    arab -= 200
                    continue;
                }
            }

            if (letter[i] == 'M') {
                arab += 1000;
                if(i == 0)
                    continue;
                if(letter[i-1] == 'C'){
                    arab -= 200
                    continue;
                }
            }
        }

        return  arab
    }

}
