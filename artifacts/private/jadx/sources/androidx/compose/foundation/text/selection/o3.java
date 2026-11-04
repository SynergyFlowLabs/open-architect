package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class o3 implements o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f21295f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21296g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f21297h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final h0 f21301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f21302e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o3(boolean z10, int i10, int i11, @Nullable h0 h0Var, @NotNull f0 f0Var) {
        this.f21298a = z10;
        this.f21299b = i10;
        this.f21300c = i11;
        this.f21301d = h0Var;
        this.f21302e = f0Var;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public boolean a() {
        return this.f21298a;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 b() {
        return this.f21302e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 c() {
        return this.f21302e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public m d() {
        if (i() < k()) {
            return m.NOT_CROSSED;
        }
        return i() > k() ? m.CROSSED : this.f21302e.d();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @Nullable
    public h0 e() {
        return this.f21301d;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public boolean f(@Nullable o1 o1Var) {
        if (e() != null && o1Var != null && (o1Var instanceof o3)) {
            o3 o3Var = (o3) o1Var;
            if (i() == o3Var.i() && k() == o3Var.k() && a() == o3Var.a() && !this.f21302e.n(o3Var.f21302e)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 g() {
        return this.f21302e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 h() {
        return this.f21302e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int i() {
        return this.f21299b;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 j() {
        return this.f21302e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int k() {
        return this.f21300c;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public void l(@NotNull Function1<? super f0, Unit> function1) {
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public androidx.collection.x0<h0> m(@NotNull h0 h0Var) {
        return androidx.collection.y0.e(this.f21302e.h(), ((h0Var.g() || h0Var.h().g() <= h0Var.f().g()) && (!h0Var.g() || h0Var.h().g() > h0Var.f().g())) ? h0Var : h0.e(h0Var, null, null, !h0Var.g(), 3, null));
    }

    @NotNull
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + a() + ", crossed=" + d() + ", info=\n\t" + this.f21302e + ')';
    }
}
