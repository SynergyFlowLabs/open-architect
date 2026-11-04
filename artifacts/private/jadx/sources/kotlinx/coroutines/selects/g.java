package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f315516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<Object, n<?>, Object, Unit> f315517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> f315518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pj.n<Object, Object, Object, Object> f315519d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Object obj, @NotNull pj.n<Object, ? super n<?>, Object, Unit> nVar, @Nullable pj.n<? super n<?>, Object, Object, ? extends pj.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar2) {
        this.f315516a = obj;
        this.f315517b = nVar;
        this.f315518c = nVar2;
        this.f315519d = p.f315550a;
    }

    @Override // kotlinx.coroutines.selects.l
    @Nullable
    public pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> a() {
        return this.f315518c;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public pj.n<Object, Object, Object, Object> b() {
        return this.f315519d;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public pj.n<Object, n<?>, Object, Unit> c() {
        return this.f315517b;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public Object d() {
        return this.f315516a;
    }

    public /* synthetic */ g(Object obj, pj.n nVar, pj.n nVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, nVar, (i10 & 4) != 0 ? null : nVar2);
    }
}
