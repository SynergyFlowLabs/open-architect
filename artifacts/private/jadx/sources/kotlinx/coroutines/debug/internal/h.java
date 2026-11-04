package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@a1
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f313954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final kotlin.coroutines.jvm.internal.e f313955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f313956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<StackTraceElement> f313957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f313958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Thread f313959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final kotlin.coroutines.jvm.internal.e f313960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<StackTraceElement> f313961h;

    public h(@NotNull i iVar, @NotNull CoroutineContext coroutineContext) {
        this.f313954a = coroutineContext;
        this.f313955b = iVar.d();
        this.f313956c = iVar.f313963b;
        this.f313957d = iVar.e();
        this.f313958e = iVar.g();
        this.f313959f = iVar.lastObservedThread;
        this.f313960g = iVar.f();
        this.f313961h = iVar.h();
    }

    @NotNull
    public final CoroutineContext a() {
        return this.f313954a;
    }

    @Nullable
    public final kotlin.coroutines.jvm.internal.e b() {
        return this.f313955b;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f313957d;
    }

    @Nullable
    public final kotlin.coroutines.jvm.internal.e d() {
        return this.f313960g;
    }

    @Nullable
    public final Thread e() {
        return this.f313959f;
    }

    public final long f() {
        return this.f313956c;
    }

    @NotNull
    public final String g() {
        return this.f313958e;
    }

    @oj.i(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> h() {
        return this.f313961h;
    }
}
