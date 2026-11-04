package io.ktor.client.engine;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.util.a0;
import io.ktor.utils.io.o0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f294334d = AtomicIntegerFieldUpdater.newUpdater(f.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f294335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f294336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f294337c;

    @NotNull
    private volatile /* synthetic */ int closed;

    public f(@NotNull String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.f294335a = engineName;
        this.closed = 0;
        this.f294336b = g0.c(new Function0() { // from class: io.ktor.client.engine.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.j(this.f294332a);
            }
        });
        this.f294337c = g0.c(new Function0() { // from class: io.ktor.client.engine.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.f(this.f294333a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(f fVar) {
        return a0.b(null, 1, null).plus(fVar.We()).plus(new r0(fVar.f294335a + "-context"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 j(f fVar) {
        n0 n0VarA = fVar.getConfig().a();
        if (n0VarA == null) {
            n0VarA = g.a();
        }
        return n0VarA;
    }

    @Override // io.ktor.client.engine.b
    @NotNull
    public n0 We() {
        return (n0) this.f294336b.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f294334d.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(p2.M2);
            kotlinx.coroutines.a0 a0Var = element instanceof kotlinx.coroutines.a0 ? (kotlinx.coroutines.a0) element : null;
            if (a0Var != null) {
                a0Var.complete();
            }
        }
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.f294337c.getValue();
    }

    @Override // io.ktor.client.engine.b
    @NotNull
    public Set<h<?>> l6() {
        return b.a.g(this);
    }

    @Override // io.ktor.client.engine.b
    @o0
    public void u8(@NotNull io.ktor.client.c cVar) {
        b.a.h(this, cVar);
    }
}
