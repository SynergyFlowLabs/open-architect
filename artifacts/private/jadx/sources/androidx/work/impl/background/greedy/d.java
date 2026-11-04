package androidx.work.impl.background.greedy;

import androidx.work.h0;
import androidx.work.impl.a0;
import androidx.work.impl.p0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTimeLimiter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeLimiter.kt\nandroidx/work/impl/background/greedy/TimeLimiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0 f76639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f76640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f76641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f76642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<a0, Runnable> f76643e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public d(@NotNull h0 runnableScheduler, @NotNull p0 launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d this$0, a0 token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        this$0.f76640b.d(token, 3);
    }

    public final void b(@NotNull a0 token) {
        Runnable runnableRemove;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f76642d) {
            runnableRemove = this.f76643e.remove(token);
        }
        if (runnableRemove != null) {
            this.f76639a.a(runnableRemove);
        }
    }

    public final void c(@NotNull final a0 token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Runnable runnable = new Runnable() { // from class: androidx.work.impl.background.greedy.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d(this.f76637a, token);
            }
        };
        synchronized (this.f76642d) {
            this.f76643e.put(token, runnable);
        }
        this.f76639a.b(this.f76641c, runnable);
    }

    @j
    public d(@NotNull h0 runnableScheduler, @NotNull p0 launcher, long j10) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f76639a = runnableScheduler;
        this.f76640b = launcher;
        this.f76641c = j10;
        this.f76642d = new Object();
        this.f76643e = new LinkedHashMap();
    }

    public /* synthetic */ d(h0 h0Var, p0 p0Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, p0Var, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
