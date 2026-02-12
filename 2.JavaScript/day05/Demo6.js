{
    console.log("Outer Block Starts \n");
    {
        console.log("First Inner Block Starts \n");
        {
            console.log("Second Inner Block Starts");
            let a = 10;
            var b = 20;
            console.log("let a = " + a + ", var b = " + b);
            console.log("Second Inner Block Ends \n");
        }                
        console.log("var b = " + b);
        console.log("First Inner Block Ends \n");
    }
    console.log("var b = " + b);
    console.log("Outer Block Ends \n");
}