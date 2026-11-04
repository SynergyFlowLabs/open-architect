package androidx.compose.foundation.lazy;

import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,123:1\n78#2:124\n111#2,2:125\n78#2:127\n111#2,2:128\n51#3,4:130\n51#3,4:134\n97#3,4:138\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n33#1:124\n33#1:125,2\n35#1:127\n35#1:128,2\n59#1:130,4\n67#1:134,4\n108#1:138,4\n*E\n"})
public final class x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18057f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3 f18058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l3 f18059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f18061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.c1 f18062e;

    /* JADX WARN: Illegal instructions before constructor call */
    public x0() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    private final void f(int i10) {
        this.f18059b.j(i10);
    }

    private final void g(int i10, int i11) {
        boolean z10;
        if (i10 >= 0.0f) {
            z10 = true;
            int i12 = 6 ^ 1;
        } else {
            z10 = false;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.g("Index should be non-negative (" + i10 + ')');
        }
        e(i10);
        this.f18062e.d(i10);
        f(i11);
    }

    public final int a() {
        return this.f18058a.m1();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.c1 b() {
        return this.f18062e;
    }

    public final int c() {
        return this.f18059b.m1();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f18061d = null;
    }

    public final void e(int i10) {
        this.f18058a.j(i10);
    }

    public final void h(@NotNull m0 m0Var) {
        n0 n0VarZ = m0Var.z();
        this.f18061d = n0VarZ != null ? n0VarZ.getKey() : null;
        if (this.f18060c || m0Var.c() > 0) {
            this.f18060c = true;
            int iA = m0Var.A();
            if (!(((float) iA) >= 0.0f)) {
                androidx.compose.foundation.internal.e.i("scrollOffset should be non-negative");
            }
            n0 n0VarZ2 = m0Var.z();
            g(n0VarZ2 != null ? n0VarZ2.getIndex() : 0, iA);
        }
    }

    public final void i(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            androidx.compose.foundation.internal.e.i("scrollOffset should be non-negative");
        }
        f(i10);
    }

    public final int j(@NotNull w wVar, int i10) {
        int iA = androidx.compose.foundation.lazy.layout.m0.a(wVar, this.f18061d, i10);
        if (i10 != iA) {
            e(iA);
            this.f18062e.d(i10);
        }
        return iA;
    }

    public x0(int i10, int i11) {
        this.f18058a = e6.b(i10);
        this.f18059b = e6.b(i11);
        this.f18062e = new androidx.compose.foundation.lazy.layout.c1(i10, 30, 100);
    }

    public /* synthetic */ x0(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
