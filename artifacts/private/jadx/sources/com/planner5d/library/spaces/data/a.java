package com.planner5d.library.spaces.data;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.spaces.application.u;
import com.planner5d.library.spaces.entity.AddressSearchQuery;
import com.planner5d.library.spaces.entity.AddressSearchResult;
import com.planner5d.library.spaces.entity.ProjectInfo;
import com.planner5d.library.spaces.entity.ProjectInfoResponse;
import com.planner5d.library.spaces.entity.SpaceInfo;
import com.planner5d.library.spaces.entity.SpaceInfoResponse;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import com.squareup.moshi.a0;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@u
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f230015n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f230016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.k f230017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fe.a f230018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fe.b f230019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f1 f230020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final p f230021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.e f230022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final w f230023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.squareup.moshi.w f230024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.squareup.moshi.h<AddressSearchQuery> f230025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ParameterizedType f230026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.squareup.moshi.h<List<AddressSearchResult>> f230027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private SpacesProjectData f230028m;

    /* JADX INFO: renamed from: com.planner5d.library.spaces.data.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0, 0, 0}, l = {166}, m = "examineFoundSpaceInfo", n = {"this", "fullAddress", "onError"}, s = {"L$0", "L$1", "L$2"})
    static final class C1695a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f230031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f230032d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230034f;

        C1695a(kotlin.coroutines.d<? super C1695a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230032d = obj;
            this.f230034f |= Integer.MIN_VALUE;
            return a.this.k(null, null, null, null, this);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0}, l = {67}, m = "findHouse", n = {"address"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230036b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230038d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230036b = obj;
            this.f230038d |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    /* synthetic */ class c extends kotlin.jvm.internal.a implements pj.o<com.planner5d.library.api.b, id.a, JSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object>, kotlin.coroutines.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f230039a = new c();

        c() {
            super(4, com.planner5d.library.api.b.class, "findHouse", "findHouse(Lcom/planner5d/library/modules/user/model/User;Lorg/json/JSONObject;)Lcom/planner5d/library/api/Response;", 4);
        }

        @Override // pj.o
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return a.m(bVar, aVar, jSONObject, dVar);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$findHouseInBackground$1", f = "AddressRepository.kt", i = {0, 1, 2}, l = {com.planner5d.library.engine.input.f.b.f160733u1, 105, 105, 132}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f230042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f230043d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f230045f;

        /* JADX INFO: renamed from: com.planner5d.library.spaces.data.a$d$a, reason: collision with other inner class name */
        static final class C1696a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s0 f230046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f230047b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f230048c;

            /* JADX INFO: renamed from: com.planner5d.library.spaces.data.a$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$findHouseInBackground$1$1$1$1$1$1", f = "AddressRepository.kt", i = {0}, l = {com.rabbitmq.client.impl.k.b.p.f265340a, 113}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
            static final class C1697a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f230049a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f230050b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ SpacesProjectData f230051c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f230052d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1697a(SpacesProjectData spacesProjectData, a aVar, kotlin.coroutines.d<? super C1697a> dVar) {
                    super(2, dVar);
                    this.f230051c = spacesProjectData;
                    this.f230052d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C1697a c1697a = new C1697a(this.f230051c, this.f230052d, dVar);
                    c1697a.f230050b = obj;
                    return c1697a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
                
                    if (r2.u(r1, r5) == r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
                
                    if (r6.v(r5) == r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        r4 = 5
                        int r1 = r5.f230049a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L11
                        r4 = 0
                        goto L1f
                    L11:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r4 = 2
                        r5.<init>(r6)
                        r4 = 5
                        throw r5
                    L1b:
                        java.lang.Object r5 = r5.f230050b
                        kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                    L1f:
                        kotlin.ResultKt.m(r6)
                        goto L4e
                    L23:
                        r4 = 7
                        kotlin.ResultKt.m(r6)
                        java.lang.Object r6 = r5.f230050b
                        r4 = 5
                        kotlinx.coroutines.s0 r6 = (kotlinx.coroutines.s0) r6
                        com.planner5d.library.spaces.entity.SpacesProjectData r1 = r5.f230051c
                        if (r1 == 0) goto L3e
                        com.planner5d.library.spaces.data.a r2 = r5.f230052d
                        r4 = 1
                        r5.f230050b = r6
                        r5.f230049a = r3
                        java.lang.Object r5 = com.planner5d.library.spaces.data.a.h(r2, r1, r5)
                        if (r5 != r0) goto L4e
                        goto L4c
                    L3e:
                        com.planner5d.library.spaces.data.a r6 = r5.f230052d
                        r1 = 0
                        r5.f230050b = r1
                        r5.f230049a = r2
                        r4 = 0
                        java.lang.Object r5 = com.planner5d.library.spaces.data.a.i(r6, r5)
                        if (r5 != r0) goto L4e
                    L4c:
                        r4 = 7
                        return r0
                    L4e:
                        kotlin.Unit r5 = kotlin.Unit.f312394a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.data.a.d.C1696a.C1697a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1697a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: com.planner5d.library.spaces.data.a$d$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$findHouseInBackground$1$1$1$1$2$1", f = "AddressRepository.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f230053a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f230054b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(a aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f230054b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f230054b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f230053a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        a aVar = this.f230054b;
                        this.f230053a = 1;
                        if (aVar.v(this) == objL) {
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
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: com.planner5d.library.spaces.data.a$d$a$c */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$findHouseInBackground$1$1$1", f = "AddressRepository.kt", i = {0}, l = {108}, m = "emit", n = {"this"}, s = {"L$0"})
            static final class c extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f230055a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f230056b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ C1696a<T> f230057c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f230058d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(C1696a<? super T> c1696a, kotlin.coroutines.d<? super c> dVar) {
                    super(dVar);
                    this.f230057c = c1696a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f230056b = obj;
                    this.f230058d |= Integer.MIN_VALUE;
                    return this.f230057c.emit(null, this);
                }
            }

            C1696a(s0 s0Var, a aVar, String str) {
                this.f230046a = s0Var;
                this.f230047b = aVar;
                this.f230048c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(a aVar, SpacesProjectData spacesProjectData) {
                kotlinx.coroutines.k.f(aVar.f230020e, s.f229729a.h(), null, new C1697a(spacesProjectData, aVar, null), 2, null);
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(a aVar) {
                kotlinx.coroutines.k.f(aVar.f230020e, s.f229729a.h(), null, new b(aVar, null), 2, null);
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0017  */
            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(SpaceInfoResponse spaceInfoResponse, kotlin.coroutines.d<? super Unit> dVar) {
                c cVar;
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i10 = cVar.f230058d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        cVar.f230058d = i10 - Integer.MIN_VALUE;
                    } else {
                        cVar = new c(this, dVar);
                    }
                } else {
                    cVar = new c(this, dVar);
                }
                c cVar2 = cVar;
                Object obj = cVar2.f230056b;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = cVar2.f230058d;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    if (spaceInfoResponse != null) {
                        final a aVar = this.f230047b;
                        String str = this.f230048c;
                        timber.log.b.f381052a.a("findHouseInfo collected status=" + spaceInfoResponse.b(), new Object[0]);
                        Function1<? super SpacesProjectData, Unit> function1 = new Function1() { // from class: com.planner5d.library.spaces.data.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return a.d.C1696a.e(aVar, (SpacesProjectData) obj2);
                            }
                        };
                        Function0<Unit> function0 = new Function0() { // from class: com.planner5d.library.spaces.data.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return a.d.C1696a.g(aVar);
                            }
                        };
                        cVar2.f230055a = this;
                        cVar2.f230058d = 1;
                        if (aVar.k(str, spaceInfoResponse, function1, function0, cVar2) == objL) {
                            return objL;
                        }
                    } else {
                        timber.log.b.f381052a.a("findHouseInfo collected null spaceInfoResponse", new Object[0]);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }
        }

        /* synthetic */ class b extends kotlin.jvm.internal.a implements pj.o<com.planner5d.library.api.b, id.a, JSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object>, kotlin.coroutines.jvm.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f230059a = new b();

            b() {
                super(4, com.planner5d.library.api.b.class, "findHouse", "findHouse(Lcom/planner5d/library/modules/user/model/User;Lorg/json/JSONObject;)Lcom/planner5d/library/api/Response;", 4);
            }

            @Override // pj.o
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                return d.m(bVar, aVar, jSONObject, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f230045f = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d dVar) {
            return bVar.d0(aVar, jSONObject);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = a.this.new d(this.f230045f, dVar);
            dVar2.f230043d = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
        
            if (r11.v(r10) == r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.data.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0}, l = {76}, m = "findProject", n = {"address"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230061b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230063d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230061b = obj;
            this.f230063d |= Integer.MIN_VALUE;
            return a.this.o(null, this);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    /* synthetic */ class f extends kotlin.jvm.internal.a implements pj.o<com.planner5d.library.api.b, id.a, JSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object>, kotlin.coroutines.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f230064a = new f();

        f() {
            super(4, com.planner5d.library.api.b.class, "findProject", "findProject(Lcom/planner5d/library/modules/user/model/User;Lorg/json/JSONObject;)Lcom/planner5d/library/api/Response;", 4);
        }

        @Override // pj.o
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return a.p(bVar, aVar, jSONObject, dVar);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {187, 188, 188}, m = "findProjectBackground", n = {"this", "address", "onFinish", "onError", "this", "address", "onFinish", "onError", "this", "address", "onFinish"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f230067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f230069e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230071g;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230069e = obj;
            this.f230071g |= Integer.MIN_VALUE;
            return a.this.q(null, null, null, this);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static final class h<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<SpacesProjectData, Unit> f230073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f230074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f230075d;

        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super SpacesProjectData, Unit> function1, String str, Function0<Unit> function0) {
            this.f230073b = function1;
            this.f230074c = str;
            this.f230075d = function0;
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ProjectInfoResponse projectInfoResponse, kotlin.coroutines.d<? super Unit> dVar) {
            if (projectInfoResponse != null) {
                a aVar = a.this;
                Function1<SpacesProjectData, Unit> function1 = this.f230073b;
                String str = this.f230074c;
                Function0<Unit> function0 = this.f230075d;
                timber.log.b.C2515b c2515b = timber.log.b.f381052a;
                c2515b.a("findProject collected status=" + projectInfoResponse.b(), new Object[0]);
                String strB = projectInfoResponse.b();
                if (Intrinsics.areEqual(strB, r.rabbitMQStatusResult.f224891a)) {
                    ProjectInfo projectInfoA = projectInfoResponse.a();
                    if (projectInfoA != null) {
                        SpacesProjectData spacesProjectData = aVar.f230028m;
                        if (spacesProjectData != null) {
                            spacesProjectData.t(projectInfoA.a());
                        }
                    } else {
                        c2515b.a("No Project data found by address " + str, new Object[0]);
                        function0.invoke();
                    }
                    function1.invoke(aVar.f230028m);
                } else if (Intrinsics.areEqual(strB, r.rabbitMQStatusError.f224891a)) {
                    c2515b.a("Project not found by address " + str, new Object[0]);
                    function0.invoke();
                } else if (Intrinsics.areEqual(strB, r.rabbitMQStatusEnd.f224891a)) {
                    c2515b.a("Finished to receive Project info", new Object[0]);
                }
            } else {
                a aVar2 = a.this;
                Function1<SpacesProjectData, Unit> function2 = this.f230073b;
                timber.log.b.f381052a.a("findProject collected null projectInfoResponse", new Object[0]);
                function2.invoke(aVar2.f230028m);
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "getQueueNameForAddress", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f230076a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f230078c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230076a = obj;
            this.f230078c |= Integer.MIN_VALUE;
            return a.this.s(null, null, this);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$getQueueNameForAddress$response$1", f = "AddressRepository.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f230080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f230081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o<com.planner5d.library.api.b, id.a, JSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> f230082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ JSONObject f230083e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pj.o<? super com.planner5d.library.api.b, ? super id.a, ? super JSONObject, ? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> oVar, JSONObject jSONObject, kotlin.coroutines.d<? super j> dVar) {
            super(3, dVar);
            this.f230082d = oVar;
            this.f230083e = jSONObject;
            int i10 = 5 & 3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230079a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.api.b bVar = (com.planner5d.library.api.b) this.f230080b;
            id.a aVar = (id.a) this.f230081c;
            pj.o<com.planner5d.library.api.b, id.a, JSONObject, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> oVar = this.f230082d;
            JSONObject jSONObject = this.f230083e;
            Intrinsics.checkNotNull(jSONObject);
            this.f230080b = null;
            this.f230079a = 1;
            Object objInvoke = oVar.invoke(bVar, aVar, jSONObject, this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            j jVar = new j(this.f230082d, this.f230083e, dVar);
            jVar.f230080b = bVar;
            jVar.f230081c = aVar;
            return jVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0, 0}, l = {143, 145}, m = "markCurrentSpacesProject", n = {"this", "spaceData"}, s = {"L$0", "L$1"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f230086c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230088e;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230086c = obj;
            this.f230088e |= Integer.MIN_VALUE;
            return a.this.u(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0}, l = {49}, m = FirebaseAnalytics.c.f120629o, n = {"query"}, s = {"L$0"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230090b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230092d;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230090b = obj;
            this.f230092d |= Integer.MIN_VALUE;
            return a.this.z(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160710n}, m = FirebaseAnalytics.c.f120629o, n = {"latitude", "longitude"}, s = {"D$0", "D$1"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f230093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f230094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f230095c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230097e;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230095c = obj;
            this.f230097e |= Integer.MIN_VALUE;
            return a.this.x(0.0d, 0.0d, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository", f = "AddressRepository.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = FirebaseAnalytics.c.f120629o, n = {"this"}, s = {"L$0"})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230099b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230101d;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230099b = obj;
            this.f230101d |= Integer.MIN_VALUE;
            return a.this.y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.data.AddressRepository$search$response$1", f = "AddressRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f230103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f230104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f230105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(JSONObject jSONObject, kotlin.coroutines.d<? super o> dVar) {
            super(3, dVar);
            this.f230105d = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f230102a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f230103b).Z((id.a) this.f230104c, this.f230105d);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            o oVar = new o(this.f230105d, dVar);
            oVar.f230103b = bVar;
            oVar.f230104c = aVar;
            return oVar.invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.api.requests.c api, @NotNull com.planner5d.library.model.manager.k crashReporterService, @NotNull fe.a findHouseInfoUseCase, @NotNull fe.b findProjectUseCase, @NotNull f1 globalScope, @NotNull p sharedPreferences, @NotNull com.planner5d.library.spaces.data.e spacesManagerService, @NotNull w userAuthorizationService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(crashReporterService, "crashReporterService");
        Intrinsics.checkNotNullParameter(findHouseInfoUseCase, "findHouseInfoUseCase");
        Intrinsics.checkNotNullParameter(findProjectUseCase, "findProjectUseCase");
        Intrinsics.checkNotNullParameter(globalScope, "globalScope");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(spacesManagerService, "spacesManagerService");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        this.f230016a = api;
        this.f230017b = crashReporterService;
        this.f230018c = findHouseInfoUseCase;
        this.f230019d = findProjectUseCase;
        this.f230020e = globalScope;
        this.f230021f = sharedPreferences;
        this.f230022g = spacesManagerService;
        this.f230023h = userAuthorizationService;
        com.squareup.moshi.w wVarI = new com.squareup.moshi.w.c().i();
        Intrinsics.checkNotNullExpressionValue(wVarI, "build(...)");
        this.f230024i = wVarI;
        com.squareup.moshi.h<AddressSearchQuery> hVarC = wVarI.c(AddressSearchQuery.class);
        Intrinsics.checkNotNullExpressionValue(hVarC, "adapter(...)");
        this.f230025j = hVarC;
        ParameterizedType parameterizedTypeM = a0.m(List.class, AddressSearchResult.class);
        this.f230026k = parameterizedTypeM;
        com.squareup.moshi.h<List<AddressSearchResult>> hVarD = wVarI.d(parameterizedTypeM);
        Intrinsics.checkNotNullExpressionValue(hVarD, "adapter(...)");
        this.f230027l = hVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object m(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d dVar) {
        return bVar.d0(aVar, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object p(com.planner5d.library.api.b bVar, id.a aVar, JSONObject jSONObject, kotlin.coroutines.d dVar) {
        return bVar.T(aVar, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object s(String str, pj.o<? super com.planner5d.library.api.b, ? super id.a, ? super JSONObject, ? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> oVar, kotlin.coroutines.d<? super String> dVar) throws Throwable {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f230078c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f230078c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        i iVar2 = iVar;
        Object objG = iVar2.f230076a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar2.f230078c;
        if (i11 == 0) {
            ResultKt.m(objG);
            JSONObject jSONObjectPut = new JSONObject().put(r.address.f224891a, str);
            com.planner5d.library.api.requests.c cVar = this.f230016a;
            id.a aVarA = this.f230023h.a();
            j jVar = new j(oVar, jSONObjectPut, null);
            iVar2.f230078c = 1;
            objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, jVar, iVar2, 2, null);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objG);
        }
        return ((com.planner5d.library.api.c) objG).a().getString(r.queueName.f224891a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r6.L(r7, true, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.planner5d.library.spaces.entity.SpacesProjectData r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.planner5d.library.spaces.data.a.k
            r5 = 4
            if (r0 == 0) goto L18
            r0 = r8
            r5 = 6
            com.planner5d.library.spaces.data.a$k r0 = (com.planner5d.library.spaces.data.a.k) r0
            int r1 = r0.f230088e
            r5 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 4
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r5 = 4
            r0.f230088e = r1
            goto L1e
        L18:
            r5 = 1
            com.planner5d.library.spaces.data.a$k r0 = new com.planner5d.library.spaces.data.a$k
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f230086c
            r5 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 5
            int r2 = r0.f230088e
            r3 = 2
            r5 = 4
            r4 = 1
            if (r2 == 0) goto L4e
            r5 = 5
            if (r2 == r4) goto L40
            if (r2 != r3) goto L36
            kotlin.ResultKt.m(r8)
            goto L7d
        L36:
            r5 = 6
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 4
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            r5 = 1
            java.lang.Object r6 = r0.f230085b
            r7 = r6
            com.planner5d.library.spaces.entity.SpacesProjectData r7 = (com.planner5d.library.spaces.entity.SpacesProjectData) r7
            java.lang.Object r6 = r0.f230084a
            com.planner5d.library.spaces.data.a r6 = (com.planner5d.library.spaces.data.a) r6
            kotlin.ResultKt.m(r8)
            goto L65
        L4e:
            r5 = 0
            kotlin.ResultKt.m(r8)
            r5 = 3
            com.planner5d.library.spaces.data.e r8 = r6.f230022g
            r0.f230084a = r6
            r5 = 0
            r0.f230085b = r7
            r5 = 5
            r0.f230088e = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L65
            r5 = 6
            goto L7b
        L65:
            r6.f230028m = r7
            com.planner5d.library.model.manager.config.p r6 = r6.f230021f
            com.planner5d.library.services.r r7 = com.planner5d.library.services.r.spacesProjectWasFound
            r8 = 0
            r5 = r8
            r0.f230084a = r8
            r0.f230085b = r8
            r5 = 3
            r0.f230088e = r3
            java.lang.Object r6 = r6.L(r7, r4, r0)
            r5 = 2
            if (r6 != r1) goto L7d
        L7b:
            r5 = 5
            return r1
        L7d:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.data.a.u(com.planner5d.library.spaces.entity.SpacesProjectData, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(kotlin.coroutines.d<? super Unit> dVar) {
        Object objU = u(new SpacesProjectData(), dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object y(AddressSearchQuery addressSearchQuery, kotlin.coroutines.d<? super List<AddressSearchResult>> dVar) throws Throwable {
        n nVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f230101d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f230101d = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        n nVar2 = nVar;
        Object objG = nVar2.f230099b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar2.f230101d;
        if (i11 == 0) {
            ResultKt.m(objG);
            JSONObject jSONObject = new JSONObject(this.f230025j.l(addressSearchQuery));
            com.planner5d.library.api.requests.c cVar = this.f230016a;
            id.a aVarA = this.f230023h.a();
            o oVar = new o(jSONObject, null);
            nVar2.f230098a = this;
            nVar2.f230101d = 1;
            objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, oVar, nVar2, 2, null);
            if (objG == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (a) nVar2.f230098a;
            ResultKt.m(objG);
        }
        return this.f230027l.c(((com.planner5d.library.api.c) objG).a().getJSONArray(r.address.f224891a).toString());
    }

    public final void A(@NotNull SpacesProjectData spacesData) {
        Intrinsics.checkNotNullParameter(spacesData, "spacesData");
        this.f230028m = spacesData;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public final Object k(@NotNull String str, @Nullable SpaceInfoResponse spaceInfoResponse, @NotNull Function1<? super SpacesProjectData, Unit> function1, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C1695a c1695a;
        if (dVar instanceof C1695a) {
            c1695a = (C1695a) dVar;
            int i10 = c1695a.f230034f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1695a.f230034f = i10 - Integer.MIN_VALUE;
            } else {
                c1695a = new C1695a(dVar);
            }
        } else {
            c1695a = new C1695a(dVar);
        }
        C1695a c1695a2 = c1695a;
        Object obj = c1695a2.f230032d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1695a2.f230034f;
        if (i11 == 0) {
            ResultKt.m(obj);
            String strB = spaceInfoResponse != null ? spaceInfoResponse.b() : null;
            if (Intrinsics.areEqual(strB, r.rabbitMQStatusResult.f224891a)) {
                SpaceInfo spaceInfoA = spaceInfoResponse.a();
                if (spaceInfoA != null) {
                    Integer numB = spaceInfoA.b();
                    Integer numF = kotlin.coroutines.jvm.internal.b.f(numB != null ? numB.intValue() : 0);
                    Integer numE = spaceInfoA.e();
                    Integer numF2 = kotlin.coroutines.jvm.internal.b.f(numE != null ? numE.intValue() : 0);
                    Long lF = spaceInfoA.f();
                    Long lG = kotlin.coroutines.jvm.internal.b.g(lF != null ? lF.longValue() : 0L);
                    Integer numG = spaceInfoA.g();
                    Integer numF3 = kotlin.coroutines.jvm.internal.b.f(numG != null ? numG.intValue() : 0);
                    String strD = spaceInfoA.d();
                    if (strD == null) {
                        strD = "-";
                    }
                    this.f230028m = new SpacesProjectData(str, numF, numF2, lG, numF3, strD, null);
                    c1695a2.f230029a = this;
                    c1695a2.f230030b = str;
                    c1695a2.f230031c = function0;
                    c1695a2.f230034f = 1;
                    if (q(str, function1, function0, c1695a2) == objL) {
                        return objL;
                    }
                } else {
                    timber.log.b.f381052a.a("No Space data found by address " + str, new Object[0]);
                    function0.invoke();
                }
            } else if (Intrinsics.areEqual(strB, r.rabbitMQStatusEnd.f224891a)) {
                timber.log.b.f381052a.a("Finished to receive Space info", new Object[0]);
            } else if (Intrinsics.areEqual(strB, r.rabbitMQStatusError.f224891a)) {
                timber.log.b.f381052a.a("Space not found by address " + str, new Object[0]);
                function0.invoke();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object l(@NotNull String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f230038d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f230038d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f230036b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f230038d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            pj.o<? super com.planner5d.library.api.b, ? super id.a, ? super JSONObject, ? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> oVar = c.f230039a;
            bVar.f230035a = str;
            bVar.f230038d = 1;
            Object objS = s(str, oVar, bVar);
            return objS == objL ? objL : objS;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to find house by address '" + str + "'", new Object[0]);
            return null;
        }
    }

    public final void n(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f230028m = null;
        int i10 = 5 << 2;
        kotlinx.coroutines.k.f(this.f230020e, s.f229729a.h(), null, new d(address, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object o(@NotNull String str, @NotNull kotlin.coroutines.d<? super String> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f230063d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f230063d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f230061b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f230063d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            pj.o<? super com.planner5d.library.api.b, ? super id.a, ? super JSONObject, ? super kotlin.coroutines.d<? super com.planner5d.library.api.c>, ? extends Object> oVar = f.f230064a;
            eVar.f230060a = str;
            eVar.f230063d = 1;
            Object objS = s(str, oVar, eVar);
            return objS == objL ? objL : objS;
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Failed to find project by address '" + str + "'", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r12.collect(r2, r0) == r1) goto L29;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.planner5d.library.spaces.entity.SpacesProjectData, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.data.a.q(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final SpacesProjectData r() {
        return this.f230028m;
    }

    public final boolean t() {
        SpacesProjectData spacesProjectData = this.f230028m;
        return (spacesProjectData == null || spacesProjectData.r()) ? false : true;
    }

    @NotNull
    public final SpacesProjectData w() {
        SpacesProjectData spacesProjectData = this.f230028m;
        if (spacesProjectData != null) {
            return spacesProjectData;
        }
        throw new IllegalStateException("Expected not empty SpacesProjectData but it was null");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(double d10, double d11, @NotNull kotlin.coroutines.d<? super List<AddressSearchResult>> dVar) {
        m mVar;
        Throwable th2;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f230097e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f230097e = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f230095c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f230097e;
        if (i11 == 0) {
            ResultKt.m(obj);
            try {
                try {
                    AddressSearchQuery addressSearchQuery = new AddressSearchQuery(null, d10, d11);
                    mVar.f230093a = d10;
                    mVar.f230094b = d11;
                    mVar.f230097e = 1;
                    Object objY = y(addressSearchQuery, mVar);
                    return objY == objL ? objL : objY;
                } catch (Throwable th3) {
                    th2 = th3;
                    d10 = d10;
                    d11 = d11;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = mVar.f230094b;
            d10 = mVar.f230093a;
            try {
                ResultKt.m(obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        th2 = th;
        timber.log.b.f381052a.f(th2, "Failed to find project by coordinates '" + d10 + ":" + d11 + "'", new Object[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object z(@NotNull String str, @NotNull kotlin.coroutines.d<? super List<AddressSearchResult>> dVar) {
        l lVar;
        Throwable th2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i10 = lVar.f230092d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f230092d = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f230090b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = lVar.f230092d;
        if (i11 == 0) {
            ResultKt.m(obj);
            try {
                try {
                    AddressSearchQuery addressSearchQuery = new AddressSearchQuery(str, 0.0d, 0.0d, 6, null);
                    lVar.f230089a = str;
                    lVar.f230092d = 1;
                    Object objY = y(addressSearchQuery, lVar);
                    return objY == objL ? objL : objY;
                } catch (Throwable th3) {
                    th2 = th3;
                    str = str;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) lVar.f230089a;
            try {
                ResultKt.m(obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        th2 = th;
        timber.log.b.f381052a.f(th2, "Failed to find address by query '" + str + "'", new Object[0]);
        return null;
    }
}
