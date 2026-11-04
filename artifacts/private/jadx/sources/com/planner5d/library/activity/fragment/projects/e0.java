package com.planner5d.library.activity.fragment.projects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.model.manager.y1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectsBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectsBaseViewModel.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsBaseViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public abstract class e0 extends f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f134938s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f134939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f134940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f134941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f134942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b2 f134943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f134944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f134945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c0 f134946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final y1 f134947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final z0 f134948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final le.e f134949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final h f134950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.n f134951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f134952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f134953o;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$createAndOpenNewProject$1", f = "ProjectsBaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134954a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f134956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.list.b0 f134957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f134958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f134959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, com.planner5d.library.activity.fragment.list.b0 b0Var, Bundle bundle, Bundle bundle2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f134956c = j10;
            this.f134957d = b0Var;
            this.f134958e = bundle;
            this.f134959f = bundle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new a(this.f134956c, this.f134957d, this.f134958e, this.f134959f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134954a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            e0.this.f0(this.f134957d, e0.this.f134946h.y(e0.this.f134941c.a(), this.f134956c), this.f134958e, this.f134959f);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$createAndOpenNewProject$2", f = "ProjectsBaseViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160700j1, 100}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f134961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f134962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134963d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f134965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f134966g;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$createAndOpenNewProject$2$model$1", f = "ProjectsBaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nProjectsBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectsBaseViewModel.kt\ncom/planner5d/library/activity/fragment/projects/ProjectsBaseViewModel$createAndOpenNewProject$2$model$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Project>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f134967a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f134968b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134968b = e0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134968b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f134967a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Project project = new Project();
                project.title = this.f134968b.f134939a.getString(com.planner5d.library.f.s.Yr);
                return project;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bundle bundle, Bundle bundle2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f134965f = bundle;
            this.f134966g = bundle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new b(this.f134965f, this.f134966g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Project project;
            e0 e0Var;
            Bundle bundle;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134963d;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                a aVar = new a(e0.this, null);
                this.f134963d = 1;
                obj = kotlinx.coroutines.i.h(z1VarD, aVar, this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Bundle bundle2 = (Bundle) this.f134962c;
                project = (Project) this.f134961b;
                e0 e0Var2 = (e0) this.f134960a;
                ResultKt.m(obj);
                bundle = bundle2;
                e0Var = e0Var2;
            }
            e0Var.p0(project, bundle, ((Boolean) obj).booleanValue(), false, true, this.f134966g);
            return Unit.f312394a;
            project = (Project) obj;
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.B(x3.c.from_scratch, project.projectId);
            e0 e0Var3 = e0.this;
            Bundle bundle3 = this.f134965f;
            this.f134960a = e0Var3;
            this.f134961b = project;
            this.f134962c = bundle3;
            this.f134963d = 2;
            Object objO0 = e0Var3.o0(this);
            if (objO0 != objL) {
                e0Var = e0Var3;
                obj = objO0;
                bundle = bundle3;
                e0Var.p0(project, bundle, ((Boolean) obj).booleanValue(), false, true, this.f134966g);
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$createAndOpenNewProject$3", f = "ProjectsBaseViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134969a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Folder f134971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f134972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f134973e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$createAndOpenNewProject$3$1", f = "ProjectsBaseViewModel.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f134974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f134975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f134976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f134977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f134978e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e0 f134979f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Folder f134980g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Bundle f134981h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Bundle f134982i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, Folder folder, Bundle bundle, Bundle bundle2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134979f = e0Var;
                this.f134980g = folder;
                this.f134981h = bundle;
                this.f134982i = bundle2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134979f, this.f134980g, this.f134981h, this.f134982i, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Project projectFirstOrDefault;
                e0 e0Var;
                Bundle bundle;
                Bundle bundle2;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f134978e;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        projectFirstOrDefault = this.f134979f.f134940b.N(this.f134979f.f134941c.a(), this.f134980g, true).toBlocking().firstOrDefault(null);
                        if (projectFirstOrDefault != null) {
                            e0 e0Var2 = this.f134979f;
                            Bundle bundle3 = this.f134981h;
                            Bundle bundle4 = this.f134982i;
                            com.planner5d.library.model.manager.statistics.events.b2.f216725b.B(x3.c.from_scratch, projectFirstOrDefault.projectId);
                            this.f134974a = bundle4;
                            this.f134975b = bundle3;
                            this.f134976c = projectFirstOrDefault;
                            this.f134977d = e0Var2;
                            this.f134978e = 1;
                            Object objO0 = e0Var2.o0(this);
                            if (objO0 == objL) {
                                return objL;
                            }
                            e0Var = e0Var2;
                            obj = objO0;
                            bundle = bundle3;
                            bundle2 = bundle4;
                        }
                        return Unit.f312394a;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e0Var = (e0) this.f134977d;
                    projectFirstOrDefault = (Project) this.f134976c;
                    bundle = (Bundle) this.f134975b;
                    Bundle bundle5 = (Bundle) this.f134974a;
                    ResultKt.m(obj);
                    bundle2 = bundle5;
                    e0Var.p0(projectFirstOrDefault, bundle, ((Boolean) obj).booleanValue(), false, false, bundle2);
                } catch (Throwable th2) {
                    this.f134979f.f134943e.c(th2);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Folder folder, Bundle bundle, Bundle bundle2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f134971c = folder;
            this.f134972d = bundle;
            this.f134973e = bundle2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new c(this.f134971c, this.f134972d, this.f134973e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134969a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                a aVar = new a(e0.this, this.f134971c, this.f134972d, this.f134973e, null);
                this.f134969a = 1;
                if (kotlinx.coroutines.i.h(z1VarD, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$onActivityCreated$1", f = "ProjectsBaseViewModel.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134983a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f134985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f134986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.list.b0 f134987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Folder f134988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f134989g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Intent intent, Activity activity, com.planner5d.library.activity.fragment.list.b0 b0Var, Folder folder, Bundle bundle, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f134985c = intent;
            this.f134986d = activity;
            this.f134987e = b0Var;
            this.f134988f = folder;
            this.f134989g = bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(e0 e0Var, Bundle bundle, Project project) {
            e0.q0(e0Var, project, bundle, false, false, true, null, 32, null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new d(this.f134985c, this.f134986d, this.f134987e, this.f134988f, this.f134989g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134983a;
            if (i10 == 0) {
                ResultKt.m(obj);
                le.e eVar = e0.this.f134949k;
                Intent intent = this.f134985c;
                Activity activity = this.f134986d;
                this.f134983a = 1;
                obj = eVar.b(intent, activity, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                h hVar = e0.this.f134950l;
                Activity activity2 = this.f134986d;
                com.planner5d.library.activity.fragment.list.b0 b0Var = this.f134987e;
                Intent intent2 = this.f134985c;
                Folder folder = this.f134988f;
                final e0 e0Var = e0.this;
                final Bundle bundle = this.f134989g;
                hVar.e(activity2, b0Var, intent2, folder, new Function1() { // from class: com.planner5d.library.activity.fragment.projects.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return e0.d.n(e0Var, bundle, (Project) obj2);
                    }
                });
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.projects.ProjectsBaseViewModel$openProject$2", f = "ProjectsBaseViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134990a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134990a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = e0.this.f134953o;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.firstProjectOpen;
                this.f134990a = 1;
                if (pVar.L(rVar, false, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public e0(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull b2 messageManager, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull y1 menuManager, @Nullable z0 z0Var, @NotNull le.e handleNewIntentUseCase, @NotNull h importProjectUseCase, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull com.planner5d.library.model.manager.config.p sharedPreferences) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(handleNewIntentUseCase, "handleNewIntentUseCase");
        Intrinsics.checkNotNullParameter(importProjectUseCase, "importProjectUseCase");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f134939a = application;
        this.f134940b = projectManager;
        this.f134941c = userAuthorization;
        this.f134942d = userPurchases;
        this.f134943e = messageManager;
        this.f134944f = configuration;
        this.f134945g = navigator;
        this.f134946h = folderManager;
        this.f134947i = menuManager;
        this.f134948j = z0Var;
        this.f134949k = handleNewIntentUseCase;
        this.f134950l = importProjectUseCase;
        this.f134951m = defaultFragmentProvider;
        this.f134952n = featureConfigManager;
        this.f134953o = sharedPreferences;
    }

    private final boolean c0() {
        return this.f134944f.a() || this.f134942d.c();
    }

    public static /* synthetic */ void g0(e0 e0Var, com.planner5d.library.activity.fragment.list.b0 b0Var, long j10, Bundle bundle, Bundle bundle2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAndOpenNewProject");
        }
        if ((i10 & 8) != 0) {
            bundle2 = null;
        }
        e0Var.d0(b0Var, j10, bundle, bundle2);
    }

    public static /* synthetic */ void h0(e0 e0Var, com.planner5d.library.activity.fragment.list.b0 b0Var, Folder folder, Bundle bundle, Bundle bundle2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAndOpenNewProject");
        }
        if ((i10 & 8) != 0) {
            bundle2 = null;
        }
        e0Var.f0(b0Var, folder, bundle, bundle2);
    }

    private final com.planner5d.library.activity.helper.event.content.c i0() {
        com.planner5d.library.activity.helper.event.content.a aVarA = this.f134947i.a();
        return aVarA != null ? new com.planner5d.library.activity.helper.event.content.c(aVarA, com.planner5d.library.activity.helper.event.content.e.SlideLeft) : new com.planner5d.library.activity.helper.event.content.d(this.f134951m.a(), new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a());
    }

    public static /* synthetic */ com.planner5d.library.activity.helper.event.content.c k0(e0 e0Var, Bundle bundle, com.planner5d.library.activity.helper.event.content.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReturningNavDestination");
        }
        if ((i10 & 2) != 0) {
            eVar = com.planner5d.library.activity.helper.event.content.e.None;
        }
        return e0Var.j0(bundle, eVar);
    }

    public static /* synthetic */ void q0(e0 e0Var, Project project, Bundle bundle, boolean z10, boolean z11, boolean z12, Bundle bundle2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openProject");
        }
        if ((i10 & 16) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i10 & 32) != 0) {
            bundle2 = null;
        }
        e0Var.p0(project, bundle, z10, z11, z13, bundle2);
    }

    public final void d0(@NotNull com.planner5d.library.activity.fragment.list.b0 actions, long j10, @NotNull Bundle state, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z10 = false & false;
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new a(j10, actions, state, bundle, null), 2, null);
    }

    public final void f0(@NotNull com.planner5d.library.activity.fragment.list.b0 actions, @Nullable Folder folder, @NotNull Bundle state, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(state, "state");
        if (c0()) {
            actions.d(com.planner5d.library.activity.fragment.list.b0.a.CreatingProject, new c(folder, state, bundle, null));
        } else {
            actions.d(com.planner5d.library.activity.fragment.list.b0.a.CreatingProject, new b(state, bundle, null));
        }
    }

    @NotNull
    public abstract com.planner5d.library.activity.helper.event.content.c j0(@NotNull Bundle bundle, @NotNull com.planner5d.library.activity.helper.event.content.e eVar);

    public final void l0(@NotNull com.planner5d.library.activity.fragment.list.b0 actions, @NotNull Bundle state, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(state, "state");
        z0 z0Var = this.f134948j;
        if (z0Var != null) {
            com.planner5d.library.activity.fragment.x.g(this.f134945g, new com.planner5d.library.activity.helper.event.content.c(z0Var.c(), bundle, com.planner5d.library.activity.helper.event.content.e.SlideLeft).k(i0()), false, 2, null);
        }
    }

    public final void m0(@NotNull com.planner5d.library.activity.fragment.list.b0 actions, @Nullable Folder folder, @NotNull Bundle state) {
        Long id2;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(state, "state");
        l0(actions, state, (folder == null || (id2 = folder.getId()) == null) ? null : new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.folder, id2.longValue()).a());
    }

    public final void n0(@NotNull Activity activity, @Nullable Intent intent, @NotNull com.planner5d.library.activity.fragment.list.b0 actions, @Nullable Folder folder, @NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(state, "state");
        com.planner5d.library.model.manager.i.a aVar = com.planner5d.library.model.manager.i.f191511e;
        if (intent == null) {
            intent = activity.getIntent();
        }
        Intent intentB = aVar.b(intent);
        if (intentB == null) {
            return;
        }
        actions.d(com.planner5d.library.activity.fragment.list.b0.a.ProcessingDeeplink, new d(intentB, activity, actions, folder, state, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Object o0(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return this.f134952n.a(com.planner5d.library.model.manager.config.f.Editor3dOnStart) ? this.f134953o.G(com.planner5d.library.services.r.firstProjectOpen, true, dVar) : kotlin.coroutines.jvm.internal.b.a(false);
    }

    public final void p0(@NotNull Project project, @NotNull Bundle state, boolean z10, boolean z11, boolean z12, @Nullable Bundle bundle) {
        com.planner5d.library.activity.helper.event.content.a aVar;
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(state, "state");
        if (z11) {
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.u0(x3.a.open, null, project.projectId);
        }
        com.planner5d.library.activity.helper.event.content.a aVarF = this.f134947i.f();
        if (aVarF != null) {
            aVar = aVarF;
        } else if (z12) {
            aVarF = this.f134947i.a();
            aVar = aVarF;
        } else {
            aVar = null;
        }
        com.planner5d.library.activity.helper.event.content.d dVarS = new com.planner5d.library.activity.helper.event.content.d(project, z10, (Bundle) null, true, aVar).s(x3.d.projects, true);
        if (bundle != null) {
            dVarS.q(bundle);
        }
        com.planner5d.library.activity.fragment.x.g(this.f134945g, dVarS, false, 2, null);
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new e(null), 2, null);
    }
}
