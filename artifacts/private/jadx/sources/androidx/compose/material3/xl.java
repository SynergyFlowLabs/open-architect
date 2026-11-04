package androidx.compose.material3;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWideNavigationRail.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/ModalWideNavigationRailDialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n113#2:488\n1#3:489\n*S KotlinDebug\n*F\n+ 1 WideNavigationRail.android.kt\nandroidx/compose/material3/ModalWideNavigationRailDialogWrapper\n*L\n343#1:488\n*E\n"})
final class xl extends androidx.activity.t implements androidx.compose.ui.platform.t4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f34538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private am f34539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final View f34540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final vl f34541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f34542h;

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
        public static final /* synthetic */ int[] f34543a;

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
            f34543a = iArr;
        }
    }

    public xl(@NotNull Function0<Unit> function0, @NotNull am amVar, @NotNull View view, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull UUID uuid, @NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Unit> function2, @NotNull vs vsVar, boolean z10) {
        super(new ContextThemeWrapper(view.getContext(), ps.c.f31867b), 0, 2, null);
        this.f34538d = function0;
        this.f34539e = amVar;
        this.f34540f = view;
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f34542h = fR;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        androidx.core.view.k2.c(window, false);
        vl vlVar = new vl(getContext(), window, this.f34539e.b(), this.f34538d, function1, function2, vsVar, wVar);
        vlVar.setTag(androidx.compose.ui.d0.b.H, "Dialog:" + uuid);
        vlVar.setClipChildren(false);
        vlVar.setElevation(dVar.S7(fR));
        vlVar.setOutlineProvider(new a());
        this.f34541g = vlVar;
        setContentView(vlVar);
        androidx.lifecycle.n2.b(vlVar, androidx.lifecycle.n2.a(view));
        androidx.lifecycle.p2.b(vlVar, androidx.lifecycle.p2.a(view));
        androidx.savedstate.r.b(vlVar, androidx.savedstate.r.a(view));
        n(this.f34538d, this.f34539e, wVar);
        androidx.core.view.v3 v3VarA = androidx.core.view.k2.a(window, window.getDecorView());
        v3VarA.i(!z10);
        v3VarA.h(!z10);
        androidx.activity.l0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: androidx.compose.material3.wl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xl.i(this.f34259a, (androidx.activity.i0) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(xl xlVar, androidx.activity.i0 i0Var) {
        if (xlVar.f34539e.b()) {
            xlVar.f34538d.invoke();
        }
        return Unit.f312394a;
    }

    private final void l(androidx.compose.ui.unit.w wVar) {
        vl vlVar = this.f34541g;
        int i10 = b.f34543a[wVar.ordinal()];
        int i11 = 1;
        int i12 = 4 << 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new kotlin.k0();
        }
        vlVar.setLayoutDirection(i11);
    }

    private final void m(androidx.compose.ui.window.u uVar) {
        boolean zP = androidx.compose.material3.internal.v0.p(uVar, rl.p(this.f34540f));
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
        return this.f34541g;
    }

    public final void j() {
        this.f34541g.disposeComposition();
    }

    public final void k(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f34541g.n(p0Var, function2);
    }

    public final void n(@NotNull Function0<Unit> function0, @NotNull am amVar, @NotNull androidx.compose.ui.unit.w wVar) {
        this.f34538d = function0;
        this.f34539e = amVar;
        m(amVar.a());
        l(wVar);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f34538d.invoke();
        }
        return zOnTouchEvent;
    }
}
