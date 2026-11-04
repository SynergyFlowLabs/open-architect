package android.manager;

/* JADX INFO: loaded from: classes14.dex */
public class BitmapFactory {
    static {
        try {
            System.loadLibrary("BitmapOptimization");
        } catch (UnsatisfiedLinkError e10) {
            System.err.println("Failed to load native library BitmapOptimization: " + e10.getMessage());
            e10.printStackTrace();
        }
    }

    private BitmapFactory() {
    }

    public static native void build();

    public static native void init();
}
