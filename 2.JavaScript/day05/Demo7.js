function fun1() {
    console.log("function fun1() called");
}

function fun2(number) {
    number();
    number();
}

fun2(fun1);

