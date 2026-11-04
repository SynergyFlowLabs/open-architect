package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class r0 extends kotlinx.coroutines.flow.internal.d<p0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public long f314765a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public kotlin.coroutines.d<? super Unit> f314766b;

    @Override // kotlinx.coroutines.flow.internal.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull p0<?> p0Var) {
        if (this.f314765a >= 0) {
            return false;
        }
        this.f314765a = p0Var.b0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<Unit>[] b(@NotNull p0<?> p0Var) {
        long j10 = this.f314765a;
        this.f314765a = -1L;
        this.f314766b = null;
        return p0Var.a0(j10);
    }
}
