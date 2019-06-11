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

    //加入紫荆同学会
    $("#students_willform").submit(function () {
        var model = {};
        var model = {};
        model.Title = $("#chenhu").val();
        model.Name = $("#chenhu").val();
        model.Tel = $("#dianhua").val();
        model.Company = $("#gongsi").val();
        model.Postion = $("#zhiwei").val();
        model.Interest = $("#xingqu").val();
        model.IsLock = 0;
        model.ClassId = 68;
        model.Ver = "cn";
        model.Content = $("#liuyan").val();
        if (model.Title == "" || model.Tel == "" || model.Company == "" || model.Postion == "" || model.Interest == "" || model.Content=="") {
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


	function text(obj){ //placeholder
		obj.each(function(){
			var dVal = $(this).val();
			$(this).focus(function(){
				var fVal = $(this).val();
				if( dVal == fVal ) $(this).val(''); 
			})
			$(this).blur(function(){
				var bVal = $(this).val();
				if( bVal == '' ) $(this).val(dVal); 
			})
		})
	}
	text($("input[type='text']"))
	text($("textarea"))
	//新闻切换
	var num = 0,
    	newsLi = $('.trial-ul ul li').length;

    for (; newsLi > 6;) {
        $('.trial-ul').append("<ul class='clearfix'></ul>");
        newsLi -= 6;
        var y = newsLi;
        for (; y > 0;) {
            $('.trial-ul ul').eq(num).find("li").eq(6).appendTo($(this).find('.trial-ul ul:last'));
            y--;
        }
        num++;
    }

    var ulLen = $('.trial-ul ul').length,
		ulWidth = $('.trial-ul ul').outerWidth(true),
		oUl =  $('.trial-ul'),
		j=0;
	oUl.css({width:ulWidth*ulLen,position:'absolute',top:0,left:0});

	$('.trial-con .next').click(function(){
		if ( j == ulLen-1 ) {
			oUl.stop(true,true).animate({left:- j*ulWidth},800);
		}else{
			j++;
			oUl.stop(true,true).animate({left:- j*ulWidth},800);
		}
		
	})
	$('.trial-con .prev').click(function(){
		if ( j <= 0  ) {
			oUl.css('left','0px')
		}else{
			j--;
			oUl.stop(true,true).animate({left:- j*ulWidth},800)
		}
	})



	// 资讯中心
	$('.information-bottom .newslist:eq(0)').show();
	$('.information-center ul li').click(function(){
		var n = $(this).index();
		$(this).addClass('on').siblings().removeClass('on');
		$('.information-bottom .newslist').eq(n).show().siblings().hide();
	});
	$('.information-bottom ul li').hover(function(){
		$(this).find('.time').hide();
		$(this).find('.mask1').show();
	},function(){
		$(this).find('.time').show();
		$(this).find('.mask1').hide();
	})

	$('.right6 ul li:nth-of-type(3n)').css('margin', 0)
	$('.growth ul li:eq(1)').css('marginTop',80);
	$('.growth ul li:even').addClass('right');	
    $('.growth ul li').each(function(){
        if ($(this).find('img')[0].src == window.location.href ) {
            $(this).find('img').remove();
        }
        if ($(this).find('img').length > 0) {
            $(this).css('paddingBottom', 30)
        }
    })
    $('.growth ul li').eq(4).find('img').css('marginLeft',145)

	$('.listwrap').each(function(){
		var subUl = $(this).find('ul'),
		subLi = $(this).find('li'),
		subLiLen = subLi.length,
		subLiWidth = subLi.outerWidth(true);

		subUl.css({'width':subLiLen*subLiWidth,position:'absolute',top:0,left:0})

		$(this).parents('.subject1').find('.next').click(function(){
			num++;
			if ( num > subLiLen-3 ) {
				num = subLiLen-3
			}else{
				subUl.stop().animate({left:- num*subLiWidth},800)
			}
		})

		$(this).parents('.subject1').find('.prev').click(function(){
			if ( num <= 0  ) {
				num = 0;
			}else{
				num--;
				subUl.stop().animate({left:- num*subLiWidth},800)
			}
		})
	})

	cLiNum = $('.course2 ul li').length;
	for ( var i=1; i<cLiNum+1; i++){
		if ( i%4 == 0 ) {
			$('.course2 ul li').eq(i-1).css('marginRight',0)
		}
	}
	aLiNum = $('.advanced7 ul li').length;
	for ( var i=1; i<aLiNum+1; i++){
		if ( i%3 == 0 ) {
			$('.advanced7 ul li').eq(i-1).css('paddingRight',4)
		}
	}

	aLiNum2 = $('.advanced7 ol li').length;
	for ( var i=1; i<aLiNum2+1; i++){
		if ( i%3 == 0 ) {
			$('.advanced7 ol li').eq(i-1).css('paddingRight',4)
		}
	}

	$('.course ul li').hover(function(){
		$(this).children('p').stop().fadeOut();
		$(this).find('.con1').stop().fadeIn();
	},function(){
		$(this).children('p').stop().fadeIn();
		$(this).find('.con1').stop().fadeOut();
	})

	$('.advanced3-con ul li:odd').addClass('odd')

	$('.advanced18-con ul li:nth-child(3n)').css('border','none');

	$('.advanced20-con .con-bottom ul li:last').find('.list-con').css({'display':'block'});
	$('.advanced20-con .con-bottom ul li').click(function(){
		$(this).siblings().find('.list-con').hide();
		$(this).find('.list-con').show();
		$(this).stop().animate({'height':247},300);
		$(this).siblings().stop().animate({'height':47},300);
	})

	$('.header-bottom ul li').each(function(){
		var liW = $(this).outerWidth(true);
		$(this).find('.sublist').css('width',liW-12);
		$(this).find('.sublist p:last').css('border','none');
	})

	// 侧边子导航
	
	$('.left-list ul li').hover(function(){
		if ($(this).find('.sublist').children().length == 0) {
			$(this).find('.sublist').css('padding',0);
		}
		$(this).find('.sublist').css('display','block');
	},function(){
		$(this).find('.sublist').css('display','none');
	})

})

$(function(){//goToTop
	$(".backToTop").goToTop();
	$(window).bind('scroll resize',function(){
		$(".backToTop").goToTop();
	});
});