package io.ktor.utils.io;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f296835c = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.x f296836b;

    @NotNull
    volatile /* synthetic */ Object closed;

    public a1(@NotNull kotlinx.io.o origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.closed = null;
        this.f296836b = kotlinx.io.g.a(origin);
    }

    @o0
    public static /* synthetic */ void b() {
    }

    @Override // io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        androidx.concurrent.futures.b.a(f296835c, this, null, th2 == null ? b0.a() : new a0(th2));
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        i().flush();
        return Unit.f312394a;
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        a0 a0Var = (a0) this.closed;
        if (a0Var != null) {
            return a0.c(a0Var, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        i().flush();
        return !androidx.concurrent.futures.b.a(f296835c, this, null, b0.a()) ? Unit.f312394a : Unit.f312394a;
    }

    @Override // io.ktor.utils.io.p
    public boolean h() {
        return this.closed != null;
    }

    @Override // io.ktor.utils.io.p
    @NotNull
    public kotlinx.io.x i() throws Throwable {
        if (!h()) {
            return this.f296836b;
        }
        Throwable thE = e();
        if (thE == null) {
            throw new IOException("Channel is closed for write");
        }
        throw thE;
    }
}
