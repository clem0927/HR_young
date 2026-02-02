# 🚀 IT HR Web Solution with LLM
> **LLM을 활용한 지능형 IT HR 웹 솔루션**
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

## 🎬 Project Preview
<div align="center">
  <img src="assets/메인.png" alt="프로젝트 배너" width="100%"/>
  <br/>
  <p align="center">
    <strong>[Demo Video]</strong><br/>
    https://github.com/user-attachments/assets/fb03c98b-126e-4c9b-aa65-de33d78c05f7
  </p>
</div>

---

## 📌 1. Project Overview (프로젝트 개요)

### 🎯 목표
IT 기업의 핵심 자산인 **개발자들의 업무 특성**을 고려한 지능형 HR 솔루션 구축

### 💡 주제 선정 배경 및 차별점
* **기존 HR의 한계:** 일반 사무직 위주의 기능 구성으로 개발 직군 전용 기능 부족
* **LLM 결합:** AI 기반의 프로젝트 단계 생성 및 RAG 기술을 적용한 사내 챗봇 도입
* **효율적 관리:** 소프트웨어 공학 기법을 적용한 프로젝트 생명주기 관리

<br/>

## 👥 2. Team Members (팀 소개)

| **김민영 (Project Leader)** | **김순호 (Front-end)** |
| :---: | :---: |
| <img src="https://raw.githubusercontent.com/clem0927/Parking-project/main/assets/토끼.png" width="140" height="140" style="border-radius: 50%"/> | <img src="https://github.com/user-attachments/assets/78ec4937-81bb-4637-975d-631eb3c4601e" width="140" height="140" style="border-radius: 50%"/> |
| [@clem0927](https://github.com/clem0927) | [@20201147-cyber](https://github.com/20201147-cyber) |
| 프로젝트 총괄 기획 및 아키텍처 설계<br/>백엔드 서버 구축 | 프론트엔드 UI/UX 설계<br/>페이지별 핵심 기능 구현 |

<br/>

## 🛠 3. My Contributions & Tech Stack

### 🧑‍💻 담당 파트 (Contributions)
<img src="assets/담당파트.png" alt="담당파트" width="80%"/>

* **Security:** Spring Security 기반 회원가입/로그인 및 권한별 접근 제어(RBAC)
* **Calendar:** 개인 일정 및 프로젝트/휴가 현황 대시보드 구현
* **AI Service:** 로컬 LLM 연동 및 RAG 기반 사내 챗봇 개발

### 🏗 Tech Stack (기술 스택)
<img src="assets/기술스택.png" alt="기술스택" width="80%"/>

* **Backend:** Spring Boot, Spring Security, JPA
* **Frontend:** React.js
* **AI/LLM:** Ollama (Gemma3:4b), RAG (CSV 기반)
* **Database:** MySQL

<br/>

## ✨ 5. Key Features (주요 기능)

### 🔐 Security & Auth
* **맞춤형 접근 제어:** 직책/직급별 페이지 및 API 메서드 접근 권한 관리
* **보안 로그인:** Spring Security를 활용한 안전한 인증 체계

### 📅 Smart Dashboard
* **통합 캘린더:** 개인 일정 + 프로젝트 타임라인 + 휴가 현황 시각화

### 🏗 Project Management
* **공학적 설계:** 소프트웨어 공학 기법을 기반으로 한 프로젝트 생성/수정/삭제
* **효율적 조회:** 대용량 데이터를 고려한 페이징 처리 및 정교한 검색 엔진
* **협업 도구:** 단계별 목표 설정 및 산출물 업로드/미리보기 기능

### 🤖 AI Integration
* **AI 단계 도우미:** 프로젝트 내용 입력 시, AI(Gemma3)가 최적의 목표 및 마일스톤 자동 생성
* **지능형 챗봇:** * **RAG:** 사내 데이터를 기반으로 한 정확한 정보 답변
    * **누적 질문:** 인기 질문 Top 3 큐레이션
    * **Safe Guard:** 비속어 필터링 시스템 적용

<br/>

## 🚀 0. Getting Started (시작하기)

```bash
# Repository Clone
$ git clone [https://github.com/your-repo-url.git](https://github.com/your-repo-url.git)

# Start Application
$ npm start
