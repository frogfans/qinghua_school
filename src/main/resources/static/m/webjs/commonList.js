var finished = true;
var curpage = 1;
var winH = $(window).height(); //页面可视区域高度 
var scrollHandler = function () {
    var opt = _scrollHandler;
    var pageH = $(document.body).height();
    var scrollT = $(window).scrollTop(); //滚动条top 
    var aa = (pageH - winH - scrollT) / winH;
    var totalpage = opt.totalpage;
    curpage = opt.curpage || curpage;
    if (aa < 0.5 && finished && curpage <= (totalpage)) { //0.02是个参数
        finished = false;
        curpage += 1;
        var con = opt.con;
        var url = opt.url;
        if (totalpage == "undefined")
            totalpage = 0;
        else if (curpage > totalpage)
            return false;
        var this_ = this;
        $.ajax({
            url: url.replace("{page}", "_page_" + curpage),
            success: function (res) {
                $(con).append($(res).find(con).children());
                if (con == "#prolist") {
                    $('.indicatorContainer2:not(.nulldo)').radialIndicator({
                        barColor: '#c6a55b',
                        barWidth: 3,
                        initValue: 12.5,
                        roundCorner: true,
                        percentage: true,
                    });
                    $(".indicatorContainer2").addClass("nulldo");
                } else if (con == "#helplist") {
                    wwQalist();
                }
            },
            complete: function () {
                finished = true;
            }
        });
        //getData(page, $("#projectTitle").val(), $(".projecttype a.cur").attr("data-val"), $("#projectstate").val(), 1);
        //$(window).unbind('scroll');
    }
}
