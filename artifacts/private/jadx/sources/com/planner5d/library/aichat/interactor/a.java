package com.planner5d.library.aichat.interactor;

import android.app.Application;
import com.planner5d.library.aichat.command.AiChatResponseMessage;
import com.planner5d.library.model.manager.h;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAiChatInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatInteractor.kt\ncom/planner5d/library/aichat/interactor/AiChatInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1863#2,2:101\n*S KotlinDebug\n*F\n+ 1 AiChatInteractor.kt\ncom/planner5d/library/aichat/interactor/AiChatInteractor\n*L\n64#1:101,2\n*E\n"})
public final class a implements ya.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f141968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f141969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f141970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f141971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f141972e;

    /* JADX INFO: renamed from: com.planner5d.library.aichat.interactor.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.aichat.interactor.AiChatInteractor$sendMessage$2", f = "AiChatInteractor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class C1506a extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f141973a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ta.c f141975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f141976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f141977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<ta.b> f141978f;

        /* JADX INFO: renamed from: com.planner5d.library.aichat.interactor.a$a$a, reason: collision with other inner class name */
        @f(c = "com.planner5d.library.aichat.interactor.AiChatInteractor$sendMessage$2$response$1", f = "AiChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1507a extends o implements n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f141979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f141980b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f141981c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ JSONObject f141982d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f141983e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f141984f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1507a(JSONObject jSONObject, a aVar, long j10, kotlin.coroutines.d<? super C1507a> dVar) {
                super(3, dVar);
                this.f141982d = jSONObject;
                this.f141983e = aVar;
                this.f141984f = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f141979a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return ((com.planner5d.library.api.b) this.f141980b).U((id.a) this.f141981c, this.f141982d, this.f141983e.f141970c.getPackageName(), this.f141984f, h3.a());
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
                C1507a c1507a = new C1507a(this.f141982d, this.f141983e, this.f141984f, dVar);
                c1507a.f141980b = bVar;
                c1507a.f141981c = aVar;
                return c1507a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1506a(ta.c cVar, String str, String str2, List<ta.b> list, kotlin.coroutines.d<? super C1506a> dVar) {
            super(2, dVar);
            this.f141975c = cVar;
            this.f141976d = str;
            this.f141977e = str2;
            this.f141978f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1506a(this.f141975c, this.f141976d, this.f141977e, this.f141978f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objG;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f141973a;
            if (i10 == 0) {
                ResultKt.m(obj);
                JSONObject jSONObjectI = a.this.i(this.f141975c, this.f141976d, this.f141977e, this.f141978f);
                timber.log.b.f381052a.H("AiChat").u("Sending message: %s", jSONObjectI.toString());
                long j10 = h3.j(a.this.f141970c);
                com.planner5d.library.api.requests.c cVar = a.this.f141968a;
                id.a aVarA = a.this.f141969b.a();
                C1507a c1507a = new C1507a(jSONObjectI, a.this, j10, null);
                this.f141973a = 1;
                objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, c1507a, this, 2, null);
                if (objG == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objG = obj;
            }
            return k1.z(((com.planner5d.library.api.c) objG).a(), r.queueName.f224891a, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((C1506a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull w userAuthorizationService, @NotNull Application application, @NotNull h configManager, @NotNull com.planner5d.library.model.manager.w featureConfigManager) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f141968a = userApiRequester;
        this.f141969b = userAuthorizationService;
        this.f141970c = application;
        this.f141971d = configManager;
        this.f141972e = featureConfigManager;
    }

    private final void g(JSONObject jSONObject, List<ta.b> list) throws JSONException {
        if (list != null && (!list.isEmpty())) {
            JSONArray jSONArray = new JSONArray();
            for (ta.b bVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(r.rabbitMQContent.f224891a, bVar.f());
                jSONObject2.put(r.aiChatAttachmentContentType.f224891a, bVar.g());
                jSONObject2.put(r.aiChatAttachmentFileName.f224891a, bVar.h());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(r.aiChatAttachments.f224891a, jSONArray);
        }
    }

    private final void h(JSONObject jSONObject) throws JSONException {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(r.aiChatFeatureBlog.f224891a, r.aiChatFeatureSupport.f224891a, r.aiChatFeatureProjects.f224891a, r.aiChatFeatureItemGroups.f224891a, r.aiChatFeatureAskOpinion.f224891a, r.aiChatFeatureSmartMaterials.f224891a, r.aiChatFeatureSelfClose.f224891a, r.aiChatFeatureResponseSuggestions.f224891a, r.aiChatFeatureSendProgress.f224891a);
        if (this.f141972e.a(com.planner5d.library.model.manager.config.f.AiDesigner)) {
            arrayListArrayListOf.add(r.aiChatFeatureAiDesigner.f224891a);
        }
        if (!arrayListArrayListOf.isEmpty()) {
            jSONObject.put(r.features.f224891a, k1.D(arrayListArrayListOf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject i(ta.c cVar, String str, String str2, List<ta.b> list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str3 = r.rabbitMQStatusMessage.f224891a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(r.rabbitMQContent.f224891a, str2);
        Unit unit = Unit.f312394a;
        jSONObject.put(str3, jSONObject2);
        jSONObject.put(r.source.f224891a, cVar);
        jSONObject.put(r.conversationId.f224891a, str);
        h(jSONObject);
        g(jSONObject, list);
        return jSONObject;
    }

    @Override // ya.a
    @Nullable
    public Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super i<AiChatResponseMessage>> dVar) throws Exception {
        return new c(this.f141971d).b(str, dVar);
    }

    @Override // ya.a
    @Nullable
    public Object b(@NotNull ta.c cVar, @Nullable String str, @Nullable String str2, @Nullable List<ta.b> list, @NotNull kotlin.coroutines.d<? super String> dVar) throws Exception {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new C1506a(cVar, str, str2, list, null), dVar);
    }
}
