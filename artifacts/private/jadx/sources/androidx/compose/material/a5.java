package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class a5 implements w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f21961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f21962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f21963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f21964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f21965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f21966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f21967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21968k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21969a;

        static {
            int[] iArr = new int[v0.a.values().length];
            try {
                iArr[v0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21969a = iArr;
        }
    }

    public /* synthetic */ a5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @Override // androidx.compose.material.w3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, @NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        c0Var.E(840901029);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(840901029, i10, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:418)");
        }
        if (z10) {
            int i11 = a.f21969a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f21960c;
            } else {
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f21961d;
            }
        } else {
            int i12 = a.f21969a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f21962e;
            } else if (i12 == 2) {
                j10 = this.f21964g;
            } else {
                if (i12 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f21963f;
            }
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(-1260861623);
            c0Var2 = c0Var;
            n7VarW = androidx.compose.animation.e1.c(j11, androidx.compose.animation.core.p.t(aVar == v0.a.Off ? 100 : 50, 0, null, 6, null), null, null, c0Var2, 0, 12);
            c0Var2.A();
        } else {
            c0Var2 = c0Var;
            c0Var2.E(-1260681079);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var2, 0);
            c0Var2.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var2.A();
        return n7VarW;
    }

    @Override // androidx.compose.material.w3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(@NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(544656267);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(544656267, i10, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:405)");
        }
        v0.a aVar2 = v0.a.Off;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = androidx.compose.animation.e1.c(aVar == aVar2 ? this.f21959b : this.f21958a, androidx.compose.animation.core.p.t(aVar == aVar2 ? 100 : 50, 0, null, 6, null), null, null, c0Var, 0, 12);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var.A();
        return n7VarC;
    }

    @Override // androidx.compose.material.w3
    @androidx.compose.runtime.o
    @NotNull
    public androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> c(boolean z10, @NotNull v0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        c0Var.E(-1568341342);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1568341342, i10, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:445)");
        }
        if (z10) {
            int i11 = a.f21969a[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f21965h;
            } else {
                if (i11 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f21966i;
            }
        } else {
            int i12 = a.f21969a[aVar.ordinal()];
            if (i12 == 1) {
                j10 = this.f21967j;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new kotlin.k0();
                }
                j10 = this.f21967j;
            } else {
                j10 = this.f21968k;
            }
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(-1801872468);
            c0Var2 = c0Var;
            n7VarW = androidx.compose.animation.e1.c(j11, androidx.compose.animation.core.p.t(aVar == v0.a.Off ? 100 : 50, 0, null, 6, null), null, null, c0Var2, 0, 12);
            c0Var2.A();
        } else {
            c0Var2 = c0Var;
            c0Var2.E(-1801691924);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var2, 0);
            c0Var2.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        c0Var2.A();
        return n7VarW;
    }

    private a5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f21958a = j10;
        this.f21959b = j11;
        this.f21960c = j12;
        this.f21961d = j13;
        this.f21962e = j14;
        this.f21963f = j15;
        this.f21964g = j16;
        this.f21965h = j17;
        this.f21966i = j18;
        this.f21967j = j19;
        this.f21968k = j20;
    }
}
