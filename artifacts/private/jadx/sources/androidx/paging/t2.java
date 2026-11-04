package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n*L\n439#1:461,2\n*E\n"})
final class t2<Key, Value> implements u2<Key, Value> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f72577e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f72578f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f72579g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f72580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s2<Key, Value> f72581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.paging.b<Key, Value> f72582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c3 f72583d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72584a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72584a = iArr;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f72585a = new c();

        c() {
            super(1);
        }

        public final void c(@NotNull androidx.paging.a<Key, Value> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.l(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((androidx.paging.a) obj);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {0}, l = {445}, m = "initialize", n = {"this"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t2<Key, Value> f72588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72589d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t2<Key, Value> t2Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f72588c = t2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72587b = obj;
            this.f72589d |= Integer.MIN_VALUE;
            return this.f72588c.a(this);
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f72590a = new e();

        e() {
            super(1);
        }

        public final void c(@NotNull androidx.paging.a<Key, Value> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a1 a1Var = a1.APPEND;
            androidx.paging.a.EnumC0634a enumC0634a = androidx.paging.a.EnumC0634a.REQUIRES_REFRESH;
            it.j(a1Var, enumC0634a);
            it.j(a1.PREPEND, enumC0634a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((androidx.paging.a) obj);
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t2<Key, Value> f72592b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {393}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f72594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t2<Key, Value> f72595c;

            /* JADX INFO: renamed from: androidx.paging.t2$f$a$a, reason: collision with other inner class name */
            static final class C0681a extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Pair<? extends a1, ? extends j2<Key, Value>>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0681a f72596a = new C0681a();

                C0681a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Pair<a1, j2<Key, Value>> invoke(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.g();
                }
            }

            static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a1 f72597a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s2.b f72598b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(a1 a1Var, s2.b bVar) {
                    super(1);
                    this.f72597a = a1Var;
                    this.f72598b = bVar;
                }

                public final void c(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.c(this.f72597a);
                    if (((s2.b.C0680b) this.f72598b).a()) {
                        it.j(this.f72597a, androidx.paging.a.EnumC0634a.COMPLETED);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    c((androidx.paging.a) obj);
                    return Unit.f312394a;
                }
            }

            static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ a1 f72599a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s2.b f72600b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(a1 a1Var, s2.b bVar) {
                    super(1);
                    this.f72599a = a1Var;
                    this.f72600b = bVar;
                }

                public final void c(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.c(this.f72599a);
                    it.k(this.f72599a, new x0.a(((s2.b.a) this.f72600b).a()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    c((androidx.paging.a) obj);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t2<Key, Value> t2Var, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f72595c = t2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72595c, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0033  */
            /* JADX WARN: Code duplicated, block: B:13:0x0037  */
            /* JADX WARN: Code duplicated, block: B:15:0x0055 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:18:0x005d  */
            /* JADX WARN: Code duplicated, block: B:19:0x006d  */
            /* JADX WARN: Code duplicated, block: B:21:0x0071  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:16:0x0056). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x005d
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 3
                    int r1 = r6.f72594b
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L15
                    r5 = 3
                    java.lang.Object r1 = r6.f72593a
                    androidx.paging.a1 r1 = (androidx.paging.a1) r1
                    kotlin.ResultKt.m(r7)
                    goto L56
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    r5 = 1
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1e:
                    kotlin.ResultKt.m(r7)
                L21:
                    androidx.paging.t2<Key, Value> r7 = r6.f72595c
                    androidx.paging.b r7 = androidx.paging.t2.f(r7)
                    r5 = 7
                    androidx.paging.t2$f$a$a r1 = androidx.paging.t2.f.a.C0681a.f72596a
                    java.lang.Object r7 = r7.b(r1)
                    r5 = 2
                    kotlin.Pair r7 = (kotlin.Pair) r7
                    if (r7 != 0) goto L37
                    r5 = 4
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                L37:
                    java.lang.Object r1 = r7.component1()
                    androidx.paging.a1 r1 = (androidx.paging.a1) r1
                    r5 = 7
                    java.lang.Object r7 = r7.component2()
                    r5 = 0
                    androidx.paging.j2 r7 = (androidx.paging.j2) r7
                    androidx.paging.t2<Key, Value> r3 = r6.f72595c
                    androidx.paging.s2 r3 = androidx.paging.t2.h(r3)
                    r6.f72593a = r1
                    r6.f72594b = r2
                    java.lang.Object r7 = r3.c(r1, r7, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    r5 = 0
                    androidx.paging.s2$b r7 = (androidx.paging.s2.b) r7
                    boolean r3 = r7 instanceof androidx.paging.s2.b.C0680b
                    if (r3 == 0) goto L6d
                    androidx.paging.t2<Key, Value> r3 = r6.f72595c
                    r5 = 3
                    androidx.paging.b r3 = androidx.paging.t2.f(r3)
                    androidx.paging.t2$f$a$b r4 = new androidx.paging.t2$f$a$b
                    r4.<init>(r1, r7)
                    r3.b(r4)
                    goto L21
                L6d:
                    boolean r3 = r7 instanceof androidx.paging.s2.b.a
                    if (r3 == 0) goto L21
                    r5 = 7
                    androidx.paging.t2<Key, Value> r3 = r6.f72595c
                    androidx.paging.b r3 = androidx.paging.t2.f(r3)
                    androidx.paging.t2$f$a$c r4 = new androidx.paging.t2$f$a$c
                    r4.<init>(r1, r7)
                    r3.b(r4)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.t2.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t2<Key, Value> t2Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f72592b = t2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new f(this.f72592b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72591a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c3 c3Var = ((t2) this.f72592b).f72583d;
                a aVar = new a(this.f72592b, null);
                this.f72591a = 1;
                if (c3Var.b(1, aVar, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {314}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f72602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t2<Key, Value> f72603c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f72605b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f72606c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ t2<Key, Value> f72607d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.a f72608e;

            /* JADX INFO: renamed from: androidx.paging.t2$g$a$a, reason: collision with other inner class name */
            static final class C0682a extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Boolean> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ s2.b f72609a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0682a(s2.b bVar) {
                    super(1);
                    this.f72609a = bVar;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    a1 a1Var = a1.REFRESH;
                    it.c(a1Var);
                    if (((s2.b.C0680b) this.f72609a).a()) {
                        androidx.paging.a.EnumC0634a enumC0634a = androidx.paging.a.EnumC0634a.COMPLETED;
                        it.j(a1Var, enumC0634a);
                        it.j(a1.PREPEND, enumC0634a);
                        it.j(a1.APPEND, enumC0634a);
                        it.d();
                    } else {
                        a1 a1Var2 = a1.PREPEND;
                        androidx.paging.a.EnumC0634a enumC0634a2 = androidx.paging.a.EnumC0634a.UNBLOCKED;
                        it.j(a1Var2, enumC0634a2);
                        it.j(a1.APPEND, enumC0634a2);
                    }
                    it.k(a1.PREPEND, null);
                    it.k(a1.APPEND, null);
                    return Boolean.valueOf(it.g() != null);
                }
            }

            static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Boolean> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ s2.b f72610a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s2.b bVar) {
                    super(1);
                    this.f72610a = bVar;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    a1 a1Var = a1.REFRESH;
                    it.c(a1Var);
                    it.k(a1Var, new x0.a(((s2.b.a) this.f72610a).a()));
                    return Boolean.valueOf(it.g() != null);
                }
            }

            static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, j2<Key, Value>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f72611a = new c();

                c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final j2<Key, Value> invoke(@NotNull androidx.paging.a<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.h();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t2<Key, Value> t2Var, kotlin.jvm.internal.i1.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f72607d = t2Var;
                this.f72608e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72607d, this.f72608e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                t2<Key, Value> t2Var;
                kotlin.jvm.internal.i1.a aVar;
                boolean zBooleanValue;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72606c;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j2<Key, Value> j2Var = (j2) ((t2) this.f72607d).f72582c.b(c.f72611a);
                    if (j2Var != null) {
                        t2<Key, Value> t2Var2 = this.f72607d;
                        kotlin.jvm.internal.i1.a aVar2 = this.f72608e;
                        s2 s2Var = ((t2) t2Var2).f72581b;
                        a1 a1Var = a1.REFRESH;
                        this.f72604a = t2Var2;
                        this.f72605b = aVar2;
                        this.f72606c = 1;
                        obj = s2Var.c(a1Var, j2Var, this);
                        if (obj == objL) {
                            return objL;
                        }
                        t2Var = t2Var2;
                        aVar = aVar2;
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlin.jvm.internal.i1.a) this.f72605b;
                t2Var = (t2) this.f72604a;
                ResultKt.m(obj);
                s2.b bVar = (s2.b) obj;
                if (bVar instanceof s2.b.C0680b) {
                    zBooleanValue = ((Boolean) ((t2) t2Var).f72582c.b(new C0682a(bVar))).booleanValue();
                } else {
                    if (!(bVar instanceof s2.b.a)) {
                        throw new kotlin.k0();
                    }
                    zBooleanValue = ((Boolean) ((t2) t2Var).f72582c.b(new b(bVar))).booleanValue();
                }
                aVar.f312744a = zBooleanValue;
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t2<Key, Value> t2Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f72603c = t2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new g(this.f72603c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.jvm.internal.i1.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72602b;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlin.jvm.internal.i1.a aVar2 = new kotlin.jvm.internal.i1.a();
                c3 c3Var = ((t2) this.f72603c).f72583d;
                a aVar3 = new a(this.f72603c, aVar2, null);
                this.f72601a = aVar2;
                this.f72602b = 1;
                if (c3Var.b(2, aVar3, this) == objL) {
                    return objL;
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlin.jvm.internal.i1.a) this.f72601a;
                ResultKt.m(obj);
            }
            if (aVar.f312744a) {
                this.f72603c.k();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1 f72612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2<Key, Value> f72613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a1 a1Var, j2<Key, Value> j2Var) {
            super(1);
            this.f72612a = a1Var;
            this.f72613b = j2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull androidx.paging.a<Key, Value> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.a(this.f72612a, this.f72613b));
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t2<Key, Value> f72614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2<Key, Value> f72615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(t2<Key, Value> t2Var, j2<Key, Value> j2Var) {
            super(1);
            this.f72614a = t2Var;
            this.f72615b = j2Var;
        }

        public final void c(@NotNull androidx.paging.a<Key, Value> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.i()) {
                it.l(false);
                t2<Key, Value> t2Var = this.f72614a;
                t2Var.m(((t2) t2Var).f72582c, a1.REFRESH, this.f72615b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((androidx.paging.a) obj);
            return Unit.f312394a;
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<androidx.paging.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<a1> f72616a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List<a1> list) {
            super(1);
            this.f72616a = list;
        }

        public final void c(@NotNull androidx.paging.a<Key, Value> accessorState) {
            Intrinsics.checkNotNullParameter(accessorState, "accessorState");
            z0 z0VarE = accessorState.e();
            boolean z10 = z0VarE.k() instanceof x0.a;
            accessorState.b();
            if (z10) {
                List<a1> list = this.f72616a;
                a1 a1Var = a1.REFRESH;
                list.add(a1Var);
                accessorState.j(a1Var, androidx.paging.a.EnumC0634a.UNBLOCKED);
            }
            if (z0VarE.i() instanceof x0.a) {
                if (!z10) {
                    this.f72616a.add(a1.APPEND);
                }
                accessorState.c(a1.APPEND);
            }
            if (z0VarE.j() instanceof x0.a) {
                if (!z10) {
                    this.f72616a.add(a1.PREPEND);
                }
                accessorState.c(a1.PREPEND);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c((androidx.paging.a) obj);
            return Unit.f312394a;
        }
    }

    public t2(@NotNull kotlinx.coroutines.s0 scope, @NotNull s2<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator, "remoteMediator");
        this.f72580a = scope;
        this.f72581b = remoteMediator;
        this.f72582c = new androidx.paging.b<>();
        this.f72583d = new c3(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        kotlinx.coroutines.k.f(this.f72580a, null, null, new f(this, null), 3, null);
    }

    private final void l() {
        int i10 = 4 & 0;
        kotlinx.coroutines.k.f(this.f72580a, null, null, new g(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(androidx.paging.b<Key, Value> bVar, a1 a1Var, j2<Key, Value> j2Var) {
        if (((Boolean) bVar.b(new h(a1Var, j2Var))).booleanValue()) {
            if (b.f72584a[a1Var.ordinal()] == 1) {
                l();
            } else {
                k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.paging.u2
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super s2.a> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f72589d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f72589d = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object objA = dVar2.f72587b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f72589d;
        if (i11 == 0) {
            ResultKt.m(objA);
            s2<Key, Value> s2Var = this.f72581b;
            dVar2.f72586a = this;
            dVar2.f72589d = 1;
            objA = s2Var.a(dVar2);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (t2) dVar2.f72586a;
            ResultKt.m(objA);
        }
        if (((s2.a) objA) == s2.a.LAUNCH_INITIAL_REFRESH) {
            this.f72582c.b(e.f72590a);
        }
        return objA;
    }

    @Override // androidx.paging.w2
    public void b() {
        this.f72582c.b(c.f72585a);
    }

    @Override // androidx.paging.w2
    public void c(@NotNull j2<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        ArrayList arrayList = new ArrayList();
        this.f72582c.b(new j(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e((a1) it.next(), pagingState);
        }
    }

    @Override // androidx.paging.w2
    public void d(@NotNull j2<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        this.f72582c.b(new i(this, pagingState));
    }

    @Override // androidx.paging.w2
    public void e(@NotNull a1 loadType, @NotNull j2<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        m(this.f72582c, loadType, pagingState);
    }

    @Override // androidx.paging.u2
    @NotNull
    public kotlinx.coroutines.flow.z0<z0> getState() {
        return this.f72582c.a();
    }
}
