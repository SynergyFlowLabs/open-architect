package com.planner5d.library.model.manager.config.source;

import androidx.compose.runtime.internal.w0;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.model.manager.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultipleFeatureConfigSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n4135#2,11:99\n3829#2:119\n4344#2,2:120\n774#3:110\n865#3,2:111\n1557#3:113\n1628#3,3:114\n1062#3:117\n1619#3:122\n1863#3:123\n1864#3:125\n1620#3:126\n1#4:118\n1#4:124\n*S KotlinDebug\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource\n*L\n21#1:99,11\n80#1:119\n80#1:120,2\n60#1:110\n60#1:111,2\n61#1:113\n61#1:114,3\n61#1:117\n81#1:122\n81#1:123\n81#1:125\n81#1:126\n81#1:124\n*E\n"})
public final class j implements com.planner5d.library.model.manager.config.source.d, n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f186186d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t1 f186187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.source.d[] f186188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<n> f186189c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$activateFetched$2", f = "MultipleFeatureConfigSource.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<n, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f186190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f186191b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f186191b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f186190a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar = (n) this.f186191b;
                this.f186190a = 1;
                if (nVar.f(this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$dropFetchedAndActivated$2", f = "MultipleFeatureConfigSource.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<n, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f186192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f186193b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f186193b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f186192a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar = (n) this.f186193b;
                this.f186192a = 1;
                if (nVar.c(this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$fetchLatest$2", f = "MultipleFeatureConfigSource.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<n, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f186194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f186195b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = j.this.new c(dVar);
            cVar.f186195b = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f186194a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n nVar = (n) this.f186195b;
                    this.f186194a = 1;
                    Object objB = nVar.b(this);
                    this = objB;
                    if (objB == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this = this;
                }
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
                timber.log.b.f381052a.e(e10);
                j.this.f186187a.b("config_source", null, e10);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource", f = "MultipleFeatureConfigSource.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160725s, 76, com.planner5d.library.engine.input.f.b.f160705l0}, m = "getAllFeatureConfigs", n = {"this", "feature", "allConfigs", "this", "feature", "allConfigs", "feature", "allConfigs", MetricConsts.Install}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f186197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f186198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f186199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f186201e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186203g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f186201e = obj;
            this.f186203g |= Integer.MIN_VALUE;
            return j.this.j(null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource\n*L\n1#1,121:1\n61#2:122\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((com.planner5d.library.model.manager.config.g) t11).c(), ((com.planner5d.library.model.manager.config.g) t10).c());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource", f = "MultipleFeatureConfigSource.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "getFeatureConfig", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f186204a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f186206c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f186204a = obj;
            this.f186206c |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$hasFetchedOrActivated$2", f = "MultipleFeatureConfigSource.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultipleFeatureConfigSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource$hasFetchedOrActivated$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1557#2:99\n1628#2,3:100\n1734#2,3:103\n*S KotlinDebug\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource$hasFetchedOrActivated$2\n*L\n26#1:99\n26#1:100,3\n30#1:103,3\n*E\n"})
    static final class g extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f186207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f186208b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$hasFetchedOrActivated$2$1$1", f = "MultipleFeatureConfigSource.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f186210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f186211b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f186211b = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f186211b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f186210a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                n nVar = this.f186211b;
                this.f186210a = 1;
                Object objE = nVar.e(this);
                return objE == objL ? objL : objE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = j.this.new g(dVar);
            gVar.f186208b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f186207a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f186208b;
                List list = j.this.f186189c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i11 = 0 >> 0;
                    arrayList.add(kotlinx.coroutines.k.b(s0Var, null, null, new a((n) it.next(), null), 3, null));
                }
                this.f186207a = 1;
                obj = kotlinx.coroutines.f.a(arrayList, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z10 = false;
                        break;
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$launchForEachSynchronizableDataSource$2", f = "MultipleFeatureConfigSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMultipleFeatureConfigSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource$launchForEachSynchronizableDataSource$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1863#2,2:99\n*S KotlinDebug\n*F\n+ 1 MultipleFeatureConfigSource.kt\ncom/planner5d/library/model/manager/config/source/MultipleFeatureConfigSource$launchForEachSynchronizableDataSource$2\n*L\n89#1:99,2\n*E\n"})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f186212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f186213b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<n, kotlin.coroutines.d<? super Unit>, Object> f186215d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.source.MultipleFeatureConfigSource$launchForEachSynchronizableDataSource$2$1$1", f = "MultipleFeatureConfigSource.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f186216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<n, kotlin.coroutines.d<? super Unit>, Object> f186217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n f186218c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, n nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f186217b = function2;
                this.f186218c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f186217b, this.f186218c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f186216a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function2<n, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f186217b;
                    n nVar = this.f186218c;
                    this.f186216a = 1;
                    if (function2.invoke(nVar, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f186215d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = j.this.new h(this.f186215d, dVar);
            hVar.f186213b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f186212a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f186213b;
            List list = j.this.f186189c;
            Function2<n, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f186215d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.k.f(s0Var, null, null, new a(function2, (n) it.next(), null), 3, null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j(@NotNull t1 logRecordManager, @NotNull com.planner5d.library.model.manager.config.source.d... featureConfigsSources) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(featureConfigsSources, "featureConfigsSources");
        this.f186187a = logRecordManager;
        this.f186188b = featureConfigsSources;
        ArrayList arrayList = new ArrayList();
        for (com.planner5d.library.model.manager.config.source.d dVar : featureConfigsSources) {
            if (dVar instanceof n) {
                arrayList.add(dVar);
            }
        }
        this.f186189c = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Function2<? super n, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new h(function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.model.manager.config.source.d
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
        f fVar2;
        Object next;
        if (dVar instanceof f) {
            fVar2 = (f) dVar;
            int i10 = fVar2.f186206c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f186206c = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(dVar);
            }
        } else {
            fVar2 = new f(dVar);
        }
        Object objJ = fVar2.f186204a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar2.f186206c;
        if (i11 == 0) {
            ResultKt.m(objJ);
            fVar2.f186206c = 1;
            objJ = j(fVar, fVar2);
            if (objJ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objJ);
        }
        List list = (List) objJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((com.planner5d.library.model.manager.config.l) obj).b(), com.planner5d.library.model.manager.config.source.a.class)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.planner5d.library.model.manager.config.l) it.next()).a());
        }
        com.planner5d.library.model.manager.config.g gVar = (com.planner5d.library.model.manager.config.g) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList2, new e()));
        if (gVar != null) {
            return gVar;
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((com.planner5d.library.model.manager.config.l) next).b(), com.planner5d.library.model.manager.config.source.a.class));
        com.planner5d.library.model.manager.config.l lVar = (com.planner5d.library.model.manager.config.l) next;
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k(new c(null), dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k(new b(null), dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object e(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return t0.g(new g(null), dVar);
    }

    @Override // com.planner5d.library.model.manager.config.source.n
    @Nullable
    public Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = k(new a(null), dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[LOOP:1: B:36:0x00b8->B:40:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[EDGE_INSN: B:76:0x00c6->B:42:0x00c6 BREAK  A[LOOP:1: B:36:0x00b8->B:40:0x00c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r15 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        if (r15 == r1) goto L61;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0121 -> B:62:0x0124). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@org.jetbrains.annotations.NotNull com.planner5d.library.model.manager.config.f r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<com.planner5d.library.model.manager.config.l>> r15) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.source.j.j(com.planner5d.library.model.manager.config.f, kotlin.coroutines.d):java.lang.Object");
    }
}
