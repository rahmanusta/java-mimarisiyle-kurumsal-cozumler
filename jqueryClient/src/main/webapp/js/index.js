$(document).ready(function () { // sayfa tamamen yüklendiğinde
$("#kaydet").click(function(){ // kaydet id li buton tıklama olayı
var yazi=$('#yazi').val(); // yazi id li girdi alanının değeri
var yazar=$('#yazar').val(); // yazar id li girdi alanının değeri
var tarih=$('#tarih').val(); // tarih id li girdi alanının değeri

var veri={
"yazi":yazi,
"yazar":yazar,
"tarih":tarih
}; // Yazi String nesnesi

var ayarlar={
type:"POST", // HTTP metod türü
url:"/jqueryClient/kodcuRS/yazilar/", // ekleme yapılacak adres
contentType:"application/json", // içerik tipi
data: JSON.stringify(veri)
}; // Yazi String nesnesinin JSON' a çevrilmesi 

var istek=$.ajax(ayarlar); // tanımlı ayarlar ile ekleme işlemi yapılır (herşey yolunda ise)

istek.done(function(){ // istek tamamlandığında;
location.reload(); // sayfayı yeniden yükle
});
});

$.ajax({ // sayfa yüklendiğinde tüm yazı listesini talep eder
type:'GET', // HTTP metod türü
url:"/jqueryClient/kodcuRS/yazilar/", // okuma yapılacak adres
dataType:"xml", // sunucudan talep edilen veri türü (accept)
success:function (xml) { // işlem başarılı ise, dönen veriyi işle

var icerik = "<table id='tablo' border='1' cellspacing='0'>";
icerik += "<thead class='header'><tr>" +
"<th>Tarih</th>" +
"<th>Yazar</th>" +
"<th>Yazı</th>" +
"<th>Yazı No</th>" +
"<th colspan='2'>İşlemler</th>" +
"</tr></thead>" +
"<tbody>";

$(xml).find('yazi').each(function () {


if ($(this).find('yazar').text() != "") {
var tarih = $(this).find('tarih').text();
var yazar = $(this).find('yazar').text();
var yazi = $(this).find('yazi').text();
var yaziNo = $(this).find('id').text();

icerik += "<tr>";
icerik += "<td>" + tarih + "</td>";
icerik += "<td>" + yazar + "</td>";
icerik += "<td>" + yazi + "</td>";
icerik += "<td>" + yaziNo + "</td>";
icerik += "<td>";
icerik += "<input type='submit' yazino='"+yaziNo+"' class='sil' value='Sil'>";
icerik += "</td>";
icerik += "<td>";
icerik += "<input type='submit' yazino='"+yaziNo+"' class='guncelle' value='Güncelle'>";
icerik += "</td>";
icerik += "</tr>";

}

});
icerik += "</tbody>";
icerik += "</table>";

var ekleme =$("#yazilistesi").append(icerik);

ekleme.ready(function(){

$(".sil").click(function(){

var id=$(this).attr('yaziNo');

$.ajax({
type:"DELETE",
url:"/jqueryClient/kodcuRS/yazilar/sil/"+id

}).done(function(){
location.reload();
});

});

$(".guncelle").click(function(){
var id=$(this).attr("yaziNo");
var veri={
"yazi":$('#yazi').val(),
"yazar":$('#yazar').val(),
"tarih":$('#tarih').val(),
"id":id
};
$.ajax({
type:"POST",
url:"/jqueryClient/kodcuRS/yazilar/",
data:JSON.stringify(veri),
contentType:"application/json"

}).done(function(){
location.reload();
});
});


var tr=$("#tablo").find("tr");
tr.bind('click', function(){
var tds=   $(this).find("td");

tr.removeClass('vurgulu');
$(this).addClass('vurgulu');


$.each(tds, function(index,item){
switch(index)
{
    case 0:
        $('#tarih').val(item.innerHTML);
        break;
    case 1:
        $('#yazar').val(item.innerHTML);
        break;
    case 2:
        $('#yazi').val(item.innerHTML);
        break;

}
});

});
});

}
});

});
