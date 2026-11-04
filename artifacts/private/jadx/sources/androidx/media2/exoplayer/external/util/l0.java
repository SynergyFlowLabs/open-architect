package androidx.media2.exoplayer.external.util;

import android.os.Trace;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l0 {
    private l0() {
    }

    public static void a(String sectionName) {
        if (q0.f57626a >= 18) {
            b(sectionName);
        }
    }

    @e.b(18)
    private static void b(String sectionName) {
        Trace.beginSection(sectionName);
    }

    public static void c() {
        if (q0.f57626a >= 18) {
            d();
        }
    }

    @e.b(18)
    private static void d() {
        Trace.endSection();
    }
}
