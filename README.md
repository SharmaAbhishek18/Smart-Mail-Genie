🧠 Smart Mail-Genie – AI-Powered Email Reply Assistant
Smart Mail-Genie is an intelligent email assistant that integrates with Gmail and uses generative AI to craft professional, context-aware replies.
Designed to boost productivity by reducing response time and improving communication tone.

🚀 Features
✉️ AI-Based Email Reply Generation – Generates contextual responses using Gemini AI APIs

🌐 Chrome Extension Integration – Seamless in-browser suggestions inside Gmail

⚙️ Tone Customization – Choose formal, friendly, or neutral tone for replies

🧩 Spring Boot Backend – REST API server for handling email requests and integrating AI

🧠 Prompt Engineering – Dynamic prompt creation for accurate AI understanding

🛠️ Tech Stack
Backend: Spring Boot, Spring AI, WebClient

Frontend: React.js, Chrome Extension

AI: Google Gemini API

JSON Processing: Jackson ObjectMapper

📦 Folder Structure

src/
├── controller/
│   └── EmailGeneratorController.java
├── service/
│   └── EmailGeneratorService.java
├── config/
│   └── WebConfig.java
├── model/
│   └── EmailRequest.java
📥 Sample Request
json
Copy
Edit
POST /api/email/generate
{
  "emailContent": "Hi, can we reschedule the meeting?",
  "tone": "formal"
}
📌 How It Works
1.User inputs email content and selects tone

2.Backend builds dynamic AI prompt

3.Request sent to Gemini API via WebClient

4.AI returns response text

5.Chrome Extension displays it within Gmail
