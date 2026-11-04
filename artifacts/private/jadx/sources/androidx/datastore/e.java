package androidx.datastore;

import androidx.datastore.core.l0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.m;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements androidx.datastore.core.okio.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0<T> f49831a;

    public e(@NotNull l0<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f49831a = delegate;
    }

    @Override // androidx.datastore.core.okio.d
    public T K() {
        return this.f49831a.K();
    }

    @Override // androidx.datastore.core.okio.d
    @Nullable
    public Object a(T t10, @NotNull m mVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objL = this.f49831a.L(t10, mVar.nf(), dVar);
        return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
    }

    @Override // androidx.datastore.core.okio.d
    @Nullable
    public Object b(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return this.f49831a.M(nVar.rf(), dVar);
    }
}
