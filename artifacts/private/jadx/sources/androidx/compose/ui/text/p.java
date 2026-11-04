package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p implements f.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f42031h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f42032i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f42033j = androidx.compose.ui.unit.a0.g(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f42034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f42035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final p f42036m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f42037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f42040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.i0 f42041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f42042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.i f42043g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p a() {
            return p.f42036m;
        }

        public final long b() {
            return p.f42033j;
        }

        public final long c() {
            return p.f42035l;
        }

        public final long d() {
            return p.f42034k;
        }

        private a() {
        }
    }

    static {
        long jE = androidx.compose.ui.unit.a0.e(0.25d);
        f42034k = jE;
        long jE2 = androidx.compose.ui.unit.a0.e(0.25d);
        f42035l = jE2;
        f42036m = new p(s.f42138a, jE, jE, jE2, null, 0.0f, null, com.planner5d.library.engine.input.f.b.B, null);
    }

    public /* synthetic */ p(androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.drawscope.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, j10, j11, j12, i0Var, f10, iVar);
    }

    public static /* synthetic */ p f(p pVar, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.drawscope.i iVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = pVar.f42037a;
        }
        if ((i10 & 2) != 0) {
            j10 = pVar.f42038b;
        }
        if ((i10 & 4) != 0) {
            j11 = pVar.f42039c;
        }
        if ((i10 & 8) != 0) {
            j12 = pVar.f42040d;
        }
        if ((i10 & 16) != 0) {
            i0Var = pVar.f42041e;
        }
        if ((i10 & 32) != 0) {
            f10 = pVar.f42042f;
        }
        if ((i10 & 64) != 0) {
            iVar = pVar.f42043g;
        }
        androidx.compose.ui.graphics.drawscope.i iVar2 = iVar;
        androidx.compose.ui.graphics.i0 i0Var2 = i0Var;
        long j13 = j12;
        long j14 = j11;
        return pVar.e(q3Var, j10, j14, j13, i0Var2, f10, iVar2);
    }

    @NotNull
    public final p e(@NotNull androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, @Nullable androidx.compose.ui.graphics.i0 i0Var, float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar) {
        return new p(q3Var, j10, j11, j12, i0Var, f10, iVar, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            return Intrinsics.areEqual(this.f42037a, pVar.f42037a) && androidx.compose.ui.unit.z.j(this.f42038b, pVar.f42038b) && androidx.compose.ui.unit.z.j(this.f42039c, pVar.f42039c) && androidx.compose.ui.unit.z.j(this.f42040d, pVar.f42040d) && Intrinsics.areEqual(this.f42041e, pVar.f42041e) && this.f42042f == pVar.f42042f && Intrinsics.areEqual(this.f42043g, pVar.f42043g);
        }
        return false;
    }

    public final float g() {
        return this.f42042f;
    }

    @Nullable
    public final androidx.compose.ui.graphics.i0 h() {
        return this.f42041e;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f42037a.hashCode() * 31) + androidx.compose.ui.unit.z.o(this.f42038b)) * 31) + androidx.compose.ui.unit.z.o(this.f42039c)) * 31) + androidx.compose.ui.unit.z.o(this.f42040d)) * 31;
        androidx.compose.ui.graphics.i0 i0Var = this.f42041e;
        return ((((iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31) + Float.hashCode(this.f42042f)) * 31) + this.f42043g.hashCode();
    }

    @NotNull
    public final androidx.compose.ui.graphics.drawscope.i i() {
        return this.f42043g;
    }

    public final long j() {
        return this.f42039c;
    }

    public final long k() {
        return this.f42040d;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 l() {
        return this.f42037a;
    }

    public final long m() {
        return this.f42038b;
    }

    @NotNull
    public String toString() {
        return "Bullet(shape=" + this.f42037a + ", size=(" + ((Object) androidx.compose.ui.unit.z.u(this.f42038b)) + ", " + ((Object) androidx.compose.ui.unit.z.u(this.f42039c)) + "), padding=" + ((Object) androidx.compose.ui.unit.z.u(this.f42040d)) + ", brush=" + this.f42041e + ", alpha=" + this.f42042f + ", drawStyle=" + this.f42043g + ')';
    }

    private p(androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.drawscope.i iVar) {
        this.f42037a = q3Var;
        this.f42038b = j10;
        this.f42039c = j11;
        this.f42040d = j12;
        this.f42041e = i0Var;
        this.f42042f = f10;
        this.f42043g = iVar;
    }

    public /* synthetic */ p(androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, long j12, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.drawscope.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, j10, j11, j12, (i10 & 16) != 0 ? null : i0Var, (i10 & 32) != 0 ? Float.NaN : f10, (i10 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.m.f37744a : iVar, null);
    }
}
