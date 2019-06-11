
//验证手机号
function checkPhone(strPhone) {
    if (typeof strPhone == "undefined")
        return false;
    var telReg = !!strPhone.match(/^(0|86|17951)?(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}$/);
    //如果手机号码不能通过验证
    if (telReg == false) {
        return false;
    }
    else
        return true;

}
//验证邮箱
function checkEmail(str) {
    var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/
    if (re.test(str)) {
        return true;
    } else {
        return false;
    }
}

$(function () {

    //企业内训
    $("#qiyepeixun").submit(function () {
        var model = {};
        model.Title = $("input[name=Title]").val();
        model.Name = $("input[name=Name]").val();
        model.Tel = $("input[name=Tel]").val();
        model.Email = $("input[name=Email]").val();
        model.Fax = $("input[name=Fax]").val();
        model.Phone = $("input[name=Phone]").val();
        model.Interest = $("input[name=Interest]").val();
        model.Company = $("input[name=Company]").val();
        model.Content = $("input[name=Content]").val();
        if (model.Title == "" || model.Name == "" || model.Tel == "" || model.Email == "" || model.Fax == "" || model.Content == "" || model.Phone == "") {
            alert("请填写完整资料");
            return false;
        }

        if (!checkPhone(model.Tel)) {
            alert("请输入正确的手机格式");
            return false;
        }
        if (!checkEmail(model.Email)) {
            alert("请输入正确的邮箱格式");
            return false;
        }
        model.IsLock = 0;
        model.ClassId = 126;
        model.Ver = "m";
        Feedback.Add(model, function (res) {
            if (res && res.value) {
                if (res.value - 0 > 0) {
                    alert("提交成功");
                    $("#qiyepeixunreset").click();
                    return false;
                }

            }
            alert("系统繁忙请稍后再试");
        })
        return false;
    })


    $("#baoming").submit(function () {
        var obj = {};
        obj.ClassId = $(".ClassId").val();
        obj.Title = $(".Name").val();
        obj.Name = $(".Name").val();
        obj.Tel = $(".Tel").val();
        obj.Company = $(".Company").val();
        obj.Postion = $(".Postion").val();
        obj.Email = $(".Email").val();
        obj.Kecheng = $(".Kecheng").val();
        obj.Content = $(".Content").val();
        obj.Ver = "m";
        obj.IsLock = 0;
        if (obj.ClassId == 0) {
            alert("课程不存在");
            return false;
        }
        if (obj.Name.length <= 0) {
            alert("请填写姓名");
            return false;
        }
        if (obj.Tel.length <= 0) {
            alert("请填写电话");
            return false;
        }
        if (!checkPhone(obj.Tel)) {
            alert("请填写正确的电话号码");
            return false;
        }
        if (obj.Email != "" && !checkEmail(obj.Email)) {
            alert("请填写正确的电子邮箱");
            return false;
        }
        if (obj.Company.length <= 0) {
            alert("请填写公司名称");
            return false;
        }
        if (obj.Postion.length <= 0) {
            alert("请填写职位");
            return false;
        }
        if (obj.Kecheng == '') {
            alert("请填写课程");
            return false;
        }
        if (obj.Content == '') {
            alert("请填写留言");
            return false;
        }
        if (typeof Feedback == "undefined") {
            $.getScript("/ajax/Feedback.ashx", function () {
                Feedback.Add(obj, function (res) {
                    if (res.value && res.value > 0) {
                        alert("提交成功"); location.reload();
                    }
                });
            });
        } else {
            Feedback.Add(obj, function (res) {
                if (res.value && res.value > 0) {
                    alert("提交成功"); location.reload();
                }
            });
        }
        return false;
    })

});