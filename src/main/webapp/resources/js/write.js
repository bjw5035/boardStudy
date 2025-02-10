document.addEventListener('DOMContentLoaded', (event) => {

  /**
   * 글쓰기
   * 페이지 이동 클릭 이벤트
   */
  const writeButton = document.querySelector(".write-button");

  writeButton.addEventListener("click", function () {
    window.location.href = "/contentWrite/Write";
  })

  /**
   * 메인 화면 이동 클릭 이벤트
   */
  const moveButton = document.querySelector(".move-button");

  moveButton.addEventListener("click", function () {
    window.location.href = "/board/Board";
  })

})