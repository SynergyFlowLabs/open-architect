package com.planner5d.library.activity.fragment.projects;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.lifecycle.c1;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.dialog.FolderSelection;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGallery;
import com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.e2;
import com.planner5d.library.services.utility.f2;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectsViewModel.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,401:1\n774#2:402\n865#2,2:403\n1557#2:405\n1628#2,3:406\n1863#2,2:409\n1863#2,2:411\n808#2,11:414\n1557#2:425\n1628#2,3:426\n808#2,11:429\n1557#2:440\n1628#2,3:441\n1#3:413\n*S KotlinDebug\n*F\n+ 1 ProjectsViewModel.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsViewModel\n*L\n113#1:402\n113#1:403,2\n119#1:405\n119#1:406,3\n121#1:409,2\n240#1:411,2\n254#1:414,11\n254#1:425\n254#1:426,3\n257#1:429,11\n257#1:440\n257#1:441,3\n*E\n"})
public final class w0 extends e0 implements com.planner5d.library.activity.fragment.list.g0 {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final int f135106m3 = 8;

    @NotNull
    private final f2 H1;

    @Nullable
    private final g X;

    @NotNull
    private final com.planner5d.library.model.manager.y0 Y;

    @NotNull
    private final y1 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final c0 f135107g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private final z0 f135108h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f135109i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f135110j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final l f135111k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final List<Folder> f135112l3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final b2 f135113p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f135114p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f135115p2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f135116t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f135117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c0 f135118w;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135119a;

