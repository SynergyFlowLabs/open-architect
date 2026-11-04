package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,582:1\n1107#2:583\n1085#2,2:584\n643#3,2:586\n424#3,8:589\n1#4:588\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n116#1:583\n116#1:584,2\n257#1:586,2\n334#1:589,8\n*E\n"})
public final class c1 implements q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f41825o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f41826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f41827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f41828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Function1<? super List<? extends j>, Unit> f41830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Function1<? super t, Unit> f41831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private y0 f41832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private u f41833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private List<WeakReference<r0>> f41834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f41835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Rect f41836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.f f41837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a> f41838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Runnable f41839n;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f41845f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f41845f;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41846a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41846a = iArr;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(c1.this.r(), false);
        }
    }

    public static final class d implements v {
        d() {
        }

        @Override // androidx.compose.ui.text.input.v
        public void a(int i10) {
            c1.this.f41831f.invoke(t.j(i10));
        }

        @Override // androidx.compose.ui.text.input.v
        public void b(List<? extends j> list) {
            c1.this.f41830e.invoke(list);
        }

        @Override // androidx.compose.ui.text.input.v
        public void c(KeyEvent keyEvent) {
            c1.this.p().sendKeyEvent(keyEvent);
        }

        @Override // androidx.compose.ui.text.input.v
        public void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            c1.this.f41837l.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // androidx.compose.ui.text.input.v
        public void e(r0 r0Var) {
            int size = c1.this.f41834i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(((WeakReference) c1.this.f41834i.get(i10)).get(), r0Var)) {
                    c1.this.f41834i.remove(i10);
                    return;
                }
            }
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<List<? extends j>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f41849a = new e();

        e() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends j> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends j> list) {
            invoke2(list);
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<t, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f41850a = new f();

        f() {
            super(1);
        }

        public final void c(int i10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
            c(tVar.p());
            return Unit.f312394a;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<List<? extends j>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f41851a = new g();

        g() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends j> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends j> list) {
            invoke2(list);
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<t, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f41852a = new h();

        h() {
            super(1);
        }

        public final void c(int i10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
            c(tVar.p());
            return Unit.f312394a;
        }
    }

    public c1(@NotNull View view, @NotNull androidx.compose.ui.input.pointer.j jVar, @NotNull x xVar, @NotNull Executor executor) {
        this.f41826a = view;
        this.f41827b = xVar;
        this.f41828c = executor;
        this.f41830e = e.f41849a;
        this.f41831f = f.f41850a;
        boolean z10 = false & false;
        this.f41832g = new y0("", w3.f42333b.a(), (w3) null, 4, (DefaultConstructorMarker) null);
        this.f41833h = u.f41958h.a();
        this.f41834i = new ArrayList();
        this.f41835j = kotlin.g0.b(kotlin.j0.NONE, new c());
        this.f41837l = new androidx.compose.ui.text.input.f(jVar, xVar);
        this.f41838m = new androidx.compose.runtime.collection.d<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f41835j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t() {
        View viewFindFocus;
        if (!this.f41826a.isFocused() && (viewFindFocus = this.f41826a.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.f41838m.r();
            return;
        }
        kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
        androidx.compose.runtime.collection.d<a> dVar = this.f41838m;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < iR; i11++) {
            u(aVarArr[i11], hVar, hVar2);
        }
        this.f41838m.r();
        if (Intrinsics.areEqual(hVar.f312751a, Boolean.TRUE)) {
            v();
        }
        Boolean bool = (Boolean) hVar2.f312751a;
        if (bool != null) {
            y(bool.booleanValue());
        }
        if (Intrinsics.areEqual(hVar.f312751a, Boolean.FALSE)) {
            v();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Boolean] */
    private static final void u(a aVar, kotlin.jvm.internal.i1.h<Boolean> hVar, kotlin.jvm.internal.i1.h<Boolean> hVar2) {
        int i10 = b.f41846a[aVar.ordinal()];
        if (i10 == 1) {
            ?? r10 = Boolean.TRUE;
            hVar.f312751a = r10;
            hVar2.f312751a = r10;
        } else if (i10 == 2) {
            ?? r11 = Boolean.FALSE;
            hVar.f312751a = r11;
            hVar2.f312751a = r11;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new kotlin.k0();
            }
            if (Intrinsics.areEqual(hVar.f312751a, Boolean.FALSE)) {
                return;
            }
            hVar2.f312751a = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    private final void v() {
        this.f41827b.b();
    }

    private final void w(a aVar) {
        this.f41838m.d(aVar);
        if (this.f41839n == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.b1
                @Override // java.lang.Runnable
                public final void run() {
                    c1.x(this.f41823a);
                }
            };
            this.f41828c.execute(runnable);
            this.f41839n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(c1 c1Var) {
        c1Var.f41839n = null;
        c1Var.t();
    }

    private final void y(boolean z10) {
        if (z10) {
            this.f41827b.f();
        } else {
            this.f41827b.c();
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void a() {
        this.f41829d = false;
        this.f41830e = g.f41851a;
        this.f41831f = h.f41852a;
        this.f41836k = null;
        w(a.StopInput);
    }

    @Override // androidx.compose.ui.text.input.q0
    public void b(@Nullable y0 y0Var, @NotNull y0 y0Var2) {
        int i10 = 2 & 0;
        boolean z10 = (w3.g(this.f41832g.l(), y0Var2.l()) && Intrinsics.areEqual(this.f41832g.k(), y0Var2.k())) ? false : true;
        this.f41832g = y0Var2;
        int size = this.f41834i.size();
        for (int i11 = 0; i11 < size; i11++) {
            r0 r0Var = this.f41834i.get(i11).get();
            if (r0Var != null) {
                r0Var.k(y0Var2);
            }
        }
        this.f41837l.a();
        if (Intrinsics.areEqual(y0Var, y0Var2)) {
            if (z10) {
                x xVar = this.f41827b;
                int iL = w3.l(y0Var2.l());
                int iK = w3.k(y0Var2.l());
                w3 w3VarK = this.f41832g.k();
                int iL2 = w3VarK != null ? w3.l(w3VarK.r()) : -1;
                w3 w3VarK2 = this.f41832g.k();
                xVar.a(iL, iK, iL2, w3VarK2 != null ? w3.k(w3VarK2.r()) : -1);
                return;
            }
            return;
        }
        if (y0Var != null && (!Intrinsics.areEqual(y0Var.m(), y0Var2.m()) || (w3.g(y0Var.l(), y0Var2.l()) && !Intrinsics.areEqual(y0Var.k(), y0Var2.k())))) {
            v();
            return;
        }
        int size2 = this.f41834i.size();
        for (int i12 = 0; i12 < size2; i12++) {
            r0 r0Var2 = this.f41834i.get(i12).get();
            if (r0Var2 != null) {
                r0Var2.l(this.f41832g, this.f41827b);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void c(@NotNull y0 y0Var, @NotNull m0 m0Var, @NotNull p3 p3Var, @NotNull Function1<? super c2, Unit> function1, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        this.f41837l.d(y0Var, m0Var, p3Var, function1, jVar, jVar2);
    }

    @Override // androidx.compose.ui.text.input.q0
    public void d() {
        w(a.StartInput);
    }

    @Override // androidx.compose.ui.text.input.q0
    public void e() {
        w(a.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.q0
    public void f() {
        w(a.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.q0
    @kotlin.l(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void g(@NotNull n0.j jVar) {
        Rect rect;
        this.f41836k = new Rect(kotlin.math.b.L0(jVar.t()), kotlin.math.b.L0(jVar.B()), kotlin.math.b.L0(jVar.x()), kotlin.math.b.L0(jVar.j()));
        if (!this.f41834i.isEmpty() || (rect = this.f41836k) == null) {
            return;
        }
        this.f41826a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // androidx.compose.ui.text.input.q0
    public void h(@NotNull y0 y0Var, @NotNull u uVar, @NotNull Function1<? super List<? extends j>, Unit> function1, @NotNull Function1<? super t, Unit> function2) {
        this.f41829d = true;
        this.f41832g = y0Var;
        this.f41833h = uVar;
        this.f41830e = function1;
        this.f41831f = function2;
        w(a.StartInput);
    }

    @Nullable
    public final InputConnection o(@NotNull EditorInfo editorInfo) {
        if (!this.f41829d) {
            return null;
        }
        f1.h(editorInfo, this.f41833h, this.f41832g);
        f1.i(editorInfo);
        r0 r0Var = new r0(this.f41832g, new d(), this.f41833h.h());
        this.f41834i.add(new WeakReference<>(r0Var));
        return r0Var;
    }

    @NotNull
    public final y0 q() {
        return this.f41832g;
    }

    @NotNull
    public final View r() {
        return this.f41826a;
    }

    public final boolean s() {
        return this.f41829d;
    }

    public /* synthetic */ c1(View view, androidx.compose.ui.input.pointer.j jVar, x xVar, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, jVar, xVar, (i10 & 8) != 0 ? f1.d(Choreographer.getInstance()) : executor);
    }

    public c1(@NotNull View view, @NotNull androidx.compose.ui.input.pointer.j jVar) {
        this(view, jVar, new y(view), null, 8, null);
    }
}
