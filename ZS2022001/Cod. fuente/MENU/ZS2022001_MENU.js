////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//                                                                    //
//          ZS202201 MENU JAVASCRIPT                                  //
//          2022-03-27                                                //
//                                                                    //
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////
//                                                                    //
//          BURGUER MENU                                              //
//                                                                    //
////////////////////////////////////////////////////////////////////////



function BURGUERMENU()
{
  var BURGUER = document.getElementById("BurguerWindow");
  // var SCROLL = display.getElementById("BODY");


  if(BURGUER.style.display === "block")
  {
    BURGUER.style.display = "none";
    console.log("Burguer menu (0)");
    // SCROLL.style.position  = "none";
  }


  else
  {
    BURGUER.style.display = "block";
    console.log("Burguer menu (1)");
    // SCROLL.style.position  = "fixed";
  }
}



/*function THEME()
{
  var THEME=document.getElementsByClassName("OPAQUE");


  if(THEME.style.backgroundColor == "rgb(0, 0, 0)")
  {
    THEME.style.backgroundColor = "rgb(255, 255, 255)";
    THEME.style.color="rgb(0, 0, 0)";
  }


  else
  {
    THEME.style.backgroundColor="rgb(0, 0, 0)";
    THEME.style.color="rgb(255, 255, 255)";
  }
  console.log("a");
}*/



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////