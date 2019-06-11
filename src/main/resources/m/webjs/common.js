//验证邮箱
function CheckMail(mail) {
    var filter = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/i;
    if (filter.test(mail)) return true;
    else return false;
}
//验证手机
function CheckPhone(phone) {

    var filter = /^1[3,5,7,8]\d{9}$/;
    if (filter.test(phone)) return true;
    else return false;
}
$(function () {

    

    $(".return").click(function () {
        window.history.go(-1);
    })
    //加入紫荆同学会
    $("#students_willform").submit(function () {
        var model = {};
        model.Title = $("#chenhu").val();
        model.Name = $("#chenhu").val();
        model.Tel = $("#dianhua").val();
        model.Company = $("#gongsi").val();
        model.Postion = $("#zhiwei").val();
        model.Interest = $("#xingqu").val();
        model.IsLock = 0;
        model.ClassId = 68;
        model.Ver = "m";
        model.Content = $("#liuyan").val();
        if (model.Title == "" || model.Tel == "" || model.Company == "" || model.Postion == "" || model.Interest == "" || model.Content == "") {
            alert("请填写完整资料");
            return false;
        }
        if (!CheckPhone(model.Tel)) {
            alert("请输入正确的手机格式");
            return false;
        }
        Feedback.Add(model, function (res) {
            if (res && res.value) {
                if (res.value - 0 > 0) {
                    alert("提交成功");
                    $("#students_willreset").click();
                    return false;
                }

            }
            alert("系统繁忙请稍后再试");
        })
        return false;
    });
    

    $(window).resize(tryResize);


    //首页
    $(".newsContentBox .toggle:eq(0)").show();
    $(".newsTabs a").each(function (index, element) {
        $(this).click(function () {
            $(this).addClass("cur").siblings().removeClass("cur");
            $(".newsContentBox .toggle").eq(index).show().siblings().hide();
        })
    })


    // 视频遮罩点击事件
    $('.video-mask').click(function () {
        var $videoBox = $(this).parent();
        var $video = $videoBox.find('video');
        $video.css('display', 'block');
        $video[0].play();
        $(this).css('display', 'none');
    })

    //导航	
    function nav() {
        $('nav').css('height', $(window).height());
        $(".nav").on("click", function () {
            $("nav").addClass("cur")
            $(".navbg").addClass("act");
            $("body").css("position", "fixed");
        })
        $(".navbg").click(function () {
            $("nav").removeClass("cur")
            $(".navbg").removeClass("act");
            $("body").css("position", "relative");
        })

        $("nav .close").click(function () {
            $("nav").removeClass("cur")
            $(".navbg").removeClass("act");
            $("body").css("position", "relative");
        })
    }
    nav()
    $(window).resize(function () {
        nav();
    })


    //菜单
    $("nav li h4").on("click", function () {
        if ($(this).next().is(":hidden")) {
            $("nav li .subMeun").slideUp(300);
            $("nav li").removeClass("cur");
            $(this).parents("li").addClass("cur");
            $(this).next().slideDown(300);
        } else {
            $(this).parents("li").removeClass("cur");
            $(this).next().slideUp(300);
        }
    });

    $(".subMeun p>a").on("click", function () {
        if ($(this).next().is(":hidden")) {
            $(".threeMenu").slideUp(300);
            $(".threeMenu").css("display", "block");
            $(this).next().slideDown(300);
        } else {
            $(this).next().slideUp(300);
        }

    })

    //返回顶部
    $(".returnTop .gopInco").click(function () {
        $("html,body").animate({ scrollTop: $("body").offset().top }, 1000);
    })

    $(window).scroll(function (e) {
        var scrollTop = $(window).scrollTop();
        if (scrollTop > 400) {
            $('.returnTop').show();
            $(".telphone").css("bottom","50px")
        } else {
            $('.returnTop').hide();
            $(".telphone").css("bottom", "15px");
        }
    })


    $(".coursesResule li h4").click(function () {
        if ($(this).next().is(":hidden")) {
            $(".resuleContent").slideUp();
            $(this).next().slideDown();
        }
        else {
            $(".resuleContent").slideUp();
        }

    })

})







