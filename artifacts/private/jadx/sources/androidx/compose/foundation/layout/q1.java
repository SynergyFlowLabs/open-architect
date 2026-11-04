package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n85#2:230\n117#2,2:231\n1#3:233\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n*L\n156#1:230\n156#1:231,2\n*E\n"})
final class q1 extends androidx.compose.ui.platform.u2 implements androidx.compose.ui.layout.o0, androidx.compose.ui.modifier.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v6 f16358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pj.n<v6, androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, Integer> f16359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16360f;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(@NotNull v6 v6Var, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1, @NotNull pj.n<? super v6, ? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, Integer> nVar) {
        super(function1);
        this.f16358d = v6Var;
        this.f16359e = nVar;
        this.f16360f = androidx.compose.runtime.d7.g(v6Var, null, 2, null);
    }

    private final v6 k() {
        return (v6) this.f16360f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final void n(v6 v6Var) {
        this.f16360f.setValue(v6Var);
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        int iIntValue = this.f16359e.invoke(k(), c1Var.getLayoutDirection(), c1Var).intValue();
        if (iIntValue == 0) {
            return androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.o1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q1.l((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, iIntValue, iIntValue, 0, 0, 12, null));
        return androidx.compose.ui.layout.c1.h6(c1Var, iIntValue, i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.layout.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.m(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.modifier.d
    public void c7(@NotNull androidx.compose.ui.modifier.n nVar) {
        n(b7.j(this.f16358d, (v6) nVar.I(t7.e())));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.areEqual(this.f16358d, q1Var.f16358d) && this.f16359e == q1Var.f16359e;
    }

    public int hashCode() {
        return (this.f16358d.hashCode() * 31) + this.f16359e.hashCode();
    }
}
