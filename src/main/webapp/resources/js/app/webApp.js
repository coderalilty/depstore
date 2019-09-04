$(document).ready(function(){

    refreshEmpTable();


});

var refreshEmpTable = () => {
    $.ajax({
        method: "GET",
        url: "list",
        success:fillTable
    });
}

var fillTable = (obj) => {
    $("#tbody").empty();
    var tbody = document.getElementById('tbody');
    for (var i = 0; i < Object.keys(obj).length; i++) {
        var tr = "<tr>";
        tr += "<td>" + obj[i].id + "</td>" + "<td>" + obj[i].firstName + "</td><td>"+ obj[i].lastName +
            "</td><td>"+ obj[i].position.fullName + "</td><td>" + obj[i].department.fullDepartmentName + "</td>" +
            "<td><button type='button' class='btn btn-primary' onclick=showSaveFormClick("+obj[i].id+")>Edit</button></td>" +
            "<td><button type='button' class='btn btn-primary' onclick=removeEmp("+obj[i].id+")>Remove</button></td></tr>";
        tbody.innerHTML += tr;
    }
}

function save() {

    var emp = {
        "firstName":$( "#firstName" ).val(),
        "lastName":$('#lastName').val()
    };
    if($( "#idEmp" ).val()) emp.id = $( "#idEmp" ).val();
    if($("select#department").val()) emp.department = {
        "id": $("select#department").val()
    };
    if($("select#position").val()) emp.position = {
        "id": $("select#position").val()
    };

    $.ajax({
        type: "POST",
        url: "save",
        data: JSON.stringify(emp),
        contentType: "application/json",
        complete: console.log,
        success: function () {

            $( "#firstName" ).val("");
            $('#lastName').val("");
            $( "select#department" ).val("");
            $( "select#position" ).val("");
            refreshEmpTable();
        },
        error: function (resp) {
            console.log(resp);
        }
    });

    $('#ModalSaveForm').modal('hide');
}

function showSaveFormClick(id){

    if(id){
        $.ajax({
            method: "GET",
            url: id,
            success:function (obj) {
                $( "#idEmp" ).val(obj.id);
                $( "#firstName" ).val(obj.firstName);
                $('#lastName').val(obj.lastName);
                $( "select#department" ).val(obj.department.id);
                $( "select#position" ).val(obj.position.id);

                $('#ModalSaveForm').on('hidden.bs.modal', function (e) {
                });
            }
        });
    }

    $('#ModalSaveForm').modal('show');

}

function removeEmp(id) {
    $.ajax({
        method: "GET",
        url: "remove/"+id,
        success:refreshEmpTable
    });
}
