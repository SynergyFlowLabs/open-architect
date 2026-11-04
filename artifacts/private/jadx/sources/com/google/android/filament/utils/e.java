package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,2155:1\n617#2,6:2156\n617#2,6:2162\n622#2:2168\n617#2,6:2169\n617#2,6:2175\n617#2,6:2181\n617#2,6:2187\n622#2:2193\n*S KotlinDebug\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/Float2\n*L\n130#1:2156,6\n131#1:2162,6\n134#1:2168\n141#1:2169,6\n142#1:2175,6\n141#1:2181,6\n142#1:2187,6\n145#1:2193\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f104846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f104847b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104848a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h0.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f104848a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ e c(e eVar, float f10, float f11, int i10, Object obj) {
        float fCompare = 0.0f;
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        float fZ = eVar.z();
        float fCompare2 = Math.abs(fZ - f10) < f11 ? 0.0f : Float.compare(fZ, f10);
        float fB = eVar.B();
        if (Math.abs(fB - f10) >= f11) {
            fCompare = Float.compare(fB, f10);
        }
        return new e(fCompare2, fCompare);
    }

    public static /* synthetic */ e d(e eVar, e v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        float fZ = eVar.z();
        float fZ2 = v10.z();
        float fCompare = Math.abs(fZ - fZ2) < f10 ? 0.0f : Float.compare(fZ, fZ2);
        float fB = eVar.B();
        float fB2 = v10.B();
        return new e(fCompare, Math.abs(fB - fB2) >= f10 ? Float.compare(fB, fB2) : 0.0f);
    }

    public static /* synthetic */ e h(e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f104846a;
        }
        if ((i10 & 2) != 0) {
            f11 = eVar.f104847b;
        }
        return eVar.g(f10, f11);
    }

    public static /* synthetic */ boolean n(e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(eVar.z() - f10) < f11 && Math.abs(eVar.B() - f10) < f11;
    }

    public static /* synthetic */ boolean o(e eVar, e v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(eVar.z() - v10.z()) < f10 && Math.abs(eVar.B() - v10.B()) < f10;
    }

    @NotNull
    public final e A() {
        return new e(z(), B());
    }

    public final float B() {
        return this.f104847b;
    }

    @NotNull
    public final e C() {
        float f10 = this.f104846a;
        this.f104846a = f10 + 1.0f;
        float f11 = this.f104847b;
        this.f104847b = 1.0f + f11;
        return new e(f10, f11);
    }

    public final float D(int i10) {
        return p(i10 - 1);
    }

    @NotNull
    public final e E(float f10) {
        return new e(z() - f10, B() - f10);
    }

    @NotNull
    public final e F(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(z() - v10.z(), B() - v10.B());
    }

    @NotNull
    public final e G(float f10) {
        return new e(z() + f10, B() + f10);
    }

    @NotNull
    public final e H(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(z() + v10.z(), B() + v10.B());
    }

    public final void I(int i10, float f10) {
        if (i10 == 0) {
            this.f104846a = f10;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.f104847b = f10;
        }
    }

    public final void J(int i10, int i11, float f10) {
        I(i10, f10);
        I(i11, f10);
    }

    public final void K(@NotNull h0 index, float f10) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104848a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f104846a = f10;
                return;
            case 4:
            case 5:
            case 6:
                this.f104847b = f10;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final void L(@NotNull h0 index1, @NotNull h0 index2, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        K(index1, f10);
        K(index2, f10);
    }

    public final void M(float f10) {
        U(f10);
    }

    public final void N(float f10) {
        S(f10);
    }

    public final void O(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        S(value.z());
        U(value.B());
    }

    public final void P(float f10) {
        S(f10);
    }

    public final void Q(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        S(value.z());
        U(value.B());
    }

    public final void R(float f10) {
        U(f10);
    }

    public final void S(float f10) {
        this.f104846a = f10;
    }

    public final void T(@NotNull e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        S(value.z());
        U(value.B());
    }

    public final void U(float f10) {
        this.f104847b = f10;
    }

    @NotNull
    public final e V(float f10) {
        return new e(z() * f10, B() * f10);
    }

    @NotNull
    public final e W(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(z() * v10.z(), B() * v10.B());
    }

    @NotNull
    public final float[] X() {
        return new float[]{this.f104846a, this.f104847b};
    }

    @NotNull
    public final e Y(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        S(block.invoke(Float.valueOf(z())).floatValue());
        U(block.invoke(Float.valueOf(B())).floatValue());
        return this;
    }

    @NotNull
    public final e Z() {
        return new e(-this.f104846a, -this.f104847b);
    }

    @NotNull
    public final e a(float f10, float f11) {
        float fZ = z();
        float fCompare = Math.abs(fZ - f10) < f11 ? 0.0f : Float.compare(fZ, f10);
        float fB = B();
        return new e(fCompare, Math.abs(fB - f10) >= f11 ? Float.compare(fB, f10) : 0.0f);
    }

    @NotNull
    public final e b(@NotNull e v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fZ = z();
        float fZ2 = v10.z();
        float fCompare = Math.abs(fZ - fZ2) < f10 ? 0.0f : Float.compare(fZ, fZ2);
        float fB = B();
        float fB2 = v10.B();
        return new e(fCompare, Math.abs(fB - fB2) >= f10 ? Float.compare(fB, fB2) : 0.0f);
    }

    public final float e() {
        return this.f104846a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f104846a, eVar.f104846a) == 0 && Float.compare(this.f104847b, eVar.f104847b) == 0;
    }

    public final float f() {
        return this.f104847b;
    }

    @NotNull
    public final e g(float f10, float f11) {
        return new e(f10, f11);
    }

    public int hashCode() {
        return (Float.hashCode(this.f104846a) * 31) + Float.hashCode(this.f104847b);
    }

    @NotNull
    public final e i() {
        float f10 = this.f104846a;
        this.f104846a = f10 - 1.0f;
        float f11 = this.f104847b;
        this.f104847b = (-1.0f) + f11;
        return new e(f10, f11);
    }

    @NotNull
    public final e j(float f10) {
        return new e(z() / f10, B() / f10);
    }

    @NotNull
    public final e k(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(z() / v10.z(), B() / v10.B());
    }

    public final boolean l(float f10, float f11) {
        return Math.abs(z() - f10) < f11 && Math.abs(B() - f10) < f11;
    }

    public final boolean m(@NotNull e v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.abs(z() - v10.z()) < f10 && Math.abs(B() - v10.B()) < f10;
    }

    public final float p(int i10) {
        if (i10 == 0) {
            return this.f104846a;
        }
        if (i10 == 1) {
            return this.f104847b;
        }
        throw new IllegalArgumentException("index must be in 0..1");
    }

    public final float q(@NotNull h0 index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f104848a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f104846a;
            case 4:
            case 5:
            case 6:
                return this.f104847b;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    @NotNull
    public final e r(int i10, int i11) {
        return new e(p(i10), p(i11));
    }

    @NotNull
    public final e s(@NotNull h0 index1, @NotNull h0 index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new e(q(index1), q(index2));
    }

    public final float t() {
        return B();
    }

    @NotNull
    public String toString() {
        return "Float2(x=" + this.f104846a + ", y=" + this.f104847b + ")";
    }

    public final float u() {
        return z();
    }

    @NotNull
    public final e v() {
        return new e(z(), B());
    }

    public final float w() {
        return z();
    }

    @NotNull
    public final e x() {
        return new e(z(), B());
    }

    public final float y() {
        return B();
    }

    public final float z() {
        return this.f104846a;
    }

    public e(float f10, float f11) {
        this.f104846a = f10;
        this.f104847b = f11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        int i11 = 1 >> 0;
    }

    public e(float f10) {
        this(f10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull e v10) {
        this(v10.f104846a, v10.f104847b);
        Intrinsics.checkNotNullParameter(v10, "v");
    }
}
