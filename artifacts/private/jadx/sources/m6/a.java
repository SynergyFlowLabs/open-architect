package m6;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Handler {
    public a() {
        Looper.getMainLooper();
    }

    public a(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
