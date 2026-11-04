package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import io.sentry.d3;
import io.sentry.g1;
import io.sentry.i1;
import io.sentry.l1;
import io.sentry.m1;
import io.sentry.n0;
import io.sentry.n4;
import io.sentry.n8;
import io.sentry.o4;
import io.sentry.p8;
import io.sentry.u0;
import io.sentry.v4;
import io.sentry.w7;
import io.sentry.x1;
import io.sentry.y7;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nReplayIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,513:1\n13309#2,2:514\n*S KotlinDebug\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n*L\n404#1:514,2\n*E\n"})
public final class ReplayIntegration implements x1, Closeable, v, io.sentry.android.replay.gestures.c, o4, u0.b, io.sentry.transport.a0.b, a0 {

    @NotNull
    private static final a Z = new a(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f304656p0 = 8;

    @NotNull
    private final io.sentry.util.a X;

    @NotNull
    private final n Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.p f304658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function0<io.sentry.android.replay.h> f304659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<io.sentry.protocol.v, j> f304660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f304661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n8 f304662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private i1 f304663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private io.sentry.android.replay.h f304664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private io.sentry.android.replay.gestures.a f304665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final f0 f304666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f304667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f0 f304668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private io.sentry.android.replay.capture.h f304671o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private n4 f304672s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Function1<? super Boolean, ? extends io.sentry.android.replay.capture.h> f304673t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private io.sentry.android.replay.util.j f304674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function0<io.sentry.android.replay.gestures.a> f304675w;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean e() {
            return false;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f304676a;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i10 = this.f304676a;
            this.f304676a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static final class d extends l0 implements Function1<Date, Unit> {
        d() {
            super(1);
        }

        public final void c(Date newTimestamp) {
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.f304671o;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.f304671o;
                Integer numValueOf = hVar2 != null ? Integer.valueOf(hVar2.d()) : null;
                Intrinsics.checkNotNull(numValueOf);
                hVar.c(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.f304671o;
            if (hVar3 == null) {
                return;
            }
            hVar3.m(newTimestamp);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Date date) {
            c(date);
            return Unit.f312394a;
        }
    }

    static final class e extends l0 implements Function2<j, Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f304678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<String> f304679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReplayIntegration f304680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, kotlin.jvm.internal.i1.h<String> hVar, ReplayIntegration replayIntegration) {
            super(2);
            this.f304678a = bitmap;
            this.f304679b = hVar;
            this.f304680c = replayIntegration;
        }

        public final void c(j onScreenshotRecorded, long j10) throws Exception {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.f(this.f304678a, j10, this.f304679b.f312751a);
            this.f304680c.I();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(j jVar, Long l10) throws Exception {
            c(jVar, l10.longValue());
            return Unit.f312394a;
        }
    }

    static final class f extends l0 implements Function2<j, Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f304681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f304682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReplayIntegration f304683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, long j10, ReplayIntegration replayIntegration) {
            super(2);
            this.f304681a = file;
            this.f304682b = j10;
            this.f304683c = replayIntegration;
        }

        public final void c(j onScreenshotRecorded, long j10) throws Exception {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            j.e(onScreenshotRecorded, this.f304681a, this.f304682b, null, 4, null);
            this.f304683c.I();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(j jVar, Long l10) throws Exception {
            c(jVar, l10.longValue());
            return Unit.f312394a;
        }
    }

    static final class g extends l0 implements Function0<io.sentry.util.c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f304684a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final io.sentry.util.c0 invoke() {
            return new io.sentry.util.c0();
        }
    }

