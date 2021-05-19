#/!/bin/bash

set -euo pipefail

if ! ls Twitch.Recover.jar; then
	wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
fi
javac -cp Twitch.Recover.jar TwitchRecoverVODRetrieve.java

jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar Twitch.Recover.jar TwitchRecoverVODRetrieve.class