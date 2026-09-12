# Hibernate JPA Projects - Association Mapping

> **Java Full Stack Developer | ECE Graduate | JSpiders Trained**

A complete implementation of Hibernate JPA Association Mappings with JPQL queries, Cascade Operations and Exception Handling. This repository demonstrates real-time Entity Relationships used in enterprise applications.

### 📂 Projects Included

#### 1. OneToOne Unidirectional - Person ↔ PanCard
- Implemented `@OneToOne` mapping with `@JoinColumn`
- Created 11 JPQL queries
    - `FindPersonByPancardId`
    - `FindPersonByPhone`
    - `FindPanCardByPanNoAndDob`
    - `FindPersonByPancardNumber`
    - `FindPersonById`, `FindPersonByName` etc.
- Handled `NoResultException` and `getSingleResult()` null cases
- **Files:** `Person.java`, `PanCard.java`, `InsertRecord.java`

#### 2. OneToMany / ManyToOne - Department ↔ Employee
- Implemented `Department has Many Employees`
- Used `CascadeType.ALL` for save, update, delete operations
- Used `mappedBy` for bidirectional handling

#### 3. ManyToMany - Student ↔ Course
- Implemented using `@ManyToMany` and `@JoinTable`
- Automatic Join Table management by Hibernate

### 🛠️ Tech Stack
`Java 8+` | `Hibernate 6.x` | `JPA` | `JPQL` | `MySQL` | `Maven` | `Eclipse IDE` | `Git & GitHub`

### 💡 Key Concepts Covered
- Entity Lifecycle: Transient, Persistent, Detached, Removed
- JPQL: `createQuery`, Parameter Binding, `getSingleResult`, `getResultList`
- Cascade Types & Fetch Types (LAZY / EAGER)
- Primary Key & Foreign Key Mapping with `@JoinColumn`

### 🚀 How to Run
1. Clone: `git clone https://github.com/asparianitha/hibernate-jpa-projects.git`
2. Import as Maven Project in Eclipse
3. Configure `persistence.xml` with your MySQL DB details
4. Run `InsertRecord.java` then test Finder classes

### 🤝 Soft Skills Demonstrated
- **Active Listening & Understanding:** Understood complex mapping requirements and translated to code.
- **Problem Solving:** Fixed `NoResultException` by implementing proper try-catch and validation logic.
- **Team Collaboration & Empathy:** Helped JSpiders batchmates to solve Hibernate configuration errors.

### 👩‍💻 Author
**Aspari Anitha**
- **GitHub:** [github.com/asparianitha](https://github.com/asparianitha)
- **LinkedIn:** [Aspari Anitha](https://www.linkedin.com/in/aspari-anitha/)
- **Location:** Bangalore, India
- **Looking for:** Java Developer / Java Full Stack Developer Roles

---
⭐ **If you are a recruiter:** Please check my commit history for daily learning progress. This project is part of my JSpiders Java Full Stack Training.
