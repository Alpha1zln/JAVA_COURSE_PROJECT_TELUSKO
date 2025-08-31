# 🎮 Quiz Game (Java)  

## A simple **Java-based Quiz Game** built in VS Code.    
### The game contains multiple-choice questions and evaluates the player’s score with performance feedback.  

---

## ✨ Features  
- Console-based quiz in **Java**  
- Multiple-choice questions  
- Score calculation with feedback:  
  - **90%+** → Excellent 🎯  
  - **80%+** → Very Good 💯  
  - **70%+** → Nice 🙂  
  - **60%+** → Fine 👍  
  - **50% or below** → Work Harder 💪  


**********************

#### 4 separate files with clean separation:  

Question.java → model class  
QuestionBank.java → stores and manages all questions (dynamic add/remove)   
QuizApp.java → main quiz logic (ask questions, check answers, score)    
QuizGameMain.java → just minimal starter to run the game  

****************************

1. Class Diagram (Text form for VS Code / notes)  
+------------------+  
|   QuizGameMain   |  
+------------------+  
| + main()         |  
+------------------+  
         |  
         v  
+------------------+  
|     QuizApp      |  
+------------------+  
| - questionBank   |  
| - score          |   
| - scanner        |  
+------------------+  
| + startQuiz()    |  
| + playQuiz()     |  
| + showResults()  |  
+------------------+  
         |  
         v  
+------------------+  
|   QuestionBank   |  
+------------------+  
| - questions[]    |  
+------------------+  
| + addQuestion()  |  
| + getQuestions() |  
+------------------+  
         |  
         v  
+------------------+  
|    Question      |  
+------------------+  
| - questionText   |  
| - options[]      |  
| - correctAnswer  |  
+------------------+  
| + getText()      |  
| + getOptions()   |  
| + getAnswer()    |  
+------------------+  
 

This shows flow of control:  
QuizGameMain → QuizApp → QuestionBank → Question  





*********************
