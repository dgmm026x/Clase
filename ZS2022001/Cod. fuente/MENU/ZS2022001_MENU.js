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
  var STATUS = document.getElementById("BurguerWindow");
  // var WIDTH = display.width;


  if(STATUS.style.display === "block")
  {
    STATUS.style.display = "none";
    console.log("Hiding burguer menu...");
  }


  else
  {
    STATUS.style.display = "block";
    console.log("Showing burguer menu...");
  }
}



function THEME()
{
  const OPAQUE_ID = ["NavBar","themeSwitch","End"];


  for (let i = 0; i < OPAQUE_ID.length; i++)
  {
    var O_ID=document.getElementById(OPAQUE_ID[i]);
    
    
    if(O_ID.style.backgroundColor == "rgb(0, 0, 0)")
    {O_ID.style.backgroundColor = "rgb(255, 255, 255)"; O_ID.style.color="rgb(0, 0, 0)";}
    

    else
    {O_ID.style.backgroundColor="rgb(0, 0, 0)"; O_ID.style.color="rgb(255, 255, 255)";}
    console.log("a");
  }


  const TRANSLUCID_ID = ["BurguerWindow"];


  for (let i = 0; i < TRANSLUCID_ID.length; i++)
  {
    var TL_ID=document.getElementById(TRANSLUCID_ID[i]);
    

    if(TL_ID.style.backgroundColor == "rgba(0, 0, 0, 0.75)")
    {TL_ID.style.backgroundColor = "rgba(255, 255, 255, 0.75)"; TL_ID.style.color = "rgb(0, 0, 0)";}
    

    else
    {TL_ID.style.backgroundColor = "rgba(0, 0, 0 0.75)"; TL_ID.style.color = "rgb(255, 255, 255)";}
    console.log("b");
  }


  const TRANSPARENT_ID = [];


  for (let i = 0; i < TRANSPARENT_ID.length; i++)
  {
    var T_ID=document.getElementById(TRANSPARENT_ID[i]);
    

    if(T_ID.style.color == "rgb(255, 255, 255)")
    {T_ID.style.color = "rgb(0, 0, 0)";}
    

    else
    {T_ID.style.color = "rgb(255, 255, 255)";}
    console.log("c");
  }
}


//   const OPAQUE_CLASS = ["P"];


//   for (let i = 0; i < OPAQUE_CLASS.length; i++)
//   {
//     var O_CLSS=document.styleSheets(OPAQUE_CLASS[i]);
//     console.log(i);
    
//     if(O_CLSS.style.backgroundColor == "rgb(0, 0, 0)")
//     {O_CLSS.style.backgroundColor = "rgb(255, 255, 255)"; O_CLSS.style.color="rgb(0, 0, 0)";}
    
//     else
//     {O_CLSS.style.backgroundColor = "rgb(0, 0, 0)"; O_CLSS.style.color = "rgb(255, 255, 255)";}
//   }
// }



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////