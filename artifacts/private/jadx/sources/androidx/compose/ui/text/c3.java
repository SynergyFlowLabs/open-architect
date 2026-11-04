package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class c3 implements f.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f41481q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.style.p f41482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.font.v0 f41484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.font.q0 f41485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.font.r0 f41486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.font.y f41487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f41488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f41489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.a f41490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.q f41491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final y0.f f41492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f41493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.style.k f41494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.o3 f41495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final y0 f41496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.drawscope.i f41497p;

    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var, iVar);
    }

    public static /* synthetic */ c3 F(c3 c3Var, c3 c3Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3Var2 = null;
        }
        return c3Var.E(c3Var2);
    }

    public static /* synthetic */ c3 d(c3 c3Var, long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, Object obj) {
        long jM = (i10 & 1) != 0 ? c3Var.m() : j10;
        return c3Var.c(jM, (i10 & 2) != 0 ? c3Var.f41483b : j11, (i10 & 4) != 0 ? c3Var.f41484c : v0Var, (i10 & 8) != 0 ? c3Var.f41485d : q0Var, (i10 & 16) != 0 ? c3Var.f41486e : r0Var, (i10 & 32) != 0 ? c3Var.f41487f : yVar, (i10 & 64) != 0 ? c3Var.f41488g : str, (i10 & 128) != 0 ? c3Var.f41489h : j12, (i10 & 256) != 0 ? c3Var.f41490i : aVar, (i10 & 512) != 0 ? c3Var.f41491j : qVar, (i10 & 1024) != 0 ? c3Var.f41492k : fVar, (i10 & 2048) != 0 ? c3Var.f41493l : j13, (i10 & 4096) != 0 ? c3Var.f41494m : kVar, (i10 & 8192) != 0 ? c3Var.f41495n : o3Var, (i10 & 16384) != 0 ? c3Var.f41496o : y0Var, (i10 & 32768) != 0 ? c3Var.f41497p : iVar);
    }

    public static /* synthetic */ c3 h(c3 c3Var, androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, Object obj) {
        androidx.compose.ui.graphics.drawscope.i iVar2;
        y0 y0Var2;
        float fI = (i10 & 2) != 0 ? c3Var.i() : f10;
        long j13 = (i10 & 4) != 0 ? c3Var.f41483b : j10;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 8) != 0 ? c3Var.f41484c : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 16) != 0 ? c3Var.f41485d : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 32) != 0 ? c3Var.f41486e : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 64) != 0 ? c3Var.f41487f : yVar;
        String str2 = (i10 & 128) != 0 ? c3Var.f41488g : str;
        long j14 = (i10 & 256) != 0 ? c3Var.f41489h : j11;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 512) != 0 ? c3Var.f41490i : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 1024) != 0 ? c3Var.f41491j : qVar;
        y0.f fVar2 = (i10 & 2048) != 0 ? c3Var.f41492k : fVar;
        float f11 = fI;
        long j15 = j13;
        long j16 = (i10 & 4096) != 0 ? c3Var.f41493l : j12;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 8192) != 0 ? c3Var.f41494m : kVar;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 16384) != 0 ? c3Var.f41495n : o3Var;
        y0 y0Var3 = (i10 & 32768) != 0 ? c3Var.f41496o : y0Var;
        if ((i10 & 65536) != 0) {
            y0Var2 = y0Var3;
            iVar2 = c3Var.f41497p;
        } else {
            iVar2 = iVar;
            y0Var2 = y0Var3;
        }
        return c3Var.g(i0Var, f11, j15, v0Var2, q0Var2, r0Var2, yVar2, str2, j14, aVar2, qVar2, fVar2, j16, kVar2, o3Var2, y0Var2, iVar2);
    }

    @Nullable
    public final androidx.compose.ui.text.style.q A() {
        return this.f41491j;
    }

    public final boolean B(@NotNull c3 c3Var) {
        if (this == c3Var) {
            return true;
        }
        if (androidx.compose.ui.unit.z.j(this.f41483b, c3Var.f41483b) && Intrinsics.areEqual(this.f41484c, c3Var.f41484c) && Intrinsics.areEqual(this.f41485d, c3Var.f41485d) && Intrinsics.areEqual(this.f41486e, c3Var.f41486e) && Intrinsics.areEqual(this.f41487f, c3Var.f41487f) && Intrinsics.areEqual(this.f41488g, c3Var.f41488g) && androidx.compose.ui.unit.z.j(this.f41489h, c3Var.f41489h) && Intrinsics.areEqual(this.f41490i, c3Var.f41490i) && Intrinsics.areEqual(this.f41491j, c3Var.f41491j) && Intrinsics.areEqual(this.f41492k, c3Var.f41492k) && androidx.compose.ui.graphics.q0.y(this.f41493l, c3Var.f41493l) && Intrinsics.areEqual(this.f41496o, c3Var.f41496o)) {
            return true;
        }
        return false;
    }

    public final boolean C(@NotNull c3 c3Var) {
        return Intrinsics.areEqual(this.f41482a, c3Var.f41482a) && Intrinsics.areEqual(this.f41494m, c3Var.f41494m) && Intrinsics.areEqual(this.f41495n, c3Var.f41495n) && Intrinsics.areEqual(this.f41497p, c3Var.f41497p);
    }

    public final int D() {
        int iO = androidx.compose.ui.unit.z.o(this.f41483b) * 31;
        androidx.compose.ui.text.font.v0 v0Var = this.f41484c;
        int iHashCode = (iO + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.text.font.q0 q0Var = this.f41485d;
        int iH = (iHashCode + (q0Var != null ? androidx.compose.ui.text.font.q0.h(q0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.r0 r0Var = this.f41486e;
        int i10 = (iH + (r0Var != null ? androidx.compose.ui.text.font.r0.i(r0Var.m()) : 0)) * 31;
        androidx.compose.ui.text.font.y yVar = this.f41487f;
        int iHashCode2 = (i10 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.f41488g;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + androidx.compose.ui.unit.z.o(this.f41489h)) * 31;
        androidx.compose.ui.text.style.a aVar = this.f41490i;
        int i11 = (iHashCode3 + (aVar != null ? androidx.compose.ui.text.style.a.i(aVar.k()) : 0)) * 31;
        androidx.compose.ui.text.style.q qVar = this.f41491j;
        int iHashCode4 = (i11 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        y0.f fVar = this.f41492k;
        int iHashCode5 = (((iHashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.q0.K(this.f41493l)) * 31;
        y0 y0Var = this.f41496o;
        return iHashCode5 + (y0Var != null ? y0Var.hashCode() : 0);
    }

    @k7
    @NotNull
    public final c3 E(@Nullable c3 c3Var) {
        return c3Var == null ? this : e3.b(this, c3Var.f41482a.u(), c3Var.f41482a.o0(), c3Var.f41482a.r(), c3Var.f41483b, c3Var.f41484c, c3Var.f41485d, c3Var.f41486e, c3Var.f41487f, c3Var.f41488g, c3Var.f41489h, c3Var.f41490i, c3Var.f41491j, c3Var.f41492k, c3Var.f41493l, c3Var.f41494m, c3Var.f41495n, c3Var.f41496o, c3Var.f41497p);
    }

    @k7
    @NotNull
    public final c3 G(@NotNull c3 c3Var) {
        return E(c3Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ c3 a(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var) {
        return new c3(androidx.compose.ui.graphics.q0.y(j10, m()) ? this.f41482a : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final c3 c(long j10, long j11, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j12, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j13, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable y0 y0Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar) {
        return new c3(androidx.compose.ui.graphics.q0.y(j10, m()) ? this.f41482a : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var, iVar, (DefaultConstructorMarker) null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final /* synthetic */ c3 e(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var) {
        return new c3(androidx.compose.ui.graphics.q0.y(j10, m()) ? this.f41482a : androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, this.f41496o, this.f41497p, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return B(c3Var) && C(c3Var);
    }

    @NotNull
    public final c3 g(@Nullable androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j11, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j12, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable y0 y0Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar) {
        return new c3(androidx.compose.ui.text.style.p.f42231a.a(i0Var, f10), j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, y0Var, iVar, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iK = androidx.compose.ui.graphics.q0.K(m()) * 31;
        androidx.compose.ui.graphics.i0 i0VarL = l();
        int iHashCode = (((((iK + (i0VarL != null ? i0VarL.hashCode() : 0)) * 31) + Float.hashCode(i())) * 31) + androidx.compose.ui.unit.z.o(this.f41483b)) * 31;
        androidx.compose.ui.text.font.v0 v0Var = this.f41484c;
        int iHashCode2 = (iHashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.text.font.q0 q0Var = this.f41485d;
        int iH = (iHashCode2 + (q0Var != null ? androidx.compose.ui.text.font.q0.h(q0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.r0 r0Var = this.f41486e;
        int i10 = (iH + (r0Var != null ? androidx.compose.ui.text.font.r0.i(r0Var.m()) : 0)) * 31;
        androidx.compose.ui.text.font.y yVar = this.f41487f;
        int iHashCode3 = (i10 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.f41488g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + androidx.compose.ui.unit.z.o(this.f41489h)) * 31;
        androidx.compose.ui.text.style.a aVar = this.f41490i;
        int i11 = (iHashCode4 + (aVar != null ? androidx.compose.ui.text.style.a.i(aVar.k()) : 0)) * 31;
        androidx.compose.ui.text.style.q qVar = this.f41491j;
        int iHashCode5 = (i11 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        y0.f fVar = this.f41492k;
        int iHashCode6 = (((iHashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.q0.K(this.f41493l)) * 31;
        androidx.compose.ui.text.style.k kVar = this.f41494m;
        int iHashCode7 = (iHashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.o3 o3Var = this.f41495n;
        int iHashCode8 = (iHashCode7 + (o3Var != null ? o3Var.hashCode() : 0)) * 31;
        y0 y0Var = this.f41496o;
        int iHashCode9 = (iHashCode8 + (y0Var != null ? y0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.drawscope.i iVar = this.f41497p;
        return iHashCode9 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final float i() {
        return this.f41482a.r();
    }

    public final long j() {
        return this.f41493l;
    }

    @Nullable
    public final androidx.compose.ui.text.style.a k() {
        return this.f41490i;
    }

    @Nullable
    public final androidx.compose.ui.graphics.i0 l() {
        return this.f41482a.o0();
    }

    public final long m() {
        return this.f41482a.u();
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.i n() {
        return this.f41497p;
    }

    @Nullable
    public final androidx.compose.ui.text.font.y o() {
        return this.f41487f;
    }

    @Nullable
    public final String p() {
        return this.f41488g;
    }

    public final long q() {
        return this.f41483b;
    }

    @Nullable
    public final androidx.compose.ui.text.font.q0 r() {
        return this.f41485d;
    }

    @Nullable
    public final androidx.compose.ui.text.font.r0 s() {
        return this.f41486e;
    }

    @Nullable
    public final androidx.compose.ui.text.font.v0 t() {
        return this.f41484c;
    }

    @NotNull
    public String toString() {
        return "SpanStyle(color=" + ((Object) androidx.compose.ui.graphics.q0.L(m())) + ", brush=" + l() + ", alpha=" + i() + ", fontSize=" + ((Object) androidx.compose.ui.unit.z.u(this.f41483b)) + ", fontWeight=" + this.f41484c + ", fontStyle=" + this.f41485d + ", fontSynthesis=" + this.f41486e + ", fontFamily=" + this.f41487f + ", fontFeatureSettings=" + this.f41488g + ", letterSpacing=" + ((Object) androidx.compose.ui.unit.z.u(this.f41489h)) + ", baselineShift=" + this.f41490i + ", textGeometricTransform=" + this.f41491j + ", localeList=" + this.f41492k + ", background=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f41493l)) + ", textDecoration=" + this.f41494m + ", shadow=" + this.f41495n + ", platformStyle=" + this.f41496o + ", drawStyle=" + this.f41497p + ')';
    }

    public final long u() {
        return this.f41489h;
    }

    @Nullable
    public final y0.f v() {
        return this.f41492k;
    }

    @Nullable
    public final y0 w() {
        return this.f41496o;
    }

    @Nullable
    public final androidx.compose.ui.graphics.o3 x() {
        return this.f41495n;
    }

    @Nullable
    public final androidx.compose.ui.text.style.k y() {
        return this.f41494m;
    }

    @NotNull
    public final androidx.compose.ui.text.style.p z() {
        return this.f41482a;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var);
    }

    public /* synthetic */ c3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, f10, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, y0Var, iVar);
    }

    public /* synthetic */ c3(androidx.compose.ui.text.style.p pVar, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, y0Var, iVar);
    }

    private c3(androidx.compose.ui.text.style.p pVar, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this.f41482a = pVar;
        this.f41483b = j10;
        this.f41484c = v0Var;
        this.f41485d = q0Var;
        this.f41486e = r0Var;
        this.f41487f = yVar;
        this.f41488g = str;
        this.f41489h = j11;
        this.f41490i = aVar;
        this.f41491j = qVar;
        this.f41492k = fVar;
        this.f41493l = j12;
        this.f41494m = kVar;
        this.f41495n = o3Var;
        this.f41496o = y0Var;
        this.f41497p = iVar;
    }

    public /* synthetic */ c3(androidx.compose.ui.text.style.p pVar, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 4) != 0 ? null : v0Var, (i10 & 8) != 0 ? null : q0Var, (i10 & 16) != 0 ? null : r0Var, (i10 & 32) != 0 ? null : yVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : qVar, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12, (i10 & 4096) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o3Var, (i10 & 16384) != 0 ? null : y0Var, (i10 & 32768) != 0 ? null : iVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j14 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j15 = jU2;
        this(jU, jB, v0Var2, q0Var3, r0Var3, yVar3, str3, j14, aVar3, qVar3, fVar3, j15, (i10 & 4096) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o3Var, (DefaultConstructorMarker) null);
    }

    private c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var) {
        this(androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j14 = jU;
        long j15 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j16 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j17 = jU2;
        this(j14, j15, v0Var3, q0Var3, r0Var3, yVar3, str3, j16, aVar3, qVar3, fVar3, j17, kVar3, (i10 & 8192) != 0 ? null : o3Var, (i10 & 16384) != 0 ? null : y0Var, (DefaultConstructorMarker) null);
    }

    private c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var) {
        this(androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jU = (i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jB = (i10 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11;
        androidx.compose.ui.text.font.v0 v0Var2 = (i10 & 4) != 0 ? null : v0Var;
        androidx.compose.ui.text.font.q0 q0Var2 = (i10 & 8) != 0 ? null : q0Var;
        androidx.compose.ui.text.font.r0 r0Var2 = (i10 & 16) != 0 ? null : r0Var;
        androidx.compose.ui.text.font.y yVar2 = (i10 & 32) != 0 ? null : yVar;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jB2 = (i10 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j12;
        androidx.compose.ui.text.style.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 512) != 0 ? null : qVar;
        y0.f fVar2 = (i10 & 1024) != 0 ? null : fVar;
        long jU2 = (i10 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        androidx.compose.ui.text.style.k kVar2 = (i10 & 4096) != 0 ? null : kVar;
        long j14 = jU;
        androidx.compose.ui.graphics.o3 o3Var2 = (i10 & 8192) != 0 ? null : o3Var;
        y0 y0Var2 = (i10 & 16384) != 0 ? null : y0Var;
        long j15 = jB;
        androidx.compose.ui.text.font.v0 v0Var3 = v0Var2;
        androidx.compose.ui.text.style.k kVar3 = kVar2;
        androidx.compose.ui.text.font.q0 q0Var3 = q0Var2;
        androidx.compose.ui.text.font.r0 r0Var3 = r0Var2;
        androidx.compose.ui.text.font.y yVar3 = yVar2;
        String str3 = str2;
        long j16 = jB2;
        androidx.compose.ui.text.style.a aVar3 = aVar2;
        androidx.compose.ui.text.style.q qVar3 = qVar2;
        y0.f fVar3 = fVar2;
        long j17 = jU2;
        this(j14, j15, v0Var3, q0Var3, r0Var3, yVar3, str3, j16, aVar3, qVar3, fVar3, j17, kVar3, o3Var2, y0Var2, (i10 & 32768) != 0 ? null : iVar, (DefaultConstructorMarker) null);
    }

    private c3(long j10, long j11, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j13, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this(androidx.compose.ui.text.style.p.f42231a.b(j10), j11, v0Var, q0Var, r0Var, yVar, str, j12, aVar, qVar, fVar, j13, kVar, o3Var, y0Var, iVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ c3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j10, (i10 & 8) != 0 ? null : v0Var, (i10 & 16) != 0 ? null : q0Var, (i10 & 32) != 0 ? null : r0Var, (i10 & 64) != 0 ? null : yVar, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : j11, (i10 & 512) != 0 ? null : aVar, (i10 & 1024) != 0 ? null : qVar, (i10 & 2048) != 0 ? null : fVar, (i10 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12, (i10 & 8192) != 0 ? null : kVar, (i10 & 16384) != 0 ? null : o3Var, (32768 & i10) != 0 ? null : y0Var, (i10 & 65536) != 0 ? null : iVar, (DefaultConstructorMarker) null);
    }

    private c3(androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, androidx.compose.ui.text.font.r0 r0Var, androidx.compose.ui.text.font.y yVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.q qVar, y0.f fVar, long j12, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.o3 o3Var, y0 y0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this(androidx.compose.ui.text.style.p.f42231a.a(i0Var, f10), j10, v0Var, q0Var, r0Var, yVar, str, j11, aVar, qVar, fVar, j12, kVar, o3Var, y0Var, iVar, (DefaultConstructorMarker) null);
    }
}
