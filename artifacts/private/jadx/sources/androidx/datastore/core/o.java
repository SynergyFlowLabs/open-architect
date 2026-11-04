package androidx.datastore.core;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDataStoreInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,79:1\n198#2,5:80\n*S KotlinDebug\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n*L\n45#1:80,5\n*E\n"})
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<p0<T>> f49699a;

    public o() {
        t0 t0Var = t0.f49809b;
        Intrinsics.checkNotNull(t0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f49699a = b1.a(t0Var);
    }

    private static /* synthetic */ void a() {
    }

    @NotNull
    public final p0<T> b() {
        return this.f49699a.getValue();
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<p0<T>> c() {
        return this.f49699a;
    }

    @NotNull
    public final p0<T> d(@NotNull p0<T> newState) {
        p0<T> value;
        p0<T> p0Var;
        Intrinsics.checkNotNullParameter(newState, "newState");
        kotlinx.coroutines.flow.k0<p0<T>> k0Var = this.f49699a;
        do {
            value = k0Var.getValue();
            p0Var = value;
            if (!(p0Var instanceof i0 ? true : Intrinsics.areEqual(p0Var, t0.f49809b))) {
                if (p0Var instanceof i) {
                    if (newState.a() > p0Var.a()) {
                    }
                } else if (!(p0Var instanceof u)) {
                    throw new kotlin.k0();
                }
            }
            p0Var = newState;
        } while (!k0Var.compareAndSet(value, p0Var));
        return p0Var;
    }
}