    static final class h extends l0 implements Function0<ScheduledExecutorService> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f304685a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor(new c());
        }
    }

    static final class i extends l0 implements Function0<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f304686a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return q.f304958e.b();
        }
    }

    static {
        w7.e().b("maven:io.sentry:sentry-android-replay", "8.23.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(@NotNull Context context, @NotNull io.sentry.transport.p dateProvider, @Nullable Function0<? extends io.sentry.android.replay.h> function0, @Nullable Function1<? super io.sentry.protocol.v, j> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f304657a = context;
        this.f304658b = dateProvider;
        this.f304659c = function0;
        this.f304660d = function1;
        this.f304666j = g0.c(g.f304684a);
        this.f304667k = g0.c(i.f304686a);
        this.f304668l = g0.c(h.f304685a);
        this.f304669m = new AtomicBoolean(false);
        this.f304670n = new AtomicBoolean(false);
        d3 d3VarB = d3.b();
        Intrinsics.checkNotNullExpressionValue(d3VarB, "getInstance(...)");
        this.f304672s = d3VarB;
        this.f304674v = new io.sentry.android.replay.util.j(null, 1, null);
        this.X = new io.sentry.util.a();
        this.Y = new n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() throws Exception {
        i1 i1Var;
        i1 i1Var2;
        io.sentry.transport.a0 a0VarI0;
        io.sentry.transport.a0 a0VarI1;
        if (this.f304671o instanceof io.sentry.android.replay.capture.m) {
            n8 n8Var = this.f304662f;
            if (n8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                n8Var = null;
            }
            if (n8Var.getConnectionStatusProvider().L3() != u0.a.DISCONNECTED && (((i1Var = this.f304663g) == null || (a0VarI1 = i1Var.i0()) == null || !a0VarI1.j(io.sentry.o.All)) && ((i1Var2 = this.f304663g) == null || (a0VarI0 = i1Var2.i0()) == null || !a0VarI0.j(io.sentry.o.Replay)))) {
                return;
            }
            r0();
        }
    }

    private final void N(String str) {
        File[] fileArrListFiles;
        n8 n8Var = this.f304662f;
        if (n8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
            n8Var = null;
        }
        String cacheDirPath = n8Var.getCacheDirPath();
        if (cacheDirPath != null && (fileArrListFiles = new File(cacheDirPath).listFiles()) != null) {
            Intrinsics.checkNotNull(fileArrListFiles);
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNull(name);
                if (StringsKt.u2(name, "replay_", false, 2, null)) {
                    String string = t().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    if (!StringsKt.V2(name, string, false, 2, null) && (StringsKt.w3(str) || !StringsKt.V2(name, str, false, 2, null))) {
                        io.sentry.util.i.a(file);
                    }
                }
            }
        }
    }

    static /* synthetic */ void R(ReplayIntegration replayIntegration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        replayIntegration.N(str);
    }

    private final void T() {
        n8 n8Var = this.f304662f;
        n8 n8Var2 = null;
        if (n8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
            n8Var = null;
        }
        l1 executorService = n8Var.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        n8 n8Var3 = this.f304662f;
        if (n8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
        } else {
            n8Var2 = n8Var3;
        }
        io.sentry.android.replay.util.h.g(executorService, n8Var2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.l
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ReplayIntegration.X(this.f304952a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(ReplayIntegration replayIntegration) throws IOException {
        n8 n8Var;
        n8 n8Var2 = replayIntegration.f304662f;
        if (n8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
            n8Var2 = null;
        }
        io.sentry.cache.w wVarFindPersistingScopeObserver = n8Var2.findPersistingScopeObserver();
        if (wVarFindPersistingScopeObserver != null) {
            n8 n8Var3 = replayIntegration.f304662f;
            if (n8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                n8Var3 = null;
            }
            String str = (String) wVarFindPersistingScopeObserver.H(n8Var3, io.sentry.cache.w.f305267o, String.class);
            if (str != null) {
                io.sentry.protocol.v vVar = new io.sentry.protocol.v(str);
                if (Intrinsics.areEqual(vVar, io.sentry.protocol.v.f306474b)) {
                    R(replayIntegration, null, 1, null);
                    return;
                }
                j.a aVar = j.f304921l;
                n8 n8Var4 = replayIntegration.f304662f;
                if (n8Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                    n8Var4 = null;
                }
                io.sentry.android.replay.d dVarC = aVar.c(n8Var4, vVar, replayIntegration.f304660d);
                if (dVarC == null) {
                    R(replayIntegration, null, 1, null);
                    return;
                }
                n8 n8Var5 = replayIntegration.f304662f;
                if (n8Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                    n8Var5 = null;
                }
                Object objH = wVarFindPersistingScopeObserver.H(n8Var5, io.sentry.cache.w.f305258f, List.class);
                List<io.sentry.f> list = objH instanceof List ? (List) objH : null;
                io.sentry.android.replay.capture.h.a aVar2 = io.sentry.android.replay.capture.h.f304854a;
                i1 i1Var = replayIntegration.f304663g;
                n8 n8Var6 = replayIntegration.f304662f;
                if (n8Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                    n8Var = null;
                } else {
                    n8Var = n8Var6;
                }
                io.sentry.android.replay.capture.h.c cVarC = aVar2.c(i1Var, n8Var, dVarC.l(), dVarC.r(), vVar, dVarC.n(), dVarC.o().k(), dVarC.o().l(), dVarC.p(), dVarC.k(), dVarC.o().j(), dVarC.o().i(), dVarC.q(), list, new LinkedList(dVarC.m()));
                if (cVarC instanceof io.sentry.android.replay.capture.h.c.a) {
                    n0 n0VarE = io.sentry.util.n.e(new b());
                    i1 i1Var2 = replayIntegration.f304663g;
                    Intrinsics.checkNotNull(n0VarE);
                    ((io.sentry.android.replay.capture.h.c.a) cVarC).a(i1Var2, n0VarE);
                }
                replayIntegration.N(str);
                return;
            }
        }
        R(replayIntegration, null, 1, null);
    }

    private final io.sentry.util.c0 Y() {
        return (io.sentry.util.c0) this.f304666j.getValue();
    }

    private final ScheduledExecutorService f0() {
        return (ScheduledExecutorService) this.f304668l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o0(kotlin.jvm.internal.i1.h hVar, g1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strY = it.Y();
        hVar.f312751a = strY != null ? StringsKt.s5(strY, '.', null, 2, null) : 0;
    }

    private final void r0() throws Exception {
        m1 m1VarA = this.X.a();
        try {
            if (this.f304669m.get()) {
                n nVar = this.Y;
                o oVar = o.PAUSED;
                if (nVar.b(oVar)) {
                    io.sentry.android.replay.h hVar = this.f304664h;
                    if (hVar != null) {
                        hVar.pause();
                    }
                    io.sentry.android.replay.capture.h hVar2 = this.f304671o;
                    if (hVar2 != null) {
                        hVar2.pause();
                    }
                    this.Y.d(oVar);
                    Unit unit = Unit.f312394a;
                    kotlin.jdk7.a.c(m1VarA, null);
                    return;
                }
            }
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

    private final void w0() {
        if (this.f304664h instanceof io.sentry.android.replay.f) {
            CopyOnWriteArrayList<io.sentry.android.replay.f> copyOnWriteArrayListD = g0().d();
            io.sentry.android.replay.h hVar = this.f304664h;
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListD.add((io.sentry.android.replay.f) hVar);
        }
        g0().d().add(this.f304665i);
    }

    private final void x0() throws Exception {
        i1 i1Var;
        i1 i1Var2;
        io.sentry.transport.a0 a0VarI0;
        io.sentry.transport.a0 a0VarI1;
        m1 m1VarA = this.X.a();
        try {
            if (this.f304669m.get()) {
                n nVar = this.Y;
                o oVar = o.RESUMED;
                if (nVar.b(oVar)) {
                    if (!this.f304670n.get()) {
                        n8 n8Var = this.f304662f;
                        if (n8Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                            n8Var = null;
                        }
                        if (n8Var.getConnectionStatusProvider().L3() != u0.a.DISCONNECTED && (((i1Var = this.f304663g) == null || (a0VarI1 = i1Var.i0()) == null || !a0VarI1.j(io.sentry.o.All)) && ((i1Var2 = this.f304663g) == null || (a0VarI0 = i1Var2.i0()) == null || !a0VarI0.j(io.sentry.o.Replay)))) {
                            this.Y.d(oVar);
                            io.sentry.android.replay.capture.h hVar = this.f304671o;
                            if (hVar != null) {
                                hVar.p();
                            }
                            io.sentry.android.replay.h hVar2 = this.f304664h;
                            if (hVar2 != null) {
                                hVar2.p();
                                Unit unit = Unit.f312394a;
                            }
                            kotlin.jdk7.a.c(m1VarA, null);
                            return;
                        }
                    }
                    kotlin.jdk7.a.c(m1VarA, null);
                    return;
                }
            }
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

    private final void y0() {
        if (this.f304664h instanceof io.sentry.android.replay.f) {
            CopyOnWriteArrayList<io.sentry.android.replay.f> copyOnWriteArrayListD = g0().d();
            io.sentry.android.replay.h hVar = this.f304664h;
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListD.remove((io.sentry.android.replay.f) hVar);
        }
        g0().d().remove(this.f304665i);
    }

    @Override // io.sentry.android.replay.gestures.c
    public void a(@NotNull MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f304669m.get() && this.Y.c() && (hVar = this.f304671o) != null) {
            hVar.a(event);
        }
    }

    @Override // io.sentry.android.replay.v
    public void b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        i1 i1Var = this.f304663g;
        if (i1Var != null) {
            i1Var.v0(new v4() { // from class: io.sentry.android.replay.m
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    ReplayIntegration.o0(hVar, g1Var);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar2 = this.f304671o;
        if (hVar2 != null) {
            hVar2.e(bitmap, new e(bitmap, hVar, this));
        }
    }

    @Override // io.sentry.x1
    public void c(@NotNull i1 scopes, @NotNull n8 options) {
        ReplayIntegration replayIntegration;
        n8 n8Var;
        io.sentry.android.replay.h c0Var;
        io.sentry.android.replay.gestures.a aVar;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f304662f = options;
        if (!options.getSessionReplay().p() && !options.getSessionReplay().q()) {
            options.getLogger().c(y7.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f304663g = scopes;
        Function0<io.sentry.android.replay.h> function0 = this.f304659c;
        if (function0 == null || (c0Var = function0.invoke()) == null) {
            io.sentry.android.replay.util.j jVar = this.f304674v;
            ScheduledExecutorService scheduledExecutorServiceF0 = f0();
            Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceF0, "<get-replayExecutor>(...)");
            replayIntegration = this;
            n8Var = options;
            c0Var = new c0(n8Var, replayIntegration, this, jVar, scheduledExecutorServiceF0);
        } else {
            replayIntegration = this;
            n8Var = options;
        }
        replayIntegration.f304664h = c0Var;
        Function0<io.sentry.android.replay.gestures.a> function1 = replayIntegration.f304675w;
        if (function1 == null || (aVar = function1.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(n8Var, replayIntegration);
        }
        replayIntegration.f304665i = aVar;
        replayIntegration.f304669m.set(true);
        n8Var.getConnectionStatusProvider().Pd(replayIntegration);
        io.sentry.transport.a0 a0VarI0 = scopes.i0();
        if (a0VarI0 != null) {
            a0VarI0.e(replayIntegration);
        }
        io.sentry.util.q.a("Replay");
        replayIntegration.T();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        io.sentry.transport.a0 a0VarI0;
        m1 m1VarA = this.X.a();
        try {
            if (this.f304669m.get()) {
                n nVar = this.Y;
                o oVar = o.CLOSED;
                if (nVar.b(oVar)) {
                    n8 n8Var = this.f304662f;
                    if (n8Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                        n8Var = null;
                    }
                    n8Var.getConnectionStatusProvider().T7(this);
                    i1 i1Var = this.f304663g;
                    if (i1Var != null && (a0VarI0 = i1Var.i0()) != null) {
                        a0VarI0.t(this);
                    }
                    stop();
                    io.sentry.android.replay.h hVar = this.f304664h;
                    if (hVar != null) {
                        hVar.close();
                    }
                    this.f304664h = null;
                    g0().close();
                    ScheduledExecutorService scheduledExecutorServiceF0 = f0();
                    Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceF0, "<get-replayExecutor>(...)");
                    n8 n8Var2 = this.f304662f;
                    if (n8Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                        n8Var2 = null;
                    }
                    io.sentry.android.replay.util.h.d(scheduledExecutorServiceF0, n8Var2);
                    this.Y.d(oVar);
                    Unit unit = Unit.f312394a;
                    kotlin.jdk7.a.c(m1VarA, null);
                    return;
                }
            }
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

    @Override // io.sentry.f1
    public void d() {
        this.f304661e = false;
    }

    @Nullable
    public final File d0() {
        io.sentry.android.replay.capture.h hVar = this.f304671o;
        if (hVar != null) {
            return hVar.n();
        }
        return null;
    }

    @Override // io.sentry.o4
    public void e(@NotNull n4 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f304672s = converter;
    }

    @Override // io.sentry.o4
    public boolean f() {
        return this.f304661e;
    }

    @Override // io.sentry.f1
    public void g() {
        this.f304661e = true;
    }

    @NotNull
    public final q g0() {
        return (q) this.f304667k.getValue();
    }

    @Override // io.sentry.u0.b
    public void h(@NotNull u0.a status) throws Exception {
        Intrinsics.checkNotNullParameter(status, "status");
        if (this.f304671o instanceof io.sentry.android.replay.capture.m) {
            if (status == u0.a.DISCONNECTED) {
                r0();
            } else {
                x0();
            }
        }
    }

    @Override // io.sentry.android.replay.a0
    public void j(int i10, int i11) {
        if (this.f304669m.get() && m()) {
            n8 n8Var = this.f304662f;
            n8 n8Var2 = null;
            if (n8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                n8Var = null;
            }
            if (n8Var.getSessionReplay().r()) {
                w.a aVar = w.f305103g;
                Context context = this.f304657a;
                n8 n8Var3 = this.f304662f;
                if (n8Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                } else {
                    n8Var2 = n8Var3;
                }
                p8 sessionReplay = n8Var2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                v0(aVar.b(context, sessionReplay, i10, i11));
            }
        }
    }

    @NotNull
    public final AtomicBoolean j0() {
        return this.f304669m;
    }

    @NotNull
    public final AtomicBoolean k0() {
        return this.f304670n;
    }

    @Override // io.sentry.o4
    public void l(@Nullable Boolean bool) {
        if (this.f304669m.get() && m()) {
            io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
            io.sentry.android.replay.capture.h hVar = this.f304671o;
            n8 n8Var = null;
            if (vVar.equals(hVar != null ? hVar.i() : null)) {
                n8 n8Var2 = this.f304662f;
                if (n8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                } else {
                    n8Var = n8Var2;
                }
                n8Var.getLogger().c(y7.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.f304671o;
            if (hVar2 != null) {
                hVar2.k(Intrinsics.areEqual(bool, Boolean.TRUE), new d());
            }
            io.sentry.android.replay.capture.h hVar3 = this.f304671o;
            this.f304671o = hVar3 != null ? hVar3.f() : null;
        }
    }

    @Override // io.sentry.o4
    public boolean m() {
        return this.Y.a().compareTo(o.STARTED) >= 0 && this.Y.a().compareTo(o.STOPPED) < 0;
    }

    @Override // io.sentry.transport.a0.b
    public void o(@NotNull io.sentry.transport.a0 rateLimiter) throws Exception {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.f304671o instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.j(io.sentry.o.All) || rateLimiter.j(io.sentry.o.Replay)) {
                r0();
            } else {
                x0();
            }
        }
    }

    @Override // io.sentry.o4
    public void p() throws Exception {
        this.f304670n.set(false);
        x0();
    }

    @Override // io.sentry.o4
    public void pause() throws Exception {
        this.f304670n.set(true);
        r0();
    }

    @Override // io.sentry.android.replay.v
    public void q(@NotNull File screenshot, long j10) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        io.sentry.android.replay.capture.h hVar = this.f304671o;
        if (hVar != null) {
            int i10 = 7 >> 0;
            io.sentry.android.replay.capture.h.b.b(hVar, null, new f(screenshot, j10, this), 1, null);
        }
    }

    @Override // io.sentry.o4
    @NotNull
    public n4 r() {
        return this.f304672s;
    }

    @Override // io.sentry.o4
    public void start() throws Exception {
        io.sentry.android.replay.capture.h fVar;
        n8 n8Var;
        m1 m1VarA = this.X.a();
        try {
            if (!this.f304669m.get()) {
                kotlin.jdk7.a.c(m1VarA, null);
                return;
            }
            n nVar = this.Y;
            o oVar = o.STARTED;
            if (!nVar.b(oVar)) {
                n8 n8Var2 = this.f304662f;
                if (n8Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                    n8Var2 = null;
                }
                n8Var2.getLogger().c(y7.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                kotlin.jdk7.a.c(m1VarA, null);
                return;
            }
            io.sentry.util.c0 c0VarY = Y();
            n8 n8Var3 = this.f304662f;
            if (n8Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                n8Var3 = null;
            }
            boolean zA = io.sentry.android.replay.util.n.a(c0VarY, n8Var3.getSessionReplay().k());
            if (!zA) {
                n8 n8Var4 = this.f304662f;
                if (n8Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                    n8Var4 = null;
                }
                if (!n8Var4.getSessionReplay().q()) {
                    n8 n8Var5 = this.f304662f;
                    if (n8Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                        n8Var5 = null;
                    }
                    n8Var5.getLogger().c(y7.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    kotlin.jdk7.a.c(m1VarA, null);
                    return;
                }
            }
            this.Y.d(oVar);
            Function1<? super Boolean, ? extends io.sentry.android.replay.capture.h> function1 = this.f304673t;
            if (function1 == null || (fVar = function1.invoke(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    n8 n8Var6 = this.f304662f;
                    if (n8Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                        n8Var = null;
                    } else {
                        n8Var = n8Var6;
                    }
                    i1 i1Var = this.f304663g;
                    io.sentry.transport.p pVar = this.f304658b;
                    ScheduledExecutorService scheduledExecutorServiceF0 = f0();
                    Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceF0, "<get-replayExecutor>(...)");
                    fVar = new io.sentry.android.replay.capture.m(n8Var, i1Var, pVar, scheduledExecutorServiceF0, this.f304660d);
                } else {
                    n8 n8Var7 = this.f304662f;
                    if (n8Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.rrweb.h.f306695g);
                        n8Var7 = null;
                    }
                    i1 i1Var2 = this.f304663g;
                    io.sentry.transport.p pVar2 = this.f304658b;
                    io.sentry.util.c0 c0VarY2 = Y();
                    ScheduledExecutorService scheduledExecutorServiceF1 = f0();
                    Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceF1, "<get-replayExecutor>(...)");
                    fVar = new io.sentry.android.replay.capture.f(n8Var7, i1Var2, pVar2, c0VarY2, scheduledExecutorServiceF1, this.f304660d);
                }
            }
            this.f304671o = fVar;
            io.sentry.android.replay.h hVar = this.f304664h;
            if (hVar != null) {
                hVar.start();
            }
            io.sentry.android.replay.capture.h hVar2 = this.f304671o;
            if (hVar2 != null) {
                io.sentry.android.replay.capture.h.b.c(hVar2, 0, null, null, 7, null);
            }
            w0();
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

    @Override // io.sentry.o4
    public void stop() throws Exception {
        m1 m1VarA = this.X.a();
        try {
            if (this.f304669m.get()) {
                n nVar = this.Y;
                o oVar = o.STOPPED;
                if (nVar.b(oVar)) {
                    y0();
                    io.sentry.android.replay.h hVar = this.f304664h;
                    if (hVar != null) {
                        hVar.reset();
                    }
                    io.sentry.android.replay.h hVar2 = this.f304664h;
                    if (hVar2 != null) {
                        hVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.f304665i;
                    if (aVar != null) {
                        aVar.c();
                    }
                    io.sentry.android.replay.capture.h hVar3 = this.f304671o;
                    if (hVar3 != null) {
                        hVar3.stop();
                    }
                    this.f304671o = null;
                    this.Y.d(oVar);
                    Unit unit = Unit.f312394a;
                    kotlin.jdk7.a.c(m1VarA, null);
                    return;
                }
            }
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

    @Override // io.sentry.o4
    @NotNull
    public io.sentry.protocol.v t() {
        io.sentry.protocol.v vVarI;
        io.sentry.android.replay.capture.h hVar = this.f304671o;
        if (hVar != null && (vVarI = hVar.i()) != null) {
            return vVarI;
        }
        io.sentry.protocol.v EMPTY_ID = io.sentry.protocol.v.f306474b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final void v0(@NotNull w config) {
        io.sentry.android.replay.h hVar;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f304669m.get() && m()) {
            io.sentry.android.replay.capture.h hVar2 = this.f304671o;
            if (hVar2 != null) {
                hVar2.v0(config);
            }
            io.sentry.android.replay.h hVar3 = this.f304664h;
            if (hVar3 != null) {
                hVar3.v0(config);
            }
            if (this.Y.a() != o.PAUSED || (hVar = this.f304664h) == null) {
                return;
            }
            hVar.pause();
        }
    }

    public /* synthetic */ ReplayIntegration(Context context, io.sentry.transport.p pVar, Function0 function0, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pVar, (i10 & 4) != 0 ? null : function0, (i10 & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull io.sentry.transport.p dateProvider) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, io.sentry.transport.p pVar, Function0 function0, Function1 function1, Function1 function2, io.sentry.android.replay.util.j jVar, Function0 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pVar, function0, function1, (i10 & 16) != 0 ? null : function2, (i10 & 32) != 0 ? null : jVar, (i10 & 64) != 0 ? null : function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull io.sentry.transport.p dateProvider, @Nullable Function0<? extends io.sentry.android.replay.h> function0, @Nullable Function1<? super io.sentry.protocol.v, j> function1, @Nullable Function1<? super Boolean, ? extends io.sentry.android.replay.capture.h> function2, @Nullable io.sentry.android.replay.util.j jVar, @Nullable Function0<io.sentry.android.replay.gestures.a> function3) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, function0, function1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f304673t = function2;
        this.f304674v = jVar == null ? new io.sentry.android.replay.util.j(null, 1, null) : jVar;
        this.f304675w = function3;
    }
}
