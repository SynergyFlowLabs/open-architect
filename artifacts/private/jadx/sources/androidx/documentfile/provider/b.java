package androidx.documentfile.provider;

import android.content.res.TypedArray;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ void a(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            c.a((ExecutorService) obj);
        } else if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
        } else {
            d.a(obj);
        }
    }
}
