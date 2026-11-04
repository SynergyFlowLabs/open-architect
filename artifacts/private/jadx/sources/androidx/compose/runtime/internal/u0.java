package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,154:1\n25#2,5:155\n33#2:160\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n*L\n33#1:155,5\n52#1:160\n*E\n"})
public final class u0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36133d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<y0> f36134a = new AtomicReference<>(v0.f36143a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f36135b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private T f36136c;

    @Nullable
    public final T a() {
        long jA = a1.a();
        return jA == z0.a() ? this.f36136c : (T) this.f36134a.get().b(jA);
    }

    public final void b(@Nullable T t10) {
        long jA = a1.a();
        if (jA == z0.a()) {
            this.f36136c = t10;
            return;
        }
        synchronized (this.f36135b) {
            y0 y0Var = this.f36134a.get();
            if (y0Var.d(jA, t10)) {
                return;
            }
            this.f36134a.set(y0Var.c(jA, t10));
            Unit unit = Unit.f312394a;
        }
    }
}
