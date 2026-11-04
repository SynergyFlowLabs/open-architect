package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat3\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,908:1\n222#2,4:909\n304#2:913\n305#2:914\n306#2:915\n307#2:916\n308#2,2:917\n310#2,3:925\n308#2,2:928\n310#2,3:936\n308#2,2:939\n310#2,3:947\n308#2,5:950\n308#2,2:955\n310#2,3:963\n308#2,2:966\n310#2,3:974\n315#2:977\n326#2,2:979\n328#2,3:987\n326#2,2:990\n328#2,3:998\n326#2,2:1001\n328#2,3:1009\n326#2,2:1012\n328#2,3:1020\n326#2,2:1023\n328#2,3:1031\n326#2,2:1034\n328#2,3:1042\n333#2:1045\n617#3,6:919\n617#3,6:930\n617#3,6:941\n617#3,6:957\n617#3,6:968\n622#3:978\n617#3,6:981\n617#3,6:992\n617#3,6:1003\n617#3,6:1014\n617#3,6:1025\n617#3,6:1036\n622#3:1046\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat3\n*L\n170#1:909,4\n180#1:913\n181#1:914\n182#1:915\n183#1:916\n185#1:917,2\n185#1:925,3\n186#1:928,2\n186#1:936,3\n187#1:939,2\n187#1:947,3\n185#1:950,5\n186#1:955,2\n186#1:963,3\n187#1:966,2\n187#1:974,3\n191#1:977\n212#1:979,2\n212#1:987,3\n213#1:990,2\n213#1:998,3\n214#1:1001,2\n214#1:1009,3\n212#1:1012,2\n212#1:1020,3\n213#1:1023,2\n213#1:1031,3\n214#1:1034,2\n214#1:1042,3\n218#1:1045\n185#1:919,6\n186#1:930,6\n187#1:941,6\n186#1:957,6\n187#1:968,6\n191#1:978\n212#1:981,6\n213#1:992,6\n214#1:1003,6\n212#1:1014,6\n213#1:1025,6\n214#1:1036,6\n218#1:1046\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f104949d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private f f104950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private f f104951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private f f104952c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p a() {
            return new p(null, null, null, 7, null);
        }

        @NotNull
        public final p b(@NotNull float... a10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            if (a10.length >= 9) {
                return new p(new f(a10[0], a10[3], a10[6]), new f(a10[1], a10[4], a10[7]), new f(a10[2], a10[5], a10[8]));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104953a;

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
            f104953a = iArr;
        }
    }

    public p() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ p c(p pVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        f fVarT = pVar.t();
        float fH = fVarT.H();
        float fCompare = Math.abs(fH - f10) < f11 ? 0.0f : Float.compare(fH, f10);
        float fK = fVarT.K();
        float fCompare2 = Math.abs(fK - f10) < f11 ? 0.0f : Float.compare(fK, f10);
        float fL = fVarT.L();
        f fVar = new f(fCompare, fCompare2, Math.abs(fL - f10) < f11 ? 0.0f : Float.compare(fL, f10));
        f fVarU = pVar.u();
        float fH2 = fVarU.H();
        float fCompare3 = Math.abs(fH2 - f10) < f11 ? 0.0f : Float.compare(fH2, f10);
        float fK2 = fVarU.K();
        float fCompare4 = Math.abs(fK2 - f10) < f11 ? 0.0f : Float.compare(fK2, f10);
        float fL2 = fVarU.L();
        f fVar2 = new f(fCompare3, fCompare4, Math.abs(fL2 - f10) < f11 ? 0.0f : Float.compare(fL2, f10));
        f fVarV = pVar.v();
        float fH3 = fVarV.H();
        float fCompare5 = Math.abs(fH3 - f10) < f11 ? 0.0f : Float.compare(fH3, f10);
        float fK3 = fVarV.K();
        float fCompare6 = Math.abs(fK3 - f10) < f11 ? 0.0f : Float.compare(fK3, f10);
        float fL3 = fVarV.L();
        return new p(fVar, fVar2, new f(fCompare5, fCompare6, Math.abs(fL3 - f10) >= f11 ? Float.compare(fL3, f10) : 0.0f));
    }

    public static /* synthetic */ p d(p pVar, p m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        f fVarT = pVar.t();
        f fVarT2 = m10.t();
        float fH = fVarT.H();
        float fH2 = fVarT2.H();
        float fCompare = Math.abs(fH - fH2) < f10 ? 0.0f : Float.compare(fH, fH2);
        float fK = fVarT.K();
        float fK2 = fVarT2.K();
        float fCompare2 = Math.abs(fK - fK2) < f10 ? 0.0f : Float.compare(fK, fK2);
        float fL = fVarT.L();
        float fL2 = fVarT2.L();
        f fVar = new f(fCompare, fCompare2, Math.abs(fL - fL2) < f10 ? 0.0f : Float.compare(fL, fL2));
        f fVarU = pVar.u();
        f fVarU2 = m10.u();
        float fH3 = fVarU.H();
        float fH4 = fVarU2.H();
        float fCompare3 = Math.abs(fH3 - fH4) < f10 ? 0.0f : Float.compare(fH3, fH4);
        float fK3 = fVarU.K();
        float fK4 = fVarU2.K();
        float fCompare4 = Math.abs(fK3 - fK4) < f10 ? 0.0f : Float.compare(fK3, fK4);
        float fL3 = fVarU.L();
        float fL4 = fVarU2.L();
        f fVar2 = new f(fCompare3, fCompare4, Math.abs(fL3 - fL4) < f10 ? 0.0f : Float.compare(fL3, fL4));
        f fVarV = pVar.v();
        f fVarV2 = m10.v();
        float fH5 = fVarV.H();
        float fH6 = fVarV2.H();
        float fCompare5 = Math.abs(fH5 - fH6) < f10 ? 0.0f : Float.compare(fH5, fH6);
        float fK5 = fVarV.K();
        float fK6 = fVarV2.K();
        float fCompare6 = Math.abs(fK5 - fK6) < f10 ? 0.0f : Float.compare(fK5, fK6);
        float fL5 = fVarV.L();
        float fL6 = fVarV2.L();
        return new p(fVar, fVar2, new f(fCompare5, fCompare6, Math.abs(fL5 - fL6) >= f10 ? Float.compare(fL5, fL6) : 0.0f));
    }

    public static /* synthetic */ p i(p pVar, f fVar, f fVar2, f fVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = pVar.f104950a;
        }
        if ((i10 & 2) != 0) {
            fVar2 = pVar.f104951b;
        }
        if ((i10 & 4) != 0) {
            fVar3 = pVar.f104952c;
        }
        return pVar.h(fVar, fVar2, fVar3);
    }

    public static /* synthetic */ boolean n(p pVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        f fVarT = pVar.t();
        if (Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11) {
            f fVarU = pVar.u();
            if (Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11) {
                f fVarV = pVar.v();
                if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean o(p pVar, p m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        f fVarT = pVar.t();
        f fVarT2 = m10.t();
        if (Math.abs(fVarT.H() - fVarT2.H()) < f10 && Math.abs(fVarT.K() - fVarT2.K()) < f10 && Math.abs(fVarT.L() - fVarT2.L()) < f10) {
            f fVarU = pVar.u();
            f fVarU2 = m10.u();
            if (Math.abs(fVarU.H() - fVarU2.H()) < f10 && Math.abs(fVarU.K() - fVarU2.K()) < f10 && Math.abs(fVarU.L() - fVarU2.L()) < f10) {
                f fVarV = pVar.v();
                f fVarV2 = m10.v();
                if (Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final p A(float f10) {
        f fVar = this.f104950a;
        f fVar2 = new f(fVar.H() + f10, fVar.K() + f10, fVar.L() + f10);
        f fVar3 = this.f104951b;
        f fVar4 = new f(fVar3.H() + f10, fVar3.K() + f10, fVar3.L() + f10);
        f fVar5 = this.f104952c;
        return new p(fVar2, fVar4, new f(fVar5.H() + f10, fVar5.K() + f10, fVar5.L() + f10));
    }

    public final void B(int i10, int i11, float f10) {
        r(i10).U(i11, f10);
    }

    public final void C(int i10, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        f fVarR = r(i10);
        fVarR.k0(v10.H());
        fVarR.n0(v10.K());
        fVarR.o0(v10.L());
    }

    public final void D(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f104950a = fVar;
    }

    public final void E(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f104951b = fVar;
    }

    public final void F(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f104952c = fVar;
    }

    @NotNull
    public final f G(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f((this.f104950a.H() * v10.H()) + (this.f104951b.H() * v10.K()) + (this.f104952c.H() * v10.L()), (this.f104950a.K() * v10.H()) + (this.f104951b.K() * v10.K()) + (this.f104952c.K() * v10.L()), (this.f104950a.L() * v10.H()) + (this.f104951b.L() * v10.K()) + (this.f104952c.L() * v10.L()));
    }

    @NotNull
    public final p H(float f10) {
        f fVar = this.f104950a;
        f fVar2 = new f(fVar.H() * f10, fVar.K() * f10, fVar.L() * f10);
        f fVar3 = this.f104951b;
        f fVar4 = new f(fVar3.H() * f10, fVar3.K() * f10, fVar3.L() * f10);
        f fVar5 = this.f104952c;
        return new p(fVar2, fVar4, new f(fVar5.H() * f10, fVar5.K() * f10, fVar5.L() * f10));
    }

    @NotNull
    public final p I(@NotNull p m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new p(new f((this.f104950a.H() * m10.f104950a.H()) + (this.f104951b.H() * m10.f104950a.K()) + (this.f104952c.H() * m10.f104950a.L()), (this.f104950a.K() * m10.f104950a.H()) + (this.f104951b.K() * m10.f104950a.K()) + (this.f104952c.K() * m10.f104950a.L()), (this.f104950a.L() * m10.f104950a.H()) + (this.f104951b.L() * m10.f104950a.K()) + (this.f104952c.L() * m10.f104950a.L())), new f((this.f104950a.H() * m10.f104951b.H()) + (this.f104951b.H() * m10.f104951b.K()) + (this.f104952c.H() * m10.f104951b.L()), (this.f104950a.K() * m10.f104951b.H()) + (this.f104951b.K() * m10.f104951b.K()) + (this.f104952c.K() * m10.f104951b.L()), (this.f104950a.L() * m10.f104951b.H()) + (this.f104951b.L() * m10.f104951b.K()) + (this.f104952c.L() * m10.f104951b.L())), new f((this.f104950a.H() * m10.f104952c.H()) + (this.f104951b.H() * m10.f104952c.K()) + (this.f104952c.H() * m10.f104952c.L()), (this.f104950a.K() * m10.f104952c.H()) + (this.f104951b.K() * m10.f104952c.K()) + (this.f104952c.K() * m10.f104952c.L()), (this.f104950a.L() * m10.f104952c.H()) + (this.f104951b.L() * m10.f104952c.K()) + (this.f104952c.L() * m10.f104952c.L())));
    }

    @NotNull
    public final float[] J() {
        return new float[]{this.f104950a.H(), this.f104951b.H(), this.f104952c.H(), this.f104950a.K(), this.f104951b.K(), this.f104952c.K(), this.f104950a.L(), this.f104951b.L(), this.f104952c.L()};
    }

    @NotNull
    public final p K() {
        return new p(this.f104950a.u0(), this.f104951b.u0(), this.f104952c.u0());
    }

    @NotNull
    public final p a(float f10, float f11) {
        f fVarT = t();
        float fH = fVarT.H();
        float fCompare = Math.abs(fH - f10) < f11 ? 0.0f : Float.compare(fH, f10);
        float fK = fVarT.K();
        float fCompare2 = Math.abs(fK - f10) < f11 ? 0.0f : Float.compare(fK, f10);
        float fL = fVarT.L();
        f fVar = new f(fCompare, fCompare2, Math.abs(fL - f10) < f11 ? 0.0f : Float.compare(fL, f10));
        f fVarU = u();
        float fH2 = fVarU.H();
        float fCompare3 = Math.abs(fH2 - f10) < f11 ? 0.0f : Float.compare(fH2, f10);
        float fK2 = fVarU.K();
        float fCompare4 = Math.abs(fK2 - f10) < f11 ? 0.0f : Float.compare(fK2, f10);
        float fL2 = fVarU.L();
        f fVar2 = new f(fCompare3, fCompare4, Math.abs(fL2 - f10) < f11 ? 0.0f : Float.compare(fL2, f10));
        f fVarV = v();
        float fH3 = fVarV.H();
        float fCompare5 = Math.abs(fH3 - f10) < f11 ? 0.0f : Float.compare(fH3, f10);
        float fK3 = fVarV.K();
        float fCompare6 = Math.abs(fK3 - f10) < f11 ? 0.0f : Float.compare(fK3, f10);
        float fL3 = fVarV.L();
        return new p(fVar, fVar2, new f(fCompare5, fCompare6, Math.abs(fL3 - f10) >= f11 ? Float.compare(fL3, f10) : 0.0f));
    }

    @NotNull
    public final p b(@NotNull p m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        f fVarT = t();
        f fVarT2 = m10.t();
        float fH = fVarT.H();
        float fH2 = fVarT2.H();
        float fCompare = 0.0f;
        float fCompare2 = Math.abs(fH - fH2) < f10 ? 0.0f : Float.compare(fH, fH2);
        float fK = fVarT.K();
        float fK2 = fVarT2.K();
        float fCompare3 = Math.abs(fK - fK2) < f10 ? 0.0f : Float.compare(fK, fK2);
        float fL = fVarT.L();
        float fL2 = fVarT2.L();
        f fVar = new f(fCompare2, fCompare3, Math.abs(fL - fL2) < f10 ? 0.0f : Float.compare(fL, fL2));
        f fVarU = u();
        f fVarU2 = m10.u();
        float fH3 = fVarU.H();
        float fH4 = fVarU2.H();
        float fCompare4 = Math.abs(fH3 - fH4) < f10 ? 0.0f : Float.compare(fH3, fH4);
        float fK3 = fVarU.K();
        float fK4 = fVarU2.K();
        float fCompare5 = Math.abs(fK3 - fK4) < f10 ? 0.0f : Float.compare(fK3, fK4);
        float fL3 = fVarU.L();
        float fL4 = fVarU2.L();
        f fVar2 = new f(fCompare4, fCompare5, Math.abs(fL3 - fL4) < f10 ? 0.0f : Float.compare(fL3, fL4));
        f fVarV = v();
        f fVarV2 = m10.v();
        float fH5 = fVarV.H();
        float fH6 = fVarV2.H();
        float fCompare6 = Math.abs(fH5 - fH6) < f10 ? 0.0f : Float.compare(fH5, fH6);
        float fK5 = fVarV.K();
        float fK6 = fVarV2.K();
        float fCompare7 = Math.abs(fK5 - fK6) < f10 ? 0.0f : Float.compare(fK5, fK6);
        float fL5 = fVarV.L();
        float fL6 = fVarV2.L();
        if (Math.abs(fL5 - fL6) >= f10) {
            fCompare = Float.compare(fL5, fL6);
        }
        return new p(fVar, fVar2, new f(fCompare6, fCompare7, fCompare));
    }

    @NotNull
    public final f e() {
        return this.f104950a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f104950a, pVar.f104950a) && Intrinsics.areEqual(this.f104951b, pVar.f104951b) && Intrinsics.areEqual(this.f104952c, pVar.f104952c);
    }

    @NotNull
    public final f f() {
        return this.f104951b;
    }

    @NotNull
    public final f g() {
        return this.f104952c;
    }

    @NotNull
    public final p h(@NotNull f x10, @NotNull f y10, @NotNull f z10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        return new p(x10, y10, z10);
    }

    public int hashCode() {
        return (((this.f104950a.hashCode() * 31) + this.f104951b.hashCode()) * 31) + this.f104952c.hashCode();
    }

    @NotNull
    public final p j() {
        f fVar = this.f104950a;
        this.f104950a = fVar.j();
        f fVar2 = this.f104951b;
        this.f104951b = fVar2.j();
        f fVar3 = this.f104952c;
        this.f104952c = fVar3.j();
        return new p(fVar, fVar2, fVar3);
    }

    @NotNull
    public final p k(float f10) {
        f fVar = this.f104950a;
        f fVar2 = new f(fVar.H() / f10, fVar.K() / f10, fVar.L() / f10);
        f fVar3 = this.f104951b;
        f fVar4 = new f(fVar3.H() / f10, fVar3.K() / f10, fVar3.L() / f10);
        f fVar5 = this.f104952c;
        return new p(fVar2, fVar4, new f(fVar5.H() / f10, fVar5.K() / f10, fVar5.L() / f10));
    }

    public final boolean l(float f10, float f11) {
        f fVarT = t();
        if (Math.abs(fVarT.H() - f10) < f11 && Math.abs(fVarT.K() - f10) < f11 && Math.abs(fVarT.L() - f10) < f11) {
            f fVarU = u();
            if (Math.abs(fVarU.H() - f10) < f11 && Math.abs(fVarU.K() - f10) < f11 && Math.abs(fVarU.L() - f10) < f11) {
                f fVarV = v();
                if (Math.abs(fVarV.H() - f10) < f11 && Math.abs(fVarV.K() - f10) < f11 && Math.abs(fVarV.L() - f10) < f11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m(@NotNull p m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        f fVarT = t();
        f fVarT2 = m10.t();
        if (Math.abs(fVarT.H() - fVarT2.H()) >= f10 || Math.abs(fVarT.K() - fVarT2.K()) >= f10 || Math.abs(fVarT.L() - fVarT2.L()) >= f10) {
            return false;
        }
        f fVarU = u();
        f fVarU2 = m10.u();
        if (Math.abs(fVarU.H() - fVarU2.H()) >= f10 || Math.abs(fVarU.K() - fVarU2.K()) >= f10 || Math.abs(fVarU.L() - fVarU2.L()) >= f10) {
            return false;
        }
        f fVarV = v();
        f fVarV2 = m10.v();
        return Math.abs(fVarV.H() - fVarV2.H()) < f10 && Math.abs(fVarV.K() - fVarV2.K()) < f10 && Math.abs(fVarV.L() - fVarV2.L()) < f10;
    }

    public final float p(int i10, int i11) {
        return r(i10).r(i11);
    }

    public final float q(@NotNull r column, int i10) {
        Intrinsics.checkNotNullParameter(column, "column");
        return s(column).r(i10);
    }

    @NotNull
    public final f r(int i10) {
        if (i10 == 0) {
            return this.f104950a;
        }
        if (i10 == 1) {
            return this.f104951b;
        }
        if (i10 == 2) {
            return this.f104952c;
        }
        throw new IllegalArgumentException("column must be in 0..2");
    }

    @NotNull
    public final f s(@NotNull r column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i10 = b.f104953a[column.ordinal()];
        if (i10 == 1) {
            return this.f104950a;
        }
        if (i10 == 2) {
            return this.f104951b;
        }
        if (i10 == 3) {
            return this.f104952c;
        }
        throw new IllegalArgumentException("column must be X, Y or Z");
    }

    @NotNull
    public final f t() {
        return this.f104950a;
    }

    @NotNull
    public String toString() {
        return StringsKt.p("\n            |" + this.f104950a.H() + " " + this.f104951b.H() + " " + this.f104952c.H() + "|\n            |" + this.f104950a.K() + " " + this.f104951b.K() + " " + this.f104952c.K() + "|\n            |" + this.f104950a.L() + " " + this.f104951b.L() + " " + this.f104952c.L() + "|\n            ");
    }

    @NotNull
    public final f u() {
        return this.f104951b;
    }

    @NotNull
    public final f v() {
        return this.f104952c;
    }

    @NotNull
    public final p w() {
        f fVar = this.f104950a;
        this.f104950a = fVar.M();
        f fVar2 = this.f104951b;
        this.f104951b = fVar2.M();
        f fVar3 = this.f104952c;
        this.f104952c = fVar3.M();
        return new p(fVar, fVar2, fVar3);
    }

    public final float x(int i10, int i11) {
        return r(i11 - 1).r(i10 - 1);
    }

    public final void y(int i10, int i11, float f10) {
        B(i11 - 1, i10 - 1, f10);
    }

    @NotNull
    public final p z(float f10) {
        f fVar = this.f104950a;
        f fVar2 = new f(fVar.H() - f10, fVar.K() - f10, fVar.L() - f10);
        f fVar3 = this.f104951b;
        f fVar4 = new f(fVar3.H() - f10, fVar3.K() - f10, fVar3.L() - f10);
        f fVar5 = this.f104952c;
        return new p(fVar2, fVar4, new f(fVar5.H() - f10, fVar5.K() - f10, fVar5.L() - f10));
    }

    public p(@NotNull f x10, @NotNull f y10, @NotNull f z10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        this.f104950a = x10;
        this.f104951b = y10;
        this.f104952c = z10;
    }

    public /* synthetic */ p(f fVar, f fVar2, f fVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new f(1.0f, 0.0f, 0.0f, 6, null) : fVar, (i10 & 2) != 0 ? new f(0.0f, 1.0f, 0.0f, 5, null) : fVar2, (i10 & 4) != 0 ? new f(0.0f, 0.0f, 1.0f, 3, null) : fVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull p m10) {
        this(f.i(m10.f104950a, 0.0f, 0.0f, 0.0f, 7, null), f.i(m10.f104951b, 0.0f, 0.0f, 0.0f, 7, null), f.i(m10.f104952c, 0.0f, 0.0f, 0.0f, 7, null));
        Intrinsics.checkNotNullParameter(m10, "m");
    }
}
