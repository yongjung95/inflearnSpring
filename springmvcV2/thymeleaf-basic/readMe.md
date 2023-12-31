# 타임리프 - 기본 기능

## 타임리프 소개

* 타임리프 특징
  * 서버 사이드 HTML 렌더링 (SSR)
    * 백엔드 서버에서 HTML 을 동적으로 렌더링 하는 용도로 사용된다.
  * 네츄럴 템플릿
    * 순수 HTML 을 최대한 유지하면서 뷰 템플릿도 사용할 수 있다.
  * 스프링 통합 지원


* 타임리프 기본 표현식
  * 간단한 표현:
     * 변수 표현식: ${...} 
     * 선택 변수 표현식: *{...} 
     * 메시지 표현식: #{...}
     * 링크 URL 표현식: @{...} 
     * 조각 표현식: ~{...}
  * 리터럴 
    * 텍스트: 'one text', 'Another one!',… 
    * 숫자: 0, 34, 3.0, 12.3,… 
    * 불린: true, false 
    * 널: null 
    * 리터럴 토큰: one, sometext, main,…
  * 문자 연산: 
    * 문자 합치기: + 
    * 리터럴 대체: |The name is ${name}| 
  * 산술 연산: 
    * Binary operators: +, -, *, /, % 
    * Minus sign (unary operator): - 
  * 불린 연산: 
    * Binary operators: and, or 
    * Boolean negation (unary operator): !, not
  * 비교와 동등: 
    * 비교: >, <, >=, <= (gt, lt, ge, le) 
    * 동등 연산: ==, != (eq, ne)
  * 조건 연산: 
    * If-then: (if) ? (then) 
    * If-then-else: (if) ? (then) : (else) 
    * Default: (value) ?: (defaultvalue) 
  * 특별한 토큰: 
    * No-Operation: _

* 유틸리티 객체와 날짜
  * #message : 메시지, 국제화 처리
  * #uris : URI 이스케이프 지원
  * #dates : java.util.Date 서식 지원
  * #calendars : java.util.Calendar 서식 지원
  * #temporals : 자바8 날짜 서식 지원
  * #numbers : 숫자 서식 지원
  * #strings : 문자 관련 편의 기능
  * #objects : 객체 관련 기능 제공
  * #bools : boolean 관련 기능 제공
  * #arrays : 배열 관련 기능 제공
  * #lists , #sets , #maps : 컬렉션 관련 기능 제공
  * #ids : 아이디 처리 관련 기능 제공, 뒤에서 설명
  * [타임리프 유틸리티 객체](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#expression-utilityobjects)
  * [유틸리티 객체 예시](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#appendix-b-expressionutility-objects)