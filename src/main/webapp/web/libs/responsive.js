window.onload = function(){
    resizeZoom();
}

window.addEventListener("DOMContentLoaded", function(){
   resizeZoom();
});

window.addEventListener("resize", function(){
   resizeZoom();
});


//가로 크기 변경
function resizeZoom(){
    var minWidth = 1920;
    var body = document.getElementsByTagName('body')[0];
    if(window.innerWidth<minWidth){
        body.style.zoom = (window.innerWidth/minWidth);
    }else{
        body.style.zoom = 1;
    }
};


//세로 크기 변경
function resizeHeight(){

};