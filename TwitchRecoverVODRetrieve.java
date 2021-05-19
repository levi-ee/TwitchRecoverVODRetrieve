
// Use https://github.com/TwitchRecover/TwitchRecover
import TwitchRecover.Core.VOD;
import TwitchRecover.CLI.Handlers.CoreHandler;
import TwitchRecover.CLI.Handlers.VODHandler;
import TwitchRecover.Core.Feeds;
import TwitchRecover.Core.Enums.Quality;

public class TwitchRecoverVODRetrieve {

    public static void main(String[] args){

        // Get args
    	if(args.length == 0)
	    {
	        System.out.println("Required arg: URL");
	        System.exit(0);
	    }
        String url=args[0];

        // Get feeds from URL
        VOD vod=new VOD(false);
        vod.retrieveID(url);
        Feeds feeds=vod.getVODFeeds();

        // Print all feeds URLs
        int i=1;
        for(Quality qual: feeds.getQualities()){
            System.out.print(qual.text + " - " + vod.getFeed(i-1) + "\n");
            i++;
        }
    }
}
