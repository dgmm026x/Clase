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
//          BURGUER MENU                                              //
////////////////////////////////////////////////////////////////////////



function BURGUERMENU() {
  
  var BURGUER = document.getElementById("BurguerWindow");
  var BODY = document.getElementById("BODY");

  if(BURGUER.style.display === "block") {

    BURGUER.style.display = "none";
    BODY.style.overflow = "visible";
    console.log();
    console.log("Burguer NOW --> HIDDEN");
  }


  else {

    BURGUER.style.display = "block";
    BODY.style.overflow = "hidden";
    console.log();
    console.log("Burguer NOW --> SHOWING");
  }
}



////////////////////////////////////////////////////////////////////////
//          COLOR THEME                                               //
////////////////////////////////////////////////////////////////////////



function THEME() {

  var STATUS = 1;

  //OPAQUE OBJECTS////////////////////////////////////////////////////////

  var OPAQUE=document.getElementsByClassName("OPAQUE");

  for (let i = 0; i < OPAQUE.length; i++) {

    if(OPAQUE[i].style.backgroundColor == "rgb(0, 0, 0)") {

      OPAQUE[i].style.backgroundColor="rgb(255, 255, 255)";
      OPAQUE[i].style.color="rgb(0, 0, 0)";
      STATUS = 1;
    }

    else {

      OPAQUE[i].style.backgroundColor="rgb(0, 0, 0)";
      OPAQUE[i].style.color="rgb(255, 255, 255)";
      STATUS = 0;
    }
  }
  
  //TRANSLUCID OBJECTS////////////////////////////////////////////////////

  var TRANSLUCID=document.getElementsByClassName("TRANSLUCID");

  for (let i = 0; i < TRANSLUCID.length; i++) {

    if(TRANSLUCID[i].style.backgroundColor == "rgba(0, 0, 0, 0.86)") {

      TRANSLUCID[i].style.backgroundColor="rgba(255, 255, 255, 0.75)";
      TRANSLUCID[i].style.color="rgb(0, 0, 0)";
      STATUS = 1;
    }

    else {

      TRANSLUCID[i].style.backgroundColor="rgba(0, 0, 0, 0.86)";
      TRANSLUCID[i].style.color="rgb(255, 255, 255)";
      STATUS = 0;
    }
  }
  
  //TRANSPARENT OBJECTS///////////////////////////////////////////////////

  var TRANSPARENT=document.getElementsByClassName("TRANSPARENT");

  for (let i = 0; i < TRANSPARENT.length; i++) {

    if(TRANSPARENT[i].style.color == "rgb(255, 255, 255)") {

      TRANSPARENT[i].style.backgroundColor="transparent";
      TRANSPARENT[i].style.color="rgb(0, 0, 0)";
      STATUS = 1;
    }

    else {

      TRANSPARENT[i].style.backgroundColor="transparent";
      TRANSPARENT[i].style.color="rgb(255, 255, 255)";
      STATUS = 0;
    }
  }

  ////////////////////////////////////////////////////////////////////////

  if(STATUS == 1) {

    console.log();
    console.log("Theme NOW --> LIGHT");
  }
  
  else {

    console.log();
    console.log("Theme NOW --> DARK");
  }
}



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////