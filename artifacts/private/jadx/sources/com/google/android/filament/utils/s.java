package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/MatrixKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 5 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 6 Matrix.kt\ncom/google/android/filament/utils/Mat4\n+ 7 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,908:1\n134#2:909\n134#2:911\n145#2:913\n145#2:915\n145#2:917\n145#2:919\n134#2:921\n134#2:923\n134#2:925\n134#2:927\n145#2:929\n145#2:931\n145#2:933\n145#2:935\n622#3:910\n622#3:912\n622#3:914\n622#3:916\n622#3:918\n622#3:920\n622#3:922\n622#3:924\n622#3:926\n622#3:928\n622#3:930\n622#3:932\n622#3:934\n622#3:936\n622#3:938\n622#3:940\n622#3:942\n622#3:943\n622#3:945\n622#3:947\n622#3:949\n622#3:951\n622#3:953\n622#3:955\n622#3:957\n622#3:959\n622#3:961\n622#3:963\n622#3:965\n622#3:967\n622#3:969\n622#3:971\n622#3:973\n622#3:975\n622#3:977\n622#3:979\n622#3:981\n622#3:983\n622#3:985\n622#3:987\n622#3:989\n622#3:991\n622#3:992\n622#3:994\n622#3:996\n622#3:998\n622#3:1000\n622#3:1002\n622#3:1004\n622#3:1006\n622#3:1008\n622#3:1010\n622#3:1012\n622#3:1014\n622#3:1016\n622#3:1018\n622#3:1020\n622#3:1022\n622#3:1024\n622#3:1026\n622#3:1028\n622#3:1030\n622#3:1032\n622#3:1034\n622#3:1036\n622#3:1038\n622#3:1040\n622#3:1042\n622#3:1044\n622#3:1046\n730#3:1049\n794#3:1060\n794#3:1073\n731#3:1081\n727#3:1088\n738#3:1090\n738#3:1091\n315#4:937\n315#4:939\n315#4:941\n315#4:944\n315#4:946\n333#4:948\n333#4:950\n333#4:952\n333#4:954\n333#4:956\n333#4:958\n315#4:960\n315#4:962\n315#4:964\n315#4:966\n315#4:968\n315#4:970\n333#4:972\n333#4:974\n333#4:976\n333#4:978\n333#4:980\n333#4:982\n336#4:1061\n337#4,3:1063\n336#4:1074\n337#4,3:1076\n323#4:1089\n575#5:984\n575#5:986\n575#5:988\n575#5:990\n575#5:993\n575#5:995\n575#5:997\n599#5:999\n599#5:1001\n599#5:1003\n599#5:1005\n599#5:1007\n599#5:1009\n599#5:1011\n599#5:1013\n575#5:1015\n575#5:1017\n575#5:1019\n575#5:1021\n575#5:1023\n575#5:1025\n575#5:1027\n575#5:1029\n599#5:1031\n599#5:1033\n599#5:1035\n599#5:1037\n599#5:1039\n599#5:1041\n599#5:1043\n599#5:1045\n424#5:1048\n424#5:1051\n424#5:1053\n424#5:1080\n287#6:1047\n289#6:1050\n266#6:1052\n271#6,6:1054\n266#6:1079\n271#6,6:1082\n48#7:1062\n48#7:1066\n34#7:1067\n34#7:1068\n34#7:1069\n34#7:1070\n34#7:1071\n34#7:1072\n46#7:1075\n48#7:1092\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/MatrixKt\n*L\n436#1:909\n437#1:911\n441#1:913\n442#1:915\n441#1:917\n442#1:919\n446#1:921\n447#1:923\n446#1:925\n447#1:927\n451#1:929\n452#1:931\n451#1:933\n452#1:935\n436#1:910\n437#1:912\n441#1:914\n442#1:916\n441#1:918\n442#1:920\n446#1:922\n447#1:924\n446#1:926\n447#1:928\n451#1:930\n452#1:932\n451#1:934\n452#1:936\n456#1:938\n457#1:940\n458#1:942\n456#1:943\n457#1:945\n458#1:947\n462#1:949\n463#1:951\n464#1:953\n462#1:955\n463#1:957\n464#1:959\n468#1:961\n469#1:963\n470#1:965\n468#1:967\n469#1:969\n470#1:971\n474#1:973\n475#1:975\n476#1:977\n474#1:979\n475#1:981\n476#1:983\n480#1:985\n481#1:987\n482#1:989\n483#1:991\n480#1:992\n481#1:994\n482#1:996\n483#1:998\n487#1:1000\n488#1:1002\n489#1:1004\n490#1:1006\n487#1:1008\n488#1:1010\n489#1:1012\n490#1:1014\n494#1:1016\n495#1:1018\n496#1:1020\n497#1:1022\n494#1:1024\n495#1:1026\n496#1:1028\n497#1:1030\n501#1:1032\n502#1:1034\n503#1:1036\n504#1:1038\n501#1:1040\n502#1:1042\n503#1:1044\n504#1:1046\n619#1:1049\n644#1:1060\n759#1:1073\n875#1:1081\n875#1:1088\n883#1:1090\n884#1:1091\n456#1:937\n457#1:939\n458#1:941\n457#1:944\n458#1:946\n462#1:948\n463#1:950\n464#1:952\n462#1:954\n463#1:956\n464#1:958\n468#1:960\n469#1:962\n470#1:964\n468#1:966\n469#1:968\n470#1:970\n474#1:972\n475#1:974\n476#1:976\n474#1:978\n475#1:980\n476#1:982\n644#1:1061\n644#1:1063,3\n759#1:1074\n759#1:1076,3\n878#1:1089\n480#1:984\n481#1:986\n482#1:988\n483#1:990\n481#1:993\n482#1:995\n483#1:997\n487#1:999\n488#1:1001\n489#1:1003\n490#1:1005\n487#1:1007\n488#1:1009\n489#1:1011\n490#1:1013\n494#1:1015\n495#1:1017\n496#1:1019\n497#1:1021\n494#1:1023\n495#1:1025\n496#1:1027\n497#1:1029\n501#1:1031\n502#1:1033\n503#1:1035\n504#1:1037\n501#1:1039\n502#1:1041\n503#1:1043\n504#1:1045\n619#1:1048\n622#1:1051\n624#1:1053\n875#1:1080\n619#1:1047\n622#1:1050\n624#1:1052\n624#1:1054,6\n875#1:1079\n875#1:1082,6\n644#1:1062\n707#1:1066\n762#1:1067\n772#1:1068\n782#1:1069\n792#1:1070\n802#1:1071\n812#1:1072\n822#1:1075\n889#1:1092\n*E\n"})
public final class s {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104966a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.f104824e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.f104823d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.f104825f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.f104826g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.f104828i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.f104827h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f104966a = iArr;
        }
    }

    @NotNull
    public static final c A(@NotNull q a10, @NotNull q b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        g gVarD = a10.D();
        g gVarD2 = b10.D();
        boolean z10 = false;
        boolean z11 = !(Math.abs(gVarD.Q() - gVarD2.Q()) < f10 && Math.abs(gVarD.U() - gVarD2.U()) < f10 && Math.abs(gVarD.V() - gVarD2.V()) < f10 && Math.abs(gVarD.P() - gVarD2.P()) < f10);
        g gVarE = a10.E();
        g gVarE2 = b10.E();
        boolean z12 = !(Math.abs(gVarE.Q() - gVarE2.Q()) < f10 && Math.abs(gVarE.U() - gVarE2.U()) < f10 && Math.abs(gVarE.V() - gVarE2.V()) < f10 && Math.abs(gVarE.P() - gVarE2.P()) < f10);
        g gVarF = a10.F();
        g gVarF2 = b10.F();
        boolean z13 = !(Math.abs(gVarF.Q() - gVarF2.Q()) < f10 && Math.abs(gVarF.U() - gVarF2.U()) < f10 && Math.abs(gVarF.V() - gVarF2.V()) < f10 && Math.abs(gVarF.P() - gVarF2.P()) < f10);
        g gVarC = a10.C();
        g gVarC2 = b10.C();
        if (Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10) {
            z10 = true;
        }
        return new c(z11, z12, z13, !z10);
    }

    public static /* synthetic */ com.google.android.filament.utils.a B(o a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        e eVarS = a10.s();
        boolean z10 = false;
        boolean z11 = !(Math.abs(eVarS.z() - f10) < f11 && Math.abs(eVarS.B() - f10) < f11);
        e eVarT = a10.t();
        if (Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, !z10);
    }

    public static /* synthetic */ com.google.android.filament.utils.a C(o a10, o b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        e eVarS = a10.s();
        e eVarS2 = b10.s();
        boolean z10 = false;
        boolean z11 = !(Math.abs(eVarS.z() - eVarS2.z()) < f10 && Math.abs(eVarS.B() - eVarS2.B()) < f10);
        e eVarT = a10.t();
        e eVarT2 = b10.t();
        if (Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, !z10);
    }

    public static /* synthetic */ b D(p a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        f fVarT = a10.t();
        boolean z10 = false;
        boolean z11 = !(Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11);
        f fVarU = a10.u();
        boolean z12 = !(Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11);
        f fVarV = a10.v();
        if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
            z10 = true;
        }
        return new b(z11, z12, !z10);
    }

    public static /* synthetic */ b E(p a10, p b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        f fVarT = a10.t();
        f fVarT2 = b10.t();
        boolean z10 = false;
        boolean z11 = !(Math.abs(fVarT.H() - fVarT2.H()) < f10 && Math.abs(fVarT.K() - fVarT2.K()) < f10 && Math.abs(fVarT.L() - fVarT2.L()) < f10);
        f fVarU = a10.u();
        f fVarU2 = b10.u();
        boolean z12 = !(Math.abs(fVarU.H() - fVarU2.H()) < f10 && Math.abs(fVarU.K() - fVarU2.K()) < f10 && Math.abs(fVarU.L() - fVarU2.L()) < f10);
        f fVarV = a10.v();
        f fVarV2 = b10.v();
        if (Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10) {
            z10 = true;
        }
        return new b(z11, z12, !z10);
    }

    public static /* synthetic */ c F(q a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        g gVarD = a10.D();
        boolean z10 = false;
        boolean z11 = !(Math.abs(gVarD.Q() - f10) < f11 && Math.abs(gVarD.U() - f10) < f11 && Math.abs(gVarD.V() - f10) < f11 && Math.abs(gVarD.P() - f10) < f11);
        g gVarE = a10.E();
        boolean z12 = !(Math.abs(gVarE.Q() - f10) < f11 && Math.abs(gVarE.U() - f10) < f11 && Math.abs(gVarE.V() - f10) < f11 && Math.abs(gVarE.P() - f10) < f11);
        g gVarF = a10.F();
        boolean z13 = !(Math.abs(gVarF.Q() - f10) < f11 && Math.abs(gVarF.U() - f10) < f11 && Math.abs(gVarF.V() - f10) < f11 && Math.abs(gVarF.P() - f10) < f11);
        g gVarC = a10.C();
        if (Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11) {
            z10 = true;
        }
        return new c(z11, z12, z13, !z10);
    }

    public static /* synthetic */ c G(q a10, q b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        g gVarD = a10.D();
        g gVarD2 = b10.D();
        boolean z10 = false;
        boolean z11 = !(Math.abs(gVarD.Q() - gVarD2.Q()) < f10 && Math.abs(gVarD.U() - gVarD2.U()) < f10 && Math.abs(gVarD.V() - gVarD2.V()) < f10 && Math.abs(gVarD.P() - gVarD2.P()) < f10);
        g gVarE = a10.E();
        g gVarE2 = b10.E();
        boolean z12 = !(Math.abs(gVarE.Q() - gVarE2.Q()) < f10 && Math.abs(gVarE.U() - gVarE2.U()) < f10 && Math.abs(gVarE.V() - gVarE2.V()) < f10 && Math.abs(gVarE.P() - gVarE2.P()) < f10);
        g gVarF = a10.F();
        g gVarF2 = b10.F();
        boolean z13 = !(Math.abs(gVarF.Q() - gVarF2.Q()) < f10 && Math.abs(gVarF.U() - gVarF2.U()) < f10 && Math.abs(gVarF.V() - gVarF2.V()) < f10 && Math.abs(gVarF.P() - gVarF2.P()) < f10);
        g gVarC = a10.C();
        g gVarC2 = b10.C();
        if (Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10) {
            z10 = true;
        }
        return new c(z11, z12, z13, !z10);
    }

    @NotNull
    public static final q H(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 - f10;
        float f17 = f13 - f12;
        float f18 = f15 - f14;
        return new q(new g(2.0f / f16, 0.0f, 0.0f, 0.0f, 14, null), new g(0.0f, 2.0f / f17, 0.0f, 0.0f, 13, null), new g(0.0f, 0.0f, (-2.0f) / f18, 0.0f, 11, null), new g((-(f11 + f10)) / f16, (-(f13 + f12)) / f17, (-(f15 + f14)) / f18, 1.0f));
    }

    @NotNull
    public static final q I(float f10, float f11, float f12, float f13) {
        float fTan = 1.0f / ((float) Math.tan((f10 * 0.017453292f) * 0.5f));
        float f14 = f13 - f12;
        return new q(new g(fTan / f11, 0.0f, 0.0f, 0.0f, 14, null), new g(0.0f, fTan, 0.0f, 0.0f, 13, null), new g(0.0f, 0.0f, (f13 + f12) / f14, 1.0f, 3, null), new g(0.0f, 0.0f, -(((f13 * 2.0f) * f12) / f14), 0.0f, 11, null));
    }

    @NotNull
    public static final w J(@NotNull q m10) {
        w wVar;
        Intrinsics.checkNotNullParameter(m10, "m");
        float fQ = m10.D().Q() + m10.E().U() + m10.F().V();
        if (fQ > 0.0f) {
            float fSqrt = ((float) Math.sqrt(fQ + 1.0f)) * 2.0f;
            wVar = new w((m10.E().V() - m10.F().U()) / fSqrt, (m10.F().Q() - m10.D().V()) / fSqrt, (m10.D().U() - m10.E().Q()) / fSqrt, fSqrt * 0.25f);
        } else if (m10.D().Q() > m10.E().U() && m10.D().Q() > m10.F().V()) {
            float fSqrt2 = ((float) Math.sqrt(((m10.D().Q() + 1.0f) - m10.E().U()) - m10.F().V())) * 2.0f;
            wVar = new w(0.25f * fSqrt2, (m10.E().Q() + m10.D().U()) / fSqrt2, (m10.F().Q() + m10.D().V()) / fSqrt2, (m10.E().V() - m10.F().U()) / fSqrt2);
        } else if (m10.E().U() > m10.F().V()) {
            float fSqrt3 = ((float) Math.sqrt(((m10.E().U() + 1.0f) - m10.D().Q()) - m10.F().V())) * 2.0f;
            wVar = new w((m10.E().Q() + m10.D().U()) / fSqrt3, 0.25f * fSqrt3, (m10.F().U() + m10.E().V()) / fSqrt3, (m10.F().Q() - m10.D().V()) / fSqrt3);
        } else {
            float fSqrt4 = ((float) Math.sqrt(((m10.F().V() + 1.0f) - m10.D().Q()) - m10.E().U())) * 2.0f;
            wVar = new w((m10.F().Q() + m10.D().V()) / fSqrt4, (m10.F().U() + m10.E().V()) / fSqrt4, 0.25f * fSqrt4, (m10.D().U() - m10.E().Q()) / fSqrt4);
        }
        return y.M(wVar);
    }

    @NotNull
    public static final q K(float f10, float f11, float f12, @NotNull c0 order) {
        Intrinsics.checkNotNullParameter(order, "order");
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        double d11 = f11;
        float fCos2 = (float) Math.cos(d11);
        float fSin2 = (float) Math.sin(d11);
        double d12 = f12;
        float fCos3 = (float) Math.cos(d12);
        float fSin3 = (float) Math.sin(d12);
        switch (a.f104966a[order.ordinal()]) {
            case 1:
                float f13 = fCos * fCos3;
                float f14 = fCos3 * fSin;
                return q.f104954e.b(fCos2 * fCos3, -fSin2, fCos2 * fSin3, 0.0f, (fSin * fSin3) + (f13 * fSin2), fCos * fCos2, ((fCos * fSin2) * fSin3) - f14, 0.0f, (f14 * fSin2) - (fCos * fSin3), fCos2 * fSin, f13 + (fSin * fSin2 * fSin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 2:
                float f15 = -fCos2;
                float f16 = fCos3 * fSin;
                float f17 = fCos3 * fCos;
                return q.f104954e.b(fCos2 * fCos3, f15 * fSin3, fSin2, 0.0f, (fCos * fSin3) + (f16 * fSin2), f17 - ((fSin * fSin2) * fSin3), f15 * fSin, 0.0f, (fSin * fSin3) - (f17 * fSin2), f16 + (fCos * fSin2 * fSin3), fCos * fCos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 3:
                float f18 = fCos * fCos3;
                float f19 = fCos3 * fSin;
                return q.f104954e.b(f18 + (fSin * fSin2 * fSin3), (f19 * fSin2) - (fCos * fSin3), fCos2 * fSin, 0.0f, fCos2 * fSin3, fCos3 * fCos2, -fSin2, 0.0f, ((fCos * fSin2) * fSin3) - f19, (f18 * fSin2) + (fSin * fSin3), fCos * fCos2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 4:
                float f20 = fCos * fCos3;
                float f21 = fCos3 * fSin;
                float f22 = fCos3 * fCos2;
                float f23 = -fCos2;
                return q.f104954e.b(fCos * fCos2, (fSin * fSin3) - (f20 * fSin2), f21 + (fCos * fSin2 * fSin3), 0.0f, fSin2, f22, f23 * fSin3, 0.0f, f23 * fSin, (fCos * fSin3) + (f21 * fSin2), f20 - ((fSin * fSin2) * fSin3), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 5:
                float f24 = fCos3 * fSin;
                float f25 = fCos * fCos3;
                return q.f104954e.b(fCos * fCos2, ((fCos * fSin2) * fSin3) - f24, (fSin * fSin3) + (f25 * fSin2), 0.0f, fCos2 * fSin, f25 + (fSin * fSin2 * fSin3), (f24 * fSin2) - (fCos * fSin3), 0.0f, -fSin2, fSin3 * fCos2, fCos2 * fCos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            case 6:
                float f26 = fCos * fCos3;
                float f27 = -fCos2;
                float f28 = fCos3 * fSin;
                return q.f104954e.b(f26 - ((fSin * fSin2) * fSin3), f27 * fSin, (fCos * fSin3) + (f28 * fSin2), 0.0f, f28 + (fCos * fSin2 * fSin3), fCos * fCos2, (fSin * fSin3) - (f26 * fSin2), 0.0f, f27 * fSin3, fSin2, fCos2 * fCos3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            default:
                throw new k0();
        }
    }

    @NotNull
    public static final q L(@NotNull f axis, float f10) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        float fH = axis.H();
        float fK = axis.K();
        float fL = axis.L();
        double d10 = f10 * 0.017453292f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = 1.0f - fCos;
        float f12 = fH * fK * f11;
        float f13 = fL * fSin;
        float f14 = fH * fL * f11;
        float f15 = fK * fSin;
        float f16 = f12 + f13;
        float f17 = (fK * fK * f11) + fCos;
        float f18 = fK * fL * f11;
        float f19 = fH * fSin;
        return q.f104954e.b((fH * fH * f11) + fCos, f12 - f13, f14 + f15, 0.0f, f16, f17, f18 - f19, 0.0f, f14 - f15, f18 + f19, (fL * fL * f11) + fCos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @NotNull
    public static final q M(@NotNull f d10, @NotNull c0 order) {
        Intrinsics.checkNotNullParameter(d10, "d");
        Intrinsics.checkNotNullParameter(order, "order");
        f fVarI = f.i(d10, 0.0f, 0.0f, 0.0f, 7, null);
        fVarI.k0(fVarI.H() * 0.017453292f);
        fVarI.n0(fVarI.K() * 0.017453292f);
        fVarI.o0(fVarI.L() * 0.017453292f);
        return K(fVarI.s(order.p()), fVarI.s(order.n()), fVarI.s(order.o()), order);
    }

    @NotNull
    public static final q N(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = m10.D();
        f fVarW3 = i0.w3(new f(gVarD.Q(), gVarD.U(), gVarD.V()));
        g gVarE = m10.E();
        f fVarW4 = i0.w3(new f(gVarE.Q(), gVarE.U(), gVarE.V()));
        g gVarF = m10.F();
        return new q(fVarW3, fVarW4, i0.w3(new f(gVarF.Q(), gVarF.U(), gVarF.V())), (f) null, 8, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final q O(@NotNull w quaternion) {
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        w wVarM = y.M(quaternion);
        return new q(new g(1.0f - (((wVarM.B() * wVarM.B()) + (wVarM.C() * wVarM.C())) * 2.0f), ((wVarM.y() * wVarM.B()) + (wVarM.C() * wVarM.x())) * 2.0f, ((wVarM.y() * wVarM.C()) - (wVarM.B() * wVarM.x())) * 2.0f, 0.0f, 8, null), new g(((wVarM.y() * wVarM.B()) - (wVarM.C() * wVarM.x())) * 2.0f, 1.0f - (((wVarM.y() * wVarM.y()) + (wVarM.C() * wVarM.C())) * 2.0f), ((wVarM.B() * wVarM.C()) + (wVarM.y() * wVarM.x())) * 2.0f, 0.0f, 8, null), new g(((wVarM.y() * wVarM.C()) + (wVarM.B() * wVarM.x())) * 2.0f, ((wVarM.B() * wVarM.C()) - (wVarM.y() * wVarM.x())) * 2.0f, 1.0f - (((wVarM.y() * wVarM.y()) + (wVarM.B() * wVarM.B())) * 2.0f), 0.0f, 8, null), (g) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ q P(float f10, float f11, float f12, c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            c0Var = c0.f104828i;
        }
        return K(f10, f11, f12, c0Var);
    }

    public static /* synthetic */ q Q(f fVar, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = c0.f104828i;
        }
        return M(fVar, c0Var);
    }

    @NotNull
    public static final q R(@NotNull f s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        return new q(new g(s10.H(), 0.0f, 0.0f, 0.0f, 14, null), new g(0.0f, s10.K(), 0.0f, 0.0f, 13, null), new g(0.0f, 0.0f, s10.L(), 0.0f, 11, null), (g) null, 8, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final q S(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = m10.D();
        f fVar = new f(gVarD.Q(), gVarD.U(), gVarD.V());
        float fSqrt = (float) Math.sqrt((fVar.H() * fVar.H()) + (fVar.K() * fVar.K()) + (fVar.L() * fVar.L()));
        g gVarE = m10.E();
        f fVar2 = new f(gVarE.Q(), gVarE.U(), gVarE.V());
        float fSqrt2 = (float) Math.sqrt((fVar2.H() * fVar2.H()) + (fVar2.K() * fVar2.K()) + (fVar2.L() * fVar2.L()));
        g gVarF = m10.F();
        f fVar3 = new f(gVarF.Q(), gVarF.U(), gVarF.V());
        return R(new f(fSqrt, fSqrt2, (float) Math.sqrt((fVar3.H() * fVar3.H()) + (fVar3.K() * fVar3.K()) + (fVar3.L() * fVar3.L()))));
    }

    @NotNull
    public static final q T(@NotNull f t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        int i10 = 0 << 0;
        return new q((g) null, (g) null, (g) null, new g(t10, 1.0f), 7, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final q U(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarC = m10.C();
        return T(new f(gVarC.Q(), gVarC.U(), gVarC.V()));
    }

    @NotNull
    public static final o V(@NotNull o m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new o(new e(m10.s().z(), m10.t().z()), new e(m10.s().B(), m10.t().B()));
    }

    @NotNull
    public static final p W(@NotNull p m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new p(new f(m10.t().H(), m10.u().H(), m10.v().H()), new f(m10.t().K(), m10.u().K(), m10.v().K()), new f(m10.t().L(), m10.u().L(), m10.v().L()));
    }

    @NotNull
    public static final q X(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new q(new g(m10.D().Q(), m10.E().Q(), m10.F().Q(), m10.C().Q()), new g(m10.D().U(), m10.E().U(), m10.F().U(), m10.C().U()), new g(m10.D().V(), m10.E().V(), m10.F().V(), m10.C().V()), new g(m10.D().P(), m10.E().P(), m10.F().P(), m10.C().P()));
    }

    @NotNull
    public static final com.google.android.filament.utils.a a(@NotNull o a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        e eVarS = a10.s();
        boolean z10 = false;
        boolean z11 = Math.abs(eVarS.z() - f10) < f11 && Math.abs(eVarS.B() - f10) < f11;
        e eVarT = a10.t();
        if (Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, z10);
    }

    @NotNull
    public static final com.google.android.filament.utils.a b(@NotNull o a10, @NotNull o b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        e eVarS = a10.s();
        e eVarS2 = b10.s();
        boolean z10 = false;
        boolean z11 = Math.abs(eVarS.z() - eVarS2.z()) < f10 && Math.abs(eVarS.B() - eVarS2.B()) < f10;
        e eVarT = a10.t();
        e eVarT2 = b10.t();
        if (Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, z10);
    }

    @NotNull
    public static final b c(@NotNull p a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        f fVarT = a10.t();
        boolean z10 = false;
        boolean z11 = Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11;
        f fVarU = a10.u();
        boolean z12 = Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11;
        f fVarV = a10.v();
        if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
            z10 = true;
        }
        return new b(z11, z12, z10);
    }

    @NotNull
    public static final b d(@NotNull p a10, @NotNull p b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        f fVarT = a10.t();
        f fVarT2 = b10.t();
        boolean z10 = false;
        boolean z11 = Math.abs(fVarT.H() - fVarT2.H()) < f10 && Math.abs(fVarT.K() - fVarT2.K()) < f10 && Math.abs(fVarT.L() - fVarT2.L()) < f10;
        f fVarU = a10.u();
        f fVarU2 = b10.u();
        boolean z12 = Math.abs(fVarU.H() - fVarU2.H()) < f10 && Math.abs(fVarU.K() - fVarU2.K()) < f10 && Math.abs(fVarU.L() - fVarU2.L()) < f10;
        f fVarV = a10.v();
        f fVarV2 = b10.v();
        if (Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10) {
            z10 = true;
        }
        return new b(z11, z12, z10);
    }

    @NotNull
    public static final c e(@NotNull q a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        g gVarD = a10.D();
        boolean z10 = false;
        boolean z11 = Math.abs(gVarD.Q() - f10) < f11 && Math.abs(gVarD.U() - f10) < f11 && Math.abs(gVarD.V() - f10) < f11 && Math.abs(gVarD.P() - f10) < f11;
        g gVarE = a10.E();
        boolean z12 = Math.abs(gVarE.Q() - f10) < f11 && Math.abs(gVarE.U() - f10) < f11 && Math.abs(gVarE.V() - f10) < f11 && Math.abs(gVarE.P() - f10) < f11;
        g gVarF = a10.F();
        boolean z13 = Math.abs(gVarF.Q() - f10) < f11 && Math.abs(gVarF.U() - f10) < f11 && Math.abs(gVarF.V() - f10) < f11 && Math.abs(gVarF.P() - f10) < f11;
        g gVarC = a10.C();
        if (Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11) {
            z10 = true;
        }
        return new c(z11, z12, z13, z10);
    }

    @NotNull
    public static final c f(@NotNull q a10, @NotNull q b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        g gVarD = a10.D();
        g gVarD2 = b10.D();
        boolean z10 = false;
        boolean z11 = Math.abs(gVarD.Q() - gVarD2.Q()) < f10 && Math.abs(gVarD.U() - gVarD2.U()) < f10 && Math.abs(gVarD.V() - gVarD2.V()) < f10 && Math.abs(gVarD.P() - gVarD2.P()) < f10;
        g gVarE = a10.E();
        g gVarE2 = b10.E();
        boolean z12 = Math.abs(gVarE.Q() - gVarE2.Q()) < f10 && Math.abs(gVarE.U() - gVarE2.U()) < f10 && Math.abs(gVarE.V() - gVarE2.V()) < f10 && Math.abs(gVarE.P() - gVarE2.P()) < f10;
        g gVarF = a10.F();
        g gVarF2 = b10.F();
        boolean z13 = Math.abs(gVarF.Q() - gVarF2.Q()) < f10 && Math.abs(gVarF.U() - gVarF2.U()) < f10 && Math.abs(gVarF.V() - gVarF2.V()) < f10 && Math.abs(gVarF.P() - gVarF2.P()) < f10;
        g gVarC = a10.C();
        g gVarC2 = b10.C();
        if (Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10) {
            z10 = true;
        }
        return new c(z11, z12, z13, z10);
    }

    public static /* synthetic */ com.google.android.filament.utils.a g(o a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        e eVarS = a10.s();
        boolean z10 = false;
        boolean z11 = Math.abs(eVarS.z() - f10) < f11 && Math.abs(eVarS.B() - f10) < f11;
        e eVarT = a10.t();
        if (Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, z10);
    }

    public static /* synthetic */ com.google.android.filament.utils.a h(o a10, o b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        e eVarS = a10.s();
        e eVarS2 = b10.s();
        boolean z10 = false;
        boolean z11 = Math.abs(eVarS.z() - eVarS2.z()) < f10 && Math.abs(eVarS.B() - eVarS2.B()) < f10;
        e eVarT = a10.t();
        e eVarT2 = b10.t();
        if (Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, z10);
    }

    public static /* synthetic */ b i(p a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        f fVarT = a10.t();
        boolean z10 = false;
        boolean z11 = Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11;
        f fVarU = a10.u();
        boolean z12 = Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11;
        f fVarV = a10.v();
        if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
            z10 = true;
        }
        return new b(z11, z12, z10);
    }

    public static /* synthetic */ b j(p a10, p b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        f fVarT = a10.t();
        f fVarT2 = b10.t();
        boolean z10 = false;
        boolean z11 = Math.abs(fVarT.H() - fVarT2.H()) < f10 && Math.abs(fVarT.K() - fVarT2.K()) < f10 && Math.abs(fVarT.L() - fVarT2.L()) < f10;
        f fVarU = a10.u();
        f fVarU2 = b10.u();
        boolean z12 = Math.abs(fVarU.H() - fVarU2.H()) < f10 && Math.abs(fVarU.K() - fVarU2.K()) < f10 && Math.abs(fVarU.L() - fVarU2.L()) < f10;
        f fVarV = a10.v();
        f fVarV2 = b10.v();
        if (Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10) {
            z10 = true;
        }
        return new b(z11, z12, z10);
    }

    public static /* synthetic */ c k(q a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        g gVarD = a10.D();
        boolean z10 = false;
        boolean z11 = Math.abs(gVarD.Q() - f10) < f11 && Math.abs(gVarD.U() - f10) < f11 && Math.abs(gVarD.V() - f10) < f11 && Math.abs(gVarD.P() - f10) < f11;
        g gVarE = a10.E();
        boolean z12 = Math.abs(gVarE.Q() - f10) < f11 && Math.abs(gVarE.U() - f10) < f11 && Math.abs(gVarE.V() - f10) < f11 && Math.abs(gVarE.P() - f10) < f11;
        g gVarF = a10.F();
        boolean z13 = Math.abs(gVarF.Q() - f10) < f11 && Math.abs(gVarF.U() - f10) < f11 && Math.abs(gVarF.V() - f10) < f11 && Math.abs(gVarF.P() - f10) < f11;
        g gVarC = a10.C();
        if (Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11) {
            z10 = true;
        }
        return new c(z11, z12, z13, z10);
    }

    public static /* synthetic */ c l(q a10, q b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        g gVarD = a10.D();
        g gVarD2 = b10.D();
        boolean z10 = false;
        boolean z11 = Math.abs(gVarD.Q() - gVarD2.Q()) < f10 && Math.abs(gVarD.U() - gVarD2.U()) < f10 && Math.abs(gVarD.V() - gVarD2.V()) < f10 && Math.abs(gVarD.P() - gVarD2.P()) < f10;
        g gVarE = a10.E();
        g gVarE2 = b10.E();
        boolean z12 = Math.abs(gVarE.Q() - gVarE2.Q()) < f10 && Math.abs(gVarE.U() - gVarE2.U()) < f10 && Math.abs(gVarE.V() - gVarE2.V()) < f10 && Math.abs(gVarE.P() - gVarE2.P()) < f10;
        g gVarF = a10.F();
        g gVarF2 = b10.F();
        boolean z13 = Math.abs(gVarF.Q() - gVarF2.Q()) < f10 && Math.abs(gVarF.U() - gVarF2.U()) < f10 && Math.abs(gVarF.V() - gVarF2.V()) < f10 && Math.abs(gVarF.P() - gVarF2.P()) < f10;
        g gVarC = a10.C();
        g gVarC2 = b10.C();
        if (Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10) {
            z10 = true;
        }
        return new c(z11, z12, z13, z10);
    }

    @NotNull
    public static final f m(@NotNull q m10, @NotNull c0 order) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Intrinsics.checkNotNullParameter(order, "order");
        f fVar = new f(0.0f, 0.0f, 0.0f, 7, null);
        float f10 = 1.0f;
        switch (a.f104966a[order.ordinal()]) {
            case 1:
                h0 h0VarN = order.n();
                float fQ = m10.E().Q();
                if (fQ < -1.0f) {
                    f10 = -1.0f;
                } else if (fQ <= 1.0f) {
                    f10 = fQ;
                }
                fVar.X(h0VarN, (float) Math.asin(-f10));
                if (Math.abs(m10.E().Q()) >= 0.9999999f) {
                    fVar.X(order.p(), (float) Math.atan2(-m10.F().U(), m10.F().V()));
                    fVar.X(order.o(), 0.0f);
                } else {
                    fVar.X(order.p(), (float) Math.atan2(m10.E().V(), m10.E().U()));
                    fVar.X(order.o(), (float) Math.atan2(m10.F().Q(), m10.D().Q()));
                }
                break;
            case 2:
                h0 h0VarN2 = order.n();
                float fQ2 = m10.F().Q();
                if (fQ2 < -1.0f) {
                    f10 = -1.0f;
                } else if (fQ2 <= 1.0f) {
                    f10 = fQ2;
                }
                fVar.X(h0VarN2, (float) Math.asin(f10));
                if (Math.abs(m10.F().Q()) >= 0.9999999f) {
                    fVar.X(order.p(), (float) Math.atan2(m10.E().V(), m10.E().U()));
                    fVar.X(order.o(), 0.0f);
                } else {
                    fVar.X(order.p(), (float) Math.atan2(-m10.F().U(), m10.F().V()));
                    fVar.X(order.o(), (float) Math.atan2(-m10.E().Q(), m10.D().Q()));
                }
                break;
            case 3:
                h0 h0VarN3 = order.n();
                float fU = m10.F().U();
                if (fU < -1.0f) {
                    f10 = -1.0f;
                } else if (fU <= 1.0f) {
                    f10 = fU;
                }
                fVar.X(h0VarN3, (float) Math.asin(-f10));
                if (Math.abs(m10.F().U()) >= 0.9999999f) {
                    fVar.X(order.p(), (float) Math.atan2(-m10.D().V(), m10.D().Q()));
                    fVar.X(order.o(), 0.0f);
                } else {
                    fVar.X(order.p(), (float) Math.atan2(m10.F().Q(), m10.F().V()));
                    fVar.X(order.o(), (float) Math.atan2(m10.D().U(), m10.E().U()));
                }
                break;
            case 4:
                h0 h0VarN4 = order.n();
                float fU2 = m10.D().U();
                if (fU2 < -1.0f) {
                    f10 = -1.0f;
                } else if (fU2 <= 1.0f) {
                    f10 = fU2;
                }
                fVar.X(h0VarN4, (float) Math.asin(f10));
                if (Math.abs(m10.D().U()) >= 0.9999999f) {
                    fVar.X(order.o(), 0.0f);
                    fVar.X(order.p(), (float) Math.atan2(m10.F().Q(), m10.F().V()));
                } else {
                    fVar.X(order.o(), (float) Math.atan2(-m10.F().U(), m10.E().U()));
                    fVar.X(order.p(), (float) Math.atan2(-m10.D().V(), m10.D().Q()));
                }
                break;
            case 5:
                h0 h0VarN5 = order.n();
                float fV = m10.D().V();
                if (fV < -1.0f) {
                    f10 = -1.0f;
                } else if (fV <= 1.0f) {
                    f10 = fV;
                }
                fVar.X(h0VarN5, (float) Math.asin(-f10));
                if (Math.abs(m10.D().V()) >= 0.9999999f) {
                    fVar.X(order.o(), 0.0f);
                    fVar.X(order.p(), (float) Math.atan2(-m10.E().Q(), m10.E().U()));
                } else {
                    fVar.X(order.o(), (float) Math.atan2(m10.E().V(), m10.F().V()));
                    fVar.X(order.p(), (float) Math.atan2(m10.D().U(), m10.D().Q()));
                }
                break;
            case 6:
                h0 h0VarN6 = order.n();
                float fV2 = m10.E().V();
                if (fV2 < -1.0f) {
                    f10 = -1.0f;
                } else if (fV2 <= 1.0f) {
                    f10 = fV2;
                }
                fVar.X(h0VarN6, (float) Math.asin(f10));
                if (Math.abs(m10.E().V()) >= 0.9999999f) {
                    fVar.X(order.o(), 0.0f);
                    fVar.X(order.p(), (float) Math.atan2(m10.D().U(), m10.D().Q()));
                } else {
                    fVar.X(order.o(), (float) Math.atan2(-m10.D().V(), m10.F().V()));
                    fVar.X(order.p(), (float) Math.atan2(-m10.E().Q(), m10.E().U()));
                }
                break;
            default:
                throw new k0();
        }
        f fVarI = f.i(fVar, 0.0f, 0.0f, 0.0f, 7, null);
        fVarI.k0(fVarI.H() * 57.295776f);
        fVarI.n0(fVarI.K() * 57.295776f);
        fVarI.o0(fVarI.L() * 57.295776f);
        return fVarI;
    }

    public static /* synthetic */ f n(q qVar, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = c0.f104828i;
        }
        return m(qVar, c0Var);
    }

    @NotNull
    public static final p o(@NotNull p m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        float fH = m10.t().H();
        float fK = m10.t().K();
        float fL = m10.t().L();
        float fH2 = m10.u().H();
        float fK2 = m10.u().K();
        float fL2 = m10.u().L();
        float fH3 = m10.v().H();
        float fK3 = m10.v().K();
        float fL3 = m10.v().L();
        float f10 = (fK2 * fL3) - (fL2 * fK3);
        float f11 = (fL2 * fH3) - (fH2 * fL3);
        float f12 = (fH2 * fK3) - (fK2 * fH3);
        float f13 = (fH * f10) + (fK * f11) + (fL * f12);
        return p.f104949d.b(f10 / f13, f11 / f13, f12 / f13, ((fL * fK3) - (fK * fL3)) / f13, ((fL3 * fH) - (fL * fH3)) / f13, ((fH3 * fK) - (fK3 * fH)) / f13, ((fK * fL2) - (fL * fK2)) / f13, ((fL * fH2) - (fL2 * fH)) / f13, ((fH * fK2) - (fK * fH2)) / f13);
    }

    @NotNull
    public static final q p(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        q qVar = new q((g) null, (g) null, (g) null, (g) null, 15, (DefaultConstructorMarker) null);
        float fV = m10.F().V() * m10.C().P();
        float fV2 = m10.C().V() * m10.F().P();
        float fV3 = m10.E().V() * m10.C().P();
        float fV4 = m10.C().V() * m10.E().P();
        float fV5 = m10.E().V() * m10.F().P();
        float fV6 = m10.F().V() * m10.E().P();
        float fV7 = m10.D().V() * m10.C().P();
        float fV8 = m10.C().V() * m10.D().P();
        float fV9 = m10.D().V() * m10.F().P();
        float fV10 = m10.F().V() * m10.D().P();
        float fV11 = m10.D().V() * m10.E().P();
        float fV12 = m10.E().V() * m10.D().P();
        qVar.D().D0((m10.E().U() * fV) + (m10.F().U() * fV4) + (m10.C().U() * fV5));
        g gVarD = qVar.D();
        gVarD.D0(gVarD.Q() - (((m10.E().U() * fV2) + (m10.F().U() * fV3)) + (m10.C().U() * fV6)));
        qVar.D().H0((m10.D().U() * fV2) + (m10.F().U() * fV7) + (m10.C().U() * fV10));
        g gVarD2 = qVar.D();
        gVarD2.H0(gVarD2.U() - (((m10.D().U() * fV) + (m10.F().U() * fV8)) + (m10.C().U() * fV9)));
        qVar.D().I0((m10.D().U() * fV3) + (m10.E().U() * fV8) + (m10.C().U() * fV11));
        g gVarD3 = qVar.D();
        gVarD3.I0(gVarD3.V() - (((m10.D().U() * fV4) + (m10.E().U() * fV7)) + (m10.C().U() * fV12)));
        qVar.D().C0((m10.D().U() * fV6) + (m10.E().U() * fV9) + (m10.F().U() * fV12));
        g gVarD4 = qVar.D();
        gVarD4.C0(gVarD4.P() - (((m10.D().U() * fV5) + (m10.E().U() * fV10)) + (m10.F().U() * fV11)));
        qVar.E().D0((m10.E().Q() * fV2) + (m10.F().Q() * fV3) + (m10.C().Q() * fV6));
        g gVarE = qVar.E();
        gVarE.D0(gVarE.Q() - (((m10.E().Q() * fV) + (m10.F().Q() * fV4)) + (m10.C().Q() * fV5)));
        qVar.E().H0((fV * m10.D().Q()) + (m10.F().Q() * fV8) + (m10.C().Q() * fV9));
        g gVarE2 = qVar.E();
        gVarE2.H0(gVarE2.U() - (((fV2 * m10.D().Q()) + (m10.F().Q() * fV7)) + (m10.C().Q() * fV10)));
        qVar.E().I0((fV4 * m10.D().Q()) + (fV7 * m10.E().Q()) + (m10.C().Q() * fV12));
        g gVarE3 = qVar.E();
        gVarE3.I0(gVarE3.V() - (((fV3 * m10.D().Q()) + (fV8 * m10.E().Q())) + (m10.C().Q() * fV11)));
        qVar.E().C0((fV5 * m10.D().Q()) + (fV10 * m10.E().Q()) + (fV11 * m10.F().Q()));
        g gVarE4 = qVar.E();
        gVarE4.C0(gVarE4.P() - (((fV6 * m10.D().Q()) + (fV9 * m10.E().Q())) + (fV12 * m10.F().Q())));
        float fQ = m10.F().Q() * m10.C().U();
        float fQ2 = m10.C().Q() * m10.F().U();
        float fQ3 = m10.E().Q() * m10.C().U();
        float fQ4 = m10.C().Q() * m10.E().U();
        float fQ5 = m10.E().Q() * m10.F().U();
        float fQ6 = m10.F().Q() * m10.E().U();
        float fQ7 = m10.D().Q() * m10.C().U();
        float fQ8 = m10.C().Q() * m10.D().U();
        float fQ9 = m10.D().Q() * m10.F().U();
        float fQ10 = m10.F().Q() * m10.D().U();
        float fQ11 = m10.D().Q() * m10.E().U();
        float fQ12 = m10.E().Q() * m10.D().U();
        qVar.F().D0((m10.E().P() * fQ) + (m10.F().P() * fQ4) + (m10.C().P() * fQ5));
        g gVarF = qVar.F();
        gVarF.D0(gVarF.Q() - (((m10.E().P() * fQ2) + (m10.F().P() * fQ3)) + (m10.C().P() * fQ6)));
        qVar.F().H0((m10.D().P() * fQ2) + (m10.F().P() * fQ7) + (m10.C().P() * fQ10));
        g gVarF2 = qVar.F();
        gVarF2.H0(gVarF2.U() - (((m10.D().P() * fQ) + (m10.F().P() * fQ8)) + (m10.C().P() * fQ9)));
        qVar.F().I0((m10.D().P() * fQ3) + (m10.E().P() * fQ8) + (m10.C().P() * fQ11));
        g gVarF3 = qVar.F();
        gVarF3.I0(gVarF3.V() - (((m10.D().P() * fQ4) + (m10.E().P() * fQ7)) + (m10.C().P() * fQ12)));
        qVar.F().C0((m10.D().P() * fQ6) + (m10.E().P() * fQ9) + (m10.F().P() * fQ12));
        g gVarF4 = qVar.F();
        gVarF4.C0(gVarF4.P() - (((m10.D().P() * fQ5) + (m10.E().P() * fQ10)) + (m10.F().P() * fQ11)));
        qVar.C().D0((m10.F().V() * fQ3) + (m10.C().V() * fQ6) + (m10.E().V() * fQ2));
        g gVarC = qVar.C();
        gVarC.D0(gVarC.Q() - (((m10.C().V() * fQ5) + (m10.E().V() * fQ)) + (m10.F().V() * fQ4)));
        qVar.C().H0((m10.C().V() * fQ9) + (fQ * m10.D().V()) + (m10.F().V() * fQ8));
        g gVarC2 = qVar.C();
        gVarC2.H0(gVarC2.U() - (((m10.F().V() * fQ7) + (m10.C().V() * fQ10)) + (fQ2 * m10.D().V())));
        qVar.C().I0((fQ7 * m10.E().V()) + (m10.C().V() * fQ12) + (fQ4 * m10.D().V()));
        g gVarC3 = qVar.C();
        gVarC3.I0(gVarC3.V() - (((m10.C().V() * fQ11) + (fQ3 * m10.D().V())) + (fQ8 * m10.E().V())));
        qVar.C().C0((fQ11 * m10.F().V()) + (fQ5 * m10.D().V()) + (fQ10 * m10.E().V()));
        g gVarC4 = qVar.C();
        gVarC4.C0(gVarC4.P() - (((fQ9 * m10.E().V()) + (fQ12 * m10.F().V())) + (fQ6 * m10.D().V())));
        return qVar.l((m10.D().Q() * qVar.D().Q()) + (m10.E().Q() * qVar.D().U()) + (m10.F().Q() * qVar.D().V()) + (m10.C().Q() * qVar.D().P()));
    }

    @NotNull
    public static final q q(@NotNull f eye, @NotNull f target, @NotNull f up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(up, "up");
        return s(eye, new f(target.H() - eye.H(), target.K() - eye.K(), target.L() - eye.L()), up);
    }

    public static /* synthetic */ q r(f fVar, f fVar2, f fVar3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fVar3 = new f(0.0f, 0.0f, 1.0f, 3, null);
        }
        return q(fVar, fVar2, fVar3);
    }

    @NotNull
    public static final q s(@NotNull f eye, @NotNull f forward, @NotNull f up) {
        Intrinsics.checkNotNullParameter(eye, "eye");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(up, "up");
        f fVarW3 = i0.w3(forward);
        f fVarW4 = i0.w3(new f((fVarW3.K() * up.L()) - (fVarW3.L() * up.K()), (fVarW3.L() * up.H()) - (fVarW3.H() * up.L()), (fVarW3.H() * up.K()) - (fVarW3.K() * up.H())));
        boolean z10 = false | false;
        return new q(new g(fVarW4, 0.0f, 2, (DefaultConstructorMarker) null), new g(i0.w3(new f((fVarW4.K() * fVarW3.L()) - (fVarW4.L() * fVarW3.K()), (fVarW4.L() * fVarW3.H()) - (fVarW4.H() * fVarW3.L()), (fVarW4.H() * fVarW3.K()) - (fVarW4.K() * fVarW3.H()))), 0.0f, 2, (DefaultConstructorMarker) null), new g(fVarW3.u0(), 0.0f, 2, (DefaultConstructorMarker) null), new g(eye, 1.0f));
    }

    public static /* synthetic */ q t(f fVar, f fVar2, f fVar3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            int i11 = 7 >> 0;
            fVar3 = new f(0.0f, 0.0f, 1.0f, 3, null);
        }
        return s(fVar, fVar2, fVar3);
    }

    @NotNull
    public static final q u(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = m10.D();
        f fVar = new f(gVarD.Q(), gVarD.U(), gVarD.V());
        float fH = (fVar.H() * fVar.H()) + (fVar.K() * fVar.K()) + (fVar.L() * fVar.L());
        g gVarE = m10.E();
        f fVar2 = new f(gVarE.Q(), gVarE.U(), gVarE.V());
        float fH2 = (fVar2.H() * fVar2.H()) + (fVar2.K() * fVar2.K()) + (fVar2.L() * fVar2.L());
        g gVarF = m10.F();
        f fVar3 = new f(gVarF.Q(), gVarF.U(), gVarF.V());
        f fVar4 = new f(fH, fH2, (fVar3.H() * fVar3.H()) + (fVar3.K() * fVar3.K()) + (fVar3.L() * fVar3.L()));
        return R(new f(1.0f / fVar4.H(), 1.0f / fVar4.K(), 1.0f / fVar4.L())).X(m10);
    }

    @NotNull
    public static final com.google.android.filament.utils.a v(@NotNull o a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        e eVarS = a10.s();
        boolean z10 = false;
        boolean z11 = !(Math.abs(eVarS.z() - f10) < f11 && Math.abs(eVarS.B() - f10) < f11);
        e eVarT = a10.t();
        if (Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z11, !z10);
    }

    @NotNull
    public static final com.google.android.filament.utils.a w(@NotNull o a10, @NotNull o b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        e eVarS = a10.s();
        e eVarS2 = b10.s();
        boolean z10 = false;
        boolean z11 = !false;
        boolean z12 = !(Math.abs(eVarS.z() - eVarS2.z()) < f10 && Math.abs(eVarS.B() - eVarS2.B()) < f10);
        e eVarT = a10.t();
        e eVarT2 = b10.t();
        if (Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10) {
            z10 = true;
        }
        return new com.google.android.filament.utils.a(z12, !z10);
    }

    @NotNull
    public static final b x(@NotNull p a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        f fVarT = a10.t();
        boolean z10 = false;
        boolean z11 = !(Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11);
        f fVarU = a10.u();
        boolean z12 = !(Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11);
        f fVarV = a10.v();
        if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
            z10 = true;
        }
        return new b(z11, z12, !z10);
    }

    @NotNull
    public static final b y(@NotNull p a10, @NotNull p b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        f fVarT = a10.t();
        f fVarT2 = b10.t();
        boolean z10 = false;
        boolean z11 = !(Math.abs(fVarT.H() - fVarT2.H()) < f10 && Math.abs(fVarT.K() - fVarT2.K()) < f10 && Math.abs(fVarT.L() - fVarT2.L()) < f10);
        f fVarU = a10.u();
        f fVarU2 = b10.u();
        boolean z12 = !(Math.abs(fVarU.H() - fVarU2.H()) < f10 && Math.abs(fVarU.K() - fVarU2.K()) < f10 && Math.abs(fVarU.L() - fVarU2.L()) < f10);
        f fVarV = a10.v();
        f fVarV2 = b10.v();
        if (Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10) {
            z10 = true;
        }
        return new b(z11, z12, !z10);
    }

    @NotNull
    public static final c z(@NotNull q a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        g gVarD = a10.D();
        boolean z10 = false;
        boolean z11 = !(Math.abs(gVarD.Q() - f10) < f11 && Math.abs(gVarD.U() - f10) < f11 && Math.abs(gVarD.V() - f10) < f11 && Math.abs(gVarD.P() - f10) < f11);
        g gVarE = a10.E();
        boolean z12 = !(Math.abs(gVarE.Q() - f10) < f11 && Math.abs(gVarE.U() - f10) < f11 && Math.abs(gVarE.V() - f10) < f11 && Math.abs(gVarE.P() - f10) < f11);
        g gVarF = a10.F();
        boolean z13 = !(Math.abs(gVarF.Q() - f10) < f11 && Math.abs(gVarF.U() - f10) < f11 && Math.abs(gVarF.V() - f10) < f11 && Math.abs(gVarF.P() - f10) < f11);
        g gVarC = a10.C();
        if (Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11) {
            z10 = true;
        }
        return new c(z11, z12, z13, !z10);
    }
}
