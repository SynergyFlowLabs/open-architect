package com.planner5d.library.modules.user.user;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nUserProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties\n*L\n1#1,90:1\n28#1,10:91\n77#1,4:101\n77#1,4:105\n*S KotlinDebug\n*F\n+ 1 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties\n*L\n20#1:91,10\n44#1:101,4\n58#1:105,4\n*E\n"})
public final class q0 implements r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f223248c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f223249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.b f223250b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserProperties", f = "UserProperties.kt", i = {0, 0}, l = {21}, m = "get", n = {"property", "this_$iv"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223253c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223255e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223253c = obj;
            this.f223255e |= Integer.MIN_VALUE;
            return q0.this.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserProperties$get$2$1", f = "UserProperties.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f223257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f223259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.services.r rVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f223259d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223256a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f223257b).P0((id.a) this.f223258c, this.f223259d.f224891a);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            b bVar2 = new b(this.f223259d, dVar);
            bVar2.f223257b = bVar;
            bVar2.f223258c = aVar;
            return bVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nUserProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties$setUserProperties$2\n+ 2 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties\n*L\n1#1,78:1\n45#2,3:79\n*E\n"})
    public static final class c implements Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.a f223260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f223261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f223262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f223263d;

        public c(id.a aVar, com.planner5d.library.services.r rVar, q0 q0Var, boolean z10) {
            this.f223260a = aVar;
            this.f223261b = rVar;
            this.f223262c = q0Var;
            this.f223263d = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final com.planner5d.library.api.c invoke(com.planner5d.library.api.b call) throws JSONException {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            id.a aVar = this.f223260a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f223261b.f224891a, this.f223262c.h(this.f223263d));
            com.planner5d.library.api.c cVarJ0 = call.j0(aVar, jSONObject);
            Intrinsics.checkNotNullExpressionValue(cVarJ0, "setUserProperty(...)");
            return cVarJ0;
        }
    }

    @SourceDebugExtension({"SMAP\nUserProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties$setUserProperties$2\n+ 2 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n59#2,2:79\n61#2,2:82\n63#2:85\n216#3:81\n217#3:84\n*S KotlinDebug\n*F\n+ 1 UserProperties.kt\ncom/planner5d/library/modules/user/user/UserProperties\n*L\n60#1:81\n60#1:84\n*E\n"})
    public static final class d implements Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.a f223264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f223265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f223266c;

        public d(id.a aVar, Map map, q0 q0Var) {
            this.f223264a = aVar;
            this.f223265b = map;
            this.f223266c = q0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final com.planner5d.library.api.c invoke(com.planner5d.library.api.b call) throws JSONException {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            id.a aVar = this.f223264a;
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f223265b.entrySet()) {
                jSONObject.put(((com.planner5d.library.services.r) entry.getKey()).f224891a, this.f223266c.h(((Boolean) entry.getValue()).booleanValue()));
            }
            com.planner5d.library.api.c cVarJ0 = call.j0(aVar, jSONObject);
            Intrinsics.checkNotNullExpressionValue(cVarJ0, "setUserProperty(...)");
            return cVarJ0;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserProperties", f = "UserProperties.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "set", n = {"property", "value"}, s = {"L$0", "Z$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f223268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f223269c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223271e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223269c = obj;
            this.f223271e |= Integer.MIN_VALUE;
            return q0.this.f(null, null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserProperties", f = "UserProperties.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "set", n = {"propertiesMap"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f223273b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223275d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223273b = obj;
            this.f223275d |= Integer.MIN_VALUE;
            return q0.this.a(null, null, this);
        }
    }

    public static final class g implements Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.a f223276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<JSONObject> f223277b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(id.a aVar, Function0<? extends JSONObject> function0) {
            this.f223276a = aVar;
            this.f223277b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final com.planner5d.library.api.c invoke(com.planner5d.library.api.b call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            com.planner5d.library.api.c cVarJ0 = call.j0(this.f223276a, this.f223277b.invoke());
            Intrinsics.checkNotNullExpressionValue(cVarJ0, "setUserProperty(...)");
            return cVarJ0;
        }
    }

    @ij.a
    public q0(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.api.b api) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(api, "api");
        this.f223249a = userApiRequester;
        this.f223250b = api;
    }

    private final Boolean e(com.planner5d.library.services.r rVar, Function0<? extends JSONObject> function0) throws Exception {
        try {
            JSONObject jSONObjectInvoke = function0.invoke();
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.upropSettings;
            if (jSONObjectInvoke.has(rVar2.f224891a)) {
                JSONObject jSONObject = jSONObjectInvoke.getJSONObject(rVar2.f224891a);
                return b(jSONObject.has(rVar.f224891a) ? Integer.valueOf(jSONObject.getInt(rVar.f224891a)) : null);
            }
            throw new JSONException("Invalid response data - missing " + rVar2.f224891a);
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to get user property.", new Object[0]);
            throw e10;
        }
    }

    private final Object g(id.a aVar, Function0<? extends JSONObject> function0, kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
        com.planner5d.library.api.b bVar2 = this.f223250b;
        g gVar = new g(aVar, function0);
        kotlin.jvm.internal.h0.e(0);
        bVar.c(bVar2, gVar, dVar);
        kotlin.jvm.internal.h0.e(1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(boolean z10) {
        return z10 ? 3 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.planner5d.library.modules.user.user.r0
    @Nullable
    public Object a(@NotNull id.a aVar, @NotNull Map<com.planner5d.library.services.r, Boolean> map, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f223275d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f223275d = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f223273b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f223275d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
                com.planner5d.library.api.b bVar2 = this.f223250b;
                d dVar2 = new d(aVar, map, this);
                fVar.f223272a = map;
                fVar.f223275d = 1;
                if (bVar.c(bVar2, dVar2, fVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) fVar.f223272a;
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to save propertiesMap " + map + " to user property", new Object[0]);
            throw e10;
        }
    }

    @Override // com.planner5d.library.modules.user.user.r0
    @Nullable
    public Boolean b(@Nullable Integer num) {
        if (num != null && num.intValue() == 2) {
            return Boolean.FALSE;
        }
        if (num != null && num.intValue() == 3) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.planner5d.library.modules.user.user.r0
    @Nullable
    public Object c(@Nullable id.a aVar, @NotNull com.planner5d.library.services.r rVar, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Exception {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f223255e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f223255e = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        a aVar3 = aVar2;
        Object objG = aVar3.f223253c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar3.f223255e;
        try {
            if (i11 == 0) {
                ResultKt.m(objG);
                com.planner5d.library.api.requests.c cVar = this.f223249a;
                b bVar = new b(rVar, null);
                aVar3.f223251a = rVar;
                aVar3.f223252b = this;
                aVar3.f223255e = 1;
                objG = com.planner5d.library.api.requests.c.g(cVar, aVar, null, bVar, aVar3, 2, null);
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (q0) aVar3.f223252b;
                rVar = (com.planner5d.library.services.r) aVar3.f223251a;
                ResultKt.m(objG);
            }
            JSONObject jSONObjectA = ((com.planner5d.library.api.c) objG).a();
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.upropSettings;
            if (jSONObjectA.has(rVar2.f224891a)) {
                JSONObject jSONObject = jSONObjectA.getJSONObject(rVar2.f224891a);
                return this.b(jSONObject.has(rVar.f224891a) ? kotlin.coroutines.jvm.internal.b.f(jSONObject.getInt(rVar.f224891a)) : null);
            }
            throw new JSONException("Invalid response data - missing " + rVar2.f224891a);
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to get user property.", new Object[0]);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object f(@NotNull id.a aVar, @NotNull com.planner5d.library.services.r rVar, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f223271e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f223271e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f223269c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f223271e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.services.utility.b bVar = com.planner5d.library.services.utility.b.f225044a;
                com.planner5d.library.api.b bVar2 = this.f223250b;
                c cVar = new c(aVar, rVar, this, z10);
                eVar.f223267a = rVar;
                eVar.f223268b = z10;
                eVar.f223271e = 1;
                if (bVar.c(bVar2, cVar, eVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = eVar.f223268b;
                rVar = (com.planner5d.library.services.r) eVar.f223267a;
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to save value " + z10 + " to user property with name " + rVar.f224891a, new Object[0]);
            throw e10;
        }
    }
}
