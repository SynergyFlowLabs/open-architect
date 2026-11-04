package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class t0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final i<T> f314830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f314831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.channels.j f314832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final CoroutineContext f314833d;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@NotNull i<? extends T> iVar, int i10, @NotNull kotlinx.coroutines.channels.j jVar, @NotNull CoroutineContext coroutineContext) {
        this.f314830a = iVar;
        this.f314831b = i10;
        this.f314832c = jVar;
        this.f314833d = coroutineContext;
    }
}
