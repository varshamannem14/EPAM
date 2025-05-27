## Task: Implement a Library Management System with Bean Conflict Resolution Using Annotations

### Description:
You are tasked with creating a simple Spring-based Java application to manage a library system utilizing annotations for dependency injection and bean configuration. The application should add books, retrieve a book by ID, and list all books. Your primary challenge will be to manage bean conflicts that occur due to multiple bean definitions of the same type.

### Requirements:

#### 1. Project Setup
- Set up a Maven or Gradle project configured with Spring Boot (simplifying Spring application setup).

#### 2. Model Creation
- Define a `Book` class within a `model` package, equipped with attributes such as `id`, `title`, and `author`, along with appropriate getters and setters.

#### 3. Service Layer
- Create a `BookService` interface with methods to `addBook(Book book)`, `getBookById(int id)`, and `listAllBooks()`.
- Implement this interface in two different classes, `BookServiceImpl` and `DuplicateBookServiceImpl`. Both should functionally behave the same but use different internal storage mechanisms (one might use a `HashMap`, another might use a `HashSet`).

#### 4. Bean Configuration Using Annotations
- Annotate both `BookServiceImpl` and `DuplicateBookServiceImpl` with `@Service` but differentiate them with distinct names using `@Qualifier` annotations.

#### 5. Main Application
- Create a main class annotated with `@SpringBootApplication`.
- Use `@Autowired` and `@Qualifier` to specify which `BookService` bean to inject from the context, aiming to resolve any potential ambiguity caused by the presence of multiple beans of type `BookService`.

#### 6. Conflict Resolution
- Explicitly demonstrate a scenario involving a bean conflict by trying to autowire `BookService` without `@Qualifier`. Observe and document the error.
- Resolve the conflict by correctly using the `@Qualifier` annotation to specify which bean should be preferenceed.