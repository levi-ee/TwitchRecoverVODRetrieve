#/!/bin/bash

set -euo pipefail

wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
javac -cp Twitch.Recover.jar TwitchRecoverVODRetrieve.java
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar Twitch.Recover.jar TwitchRecoverVODRetrieve.class