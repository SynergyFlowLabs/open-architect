package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,908:1\n63#2,3:909\n125#2:912\n126#2:913\n127#2:914\n128#2:915\n129#2,2:916\n131#2,2:924\n129#2,2:926\n131#2,2:934\n129#2,4:936\n129#2,4:940\n134#2:944\n140#2,2:946\n142#2,2:954\n140#2,2:956\n142#2,2:964\n140#2,2:966\n142#2,2:974\n140#2,2:976\n142#2,2:984\n145#2:986\n617#3,6:918\n617#3,6:928\n622#3:945\n617#3,6:948\n617#3,6:958\n617#3,6:968\n617#3,6:978\n622#3:987\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\ncom/google/android/filament/utils/Mat2\n*L\n74#1:909,3\n84#1:912\n85#1:913\n86#1:914\n87#1:915\n89#1:916,2\n89#1:924,2\n90#1:926,2\n90#1:934,2\n89#1:936,4\n90#1:940,4\n93#1:944\n107#1:946,2\n107#1:954,2\n108#1:956,2\n108#1:964,2\n107#1:966,2\n107#1:974,2\n108#1:976,2\n108#1:984,2\n111#1:986\n89#1:918,6\n90#1:928,6\n93#1:945\n107#1:948,6\n108#1:958,6\n107#1:968,6\n108#1:978,6\n111#1:987\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f104945c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private e f104946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private e f104947b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final o a() {
            return new o(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @NotNull
        public final o b(@NotNull float... a10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            if (a10.length >= 4) {
                return new o(new e(a10[0], a10[2]), new e(a10[1], a10[3]));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104948a;

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
            f104948a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ o c(o oVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        e eVarS = oVar.s();
        float fZ = eVarS.z();
        float fCompare = Math.abs(fZ - f10) < f11 ? 0.0f : Float.compare(fZ, f10);
        float fB = eVarS.B();
        e eVar = new e(fCompare, Math.abs(fB - f10) < f11 ? 0.0f : Float.compare(fB, f10));
        e eVarT = oVar.t();
        float fZ2 = eVarT.z();
        float fCompare2 = Math.abs(fZ2 - f10) < f11 ? 0.0f : Float.compare(fZ2, f10);
        float fB2 = eVarT.B();
        return new o(eVar, new e(fCompare2, Math.abs(fB2 - f10) >= f11 ? Float.compare(fB2, f10) : 0.0f));
    }

    public static /* synthetic */ o d(o oVar, o m10, float f10, int i10, Object obj) {
        float fCompare = 0.0f;
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        e eVarS = oVar.s();
        e eVarS2 = m10.s();
        float fZ = eVarS.z();
        float fZ2 = eVarS2.z();
        float fCompare2 = Math.abs(fZ - fZ2) < f10 ? 0.0f : Float.compare(fZ, fZ2);
        float fB = eVarS.B();
        float fB2 = eVarS2.B();
        e eVar = new e(fCompare2, Math.abs(fB - fB2) < f10 ? 0.0f : Float.compare(fB, fB2));
        e eVarT = oVar.t();
        e eVarT2 = m10.t();
        float fZ3 = eVarT.z();
        float fZ4 = eVarT2.z();
        float fCompare3 = Math.abs(fZ3 - fZ4) < f10 ? 0.0f : Float.compare(fZ3, fZ4);
        float fB3 = eVarT.B();
        float fB4 = eVarT2.B();
        if (Math.abs(fB3 - fB4) >= f10) {
            fCompare = Float.compare(fB3, fB4);
        }
        return new o(eVar, new e(fCompare3, fCompare));
    }

    public static /* synthetic */ o h(o oVar, e eVar, e eVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = oVar.f104946a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = oVar.f104947b;
        }
        return oVar.g(eVar, eVar2);
    }

    public static /* synthetic */ boolean m(o oVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        e eVarS = oVar.s();
        if (Math.abs(eVarS.z() - f10) >= f11 || Math.abs(eVarS.B() - f10) >= f11) {
            return false;
        }
        e eVarT = oVar.t();
        return Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11;
    }

    public static /* synthetic */ boolean n(o oVar, o m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(m10, "m");
        e eVarS = oVar.s();
        e eVarS2 = m10.s();
        if (Math.abs(eVarS.z() - eVarS2.z()) >= f10 || Math.abs(eVarS.B() - eVarS2.B()) >= f10) {
            return false;
        }
        e eVarT = oVar.t();
        e eVarT2 = m10.t();
        return Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10;
    }

    public final void A(int i10, @NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        e eVarQ = q(i10);
        eVarQ.S(v10.z());
        eVarQ.U(v10.B());
    }

    public final void B(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f104946a = eVar;
    }

    public final void C(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f104947b = eVar;
    }

    @NotNull
    public final e D(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e((this.f104946a.z() * v10.z()) + (this.f104947b.z() * v10.B()), (this.f104946a.B() * v10.z()) + (this.f104947b.B() * v10.B()));
    }

    @NotNull
    public final o E(float f10) {
        e eVar = this.f104946a;
        e eVar2 = new e(eVar.z() * f10, eVar.B() * f10);
        e eVar3 = this.f104947b;
        return new o(eVar2, new e(eVar3.z() * f10, eVar3.B() * f10));
    }

    @NotNull
    public final o F(@NotNull o m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return new o(new e((this.f104946a.z() * m10.f104946a.z()) + (this.f104947b.z() * m10.f104946a.B()), (this.f104946a.B() * m10.f104946a.z()) + (this.f104947b.B() * m10.f104946a.B())), new e((this.f104946a.z() * m10.f104947b.z()) + (this.f104947b.z() * m10.f104947b.B()), (this.f104946a.B() * m10.f104947b.z()) + (this.f104947b.B() * m10.f104947b.B())));
    }

    @NotNull
    public final float[] G() {
        return new float[]{this.f104946a.z(), this.f104947b.z(), this.f104946a.B(), this.f104947b.B()};
    }

    @NotNull
    public final o H() {
        return new o(this.f104946a.Z(), this.f104947b.Z());
    }

    @NotNull
    public final o a(float f10, float f11) {
        e eVarS = s();
        float fZ = eVarS.z();
        float fCompare = Math.abs(fZ - f10) < f11 ? 0.0f : Float.compare(fZ, f10);
        float fB = eVarS.B();
        e eVar = new e(fCompare, Math.abs(fB - f10) < f11 ? 0.0f : Float.compare(fB, f10));
        e eVarT = t();
        float fZ2 = eVarT.z();
        float fCompare2 = Math.abs(fZ2 - f10) < f11 ? 0.0f : Float.compare(fZ2, f10);
        float fB2 = eVarT.B();
        return new o(eVar, new e(fCompare2, Math.abs(fB2 - f10) >= f11 ? Float.compare(fB2, f10) : 0.0f));
    }

    @NotNull
    public final o b(@NotNull o m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        e eVarS = s();
        e eVarS2 = m10.s();
        float fZ = eVarS.z();
        float fZ2 = eVarS2.z();
        float fCompare = Math.abs(fZ - fZ2) < f10 ? 0.0f : Float.compare(fZ, fZ2);
        float fB = eVarS.B();
        float fB2 = eVarS2.B();
        e eVar = new e(fCompare, Math.abs(fB - fB2) < f10 ? 0.0f : Float.compare(fB, fB2));
        e eVarT = t();
        e eVarT2 = m10.t();
        float fZ3 = eVarT.z();
        float fZ4 = eVarT2.z();
        float fCompare2 = Math.abs(fZ3 - fZ4) < f10 ? 0.0f : Float.compare(fZ3, fZ4);
        float fB3 = eVarT.B();
        float fB4 = eVarT2.B();
        return new o(eVar, new e(fCompare2, Math.abs(fB3 - fB4) >= f10 ? Float.compare(fB3, fB4) : 0.0f));
    }

    @NotNull
    public final e e() {
        return this.f104946a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f104946a, oVar.f104946a) && Intrinsics.areEqual(this.f104947b, oVar.f104947b);
    }

    @NotNull
    public final e f() {
        return this.f104947b;
    }

    @NotNull
    public final o g(@NotNull e x10, @NotNull e y10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        return new o(x10, y10);
    }

    public int hashCode() {
        return (this.f104946a.hashCode() * 31) + this.f104947b.hashCode();
    }

    @NotNull
    public final o i() {
        e eVar = this.f104946a;
        this.f104946a = eVar.i();
        e eVar2 = this.f104947b;
        this.f104947b = eVar2.i();
        return new o(eVar, eVar2);
    }

    @NotNull
    public final o j(float f10) {
        e eVar = this.f104946a;
        e eVar2 = new e(eVar.z() / f10, eVar.B() / f10);
        e eVar3 = this.f104947b;
        return new o(eVar2, new e(eVar3.z() / f10, eVar3.B() / f10));
    }

    public final boolean k(float f10, float f11) {
        e eVarS = s();
        if (Math.abs(eVarS.z() - f10) >= f11 || Math.abs(eVarS.B() - f10) >= f11) {
            return false;
        }
        e eVarT = t();
        return Math.abs(eVarT.z() - f10) < f11 && Math.abs(eVarT.B() - f10) < f11;
    }

    public final boolean l(@NotNull o m10, float f10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        e eVarS = s();
        e eVarS2 = m10.s();
        if (Math.abs(eVarS.z() - eVarS2.z()) >= f10 || Math.abs(eVarS.B() - eVarS2.B()) >= f10) {
            return false;
        }
        e eVarT = t();
        e eVarT2 = m10.t();
        return Math.abs(eVarT.z() - eVarT2.z()) < f10 && Math.abs(eVarT.B() - eVarT2.B()) < f10;
    }

    public final float o(int i10, int i11) {
        return q(i10).p(i11);
    }

    public final float p(@NotNull r column, int i10) {
        Intrinsics.checkNotNullParameter(column, "column");
        return r(column).p(i10);
    }

    @NotNull
    public final e q(int i10) {
        if (i10 == 0) {
            return this.f104946a;
        }
        if (i10 == 1) {
            return this.f104947b;
        }
        throw new IllegalArgumentException("column must be in 0..1");
    }

    @NotNull
    public final e r(@NotNull r column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i10 = b.f104948a[column.ordinal()];
        if (i10 == 1) {
            return this.f104946a;
        }
        if (i10 == 2) {
            return this.f104947b;
        }
        throw new IllegalArgumentException("column must be X or Y");
    }

    @NotNull
    public final e s() {
        return this.f104946a;
    }

    @NotNull
    public final e t() {
        return this.f104947b;
    }

    @NotNull
    public String toString() {
        return StringsKt.p("\n            |" + this.f104946a.z() + " " + this.f104947b.z() + "|\n            |" + this.f104946a.B() + " " + this.f104947b.B() + "|\n            ");
    }

    @NotNull
    public final o u() {
        e eVar = this.f104946a;
        this.f104946a = eVar.C();
        e eVar2 = this.f104947b;
        this.f104947b = eVar2.C();
        return new o(eVar, eVar2);
    }

    public final float v(int i10, int i11) {
        return q(i11 - 1).p(i10 - 1);
    }

    public final void w(int i10, int i11, float f10) {
        z(i11 - 1, i10 - 1, f10);
    }

    @NotNull
    public final o x(float f10) {
        e eVar = this.f104946a;
        e eVar2 = new e(eVar.z() - f10, eVar.B() - f10);
        e eVar3 = this.f104947b;
        return new o(eVar2, new e(eVar3.z() - f10, eVar3.B() - f10));
    }

    @NotNull
    public final o y(float f10) {
        e eVar = this.f104946a;
        e eVar2 = new e(eVar.z() + f10, eVar.B() + f10);
        e eVar3 = this.f104947b;
        return new o(eVar2, new e(eVar3.z() + f10, eVar3.B() + f10));
    }

    public final void z(int i10, int i11, float f10) {
        q(i10).I(i11, f10);
    }

    public o(@NotNull e x10, @NotNull e y10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        this.f104946a = x10;
        this.f104947b = y10;
    }

    public /* synthetic */ o(e eVar, e eVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new e(1.0f, 0.0f, 2, null) : eVar, (i10 & 2) != 0 ? new e(0.0f, 1.0f, 1, null) : eVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@NotNull o m10) {
        this(e.h(m10.f104946a, 0.0f, 0.0f, 3, null), e.h(m10.f104947b, 0.0f, 0.0f, 3, null));
        Intrinsics.checkNotNullParameter(m10, "m");
    }
}
