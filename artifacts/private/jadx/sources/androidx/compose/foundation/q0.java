package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,477:1\n57#2:478\n61#2:481\n60#3:479\n70#3:482\n85#3:485\n90#3:487\n22#4:480\n22#4:483\n54#5:484\n59#5:486\n1#6:488\n536#7,17:489\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n384#1:478\n385#1:481\n384#1:479\n385#1:482\n389#1:485\n389#1:487\n384#1:480\n385#1:483\n389#1:484\n389#1:486\n398#1:489,17\n*E\n"})
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.t1 f18524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k0 f18525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.drawscope.a f18526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.k2 f18527d;

    public q0() {
        this(null, null, null, null, 15, null);
    }

    private final androidx.compose.ui.graphics.t1 g() {
        return this.f18524a;
    }

    private final androidx.compose.ui.graphics.k0 h() {
        return this.f18525b;
    }

    private final androidx.compose.ui.graphics.drawscope.a i() {
        return this.f18526c;
    }

    private final androidx.compose.ui.graphics.k2 j() {
        return this.f18527d;
    }

    public static /* synthetic */ q0 l(q0 q0Var, androidx.compose.ui.graphics.t1 t1Var, androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.drawscope.a aVar, androidx.compose.ui.graphics.k2 k2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t1Var = q0Var.f18524a;
        }
        if ((i10 & 2) != 0) {
            k0Var = q0Var.f18525b;
        }
        if ((i10 & 4) != 0) {
            aVar = q0Var.f18526c;
        }
        if ((i10 & 8) != 0) {
            k2Var = q0Var.f18527d;
        }
        return q0Var.k(t1Var, k0Var, aVar, k2Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f18524a, q0Var.f18524a) && Intrinsics.areEqual(this.f18525b, q0Var.f18525b) && Intrinsics.areEqual(this.f18526c, q0Var.f18526c) && Intrinsics.areEqual(this.f18527d, q0Var.f18527d);
    }

    public int hashCode() {
        androidx.compose.ui.graphics.t1 t1Var = this.f18524a;
        int iHashCode = (t1Var == null ? 0 : t1Var.hashCode()) * 31;
        androidx.compose.ui.graphics.k0 k0Var = this.f18525b;
        int iHashCode2 = (iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f18526c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        androidx.compose.ui.graphics.k2 k2Var = this.f18527d;
        return iHashCode3 + (k2Var != null ? k2Var.hashCode() : 0);
    }

    @NotNull
    public final q0 k(@Nullable androidx.compose.ui.graphics.t1 t1Var, @Nullable androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.drawscope.a aVar, @Nullable androidx.compose.ui.graphics.k2 k2Var) {
        return new q0(t1Var, k0Var, aVar, k2Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    @NotNull
    public final androidx.compose.ui.graphics.t1 m(@NotNull androidx.compose.ui.draw.i iVar, long j10, int i10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        int i11;
        androidx.compose.ui.graphics.drawscope.a aVar;
        androidx.compose.ui.graphics.t1 t1VarB = this.f18524a;
        androidx.compose.ui.graphics.k0 k0VarA = this.f18525b;
        androidx.compose.ui.graphics.u1 u1VarF = t1VarB != null ? androidx.compose.ui.graphics.u1.f(t1VarB.d()) : null;
        boolean z10 = false;
        if (!(u1VarF == null ? false : androidx.compose.ui.graphics.u1.i(u1VarF.m(), androidx.compose.ui.graphics.u1.f38249b.b()))) {
            i11 = i10;
            if (androidx.compose.ui.graphics.u1.h(i11, t1VarB != null ? androidx.compose.ui.graphics.u1.f(t1VarB.d()) : null)) {
            }
            if (t1VarB != null || k0VarA == null || Float.intBitsToFloat((int) (iVar.d() >> 32)) > t1VarB.getWidth() || Float.intBitsToFloat((int) (iVar.d() & com.rabbitmq.client.k0.f265952a)) > t1VarB.getHeight() || !z10) {
                t1VarB = androidx.compose.ui.graphics.v1.b((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a), i11, false, null, 24, null);
                this.f18524a = t1VarB;
                k0VarA = androidx.compose.ui.graphics.m0.a(t1VarB);
                this.f18525b = k0VarA;
            }
            aVar = this.f18526c;
            if (aVar == null) {
                aVar = new androidx.compose.ui.graphics.drawscope.a();
                this.f18526c = aVar;
            }
            androidx.compose.ui.graphics.drawscope.a aVar2 = aVar;
            long jH = androidx.compose.ui.unit.v.h(j10);
            androidx.compose.ui.unit.w layoutDirection = iVar.getLayoutDirection();
            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU = aVar2.U();
            androidx.compose.ui.unit.d dVarA = c0286aU.a();
            androidx.compose.ui.unit.w wVarB = c0286aU.b();
            androidx.compose.ui.graphics.k0 k0VarC = c0286aU.c();
            long jD = c0286aU.d();
            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU2 = aVar2.U();
            c0286aU2.l(iVar);
            c0286aU2.m(layoutDirection);
            c0286aU2.k(k0VarA);
            c0286aU2.n(jH);
            k0VarA.save();
            androidx.compose.ui.graphics.t1 t1Var = t1VarB;
            androidx.compose.ui.graphics.drawscope.f.V3(aVar2, androidx.compose.ui.graphics.q0.f38131b.a(), 0L, jH, 0.0f, null, null, androidx.compose.ui.graphics.d0.f37693b.a(), 58, null);
            function1.invoke(aVar2);
            k0VarA.B();
            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU3 = aVar2.U();
            c0286aU3.l(dVarA);
            c0286aU3.m(wVarB);
            c0286aU3.k(k0VarC);
            c0286aU3.n(jD);
            t1Var.b();
            return t1Var;
        }
        i11 = i10;
        z10 = true;
        if (t1VarB != null) {
            t1VarB = androidx.compose.ui.graphics.v1.b((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a), i11, false, null, 24, null);
            this.f18524a = t1VarB;
            k0VarA = androidx.compose.ui.graphics.m0.a(t1VarB);
            this.f18525b = k0VarA;
        } else {
            t1VarB = androidx.compose.ui.graphics.v1.b((int) (j10 >> 32), (int) (j10 & com.rabbitmq.client.k0.f265952a), i11, false, null, 24, null);
            this.f18524a = t1VarB;
            k0VarA = androidx.compose.ui.graphics.m0.a(t1VarB);
            this.f18525b = k0VarA;
        }
        aVar = this.f18526c;
        if (aVar == null) {
            aVar = new androidx.compose.ui.graphics.drawscope.a();
            this.f18526c = aVar;
        }
        androidx.compose.ui.graphics.drawscope.a aVar3 = aVar;
        long jH2 = androidx.compose.ui.unit.v.h(j10);
        androidx.compose.ui.unit.w layoutDirection2 = iVar.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU4 = aVar3.U();
        androidx.compose.ui.unit.d dVarA2 = c0286aU4.a();
        androidx.compose.ui.unit.w wVarB2 = c0286aU4.b();
        androidx.compose.ui.graphics.k0 k0VarC2 = c0286aU4.c();
        long jD2 = c0286aU4.d();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU5 = aVar3.U();
        c0286aU5.l(iVar);
        c0286aU5.m(layoutDirection2);
        c0286aU5.k(k0VarA);
        c0286aU5.n(jH2);
        k0VarA.save();
        androidx.compose.ui.graphics.t1 t1Var2 = t1VarB;
        androidx.compose.ui.graphics.drawscope.f.V3(aVar3, androidx.compose.ui.graphics.q0.f38131b.a(), 0L, jH2, 0.0f, null, null, androidx.compose.ui.graphics.d0.f37693b.a(), 58, null);
        function1.invoke(aVar3);
        k0VarA.B();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU6 = aVar3.U();
        c0286aU6.l(dVarA2);
        c0286aU6.m(wVarB2);
        c0286aU6.k(k0VarC2);
        c0286aU6.n(jD2);
        t1Var2.b();
        return t1Var2;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 n() {
        androidx.compose.ui.graphics.k2 k2Var = this.f18527d;
        if (k2Var != null) {
            return k2Var;
        }
        androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
        this.f18527d = k2VarA;
        return k2VarA;
    }

    @NotNull
    public String toString() {
        return "BorderCache(imageBitmap=" + this.f18524a + ", canvas=" + this.f18525b + ", canvasDrawScope=" + this.f18526c + ", borderPath=" + this.f18527d + ')';
    }

    public q0(@Nullable androidx.compose.ui.graphics.t1 t1Var, @Nullable androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.drawscope.a aVar, @Nullable androidx.compose.ui.graphics.k2 k2Var) {
        this.f18524a = t1Var;
        this.f18525b = k0Var;
        this.f18526c = aVar;
        this.f18527d = k2Var;
    }

    public /* synthetic */ q0(androidx.compose.ui.graphics.t1 t1Var, androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.drawscope.a aVar, androidx.compose.ui.graphics.k2 k2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : t1Var, (i10 & 2) != 0 ? null : k0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : k2Var);
    }
}
