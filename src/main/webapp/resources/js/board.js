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

})