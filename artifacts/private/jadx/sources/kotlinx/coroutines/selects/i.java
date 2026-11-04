package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class i<Q> implements h<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f315520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<Object, n<?>, Object, Unit> f315521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pj.n<Object, Object, Object, Object> f315522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> f315523d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Object obj, @NotNull pj.n<Object, ? super n<?>, Object, Unit> nVar, @NotNull pj.n<Object, Object, Object, ? extends Object> nVar2, @Nullable pj.n<? super n<?>, Object, Object, ? extends pj.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar3) {
        this.f315520a = obj;
        this.f315521b = nVar;
        this.f315522c = nVar2;
        this.f315523d = nVar3;
    }

    @Override // kotlinx.coroutines.selects.l
    @Nullable
    public pj.n<n<?>, Object, Object, pj.n<Throwable, Object, CoroutineContext, Unit>> a() {
        return this.f315523d;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public pj.n<Object, Object, Object, Object> b() {
        return this.f315522c;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public pj.n<Object, n<?>, Object, Unit> c() {
        return this.f315521b;
    }

    @Override // kotlinx.coroutines.selects.l
    @NotNull
    public Object d() {
        return this.f315520a;
    }

    public /* synthetic */ i(Object obj, pj.n nVar, pj.n nVar2, pj.n nVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, nVar, nVar2, (i10 & 8) != 0 ? null : nVar3);
    }
}
