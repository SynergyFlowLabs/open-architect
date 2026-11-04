package e5;

import android.app.Activity;
import androidx.annotation.b1;
import androidx.annotation.k1;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.x;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f274656a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f274657b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f274658c;

    private b() {
    }

    @n
    public static final void b() {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            try {
                g0 g0Var = g0.f99617a;
                g0.y().execute(new Runnable() { // from class: e5.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                e1 e1Var = e1.f99794a;
                e1.f0(f274657b, e10);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (!com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            try {
                g0 g0Var = g0.f99617a;
                if (!com.facebook.internal.c.f99760f.j(g0.n())) {
                    f274656a.e();
                    f274658c = true;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            }
        }
    }

    @n
    @k1
    public static final void d(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f274658c && !d.f274661d.c().isEmpty()) {
                    f.f274671e.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    private final void e() {
        String strK;
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                b0 b0Var = b0.f99725a;
                g0 g0Var = g0.f99617a;
                x xVarN = b0.n(g0.o(), false);
                if (xVarN != null && (strK = xVarN.k()) != null) {
                    d.f274661d.d(strK);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }
}
