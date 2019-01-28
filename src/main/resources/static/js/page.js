var data;
function goto_page(curPage,pageSize){
    if (curPage==0||curPage==""){
        curPage = 1;
    }
    if (pageSize==0||pageSize==""){
        pageSize = 10;
    }
    $.ajax({
        type: "POST",
        url: "/findSource",
        dataType: "json",
        data: {'pageNum': curPage, "pageSize": pageSize},

        success: function (result) {
            data = result;
            showPage();
        }
    });
    return data;
}
window.onload = goto_page(1,10);

function showPage() {

    var list = data.list;
    $(list).each(
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
