package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class w3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20155r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.graphics.c2, Unit> f20156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q3 f20157b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.input.y0 f20165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.p3 f20166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.input.m0 f20167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private n0.j f20168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private n0.j f20169n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f20158c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f20170o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final float[] f20171p = androidx.compose.ui.graphics.c2.c(null, 1, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final Matrix f20172q = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public w3(@NotNull Function1<? super androidx.compose.ui.graphics.c2, Unit> function1, @NotNull q3 q3Var) {
        this.f20156a = function1;
        this.f20157b = q3Var;
    }

    private final void c() {
        if (this.f20157b.isActive() && this.f20165j != null && this.f20167l != null && this.f20166k != null && this.f20168m != null && this.f20169n != null) {
            androidx.compose.ui.graphics.c2.m(this.f20171p);
            this.f20156a.invoke(androidx.compose.ui.graphics.c2.a(this.f20171p));
            float[] fArr = this.f20171p;
            n0.j jVar = this.f20169n;
            Intrinsics.checkNotNull(jVar);
            float f10 = -jVar.t();
            n0.j jVar2 = this.f20169n;
            Intrinsics.checkNotNull(jVar2);
            androidx.compose.ui.graphics.c2.y(fArr, f10, -jVar2.B(), 0.0f);
            androidx.compose.ui.graphics.k.a(this.f20172q, this.f20171p);
            q3 q3Var = this.f20157b;
            CursorAnchorInfo.Builder builder = this.f20170o;
            androidx.compose.ui.text.input.y0 y0Var = this.f20165j;
            Intrinsics.checkNotNull(y0Var);
            androidx.compose.ui.text.input.m0 m0Var = this.f20167l;
            Intrinsics.checkNotNull(m0Var);
            androidx.compose.ui.text.p3 p3Var = this.f20166k;
            Intrinsics.checkNotNull(p3Var);
            Matrix matrix = this.f20172q;
            n0.j jVar3 = this.f20168m;
            Intrinsics.checkNotNull(jVar3);
            n0.j jVar4 = this.f20169n;
            Intrinsics.checkNotNull(jVar4);
            q3Var.d(v3.b(builder, y0Var, m0Var, p3Var, matrix, jVar3, jVar4, this.f20161f, this.f20162g, this.f20163h, this.f20164i));
            this.f20160e = false;
        }
    }

    public final void a() {
        synchronized (this.f20158c) {
            try {
                this.f20165j = null;
                this.f20167l = null;
                this.f20166k = null;
                this.f20168m = null;
                this.f20169n = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f20158c) {
            try {
                this.f20161f = z12;
                this.f20162g = z13;
                this.f20163h = z14;
                this.f20164i = z15;
                if (z10) {
                    this.f20160e = true;
                    if (this.f20165j != null) {
                        c();
                    }
                }
                this.f20159d = z11;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        synchronized (this.f20158c) {
            try {
                this.f20165j = y0Var;
                this.f20167l = m0Var;
                this.f20166k = p3Var;
                this.f20168m = jVar;
                this.f20169n = jVar2;
                if (this.f20160e || this.f20159d) {
                    c();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
