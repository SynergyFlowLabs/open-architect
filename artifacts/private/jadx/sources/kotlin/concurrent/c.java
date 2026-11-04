package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.a1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "TimersKt")
public final class c {

    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<TimerTask, Unit> f312436a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super TimerTask, Unit> function1) {
            this.f312436a = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f312436a.invoke(this);
        }
    }

    @f
    private static final Timer a(String str, boolean z10, long j10, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    @f
    private static final Timer b(String str, boolean z10, Date startAt, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    static /* synthetic */ Timer c(String str, boolean z10, long j10, long j11, Function1 action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), j10, j11);
        return timerK;
    }

    static /* synthetic */ Timer d(String str, boolean z10, Date startAt, long j10, Function1 action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.scheduleAtFixedRate(new a(action), startAt, j10);
        return timerK;
    }

    @f
    private static final TimerTask e(Timer timer, long j10, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10, j11);
        return aVar;
    }

    @f
    private static final TimerTask f(Timer timer, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j10);
        return aVar;
    }

    @f
    private static final TimerTask g(Timer timer, Date time, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j10);
        return aVar;
    }

    @f
    private static final TimerTask h(Timer timer, Date time, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    private static final TimerTask i(Timer timer, long j10, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j10, j11);
        return aVar;
    }

    @f
    private static final TimerTask j(Timer timer, Date time, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(timer, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j10);
        return aVar;
    }

    @a1
    @NotNull
    public static final Timer k(@Nullable String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }

    @f
    private static final Timer l(String str, boolean z10, long j10, long j11, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    @f
    private static final Timer m(String str, boolean z10, Date startAt, long j10, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    static /* synthetic */ Timer n(String str, boolean z10, long j10, long j11, Function1 action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), j10, j11);
        return timerK;
    }

    static /* synthetic */ Timer o(String str, boolean z10, Date startAt, long j10, Function1 action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timerK = k(str, z10);
        timerK.schedule(new a(action), startAt, j10);
        return timerK;
    }

    @f
    private static final TimerTask p(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new a(action);
    }
}
