package com.planner5d.library.activity.fragment.dialog.titleedit;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ProjectRename extends TitleEdit<Project, Void> {
    public static final int $stable = 8;

    @ij.a
    public f1 coroutineScope;

    @ij.a
    public d0 projectManager;

    @ij.a
    public t userAuthorization;

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename$getModel$2", f = "ProjectRename.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f133060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f133060c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ProjectRename.this.new a(this.f133060c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return ProjectRename.this.getProjectManager().Y(ProjectRename.this.getUserAuthorization().a(), this.f133060c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename$save$1", f = "ProjectRename.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Project f133062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f133063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProjectRename f133064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Project project, String str, ProjectRename projectRename, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133062b = project;
            this.f133063c = str;
            this.f133064d = projectRename;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f133062b, this.f133063c, this.f133064d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133061a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    this.f133062b.title = this.f133063c;
                    c0 c0Var = c0.f225068a;
                    Observable<Project> observableN0 = this.f133064d.getProjectManager().N0(this.f133064d.getUserAuthorization().a(), this.f133062b);
                    Intrinsics.checkNotNullExpressionValue(observableN0, "save(...)");
                    this.f133061a = 1;
                    if (c0Var.l(observableN0, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                b2.f216725b.u0(x3.a.rename, p3.b.error, this.f133062b.projectId);
            }
            m0.f224430c.t();
            b2.f216725b.u0(x3.a.rename, p3.b.success, this.f133062b.projectId);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public ProjectRename() {
        com.planner5d.library.application.b.f142455c.a().j1(this);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    protected Object T(long j10, @NotNull kotlin.coroutines.d<? super Project> dVar) {
        return i.h(s.f229729a.h(), new a(j10, null), dVar);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    protected boolean W() {
        Project model = getModel();
        Long l10 = model != null ? model.projectId : null;
        b2 b2Var = b2.f216725b;
        x3.a aVar = x3.a.rename;
        b2Var.u0(aVar, p3.b.submit, l10);
        boolean zW = super.W();
        if (!zW) {
            b2Var.u0(aVar, p3.b.error, l10);
        }
        return zW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @Nullable
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public String getModelTitle(@Nullable Project project) {
        if (project != null) {
            return project.title;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    @NotNull
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public String getTitle(@Nullable Project project) {
        String string = getString(com.planner5d.library.f.s.nz);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.titleedit.TitleEdit
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void save(@Nullable Project project, @Nullable String str) {
        if (project == null) {
            return;
        }
        k.f(getCoroutineScope(), null, null, new b(project, str, this, null), 3, null);
    }

    @NotNull
    public final f1 getCoroutineScope() {
        f1 f1Var = this.coroutineScope;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @NotNull
    public final d0 getProjectManager() {
        d0 d0Var = this.projectManager;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("projectManager");
        return null;
    }

    @NotNull
    public final t getUserAuthorization() {
        t tVar = this.userAuthorization;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    public final void setCoroutineScope(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.coroutineScope = f1Var;
    }

    public final void setProjectManager(@NotNull d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.projectManager = d0Var;
    }

    public final void setUserAuthorization(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.userAuthorization = tVar;
    }
}
