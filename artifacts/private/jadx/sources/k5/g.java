package k5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f307564d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, g> f307565e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f307566f = 300;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f307567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f307568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f307569c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        public final void a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = g.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object gVar = mapB.get(numValueOf);
            if (gVar == null) {
                gVar = new g(activity, null);
                mapB.put(numValueOf, gVar);
            }
            g.c((g) gVar);
        }

        @n
        public final void b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }

        private a() {
        }
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f307565e;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            gVar.i();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    private final void e() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: k5.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(this.f307563a);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f307568b.post(runnable);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g this$0) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                View viewE = com.facebook.appevents.internal.g.e(this$0.f307567a.get());
                Activity activity = this$0.f307567a.get();
                if (viewE != null && activity != null) {
                    c cVar = c.f307555a;
                    for (View view : c.a(viewE)) {
                        f5.e eVar = f5.e.f275001a;
                        if (!f5.e.g(view)) {
                            c cVar2 = c.f307555a;
                            String strD = c.d(view);
                            if (strD.length() > 0 && strD.length() <= 300) {
                                j.a aVar = j.f307576e;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                aVar.d(view, viewE, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    private final void g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (this.f307569c.getAndSet(true)) {
                return;
            }
            com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
            View viewE = com.facebook.appevents.internal.g.e(this.f307567a.get());
            if (viewE == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @n
    public static final void h(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            f307564d.a(activity);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    private final void i() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (this.f307569c.getAndSet(false)) {
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                View viewE = com.facebook.appevents.internal.g.e(this.f307567a.get());
                if (viewE == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @n
    public static final void j(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            f307564d.b(activity);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private g(Activity activity) {
        this.f307567a = new WeakReference<>(activity);
        this.f307568b = new Handler(Looper.getMainLooper());
        this.f307569c = new AtomicBoolean(false);
    }
}
