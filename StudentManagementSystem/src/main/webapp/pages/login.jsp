<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="bg-dark bg-gradient">

<!-- Login Failed Message -->
<c:if test="${not empty login_fail}">
  <div class="alert alert-danger text-center fw-bold m-3">
    ${login_fail}
  </div>
</c:if>

<div class="container">
  <div class="row justify-content-center align-items-center vh-100">
    
    <div class="col-12 col-sm-10 col-md-6 col-lg-4">
      <div class="card shadow-lg border-0 rounded-4 bg-dark text-white">

        <div class="card-body p-4">
          <h3 class="text-center mb-4">Login</h3>

          <form>

            <!-- Username -->
            <div class="mb-3">
              <label class="form-label">Username</label>
              <input type="text" class="form-control form-control-lg"
                     placeholder="Enter username" required>
            </div>

            <!-- Password -->
            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" class="form-control form-control-lg"
                     placeholder="Enter password" required>
            </div>

            <!-- Button -->
            <div class="d-grid mt-4">
              <button type="submit" class="btn btn-primary btn-lg rounded-pill">
                Login
              </button>
            </div>

          </form>

        </div>

        <!-- Footer -->
        <div class="card-footer text-center bg-transparent border-0">
          <small class="text-secondary">© 2026 Your App</small>
        </div>

      </div>
    </div>

  </div>
</div>

</body>

</html>