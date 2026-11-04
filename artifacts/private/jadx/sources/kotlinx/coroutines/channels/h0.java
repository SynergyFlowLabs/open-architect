package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class h0<E> extends g<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f313773e;

    public h0(@NotNull CoroutineContext coroutineContext, @NotNull d<E> dVar, @NotNull Function2<? super l0<? super E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, dVar, false);
        this.f313773e = kotlin.coroutines.intrinsics.b.c(function2, this, this);
    }

    @Override // kotlinx.coroutines.w2
    protected void K1() throws Throwable {
        bk.a.c(this.f313773e, this);
    }

    @Override // kotlinx.coroutines.channels.g, kotlinx.coroutines.channels.d
    @NotNull
    public n0<E> k() {
        n0<E> n0VarK = i2().k();
        start();
        return n0VarK;
    }
}
