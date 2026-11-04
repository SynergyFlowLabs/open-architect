package androidx.compose.material.internal;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.w6;
import androidx.compose.ui.d0;
import androidx.compose.ui.platform.t4;
import androidx.compose.ui.unit.w;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import com.rabbitmq.client.k0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.a({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,459:1\n113#2:460\n1#3:461\n85#4:462\n117#4,2:463\n85#4:465\n117#4,2:466\n85#4:468\n85#4:469\n117#4,2:470\n30#5:472\n80#6:473\n53#6,3:475\n60#6:479\n60#6:482\n70#6:485\n70#6:488\n30#7:474\n65#8:478\n65#8:481\n69#8:484\n69#8:487\n22#9:480\n22#9:483\n22#9:486\n22#9:489\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n237#1:460\n229#1:462\n229#1:463,2\n230#1:465\n230#1:466,2\n233#1:468\n288#1:469\n288#1:470,2\n344#1:472\n344#1:473\n392#1:475,3\n250#1:479\n251#1:482\n252#1:485\n253#1:488\n392#1:474\n250#1:478\n251#1:481\n252#1:484\n253#1:487\n250#1:480\n251#1:483\n252#1:486\n253#1:489\n*E\n"})
final class u extends androidx.compose.ui.platform.a implements t4, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f23226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final WindowManager f23229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final WindowManager.LayoutParams f23230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.window.s f23231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private w f23232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f23233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n3 f23234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n7 f23235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f23236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Rect f23237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Rect f23238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function2<n0.g, androidx.compose.ui.unit.s, Boolean> f23239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final n3 f23240o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23241s;

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
        public static final /* synthetic */ int[] f23242a;

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
            f23242a = iArr;
        }
    }

    public u(@Nullable Function0<Unit> function0, @NotNull String str, @NotNull View view, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.window.s sVar, @NotNull UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.f23226a = function0;
        this.f23227b = str;
        this.f23228c = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f23229d = (WindowManager) systemService;
        this.f23230e = n();
        this.f23231f = sVar;
        this.f23232g = w.Ltr;
        int i10 = 6 << 0;
        this.f23233h = d7.g(null, null, 2, null);
        this.f23234i = d7.g(null, null, 2, null);
        this.f23235j = w6.e(new Function0() { // from class: androidx.compose.material.internal.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(u.m(this.f23225a));
            }
        });
        float fR = androidx.compose.ui.unit.h.r(8);
        this.f23236k = fR;
        this.f23237l = new Rect();
        this.f23238m = new Rect();
        this.f23239n = new Function2() { // from class: androidx.compose.material.internal.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(u.p((n0.g) obj, (androidx.compose.ui.unit.s) obj2));
            }
        };
        setId(R.id.content);
        n2.b(this, n2.a(view));
        p2.b(this, p2.a(view));
        androidx.savedstate.r.b(this, androidx.savedstate.r.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(d0.b.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.S7(fR));
        setOutlineProvider(new a());
        this.f23240o = d7.g(androidx.compose.material.internal.a.f23185a.a(), null, 2, null);
    }

    private final Function2<c0, Integer, Unit> getContent() {
        return (Function2) this.f23240o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(u uVar, int i10, c0 c0Var, int i11) {
        uVar.Content(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(u uVar) {
        return (uVar.q() == null || uVar.m1getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final WindowManager.LayoutParams n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.f23228c.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f23228c.getContext().getResources().getString(d0.c.f37153e));
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(n0.g gVar, androidx.compose.ui.unit.s sVar) {
        if (gVar == null) {
            return false;
        }
        return Float.intBitsToFloat((int) (gVar.B() >> 32)) < ((float) sVar.t()) || Float.intBitsToFloat((int) (gVar.B() >> 32)) > ((float) sVar.x()) || Float.intBitsToFloat((int) (gVar.B() & k0.f265952a)) < ((float) sVar.B()) || Float.intBitsToFloat((int) (gVar.B() & k0.f265952a)) > ((float) sVar.j());
    }

    private final void setContent(Function2<? super c0, ? super Integer, Unit> function2) {
        this.f23240o.setValue(function2);
    }

    private final void u(w wVar) {
        int i10 = b.f23242a[wVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new kotlin.k0();
        }
        super.setLayoutDirection(i11);
    }

    private final androidx.compose.ui.unit.s v(Rect rect) {
        return new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable c0 c0Var, final int i10) {
        int i11;
        c0 c0VarR = c0Var.R(-864350873);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-864350873, i11, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:303)");
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material.internal.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.l(this.f23223a, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
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
                Function0<Unit> function0 = this.f23226a;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f23235j.getValue()).booleanValue();
    }

    @NotNull
    public final w getParentLayoutDirection() {
        return this.f23232g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.u m1getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.u) this.f23234i.getValue();
    }

    @NotNull
    public final androidx.compose.ui.window.s getPositionProvider() {
        return this.f23231f;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f23241s;
    }

    @Override // androidx.compose.ui.platform.t4
    @NotNull
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f23227b;
    }

    public final void o() {
        n2.b(this, null);
        this.f23228c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f23229d.removeViewImmediate(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f23228c.getWindowVisibleDisplayFrame(this.f23238m);
        if (Intrinsics.areEqual(this.f23238m, this.f23237l)) {
            return;
        }
        x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r2.invoke(r1, r0).booleanValue() != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r12) {
        /*
            r11 = this;
            r10 = 0
            if (r12 != 0) goto L8
            boolean r11 = super.onTouchEvent(r12)
            return r11
        L8:
            int r0 = r12.getAction()
            r1 = 0
            if (r0 != 0) goto L3f
            r10 = 7
            float r0 = r12.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
            float r0 = r12.getX()
            int r2 = r11.getWidth()
            r10 = 0
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L47
            float r0 = r12.getY()
            r10 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r10 = 7
            if (r0 < 0) goto L47
            r10 = 7
            float r0 = r12.getY()
            r10 = 5
            int r2 = r11.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L47
        L3f:
            r10 = 4
            int r0 = r12.getAction()
            r2 = 4
            if (r0 != r2) goto La9
        L47:
            androidx.compose.ui.unit.s r0 = r11.q()
            r10 = 6
            if (r0 == 0) goto L9d
            kotlin.jvm.functions.Function2<n0.g, androidx.compose.ui.unit.s, java.lang.Boolean> r2 = r11.f23239n
            float r3 = r12.getRawX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5a
            r10 = 0
            goto L64
        L5a:
            float r3 = r12.getRawY()
            r10 = 4
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r10 = 6
            if (r1 != 0) goto L66
        L64:
            r1 = 0
            goto L8f
        L66:
            float r1 = r12.getRawX()
            float r3 = r12.getRawY()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r10 = 3
            long r4 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            r10 = 1
            long r6 = (long) r1
            r1 = 32
            long r3 = r4 << r1
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r8
            long r3 = r3 | r5
            r10 = 2
            long r3 = n0.g.g(r3)
            n0.g r1 = n0.g.d(r3)
        L8f:
            java.lang.Object r0 = r2.invoke(r1, r0)
            r10 = 5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10 = 6
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La9
        L9d:
            r10 = 0
            kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r11.f23226a
            if (r11 == 0) goto La5
            r11.invoke()
        La5:
            r11 = 0
            r11 = 1
            r10 = 1
            return r11
        La9:
            r10 = 1
            boolean r11 = super.onTouchEvent(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.u.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final androidx.compose.ui.unit.s q() {
        return (androidx.compose.ui.unit.s) this.f23233h.getValue();
    }

    public final void r(@NotNull p0 p0Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f23241s = true;
    }

    public final void s(@Nullable androidx.compose.ui.unit.s sVar) {
        this.f23233h.setValue(sVar);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(@NotNull w wVar) {
        this.f23232g = wVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m2setPopupContentSizefhxjrPA(@Nullable androidx.compose.ui.unit.u uVar) {
        this.f23234i.setValue(uVar);
    }

    public final void setPositionProvider(@NotNull androidx.compose.ui.window.s sVar) {
        this.f23231f = sVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.f23227b = str;
    }

    public final void t() {
        this.f23229d.addView(this, this.f23230e);
    }

    public final void w(@Nullable Function0<Unit> function0, @NotNull String str, @NotNull w wVar) {
        this.f23226a = function0;
        this.f23227b = str;
        u(wVar);
    }

    public final void x() {
        androidx.compose.ui.unit.u uVarM1getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.s sVarQ = q();
        if (sVarQ == null || (uVarM1getPopupContentSizebOM6tXw = m1getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long jQ = uVarM1getPopupContentSizebOM6tXw.q();
        Rect rect = this.f23237l;
        this.f23228c.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.unit.s sVarV = v(rect);
        long jA = this.f23231f.a(sVarQ, androidx.compose.ui.unit.u.e((((long) sVarV.G()) << 32) | (((long) sVarV.r()) & k0.f265952a)), this.f23232g, jQ);
        this.f23230e.x = androidx.compose.ui.unit.q.n(jA);
        this.f23230e.y = androidx.compose.ui.unit.q.p(jA);
        this.f23229d.updateViewLayout(this, this.f23230e);
    }
}
