package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4061:1\n3773#2:4062\n3827#2:4063\n3767#2,4:4064\n3878#2:4075\n3878#2:4076\n159#3,7:4068\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3344#1:4062\n3345#1:4063\n3351#1:4064,4\n3382#1:4075\n3384#1:4076\n3362#1:4068,7\n*E\n"})
final class x5 implements androidx.compose.runtime.tooling.m, Iterable<androidx.compose.runtime.tooling.m>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f36786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36788c;

    public x5(@NotNull w5 w5Var, int i10, int i11) {
        this.f36786a = w5Var;
        this.f36787b = i10;
        this.f36788c = i11;
    }

    private static final androidx.compose.runtime.tooling.m d(x5 x5Var, g gVar) {
        int iK;
        int i10;
        if (!x5Var.f36786a.b0(gVar) || (iK = x5Var.f36786a.k(gVar)) < (i10 = x5Var.f36787b) || iK - i10 >= y5.M(x5Var.f36786a.D(), x5Var.f36787b)) {
            return null;
        }
        return new x5(x5Var.f36786a, iK, x5Var.f36788c);
    }

    private static final androidx.compose.runtime.tooling.m k(androidx.compose.runtime.tooling.m mVar, int i10) {
        return (androidx.compose.runtime.tooling.m) CollectionsKt.firstOrNull(CollectionsKt.drop(mVar.i(), i10));
    }

    private final void p() {
        if (this.f36786a.K() != this.f36788c) {
            y5.k0();
        }
    }

    @Override // androidx.compose.runtime.tooling.m
    @Nullable
    public String U1() {
        l2 l2VarT0 = this.f36786a.t0(this.f36787b);
        if (l2VarT0 != null) {
            return l2VarT0.j();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.m
    public int V1() {
        return y5.M(this.f36786a.D(), this.f36787b);
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Object X1() {
        p();
        v5 v5VarY = this.f36786a.Y();
        try {
            g gVarA = v5VarY.a(this.f36787b);
            v5VarY.e();
            return gVarA;
        } catch (Throwable th2) {
            v5VarY.e();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.f
    @Nullable
    public androidx.compose.runtime.tooling.m c(@NotNull Object obj) {
        if (obj instanceof g) {
            return d(this, (g) obj);
        }
        if (obj instanceof j7) {
            j7 j7Var = (j7) obj;
            androidx.compose.runtime.tooling.m mVarC = c(j7Var.f());
            if (mVarC != null) {
                return k(mVarC, j7Var.e());
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.m
    public int e2() {
        int iV1 = this.f36787b + V1();
        return (iV1 < this.f36786a.F() ? this.f36786a.D()[(iV1 * 5) + 4] : this.f36786a.e2()) - this.f36786a.D()[(this.f36787b * 5) + 4];
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Iterable<Object> getData() {
        l2 l2VarT0 = this.f36786a.t0(this.f36787b);
        return l2VarT0 != null ? new f7(this.f36786a, this.f36787b, l2VarT0) : new m1(this.f36786a, this.f36787b);
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Object getKey() {
        if ((this.f36786a.D()[(this.f36787b * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(this.f36786a.D()[this.f36787b * 5]);
        }
        Object obj = this.f36786a.G()[y5.c0(this.f36786a.D(), this.f36787b)];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.f
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.m> i() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.f
    public boolean isEmpty() {
        return y5.M(this.f36786a.D(), this.f36787b) == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.m> iterator() {
        p();
        l2 l2VarT0 = this.f36786a.t0(this.f36787b);
        if (l2VarT0 != null) {
            w5 w5Var = this.f36786a;
            int i10 = this.f36787b;
            return new g7(w5Var, i10, l2VarT0, new h(i10));
        }
        w5 w5Var2 = this.f36786a;
        int i11 = this.f36787b;
        return new j2(w5Var2, i11 + 1, i11 + y5.M(w5Var2.D(), this.f36787b));
    }

    public final int l() {
        return this.f36787b;
    }

    @NotNull
    public final w5 m() {
        return this.f36786a;
    }

    public final int n() {
        return this.f36788c;
    }

    @Override // androidx.compose.runtime.tooling.m
    @Nullable
    public Object w() {
        if ((this.f36786a.D()[(this.f36787b * 5) + 1] & 1073741824) != 0) {
            return this.f36786a.G()[this.f36786a.D()[(this.f36787b * 5) + 4]];
        }
        return null;
    }

    public /* synthetic */ x5(w5 w5Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(w5Var, i10, (i12 & 4) != 0 ? w5Var.K() : i11);
    }
}
