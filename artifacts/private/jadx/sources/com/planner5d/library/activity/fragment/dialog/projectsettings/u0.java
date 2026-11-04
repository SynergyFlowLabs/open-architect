package com.planner5d.library.activity.fragment.dialog.projectsettings;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.model.manager.statistics.events.u3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.s2;
import com.planner5d.library.widget.editor.helper.t3;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u0 extends f2 {

    @Nullable
    private com.planner5d.library.services.l.c X;

    @NotNull
    private final c1<c> Y;

    @NotNull
    private final c1<e> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f132307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f132308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k5 f132309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.f2 f132310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.s0 f132311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.m0 f132312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f132313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f132314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final t1 f132315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private IntRange f132316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private ArrayDeque<d> f132317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f132318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Function0<? extends com.planner5d.library.services.bitmaploader.target.a> f132319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f132320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<IntRange> f132321o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.model.metricunit.a> f132322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.widget.editor.projectresources.viewoptions.b> f132323t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final v1.a<ProjectRevision> f132324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.projectresources.viewoptions.b f132325w;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final b f132305p0 = new b(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f132306p1 = 8;

    @NotNull
    private static final IntRange H1 = new IntRange(10, 50);

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132326a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132326a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.f2 f2Var = u0.this.f132310d;
                this.f132326a = 1;
                obj = f2Var.k(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.model.metricunit.a aVar = (com.planner5d.library.model.metricunit.a) obj;
            u0 u0Var = u0.this;
            u0Var.f132316j = u0Var.h1(aVar);
            u0.this.t0().r(u0.this.f132316j);
            u0.this.w0().r(aVar);
            u0.this.u0().r(c.b.f132331b);
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.G0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132328a = 0;

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f132329b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132330c = 0;

            private a() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -147656877;
            }

            @NotNull
            public String toString() {
                return "Initialising";
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f132331b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132332c = 0;

            private b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2006490129;
            }

            @NotNull
            public String toString() {
                return "InitializationFinished";
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.projectsettings.u0$c$c, reason: collision with other inner class name */
        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class C1457c extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1457c f132333b = new C1457c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132334c = 0;

            private C1457c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1457c);
            }

            public int hashCode() {
                return 616185917;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class d extends c {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f132335d = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final t3 f132336b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final List<ProjectRevision> f132337c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull t3 projectLoadInfo, @NotNull List<ProjectRevision> projectRevisions) {
                super(null);
                Intrinsics.checkNotNullParameter(projectLoadInfo, "projectLoadInfo");
                Intrinsics.checkNotNullParameter(projectRevisions, "projectRevisions");
                this.f132336b = projectLoadInfo;
                this.f132337c = projectRevisions;
            }

            @NotNull
            public final t3 a() {
                return this.f132336b;
            }

            @NotNull
            public final List<ProjectRevision> b() {
                return this.f132337c;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        Main(0, null),
        Background(1, Integer.valueOf(com.planner5d.library.f.s.f168974a2)),
        History(2, Integer.valueOf(com.planner5d.library.f.s.f169517wd)),
        DisplayOptions(3, Integer.valueOf(com.planner5d.library.f.s.aH)),
        Graphics(4, Integer.valueOf(com.planner5d.library.f.s.f169180id)),
        Actions(5, Integer.valueOf(com.planner5d.library.f.s.V)),
        ControlsAndNavigation(6, Integer.valueOf(com.planner5d.library.f.s.f169027c5)),
        Grid(7, Integer.valueOf(com.planner5d.library.f.s.f169204jd));


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f132347l = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f132348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Integer f132349b;

        d(int i10, Integer num) {
            this.f132348a = i10;
            this.f132349b = num;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f132347l;
        }

        @Nullable
        public final Integer n() {
            return this.f132349b;
        }

        public final int o() {
            return this.f132348a;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132350a = 0;

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class a extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f132351b = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132352c = 0;

            private a() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 514275794;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class b extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f132353b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132354c = 0;

            private b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1784430426;
            }

            @NotNull
            public String toString() {
                return "Updating";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$load$1", f = "ProjectSettingsViewModel.kt", i = {1}, l = {127, 128}, m = "invokeSuspend", n = {"projectInfo"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f132356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f132357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f132358d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f132360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<com.planner5d.library.services.bitmaploader.target.a> f132361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f132362h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, Function0<? extends com.planner5d.library.services.bitmaploader.target.a> function0, Function1<? super Integer, Unit> function1, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f132360f = str;
            this.f132361g = function0;
            this.f132362h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new f(this.f132360f, this.f132361g, this.f132362h, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            c1<c> c1VarU0;
            t3 t3Var;
            t3 t3Var2;
            ItemProject itemProjectA;
            ItemMaterial material;
            ItemEarth earth;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132358d;
            if (i10 == 0) {
                ResultKt.m(obj);
                u0 u0Var = u0.this;
                String str = this.f132360f;
                this.f132358d = 1;
                obj = u0Var.G0(str, this);
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
                t3Var = (t3) this.f132357c;
                c1VarU0 = (c1) this.f132356b;
                t3Var2 = (t3) this.f132355a;
                ResultKt.m(obj);
            }
            c1VarU0.r(new c.d(t3Var, (List) obj));
            u0 u0Var2 = u0.this;
            itemProjectA = t3Var2.a();
            if (itemProjectA != null || (earth = itemProjectA.getEarth()) == null) {
                material = null;
            } else {
                material = earth.getMaterial();
            }
            u0Var2.K0(material, this.f132361g.invoke(), this.f132362h);
            return Unit.f312394a;
            t3 t3Var3 = (t3) obj;
            c1VarU0 = u0.this.u0();
            u0 u0Var3 = u0.this;
            Project projectB = t3Var3.b();
            this.f132355a = t3Var3;
            this.f132356b = c1VarU0;
            this.f132357c = t3Var3;
            this.f132358d = 2;
            Object objJ0 = u0Var3.J0(projectB, this);
            if (objJ0 != objL) {
                t3Var = t3Var3;
                obj = objJ0;
                t3Var2 = t3Var;
                c1VarU0.r(new c.d(t3Var, (List) obj));
                u0 u0Var4 = u0.this;
                itemProjectA = t3Var2.a();
                if (itemProjectA != null) {
                    material = null;
                } else {
                    material = null;
                }
                u0Var4.K0(material, this.f132361g.invoke(), this.f132362h);
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel", f = "ProjectSettingsViewModel.kt", i = {}, l = {145}, m = "loadProject", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f132363a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f132365c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f132363a = obj;
            this.f132365c |= Integer.MIN_VALUE;
            return u0.this.G0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$loadProjectRevisions$2", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends ProjectRevision>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132366a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Project f132368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Project project, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f132368c = project;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new h(this.f132368c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends ProjectRevision>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<ProjectRevision>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return u0.this.f132312f.k(this.f132368c, !u0.this.f132313g.c());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<ProjectRevision>> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$moveItemsAction$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.editaction.u.b f132371c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.planner5d.library.widget.editor.editaction.u.b bVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f132371c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f132371c, dVar);
            iVar.f132370b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ItemProject itemProjectA = ((c.d) this.f132370b).a().a();
            if (itemProjectA != null) {
                com.planner5d.library.widget.editor.editaction.u.b bVar = this.f132371c;
                ItemFloor activeFloor = itemProjectA.getActiveFloor();
                Intrinsics.checkNotNullExpressionValue(activeFloor, "getActiveFloor(...)");
                Item[] children = activeFloor.getChildren();
                Intrinsics.checkNotNullExpressionValue(children, "getChildren(...)");
                if (!(children.length == 0)) {
                    com.planner5d.library.services.l.f224378d.o(new com.planner5d.library.services.l.c(new com.planner5d.library.widget.editor.editaction.u(activeFloor, bVar), new com.planner5d.library.widget.editor.editaction.u(activeFloor, com.planner5d.library.widget.editor.editaction.u.b.None)));
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((i) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$onMetricUnitChanged$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {241, com.planner5d.library.engine.input.f.b.S1}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132372a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.metricunit.a f132374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f132375d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.planner5d.library.model.metricunit.a aVar, Fragment fragment, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f132374c = aVar;
            this.f132375d = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new j(this.f132374c, this.f132375d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
        
            if (r1.V0(r3, r9, r8) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.projectsettings.u0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$openProjectRevision$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132376a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProjectRevision f132378c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$openProjectRevision$1$fullRevision$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super ProjectRevision>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u0 f132380b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProjectRevision f132381c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, ProjectRevision projectRevision, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132380b = u0Var;
                this.f132381c = projectRevision;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132380b, this.f132381c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132379a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f132380b.f132312f.l(this.f132381c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super ProjectRevision> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ProjectRevision projectRevision, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f132378c = projectRevision;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new k(this.f132378c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132376a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                a aVar = new a(u0.this, this.f132378c, null);
                this.f132376a = 1;
                obj = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            u0.this.y0().r((ProjectRevision) obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$runIfLoaded$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> f132383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f132384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function2<? super c.d, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, c cVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f132383b = function2;
            this.f132384c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new l(this.f132383b, this.f132384c, dVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.planner5d.library.activity.fragment.dialog.projectsettings.u0$l for r4v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r3 = 6
                int r1 = r4.f132382a
                r2 = 7
                r2 = 1
                if (r1 == 0) goto L1c
                r3 = 6
                if (r1 != r2) goto L12
                kotlin.ResultKt.m(r5)
                goto L2c
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "/us ohn bni/iaee/ / relcmoo/rlt suteovoekfte icw/r/"
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1c:
                kotlin.ResultKt.m(r5)
                kotlin.jvm.functions.Function2<com.planner5d.library.activity.fragment.dialog.projectsettings.u0$c$d, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r5 = r4.f132383b
                com.planner5d.library.activity.fragment.dialog.projectsettings.u0$c r1 = r4.f132384c
                r4.f132382a = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L2c
                return r0
            L2c:
                r3 = 4
                kotlin.Unit r4 = kotlin.Unit.f312394a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.projectsettings.u0.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$saveBackground$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f132387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ItemMaterial f132388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Fragment fragment, ItemMaterial itemMaterial, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f132387c = fragment;
            this.f132388d = itemMaterial;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f132387c, this.f132388d, dVar);
            mVar.f132386b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ItemEarth earth;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132385a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            t3 t3VarA = ((c.d) this.f132386b).a();
            Fragment fragment = this.f132387c;
            ItemMaterial itemMaterial = this.f132388d;
            s2.a aVar = s2.f256732d;
            o3.k kVar = o3.k.project_background;
            Project projectB = t3VarA.b();
            ItemMaterial material = null;
            int i10 = 4 >> 0;
            aVar.b(fragment, kVar, projectB != null ? projectB.projectId : null);
            v1.a<com.planner5d.library.services.l.c> aVar2 = com.planner5d.library.services.l.f224378d;
            com.planner5d.library.widget.editor.editaction.w wVar = new com.planner5d.library.widget.editor.editaction.w(itemMaterial);
            ItemProject itemProjectA = t3VarA.a();
            if (itemProjectA != null && (earth = itemProjectA.getEarth()) != null) {
                material = earth.getMaterial();
            }
            aVar2.o(new com.planner5d.library.services.l.c(wVar, new com.planner5d.library.widget.editor.editaction.w(material)));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((m) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$saveGridSize$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132389a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f132391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f132392d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Fragment fragment, int i10, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f132391c = fragment;
            this.f132392d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new n(this.f132391c, this.f132392d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132389a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u0 u0Var = u0.this;
                Fragment fragment = this.f132391c;
                int i11 = this.f132392d;
                this.f132389a = 1;
                if (u0Var.V0(fragment, i11, this) == objL) {
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
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel", f = "ProjectSettingsViewModel.kt", i = {}, l = {286}, m = "saveGridSizeInternal", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f132394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f132395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f132396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f132397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132398f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f132400h;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f132398f = obj;
            this.f132400h |= Integer.MIN_VALUE;
            return u0.this.V0(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setGridSize$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f132402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f132403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f132404d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, u0 u0Var, Fragment fragment, kotlin.coroutines.d<? super p> dVar) {
            super(2, dVar);
            this.f132402b = str;
            this.f132403c = u0Var;
            this.f132404d = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new p(this.f132402b, this.f132403c, this.f132404d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int iL;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132401a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                iL = Integer.parseInt(this.f132402b);
            } catch (NumberFormatException e10) {
                timber.log.b.f381052a.e(e10);
                iL = this.f132403c.f132316j.l();
            }
            u0 u0Var = this.f132403c;
            u0Var.U0(this.f132404d, u0Var.D0(iL));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setMeasureUnit$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f132406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f132407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f132408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.metricunit.a f132409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0 f132410f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Fragment fragment, com.planner5d.library.model.metricunit.a aVar, u0 u0Var, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f132408d = fragment;
            this.f132409e = aVar;
            this.f132410f = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f132408d, this.f132409e, this.f132410f, dVar);
            qVar.f132407c = obj;
            return qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            v1.a<com.planner5d.library.services.l.c> aVar;
            com.planner5d.library.widget.editor.editaction.e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132406b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c.d dVar = (c.d) this.f132407c;
                s2.a aVar2 = s2.f256732d;
                Fragment fragment = this.f132408d;
                o3.k kVar = o3.k.metric_unit;
                Project projectB = dVar.a().b();
                aVar2.b(fragment, kVar, projectB != null ? projectB.projectId : null);
                aVar = com.planner5d.library.services.l.f224378d;
                com.planner5d.library.widget.editor.editaction.s sVar = new com.planner5d.library.widget.editor.editaction.s(null, this.f132409e, this.f132410f.f132310d);
                com.planner5d.library.model.manager.f2 f2Var = this.f132410f.f132310d;
                this.f132407c = aVar;
                this.f132405a = sVar;
                this.f132406b = 1;
                Object objK = f2Var.k(this);
                if (objK == objL) {
                    return objL;
                }
                eVar = sVar;
                obj = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (com.planner5d.library.widget.editor.editaction.e) this.f132405a;
                aVar = (v1.a) this.f132407c;
                ResultKt.m(obj);
            }
            aVar.o(new com.planner5d.library.services.l.c(eVar, new com.planner5d.library.widget.editor.editaction.s(null, (com.planner5d.library.model.metricunit.a) obj, this.f132410f.f132310d)));
            this.f132410f.O0(this.f132408d, this.f132409e);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((q) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setMeasureUnits$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f132412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.metricunit.a f132413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0 f132414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f132415e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(com.planner5d.library.model.metricunit.a aVar, u0 u0Var, Fragment fragment, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f132413c = aVar;
            this.f132414d = u0Var;
            this.f132415e = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new r(this.f132413c, this.f132414d, this.f132415e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.model.metricunit.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132412b;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.metricunit.a aVar2 = this.f132413c;
                com.planner5d.library.model.manager.f2 f2Var = this.f132414d.f132310d;
                this.f132411a = aVar2;
                this.f132412b = 1;
                Object objK = f2Var.k(this);
                if (objK == objL) {
                    return objL;
                }
                aVar = aVar2;
                obj = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.planner5d.library.model.metricunit.a) this.f132411a;
                ResultKt.m(obj);
            }
            if (!Intrinsics.areEqual(aVar, obj)) {
                this.f132414d.a1(this.f132415e, this.f132413c);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setShadowType$1", f = "ProjectSettingsViewModel.kt", i = {0}, l = {345}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    static final class s extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f132418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0 f132419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ac.i f132420e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setShadowType$1$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u0 f132422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ac.i f132423c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, ac.i iVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132422b = u0Var;
                this.f132423c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132422b, this.f132423c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132421a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f132422b.f132311e.f(this.f132423c));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Fragment fragment, u0 u0Var, ac.i iVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f132418c = fragment;
            this.f132419d = u0Var;
            this.f132420e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.f132418c, this.f132419d, this.f132420e, dVar);
            sVar.f132417b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c.d dVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132416a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c.d dVar2 = (c.d) this.f132417b;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                a aVar = new a(this.f132419d, this.f132420e, null);
                this.f132417b = dVar2;
                this.f132416a = 1;
                Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                dVar = dVar2;
                obj = objH;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (c.d) this.f132417b;
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                s2.a aVar2 = s2.f256732d;
                Fragment fragment = this.f132418c;
                o3.k kVar = o3.k.other;
                Project projectB = dVar.a().b();
                aVar2.b(fragment, kVar, projectB != null ? projectB.projectId : null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((s) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setTextureSize$1", f = "ProjectSettingsViewModel.kt", i = {0}, l = {356}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    static final class t extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f132426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0 f132427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.p.b f132428e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setTextureSize$1$1", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132429a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u0 f132430b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.p.b f132431c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u0 u0Var, com.planner5d.library.model.p.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f132430b = u0Var;
                this.f132431c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f132430b, this.f132431c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132429a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f132430b.f132311e.h(this.f132431c));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Fragment fragment, u0 u0Var, com.planner5d.library.model.p.b bVar, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f132426c = fragment;
            this.f132427d = u0Var;
            this.f132428e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            t tVar = new t(this.f132426c, this.f132427d, this.f132428e, dVar);
            tVar.f132425b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c.d dVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132424a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c.d dVar2 = (c.d) this.f132425b;
                z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                a aVar = new a(this.f132427d, this.f132428e, null);
                this.f132425b = dVar2;
                this.f132424a = 1;
                Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                dVar = dVar2;
                obj = objH;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (c.d) this.f132425b;
                ResultKt.m(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                s2.a aVar2 = s2.f256732d;
                Fragment fragment = this.f132426c;
                o3.k kVar = o3.k.other;
                Project projectB = dVar.a().b();
                aVar2.b(fragment, kVar, projectB != null ? projectB.projectId : null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((t) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel", f = "ProjectSettingsViewModel.kt", i = {}, l = {261}, m = "setViewOptions", n = {}, s = {})
    static final class u extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f132433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f132434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f132435d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f132437f;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f132435d = obj;
            this.f132437f |= Integer.MIN_VALUE;
            return u0.this.f1(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsViewModel$setViewOptions$2", f = "ProjectSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends kotlin.coroutines.jvm.internal.o implements Function2<c.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.widget.editor.projectresources.viewoptions.b.a f132440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u0 f132441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f132442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o3.k f132443f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVar, u0 u0Var, Fragment fragment, o3.k kVar, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f132440c = aVar;
            this.f132441d = u0Var;
            this.f132442e = fragment;
            this.f132443f = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            v vVar = new v(this.f132440c, this.f132441d, this.f132442e, this.f132443f, dVar);
            vVar.f132439b = obj;
            return vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132438a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.d dVar = (c.d) this.f132439b;
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = this.f132440c.a();
            if (!bVarA.equals(this.f132441d.B0().f())) {
                timber.log.b.f381052a.a("history posting: ViewOptionChangeAction", new Object[0]);
                v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
                com.planner5d.library.services.l.c cVar = new com.planner5d.library.services.l.c(new com.planner5d.library.widget.editor.editaction.g0(bVarA), new com.planner5d.library.widget.editor.editaction.g0(this.f132441d.f132325w), this.f132441d.X);
                this.f132441d.X = cVar;
                aVar.o(cVar);
                this.f132441d.B0().r(bVarA);
                s2.a aVar2 = s2.f256732d;
                Fragment fragment = this.f132442e;
                o3.k kVar = this.f132443f;
                Project projectB = dVar.a().b();
                aVar2.b(fragment, kVar, projectB != null ? projectB.projectId : null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            return ((v) create(dVar, dVar2)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public u0(@NotNull n3 helperProjectPersistence, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull k5 textureManager, @NotNull com.planner5d.library.model.manager.f2 metricUnitManager, @NotNull com.planner5d.library.model.manager.s0 globalSettingsManager, @NotNull com.planner5d.library.model.manager.project.m0 projectRevisionManager, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(globalSettingsManager, "globalSettingsManager");
        Intrinsics.checkNotNullParameter(projectRevisionManager, "projectRevisionManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f132307a = helperProjectPersistence;
        this.f132308b = userAuthorization;
        this.f132309c = textureManager;
        this.f132310d = metricUnitManager;
        this.f132311e = globalSettingsManager;
        this.f132312f = projectRevisionManager;
        this.f132313g = userPurchases;
        this.f132314h = featureConfigManager;
        this.f132315i = logRecordManager;
        this.f132316j = IntRange.f312907e.a();
        this.f132317k = new ArrayDeque<>();
        this.f132320n = new c1<>(10);
        this.f132321o = new c1<>();
        this.f132322s = new c1<>();
        this.f132323t = new c1<>();
        this.f132324v = v1.f229769a.j(null);
        c1<c> c1Var = new c1<>(c.C1457c.f132333b);
        this.Y = c1Var;
        this.Z = new c1<>(e.a.f132351b);
        c1Var.r(c.a.f132329b);
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.Q0();
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D0(int i10) {
        int iL = H1.l();
        try {
            return kotlin.ranges.r.J(i10, this.f132316j);
        } catch (IllegalArgumentException e10) {
            com.planner5d.library.model.manager.statistics.events.t0.f217461b.N0();
            this.f132315i.b(u3.f217545l3.n(), "Unable to fit value " + i10 + " in range " + this.f132316j, e10);
            return iL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object G0(String str, kotlin.coroutines.d<? super t3> dVar) throws Throwable {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f132365c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f132365c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objL = gVar.f132363a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f132365c;
        if (i11 == 0) {
            ResultKt.m(objL);
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            Observable<t3> observableI = this.f132307a.I(str);
            final Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u0.H0((Throwable) obj);
                }
            };
            Observable<t3> observableOnErrorReturn = observableI.onErrorReturn(new Func1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.t0
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return u0.I0(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
            gVar.f132365c = 1;
            objL = c0Var.l(observableOnErrorReturn, gVar);
            if (objL == objL2) {
                return objL2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objL);
        }
        t3 t3Var = (t3) objL;
        return t3Var == null ? new t3(null, null) : t3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t3 H0(Throwable th2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t3 I0(Function1 function1, Object obj) {
        return (t3) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J0(Project project, kotlin.coroutines.d<? super List<ProjectRevision>> dVar) {
        return project == null ? CollectionsKt.emptyList() : kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new h(project, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(ItemMaterial itemMaterial, com.planner5d.library.services.bitmaploader.target.a aVar, Function1<? super Integer, Unit> function1) {
        if (itemMaterial == null) {
            return;
        }
        com.planner5d.library.model.y yVar = itemMaterial.texture;
        if (yVar != null) {
            this.f132309c.v(yVar.f222851c, com.planner5d.library.model.p.a.diffuse, com.planner5d.library.model.p.b.small, aVar);
            return;
        }
        Integer color = itemMaterial.color;
        Intrinsics.checkNotNullExpressionValue(color, "color");
        function1.invoke(color);
    }

    private final void M0(com.planner5d.library.widget.editor.editaction.u.b bVar) {
        R0(new i(bVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(Fragment fragment, com.planner5d.library.model.metricunit.a aVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new j(aVar, fragment, null), 3, null);
    }

    private final void R0(Function2<? super c.d, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        c cVarF = this.Y.f();
        if (cVarF instanceof c.d) {
            kotlinx.coroutines.k.f(g2.a(this), null, null, new l(function2, cVarF, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object V0(Fragment fragment, int i10, kotlin.coroutines.d<? super Unit> dVar) {
        o oVar;
        double d10;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVar;
        com.planner5d.library.model.manager.f2 f2Var;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i11 = oVar.f132400h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f132400h = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object obj = oVar.f132398f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = oVar.f132400h;
        if (i12 == 0) {
            ResultKt.m(obj);
            this.f132320n.r(kotlin.coroutines.jvm.internal.b.f(D0(i10)));
            com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVar2 = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(this.f132323t.f());
            com.planner5d.library.model.manager.f2 f2Var2 = this.f132310d;
            d10 = i10;
            oVar.f132393a = this;
            oVar.f132394b = fragment;
            oVar.f132395c = aVar2;
            oVar.f132396d = f2Var2;
            oVar.f132397e = d10;
            oVar.f132400h = 1;
            Object objK = f2Var2.k(oVar);
            if (objK == objL) {
                return objL;
            }
            aVar = aVar2;
            obj = objK;
            f2Var = f2Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            double d11 = oVar.f132397e;
            f2Var = (com.planner5d.library.model.manager.f2) oVar.f132396d;
            aVar = (com.planner5d.library.widget.editor.projectresources.viewoptions.b.a) oVar.f132395c;
            Fragment fragment2 = (Fragment) oVar.f132394b;
            u0 u0Var = (u0) oVar.f132393a;
            ResultKt.m(obj);
            d10 = d11;
            this = u0Var;
            fragment = fragment2;
        }
        com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVarE = aVar.e(f2Var.x(d10, (com.planner5d.library.model.metricunit.a) obj).floatValue());
        Intrinsics.checkNotNullExpressionValue(aVarE, "setGridSize(...)");
        this.g1(fragment, aVarE, o3.k.grid);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1(Fragment fragment, com.planner5d.library.model.metricunit.a aVar) {
        this.Z.r(e.b.f132353b);
        R0(new q(fragment, aVar, this, null));
    }

    private final void g1(Fragment fragment, com.planner5d.library.widget.editor.projectresources.viewoptions.b.a aVar, o3.k kVar) {
        R0(new v(aVar, this, fragment, kVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntRange h1(com.planner5d.library.model.metricunit.a aVar) {
        com.planner5d.library.model.manager.f2 f2Var = this.f132310d;
        IntRange intRange = H1;
        return new IntRange((int) Math.ceil(f2Var.c(intRange.l(), aVar)), (int) Math.ceil(this.f132310d.c(intRange.m(), aVar)));
    }

    @NotNull
    public final com.planner5d.library.model.p.b A0() {
        com.planner5d.library.model.p.b bVarC = this.f132311e.c();
        Intrinsics.checkNotNullExpressionValue(bVarC, "getTextureSize(...)");
        return bVarC;
    }

    @NotNull
    public final c1<com.planner5d.library.widget.editor.projectresources.viewoptions.b> B0() {
        return this.f132323t;
    }

    public final void C0(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Integer numF = this.f132320n.f();
        if (numF != null) {
            U0(fragment, numF.intValue() + 1);
        }
    }

    public final void E0(@Nullable String str, @NotNull Function0<? extends com.planner5d.library.services.bitmaploader.target.a> provideBitmapTarget, @NotNull Function1<? super Integer, Unit> onLoadedColor) {
        Intrinsics.checkNotNullParameter(provideBitmapTarget, "provideBitmapTarget");
        Intrinsics.checkNotNullParameter(onLoadedColor, "onLoadedColor");
        this.f132319m = provideBitmapTarget;
        this.Y.r(c.C1457c.f132333b);
        int i10 = 7 >> 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new f(str, provideBitmapTarget, onLoadedColor, null), 3, null);
    }

    public final void L0() {
        M0(com.planner5d.library.widget.editor.editaction.u.b.Center);
    }

    public final void N0() {
        M0(com.planner5d.library.widget.editor.editaction.u.b.OutsidersToCenter);
    }

    public final void P0(@NotNull ProjectRevision optimizedRevision) {
        Intrinsics.checkNotNullParameter(optimizedRevision, "optimizedRevision");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new k(optimizedRevision, null), 3, null);
    }

    public final boolean Q0() {
        return this.f132314h.a(com.planner5d.library.model.manager.config.f.ProjectRevisions);
    }

    public final void S0(@NotNull Fragment fragment, @NotNull ItemMaterial itemMaterial, @NotNull Function1<? super Integer, Unit> onLoadedColor) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(itemMaterial, "itemMaterial");
        Intrinsics.checkNotNullParameter(onLoadedColor, "onLoadedColor");
        R0(new m(fragment, itemMaterial, null));
        Function0<? extends com.planner5d.library.services.bitmaploader.target.a> function0 = this.f132319m;
        if (function0 != null) {
            K0(itemMaterial, function0.invoke(), onLoadedColor);
        }
    }

    public final void U0(@NotNull Fragment fragment, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        int i11 = 4 ^ 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new n(fragment, i10, null), 3, null);
    }

    public final void W0(@Nullable String str) {
        id.a aVarA = this.f132308b.a();
        c cVarF = this.Y.f();
        if (str != null && aVarA != null && (cVarF instanceof c.d)) {
            Project projectB = ((c.d) cVarF).a().b();
            if (projectB == null) {
                timber.log.b.f381052a.d("Unable to save project title because project is null", new Object[0]);
                return;
            } else if (Intrinsics.areEqual(str, projectB.title)) {
                timber.log.b.f381052a.k("Title is the same", new Object[0]);
                return;
            } else {
                com.planner5d.library.services.l.f224378d.o(new com.planner5d.library.services.l.c(new com.planner5d.library.widget.editor.editaction.x(projectB.getId(), str, this.f132307a, aVarA), new com.planner5d.library.widget.editor.editaction.x(projectB.getId(), projectB.title, this.f132307a, aVarA)));
                return;
            }
        }
        timber.log.b.f381052a.d("Unable to save project title", new Object[0]);
    }

    public final void X0(@NotNull ArrayDeque<d> arrayDeque) {
        Intrinsics.checkNotNullParameter(arrayDeque, "<set-?>");
        this.f132317k = arrayDeque;
    }

    public final void Y0(boolean z10) {
        this.f132318l = z10;
    }

    public final void Z0(@NotNull Fragment fragment, @NotNull String valueInput) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(valueInput, "valueInput");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new p(valueInput, this, fragment, null), 3, null);
    }

    public final void b1(@NotNull Fragment fragment, @NotNull com.planner5d.library.model.metricunit.a metricUnit) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
        int i10 = 4 ^ 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new r(metricUnit, this, fragment, null), 3, null);
    }

    public final void c1(@NotNull Fragment fragment, @NotNull ac.i shadowType) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(shadowType, "shadowType");
        R0(new s(fragment, this, shadowType, null));
    }

    public final void d1(@NotNull Fragment fragment, @NotNull com.planner5d.library.model.p.b textureSize) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(textureSize, "textureSize");
        R0(new t(fragment, this, textureSize, null));
    }

    public final void e1(@NotNull Fragment fragment, @NotNull com.planner5d.library.widget.editor.a.c option, boolean z10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(option, "option");
        r0 r0Var = r0.f132299a;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarF = this.f132323t.f();
        if (bVarF == null) {
            bVarF = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a().a();
        }
        Intrinsics.checkNotNull(bVarF);
        g1(fragment, r0Var.c(bVarF, option, z10), r0Var.a(option));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object f1(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        u uVar;
        com.planner5d.library.model.manager.f2 f2Var;
        c1<Integer> c1Var;
        double d10;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i10 = uVar.f132437f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f132437f = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(dVar);
            }
        } else {
            uVar = new u(dVar);
        }
        Object obj = uVar.f132435d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = uVar.f132437f;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.f132323t.r(bVar);
            this.f132325w = bVar;
            this.f132318l = bVar.f258084o != null;
            c1<Integer> c1Var2 = this.f132320n;
            com.planner5d.library.model.manager.f2 f2Var2 = this.f132310d;
            double d11 = bVar.f258080k;
            uVar.f132432a = c1Var2;
            uVar.f132433b = f2Var2;
            uVar.f132434c = d11;
            uVar.f132437f = 1;
            Object objK = f2Var2.k(uVar);
            if (objK == objL) {
                return objL;
            }
            f2Var = f2Var2;
            c1Var = c1Var2;
            obj = objK;
            d10 = d11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = uVar.f132434c;
            f2Var = (com.planner5d.library.model.manager.f2) uVar.f132433b;
            c1Var = (c1) uVar.f132432a;
            ResultKt.m(obj);
        }
        c1Var.r(kotlin.coroutines.jvm.internal.b.f(f2Var.d(d10, (com.planner5d.library.model.metricunit.a) obj).intValue()));
        return Unit.f312394a;
    }

    public final void p0(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Integer numF = this.f132320n.f();
        if (numF != null) {
            U0(fragment, numF.intValue() - 1);
        }
    }

    @NotNull
    public final ArrayDeque<d> q0() {
        return this.f132317k;
    }

    public final boolean r0() {
        return this.f132318l;
    }

    @NotNull
    public final c1<Integer> s0() {
        return this.f132320n;
    }

    @NotNull
    public final c1<IntRange> t0() {
        return this.f132321o;
    }

    @NotNull
    public final c1<c> u0() {
        return this.Y;
    }

    @NotNull
    public final c1<e> v0() {
        return this.Z;
    }

    @NotNull
    public final c1<com.planner5d.library.model.metricunit.a> w0() {
        return this.f132322s;
    }

    @NotNull
    public final com.planner5d.library.model.metricunit.a[] x0() {
        return this.f132310d.o();
    }

    @NotNull
    public final v1.a<ProjectRevision> y0() {
        return this.f132324v;
    }

    @NotNull
    public final ac.i z0() {
        ac.i iVarB = this.f132311e.b();
        Intrinsics.checkNotNullExpressionValue(iVarB, "getShadowType(...)");
        return iVarB;
    }
}
