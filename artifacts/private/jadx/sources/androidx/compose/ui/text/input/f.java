package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.text.p3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public final class f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f41858s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.j f41859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f41860b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private y0 f41868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private p3 f41869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private m0 f41870l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private n0.j f41872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private n0.j f41873o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f41861c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private Function1<? super c2, Unit> f41871m = b.f41878a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f41874p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final float[] f41875q = c2.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Matrix f41876r = new Matrix();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<c2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41877a = new a();

        a() {
            super(1);
        }

        public final void c(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c2 c2Var) {
            c(c2Var.A());
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<c2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41878a = new b();

        b() {
            super(1);
        }

        public final void c(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c2 c2Var) {
            c(c2Var.A());
            return Unit.f312394a;
        }
    }

    public f(@NotNull androidx.compose.ui.input.pointer.j jVar, @NotNull x xVar) {
        this.f41859a = jVar;
        this.f41860b = xVar;
    }

    private final void c() {
        if (this.f41860b.isActive()) {
            this.f41871m.invoke(c2.a(this.f41875q));
            this.f41859a.j(this.f41875q);
            androidx.compose.ui.graphics.k.a(this.f41876r, this.f41875q);
            x xVar = this.f41860b;
            CursorAnchorInfo.Builder builder = this.f41874p;
            y0 y0Var = this.f41868j;
            Intrinsics.checkNotNull(y0Var);
            m0 m0Var = this.f41870l;
            Intrinsics.checkNotNull(m0Var);
            p3 p3Var = this.f41869k;
            Intrinsics.checkNotNull(p3Var);
            Matrix matrix = this.f41876r;
            n0.j jVar = this.f41872n;
            Intrinsics.checkNotNull(jVar);
            n0.j jVar2 = this.f41873o;
            Intrinsics.checkNotNull(jVar2);
            xVar.d(e.b(builder, y0Var, m0Var, p3Var, matrix, jVar, jVar2, this.f41864f, this.f41865g, this.f41866h, this.f41867i));
            this.f41863e = false;
        }
    }

    public final void a() {
        synchronized (this.f41861c) {
            this.f41868j = null;
            this.f41870l = null;
            this.f41869k = null;
            this.f41871m = a.f41877a;
            this.f41872n = null;
            this.f41873o = null;
            Unit unit = Unit.f312394a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f41861c) {
            try {
                this.f41864f = z12;
                this.f41865g = z13;
                this.f41866h = z14;
                this.f41867i = z15;
                if (z10) {
                    this.f41863e = true;
                    if (this.f41868j != null) {
                        c();
                    }
                }
                this.f41862d = z11;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NotNull y0 y0Var, @NotNull m0 m0Var, @NotNull p3 p3Var, @NotNull Function1<? super c2, Unit> function1, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        synchronized (this.f41861c) {
            try {
                this.f41868j = y0Var;
                this.f41870l = m0Var;
                this.f41869k = p3Var;
                this.f41871m = function1;
                this.f41872n = jVar;
                this.f41873o = jVar2;
                if (this.f41863e || this.f41862d) {
                    c();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
