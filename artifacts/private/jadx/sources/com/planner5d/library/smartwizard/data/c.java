package com.planner5d.library.smartwizard.data;

import android.app.Application;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.database.model.RoomStyle;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i0;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nRoomStyleRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleRepository.kt\ncom/planner5d/library/smartwizard/data/RoomStyleRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1863#2,2:82\n*S KotlinDebug\n*F\n+ 1 RoomStyleRepository.kt\ncom/planner5d/library/smartwizard/data/RoomStyleRepository\n*L\n31#1:82,2\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f229897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f229898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f229899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w f229900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f229901e;

    @f(c = "com.planner5d.library.smartwizard.data.RoomStyleRepository", f = "RoomStyleRepository.kt", i = {0, 1, 2, 2}, l = {28, 30, 32}, m = "getRoomStyles", n = {"this", "this", "this", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f229902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f229903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f229904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f229905d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f229907f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f229905d = obj;
            this.f229907f |= Integer.MIN_VALUE;
            return c.this.j(this);
        }
    }

    @f(c = "com.planner5d.library.smartwizard.data.RoomStyleRepository$getRoomStylesFromAPi$2", f = "RoomStyleRepository.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomStyleRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleRepository.kt\ncom/planner5d/library/smartwizard/data/RoomStyleRepository$getRoomStylesFromAPi$2\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n163#2,3:82\n167#2:86\n1#3:85\n*S KotlinDebug\n*F\n+ 1 RoomStyleRepository.kt\ncom/planner5d/library/smartwizard/data/RoomStyleRepository$getRoomStylesFromAPi$2\n*L\n53#1:82,3\n53#1:86\n53#1:85\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends RoomStyle>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229908a;

        @f(c = "com.planner5d.library.smartwizard.data.RoomStyleRepository$getRoomStylesFromAPi$2$response$1", f = "RoomStyleRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f229911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f229912c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f229913d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f229913d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229910a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f229911b).z0((id.a) this.f229912c, 1, this.f229913d.f229897a.getPackageName(), h3.j(this.f229913d.f229897a), h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(this.f229913d, dVar);
                aVar2.f229911b = bVar;
                aVar2.f229912c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends RoomStyle>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<RoomStyle>>) dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            b bVar;
            JSONArray jSONArrayB;
            ?? EmptyList;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229908a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = c.this.f229899c;
                id.a aVarA = c.this.f229900d.a();
                a aVar = new a(c.this, null);
                this.f229908a = 1;
                bVar = this;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, aVar, bVar, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                bVar = this;
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            if (cVar2 != null && (jSONArrayB = cVar2.b()) != null) {
                c cVar3 = c.this;
                int length = jSONArrayB.length();
                if (length > 0) {
                    EmptyList = new ArrayList(length);
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject = jSONArrayB.getJSONObject(i11);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                        EmptyList.add(cVar3.i(jSONObject));
                    }
                } else {
                    EmptyList = CollectionsKt.emptyList();
                }
                if (EmptyList != 0) {
                    return EmptyList;
                }
            }
            return CollectionsKt.emptyList();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.smartwizard.data.c$c, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.smartwizard.data.RoomStyleRepository$getRoomStylesFromDB$2", f = "RoomStyleRepository.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class C1693c extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends RoomStyle>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229914a;

        C1693c(kotlin.coroutines.d<? super C1693c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C1693c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends RoomStyle>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<RoomStyle>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229914a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.database.manager.a aVar = c.this.f229898b;
            this.f229914a = 1;
            Object objI = aVar.i(this);
            return objI == objL ? objL : objI;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
            return ((C1693c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull Application application, @NotNull com.planner5d.library.database.manager.a databaseManager, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull w userAuthorizationService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        this.f229897a = application;
        this.f229898b = databaseManager;
        this.f229899c = userApiRequester;
        this.f229900d = userAuthorizationService;
        this.f229901e = i0.b(7L);
    }

    private final boolean h(List<RoomStyle> list) {
        return list.isEmpty() || new Date().getTime() - list.get(0).s().getTime() > this.f229901e || list.get(0).w() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomStyle i(JSONObject jSONObject) {
        RoomStyle roomStyle = new RoomStyle();
        roomStyle.N(jSONObject.getLong(r.id.f224891a));
        String strZ = k1.z(jSONObject, r.roomStyleName.f224891a, null, 4, null);
        if (strZ == null) {
            strZ = "null name";
        }
        roomStyle.M(strZ);
        roomStyle.Q(m(jSONObject, "en"));
        roomStyle.W(m(jSONObject, "ru"));
        roomStyle.R(m(jSONObject, "es"));
        roomStyle.V(m(jSONObject, "pt"));
        roomStyle.S(m(jSONObject, "fr"));
        roomStyle.P(m(jSONObject, "de"));
        roomStyle.T(m(jSONObject, MetricConsts.Install));
        roomStyle.U(m(jSONObject, "jp"));
        roomStyle.O(m(jSONObject, "ar"));
        roomStyle.X(m(jSONObject, "zh_hans"));
        roomStyle.Y(m(jSONObject, "zh_hant"));
        roomStyle.Z(k1.b(jSONObject, r.usedInAiDesignGenerator.f224891a));
        roomStyle.a0(k1.b(jSONObject, r.usedInAiSmartWizard.f224891a));
        roomStyle.L(k1.z(jSONObject, r.roomStyleImageUri.f224891a, null, 4, null));
        return roomStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
        return i.h(s.f229729a.b(), new b(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(kotlin.coroutines.d<? super List<RoomStyle>> dVar) {
        return i.h(s.f229729a.h(), new C1693c(null), dVar);
    }

    private final String m(JSONObject jSONObject, String str) {
        return k1.z(jSONObject, r.title.f224891a + "_" + str, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r8 == r1) goto L33;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<com.planner5d.library.database.model.RoomStyle>> r8) throws java.io.IOException {
        /*
            r7 = this;
            r6 = 1
            boolean r0 = r8 instanceof com.planner5d.library.smartwizard.data.c.a
            if (r0 == 0) goto L19
            r0 = r8
            r6 = 5
            com.planner5d.library.smartwizard.data.c$a r0 = (com.planner5d.library.smartwizard.data.c.a) r0
            r6 = 3
            int r1 = r0.f229907f
            r6 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r6 = 2
            if (r3 == 0) goto L19
            r6 = 6
            int r1 = r1 - r2
            r0.f229907f = r1
            goto L20
        L19:
            r6 = 0
            com.planner5d.library.smartwizard.data.c$a r0 = new com.planner5d.library.smartwizard.data.c$a
            r6 = 0
            r0.<init>(r8)
        L20:
            r6 = 0
            java.lang.Object r8 = r0.f229905d
            r6 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 5
            int r2 = r0.f229907f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            r6 = 6
            if (r2 == r5) goto L5f
            if (r2 == r4) goto L55
            r6 = 7
            if (r2 != r3) goto L4a
            java.lang.Object r7 = r0.f229904c
            java.util.Iterator r7 = (java.util.Iterator) r7
            r6 = 5
            java.lang.Object r2 = r0.f229903b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f229902a
            com.planner5d.library.smartwizard.data.c r4 = (com.planner5d.library.smartwizard.data.c) r4
            r6 = 7
            kotlin.ResultKt.m(r8)
            goto L98
        L4a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 3
            java.lang.String r8 = "tivmea/l /oihr/ue//nrom/ cr  sloi bcu/o etfweenoekt"
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L55:
            java.lang.Object r7 = r0.f229902a
            r6 = 7
            com.planner5d.library.smartwizard.data.c r7 = (com.planner5d.library.smartwizard.data.c) r7
            r6 = 4
            kotlin.ResultKt.m(r8)
            goto L89
        L5f:
            java.lang.Object r7 = r0.f229902a
            com.planner5d.library.smartwizard.data.c r7 = (com.planner5d.library.smartwizard.data.c) r7
            kotlin.ResultKt.m(r8)
            goto L76
        L67:
            r6 = 7
            kotlin.ResultKt.m(r8)
            r0.f229902a = r7
            r0.f229907f = r5
            java.lang.Object r8 = r7.l(r0)
            if (r8 != r1) goto L76
            goto Lb8
        L76:
            java.util.List r8 = (java.util.List) r8
            boolean r2 = r7.h(r8)
            if (r2 == 0) goto Lbb
            r0.f229902a = r7
            r0.f229907f = r4
            java.lang.Object r8 = r7.k(r0)
            if (r8 != r1) goto L89
            goto Lb8
        L89:
            r6 = 3
            java.util.List r8 = (java.util.List) r8
            r2 = r8
            r2 = r8
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r6 = 1
            java.util.Iterator r2 = r2.iterator()
            r4 = r7
            r7 = r2
            r2 = r8
        L98:
            boolean r8 = r7.hasNext()
            r6 = 2
            if (r8 == 0) goto Lb9
            r6 = 5
            java.lang.Object r8 = r7.next()
            com.planner5d.library.database.model.RoomStyle r8 = (com.planner5d.library.database.model.RoomStyle) r8
            com.planner5d.library.database.manager.a r5 = r4.f229898b
            r6 = 0
            r0.f229902a = r4
            r6 = 7
            r0.f229903b = r2
            r0.f229904c = r7
            r0.f229907f = r3
            java.lang.Object r8 = r5.l(r8, r0)
            if (r8 != r1) goto L98
        Lb8:
            return r1
        Lb9:
            r6 = 6
            return r2
        Lbb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.smartwizard.data.c.j(kotlin.coroutines.d):java.lang.Object");
    }
}
