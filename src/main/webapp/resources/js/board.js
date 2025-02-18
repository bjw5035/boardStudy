document.addEventListener('DOMContentLoaded', (event) => {

  /**
   * 글쓰기
   * 페이지 이동 클릭 이벤트
   */
  // ------------------- 자바 스크립트 방법 -------------------
  // const writeButton = document.querySelector(".write-button");
  //
  // writeButton.addEventListener("click", function () {
  //   window.location.href = "/contentWrite/Write";
  // })

  // ------------------- jQuery 방법 -------------------
  $('#write').click(function (e) {
    e.preventDefault();
    window.location.href = '/contentWrite/Write';
  });

  /**
   * 검색버튼 클릭 시 폼 검증
   */
  document.getElementById(".searchButton").addEventListener("click",
      function (e) {
        let searchButton = document.getElementById("searchButton").value.trim;
        if (searchButton) {
          alert("검색어를 입력해 주세요");
          e.preventDefault()
        }
      });

  /**
   * 계정관련 드롭다운
   */
  $(document).ready(function () {
    // `.dropdown-toggle` 클래스를 가진 모든 요소에 대해 Bootstrap 드롭다운을 활성화
    $('.dropdown-toggle').each(function () {
      new bootstrap.Dropdown(this);
    })
  })

})