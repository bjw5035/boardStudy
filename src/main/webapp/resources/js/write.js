document.addEventListener('DOMContentLoaded', (event) => {

  /**
   * 목록 버튼
   * 메인 화면 이동 클릭 이벤트
   */
  $('#btnMove').click(function (e) {
    e.preventDefault();
    window.location.href = "/board/Board";
  })

})