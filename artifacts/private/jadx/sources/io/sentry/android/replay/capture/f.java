package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.util.n;
import io.sentry.android.replay.w;
import io.sentry.g1;
import io.sentry.i1;
import io.sentry.n8;
import io.sentry.o8;
import io.sentry.protocol.v;
import io.sentry.transport.p;
import io.sentry.util.c0;
import io.sentry.v4;
import io.sentry.y7;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e.b(26)
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBufferCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferCaptureStrategy.kt\nio/sentry/android/replay/capture/BufferCaptureStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1864#2,3:245\n*S KotlinDebug\n*F\n+ 1 BufferCaptureStrategy.kt\nio/sentry/android/replay/capture/BufferCaptureStrategy\n*L\n205#1:245,3\n*E\n"})
public final class f extends io.sentry.android.replay.capture.a {

    @NotNull
    public static final a B = new a(null);
    public static final int C = 8;

    @NotNull
    private static final String D = "BufferCaptureStrategy";
    private static final long E = 100;

    @NotNull
    private final List<h.c.a> A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n8 f304842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private final i1 f304843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final p f304844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final c0 f304845z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function1<h.c, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Date, Unit> f304847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Date, Unit> function1) {
            super(1);
            this.f304847b = function1;
        }

        public final void c(h.c segment) throws InterruptedException {
            Intrinsics.checkNotNullParameter(segment, "segment");
            f fVar = f.this;
            fVar.R(fVar.A);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f304843x, null, 2, null);
                Function1<Date, Unit> function1 = this.f304847b;
                Date dateS0 = aVar.h().s0();
                Intrinsics.checkNotNullExpressionValue(dateS0, "getTimestamp(...)");
                function1.invoke(dateS0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) throws InterruptedException {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class c extends l0 implements Function1<h.c, Unit> {
        c() {
            super(1);
        }

        public final void c(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.A.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class d extends l0 implements Function1<h.c, Unit> {
        d() {
            super(1);
        }

        public final void c(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.A.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class e extends l0 implements Function1<h.c.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f304850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f304851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.a f304852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, f fVar, kotlin.jvm.internal.i1.a aVar) {
            super(1);
            this.f304850a = j10;
            this.f304851b = fVar;
            this.f304852c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.h().s0().getTime() >= this.f304850a) {
                return Boolean.FALSE;
            }
            f fVar = this.f304851b;
            fVar.c(fVar.d() - 1);
            this.f304851b.V(it.h().w0());
            this.f304852c.f312744a = true;
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ f(n8 n8Var, i1 i1Var, p pVar, c0 c0Var, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n8Var, i1Var, pVar, c0Var, scheduledExecutorService, (i10 & 32) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(List<h.c.a> list) throws InterruptedException {
        h.c.a aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f304843x, null, 2, null);
            aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
            Thread.sleep(E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(f fVar, g1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.A(fVar.i());
    }

    private final void T(String str, final Function1<? super h.c, Unit> function1) {
        final Date dateE;
        Long lO;
        final w wVarX = x();
        if (wVarX == null) {
            int i10 = 7 ^ 0;
            this.f304842w.getLogger().c(y7.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jC = this.f304842w.getSessionReplay().c();
        long jA = this.f304844y.a();
        io.sentry.android.replay.j jVarU = u();
        if (jVarU == null || (lO = jVarU.o()) == null || (dateE = io.sentry.p.e(lO.longValue())) == null) {
            dateE = io.sentry.p.e(jA - jC);
        }
        Intrinsics.checkNotNull(dateE);
        final long time = jA - dateE.getTime();
        final v vVarI = i();
        io.sentry.android.replay.util.h.h(y(), this.f304842w, "BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.U(this.f304830a, time, dateE, vVarI, wVarX, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(f fVar, long j10, Date date, v vVar, w wVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.t(fVar, j10, date, vVar, fVar.d(), wVar.k(), wVar.l(), wVar.j(), wVar.i(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f304842w.getLogger().c(y7.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f304842w.getLogger().b(y7.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(f fVar, Function2 function2, long j10) {
        io.sentry.android.replay.j jVarU = fVar.u();
        if (jVarU != null) {
            function2.invoke(jVarU, Long.valueOf(j10));
        }
        long jA = fVar.f304844y.a() - fVar.f304842w.getSessionReplay().c();
        io.sentry.android.replay.j jVarU2 = fVar.u();
        fVar.I(jVarU2 != null ? jVarU2.y(jA) : null);
        fVar.X(fVar.A, jA);
    }

    private final void X(List<h.c.a> list, long j10) {
        kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
        CollectionsKt.removeAll((List) list, (Function1) new e(j10, this, aVar));
        if (aVar.f312744a) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((h.c.a) obj).i(i10);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(File file, f fVar) {
        io.sentry.util.i.a(file);
        fVar.c(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void a(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.a(event);
        h.a.h(h.f304854a, v(), this.f304844y.a() - this.f304842w.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(@Nullable Bitmap bitmap, @NotNull final Function2<? super io.sentry.android.replay.j, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long jA = this.f304844y.a();
        io.sentry.android.replay.util.h.h(y(), this.f304842w, "BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.c
            @Override // java.lang.Runnable
            public final void run() {
                f.W(this.f304836a, store, jA);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.h
    @NotNull
    public h f() {
        if (B().get()) {
            this.f304842w.getLogger().c(y7.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f304842w, this.f304843x, this.f304844y, y(), null, 16, null);
        mVar.H(x());
        mVar.g(d(), i(), o8.c.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean z10, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!n.a(this.f304845z, this.f304842w.getSessionReplay().g())) {
            this.f304842w.getLogger().c(y7.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        i1 i1Var = this.f304843x;
        if (i1Var != null) {
            i1Var.v0(new v4() { // from class: io.sentry.android.replay.capture.d
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    f.S(this.f304839a, g1Var);
                }
            });
        }
        if (!z10) {
            T("capture_replay", new b(onSegmentSent));
        } else {
            B().set(true);
            this.f304842w.getLogger().c(y7.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        T("pause", new d());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.j jVarU = u();
        final File fileT = jVarU != null ? jVarU.t() : null;
        io.sentry.android.replay.util.h.h(y(), this.f304842w, "BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.Y(fileT, this);
            }
        });
        super.stop();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void v0(@NotNull w recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        T("configuration_changed", new c());
        super.v0(recorderConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull n8 options, @Nullable i1 i1Var, @NotNull p dateProvider, @NotNull c0 random, @NotNull ScheduledExecutorService executor, @Nullable Function1<? super v, io.sentry.android.replay.j> function1) {
        super(options, i1Var, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f304842w = options;
        this.f304843x = i1Var;
        this.f304844y = dateProvider;
        this.f304845z = random;
        this.A = new ArrayList();
    }
}
