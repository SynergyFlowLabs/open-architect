package n9;

import android.os.Trace;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private c() {
    }

    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
