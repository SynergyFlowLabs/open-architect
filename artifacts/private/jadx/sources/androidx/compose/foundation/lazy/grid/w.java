package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,103:1\n1#2:104\n905#3:105\n*S KotlinDebug\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n*L\n86#1:105\n*E\n"})
public final class w extends androidx.compose.foundation.lazy.layout.y<q> implements f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f17039f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17040g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Function2<h0, Integer, androidx.compose.foundation.lazy.grid.c> f17041h = new Function2() { // from class: androidx.compose.foundation.lazy.grid.v
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return w.N((h0) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o1 f17042b = new o1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j2<q> f17043c = new j2<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.collection.r1 f17045e;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function2<h0, Integer, androidx.compose.foundation.lazy.grid.c> a() {
            return w.f17041h;
        }

        private a() {
        }
    }

    static final class b implements pj.o<f0, Integer, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<f0, androidx.compose.runtime.c0, Integer, Unit> f17046a;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super f0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f17046a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(f0 f0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= c0Var.D(f0Var) ? 4 : 2;
            }
            if (!c0Var.h((i11 & 131) != 130, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-291643851, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            this.f17046a.invoke(f0Var, c0Var, Integer.valueOf(i11 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(f0Var, num.intValue(), c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.n<f0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<f0, Integer, androidx.compose.runtime.c0, Integer, Unit> f17047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17048b;

        /* JADX WARN: Multi-variable type inference failed */
        c(pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, int i10) {
            this.f17047a = oVar;
            this.f17048b = i10;
        }

        @androidx.compose.runtime.o
        public final void c(f0 f0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= c0Var.D(f0Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(46791243, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
            }
            this.f17047a.invoke(f0Var, Integer.valueOf(this.f17048b), c0Var, Integer.valueOf(i10 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(f0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public w(@NotNull Function1<? super f1, Unit> function1) {
        function1.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.c N(h0 h0Var, int i10) {
        return androidx.compose.foundation.lazy.grid.c.a(m1.a(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.c U(Function1 function1, h0 h0Var, int i10) {
        return (androidx.compose.foundation.lazy.grid.c) function1.invoke(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.c X(h0 h0Var) {
        return androidx.compose.foundation.lazy.grid.c.a(m1.a(h0Var.b()));
    }

    @Override // androidx.compose.foundation.lazy.grid.f1
    public void C(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable Function2<? super h0, ? super Integer, androidx.compose.foundation.lazy.grid.c> function2, @NotNull Function1<? super Integer, ? extends Object> function3, @NotNull pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        E().c(i10, new q(function1, function2 == null ? f17041h : function2, function3, oVar));
        if (function2 != null) {
            this.f17044d = true;
        }
    }

    public final boolean P() {
        return this.f17044d;
    }

    @NotNull
    public final androidx.collection.f0 Q() {
        androidx.collection.r1 r1Var = this.f17045e;
        return r1Var != null ? r1Var : androidx.collection.g0.c();
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public j2<q> E() {
        return this.f17043c;
    }

    @NotNull
    public final o1 S() {
        return this.f17042b;
    }

    public final void W(boolean z10) {
        this.f17044d = z10;
    }

    @Override // androidx.compose.foundation.lazy.grid.f1
    public void a(@Nullable Object obj, @Nullable Object obj2, @NotNull pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        androidx.collection.r1 r1Var = this.f17045e;
        if (r1Var == null) {
            r1Var = new androidx.collection.r1(0, 1, null);
            this.f17045e = r1Var;
        }
        int size = E().getSize();
        r1Var.b0(size);
        f(obj, new Function1() { // from class: androidx.compose.foundation.lazy.grid.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return w.X((h0) obj3);
            }
        }, obj2, androidx.compose.runtime.internal.w.c(46791243, true, new c(oVar, size)));
    }

    @Override // androidx.compose.foundation.lazy.grid.f1
    public void f(@Nullable final Object obj, @Nullable final Function1<? super h0, androidx.compose.foundation.lazy.grid.c> function1, @Nullable final Object obj2, @NotNull pj.n<? super f0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        E().c(1, new q(obj != null ? new Function1() { // from class: androidx.compose.foundation.lazy.grid.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return w.T(obj, ((Integer) obj3).intValue());
            }
        } : null, function1 != null ? new Function2() { // from class: androidx.compose.foundation.lazy.grid.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                return w.U(function1, (h0) obj3, ((Integer) obj4).intValue());
            }
        } : f17041h, new Function1() { // from class: androidx.compose.foundation.lazy.grid.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return w.V(obj2, ((Integer) obj3).intValue());
            }
        }, androidx.compose.runtime.internal.w.c(-291643851, true, new b(nVar))));
        if (function1 != null) {
            this.f17044d = true;
        }
    }
}
