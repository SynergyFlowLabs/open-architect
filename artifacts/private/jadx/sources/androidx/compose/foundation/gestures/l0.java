package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,137:1\n1107#2:138\n1085#2,2:139\n516#3:141\n48#3:142\n472#3:143\n472#3:144\n448#3,8:145\n48#3:153\n472#3:154\n519#3:155\n44#3:156\n588#3:157\n472#3:158\n516#3:161\n13409#4,2:159\n51#5,4:162\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n48#1:141\n72#1:142\n73#1:143\n92#1:144\n108#1:145,8\n112#1:153\n113#1:154\n120#1:155\n122#1:156\n133#1:157\n133#1:158\n134#1:161\n133#1:159,2\n134#1:162,4\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14797b = androidx.compose.runtime.collection.d.f35551d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<p0.a> f14798a = new androidx.compose.runtime.collection.d<>(new p0.a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(l0 l0Var, p0.a aVar, Throwable th2) {
        l0Var.f14798a.n0(aVar);
        return Unit.f312394a;
    }

    public final void c(@Nullable Throwable th2) {
        androidx.compose.runtime.collection.d<p0.a> dVar = this.f14798a;
        int iR = dVar.R();
        kotlinx.coroutines.n[] nVarArr = new kotlinx.coroutines.n[iR];
        for (int i10 = 0; i10 < iR; i10++) {
            nVarArr[i10] = dVar.f35552a[i10].a();
        }
        for (int i11 = 0; i11 < iR; i11++) {
            nVarArr[i11].c(th2);
        }
        if (!(this.f14798a.R() == 0)) {
            androidx.compose.foundation.internal.e.i("uncancelled requests present");
        }
    }

    public final boolean d(@NotNull final p0.a aVar) {
        n0.j jVarInvoke = aVar.b().invoke();
        if (jVarInvoke == null) {
            kotlinx.coroutines.n<Unit> nVarA = aVar.a();
            Result.a aVar2 = Result.Companion;
            nVarA.resumeWith(Result.m785constructorimpl(Unit.f312394a));
            return false;
        }
        aVar.a().e0(new Function1() { // from class: androidx.compose.foundation.gestures.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.e(this.f14734a, aVar, (Throwable) obj);
            }
        });
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, this.f14798a.R());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL <= iM) {
            while (true) {
                n0.j jVarInvoke2 = this.f14798a.f35552a[iM].b().invoke();
                if (jVarInvoke2 != null) {
                    n0.j jVarK = jVarInvoke.K(jVarInvoke2);
                    if (!Intrinsics.areEqual(jVarK, jVarInvoke)) {
                        if (!Intrinsics.areEqual(jVarK, jVarInvoke2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int iR = this.f14798a.R() - 1;
                            if (iR <= iM) {
                                while (true) {
                                    this.f14798a.f35552a[iM].a().c(cancellationException);
                                    if (iR == iM) {
                                        break;
                                    }
                                    iR++;
                                }
                            }
                        }
                    } else {
                        this.f14798a.c(iM + 1, aVar);
                        return true;
                    }
                }
                if (iM != iL) {
                    iM--;
                }
            }
        }
        this.f14798a.c(0, aVar);
        return true;
    }

    public final void f(@NotNull Function1<? super n0.j, Unit> function1) {
        androidx.compose.runtime.collection.d dVar = this.f14798a;
        int iR = dVar.R() - 1;
        Object[] objArr = dVar.f35552a;
        if (iR < objArr.length) {
            while (iR >= 0) {
                function1.invoke(((p0.a) objArr[iR]).b().invoke());
                iR--;
            }
        }
    }

    public final int g() {
        return this.f14798a.R();
    }

    public final boolean h() {
        return this.f14798a.R() == 0;
    }

    public final void i() {
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, this.f14798a.R());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL <= iM) {
            while (true) {
                kotlinx.coroutines.n<Unit> nVarA = this.f14798a.f35552a[iL].a();
                Unit unit = Unit.f312394a;
                Result.a aVar = Result.Companion;
                nVarA.resumeWith(Result.m785constructorimpl(unit));
                if (iL == iM) {
                    break;
                } else {
                    iL++;
                }
            }
        }
        this.f14798a.r();
    }

    public final void j(@NotNull Function1<? super n0.j, Boolean> function1) {
        while (this.f14798a.R() != 0 && function1.invoke(((p0.a) this.f14798a.Y()).b().invoke()).booleanValue()) {
            kotlinx.coroutines.n<Unit> nVarA = ((p0.a) this.f14798a.r0(this.f14798a.R() - 1)).a();
            Unit unit = Unit.f312394a;
            Result.a aVar = Result.Companion;
            nVarA.resumeWith(Result.m785constructorimpl(unit));
        }
    }
}
