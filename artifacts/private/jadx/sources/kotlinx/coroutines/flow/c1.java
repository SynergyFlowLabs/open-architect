package kotlinx.coroutines.flow;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n426#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
final class c1 extends kotlinx.coroutines.flow.internal.d<a1<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f314097a = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull a1<?> a1Var) {
        if (kotlinx.coroutines.internal.g.a(this.f314097a) != null) {
            return false;
        }
        kotlinx.coroutines.internal.g.d(this.f314097a, b1.f314095a);
        return true;
    }

    @Nullable
    public final Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        if (!z1.a(this.f314097a, b1.f314095a, pVar)) {
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<Unit>[] b(@NotNull a1<?> a1Var) {
        kotlinx.coroutines.internal.g.d(this.f314097a, null);
        return kotlinx.coroutines.flow.internal.c.f314488a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this.f314097a;
        while (true) {
            Object objA = kotlinx.coroutines.internal.g.a(atomicReference);
            if (objA == null || objA == b1.f314096b) {
                return;
            }
            if (objA == b1.f314095a) {
                if (z1.a(this.f314097a, objA, b1.f314096b)) {
                    return;
                }
            } else if (z1.a(this.f314097a, objA, b1.f314095a)) {
                Result.a aVar = Result.Companion;
                ((kotlinx.coroutines.p) objA).resumeWith(Result.m785constructorimpl(Unit.f312394a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f314097a.getAndSet(b1.f314095a);
        Intrinsics.checkNotNull(andSet);
        return andSet == b1.f314096b;
    }
}
