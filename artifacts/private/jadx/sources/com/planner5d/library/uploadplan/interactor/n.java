package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nGetAiTasksInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAiTasksInteractor.kt\ncom/planner5d/library/uploadplan/interactor/GetAiTasksInteractor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class n implements com.planner5d.library.activity.fragment.projects.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f230791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f230792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f230793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f230794e;

    public enum a {
        tasks,
        status,
        error,
        cdate,
        id,
        message;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f230802h = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f230802h;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.GetAiTasksInteractor$getAiTaskList$2", f = "GetAiTasksInteractor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.activity.fragment.projects.g.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230803a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.interactor.GetAiTasksInteractor$getAiTaskList$2$res$1", f = "GetAiTasksInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f230806b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f230807c;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f230805a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f230806b).I0((id.a) this.f230807c);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                a aVar2 = new a(dVar);
                aVar2.f230806b = bVar;
                aVar2.f230807c = aVar;
                return aVar2.invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230803a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (!n.this.f230792c.d(n.this.f230790a)) {
                        return CollectionsKt.emptyList();
                    }
                    com.planner5d.library.api.requests.c cVar = n.this.f230793d;
                    id.a aVarA = n.this.f230794e.a();
                    a aVar = new a(null);
                    this.f230803a = 1;
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
                return cVar2.h() ? CollectionsKt.emptyList() : n.this.g(cVar2.a());
            } catch (com.planner5d.library.api.e unused) {
                return CollectionsKt.emptyList();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.activity.fragment.projects.g.a>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public n(@NotNull com.planner5d.library.application.b application, @NotNull p0 formatter, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f230790a = application;
        this.f230791b = formatter;
        this.f230792c = networkStateUtility;
        this.f230793d = userApiRequester;
        this.f230794e = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.planner5d.library.activity.fragment.projects.g.a> g(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("tasks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("tasks");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                boolean z10 = !jSONObject2.get("status").equals("error");
                String strZ = k1.z(jSONObject2, "message", null, 4, null);
                String strZ2 = k1.z(jSONObject2, "cdate", null, 4, null);
                Date date = strZ2 != null ? new Date(this.f230791b.G(strZ2)) : null;
                long j10 = jSONObject2.getInt("id");
                if (date == null) {
                    date = new Date();
                }
                arrayList.add(new com.planner5d.library.activity.fragment.projects.g.a(j10, z10, date, strZ));
            }
        }
        return arrayList;
    }

    @Override // com.planner5d.library.activity.fragment.projects.g
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<? extends com.planner5d.library.activity.fragment.projects.g.a>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new b(null), dVar);
    }
}
