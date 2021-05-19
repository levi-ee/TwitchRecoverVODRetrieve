#/!/bin/bash

set -euo pipefail

if ! ls Twitch.Recover.jar; then
	wget https://github.com/TwitchRecover/TwitchRecover/releases/download/2.0aH/Twitch.Recover.jar
fi

# Extract classes
unzip Twitch.Recover.jar org/apache/** org/json/** TwitchRecover/**
