# Step 1: Use the GraalVM image as a base
FROM ghcr.io/graalvm/graalvm-ce:23 as builder

# Step 2: Set the working directory in the container
WORKDIR /app

# Step 3: Copy your application files
COPY . .

# Step 4: Install native-image if not included by default
RUN gu install native-image

# Step 5: Build the native image
RUN native-image -jar ZiseApi.jar

# Step 6: Use a lightweight base image for the final image
FROM gcr.io/distroless/java

# Step 7: Copy the native executable from the builder stage
COPY --from=builder /app/your-app /app/your-app

# Step 8: Set the entry point
ENTRYPOINT ["/app/your-app"]
