package androidx.compose.runtime;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1903:1\n33#2:1904\n33#2:1914\n318#3,9:1905\n327#3,2:1915\n49#4,4:1917\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1825#1:1904\n1832#1:1914\n1831#1:1905,9\n1831#1:1915,2\n1850#1:1917,4\n*E\n"})
final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f36174a;

    @Nullable
    public final Object c(@NotNull Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.coroutines.p pVar;
        synchronized (obj) {
            try {
                if (this.f36174a == h5.f35812a) {
                    this.f36174a = h5.f35813b;
                    return Unit.f312394a;
                }
                Unit unit = Unit.f312394a;
                kotlinx.coroutines.p pVar2 = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
                pVar2.p0();
                synchronized (obj) {
                    try {
                        if (this.f36174a == h5.f35812a) {
                            this.f36174a = h5.f35813b;
                            pVar = pVar2;
                        } else {
                            this.f36174a = pVar2;
                            pVar = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (pVar != null) {
                    Result.a aVar = Result.Companion;
                    pVar.resumeWith(Result.m785constructorimpl(unit));
                }
                Object objU = pVar2.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objU == kotlin.coroutines.intrinsics.b.l() ? objU : unit;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Nullable
    public final kotlin.coroutines.d<Unit> d() {
        Object obj = this.f36174a;
        if (obj instanceof kotlin.coroutines.d) {
            this.f36174a = h5.f35813b;
            return (kotlin.coroutines.d) obj;
        }
        if (Intrinsics.areEqual(obj, h5.f35812a) || Intrinsics.areEqual(obj, h5.f35813b)) {
            return null;
        }
        if (obj == null) {
            this.f36174a = h5.f35812a;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }

    public final void e() {
        if (!(this.f36174a == h5.f35813b)) {
            f4.e("frame not pending");
        }
        this.f36174a = null;
    }
}
