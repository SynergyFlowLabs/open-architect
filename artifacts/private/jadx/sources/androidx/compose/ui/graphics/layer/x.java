package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.l0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n41#2,3:584\n44#2,2:617\n33#3:587\n53#4,3:588\n305#5,26:591\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n*L\n122#1:584,3\n122#1:617,2\n127#1:587\n127#1:588,3\n123#1:591,26\n*E\n"})
public final class x extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f38017k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final ViewOutlineProvider f38018l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f38019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0 f38020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f38021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Outline f38023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f38025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.w f38026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> f38027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private c f38028j;

    @SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer$Companion$LayerOutlineProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,583:1\n1#2:584\n*E\n"})
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if ((view instanceof x) && (outline2 = ((x) view).f38023e) != null) {
                outline.set(outline2);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewOutlineProvider a() {
            return x.f38018l;
        }

        private b() {
        }
    }

    public /* synthetic */ x(View view, l0 l0Var, androidx.compose.ui.graphics.drawscope.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i10 & 2) != 0 ? new l0() : l0Var, (i10 & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }

    public final boolean c() {
        return this.f38022d;
    }

    public final void d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @Nullable c cVar, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        this.f38025g = dVar;
        this.f38026h = wVar;
        this.f38027i = function1;
        this.f38028j = cVar;
    }

    @Override // android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        l0 l0Var = this.f38020b;
        Canvas canvasS = l0Var.b().S();
        l0Var.b().U(canvas);
        androidx.compose.ui.graphics.b bVarB = l0Var.b();
        androidx.compose.ui.graphics.drawscope.a aVar = this.f38021c;
        androidx.compose.ui.unit.d dVar = this.f38025g;
        androidx.compose.ui.unit.w wVar = this.f38026h;
        float width = getWidth();
        long jF = n0.n.f((((long) Float.floatToRawIntBits(getHeight())) & k0.f265952a) | (Float.floatToRawIntBits(width) << 32));
        c cVar = this.f38028j;
        Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1 = this.f38027i;
        androidx.compose.ui.unit.d density = aVar.Z3().getDensity();
        androidx.compose.ui.unit.w layoutDirection = aVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = aVar.Z3().f();
        long jD = aVar.Z3().d();
        c cVarH = aVar.Z3().h();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = aVar.Z3();
        dVarZ3.e(dVar);
        dVarZ3.b(wVar);
        dVarZ3.k(bVarB);
        dVarZ3.g(jF);
        dVarZ3.j(cVar);
        bVarB.save();
        try {
            function1.invoke(aVar);
            bVarB.B();
            androidx.compose.ui.graphics.drawscope.d dVarZ4 = aVar.Z3();
            dVarZ4.e(density);
            dVarZ4.b(layoutDirection);
            dVarZ4.k(k0VarF);
            dVarZ4.g(jD);
            dVarZ4.j(cVarH);
            l0Var.b().U(canvasS);
            this.f38022d = false;
        } catch (Throwable th2) {
            bVarB.B();
            androidx.compose.ui.graphics.drawscope.d dVarZ5 = aVar.Z3();
            dVarZ5.e(density);
            dVarZ5.b(layoutDirection);
            dVarZ5.k(k0VarF);
            dVarZ5.g(jD);
            dVarZ5.j(cVarH);
            throw th2;
        }
    }

    public final boolean e(@Nullable Outline outline) {
        this.f38023e = outline;
        return n.f38004a.a(this);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f38024f;
    }

    @NotNull
    public final l0 getCanvasHolder() {
        return this.f38020b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.f38019a;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f38024f;
    }

    @Override // android.view.View
    public void invalidate() {
        if (!this.f38022d) {
            this.f38022d = true;
            super.invalidate();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f38024f != z10) {
            this.f38024f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f38022d = z10;
    }

    public x(@NotNull View view, @NotNull l0 l0Var, @NotNull androidx.compose.ui.graphics.drawscope.a aVar) {
        super(view.getContext());
        this.f38019a = view;
        this.f38020b = l0Var;
        this.f38021c = aVar;
        setOutlineProvider(f38018l);
        this.f38024f = true;
        this.f38025g = androidx.compose.ui.graphics.drawscope.e.a();
        this.f38026h = androidx.compose.ui.unit.w.Ltr;
        this.f38027i = d.f37911a.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }
}
