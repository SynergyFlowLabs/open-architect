package androidx.compose.material;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,736:1\n1#2:737\n57#3:738\n61#3:741\n57#3:747\n61#3:750\n60#4:739\n70#4:742\n53#4,3:744\n60#4:748\n70#4:751\n53#4,3:754\n22#5:740\n22#5:749\n22#5:752\n33#6:743\n30#7:753\n609#8:757\n584#8:758\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n472#1:738\n472#1:741\n497#1:747\n499#1:750\n472#1:739\n472#1:742\n491#1:744,3\n497#1:748\n499#1:751\n505#1:754,3\n472#1:740\n497#1:749\n499#1:752\n491#1:743\n505#1:753\n540#1:757\n540#1:758\n*E\n"})
final class b2 implements androidx.compose.ui.graphics.q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f22136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p8 f22137b;

    public b2(@NotNull androidx.compose.ui.graphics.q3 q3Var, @NotNull p8 p8Var) {
        this.f22136a = q3Var;
        this.f22137b = p8Var;
    }

    private final void a(androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
        float fS7 = dVar.S7(n0.f23833e);
        float f10 = 2 * fS7;
        long jF = n0.n.f((((long) Float.floatToRawIntBits(this.f22137b.c() + f10)) << 32) | (((long) Float.floatToRawIntBits(this.f22137b.a() + f10)) & com.rabbitmq.client.k0.f265952a));
        float fB = this.f22137b.b() - fS7;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32)) + fB;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF & com.rabbitmq.client.k0.f265952a)) / 2.0f;
        androidx.compose.ui.graphics.g2.a(k2Var, this.f22136a.mo0createOutlinePq9zytI(jF, wVar, dVar));
        k2Var.m(n0.g.g((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(-fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a)));
        if (Intrinsics.areEqual(this.f22136a, androidx.compose.foundation.shape.o.k())) {
            b(k2Var, fB, fIntBitsToFloat, fIntBitsToFloat2, dVar.S7(n0.f23834f), 0.0f);
        }
    }

    private final void b(androidx.compose.ui.graphics.k2 k2Var, float f10, float f11, float f12, float f13, float f14) {
        float f15 = -((float) Math.sqrt((f12 * f12) - (f14 * f14)));
        float f16 = f12 + f15;
        float f17 = f10 + f16;
        float f18 = f11 - f16;
        Pair<Float, Float> pairC = n0.C(f15 - 1.0f, f14, f12);
        float fFloatValue = pairC.component1().floatValue() + f12;
        float fFloatValue2 = pairC.component2().floatValue() - f14;
        k2Var.A(f17 - f13, 0.0f);
        k2Var.N(f17 - 1.0f, 0.0f, f10 + fFloatValue, fFloatValue2);
        k2Var.F(f11 - fFloatValue, fFloatValue2);
        k2Var.N(f18 + 1.0f, 0.0f, f13 + f18, 0.0f);
        k2Var.close();
    }

    public static /* synthetic */ b2 f(b2 b2Var, androidx.compose.ui.graphics.q3 q3Var, p8 p8Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = b2Var.f22136a;
        }
        if ((i10 & 2) != 0) {
            p8Var = b2Var.f22137b;
        }
        return b2Var.e(q3Var, p8Var);
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 c() {
        return this.f22136a;
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
        androidx.compose.ui.graphics.k2.g(k2VarA, new n0.j(0.0f, 0.0f, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))), null, 2, null);
        androidx.compose.ui.graphics.k2 k2VarA2 = androidx.compose.ui.graphics.u.a();
        a(k2VarA2, wVar, dVar);
        k2VarA2.X(k2VarA, k2VarA2, androidx.compose.ui.graphics.t2.f38235b.a());
        return new androidx.compose.ui.graphics.f2.a(k2VarA2);
    }

    @NotNull
    public final p8 d() {
        return this.f22137b;
    }

    @NotNull
    public final b2 e(@NotNull androidx.compose.ui.graphics.q3 q3Var, @NotNull p8 p8Var) {
        return new b2(q3Var, p8Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.areEqual(this.f22136a, b2Var.f22136a) && Intrinsics.areEqual(this.f22137b, b2Var.f22137b);
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 g() {
        return this.f22136a;
    }

    @NotNull
    public final p8 h() {
        return this.f22137b;
    }

    public int hashCode() {
        return (this.f22136a.hashCode() * 31) + this.f22137b.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.f22136a + ", fabPlacement=" + this.f22137b + ')';
    }
}
