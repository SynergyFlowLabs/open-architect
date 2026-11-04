package androidx.compose.foundation.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
public final class b4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18782i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final b4 f18784k = new b4(0, Boolean.FALSE, androidx.compose.ui.text.input.b0.f41811b.k(), 0, (androidx.compose.ui.text.input.p0) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (y0.f) null, 121, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Boolean f18786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.input.p0 f18789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Boolean f18790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final y0.f f18791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f18781h = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final b4 f18783j = new b4(0, (Boolean) null, 0, 0, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 127, (DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void b() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void d() {
        }

        @NotNull
        public final b4 a() {
            return b4.f18783j;
        }

        @NotNull
        public final b4 c() {
            return b4.f18784k;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0 >> 0;
    }

    public /* synthetic */ b4(int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool2, y0.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, p0Var, bool2, fVar);
    }

    private final boolean C() {
        return androidx.compose.ui.text.input.a0.i(this.f18785a, androidx.compose.ui.text.input.a0.f41798b.g()) && this.f18786b == null && androidx.compose.ui.text.input.b0.n(this.f18787c, androidx.compose.ui.text.input.b0.f41811b.q()) && androidx.compose.ui.text.input.t.m(this.f18788d, androidx.compose.ui.text.input.t.f41944b.q()) && this.f18789e == null && this.f18790f == null && this.f18791g == null;
    }

    public static /* synthetic */ androidx.compose.ui.text.input.u F(b4 b4Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = androidx.compose.ui.text.input.u.f41958h.a().n();
        }
        return b4Var.E(z10);
    }

    public static /* synthetic */ b4 d(b4 b4Var, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = b4Var.f18785a;
        }
        if ((i13 & 2) != 0) {
            z10 = b4Var.o();
        }
        if ((i13 & 4) != 0) {
            i11 = b4Var.f18787c;
        }
        if ((i13 & 8) != 0) {
            i12 = b4Var.f18788d;
        }
        return b4Var.c(i10, z10, i11, i12);
    }

    public static /* synthetic */ b4 g(b4 b4Var, int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool2, y0.f fVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = b4Var.f18785a;
        }
        if ((i13 & 2) != 0) {
            bool = b4Var.f18786b;
        }
        if ((i13 & 4) != 0) {
            i11 = b4Var.f18787c;
        }
        if ((i13 & 8) != 0) {
            i12 = b4Var.f18788d;
        }
        if ((i13 & 16) != 0) {
            p0Var = b4Var.f18789e;
        }
        if ((i13 & 32) != 0) {
            bool2 = null;
        }
        return b4Var.e(i10, bool, i11, i12, p0Var, bool2, (i13 & 64) != 0 ? null : fVar);
    }

    public static /* synthetic */ b4 h(b4 b4Var, int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool, y0.f fVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = b4Var.f18785a;
        }
        if ((i13 & 2) != 0) {
            z10 = b4Var.o();
        }
        if ((i13 & 4) != 0) {
            i11 = b4Var.f18787c;
        }
        if ((i13 & 8) != 0) {
            i12 = b4Var.f18788d;
        }
        if ((i13 & 16) != 0) {
            p0Var = b4Var.f18789e;
        }
        if ((i13 & 32) != 0) {
            bool = Boolean.valueOf(b4Var.B());
        }
        if ((i13 & 64) != 0) {
            fVar = b4Var.f18791g;
        }
        Boolean bool2 = bool;
        y0.f fVar2 = fVar;
        androidx.compose.ui.text.input.p0 p0Var2 = p0Var;
        int i14 = i11;
        return b4Var.f(i10, z10, i14, i12, p0Var2, bool2, fVar2);
    }

    public static /* synthetic */ b4 j(b4 b4Var, int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = b4Var.f18785a;
        }
        if ((i13 & 2) != 0) {
            z10 = b4Var.o();
        }
        if ((i13 & 4) != 0) {
            i11 = b4Var.f18787c;
        }
        if ((i13 & 8) != 0) {
            i12 = b4Var.f18788d;
        }
        if ((i13 & 16) != 0) {
            p0Var = b4Var.f18789e;
        }
        androidx.compose.ui.text.input.p0 p0Var2 = p0Var;
        int i14 = i11;
        return b4Var.i(i10, z10, i14, i12, p0Var2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void m() {
    }

    private final boolean o() {
        Boolean bool = this.f18786b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int q() {
        androidx.compose.ui.text.input.a0 a0VarF = androidx.compose.ui.text.input.a0.f(this.f18785a);
        int iL = a0VarF.l();
        androidx.compose.ui.text.input.a0.a aVar = androidx.compose.ui.text.input.a0.f41798b;
        if (androidx.compose.ui.text.input.a0.i(iL, aVar.g())) {
            a0VarF = null;
        }
        return a0VarF != null ? a0VarF.l() : aVar.c();
    }

    private final y0.f s() {
        y0.f fVar = this.f18791g;
        return fVar == null ? y0.f.f390674c.b() : fVar;
    }

    private final int w() {
        androidx.compose.ui.text.input.b0 b0VarK = androidx.compose.ui.text.input.b0.k(this.f18787c);
        int iQ = b0VarK.q();
        androidx.compose.ui.text.input.b0.a aVar = androidx.compose.ui.text.input.b0.f41811b;
        if (androidx.compose.ui.text.input.b0.n(iQ, aVar.q())) {
            b0VarK = null;
        }
        return b0VarK != null ? b0VarK.q() : aVar.o();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void z() {
    }

    @Nullable
    public final Boolean A() {
        return this.f18790f;
    }

    public final boolean B() {
        Boolean bool = this.f18790f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @NotNull
    public final b4 D(@Nullable b4 b4Var) {
        b4 b4VarK;
        return (b4Var == null || (b4VarK = b4Var.k(this)) == null) ? this : b4VarK;
    }

    @NotNull
    public final androidx.compose.ui.text.input.u E(boolean z10) {
        return new androidx.compose.ui.text.input.u(z10, q(), o(), w(), u(), this.f18789e, s(), (DefaultConstructorMarker) null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final /* synthetic */ b4 c(int i10, boolean z10, int i11, int i12) {
        return new b4(i10, Boolean.valueOf(z10), i11, i12, this.f18789e, this.f18790f, this.f18791g, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final b4 e(int i10, @Nullable Boolean bool, int i11, int i12, @Nullable androidx.compose.ui.text.input.p0 p0Var, @Nullable Boolean bool2, @Nullable y0.f fVar) {
        return new b4(i10, bool, i11, i12, p0Var, bool2, fVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        if (androidx.compose.ui.text.input.a0.i(this.f18785a, b4Var.f18785a) && Intrinsics.areEqual(this.f18786b, b4Var.f18786b) && androidx.compose.ui.text.input.b0.n(this.f18787c, b4Var.f18787c) && androidx.compose.ui.text.input.t.m(this.f18788d, b4Var.f18788d) && Intrinsics.areEqual(this.f18789e, b4Var.f18789e) && Intrinsics.areEqual(this.f18790f, b4Var.f18790f) && Intrinsics.areEqual(this.f18791g, b4Var.f18791g)) {
            return true;
        }
        return false;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @kotlin.b1(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    public final /* synthetic */ b4 f(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool, y0.f fVar) {
        return new b4(i10, Boolean.valueOf(z10), i11, i12, p0Var, bool, fVar, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iJ = androidx.compose.ui.text.input.a0.j(this.f18785a) * 31;
        Boolean bool = this.f18786b;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + androidx.compose.ui.text.input.b0.o(this.f18787c)) * 31) + androidx.compose.ui.text.input.t.n(this.f18788d)) * 31;
        androidx.compose.ui.text.input.p0 p0Var = this.f18789e;
        int iHashCode2 = (iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
        Boolean bool2 = this.f18790f;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        y0.f fVar = this.f18791g;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ b4 i(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var) {
        return new b4(i10, Boolean.valueOf(z10), i11, i12, p0Var, this.f18790f, this.f18791g, (DefaultConstructorMarker) null);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public final b4 k(@Nullable b4 b4Var) {
        if (b4Var == null || b4Var.C() || Intrinsics.areEqual(b4Var, this)) {
            return this;
        }
        if (C()) {
            return b4Var;
        }
        androidx.compose.ui.text.input.a0 a0VarF = androidx.compose.ui.text.input.a0.f(this.f18785a);
        if (androidx.compose.ui.text.input.a0.i(a0VarF.l(), androidx.compose.ui.text.input.a0.f41798b.g())) {
            a0VarF = null;
        }
        int iL = a0VarF != null ? a0VarF.l() : b4Var.f18785a;
        Boolean bool = this.f18786b;
        if (bool == null) {
            bool = b4Var.f18786b;
        }
        Boolean bool2 = bool;
        androidx.compose.ui.text.input.b0 b0VarK = androidx.compose.ui.text.input.b0.k(this.f18787c);
        if (androidx.compose.ui.text.input.b0.n(b0VarK.q(), androidx.compose.ui.text.input.b0.f41811b.q())) {
            b0VarK = null;
        }
        int iQ = b0VarK != null ? b0VarK.q() : b4Var.f18787c;
        androidx.compose.ui.text.input.t tVarJ = androidx.compose.ui.text.input.t.j(this.f18788d);
        androidx.compose.ui.text.input.t tVar = androidx.compose.ui.text.input.t.m(tVarJ.p(), androidx.compose.ui.text.input.t.f41944b.q()) ? null : tVarJ;
        int iP = tVar != null ? tVar.p() : b4Var.f18788d;
        androidx.compose.ui.text.input.p0 p0Var = this.f18789e;
        if (p0Var == null) {
            p0Var = b4Var.f18789e;
        }
        androidx.compose.ui.text.input.p0 p0Var2 = p0Var;
        Boolean bool3 = this.f18790f;
        if (bool3 == null) {
            bool3 = b4Var.f18790f;
        }
        Boolean bool4 = bool3;
        y0.f fVar = this.f18791g;
        if (fVar == null) {
            fVar = b4Var.f18791g;
        }
        return new b4(iL, bool2, iQ, iP, p0Var2, bool4, fVar, (DefaultConstructorMarker) null);
    }

    public final boolean l() {
        return o();
    }

    @Nullable
    public final Boolean n() {
        return this.f18786b;
    }

    public final int p() {
        return this.f18785a;
    }

    @Nullable
    public final y0.f r() {
        return this.f18791g;
    }

    public final int t() {
        return this.f18788d;
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.a0.k(this.f18785a)) + ", autoCorrectEnabled=" + this.f18786b + ", keyboardType=" + ((Object) androidx.compose.ui.text.input.b0.p(this.f18787c)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.t.o(this.f18788d)) + ", platformImeOptions=" + this.f18789e + "showKeyboardOnFocus=" + this.f18790f + ", hintLocales=" + this.f18791g + ')';
    }

    public final int u() {
        androidx.compose.ui.text.input.t tVarJ = androidx.compose.ui.text.input.t.j(this.f18788d);
        int iP = tVarJ.p();
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        if (androidx.compose.ui.text.input.t.m(iP, aVar.q())) {
            tVarJ = null;
        }
        return tVarJ != null ? tVarJ.p() : aVar.a();
    }

    public final int v() {
        return this.f18787c;
    }

    @Nullable
    public final androidx.compose.ui.text.input.p0 x() {
        return this.f18789e;
    }

    public final /* synthetic */ boolean y() {
        Boolean bool = this.f18790f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @kotlin.b1(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool, y0.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, i11, i12, p0Var, bool, fVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, i11, i12, p0Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10, i11, i12);
    }

    private b4(int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool2, y0.f fVar) {
        this.f18785a = i10;
        this.f18786b = bool;
        this.f18787c = i11;
        this.f18788d = i12;
        this.f18789e = p0Var;
        this.f18790f = bool2;
        this.f18791g = fVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b4(int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool2, y0.f fVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int iG = (i13 & 1) != 0 ? androidx.compose.ui.text.input.a0.f41798b.g() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int iQ = (i13 & 4) != 0 ? androidx.compose.ui.text.input.b0.f41811b.q() : i11;
        int iQ2 = (i13 & 8) != 0 ? androidx.compose.ui.text.input.t.f41944b.q() : i12;
        androidx.compose.ui.text.input.p0 p0Var2 = (i13 & 16) != 0 ? null : p0Var;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iG, bool3, iQ, iQ2, p0Var2, bool4, (i13 & 64) == 0 ? fVar : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool, y0.f fVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? androidx.compose.ui.text.input.a0.f41798b.g() : i10, z10, (i13 & 4) != 0 ? androidx.compose.ui.text.input.b0.f41811b.q() : i11, (i13 & 8) != 0 ? androidx.compose.ui.text.input.t.f41944b.q() : i12, (i13 & 16) != 0 ? null : p0Var, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : fVar, (DefaultConstructorMarker) null);
    }

    private b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, Boolean bool, y0.f fVar) {
        this(i10, Boolean.valueOf(z10), i11, i12, p0Var, bool, fVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? androidx.compose.ui.text.input.a0.f41798b.g() : i10, (i13 & 2) != 0 ? f18783j.o() : z10, (i13 & 4) != 0 ? androidx.compose.ui.text.input.b0.f41811b.q() : i11, (i13 & 8) != 0 ? androidx.compose.ui.text.input.t.f41944b.a() : i12, (DefaultConstructorMarker) null);
    }

    private b4(int i10, boolean z10, int i11, int i12) {
        this(i10, Boolean.valueOf(z10), i11, i12, (androidx.compose.ui.text.input.p0) null, (Boolean) null, (y0.f) null, 96, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? androidx.compose.ui.text.input.a0.f41798b.c() : i10, (i13 & 2) != 0 ? f18783j.o() : z10, (i13 & 4) != 0 ? androidx.compose.ui.text.input.b0.f41811b.o() : i11, (i13 & 8) != 0 ? androidx.compose.ui.text.input.t.f41944b.a() : i12, (i13 & 16) != 0 ? null : p0Var, (DefaultConstructorMarker) null);
    }

    private b4(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.p0 p0Var) {
        this(i10, Boolean.valueOf(z10), i11, i12, p0Var, Boolean.valueOf(f18783j.B()), (y0.f) null, 64, (DefaultConstructorMarker) null);
    }
}
