package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l1 implements x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41607h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v0 f41609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u0.e f41611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41612g;

    public /* synthetic */ l1(int i10, v0 v0Var, int i11, u0.e eVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, v0Var, i11, eVar, i12);
    }

    public static /* synthetic */ l1 e(l1 l1Var, int i10, v0 v0Var, int i11, int i12, u0.e eVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = l1Var.f41608c;
        }
        if ((i13 & 2) != 0) {
            v0Var = l1Var.a();
        }
        if ((i13 & 4) != 0) {
            i11 = l1Var.c();
        }
        if ((i13 & 8) != 0) {
            i12 = l1Var.b();
        }
        if ((i13 & 16) != 0) {
            eVar = l1Var.f41611f;
        }
        u0.e eVar2 = eVar;
        int i14 = i11;
        return l1Var.d(i10, v0Var, i14, i12, eVar2);
    }

    public static /* synthetic */ l1 g(l1 l1Var, int i10, v0 v0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = l1Var.f41608c;
        }
        if ((i12 & 2) != 0) {
            v0Var = l1Var.a();
        }
        if ((i12 & 4) != 0) {
            i11 = l1Var.c();
        }
        return l1Var.f(i10, v0Var, i11);
    }

    @androidx.compose.ui.text.v
    public static /* synthetic */ void h() {
    }

    @Override // androidx.compose.ui.text.font.x
    @NotNull
    public v0 a() {
        return this.f41609d;
    }

    @Override // androidx.compose.ui.text.font.x
    public int b() {
        return this.f41612g;
    }

    @Override // androidx.compose.ui.text.font.x
    public int c() {
        return this.f41610e;
    }

    @androidx.compose.ui.text.v
    @NotNull
    public final l1 d(int i10, @NotNull v0 v0Var, int i11, int i12, @NotNull u0.e eVar) {
        return new l1(i10, v0Var, i11, eVar, i12, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f41608c == l1Var.f41608c && Intrinsics.areEqual(a(), l1Var.a()) && q0.f(c(), l1Var.c()) && Intrinsics.areEqual(this.f41611f, l1Var.f41611f) && o0.g(b(), l1Var.b());
    }

    @NotNull
    public final l1 f(int i10, @NotNull v0 v0Var, int i11) {
        return e(this, i10, v0Var, i11, b(), null, 16, null);
    }

    public int hashCode() {
        return (((((((this.f41608c * 31) + a().hashCode()) * 31) + q0.h(c())) * 31) + o0.i(b())) * 31) + this.f41611f.hashCode();
    }

    public final int i() {
        return this.f41608c;
    }

    @NotNull
    public final u0.e j() {
        return this.f41611f;
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.f41608c + ", weight=" + a() + ", style=" + ((Object) q0.i(c())) + ", loadingStrategy=" + ((Object) o0.j(b())) + ')';
    }

    private l1(int i10, v0 v0Var, int i11, u0.e eVar, int i12) {
        this.f41608c = i10;
        this.f41609d = v0Var;
        this.f41610e = i11;
        this.f41611f = eVar;
        this.f41612g = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l1(int i10, v0 v0Var, int i11, u0.e eVar, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        v0 v0VarM = (i13 & 2) != 0 ? v0.f41742b.m() : v0Var;
        int iC = (i13 & 4) != 0 ? q0.f41690b.c() : i11;
        this(i10, v0VarM, iC, (i13 & 8) != 0 ? u0.f41723a.b(v0VarM, iC, new u0.a[0]) : eVar, (i13 & 16) != 0 ? o0.f41676b.a() : i12, null);
    }
}
