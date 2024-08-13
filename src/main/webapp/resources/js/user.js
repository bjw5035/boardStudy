// login
function login() {
  var userId = document.getElementById("userId").value;
  var userPw = document.getElementById("userPw").value;

  console.log(userId);
  console.log(userPw);

  if (userId == null && userPw == null) {
    alert("userId is null");
    alert("userPw is null");
  } else {
    document.getElementById("Login").submit();
  }
  return;
}