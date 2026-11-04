package kotlinx.coroutines.channels;

import kotlinx.coroutines.f4;
import kotlinx.coroutines.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class m0<E> implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.p<t<? extends E>> f313794a;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@NotNull kotlinx.coroutines.p<? super t<? extends E>> pVar) {
        this.f313794a = pVar;
    }

    @Override // kotlinx.coroutines.f4
    public void b(@NotNull w0<?> w0Var, int i10) {
        this.f313794a.b(w0Var, i10);
    }
}
