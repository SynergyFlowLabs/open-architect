package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,623:1\n85#2:624\n117#2,2:625\n85#2:627\n117#2,2:628\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n371#1:624\n371#1:625,2\n372#1:627\n372#1:628,2\n*E\n"})
public final class y3 implements androidx.compose.ui.layout.o0, androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.l<v6> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16569d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v6 f16570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f16572c;

    public y3(@NotNull v6 v6Var) {
        this.f16570a = v6Var;
        this.f16571b = androidx.compose.runtime.d7.g(v6Var, null, 2, null);
        this.f16572c = androidx.compose.runtime.d7.g(v6Var, null, 2, null);
    }

    private final v6 b() {
        return (v6) this.f16572c.getValue();
    }

    private final v6 d() {
        return (v6) this.f16571b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, i10, i11, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final void g(v6 v6Var) {
        this.f16572c.setValue(v6Var);
    }

    private final void h(v6 v6Var) {
        this.f16571b.setValue(v6Var);
    }

    @Override // androidx.compose.ui.layout.o0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        final int iD = d().d(c1Var, c1Var.getLayoutDirection());
        final int iA = d().a(c1Var);
        int iB = d().b(c1Var, c1Var.getLayoutDirection()) + iD;
        int iC = d().c(c1Var) + iA;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(j10, -iB, -iC));
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.c.i(j10, i2VarP0.h1() + iB), androidx.compose.ui.unit.c.h(j10, i2VarP0.c1() + iC), null, new Function1() { // from class: androidx.compose.foundation.layout.x3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y3.f(i2VarP0, iD, iA, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.modifier.d
    public void c7(@NotNull androidx.compose.ui.modifier.n nVar) {
        v6 v6Var = (v6) nVar.I(t7.e());
        h(b7.j(this.f16570a, v6Var));
        g(b7.l(v6Var, this.f16570a));
    }

    @Override // androidx.compose.ui.modifier.l
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public v6 getValue() {
        return b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3) {
            return Intrinsics.areEqual(((y3) obj).f16570a, this.f16570a);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.l
    @NotNull
    public androidx.compose.ui.modifier.p<v6> getKey() {
        return t7.e();
    }

    public int hashCode() {
        return this.f16570a.hashCode();
    }
}
