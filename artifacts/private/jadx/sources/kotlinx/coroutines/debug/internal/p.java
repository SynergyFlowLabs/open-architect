package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.util.List;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@a1
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f313994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f313995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f313996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f313997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f313998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f313999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<StackTraceElement> f314000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f314001h;

    public p(@NotNull i iVar, @NotNull CoroutineContext coroutineContext) {
        Thread.State state;
        q0 q0Var = (q0) coroutineContext.get(q0.f315202b);
        this.f313994a = q0Var != null ? Long.valueOf(q0Var.T()) : null;
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(kotlin.coroutines.e.K2);
        this.f313995b = eVar != null ? eVar.toString() : null;
        r0 r0Var = (r0) coroutineContext.get(r0.f315206b);
        this.f313996c = r0Var != null ? r0Var.T() : null;
        this.f313997d = iVar.g();
        Thread thread = iVar.lastObservedThread;
        this.f313998e = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = iVar.lastObservedThread;
        this.f313999f = thread2 != null ? thread2.getName() : null;
        this.f314000g = iVar.h();
        this.f314001h = iVar.f313963b;
    }

    @Nullable
    public final Long a() {
        return this.f313994a;
    }

    @Nullable
    public final String b() {
        return this.f313995b;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f314000g;
    }

    @Nullable
    public final String d() {
        return this.f313999f;
    }

    @Nullable
    public final String e() {
        return this.f313998e;
    }

    public final long f() {
        return this.f314001h;
    }

    @NotNull
    public final String g() {
        return this.f313997d;
    }

    @Nullable
    public final String getName() {
        return this.f313996c;
    }
}
