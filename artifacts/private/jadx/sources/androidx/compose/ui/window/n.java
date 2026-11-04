package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.l1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.snapshots.q0;
import androidx.compose.runtime.w6;
import androidx.compose.ui.d0;
import androidx.compose.ui.h0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.platform.t4;
import androidx.compose.ui.unit.w;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@e.a({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,955:1\n113#2:956\n1#3:957\n85#4:958\n117#4,2:959\n85#4:961\n117#4,2:962\n85#4:964\n85#4:965\n117#4,2:966\n65#5:968\n69#5:975\n60#6:969\n70#6:976\n80#6:978\n80#6:980\n85#6:982\n90#6:984\n22#7,5:970\n32#8:977\n30#9:979\n54#10:981\n59#10:983\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n502#1:956\n491#1:958\n491#1:959,2\n492#1:961\n492#1:962,2\n496#1:964\n556#1:965\n556#1:966,2\n729#1:968\n729#1:975\n729#1:969\n729#1:976\n729#1:978\n744#1:980\n763#1:982\n763#1:984\n729#1:970,5\n729#1:977\n744#1:979\n763#1:981\n763#1:983\n*E\n"})
public final class n extends androidx.compose.ui.platform.a implements t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f42960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private t f42961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f42962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final View f42963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p f42964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final WindowManager f42965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final WindowManager.LayoutParams f42966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private s f42967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private w f42968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n3 f42969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n3 f42970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.s f42971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final n7 f42972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f42973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Rect f42974o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final int[] f42975p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final q0 f42976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Object f42977t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final n3 f42978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f42979w;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final c f42958p1 = new c(null);
    public static final int H1 = 8;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final Function1<n, Unit> f42959p2 = b.f42980a;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends l0 implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42980a = new b();

        b() {
            super(1);
        }

        public final void c(n nVar) {
            if (nVar.isAttachedToWindow()) {
                nVar.v();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42982b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(2);
            this.f42982b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            n.this.Content(c0Var, androidx.compose.runtime.t4.a(this.f42982b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42983a;

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
            f42983a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout$canCalculatePosition$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,955:1\n1#2:956\n*E\n"})
    static final class f extends l0 implements Function0<Boolean> {
        f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            g0 parentLayoutCoordinates = n.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.I()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || n.this.m4getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    static final class g extends l0 implements Function1<Function0<? extends Unit>, Unit> {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Function0 function0) {
            function0.invoke();
        }

        public final void d(final Function0<Unit> function0) {
            Handler handler = n.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = n.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.g.f(function0);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            d(function0);
            return Unit.f312394a;
        }
    }

    static final class h extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.g f42986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f42987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.s f42988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f42989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f42990e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i1.g gVar, n nVar, androidx.compose.ui.unit.s sVar, long j10, long j11) {
            super(0);
            this.f42986a = gVar;
            this.f42987b = nVar;
            this.f42988c = sVar;
            this.f42989d = j10;
            this.f42990e = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42986a.f312750a = this.f42987b.getPositionProvider().a(this.f42988c, this.f42989d, this.f42987b.getParentLayoutDirection(), this.f42990e);
        }
    }

    public /* synthetic */ n(Function0 function0, t tVar, String str, View view, androidx.compose.ui.unit.d dVar, s sVar, UUID uuid, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, tVar, str, view, dVar, sVar, uuid, (i10 & 128) != 0 ? new q() : pVar);
    }

    private final Function2<c0, Integer, Unit> getContent() {
        return (Function2) this.f42978v.getValue();
    }

    @l1
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g0 getParentLayoutCoordinates() {
        return (g0) this.f42970k.getValue();
    }

    private final androidx.compose.ui.unit.s getVisibleDisplayBounds() {
        Rect rect = this.f42974o;
        this.f42964e.c(this.f42963d, rect);
        return androidx.compose.ui.window.c.p(rect);
    }

    private final WindowManager.LayoutParams j() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.c.k(this.f42961b, androidx.compose.ui.window.c.m(this.f42963d));
        layoutParams.type = 1002;
        layoutParams.token = this.f42963d.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f42963d.getContext().getResources().getString(d0.c.f37153e));
        return layoutParams;
    }

    private final void l() {
        if (!this.f42961b.b() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f42977t == null) {
            this.f42977t = androidx.compose.ui.window.g.b(this.f42960a);
        }
        androidx.compose.ui.window.g.d(this, this.f42977t);
    }

    private final void m() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.g.e(this, this.f42977t);
        }
        this.f42977t = null;
    }

    private final void q(w wVar) {
        int i10 = e.f42983a[wVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new k0();
        }
        super.setLayoutDirection(i11);
    }

    private final void setContent(Function2<? super c0, ? super Integer, Unit> function2) {
        this.f42978v.setValue(function2);
    }

    private final void setParentLayoutCoordinates(g0 g0Var) {
        this.f42970k.setValue(g0Var);
    }

    private final void u(t tVar) {
        if (Intrinsics.areEqual(this.f42961b, tVar)) {
            return;
        }
        if (tVar.i() && !this.f42961b.i()) {
            WindowManager.LayoutParams layoutParams = this.f42966g;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.f42961b = tVar;
        this.f42966g.flags = androidx.compose.ui.window.c.k(tVar, androidx.compose.ui.window.c.m(this.f42963d));
        this.f42964e.a(this.f42965f, this, this.f42966g);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    @h0
    public void Content(@Nullable c0 c0Var, int i10) {
        int i11;
        c0 c0VarR = c0Var.R(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        if (!this.f42961b.b()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0<Unit> function0 = this.f42960a;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f42972m.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f42966g;
    }

    @NotNull
    public final w getParentLayoutDirection() {
        return this.f42968i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.u m4getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.u) this.f42969j.getValue();
    }

    @NotNull
    public final s getPositionProvider() {
        return this.f42967h;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f42979w;
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f42962c;
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (!this.f42961b.i() && (childAt = getChildAt(0)) != null) {
            this.f42966g.width = childAt.getMeasuredWidth();
            this.f42966g.height = childAt.getMeasuredHeight();
            this.f42964e.a(this.f42965f, this, this.f42966g);
        }
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.f42961b.i()) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            androidx.compose.ui.unit.s visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.G(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.r(), Integer.MIN_VALUE));
        }
    }

    public final void k() {
        n2.b(this, null);
        this.f42965f.removeViewImmediate(this);
    }

    public final void n() {
        int[] iArr = this.f42975p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f42963d.getLocationOnScreen(iArr);
        int[] iArr2 = this.f42975p0;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        s();
    }

    public final void o(@NotNull p0 p0Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f42979w = true;
    }

    @Override // androidx.compose.ui.platform.a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42976s.t();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42976s.u();
        this.f42976s.f();
        m();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f42961b.c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0<Unit> function0 = this.f42960a;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0<Unit> function1 = this.f42960a;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    public final void p() {
        this.f42965f.addView(this, this.f42966g);
    }

    public final void r(@Nullable Function0<Unit> function0, @NotNull t tVar, @NotNull String str, @NotNull w wVar) {
        this.f42960a = function0;
        this.f42962c = str;
        u(tVar);
        q(wVar);
    }

    @l1
    public final void s() {
        g0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.I()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jG = androidx.compose.ui.layout.h0.g(parentLayoutCoordinates);
            androidx.compose.ui.unit.s sVarB = androidx.compose.ui.unit.t.b(androidx.compose.ui.unit.q.f((((long) Math.round(Float.intBitsToFloat((int) (jG >> 32)))) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Math.round(Float.intBitsToFloat((int) (jG & com.rabbitmq.client.k0.f265952a)))))), jA);
            if (Intrinsics.areEqual(sVarB, this.f42971l)) {
                return;
            }
            this.f42971l = sVarB;
            v();
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(@NotNull w wVar) {
        this.f42968i = wVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5setPopupContentSizefhxjrPA(@Nullable androidx.compose.ui.unit.u uVar) {
        this.f42969j.setValue(uVar);
    }

    public final void setPositionProvider(@NotNull s sVar) {
        this.f42967h = sVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.f42962c = str;
    }

    public final void t(@NotNull g0 g0Var) {
        setParentLayoutCoordinates(g0Var);
        s();
    }

    public final void v() {
        androidx.compose.ui.unit.u uVarM4getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.s sVar = this.f42971l;
        if (sVar != null && (uVarM4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) != null) {
            long jQ = uVarM4getPopupContentSizebOM6tXw.q();
            androidx.compose.ui.unit.s visibleDisplayBounds = getVisibleDisplayBounds();
            long jE = androidx.compose.ui.unit.u.e((((long) visibleDisplayBounds.G()) << 32) | (((long) visibleDisplayBounds.r()) & com.rabbitmq.client.k0.f265952a));
            i1.g gVar = new i1.g();
            gVar.f312750a = androidx.compose.ui.unit.q.f42709b.b();
            this.f42976s.m(this, f42959p2, new h(gVar, this, sVar, jE, jQ));
            this.f42966g.x = androidx.compose.ui.unit.q.n(gVar.f312750a);
            this.f42966g.y = androidx.compose.ui.unit.q.p(gVar.f312750a);
            if (this.f42961b.d()) {
                this.f42964e.b(this, (int) (jE >> 32), (int) (jE & com.rabbitmq.client.k0.f265952a));
            }
            this.f42964e.a(this.f42965f, this, this.f42966g);
        }
    }

    public n(@Nullable Function0<Unit> function0, @NotNull t tVar, @NotNull String str, @NotNull View view, @NotNull androidx.compose.ui.unit.d dVar, @NotNull s sVar, @NotNull UUID uuid, @NotNull p pVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f42960a = function0;
        this.f42961b = tVar;
        this.f42962c = str;
        this.f42963d = view;
        this.f42964e = pVar;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f42965f = (WindowManager) systemService;
        this.f42966g = j();
        this.f42967h = sVar;
        this.f42968i = w.Ltr;
        this.f42969j = d7.g(null, null, 2, null);
        this.f42970k = d7.g(null, null, 2, null);
        this.f42972m = w6.e(new f());
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f42973n = fR;
        this.f42974o = new Rect();
        this.f42976s = new q0(new g());
        setId(R.id.content);
        n2.b(this, n2.a(view));
        p2.b(this, p2.a(view));
        androidx.savedstate.r.b(this, androidx.savedstate.r.a(view));
        setTag(d0.b.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.S7(fR));
        setOutlineProvider(new a());
        this.f42978v = d7.g(i.f42931a.a(), null, 2, null);
        this.f42975p0 = new int[2];
    }
}
