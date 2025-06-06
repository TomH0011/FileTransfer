# Secure File Transfer Application

This is a secure file transfer application built with Spring Boot that provides encrypted file transfer capabilities. The application uses AES-256 encryption for secure file transfer and storage.

## Features

- Secure file upload and download
- AES-256 encryption for file transfer
- User authentication and authorization
- File metadata tracking
- Support for various file types
- Progress tracking for uploads and downloads

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher

## Setup

1. Clone the repository:
```bash
git clone <repository-url>
cd FileTransferProject
```

2. Configure the database:
   - Create a MySQL database named `filetransferproject`
   - Update the database credentials in `src/main/resources/application.properties` if needed

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The application will start on port 5544.

## API Endpoints

### File Upload
- **POST** `/upload`
  - Upload a file with encryption
  - Requires authentication
  - Returns file metadata including encryption key

### File Download
- **GET** `/download/{fileId}`
  - Download an encrypted file
  - Requires authentication and valid encryption key
  - Returns decrypted file

### File Management
- **GET** `/files`
  - List all files
  - Requires authentication

- **DELETE** `/files/{fileId}`
  - Delete a file
  - Requires authentication

## Security

- All files are encrypted using AES-256 encryption
- Each file has a unique encryption key
- Keys are stored securely and never exposed in URLs
- Authentication is required for all operations
- Files are encrypted during transfer and storage

## Configuration

The application can be configured through `application.properties`:

```properties
# Server Configuration
server.port=5544

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/filetransferproject
spring.datasource.username=your_username
spring.datasource.password=your_password

# File Upload Configuration
spring.servlet.multipart.max-file-size=100MB
spring.servlet.multipart.max-request-size=100MB
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details. 
