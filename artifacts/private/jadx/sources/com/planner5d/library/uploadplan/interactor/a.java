package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ke.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f230742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f230743b;

    /* JADX INFO: renamed from: com.planner5d.library.uploadplan.interactor.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.CheckUploadQueueInteractor$hasPendingTasks$2", f = "CheckUploadQueueInteractor.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    static final class C1707a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230744a;

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.interactor.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.CheckUploadQueueInteractor$hasPendingTasks$2$result$1", f = "CheckUploadQueueInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1708a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230746a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f230747b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f230748c;

            C1708a(kotlin.coroutines.d<? super C1708a> dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f230746a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f230747b).I0((id.a) this.f230748c);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1708a c1708a = new C1708a(dVar);
                c1708a.f230747b = bVar;
                c1708a.f230748c = aVar;
                return c1708a.invokeSuspend(Unit.f312394a);
            }
        }

        C1707a(kotlin.coroutines.d<? super C1707a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1707a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException, com.planner5d.library.model.exception.a {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230744a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.api.requests.c cVar = a.this.f230742a;
                id.a aVarA = a.this.f230743b.a();
                C1708a c1708a = new C1708a(null);
                this.f230744a = 1;
                obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1708a, this, 2, null);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
            if (cVar2.h()) {
                throw new com.planner5d.library.model.exception.a(cVar2.g());
            }
            if (!cVar2.a().has("tasks")) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            JSONArray jSONArray = cVar2.a().getJSONArray("tasks");
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj2 = jSONArray.get(i11);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                if (!((JSONObject) obj2).get("status").equals("error")) {
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
            }
            z10 = false;
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C1707a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f230742a = userApiRequester;
        this.f230743b = userAuthorization;
    }

    @Override // ke.a
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Boolean> dVar) throws JSONException, com.planner5d.library.model.exception.a {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new C1707a(null), dVar);
    }
}
