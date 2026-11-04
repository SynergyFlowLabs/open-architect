package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.w0;
import io.sentry.ILogger;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e.b(26)
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nWindowRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecorder.kt\nio/sentry/android/replay/WindowRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1855#2,2:239\n1#3:241\n*S KotlinDebug\n*F\n+ 1 WindowRecorder.kt\nio/sentry/android/replay/WindowRecorder\n*L\n221#1:239,2\n*E\n"})
public final class c0 implements h, f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final b f304710l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f304711m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f304712n = "WindowRecorder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final v f304714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a0 f304715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.replay.util.j f304716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f304717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList<WeakReference<View>> f304719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private Point f304720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private volatile a f304723k;

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final n8 f304724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.sentry.android.replay.util.j f304725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private u f304726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private w f304727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f304728e;

        public a(@NotNull n8 options, @NotNull io.sentry.android.replay.util.j mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.f304724a = options;
            this.f304725b = mainLooperHandler;
            this.f304728e = new AtomicBoolean(true);
        }

        @Nullable
        public final w a() {
            return this.f304727d;
        }

        @Nullable
        public final u b() {
            return this.f304726c;
        }

        public final void c() {
            u uVar = this.f304726c;
            if (uVar != null) {
                uVar.u();
            }
            this.f304728e.getAndSet(false);
        }

        public final void d() {
            if (this.f304724a.getSessionReplay().o()) {
                this.f304724a.getLogger().c(y7.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            u uVar = this.f304726c;
            if (uVar != null) {
                uVar.v();
            }
            this.f304728e.getAndSet(true);
            this.f304725b.d(this);
            if (this.f304725b.b(this)) {
                return;
            }
            this.f304724a.getLogger().c(y7.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void e(@Nullable w wVar) {
            this.f304727d = wVar;
        }

        public final void f(@Nullable u uVar) {
            this.f304726c = uVar;
        }

        public final void g() {
            u uVar = this.f304726c;
            if (uVar != null) {
                uVar.m();
            }
            this.f304726c = null;
            this.f304728e.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f304728e.get()) {
                try {
                    if (this.f304724a.getSessionReplay().o()) {
                        this.f304724a.getLogger().c(y7.DEBUG, "Capturing a frame.", new Object[0]);
                    }
                    u uVar = this.f304726c;
                    if (uVar != null) {
                        uVar.i();
                    }
                } catch (Throwable th2) {
                    this.f304724a.getLogger().a(y7.ERROR, "Failed to capture a frame", th2);
                }
                if (this.f304724a.getSessionReplay().o()) {
                    ILogger logger = this.f304724a.getLogger();
                    y7 y7Var = y7.DEBUG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Posting the capture runnable again, frame rate is ");
                    w wVar = this.f304727d;
                    sb2.append(wVar != null ? wVar.j() : 1);
                    sb2.append(" fps.");
                    logger.c(y7Var, sb2.toString(), new Object[0]);
                }
                io.sentry.android.replay.util.j jVar = this.f304725b;
                w wVar2 = this.f304727d;
                if (!jVar.c(this, 1000 / ((long) (wVar2 != null ? wVar2.j() : 1)))) {
                    this.f304724a.getLogger().c(y7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                }
            } else if (this.f304724a.getSessionReplay().o()) {
                this.f304724a.getLogger().c(y7.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f304730b;

        c(View view) {
            this.f304730b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) c0.this.f304719g);
            if (!Intrinsics.areEqual(this.f304730b, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.r.i(this.f304730b, this);
                return true;
            }
            if (io.sentry.android.replay.util.r.e(this.f304730b)) {
                io.sentry.android.replay.util.r.i(this.f304730b, this);
                if (this.f304730b.getWidth() != c0.this.f304720h.x && this.f304730b.getHeight() != c0.this.f304720h.y) {
                    c0.this.f304720h.set(this.f304730b.getWidth(), this.f304730b.getHeight());
                    c0.this.f304715c.j(this.f304730b.getWidth(), this.f304730b.getHeight());
                }
            }
            return true;
        }
    }

    static final class d extends l0 implements Function1<WeakReference<View>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f304731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(1);
            this.f304731a = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<View> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f304731a));
        }
    }

    public c0(@NotNull n8 options, @Nullable v vVar, @NotNull a0 windowCallback, @NotNull io.sentry.android.replay.util.j mainLooperHandler, @NotNull ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f304713a = options;
        this.f304714b = vVar;
        this.f304715c = windowCallback;
        this.f304716d = mainLooperHandler;
        this.f304717e = replayExecutor;
        this.f304718f = new AtomicBoolean(false);
        this.f304719g = new ArrayList<>();
        this.f304720h = new Point();
        this.f304721i = new io.sentry.util.a();
        this.f304722j = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.f
    public void a(@NotNull View root, boolean z10) throws Exception {
        u uVarB;
        u uVarB2;
        u uVarB3;
        Intrinsics.checkNotNullParameter(root, "root");
        m1 m1VarA = this.f304721i.a();
        try {
            if (z10) {
                this.f304719g.add(new WeakReference<>(root));
                a aVar = this.f304723k;
                if (aVar != null && (uVarB3 = aVar.b()) != null) {
                    uVarB3.h(root);
                }
                e(root);
            } else {
                a aVar2 = this.f304723k;
                if (aVar2 != null && (uVarB2 = aVar2.b()) != null) {
                    uVarB2.w(root);
                }
                CollectionsKt.removeAll((List) this.f304719g, (Function1) new d(root));
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f304719g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    a aVar3 = this.f304723k;
                    if (aVar3 != null && (uVarB = aVar3.b()) != null) {
                        uVarB.h(view);
                    }
                    e(view);
                }
            }
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        reset();
        this.f304716d.d(this.f304723k);
        stop();
    }

    public final void e(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!io.sentry.android.replay.util.r.e(root)) {
            io.sentry.android.replay.util.r.b(root, new c(root));
            return;
        }
        if (root.getWidth() != this.f304720h.x) {
            int height = root.getHeight();
            Point point = this.f304720h;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.f304715c.j(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.h
    public void p() {
        a aVar = this.f304723k;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // io.sentry.android.replay.h
    public void pause() {
        a aVar = this.f304723k;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // io.sentry.android.replay.h
    public void reset() throws Exception {
        u uVarB;
        this.f304720h.set(0, 0);
        m1 m1VarA = this.f304721i.a();
        try {
            Iterator<T> it = this.f304719g.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a aVar = this.f304723k;
                if (aVar != null && (uVarB = aVar.b()) != null) {
                    uVarB.w((View) weakReference.get());
                }
            }
            this.f304719g.clear();
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.h
    public void start() {
        this.f304718f.getAndSet(true);
    }

    @Override // io.sentry.android.replay.h
    public void stop() throws Exception {
        a aVar = this.f304723k;
        if (aVar != null) {
            aVar.g();
        }
        m1 m1VarA = this.f304722j.a();
        try {
            this.f304723k = null;
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
            this.f304718f.set(false);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.h
    public void v0(@NotNull w config) throws Exception {
        a aVar;
        u uVarB;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f304718f.get()) {
            if (this.f304723k == null) {
                m1 m1VarA = this.f304722j.a();
                try {
                    if (this.f304723k == null) {
                        this.f304723k = new a(this.f304713a, this.f304716d);
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.jdk7.a.c(m1VarA, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.jdk7.a.c(m1VarA, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.f304723k;
            if (aVar2 != null) {
                aVar2.e(config);
            }
            a aVar3 = this.f304723k;
            if (aVar3 != null) {
                aVar3.f(new u(config, this.f304713a, this.f304716d, this.f304717e, this.f304714b));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f304719g);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.f304723k) != null && (uVarB = aVar.b()) != null) {
                uVarB.h(view);
            }
            this.f304716d.d(this.f304723k);
            if (!this.f304716d.c(this.f304723k, 100L)) {
                this.f304713a.getLogger().c(y7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
            }
        }
    }

    public /* synthetic */ c0(n8 n8Var, v vVar, a0 a0Var, io.sentry.android.replay.util.j jVar, ScheduledExecutorService scheduledExecutorService, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n8Var, (i10 & 2) != 0 ? null : vVar, a0Var, jVar, scheduledExecutorService);
    }
}
