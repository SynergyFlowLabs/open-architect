package androidx.paging;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n+ 2 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,161:1\n36#2,4:162\n36#2,4:166\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n*L\n110#1:162,4\n113#1:166,4\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0 f72380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0 f72381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0 f72382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z0 f72383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final z0 f72384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f72385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f72386g;

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    public n(@NotNull x0 refresh, @NotNull x0 prepend, @NotNull x0 append, @NotNull z0 source, @Nullable z0 z0Var) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(prepend, "prepend");
        Intrinsics.checkNotNullParameter(append, "append");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f72380a = refresh;
        this.f72381b = prepend;
        this.f72382c = append;
        this.f72383d = source;
        this.f72384e = z0Var;
        if (source.m()) {
            if (z0Var != null ? z0Var.m() : true) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f72385f = z10;
        if (!source.l()) {
            z11 = z0Var != null ? z0Var.l() : false;
        }
        this.f72386g = z11;
    }

    public final void a(@NotNull pj.n<? super a1, ? super Boolean, ? super x0, Unit> op) {
        Intrinsics.checkNotNullParameter(op, "op");
        z0 z0Var = this.f72383d;
        a1 a1Var = a1.REFRESH;
        x0 x0VarK = z0Var.k();
        Boolean bool = Boolean.FALSE;
        op.invoke(a1Var, bool, x0VarK);
        a1 a1Var2 = a1.PREPEND;
        op.invoke(a1Var2, bool, z0Var.j());
        a1 a1Var3 = a1.APPEND;
        op.invoke(a1Var3, bool, z0Var.i());
        z0 z0Var2 = this.f72384e;
        if (z0Var2 != null) {
            x0 x0VarK2 = z0Var2.k();
            Boolean bool2 = Boolean.TRUE;
            op.invoke(a1Var, bool2, x0VarK2);
            op.invoke(a1Var2, bool2, z0Var2.j());
            op.invoke(a1Var3, bool2, z0Var2.i());
        }
    }

    @NotNull
    public final x0 b() {
        return this.f72382c;
    }

    @Nullable
    public final z0 c() {
        return this.f72384e;
    }

    @NotNull
    public final x0 d() {
        return this.f72381b;
    }

    @NotNull
    public final x0 e() {
        return this.f72380a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f72380a, nVar.f72380a) && Intrinsics.areEqual(this.f72381b, nVar.f72381b) && Intrinsics.areEqual(this.f72382c, nVar.f72382c) && Intrinsics.areEqual(this.f72383d, nVar.f72383d) && Intrinsics.areEqual(this.f72384e, nVar.f72384e);
    }

    @NotNull
    public final z0 f() {
        return this.f72383d;
    }

    @oj.i(name = "hasError")
    public final boolean g() {
        return this.f72386g;
    }

    public final boolean h() {
        return this.f72385f;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f72380a.hashCode() * 31) + this.f72381b.hashCode()) * 31) + this.f72382c.hashCode()) * 31) + this.f72383d.hashCode()) * 31;
        z0 z0Var = this.f72384e;
        return iHashCode + (z0Var != null ? z0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f72380a + ", prepend=" + this.f72381b + ", append=" + this.f72382c + ", source=" + this.f72383d + ", mediator=" + this.f72384e + ')';
    }

    public /* synthetic */ n(x0 x0Var, x0 x0Var2, x0 x0Var3, z0 z0Var, z0 z0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x0Var, x0Var2, x0Var3, z0Var, (i10 & 16) != 0 ? null : z0Var2);
    }
}
