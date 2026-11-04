package com.planner5d.library.activity.fragment.projects;

import android.app.Activity;
import android.content.Intent;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f135003e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f135004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f135005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f135006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.z0 f135007d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ImportProjectUseCase$importProject$1", f = "ImportProjectUseCase.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135008a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f135010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f135011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Folder f135012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Project, Unit> f135013f;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.projects.h$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ImportProjectUseCase$importProject$1$1", f = "ImportProjectUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1483a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Project>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f135015b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f135016c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Intent f135017d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Folder f135018e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1483a(h hVar, Activity activity, Intent intent, Folder folder, kotlin.coroutines.d<? super C1483a> dVar) {
                super(2, dVar);
                this.f135015b = hVar;
                this.f135016c = activity;
                this.f135017d = intent;
                this.f135018e = folder;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1483a(this.f135015b, this.f135016c, this.f135017d, this.f135018e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f135014a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f135015b.f135007d.e(this.f135016c, this.f135017d, this.f135018e, this.f135015b.d()).observeOn(com.planner5d.library.services.rx.c.f224934d).toBlocking().firstOrDefault(null);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
                return ((C1483a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Activity activity, Intent intent, Folder folder, Function1<? super Project, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f135010c = activity;
            this.f135011d = intent;
            this.f135012e = folder;
            this.f135013f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new a(this.f135010c, this.f135011d, this.f135012e, this.f135013f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135008a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                    C1483a c1483a = new C1483a(h.this, this.f135010c, this.f135011d, this.f135012e, null);
                    this.f135008a = 1;
                    obj = kotlinx.coroutines.i.h(z1VarD, c1483a, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                Project project = (Project) obj;
                if (project != null) {
                    h hVar = h.this;
                    Function1<Project, Unit> function1 = this.f135013f;
                    if (hVar.d()) {
                        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.open_p5d, p3.b.error, project.projectId);
                        function1.invoke(project);
                    } else {
                        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.open_p5d, p3.b.success, project.projectId);
                        b2 b2Var = hVar.f135005b;
                        int i11 = com.planner5d.library.f.s.aE;
                        String str = project.title;
                        if (str == null) {
                            str = com.planner5d.library.model.payments.a.f222474i;
                        }
                        b2Var.b(i11, str);
                    }
                } else {
                    int i12 = 5 ^ 0;
                    h.this.f135005b.r(new ErrorMessageException(com.planner5d.library.f.s.f169273ma, new String[0]));
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.open_p5d, p3.b.error, kotlin.coroutines.jvm.internal.b.g(0L));
                h.this.f135005b.c(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h(@NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull b2 messageManager, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.activity.helper.z0 helperProjectImport) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(helperProjectImport, "helperProjectImport");
        this.f135004a = userPurchases;
        this.f135005b = messageManager;
        this.f135006c = configuration;
        this.f135007d = helperProjectImport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return this.f135006c.a() || this.f135004a.c();
    }

    public final void e(@NotNull Activity activity, @NotNull com.planner5d.library.activity.fragment.list.b0 actions, @NotNull Intent intent, @Nullable Folder folder, @NotNull Function1<? super Project, Unit> onProjectImported) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(onProjectImported, "onProjectImported");
        actions.d(com.planner5d.library.activity.fragment.list.b0.a.ImportingProject, new a(activity, intent, folder, onProjectImported, null));
    }
}
