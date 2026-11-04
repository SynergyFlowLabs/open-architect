package com.planner5d.library.model.manager.config;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.z4;
import com.planner5d.library.services.utility.c0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class r implements z4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f181642d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f181643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.source.l f181644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<n1> f181645c;

    /* JADX INFO: loaded from: classes7.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.SupportUrlProvider$getSupportSubmitUrlBlocking$1", f = "SupportUrlProvider.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181646a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181646a;
            int i11 = 5 & 0;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.config.source.l lVar = r.this.f181644b;
                    this.f181646a = 1;
                    obj = lVar.o(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                JSONObject jSONObject3 = (JSONObject) obj;
                if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject(com.planner5d.library.services.r.support.f224891a)) == null || (jSONObject2 = jSONObject.getJSONObject(com.planner5d.library.services.r.knowledgebase.f224891a)) == null) {
                    return null;
                }
                return jSONObject2.getString(com.planner5d.library.services.r.submit.f224891a);
            } catch (Throwable th2) {
                timber.log.b.f381052a.z(th2, "Failed to get 'support.knowledgebase.submit'", new Object[0]);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.SupportUrlProvider$getSupportUrlForLanguageBlocking$1", f = "SupportUrlProvider.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f181648a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f181650c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f181650c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new b(this.f181650c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f181648a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.source.l lVar = r.this.f181644b;
                this.f181648a = 1;
                obj = lVar.o(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            JSONObject jSONObject4 = (JSONObject) obj;
            if (jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject(com.planner5d.library.services.r.support.f224891a)) == null || (jSONObject2 = jSONObject.getJSONObject(com.planner5d.library.services.r.knowledgebase.f224891a)) == null || (jSONObject3 = jSONObject2.getJSONObject(com.planner5d.library.services.r.page.f224891a)) == null) {
                return null;
            }
            return jSONObject3.getString(this.f181650c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull Application application, @NotNull com.planner5d.library.model.manager.config.source.l serverConfigs, @NotNull fg.e<n1> languageManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        this.f181643a = application;
        this.f181644b = serverConfigs;
        this.f181645c = languageManager;
    }

    private final String d() {
        try {
            String strI = this.f181645c.get().i();
            Intrinsics.checkNotNullExpressionValue(strI, "getLanguageDefault(...)");
            return e(strI);
        } catch (Throwable th2) {
            timber.log.b.f381052a.z(th2, "Failed to get support URL for default language.", new Object[0]);
            return null;
        }
    }

    private final String e(String str) throws JSONException {
        return (String) c0.t(c0.f225068a, null, false, new b(str, null), 3, null);
    }

    @Override // com.planner5d.library.model.manager.z4
    @Nullable
    public String a() {
        String strA = this.f181645c.get().a(this.f181643a);
        Intrinsics.checkNotNullExpressionValue(strA, "getLanguage(...)");
        try {
            return e(strA);
        } catch (Throwable th2) {
            if (Intrinsics.areEqual(strA, this.f181645c.get().i())) {
                timber.log.b.f381052a.z(th2, "Failed to get support URL for default language.", new Object[0]);
                return null;
            }
            timber.log.b.f381052a.z(th2, "Failed to get support URL for language '%s'. Trying to get support URL for default language.", strA);
            return d();
        }
    }

    @Nullable
    public final String c() {
        return (String) c0.t(c0.f225068a, null, false, new a(null), 3, null);
    }
}
