package androidx.compose.foundation.lazy;

import androidx.compose.runtime.n7;
import androidx.compose.ui.layout.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,163:1\n26#2:164\n26#2:165\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n*L\n138#1:164\n147#1:165\n*E\n"})
final class s1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f17710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private n7<Integer> f17711t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private n7<Integer> f17712v;

    public /* synthetic */ s1(float f10, n7 n7Var, n7 n7Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? null : n7Var, (i10 & 4) != 0 ? null : n7Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(i2 i2Var, i2.a aVar) {
        i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    public final void A9(float f10) {
        this.f17710s = f10;
    }

    public final void B9(@Nullable n7<Integer> n7Var) {
        this.f17712v = n7Var;
    }

    public final void C9(@Nullable n7<Integer> n7Var) {
        this.f17711t = n7Var;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        n7<Integer> n7Var = this.f17711t;
        int iRound = (n7Var == null || n7Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(n7Var.getValue().floatValue() * this.f17710s);
        n7<Integer> n7Var2 = this.f17712v;
        int iRound2 = (n7Var2 == null || n7Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(n7Var2.getValue().floatValue() * this.f17710s);
        int iR = iRound != Integer.MAX_VALUE ? iRound : androidx.compose.ui.unit.b.r(j10);
        int iQ = iRound2 != Integer.MAX_VALUE ? iRound2 : androidx.compose.ui.unit.b.q(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = androidx.compose.ui.unit.b.p(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = androidx.compose.ui.unit.b.o(j10);
        }
        final i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.a(iR, iRound, iQ, iRound2));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.lazy.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.z9(i2VarP0, (i2.a) obj);
            }
        }, 4, null);
    }

    public final float w9() {
        return this.f17710s;
    }

    @Nullable
    public final n7<Integer> x9() {
        return this.f17712v;
    }

    @Nullable
    public final n7<Integer> y9() {
        return this.f17711t;
    }

    public s1(float f10, @Nullable n7<Integer> n7Var, @Nullable n7<Integer> n7Var2) {
        this.f17710s = f10;
        this.f17711t = n7Var;
        this.f17712v = n7Var2;
    }
}
