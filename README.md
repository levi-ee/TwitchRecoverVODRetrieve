# TwitchRecoverVODRetrieve

Twitch VOD Retrieve based on https://github.com/TwitchRecover/TwitchRecover.

##  Get dependencies

```
wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
```

## Compile

```
javac -cp Twitch.Recover.jar TwitchRecoverVODRetrieve.java
```

## Run class

```
java -cp Twitch.Recover.jar:. TwitchRecoverVODRetrieve "965331363"
```

## Generate JAR

After compilation run:

```
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar Twitch.Recover.jar TwitchRecoverVODRetrieve.class
```


## Run JAR

```
java -jar TwitchRecoverVODRetrieve.jar "965331363"
```