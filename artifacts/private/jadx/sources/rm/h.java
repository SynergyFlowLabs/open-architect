package rm;

/* JADX INFO: loaded from: classes14.dex */
public class h extends Exception {
    public h(String str) {
        super(str);
    }

    public h(Exception exc) {
        this(exc.toString(), exc);
    }

    public h(String str, Throwable th2) {
        super(str, th2);
    }
}
