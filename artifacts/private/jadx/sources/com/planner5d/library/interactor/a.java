package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.ai.CustomerSatisfactionIndex;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class a implements le.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f180026g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.uploadplan.g f180027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f180028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f180029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f180030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c2 f180031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f180032f;

    /* JADX INFO: renamed from: com.planner5d.library.interactor.a$a, reason: collision with other inner class name */
    private enum EnumC1558a {
        projectHash,
        rate,
        description,
        source,
        userId;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f180039g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<EnumC1558a> l() {
            return f180039g;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.CustomerSatisfactionIndexInteractor", f = "CustomerSatisfactionIndexInteractor.kt", i = {}, l = {32}, m = "hasRated", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180040a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180042c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180040a = obj;
            this.f180042c |= Integer.MIN_VALUE;
            return a.this.b(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.CustomerSatisfactionIndexInteractor$sendRating$2", f = "CustomerSatisfactionIndexInteractor.kt", i = {}, l = {47, 53}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCustomerSatisfactionIndexInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSatisfactionIndexInteractor.kt\ncom/planner5d/library/interactor/CustomerSatisfactionIndexInteractor$sendRating$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180043a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f180045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f180046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f180047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ le.a.EnumC2326a f180048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.a f180049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f180050h;

        /* JADX INFO: renamed from: com.planner5d.library.interactor.a$c$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.CustomerSatisfactionIndexInteractor$sendRating$2$3", f = "CustomerSatisfactionIndexInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1559a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f180052b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f180053c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f180054d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f180055e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1559a(JSONObject jSONObject, a aVar, kotlin.coroutines.d<? super C1559a> dVar) {
                super(3, dVar);
                this.f180054d = jSONObject;
                this.f180055e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f180051a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f180052b).K((id.a) this.f180053c, this.f180054d, this.f180055e.f180028b.getPackageName(), h3.j(this.f180055e.f180028b), h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1559a c1559a = new C1559a(this.f180054d, this.f180055e, dVar);
                c1559a.f180052b = bVar;
                c1559a.f180053c = aVar;
                return c1559a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, String str2, le.a.EnumC2326a enumC2326a, id.a aVar, long j10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f180045c = str;
            this.f180046d = i10;
            this.f180047e = str2;
            this.f180048f = enumC2326a;
            this.f180049g = aVar;
            this.f180050h = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new c(this.f180045c, this.f180046d, this.f180047e, this.f180048f, this.f180049g, this.f180050h, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
        
            if (r13.i(r3, r9) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.interactor.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.CustomerSatisfactionIndexInteractor", f = "CustomerSatisfactionIndexInteractor.kt", i = {0, 0}, l = {63, 66}, m = "setRated", n = {"this", "projectId"}, s = {"L$0", "J$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f180057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f180058c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180060e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180058c = obj;
            this.f180060e |= Integer.MIN_VALUE;
            return a.this.i(0L, this);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.model.manager.uploadplan.g customerSatisfactionIndexRepository, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull b2 messageManager, @NotNull c2 networkStateUtility, @NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(customerSatisfactionIndexRepository, "customerSatisfactionIndexRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        this.f180027a = customerSatisfactionIndexRepository;
        this.f180028b = application;
        this.f180029c = userApiRequester;
        this.f180030d = messageManager;
        this.f180031e = networkStateUtility;
        this.f180032f = errorMessageParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r6.c(r9, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r7, kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.planner5d.library.interactor.a.d
            r5 = 2
            if (r0 == 0) goto L17
            r0 = r9
            r5 = 4
            com.planner5d.library.interactor.a$d r0 = (com.planner5d.library.interactor.a.d) r0
            int r1 = r0.f180060e
            r5 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f180060e = r1
            r5 = 2
            goto L1c
        L17:
            com.planner5d.library.interactor.a$d r0 = new com.planner5d.library.interactor.a$d
            r0.<init>(r9)
        L1c:
            r5 = 2
            java.lang.Object r9 = r0.f180058c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 7
            int r2 = r0.f180060e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L32
            kotlin.ResultKt.m(r9)
            goto L87
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 0
            java.lang.String r7 = "fu/irb/v/sn//o/nc ao  cte/beerttul ikiooo e/eh wmel"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            long r7 = r0.f180057b
            java.lang.Object r6 = r0.f180056a
            com.planner5d.library.interactor.a r6 = (com.planner5d.library.interactor.a) r6
            r5 = 4
            kotlin.ResultKt.m(r9)
            goto L5d
        L48:
            kotlin.ResultKt.m(r9)
            r5 = 0
            com.planner5d.library.model.manager.uploadplan.g r9 = r6.f180027a
            r0.f180056a = r6
            r0.f180057b = r7
            r5 = 7
            r0.f180060e = r4
            java.lang.Object r9 = r9.b(r7, r0)
            if (r9 != r1) goto L5d
            r5 = 0
            goto L86
        L5d:
            com.planner5d.library.model.ai.CustomerSatisfactionIndex r9 = (com.planner5d.library.model.ai.CustomerSatisfactionIndex) r9
            if (r9 != 0) goto L68
            r5 = 0
            com.planner5d.library.model.ai.CustomerSatisfactionIndex r9 = new com.planner5d.library.model.ai.CustomerSatisfactionIndex
            r5 = 1
            r9.<init>()
        L68:
            r5 = 1
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.b.g(r7)
            r9.w(r7)
            r5 = 3
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            r9.x(r7)
            com.planner5d.library.model.manager.uploadplan.g r6 = r6.f180027a
            r7 = 0
            r0.f180056a = r7
            r0.f180060e = r3
            r5 = 3
            java.lang.Object r6 = r6.c(r9, r0)
            if (r6 != r1) goto L87
        L86:
            return r1
        L87:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.interactor.a.i(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // le.a
    @Nullable
    public Object a(int i10, @NotNull String str, long j10, @Nullable String str2, @Nullable id.a aVar, @Nullable le.a.EnumC2326a enumC2326a, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws JSONException {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new c(str, i10, str2, enumC2326a, aVar, j10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // le.a
    @Nullable
    public Object b(long j10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f180042c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f180042c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objB = bVar.f180040a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f180042c;
        if (i11 == 0) {
            ResultKt.m(objB);
            com.planner5d.library.model.manager.uploadplan.g gVar = this.f180027a;
            bVar.f180042c = 1;
            objB = gVar.b(j10, bVar);
            if (objB == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objB);
        }
        CustomerSatisfactionIndex customerSatisfactionIndex = (CustomerSatisfactionIndex) objB;
        if (customerSatisfactionIndex != null) {
            return kotlin.coroutines.jvm.internal.b.a(customerSatisfactionIndex.v());
        }
        return null;
    }
}
