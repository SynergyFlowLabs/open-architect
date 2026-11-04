package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.m0;
import androidx.annotation.l1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.o0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.u4;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import androidx.lifecycle.q0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,611:1\n774#2:612\n865#2,2:613\n1557#2:615\n1628#2,3:616\n1557#2:619\n1628#2,3:620\n1557#2:623\n1628#2,3:624\n1557#2:627\n1628#2,3:628\n1368#2:631\n1454#2,2:632\n1611#2,9:634\n1863#2:643\n1864#2:645\n1620#2:646\n1456#2,3:647\n1755#2,3:650\n1368#2:654\n1454#2,5:655\n1863#2,2:660\n1755#2,3:662\n1#3:644\n1#3:653\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n*L\n224#1:612\n224#1:613,2\n224#1:615\n224#1:616,3\n240#1:619\n240#1:620,3\n276#1:623\n276#1:624,3\n291#1:627\n291#1:628,3\n294#1:631\n294#1:632,2\n302#1:634,9\n302#1:643\n302#1:645\n302#1:646\n294#1:647,3\n313#1:650,3\n358#1:654\n358#1:655,5\n359#1:660,2\n298#1:662,3\n302#1:644\n*E\n"})
public final class i extends FrameLayout {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f42574p2 = 8;

    @NotNull
    private final a H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ComposeView f42576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<e0> f42579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<String> f42580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m f42581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private String f42582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final d0 f42584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> f42585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private String f42587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f42588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42589o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final d f42590p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final b f42591p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final Paint f42592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private o0 f42593t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.compose.ui.tooling.animation.c0 f42594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e.a({"VisibleForTests"})
    @NotNull
    private final c f42595w;

    public static final class a implements androidx.activity.result.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0344a f42596a = new C0344a();

        /* JADX INFO: renamed from: androidx.compose.ui.tooling.i$a$a, reason: collision with other inner class name */
        public static final class C0344a extends androidx.activity.result.k {
            C0344a() {
            }

            @Override // androidx.activity.result.k
            public <I, O> void i(int i10, g.a<I, O> aVar, I i11, androidx.core.app.e eVar) {
                throw new IllegalStateException("Calling launch() is not supported in Preview");
            }
        }

        a() {
        }