        static {
            int[] iArr = new int[l1.g.values().length];
            try {
                iArr[l1.g.NewProject.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.g.RecognitionInProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l1.g.RecognitionFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135119a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsViewModel", f = "ProjectsViewModel.kt", i = {0}, l = {121}, m = "loadItems", n = {"$this$loadItems_u24lambda_u243"}, s = {"L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135122c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135124e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135122c = obj;
            this.f135124e |= Integer.MIN_VALUE;
            return w0.this.h(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsViewModel$onClickFolder$1", f = "ProjectsViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f135127c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f135129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Folder f135130f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsViewModel$onClickFolder$1$parentFolder$1", f = "ProjectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Folder>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w0 f135132b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Folder f135133c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w0 w0Var, Folder folder, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f135132b = w0Var;
                this.f135133c = folder;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f135132b, this.f135133c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f135131a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f135132b.f135118w.y(this.f135132b.f135109i3.a(), this.f135133c.parentId);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Folder> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bundle bundle, Folder folder, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f135129e = bundle;
            this.f135130f = folder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w0.this.new c(this.f135129e, this.f135130f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.activity.fragment.x xVar;
            com.planner5d.library.activity.helper.event.content.c cVarP;
            com.planner5d.library.activity.helper.event.content.c cVar;
            com.planner5d.library.activity.helper.event.content.c cVarD;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135127c;
            if (i10 == 0) {
                ResultKt.m(obj);
                xVar = w0.this.f135114p1;
                com.planner5d.library.activity.fragment.list.u0 u0Var = com.planner5d.library.activity.fragment.list.u0.f134434a;
                cVarP = u0Var.f(new com.planner5d.library.services.utility.i(this.f135129e).b(com.planner5d.library.services.r.scrollPosition).h(com.planner5d.library.services.r.folder, this.f135130f.b()).a()).p(this.f135130f.title);
                Bundle bundle = this.f135129e;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.folderSelectionMode;
                if (bundle.getBoolean(rVar.f224891a, false)) {
                    cVarP.m(com.planner5d.library.f.s.B2);
                }
                if (this.f135129e.getBoolean(rVar.f224891a, false) && this.f135130f.parentId == 0) {
                    cVarD = u0Var.f(this.f135129e).n(com.planner5d.library.f.s.B2).j(w0.this.Z.f());
                } else if (this.f135130f.parentId == 0) {
                    cVarD = com.planner5d.library.activity.fragment.list.u0.d(u0Var, this.f135129e, false, 2, null);
                } else {
                    z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                    a aVar = new a(w0.this, this.f135130f, null);
                    this.f135125a = xVar;
                    this.f135126b = cVarP;
                    this.f135127c = 1;
                    obj = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                    if (obj == objL) {
                        return objL;
                    }
                    cVar = cVarP;
                }
                com.planner5d.library.activity.fragment.x.g(xVar, cVarP.k(cVarD), false, 2, null);
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (com.planner5d.library.activity.helper.event.content.c) this.f135126b;
            xVar = (com.planner5d.library.activity.fragment.x) this.f135125a;
            ResultKt.m(obj);
            Folder folder = (Folder) obj;
            com.planner5d.library.activity.helper.event.content.c cVarJ = com.planner5d.library.activity.fragment.list.u0.f134434a.f(new com.planner5d.library.services.utility.i(this.f135129e).h(com.planner5d.library.services.r.folder, folder != null ? folder.b() : null).a()).p(folder != null ? folder.title : null).j(w0.this.Z.f());
            if (this.f135129e.getBoolean(com.planner5d.library.services.r.folderSelectionMode.f224891a, false)) {
                cVarJ.m(com.planner5d.library.f.s.B2);
            }
            Unit unit = Unit.f312394a;
            cVarD = cVarJ;
            cVarP = cVar;
            com.planner5d.library.activity.fragment.x.g(xVar, cVarP.k(cVarD), false, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsViewModel$onClickItem$1", f = "ProjectsViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135137d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f135139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f135140g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Bundle bundle, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f135139f = obj;
            this.f135140g = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w0.this.new d(this.f135139f, this.f135140g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Project project;
            e0 e0Var;
            Bundle bundle;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135137d;
            if (i10 == 0) {
                ResultKt.m(obj);
                w0 w0Var = w0.this;
                Object obj2 = this.f135139f;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.planner5d.library.database.model.project.Project");
                project = (Project) obj2;
                Bundle bundle2 = this.f135140g;
                w0 w0Var2 = w0.this;
                this.f135134a = w0Var;
                this.f135135b = project;
                this.f135136c = bundle2;
                this.f135137d = 1;
                Object objO0 = w0Var2.o0(this);
                if (objO0 == objL) {
                    return objL;
                }
                e0Var = w0Var;
                bundle = bundle2;
                obj = objO0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Bundle bundle3 = (Bundle) this.f135136c;
                project = (Project) this.f135135b;
                e0 e0Var2 = (e0) this.f135134a;
                ResultKt.m(obj);
                e0Var = e0Var2;
                bundle = bundle3;
            }
            e0.q0(e0Var, project, bundle, ((Boolean) obj).booleanValue(), true, false, null, 48, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsViewModel$onClickItemMenu$2$1", f = "ProjectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135141a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Project f135143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Project project, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f135143c = project;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w0.this.new e(this.f135143c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135141a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            w0.this.f135115p2.O(this.f135143c);
            com.planner5d.library.services.m0.f224430c.t();
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.archive, p3.b.success, this.f135143c.projectId);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class f extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Project f135144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f135145e;

        f(Project project, w0 w0Var) {
            this.f135144d = project;
            this.f135145e = w0Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            if (th2 != null) {
                this.f135145e.f135113p0.c(th2);
            }
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.duplicate, p3.b.error, this.f135144d.projectId);
        }

        public final void d(Project project) {
            Intrinsics.checkNotNullParameter(project, "project");
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
            b2Var.u0(x3.a.duplicate, p3.b.success, this.f135144d.projectId);
            b2Var.B(x3.c.duplicate_owned, this.f135144d.projectId);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public w0(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.model.manager.c0 folderManager, @Nullable g gVar, @NotNull com.planner5d.library.model.manager.y0 imageManager, @NotNull y1 menuManager, @NotNull b2 messageManager, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull f2 nullReporter, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull c0 sourceManager, @Nullable z0 z0Var, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull le.e handleNewIntentUseCase, @NotNull h importProjectUseCase, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases) {
        super(application, projectManager, userAuthorization, userPurchases, messageManager, configuration, navigator, folderManager, menuManager, z0Var, handleNewIntentUseCase, importProjectUseCase, defaultFragmentProvider, featureConfigManager, sharedPreferencesManager);
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(nullReporter, "nullReporter");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(sourceManager, "sourceManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(handleNewIntentUseCase, "handleNewIntentUseCase");
        Intrinsics.checkNotNullParameter(importProjectUseCase, "importProjectUseCase");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f135116t = featureConfigManager;
        this.f135117v = dialogLauncher;
        this.f135118w = folderManager;
        this.X = gVar;
        this.Y = imageManager;
        this.Z = menuManager;
        this.f135113p0 = messageManager;
        this.f135114p1 = navigator;
        this.H1 = nullReporter;
        this.f135115p2 = projectManager;
        this.f135107g3 = sourceManager;
        this.f135108h3 = z0Var;
        this.f135109i3 = userAuthorization;
        this.f135110j3 = new c1<>(Boolean.FALSE);
        this.f135111k3 = new l();
        this.f135112l3 = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(com.planner5d.library.services.utility.i iVar, w0 w0Var, long j10) {
        iVar.f(com.planner5d.library.services.r.type, SendToGallery.a.Project.l());
        iVar.g(com.planner5d.library.services.r.id, j10);
        iVar.f(com.planner5d.library.services.r.folderType, w0Var.N());
        w0Var.f135117v.c(SendToGallery.class).i(iVar).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(w0 w0Var, Project project, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            kotlinx.coroutines.k.f(g2.a(w0Var), com.planner5d.library.services.utility.s.f229729a.h(), null, w0Var.new e(project, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(Project project, w0 w0Var, Activity activity, long j10) {
        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.duplicate, null, project.projectId);
        w0Var.f135115p2.Q(w0Var.f135109i3.a(), activity, j10).subscribe((Subscriber<? super Project>) new f(project, w0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(Project project, com.planner5d.library.services.utility.i iVar, w0 w0Var, long j10) {
        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.to_folder, null, project.projectId);
        iVar.g(com.planner5d.library.services.r.id, j10);
        Long l10 = project.projectId;
        if (l10 != null) {
            iVar.g(com.planner5d.library.services.r.projectId, l10.longValue());
        }
        iVar.f(com.planner5d.library.services.r.folderType, w0Var.N());
        w0Var.f135117v.c(FolderSelection.class).i(iVar).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(Project project, com.planner5d.library.services.utility.i iVar, w0 w0Var, long j10) {
        com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.rename, null, project.projectId);
        iVar.g(com.planner5d.library.services.r.id, j10);
        w0Var.f135117v.c(ProjectRename.class).i(iVar).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(w0 w0Var, Boolean bool) {
        w0Var.O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(w0 w0Var, Boolean bool) {
        w0Var.O0();
    }

    private final void O0() {
        this.f135110j3.o(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void E(@NotNull com.planner5d.library.services.utility.i builder, @Nullable Bundle bundle) {
        long[] longArray;
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.selectedProjectIds;
        if (bundle == null || (longArray = bundle.getLongArray(rVar.f224891a)) == null) {
            longArray = new long[0];
        }
        builder.q(rVar, longArray);
    }

    @NotNull
    public final c1<Boolean> E0() {
        return this.f135110j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.planner5d.library.activity.fragment.list.g0
    public void F(@Nullable Bundle bundle, @Nullable com.planner5d.library.database.model.j jVar, @Nullable l1.e eVar, @NotNull Function0<Unit> onMoved) {
        Long id2;
        Intrinsics.checkNotNullParameter(onMoved, "onMoved");
        long[] longArray = bundle != null ? bundle.getLongArray(com.planner5d.library.services.r.selectedProjectIds.f224891a) : null;
        List<com.planner5d.library.database.model.j> listB = eVar != null ? eVar.b() : null;
        Folder folder = (Folder) jVar;
        long jLongValue = (folder == null || (id2 = folder.getId()) == null) ? 0L : id2.longValue();
        if (longArray != null) {
            if (longArray.length == 0) {
                longArray = null;
            }
            if (longArray != null) {
                this.f135115p2.K0(this.f135109i3.a(), ArraysKt.toMutableList(longArray), jLongValue);
            }
        }
        if (listB != null) {
            if ((listB.isEmpty() ? null : listB) != null) {
                this.f135118w.L(listB, jLongValue);
            }
        }
        onMoved.invoke();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void J(@NotNull Bundle state, @NotNull com.planner5d.library.database.model.j folder) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(folder, "folder");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(state, (Folder) folder, null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void L() {
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public int N() {
        return Folder.f180529b;
    }

    public final void N0(@Nullable Bundle bundle, @NotNull l1.d<Folder> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
        Folder folder = (Folder) filter.b();
        b2Var.M0(folder != null ? folder.getTitle() : null, this.f135107g3.a().a());
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    @NotNull
    public int[] Q() {
        return new int[0];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    @Override // com.planner5d.library.activity.fragment.list.g0
    public void T(@NotNull Bundle state, @Nullable List<? extends Object> list) {
        ArrayList<Parcelable> arrayList;
        long[] longArray;
        Intrinsics.checkNotNullParameter(state, "state");
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Folder) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Bundle bundleB = ((Folder) it.next()).b();
                    Intrinsics.checkNotNull(bundleB, "null cannot be cast to non-null type android.os.Parcelable");
                    arrayList3.add(bundleB);
                }
                arrayList = new ArrayList<>(arrayList3);
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Project) {
                    arrayList4.add(obj2);
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Long id2 = ((Project) it2.next()).getId();
                    arrayList5.add(Long.valueOf(id2 != null ? id2.longValue() : 0L));
                }
                longArray = CollectionsKt.toLongArray(arrayList5);
            } else {
                longArray = null;
            }
        } else {
            longArray = null;
        }
        com.planner5d.library.activity.fragment.x xVar = this.f135114p1;
        com.planner5d.library.activity.fragment.list.u0 u0Var = com.planner5d.library.activity.fragment.list.u0.f134434a;
        com.planner5d.library.services.utility.i iVarM = new com.planner5d.library.services.utility.i(state).m(com.planner5d.library.services.r.folderSelectionMode, true);
        if (arrayList != null) {
            iVarM.k(com.planner5d.library.services.r.selectedFolders, arrayList);
        }
        if (longArray != null) {
            iVarM.q(com.planner5d.library.services.r.selectedProjectIds, longArray);
        }
        Unit unit = Unit.f312394a;
        com.planner5d.library.activity.fragment.x.g(xVar, u0Var.f(iVarM.a()).n(com.planner5d.library.f.s.B2).k(com.planner5d.library.activity.fragment.list.u0.e(u0Var, false, 1, null)), false, 2, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void a(@NotNull Bundle state, @NotNull Object item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(item, state, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.planner5d.library.activity.fragment.list.g0
    @Nullable
    public Object h(@NotNull l1.j jVar, @NotNull l1.d<com.planner5d.library.database.model.j> dVar, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.activity.fragment.list.h0>> dVar2) {
        b bVar;
        List<Project> listU0;
        List<com.planner5d.library.activity.fragment.list.h0> listC;
        List<com.planner5d.library.activity.fragment.list.h0> list;
        List<com.planner5d.library.activity.fragment.list.h0> list2;
        Long lG;
        List<T> listA;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i10 = bVar.f135124e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f135124e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object obj = bVar.f135122c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f135124e;
        if (i11 == 0) {
            ResultKt.m(obj);
            id.a aVarA = this.f135109i3.a();
            if (dVar.c()) {
                listU0 = CollectionsKt.emptyList();
            } else {
                com.planner5d.library.model.manager.project.d0 d0Var = this.f135115p2;
                com.planner5d.library.database.model.j jVarB = dVar.b();
                listU0 = d0Var.u0(aVarA, jVarB instanceof Folder ? (Folder) jVarB : null, jVar.n(), this.f135116t.a(com.planner5d.library.model.manager.config.f.Contests));
                Intrinsics.checkNotNull(listU0);
            }
            com.planner5d.library.model.manager.c0 c0Var = this.f135118w;
            com.planner5d.library.model.manager.c0.a aVarL = jVar.l();
            int iN = N();
            int[] iArrQ = Q();
            List<Folder> listFirst = c0Var.C(aVarA, aVarL, iN, Arrays.copyOf(iArrQ, iArrQ.length)).toBlocking().first();
            Intrinsics.checkNotNullExpressionValue(listFirst, "first(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listFirst) {
                Folder folder = (Folder) obj2;
                long j10 = folder.parentId;
                com.planner5d.library.database.model.j jVarB2 = dVar.b();
                Folder folder2 = jVarB2 instanceof Folder ? (Folder) jVarB2 : null;
                if (folder2 == null || (lG = folder2.getId()) == null) {
                    lG = kotlin.coroutines.jvm.internal.b.g(0L);
                }
                if (lG != null && j10 == lG.longValue() && ((listA = dVar.a()) == 0 || !listA.contains(folder))) {
                    arrayList.add(obj2);
                }
            }
            this.f135112l3.clear();
            this.f135112l3.addAll(arrayList);
            l lVar = this.f135111k3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.planner5d.library.model.g((Folder) it.next(), 0, null, 4, null));
            }
            listC = lVar.c(jVar, listU0, arrayList2);
            if (dVar.c()) {
                list = listC;
            } else {
                g gVar = this.X;
                if (gVar != null) {
                    bVar.f135120a = listC;
                    bVar.f135121b = listC;
                    bVar.f135124e = 1;
                    Object objA = gVar.a(bVar);
                    if (objA == objL) {
                        return objL;
                    }
                    list = listC;
                    obj = objA;
                    list2 = list;
                } else {
                    list = listC;
                }
                listC.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.NewItem, Unit.f312394a));
            }
            listC.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.SortingAndAppearance, Unit.f312394a));
            return list;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = (List) bVar.f135121b;
        list = (List) bVar.f135120a;
        ResultKt.m(obj);
        List<g.a> list3 = (List) obj;
        if (list3 != null) {
            for (g.a aVar : list3) {
                if (aVar.d()) {
                    list2.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.AiRecognitionInProgress, aVar.a()));
                } else {
                    list2.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.AiRecognitionFailed, aVar.a()));
                }
            }
        }
        listC = list2;
        listC.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.NewItem, Unit.f312394a));
        listC.add(0, new com.planner5d.library.activity.fragment.list.h0(com.planner5d.library.activity.fragment.list.h0.a.SortingAndAppearance, Unit.f312394a));
        return list;
    }

    @Override // com.planner5d.library.activity.fragment.projects.e0
    @NotNull
    public com.planner5d.library.activity.helper.event.content.c j0(@NotNull Bundle state, @NotNull com.planner5d.library.activity.helper.event.content.e animation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animation, "animation");
        boolean zA = new com.planner5d.library.services.utility.j(state).a(com.planner5d.library.services.r.folder);
        Class cls = zA ? Projects.class : ProjectsPagesFragment.class;
        if (!zA) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tab;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.floorPlansList;
            state = iVar.t(rVar, rVar2).h(rVar2, state).a();
        }
        com.planner5d.library.activity.helper.event.content.c cVar = new com.planner5d.library.activity.helper.event.content.c(cls, state, animation);
        com.planner5d.library.activity.helper.event.content.a aVarF = this.Z.f();
        return cVar.o(aVarF != null ? aVarF.g() : null).j(this.Z.f());
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean l(@NotNull List<? extends Object> selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        return !CollectionsKt.subtract(this.f135112l3, selected).isEmpty();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean m(@NotNull final Activity activity, @NotNull Object item, @NotNull MenuItem itemMenu) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemMenu, "itemMenu");
        final com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        final Project project = (Project) item;
        int itemId = itemMenu.getItemId();
        if (itemId == com.planner5d.library.f.j.f168317q1) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.share, null, project.projectId);
            com.planner5d.library.services.l0.o(new com.planner5d.library.services.l0(project, this.f135115p2, g2.a(this), this.f135113p0, this.Y, r3.k.projects, r3.l.project), activity, null, null, 6, null);
            return false;
        }
        if (itemId == com.planner5d.library.f.j.f168269o1) {
            this.H1.a(project.getId(), new e2() { // from class: com.planner5d.library.activity.fragment.projects.p0
                @Override // com.planner5d.library.services.utility.e2
                public final void apply(Object obj) {
                    w0.G0(iVar, this, ((Long) obj).longValue());
                }
            });
            return true;
        }
        if (itemId == com.planner5d.library.f.j.f168173k1) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.archive, null, project.projectId);
            ConfirmDeleteMessage.show(this.f135117v, activity.getString(com.planner5d.library.f.s.bw), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.projects.q0
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    w0.H0(this.f135085a, project, (Boolean) obj);
                }
            });
            return true;
        }
        if (itemId == com.planner5d.library.f.j.f168197l1) {
            com.planner5d.library.model.manager.statistics.events.b2 b2Var = com.planner5d.library.model.manager.statistics.events.b2.f216725b;
            x3.a aVar = x3.a.remove_from_folder;
            b2Var.u0(aVar, null, project.projectId);
            project.folderId = 0L;
            this.f135115p2.N0(this.f135109i3.a(), project).subscribe((Subscriber<? super Project>) new com.planner5d.library.services.rx.e());
            com.planner5d.library.services.m0.f224430c.t();
            b2Var.u0(aVar, p3.b.success, project.projectId);
            return true;
        }
        if (itemId == com.planner5d.library.f.j.R0) {
            this.H1.a(project.getId(), new e2() { // from class: com.planner5d.library.activity.fragment.projects.r0
                @Override // com.planner5d.library.services.utility.e2
                public final void apply(Object obj) {
                    w0.I0(project, this, activity, ((Long) obj).longValue());
                }
            });
            return true;
        }
        if (itemId == com.planner5d.library.f.j.f168029e1) {
            this.H1.a(project.getId(), new e2() { // from class: com.planner5d.library.activity.fragment.projects.s0
                @Override // com.planner5d.library.services.utility.e2
                public final void apply(Object obj) {
                    w0.J0(project, iVar, this, ((Long) obj).longValue());
                }
            });
            return true;
        }
        if (itemId != com.planner5d.library.f.j.f168221m1) {
            return false;
        }
        this.H1.a(project.getId(), new e2() { // from class: com.planner5d.library.activity.fragment.projects.t0
            @Override // com.planner5d.library.services.utility.e2
            public final void apply(Object obj) {
                w0.K0(project, iVar, this, ((Long) obj).longValue());
            }
        });
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void p(@NotNull Activity activity, @Nullable List<? extends Object> list, @NotNull Function0<Unit> onRemoved) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onRemoved, "onRemoved");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof Folder) {
                    arrayList.add(obj);
                } else if (obj instanceof Project) {
                    arrayList2.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f135118w.u(this.f135109i3.a(), arrayList);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.f135115p2.P(arrayList2);
        }
        onRemoved.invoke();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    @NotNull
    public EnhancedRecyclerView.e x() {
        return EnhancedRecyclerView.e.GRID;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void z(@NotNull Bundle state, @NotNull l1.g button, @NotNull com.planner5d.library.activity.fragment.list.b0 actions, @Nullable com.planner5d.library.database.model.j jVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Folder folder = (Folder) jVar;
        int i10 = a.f135119a[button.ordinal()];
        if (i10 == 1) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.c1(x3.b.projects_new_project);
            if (this.f135108h3 == null || !(this.f135116t.a(com.planner5d.library.model.manager.config.f.UploadPlan) || this.f135116t.a(com.planner5d.library.model.manager.config.f.SmartWizard))) {
                e0.h0(this, actions, folder, state, null, 8, null);
                return;
            } else {
                m0(actions, folder, state);
                return;
            }
        }
        if (i10 == 2) {
            z0 z0Var = this.f135108h3;
            if (z0Var != null) {
                this.f135117v.c(z0Var.d()).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.projects.u0
                    @Override // com.planner5d.library.activity.fragment.dialog.u
                    public final void a(Object obj) {
                        w0.L0(this.f135102a, (Boolean) obj);
                    }
                }).g();
                return;
            }
            return;
        }
        if (i10 != 3) {
            throw new kotlin.k0();
        }
        z0 z0Var2 = this.f135108h3;
        if (z0Var2 != null) {
            this.f135117v.c(z0Var2.a()).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.projects.v0
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    w0.M0(this.f135104a, (Boolean) obj);
                }
            }).g();
        }
    }
}
