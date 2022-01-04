
function initView(){
    $('#bodyDiv').css("display", "none");

    var titleHtml = document.getElementsByTagName("title")[0];
    titleHtml.innerHTML = HTML_TITLE;
    $('#bodyDiv').css("visibility", "inherit");
    $('#bodyDiv').css("display", "");
}