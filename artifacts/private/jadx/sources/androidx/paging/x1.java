package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class x1<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final d f72696e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final h3 f72697f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final h0 f72698g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<g1<T>> f72699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h3 f72700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h0 f72701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<g1.b<T>> f72702d;

    static final class a extends kotlin.jvm.internal.l0 implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f72703a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final class b implements h0 {
        b() {
        }

        @Override // androidx.paging.h0
        public void a(@NotNull j3 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        }
    }

    public static final class c implements h3 {
        c() {
        }

        @Override // androidx.paging.h3
        public void Z() {
        }

        @Override // androidx.paging.h3
        public void a() {
        }
    }

    public static final class d {

        static final class a extends kotlin.jvm.internal.l0 implements Function0<g1.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f72704a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final g1.b<T> invoke() {
                return g1.b.f71933g.e(CollectionsKt.listOf(new g3(0, CollectionsKt.emptyList())), 0, 0, z0.f72792f.a(), null);
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function0<g1.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f72705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f72706b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z0 z0Var, z0 z0Var2) {
                super(0);
                this.f72705a = z0Var;
                this.f72706b = z0Var2;
                int i10 = 3 | 0;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final g1.b<T> invoke() {
                return g1.b.f71933g.e(CollectionsKt.listOf(new g3(0, CollectionsKt.emptyList())), 0, 0, this.f72705a, this.f72706b);
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function0<g1.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<T> f72707a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends T> list) {
                super(0);
                this.f72707a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final g1.b<T> invoke() {
                return g1.b.f71933g.e(CollectionsKt.listOf(new g3(0, this.f72707a)), 0, 0, z0.f72792f.a(), null);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.x1$d$d, reason: collision with other inner class name */
        static final class C0684d extends kotlin.jvm.internal.l0 implements Function0<g1.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<T> f72708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z0 f72709b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0 f72710c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0684d(List<? extends T> list, z0 z0Var, z0 z0Var2) {
                super(0);
                this.f72708a = list;
                this.f72709b = z0Var;
                this.f72710c = z0Var2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final g1.b<T> invoke() {
                return g1.b.f71933g.e(CollectionsKt.listOf(new g3(0, this.f72708a)), 0, 0, this.f72709b, this.f72710c);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ x1 d(d dVar, z0 z0Var, z0 z0Var2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z0Var2 = null;
            }
            return dVar.c(z0Var, z0Var2);
        }

        public static /* synthetic */ x1 h(d dVar, List list, z0 z0Var, z0 z0Var2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z0Var2 = null;
            }
            return dVar.g(list, z0Var, z0Var2);
        }

        @oj.n
        @NotNull
        public final <T> x1<T> a() {
            return new x1<>(kotlinx.coroutines.flow.k.N0(new g1.d(CollectionsKt.emptyList(), null, null)), j(), i(), a.f72704a);
        }

        @oj.j
        @oj.n
        @NotNull
        public final <T> x1<T> b(@NotNull z0 sourceLoadStates) {
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return d(this, sourceLoadStates, null, 2, null);
        }

        @oj.j
        @oj.n
        @NotNull
        public final <T> x1<T> c(@NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new x1<>(kotlinx.coroutines.flow.k.N0(new g1.d(CollectionsKt.emptyList(), sourceLoadStates, z0Var)), j(), i(), new b(sourceLoadStates, z0Var));
        }

        @oj.n
        @NotNull
        public final <T> x1<T> e(@NotNull List<? extends T> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new x1<>(kotlinx.coroutines.flow.k.N0(new g1.d(data, null, null)), j(), i(), new c(data));
        }

        @oj.j
        @oj.n
        @NotNull
        public final <T> x1<T> f(@NotNull List<? extends T> data, @NotNull z0 sourceLoadStates) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return h(this, data, sourceLoadStates, null, 4, null);
        }

        @oj.j
        @oj.n
        @NotNull
        public final <T> x1<T> g(@NotNull List<? extends T> data, @NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new x1<>(kotlinx.coroutines.flow.k.N0(new g1.d(data, sourceLoadStates, z0Var)), j(), i(), new C0684d(data, sourceLoadStates, z0Var));
        }

        @NotNull
        public final h0 i() {
            return x1.f72698g;
        }

        @NotNull
        public final h3 j() {
            return x1.f72697f;
        }

        private d() {
        }
    }

    static {
        int i10 = 6 | 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x1(@NotNull kotlinx.coroutines.flow.i<? extends g1<T>> flow, @NotNull h3 uiReceiver, @NotNull h0 hintReceiver, @NotNull Function0<g1.b<T>> cachedPageEvent) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(uiReceiver, "uiReceiver");
        Intrinsics.checkNotNullParameter(hintReceiver, "hintReceiver");
        Intrinsics.checkNotNullParameter(cachedPageEvent, "cachedPageEvent");
        this.f72699a = flow;
        this.f72700b = uiReceiver;
        this.f72701c = hintReceiver;
        this.f72702d = cachedPageEvent;
    }

    @oj.n
    @NotNull
    public static final <T> x1<T> d() {
        return f72696e.a();
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> x1<T> e(@NotNull z0 z0Var) {
        return f72696e.b(z0Var);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> x1<T> f(@NotNull z0 z0Var, @Nullable z0 z0Var2) {
        return f72696e.c(z0Var, z0Var2);
    }

    @oj.n
    @NotNull
    public static final <T> x1<T> g(@NotNull List<? extends T> list) {
        return f72696e.e(list);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> x1<T> h(@NotNull List<? extends T> list, @NotNull z0 z0Var) {
        return f72696e.f(list, z0Var);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final <T> x1<T> i(@NotNull List<? extends T> list, @NotNull z0 z0Var, @Nullable z0 z0Var2) {
        return f72696e.g(list, z0Var, z0Var2);
    }

    @Nullable
    public final g1.b<T> c() {
        return this.f72702d.invoke();
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<g1<T>> j() {
        return this.f72699a;
    }

    @NotNull
    public final h0 k() {
        return this.f72701c;
    }

    @NotNull
    public final h3 l() {
        return this.f72700b;
    }

    public /* synthetic */ x1(kotlinx.coroutines.flow.i iVar, h3 h3Var, h0 h0Var, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, h3Var, h0Var, (i10 & 8) != 0 ? a.f72703a : function0);
    }
}
