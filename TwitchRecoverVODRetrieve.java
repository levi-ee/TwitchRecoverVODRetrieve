
import TwitchRecover.Core.VOD;
import TwitchRecover.CLI.Handlers.CoreHandler;
import TwitchRecover.CLI.Handlers.VODHandler;
import TwitchRecover.CLI.Enums.oType;
import TwitchRecover.CLI.Enums.vType;
import TwitchRecover.Core.Feeds;
import TwitchRecover.Core.Enums.Quality;

public class TwitchRecoverVODRetrieve {

    public static void main(String[] args){

    	if(args.length == 0)
	    {
	        System.out.println("Required arg: URL");
	        System.exit(0);
	    }
        String url=args[0];

        VOD vod=new VOD(false);
        vod.retrieveID(url);
        Feeds feeds=vod.getVODFeeds();

        int i=1;
        for(Quality qual: feeds.getQualities()){
            System.out.print("\n" + qual.text + " - " + vod.getFeed(i-1));
            i++;
        }
        
        System.out.print("\n");
    }
}
