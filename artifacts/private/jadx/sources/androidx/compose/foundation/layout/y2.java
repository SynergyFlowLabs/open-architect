package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,851:1\n219#2:852\n219#2:853\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n776#1:852\n784#1:853\n*E\n"})
public final class y2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f16554n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u2.a f16555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f16558d = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16559e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.z0 f16561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.i2 f16562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.z0 f16563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.i2 f16564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.collection.e0 f16565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private androidx.collection.e0 f16566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.z0> f16567m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16568a;

        static {
            int[] iArr = new int[u2.a.values().length];
            try {
                iArr[u2.a.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 2 | 2;
                iArr[u2.a.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u2.a.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u2.a.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16568a = iArr;
        }
    }

    public y2(@NotNull u2.a aVar, int i10, int i11) {
        this.f16555a = aVar;
        this.f16556b = i10;
        this.f16557c = i11;
    }

    public static /* synthetic */ y2 g(y2 y2Var, u2.a aVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            aVar = y2Var.f16555a;
        }
        if ((i12 & 2) != 0) {
            i10 = y2Var.f16556b;
        }
        if ((i12 & 4) != 0) {
            i11 = y2Var.f16557c;
        }
        return y2Var.f(aVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(y2 y2Var, b3 b3Var, androidx.compose.ui.layout.i2 i2Var) {
        int iK;
        int iH;
        if (i2Var != null) {
            iK = b3Var.k(i2Var);
            iH = b3Var.h(i2Var);
        } else {
            iK = 0;
            iH = 0;
        }
        y2Var.f16565k = androidx.collection.e0.a(androidx.collection.e0.d(iK, iH));
        y2Var.f16562h = i2Var;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(y2 y2Var, b3 b3Var, androidx.compose.ui.layout.i2 i2Var) {
        int iK;
        int iH;
        if (i2Var != null) {
            iK = b3Var.k(i2Var);
            iH = b3Var.h(i2Var);
        } else {
            iK = 0;
            iH = 0;
        }
        y2Var.f16566l = androidx.collection.e0.a(androidx.collection.e0.d(iK, iH));
        y2Var.f16564j = i2Var;
        return Unit.f312394a;
    }

    @NotNull
    public final u2.a c() {
        return this.f16555a;
    }

    public final int d() {
        return this.f16556b;
    }

    public final int e() {
        return this.f16557c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return this.f16555a == y2Var.f16555a && this.f16556b == y2Var.f16556b && this.f16557c == y2Var.f16557c;
    }

    @NotNull
    public final y2 f(@NotNull u2.a aVar, int i10, int i11) {
        return new y2(aVar, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[PHI: r12 r13
      0x0051: PHI (r12v10 androidx.compose.ui.layout.z0) = (r12v4 androidx.compose.ui.layout.z0), (r12v14 androidx.compose.ui.layout.z0) binds: [B:35:0x0084, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r13v3 androidx.collection.e0) = (r13v1 androidx.collection.e0), (r13v6 androidx.collection.e0) binds: [B:35:0x0084, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public final k2.a h(boolean z10, int i10, int i11) {
        androidx.compose.ui.layout.z0 z0VarInvoke;
        androidx.collection.e0 e0Var;
        androidx.compose.ui.layout.i2 i2Var;
        androidx.compose.ui.layout.z0 z0Var;
        androidx.compose.ui.layout.i2 i2Var2;
        int i12 = a.f16568a[this.f16555a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 != 3 && i12 != 4) {
            throw new kotlin.k0();
        }
        if (z10) {
            Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.z0> function2 = this.f16567m;
            if (function2 == null || (z0VarInvoke = function2.invoke(Boolean.TRUE, Integer.valueOf(n()))) == null) {
                z0VarInvoke = this.f16561g;
            }
            e0Var = this.f16565k;
            if (this.f16567m == null) {
                i2Var = this.f16562h;
                i2Var2 = i2Var;
                z0Var = z0VarInvoke;
            } else {
                z0Var = z0VarInvoke;
                i2Var2 = null;
            }
        } else {
            if (i10 < this.f16556b - 1 || i11 < this.f16557c) {
                z0VarInvoke = null;
            } else {
                Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.z0> function3 = this.f16567m;
                if (function3 == null || (z0VarInvoke = function3.invoke(Boolean.FALSE, Integer.valueOf(n()))) == null) {
                    z0VarInvoke = this.f16563i;
                }
            }
            e0Var = this.f16566l;
            if (this.f16567m == null) {
                i2Var = this.f16564j;
                i2Var2 = i2Var;
                z0Var = z0VarInvoke;
            } else {
                z0Var = z0VarInvoke;
                i2Var2 = null;
            }
        }
        if (z0Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(e0Var);
        return new k2.a(z0Var, i2Var2, e0Var.l(), false, 8, null);
    }

    public int hashCode() {
        return (((this.f16555a.hashCode() * 31) + Integer.hashCode(this.f16556b)) * 31) + Integer.hashCode(this.f16557c);
    }

    @Nullable
    public final androidx.collection.e0 i(boolean z10, int i10, int i11) {
        int i12 = a.f16568a[this.f16555a.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new kotlin.k0();
                }
                if (z10) {
                    return this.f16565k;
                }
                if (i10 + 1 < this.f16556b || i11 < this.f16557c) {
                    return null;
                }
                return this.f16566l;
            }
            if (z10) {
                return this.f16565k;
            }
        }
        return null;
    }

    public final int j() {
        return this.f16560f;
    }

    public final int k() {
        return this.f16559e;
    }

    public final int l() {
        return this.f16557c;
    }

    public final int m() {
        return this.f16556b;
    }

    public final int n() {
        int i10 = this.f16559e;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException(this.f16558d);
    }

    @NotNull
    public final String o() {
        return this.f16558d;
    }

    @NotNull
    public final u2.a p() {
        return this.f16555a;
    }

    public final void q(int i10) {
        this.f16560f = i10;
    }

    public final void r(int i10) {
        this.f16559e = i10;
    }

    public final void s(@NotNull final b3 b3Var, @Nullable androidx.compose.ui.layout.z0 z0Var, @Nullable androidx.compose.ui.layout.z0 z0Var2, long j10) {
        i4 i4Var = b3Var.i() ? i4.Horizontal : i4.Vertical;
        long jQ = x4.q(x4.f(x4.d(j10, i4Var), 0, 0, 0, 0, 10, null), i4Var);
        if (z0Var != null) {
            t2.C(z0Var, b3Var, jQ, new Function1() { // from class: androidx.compose.foundation.layout.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y2.v(this.f16512a, b3Var, (androidx.compose.ui.layout.i2) obj);
                }
            });
            this.f16561g = z0Var;
        }
        if (z0Var2 != null) {
            t2.C(z0Var2, b3Var, jQ, new Function1() { // from class: androidx.compose.foundation.layout.x2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y2.w(this.f16537a, b3Var, (androidx.compose.ui.layout.i2) obj);
                }
            });
            this.f16563i = z0Var2;
        }
    }

    public final void t(@Nullable androidx.compose.ui.layout.y yVar, @Nullable androidx.compose.ui.layout.y yVar2, boolean z10, long j10) {
        long jD = x4.d(j10, z10 ? i4.Horizontal : i4.Vertical);
        if (yVar != null) {
            int iA = t2.A(yVar, z10, androidx.compose.ui.unit.b.o(jD));
            this.f16565k = androidx.collection.e0.a(androidx.collection.e0.d(iA, t2.v(yVar, z10, iA)));
            this.f16561g = yVar instanceof androidx.compose.ui.layout.z0 ? (androidx.compose.ui.layout.z0) yVar : null;
            this.f16562h = null;
        }
        if (yVar2 != null) {
            int iA2 = t2.A(yVar2, z10, androidx.compose.ui.unit.b.o(jD));
            this.f16566l = androidx.collection.e0.a(androidx.collection.e0.d(iA2, t2.v(yVar2, z10, iA2)));
            this.f16563i = yVar2 instanceof androidx.compose.ui.layout.z0 ? (androidx.compose.ui.layout.z0) yVar2 : null;
            this.f16564j = null;
        }
    }

    @NotNull
    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.f16555a + ", minLinesToShowCollapse=" + this.f16556b + ", minCrossAxisSizeToShowCollapse=" + this.f16557c + ')';
    }

    public final void u(@NotNull b3 b3Var, long j10, @NotNull Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.z0> function2) {
        this.f16559e = 0;
        this.f16567m = function2;
        s(b3Var, function2.invoke(Boolean.TRUE, 0), function2.invoke(Boolean.FALSE, 0), j10);
    }
}
