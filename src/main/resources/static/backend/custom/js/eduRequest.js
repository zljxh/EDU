

function doRequest(submitForm, transName, callback, failBack, reCommit) {
    // var transName_json = transName.substring(0,transName.indexOf("."))+".json";
    var transName_json = transName;
    $.ajax({
        url: transName_json,
        global: true,
        type: "POST",
        contentType: "application/json;charset=UTF-8",
        traditional: true,
        data: jsonToHtml(submitForm),
        dataType: 'json',
        processData: true,
        async: true,
        xhrFields: {
            withCredentials: true
        },
        accepts: {
            json: "application/json"
        },

        success: function (data) {
            if (data.ResponseCode == "1") {
                if (!isUndefinedOrNull(callback)) {
                    callback(data);
                }

                return;
            }
            submitFlag = false;
            this.fail(data);
        },
        fail: function (data) {
            if (!isUndefinedOrNull(failBack)) {
                failBack(data);
            } else {
                alert(data.ResponseMsg);
            }
            submitFlag = false;
        },
        error: function (data) {
            if (data.status != 0) {
                alert("通讯出错，请稍后重试");
            }
        }
    });
};

/**
 * 无form表单提交ajax
 * @param transName
 * @param callback
 * @param failBack
 */
function doRequestWithOutForm(url, jsonData, callback, failBack) {
    $.ajax({
        async: true,
        type: "POST",
        url: url,
        contentType: "application/json",
        data: JSON.stringify(jsonData),//JSON.stringify(jsonData),
        dataType: 'json',
        scriptCharset: 'utf-8',
        accepts : {
            json : "application/json"
        },

        success: function (data) {

            if (data.code) {
                if (!isUndefinedOrNull(callback)) {
                    callback(data);
                }

                return;
            }
            submitFlag = false;
            this.fail(data);
        },
        fail: function (data) {
            if (!isUndefinedOrNull(failBack)) {
                failBack(data);
            } else {
                alert(data.msg);
            }
            submitFlag = false;
        },
        error: function (data) {
            if (!data.code) {
                alert("通讯出错，请稍后重试");
            }
            if (!isUndefinedOrNull(failBack)) {
                failBack(data);
            }
        }
    });
};



function isUndefinedOrNull(obj) {
    if (obj == undefined || obj == null) {
        return true;
    }
    return false;
}

function jsonToHtml(submitForm) {
    var formData = $(submitForm).serializeJSON();
    return JSON.stringify(formData);
}

//控制重复交易提交的全局变量
var submitFlag = false;
var submitControlEnabled = true;

/**
 * 重复提交控制
 * @returns {Boolean}
 */
function isDuplicateSubmit() {
    if (submitControlEnabled) {
        if (submitFlag) {
            alert("已提交，请不要重复提交");
            return true;
        }
    }
    submitFlag = true;
    return false;
}