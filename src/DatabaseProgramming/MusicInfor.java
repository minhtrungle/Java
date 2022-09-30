package DatabaseProgramming;

/**
 * class been ten la DatabaseInfor 
 * @author lmtrung
 */
public class MusicInfor  {
	private int id;
	private String artist;
	private String title;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	 @Override
	public String toString() {
		 return "Music {" + "ID =" + id + ", Artist =" + artist + ", Title =" + title + "}";
	    }
}