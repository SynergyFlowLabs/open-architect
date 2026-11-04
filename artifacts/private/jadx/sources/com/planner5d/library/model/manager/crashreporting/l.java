package com.planner5d.library.model.manager.crashreporting;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nCrashReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReporter.kt\ncom/planner5d/library/model/manager/crashreporting/CrashReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1863#2,2:142\n1863#2:144\n1863#2,2:145\n1864#2:147\n1#3:148\n*S KotlinDebug\n*F\n+ 1 CrashReporter.kt\ncom/planner5d/library/model/manager/crashreporting/CrashReporter\n*L\n119#1:142,2\n135#1:144\n136#1:145,2\n135#1:147\n*E\n"})
public final class l implements com.planner5d.library.model.manager.k, x1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f191193k = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f191194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f191195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f1 f191196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f191197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<n> f191198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<Function1<n, Unit>> f191199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f191200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.f, fg.e<? extends n>> f191201j;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.crashreporting.CrashReporter$initialize$1", f = "CrashReporter.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191202a;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.crashreporting.l$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.crashreporting.CrashReporter$initialize$1$1", f = "CrashReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCrashReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReporter.kt\ncom/planner5d/library/model/manager/crashreporting/CrashReporter$initialize$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1#2:142\n1863#3,2:143\n*S KotlinDebug\n*F\n+ 1 CrashReporter.kt\ncom/planner5d/library/model/manager/crashreporting/CrashReporter$initialize$1$1\n*L\n41#1:143,2\n*E\n"})
        static final class C1590a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f191204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f191205b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f191206c;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.crashreporting.l$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.crashreporting.CrashReporter$initialize$1$1$2$1", f = "CrashReporter.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
            static final class C1591a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f191207a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f191208b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1591a(n nVar, kotlin.coroutines.d<? super C1591a> dVar) {
                    super(2, dVar);
                    this.f191208b = nVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1591a(this.f191208b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f191207a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        n nVar = this.f191208b;
                        this.f191207a = 1;
                        if (nVar.a(this) == objL) {
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
                    return ((C1591a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1590a(l lVar, kotlin.coroutines.d<? super C1590a> dVar) {
                super(2, dVar);
                this.f191206c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1590a c1590a = new C1590a(this.f191206c, dVar);
                c1590a.f191205b = obj;
                return c1590a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List list;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f191204a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f191205b;
                Object obj2 = this.f191206c.f191200i;
                l lVar = this.f191206c;
                synchronized (obj2) {
                    try {
                        list = lVar.f191198g;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new C1591a((n) it.next(), null), 3, null);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1590a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191202a;
            if (i10 == 0) {
                ResultKt.m(obj);
                C1590a c1590a = new C1590a(l.this, null);
                this.f191202a = 1;
                if (t0.g(c1590a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            l.this.y();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<t1> logRecordManager, @NotNull f1 globalCoroutineScope, @NotNull fg.e<v> firebaseBackend, @NotNull fg.e<d0> sentryBackend) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(firebaseBackend, "firebaseBackend");
        Intrinsics.checkNotNullParameter(sentryBackend, "sentryBackend");
        this.f191194c = featureConfigManager;
        this.f191195d = logRecordManager;
        this.f191196e = globalCoroutineScope;
        this.f191198g = new ArrayList();
        this.f191199h = new ArrayList();
        this.f191200i = new Object();
        this.f191201j = MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.config.f.LogsFirebase, firebaseBackend), TuplesKt.to(com.planner5d.library.model.manager.config.f.LogsSentry, sentryBackend));
    }

    private final void A() {
        synchronized (this.f191200i) {
            try {
                if (this.f191197f) {
                    Map<com.planner5d.library.model.manager.config.f, fg.e<? extends n>> map = this.f191201j;
                    final Function2 function2 = new Function2() { // from class: com.planner5d.library.model.manager.crashreporting.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l.D(this.f191156a, (com.planner5d.library.model.manager.config.f) obj, (fg.e) obj2);
                        }
                    };
                    map.forEach(new BiConsumer() { // from class: com.planner5d.library.model.manager.crashreporting.c
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            l.E(function2, obj, obj2);
                        }
                    });
                    this.f191198g.clear();
                }
                Map<com.planner5d.library.model.manager.config.f, fg.e<? extends n>> map2 = this.f191201j;
                final Function2 function3 = new Function2() { // from class: com.planner5d.library.model.manager.crashreporting.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l.B(this.f191163a, (com.planner5d.library.model.manager.config.f) obj, (fg.e) obj2);
                    }
                };
                map2.forEach(new BiConsumer() { // from class: com.planner5d.library.model.manager.crashreporting.e
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        l.C(function3, obj, obj2);
                    }
                });
                this.f191197f = true;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(l lVar, com.planner5d.library.model.manager.config.f feature, fg.e backend) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(backend, "backend");
        com.planner5d.library.model.manager.config.g value = lVar.f191194c.get().s(feature).getValue();
        if (value != null ? Intrinsics.areEqual(value.b(), Boolean.TRUE) : false) {
            List<n> list = lVar.f191198g;
            Object obj = backend.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            list.add((n) obj);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(l lVar, com.planner5d.library.model.manager.config.f feature, fg.e backend) {
        Object next;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(backend, "backend");
        com.planner5d.library.model.manager.config.g value = lVar.f191194c.get().s(feature).getValue();
        if (!(value != null ? Intrinsics.areEqual(value.b(), Boolean.TRUE) : false)) {
            Iterator<T> it = lVar.f191198g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((n) next) == backend.get()));
            n nVar = (n) next;
            if (nVar != null) {
                nVar.clear();
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(String str, String str2, n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.c(str, str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord G(Throwable th2) {
        return new LogRecord("non_fatal_exception", null, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(Throwable th2, String str, String str2, n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.b(th2, str, str2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, String str2, n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        if (execute instanceof com.planner5d.library.model.manager.k) {
            ((com.planner5d.library.model.manager.k) execute).d(str, str2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(String str, n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.h(str);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(long j10, n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.setUserId(j10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(n execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        execute.clear();
        return Unit.f312394a;
    }

    private final void x(Function1<? super n, Unit> function1) {
        List<n> list;
        synchronized (this.f191200i) {
            try {
                if (this.f191197f) {
                    list = this.f191198g;
                } else {
                    this.f191199h.add(function1);
                    list = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                function1.invoke((n) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        synchronized (this.f191200i) {
            try {
                if (this.f191197f) {
                    List<Function1> list = CollectionsKt.toList(this.f191199h);
                    List<n> list2 = this.f191198g;
                    this.f191199h.clear();
                    Unit unit = Unit.f312394a;
                    for (Function1 function1 : list) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            function1.invoke(it.next());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.d
    public final void J(@NotNull final String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.K(hash, (n) obj);
            }
        });
    }

    @androidx.annotation.d
    public final void L(final long j10) {
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.M(j10, (n) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    public void b(@NotNull final Throwable throwable, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.H(throwable, str, str2, (n) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    public void c(@Nullable final String str, @Nullable final String str2) {
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.F(str, str2, (n) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void d(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.I(key, value, (n) obj);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.k
    @androidx.annotation.d
    public void f(@NotNull final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f191195d.get().v(new ij.c() { // from class: com.planner5d.library.model.manager.crashreporting.f
            @Override // ij.c
            public final Object get() {
                return l.G(throwable);
            }
        });
        b(throwable, null, null);
    }

    @androidx.annotation.d
    public final void v() {
        x(new Function1() { // from class: com.planner5d.library.model.manager.crashreporting.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.w((n) obj);
            }
        });
    }

    @androidx.annotation.d
    public final void z() {
        A();
        kotlinx.coroutines.k.f(this.f191196e, null, null, new a(null), 3, null);
    }
}
