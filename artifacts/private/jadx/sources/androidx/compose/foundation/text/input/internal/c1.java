package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class c1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19484o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w6 f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q6 f19486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v f19487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f19488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f19491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f19496l = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final float[] f19497m = androidx.compose.ui.graphics.c2.c(null, 1, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Matrix f19498n = new Matrix();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", i = {}, l = {androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19499a;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c1$a$a, reason: collision with other inner class name */
        static final class C0135a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c1 f19501a;

            C0135a(c1 c1Var) {
                this.f19501a = c1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(CursorAnchorInfo cursorAnchorInfo, kotlin.coroutines.d<? super Unit> dVar) {
                this.f19501a.f19487c.d(cursorAnchorInfo);
                return Unit.f312394a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CursorAnchorInfo m(c1 c1Var) {
            return c1Var.c();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19499a;
            int i11 = 2 & 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                final c1 c1Var = c1.this;
                kotlinx.coroutines.flow.i iVarV0 = kotlinx.coroutines.flow.k.v0(kotlinx.coroutines.flow.k.l0(androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.b1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c1.a.m(c1Var);
                    }
                }), 1));
                C0135a c0135a = new C0135a(c1.this);
                this.f19499a = 1;
                if (iVarV0.collect(c0135a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c1(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull v vVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f19485a = w6Var;
        this.f19486b = q6Var;
        this.f19487c = vVar;
        this.f19488d = s0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo c() {
        androidx.compose.ui.layout.g0 g0VarD;
        androidx.compose.ui.layout.g0 g0VarE;
        androidx.compose.ui.text.p3 p3VarF;
        androidx.compose.ui.layout.g0 g0VarK = this.f19486b.k();
        if (g0VarK != null) {
            if (!g0VarK.I()) {
                g0VarK = null;
            }
            if (g0VarK != null && (g0VarD = this.f19486b.d()) != null) {
                if (!g0VarD.I()) {
                    g0VarD = null;
                }
                if (g0VarD != null && (g0VarE = this.f19486b.e()) != null) {
                    if (!g0VarE.I()) {
                        g0VarE = null;
                    }
                    if (g0VarE == null || (p3VarF = this.f19486b.f()) == null) {
                        return null;
                    }
                    androidx.compose.foundation.text.input.l lVarU = this.f19485a.u();
                    androidx.compose.ui.graphics.c2.m(this.f19497m);
                    g0VarK.K0(this.f19497m);
                    androidx.compose.ui.graphics.k.a(this.f19498n, this.f19497m);
                    n0.j jVarI = androidx.compose.foundation.text.selection.n2.i(g0VarD);
                    n0.g.a aVar = n0.g.f332700b;
                    return a1.b(this.f19496l, lVarU, lVarU.h(), lVarU.d(), p3VarF, this.f19498n, jVarI.T(g0VarK.r0(g0VarD, aVar.e())), androidx.compose.foundation.text.selection.n2.i(g0VarE).T(g0VarK.r0(g0VarE, aVar.e())), this.f19492h, this.f19493i, this.f19494j, this.f19495k);
                }
            }
        }
        return null;
    }

    private final void e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f19492h = z12;
        this.f19493i = z13;
        this.f19494j = z14;
        this.f19495k = z15;
        if (z10) {
            this.f19490f = true;
            CursorAnchorInfo cursorAnchorInfoC = c();
            if (cursorAnchorInfoC != null) {
                this.f19487c.d(cursorAnchorInfoC);
            }
        }
        this.f19489e = z11;
        f();
    }

    private final void f() {
        if (!this.f19489e) {
            kotlinx.coroutines.p2 p2Var = this.f19491g;
            if (p2Var != null) {
                kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            }
            this.f19491g = null;
            return;
        }
        kotlinx.coroutines.p2 p2Var2 = this.f19491g;
        if (p2Var2 == null || !p2Var2.isActive()) {
            this.f19491g = kotlinx.coroutines.k.f(this.f19488d, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(null), 1, null);
        }
    }

    public final void d(int i10) {
        c1 c1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z17 = (i10 & 16) != 0;
            boolean z18 = (i10 & 8) != 0;
            boolean z19 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z17 || z18 || z19 || z14) {
                z11 = z14;
                z10 = z19;
                z13 = z18;
                z12 = z17;
                c1Var = this;
            } else {
                c1Var = this;
                if (i11 >= 34) {
                    z12 = true;
                    z13 = true;
                    z10 = true;
                    z11 = true;
                } else {
                    z11 = z14;
                    z12 = true;
                    z13 = true;
                    z10 = true;
                }
            }
        } else {
            c1Var = this;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        c1Var.e(z15, z16, z12, z13, z10, z11);
    }
}
