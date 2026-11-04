package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class m0<T> implements z0<T>, c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ z0<T> f314712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final p2 f314713b;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@NotNull z0<? extends T> z0Var, @Nullable p2 p2Var) {
        this.f314712a = z0Var;
        this.f314713b = p2Var;
    }

    @Override // kotlinx.coroutines.flow.o0
    @NotNull
    public List<T> a() {
        return this.f314712a.a();
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return b1.d(this, coroutineContext, i10, jVar);
    }

    @Override // kotlinx.coroutines.flow.o0, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<?> dVar) {
        return this.f314712a.collect(jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.z0
    public T getValue() {
        return this.f314712a.getValue();
    }
}
