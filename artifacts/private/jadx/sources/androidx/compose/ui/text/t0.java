package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,531:1\n81#2,4:532\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n*L\n208#1:532,4\n*E\n"})
public final class t0 implements f.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f42267j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.s f42271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final x0 f42272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.h f42273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f42274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f42275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.u f42276i;

    public /* synthetic */ t0(int i10, int i11, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, sVar, x0Var, hVar, i12, i13, uVar);
    }

    public static /* synthetic */ t0 C(t0 t0Var, t0 t0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t0Var2 = null;
        }
        return t0Var.B(t0Var2);
    }

    public static /* synthetic */ t0 b(t0 t0Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(t0Var.f42268a);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(t0Var.f42269b);
        }
        if ((i10 & 4) != 0) {
            j10 = t0Var.f42270c;
        }
        if ((i10 & 8) != 0) {
            sVar = t0Var.f42271d;
        }
        androidx.compose.ui.text.style.s sVar2 = sVar;
        return t0Var.a(jVar, lVar, j10, sVar2);
    }

    public static /* synthetic */ t0 d(t0 t0Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(t0Var.f42268a);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(t0Var.f42269b);
        }
        if ((i10 & 4) != 0) {
            j10 = t0Var.f42270c;
        }
        if ((i10 & 8) != 0) {
            sVar = t0Var.f42271d;
        }
        if ((i10 & 16) != 0) {
            x0Var = t0Var.f42272e;
        }
        if ((i10 & 32) != 0) {
            hVar = t0Var.f42273f;
        }
        if ((i10 & 64) != 0) {
            fVar = androidx.compose.ui.text.style.f.e(t0Var.f42274g);
        }
        if ((i10 & 128) != 0) {
            eVar = androidx.compose.ui.text.style.e.d(t0Var.f42275h);
        }
        if ((i10 & 256) != 0) {
            uVar = t0Var.f42276i;
        }
        androidx.compose.ui.text.style.e eVar2 = eVar;
        androidx.compose.ui.text.style.u uVar2 = uVar;
        long j11 = j10;
        return t0Var.c(jVar, lVar, j11, sVar, x0Var, hVar, fVar, eVar2, uVar2);
    }

    public static /* synthetic */ t0 f(t0 t0Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(t0Var.f42268a);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(t0Var.f42269b);
        }
        if ((i10 & 4) != 0) {
            j10 = t0Var.f42270c;
        }
        if ((i10 & 8) != 0) {
            sVar = t0Var.f42271d;
        }
        if ((i10 & 16) != 0) {
            x0Var = t0Var.f42272e;
        }
        if ((i10 & 32) != 0) {
            hVar = t0Var.f42273f;
        }
        if ((i10 & 64) != 0) {
            fVar = androidx.compose.ui.text.style.f.e(t0Var.f42274g);
        }
        if ((i10 & 128) != 0) {
            eVar = androidx.compose.ui.text.style.e.d(t0Var.f42275h);
        }
        androidx.compose.ui.text.style.e eVar2 = eVar;
        androidx.compose.ui.text.style.h hVar2 = hVar;
        androidx.compose.ui.text.style.s sVar2 = sVar;
        long j11 = j10;
        return t0Var.e(jVar, lVar, j11, sVar2, x0Var, hVar2, fVar, eVar2);
    }

    public static /* synthetic */ t0 h(t0 t0Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(t0Var.f42268a);
        }
        if ((i10 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(t0Var.f42269b);
        }
        if ((i10 & 4) != 0) {
            j10 = t0Var.f42270c;
        }
        if ((i10 & 8) != 0) {
            sVar = t0Var.f42271d;
        }
        if ((i10 & 16) != 0) {
            x0Var = t0Var.f42272e;
        }
        if ((i10 & 32) != 0) {
            hVar = t0Var.f42273f;
        }
        androidx.compose.ui.text.style.h hVar2 = hVar;
        androidx.compose.ui.text.style.s sVar2 = sVar;
        long j11 = j10;
        return t0Var.g(jVar, lVar, j11, sVar2, x0Var, hVar2);
    }

    public static /* synthetic */ t0 j(t0 t0Var, int i10, int i11, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = t0Var.f42268a;
        }
        if ((i14 & 2) != 0) {
            i11 = t0Var.f42269b;
        }
        if ((i14 & 4) != 0) {
            j10 = t0Var.f42270c;
        }
        if ((i14 & 8) != 0) {
            sVar = t0Var.f42271d;
        }
        if ((i14 & 16) != 0) {
            x0Var = t0Var.f42272e;
        }
        if ((i14 & 32) != 0) {
            hVar = t0Var.f42273f;
        }
        if ((i14 & 64) != 0) {
            i12 = t0Var.f42274g;
        }
        if ((i14 & 128) != 0) {
            i13 = t0Var.f42275h;
        }
        if ((i14 & 256) != 0) {
            uVar = t0Var.f42276i;
        }
        int i15 = i13;
        androidx.compose.ui.text.style.u uVar2 = uVar;
        long j11 = j10;
        return t0Var.i(i10, i11, j11, sVar, x0Var, hVar, i12, i15, uVar2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void l() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void o() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void u() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void x() {
    }

    @Nullable
    public final androidx.compose.ui.text.style.u A() {
        return this.f42276i;
    }

    @k7
    @NotNull
    public final t0 B(@Nullable t0 t0Var) {
        return t0Var == null ? this : u0.a(this, t0Var.f42268a, t0Var.f42269b, t0Var.f42270c, t0Var.f42271d, t0Var.f42272e, t0Var.f42273f, t0Var.f42274g, t0Var.f42275h, t0Var.f42276i);
    }

    @k7
    @NotNull
    public final t0 D(@NotNull t0 t0Var) {
        return B(t0Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ t0 a(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar) {
        return new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, this.f42272e, this.f42273f, this.f42274g, this.f42275h, this.f42276i, (DefaultConstructorMarker) null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final /* synthetic */ t0 c(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        return new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, fVar != null ? fVar.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ t0 e(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar) {
        return new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, fVar != null ? fVar.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), this.f42276i, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return androidx.compose.ui.text.style.j.k(this.f42268a, t0Var.f42268a) && androidx.compose.ui.text.style.l.j(this.f42269b, t0Var.f42269b) && androidx.compose.ui.unit.z.j(this.f42270c, t0Var.f42270c) && Intrinsics.areEqual(this.f42271d, t0Var.f42271d) && Intrinsics.areEqual(this.f42272e, t0Var.f42272e) && Intrinsics.areEqual(this.f42273f, t0Var.f42273f) && androidx.compose.ui.text.style.f.k(this.f42274g, t0Var.f42274g) && androidx.compose.ui.text.style.e.g(this.f42275h, t0Var.f42275h) && Intrinsics.areEqual(this.f42276i, t0Var.f42276i);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ t0 g(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar) {
        return new t0(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, this.f42274g, this.f42275h, this.f42276i, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iL = ((((androidx.compose.ui.text.style.j.l(this.f42268a) * 31) + androidx.compose.ui.text.style.l.k(this.f42269b)) * 31) + androidx.compose.ui.unit.z.o(this.f42270c)) * 31;
        androidx.compose.ui.text.style.s sVar = this.f42271d;
        int iHashCode = (iL + (sVar != null ? sVar.hashCode() : 0)) * 31;
        x0 x0Var = this.f42272e;
        int iHashCode2 = (iHashCode + (x0Var != null ? x0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.h hVar = this.f42273f;
        int iHashCode3 = (((((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + androidx.compose.ui.text.style.f.o(this.f42274g)) * 31) + androidx.compose.ui.text.style.e.h(this.f42275h)) * 31;
        androidx.compose.ui.text.style.u uVar = this.f42276i;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }

    @NotNull
    public final t0 i(int i10, int i11, long j10, @Nullable androidx.compose.ui.text.style.s sVar, @Nullable x0 x0Var, @Nullable androidx.compose.ui.text.style.h hVar, int i12, int i13, @Nullable androidx.compose.ui.text.style.u uVar) {
        return new t0(i10, i11, j10, sVar, x0Var, hVar, i12, i13, uVar, (DefaultConstructorMarker) null);
    }

    @oj.i(name = "getHyphens-EaSxIns")
    @Nullable
    public final androidx.compose.ui.text.style.e k() {
        return androidx.compose.ui.text.style.e.d(this.f42275h);
    }

    public final int m() {
        return this.f42275h;
    }

    @oj.i(name = "getLineBreak-LgCVezo")
    @Nullable
    public final androidx.compose.ui.text.style.f n() {
        return androidx.compose.ui.text.style.f.e(this.f42274g);
    }

    public final int p() {
        return this.f42274g;
    }

    public final long q() {
        return this.f42270c;
    }

    @Nullable
    public final androidx.compose.ui.text.style.h r() {
        return this.f42273f;
    }

    @Nullable
    public final x0 s() {
        return this.f42272e;
    }

    @oj.i(name = "getTextAlign-buA522U")
    @Nullable
    public final androidx.compose.ui.text.style.j t() {
        return androidx.compose.ui.text.style.j.h(this.f42268a);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) androidx.compose.ui.text.style.j.m(this.f42268a)) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.l.l(this.f42269b)) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.z.u(this.f42270c)) + ", textIndent=" + this.f42271d + ", platformStyle=" + this.f42272e + ", lineHeightStyle=" + this.f42273f + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.f.p(this.f42274g)) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.e.i(this.f42275h)) + ", textMotion=" + this.f42276i + ')';
    }

    public final int v() {
        return this.f42268a;
    }

    @oj.i(name = "getTextDirection-mmuk1to")
    @Nullable
    public final androidx.compose.ui.text.style.l w() {
        return androidx.compose.ui.text.style.l.g(this.f42269b);
    }

    public final int y() {
        return this.f42269b;
    }

    @Nullable
    public final androidx.compose.ui.text.style.s z() {
        return this.f42271d;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, lVar, j10, sVar, x0Var, hVar, fVar, eVar, uVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, lVar, j10, sVar, x0Var, hVar, fVar, eVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, lVar, j10, sVar, x0Var, hVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, lVar, j10, sVar);
    }

    private t0(int i10, int i11, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar) {
        this.f42268a = i10;
        this.f42269b = i11;
        this.f42270c = j10;
        this.f42271d = sVar;
        this.f42272e = x0Var;
        this.f42273f = hVar;
        this.f42274g = i12;
        this.f42275h = i13;
        this.f42276i = uVar;
        if (androidx.compose.ui.unit.z.j(j10, androidx.compose.ui.unit.z.f42728b.b())) {
            return;
        }
        if (androidx.compose.ui.unit.z.n(j10) >= 0.0f) {
            return;
        }
        x0.a.g("lineHeight can't be negative (" + androidx.compose.ui.unit.z.n(j10) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t0(int i10, int i11, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i12, int i13, androidx.compose.ui.text.style.u uVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int iG = (i14 & 1) != 0 ? androidx.compose.ui.text.style.j.f42206b.g() : i10;
        int iF = (i14 & 2) != 0 ? androidx.compose.ui.text.style.l.f42221b.f() : i11;
        long jB = (i14 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10;
        androidx.compose.ui.text.style.s sVar2 = (i14 & 8) != 0 ? null : sVar;
        x0 x0Var2 = (i14 & 16) != 0 ? null : x0Var;
        androidx.compose.ui.text.style.h hVar2 = (i14 & 32) != 0 ? null : hVar;
        int iG2 = (i14 & 64) != 0 ? androidx.compose.ui.text.style.f.f42154b.g() : i12;
        int iC = (i14 & 128) != 0 ? androidx.compose.ui.text.style.e.f42149b.c() : i13;
        this(iG, iF, jB, sVar2, x0Var2, hVar2, iG2, iC, (i14 & 256) == 0 ? uVar : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : sVar, (i10 & 16) != 0 ? null : x0Var, (i10 & 32) != 0 ? null : hVar, (i10 & 64) != 0 ? null : fVar, (i10 & 128) != 0 ? null : eVar, (i10 & 256) != 0 ? null : uVar, (DefaultConstructorMarker) null);
    }

    private t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.u uVar) {
        this(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, fVar != null ? fVar.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), uVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : sVar, null);
    }

    private t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar) {
        this(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, (x0) null, (androidx.compose.ui.text.style.h) null, androidx.compose.ui.text.style.f.f42154b.g(), androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : sVar, (i10 & 16) != 0 ? null : x0Var, (i10 & 32) != 0 ? null : hVar, null);
    }

    private t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar) {
        this(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, androidx.compose.ui.text.style.f.f42154b.g(), androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : sVar, (i10 & 16) != 0 ? null : x0Var, (i10 & 32) != 0 ? null : hVar, (i10 & 64) != 0 ? null : fVar, (i10 & 128) != 0 ? null : eVar, (DefaultConstructorMarker) null);
    }

    private t0(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j10, androidx.compose.ui.text.style.s sVar, x0 x0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar) {
        this(jVar != null ? jVar.n() : androidx.compose.ui.text.style.j.f42206b.g(), lVar != null ? lVar.m() : androidx.compose.ui.text.style.l.f42221b.f(), j10, sVar, x0Var, hVar, fVar != null ? fVar.q() : androidx.compose.ui.text.style.f.f42154b.g(), eVar != null ? eVar.j() : androidx.compose.ui.text.style.e.f42149b.c(), (androidx.compose.ui.text.style.u) null, (DefaultConstructorMarker) null);
    }
}
