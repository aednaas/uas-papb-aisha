package aeas.mobile.uaspapbaisha;

import com.google.gson.annotations.SerializedName;

public class ToDo {
    @SerializedName("id")
    private String id;

    @SerializedName("what")
    private String what;

    @SerializedName("time")
    private String time;

    public ToDo() {
        // Konstruktor kosong diperlukan untuk deserialisasi Gson
    }

    public ToDo(String id, String what, String time) {
        this.id = id;
        this.what = what;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
