package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"PrivateConstructorForUtilityClass"})
public class u1 {

    @Deprecated
    public static final int A = 16777216;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 16;
    public static final int L = 32;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static WeakHashMap<View, f2> Q = null;
    private static Method R = null;
    private static Field S = null;
    private static boolean T = false;
    private static ThreadLocal<Rect> U = null;
    private static final int[] V = {i1.a.e.f286771b, i1.a.e.f286773c, i1.a.e.f286795n, i1.a.e.f286815y, i1.a.e.B, i1.a.e.C, i1.a.e.D, i1.a.e.E, i1.a.e.F, i1.a.e.G, i1.a.e.f286775d, i1.a.e.f286777e, i1.a.e.f286779f, i1.a.e.f286781g, i1.a.e.f286783h, i1.a.e.f286785i, i1.a.e.f286787j, i1.a.e.f286789k, i1.a.e.f286791l, i1.a.e.f286793m, i1.a.e.f286797o, i1.a.e.f286799p, i1.a.e.f286801q, i1.a.e.f286803r, i1.a.e.f286805s, i1.a.e.f286807t, i1.a.e.f286809u, i1.a.e.f286811v, i1.a.e.f286813w, i1.a.e.f286814x, i1.a.e.f286816z, i1.a.e.A};
    private static final d1 W = new d1() { // from class: androidx.core.view.t1
        @Override // androidx.core.view.d1
        public final e a(e eVar) {
            return u1.a(eVar);
        }
    };
    private static final e X = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48949a = "ViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f48950b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f48951c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f48952d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48953e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48954f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48955g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48956h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48957i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f48958j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f48959k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f48960l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f48961m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f48962n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48963o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48964p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f48965q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f48966r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f48967s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f48968t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f48969u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f48970v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f48971w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f48972x = 16777215;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f48973y = -16777216;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f48974z = 16;

    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(@NonNull View view) {
            return Boolean.valueOf(l.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(@NonNull View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        @androidx.annotation.w0(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.u1.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f48975a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                u1.g1(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f48975a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f48975a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f48977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f48979d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f48978c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t10);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t10 = (T) view.getTag(this.f48976a);
            if (this.f48977b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                u1.C(view);
                view.setTag(this.f48976a, t10);
                u1.g1(view, this.f48979d);
            }
        }

        boolean g(T t10, T t11) {
            return !t11.equals(t10);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f48976a = i10;
            this.f48977b = cls;
            this.f48979d = i11;
            this.f48978c = i12;
        }
    }

    @androidx.annotation.w0(20)
    static class g {
        private g() {
        }

        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @androidx.annotation.w0(21)
    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            g3 f48980a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f48981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1 f48982c;

            a(View view, b1 b1Var) {
                this.f48981b = view;
                this.f48982c = b1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                g3 g3VarL = g3.L(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f48981b);
                    if (g3VarL.equals(this.f48980a)) {
                        return this.f48982c.b(view, g3VarL).J();
                    }
                }
                this.f48980a = g3VarL;
                g3 g3VarB = this.f48982c.b(view, g3VarL);
                if (i10 >= 30) {
                    return g3VarB.J();
                }
                u1.A1(view);
                return g3VarB.J();
            }
        }

        private h() {
        }

        static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(i1.a.e.f286804r0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static g3 b(@NonNull View view, @NonNull g3 g3Var, @NonNull Rect rect) {
            WindowInsets windowInsetsJ = g3Var.J();
            if (windowInsetsJ != null) {
                return g3.L(view.computeSystemWindowInsets(windowInsetsJ, rect), view);
            }
            rect.setEmpty();
            return g3Var;
        }

        static boolean c(@NonNull View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(@NonNull View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        @androidx.annotation.p0
        public static g3 j(@NonNull View view) {
            return g3.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(@NonNull View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(@NonNull View view, @androidx.annotation.p0 b1 b1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(i1.a.e.f286788j0, b1Var);
            }
            if (b1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(i1.a.e.f286804r0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, b1Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(@NonNull View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @androidx.annotation.w0(23)
    private static class i {
        private i() {
        }

        @androidx.annotation.p0
        public static g3 a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            g3 g3VarK = g3.K(rootWindowInsets);
            g3VarK.H(g3VarK);
            g3VarK.d(view.getRootView());
            return g3VarK;
        }

        static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        static void c(@NonNull View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(@NonNull View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    @androidx.annotation.w0(24)
    static class j {
        private j() {
        }

        static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(@NonNull View view, @androidx.annotation.p0 ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.p0 Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @androidx.annotation.w0(26)
    static class k {
        private k() {
        }

        static void a(@NonNull View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(@NonNull View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(@NonNull View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(@NonNull View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @androidx.annotation.w0(28)
    static class l {
        private l() {
        }

        static void a(@NonNull View view, @NonNull final u uVar) {
            androidx.collection.h3 h3Var = (androidx.collection.h3) view.getTag(i1.a.e.f286802q0);
            if (h3Var == null) {
                h3Var = new androidx.collection.h3();
                view.setTag(i1.a.e.f286802q0, h3Var);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.v1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return uVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            h3Var.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(@NonNull View view, @NonNull u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.h3 h3Var = (androidx.collection.h3) view.getTag(i1.a.e.f286802q0);
            if (h3Var != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) h3Var.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, p1.a aVar) {
            view.setAutofillId(aVar == null ? null : aVar.a());
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    @androidx.annotation.w0(29)
    private static class m {
        private m() {
        }

        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @androidx.annotation.p0 AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, androidx.core.view.contentcapture.a aVar) {
            view.setContentCaptureSession(aVar == null ? null : aVar.f());
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @androidx.annotation.w0(30)
    private static class n {
        private n() {
        }

        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @androidx.annotation.p0
        public static v3 c(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return v3.l(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @androidx.annotation.w0(31)
    private static final class o {
        private o() {
        }

        @androidx.annotation.p0
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @androidx.annotation.p0
        public static androidx.core.view.e b(@NonNull View view, @NonNull androidx.core.view.e eVar) {
            ContentInfo contentInfoL = eVar.l();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoL ? eVar : androidx.core.view.e.m(contentInfoPerformReceiveContent);
        }

        public static void c(@NonNull View view, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 c1 c1Var) {
            if (c1Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(c1Var));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface q {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface r {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    @androidx.annotation.w0(31)
    private static final class t implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final c1 f48983a;

        t(@NonNull c1 c1Var) {
            this.f48983a = c1Var;
        }

        @androidx.annotation.p0
        public ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            androidx.core.view.e eVarM = androidx.core.view.e.m(contentInfo);
            androidx.core.view.e eVarA = this.f48983a.a(view, eVarM);
            if (eVarA == null) {
                return null;
            }
            return eVarA == eVarM ? contentInfo : eVarA.l();
        }
    }

    public interface u {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface w {
    }

    static class x {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f48984d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private WeakHashMap<View, Boolean> f48985a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f48986b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f48987c = null;

        x() {
        }

        static x a(View view) {
            x xVar = (x) view.getTag(i1.a.e.f286800p0);
            if (xVar != null) {
                return xVar;
            }
            x xVar2 = new x();
            view.setTag(i1.a.e.f286800p0, xVar2);
            return xVar2;
        }

        @androidx.annotation.p0
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f48985a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f48986b == null) {
                this.f48986b = new SparseArray<>();
            }
            return this.f48986b;
        }

        private boolean e(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(i1.a.e.f286802q0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f48985a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f48984d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f48985a == null) {
                        this.f48985a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f48984d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f48985a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f48985a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f48984d;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    f48984d.add(new WeakReference<>(view));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        static void i(View view) {
            synchronized (f48984d) {
                int i10 = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f48984d;
                        if (i10 >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i10).get() == view) {
                            arrayList.remove(i10);
                            return;
                        }
                        i10++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f48987c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f48987c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    protected u1() {
    }

    @androidx.annotation.k1
    static boolean A(View view, KeyEvent keyEvent) {
        return false;
    }

    @androidx.annotation.p0
    public static String A0(@NonNull View view) {
        return h.k(view);
    }

    public static void A1(@NonNull View view) {
        g.c(view);
    }

    public static void A2(@NonNull View view, @NonNull List<Rect> list) {
        m.f(view, list);
    }

    public static void B(@NonNull View view) {
        C(view);
    }

    @androidx.annotation.v0(expression = "view.getTranslationX()")
    @Deprecated
    public static float B0(View view) {
        return view.getTranslationX();
    }

    @NonNull
    public static <T extends View> T B1(@NonNull View view, @androidx.annotation.d0 int i10) {
        return (T) l.f(view, i10);
    }

    public static void B2(@NonNull View view, @androidx.annotation.p0 CharSequence charSequence) {
        k.p(view, charSequence);
    }

    static void C(@NonNull View view) {
        androidx.core.view.a aVarE = E(view);
        if (aVarE == null) {
            aVarE = new androidx.core.view.a();
        }
        G1(view, aVarE);
    }

    @androidx.annotation.v0(expression = "view.getTranslationY()")
    @Deprecated
    public static float C0(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static int C1(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static void C2(@NonNull View view, @androidx.annotation.p0 String str) {
        h.v(view, str);
    }

    @Deprecated
    public static int D() {
        return View.generateViewId();
    }

    public static float D0(@NonNull View view) {
        return h.l(view);
    }

    public static boolean D1(@NonNull View view) {
        return k.j(view);
    }

    @androidx.annotation.v0(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void D2(View view, float f10) {
        view.setTranslationX(f10);
    }

    @androidx.annotation.p0
    public static androidx.core.view.a E(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateF = F(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof androidx.core.view.a.C0409a ? ((androidx.core.view.a.C0409a) accessibilityDelegateF).f48449a : new androidx.core.view.a(accessibilityDelegateF);
    }

    @androidx.annotation.p0
    @Deprecated
    public static v3 E0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return k2.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void E1(@NonNull View view, @NonNull @e.a({"ContextFirst"}) Context context, @NonNull int[] iArr, @androidx.annotation.p0 AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
        m.d(view, context, iArr, attributeSet, typedArray, i10, i11);
    }

    @androidx.annotation.v0(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void E2(View view, float f10) {
        view.setTranslationY(f10);
    }

    @androidx.annotation.p0
    private static View.AccessibilityDelegate F(@NonNull View view) {
        return m.a(view);
    }

    @androidx.annotation.v0(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int F0(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    private static f<Boolean> F1() {
        return new a(i1.a.e.f286794m0, Boolean.class, 28);
    }

    public static void F2(@NonNull View view, float f10) {
        h.w(view, f10);
    }

    @androidx.annotation.p0
    private static View.AccessibilityDelegate G(@NonNull View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    @androidx.annotation.v0(expression = "view.getX()")
    @Deprecated
    public static float G0(View view) {
        return view.getX();
    }

    public static void G1(@NonNull View view, @androidx.annotation.p0 androidx.core.view.a aVar) {
        if (aVar == null && (F(view) instanceof androidx.core.view.a.C0409a)) {
            aVar = new androidx.core.view.a();
        }
        Z1(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static void G2(@NonNull View view, @androidx.annotation.p0 l2.b bVar) {
        l2.h(view, bVar);
    }

    @androidx.annotation.v0(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int H(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @androidx.annotation.v0(expression = "view.getY()")
    @Deprecated
    public static float H0(View view) {
        return view.getY();
    }

    @androidx.annotation.k1
    public static void H1(@NonNull View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    @androidx.annotation.v0(expression = "view.setX(value)")
    @Deprecated
    public static void H2(View view, float f10) {
        view.setX(f10);
    }

    @androidx.annotation.p0
    public static androidx.core.view.accessibility.k I(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.k(accessibilityNodeProvider);
        }
        return null;
    }

    public static float I0(@NonNull View view) {
        return h.m(view);
    }

    @androidx.annotation.v0(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void I1(@NonNull View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    @androidx.annotation.v0(expression = "view.setY(value)")
    @Deprecated
    public static void I2(View view, float f10) {
        view.setY(f10);
    }

    @androidx.annotation.k1
    @androidx.annotation.p0
    public static CharSequence J(@NonNull View view) {
        return n1().e(view);
    }

    public static boolean J0(@NonNull View view) {
        return F(view) != null;
    }

    @androidx.annotation.k1
    public static void J1(@NonNull View view, @androidx.annotation.p0 CharSequence charSequence) {
        n1().f(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    public static void J2(@NonNull View view, float f10) {
        h.x(view, f10);
    }

    private static List<androidx.core.view.accessibility.j.a> K(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(i1.a.e.f286780f0);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i1.a.e.f286780f0, arrayList2);
        return arrayList2;
    }

    public static boolean K0(@NonNull View view) {
        return k.e(view);
    }

    @androidx.annotation.v0(expression = "view.setActivated(activated)")
    @Deprecated
    public static void K1(View view, boolean z10) {
        view.setActivated(z10);
    }

    public static boolean K2(@NonNull View view, @androidx.annotation.p0 ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.p0 Object obj, int i10) {
        return j.e(view, clipData, dragShadowBuilder, obj, i10);
    }

    @androidx.annotation.v0(expression = "view.getAlpha()")
    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@NonNull View view) {
        return h.n(view);
    }

    @androidx.annotation.v0(expression = "view.setAlpha(value)")
    @Deprecated
    public static void L1(View view, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        view.setAlpha(f10);
    }

    public static boolean L2(@NonNull View view, int i10) {
        return h.y(view, i10);
    }

    @androidx.annotation.p0
    public static p1.a M(@NonNull View view) {
        return p1.a.b(k.b(view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M0(@NonNull View view, int i10) {
        if (view instanceof t0) {
            ((t0) view).e(i10);
        } else if (i10 == 0) {
            return L0(view);
        }
        return false;
    }

    public static void M1(@NonNull View view, @androidx.annotation.p0 String... strArr) {
        k.k(view, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M2(@NonNull View view, int i10, int i11) {
        if (view instanceof t0) {
            return ((t0) view).f(i10, i11);
        }
        if (i11 == 0) {
            return L2(view, i10);
        }
        return false;
    }

    private static int N(View view, @NonNull CharSequence charSequence) {
        List<androidx.core.view.accessibility.j.a> listK = K(view);
        for (int i10 = 0; i10 < listK.size(); i10++) {
            if (TextUtils.equals(charSequence, listK.get(i10).c())) {
                return listK.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = V;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listK.size(); i14++) {
                z10 &= listK.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @androidx.annotation.v0(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean N0(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    public static void N1(@NonNull View view, @androidx.annotation.p0 p1.a aVar) {
        l.i(view, aVar);
    }

    private static f<CharSequence> N2() {
        return new c(i1.a.e.f286796n0, CharSequence.class, 64, 30);
    }

    @androidx.annotation.p0
    public static ColorStateList O(@NonNull View view) {
        return h.g(view);
    }

    @androidx.annotation.v0(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean O0(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @androidx.annotation.v0(expression = "view.setBackground(background)")
    @Deprecated
    public static void O1(@NonNull View view, @androidx.annotation.p0 Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void O2(@NonNull View view) {
        h.z(view);
    }

    @androidx.annotation.p0
    public static PorterDuff.Mode P(@NonNull View view) {
        return h.h(view);
    }

    @androidx.annotation.v0(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean P0(@NonNull View view) {
        return view.hasTransientState();
    }

    public static void P1(@NonNull View view, @androidx.annotation.p0 ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P2(@NonNull View view, int i10) {
        if (view instanceof t0) {
            ((t0) view).c(i10);
        } else {
            if (i10 == 0) {
                O2(view);
            }
        }
    }

    @androidx.annotation.v0(expression = "view.getClipBounds()")
    @androidx.annotation.p0
    @Deprecated
    public static Rect Q(@NonNull View view) {
        return view.getClipBounds();
    }

    @androidx.annotation.k1
    public static boolean Q0(@NonNull View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static void Q1(@NonNull View view, @androidx.annotation.p0 PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    private static void Q2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @androidx.annotation.p0
    public static androidx.core.view.contentcapture.a R(@NonNull View view) {
        ContentCaptureSession contentCaptureSessionB = m.b(view);
        if (contentCaptureSessionB == null) {
            return null;
        }
        return androidx.core.view.contentcapture.a.g(contentCaptureSessionB, view);
    }

    @androidx.annotation.v0(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean R0(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @e.a({"BanUncheckedReflection"})
    @Deprecated
    public static void R1(ViewGroup viewGroup, boolean z10) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void R2(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        j.f(view, dragShadowBuilder);
    }

    @androidx.annotation.v0(expression = "view.getDisplay()")
    @androidx.annotation.p0
    @Deprecated
    public static Display S(@NonNull View view) {
        return view.getDisplay();
    }

    public static boolean S0(@NonNull View view) {
        return k.f(view);
    }

    @androidx.annotation.v0(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void S1(@NonNull View view, @androidx.annotation.p0 Rect rect) {
        view.setClipBounds(rect);
    }

    public static float T(@NonNull View view) {
        return h.i(view);
    }

    public static boolean T0(@NonNull View view) {
        return h.o(view);
    }

    public static void T1(@NonNull View view, @androidx.annotation.p0 androidx.core.view.contentcapture.a aVar) {
        m.e(view, aVar);
    }

    private static Rect U() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean U0(@NonNull View view) {
        return k.g(view);
    }

    public static void U1(@NonNull View view, float f10) {
        h.s(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d1 V(@NonNull View view) {
        return view instanceof d1 ? (d1) view : W;
    }

    public static boolean V0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.d(view);
        }
        return false;
    }

    @androidx.annotation.v0(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void V1(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @androidx.annotation.v0(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean W(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    @androidx.annotation.v0(expression = "view.isInLayout()")
    @Deprecated
    public static boolean W0(@NonNull View view) {
        return view.isInLayout();
    }

    public static void W1(@NonNull View view, boolean z10) {
        k.l(view, z10);
    }

    @androidx.annotation.v0(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int X(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean X0(@NonNull View view) {
        return k.h(view);
    }

    @androidx.annotation.v0(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void X1(@NonNull View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    @e.a({"InlinedApi"})
    public static int Y(@NonNull View view) {
        return k.c(view);
    }

    @androidx.annotation.v0(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean Y0(@NonNull View view) {
        return view.isLaidOut();
    }

    @androidx.annotation.k1
    @androidx.annotation.v0(expression = "view.setImportantForAccessibility(mode)")
    @Deprecated
    public static void Y1(@NonNull View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static int Z(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.a(view);
        }
        return 0;
    }

    @androidx.annotation.v0(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean Z0(@NonNull View view) {
        return view.isLayoutDirectionResolved();
    }

    private static void Z1(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ androidx.core.view.e a(androidx.core.view.e eVar) {
        return eVar;
    }

    @androidx.annotation.v0(expression = "view.getLabelFor()")
    @Deprecated
    public static int a0(@NonNull View view) {
        return view.getLabelFor();
    }

    public static boolean a1(@NonNull View view) {
        return h.p(view);
    }

    public static void a2(@NonNull View view, int i10) {
        k.m(view, i10);
    }

    private static f<Boolean> b() {
        return new d(i1.a.e.f286784h0, Boolean.class, 28);
    }

    @androidx.annotation.v0(expression = "view.getLayerType()")
    @Deprecated
    public static int b0(View view) {
        return view.getLayerType();
    }

    @androidx.annotation.v0(expression = "view.isOpaque()")
    @Deprecated
    public static boolean b1(View view) {
        return view.isOpaque();
    }

    public static void b2(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            n.e(view, i10);
        }
    }

    public static int c(@NonNull View view, @NonNull CharSequence charSequence, @NonNull androidx.core.view.accessibility.m mVar) {
        int iN = N(view, charSequence);
        if (iN != -1) {
            d(view, new androidx.core.view.accessibility.j.a(iN, charSequence, mVar));
        }
        return iN;
    }

    @androidx.annotation.v0(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int c0(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @androidx.annotation.v0(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean c1(@NonNull View view) {
        return view.isPaddingRelative();
    }

    public static void c2(@NonNull View view, boolean z10) {
        k.n(view, z10);
    }

    private static void d(@NonNull View view, @NonNull androidx.core.view.accessibility.j.a aVar) {
        C(view);
        x1(aVar.b(), view);
        K(view).add(aVar);
        g1(view, 0);
    }

    @androidx.annotation.v0(expression = "view.getMatrix()")
    @androidx.annotation.p0
    @Deprecated
    public static Matrix d0(View view) {
        return view.getMatrix();
    }

    @androidx.annotation.k1
    public static boolean d1(@NonNull View view) {
        Boolean boolE = F1().e(view);
        if (boolE == null || !boolE.booleanValue()) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    @androidx.annotation.v0(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void d2(@NonNull View view, @androidx.annotation.d0 int i10) {
        view.setLabelFor(i10);
    }

    public static void e(@NonNull View view, @NonNull Collection<View> collection, int i10) {
        k.a(view, collection, i10);
    }

    @androidx.annotation.v0(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int e0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.v0(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void e1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @androidx.annotation.v0(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void e2(@NonNull View view, @androidx.annotation.p0 Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void f(@NonNull View view, @NonNull u uVar) {
        l.a(view, uVar);
    }

    @androidx.annotation.v0(expression = "view.getMeasuredState()")
    @Deprecated
    public static int f0(View view) {
        return view.getMeasuredState();
    }

    @androidx.annotation.p0
    public static View f1(@NonNull View view, @androidx.annotation.p0 View view2, int i10) {
        return k.i(view, view2, i10);
    }

    @androidx.annotation.v0(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void f2(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    @NonNull
    @Deprecated
    public static f2 g(@NonNull View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        f2 f2Var = Q.get(view);
        if (f2Var != null) {
            return f2Var;
        }
        f2 f2Var2 = new f2(view);
        Q.put(view, f2Var2);
        return f2Var2;
    }

    @androidx.annotation.v0(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int g0(View view) {
        return view.getMeasuredWidthAndState();
    }

    static void g1(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                accessibilityEventObtain.setEventType(i11);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(J(view));
                    Z1(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(J(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @androidx.annotation.v0(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void g2(@NonNull View view, int i10) {
        view.setLayoutDirection(i10);
    }

    private static void h() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException unused) {
        }
        O = true;
    }

    @androidx.annotation.v0(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int h0(@NonNull View view) {
        return view.getMinimumHeight();
    }

    public static void h1(@NonNull View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void h2(@NonNull View view, boolean z10) {
        h.t(view, z10);
    }

    @androidx.annotation.v0(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean i(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @androidx.annotation.v0(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int i0(@NonNull View view) {
        return view.getMinimumWidth();
    }

    public static void i1(@NonNull View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static void i2(@NonNull View view, int i10) {
        k.o(view, i10);
    }

    @androidx.annotation.v0(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean j(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static int j0(@NonNull View view) {
        return k.d(view);
    }

    @NonNull
    public static g3 j1(@NonNull View view, @NonNull g3 g3Var) {
        WindowInsets windowInsetsJ = g3Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsJ);
            if (!windowInsetsB.equals(windowInsetsJ)) {
                return g3.L(windowInsetsB, view);
            }
        }
        return g3Var;
    }

    public static void j2(@NonNull View view, @androidx.annotation.p0 b1 b1Var) {
        h.u(view, b1Var);
    }

    public static void k(@NonNull View view) {
        j.a(view);
    }

    @androidx.annotation.p0
    public static String[] k0(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(i1.a.e.f286792l0);
    }

    @androidx.annotation.v0(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void k1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void k2(@NonNull View view, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 c1 c1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            o.c(view, strArr, c1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (c1Var != null) {
            androidx.core.util.t.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (str.startsWith("*")) {
                    z10 = true;
                    break;
                }
            }
            androidx.core.util.t.b(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(i1.a.e.f286792l0, strArr);
        view.setTag(i1.a.e.f286790k0, c1Var);
    }

    @Deprecated
    public static int l(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    @androidx.annotation.v0(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int l0(View view) {
        return view.getOverScrollMode();
    }

    @androidx.annotation.v0(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void l1(@NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
        view.onInitializeAccessibilityNodeInfo(jVar.q2());
    }

    @androidx.annotation.v0(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void l2(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    private static void m(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            Q2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                Q2((View) parent);
            }
        }
    }

    @androidx.annotation.v0(expression = "view.getPaddingEnd()")
    @androidx.annotation.t0
    @Deprecated
    public static int m0(@NonNull View view) {
        return view.getPaddingEnd();
    }

    @androidx.annotation.v0(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void m1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @androidx.annotation.v0(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void m2(@NonNull View view, @androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @androidx.annotation.t0 int i12, @androidx.annotation.t0 int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    private static void n(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            Q2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                Q2((View) parent);
            }
        }
    }

    @androidx.annotation.v0(expression = "view.getPaddingStart()")
    @androidx.annotation.t0
    @Deprecated
    public static int n0(@NonNull View view) {
        return view.getPaddingStart();
    }

    private static f<CharSequence> n1() {
        return new b(i1.a.e.f286786i0, CharSequence.class, 8, 28);
    }

    @androidx.annotation.v0(expression = "view.setPivotX(value)")
    @Deprecated
    public static void n2(View view, float f10) {
        view.setPivotX(f10);
    }

    @NonNull
    public static g3 o(@NonNull View view, @NonNull g3 g3Var, @NonNull Rect rect) {
        return h.b(view, g3Var, rect);
    }

    @androidx.annotation.v0(expression = "view.getParentForAccessibility()")
    @androidx.annotation.p0
    @Deprecated
    public static ViewParent o0(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    @androidx.annotation.v0(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean o1(@NonNull View view, int i10, @androidx.annotation.p0 Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    @androidx.annotation.v0(expression = "view.setPivotY(value)")
    @Deprecated
    public static void o2(View view, float f10) {
        view.setPivotY(f10);
    }

    @NonNull
    public static g3 p(@NonNull View view, @NonNull g3 g3Var) {
        WindowInsets windowInsetsJ = g3Var.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsJ);
            if (!windowInsetsA.equals(windowInsetsJ)) {
                return g3.L(windowInsetsA, view);
            }
        }
        return g3Var;
    }

    @androidx.annotation.v0(expression = "view.getPivotX()")
    @Deprecated
    public static float p0(View view) {
        return view.getPivotX();
    }

    public static boolean p1(@NonNull View view, int i10) {
        int iA = e0.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    public static void p2(@NonNull View view, @androidx.annotation.p0 f1 f1Var) {
        j.d(view, (PointerIcon) (f1Var != null ? f1Var.b() : null));
    }

    public static void q(@NonNull View view) {
        j.b(view);
    }

    @androidx.annotation.v0(expression = "view.getPivotY()")
    @Deprecated
    public static float q0(View view) {
        return view.getPivotY();
    }

    public static boolean q1(@NonNull View view, int i10, int i11) {
        int iA = e0.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA, i11);
    }

    @androidx.annotation.v0(expression = "view.setRotation(value)")
    @Deprecated
    public static void q2(View view, float f10) {
        view.setRotation(f10);
    }

    public static boolean r(@NonNull View view, float f10, float f11, boolean z10) {
        return h.c(view, f10, f11, z10);
    }

    @androidx.annotation.p0
    public static g3 r0(@NonNull View view) {
        return i.a(view);
    }

    @androidx.annotation.p0
    public static androidx.core.view.e r1(@NonNull View view, @NonNull androidx.core.view.e eVar) {
        if (Log.isLoggable(f48949a, 3)) {
            Objects.toString(eVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, eVar);
        }
        c1 c1Var = (c1) view.getTag(i1.a.e.f286790k0);
        if (c1Var == null) {
            return V(view).a(eVar);
        }
        androidx.core.view.e eVarA = c1Var.a(view, eVar);
        if (eVarA == null) {
            return null;
        }
        return V(view).a(eVarA);
    }

    @androidx.annotation.v0(expression = "view.setRotationX(value)")
    @Deprecated
    public static void r2(View view, float f10) {
        view.setRotationX(f10);
    }

    public static boolean s(@NonNull View view, float f10, float f11) {
        return h.d(view, f10, f11);
    }

    @androidx.annotation.v0(expression = "view.getRotation()")
    @Deprecated
    public static float s0(View view) {
        return view.getRotation();
    }

    @androidx.annotation.v0(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void s1(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    @androidx.annotation.v0(expression = "view.setRotationY(value)")
    @Deprecated
    public static void s2(View view, float f10) {
        view.setRotationY(f10);
    }

    public static boolean t(@NonNull View view, int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2) {
        return h.e(view, i10, i11, iArr, iArr2);
    }

    @androidx.annotation.v0(expression = "view.getRotationX()")
    @Deprecated
    public static float t0(View view) {
        return view.getRotationX();
    }

    @androidx.annotation.v0(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void t1(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.postInvalidateOnAnimation(i10, i11, i12, i13);
    }

    @androidx.annotation.v0(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void t2(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@NonNull View view, int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2, int i12) {
        if (view instanceof t0) {
            return ((t0) view).b(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return t(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    @androidx.annotation.v0(expression = "view.getRotationY()")
    @Deprecated
    public static float u0(View view) {
        return view.getRotationY();
    }

    @androidx.annotation.v0(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void u1(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @androidx.annotation.v0(expression = "view.setScaleX(value)")
    @Deprecated
    public static void u2(View view, float f10) {
        view.setScaleX(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@NonNull View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14, @NonNull int[] iArr2) {
        if (view instanceof u0) {
            ((u0) view).d(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            x(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    @androidx.annotation.v0(expression = "view.getScaleX()")
    @Deprecated
    public static float v0(View view) {
        return view.getScaleX();
    }

    @androidx.annotation.v0(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @e.a({"LambdaLast"})
    @Deprecated
    public static void v1(@NonNull View view, @NonNull Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    @androidx.annotation.v0(expression = "view.setScaleY(value)")
    @Deprecated
    public static void v2(View view, float f10) {
        view.setScaleY(f10);
    }

    public static boolean w(@NonNull View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr) {
        return h.f(view, i10, i11, i12, i13, iArr);
    }

    @androidx.annotation.v0(expression = "view.getScaleY()")
    @Deprecated
    public static float w0(View view) {
        return view.getScaleY();
    }

    public static void w1(@NonNull View view, int i10) {
        x1(i10, view);
        g1(view, 0);
    }

    @androidx.annotation.k1
    public static void w2(@NonNull View view, boolean z10) {
        F1().f(view, Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@NonNull View view, int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14) {
        if (view instanceof t0) {
            return ((t0) view).g(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return w(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }

    public static int x0(@NonNull View view) {
        return i.b(view);
    }

    private static void x1(int i10, View view) {
        List<androidx.core.view.accessibility.j.a> listK = K(view);
        for (int i11 = 0; i11 < listK.size(); i11++) {
            if (listK.get(i11).b() == i10) {
                listK.remove(i11);
                return;
            }
        }
    }

    public static void x2(@NonNull View view, int i10) {
        i.c(view, i10);
    }

    public static void y(@NonNull View view) {
        j.c(view);
    }

    @androidx.annotation.k1
    @androidx.annotation.p0
    public static CharSequence y0(@NonNull View view) {
        return N2().e(view);
    }

    public static void y1(@NonNull View view, @NonNull u uVar) {
        l.e(view, uVar);
    }

    public static void y2(@NonNull View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    @androidx.annotation.k1
    static boolean z(View view, KeyEvent keyEvent) {
        return false;
    }

    @NonNull
    public static List<Rect> z0(@NonNull View view) {
        return m.c(view);
    }

    public static void z1(@NonNull View view, @NonNull androidx.core.view.accessibility.j.a aVar, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 androidx.core.view.accessibility.m mVar) {
        if (mVar == null && charSequence == null) {
            w1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, mVar));
        }
    }

    @androidx.annotation.k1
    public static void z2(@NonNull View view, @androidx.annotation.p0 CharSequence charSequence) {
        N2().f(view, charSequence);
    }
}
