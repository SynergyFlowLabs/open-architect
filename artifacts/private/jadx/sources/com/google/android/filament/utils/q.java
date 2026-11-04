package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,908:1\n266#1:932\n271#1:934\n276#1:936\n424#2:909\n426#2,4:910\n424#2:914\n426#2,4:915\n424#2:919\n426#2,4:920\n424#2:924\n426#2,4:925\n424#2:929\n424#2:931\n424#2:933\n424#2:935\n424#2:937\n424#2:941\n449#2,5:942\n563#2:947\n564#2:948\n565#2:949\n566#2:950\n567#2,2:951\n569#2,4:959\n567#2,2:963\n569#2,4:971\n567#2,2:975\n569#2,4:983\n567#2,2:987\n569#2,4:995\n567#2,2:999\n569#2,4:1007\n567#2,2:1011\n569#2,4:1019\n567#2,2:1023\n569#2,4:1031\n567#2,2:1035\n569#2,4:1043\n575#2:1047\n591#2,2:1049\n593#2,4:1057\n591#2,2:1061\n593#2,4:1069\n591#2,2:1073\n593#2,4:1081\n591#2,2:1085\n593#2,4:1093\n591#2,2:1097\n593#2,4:1105\n591#2,2:1109\n593#2,4:1117\n591#2,2:1121\n593#2,4:1129\n591#2,2:1133\n593#2,4:1141\n599#2:1145\n730#3:930\n617#3,6:953\n617#3,6:965\n617#3,6:977\n617#3,6:989\n617#3,6:1001\n617#3,6:1013\n617#3,6:1025\n617#3,6:1037\n622#3:1048\n617#3,6:1051\n617#3,6:1063\n617#3,6:1075\n617#3,6:1087\n617#3,6:1099\n617#3,6:1111\n617#3,6:1123\n617#3,6:1135\n622#3:1146\n46#4:938\n46#4:939\n46#4:940\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat4\n*L\n292#1:932\n293#1:934\n294#1:936\n266#1:909\n268#1:910,4\n271#1:914\n273#1:915,4\n276#1:919\n278#1:920,4\n281#1:924\n283#1:925,4\n287#1:929\n289#1:931\n292#1:933\n293#1:935\n294#1:937\n305#1:941\n328#1:942,5\n338#1:947\n339#1:948\n340#1:949\n341#1:950\n343#1:951,2\n343#1:959,4\n344#1:963,2\n344#1:971,4\n345#1:975,2\n345#1:983,4\n346#1:987,2\n346#1:995,4\n343#1:999,2\n343#1:1007,4\n344#1:1011,2\n344#1:1019,4\n345#1:1023,2\n345#1:1031,4\n346#1:1035,2\n346#1:1043,4\n350#1:1047\n380#1:1049,2\n380#1:1057,4\n381#1:1061,2\n381#1:1069,4\n382#1:1073,2\n382#1:1081,4\n383#1:1085,2\n383#1:1093,4\n380#1:1097,2\n380#1:1105,4\n381#1:1109,2\n381#1:1117,4\n382#1:1121,2\n382#1:1129,4\n383#1:1133,2\n383#1:1141,4\n387#1:1145\n287#1:930\n343#1:953,6\n344#1:965,6\n345#1:977,6\n346#1:989,6\n343#1:1001,6\n344#1:1013,6\n345#1:1025,6\n346#1:1037,6\n350#1:1048\n380#1:1051,6\n381#1:1063,6\n382#1:1075,6\n383#1:1087,6\n380#1:1099,6\n381#1:1111,6\n382#1:1123,6\n383#1:1135,6\n387#1:1146\n297#1:938\n298#1:939\n300#1:940\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f104954e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private g f104955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private g f104956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private g f104957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private g f104958d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final q a() {
            return new q((g) null, (g) null, (g) null, (g) null, 15, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final q b(@NotNull float... a10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            if (a10.length >= 16) {
                return new q(new g(a10[0], a10[4], a10[8], a10[12]), new g(a10[1], a10[5], a10[9], a10[13]), new g(a10[2], a10[6], a10[10], a10[14]), new g(a10[3], a10[7], a10[11], a10[15]));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104959a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104959a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q() {
        this((g) null, (g) null, (g) null, (g) null, 15, (DefaultConstructorMarker) null);
        int i10 = (3 >> 0) & 0;
    }

    public static /* synthetic */ f Z(q qVar, c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = c0.f104828i;
        }
        return qVar.Y(c0Var);
    }

    public static /* synthetic */ q c(q qVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        g gVarD = qVar.D();
        float fQ = gVarD.Q();
        float fCompare = Math.abs(fQ - f10) < f11 ? 0.0f : Float.compare(fQ, f10);
        float fU = gVarD.U();
        float fCompare2 = Math.abs(fU - f10) < f11 ? 0.0f : Float.compare(fU, f10);
        float fV = gVarD.V();
        float fCompare3 = Math.abs(fV - f10) < f11 ? 0.0f : Float.compare(fV, f10);
        float fP = gVarD.P();
        g gVar = new g(fCompare, fCompare2, fCompare3, Math.abs(fP - f10) < f11 ? 0.0f : Float.compare(fP, f10));
        g gVarE = qVar.E();
        float fQ2 = gVarE.Q();
        float fCompare4 = Math.abs(fQ2 - f10) < f11 ? 0.0f : Float.compare(fQ2, f10);
        float fU2 = gVarE.U();
        float fCompare5 = Math.abs(fU2 - f10) < f11 ? 0.0f : Float.compare(fU2, f10);
        float fV2 = gVarE.V();
        float fCompare6 = Math.abs(fV2 - f10) < f11 ? 0.0f : Float.compare(fV2, f10);
        float fP2 = gVarE.P();
        g gVar2 = new g(fCompare4, fCompare5, fCompare6, Math.abs(fP2 - f10) < f11 ? 0.0f : Float.compare(fP2, f10));
        g gVarF = qVar.F();
        float fQ3 = gVarF.Q();
        float fCompare7 = Math.abs(fQ3 - f10) < f11 ? 0.0f : Float.compare(fQ3, f10);
        float fU3 = gVarF.U();
        float fCompare8 = Math.abs(fU3 - f10) < f11 ? 0.0f : Float.compare(fU3, f10);
        float fV3 = gVarF.V();
        float fCompare9 = Math.abs(fV3 - f10) < f11 ? 0.0f : Float.compare(fV3, f10);
        float fP3 = gVarF.P();
        g gVar3 = new g(fCompare7, fCompare8, fCompare9, Math.abs(fP3 - f10) < f11 ? 0.0f : Float.compare(fP3, f10));
        g gVarC = qVar.C();
        float fQ4 = gVarC.Q();
        float fCompare10 = Math.abs(fQ4 - f10) < f11 ? 0.0f : Float.compare(fQ4, f10);
        float fU4 = gVarC.U();
        float fCompare11 = Math.abs(fU4 - f10) < f11 ? 0.0f : Float.compare(fU4, f10);
        float fV4 = gVarC.V();
        float fCompare12 = Math.abs(fV4 - f10) < f11 ? 0.0f : Float.compare(fV4, f10);
        float fP4 = gVarC.P();
        return new q(gVar, gVar2, gVar3, new g(fCompare10, fCompare11, fCompare12, Math.abs(fP4 - f10) >= f11 ? Float.compare(fP4, f10) : 0.0f));
    }

    public static /* synthetic */ q d(q qVar, q m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = qVar.D();
        g gVarD2 = m10.D();
        float fQ = gVarD.Q();
        float fQ2 = gVarD2.Q();
        float fCompare = Math.abs(fQ - fQ2) < f10 ? 0.0f : Float.compare(fQ, fQ2);
        float fU = gVarD.U();
        float fU2 = gVarD2.U();
        float fCompare2 = Math.abs(fU - fU2) < f10 ? 0.0f : Float.compare(fU, fU2);
        float fV = gVarD.V();
        float fV2 = gVarD2.V();
        float fCompare3 = Math.abs(fV - fV2) < f10 ? 0.0f : Float.compare(fV, fV2);
        float fP = gVarD.P();
        float fP2 = gVarD2.P();
        g gVar = new g(fCompare, fCompare2, fCompare3, Math.abs(fP - fP2) < f10 ? 0.0f : Float.compare(fP, fP2));
        g gVarE = qVar.E();
        g gVarE2 = m10.E();
        float fQ3 = gVarE.Q();
        float fQ4 = gVarE2.Q();
        float fCompare4 = Math.abs(fQ3 - fQ4) < f10 ? 0.0f : Float.compare(fQ3, fQ4);
        float fU3 = gVarE.U();
        float fU4 = gVarE2.U();
        float fCompare5 = Math.abs(fU3 - fU4) < f10 ? 0.0f : Float.compare(fU3, fU4);
        float fV3 = gVarE.V();
        float fV4 = gVarE2.V();
        float fCompare6 = Math.abs(fV3 - fV4) < f10 ? 0.0f : Float.compare(fV3, fV4);
        float fP3 = gVarE.P();
        float fP4 = gVarE2.P();
        g gVar2 = new g(fCompare4, fCompare5, fCompare6, Math.abs(fP3 - fP4) < f10 ? 0.0f : Float.compare(fP3, fP4));
        g gVarF = qVar.F();
        g gVarF2 = m10.F();
        float fQ5 = gVarF.Q();
        float fQ6 = gVarF2.Q();
        float fCompare7 = Math.abs(fQ5 - fQ6) < f10 ? 0.0f : Float.compare(fQ5, fQ6);
        float fU5 = gVarF.U();
        float fU6 = gVarF2.U();
        float fCompare8 = Math.abs(fU5 - fU6) < f10 ? 0.0f : Float.compare(fU5, fU6);
        float fV5 = gVarF.V();
        float fV6 = gVarF2.V();
        float fCompare9 = Math.abs(fV5 - fV6) < f10 ? 0.0f : Float.compare(fV5, fV6);
        float fP5 = gVarF.P();
        float fP6 = gVarF2.P();
        g gVar3 = new g(fCompare7, fCompare8, fCompare9, Math.abs(fP5 - fP6) < f10 ? 0.0f : Float.compare(fP5, fP6));
        g gVarC = qVar.C();
        g gVarC2 = m10.C();
        float fQ7 = gVarC.Q();
        float fQ8 = gVarC2.Q();
        float fCompare10 = Math.abs(fQ7 - fQ8) < f10 ? 0.0f : Float.compare(fQ7, fQ8);
        float fU7 = gVarC.U();
        float fU8 = gVarC2.U();
        float fCompare11 = Math.abs(fU7 - fU8) < f10 ? 0.0f : Float.compare(fU7, fU8);
        float fV7 = gVarC.V();
        float fV8 = gVarC2.V();
        float fCompare12 = Math.abs(fV7 - fV8) < f10 ? 0.0f : Float.compare(fV7, fV8);
        float fP7 = gVarC.P();
        float fP8 = gVarC2.P();
        return new q(gVar, gVar2, gVar3, new g(fCompare10, fCompare11, fCompare12, Math.abs(fP7 - fP8) >= f10 ? Float.compare(fP7, fP8) : 0.0f));
    }

    public static /* synthetic */ q j(q qVar, g gVar, g gVar2, g gVar3, g gVar4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = qVar.f104955a;
        }
        if ((i10 & 2) != 0) {
            gVar2 = qVar.f104956b;
        }
        if ((i10 & 4) != 0) {
            gVar3 = qVar.f104957c;
        }
        if ((i10 & 8) != 0) {
            gVar4 = qVar.f104958d;
        }
        return qVar.i(gVar, gVar2, gVar3, gVar4);
    }

    public static /* synthetic */ boolean o(q qVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        g gVarD = qVar.D();
        if (Math.abs(gVarD.Q() - f10) >= f11 || Math.abs(gVarD.U() - f10) >= f11 || Math.abs(gVarD.V() - f10) >= f11 || Math.abs(gVarD.P() - f10) >= f11) {
            return false;
        }
        g gVarE = qVar.E();
        if (Math.abs(gVarE.Q() - f10) >= f11 || Math.abs(gVarE.U() - f10) >= f11 || Math.abs(gVarE.V() - f10) >= f11 || Math.abs(gVarE.P() - f10) >= f11) {
            return false;
        }
        g gVarF = qVar.F();
        if (Math.abs(gVarF.Q() - f10) >= f11 || Math.abs(gVarF.U() - f10) >= f11 || Math.abs(gVarF.V() - f10) >= f11 || Math.abs(gVarF.P() - f10) >= f11) {
            return false;
        }
        g gVarC = qVar.C();
        return Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11;
    }

    public static /* synthetic */ boolean p(q qVar, q m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = qVar.D();
        g gVarD2 = m10.D();
        if (Math.abs(gVarD.Q() - gVarD2.Q()) >= f10 || Math.abs(gVarD.U() - gVarD2.U()) >= f10 || Math.abs(gVarD.V() - gVarD2.V()) >= f10 || Math.abs(gVarD.P() - gVarD2.P()) >= f10) {
            return false;
        }
        g gVarE = qVar.E();
        g gVarE2 = m10.E();
        if (Math.abs(gVarE.Q() - gVarE2.Q()) >= f10 || Math.abs(gVarE.U() - gVarE2.U()) >= f10 || Math.abs(gVarE.V() - gVarE2.V()) >= f10 || Math.abs(gVarE.P() - gVarE2.P()) >= f10) {
            return false;
        }
        g gVarF = qVar.F();
        g gVarF2 = m10.F();
        if (Math.abs(gVarF.Q() - gVarF2.Q()) >= f10 || Math.abs(gVarF.U() - gVarF2.U()) >= f10 || Math.abs(gVarF.V() - gVarF2.V()) >= f10 || Math.abs(gVarF.P() - gVarF2.P()) >= f10) {
            return false;
        }
        g gVarC = qVar.C();
        g gVarC2 = m10.C();
        return Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10;
    }

    @NotNull
    public final f A() {
        g gVarE = E();
        return new f(gVarE.Q(), gVarE.U(), gVarE.V());
    }

    @NotNull
    public final p B() {
        g gVarD = D();
        f fVar = new f(gVarD.Q(), gVarD.U(), gVarD.V());
        g gVarE = E();
        f fVar2 = new f(gVarE.Q(), gVarE.U(), gVarE.V());
        g gVarF = F();
        return new p(fVar, fVar2, new f(gVarF.Q(), gVarF.U(), gVarF.V()));
    }

    @NotNull
    public final g C() {
        return this.f104958d;
    }

    @NotNull
    public final g D() {
        return this.f104955a;
    }

    @NotNull
    public final g E() {
        return this.f104956b;
    }

    @NotNull
    public final g F() {
        return this.f104957c;
    }

    @NotNull
    public final q G() {
        g gVar = this.f104955a;
        this.f104955a = gVar.W();
        g gVar2 = this.f104956b;
        this.f104956b = gVar2.W();
        g gVar3 = this.f104957c;
        this.f104957c = gVar3.W();
        g gVar4 = this.f104958d;
        this.f104958d = gVar4.W();
        return new q(gVar, gVar2, gVar3, gVar4);
    }

    public final float H(int i10, int i11) {
        return s(i11 - 1).t(i10 - 1);
    }

    public final void I(int i10, int i11, float f10) {
        L(i11 - 1, i10 - 1, f10);
    }

    @NotNull
    public final q J(float f10) {
        g gVar = this.f104955a;
        g gVar2 = new g(gVar.Q() - f10, gVar.U() - f10, gVar.V() - f10, gVar.P() - f10);
        g gVar3 = this.f104956b;
        g gVar4 = new g(gVar3.Q() - f10, gVar3.U() - f10, gVar3.V() - f10, gVar3.P() - f10);
        g gVar5 = this.f104957c;
        g gVar6 = new g(gVar5.Q() - f10, gVar5.U() - f10, gVar5.V() - f10, gVar5.P() - f10);
        g gVar7 = this.f104958d;
        return new q(gVar2, gVar4, gVar6, new g(gVar7.Q() - f10, gVar7.U() - f10, gVar7.V() - f10, gVar7.P() - f10));
    }

    @NotNull
    public final q K(float f10) {
        g gVar = this.f104955a;
        g gVar2 = new g(gVar.Q() + f10, gVar.U() + f10, gVar.V() + f10, gVar.P() + f10);
        g gVar3 = this.f104956b;
        g gVar4 = new g(gVar3.Q() + f10, gVar3.U() + f10, gVar3.V() + f10, gVar3.P() + f10);
        g gVar5 = this.f104957c;
        g gVar6 = new g(gVar5.Q() + f10, gVar5.U() + f10, gVar5.V() + f10, gVar5.P() + f10);
        g gVar7 = this.f104958d;
        return new q(gVar2, gVar4, gVar6, new g(gVar7.Q() + f10, gVar7.U() + f10, gVar7.V() + f10, gVar7.P() + f10));
    }

    public final void L(int i10, int i11, float f10) {
        s(i10).g0(i11, f10);
    }

    public final void M(int i10, @NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        g gVarS = s(i10);
        gVarS.D0(v10.Q());
        gVarS.H0(v10.U());
        gVarS.I0(v10.V());
        gVarS.C0(v10.P());
    }

    public final void N(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g gVarF = F();
        gVarF.D0(value.H());
        gVarF.H0(value.K());
        gVarF.I0(value.L());
    }

    public final void O(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g gVarC = C();
        gVarC.D0(value.H());
        gVarC.H0(value.K());
        gVarC.I0(value.L());
    }

    public final void P(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g gVarD = D();
        gVarD.D0(value.H());
        gVarD.H0(value.K());
        gVarD.I0(value.L());
    }

    public final void Q(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        g gVarE = E();
        gVarE.D0(value.H());
        gVarE.H0(value.K());
        gVarE.I0(value.L());
    }

    public final void R(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f104958d = gVar;
    }

    public final void S(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f104955a = gVar;
    }

    public final void T(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f104956b = gVar;
    }

    public final void U(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f104957c = gVar;
    }

    @NotNull
    public final g V(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g((this.f104955a.Q() * v10.Q()) + (this.f104956b.Q() * v10.U()) + (this.f104957c.Q() * v10.V()) + (this.f104958d.Q() * v10.P()), (this.f104955a.U() * v10.Q()) + (this.f104956b.U() * v10.U()) + (this.f104957c.U() * v10.V()) + (this.f104958d.U() * v10.P()), (this.f104955a.V() * v10.Q()) + (this.f104956b.V() * v10.U()) + (this.f104957c.V() * v10.V()) + (this.f104958d.V() * v10.P()), (this.f104955a.P() * v10.Q()) + (this.f104956b.P() * v10.U()) + (this.f104957c.P() * v10.V()) + (this.f104958d.P() * v10.P()));
    }

    @NotNull
    public final q W(float f10) {
        g gVar = this.f104955a;
        g gVar2 = new g(gVar.Q() * f10, gVar.U() * f10, gVar.V() * f10, gVar.P() * f10);
        g gVar3 = this.f104956b;
        g gVar4 = new g(gVar3.Q() * f10, gVar3.U() * f10, gVar3.V() * f10, gVar3.P() * f10);
        g gVar5 = this.f104957c;
        g gVar6 = new g(gVar5.Q() * f10, gVar5.U() * f10, gVar5.V() * f10, gVar5.P() * f10);
        g gVar7 = this.f104958d;
        return new q(gVar2, gVar4, gVar6, new g(gVar7.Q() * f10, gVar7.U() * f10, gVar7.V() * f10, gVar7.P() * f10));
    }

    @NotNull
    public final q X(@NotNull q m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new q(new g((this.f104955a.Q() * m10.f104955a.Q()) + (this.f104956b.Q() * m10.f104955a.U()) + (this.f104957c.Q() * m10.f104955a.V()) + (this.f104958d.Q() * m10.f104955a.P()), (this.f104955a.U() * m10.f104955a.Q()) + (this.f104956b.U() * m10.f104955a.U()) + (this.f104957c.U() * m10.f104955a.V()) + (this.f104958d.U() * m10.f104955a.P()), (this.f104955a.V() * m10.f104955a.Q()) + (this.f104956b.V() * m10.f104955a.U()) + (this.f104957c.V() * m10.f104955a.V()) + (this.f104958d.V() * m10.f104955a.P()), (this.f104955a.P() * m10.f104955a.Q()) + (this.f104956b.P() * m10.f104955a.U()) + (this.f104957c.P() * m10.f104955a.V()) + (this.f104958d.P() * m10.f104955a.P())), new g((this.f104955a.Q() * m10.f104956b.Q()) + (this.f104956b.Q() * m10.f104956b.U()) + (this.f104957c.Q() * m10.f104956b.V()) + (this.f104958d.Q() * m10.f104956b.P()), (this.f104955a.U() * m10.f104956b.Q()) + (this.f104956b.U() * m10.f104956b.U()) + (this.f104957c.U() * m10.f104956b.V()) + (this.f104958d.U() * m10.f104956b.P()), (this.f104955a.V() * m10.f104956b.Q()) + (this.f104956b.V() * m10.f104956b.U()) + (this.f104957c.V() * m10.f104956b.V()) + (this.f104958d.V() * m10.f104956b.P()), (this.f104955a.P() * m10.f104956b.Q()) + (this.f104956b.P() * m10.f104956b.U()) + (this.f104957c.P() * m10.f104956b.V()) + (this.f104958d.P() * m10.f104956b.P())), new g((this.f104955a.Q() * m10.f104957c.Q()) + (this.f104956b.Q() * m10.f104957c.U()) + (this.f104957c.Q() * m10.f104957c.V()) + (this.f104958d.Q() * m10.f104957c.P()), (this.f104955a.U() * m10.f104957c.Q()) + (this.f104956b.U() * m10.f104957c.U()) + (this.f104957c.U() * m10.f104957c.V()) + (this.f104958d.U() * m10.f104957c.P()), (this.f104955a.V() * m10.f104957c.Q()) + (this.f104956b.V() * m10.f104957c.U()) + (this.f104957c.V() * m10.f104957c.V()) + (this.f104958d.V() * m10.f104957c.P()), (this.f104955a.P() * m10.f104957c.Q()) + (this.f104956b.P() * m10.f104957c.U()) + (this.f104957c.P() * m10.f104957c.V()) + (this.f104958d.P() * m10.f104957c.P())), new g((this.f104955a.Q() * m10.f104958d.Q()) + (this.f104956b.Q() * m10.f104958d.U()) + (this.f104957c.Q() * m10.f104958d.V()) + (this.f104958d.Q() * m10.f104958d.P()), (this.f104955a.U() * m10.f104958d.Q()) + (this.f104956b.U() * m10.f104958d.U()) + (this.f104957c.U() * m10.f104958d.V()) + (this.f104958d.U() * m10.f104958d.P()), (this.f104955a.V() * m10.f104958d.Q()) + (this.f104956b.V() * m10.f104958d.U()) + (this.f104957c.V() * m10.f104958d.V()) + (this.f104958d.V() * m10.f104958d.P()), (this.f104955a.P() * m10.f104958d.Q()) + (this.f104956b.P() * m10.f104958d.U()) + (this.f104957c.P() * m10.f104958d.V()) + (this.f104958d.P() * m10.f104958d.P())));
    }

    @NotNull
    public final f Y(@NotNull c0 order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return s.m(this, order);
    }

    @NotNull
    public final q a(float f10, float f11) {
        g gVarD = D();
        float fQ = gVarD.Q();
        float fCompare = Math.abs(fQ - f10) < f11 ? 0.0f : Float.compare(fQ, f10);
        float fU = gVarD.U();
        float fCompare2 = Math.abs(fU - f10) < f11 ? 0.0f : Float.compare(fU, f10);
        float fV = gVarD.V();
        float fCompare3 = Math.abs(fV - f10) < f11 ? 0.0f : Float.compare(fV, f10);
        float fP = gVarD.P();
        g gVar = new g(fCompare, fCompare2, fCompare3, Math.abs(fP - f10) < f11 ? 0.0f : Float.compare(fP, f10));
        g gVarE = E();
        float fQ2 = gVarE.Q();
        float fCompare4 = Math.abs(fQ2 - f10) < f11 ? 0.0f : Float.compare(fQ2, f10);
        float fU2 = gVarE.U();
        float fCompare5 = Math.abs(fU2 - f10) < f11 ? 0.0f : Float.compare(fU2, f10);
        float fV2 = gVarE.V();
        float fCompare6 = Math.abs(fV2 - f10) < f11 ? 0.0f : Float.compare(fV2, f10);
        float fP2 = gVarE.P();
        g gVar2 = new g(fCompare4, fCompare5, fCompare6, Math.abs(fP2 - f10) < f11 ? 0.0f : Float.compare(fP2, f10));
        g gVarF = F();
        float fQ3 = gVarF.Q();
        float fCompare7 = Math.abs(fQ3 - f10) < f11 ? 0.0f : Float.compare(fQ3, f10);
        float fU3 = gVarF.U();
        float fCompare8 = Math.abs(fU3 - f10) < f11 ? 0.0f : Float.compare(fU3, f10);
        float fV3 = gVarF.V();
        float fCompare9 = Math.abs(fV3 - f10) < f11 ? 0.0f : Float.compare(fV3, f10);
        float fP3 = gVarF.P();
        g gVar3 = new g(fCompare7, fCompare8, fCompare9, Math.abs(fP3 - f10) < f11 ? 0.0f : Float.compare(fP3, f10));
        g gVarC = C();
        float fQ4 = gVarC.Q();
        float fCompare10 = Math.abs(fQ4 - f10) < f11 ? 0.0f : Float.compare(fQ4, f10);
        float fU4 = gVarC.U();
        float fCompare11 = Math.abs(fU4 - f10) < f11 ? 0.0f : Float.compare(fU4, f10);
        float fV4 = gVarC.V();
        float fCompare12 = Math.abs(fV4 - f10) < f11 ? 0.0f : Float.compare(fV4, f10);
        float fP4 = gVarC.P();
        return new q(gVar, gVar2, gVar3, new g(fCompare10, fCompare11, fCompare12, Math.abs(fP4 - f10) >= f11 ? Float.compare(fP4, f10) : 0.0f));
    }

    @NotNull
    public final float[] a0() {
        return new float[]{this.f104955a.Q(), this.f104956b.Q(), this.f104957c.Q(), this.f104958d.Q(), this.f104955a.U(), this.f104956b.U(), this.f104957c.U(), this.f104958d.U(), this.f104955a.V(), this.f104956b.V(), this.f104957c.V(), this.f104958d.V(), this.f104955a.P(), this.f104956b.P(), this.f104957c.P(), this.f104958d.P()};
    }

    @NotNull
    public final q b(@NotNull q m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = D();
        g gVarD2 = m10.D();
        float fQ = gVarD.Q();
        float fQ2 = gVarD2.Q();
        float fCompare = Math.abs(fQ - fQ2) < f10 ? 0.0f : Float.compare(fQ, fQ2);
        float fU = gVarD.U();
        float fU2 = gVarD2.U();
        float fCompare2 = Math.abs(fU - fU2) < f10 ? 0.0f : Float.compare(fU, fU2);
        float fV = gVarD.V();
        float fV2 = gVarD2.V();
        float fCompare3 = Math.abs(fV - fV2) < f10 ? 0.0f : Float.compare(fV, fV2);
        float fP = gVarD.P();
        float fP2 = gVarD2.P();
        g gVar = new g(fCompare, fCompare2, fCompare3, Math.abs(fP - fP2) < f10 ? 0.0f : Float.compare(fP, fP2));
        g gVarE = E();
        g gVarE2 = m10.E();
        float fQ3 = gVarE.Q();
        float fQ4 = gVarE2.Q();
        float fCompare4 = Math.abs(fQ3 - fQ4) < f10 ? 0.0f : Float.compare(fQ3, fQ4);
        float fU3 = gVarE.U();
        float fU4 = gVarE2.U();
        float fCompare5 = Math.abs(fU3 - fU4) < f10 ? 0.0f : Float.compare(fU3, fU4);
        float fV3 = gVarE.V();
        float fV4 = gVarE2.V();
        float fCompare6 = Math.abs(fV3 - fV4) < f10 ? 0.0f : Float.compare(fV3, fV4);
        float fP3 = gVarE.P();
        float fP4 = gVarE2.P();
        g gVar2 = new g(fCompare4, fCompare5, fCompare6, Math.abs(fP3 - fP4) < f10 ? 0.0f : Float.compare(fP3, fP4));
        g gVarF = F();
        g gVarF2 = m10.F();
        float fQ5 = gVarF.Q();
        float fQ6 = gVarF2.Q();
        float fCompare7 = Math.abs(fQ5 - fQ6) < f10 ? 0.0f : Float.compare(fQ5, fQ6);
        float fU5 = gVarF.U();
        float fU6 = gVarF2.U();
        float fCompare8 = Math.abs(fU5 - fU6) < f10 ? 0.0f : Float.compare(fU5, fU6);
        float fV5 = gVarF.V();
        float fV6 = gVarF2.V();
        float fCompare9 = Math.abs(fV5 - fV6) < f10 ? 0.0f : Float.compare(fV5, fV6);
        float fP5 = gVarF.P();
        float fP6 = gVarF2.P();
        g gVar3 = new g(fCompare7, fCompare8, fCompare9, Math.abs(fP5 - fP6) < f10 ? 0.0f : Float.compare(fP5, fP6));
        g gVarC = C();
        g gVarC2 = m10.C();
        float fQ7 = gVarC.Q();
        float fQ8 = gVarC2.Q();
        float fCompare10 = Math.abs(fQ7 - fQ8) < f10 ? 0.0f : Float.compare(fQ7, fQ8);
        float fU7 = gVarC.U();
        float fU8 = gVarC2.U();
        float fCompare11 = Math.abs(fU7 - fU8) < f10 ? 0.0f : Float.compare(fU7, fU8);
        float fV7 = gVarC.V();
        float fV8 = gVarC2.V();
        float fCompare12 = Math.abs(fV7 - fV8) < f10 ? 0.0f : Float.compare(fV7, fV8);
        float fP7 = gVarC.P();
        float fP8 = gVarC2.P();
        return new q(gVar, gVar2, gVar3, new g(fCompare10, fCompare11, fCompare12, Math.abs(fP7 - fP8) >= f10 ? Float.compare(fP7, fP8) : 0.0f));
    }

    @NotNull
    public final w b0() {
        return s.J(this);
    }

    @NotNull
    public final q c0() {
        return new q(this.f104955a.P0(), this.f104956b.P0(), this.f104957c.P0(), this.f104958d.P0());
    }

    @NotNull
    public final g e() {
        return this.f104955a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f104955a, qVar.f104955a) && Intrinsics.areEqual(this.f104956b, qVar.f104956b) && Intrinsics.areEqual(this.f104957c, qVar.f104957c) && Intrinsics.areEqual(this.f104958d, qVar.f104958d);
    }

    @NotNull
    public final g f() {
        return this.f104956b;
    }

    @NotNull
    public final g g() {
        return this.f104957c;
    }

    @NotNull
    public final g h() {
        return this.f104958d;
    }

    public int hashCode() {
        return (((((this.f104955a.hashCode() * 31) + this.f104956b.hashCode()) * 31) + this.f104957c.hashCode()) * 31) + this.f104958d.hashCode();
    }

    @NotNull
    public final q i(@NotNull g x10, @NotNull g y10, @NotNull g z10, @NotNull g w10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        Intrinsics.checkNotNullParameter(w10, "w");
        return new q(x10, y10, z10, w10);
    }

    @NotNull
    public final q k() {
        g gVar = this.f104955a;
        this.f104955a = gVar.k();
        g gVar2 = this.f104956b;
        this.f104956b = gVar2.k();
        g gVar3 = this.f104957c;
        this.f104957c = gVar3.k();
        g gVar4 = this.f104958d;
        this.f104958d = gVar4.k();
        return new q(gVar, gVar2, gVar3, gVar4);
    }

    @NotNull
    public final q l(float f10) {
        g gVar = this.f104955a;
        g gVar2 = new g(gVar.Q() / f10, gVar.U() / f10, gVar.V() / f10, gVar.P() / f10);
        g gVar3 = this.f104956b;
        g gVar4 = new g(gVar3.Q() / f10, gVar3.U() / f10, gVar3.V() / f10, gVar3.P() / f10);
        g gVar5 = this.f104957c;
        g gVar6 = new g(gVar5.Q() / f10, gVar5.U() / f10, gVar5.V() / f10, gVar5.P() / f10);
        g gVar7 = this.f104958d;
        return new q(gVar2, gVar4, gVar6, new g(gVar7.Q() / f10, gVar7.U() / f10, gVar7.V() / f10, gVar7.P() / f10));
    }

    public final boolean m(float f10, float f11) {
        g gVarD = D();
        if (Math.abs(gVarD.Q() - f10) < f11 && Math.abs(gVarD.U() - f10) < f11 && Math.abs(gVarD.V() - f10) < f11 && Math.abs(gVarD.P() - f10) < f11) {
            g gVarE = E();
            if (Math.abs(gVarE.Q() - f10) < f11 && Math.abs(gVarE.U() - f10) < f11 && Math.abs(gVarE.V() - f10) < f11 && Math.abs(gVarE.P() - f10) < f11) {
                g gVarF = F();
                if (Math.abs(gVarF.Q() - f10) < f11 && Math.abs(gVarF.U() - f10) < f11 && Math.abs(gVarF.V() - f10) < f11 && Math.abs(gVarF.P() - f10) < f11) {
                    g gVarC = C();
                    if (Math.abs(gVarC.Q() - f10) < f11 && Math.abs(gVarC.U() - f10) < f11 && Math.abs(gVarC.V() - f10) < f11 && Math.abs(gVarC.P() - f10) < f11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean n(@NotNull q m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        g gVarD = D();
        g gVarD2 = m10.D();
        if (Math.abs(gVarD.Q() - gVarD2.Q()) < f10 && Math.abs(gVarD.U() - gVarD2.U()) < f10 && Math.abs(gVarD.V() - gVarD2.V()) < f10 && Math.abs(gVarD.P() - gVarD2.P()) < f10) {
            g gVarE = E();
            g gVarE2 = m10.E();
            if (Math.abs(gVarE.Q() - gVarE2.Q()) < f10 && Math.abs(gVarE.U() - gVarE2.U()) < f10 && Math.abs(gVarE.V() - gVarE2.V()) < f10 && Math.abs(gVarE.P() - gVarE2.P()) < f10) {
                g gVarF = F();
                g gVarF2 = m10.F();
                if (Math.abs(gVarF.Q() - gVarF2.Q()) < f10 && Math.abs(gVarF.U() - gVarF2.U()) < f10 && Math.abs(gVarF.V() - gVarF2.V()) < f10 && Math.abs(gVarF.P() - gVarF2.P()) < f10) {
                    g gVarC = C();
                    g gVarC2 = m10.C();
                    if (Math.abs(gVarC.Q() - gVarC2.Q()) < f10 && Math.abs(gVarC.U() - gVarC2.U()) < f10 && Math.abs(gVarC.V() - gVarC2.V()) < f10 && Math.abs(gVarC.P() - gVarC2.P()) < f10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final float q(int i10, int i11) {
        return s(i10).t(i11);
    }

    public final float r(@NotNull r column, int i10) {
        Intrinsics.checkNotNullParameter(column, "column");
        return t(column).t(i10);
    }

    @NotNull
    public final g s(int i10) {
        if (i10 == 0) {
            return this.f104955a;
        }
        if (i10 == 1) {
            return this.f104956b;
        }
        if (i10 == 2) {
            return this.f104957c;
        }
        if (i10 == 3) {
            return this.f104958d;
        }
        throw new IllegalArgumentException("column must be in 0..3");
    }

    @NotNull
    public final g t(@NotNull r column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i10 = b.f104959a[column.ordinal()];
        if (i10 == 1) {
            return this.f104955a;
        }
        if (i10 == 2) {
            return this.f104956b;
        }
        if (i10 == 3) {
            return this.f104957c;
        }
        if (i10 == 4) {
            return this.f104958d;
        }
        throw new k0();
    }

    @NotNull
    public String toString() {
        return StringsKt.p("\n            |" + this.f104955a.Q() + " " + this.f104956b.Q() + " " + this.f104957c.Q() + " " + this.f104958d.Q() + "|\n            |" + this.f104955a.U() + " " + this.f104956b.U() + " " + this.f104957c.U() + " " + this.f104958d.U() + "|\n            |" + this.f104955a.V() + " " + this.f104956b.V() + " " + this.f104957c.V() + " " + this.f104958d.V() + "|\n            |" + this.f104955a.P() + " " + this.f104956b.P() + " " + this.f104957c.P() + " " + this.f104958d.P() + "|\n            ");
    }

    @NotNull
    public final f u() {
        g gVarF = F();
        return new f(gVarF.Q(), gVarF.U(), gVarF.V());
    }

    @NotNull
    public final f v() {
        g gVarC = C();
        return new f(gVarC.Q(), gVarC.U(), gVarC.V());
    }

    @NotNull
    public final f w() {
        g gVarD = D();
        return new f(gVarD.Q(), gVarD.U(), gVarD.V());
    }

    @NotNull
    public final f x() {
        g gVarD = D();
        f fVarW3 = i0.w3(new f(gVarD.Q(), gVarD.U(), gVarD.V()));
        g gVarE = E();
        f fVarW4 = i0.w3(new f(gVarE.Q(), gVarE.U(), gVarE.V()));
        g gVarF = F();
        f fVarW5 = i0.w3(new f(gVarF.Q(), gVarF.U(), gVarF.V()));
        if (fVarW5.K() <= -1.0f) {
            return new f(-90.0f, 0.0f, ((float) Math.atan2(fVarW3.L(), fVarW4.L())) * 57.295776f);
        }
        return fVarW5.K() >= 1.0f ? new f(90.0f, 0.0f, ((float) Math.atan2(-fVarW3.L(), -fVarW4.L())) * 57.295776f) : new f((-((float) Math.asin(fVarW5.K()))) * 57.295776f, (-((float) Math.atan2(fVarW5.H(), fVarW5.L()))) * 57.295776f, ((float) Math.atan2(fVarW3.K(), fVarW4.K())) * 57.295776f);
    }

    @NotNull
    public final f y() {
        g gVarD = D();
        f fVar = new f(gVarD.Q(), gVarD.U(), gVarD.V());
        float fSqrt = (float) Math.sqrt((fVar.H() * fVar.H()) + (fVar.K() * fVar.K()) + (fVar.L() * fVar.L()));
        g gVarE = E();
        f fVar2 = new f(gVarE.Q(), gVarE.U(), gVarE.V());
        float fSqrt2 = (float) Math.sqrt((fVar2.H() * fVar2.H()) + (fVar2.K() * fVar2.K()) + (fVar2.L() * fVar2.L()));
        g gVarF = F();
        f fVar3 = new f(gVarF.Q(), gVarF.U(), gVarF.V());
        return new f(fSqrt, fSqrt2, (float) Math.sqrt((fVar3.H() * fVar3.H()) + (fVar3.K() * fVar3.K()) + (fVar3.L() * fVar3.L())));
    }

    @NotNull
    public final f z() {
        g gVarC = C();
        return new f(gVarC.Q(), gVarC.U(), gVarC.V());
    }

    public q(@NotNull g x10, @NotNull g y10, @NotNull g z10, @NotNull g w10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        Intrinsics.checkNotNullParameter(w10, "w");
        this.f104955a = x10;
        this.f104956b = y10;
        this.f104957c = z10;
        this.f104958d = w10;
    }

    public /* synthetic */ q(g gVar, g gVar2, g gVar3, g gVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            int i11 = 6 << 0;
            gVar = new g(1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        gVar2 = (i10 & 2) != 0 ? new g(0.0f, 1.0f, 0.0f, 0.0f, 13, null) : gVar2;
        if ((i10 & 4) != 0) {
            int i12 = 0 << 0;
            gVar3 = new g(0.0f, 0.0f, 1.0f, 0.0f, 11, null);
        }
        this(gVar, gVar2, gVar3, (i10 & 8) != 0 ? new g(0.0f, 0.0f, 0.0f, 1.0f, 7, null) : gVar4);
    }

    public /* synthetic */ q(f fVar, f fVar2, f fVar3, f fVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVar2, fVar3, (i10 & 8) != 0 ? new f(0.0f, 0.0f, 0.0f, 7, null) : fVar4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull f right, @NotNull f up, @NotNull f forward, @NotNull f position) {
        this(new g(right, 0.0f, 2, (DefaultConstructorMarker) null), new g(up, 0.0f, 2, (DefaultConstructorMarker) null), new g(forward, 0.0f, 2, (DefaultConstructorMarker) null), new g(position, 1.0f));
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(up, "up");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(position, "position");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull q m10) {
        this(g.j(m10.f104955a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), g.j(m10.f104956b, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), g.j(m10.f104957c, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), g.j(m10.f104958d, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        Intrinsics.checkNotNullParameter(m10, "m");
    }
}
