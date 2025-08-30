📧 Smart Mail Genie – AI Email Writer

Smart Mail Genie is an AI-powered email assistant built with Spring Boot that helps users generate professional, well-structured, and context-aware email responses in different tones (formal, casual, polite, etc.).

It leverages WebClient to interact with an AI API and returns a neatly formatted email draft ready for use.

🚀 Features

✨ Generate AI-written email responses based on content + tone

📦 Built with Spring Boot for backend services

🔗 Uses WebClient to call AI APIs

📑 Structured JSON request & response handling

🌐 REST APIs to integrate with frontends (React, mobile apps, etc.)

⚡ Lightweight & fast email drafting system

🏗️ Project Architecture
User → REST API (Spring Boot) → AI Service (WebClient) → Response → Email Draft


Modules:

Controller → Handles API requests

Service → Builds prompts & communicates with AI

Utils → JSON parsing & response formatting

📂 Project Structure
src/main/java/com/email/writer/
│── Controller/        # API endpoints
│── Service/           # Business logic, WebClient integration
│── Utils/             # JSON parsing, helpers
│── Application.java   # Main Spring Boot entry

⚙️ Tech Stack
Backend: Spring Boot (Java 17+)
HTTP Client: WebClient
AI Integration: OpenAI-compatible API
Build Tool: Maven
