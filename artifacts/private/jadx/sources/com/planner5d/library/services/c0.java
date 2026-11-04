package com.planner5d.library.services;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
public final class c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f224219g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f224220h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f224221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f224222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f224223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f224224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k[] f224225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f224226f;

    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.services.c0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1669a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f224227a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Left.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.Right.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.Top.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.Bottom.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f224227a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final b a(@NotNull b side) {
            Intrinsics.checkNotNullParameter(side, "side");
            int i10 = C1669a.f224227a[side.ordinal()];
            if (i10 == 1) {
                return b.Right;
            }
            if (i10 == 2) {
                return b.Left;
            }
            if (i10 == 3) {
                return b.Bottom;
            }
            int i11 = 7 | 4;
            if (i10 == 4) {
                return b.Top;
            }
            throw new kotlin.k0();
        }

        private a() {
        }
    }

    public enum b {
        Left,
        Top,
        Right,
        Bottom;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f224233f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f224233f;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224234a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f224234a = iArr;
        }
    }

    public c0() {
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k(-1.0f, -1.0f);
        this.f224221a = kVar;
        com.planner5d.library.math.k kVar2 = new com.planner5d.library.math.k(1.0f, -1.0f);
        this.f224222b = kVar2;
        com.planner5d.library.math.k kVar3 = new com.planner5d.library.math.k(-1.0f, 1.0f);
        this.f224223c = kVar3;
        com.planner5d.library.math.k kVar4 = new com.planner5d.library.math.k(1.0f, -1.0f);
        this.f224224d = kVar4;
        this.f224225e = new com.planner5d.library.math.k[]{kVar3, kVar, kVar2, kVar4};
        this.f224226f = new com.planner5d.library.math.k();
    }

    private final com.planner5d.library.math.k c(com.planner5d.library.math.k kVar) {
        return kVar.V(this.f224221a).c0(this.f224224d);
    }

    @oj.n
    @NotNull
    public static final b i(@NotNull b bVar) {
        return f224219g.a(bVar);
    }

    private final boolean m(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        float f10 = kVar.f180480a;
        if (f10 < 0.0f || f10 > kVar2.f180480a) {
            return true;
        }
        float f11 = kVar.f180481b;
        return f11 < 0.0f || f11 > kVar2.f180481b;
    }

    public final boolean a(float f10, float f11) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            com.planner5d.library.math.k[] kVarArr = this.f224225e;
            if (i10 >= kVarArr.length) {
                break;
            }
            com.planner5d.library.math.k kVar = kVarArr[i10];
            i10++;
            com.planner5d.library.math.k kVar2 = kVarArr[i10 % kVarArr.length];
            float f12 = kVar.f180481b;
            if ((f12 <= f11 && f11 < kVar2.f180481b) || (kVar2.f180481b <= f11 && f11 < f12)) {
                float f13 = kVar2.f180480a;
                float f14 = kVar.f180480a;
                if (f10 < (((f13 - f14) / (kVar2.f180481b - f12)) * (f11 - f12)) + f14) {
                    i11++;
                }
            }
        }
        return (i11 & 1) == 1;
    }

    @NotNull
    public final com.planner5d.library.math.k b(@NotNull com.planner5d.library.math.k center) {
        Intrinsics.checkNotNullParameter(center, "center");
        return center.V(this.f224224d).c0(this.f224221a).R(0.5f).b(this.f224221a);
    }

    public final float d() {
        return c(this.f224226f).F();
    }

    public final float e() {
        return this.f224226f.V(this.f224223c).c0(this.f224221a).F();
    }

    public final float f(@Nullable b bVar, @NotNull com.planner5d.library.math.k point, @NotNull pj.q<? super Float, ? super Float, ? super Float, ? super Float, ? super Float, ? super Float, Float> distanceLinePointComputer) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(distanceLinePointComputer, "distanceLinePointComputer");
        return distanceLinePointComputer.H(Float.valueOf(j(bVar, this.f224226f).f180480a), Float.valueOf(this.f224226f.f180481b), Float.valueOf(h(bVar, this.f224226f).f180480a), Float.valueOf(this.f224226f.f180481b), Float.valueOf(point.f180480a), Float.valueOf(point.f180481b)).floatValue();
    }

    @NotNull
    public final com.planner5d.library.math.k g(@Nullable b bVar, @NotNull com.planner5d.library.math.k result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return h(bVar, result).c0(j(bVar, this.f224226f)).R(0.5f).b(this.f224226f);
    }

    @NotNull
    public final com.planner5d.library.math.k h(@Nullable b bVar, @NotNull com.planner5d.library.math.k result) {
        com.planner5d.library.math.k kVar;
        Intrinsics.checkNotNullParameter(result, "result");
        int i10 = bVar == null ? -1 : c.f224234a[bVar.ordinal()];
        if (i10 != 1) {
            kVar = (i10 == 2 || i10 == 3) ? this.f224222b : this.f224224d;
        } else {
            kVar = this.f224221a;
        }
        return result.V(kVar);
    }

    @NotNull
    public final com.planner5d.library.math.k j(@Nullable b bVar, @NotNull com.planner5d.library.math.k result) {
        com.planner5d.library.math.k kVar;
        Intrinsics.checkNotNullParameter(result, "result");
        int i10 = bVar == null ? -1 : c.f224234a[bVar.ordinal()];
        if (i10 == 1) {
            kVar = this.f224223c;
        } else if (i10 != 2) {
            kVar = i10 != 3 ? this.f224223c : this.f224221a;
        } else {
            kVar = this.f224224d;
        }
        return result.V(kVar);
    }

    public final float k() {
        return this.f224226f.V(this.f224221a).c0(this.f224222b).F();
    }

    public final boolean l(@NotNull com.planner5d.library.math.k bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return m(this.f224221a, bounds) || m(this.f224222b, bounds) || m(this.f224223c, bounds) || m(this.f224224d, bounds);
    }

    @NotNull
    public final c0 n(float f10) {
        com.planner5d.library.math.k kVarB = b(this.f224226f);
        for (com.planner5d.library.math.k kVar : this.f224225e) {
            kVar.c0(kVarB).N(f10).b(kVarB);
        }
        return this;
    }

    @NotNull
    public final c0 o(float f10, float f11) {
        return p(this.f224226f.U(0.0f, 0.0f), f10, f11);
    }

    @NotNull
    public final c0 p(@NotNull com.planner5d.library.math.k center, float f10, float f11) {
        Intrinsics.checkNotNullParameter(center, "center");
        float f12 = 2;
        this.f224221a.U(center.f180480a - (f10 / f12), center.f180481b - (f11 / f12));
        com.planner5d.library.math.k kVar = this.f224222b;
        com.planner5d.library.math.k kVar2 = this.f224221a;
        kVar.U(kVar2.f180480a + f10, kVar2.f180481b);
        com.planner5d.library.math.k kVar3 = this.f224223c;
        com.planner5d.library.math.k kVar4 = this.f224221a;
        kVar3.U(kVar4.f180480a, kVar4.f180481b + f11);
        this.f224224d.U(this.f224222b.f180480a, this.f224223c.f180481b);
        return this;
    }

    @NotNull
    public final c0 q(@NotNull com.planner5d.library.math.k center, @NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(size, "size");
        return p(center, size.f180480a, size.f180481b);
    }

    @NotNull
    public final c0 r(@NotNull c0 rectangle) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        this.f224221a.V(rectangle.f224221a);
        this.f224222b.V(rectangle.f224222b);
        this.f224223c.V(rectangle.f224223c);
        this.f224224d.V(rectangle.f224224d);
        return this;
    }

    public final void s(float f10) {
        com.planner5d.library.math.k kVarM = new com.planner5d.library.math.k(this.f224222b).c0(this.f224221a).M();
        float fSin = f10 * ((float) Math.sin(c(this.f224226f).M().f(kVarM)));
        this.f224222b.V(this.f224221a).b(kVarM.R((k() * fSin) / e()));
        this.f224223c.V(this.f224221a).b(kVarM.O(1).M().R(fSin));
        this.f224224d.V(this.f224222b).b(kVarM);
    }

    public final void t(@NotNull b side, float f10) {
        Intrinsics.checkNotNullParameter(side, "side");
        b bVar = b.Right;
        if (side == bVar || side == b.Left) {
            this.f224226f.V(this.f224223c).c0(this.f224224d).M().R(f10);
            if (side == bVar) {
                this.f224223c.V(this.f224224d).b(this.f224226f);
                this.f224221a.V(this.f224222b).b(this.f224226f);
                return;
            } else {
                this.f224224d.V(this.f224223c).b(this.f224226f.R(-1.0f));
                this.f224222b.V(this.f224221a).b(this.f224226f);
                return;
            }
        }
        this.f224226f.V(this.f224222b).c0(this.f224224d).M().R(f10);
        if (side == b.Bottom) {
            this.f224221a.V(this.f224223c).b(this.f224226f);
            this.f224222b.V(this.f224224d).b(this.f224226f);
        } else {
            this.f224223c.V(this.f224221a).b(this.f224226f.R(-1.0f));
            this.f224224d.V(this.f224222b).b(this.f224226f);
        }
    }

    @NotNull
    public final c0 u(@NotNull com.planner5d.library.math.k position) {
        Intrinsics.checkNotNullParameter(position, "position");
        for (com.planner5d.library.math.k kVar : this.f224225e) {
            kVar.b(position);
        }
        return this;
    }
}
