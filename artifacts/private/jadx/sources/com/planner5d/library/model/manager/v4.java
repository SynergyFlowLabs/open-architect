package com.planner5d.library.model.manager;

import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.SupportRequest;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v4 extends v<SupportRequest> implements x1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f222355k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f222356l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f222357m = "10";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f222358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.project.d0> f222359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f222360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<c1> f222361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f222362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f222363j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public v4(@NotNull com.planner5d.library.application.b application, @NotNull fg.e<com.planner5d.library.model.manager.project.d0> projectManager, @NotNull fg.e<t1> logRecordManager, @NotNull fg.e<c1> installationManager, @NotNull com.planner5d.library.api.requests.c api, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f222358e = application;
        this.f222359f = projectManager;
        this.f222360g = logRecordManager;
        this.f222361h = installationManager;
        this.f222362i = api;
        this.f222363j = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.planner5d.library.api.c z(SupportRequest supportRequest, v4 v4Var, kotlin.jvm.internal.i1.h hVar, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.l0(aVar, f222357m, String.valueOf(supportRequest.type), supportRequest.description, supportRequest.notes, v4Var.f222361h.get().h(), v4Var.f222358e.getPackageName(), com.planner5d.library.services.utility.h3.j(v4Var.f222358e), v4Var.f222361h.get().b(), supportRequest.email, (okhttp3.y.c) hVar.f312751a);
    }

    @Override // com.planner5d.library.model.manager.v
    @NotNull
    protected Class<SupportRequest> j() {
        return SupportRequest.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, okhttp3.y$c] */
    @Override // com.planner5d.library.model.manager.v
    @androidx.annotation.m1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean q(@NotNull final SupportRequest model, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(model, "model");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        com.planner5d.library.api.c cVar = null;
        if (model.attachment) {
            try {
                com.planner5d.library.api.support.g gVar = new com.planner5d.library.api.support.g();
                byte[] bArrK0 = this.f222359f.get().k0();
                Intrinsics.checkNotNullExpressionValue(bArrK0, "getProjectsAsZip(...)");
                hVar.f312751a = gVar.b("attachment", "projects.zip", "application/zip", bArrK0);
            } catch (Throwable th2) {
                this.f222360g.get().u(new LogRecord("feedback_attachment_failed", null, th2));
            }
        }
        try {
            cVar = (com.planner5d.library.api.c) this.f222362i.j(this.f222363j.a(), new Function2() { // from class: com.planner5d.library.model.manager.u4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v4.z(model, this, hVar, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
        } catch (Throwable th3) {
            timber.log.b.f381052a.e(th3);
        }
        return (cVar == null || cVar.h() || !cVar.a().has("id")) ? false : true;
    }
}
