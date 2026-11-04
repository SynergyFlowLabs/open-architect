package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,580:1\n59#2:581\n54#2:583\n90#3:582\n85#3:584\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n*L\n313#1:581\n317#1:583\n313#1:582\n317#1:584\n*E\n"})
public final class p3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42048g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o3 f42049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f42050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f42052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f42053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<n0.j> f42054f;

    public /* synthetic */ p3(o3 o3Var, f0 f0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o3Var, f0Var, j10);
    }

    public static /* synthetic */ p3 b(p3 p3Var, o3 o3Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o3Var = p3Var.f42049a;
        }
        if ((i10 & 2) != 0) {
            j10 = p3Var.f42051c;
        }
        return p3Var.a(o3Var, j10);
    }

    public static /* synthetic */ int q(p3 p3Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return p3Var.p(i10, z10);
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 A(int i10, int i11) {
        return this.f42050b.H(i10, i11);
    }

    @NotNull
    public final List<n0.j> B() {
        return this.f42054f;
    }

    public final long C() {
        return this.f42051c;
    }

    public final long D(int i10) {
        return this.f42050b.M(i10);
    }

    public final boolean E(int i10) {
        return this.f42050b.N(i10);
    }

    @NotNull
    public final p3 a(@NotNull o3 o3Var, long j10) {
        return new p3(o3Var, this.f42050b, j10, null);
    }

    @NotNull
    public final androidx.compose.ui.text.style.i c(int i10) {
        return this.f42050b.f(i10);
    }

    @NotNull
    public final n0.j d(int i10) {
        return this.f42050b.g(i10);
    }

    @NotNull
    public final n0.j e(int i10) {
        return this.f42050b.h(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        if (!Intrinsics.areEqual(this.f42049a, p3Var.f42049a) || !Intrinsics.areEqual(this.f42050b, p3Var.f42050b) || !androidx.compose.ui.unit.u.h(this.f42051c, p3Var.f42051c)) {
            return false;
        }
        if (this.f42052d == p3Var.f42052d && this.f42053e == p3Var.f42053e) {
            return Intrinsics.areEqual(this.f42054f, p3Var.f42054f);
        }
        return false;
    }

    public final boolean f() {
        return this.f42050b.i() || ((float) ((int) (this.f42051c & com.rabbitmq.client.k0.f265952a))) < this.f42050b.k();
    }

    public final boolean g() {
        return ((float) ((int) (this.f42051c >> 32))) < this.f42050b.L();
    }

    public final float h() {
        return this.f42052d;
    }

    public int hashCode() {
        return (((((((((this.f42049a.hashCode() * 31) + this.f42050b.hashCode()) * 31) + androidx.compose.ui.unit.u.n(this.f42051c)) * 31) + Float.hashCode(this.f42052d)) * 31) + Float.hashCode(this.f42053e)) * 31) + this.f42054f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f42050b.l(i10, z10);
    }

    public final float k() {
        return this.f42053e;
    }

    @NotNull
    public final o3 l() {
        return this.f42049a;
    }

    public final float m(int i10) {
        return this.f42050b.o(i10);
    }

    public final float n(int i10) {
        return this.f42050b.p(i10);
    }

    public final int o() {
        return this.f42050b.q();
    }

    public final int p(int i10, boolean z10) {
        return this.f42050b.r(i10, z10);
    }

    public final int r(int i10) {
        return this.f42050b.t(i10);
    }

    public final int s(float f10) {
        return this.f42050b.u(f10);
    }

    public final float t(int i10) {
        return this.f42050b.w(i10);
    }

    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f42049a + ", multiParagraph=" + this.f42050b + ", size=" + ((Object) androidx.compose.ui.unit.u.p(this.f42051c)) + ", firstBaseline=" + this.f42052d + ", lastBaseline=" + this.f42053e + ", placeholderRects=" + this.f42054f + ')';
    }

    public final float u(int i10) {
        return this.f42050b.x(i10);
    }

    public final int v(int i10) {
        return this.f42050b.y(i10);
    }

    public final float w(int i10) {
        return this.f42050b.z(i10);
    }

    @NotNull
    public final f0 x() {
        return this.f42050b;
    }

    public final int y(long j10) {
        return this.f42050b.E(j10);
    }

    @NotNull
    public final androidx.compose.ui.text.style.i z(int i10) {
        return this.f42050b.F(i10);
    }

    private p3(o3 o3Var, f0 f0Var, long j10) {
        this.f42049a = o3Var;
        this.f42050b = f0Var;
        this.f42051c = j10;
        this.f42052d = f0Var.j();
        this.f42053e = f0Var.n();
        this.f42054f = f0Var.J();
    }
}
