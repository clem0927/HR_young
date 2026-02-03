# 🚀 IT HR Web Solution with LLM
> **LLM을 활용한 지능형 IT HR 웹 솔루션:**
> 개발자 직무 특성에 최적화된 맞춤형 인사 관리 및 프로젝트 협업 툴입니다.

<div align="center">
  <a href="https://club-project-one.vercel.app/" target="_blank">
    <img src="https://img.shields.io/badge/Live_Demo-Link-brightgreen?style=for-the-badge&logo=vercel" alt="Demo Link"/>
  </a>
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black" alt="React"/>
  <img src="https://img.shields.io/badge/LLM-Gemma3-blue?style=for-the-badge" alt="Gemma3"/>
</div>

<br/>

## 🎬 Project Preview & Documents
<div align="center">
  <img src="assets/메인.png" alt="프로젝트 배너" width="100%"/>
  <br/><br/>
  
  <table>
    <tr>
      <td align="center"><b>📊 발표 PPT</b></td>
      <td align="center"><b>📋 테이블 명세서</b></td>
      <td align="center"><b>🗺️ ERD</b></td>
    </tr>
    <tr>
      <td align="center"><br/><br/><a href="assets/솔데스크HR_김민영 PPT.pptx">📁 다운로드 (PPTX)</a></td>
      <td align="center"><br/><br/><a href="assets/HR_테이블명세서_최종.xlsx">📁 다운로드 (XLSX)</a></td>
      <td align="center"><img src="assets/ERD.png" width="250" alt="ERD Preview"/><br/><br/><a href="assets/ERD.png">📁 크게 보기 (PNG)</a></td>
    </tr>
  </table>

  <p align="center">
    <strong>[Demo Video]</strong><br/>
    <a href="https://github.com/clem0927/HR_young/releases/download/v1.0/HR.mp4">
    🎬 시연영상 다운로드
    </a>
  </p>
</div>

---

## 📌 1. Project Overview (프로젝트 개요)

- **프로젝트 제목**: LLM을 활용한 IT HR 웹 솔루션
- **프로젝트 설명**: LLM을 활용하여 IT회사의 사내 개발자들을 대상으로 하는 지능형 HR 웹 솔루션을 개발
- **주제 선정 배경 및 차별점**:
  - 기존의 HR은 개발자들을 위한 맞춤 기능들이 부족
  - 개발자들의 업무 특성에 맞는 기능들을 LLM을 활용하여 구현

<br/>

## 👥 2. Team Members (팀원 및 팀 소개)

| **김재현 (PM)** | **김민영 (PL)** | **김경은 (FE)** | **전현규 (DB)** | **강규호 (AI)** |
| :---: | :---: | :---: | :---: | :---: |
| <img src="https://github.com/RunSBS.png" width="120" height="120" style="border-radius: 50%"/> | <img src="https://github.com/clem0927.png" width="120" height="120" style="border-radius: 50%"/> | <img src="https://github.com/KKEUN22.png" width="120" height="120" style="border-radius: 50%"/> | <img src="https://github.com/JeonHyunGyu.png" width="120" height="120" style="border-radius: 50%"/> | <img src="https://github.com/Kangkyuho.png" width="120" height="120" style="border-radius: 50%"/> |
| [@RunSBS](https://github.com/RunSBS) | [@clem0927](https://github.com/clem0927) | [@KKEUN22](https://github.com/KKEUN22) | [@JeonHyunGyu](https://github.com/JeonHyunGyu) | [@Kangkyuho](https://github.com/Kangkyuho) |
| 010-2731-7128 | 010-9917-4907 | 010-6291-2104 | 010-9341-5578 | 010-9588-5776 |
| <ul style="text-align: left;">|

<br/>

## 🛠 3. My Contributions (담당 파트)
<img src="assets/담당파트.png" alt="담당파트" width="80%"/>


- 스프링 시큐리티를 활용한 회원가입 및 로그인
- 시큐리티를 통한 권한별 접근통제
- 일정탭
- AI 챗봇

<br/>

## 🏗 4. Technology Stack (기술 스택)
### 4.1 개발환경
<img src="assets/기술스택.png" alt="기술스택" width="80%"/>


- 스프링 시큐리티를 활용한 회원가입 및 로그인
- 시큐리티를 통한 권한별 접근통제
- 일정탭
- AI 챗봇

<br/>

## ✨ 5. Key Features (주요 기능)

### 🔐 Security & Auth
- **회원가입 및 로그인**: 스프링 시큐리티를 활용한 회원가입 및 로그인
- **이메일을 통한 사원초대**: 관리자는 사원프로필 생성후 이메일로 초대,사원은 이메일을 통해서만 가입가능
- **시큐리티를 통한 접근 통제**: 직책별 시큐리티의 권한 통해 페이지 접근 통제 및 컨트롤러의 메서드 접근 통제
<div display="flex">
  <img src="assets/회원가입.png" alt="회원가입" width="20%"/>
  <img src="assets/이메일.png" alt="이메일" width="20%"/>
</div>

### 📅 Management
- **캘린더**: 개인별 일정, 프로젝트 현황, 휴가 현황을 조회 후 시각화 해줌
<img src="assets/캘린더.png" alt="회원가입" width="50%"/>
- **회의실**: 회의실 생성,수정,삭제 조회 및 예약기능
<div display="flex">
 <img src="assets/회의실.png" alt="회의실" width="60%"/>
 <img src="assets/회의실 예약.png" alt="회의실 예약" width="30%"/> 
</div>
<br/>
   
   

   
### 📁 Project Progress
- **프로젝트 생성**:
  - 소프트웨어공학적인 개발기법에 의거해 개발자 맞춤의 프로젝트를 생성
  - 프로젝트를 생성, 수정, 삭제, 조회 가능
  - 모든 조회에는 페이징 처리와 검색 기능 구현
  - 프로젝트 참여자 배정
- **프로젝트 관리**: 프로젝트 참여자들이 프로젝트 단계별 목표 설정 및 산출물 업로드
- **산출물 기능**: 산출물은 다운로드 및 이미지일 경우 미리보기 가능
<div display="flex">
  <img src="assets/프로젝트.png" alt="프로젝트" width="30%"/>
  <img src="assets/프로젝트관리.png" alt="프로젝트관리" width="30%"/>
  <img src="assets/파일업로드.png" alt="파일업로드" width="30%"/>
</div>
<br/>

### 🤖 AI Intelligent Service
- **AI 단계 도우미**: 프로젝트 단계 추가 시 프로젝트 내용이나 목표를 AI가 직접 생성해줌 (Ollama Gemma3:4b 로컬 구동)

<div display="flex">
  <img src="assets/AI단계도우미.png" alt="프로젝트" width="40%"/>
</div>
<br/>

- **AI 챗봇**:
  - CSV 파일 기반 RAG 방식으로 작동
  - 많이 한 질문을 3개까지 보여주는 누적질문 기능
  - 비속어를 필터링하는 비속어 필터 기능

<div display="flex">
  <img src="assets/챗봇.png" alt="프로젝트" width="50%"/>
</div>

<br/>

## 🚀 0. Getting Started (시작하기)
```bash
# Install and Start
$ npm start
