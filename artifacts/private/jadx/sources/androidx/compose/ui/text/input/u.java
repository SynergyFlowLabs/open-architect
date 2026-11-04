package androidx.compose.ui.text.input;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41959i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final p0 f41966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final y0.f f41967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f41958h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final u f41960j = new u(false, 0, false, 0, 0, null, null, 127, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u a() {
            return u.f41960j;
        }

        private a() {
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, p0Var);
    }

    public static /* synthetic */ u c(u uVar, boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = uVar.f41961a;
        }
        if ((i13 & 2) != 0) {
            i10 = uVar.f41962b;
        }
        if ((i13 & 4) != 0) {
            z11 = uVar.f41963c;
        }
        if ((i13 & 8) != 0) {
            i11 = uVar.f41964d;
        }
        if ((i13 & 16) != 0) {
            i12 = uVar.f41965e;
        }
        if ((i13 & 32) != 0) {
            p0Var = uVar.f41966f;
        }
        int i14 = i12;
        p0 p0Var2 = p0Var;
        return uVar.b(z10, i10, z11, i11, i14, p0Var2);
    }

    public static /* synthetic */ u e(u uVar, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = uVar.f41961a;
        }
        if ((i13 & 2) != 0) {
            i10 = uVar.f41962b;
        }
        if ((i13 & 4) != 0) {
            z11 = uVar.f41963c;
        }
        if ((i13 & 8) != 0) {
            i11 = uVar.f41964d;
        }
        if ((i13 & 16) != 0) {
            i12 = uVar.f41965e;
        }
        int i14 = i12;
        boolean z12 = z11;
        return uVar.d(z10, i10, z12, i11, i14);
    }

    public static /* synthetic */ u g(u uVar, boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, y0.f fVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = uVar.f41961a;
        }
        if ((i13 & 2) != 0) {
            i10 = uVar.f41962b;
        }
        if ((i13 & 4) != 0) {
            z11 = uVar.f41963c;
        }
        if ((i13 & 8) != 0) {
            i11 = uVar.f41964d;
        }
        if ((i13 & 16) != 0) {
            i12 = uVar.f41965e;
        }
        if ((i13 & 32) != 0) {
            p0Var = uVar.f41966f;
        }
        if ((i13 & 64) != 0) {
            fVar = uVar.f41967g;
        }
        p0 p0Var2 = p0Var;
        y0.f fVar2 = fVar;
        int i14 = i12;
        boolean z12 = z11;
        return uVar.f(z10, i10, z12, i11, i14, p0Var2, fVar2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    public final /* synthetic */ u b(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var) {
        return new u(z10, i10, z11, i11, i12, p0Var, this.f41967g, (DefaultConstructorMarker) null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final /* synthetic */ u d(boolean z10, int i10, boolean z11, int i11, int i12) {
        return new u(z10, i10, z11, i11, i12, this.f41966f, this.f41967g, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f41961a == uVar.f41961a && a0.i(this.f41962b, uVar.f41962b) && this.f41963c == uVar.f41963c && b0.n(this.f41964d, uVar.f41964d) && t.m(this.f41965e, uVar.f41965e) && Intrinsics.areEqual(this.f41966f, uVar.f41966f) && Intrinsics.areEqual(this.f41967g, uVar.f41967g);
    }

    @NotNull
    public final u f(boolean z10, int i10, boolean z11, int i11, int i12, @Nullable p0 p0Var, @NotNull y0.f fVar) {
        return new u(z10, i10, z11, i11, i12, p0Var, fVar, (DefaultConstructorMarker) null);
    }

    public final boolean h() {
        return this.f41963c;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f41961a) * 31) + a0.j(this.f41962b)) * 31) + Boolean.hashCode(this.f41963c)) * 31) + b0.o(this.f41964d)) * 31) + t.n(this.f41965e)) * 31;
        p0 p0Var = this.f41966f;
        return ((iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31) + this.f41967g.hashCode();
    }

    public final int i() {
        return this.f41962b;
    }

    @NotNull
    public final y0.f j() {
        return this.f41967g;
    }

    public final int k() {
        return this.f41965e;
    }

    public final int l() {
        return this.f41964d;
    }

    @Nullable
    public final p0 m() {
        return this.f41966f;
    }

    public final boolean n() {
        return this.f41961a;
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.f41961a + ", capitalization=" + ((Object) a0.k(this.f41962b)) + ", autoCorrect=" + this.f41963c + ", keyboardType=" + ((Object) b0.p(this.f41964d)) + ", imeAction=" + ((Object) t.o(this.f41965e)) + ", platformImeOptions=" + this.f41966f + ", hintLocales=" + this.f41967g + ')';
    }

    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, y0.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, p0Var, fVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12);
    }

    private u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, y0.f fVar) {
        this.f41961a = z10;
        this.f41962b = i10;
        this.f41963c = z11;
        this.f41964d = i11;
        this.f41965e = i12;
        this.f41966f = p0Var;
        this.f41967g = fVar;
    }

    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, y0.f fVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? a0.f41798b.c() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? b0.f41811b.o() : i11, (i13 & 16) != 0 ? t.f41944b.a() : i12, (i13 & 32) != 0 ? null : p0Var, (i13 & 64) != 0 ? y0.f.f390674c.b() : fVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? a0.f41798b.c() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? b0.f41811b.o() : i11, (i13 & 16) != 0 ? t.f41944b.a() : i12, (i13 & 32) != 0 ? null : p0Var, (DefaultConstructorMarker) null);
    }

    private u(boolean z10, int i10, boolean z11, int i11, int i12, p0 p0Var) {
        this(z10, i10, z11, i11, i12, p0Var, y0.f.f390674c.b(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ u(boolean z10, int i10, boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? a0.f41798b.c() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? b0.f41811b.o() : i11, (i13 & 16) != 0 ? t.f41944b.a() : i12, (DefaultConstructorMarker) null);
    }

    private u(boolean z10, int i10, boolean z11, int i11, int i12) {
        this(z10, i10, z11, i11, i12, null, null, 64, null);
    }
}
