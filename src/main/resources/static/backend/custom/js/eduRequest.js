eduRequest = function (params) {
    this.doPost = function (data) {
        $.ajax({
            type:"POST",
            url:data.url,
            data:data.data,
            dataType:"json",
            success:data.success,
            error:data.error
        });
    };

}