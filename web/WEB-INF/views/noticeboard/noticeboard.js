var ctx;
var canvas;
$(document).ready(function(){
   getNoticeboard();

   $('.search-btn').click(function(){
       var keyword = $('.search-box').val();
      getNoticeboard(keyword);
   });
});



//id, pw가 공백인지 검사
function validation(userId, userPw){
    if(!userId) {
        alertPopup('아이디X');
        return false;
    }else if(!userPw){
        alertPopup('비밀번호X');
        return false;
    }else if(!validateImoticon(userId) ){
        return false;
    }else{
        noticeboard(userId, userPw);
        return true;
    }
}

//이모티콘 필터
function validateImoticon(string){
    var regex = /(?:[\u2700-\u27bf]|(?:\ud83c[\udde6-\uddff]){2}|[\ud800-\udbff][\udc00-\udfff]|[\u0023-\u0039]\ufe0f?\u20e3|\u3299|\u3297|\u303d|\u3030|\u24c2|\ud83c[\udd70-\udd71]|\ud83c[\udd7e-\udd7f]|\ud83c\udd8e|\ud83c[\udd91-\udd9a]|\ud83c[\udde6-\uddff]|\ud83c[\ude01-\ude02]|\ud83c\ude1a|\ud83c\ude2f|\ud83c[\ude32-\ude3a]|\ud83c[\ude50-\ude51]|\u203c|\u2049|[\u25aa-\u25ab]|\u25b6|\u25c0|[\u25fb-\u25fe]|\u00a9|\u00ae|\u2122|\u2139|\ud83c\udc04|[\u2600-\u26FF]|\u2b05|\u2b06|\u2b07|\u2b1b|\u2b1c|\u2b50|\u2b55|\u231a|\u231b|\u2328|\u23cf|[\u23e9-\u23f3]|[\u23f8-\u23fa]|\ud83c\udccf|\u2934|\u2935|[\u2190-\u21ff])/g;

    if(regex.test(string)){
        alertPopup("이모티콘을 포함할 수 없습니다.");
        return false;
    }
    return true;
}


//login
function noticeboard(userId, userPw){
    console.log(userId, userPw);

    var json = {
        userId:userId,
        userPw:userPw
    }

    $.ajax({
        type:"POST",
        url:NEXT_URL_NOT_WEB+"/login/login",
        data:JSON.stringify(json),
        contentType:"application/json; charset=utf-8",
        success: function(result){
            if(result){
                console.log(result);

                var token = result.token;
                var data = token.split('.')[1];
                var libDecoded = Base64.decode(data);
                var payload = JSON.parse(libDecoded);

                console.log(token);
                console.log(data);
                console.log(libDecoded);
                console.log(payload);

                sessionStorage.setItem("token", token);
                sessionStorage.setItem("userId", result.userId);
                sessionStorage.setItem("userName", result.userName);

                if(result.firstMenuUrl){
                    console.log("url : "+location.protocol+"//"+location.host+result.firstMenuUrl);
                }else{
                    alert("이동할 메뉴 X");
                }

            }else{
                console.log("nothing");
            }
        },
        complete: function(result, xhr){
            console.log(xhr);
        }
    });
}

//팝업
function alertPopup(content){

    $('.popup').remove();

    var html = '<article class="popup popup-bg"><div class="popup-area"><div class="popup-content"><p class="popup-article">'+content+'</p><span class="popup-confirm">확인</span></div></div></article>';
    $('#wrapper').append(html);

    $(document).on('click',".popup-bg", function(){
        $('.popup').remove();
    });

    $('.popup-confirm').focus();
}

function setCookie(cookieName, value, exdays){
    var exdate = new Date();
    exdate.setDate(exdate.getDate()+exdays);

    var cookieValue = escape(value)+(exdays==null ? "" : ";expires="+exdate.toGMTString());
    console.log("cookieValue  ---->  "+cookieValue);

    document.cookie = cookieName+"="+cookieValue;
}

function getNoticeboard(keyword){
    var key='';
    if(keyword){
        key=keyword;
    }
    console.log('getNoticeboard');
    console.log(keyword);
    $.ajax({
        type:'post',
        url:NEXT_URL_NOT_WEB+'/list/result',
        data : JSON.stringify(key),
        contentType: "application/json; charset=UTF-8",
        success: function(result){
            if(result){
                if(result.length>0){
                    $('.no-result-box').remove();
                    var html = '<ul class="content-list"></ul>';
                    $('.page-listing').append(html);

                    for(var i=0;i<result.length;i++){
                        html = '<li class="content-list-one"><span class="lst-title">'+result[i].noticeTitle+'</span><span class="lst-name">'+result[i].userName+'</span><span class="lst-date">'+result[i].noticeDate+'</span><span class="lst-count">'+result[i].viewCount+'</span></li>';
                        $('.content-list').append(html);
                    }

                }
            }
            console.log(result);
        }, error: function(result, err){
            console.log(err);
        }
    })
}