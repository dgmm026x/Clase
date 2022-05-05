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
  var BODY = document.getElementById("BODY");

  if(BURGUER.style.display === "block")
  {
    BURGUER.style.display = "none";
    BODY.style.overflow = "visible";
    console.log("Burguer menu (0)");
  }


  else
  {
    BURGUER.style.display = "block";
    BODY.style.overflow = "hidden";
    console.log("Burguer menu (1)");
  }
}



function THEME()
{
  const THEME=document.getElementsByClassName("OPAQUE");

  console.log(THEME);

  for (let i = 0; i < THEME.length; i++)
  {
    if(THEME[i].style.backgroundColor == "rgb(255, 255, 255)")
    {
      THEME.style.backgroundColor="rgb(0, 0, 0)";
      THEME.style.color="rgb(255, 255, 255)";
    }
  }
}



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////