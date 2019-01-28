$(".totable").click(function () {
    //当前页码
    var curPage = 1;
    //显示的页码数
    var size = 5;
    //总条数
    var total;
    //页大小
    var pageSize = 10;
    //总页数
    var pages;
    initData(curPage, pageSize);

    function initData(curPage, pageSize) {
        $.ajax({
            type: "POST",
            url: "/findSource",
            dataType: "json",
            data: {'pageNum': curPage, "pageSize": pageSize},

            success: function (result) {
                var pageHtml = "<li><a href=''>«</a></li>";
                if (curPage == 1) {
                    if (result.pages <= size)
                        for (var i = curPage; i <= size; i++) {
                            if (i == curPage) {
                                pageHtml += "<li class='active'><a href='javascript:initData(" + i + "," + result.pageSize + ");'>" + i + "</a></li>"
                            } else {
                                pageHtml += "<li><a href='javascript:goto(" + i + "," + pageSize + ");'>" + i + "</a></li>";
                            }
                        }
                    pageHtml += "<li><a>»</a></li>";
                    $(".pageul").html(pageHtml);
                }

                $(result.list).each(
                    function (i, values) {
                        var type = null;
                        if (values.sourceType == 0) {
                            type = "<span class='label label-important'>电影</span>"
                        } else if (values.sourceType == 1) {
                            type = "<span class='label label-warning'>图片</span>"
                        } else if (values.sourceType == 2) {
                            type = "<span class='label label-success'>音乐</span>"
                        }
                        $("#list").html($("#list").html()
                            + "<tr><td style=\"text-align: center\">" + values.sourceName + "</td>"
                            + "<td style=\"text-align: center\"><a href='#'>" + values.sourceUrl + "</ta></td>"
                            + "<td style=\"text-align: center\">" + values.sourcePwd + "</td>"
                            + "<td style=\"text-align: center\">" + type + "</td>"
                            + "<td><div class='text-right' style=\"text-align: center\">" +
                            "<a class='btn btn-success btn-mini' href='#'>\n" +
                            "                <i class='icon-ok'></i>\n" +
                            "            </a>\n" +
                            "            <a class='btn btn-danger btn-mini' href='#'>\n" +
                            "                <i class='icon-remove'></i>\n" +
                            "            </a>\n" +
                            "        </div>\n" +
                            "    </td></tr>"
                        );

                    }
                );

            }

        });
    }
});


