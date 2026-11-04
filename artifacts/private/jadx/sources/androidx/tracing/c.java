package androidx.tracing;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
@w0(18)
final class c {
    private c() {
    }

    public static void a(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
