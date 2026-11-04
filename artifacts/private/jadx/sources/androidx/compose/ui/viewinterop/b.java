package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.x;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.layout.z;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c5;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.semantics.e0;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.unit.d0;
import androidx.compose.ui.unit.u;
import androidx.core.view.a1;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.l2;
import androidx.core.view.u1;
import androidx.core.view.y0;
import androidx.lifecycle.n2;
import androidx.lifecycle.o0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,715:1\n655#1,6:753\n661#1,2:760\n663#1:768\n664#1:779\n665#1,7:784\n655#1,6:791\n661#1,2:798\n663#1:806\n664#1:817\n665#1,7:822\n1#2:716\n57#3,4:717\n30#4:721\n30#4:725\n30#4:735\n30#4:739\n30#4:743\n30#4:780\n30#4:818\n30#4:843\n53#5,3:722\n53#5,3:726\n60#5:730\n70#5:733\n53#5,3:736\n53#5,3:740\n53#5,3:744\n60#5:748\n70#5:751\n85#5:764\n90#5:767\n53#5,3:781\n85#5:802\n90#5:805\n53#5,3:819\n85#5:833\n90#5:836\n85#5:839\n90#5:842\n53#5,3:844\n65#6:729\n69#6:732\n65#6:747\n69#6:750\n22#7:731\n22#7:734\n22#7:749\n22#7:752\n105#8:759\n105#8:797\n105#8:829\n105#8:830\n105#8:847\n105#8:848\n105#8:849\n105#8:850\n105#8:851\n105#8:852\n61#9:762\n54#9:763\n63#9:765\n59#9:766\n54#9,10:769\n61#9:800\n54#9:801\n63#9:803\n59#9:804\n54#9,10:807\n61#9:831\n54#9:832\n63#9:834\n59#9:835\n61#9:837\n54#9:838\n63#9:840\n59#9:841\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n646#1:753,6\n646#1:760,2\n646#1:768\n646#1:779\n646#1:784,7\n650#1:791,6\n650#1:798,2\n650#1:806\n650#1:817\n650#1:822,7\n198#1:717,4\n572#1:721\n573#1:725\n590#1:735\n591#1:739\n600#1:743\n646#1:780\n650#1:818\n664#1:843\n572#1:722,3\n573#1:726,3\n576#1:730\n577#1:733\n590#1:736,3\n591#1:740,3\n600#1:744,3\n603#1:748\n604#1:751\n646#1:764\n646#1:767\n646#1:781,3\n650#1:802\n650#1:805\n650#1:819,3\n662#1:833\n662#1:836\n663#1:839\n663#1:842\n664#1:844,3\n576#1:729\n577#1:732\n603#1:747\n604#1:750\n576#1:731\n577#1:734\n603#1:749\n604#1:752\n646#1:759\n650#1:797\n660#1:829\n661#1:830\n665#1:847\n666#1:848\n677#1:849\n678#1:850\n679#1:851\n680#1:852\n646#1:762\n646#1:763\n646#1:765\n646#1:766\n646#1:769,10\n650#1:800\n650#1:801\n650#1:803\n650#1:804\n650#1:807,10\n662#1:831\n662#1:832\n662#1:834\n662#1:835\n663#1:837\n663#1:838\n663#1:840\n663#1:841\n*E\n"})
public class b extends ViewGroup implements y0, x, y1, b1 {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    public static final c f42735j3 = new c(null);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f42736k3 = 8;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final Function1<b, Unit> f42737l3 = C0345b.f42764a;
    private int H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.b f42739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f42740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final x1 f42741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f42742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f42744g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final a1 f42745g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f42746h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f42747h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private a0 f42748i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final l0 f42749i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Function1<? super a0, Unit> f42750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f42751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.unit.d, Unit> f42752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private o0 f42753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private androidx.savedstate.m f42754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final int[] f42755o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private Function1<? super Boolean, Unit> f42756p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final int[] f42757p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f42758p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f42759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private g3 f42760t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f42761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f42762w;

    public static final class a extends l2.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.l2.b
        public g3 e(g3 g3Var, List<l2> list) {
            return b.this.D(g3Var);
        }

