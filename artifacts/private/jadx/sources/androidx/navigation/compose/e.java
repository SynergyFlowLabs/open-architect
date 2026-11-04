package androidx.navigation.compose;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.navigation.q3;
import androidx.navigation.w2;
import androidx.navigation.y1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@q3.b(e.f70674g)
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1863#2,2:143\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n57#1:143,2\n*E\n"})
public final class e extends q3<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f70672e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f70673f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f70674g = "composable";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3<Boolean> f70675d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e() {
        super(f70674g);
        this.f70675d = d7.g(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<androidx.navigation.n0> list, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e().m((androidx.navigation.n0) it.next());
        }
        this.f70675d.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.q3
    public void o(@NotNull androidx.navigation.n0 n0Var, boolean z10) {
        e().j(n0Var, z10);
        this.f70675d.setValue(Boolean.TRUE);
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this, androidx.navigation.compose.b.f70640a.a());
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<List<androidx.navigation.n0>> r() {
        return e().c();
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<Set<androidx.navigation.n0>> s() {
        return e().d();
    }

    @NotNull
    public final n3<Boolean> t() {
        return this.f70675d;
    }

    public final void u(@NotNull androidx.navigation.n0 n0Var) {
        e().f(n0Var);
    }

    public final void v(@NotNull androidx.navigation.n0 n0Var) {
        e().k(n0Var);
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @y1.a(androidx.compose.runtime.o.class)
    public static final class b extends y1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f70676n = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70681l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> f70682m;

        static final class a implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70683a;

            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f70683a = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, int i10) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1587956030, i10, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:109)");
                }
                this.f70683a.invoke(n0Var, c0Var, Integer.valueOf((i10 >> 3) & 14));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
                c(gVar, n0Var, c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull e eVar, @NotNull pj.o<? super androidx.compose.animation.g, androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
            super(eVar);
            this.f70677h = oVar;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> A0() {
            return this.f70679j;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> D0() {
            return this.f70680k;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> E0() {
            return this.f70681l;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> F0() {
            return this.f70682m;
        }

        public final void G0(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
            this.f70678i = function1;
        }

        public final void I0(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
            this.f70679j = function1;
        }

        public final void J0(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
            this.f70680k = function1;
        }

        public final void K0(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
            this.f70681l = function1;
        }

        public final void L0(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function1) {
            this.f70682m = function1;
        }

        @NotNull
        public final pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> v0() {
            return this.f70677h;
        }

        @Nullable
        public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> z0() {
            return this.f70678i;
        }

        @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public /* synthetic */ b(e eVar, pj.n nVar) {
            this(eVar, (pj.o<? super androidx.compose.animation.g, androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit>) androidx.compose.runtime.internal.w.c(1587956030, true, new a(nVar)));
        }
    }
}
