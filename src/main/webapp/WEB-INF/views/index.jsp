<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" dir="ltr">
<head>
    <title>jQuery SCRUD system</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
    <script charset="utf-8" src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
    <script charset="utf-8" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/app/webApp.js" />"></script>
</head>
<body>

<div>

    <h1>Employees</h1>

    <button type="button" class="btn btn-outline-primary btn-sm m-0 waves-effect" id="add_emp" onclick=showSaveFormClick()>Add Employee</button>

    <table class="table table-striped table-responsive-md btn-table">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Position</th>
            <th>Department</th>
            <th>Edit</th>
            <th>Remove</th>
        </tr>
        <tbody id="tbody"></tbody>
    </table>

</div>

<!-- Modal HTML Markup -->
<div id="ModalSaveForm" class="modal fade">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title">Employee</h1>
            </div>
            <div class="modal-body">
                <form role="form">
                    <input type="hidden" id="idEmp">
                    <div class="form-group">
                        <label class="control-label">First Name</label>
                        <div>
                            <input type="text" class="form-control input-lg" id="firstName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label">Last Name</label>
                        <div>
                            <input type="text" class="form-control input-lg" id="lastName">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="control-label">Position</label>
                        <div>
                            <select class="custom-select custom-select-sm" id="position">
                            <option value="1">Developer</option>
                            <option value="2">Accountant</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label">Department</label>
                        <div>
                            <select class="custom-select custom-select-sm" id="department">
                            <option value="1">First department</option>
                            <option value="2">Second department</option>
                            </select>
                        </div>
                    </div>




                    <div class="form-group">
                        <div>
                            <button type="submit" class="btn btn-success" onclick="save()">
                                Save
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>
