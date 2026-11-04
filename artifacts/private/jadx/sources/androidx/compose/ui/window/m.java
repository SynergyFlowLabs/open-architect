package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.i0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.p0;
import androidx.compose.ui.d0;
import androidx.compose.ui.platform.t4;
import androidx.compose.ui.unit.w;
import androidx.core.view.k2;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,705:1\n113#2:706\n1#3:707\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n466#1:706\n*E\n"})
final class m extends androidx.activity.t implements t4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f42950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private k f42951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final View f42952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f42953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f42954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42955i;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends l0 implements Function1<i0, Unit> {
        b() {
            super(1);
        }

        public final void c(i0 i0Var) {
            if (m.this.f42951e.b()) {
                m.this.f42950d.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i0 i0Var) {
            c(i0Var);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42957a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42957a = iArr;
        }
    }

    public m(@NotNull Function0<Unit> function0, @NotNull k kVar, @NotNull View view, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), kVar.a() ? d0.d.f37169a : d0.d.f37170b), 0, 2, null);
        this.f42950d = function0;
        this.f42951e = kVar;
        this.f42952f = view;
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f42954h = fR;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        k2.c(window, this.f42951e.a());
        window.setGravity(17);
        if (!this.f42951e.a()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT;
            d.f42924a.a(attributes);
            if (i10 >= 30) {
                e eVar = e.f42925a;
                eVar.a(attributes, 0);
                eVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        j jVar = new j(getContext(), window);
        setTitle(this.f42951e.f());
        jVar.setTag(d0.b.H, "Dialog:" + uuid);
        jVar.setClipChildren(false);
        jVar.setElevation(dVar.S7(fR));
        jVar.setOutlineProvider(new a());
        this.f42953g = jVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(jVar);
        n2.b(jVar, n2.a(view));
        p2.b(jVar, p2.a(view));
        androidx.savedstate.r.b(jVar, androidx.savedstate.r.a(view));
        o(this.f42950d, this.f42951e, wVar);
        androidx.activity.l0.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof j) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    private final void m(w wVar) {
        j jVar = this.f42953g;
        int i10 = c.f42957a[wVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new k0();
        }
        jVar.setLayoutDirection(i11);
    }

    private final void n(u uVar) {
        boolean zA = v.a(uVar, androidx.compose.ui.window.c.m(this.f42952f));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this.f42953g;
    }

    public final void k() {
        this.f42953g.disposeComposition();
    }

    public final void l(@NotNull p0 p0Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        this.f42953g.l(p0Var, function2);
    }

    public final void o(@NotNull Function0<Unit> function0, @NotNull k kVar, @NotNull w wVar) {
        int i10;
        this.f42950d = function0;
        this.f42951e = kVar;
        n(kVar.d());
        m(wVar);
        boolean zA = kVar.a();
        this.f42953g.m(kVar.e(), zA);
        setCanceledOnTouchOutside(kVar.c());
        Window window = getWindow();
        if (window != null) {
            if (zA) {
                i10 = 0;
            } else {
                i10 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @NotNull KeyEvent keyEvent) {
        if (!this.f42951e.b() || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f42950d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f42951e.c() || this.f42953g.k(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.f42955i = false;
                return zOnTouchEvent;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f42955i = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f42955i = false;
                    return zOnTouchEvent;
                }
            } else if (this.f42955i) {
                this.f42950d.invoke();
                this.f42955i = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }
}
