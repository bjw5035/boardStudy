package com.example.boardStudy.vo;

/*
* Annotation을 사용하지 않고 직접적으로 사용해 보기위함
* */
public class UserVO {

    private String userId;
//    private String userName;
    private String userPw;

    public UserVO(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

//    public UserVO(UserVO userVO) {
//        this.userId = userVO.getUserId();
//        this.userPw = userVO.getUserPw();
//    }

    public UserVO() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "UserVO{" +
            "userId='" + userId + '\'' +
            ", userPw='" + userPw + '\'' +
            '}';
    }
}
