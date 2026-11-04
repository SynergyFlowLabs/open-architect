package com.planner5d.library.model.manager.project;

import android.app.Application;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nProjectRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectRepository.kt\ncom/planner5d/library/model/manager/project/ProjectRepository\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,61:1\n29#2:62\n*S KotlinDebug\n*F\n+ 1 ProjectRepository.kt\ncom/planner5d/library/model/manager/project/ProjectRepository\n*L\n41#1:62\n*E\n"})
public final class h0 implements x1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f193191h = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f193192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q0 f193193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t1 f193194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f193195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f193196g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.project.ProjectRepository", f = "ProjectRepository.kt", i = {0, 0, 0}, l = {42}, m = "get", n = {"this", "uri", "projectHash"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f193197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f193198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f193199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f193200d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193202f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f193200d = obj;
            this.f193202f |= Integer.MIN_VALUE;
            return h0.this.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.project.ProjectRepository$get$2", f = "ProjectRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<com.planner5d.library.api.b, id.a, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f193203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f193204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f193205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f193206d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f193206d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f193203a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ((com.planner5d.library.api.b) this.f193204b).V((id.a) this.f193205c, this.f193206d);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.api.b bVar, id.a aVar, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            b bVar2 = new b(this.f193206d, dVar);
            bVar2.f193204b = bVar;
            bVar2.f193205c = aVar;
            return bVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.project.ProjectRepository$getBackground$1", f = "ProjectRepository.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f193207a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f193209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f193209c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h0.this.new c(this.f193209c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ErrorMessageException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f193207a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            h0 h0Var = h0.this;
            String str = this.f193209c;
            this.f193207a = 1;
            Object objB = h0Var.b(str, this);
            return objB == objL ? objL : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h0(@NotNull Application application, @NotNull q0 galleryRecordManager, @NotNull t1 logRecordManager, @NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(galleryRecordManager, "galleryRecordManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f193192c = application;
        this.f193193d = galleryRecordManager;
        this.f193194e = logRecordManager;
        this.f193195f = userApiRequester;
        this.f193196g = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord c(String str, Throwable th2) {
        return new LogRecord("error_project_load", str, th2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Nullable
    public final Object b(@NotNull final String str, @NotNull kotlin.coroutines.d<? super Project> dVar) throws ErrorMessageException {
        a aVar;
        h0 h0Var;
        final Throwable th2;
        String str2;
        JSONObject jSONObjectA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f193202f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f193202f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f193200d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f193202f;
        if (i11 == 0) {
            ResultKt.m(obj);
            try {
                String strV = new com.planner5d.library.api.a0(Uri.parse(str)).v(this.f193192c, this.f193193d);
                com.planner5d.library.api.requests.c cVar = this.f193195f;
                id.a aVarA = this.f193196g.a();
                b bVar = new b(strV, null);
                aVar2.f193197a = this;
                aVar2.f193198b = str;
                aVar2.f193199c = strV;
                aVar2.f193202f = 1;
                int i12 = 6 ^ 0;
                Object objG = com.planner5d.library.api.requests.c.g(cVar, aVarA, null, bVar, aVar2, 2, null);
                if (objG == objL) {
                    return objL;
                }
                h0Var = this;
                str2 = strV;
                obj = objG;
            } catch (Throwable th3) {
                h0Var = this;
                th2 = th3;
                h0Var.f193194e.v(new ij.c() { // from class: com.planner5d.library.model.manager.project.g0
                    @Override // ij.c
                    public final Object get() {
                        return h0.c(str, th2);
                    }
                });
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) aVar2.f193199c;
            str = (String) aVar2.f193198b;
            h0Var = (h0) aVar2.f193197a;
            try {
                ResultKt.m(obj);
            } catch (Throwable th4) {
                th2 = th4;
                h0Var.f193194e.v(new ij.c() { // from class: com.planner5d.library.model.manager.project.g0
                    @Override // ij.c
                    public final Object get() {
                        return h0.c(str, th2);
                    }
                });
            }
        }
        com.planner5d.library.api.c cVar2 = (com.planner5d.library.api.c) obj;
        if (cVar2 != null && (jSONObjectA = cVar2.a()) != null) {
            Project project = new Project();
            JSONObject jSONObject = jSONObjectA.getJSONArray(com.planner5d.library.services.r.items.f224891a).getJSONObject(0);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            project.uid = str2;
            project.title = jSONObject.getString(com.planner5d.library.services.r.projectName.f224891a);
            Object jSONObject2 = jSONObject.get(com.planner5d.library.services.r.data.f224891a);
            if (jSONObject2 instanceof String) {
                jSONObject2 = new JSONObject((String) jSONObject2);
            }
            byte[] bytes = jSONObject2.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            project.data = bytes;
            return project;
        }
        throw new ErrorMessageException(com.planner5d.library.f.s.D9, new String[0]);
    }

    @kotlin.l(message = "Just for call from Java", replaceWith = @b1(expression = "get(uri)", imports = {}))
    @m1
    @NotNull
    public final Project d(@NotNull String uri) throws ErrorMessageException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z10 = (false & false) | false;
        return (Project) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new c(uri, null), 3, null);
    }
}
