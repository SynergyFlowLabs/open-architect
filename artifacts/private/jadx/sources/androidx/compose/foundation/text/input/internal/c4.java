package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c4 implements androidx.compose.ui.platform.j3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19503n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f19504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q3 f19505b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.g4 f19508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.selection.u3 f19509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.platform.o4 f19510g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Rect f19515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final w3 f19516m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super List<? extends androidx.compose.ui.text.input.j>, Unit> f19506c = new Function1() { // from class: androidx.compose.foundation.text.input.internal.z3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return c4.q((List) obj);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.text.input.t, Unit> f19507d = new Function1() { // from class: androidx.compose.foundation.text.input.internal.a4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return c4.r((androidx.compose.ui.text.input.t) obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.y0 f19511h = new androidx.compose.ui.text.input.y0("", androidx.compose.ui.text.w3.f42333b.a(), (androidx.compose.ui.text.w3) null, 4, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.u f19512i = androidx.compose.ui.text.input.u.f41958h.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private List<WeakReference<l4>> f19513j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f19514k = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: androidx.compose.foundation.text.input.internal.b4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c4.j(this.f19461a);
        }
    });

    public static final class a implements p3 {
        a() {
        }

        @Override // androidx.compose.foundation.text.input.internal.p3
        public void a(int i10) {
            c4.this.f19507d.invoke(androidx.compose.ui.text.input.t.j(i10));
        }

        @Override // androidx.compose.foundation.text.input.internal.p3
        public void b(List<? extends androidx.compose.ui.text.input.j> list) {
            c4.this.f19506c.invoke(list);
        }

        @Override // androidx.compose.foundation.text.input.internal.p3
        public void c(KeyEvent keyEvent) {
            c4.this.l().sendKeyEvent(keyEvent);
        }

        @Override // androidx.compose.foundation.text.input.internal.p3
        public void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            c4.this.f19516m.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // androidx.compose.foundation.text.input.internal.p3
        public void e(l4 l4Var) {
            int size = c4.this.f19513j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(((WeakReference) c4.this.f19513j.get(i10)).get(), l4Var)) {
                    c4.this.f19513j.remove(i10);
                    return;
                }
            }
        }
    }

    public c4(@NotNull View view, @NotNull Function1<? super androidx.compose.ui.graphics.c2, Unit> function1, @NotNull q3 q3Var) {
        this.f19504a = view;
        this.f19505b = q3Var;
        this.f19516m = new w3(function1, q3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection j(c4 c4Var) {
        return new BaseInputConnection(c4Var.f19504a, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection l() {
        return (BaseInputConnection) this.f19514k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(List list) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.text.input.t tVar) {
        return Unit.f312394a;
    }

    private final void s() {
        this.f19505b.b();
    }

    @Override // androidx.compose.ui.platform.j3
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public l4 a(@NotNull EditorInfo editorInfo) {
        s1.c(editorInfo, this.f19511h.m(), this.f19511h.l(), this.f19512i, null, 8, null);
        y3.f(editorInfo);
        l4 l4Var = new l4(this.f19511h, new a(), this.f19512i.h(), this.f19508e, this.f19509f, this.f19510g);
        this.f19513j.add(new WeakReference<>(l4Var));
        return l4Var;
    }

    @Nullable
    public final Rect m() {
        return this.f19515l;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 n() {
        return this.f19511h;
    }

    @NotNull
    public final View o() {
        return this.f19504a;
    }

    public final void p(@NotNull n0.j jVar) {
        Rect rect;
        this.f19515l = new Rect(kotlin.math.b.L0(jVar.t()), kotlin.math.b.L0(jVar.B()), kotlin.math.b.L0(jVar.x()), kotlin.math.b.L0(jVar.j()));
        if (!this.f19513j.isEmpty() || (rect = this.f19515l) == null) {
            return;
        }
        this.f19504a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void t(@Nullable Rect rect) {
        this.f19515l = rect;
    }

    public final void u(@NotNull androidx.compose.ui.text.input.y0 y0Var, @Nullable x3.a aVar, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull Function1<? super List<? extends androidx.compose.ui.text.input.j>, Unit> function1, @NotNull Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
        this.f19511h = y0Var;
        this.f19512i = uVar;
        this.f19506c = function1;
        this.f19507d = function2;
        this.f19508e = aVar != null ? aVar.u4() : null;
        this.f19509f = aVar != null ? aVar.o3() : null;
        this.f19510g = aVar != null ? aVar.getViewConfiguration() : null;
    }

    public final void v(@Nullable androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.y0 y0Var2) {
        boolean z10 = (androidx.compose.ui.text.w3.g(this.f19511h.l(), y0Var2.l()) && Intrinsics.areEqual(this.f19511h.k(), y0Var2.k())) ? false : true;
        this.f19511h = y0Var2;
        int size = this.f19513j.size();
        for (int i10 = 0; i10 < size; i10++) {
            l4 l4Var = this.f19513j.get(i10).get();
            if (l4Var != null) {
                l4Var.p(y0Var2);
            }
        }
        this.f19516m.a();
        if (Intrinsics.areEqual(y0Var, y0Var2)) {
            if (z10) {
                q3 q3Var = this.f19505b;
                int iL = androidx.compose.ui.text.w3.l(y0Var2.l());
                int iK = androidx.compose.ui.text.w3.k(y0Var2.l());
                androidx.compose.ui.text.w3 w3VarK = this.f19511h.k();
                int iL2 = w3VarK != null ? androidx.compose.ui.text.w3.l(w3VarK.r()) : -1;
                androidx.compose.ui.text.w3 w3VarK2 = this.f19511h.k();
                q3Var.a(iL, iK, iL2, w3VarK2 != null ? androidx.compose.ui.text.w3.k(w3VarK2.r()) : -1);
                return;
            }
            return;
        }
        if (y0Var != null && (!Intrinsics.areEqual(y0Var.m(), y0Var2.m()) || (androidx.compose.ui.text.w3.g(y0Var.l(), y0Var2.l()) && !Intrinsics.areEqual(y0Var.k(), y0Var2.k())))) {
            s();
            return;
        }
        int size2 = this.f19513j.size();
        for (int i11 = 0; i11 < size2; i11++) {
            l4 l4Var2 = this.f19513j.get(i11).get();
            if (l4Var2 != null) {
                l4Var2.q(this.f19511h, this.f19505b);
            }
        }
    }

    public final void w(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        this.f19516m.d(y0Var, m0Var, p3Var, jVar, jVar2);
    }
}
