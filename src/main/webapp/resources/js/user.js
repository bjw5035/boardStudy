// 폼 유효성 검사 및 버튼 동작 스크립트

/**
 * 로그인 기능 스크립트
 */
// DOMContentLoaded 이벤트는 HTML 문서가 완전히 로드되고 DOM이 생성된 후 실행됩니다.
document.addEventListener("DOMContentLoaded", function () {
  // 폼 요소를 가져옵니다.
  const form = document.querySelector("form");

  // 폼 제출 이벤트를 처리합니다.
  form.addEventListener("submit", function (e) {
    // 입력 필드에서 아이디(userId) 값을 가져옵니다.
    const userId = document.getElementById("userId").value.trim(); // trim()은 공백 제거
    // 입력 필드에서 비밀번호(userPw) 값을 가져옵니다.
    const userPw = document.getElementById("userPw").value.trim();

    // 아이디 또는 비밀번호가 비어 있을 경우 경고(alert)를 띄우고 제출을 중단합니다.
    if (!userId || !userPw) {
      alert("아이디와 패스워드를 모두 입력해주세요."); // 경고 메시지
      e.preventDefault(); // 폼 제출 동작을 중단
    }
  });

  /**
   * 회원가입
   * 클릭 이벤트
   * @type {Element}
   */
      // 회원가입 버튼을 선택합니다.
  const signupButton = document.querySelector(".signup-button");

  // 회원가입 버튼 클릭 이벤트를 처리합니다.
  signupButton.addEventListener("click", function () {
    // 회원가입 페이지(Signup)로 이동
    window.location.href = "Signup"; // URL 경로 설정
  });

  /**
   * 회원가입에서 로그인 화면 이동
   */
  const moveButtonLogin = document.querySelector(".login_move");
  moveButtonLogin.addEventListener("click", function () {
    window.location.href = "Login";
  })

});
