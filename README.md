# TwitchRecoverVODRetrieve

Terminal app to get Twitch VOD link.

Uses https://github.com/TwitchRecover/TwitchRecover

## Download JAR

https://github.com/levi-ee/TwitchRecoverVODRetrieve/releases/latest

## Compile from source and generate JAR

```
git clone git@github.com:levi-ee/TwitchRecoverVODRetrieve.git
cd TwitchRecoverVODRetrieve
chmod +x gen_jar.sh && ./gen_jar.sh
```

## Useful commands


### Only with required Twitch.Recover.jar classes


#### Get dependencies

```
chmod +x get_deps.sh && ./get_deps.sh
rm Twitch.Recover.jar
```

#### Compile

```
javac TwitchRecoverVODRetrieve.java
```

#### Run class

```
java TwitchRecoverVODRetrieve "965331363"
```

#### Generate JAR

After compilation run:

```
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar TwitchRecoverVODRetrieve.class org/apache org/json TwitchRecover
```


#### Run JAR

```
java -jar TwitchRecoverVODRetrieve.jar "965331363"
```

### With full Twitch.Recover.jar


#### Get dependencies

```
wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
```

#### Compile

```
javac -cp Twitch.Recover.jar TwitchRecoverVODRetrieve.java
```

#### Run class

```
java -cp Twitch.Recover.jar:. TwitchRecoverVODRetrieve "965331363"
```

#### Generate JAR

After compilation run:

```
echo "Class-Path: Twitch.Recover.jar" >> META-INF/MANIFEST.MF
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar TwitchRecoverVODRetrieve.class
```


#### Run JAR

Requires `Twitch.Recover.jar` on the same directory.

```
java -jar TwitchRecoverVODRetrieve.jar "965331363"
```