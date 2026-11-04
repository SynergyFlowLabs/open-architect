package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,265:1\n107#1:287\n57#2,4:266\n57#2,4:270\n57#2,4:274\n57#2,4:278\n57#2,4:283\n438#3:282\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n99#1:287\n55#1:266,4\n63#1:270,4\n70#1:274,4\n77#1:278,4\n84#1:283,4\n81#1:282\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39914d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.collection.f2<l0> f39916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l2<l0> f39917c = new l2<>(o.f39935a);

    public n(boolean z10) {
        this.f39915a = z10;
    }

    private final androidx.collection.f2<l0> h() {
        if (this.f39916b == null) {
            this.f39916b = androidx.collection.r2.d();
        }
        androidx.collection.f2<l0> f2Var = this.f39916b;
        Intrinsics.checkNotNull(f2Var);
        return f2Var;
    }

    public final void a(@NotNull l0 l0Var) {
        if (!l0Var.I()) {
            s0.a.i("DepthSortedSet.add called on an unattached node");
        }
        if (this.f39915a) {
            androidx.collection.f2<l0> f2VarH = h();
            int iR = f2VarH.r(l0Var, Integer.MAX_VALUE);
            if (iR == Integer.MAX_VALUE) {
                f2VarH.l0(l0Var, l0Var.a0());
            } else {
                if (!(iR == l0Var.a0())) {
                    s0.a.i("invalid node depth");
                }
            }
        }
        this.f39917c.add(l0Var);
    }

    public final boolean b(@NotNull l0 l0Var) {
        boolean zContains = this.f39917c.contains(l0Var);
        if (this.f39915a) {
            if (!(zContains == h().e(l0Var))) {
                s0.a.i("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean c() {
        return this.f39917c.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    @NotNull
    public final l0 e() {
        l0 l0VarFirst = this.f39917c.first();
        g(l0VarFirst);
        return l0VarFirst;
    }

    public final void f(@NotNull Function1<? super l0, Unit> function1) {
        while (!c()) {
            function1.invoke(e());
        }
    }

    public final boolean g(@NotNull l0 l0Var) {
        if (!l0Var.I()) {
            s0.a.i("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f39917c.remove(l0Var);
        if (this.f39915a) {
            androidx.collection.f2<l0> f2VarH = h();
            if (f2VarH.e(l0Var)) {
                int iN = f2VarH.n(l0Var);
                f2VarH.g0(l0Var);
                if (!(iN == (zRemove ? l0Var.a0() : Integer.MAX_VALUE))) {
                    s0.a.i("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    @NotNull
    public String toString() {
        return this.f39917c.toString();
    }
}
