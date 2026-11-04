package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.w;
import io.sentry.g1;
import io.sentry.i1;
import io.sentry.n8;
import io.sentry.o8;
import io.sentry.protocol.v;
import io.sentry.transport.p;
import io.sentry.v4;
import io.sentry.y7;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class m extends io.sentry.android.replay.capture.a {

    @NotNull
    private static final String B = "SessionCaptureStrategy";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n8 f304878w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private final i1 f304879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final p f304880y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f304877z = new a(null);
    public static final int A = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function1<h.c, Unit> {
        b() {
            super(1);
        }

        public final void c(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f304879x, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
                m.this.m(aVar.h().s0());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) {
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
                h.c.a.b((h.c.a) segment, m.this.f304879x, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class d extends l0 implements Function1<h.c, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f304884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f304884b = file;
        }

        public final void c(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f304879x, null, 2, null);
            }
            m.this.c(-1);
            io.sentry.util.i.a(this.f304884b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(h.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ m(n8 n8Var, i1 i1Var, p pVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(n8Var, i1Var, pVar, scheduledExecutorService, (i10 & 16) != 0 ? null : function1);
    }

    private final void O(String str, final Function1<? super h.c, Unit> function1) {
        final w wVarX = x();
        if (wVarX == null) {
            this.f304878w.getLogger().c(y7.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jA = this.f304880y.a();
        final Date dateB = b();
        if (dateB == null) {
            return;
        }
        final long time = jA - dateB.getTime();
        final v vVarI = i();
        io.sentry.android.replay.util.h.h(y(), this.f304878w, "SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.P(this.f304866a, time, dateB, vVarI, wVarX, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(m mVar, long j10, Date date, v vVar, w wVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.t(mVar, j10, date, vVar, mVar.d(), wVar.k(), wVar.l(), wVar.j(), wVar.i(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(m mVar, Function2 function2, long j10, w wVar) {
        io.sentry.android.replay.j jVarU = mVar.u();
        if (jVarU != null) {
            function2.invoke(jVarU, Long.valueOf(j10));
        }
        Date dateB = mVar.b();
        if (dateB == null) {
            mVar.f304878w.getLogger().c(y7.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.B().get()) {
            mVar.f304878w.getLogger().c(y7.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (wVar == null) {
            mVar.f304878w.getLogger().c(y7.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long jA = mVar.f304880y.a();
        if (jA - dateB.getTime() >= mVar.f304878w.getSessionReplay().l()) {
            h.c cVarT = io.sentry.android.replay.capture.a.t(mVar, mVar.f304878w.getSessionReplay().l(), dateB, mVar.i(), mVar.d(), wVar.k(), wVar.l(), wVar.j(), wVar.i(), null, null, null, null, null, 7936, null);
            if (cVarT instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVarT;
                h.c.a.b(aVar, mVar.f304879x, null, 2, null);
                mVar.c(mVar.d() + 1);
                mVar.m(aVar.h().s0());
            }
        }
        if (jA - mVar.z().get() >= mVar.f304878w.getSessionReplay().j()) {
            mVar.f304878w.getReplayController().stop();
            mVar.f304878w.getLogger().c(y7.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(m mVar, g1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.A(mVar.i());
        String strY = it.Y();
        mVar.I(strY != null ? StringsKt.s5(strY, '.', null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(g1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.A(v.f306474b);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(@Nullable Bitmap bitmap, @NotNull final Function2<? super io.sentry.android.replay.j, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final w wVarX = x();
        final long jA = this.f304880y.a();
        io.sentry.android.replay.util.h.h(y(), this.f304878w, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.j
            @Override // java.lang.Runnable
            public final void run() {
                m.Q(this.f304872a, store, jA, wVarX);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.h
    @NotNull
    public h f() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void g(int i10, @NotNull v replayId, @Nullable o8.c cVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.g(i10, replayId, cVar);
        i1 i1Var = this.f304879x;
        if (i1Var != null) {
            i1Var.v0(new v4() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    m.R(this.f304876a, g1Var);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean z10, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.f304878w.getSessionReplay().o()) {
            this.f304878w.getLogger().c(y7.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        B().set(z10);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        O("pause", new c());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.j jVarU = u();
        O("stop", new d(jVarU != null ? jVarU.t() : null));
        i1 i1Var = this.f304879x;
        if (i1Var != null) {
            i1Var.v0(new v4() { // from class: io.sentry.android.replay.capture.l
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    m.S(g1Var);
                }
            });
        }
        super.stop();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void v0(@NotNull w recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        O("onConfigurationChanged", new b());
        super.v0(recorderConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull n8 options, @Nullable i1 i1Var, @NotNull p dateProvider, @NotNull ScheduledExecutorService executor, @Nullable Function1<? super v, io.sentry.android.replay.j> function1) {
        super(options, i1Var, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f304878w = options;
        this.f304879x = i1Var;
        this.f304880y = dateProvider;
    }
}
