package androidx.paging;

import android.os.Build;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f2 f71875a = new f2();

    private f2() {
    }

    public static /* synthetic */ void c(f2 f2Var, int i10, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        f2Var.b(i10, str, th2);
    }

    public final boolean a(int i10) {
        return Build.ID != null && Log.isLoggable(g2.f72015a, i10);
    }

    public final void b(int i10, @NotNull String message, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i10 == 2 || i10 == 3) {
            return;
        }
        throw new IllegalArgumentException("debug level " + i10 + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
