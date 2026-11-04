package androidx.tracing;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
@w0(29)
final class d {
    private d() {
    }

    public static void a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    @u
    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
