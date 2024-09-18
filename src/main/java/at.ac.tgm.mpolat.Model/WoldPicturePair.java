package at.ac.tgm.mpolat.Model;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author Muhammed Enes Polat
 * @version 18.09.2024
 * WoldPicturePair Klasse zum erstellen von Wort und Bild Paaren
 */

public class WoldPicturePair {

        private String world;
        private String url;

    /**
     * Konstruktor der KLasse
     * @param world
     * @param url
     */
    WoldPicturePair(String world, String url) {
            this.world = world;
            this.url = url;
        }

    /**
     * Methode zum überprüfung der URL
     * @param url
     * @return
     */
    static boolean checkurl(String url){
            try {
                new URL(url).toURI();
                return true;
            } catch (MalformedURLException e) {
                return false;
            } catch (URISyntaxException e) {
                return false;
            }
    }

    /**
     * geter Methode für world
     * @return
     */
    public String getWorld() {
        return world;
    }

    /**
     * geter Methode für url
     * @return
     */
    public String getUrl() {
            return url;
    }

    /**
     * seter Methode für url
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * seter Methode für world
     * @param world
     */
    public void setWorld(String world) {
        this.world = world;
    }
}
