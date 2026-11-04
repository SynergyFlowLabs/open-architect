package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.g1;
import io.sentry.ga;
import io.sentry.i1;
import io.sentry.ia;
import io.sentry.ja;
import io.sentry.n0;
import io.sentry.protocol.f0;
import io.sentry.r1;
import io.sentry.t4;
import io.sentry.util.o0;
import io.sentry.v4;
import io.sentry.x9;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import lm.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f304222h = "ui.action";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f304223i = "auto.ui.gesture_listener";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f304224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i1 f304225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private io.sentry.internal.gestures.b f304227d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private r1 f304228e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private b f304229f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f304230g = new c(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f304231a;

        static {
            int[] iArr = new int[b.values().length];
            f304231a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304231a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f304231a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f304231a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(@NotNull Activity activity, @NotNull i1 i1Var, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f304224a = new WeakReference<>(activity);
        this.f304225b = i1Var;
        this.f304226c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, g1 g1Var, r1 r1Var, r1 r1Var2) {
        if (r1Var2 != null) {
            gVar.f304226c.getLogger().c(y7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", r1Var.getName());
        } else {
            gVar.getClass();
            g1Var.F(r1Var);
        }
    }

    public static /* synthetic */ void d(g gVar, g1 g1Var, r1 r1Var) {
        if (r1Var == gVar.f304228e) {
            g1Var.J();
        }
    }

    private void e(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2, @NotNull Map<String, Object> map, @NotNull MotionEvent motionEvent) {
        if (this.f304226c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            n0 n0Var = new n0();
            n0Var.o(ja.f305668l, motionEvent);
            n0Var.o(ja.f305669m, bVar.f());
            this.f304225b.m(io.sentry.f.e0(strJ, bVar.d(), bVar.a(), bVar.e(), map), n0Var);
        }
    }

    @Nullable
    private View h(@NotNull String str) {
        Activity activity = this.f304224a.get();
        if (activity == null) {
            this.f304226c.getLogger().c(y7.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f304226c.getLogger().c(y7.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f304226c.getLogger().c(y7.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    @NotNull
    private String i(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @NotNull
    private static String j(@NotNull b bVar) {
        int i10 = a.f304231a[bVar.ordinal()];
        if (i10 == 1) {
            return "click";
        }
        if (i10 != 2) {
            return i10 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    private void l(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2) {
        boolean z10 = bVar2 == b.Click || !(bVar2 == this.f304229f && bVar.equals(this.f304227d));
        if (!this.f304226c.isTracingEnabled() || !this.f304226c.isEnableUserInteractionTracing()) {
            if (z10) {
                if (this.f304226c.isEnableAutoTraceIdGeneration()) {
                    o0.m(this.f304225b);
                }
                this.f304227d = bVar;
                this.f304229f = bVar2;
                return;
            }
            return;
        }
        Activity activity = this.f304224a.get();
        if (activity == null) {
            this.f304226c.getLogger().c(y7.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        r1 r1Var = this.f304228e;
        if (r1Var != null) {
            if (!z10 && !r1Var.isFinished()) {
                this.f304226c.getLogger().c(y7.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f304226c.getIdleTimeout() != null) {
                    this.f304228e.l();
                    return;
                }
                return;
            }
            m(x9.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        ia iaVar = new ia();
        iaVar.B(true);
        long deadlineTimeout = this.f304226c.getDeadlineTimeout();
        iaVar.x(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        iaVar.y(this.f304226c.getIdleTimeout());
        iaVar.k(true);
        iaVar.h("auto.ui.gesture_listener." + bVar.c());
        final r1 r1VarE0 = this.f304225b.E0(new ga(str, f0.COMPONENT, str2), iaVar);
        this.f304225b.v0(new v4() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                this.f304220a.f(g1Var, r1VarE0);
            }
        });
        this.f304228e = r1VarE0;
        this.f304227d = bVar;
        this.f304229f = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r
    public void f(@NotNull final g1 g1Var, @NotNull final r1 r1Var) {
        g1Var.h0(new t4.c() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.t4.c
            public final void a(r1 r1Var2) {
                g.b(this.f304214a, g1Var, r1Var, r1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r
    public void g(@NotNull final g1 g1Var) {
        g1Var.h0(new t4.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.t4.c
            public final void a(r1 r1Var) {
                g.d(this.f304218a, g1Var, r1Var);
            }
        });
    }

    public void k(@NotNull MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f304230g.f304233b;
        if (viewH != null && bVar != null) {
            if (this.f304230g.f304232a == b.Unknown) {
                this.f304226c.getLogger().c(y7.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            e(bVar, this.f304230g.f304232a, Collections.singletonMap("direction", this.f304230g.i(motionEvent)), motionEvent);
            l(bVar, this.f304230g.f304232a);
            this.f304230g.j();
        }
    }

    void m(@NotNull x9 x9Var) {
        r1 r1Var = this.f304228e;
        if (r1Var != null) {
            if (r1Var.t() == null) {
                this.f304228e.E(x9Var);
            } else {
                this.f304228e.u();
            }
        }
        this.f304225b.v0(new v4() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                this.f304217a.g(g1Var);
            }
        });
        this.f304228e = null;
        if (this.f304227d != null) {
            this.f304227d = null;
        }
        this.f304229f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f304230g.j();
        this.f304230g.f304234c = motionEvent.getX();
        this.f304230g.f304235d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f10, float f11) {
        this.f304230g.f304232a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f10, float f11) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f304230g.f304232a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f304226c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f304226c.getLogger().c(y7.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f304230g.f304232a = b.Scroll;
                return false;
            }
            this.f304226c.getLogger().c(y7.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f304230g.k(bVarA);
            this.f304230g.f304232a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f304226c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.CLICKABLE);
            if (bVarA == null) {
                this.f304226c.getLogger().c(y7.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private b f304232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private io.sentry.internal.gestures.b f304233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f304234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f304235d;

        private c() {
            this.f304232a = b.Unknown;
            this.f304234c = 0.0f;
            this.f304235d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f304234c;
            float y10 = motionEvent.getY() - this.f304235d;
            if (Math.abs(x10) > Math.abs(y10)) {
                return x10 > 0.0f ? "right" : "left";
            }
            return y10 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f304233b = null;
            this.f304232a = b.Unknown;
            this.f304234c = 0.0f;
            this.f304235d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(@NotNull io.sentry.internal.gestures.b bVar) {
            this.f304233b = bVar;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
