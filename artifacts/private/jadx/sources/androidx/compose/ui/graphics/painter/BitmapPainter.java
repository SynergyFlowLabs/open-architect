package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.unit.v;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,155:1\n30#2:156\n30#2:172\n80#3:157\n60#3:159\n70#3:166\n80#3:173\n85#3:175\n90#3:177\n85#3:179\n90#3:181\n57#4:158\n61#4:165\n22#5,5:160\n22#5,5:167\n54#6:174\n59#6:176\n54#6:178\n59#6:180\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n70#1:156\n94#1:172\n70#1:157\n95#1:159\n96#1:166\n94#1:173\n123#1:175\n124#1:177\n125#1:179\n126#1:181\n95#1:158\n96#1:165\n95#1:160,5\n96#1:167,5\n123#1:174\n124#1:176\n125#1:178\n126#1:180\n*E\n"})
public final class BitmapPainter extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final t1 f38103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f38104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f38105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f38107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f38108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private r0 f38109m;

    public /* synthetic */ BitmapPainter(t1 t1Var, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(t1Var, j10, j11);
    }

    private final long q(long j10, long j11) {
        int i10;
        int i11;
        if (q.n(j10) < 0 || q.p(j10) < 0 || (i10 = (int) (j11 >> 32)) < 0 || (i11 = (int) (k0.f265952a & j11)) < 0 || i10 > this.f38103g.getWidth() || i11 > this.f38103g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j11;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38108l = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38109m = r0Var;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.areEqual(this.f38103g, bitmapPainter.f38103g) && q.k(this.f38104h, bitmapPainter.f38104h) && u.h(this.f38105i, bitmapPainter.f38105i) && l1.h(this.f38106j, bitmapPainter.f38106j);
    }

    public int hashCode() {
        return (((((this.f38103g.hashCode() * 31) + q.q(this.f38104h)) * 31) + u.n(this.f38105i)) * 31) + l1.j(this.f38106j);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return v.h(this.f38107k);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull f fVar) {
        t1 t1Var = this.f38103g;
        long j10 = this.f38104h;
        long j11 = this.f38105i;
        int iRound = Math.round(Float.intBitsToFloat((int) (fVar.d() >> 32)));
        long j12 = ((long) iRound) << 32;
        f.z0(fVar, t1Var, j10, j11, 0L, u.e((((long) Math.round(Float.intBitsToFloat((int) (fVar.d() & k0.f265952a)))) & k0.f265952a) | j12), this.f38108l, null, this.f38109m, 0, this.f38106j, 328, null);
    }

    public final int o() {
        return this.f38106j;
    }

    public final void p(int i10) {
        this.f38106j = i10;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.f38103g + ", srcOffset=" + ((Object) q.v(this.f38104h)) + ", srcSize=" + ((Object) u.p(this.f38105i)) + ", filterQuality=" + ((Object) l1.k(this.f38106j)) + ')';
    }

    public /* synthetic */ BitmapPainter(t1 t1Var, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t1Var, (i10 & 2) != 0 ? q.f42709b.b() : j10, (i10 & 4) != 0 ? u.e((((long) t1Var.getHeight()) & k0.f265952a) | (((long) t1Var.getWidth()) << 32)) : j11, null);
    }

    private BitmapPainter(t1 t1Var, long j10, long j11) {
        this.f38103g = t1Var;
        this.f38104h = j10;
        this.f38105i = j11;
        this.f38106j = l1.f37840b.b();
        this.f38107k = q(j10, j11);
        this.f38108l = 1.0f;
    }
}
