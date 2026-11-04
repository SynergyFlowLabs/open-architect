package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,265:1\n107#2:266\n107#2:267\n107#2:268\n107#2:269\n107#2:270\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n226#1:266\n231#1:267\n235#1:268\n257#1:269\n261#1:270\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39949d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f39950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f39951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f39952c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39953a;

        static {
            int[] iArr = new int[d0.values().length];
            try {
                iArr[d0.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39953a = iArr;
        }
    }

    public p(boolean z10) {
        this.f39950a = new n(z10);
        this.f39951b = new n(z10);
        this.f39952c = new n(z10);
    }

    public final void d(@NotNull l0 l0Var, @NotNull d0 d0Var) {
        int i10 = a.f39953a[d0Var.ordinal()];
        if (i10 == 1) {
            this.f39950a.a(l0Var);
            this.f39952c.a(l0Var);
            return;
        }
        if (i10 == 2) {
            this.f39951b.a(l0Var);
            this.f39952c.a(l0Var);
            return;
        }
        if (i10 == 3) {
            if (l0Var.t0() != null) {
                this.f39952c.a(l0Var);
                return;
            } else {
                this.f39950a.a(l0Var);
                return;
            }
        }
        if (i10 != 4) {
            throw new kotlin.k0();
        }
        if (l0Var.t0() != null) {
            this.f39952c.a(l0Var);
        } else {
            this.f39951b.a(l0Var);
        }
    }

    public final boolean e(@NotNull l0 l0Var) {
        return this.f39950a.b(l0Var) || this.f39951b.b(l0Var) || this.f39952c.b(l0Var);
    }

    public final boolean f(@NotNull l0 l0Var, boolean z10) {
        boolean z11 = l0Var.t0() == null;
        boolean z12 = this.f39950a.b(l0Var) || this.f39951b.b(l0Var);
        if (z10) {
            return !z11 && z12;
        }
        return (z11 && z12) || this.f39952c.b(l0Var);
    }

    public final boolean g() {
        return (this.f39952c.c() || this.f39950a.c()) ? false : true;
    }

    public final boolean h() {
        return this.f39950a.c() && this.f39952c.c() && this.f39951b.c();
    }

    public final boolean i() {
        return !h();
    }

    public final void j(@NotNull pj.n<? super l0, ? super Boolean, ? super Boolean, Unit> nVar) {
        l0 l0VarE;
        while (true) {
            boolean z10 = true;
            boolean z11 = false;
            if (!this.f39950a.c()) {
                l0VarE = this.f39950a.e();
                z11 = l0VarE.t0() != null;
                z10 = false;
            } else if (!this.f39951b.c()) {
                l0VarE = this.f39951b.e();
                if (l0VarE.t0() != null) {
                    z11 = true;
                }
            } else if (this.f39952c.c()) {
                return;
            } else {
                l0VarE = this.f39952c.e();
            }
            nVar.invoke(l0VarE, Boolean.valueOf(z11), Boolean.valueOf(z10));
        }
    }

    public final boolean k(@NotNull l0 l0Var) {
        return this.f39952c.g(l0Var) || this.f39950a.g(l0Var) || this.f39951b.g(l0Var);
    }
}
