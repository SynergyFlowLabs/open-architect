package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.x2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@k7
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n76#3:133\n109#3,2:134\n81#4:136\n107#4,2:137\n152#5:139\n152#5:140\n159#5:141\n159#5:147\n159#5:148\n105#6:142\n67#6,4:143\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n37#1:130\n37#1:131,2\n41#1:133\n41#1:134,2\n42#1:136\n42#1:137,2\n88#1:139\n89#1:140\n110#1:141\n124#1:147\n125#1:148\n113#1:142\n113#1:143,4\n*E\n"})
public final class CrossfadePainter extends androidx.compose.ui.graphics.painter.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f86990v = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.painter.b f86991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.painter.b f86992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f86993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f86994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f86995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f86996l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f86999o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final l3 f86997m = e6.b(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f86998n = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final k3 f87000s = g4.b(1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final n3 f87001t = d7.g(null, null, 2, null);

    public CrossfadePainter(@Nullable androidx.compose.ui.graphics.painter.b bVar, @Nullable androidx.compose.ui.graphics.painter.b bVar2, @NotNull androidx.compose.ui.layout.l lVar, int i10, boolean z10, boolean z11) {
        this.f86991g = bVar;
        this.f86992h = bVar2;
        this.f86993i = lVar;
        this.f86994j = i10;
        this.f86995k = z10;
        this.f86996l = z11;
    }

    private final long o(long j10, long j11) {
        n0.n.a aVar = n0.n.f332724b;
        return (j10 == aVar.a() || n0.n.v(j10) || j11 == aVar.a() || n0.n.v(j11)) ? j11 : x2.i(j10, this.f86993i.a(j10, j11));
    }

    private final long p() {
        androidx.compose.ui.graphics.painter.b bVar = this.f86991g;
        long jL = bVar != null ? bVar.l() : n0.n.f332724b.c();
        androidx.compose.ui.graphics.painter.b bVar2 = this.f86992h;
        long jL2 = bVar2 != null ? bVar2.l() : n0.n.f332724b.c();
        n0.n.a aVar = n0.n.f332724b;
        boolean z10 = jL != aVar.a();
        boolean z11 = jL2 != aVar.a();
        if (z10 && z11) {
            return n0.o.a(Math.max(n0.n.t(jL), n0.n.t(jL2)), Math.max(n0.n.m(jL), n0.n.m(jL2)));
        }
        if (this.f86996l) {
            if (z10) {
                return jL;
            }
            if (z11) {
                return jL2;
            }
        }
        return aVar.a();
    }

    private final void q(androidx.compose.ui.graphics.drawscope.f fVar, androidx.compose.ui.graphics.painter.b bVar, float f10) {
        if (bVar == null || f10 <= 0.0f) {
            return;
        }
        long jD = fVar.d();
        long jO = o(bVar.l(), jD);
        if (jD == n0.n.f332724b.a() || n0.n.v(jD)) {
            bVar.g(fVar, jO, f10, r());
            return;
        }
        float f11 = 2;
        float fT = (n0.n.t(jD) - n0.n.t(jO)) / f11;
        float fM = (n0.n.m(jD) - n0.n.m(jO)) / f11;
        fVar.Z3().i().i(fT, fM, fT, fM);
        bVar.g(fVar, jO, f10, r());
        androidx.compose.ui.graphics.drawscope.j jVarI = fVar.Z3().i();
        float f12 = -fT;
        float f13 = -fM;
        jVarI.i(f12, f13, f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final r0 r() {
        return (r0) this.f87001t.getValue();
    }

    private final int s() {
        return this.f86997m.m1();
    }

    private final float t() {
        return this.f87000s.V0();
    }

    private final void u(r0 r0Var) {
        this.f87001t.setValue(r0Var);
    }

    private final void v(int i10) {
        this.f86997m.j(i10);
    }

    private final void w(float f10) {
        this.f87000s.q(f10);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        w(f10);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        u(r0Var);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return p();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        if (this.f86999o) {
            q(fVar, this.f86992h, t());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f86998n == -1) {
            this.f86998n = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f86998n) / this.f86994j;
        float fH = kotlin.ranges.r.H(f10, 0.0f, 1.0f) * t();
        float fT = this.f86995k ? t() - fH : t();
        this.f86999o = f10 >= 1.0f;
        q(fVar, this.f86991g, fT);
        q(fVar, this.f86992h, fH);
        if (this.f86999o) {
            this.f86991g = null;
        } else {
            v(s() + 1);
        }
    }
}
