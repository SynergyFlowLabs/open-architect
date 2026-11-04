package androidx.media3.common.util;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class z0 {
    private z0() {
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
