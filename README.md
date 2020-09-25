

## Running Spring App

```bash
./mvnw spring-boot:run
```

## Libraries

### URL

**Sink:** ``

```java
import java.net.URL;
import java.net.URLConnection;
// ...
URL url = new URL(INPUT);
URLConnection connection = url.openConnection();
```

### Restlet

**Sink:** ``

```java
import org.restlet.resource.ClientResource;
import org.restlet.representation.Representation;
// ...
ClientResource resource = new ClientResource(INPUT);
Representation repr = resource.get();
```
