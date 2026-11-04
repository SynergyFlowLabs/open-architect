package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class c implements le.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180072e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.api.requests.c> f180073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f180074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s0 f180075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f180076d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.DownloadProjectInteractor$downloadProject$1", f = "DownloadProjectInteractor.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f180079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super Project> f180080d;

        /* JADX INFO: renamed from: com.planner5d.library.interactor.c$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.DownloadProjectInteractor$downloadProject$1$response$1", f = "DownloadProjectInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1560a extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f180081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f180082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f180083c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f180084d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1560a(String str, kotlin.coroutines.d<? super C1560a> dVar) {
                super(3, dVar);
                this.f180084d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f180081a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f180082b).V((id.a) this.f180083c, this.f180084d);
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1560a c1560a = new C1560a(this.f180084d, dVar);
                c1560a.f180082b = bVar;
                c1560a.f180083c = aVar;
                return c1560a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Subscriber<? super Project> subscriber, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180079c = str;
            this.f180080d = subscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(this.f180079c, this.f180080d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Exception exc;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180077a;
            if (i10 == 0) {
                ResultKt.m(obj);
                try {
                    com.planner5d.library.api.requests.c cVar = (com.planner5d.library.api.requests.c) c.this.f180073a.get();
                    id.a aVarA = c.this.f180074b.a();
                    C1560a c1560a = new C1560a(this.f180079c, null);
                    this.f180077a = 1;
                    aVar = this;
                    try {
                        obj = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1560a, aVar, 2, null);
                        if (obj == objL) {
                            return objL;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        aVar.f180080d.onError(exc);
                        ((t1) c.this.f180076d.get()).b("download_project", "onError failed", exc);
                    }
                } catch (Exception e11) {
                    e = e11;
                    aVar = this;
                    exc = e;
                    aVar.f180080d.onError(exc);
                    ((t1) c.this.f180076d.get()).b("download_project", "onError failed", exc);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.m(obj);
                    aVar = this;
                } catch (Exception e12) {
                    exc = e12;
                    aVar = this;
                    aVar.f180080d.onError(exc);
                    ((t1) c.this.f180076d.get()).b("download_project", "onError failed", exc);
                }
            }
            Intrinsics.checkNotNull(obj);
            Project project = new Project();
            JSONObject jSONObject = ((com.planner5d.library.api.c) obj).a().getJSONArray(com.planner5d.library.services.r.items.f224891a).getJSONObject(0);
            project.uid = aVar.f180079c;
            project.title = jSONObject.getString(com.planner5d.library.services.r.projectName.f224891a);
            Object jSONObject2 = jSONObject.get(com.planner5d.library.services.r.data.f224891a);
            if (jSONObject2 instanceof String) {
                jSONObject2 = new JSONObject((String) jSONObject2);
            }
            byte[] bytes = jSONObject2.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            project.data = bytes;
            aVar.f180080d.onNext(project);
            aVar.f180080d.onCompleted();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull fg.e<com.planner5d.library.api.requests.c> userApiRequester, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull s0 coroutineScope, @NotNull fg.e<t1> logRecordManager) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f180073a = userApiRequester;
        this.f180074b = userAuthorization;
        this.f180075c = coroutineScope;
        this.f180076d = logRecordManager;
    }

    @Override // le.b
    public void a(@NotNull String hash, @NotNull Subscriber<? super Project> subscriber) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        int i10 = (3 | 0) >> 2;
        kotlinx.coroutines.k.f(this.f180075c, com.planner5d.library.services.utility.s.f229729a.b(), null, new a(hash, subscriber, null), 2, null);
    }
}
