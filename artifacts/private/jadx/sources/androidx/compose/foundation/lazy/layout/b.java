package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.compose.foundation.b2
@SourceDebugExtension({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n27#2,5:303\n1#3:308\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n*L\n158#1:303,5\n*E\n"})
public final class b implements u2, w2, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f17318h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17319i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f17320j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f17321a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17323c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17327g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final PriorityQueue<x2> f17322b = new PriorityQueue<>(11, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b.g((x2) obj, (x2) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Choreographer f17324d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C0109b f17325e = new C0109b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        public final void b(View view) {
            float refreshRate;
            if (b.f17320j == 0) {
                Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                b.f17320j = (long) (1000000000 / refreshRate);
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$b, reason: collision with other inner class name */
    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class C0109b implements t2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f17328c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f17330b;

        @Override // androidx.compose.foundation.lazy.layout.t2
        public long a() {
            if (this.f17329a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.f17330b - System.nanoTime());
        }

        public final long b() {
            return this.f17330b;
        }

        public final boolean c() {
            return this.f17329a;
        }

        public final void d(boolean z10) {
            this.f17329a = z10;
        }

        public final void e(long j10) {
            this.f17330b = j10;
        }
    }

    public b(@NotNull View view) {
        this.f17321a = view;
        f17318h.b(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(x2 x2Var, x2 x2Var2) {
        return Intrinsics.compare(x2Var2.c(), x2Var.c());
    }

    private final boolean h() {
        long jA = this.f17325e.a();
        androidx.compose.ui.util.a.b("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z10 = true;
        if (jA > 0) {
            x2 x2VarPeek = this.f17322b.peek();
            Intrinsics.checkNotNull(x2VarPeek);
            if (!x2VarPeek.d().d(this.f17325e)) {
                this.f17322b.poll();
                z10 = false;
            }
            this.f17325e.d(false);
        }
        return z10;
    }

    private final void i() {
        if (this.f17323c) {
            return;
        }
        this.f17323c = true;
        this.f17321a.post(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.w2
    public void b(@NotNull s2 s2Var) {
        this.f17322b.add(new x2(x2.f17618c.a(), s2Var));
        i();
    }

    @Override // androidx.compose.foundation.lazy.layout.w2
    public void c(@NotNull s2 s2Var) {
        this.f17322b.add(new x2(x2.f17618c.b(), s2Var));
        i();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f17326f) {
            this.f17327g = j10;
            this.f17321a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        this.f17326f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        this.f17326f = false;
        this.f17321a.removeCallbacks(this);
        this.f17324d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f17322b.isEmpty() && this.f17323c && this.f17326f && this.f17321a.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f17321a.getDrawingTime());
            this.f17325e.d(System.nanoTime() > (((long) 2) * f17320j) + nanos);
            this.f17325e.e(Math.max(this.f17327g, nanos) + f17320j);
            boolean zH = false;
            while (!this.f17322b.isEmpty() && !zH) {
                if (this.f17325e.c()) {
                    Trace.beginSection("compose:lazy:prefetch:idle_frame");
                    try {
                        zH = h();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    zH = h();
                }
            }
            if (zH) {
                this.f17324d.postFrameCallback(this);
            } else {
                this.f17323c = false;
            }
            androidx.compose.ui.util.a.b("compose:lazy:prefetch:available_time_nanos", 0L);
            return;
        }
        this.f17323c = false;
    }
}