        @Override // androidx.activity.result.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0344a getActivityResultRegistry() {
            return this.f42596a;
        }
    }

    public static final class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.activity.j0 f42597a = new androidx.activity.j0(null, 1, null);

        b() {
        }

        @Override // androidx.activity.m0
        public androidx.activity.j0 getOnBackPressedDispatcher() {
            return this.f42597a;
        }

        @Override // androidx.lifecycle.o0
        public q0 getLifecycle() {
            return i.this.f42595w.a();
        }
    }

    @SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,611:1\n1#2:612\n*E\n"})
    public static final class c implements androidx.savedstate.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0 f42599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.savedstate.l f42600b;

        c() {
            q0 q0VarA = q0.f52466k.a(this);
            this.f42599a = q0VarA;
            androidx.savedstate.l lVarB = androidx.savedstate.l.f75159c.b(this);
            lVarB.d(new Bundle());
            this.f42600b = lVarB;
            q0VarA.v(androidx.lifecycle.c0.b.RESUMED);
        }

        public final q0 a() {
            return this.f42599a;
        }

        @Override // androidx.savedstate.m
        public androidx.savedstate.j getSavedStateRegistry() {
            return this.f42600b.b();
        }

        @Override // androidx.lifecycle.o0
        public q0 getLifecycle() {
            return this.f42599a;
        }
    }

    public static final class d implements m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l2 f42601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l2 f42602b;

        d() {
            l2 l2Var = new l2();
            this.f42601a = l2Var;
            this.f42602b = l2Var;
        }

        @Override // androidx.lifecycle.m2
        public l2 getViewModelStore() {
            return this.f42602b;
        }
    }

    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f42604b;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f42604b = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-874838087, i10, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:390)");
            }
            q.e(i.this.f42581g, this.f42604b, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        g(Object obj) {
            super(0, obj, i.class, "requestLayout", "requestLayout()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((i) this.receiver).requestLayout();
        }
    }

    static final class h implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f42606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Class<? extends d1.h<?>> f42609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f42611g;

        @SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$init$3$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,611:1\n1282#2,6:612\n1282#2,6:618\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$init$3$1\n*L\n449#1:612,6\n478#1:618,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Class<? extends d1.h<?>> f42614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f42615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i f42616e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f42617f;

            a(String str, String str2, Class<? extends d1.h<?>> cls, int i10, i iVar, long j10) {
                this.f42612a = str;
                this.f42613b = str2;
                this.f42614c = cls;
                this.f42615d = i10;
                this.f42616e = iVar;
                this.f42617f = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit i(String str, String str2, androidx.compose.runtime.c0 c0Var, Class cls, int i10, i iVar) {
                Throwable cause;
                try {
                    androidx.compose.ui.tooling.a aVar = androidx.compose.ui.tooling.a.f42371a;
                    Object[] objArrF = v.f(cls, i10);
                    aVar.h(str, str2, c0Var, Arrays.copyOf(objArrF, objArrF.length));
                    return Unit.f312394a;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    while ((th3 instanceof ReflectiveOperationException) && (cause = th3.getCause()) != null) {
                        th3 = cause;
                    }
                    iVar.f42584j.a(th3);
                    throw th2;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(i iVar) {
                View childAt = iVar.getChildAt(0);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                u4 u4Var = childAt2 instanceof u4 ? (u4) childAt2 : null;
                if (u4Var != null) {
                    u4Var.S();
                }
                androidx.compose.runtime.snapshots.m.f36535e.y();
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
                final androidx.compose.runtime.c0 c0Var2;
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1310372571, i10, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:442)");
                }
                boolean zD = c0Var.D(this.f42612a) | c0Var.D(this.f42613b) | c0Var.k0(c0Var) | c0Var.k0(this.f42614c) | c0Var.K(this.f42615d) | c0Var.k0(this.f42616e);
                final String str = this.f42612a;
                final String str2 = this.f42613b;
                final Class<? extends d1.h<?>> cls = this.f42614c;
                final int i11 = this.f42615d;
                final i iVar = this.f42616e;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    c0Var2 = c0Var;
                    objI0 = new Function0() { // from class: androidx.compose.ui.tooling.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i.h.a.i(str, str2, c0Var2, cls, i11, iVar);
                        }
                    };
                    c0Var2.Y(objI0);
                } else {
                    c0Var2 = c0Var;
                }
                Function0 function0 = (Function0) objI0;
                if (this.f42617f >= 0) {
                    c0Var2.E(-349877568);
                    i iVar2 = this.f42616e;
                    boolean zK0 = c0Var2.k0(iVar2);
                    final i iVar3 = this.f42616e;
                    Object objI1 = c0Var2.i0();
                    if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.ui.tooling.k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i.h.a.k(iVar3);
                            }
                        };
                        c0Var2.Y(objI1);
                    }
                    iVar2.setClock$ui_tooling(new androidx.compose.ui.tooling.animation.c0((Function0) objI1));
                    c0Var2.A();
                } else {
                    c0Var2.E(-348650371);
                    c0Var2.A();
                }
                function0.invoke();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                f(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        h(Function0<Unit> function0, i iVar, String str, String str2, Class<? extends d1.h<?>> cls, int i10, long j10) {
            this.f42605a = function0;
            this.f42606b = iVar;
            this.f42607c = str;
            this.f42608d = str2;
            this.f42609e = cls;
            this.f42610f = i10;
            this.f42611g = j10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-658298446, i10, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:439)");
            }
            b2.m(this.f42605a, c0Var, 0);
            i iVar = this.f42606b;
            iVar.f(androidx.compose.runtime.internal.w.e(-1310372571, true, new a(this.f42607c, this.f42608d, this.f42609e, this.f42610f, iVar, this.f42611g), c0Var, 54), c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public i(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42575a = "ComposeViewAdapter";
        int i10 = 3 ^ 0;
        this.f42576b = new ComposeView(getContext(), null, 0, 6, null);
        this.f42579e = CollectionsKt.emptyList();
        this.f42580f = CollectionsKt.emptyList();
        this.f42581g = m.f42629a.a();
        this.f42582h = "";
        this.f42584j = new d0();
        this.f42585k = androidx.compose.ui.tooling.b.f42492a.b();
        this.f42587m = "";
        this.f42588n = new Function0() { // from class: androidx.compose.ui.tooling.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.D();
            }
        };
        this.f42589o = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(s0.t(androidx.compose.ui.graphics.q0.f38131b.q()));
        this.f42592s = paint;
        this.f42595w = new c();
        this.f42590p0 = new d();
        this.f42591p1 = new b();
        this.H1 = new a();
        w(attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A(i iVar, String str, String str2, Class cls, int i10, boolean z10, boolean z11, long j10, boolean z12, String str3, Function0 function0, Function0 function1, int i11, Object obj) {
        iVar.z(str, str2, (i11 & 4) != 0 ? null : cls, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? -1L : j10, (i11 & 128) != 0 ? false : z12, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? new Function0() { // from class: androidx.compose.ui.tooling.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.x();
            }
        } : function0, (i11 & 1024) != 0 ? new Function0() { // from class: androidx.compose.ui.tooling.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.y();
            }
        } : function1);
    }

    private final String B(Object obj, int i10, int i11) {
        Method methodP = p(obj);
        if (methodP == null) {
            return null;
        }
        try {
            Object objInvoke = methodP.invoke(obj, Integer.valueOf(i10), Integer.valueOf(i11), this.f42587m);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objInvoke;
            if (str.length() == 0) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean C(androidx.compose.ui.tooling.data.e eVar) {
        if (!v(eVar) || !eVar.b().isEmpty()) {
            return false;
        }
        androidx.compose.ui.tooling.data.g gVar = eVar instanceof androidx.compose.ui.tooling.data.g ? (androidx.compose.ui.tooling.data.g) eVar : null;
        Object objK = gVar != null ? gVar.k() : null;
        return (objK instanceof l0 ? (l0) objK : null) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D() {
        return Unit.f312394a;
    }

    private final void E() {
        Set<androidx.compose.runtime.tooling.f> setA = this.f42581g.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(F(androidx.compose.ui.tooling.data.j.d((androidx.compose.runtime.tooling.f) it.next())));
        }
        List<e0> list = CollectionsKt.toList(arrayList);
        if (this.f42589o) {
            list = c0.d(list);
        }
        this.f42579e = list;
        if (this.f42577c) {
            k0.j(list, 0, null, 3, null);
        }
    }

    private final e0 F(androidx.compose.ui.tooling.data.e eVar) {
        String strL;
        androidx.compose.ui.tooling.data.g gVar = eVar instanceof androidx.compose.ui.tooling.data.g ? (androidx.compose.ui.tooling.data.g) eVar : null;
        Object objK = gVar != null ? gVar.k() : null;
        l0 l0Var = objK instanceof l0 ? (l0) objK : null;
        if (eVar.b().size() == 1 && v(eVar) && l0Var == null) {
            return F((androidx.compose.ui.tooling.data.e) CollectionsKt.single(eVar.b()));
        }
        Collection<androidx.compose.ui.tooling.data.e> collectionB = eVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            if (!C((androidx.compose.ui.tooling.data.e) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(F((androidx.compose.ui.tooling.data.e) it.next()));
        }
        androidx.compose.ui.tooling.data.m mVarF = eVar.f();
        if (mVarF == null || (strL = mVarF.l()) == null) {
            strL = "";
        }
        String str = strL;
        androidx.compose.ui.tooling.data.m mVarF2 = eVar.f();
        return new e0(str, mVarF2 != null ? mVarF2.i() : -1, eVar.a(), eVar.f(), arrayList2, l0Var, eVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public final void f(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-265259911);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(this) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-265259911, i11, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:379)");
            }
            a1.f(new n4[]{q1.p().f(new r(getContext())), q1.o().f(androidx.compose.ui.text.font.h0.a(getContext())), androidx.activity.compose.j.f9826a.b(this.f42591p1), androidx.activity.compose.h.f9818a.b(this.H1)}, androidx.compose.runtime.internal.w.e(-874838087, true, new e(function2), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.ui.tooling.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.g(this.f42571a, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(i iVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        iVar.f(function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @l1
    public static /* synthetic */ void getClock$ui_tooling$annotations() {
    }

    private final void m() {
        Set<androidx.compose.runtime.tooling.f> setA = this.f42581g.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.compose.ui.tooling.data.j.d((androidx.compose.runtime.tooling.f) it.next()));
        }
        boolean z10 = this.f42594v != null;
        androidx.compose.ui.tooling.animation.q qVar = new androidx.compose.ui.tooling.animation.q(new t0(this) { // from class: androidx.compose.ui.tooling.i.f
            @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
            public Object get() {
                return ((i) this.receiver).getClock$ui_tooling();
            }

            @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
            public void set(Object obj) {
                ((i) this.receiver).setClock$ui_tooling((androidx.compose.ui.tooling.animation.c0) obj);
            }
        }, new g(this));
        boolean zS = qVar.s(arrayList);
        this.f42583i = zS;
        if (z10 && zS) {
            qVar.o(arrayList);
        }
    }

    private final void n() {
        Set<androidx.compose.runtime.tooling.f> setA = this.f42581g.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.compose.ui.tooling.data.j.d((androidx.compose.runtime.tooling.f) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<androidx.compose.ui.tooling.data.e> listB = v.b((androidx.compose.ui.tooling.data.e) it2.next(), new Function1() { // from class: androidx.compose.ui.tooling.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(i.o(this.f42562a, (androidx.compose.ui.tooling.data.e) obj));
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (androidx.compose.ui.tooling.data.e eVar : listB) {
                String strQ = q(eVar, eVar.a());
                if (strQ == null) {
                    Iterator<T> it3 = eVar.b().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            strQ = null;
                            break;
                        }
                        String strQ2 = q((androidx.compose.ui.tooling.data.e) it3.next(), eVar.a());
                        if (strQ2 != null) {
                            strQ = strQ2;
                            break;
                        }
                    }
                }
                if (strQ != null) {
                    arrayList3.add(strQ);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        this.f42580f = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(i iVar, androidx.compose.ui.tooling.data.e eVar) {
        if (Intrinsics.areEqual(eVar.h(), "remember") || !iVar.u(eVar)) {
            Collection<androidx.compose.ui.tooling.data.e> collectionB = eVar.b();
            if (!(collectionB instanceof Collection) || !collectionB.isEmpty()) {
                for (androidx.compose.ui.tooling.data.e eVar2 : collectionB) {
                    if (!Intrinsics.areEqual(eVar2.h(), "remember") || !iVar.u(eVar2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final Method p(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String q(androidx.compose.ui.tooling.data.e eVar, androidx.compose.ui.unit.s sVar) {
        String strB;
        Iterator<T> it = eVar.c().iterator();
        do {
            strB = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                strB = B(next, sVar.t(), sVar.x());
            }
        } while (strB == null);
        return strB;
    }

    private final String r(androidx.compose.ui.tooling.data.e eVar) {
        String strL;
        androidx.compose.ui.tooling.data.m mVarF = eVar.f();
        return (mVarF == null || (strL = mVarF.l()) == null) ? "" : strL;
    }

    private final int s(androidx.compose.ui.tooling.data.e eVar) {
        androidx.compose.ui.tooling.data.m mVarF = eVar.f();
        if (mVarF != null) {
            return mVarF.i();
        }
        return -1;
    }

    private final boolean u(androidx.compose.ui.tooling.data.e eVar) {
        Collection<Object> collectionC = eVar.c();
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? p(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean v(androidx.compose.ui.tooling.data.e eVar) {
        return r(eVar).length() == 0 && s(eVar) == -1;
    }

    private final void w(AttributeSet attributeSet) {
        long j10;
        n2.b(this, this.f42595w);
        androidx.savedstate.r.b(this, this.f42595w);
        p2.b(this, this.f42590p0);
        addView(this.f42576b);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String strA5 = StringsKt.A5(attributeValue, '.', null, 2, null);
        String strS5 = StringsKt.s5(attributeValue, '.', null, 2, null);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends d1.h<?>> clsA = attributeValue2 != null ? v.a(attributeValue2) : null;
        try {
            j10 = Long.parseLong(attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j10 = -1;
        }
        A(this, strA5, strS5, clsA, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.f42578d), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.f42577c), j10, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.f42586l), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 1536, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y() {
        return Unit.f312394a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f42588n.invoke();
        if (this.f42578d) {
            List<e0> list = this.f42579e;
            ArrayList<e0> arrayList = new ArrayList();
            for (e0 e0Var : list) {
                CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(e0Var), (Iterable) e0Var.a()));
            }
            for (e0 e0Var2 : arrayList) {
                if (e0Var2.r()) {
                    canvas.drawRect(new Rect(e0Var2.k().t(), e0Var2.k().B(), e0Var2.k().x(), e0Var2.k().j()), this.f42592s);
                }
            }
        }
    }

    @NotNull
    public final androidx.compose.ui.tooling.animation.c0 getClock$ui_tooling() {
        return this.f42594v;
    }

    @NotNull
    public final List<String> getDesignInfoList$ui_tooling() {
        return this.f42580f;
    }

    public final boolean getStitchTrees$ui_tooling() {
        return this.f42589o;
    }

    @NotNull
    public final List<e0> getViewInfos$ui_tooling() {
        return this.f42579e;
    }

    public final void l() {
        this.f42576b.disposeComposition();
        if (this.f42594v != null) {
            getClock$ui_tooling().l();
        }
        this.f42595w.a().v(androidx.lifecycle.c0.b.DESTROYED);
        this.f42590p0.getViewModelStore().a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        n2.b(this.f42576b.getRootView(), this.f42595w);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f42584j.b();
        E();
        if (this.f42582h.length() > 0) {
            m();
            if (this.f42586l) {
                n();
            }
        }
    }

    public final void setClock$ui_tooling(@NotNull androidx.compose.ui.tooling.animation.c0 c0Var) {
        this.f42594v = c0Var;
    }

    public final void setDesignInfoList$ui_tooling(@NotNull List<String> list) {
        this.f42580f = list;
    }

    public final void setStitchTrees$ui_tooling(boolean z10) {
        this.f42589o = z10;
    }

    public final void setViewInfos$ui_tooling(@NotNull List<e0> list) {
        this.f42579e = list;
    }

    public final boolean t() {
        return this.f42583i;
    }

    @l1
    public final void z(@NotNull String str, @NotNull String str2, @Nullable Class<? extends d1.h<?>> cls, int i10, boolean z10, boolean z11, long j10, boolean z12, @Nullable String str3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this.f42578d = z10;
        this.f42577c = z11;
        this.f42582h = str2;
        this.f42586l = z12;
        if (str3 == null) {
            str3 = "";
        }
        this.f42587m = str3;
        this.f42588n = function1;
        androidx.compose.runtime.internal.c cVarC = androidx.compose.runtime.internal.w.c(-658298446, true, new h(function0, this, str, str2, cls, i10, j10));
        this.f42585k = cVarC;
        this.f42576b.setContent(cVarC);
        invalidate();
    }

    public i(@NotNull Context context, @NotNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42575a = "ComposeViewAdapter";
        this.f42576b = new ComposeView(getContext(), null, 0, 6, null);
        this.f42579e = CollectionsKt.emptyList();
        this.f42580f = CollectionsKt.emptyList();
        this.f42581g = m.f42629a.a();
        this.f42582h = "";
        this.f42584j = new d0();
        this.f42585k = androidx.compose.ui.tooling.b.f42492a.b();
        this.f42587m = "";
        this.f42588n = new Function0() { // from class: androidx.compose.ui.tooling.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.D();
            }
        };
        this.f42589o = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(s0.t(androidx.compose.ui.graphics.q0.f38131b.q()));
        this.f42592s = paint;
        this.f42595w = new c();
        this.f42590p0 = new d();
        this.f42591p1 = new b();
        this.H1 = new a();
        w(attributeSet);
    }
}
