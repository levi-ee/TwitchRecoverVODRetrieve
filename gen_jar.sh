#/!/bin/bash

set -euo pipefail

chmod +x get_deps.sh && ./get_deps.sh
javac TwitchRecoverVODRetrieve.java
jar cmvf META-INF/MANIFEST.MF TwitchRecoverVODRetrieve.jar TwitchRecoverVODRetrieve.class org/apache org/json TwitchRecover