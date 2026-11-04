package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.e3;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.s0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(29)
@SourceDebugExtension({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,298:1\n1#2:299\n278#3:300\n65#4:301\n69#4:304\n60#5:302\n70#5:305\n85#5:308\n90#5:310\n22#6:303\n22#6:306\n54#7:307\n59#7:309\n41#8,5:311\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n86#1:300\n89#1:301\n90#1:304\n89#1:302\n90#1:305\n222#1:308\n222#1:310\n89#1:303\n90#1:306\n222#1:307\n222#1:309\n243#1:311,5\n*E\n"})
public final class g implements d {
    private boolean A;

    @Nullable
    private e3 B;
    private int C;
    private boolean D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f37942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f37943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final RenderNode f37944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Paint f37946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Matrix f37947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private r0 f37951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f37953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f37954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f37955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f37956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f37957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f37958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f37959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f37960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f37961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f37962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f37963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f37964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37965z;

    public g(long j10, @NotNull l0 l0Var, @NotNull androidx.compose.ui.graphics.drawscope.a aVar) {
        this.f37941b = j10;
        this.f37942c = l0Var;
        this.f37943d = aVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f37944e = renderNode;
        this.f37945f = n0.n.f332724b.c();
        renderNode.setClipToBounds(false);
        b.a aVar2 = b.f37875b;
        R(renderNode, aVar2.a());
        this.f37949j = 1.0f;
        this.f37950k = d0.f37693b.B();
        this.f37952m = n0.g.f332700b.c();
        this.f37953n = 1.0f;
        this.f37954o = 1.0f;
        q0.a aVar3 = q0.f38131b;
        this.f37958s = aVar3.a();
        this.f37959t = aVar3.a();
        this.f37963x = 8.0f;
        this.C = aVar2.a();
        this.D = true;
    }

    private final void P() {
        boolean z10 = false;
        boolean z11 = b() && !this.f37948i;
        if (b() && this.f37948i) {
            z10 = true;
        }
        if (z11 != this.f37965z) {
            this.f37965z = z11;
            this.f37944e.setClipToBounds(z11);
        }
        if (z10 != this.A) {
            this.A = z10;
            this.f37944e.setClipToOutline(z10);
        }
    }

    private final void R(RenderNode renderNode, int i10) {
        b.a aVar = b.f37875b;
        if (b.g(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, this.f37946g);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.g(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, this.f37946g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f37946g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint S() {
        Paint paint = this.f37946g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f37946g = paint2;
        return paint2;
    }

    private final boolean T() {
        return b.g(G(), b.f37875b.c()) || U() || g() != null;
    }

    private final boolean U() {
        if (d0.G(t(), d0.f37693b.B()) && e() == null) {
            return false;
        }
        return true;
    }

    private final void V() {
        if (T()) {
            R(this.f37944e, b.f37875b.c());
        } else {
            R(this.f37944e, G());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void A(@Nullable e3 e3Var) {
        this.B = e3Var;
        if (Build.VERSION.SDK_INT >= 31) {
            u.f38011a.a(this.f37944e, e3Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float B() {
        return this.f37953n;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void C(float f10) {
        this.f37954o = f10;
        this.f37944e.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float D() {
        return this.f37960u;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void E(float f10) {
        this.f37955p = f10;
        this.f37944e.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float F() {
        return this.f37954o;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int G() {
        return this.C;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void H(int i10, int i11, long j10) {
        this.f37944e.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (k0.f265952a & j10)) + i11);
        this.f37945f = androidx.compose.ui.unit.v.h(j10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long I() {
        return this.f37952m;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void J(boolean z10) {
        this.D = z10;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long K() {
        return this.f37941b;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long L() {
        return this.f37959t;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void M(long j10) {
        this.f37952m = j10;
        if ((9223372034707292159L & j10) == n0.d.f332689d) {
            this.f37944e.resetPivot();
        } else {
            this.f37944e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f37944e.setPivotY(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void N(int i10) {
        this.C = i10;
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void O(boolean z10) {
        this.f37964y = z10;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void Q(float f10) {
        this.f37957r = f10;
        this.f37944e.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean a() {
        return this.f37944e.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float a0() {
        return this.f37957r;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean b() {
        return this.f37964y;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void c() {
        this.f37944e.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public boolean d() {
        return this.D;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public r0 e() {
        return this.f37951l;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void f(@Nullable r0 r0Var) {
        this.f37951l = r0Var;
        S().setColorFilter(r0Var != null ? androidx.compose.ui.graphics.d.e(r0Var) : null);
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long f0() {
        return this.f37958s;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @Nullable
    public e3 g() {
        return this.B;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public long getLayerId() {
        return this.f37944e.getUniqueId();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h(float f10) {
        this.f37956q = f10;
        this.f37944e.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void h0(long j10) {
        this.f37958s = j10;
        this.f37944e.setAmbientShadowColor(s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float i() {
        return this.f37963x;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j(float f10) {
        this.f37963x = f10;
        this.f37944e.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void j0(long j10) {
        this.f37959t = j10;
        this.f37944e.setSpotShadowColor(s0.t(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void k(float f10) {
        this.f37960u = f10;
        this.f37944e.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void l(float f10) {
        this.f37961v = f10;
        this.f37944e.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void m(float f10) {
        this.f37962w = f10;
        this.f37944e.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    @NotNull
    public Matrix n() {
        Matrix matrix = this.f37947h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f37947h = matrix;
        }
        this.f37944e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float o() {
        return this.f37956q;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float p() {
        return this.f37955p;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float q() {
        return this.f37961v;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float r() {
        return this.f37949j;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void s(int i10) {
        this.f37950k = i10;
        S().setBlendMode(androidx.compose.ui.graphics.a.b(i10));
        V();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void setAlpha(float f10) {
        this.f37949j = f10;
        this.f37944e.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public int t() {
        return this.f37950k;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public float v() {
        return this.f37962w;
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void w(@Nullable Outline outline, long j10) {
        this.f37944e.setOutline(outline);
        this.f37948i = outline != null;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void x(@NotNull androidx.compose.ui.graphics.k0 k0Var) {
        androidx.compose.ui.graphics.c.d(k0Var).drawRenderNode(this.f37944e);
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void y(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull c cVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.f37944e.beginRecording();
        try {
            l0 l0Var = this.f37942c;
            Canvas canvasS = l0Var.b().S();
            l0Var.b().U(recordingCanvasBeginRecording);
            androidx.compose.ui.graphics.b bVarB = l0Var.b();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = this.f37943d.Z3();
            dVarZ3.e(dVar);
            dVarZ3.b(wVar);
            dVarZ3.j(cVar);
            dVarZ3.g(this.f37945f);
            dVarZ3.k(bVarB);
            function1.invoke(this.f37943d);
            l0Var.b().U(canvasS);
            this.f37944e.endRecording();
            J(false);
        } catch (Throwable th2) {
            this.f37944e.endRecording();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.d
    public void z(float f10) {
        this.f37953n = f10;
        this.f37944e.setScaleX(f10);
    }

    public /* synthetic */ g(long j10, l0 l0Var, androidx.compose.ui.graphics.drawscope.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new l0() : l0Var, (i10 & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
