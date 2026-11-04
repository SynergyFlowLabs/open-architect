package com.planner5d.library.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.z0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.p0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class s implements le.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180267e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f180268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f180269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f180270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f1 f180271d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.ProjectImportInteractor$importProject$1", f = "ProjectImportInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f180273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f180274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z0.c f180275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f180276e;

        /* JADX INFO: renamed from: com.planner5d.library.interactor.s$a$a, reason: collision with other inner class name */
        public static final class C1562a extends com.planner5d.library.services.rx.e<Project> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ z0.c f180277d;

            C1562a(z0.c cVar) {
                this.f180277d = cVar;
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onNext(Project project) {
                this.f180277d.onNext(project);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InputStream inputStream, s sVar, z0.c cVar, Function1<? super Throwable, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f180273b = inputStream;
            this.f180274c = sVar;
            this.f180275d = cVar;
            this.f180276e = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(z0.c cVar) {
            cVar.onCompleted();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f180273b, this.f180274c, this.f180275d, this.f180276e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException, IOException {
            String string;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f180272a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            InputStream inputStream = this.f180273b;
            s sVar = this.f180274c;
            final z0.c cVar = this.f180275d;
            Function1<Throwable, Unit> function1 = this.f180276e;
            try {
                try {
                    JSONObject jSONObjectA = sVar.f180268a.a(inputStream);
                    if (jSONObjectA == null) {
                        throw new IOException("Could not parse p5d file");
                    }
                    try {
                        string = jSONObjectA.getString(com.planner5d.library.services.r.projectName.f224891a);
                    } catch (JSONException e10) {
                        timber.log.b.f381052a.e(e10);
                        string = null;
                    }
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.data;
                    if (jSONObjectA.has(rVar.f224891a)) {
                        jSONObjectA = jSONObjectA.getJSONObject(rVar.f224891a);
                        Intrinsics.checkNotNull(jSONObjectA);
                    } else {
                        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.className;
                        if (!jSONObjectA.has(rVar2.f224891a) || !StringsKt.N1(com.planner5d.library.services.r.project.f224891a, jSONObjectA.getString(rVar2.f224891a), true)) {
                            throw new JSONException("Unsupported file p5d file format");
                        }
                    }
                    sVar.f180269b.W0(jSONObjectA);
                    com.planner5d.library.model.manager.project.d0 d0Var = sVar.f180269b;
                    id.a aVarA = sVar.f180270c.a();
                    Folder folderD = cVar.d();
                    boolean zE = cVar.e();
                    String string2 = jSONObjectA.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    byte[] bytes = string2.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    d0Var.L(aVarA, folderD, zE, string, bytes).doOnTerminate(new Action0() { // from class: com.planner5d.library.interactor.r
                        @Override // rx.functions.Action0
                        public final void call() {
                            s.a.m(cVar);
                        }
                    }).subscribe((Subscriber<? super Project>) new C1562a(cVar));
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(inputStream, null);
                    return unit;
                } catch (Exception e11) {
                    if (function1 != null) {
                        function1.invoke(e11);
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStream, th2);
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public s(@NotNull p0 formatter, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180268a = formatter;
        this.f180269b = projectManager;
        this.f180270c = userAuthorization;
        this.f180271d = coroutineScope;
    }

    @Override // le.i
    public void a(@NotNull InputStream input, @NotNull z0.c request, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(request, "request");
        kotlinx.coroutines.k.f(this.f180271d, com.planner5d.library.services.utility.s.f229729a.d(), null, new a(input, this, request, function1, null), 2, null);
    }
}
