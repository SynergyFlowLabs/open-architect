package androidx.paging;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nLegacyPagingSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n+ 2 PagingState.kt\nandroidx/paging/PagingState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n142#2,8:149\n1#3:157\n*S KotlinDebug\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n*L\n128#1:149,8\n*E\n"})
public final class s0<Key, Value> extends h2<Key, Value> implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f72557d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f72558e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f72559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u<Key, Value> f72560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72561c;

    /* synthetic */ class a implements u.d, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s0<Key, Value> f72562a;

        a(s0<Key, Value> s0Var) {
            this.f72562a = s0Var;
        }

        @Override // androidx.paging.u.d
        public final void a() {
            this.f72562a.invalidate();
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return new kotlin.jvm.internal.g0(0, this.f72562a, s0.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof u.d) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s0<Key, Value> f72563a;

        /* synthetic */ class a implements u.d, kotlin.jvm.internal.c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s0<Key, Value> f72564a;

            a(s0<Key, Value> s0Var) {
                this.f72564a = s0Var;
            }

            @Override // androidx.paging.u.d
            public final void a() {
                this.f72564a.invalidate();
            }

            @Override // kotlin.jvm.internal.c0
            @NotNull
            public final kotlin.x<?> b() {
                return new kotlin.jvm.internal.g0(0, this.f72564a, s0.class, "invalidate", "invalidate()V", 0);
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof u.d) && (obj instanceof kotlin.jvm.internal.c0)) {
                    return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s0<Key, Value> s0Var) {
            super(0);
            this.f72563a = s0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f72563a.b().r(new a(this.f72563a));
            this.f72563a.b().h();
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72565a;

        static {
            int[] iArr = new int[u.e.values().length];
            try {
                iArr[u.e.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.e.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.e.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72565a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvm.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super h2.b.c<Key, Value>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0<Key, Value> f72567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u.f<Key> f72568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h2.a<Key> f72569d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(s0<Key, Value> s0Var, u.f<Key> fVar, h2.a<Key> aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f72567b = s0Var;
            this.f72568c = fVar;
            this.f72569d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new e(this.f72567b, this.f72568c, this.f72569d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72566a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u<Key, Value> uVarB = this.f72567b.b();
                u.f<Key> fVar = this.f72568c;
                this.f72566a = 1;
                obj = uVarB.k(fVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            h2.a<Key> aVar = this.f72569d;
            u.a aVar2 = (u.a) obj;
            List<Value> list = aVar2.f72623a;
            return new h2.b.c(list, (list.isEmpty() && (aVar instanceof h2.a.c)) ? null : aVar2.d(), (aVar2.f72623a.isEmpty() && (aVar instanceof h2.a.C0661a)) ? null : aVar2.c(), aVar2.b(), aVar2.a());
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super h2.b.c<Key, Value>> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public s0(@NotNull CoroutineContext fetchContext, @NotNull u<Key, Value> dataSource) {
        Intrinsics.checkNotNullParameter(fetchContext, "fetchContext");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f72559a = fetchContext;
        this.f72560b = dataSource;
        this.f72561c = Integer.MIN_VALUE;
        dataSource.c(new a(this));
        registerInvalidatedCallback(new b(this));
    }

    private final int c(h2.a<Key> aVar) {
        return ((aVar instanceof h2.a.d) && aVar.b() % 3 == 0) ? aVar.b() / 3 : aVar.b();
    }

    @Override // androidx.paging.p
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void a(int i10) {
        int i11 = this.f72561c;
        if (i11 == Integer.MIN_VALUE || i10 == i11) {
            this.f72561c = i10;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f72561c + '.').toString());
    }

    @NotNull
    public final u<Key, Value> b() {
        return this.f72560b;
    }

    @Override // androidx.paging.h2
    public boolean getJumpingSupported() {
        return this.f72560b.g() == u.e.POSITIONAL;
    }

    @Override // androidx.paging.h2
    @Nullable
    public Key getRefreshKey(@NotNull j2<Key, Value> state) {
        Object objA;
        Value valueC;
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = d.f72565a[this.f72560b.g().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return null;
            }
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            Integer numF = state.f();
            if (numF == null || (valueC = state.c(numF.intValue())) == null) {
                return null;
            }
            return this.f72560b.e(valueC);
        }
        Integer numF2 = state.f();
        if (numF2 == null) {
            return null;
        }
        int iIntValue = numF2.intValue();
        int size = iIntValue - ((j2) state).f72293d;
        for (int i11 = 0; i11 < CollectionsKt.getLastIndex(state.h()) && size > CollectionsKt.getLastIndex(state.h().get(i11).t()); i11++) {
            size -= state.h().get(i11).t().size();
        }
        h2.b.c<Key, Value> cVarD = state.d(iIntValue);
        if (cVarD == null || (objA = cVarD.A()) == null) {
            objA = 0;
        }
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Int");
        return (Key) Integer.valueOf(((Integer) objA).intValue() + size);
    }

    @Override // androidx.paging.h2
    @Nullable
    public Object load(@NotNull h2.a<Key> aVar, @NotNull kotlin.coroutines.d<? super h2.b<Key, Value>> dVar) {
        a1 a1Var;
        if (aVar instanceof h2.a.d) {
            a1Var = a1.REFRESH;
        } else if (aVar instanceof h2.a.C0661a) {
            a1Var = a1.APPEND;
        } else {
            if (!(aVar instanceof h2.a.c)) {
                throw new kotlin.k0();
            }
            a1Var = a1.PREPEND;
        }
        a1 a1Var2 = a1Var;
        if (this.f72561c == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f72561c = c(aVar);
        }
        return kotlinx.coroutines.i.h(this.f72559a, new e(this, new u.f(a1Var2, aVar.a(), aVar.b(), aVar.c(), this.f72561c), aVar, null), dVar);
    }
}
