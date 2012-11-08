$(document).ready(function () {
    sayfaYuklendi();
});

$('#sData').click(function () {

    location.reload();
});

var sayfaYuklendi = function () {

    $("#toolbar").setGridParam({datatype:'json', page:1}).trigger('reloadGrid');
    jQuery("#toolbar").jqGrid({
        url:'kodcuRS/yazilar',

        datatype:"json",
        height:255,
        width:700,
        cache:false,
        reloadAfterSubmit:true,
        viewrecords:true,
        prmNames:{ nd:null},
        gridview:true,
        colNames:['Yazi No', 'Yazar', 'Yazi', 'Tarih'],
        jsonReader:{root:"yazi", repeatitems:false},
//  editurl:'kodcuRS/yazilar',
        colModel:[
            {name:'id', index:'id', width:80, sorttype:"int", key:true},
            {name:'yazar', index:'yazar', width:180, editable:true},
            {name:'yazi', index:'yazi', width:370, editable:true},
            {name:'tarih', index:'tarih', width:100, align:"right", sortype:"date", editable:true}
        ],
        rowNum:20, rowTotal:2000, rowList:[10, 20, 30, 50, 100],
        loadonce:true, // Refresh probblem
        mtype:"GET",
        rownumbers:true,
        rownumWidth:40,
        pager:'#ptoolbar',
        sortname:'id',
        sortable:true,
        multipleSearch:true,
        sortorder:"asc",
        caption:"Yazi Listesi" });


    $.extend($.jgrid.del, {
        mtype:"DELETE",
        serializeDelData:function () {
            return "";
        },
        onclickSubmit:function (params, postdata) {
            console.log("Cikti : " + postdata.yazi);
            params.url += '/jqueryClient/kodcuRS/yazilar/sil/' + encodeURIComponent(postdata);
        }
    });

    jQuery.extend(jQuery.jgrid.edit, {
        ajaxEditOptions:{ contentType:"application/json", type:"POST", async:true },
        closeAfterEdit:true,
        closeAfterAdd:true, mtype:'POST',


        recreateForm:true,

        afterSubmit:function () {
            $(this).jqGrid("setGridParam", {datatype:'json'});
            return [true];
        },

        serializeEditData:function (data) {
            delete data.oper//,
            //delete data.id

            return JSON.stringify(data);
        },
        onclickSubmit:function (params, postdata) {

            params.url = '/jqueryClient/kodcuRS/yazilar';
        }
    });

    jQuery("#toolbar").jqGrid('navGrid', '#ptoolbar', {del:true, add:true, edit:true, search:true, refresh:true}

    );
    jQuery("#toolbar").jqGrid('filterToolbar', {stringResult:true, searchOnEnter:false});

}
