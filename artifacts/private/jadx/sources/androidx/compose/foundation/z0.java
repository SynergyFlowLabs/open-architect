package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 13 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 14 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n1#1,477:1\n57#2,6:478\n30#3:484\n80#4:485\n60#4:498\n70#4:502\n85#4:508\n90#4:510\n60#4:538\n70#4:541\n53#4,3:577\n60#4:581\n70#4:584\n53#4,3:586\n60#4:597\n60#4:600\n70#4:603\n374#5,11:486\n385#5:500\n386#5,4:503\n390#5,2:511\n388#5,6:513\n396#5,3:520\n401#5,2:532\n403#5:565\n404#5,2:574\n57#6:497\n61#6:501\n57#6:537\n61#6:540\n57#6:580\n61#6:583\n57#6:599\n61#6:602\n22#7:499\n22#7:539\n22#7:582\n22#7:598\n22#7:601\n22#7:604\n54#8:507\n59#8:509\n1#9:519\n536#10,9:523\n545#10,8:566\n120#11,3:534\n167#11,6:542\n249#11,14:548\n124#11,3:562\n120#11,7:589\n209#11:605\n249#11,14:606\n30#12:576\n33#13:585\n48#14:596\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n245#1:478,6\n245#1:484\n245#1:485\n252#1:498\n252#1:502\n252#1:508\n252#1:510\n267#1:538\n267#1:541\n174#1:577,3\n175#1:581\n175#1:584\n175#1:586,3\n308#1:597\n316#1:600\n317#1:603\n252#1:486,11\n252#1:500\n252#1:503,4\n252#1:511,2\n252#1:513,6\n252#1:520,3\n252#1:532,2\n252#1:565\n252#1:574,2\n252#1:497\n252#1:501\n267#1:537\n267#1:540\n175#1:580\n175#1:583\n316#1:599\n317#1:602\n252#1:499\n267#1:539\n175#1:582\n308#1:598\n316#1:601\n317#1:604\n252#1:507\n252#1:509\n252#1:519\n252#1:523,9\n252#1:566,8\n255#1:534,3\n267#1:542,6\n267#1:548,14\n255#1:562,3\n281#1:589,7\n313#1:605\n313#1:606,14\n174#1:576\n175#1:585\n308#1:596\n*E\n"})
public final class z0 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f21923p2 = 8;

    @NotNull
    private final androidx.compose.ui.draw.g H1;
    private final boolean X;

    @Nullable
    private q0 Y;
    private float Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.i0 f21924p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.q3 f21925p1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f21926w;

    public /* synthetic */ z0(float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i0Var, q3Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x015f  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, androidx.compose.ui.graphics.t1] */
    private final androidx.compose.ui.draw.o L9(androidx.compose.ui.draw.i iVar, final androidx.compose.ui.graphics.i0 i0Var, final androidx.compose.ui.graphics.f2.a aVar, boolean z10, float f10) throws Throwable {
        int iB;
        androidx.compose.ui.graphics.r0 r0VarD;
        boolean z11;
        kotlin.jvm.internal.i1.h hVar;
        kotlin.jvm.internal.i1.h hVar2;
        androidx.compose.ui.graphics.drawscope.a aVar2;
        androidx.compose.ui.graphics.drawscope.a aVar3;
        float f11;
        float f12;
        float f13;
        float f14;
        androidx.compose.ui.graphics.drawscope.a aVar4;
        androidx.compose.ui.graphics.drawscope.d dVarZ3;
        long jD;
        androidx.compose.ui.graphics.drawscope.d dVar;
        long j10;
        if (z10) {
            return iVar.N(new Function1() { // from class: androidx.compose.foundation.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z0.M9(aVar, i0Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            });
        }
        if (i0Var instanceof androidx.compose.ui.graphics.s3) {
            iB = androidx.compose.ui.graphics.u1.f38249b.a();
            r0VarD = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.s3) i0Var).c(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iB = androidx.compose.ui.graphics.u1.f38249b.b();
            r0VarD = null;
        }
        int i10 = iB;
        final n0.j bounds = aVar.b().getBounds();
        if (this.Y == null) {
            this.Y = new q0(null, null, null, null, 15, null);
        }
        q0 q0Var = this.Y;
        Intrinsics.checkNotNull(q0Var);
        androidx.compose.ui.graphics.k2 k2VarN = q0Var.n();
        k2VarN.reset();
        androidx.compose.ui.graphics.k2.g(k2VarN, bounds, null, 2, null);
        k2VarN.X(k2VarN, aVar.b(), androidx.compose.ui.graphics.t2.f38235b.a());
        kotlin.jvm.internal.i1.h hVar3 = new kotlin.jvm.internal.i1.h();
        final long jE = androidx.compose.ui.unit.u.e((((long) ((int) Math.ceil(bounds.j() - bounds.B()))) & com.rabbitmq.client.k0.f265952a) | (((long) ((int) Math.ceil(bounds.x() - bounds.t()))) << 32));
        q0 q0Var2 = this.Y;
        Intrinsics.checkNotNull(q0Var2);
        androidx.compose.ui.graphics.t1 t1VarB = q0Var2.f18524a;
        androidx.compose.ui.graphics.k0 k0VarA = q0Var2.f18525b;
        androidx.compose.ui.graphics.u1 u1VarF = t1VarB != null ? androidx.compose.ui.graphics.u1.f(t1VarB.d()) : null;
        if (!(u1VarF == null ? false : androidx.compose.ui.graphics.u1.i(u1VarF.m(), androidx.compose.ui.graphics.u1.f38249b.b()))) {
            z11 = androidx.compose.ui.graphics.u1.h(i10, t1VarB != null ? androidx.compose.ui.graphics.u1.f(t1VarB.d()) : null);
        }
        try {
            try {
                try {
                    try {
                        if (t1VarB != null && k0VarA != null) {
                            hVar = hVar3;
                            if (Float.intBitsToFloat((int) (iVar.d() >> 32)) <= t1VarB.getWidth() && Float.intBitsToFloat((int) (iVar.d() & com.rabbitmq.client.k0.f265952a)) <= t1VarB.getHeight() && z11) {
                                hVar2 = hVar;
                            }
                            ?? r11 = t1VarB;
                            androidx.compose.ui.graphics.k0 k0Var = k0VarA;
                            aVar2 = q0Var2.f18526c;
                            if (aVar2 == null) {
                                aVar2 = new androidx.compose.ui.graphics.drawscope.a();
                                q0Var2.f18526c = aVar2;
                            }
                            aVar3 = aVar2;
                            long jH = androidx.compose.ui.unit.v.h(jE);
                            androidx.compose.ui.unit.w layoutDirection = iVar.getLayoutDirection();
                            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU = aVar3.U();
                            androidx.compose.ui.unit.d dVarA = c0286aU.a();
                            androidx.compose.ui.unit.w wVarB = c0286aU.b();
                            final kotlin.jvm.internal.i1.h hVar4 = hVar2;
                            androidx.compose.ui.graphics.k0 k0VarC = c0286aU.c();
                            long jD2 = c0286aU.d();
                            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU2 = aVar3.U();
                            c0286aU2.l(iVar);
                            c0286aU2.m(layoutDirection);
                            c0286aU2.k(k0Var);
                            c0286aU2.n(jH);
                            k0Var.save();
                            long jA = androidx.compose.ui.graphics.q0.f38131b.a();
                            androidx.compose.ui.graphics.d0.a aVar5 = androidx.compose.ui.graphics.d0.f37693b;
                            androidx.compose.ui.graphics.drawscope.f.V3(aVar3, jA, 0L, jH, 0.0f, null, null, aVar5.a(), 58, null);
                            f11 = -bounds.t();
                            f12 = -bounds.B();
                            aVar3.Z3().i().c(f11, f12);
                            f14 = f12;
                            f13 = f11;
                            aVar4 = aVar3;
                            final androidx.compose.ui.graphics.r0 r0Var = r0VarD;
                            androidx.compose.ui.graphics.drawscope.f.L3(aVar4, aVar.b(), i0Var, 0.0f, new androidx.compose.ui.graphics.drawscope.n(f10 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float f15 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (aVar4.d() >> 32)) + f15) / Float.intBitsToFloat((int) (aVar4.d() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (aVar4.d() & com.rabbitmq.client.k0.f265952a)) + f15) / Float.intBitsToFloat((int) (aVar4.d() & com.rabbitmq.client.k0.f265952a));
                            long jY = aVar4.Y();
                            dVarZ3 = aVar4.Z3();
                            jD = dVarZ3.d();
                            dVarZ3.f().save();
                            dVarZ3.i().g(fIntBitsToFloat, fIntBitsToFloat2, jY);
                            j10 = jD;
                            androidx.compose.ui.graphics.drawscope.f.L3(aVar4, k2VarN, i0Var, 0.0f, null, null, aVar5.a(), 28, null);
                            dVarZ3.f().B();
                            dVarZ3.g(j10);
                            aVar4.Z3().i().c(-f13, -f14);
                            k0Var.B();
                            androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU3 = aVar4.U();
                            c0286aU3.l(dVarA);
                            c0286aU3.m(wVarB);
                            c0286aU3.k(k0VarC);
                            c0286aU3.n(jD2);
                            r11.b();
                            hVar4.f312751a = r11;
                            return iVar.N(new Function1() { // from class: androidx.compose.foundation.x0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return z0.N9(bounds, hVar4, jE, r0Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                                }
                            });
                        }
                        hVar = hVar3;
                        androidx.compose.ui.graphics.drawscope.f.L3(aVar4, k2VarN, i0Var, 0.0f, null, null, aVar5.a(), 28, null);
                        dVarZ3.f().B();
                        dVarZ3.g(j10);
                        aVar4.Z3().i().c(-f13, -f14);
                        k0Var.B();
                        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU4 = aVar4.U();
                        c0286aU4.l(dVarA);
                        c0286aU4.m(wVarB);
                        c0286aU4.k(k0VarC);
                        c0286aU4.n(jD2);
                        r11.b();
                        hVar4.f312751a = r11;
                        return iVar.N(new Function1() { // from class: androidx.compose.foundation.x0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return z0.N9(bounds, hVar4, jE, r0Var, (androidx.compose.ui.graphics.drawscope.c) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = dVarZ3;
                        dVar.f().B();
                        dVar.g(j10);
                        throw th;
                    }
                    dVarZ3.i().g(fIntBitsToFloat, fIntBitsToFloat2, jY);
                    j10 = jD;
                } catch (Throwable th3) {
                    th = th3;
                    dVar = dVarZ3;
                    j10 = jD;
                }
                androidx.compose.ui.graphics.drawscope.f.L3(aVar4, aVar.b(), i0Var, 0.0f, new androidx.compose.ui.graphics.drawscope.n(f10 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f16 = 1;
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (aVar4.d() >> 32)) + f16) / Float.intBitsToFloat((int) (aVar4.d() >> 32));
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (aVar4.d() & com.rabbitmq.client.k0.f265952a)) + f16) / Float.intBitsToFloat((int) (aVar4.d() & com.rabbitmq.client.k0.f265952a));
                long jY2 = aVar4.Y();
                dVarZ3 = aVar4.Z3();
                jD = dVarZ3.d();
                dVarZ3.f().save();
            } catch (Throwable th4) {
                th = th4;
                aVar4.Z3().i().c(-f13, -f14);
                throw th;
            }
            f14 = f12;
            f13 = f11;
            aVar4 = aVar3;
            final androidx.compose.ui.graphics.r0 r0Var2 = r0VarD;
        } catch (Throwable th5) {
            th = th5;
            f13 = f11;
            f14 = f12;
            aVar4 = aVar3;
        }
        hVar2 = hVar;
        t1VarB = androidx.compose.ui.graphics.v1.b((int) (jE >> 32), (int) (jE & com.rabbitmq.client.k0.f265952a), i10, false, null, 24, null);
        q0Var2.f18524a = t1VarB;
        k0VarA = androidx.compose.ui.graphics.m0.a(t1VarB);
        q0Var2.f18525b = k0VarA;
        ?? r12 = t1VarB;
        androidx.compose.ui.graphics.k0 k0Var2 = k0VarA;
        aVar2 = q0Var2.f18526c;
        if (aVar2 == null) {
            aVar2 = new androidx.compose.ui.graphics.drawscope.a();
            q0Var2.f18526c = aVar2;
        }
        aVar3 = aVar2;
        long jH2 = androidx.compose.ui.unit.v.h(jE);
        androidx.compose.ui.unit.w layoutDirection2 = iVar.getLayoutDirection();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU5 = aVar3.U();
        androidx.compose.ui.unit.d dVarA2 = c0286aU5.a();
        androidx.compose.ui.unit.w wVarB2 = c0286aU5.b();
        final kotlin.jvm.internal.i1.h hVar5 = hVar2;
        androidx.compose.ui.graphics.k0 k0VarC2 = c0286aU5.c();
        long jD3 = c0286aU5.d();
        androidx.compose.ui.graphics.drawscope.a.C0286a c0286aU6 = aVar3.U();
        c0286aU6.l(iVar);
        c0286aU6.m(layoutDirection2);
        c0286aU6.k(k0Var2);
        c0286aU6.n(jH2);
        k0Var2.save();
        long jA2 = androidx.compose.ui.graphics.q0.f38131b.a();
        androidx.compose.ui.graphics.d0.a aVar6 = androidx.compose.ui.graphics.d0.f37693b;
        androidx.compose.ui.graphics.drawscope.f.V3(aVar3, jA2, 0L, jH2, 0.0f, null, null, aVar6.a(), 58, null);
        f11 = -bounds.t();
        f12 = -bounds.B();
        aVar3.Z3().i().c(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M9(androidx.compose.ui.graphics.f2.a aVar, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        int i10 = 4 >> 0;
        androidx.compose.ui.graphics.drawscope.f.L3(cVar, aVar.b(), i0Var, 0.0f, null, null, 0, 60, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N9(n0.j jVar, kotlin.jvm.internal.i1.h hVar, long j10, androidx.compose.ui.graphics.r0 r0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        float fT = jVar.t();
        float fB = jVar.B();
        cVar.Z3().i().c(fT, fB);
        try {
            androidx.compose.ui.graphics.drawscope.f.z0(cVar, (androidx.compose.ui.graphics.t1) hVar.f312751a, 0L, j10, 0L, 0L, 0.0f, null, r0Var, 0, 0, 890, null);
            return Unit.f312394a;
        } finally {
            cVar.Z3().i().c(-fT, -fB);
        }
    }

    private final androidx.compose.ui.draw.o O9(androidx.compose.ui.draw.i iVar, final androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.f2.c cVar, final long j10, final long j11, final boolean z10, final float f10) {
        if (n0.m.q(cVar.b())) {
            final long jT = cVar.b().t();
            final float f11 = f10 / 2;
            final androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(f10, 0.0f, 0, 0, null, 30, null);
            return iVar.N(new Function1() { // from class: androidx.compose.foundation.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z0.P9(z10, i0Var, jT, f11, f10, j10, j11, nVar, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            });
        }
        if (this.Y == null) {
            this.Y = new q0(null, null, null, null, 15, null);
        }
        q0 q0Var = this.Y;
        Intrinsics.checkNotNull(q0Var);
        final androidx.compose.ui.graphics.k2 k2VarM = t0.m(q0Var.n(), cVar.b(), f10, z10);
        return iVar.N(new Function1() { // from class: androidx.compose.foundation.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z0.Q9(k2VarM, i0Var, (androidx.compose.ui.graphics.drawscope.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P9(boolean z10, androidx.compose.ui.graphics.i0 i0Var, long j10, float f10, float f11, long j11, long j12, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        if (z10) {
            androidx.compose.ui.graphics.drawscope.f.C8(cVar, i0Var, 0L, 0L, j10, 0.0f, null, null, 0, com.planner5d.library.engine.input.f.b.P1, null);
        } else if (Float.intBitsToFloat((int) (j10 >> 32)) < f10) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.d() >> 32)) - f11;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.d() & com.rabbitmq.client.k0.f265952a)) - f11;
            int iA = androidx.compose.ui.graphics.p0.f38096b.a();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().b(f11, f11, fIntBitsToFloat, fIntBitsToFloat2, iA);
                androidx.compose.ui.graphics.drawscope.f.C8(cVar, i0Var, 0L, 0L, j10, 0.0f, null, null, 0, com.planner5d.library.engine.input.f.b.P1, null);
            } finally {
                dVarZ3.f().B();
                dVarZ3.g(jD);
            }
        } else {
            androidx.compose.ui.graphics.drawscope.f.C8(cVar, i0Var, j11, j12, t0.r(j10, f10), 0.0f, nVar, null, 0, 208, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q9(androidx.compose.ui.graphics.k2 k2Var, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        int i10 = 4 << 0;
        androidx.compose.ui.graphics.drawscope.f.L3(cVar, k2Var, i0Var, 0.0f, null, null, 0, 60, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.o R9(z0 z0Var, androidx.compose.ui.draw.i iVar) {
        if (iVar.S7(z0Var.Z) < 0.0f || n0.n.q(iVar.d()) <= 0.0f) {
            return t0.n(iVar);
        }
        float f10 = 2;
        float fMin = Math.min(androidx.compose.ui.unit.h.x(z0Var.Z, androidx.compose.ui.unit.h.f42689b.a()) ? 1.0f : (float) Math.ceil(iVar.S7(z0Var.Z)), (float) Math.ceil(n0.n.q(iVar.d()) / f10));
        float f11 = fMin / f10;
        long jG = n0.g.g((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        long jF = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (iVar.d() & com.rabbitmq.client.k0.f265952a)) - fMin)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (iVar.d() >> 32)) - fMin)) << 32));
        boolean z10 = f10 * fMin > n0.n.q(iVar.d());
        androidx.compose.ui.graphics.f2 f2VarMo0createOutlinePq9zytI = z0Var.f21925p1.mo0createOutlinePq9zytI(iVar.d(), iVar.getLayoutDirection(), iVar);
        if (f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.a) {
            return z0Var.L9(iVar, z0Var.f21924p0, (androidx.compose.ui.graphics.f2.a) f2VarMo0createOutlinePq9zytI, z10, fMin);
        }
        if (f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.c) {
            return z0Var.O9(iVar, z0Var.f21924p0, (androidx.compose.ui.graphics.f2.c) f2VarMo0createOutlinePq9zytI, jG, jF, z10, fMin);
        }
        if (f2VarMo0createOutlinePq9zytI instanceof androidx.compose.ui.graphics.f2.b) {
            return t0.p(iVar, z0Var.f21924p0, jG, jF, z10, fMin);
        }
        throw new kotlin.k0();
    }

    @Override // androidx.compose.ui.node.i2
    public boolean N4() {
        return this.X;
    }

    public final void P6(@NotNull androidx.compose.ui.graphics.i0 i0Var) {
        if (Intrinsics.areEqual(this.f21924p0, i0Var)) {
            return;
        }
        this.f21924p0 = i0Var;
        this.H1.M6();
    }

    public final void Q3(@NotNull androidx.compose.ui.graphics.q3 q3Var) {
        if (Intrinsics.areEqual(this.f21925p1, q3Var)) {
            return;
        }
        this.f21925p1 = q3Var;
        this.H1.M6();
    }

    public final float S9() {
        return this.Z;
    }

    public final void T9(float f10) {
        if (!androidx.compose.ui.unit.h.x(this.Z, f10)) {
            this.Z = f10;
            this.H1.M6();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f21926w;
    }

    @NotNull
    public final androidx.compose.ui.graphics.i0 o0() {
        return this.f21924p0;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 t3() {
        return this.f21925p1;
    }

    private z0(float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var) {
        this.Z = f10;
        this.f21924p0 = i0Var;
        this.f21925p1 = q3Var;
        this.H1 = (androidx.compose.ui.draw.g) v9(androidx.compose.ui.draw.n.a(new Function1() { // from class: androidx.compose.foundation.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z0.R9(this.f21908a, (androidx.compose.ui.draw.i) obj);
            }
        }));
    }
}
