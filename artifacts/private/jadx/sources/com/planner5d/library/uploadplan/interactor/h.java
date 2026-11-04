package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.k1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements ke.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f230760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f230761b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.ClearFailedTasksInteractor$clearFailedTasks$2", f = "ClearFailedTasksInteractor.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nClearFailedTasksInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearFailedTasksInteractor.kt\ncom/planner5d/library/uploadplan/interactor/ClearFailedTasksInteractor$clearFailedTasks$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230762a;

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.interactor.h$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.ClearFailedTasksInteractor$clearFailedTasks$2$response$1", f = "ClearFailedTasksInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1709a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f230765b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f230766c;

            C1709a(kotlin.coroutines.d<? super C1709a> dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f230764a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f230765b).I0((id.a) this.f230766c);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1709a c1709a = new C1709a(dVar);
                c1709a.f230765b = bVar;
                c1709a.f230766c = aVar;
                return c1709a.invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            a aVar;
            String strZ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230762a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = h.this.f230760a;
                id.a aVarA = h.this.f230761b.a();
                C1709a c1709a = new C1709a(null);
                this.f230762a = 1;
                aVar = this;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1709a, aVar, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                aVar = this;
            }
            Intrinsics.checkNotNull(obj);
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            if (cVar2.h() || !cVar2.a().has("tasks")) {
                return Unit.f312394a;
            }
            JSONArray jSONArray = cVar2.a().getJSONArray("tasks");
            Intrinsics.checkNotNull(jSONArray);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj2 = jSONArray.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                if (StringsKt.O1(k1.z(jSONObject, "status", null, 4, null), "error", false, 2, null) && (strZ = k1.z(jSONObject, "id", null, 4, null)) != null) {
                    h.this.f(strZ);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f230760a = userApiRequester;
        this.f230761b = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final String str) {
        try {
            this.f230760a.j(this.f230761b.a(), new Function2() { // from class: com.planner5d.library.uploadplan.interactor.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.g(str, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c g(String str, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.a(aVar, str);
    }

    @Override // ke.c
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new a(null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
