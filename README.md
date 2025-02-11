# Spring MVC 기반 게시판 프로젝트

## 📌 프로젝트 개요

**Spring MVC와 MyBatis를 활용하여 로그인, 게시글 CRUD, 댓글, 검색, 페이징, 좋아요 기능을 포함한 완성도 높은 웹 게시판을 구축하는 프로젝트입니다.**

## 🛠 기술 스택

- **Backend:** Spring MVC, MyBatis, JSP/Thymeleaf, MySQL
- **Frontend:** HTML, CSS, JavaScript (AJAX, jQuery, Vue.js 가능)
- **Security:** Spring Security, JWT(Optional)

## 🚀 주요 기능

### 1️⃣ 회원 관리 (로그인 & 회원가입)

- 회원가입, 로그인, 로그아웃
- 회원정보 수정 (닉네임, 비밀번호 변경)
- 비밀번호 찾기 (이메일 인증)
- Spring Security 로그인 적용 (JWT 가능)
- 비밀번호 암호화 (BCrypt)

### 2️⃣ 게시판 기능 (CRUD)

- 게시글 목록 조회 (페이징 처리)
- 게시글 상세 조회
- 게시글 작성, 수정, 삭제
- XSS 방지 (HtmlEscape 처리)

### 3️⃣ 댓글 기능

- 댓글 작성, 수정, 삭제
- 대댓글 기능 지원
- AJAX 활용 (비동기 댓글 처리)

### 4️⃣ 좋아요 기능

- 게시글 좋아요 추가/취소
- 좋아요 개수 표시 (AJAX 처리)

### 5️⃣ 검색 기능

- 제목 검색, 작성자 검색
- MyBatis `LIKE` 문 활용한 검색 기능 개발

### 6️⃣ 관리자 기능 (Optional)

- 회원 관리 (강제 탈퇴)
- 게시글 관리 (부적절한 게시글 삭제)
- 신고 관리 (신고된 게시글 및 댓글 검토)
- Spring Security 역할(Role) 관리 (`ROLE_ADMIN`)

## 📂 프로젝트 구조

```plaintext
📂 src/main/java/com/example/board
├── 📂 controller      # 컨트롤러 (요청 처리)
│   ├── BoardController.java
│   ├── UserController.java
│   ├── CommentController.java
│   └── AdminController.java
├── 📂 service         # 서비스 (비즈니스 로직)
│   ├── BoardService.java
│   ├── UserService.java
│   ├── CommentService.java
│   └── AdminService.java
├── 📂 repository      # MyBatis Mapper (DAO 역할)
│   ├── BoardMapper.java
│   ├── UserMapper.java
│   ├── CommentMapper.java
│   └── AdminMapper.java
├── 📂 model           # DTO & VO
│   ├── UserDTO.java
│   ├── PostDTO.java
│   ├── CommentDTO.java
│   └── LikeDTO.java
```

## 💡 추가 고려할 기능

- RESTful API 적용 (Vue.js, React 연동 가능)
- Spring Security + JWT 로그인 적용
- AWS 배포 (EC2 + RDS 활용)
- CI/CD 적용 (GitHub Actions, Jenkins)
- 캐싱 적용 (Redis, EhCache)

## 🎯 기대 효과

- **실무에서 활용 가능한 구조 설계 적용**
- **Spring MVC, MyBatis 기반 CRUD, 보안, 페이징 등의 핵심 기능 직접 구현**
- **CI/CD 및 AWS 배포 고려하여 실무 수준의 프로젝트로 발전 가능**

[//]: # (## ✅ 마무리)

[//]: # (이 프로젝트는 **Spring MVC + MyBatis 기반 게시판**을 만들기 위한 설계 및 구현 가이드입니다.)

[//]: # (이제 이 구조를 기반으로 개발하면 **이력서에 넣을 퀄리티 높은 프로젝트**를 완성할 수 있습니다. 🚀)




