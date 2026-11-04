package androidx.compose.material3.internal;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.material3.ps;
import androidx.compose.material3.rl;
import androidx.compose.ui.platform.t4;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n113#2:344\n1#3:345\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/DialogWrapper\n*L\n170#1:344\n*E\n"})
final class z1 extends androidx.activity.t implements t4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f29256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.window.k f29257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final View f29258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final y1 f29259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f29260h;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29261a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29261a = iArr;
        }
    }

    public z1(@NotNull Function0<Unit> function0, @NotNull androidx.compose.ui.window.k kVar, @NotNull View view, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull UUID uuid, boolean z10, boolean z11) {
        super(new ContextThemeWrapper(view.getContext(), ps.c.f31867b), 0, 2, null);
        this.f29256d = function0;
        this.f29257e = kVar;
        this.f29258f = view;
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f29260h = fR;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        androidx.core.view.k2.c(window, false);
        y1 y1Var = new y1(getContext(), window);
        y1Var.setTag(androidx.compose.ui.d0.b.H, "Dialog:" + uuid);
        y1Var.setClipChildren(false);
        y1Var.setElevation(dVar.S7(fR));
        y1Var.setOutlineProvider(new a());
        this.f29259g = y1Var;
        setContentView(y1Var);
        androidx.lifecycle.n2.b(y1Var, androidx.lifecycle.n2.a(view));
        androidx.lifecycle.p2.b(y1Var, androidx.lifecycle.p2.a(view));
        androidx.savedstate.r.b(y1Var, androidx.savedstate.r.a(view));
        l(this.f29256d, this.f29257e, wVar, z10, z11);
    }

    private final void j(androidx.compose.ui.unit.w wVar) {
        y1 y1Var = this.f29259g;
        int i10 = b.f29261a[wVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new kotlin.k0();
        }
        y1Var.setLayoutDirection(i11);
    }

    private final void k(androidx.compose.ui.window.u uVar) {
        boolean zP = v0.p(uVar, rl.p(this.f29258f));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setFlags(zP ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this.f29259g;
    }

    public final void h() {
        this.f29259g.disposeComposition();
    }

    public final void i(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f29259g.k(p0Var, function2);
    }

    public final void l(@NotNull Function0<Unit> function0, @NotNull androidx.compose.ui.window.k kVar, @NotNull androidx.compose.ui.unit.w wVar, boolean z10, boolean z11) {
        this.f29256d = function0;
        this.f29257e = kVar;
        k(kVar.d());
        j(wVar);
        Window window = getWindow();
        if (window != null) {
            androidx.core.view.v3 v3VarA = androidx.core.view.k2.a(window, window.getDecorView());
            v3VarA.i(z10);
            v3VarA.h(z11);
            window.setLayout(-1, -1);
            window.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @NotNull KeyEvent keyEvent) {
        if (!this.f29257e.b() || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f29256d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f29256d.invoke();
        }
        return zOnTouchEvent;
    }
}
