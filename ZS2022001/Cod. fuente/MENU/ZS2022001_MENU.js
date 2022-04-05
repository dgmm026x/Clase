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
  }


  else
  {
    STATUS.style.display = "block";
  }
}



function THEME()
{
  const OPAQUE_ID = ["NavBar","themeSwitch"];


  for (let i = 0; i < OPAQUE_ID.length; i++)
  {
    var O_ID=document.getElementById(OPAQUE_ID[i]);
    console.log(i);
    
    if(O_ID.style.backgroundColor == "rgb(0, 0, 0)")
    {O_ID.style.backgroundColor = "rgb(255, 255, 255)"; O_ID.style.color="rgb(0, 0, 0)";}
    
    else
    {O_ID.style.backgroundColor="rgb(0, 0, 0)"; O_ID.style.color="rgb(255, 255, 255)";}


    const OPAQUE_CLASS = ["P"];


    for (let i = 0; i < OPAQUE_CLASS.length; i++)
    {
      var O_CLASS=document.getComputedStyle(OPAQUE_CLASS[i]);
      console.log(i);
      
      if(O_CLASS.style.backgroundColor == "rgb(0, 0, 0)")
      {O_CLASS.style.backgroundColor = "rgb(255, 255, 255)"; O_CLASS.style.color="rgb(0, 0, 0)";}
      
      else
      {O_CLASS.style.backgroundColor="rgb(0, 0, 0)"; O_CLASS.style.color="rgb(255, 255, 255)";}
    }
  }


  // const TRANSLUCID_ID = ["BurguerContent"];


  // for (let i = 0; i < TRANSLUCID_ID.length; i++)
  // {
  //   var ITEM=document.getElementById(TRANSLUCID_ID[i]);
  //   console.log("b");

  //   if(ITEM.style.backgroundColor == "rgba(0, 0, 0, 0.75)")
  //   {ITEM.style.backgroundColor = "rgba(255, 255, 255, 0.75)"; ITEM.style.color = "rgb(0, 0, 0)";}
    
  //   else
  //   {ITEM.style.backgroundColor = "rgba(0, 0, 0 0.75)"; ITEM.style.color = "rgb(255, 255, 255)";}
  // }


  // const TRANSPARENT_ID = [];


  // for (let i = 0; i < TRANSPARENT_ID.length; i++)
  // {
  //   var ITEM=document.getElementById(TRANSPARENT_ID[i]);
  //   console.log("c");

  //   if(ITEM.style.color == "rgb(255, 255, 255)")
  //   {ITEM.style.color = "rgb(0, 0, 0)";}
    
  //   else
  //   {ITEM.style.color = "rgb(255, 255, 255)";}
  // }
}



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////