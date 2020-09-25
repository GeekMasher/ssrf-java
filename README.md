# Java Spring based Server Side Request Forgery (SSRF) examples

This project is a collection of libraries in Java that perform requests on behalf of users to external API's (typically REST).

## Running the Project

```bash
./mvnw spring-boot:run
```

## Libraries

### `java.net.URL`

**Library Paths:**

- `java.net.URL`

**Example Sink:**

```java
import java.net.URL;
import java.net.URLConnection;
// ...
URL url = new URL(INPUT);
URLConnection connection = url.openConnection();
```

### `java.net.http`

**Library Paths:**

- `java.net.http.HttpClient`

**Example Sink:**

- [SsrfHttpRequest1.java](src/main/java/com/geekmasher/ssrf/SsrfHttpRequest1.java)

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
// ...
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create(INPUT))
    .GET()
    .build();
```

### Restlet

**Library Paths:**

- `org.restlet.resource.ClientResource`

**Example Sink:**

- [SsrfClientResource1.java](src/main/java/com/geekmasher/ssrf/SsrfClientResource1.java)

```java
import org.restlet.resource.ClientResource;
import org.restlet.representation.Representation;
// ...
ClientResource resource = new ClientResource(INPUT);
Representation repr = resource.get();
```

### Jsoup

**Library Paths:**

- `org.jsoup.Jsoup`

**Example Sink:**

- [SsrfJSoup1.java](src/main/java/com/geekmasher/ssrf/SsrfJSoup1.java)

```java
import org.jsoup.Jsoup;
// ...
ClientResource resource = new ClientResource(INPUT);
Representation repr = resource.get();
```
