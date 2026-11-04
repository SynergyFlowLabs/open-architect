package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.r;
import kotlinx.coroutines.internal.c1;
import kotlinx.coroutines.internal.e1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends z1 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f315475c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final n0 f315476d = n0.d0(l.f315495b, e1.e(m1.f315172a, r.u(64, c1.a()), 0, 0, 12, null), null, 2, null);

    private c() {
    }

    @Override // kotlinx.coroutines.z1
    @NotNull
    public Executor M0() {
        return this;
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        return l.f315495b.Y(i10, str);
    }

    @Override // kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        h(kotlin.coroutines.h.f312451a, runnable);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f315476d.h(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @k2
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f315476d.j(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}
