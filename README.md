# TwitchRecoverVODRetrieve

Terminal app to get Twitch VOD link.

Uses https://github.com/TwitchRecover/TwitchRecover

## Download JAR

https://github.com/levi-ee/TwitchRecoverVODRetrieve/releases

## Compile from source and generate JAR

```
git clone git@github.com:levi-ee/TwitchRecoverVODRetrieve.git
cd TwitchRecoverVODRetrieve
./gen_jar.sh
```

## Useful commands

Get dependencies:

```
wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
```

Compile:

```
javac -cp Twitch.Recover.jar TwitchRecoverVODRetrieve.java
```

Run class:

```
java -cp Twitch.Recover.jar:. TwitchRecoverVODRetrieve "965331363"
```

Generate JAR:

After compilation run:

```
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar Twitch.Recover.jar TwitchRecoverVODRetrieve.class
```


Run JAR:

```
java -jar TwitchRecoverVODRetrieve.jar "965331363"
```