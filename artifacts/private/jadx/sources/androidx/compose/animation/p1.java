package androidx.compose.animation;

import androidx.compose.runtime.o2;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class p1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13695g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final j0 f13696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final k1 f13697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final u f13698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final t0 f13699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<r1<?>, q1> f13701f;

    public p1() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p1 h(p1 p1Var, j0 j0Var, k1 k1Var, u uVar, t0 t0Var, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = p1Var.f13696a;
        }
        if ((i10 & 2) != 0) {
            k1Var = p1Var.f13697b;
        }
        if ((i10 & 4) != 0) {
            uVar = p1Var.f13698c;
        }
        if ((i10 & 8) != 0) {
            t0Var = p1Var.f13699d;
        }
        if ((i10 & 16) != 0) {
            z10 = p1Var.f13700e;
        }
        if ((i10 & 32) != 0) {
            map = p1Var.f13701f;
        }
        boolean z11 = z10;
        Map map2 = map;
        return p1Var.g(j0Var, k1Var, uVar, t0Var, z11, map2);
    }

    @Nullable
    public final j0 a() {
        return this.f13696a;
    }

    @Nullable
    public final k1 b() {
        return this.f13697b;
    }

    @Nullable
    public final u c() {
        return this.f13698c;
    }

    @Nullable
    public final t0 d() {
        return this.f13699d;
    }

    public final boolean e() {
        return this.f13700e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.areEqual(this.f13696a, p1Var.f13696a) && Intrinsics.areEqual(this.f13697b, p1Var.f13697b) && Intrinsics.areEqual(this.f13698c, p1Var.f13698c) && Intrinsics.areEqual(this.f13699d, p1Var.f13699d) && this.f13700e == p1Var.f13700e && Intrinsics.areEqual(this.f13701f, p1Var.f13701f);
    }

    @NotNull
    public final Map<r1<?>, q1> f() {
        return this.f13701f;
    }

    @NotNull
    public final p1 g(@Nullable j0 j0Var, @Nullable k1 k1Var, @Nullable u uVar, @Nullable t0 t0Var, boolean z10, @NotNull Map<r1<?>, ? extends q1> map) {
        return new p1(j0Var, k1Var, uVar, t0Var, z10, map);
    }

    public int hashCode() {
        j0 j0Var = this.f13696a;
        int iHashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 31;
        k1 k1Var = this.f13697b;
        int iHashCode2 = (iHashCode + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        u uVar = this.f13698c;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        t0 t0Var = this.f13699d;
        return ((((iHashCode3 + (t0Var != null ? t0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f13700e)) * 31) + this.f13701f.hashCode();
    }

    @Nullable
    public final u i() {
        return this.f13698c;
    }

    @NotNull
    public final Map<r1<?>, q1> j() {
        return this.f13701f;
    }

    @Nullable
    public final j0 k() {
        return this.f13696a;
    }

    public final boolean l() {
        return this.f13700e;
    }

    @Nullable
    public final t0 m() {
        return this.f13699d;
    }

    @Nullable
    public final k1 n() {
        return this.f13697b;
    }

    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.f13696a + ", slide=" + this.f13697b + ", changeSize=" + this.f13698c + ", scale=" + this.f13699d + ", hold=" + this.f13700e + ", effectsMap=" + this.f13701f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p1(@Nullable j0 j0Var, @Nullable k1 k1Var, @Nullable u uVar, @Nullable t0 t0Var, boolean z10, @NotNull Map<r1<?>, ? extends q1> map) {
        this.f13696a = j0Var;
        this.f13697b = k1Var;
        this.f13698c = uVar;
        this.f13699d = t0Var;
        this.f13700e = z10;
        this.f13701f = map;
    }

    public /* synthetic */ p1(j0 j0Var, k1 k1Var, u uVar, t0 t0Var, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : j0Var, (i10 & 2) != 0 ? null : k1Var, (i10 & 4) != 0 ? null : uVar, (i10 & 8) != 0 ? null : t0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? MapsKt.emptyMap() : map);
    }
}
