package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n1#1,509:1\n137#1:510\n285#1,6:561\n137#1:567\n617#2,6:511\n617#2,6:517\n617#2,6:523\n617#2,6:529\n617#2,6:535\n617#2,6:541\n617#2,6:547\n622#2:553\n622#2:554\n622#2:555\n622#2:556\n622#2:557\n622#2:558\n622#2:559\n622#2:560\n617#2,6:568\n617#2,6:574\n617#2,6:580\n617#2,6:586\n617#2,6:592\n617#2,6:598\n617#2,6:604\n617#2,6:610\n622#2:616\n622#2:617\n622#2:618\n622#2:619\n622#2:620\n622#2:621\n622#2:622\n622#2:623\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion\n*L\n145#1:510\n281#1:561,6\n281#1:567\n268#1:511,6\n269#1:517,6\n270#1:523,6\n271#1:529,6\n269#1:535,6\n270#1:541,6\n271#1:547,6\n275#1:553\n276#1:554\n277#1:555\n278#1:556\n275#1:557\n276#1:558\n277#1:559\n278#1:560\n293#1:568,6\n294#1:574,6\n295#1:580,6\n296#1:586,6\n293#1:592,6\n294#1:598,6\n295#1:604,6\n296#1:610,6\n300#1:616\n301#1:617\n302#1:618\n303#1:619\n300#1:620\n301#1:621\n302#1:622\n303#1:623\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f105009e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f105010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f105011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f105012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f105013d;

    @SourceDebugExtension({"SMAP\nQuaternion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n+ 2 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,509:1\n48#2:510\n48#2:514\n726#3:511\n794#3:512\n336#4:513\n337#4,3:515\n*S KotlinDebug\n*F\n+ 1 Quaternion.kt\ncom/google/android/filament/utils/Quaternion$Companion\n*L\n50#1:510\n70#1:514\n51#1:511\n70#1:512\n70#1:513\n70#1:515,3\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: com.google.android.filament.utils.w$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0958a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f105014a;

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
                f105014a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ w d(a aVar, float f10, float f11, float f12, c0 c0Var, int i10, Object obj) {
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
            return aVar.b(f10, f11, f12, c0Var);
        }

        public static /* synthetic */ w e(a aVar, f fVar, c0 c0Var, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                c0Var = c0.f104828i;
            }
            return aVar.c(fVar, c0Var);
        }

        @NotNull
        public final w a(@NotNull f axis, float f10) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            double d10 = f10 * 0.017453292f * 0.5f;
            float fSin = (float) Math.sin(d10);
            f fVarW3 = i0.w3(axis);
            return new w(new f(fVarW3.H() * fSin, fVarW3.K() * fSin, fSin * fVarW3.L()), (float) Math.cos(d10));
        }

        @NotNull
        public final w b(float f10, float f11, float f12, @NotNull c0 order) {
            Intrinsics.checkNotNullParameter(order, "order");
            double d10 = f10 * 0.5f;
            float fCos = (float) Math.cos(d10);
            float fSin = (float) Math.sin(d10);
            double d11 = f11 * 0.5f;
            float fCos2 = (float) Math.cos(d11);
            float fSin2 = (float) Math.sin(d11);
            double d12 = f12 * 0.5f;
            float fCos3 = (float) Math.cos(d12);
            float fSin3 = (float) Math.sin(d12);
            switch (C0958a.f105014a[order.ordinal()]) {
                case 1:
                    float f13 = fSin * fCos2;
                    float f14 = fCos * fSin2;
                    float f15 = fCos * fCos2;
                    float f16 = fSin * fSin2;
                    return new w((f13 * fCos3) - (f14 * fSin3), (f15 * fSin3) - (f16 * fCos3), (f13 * fSin3) + (f14 * fCos3), (f16 * fSin3) + (f15 * fCos3));
                case 2:
                    float f17 = (fSin * fCos2 * fCos3) + (fSin2 * fSin3 * fCos);
                    float f18 = ((fSin2 * fCos) * fCos3) - ((fSin * fSin3) * fCos2);
                    float f19 = fSin * fSin2;
                    return new w(f17, f18, (f19 * fCos3) + (fSin3 * fCos * fCos2), ((fCos * fCos2) * fCos3) - (f19 * fSin3));
                case 3:
                    float f20 = fSin * fCos2;
                    float f21 = fCos * fSin2;
                    float f22 = fCos * fCos2;
                    float f23 = fSin * fSin2;
                    return new w((f20 * fSin3) + (f21 * fCos3), (f20 * fCos3) - (f21 * fSin3), (f22 * fSin3) - (f23 * fCos3), (f23 * fSin3) + (f22 * fCos3));
                case 4:
                    float f24 = fSin * fSin2;
                    float f25 = fCos * fCos2;
                    float f26 = fSin * fCos2;
                    float f27 = fCos * fSin2;
                    return new w((f24 * fCos3) + (f25 * fSin3), (f26 * fCos3) + (f27 * fSin3), (f27 * fCos3) - (f26 * fSin3), (f25 * fCos3) - (f24 * fSin3));
                case 5:
                    float f28 = fCos * fCos2;
                    float f29 = fSin * fSin2;
                    float f30 = fSin * fCos2;
                    float f31 = fCos * fSin2;
                    return new w((f28 * fSin3) - (f29 * fCos3), (f30 * fSin3) + (f31 * fCos3), (f30 * fCos3) - (f31 * fSin3), (f29 * fSin3) + (f28 * fCos3));
                case 6:
                    float f32 = fCos * fSin2;
                    float f33 = fSin * fCos2;
                    float f34 = fSin * fSin2;
                    float f35 = fCos * fCos2;
                    return new w((f32 * fCos3) - (f33 * fSin3), (f34 * fCos3) + (f35 * fSin3), (f33 * fCos3) + (f32 * fSin3), (f35 * fCos3) - (f34 * fSin3));
                default:
                    throw new k0();
            }
        }

        @NotNull
        public final w c(@NotNull f d10, @NotNull c0 order) {
            Intrinsics.checkNotNullParameter(d10, "d");
            Intrinsics.checkNotNullParameter(order, "order");
            f fVarI = f.i(d10, 0.0f, 0.0f, 0.0f, 7, null);
            fVarI.k0(fVarI.H() * 0.017453292f);
            fVarI.n0(fVarI.K() * 0.017453292f);
            fVarI.o0(fVarI.L() * 0.017453292f);
            return b(fVarI.s(order.p()), fVarI.s(order.n()), fVarI.s(order.o()), order);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105015a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105015a = iArr;
        }
    }

    public w() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ g c(w wVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        float fY = wVar.y();
        float fCompare = Math.abs(fY - f10) < f11 ? 0.0f : Float.compare(fY, f10);
        float fB = wVar.B();
        float fCompare2 = Math.abs(fB - f10) < f11 ? 0.0f : Float.compare(fB, f10);
        float fC = wVar.C();
        float fCompare3 = Math.abs(fC - f10) < f11 ? 0.0f : Float.compare(fC, f10);
        float fX = wVar.x();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fX - f10) >= f11 ? Float.compare(fX, f10) : 0.0f);
    }

    public static /* synthetic */ g d(w wVar, g v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        float fY = wVar.y();
        float fQ = v10.Q();
        float fCompare = Math.abs(fY - fQ) < f10 ? 0.0f : Float.compare(fY, fQ);
        float fB = wVar.B();
        float fU = v10.U();
        float fCompare2 = Math.abs(fB - fU) < f10 ? 0.0f : Float.compare(fB, fU);
        float fC = wVar.C();
        float fV = v10.V();
        float fCompare3 = Math.abs(fC - fV) < f10 ? 0.0f : Float.compare(fC, fV);
        float fX = wVar.x();
        float fP = v10.P();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fX - fP) >= f10 ? Float.compare(fX, fP) : 0.0f);
    }

    public static /* synthetic */ w j(w wVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = wVar.f105010a;
        }
        if ((i10 & 2) != 0) {
            f11 = wVar.f105011b;
        }
        if ((i10 & 4) != 0) {
            f12 = wVar.f105012c;
        }
        if ((i10 & 8) != 0) {
            f13 = wVar.f105013d;
        }
        return wVar.i(f10, f11, f12, f13);
    }

    public static /* synthetic */ c n(w wVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new c(Math.abs(wVar.y() - f10) < f11, Math.abs(wVar.B() - f10) < f11, Math.abs(wVar.C() - f10) < f11, Math.abs(wVar.x() - f10) < f11);
    }

    public static /* synthetic */ c o(w wVar, g v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(v10, "v");
        return new c(Math.abs(wVar.y() - v10.Q()) < f10, Math.abs(wVar.B() - v10.U()) < f10, Math.abs(wVar.C() - v10.V()) < f10, Math.abs(wVar.x() - v10.P()) < f10);
    }

    @NotNull
    public final g A() {
        return new g(y(), B(), C(), x());
    }

    public final float B() {
        return this.f105011b;
    }

    public final float C() {
        return this.f105012c;
    }

    public final float D(int i10) {
        return p(i10 - 1);
    }

    @NotNull
    public final w E(float f10) {
        return new w(y() - f10, B() - f10, C() - f10, x() - f10);
    }

    @NotNull
    public final w F(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(y() - q10.y(), B() - q10.B(), C() - q10.C(), x() - q10.x());
    }

    @NotNull
    public final w G(float f10) {
        return new w(y() + f10, B() + f10, C() + f10, x() + f10);
    }

    @NotNull
    public final w H(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w(y() + q10.y(), B() + q10.B(), C() + q10.C(), x() + q10.x());
    }

    public final void I(int i10, float f10) {
        if (i10 == 0) {
            this.f105010a = f10;
            return;
        }
        if (i10 == 1) {
            this.f105011b = f10;
        } else if (i10 == 2) {
            this.f105012c = f10;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.f105013d = f10;
        }
    }

    public final void J(int i10, int i11, float f10) {
        I(i10, f10);
        I(i11, f10);
    }

    public final void K(int i10, int i11, int i12, float f10) {
        I(i10, f10);
        I(i11, f10);
        I(i12, f10);
    }

    public final void L(int i10, int i11, int i12, int i13, float f10) {
        I(i10, f10);
        I(i11, f10);
        I(i12, f10);
        I(i13, f10);
    }

    public final void M(@NotNull x index, float f10) {
        Intrinsics.checkNotNullParameter(index, "index");
        int i10 = b.f105015a[index.ordinal()];
        if (i10 == 1) {
            this.f105010a = f10;
            return;
        }
        int i11 = 1 | 2;
        if (i10 == 2) {
            this.f105011b = f10;
        } else if (i10 == 3) {
            this.f105012c = f10;
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            this.f105013d = f10;
        }
    }

    public final void N(@NotNull x index1, @NotNull x index2, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        M(index1, f10);
        M(index2, f10);
    }

    public final void O(@NotNull x index1, @NotNull x index2, @NotNull x index3, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        M(index1, f10);
        M(index2, f10);
        M(index3, f10);
    }

    public final void P(@NotNull x index1, @NotNull x index2, @NotNull x index3, @NotNull x index4, float f10) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        M(index1, f10);
        M(index2, f10);
        M(index3, f10);
        M(index4, f10);
    }

    public final void Q(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T(value.H());
        W(value.K());
        X(value.L());
    }

    public final void R(float f10) {
        S(f10);
    }

    public final void S(float f10) {
        this.f105013d = f10;
    }

    public final void T(float f10) {
        this.f105010a = f10;
    }

    public final void U(@NotNull f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T(value.H());
        W(value.K());
        X(value.L());
    }

    public final void V(@NotNull g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T(value.Q());
        W(value.U());
        X(value.V());
        S(value.P());
    }

    public final void W(float f10) {
        this.f105011b = f10;
    }

    public final void X(float f10) {
        this.f105012c = f10;
    }

    @NotNull
    public final f Y(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        w wVar = new w(v10, 0.0f);
        w wVar2 = new w((((x() * wVar.y()) + (y() * wVar.x())) + (B() * wVar.C())) - (C() * wVar.B()), ((x() * wVar.B()) - (y() * wVar.C())) + (B() * wVar.x()) + (C() * wVar.y()), (((x() * wVar.C()) + (y() * wVar.B())) - (B() * wVar.y())) + (C() * wVar.x()), (((x() * wVar.x()) - (y() * wVar.y())) - (B() * wVar.B())) - (C() * wVar.C()));
        w wVarW = y.w(this);
        w wVar3 = new w((((wVar2.x() * wVarW.y()) + (wVar2.y() * wVarW.x())) + (wVar2.B() * wVarW.C())) - (wVar2.C() * wVarW.B()), ((wVar2.x() * wVarW.B()) - (wVar2.y() * wVarW.C())) + (wVar2.B() * wVarW.x()) + (wVar2.C() * wVarW.y()), (((wVar2.x() * wVarW.C()) + (wVar2.y() * wVarW.B())) - (wVar2.B() * wVarW.y())) + (wVar2.C() * wVarW.x()), (((wVar2.x() * wVarW.x()) - (wVar2.y() * wVarW.y())) - (wVar2.B() * wVarW.B())) - (wVar2.C() * wVarW.C()));
        return new f(wVar3.y(), wVar3.B(), wVar3.C());
    }

    @NotNull
    public final w Z(float f10) {
        return new w(y() * f10, B() * f10, C() * f10, x() * f10);
    }

    @NotNull
    public final g a(float f10, float f11) {
        float fY = y();
        float fCompare = Math.abs(fY - f10) < f11 ? 0.0f : Float.compare(fY, f10);
        float fB = B();
        float fCompare2 = Math.abs(fB - f10) < f11 ? 0.0f : Float.compare(fB, f10);
        float fC = C();
        float fCompare3 = Math.abs(fC - f10) < f11 ? 0.0f : Float.compare(fC, f10);
        float fX = x();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fX - f10) >= f11 ? Float.compare(fX, f10) : 0.0f);
    }

    @NotNull
    public final w a0(@NotNull w q10) {
        Intrinsics.checkNotNullParameter(q10, "q");
        return new w((((x() * q10.y()) + (y() * q10.x())) + (B() * q10.C())) - (C() * q10.B()), ((x() * q10.B()) - (y() * q10.C())) + (B() * q10.x()) + (C() * q10.y()), (((x() * q10.C()) + (y() * q10.B())) - (B() * q10.y())) + (C() * q10.x()), (((x() * q10.x()) - (y() * q10.y())) - (B() * q10.B())) - (C() * q10.C()));
    }

    @NotNull
    public final g b(@NotNull g v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fY = y();
        float fQ = v10.Q();
        float fCompare = Math.abs(fY - fQ) < f10 ? 0.0f : Float.compare(fY, fQ);
        float fB = B();
        float fU = v10.U();
        float fCompare2 = Math.abs(fB - fU) < f10 ? 0.0f : Float.compare(fB, fU);
        float fC = C();
        float fV = v10.V();
        float fCompare3 = Math.abs(fC - fV) < f10 ? 0.0f : Float.compare(fC, fV);
        float fX = x();
        float fP = v10.P();
        return new g(fCompare, fCompare2, fCompare3, Math.abs(fX - fP) >= f10 ? Float.compare(fX, fP) : 0.0f);
    }

    @NotNull
    public final f b0() {
        return y.n(this, null, 2, null);
    }

    @NotNull
    public final float[] c0() {
        return new float[]{this.f105010a, this.f105011b, this.f105012c, this.f105013d};
    }

    @NotNull
    public final q d0() {
        return s.O(this);
    }

    public final float e() {
        return this.f105010a;
    }

    @NotNull
    public final w e0(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T(block.invoke(Float.valueOf(y())).floatValue());
        W(block.invoke(Float.valueOf(B())).floatValue());
        X(block.invoke(Float.valueOf(C())).floatValue());
        S(block.invoke(Float.valueOf(x())).floatValue());
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f105010a, wVar.f105010a) == 0 && Float.compare(this.f105011b, wVar.f105011b) == 0 && Float.compare(this.f105012c, wVar.f105012c) == 0 && Float.compare(this.f105013d, wVar.f105013d) == 0;
    }

    public final float f() {
        return this.f105011b;
    }

    @NotNull
    public final w f0() {
        return new w(-this.f105010a, -this.f105011b, -this.f105012c, -this.f105013d);
    }

    public final float g() {
        return this.f105012c;
    }

    public final float h() {
        return this.f105013d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f105010a) * 31) + Float.hashCode(this.f105011b)) * 31) + Float.hashCode(this.f105012c)) * 31) + Float.hashCode(this.f105013d);
    }

    @NotNull
    public final w i(float f10, float f11, float f12, float f13) {
        return new w(f10, f11, f12, f13);
    }

    @NotNull
    public final w k(float f10) {
        return new w(y() / f10, B() / f10, C() / f10, x() / f10);
    }

    @NotNull
    public final c l(float f10, float f11) {
        return new c(Math.abs(y() - f10) < f11, Math.abs(B() - f10) < f11, Math.abs(C() - f10) < f11, Math.abs(x() - f10) < f11);
    }

    @NotNull
    public final c m(@NotNull g v10, float f10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new c(Math.abs(y() - v10.Q()) < f10, Math.abs(B() - v10.U()) < f10, Math.abs(C() - v10.V()) < f10, Math.abs(x() - v10.P()) < f10);
    }

    public final float p(int i10) {
        if (i10 == 0) {
            return this.f105010a;
        }
        if (i10 == 1) {
            return this.f105011b;
        }
        if (i10 == 2) {
            return this.f105012c;
        }
        if (i10 == 3) {
            return this.f105013d;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public final float q(@NotNull x index) {
        Intrinsics.checkNotNullParameter(index, "index");
        int i10 = b.f105015a[index.ordinal()];
        int i11 = 4 | 1;
        if (i10 == 1) {
            return this.f105010a;
        }
        if (i10 == 2) {
            return this.f105011b;
        }
        if (i10 == 3) {
            return this.f105012c;
        }
        if (i10 == 4) {
            return this.f105013d;
        }
        throw new k0();
    }

    @NotNull
    public final f r(int i10, int i11, int i12) {
        return new f(p(i10), p(i11), p(i12));
    }

    @NotNull
    public final f s(@NotNull x index1, @NotNull x index2, @NotNull x index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new f(q(index1), q(index2), q(index3));
    }

    @NotNull
    public final w t(int i10, int i11, int i12, int i13) {
        return new w(p(i10), p(i11), p(i12), p(i13));
    }

    @NotNull
    public String toString() {
        return "Quaternion(x=" + this.f105010a + ", y=" + this.f105011b + ", z=" + this.f105012c + ", w=" + this.f105013d + ")";
    }

    @NotNull
    public final w u(@NotNull x index1, @NotNull x index2, @NotNull x index3, @NotNull x index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new w(q(index1), q(index2), q(index3), q(index4));
    }

    @NotNull
    public final f v() {
        return new f(y(), B(), C());
    }

    public final float w() {
        return x();
    }

    public final float x() {
        return this.f105013d;
    }

    public final float y() {
        return this.f105010a;
    }

    @NotNull
    public final f z() {
        return new f(y(), B(), C());
    }

    public w(float f10, float f11, float f12, float f13) {
        this.f105010a = f10;
        this.f105011b = f11;
        this.f105012c = f12;
        this.f105013d = f13;
    }

    public /* synthetic */ w(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 1.0f : f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@NotNull f v10, float f10) {
        this(v10.H(), v10.K(), v10.L(), f10);
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    public /* synthetic */ w(f fVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? 1.0f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@NotNull g v10) {
        this(v10.Q(), v10.U(), v10.V(), v10.P());
        Intrinsics.checkNotNullParameter(v10, "v");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@NotNull w q10) {
        this(q10.f105010a, q10.f105011b, q10.f105012c, q10.f105013d);
        Intrinsics.checkNotNullParameter(q10, "q");
    }
}
