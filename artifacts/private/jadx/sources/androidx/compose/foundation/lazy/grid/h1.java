package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,126:1\n78#2:127\n111#2,2:128\n78#2:130\n111#2,2:131\n51#3,4:133\n51#3,4:137\n97#3,4:141\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n33#1:127\n33#1:128,2\n36#1:130\n36#1:131,2\n60#1:133,4\n70#1:137,4\n111#1:141,4\n*E\n"})
public final class h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16806f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3 f16807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l3 f16808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f16810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.c1 f16811e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h1() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    private final void e(int i10) {
        this.f16807a.j(i10);
    }

    private final void f(int i10) {
        this.f16808b.j(i10);
    }

    private final void g(int i10, int i11) {
        boolean z10;
        if (i10 >= 0.0f) {
            z10 = true;
            int i12 = 1 >> 1;
        } else {
            z10 = false;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.g("Index should be non-negative");
        }
        e(i10);
        this.f16811e.d(i10);
        f(i11);
    }

    public final int a() {
        return this.f16807a.m1();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.c1 b() {
        return this.f16811e;
    }

    public final int c() {
        return this.f16808b.m1();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f16810d = null;
    }

    public final void h(@NotNull u0 u0Var) {
        v0[] v0VarArrB;
        v0 v0Var;
        v0[] v0VarArrB2;
        v0 v0Var2;
        y0 y0VarR = u0Var.r();
        this.f16810d = (y0VarR == null || (v0VarArrB2 = y0VarR.b()) == null || (v0Var2 = (v0) ArraysKt.firstOrNull(v0VarArrB2)) == null) ? null : v0Var2.getKey();
        if (this.f16809c || u0Var.c() > 0) {
            this.f16809c = true;
            int iS = u0Var.s();
            int index = 0;
            if (!(((float) iS) >= 0.0f)) {
                androidx.compose.foundation.internal.e.i("scrollOffset should be non-negative (" + iS + ')');
            }
            y0 y0VarR2 = u0Var.r();
            if (y0VarR2 != null && (v0VarArrB = y0VarR2.b()) != null && (v0Var = (v0) ArraysKt.firstOrNull(v0VarArrB)) != null) {
                index = v0Var.getIndex();
            }
            g(index, iS);
        }
    }

    public final void i(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            androidx.compose.foundation.internal.e.i("scrollOffset should be non-negative");
        }
        f(i10);
    }

    public final int j(@NotNull z zVar, int i10) {
        int iA = androidx.compose.foundation.lazy.layout.m0.a(zVar, this.f16810d, i10);
        if (i10 != iA) {
            e(iA);
            this.f16811e.d(i10);
        }
        return iA;
    }

    public h1(int i10, int i11) {
        this.f16807a = e6.b(i10);
        this.f16808b = e6.b(i11);
        this.f16811e = new androidx.compose.foundation.lazy.layout.c1(i10, 90, 200);
    }

    public /* synthetic */ h1(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
