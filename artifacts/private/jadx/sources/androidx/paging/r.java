package androidx.paging;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
@SourceDebugExtension({"SMAP\nContiguousPagedList.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContiguousPagedList.jvm.kt\nandroidx/paging/ContiguousPagedList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1#2:409\n*E\n"})
public class r<K, V> extends q1<V> implements u1.a, r0.b<V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final a f72505p0 = new a(null);
    private boolean X;
    private final boolean Y;

    @NotNull
    private final r0<K, V> Z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final h2<K, V> f72506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final q1.a<V> f72507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final K f72508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f72509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f72510o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f72511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f72512t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f72513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f72514w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10, int i11, int i12) {
            return ((i11 + i10) + 1) - i12;
        }

        public final int b(int i10, int i11, int i12) {
            return i10 - (i11 - i12);
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<K, V> f72517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f72518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f72519e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, r<K, V> rVar, boolean z11, boolean z12, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f72516b = z10;
            this.f72517c = rVar;
            this.f72518d = z11;
            this.f72519e = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f72516b, this.f72517c, this.f72518d, this.f72519e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72515a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f72516b) {
                this.f72517c.z0().c();
            }
            if (this.f72518d) {
                ((r) this.f72517c).f72511s = true;
            }
            if (this.f72519e) {
                ((r) this.f72517c).f72512t = true;
            }
            this.f72517c.E0(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r<K, V> f72521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f72522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f72523d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r<K, V> rVar, boolean z10, boolean z11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f72521b = rVar;
            this.f72522c = z10;
            this.f72523d = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f72521b, this.f72522c, this.f72523d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72520a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f72521b.v0(this.f72522c, this.f72523d);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull h2<K, V> pagingSource, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull kotlinx.coroutines.n0 backgroundDispatcher, @Nullable q1.a<V> aVar, @NotNull q1.e config, @NotNull h2.b.c<K, V> initialPage, @Nullable K k10) {
        super(pagingSource, coroutineScope, notifyDispatcher, new u1(), config);
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        this.f72506k = pagingSource;
        this.f72507l = aVar;
        this.f72508m = k10;
        this.f72513v = Integer.MAX_VALUE;
        this.f72514w = Integer.MIN_VALUE;
        this.Y = config.f72470e != Integer.MAX_VALUE;
        u1<V> u1VarR = R();
        Intrinsics.checkNotNull(u1VarR, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.Z = new r0<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, u1VarR);
        if (config.f72468c) {
            R().w(initialPage.v() != Integer.MIN_VALUE ? initialPage.v() : 0, initialPage, initialPage.u() != Integer.MIN_VALUE ? initialPage.u() : 0, 0, this, (initialPage.v() == Integer.MIN_VALUE || initialPage.u() == Integer.MIN_VALUE) ? false : true);
        } else {
            R().w(0, initialPage, 0, initialPage.v() != Integer.MIN_VALUE ? initialPage.v() : 0, this, false);
        }
        D0(a1.REFRESH, initialPage.t());
    }

    public static /* synthetic */ void A0() {
    }

    private static /* synthetic */ void C0() {
    }

    private final void D0(a1 a1Var, List<? extends V> list) {
        if (this.f72507l != null) {
            boolean z10 = false;
            boolean z11 = R().size() == 0;
            boolean z12 = !z11 && a1Var == a1.PREPEND && list.isEmpty();
            if (!z11 && a1Var == a1.APPEND && list.isEmpty()) {
                z10 = true;
            }
            u0(z11, z12, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(boolean z10) {
        boolean z11 = true;
        boolean z12 = this.f72511s && this.f72513v <= B().f72467b;
        if (!this.f72512t || this.f72514w < (size() - 1) - B().f72467b) {
            z11 = false;
        }
        if (z12 || z11) {
            if (z12) {
                this.f72511s = false;
            }
            if (z11) {
                this.f72512t = false;
            }
            if (z10) {
                kotlinx.coroutines.k.f(C(), K(), null, new c(this, z12, z11, null), 2, null);
            } else {
                v0(z12, z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(boolean z10, boolean z11) {
        if (z10) {
            q1.a<V> aVar = this.f72507l;
            Intrinsics.checkNotNull(aVar);
            aVar.b(R().p());
        }
        if (z11) {
            q1.a<V> aVar2 = this.f72507l;
            Intrinsics.checkNotNull(aVar2);
            aVar2.a(R().s());
        }
    }

    @Override // androidx.paging.q1
    @Nullable
    public K G() {
        K refreshKey;
        j2<?, V> j2VarV = R().v(B());
        return (j2VarV == null || (refreshKey = this.f72506k.getRefreshKey(j2VarV)) == null) ? this.f72508m : refreshKey;
    }

    @Override // androidx.paging.q1
    @NotNull
    public final h2<K, V> L() {
        return this.f72506k;
    }

    @Override // androidx.paging.q1
    public boolean S() {
        return this.Z.k();
    }

    @Override // androidx.paging.q1
    @androidx.annotation.l0
    public void W(int i10) {
        a aVar = f72505p0;
        int iB = aVar.b(B().f72467b, i10, R().i());
        int iA = aVar.a(B().f72467b, i10, R().i() + R().c());
        int iMax = Math.max(iB, this.f72509n);
        this.f72509n = iMax;
        if (iMax > 0) {
            this.Z.u();
        }
        int iMax2 = Math.max(iA, this.f72510o);
        this.f72510o = iMax2;
        if (iMax2 > 0) {
            this.Z.t();
        }
        this.f72513v = Math.min(this.f72513v, i10);
        this.f72514w = Math.max(this.f72514w, i10);
        E0(true);
    }

    @Override // androidx.paging.u1.a
    @androidx.annotation.l0
    public void c(int i10, int i11, int i12) {
        Y(i10, i11);
        Z(0, i12);
        this.f72513v += i12;
        this.f72514w += i12;
    }

    @Override // androidx.paging.r0.b
    public boolean d(@NotNull a1 type, @NotNull h2.b.c<?, V> page) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(page, "page");
        List<? extends V> listT = page.t();
        boolean z10 = true;
        boolean z11 = U() > R().t();
        boolean z12 = this.Y && R().M(B().f72470e, P(), listT.size());
        a1 a1Var = a1.APPEND;
        if (type == a1Var) {
            if (!z12 || z11) {
                R().d(page, this);
                int size = this.f72510o - listT.size();
                this.f72510o = size;
                if (size <= 0 || listT.isEmpty()) {
                }
            } else {
                this.f72510o = 0;
            }
            z10 = false;
        } else {
            if (type != a1.PREPEND) {
                throw new IllegalArgumentException("unexpected result type " + type);
            }
            if (z12 && z11) {
                this.f72509n = 0;
            } else {
                R().G(page, this);
                int size2 = this.f72509n - listT.size();
                this.f72509n = size2;
                if (size2 <= 0 || listT.isEmpty()) {
                }
            }
            z10 = false;
        }
        if (this.Y) {
            if (z11) {
                if (!(this.Z.g().d() instanceof x0.b) && R().Q(this.X, B().f72470e, P(), this)) {
                    this.Z.g().i(a1.PREPEND, x0.c.f72693b.b());
                }
            } else if (!(this.Z.g().b() instanceof x0.b) && R().P(this.X, B().f72470e, P(), this)) {
                this.Z.g().i(a1Var, x0.c.f72693b.b());
            }
        }
        D0(type, listT);
        return z10;
    }

    @Override // androidx.paging.q1
    public void h0() {
        Runnable runnableO;
        super.h0();
        this.Z.o();
        if ((this.Z.g().c() instanceof x0.a) && (runnableO = O()) != null) {
            runnableO.run();
        }
    }

    @Override // androidx.paging.u1.a
    @androidx.annotation.l0
    public void i(int i10) {
        Z(0, i10);
        this.X = R().i() > 0 || R().k() > 0;
    }

    @Override // androidx.paging.q1
    public void i0(@NotNull a1 loadType, @NotNull x0 loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.Z.g().i(loadType, loadState);
    }

    @Override // androidx.paging.r0.b
    public void k(@NotNull a1 type, @NotNull x0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        A(type, state);
    }

    @Override // androidx.paging.u1.a
    public void l(int i10, int i11) {
        Y(i10, i11);
    }

    @Override // androidx.paging.u1.a
    public void m(int i10, int i11) {
        a0(i10, i11);
    }

    @Override // androidx.paging.u1.a
    @androidx.annotation.l0
    public void n(int i10, int i11, int i12) {
        Y(i10, i11);
        Z(i10 + i11, i12);
    }

    @androidx.annotation.d
    public final void u0(boolean z10, boolean z11, boolean z12) {
        if (this.f72507l == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.f72513v == Integer.MAX_VALUE) {
            this.f72513v = R().size();
        }
        if (this.f72514w == Integer.MIN_VALUE) {
            this.f72514w = 0;
        }
        if (z10 || z11 || z12) {
            kotlinx.coroutines.k.f(C(), K(), null, new b(z10, this, z11, z12, null), 2, null);
        }
    }

    @Override // androidx.paging.q1
    public void v() {
        this.Z.e();
    }

    @Override // androidx.paging.q1
    public void w(@NotNull Function2<? super a1, ? super x0, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.Z.g().a(callback);
    }

    @Nullable
    public final q1.a<V> z0() {
        return this.f72507l;
    }
}
