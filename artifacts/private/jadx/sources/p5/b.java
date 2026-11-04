package p5;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.g0;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o5.k;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f340771b = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f340770a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f340772c = Process.myUid();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ScheduledExecutorService f340773d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static String f340774e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Runnable f340775f = new Runnable() { // from class: p5.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (!com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            try {
                g0 g0Var = g0.f99617a;
                Object systemService = g0.n().getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                c((ActivityManager) systemService);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            }
        }
    }

    @n
    @l1
    public static final void c(@Nullable ActivityManager activityManager) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f340772c) {
                    Thread thread = Looper.getMainLooper().getThread();
                    Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                    k kVar = k.f333571a;
                    String strG = k.g(thread);
                    if (!Intrinsics.areEqual(strG, f340774e) && k.k(thread)) {
                        f340774e = strG;
                        o5.c.a aVar = o5.c.a.f333560a;
                        o5.c.a.a(processErrorStateInfo.shortMsg, strG).g();
                    }
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    @n
    @l1
    public static final void d() {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            f340773d.scheduleAtFixedRate(f340775f, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }
}
