package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class k0<E> extends q<E> implements l0<E> {
    public k0(@NotNull CoroutineContext coroutineContext, @NotNull p<E> pVar) {
        super(coroutineContext, pVar, true, true);
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        if (!i2().F(th2) && !z10) {
            kotlinx.coroutines.p0.b(getContext(), th2);
        }
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public boolean isActive() {
        return super.isActive();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: j2, reason: merged with bridge method [inline-methods] */
    public void g2(@NotNull Unit unit) {
        o0.a.a(i2(), null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.l0
    public /* bridge */ /* synthetic */ o0 s() {
        return s();
    }
}