        @Override // androidx.core.view.l2.b
        public l2.a f(l2 l2Var, l2.a aVar) {
            return b.this.C(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    static final class C0345b extends kotlin.jvm.internal.l0 implements Function1<b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0345b f42764a = new C0345b();

        C0345b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Function0 function0) {
            function0.invoke();
        }

        public final void d(b bVar) {
            Handler handler = bVar.getHandler();
            final Function0 function0 = bVar.f42761v;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0345b.f(function0);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            d(bVar);
            return Unit.f312394a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<a0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f42765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f42766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l0 l0Var, a0 a0Var) {
            super(1);
            this.f42765a = l0Var;
            this.f42766b = a0Var;
        }

        public final void c(a0 a0Var) {
            this.f42765a.j(a0Var.B2(this.f42766b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a0 a0Var) {
            c(a0Var);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f42767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l0 l0Var) {
            super(1);
            this.f42767a = l0Var;
        }

        public final void c(androidx.compose.ui.unit.d dVar) {
            this.f42767a.e(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.unit.d dVar) {
            c(dVar);
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<x1, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f42769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(l0 l0Var) {
            super(1);
            this.f42769b = l0Var;
        }

        public final void c(x1 x1Var) {
            AndroidComposeView androidComposeView = x1Var instanceof AndroidComposeView ? (AndroidComposeView) x1Var : null;
            if (androidComposeView != null) {
                androidComposeView.z0(b.this, this.f42769b);
            }
            ViewParent parent = b.this.getView().getParent();
            b bVar = b.this;
            if (parent != bVar) {
                bVar.addView(bVar.getView());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(x1 x1Var) {
            c(x1Var);
            return Unit.f312394a;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<x1, Unit> {
        g() {
            super(1);
        }

        public final void c(x1 x1Var) {
            if (androidx.compose.ui.k.f39201d && b.this.hasFocus()) {
                x1Var.getFocusOwner().A(true);
            }
            AndroidComposeView androidComposeView = x1Var instanceof AndroidComposeView ? (AndroidComposeView) x1Var : null;
            if (androidComposeView != null) {
                androidComposeView.f1(b.this);
            }
            b.this.removeAllViewsInLayout();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(x1 x1Var) {
            c(x1Var);
            return Unit.f312394a;
        }
    }

    public static final class h implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f42772b;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f42773a = new a();

            a() {
                super(1);
            }

            public final void c(i2.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$h$b, reason: collision with other inner class name */
        static final class C0346b extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f42774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f42775b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0346b(b bVar, l0 l0Var) {
                super(1);
                this.f42774a = bVar;
                this.f42775b = l0Var;
            }

            public final void c(i2.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f42774a, this.f42775b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        h(l0 l0Var) {
            this.f42772b = l0Var;
        }

        private final int f(int i10) {
            b bVar = b.this;
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            bVar.measure(bVar.H(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return b.this.getMeasuredHeight();
        }

        private final int g(int i10) {
            b bVar = b.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            b bVar2 = b.this;
            ViewGroup.LayoutParams layoutParams = bVar2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            bVar.measure(iMakeMeasureSpec, bVar2.H(0, i10, layoutParams.height));
            return b.this.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.a1
        public androidx.compose.ui.layout.b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            if (b.this.getChildCount() == 0) {
                return c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, a.f42773a, 4, null);
            }
            if (androidx.compose.ui.unit.b.r(j10) != 0) {
                b.this.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.b.r(j10));
            }
            if (androidx.compose.ui.unit.b.q(j10) != 0) {
                b.this.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.b.q(j10));
            }
            b bVar = b.this;
            int iR = androidx.compose.ui.unit.b.r(j10);
            int iP = androidx.compose.ui.unit.b.p(j10);
            ViewGroup.LayoutParams layoutParams = b.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            int iH = bVar.H(iR, iP, layoutParams.width);
            b bVar2 = b.this;
            int iQ = androidx.compose.ui.unit.b.q(j10);
            int iO = androidx.compose.ui.unit.b.o(j10);
            ViewGroup.LayoutParams layoutParams2 = b.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2);
            bVar.measure(iH, bVar2.H(iQ, iO, layoutParams2.height));
            return c1.h6(c1Var, b.this.getMeasuredWidth(), b.this.getMeasuredHeight(), null, new C0346b(b.this, this.f42772b), 4, null);
        }

        @Override // androidx.compose.ui.layout.a1
        public int b(z zVar, List<? extends y> list, int i10) {
            return f(i10);
        }

        @Override // androidx.compose.ui.layout.a1
        public int c(z zVar, List<? extends y> list, int i10) {
            return g(i10);
        }

        @Override // androidx.compose.ui.layout.a1
        public int d(z zVar, List<? extends y> list, int i10) {
            return f(i10);
        }

        @Override // androidx.compose.ui.layout.a1
        public int e(z zVar, List<? extends y> list, int i10) {
            return g(i10);
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f42776a = new i();

        i() {
            super(1);
        }

        public final void c(e0 e0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var) {
            c(e0Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,715:1\n233#2:716\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n377#1:716\n*E\n"})
    static final class j extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f42778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f42779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l0 l0Var, b bVar) {
            super(1);
            this.f42778b = l0Var;
            this.f42779c = bVar;
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            b bVar = b.this;
            l0 l0Var = this.f42778b;
            b bVar2 = this.f42779c;
            k0 k0VarF = fVar.Z3().f();
            if (bVar.getView().getVisibility() != 8) {
                bVar.f42747h3 = true;
                x1 x1VarI0 = l0Var.I0();
                AndroidComposeView androidComposeView = x1VarI0 instanceof AndroidComposeView ? (AndroidComposeView) x1VarI0 : null;
                if (androidComposeView != null) {
                    androidComposeView.K0(bVar2, androidx.compose.ui.graphics.c.d(k0VarF));
                }
                bVar.f42747h3 = false;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<g0, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f42781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(l0 l0Var) {
            super(1);
            this.f42781b = l0Var;
        }

        public final void c(g0 g0Var) {
            WindowInsets windowInsetsJ;
            androidx.compose.ui.viewinterop.d.f(b.this, this.f42781b);
            b.this.f42741d.h(b.this);
            int i10 = b.this.f42755o[0];
            int i11 = b.this.f42755o[1];
            b.this.getView().getLocationOnScreen(b.this.f42755o);
            long j10 = b.this.f42759s;
            b.this.f42759s = g0Var.a();
            g3 g3Var = b.this.f42760t;
            if (g3Var != null) {
                if ((i10 == b.this.f42755o[0] && i11 == b.this.f42755o[1] && u.h(j10, b.this.f42759s)) || (windowInsetsJ = b.this.D(g3Var).J()) == null) {
                    return;
                }
                b.this.getView().dispatchApplyWindowInsets(windowInsetsJ);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g0 g0Var) {
            c(g0Var);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {617, 619}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f42783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f42784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f42785d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, b bVar, long j10, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f42783b = z10;
            this.f42784c = bVar;
            this.f42785d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(this.f42783b, this.f42784c, this.f42785d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (r12 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 5
                int r1 = r11.f42782a
                r10 = 0
                r2 = 2
                r3 = 0
                r3 = 1
                r10 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L21
                r10 = 4
                if (r1 != r2) goto L17
                kotlin.ResultKt.m(r12)
                goto L71
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 2
                r11.<init>(r12)
                r10 = 1
                throw r11
            L21:
                r10 = 4
                kotlin.ResultKt.m(r12)
                goto L4c
            L26:
                kotlin.ResultKt.m(r12)
                boolean r12 = r11.f42783b
                if (r12 != 0) goto L53
                androidx.compose.ui.viewinterop.b r12 = r11.f42784c
                r10 = 2
                androidx.compose.ui.input.nestedscroll.b r4 = androidx.compose.ui.viewinterop.b.f(r12)
                r10 = 3
                androidx.compose.ui.unit.c0$a r12 = androidx.compose.ui.unit.c0.f42681b
                r10 = 5
                long r5 = r12.a()
                r10 = 1
                long r7 = r11.f42785d
                r11.f42782a = r3
                r9 = r11
                r9 = r11
                r10 = 4
                java.lang.Object r12 = r4.a(r5, r7, r9)
                if (r12 != r0) goto L4c
                r10 = 3
                goto L70
            L4c:
                androidx.compose.ui.unit.c0 r12 = (androidx.compose.ui.unit.c0) r12
                r10 = 0
                r12.v()
                goto L76
            L53:
                r6 = r11
                androidx.compose.ui.viewinterop.b r11 = r6.f42784c
                r10 = 7
                androidx.compose.ui.input.nestedscroll.b r1 = androidx.compose.ui.viewinterop.b.f(r11)
                r10 = 5
                r11 = r2
                long r2 = r6.f42785d
                androidx.compose.ui.unit.c0$a r12 = androidx.compose.ui.unit.c0.f42681b
                long r4 = r12.a()
                r10 = 4
                r6.f42782a = r11
                r10 = 7
                java.lang.Object r12 = r1.a(r2, r4, r6)
                r10 = 2
                if (r12 != r0) goto L71
            L70:
                return r0
            L71:
                androidx.compose.ui.unit.c0 r12 = (androidx.compose.ui.unit.c0) r12
                r12.v()
            L76:
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.b.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {628}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42786a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f42788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(long j10, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f42788c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new m(this.f42788c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f42786a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.ui.input.nestedscroll.b bVar = b.this.f42739b;
                long j10 = this.f42788c;
                this.f42786a = 1;
                if (bVar.c(j10, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class n extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f42789a = new n();

        n() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    static final class o extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f42790a = new o();

        o() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    static final class p extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b.this.getLayoutNode().X0();
        }
    }

    static final class q extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (b.this.f42743f && b.this.isAttachedToWindow()) {
                ViewParent parent = b.this.getView().getParent();
                b bVar = b.this;
                if (parent == bVar) {
                    bVar.getSnapshotObserver().i(b.this, b.f42737l3, b.this.getUpdate());
                }
            }
        }
    }

    static final class r extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f42793a = new r();

        r() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    public b(@NotNull Context context, @Nullable p0 p0Var, int i10, @NotNull androidx.compose.ui.input.nestedscroll.b bVar, @NotNull View view, @NotNull x1 x1Var) {
        super(context);
        this.f42738a = i10;
        this.f42739b = bVar;
        this.f42740c = view;
        this.f42741d = x1Var;
        if (p0Var != null) {
            c5.j(this, p0Var);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        u1.G2(this, new a());
        u1.j2(this, this);
        this.f42742e = r.f42793a;
        this.f42744g = o.f42790a;
        this.f42746h = n.f42789a;
        a0.a aVar = a0.E;
        this.f42748i = aVar;
        this.f42751k = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);
        this.f42755o = new int[2];
        this.f42759s = u.f42720b.a();
        this.f42761v = new q();
        this.f42762w = new p();
        this.f42757p1 = new int[2];
        this.H1 = Integer.MIN_VALUE;
        this.f42758p2 = Integer.MIN_VALUE;
        this.f42745g3 = new a1(this);
        l0 l0Var = new l0(false, 0, 3, null);
        l0Var.d2(this);
        a0 a0VarA = q1.a(androidx.compose.ui.draw.n.b(androidx.compose.ui.input.pointer.o0.c(t.e(androidx.compose.ui.input.nestedscroll.c.a(aVar, androidx.compose.ui.viewinterop.d.f42796b, bVar), true, i.f42776a), this), new j(l0Var, this)), new k(l0Var));
        l0Var.d(i10);
        l0Var.j(this.f42748i.B2(a0VarA));
        this.f42750j = new d(l0Var, a0VarA);
        l0Var.e(this.f42751k);
        this.f42752l = new e(l0Var);
        l0Var.j2(new f(l0Var));
        l0Var.k2(new g());
        l0Var.i(new h(l0Var));
        this.f42749i3 = l0Var;
    }

    private final androidx.core.graphics.j B(androidx.core.graphics.j jVar, int i10, int i11, int i12, int i13) {
        int i14 = jVar.f47823a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = jVar.f47824b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = jVar.f47825c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = jVar.f47826d - i13;
        return androidx.core.graphics.j.d(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l2.a C(l2.a aVar) {
        k1 k1VarE0 = this.f42749i3.e0();
        if (k1VarE0.I()) {
            long jG = androidx.compose.ui.unit.r.g(h0.f(k1VarE0));
            int iN = androidx.compose.ui.unit.q.n(jG);
            if (iN < 0) {
                iN = 0;
            }
            int iP = androidx.compose.ui.unit.q.p(jG);
            int i10 = iP < 0 ? 0 : iP;
            long jA = h0.d(k1VarE0).a();
            int i11 = (int) (jA >> 32);
            int i12 = (int) (jA & com.rabbitmq.client.k0.f265952a);
            long jA2 = k1VarE0.a();
            long jG2 = androidx.compose.ui.unit.r.g(k1VarE0.k0(n0.g.g((com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits((int) (jA2 & com.rabbitmq.client.k0.f265952a)))) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
            int iN2 = i11 - androidx.compose.ui.unit.q.n(jG2);
            if (iN2 < 0) {
                iN2 = 0;
            }
            int iP2 = i12 - androidx.compose.ui.unit.q.p(jG2);
            int i13 = iP2 >= 0 ? iP2 : 0;
            if (iN != 0 || i10 != 0 || iN2 != 0 || i13 != 0) {
                int i14 = iN;
                int i15 = iN2;
                return new l2.a(B(aVar.a(), i14, i10, i15, i13), B(aVar.b(), i14, i10, i15, i13));
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g3 D(g3 g3Var) {
        if (g3Var.u()) {
            k1 k1VarE0 = this.f42749i3.e0();
            if (k1VarE0.I()) {
                long jG = androidx.compose.ui.unit.r.g(h0.f(k1VarE0));
                int iN = androidx.compose.ui.unit.q.n(jG);
                if (iN < 0) {
                    iN = 0;
                }
                int iP = androidx.compose.ui.unit.q.p(jG);
                if (iP < 0) {
                    iP = 0;
                }
                long jA = h0.d(k1VarE0).a();
                int i10 = (int) (jA >> 32);
                int i11 = (int) (jA & com.rabbitmq.client.k0.f265952a);
                long jA2 = k1VarE0.a();
                long jG2 = androidx.compose.ui.unit.r.g(k1VarE0.k0(n0.g.g((com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits((int) (jA2 & com.rabbitmq.client.k0.f265952a)))) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
                int iN2 = i10 - androidx.compose.ui.unit.q.n(jG2);
                if (iN2 < 0) {
                    iN2 = 0;
                }
                int iP2 = i11 - androidx.compose.ui.unit.q.p(jG2);
                int i12 = iP2 >= 0 ? iP2 : 0;
                if (iN != 0 || iP != 0 || iN2 != 0 || i12 != 0) {
                    return g3Var.x(iN, iP, iN2, i12);
                }
            }
        }
        return g3Var;
    }

    private final <T> T E(T t10, pj.o<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> oVar) {
        k1 k1VarE0 = this.f42749i3.e0();
        if (k1VarE0.I()) {
            long jG = androidx.compose.ui.unit.r.g(h0.f(k1VarE0));
            int iN = androidx.compose.ui.unit.q.n(jG);
            if (iN < 0) {
                iN = 0;
            }
            int iP = androidx.compose.ui.unit.q.p(jG);
            if (iP < 0) {
                iP = 0;
            }
            long jA = h0.d(k1VarE0).a();
            int i10 = (int) (jA >> 32);
            int i11 = (int) (jA & com.rabbitmq.client.k0.f265952a);
            long jA2 = k1VarE0.a();
            long jG2 = androidx.compose.ui.unit.r.g(k1VarE0.k0(n0.g.g((com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits((int) (jA2 & com.rabbitmq.client.k0.f265952a)))) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
            int iN2 = i10 - androidx.compose.ui.unit.q.n(jG2);
            if (iN2 < 0) {
                iN2 = 0;
            }
            int iP2 = i11 - androidx.compose.ui.unit.q.p(jG2);
            int i12 = iP2 >= 0 ? iP2 : 0;
            if (iN != 0 || iP != 0 || iN2 != 0 || i12 != 0) {
                return oVar.invoke(Integer.valueOf(iN), Integer.valueOf(iP), Integer.valueOf(iN2), Integer.valueOf(i12));
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H(int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.r.I(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            s0.a.i("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f42741d.getSnapshotObserver();
    }

    public final void F() {
        if (!this.f42747h3) {
            this.f42749i3.X0();
            return;
        }
        View view = this.f42740c;
        final Function0<Unit> function0 = this.f42762w;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                b.G(function0);
            }
        });
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return isAttachedToWindow();
    }

    public final void I() {
        int i10;
        int i11 = this.H1;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f42758p2) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // androidx.core.view.b1
    @NotNull
    public g3 b(@NotNull View view, @NotNull g3 g3Var) {
        this.f42760t = new g3(g3Var);
        return D(g3Var);
    }

    @Override // androidx.compose.runtime.x
    public void c() {
        this.f42746h.invoke();
    }

    @Override // androidx.compose.runtime.x
    public void g() {
        this.f42744g.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f42757p1);
        int[] iArr = this.f42757p1;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f42757p1[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final androidx.compose.ui.unit.d getDensity() {
        return this.f42751k;
    }

    @Nullable
    public final View getInteropView() {
        return this.f42740c;
    }

    @NotNull
    public final l0 getLayoutNode() {
        return this.f42749i3;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f42740c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final o0 getLifecycleOwner() {
        return this.f42753m;
    }

    @NotNull
    public final a0 getModifier() {
        return this.f42748i;
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f42745g3.a();
    }

    @Nullable
    public final Function1<androidx.compose.ui.unit.d, Unit> getOnDensityChanged$ui_release() {
        return this.f42752l;
    }

    @Nullable
    public final Function1<a0, Unit> getOnModifierChanged$ui_release() {
        return this.f42750j;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f42756p0;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.f42746h;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f42744g;
    }

    @Nullable
    public final androidx.savedstate.m getSavedStateRegistryOwner() {
        return this.f42754n;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.f42742e;
    }

    @NotNull
    public final View getView() {
        return this.f42740c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] iArr, @Nullable Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        F();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f42740c.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.x0
    public void l(@NotNull View view, @NotNull View view2, int i10, int i11) {
        this.f42745g3.c(view, view2, i10, i11);
    }

    @Override // androidx.core.view.x0
    public void m(@NotNull View view, int i10) {
        this.f42745g3.e(view, i10);
    }

    @Override // androidx.core.view.x0
    public void o(@NotNull View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.f42739b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jG = n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(i12);
            bVar.b(jG, n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i13))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(i14));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42761v.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View view, @NotNull View view2) {
        super.onDescendantInvalidated(view, view2);
        F();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f42740c.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f42740c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f42740c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f42740c.measure(i10, i11);
        setMeasuredDimension(this.f42740c.getMeasuredWidth(), this.f42740c.getMeasuredHeight());
        this.H1 = i10;
        this.f42758p2 = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(@NotNull View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.k.f(this.f42739b.f(), null, null, new l(z10, this, d0.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(@NotNull View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.k.f(this.f42739b.f(), null, null, new m(d0.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // androidx.core.view.x0
    public void q(@NotNull View view, int i10, int i11, @NotNull int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.f42739b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jD = bVar.d(n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32)), androidx.compose.ui.viewinterop.d.i(i12));
            iArr[0] = e3.f(Float.intBitsToFloat((int) (jD >> 32)));
            iArr[1] = e3.f(Float.intBitsToFloat((int) (jD & com.rabbitmq.client.k0.f265952a)));
        }
    }

    @Override // androidx.compose.runtime.x
    public void r() {
        if (this.f42740c.getParent() != this) {
            addView(this.f42740c);
        } else {
            this.f42744g.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        Function1<? super Boolean, Unit> function1 = this.f42756p0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // androidx.core.view.y0
    public void s(@NotNull View view, int i10, int i11, int i12, int i13, int i14, @NotNull int[] iArr) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.b bVar = this.f42739b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jG = n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(i12);
            long jB = bVar.b(jG, n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i13))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(i14));
            iArr[0] = e3.f(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = e3.f(Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)));
        }
    }

    public final void setDensity(@NotNull androidx.compose.ui.unit.d dVar) {
        if (dVar != this.f42751k) {
            this.f42751k = dVar;
            Function1<? super androidx.compose.ui.unit.d, Unit> function1 = this.f42752l;
            if (function1 != null) {
                function1.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable o0 o0Var) {
        if (o0Var != this.f42753m) {
            this.f42753m = o0Var;
            n2.b(this, o0Var);
        }
    }

    public final void setModifier(@NotNull a0 a0Var) {
        if (a0Var != this.f42748i) {
            this.f42748i = a0Var;
            Function1<? super a0, Unit> function1 = this.f42750j;
            if (function1 != null) {
                function1.invoke(a0Var);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super androidx.compose.ui.unit.d, Unit> function1) {
        this.f42752l = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super a0, Unit> function1) {
        this.f42750j = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f42756p0 = function1;
    }

    protected final void setRelease(@NotNull Function0<Unit> function0) {
        this.f42746h = function0;
    }

    protected final void setReset(@NotNull Function0<Unit> function0) {
        this.f42744g = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable androidx.savedstate.m mVar) {
        if (mVar != this.f42754n) {
            this.f42754n = mVar;
            androidx.savedstate.r.b(this, mVar);
        }
    }

    protected final void setUpdate(@NotNull Function0<Unit> function0) {
        this.f42742e = function0;
        this.f42743f = true;
        this.f42761v.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.x0
    public boolean t(@NotNull View view, @NotNull View view2, int i10, int i11) {
        if ((i10 & 2) == 0 && (i10 & 1) == 0) {
            return false;
        }
        return true;
    }
}
