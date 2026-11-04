package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.unit.w;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import n0.m;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nShadowRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowRenderer.kt\nandroidx/compose/ui/graphics/shadow/ShadowRenderer\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,138:1\n635#2:139\n141#3:140\n*S KotlinDebug\n*F\n+ 1 ShadowRenderer.kt\nandroidx/compose/ui/graphics/shadow/ShadowRenderer\n*L\n65#1:139\n71#1:140\n*E\n"})
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f2 f38224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private k2 f38225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private r0 f38226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38227d = q0.f38131b.u();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38228e = n0.a.f332683b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38229f = n.f332724b.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private w f38230g = w.Ltr;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f38231h = 1.0f;

    public l(@NotNull f2 f2Var) {
        this.f38224a = f2Var;
    }

    private final r0 e(long j10) {
        r0 r0Var = this.f38226c;
        if (r0Var != null && q0.y(this.f38227d, j10)) {
            return r0Var;
        }
        r0 r0VarD = r0.a.d(r0.f38151b, j10, 0, 2, null);
        this.f38227d = j10;
        this.f38226c = r0VarD;
        return r0VarD;
    }

    private final void g(f2 f2Var) {
        if (f2Var instanceof f2.a) {
            this.f38225b = ((f2.a) f2Var).b();
            this.f38228e = n0.a.f332683b.a();
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            if (!(f2Var instanceof f2.b)) {
                throw new k0();
            }
            this.f38225b = null;
            this.f38228e = n0.a.f332683b.a();
            return;
        }
        f2.c cVar = (f2.c) f2Var;
        if (m.q(cVar.b())) {
            this.f38225b = null;
            this.f38228e = cVar.b().t();
        } else {
            this.f38225b = cVar.c();
            this.f38228e = n0.a.f332683b.a();
        }
    }

    protected abstract void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var);

    public final void b(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @Nullable r0 r0Var, long j10, long j11, @Nullable i0 i0Var, float f10, int i10) {
        g(this.f38224a);
        if (r0Var == null) {
            r0Var = (i0Var != null || j11 == 16) ? null : e(j11);
        }
        r0 r0Var2 = r0Var;
        long j12 = this.f38229f;
        if (j12 == n0.d.f332689d || !n.k(j12, j10) || this.f38230g != fVar.getLayoutDirection() || this.f38231h != fVar.getDensity()) {
            a(fVar, j10, this.f38228e, this.f38225b);
            this.f38229f = j10;
            this.f38230g = fVar.getLayoutDirection();
            this.f38231h = fVar.getDensity();
        }
        f(fVar, j10, this.f38228e, this.f38225b, f10, r0Var2, i0Var, i10);
    }

    @NotNull
    public final f2 c() {
        return this.f38224a;
    }

    public void d() {
        this.f38229f = n.f332724b.a();
        this.f38230g = w.Ltr;
        this.f38231h = 1.0f;
    }

    protected abstract void f(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var, float f10, @Nullable r0 r0Var, @Nullable i0 i0Var, int i10);
}
