package androidx.transition;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f75518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f75519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f75520c;

    @androidx.annotation.w0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Canvas canvas) {
            canvas.disableZ();
        }

        @androidx.annotation.u
        static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    private c() {
    }

    @e.a({"SoonBlockedPrivateApi"})
    static void a(@NonNull Canvas canvas, boolean z10) {
        if (z10) {
            a.b(canvas);
        } else {
            a.a(canvas);
        }
    }
}
