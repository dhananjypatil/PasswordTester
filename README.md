# 🔐 Password Strength Tester (Java)

A Java console application that checks whether a password meets basic security requirements such as minimum length, presence of numbers, and special characters. The program tests predefined passwords and also allows the user to validate their own password.

---

## 📌 Project Overview

Password security is an important part of any application.  
This project demonstrates how to validate password strength using **Java** and **Regular Expressions (Regex)**.

The application:
- Tests a list of predefined passwords.
- Accepts a password from the user at runtime.
- Validates each password using security rules.
- Displays whether each password is **PASS (Strong)** or **FAIL (Weak)**.

---

## ✅ Password Validation Rules

A password is considered **STRONG** if:

1. 🔒 It has at least **8 characters**.
2. 🔢 It contains at least **one numeric digit (0–9)**.
3. ⭐ It contains at least **one special character**  
   Example: `! @ # $ % ^ & * ( ) , . ? " : { } | < >`

If any rule fails, the password is marked as **WEAK**.

---

## 📂 Project Structure

