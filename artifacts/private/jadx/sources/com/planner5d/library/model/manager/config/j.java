package com.planner5d.library.model.manager.config;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.utility.f1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nFeatureConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n49#2:191\n51#2:195\n46#3:192\n51#3:194\n105#4:193\n381#5,7:196\n1863#6:203\n1864#6:211\n32#7,7:204\n1#8:212\n*S KotlinDebug\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager\n*L\n119#1:191\n119#1:195\n119#1:192\n119#1:194\n119#1:193\n127#1:196,7\n163#1:203\n163#1:211\n165#1:204,7\n*E\n"})
public final class j implements w, com.planner5d.library.services.observable.a<a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f181545j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f181546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.source.j> f181547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f1 f181548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f181549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private WeakReference<p2> f181550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.observable.d<a> f181551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.f, k0<com.planner5d.library.model.manager.config.g>> f181552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> f181553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f181554i;

    public enum a {
        REFRESHED,
        DROPPED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f181558d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f181558d;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$dropAndResetAllConfigs$2", f = "FeatureConfigManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59773f0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFeatureConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager$dropAndResetAllConfigs$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,190:1\n326#2:191\n*S KotlinDebug\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager$dropAndResetAllConfigs$2\n*L\n139#1:191\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181559a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$dropAndResetAllConfigs$2$1", f = "FeatureConfigManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f181561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f181562b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f181562b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f181562b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Unit unit;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f181561a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.source.j jVar = (com.planner5d.library.model.manager.config.source.j) this.f181562b.f181547b.get();
                    this.f181561a = 1;
                    if (jVar.c(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                Object obj2 = this.f181562b.f181554i;
                j jVar2 = this.f181562b;
                synchronized (obj2) {
                    jVar2.f181553h.clear();
                    jVar2.f181551f.a(a.DROPPED);
                    jVar2.q();
                    unit = Unit.f312394a;
                }
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181559a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s2.y(getContext());
                c3 c3Var = c3.f313552a;
                a aVar = new a(j.this, null);
                this.f181559a = 1;
                if (kotlinx.coroutines.i.h(c3Var, aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager", f = "FeatureConfigManager.kt", i = {}, l = {187}, m = "getConfigsRefreshingDelayMillis", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f181563a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f181565c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181563a = obj;
            this.f181565c |= Integer.MIN_VALUE;
            return j.this.o(this);
        }
    }

    /* synthetic */ class d extends g0 implements Function1<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> {
        d(Object obj) {
            super(1, obj, com.planner5d.library.application.d.class, "getFeatureConfigDefault", "getFeatureConfigDefault(Lcom/planner5d/library/model/manager/config/Feature;)Lcom/planner5d/library/model/manager/config/FeatureConfig;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final com.planner5d.library.model.manager.config.g invoke(com.planner5d.library.model.manager.config.f p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((com.planner5d.library.application.d) this.receiver).l(p10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager", f = "FeatureConfigManager.kt", i = {0}, l = {181}, m = "joinPreviousAndExecute", n = {"newJob"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f181567b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f181569d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f181567b = obj;
            this.f181569d |= Integer.MIN_VALUE;
            return j.this.r(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$joinPreviousAndExecute$newJob$1$1", f = "FeatureConfigManager.kt", i = {}, l = {174, 177}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f181571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p2 f181572c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$joinPreviousAndExecute$newJob$1$1$1", f = "FeatureConfigManager.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f181573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p2 f181574b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p2 p2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f181574b = p2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f181574b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f181573a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    p2 p2Var = this.f181574b;
                    if (p2Var == null) {
                        return null;
                    }
                    this.f181573a = 1;
                    if (p2Var.d1(this) == objL) {
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
        f(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, p2 p2Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f181571b = function1;
            this.f181572c = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f181571b, this.f181572c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r8.invoke(r7) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 3
                int r1 = r7.f181570a
                r6 = 0
                r2 = 2
                r3 = 1
                int r6 = r6 << r3
                if (r1 == 0) goto L25
                r6 = 6
                if (r1 == r3) goto L21
                r6 = 1
                if (r1 != r2) goto L18
                kotlin.ResultKt.m(r8)
                r6 = 4
                goto L4c
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 2
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L21:
                kotlin.ResultKt.m(r8)
                goto L41
            L25:
                kotlin.ResultKt.m(r8)
                kotlinx.coroutines.c3 r8 = kotlinx.coroutines.c3.f313552a
                r6 = 3
                com.planner5d.library.model.manager.config.j$f$a r1 = new com.planner5d.library.model.manager.config.j$f$a
                r6 = 0
                kotlinx.coroutines.p2 r4 = r7.f181572c
                r5 = 7
                r5 = 0
                r6 = 6
                r1.<init>(r4, r5)
                r7.f181570a = r3
                java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r1, r7)
                r6 = 7
                if (r8 != r0) goto L41
                r6 = 2
                goto L4b
            L41:
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r8 = r7.f181571b
                r7.f181570a = r2
                java.lang.Object r7 = r8.invoke(r7)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class g implements kotlinx.coroutines.flow.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f181575a;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager\n*L\n1#1,49:1\n50#2:50\n119#3:51\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f181576a;

            /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.j$g$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$observeLatestFeatureState$$inlined$map$1$2", f = "FeatureConfigManager.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class C1577a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f181577a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f181578b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f181579c;

                public C1577a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f181577a = obj;
                    this.f181578b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f181576a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                C1577a c1577a;
                Boolean boolB;
                if (dVar instanceof C1577a) {
                    c1577a = (C1577a) dVar;
                    int i10 = c1577a.f181578b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1577a.f181578b = i10 - Integer.MIN_VALUE;
                    } else {
                        c1577a = new C1577a(dVar);
                    }
                } else {
                    c1577a = new C1577a(dVar);
                }
                Object obj2 = c1577a.f181577a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c1577a.f181578b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f181576a;
                    com.planner5d.library.model.manager.config.g gVar = (com.planner5d.library.model.manager.config.g) obj;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a((gVar == null || (boolB = gVar.b()) == null) ? false : boolB.booleanValue());
                    c1577a.f181578b = 1;
                    if (jVar.emit(boolA, c1577a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public g(kotlinx.coroutines.flow.i iVar) {
            this.f181575a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f181575a.collect(new a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$refreshLatestConfigs$2", f = "FeatureConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.V, 71, com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f181582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f181583c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$refreshLatestConfigs$2$1", f = "FeatureConfigManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f181584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f181585b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f181585b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f181585b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f181584a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.source.j jVar = (com.planner5d.library.model.manager.config.source.j) this.f181585b.f181547b.get();
                    this.f181584a = 1;
                    if (jVar.b(this) == objL) {
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

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.FeatureConfigManager$refreshLatestConfigs$2$2", f = "FeatureConfigManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u241"}, s = {"L$2"})
        @SourceDebugExtension({"SMAP\nFeatureConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager$refreshLatestConfigs$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1863#2,2:191\n*S KotlinDebug\n*F\n+ 1 FeatureConfigManager.kt\ncom/planner5d/library/model/manager/config/FeatureConfigManager$refreshLatestConfigs$2$2\n*L\n76#1:191,2\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f181586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f181587b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f181588c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f181589d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f181590e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f181591f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f181592g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ j f181593h;

            /* synthetic */ class a extends g0 implements Function1<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> {
                a(Object obj) {
                    super(1, obj, Map.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
                public final com.planner5d.library.model.manager.config.g invoke(com.planner5d.library.model.manager.config.f p10) {
                    Intrinsics.checkNotNullParameter(p10, "p0");
                    return (com.planner5d.library.model.manager.config.g) ((Map) this.receiver).get(p10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f181593h = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f181593h, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0057  */
            /* JADX WARN: Code duplicated, block: B:14:0x007f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:15:0x0080  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    r8 = 5
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 4
                    int r1 = r9.f181592g
                    r2 = 1
                    r8 = r2
                    if (r1 == 0) goto L38
                    r8 = 4
                    if (r1 != r2) goto L2e
                    java.lang.Object r1 = r9.f181591f
                    java.util.Map r1 = (java.util.Map) r1
                    java.lang.Object r3 = r9.f181590e
                    r8 = 6
                    com.planner5d.library.model.manager.config.f r3 = (com.planner5d.library.model.manager.config.f) r3
                    java.lang.Object r4 = r9.f181589d
                    java.util.Iterator r4 = (java.util.Iterator) r4
                    java.lang.Object r5 = r9.f181588c
                    java.util.Map r5 = (java.util.Map) r5
                    r8 = 1
                    java.lang.Object r6 = r9.f181587b
                    r8 = 1
                    java.util.Map r6 = (java.util.Map) r6
                    java.lang.Object r7 = r9.f181586a
                    com.planner5d.library.model.manager.config.j r7 = (com.planner5d.library.model.manager.config.j) r7
                    kotlin.ResultKt.m(r10)
                    goto L82
                L2e:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "ulse/oec be/tme te /or sf/nvi/l/onrr cootwie/i akhu"
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L38:
                    kotlin.ResultKt.m(r10)
                    r8 = 6
                    com.planner5d.library.model.manager.config.j r10 = r9.f181593h
                    java.util.Map r1 = kotlin.collections.MapsKt.createMapBuilder()
                    r8 = 4
                    kotlin.enums.a r3 = com.planner5d.library.model.manager.config.f.l()
                    r8 = 6
                    java.util.Iterator r3 = r3.iterator()
                    r7 = r10
                    r6 = r1
                    r4 = r3
                L4f:
                    r8 = 1
                    boolean r10 = r4.hasNext()
                    r8 = 7
                    if (r10 == 0) goto L87
                    r8 = 0
                    java.lang.Object r10 = r4.next()
                    r3 = r10
                    r8 = 7
                    com.planner5d.library.model.manager.config.f r3 = (com.planner5d.library.model.manager.config.f) r3
                    fg.e r10 = com.planner5d.library.model.manager.config.j.d(r7)
                    java.lang.Object r10 = r10.get()
                    com.planner5d.library.model.manager.config.source.j r10 = (com.planner5d.library.model.manager.config.source.j) r10
                    r9.f181586a = r7
                    r9.f181587b = r6
                    r9.f181588c = r1
                    r8 = 1
                    r9.f181589d = r4
                    r9.f181590e = r3
                    r9.f181591f = r1
                    r9.f181592g = r2
                    java.lang.Object r10 = r10.a(r3, r9)
                    if (r10 != r0) goto L80
                    return r0
                L80:
                    r5 = r1
                    r5 = r1
                L82:
                    r1.put(r3, r10)
                    r1 = r5
                    goto L4f
                L87:
                    java.util.Map r10 = kotlin.collections.MapsKt.build(r6)
                    com.planner5d.library.model.manager.config.j r0 = r9.f181593h
                    java.lang.Object r0 = com.planner5d.library.model.manager.config.j.i(r0)
                    r8 = 2
                    com.planner5d.library.model.manager.config.j r9 = r9.f181593h
                    monitor-enter(r0)
                    com.planner5d.library.model.manager.config.j$h$b$a r1 = new com.planner5d.library.model.manager.config.j$h$b$a     // Catch: java.lang.Throwable -> La1
                    r1.<init>(r10)     // Catch: java.lang.Throwable -> La1
                    com.planner5d.library.model.manager.config.j.l(r9, r1)     // Catch: java.lang.Throwable -> La1
                    kotlin.Unit r9 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> La1
                    monitor-exit(r0)
                    return r9
                La1:
                    r9 = move-exception
                    monitor-exit(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.j.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Long l10, j jVar, kotlin.coroutines.d<? super h> dVar) {
            super(1, dVar);
            this.f181582b = l10;
            this.f181583c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new h(this.f181582b, this.f181583c, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0078  */
        /* JADX WARN: Code duplicated, block: B:32:0x008f  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        
            if (r13 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
        
            if (kotlinx.coroutines.i.h(r13, r1, r12) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f181581a
                r11 = 4
                r2 = 0
                r11 = 1
                r3 = 4
                r4 = 3
                r11 = 6
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L36
                if (r1 == r6) goto L31
                r11 = 1
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L28
                if (r1 != r3) goto L1f
                kotlin.ResultKt.m(r13)
                r11 = 4
                goto Lae
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                r11 = 2
                throw r12
            L28:
                r11 = 6
                kotlin.ResultKt.m(r13)
                goto L8f
            L2d:
                kotlin.ResultKt.m(r13)
                goto L78
            L31:
                r11 = 6
                kotlin.ResultKt.m(r13)
                goto L5e
            L36:
                kotlin.ResultKt.m(r13)
                java.lang.Long r13 = r12.f181582b
                if (r13 == 0) goto L49
                long r7 = r13.longValue()
                r11 = 3
                r9 = 0
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                r11 = 3
                if (r13 <= 0) goto L8f
            L49:
                java.lang.Long r13 = r12.f181582b
                if (r13 == 0) goto L52
                long r6 = r13.longValue()
                goto L64
            L52:
                com.planner5d.library.model.manager.config.j r13 = r12.f181583c
                r12.f181581a = r6
                r11 = 0
                java.lang.Object r13 = com.planner5d.library.model.manager.config.j.e(r13, r12)
                if (r13 != r0) goto L5e
                goto Lad
            L5e:
                java.lang.Number r13 = (java.lang.Number) r13
                long r6 = r13.longValue()
            L64:
                r11 = 0
                com.planner5d.library.model.manager.config.j$h$a r13 = new com.planner5d.library.model.manager.config.j$h$a
                com.planner5d.library.model.manager.config.j r1 = r12.f181583c
                r13.<init>(r1, r2)
                r11 = 2
                r12.f181581a = r5
                r11 = 0
                java.lang.Object r13 = kotlinx.coroutines.b4.e(r6, r13, r12)
                r11 = 3
                if (r13 != r0) goto L78
                goto Lad
            L78:
                com.planner5d.library.model.manager.config.j r13 = r12.f181583c
                fg.e r13 = com.planner5d.library.model.manager.config.j.d(r13)
                r11 = 3
                java.lang.Object r13 = r13.get()
                r11 = 4
                com.planner5d.library.model.manager.config.source.j r13 = (com.planner5d.library.model.manager.config.source.j) r13
                r12.f181581a = r4
                java.lang.Object r13 = r13.f(r12)
                if (r13 != r0) goto L8f
                goto Lad
            L8f:
                r11 = 0
                com.planner5d.library.model.manager.config.j r13 = r12.f181583c
                r11 = 3
                com.planner5d.library.services.utility.t r13 = com.planner5d.library.model.manager.config.j.f(r13)
                r11 = 1
                kotlinx.coroutines.n0 r13 = r13.h()
                r11 = 6
                com.planner5d.library.model.manager.config.j$h$b r1 = new com.planner5d.library.model.manager.config.j$h$b
                com.planner5d.library.model.manager.config.j r4 = r12.f181583c
                r1.<init>(r4, r2)
                r12.f181581a = r3
                r11 = 0
                java.lang.Object r12 = kotlinx.coroutines.i.h(r13, r1, r12)
                if (r12 != r0) goto Lae
            Lad:
                return r0
            Lae:
                r11 = 7
                kotlin.Unit r12 = kotlin.Unit.f312394a
                r11 = 6
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.config.j.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public j(@NotNull com.planner5d.library.application.d applicationConfiguration, @NotNull fg.e<com.planner5d.library.model.manager.config.source.j> allFeatureConfigs, @NotNull f1 globalCoroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        Intrinsics.checkNotNullParameter(allFeatureConfigs, "allFeatureConfigs");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f181546a = applicationConfiguration;
        this.f181547b = allFeatureConfigs;
        this.f181548c = globalCoroutineScope;
        this.f181549d = coroutineDispatchers;
        this.f181551f = new com.planner5d.library.services.observable.d<>();
        this.f181552g = new LinkedHashMap();
        this.f181553h = new LinkedHashMap();
        this.f181554i = new Object();
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object o(kotlin.coroutines.d<? super Long> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f181565c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f181565c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objP = cVar.f181563a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f181565c;
        if (i11 == 0) {
            ResultKt.m(objP);
            cVar.f181565c = 1;
            objP = p(cVar);
            if (objP == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objP);
        }
        return kotlin.coroutines.jvm.internal.b.g(((Boolean) objP).booleanValue() ? 10000L : 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        w(new d(this.f181546a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object r(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        p2 p2VarF;
        CancellationException cancellationException;
        p2 p2Var;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f181569d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f181569d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f181567b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f181569d;
        if (i11 == 0) {
            ResultKt.m(obj);
            synchronized (this.f181554i) {
                try {
                    WeakReference<p2> weakReference = this.f181550e;
                    p2VarF = kotlinx.coroutines.k.f(this.f181548c, this.f181549d.h(), null, new f(function1, weakReference != null ? weakReference.get() : null, null), 2, null);
                    this.f181550e = new WeakReference<>(p2VarF);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                eVar.f181566a = p2VarF;
                eVar.f181569d = 1;
                if (p2VarF.d1(eVar) == objL) {
                    return objL;
                }
            } catch (CancellationException e10) {
                cancellationException = e10;
                p2Var = p2VarF;
                p2Var.e(cancellationException);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p2Var = (p2) eVar.f181566a;
            try {
                ResultKt.m(obj);
            } catch (CancellationException e11) {
                cancellationException = e11;
                p2Var.e(cancellationException);
            }
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ Object v(j jVar, Long l10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return jVar.u(l10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Function1<? super com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> function1) {
        for (com.planner5d.library.model.manager.config.f fVar : com.planner5d.library.model.manager.config.f.l()) {
            com.planner5d.library.model.manager.config.g gVarInvoke = function1.invoke(fVar);
            com.planner5d.library.services.utility.m mVar = com.planner5d.library.services.utility.m.f225326a;
            Map<com.planner5d.library.model.manager.config.f, k0<com.planner5d.library.model.manager.config.g>> map = this.f181552g;
            k0<com.planner5d.library.model.manager.config.g> k0Var = map.get(fVar);
            if (k0Var == null) {
                map.put(fVar, b1.a(gVarInvoke));
            } else {
                k0Var.setValue(gVarInvoke);
            }
        }
        this.f181551f.a(a.REFRESHED);
    }

    @Override // com.planner5d.library.model.manager.w
    public boolean a(@NotNull com.planner5d.library.model.manager.config.f feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.planner5d.library.model.manager.config.g gVarB = b(feature);
        if (gVarB != null) {
            return Intrinsics.areEqual(gVarB.b(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.planner5d.library.model.manager.w
    @Nullable
    public com.planner5d.library.model.manager.config.g b(@NotNull com.planner5d.library.model.manager.config.f feature) {
        com.planner5d.library.model.manager.config.g gVar;
        Intrinsics.checkNotNullParameter(feature, "feature");
        synchronized (this.f181554i) {
            try {
                if (this.f181553h.containsKey(feature)) {
                    gVar = this.f181553h.get(feature);
                } else {
                    com.planner5d.library.model.manager.config.g value = s(feature).getValue();
                    this.f181553h.put(feature, value);
                    gVar = value;
                }
            } finally {
            }
        }
        return gVar;
    }

    @Override // com.planner5d.library.services.observable.a
    public void c(@NotNull Function1<? super a, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f181551f.c(observer);
    }

    @Nullable
    public final Object m(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objR = r(new b(null), dVar);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }

    @Nullable
    public final Object n(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super List<l>> dVar) {
        return this.f181547b.get().j(fVar, dVar);
    }

    @Nullable
    public final Object p(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f181547b.get().e(dVar);
    }

    @NotNull
    public final z0<com.planner5d.library.model.manager.config.g> s(@NotNull com.planner5d.library.model.manager.config.f feature) {
        k0<com.planner5d.library.model.manager.config.g> k0Var;
        Intrinsics.checkNotNullParameter(feature, "feature");
        synchronized (this.f181554i) {
            try {
                Map<com.planner5d.library.model.manager.config.f, k0<com.planner5d.library.model.manager.config.g>> map = this.f181552g;
                k0<com.planner5d.library.model.manager.config.g> k0VarA = map.get(feature);
                if (k0VarA == null) {
                    k0VarA = b1.a(null);
                    map.put(feature, k0VarA);
                }
                k0Var = k0VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Boolean> t(@NotNull com.planner5d.library.model.manager.config.f feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new g(s(feature));
    }

    @Nullable
    public final Object u(@androidx.annotation.g0(from = 0) @Nullable Long l10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objR = r(new h(l10, this, null), dVar);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }
}
