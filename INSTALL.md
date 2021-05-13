
```
keytool -genkey -alias key_alias \
    -keyalg RSA -keystore ./app/release.keystore \
    -keysize 2048 -validity 10000 \
    -dname "CN=Khoa Vo, OU=DEV, O=FGC, L=Vinh, S=Nghe An, C=VN" \
    -storepass password -keypass password
```
```
docker run -v $(pwd):/home/app --rm --privileged androidsdk/android-29:latest bash -c 'cd /home/app && ./gradlew app:assembleDevelopDebug'
```