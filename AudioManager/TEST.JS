let a = 1
let b = a
let c = 2
let d = c;

                for (let cont=1; cont < 5 ; cont += 2) {
                        a += b;
                        b =- c ;
                        c += d;
                        d =- a ;
                }
                
                console.log(a + " " + b + " " + c + " " + d);