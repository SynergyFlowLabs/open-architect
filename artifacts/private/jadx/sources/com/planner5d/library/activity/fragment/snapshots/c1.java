package com.planner5d.library.activity.fragment.snapshots;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.FolderSelection;
import com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessage;
import com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGallery;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.d4;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.model.snapshot.SnapshotLocal;
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
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotsViewModel.kt\ncom/planner5d/library/activity/fragment/snapshots/SnapshotsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n774#2:381\n865#2,2:382\n1557#2:384\n1628#2,3:385\n1863#2,2:388\n808#2,11:391\n1557#2:402\n1628#2,3:403\n808#2,11:406\n1557#2:417\n1628#2,3:418\n808#2,11:421\n1557#2:432\n1628#2,3:433\n295#2,2:436\n295#2,2:438\n295#2,2:440\n360#2,7:442\n1#3:390\n*S KotlinDebug\n*F\n+ 1 SnapshotsViewModel.kt\ncom/planner5d/library/activity/fragment/snapshots/SnapshotsViewModel\n*L\n101#1:381\n101#1:382,2\n106#1:384\n106#1:385,3\n198#1:388,2\n214#1:391,11\n214#1:402\n214#1:403,3\n217#1:406,11\n217#1:417\n217#1:418,3\n219#1:421,11\n219#1:432\n219#1:433,3\n348#1:436,2\n352#1:438,2\n353#1:440,2\n360#1:442,7\n*E\n"})
public final class c1 extends f2 implements com.planner5d.library.activity.fragment.list.g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f135932t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f135933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b4 f135934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d4 f135935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f135936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c0 f135937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f135938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f135939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.projects.c0 f135940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f135941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.projects.l f135942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.model.manager.statistics.events.b4.c f135943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<Folder> f135944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private volatile String f135945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<a> f135946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private gd.b f135947o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f135948s;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f135949c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f135950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f135951b;

        public a(int i10, boolean z10) {
            this.f135950a = i10;
            this.f135951b = z10;
        }

        public final int a() {
            return this.f135950a;
        }

        public final boolean b() {
            return this.f135951b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel", f = "SnapshotsViewModel.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "loadItems", n = {"allItems"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135953b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135955d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135953b = obj;
            this.f135955d |= Integer.MIN_VALUE;
            return c1.this.h(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel$markTooltipAsShown$1", f = "SnapshotsViewModel.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135956a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135956a;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1.this.f135948s = true;
                c1.this.i0();
                d4 d4Var = c1.this.f135935c;
                this.f135956a = 1;
                if (d4Var.i(1, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel", f = "SnapshotsViewModel.kt", i = {}, l = {377}, m = "needsAiImprovementTooltip", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f135958a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f135960c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135958a = obj;
            this.f135960c |= Integer.MIN_VALUE;
            return c1.this.o0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel$onClickFolder$1", f = "SnapshotsViewModel.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f135963c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f135965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Folder f135966f;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel$onClickFolder$1$2", f = "SnapshotsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.activity.helper.event.content.c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135967a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f135968b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Folder f135969c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f135970d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1 c1Var, Folder folder, Bundle bundle, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f135968b = c1Var;
                this.f135969c = folder;
                this.f135970d = bundle;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f135968b, this.f135969c, this.f135970d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f135967a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Folder folderY = this.f135968b.f135937e.y(this.f135968b.f135936d.a(), this.f135969c.parentId);
                com.planner5d.library.activity.helper.event.content.c cVarJ = com.planner5d.library.activity.fragment.list.u0.f134434a.g(new com.planner5d.library.services.utility.i(this.f135970d).h(com.planner5d.library.services.r.folder, folderY != null ? folderY.b() : null).a()).p(folderY != null ? folderY.title : null).j(this.f135968b.f135933a.f());
                int i10 = 6 & 0;
                if (this.f135970d.getBoolean(com.planner5d.library.services.r.folderSelectionMode.f224891a, false)) {
                    cVarJ.m(com.planner5d.library.f.s.B2);
                }
                return cVarJ;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.activity.helper.event.content.c> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bundle bundle, Folder folder, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f135965e = bundle;
            this.f135966f = folder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new e(this.f135965e, this.f135966f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.activity.fragment.x xVar;
            com.planner5d.library.activity.helper.event.content.c cVarP;
            com.planner5d.library.activity.fragment.x xVar2;
            com.planner5d.library.activity.helper.event.content.c cVar;
            com.planner5d.library.activity.helper.event.content.c cVarB;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135963c;
            if (i10 == 0) {
                ResultKt.m(obj);
                xVar = c1.this.f135939g;
                com.planner5d.library.activity.fragment.list.u0 u0Var = com.planner5d.library.activity.fragment.list.u0.f134434a;
                cVarP = u0Var.g(new com.planner5d.library.services.utility.i(this.f135965e).b(com.planner5d.library.services.r.scrollPosition).h(com.planner5d.library.services.r.folder, this.f135966f.b()).a()).p(this.f135966f.title);
                Bundle bundle = this.f135965e;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.folderSelectionMode;
                if (bundle.getBoolean(rVar.f224891a, false)) {
                    cVarP.m(com.planner5d.library.f.s.B2);
                }
                if (this.f135965e.getBoolean(rVar.f224891a, false) && this.f135966f.parentId == 0) {
                    cVarB = u0Var.g(this.f135965e).n(com.planner5d.library.f.s.B2).j(c1.this.f135933a.f());
                } else if (this.f135966f.parentId == 0) {
                    cVarB = u0Var.b(this.f135965e, true);
                } else {
                    z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
                    a aVar = new a(c1.this, this.f135966f, this.f135965e, null);
                    this.f135961a = xVar;
                    this.f135962b = cVarP;
                    this.f135963c = 1;
                    Object objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                    if (objH == objL) {
                        return objL;
                    }
                    obj = objH;
                    xVar2 = xVar;
                    cVar = cVarP;
                }
                com.planner5d.library.activity.fragment.x.g(xVar, cVarP.k(cVarB), false, 2, null);
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (com.planner5d.library.activity.helper.event.content.c) this.f135962b;
            xVar2 = (com.planner5d.library.activity.fragment.x) this.f135961a;
            ResultKt.m(obj);
            com.planner5d.library.activity.helper.event.content.c cVar2 = (com.planner5d.library.activity.helper.event.content.c) obj;
            xVar = xVar2;
            cVarB = cVar2;
            cVarP = cVar;
            com.planner5d.library.activity.fragment.x.g(xVar, cVarP.k(cVarB), false, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel", f = "SnapshotsViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {350, 351, 363}, m = "prepareSnapshotSelection", n = {"this", "allItems", io.sentry.protocol.a0.b.f306128c, "this", "snapshots", "allItems"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f135974d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f135976f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135974d = obj;
            this.f135976f |= Integer.MIN_VALUE;
            return c1.this.s0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.snapshots.SnapshotsViewModel$prepareSnapshotSelection$5", f = "SnapshotsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f135978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f135979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f135980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ gd.b f135981e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, c1 c1Var, int i10, gd.b bVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f135978b = z10;
            this.f135979c = c1Var;
            this.f135980d = i10;
            this.f135981e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f135978b, this.f135979c, this.f135980d, this.f135981e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVarF;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135977a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!this.f135978b) {
                this.f135979c.f135946n.r(new a(this.f135980d, false));
            } else if (!this.f135979c.f135948s) {
                gd.b bVar = this.f135981e;
                String strA = bVar != null ? bVar.a() : null;
                gd.b bVar2 = this.f135979c.f135947o;
                if (!Intrinsics.areEqual(strA, bVar2 != null ? bVar2.a() : null) || (aVarF = this.f135979c.k0().f()) == null || aVarF.a() != this.f135980d) {
                    this.f135979c.f135947o = this.f135981e;
                    this.f135979c.f135946n.r(new a(this.f135980d, true));
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c1(@NotNull y1 menuManager, @NotNull b4 snapshotManager, @NotNull d4 snapshotManagerKotlin, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.model.manager.c0 folderManager, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.activity.fragment.projects.c0 sourceManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(snapshotManagerKotlin, "snapshotManagerKotlin");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(folderManager, "folderManager");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sourceManager, "sourceManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f135933a = menuManager;
        this.f135934b = snapshotManager;
        this.f135935c = snapshotManagerKotlin;
        this.f135936d = userAuthorization;
        this.f135937e = folderManager;
        this.f135938f = dialogLauncher;
        this.f135939g = navigator;
        this.f135940h = sourceManager;
        this.f135941i = coroutineDispatchers;
        this.f135942j = new com.planner5d.library.activity.fragment.projects.l();
        this.f135944l = new ArrayList();
        this.f135946n = new androidx.lifecycle.c1<>();
    }

    private static Object l0(c1 c1Var) {
        return j1.t(new kotlin.jvm.internal.c1(c1Var, c1.class, "selectedSnapshotInternal", "getSelectedSnapshotInternal()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object o0(kotlin.coroutines.d<? super Boolean> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f135960c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f135960c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objH = dVar2.f135958a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f135960c;
        if (i11 == 0) {
            ResultKt.m(objH);
            if (this.f135935c.g()) {
                d4 d4Var = this.f135935c;
                dVar2.f135960c = 1;
                objH = d4Var.h(1, dVar2);
                if (objH == objL) {
                    return objL;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objH);
        boolean z10 = ((Boolean) objH).booleanValue() ? false : true;
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(c1 c1Var, Activity activity, gd.b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            if (!c1Var.f135934b.p0()) {
                c1Var.f135934b.M(activity, c1Var.f135936d.a(), bVar).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
            }
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.archive, p3.b.success, bVar.d(), c1Var.f135943k, bVar);
        }
    }

    private final void r0(gd.b bVar, Bundle bundle) {
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.id;
        Long id2 = bVar.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        com.planner5d.library.services.utility.i iVarJ = iVar.g(rVar, id2.longValue()).j(com.planner5d.library.services.r.className, bVar.getClass().getName());
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.folder;
        com.planner5d.library.services.utility.i iVarH = iVarJ.h(rVar2, new com.planner5d.library.services.utility.j(bundle).h(rVar2, null));
        u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.open, null, bVar.d(), this.f135943k, bVar);
        com.planner5d.library.activity.fragment.x.g(this.f135939g, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) SnapshotPager.class, iVarH.t(com.planner5d.library.services.r.source, this.f135943k).a()).k(j0(bundle)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x015c A[EDGE_INSN: B:101:0x015c->B:79:0x015c BREAK  A[LOOP:2: B:72:0x0144->B:77:0x0158], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1 A[PHI: r0 r1 r2
      0x00d1: PHI (r0v2 com.planner5d.library.activity.fragment.snapshots.c1) = 
      (r0v0 com.planner5d.library.activity.fragment.snapshots.c1)
      (r0v3 com.planner5d.library.activity.fragment.snapshots.c1)
     binds: [B:40:0x00c9, B:38:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r1v9 java.util.List<com.planner5d.library.activity.fragment.list.h0>) = 
      (r1v6 java.util.List<com.planner5d.library.activity.fragment.list.h0>)
      (r1v10 java.util.List<com.planner5d.library.activity.fragment.list.h0>)
     binds: [B:40:0x00c9, B:38:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r2v5 gd.b) = (r2v2 gd.b), (r2v6 gd.b) binds: [B:40:0x00c9, B:38:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158 A[LOOP:2: B:72:0x0144->B:77:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0167  */
    /* JADX WARN: Code duplicated, block: B:84:0x016b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r3 == r5) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018c, code lost:
    
        if (kotlinx.coroutines.i.h(r0, r12, r4) == r5) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(java.util.List<? extends gd.b> r20, java.util.List<com.planner5d.library.activity.fragment.list.h0> r21, kotlin.coroutines.d<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.snapshots.c1.s0(java.util.List, java.util.List, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void E(@NotNull com.planner5d.library.services.utility.i builder, @Nullable Bundle bundle) {
        long[] longArray;
        long[] longArray2;
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.selectedSnapshotIds;
        if (bundle == null || (longArray = bundle.getLongArray(rVar.f224891a)) == null) {
            longArray = new long[0];
        }
        com.planner5d.library.services.utility.i iVarQ = builder.q(rVar, longArray);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.selectedSnapshotLocalIds;
        if (bundle == null || (longArray2 = bundle.getLongArray(rVar2.f224891a)) == null) {
            longArray2 = new long[0];
        }
        iVarQ.q(rVar2, longArray2);
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
        long[] longArray;
        long[] longArray2;
        Intrinsics.checkNotNullParameter(onMoved, "onMoved");
        List<Long> mutableList = (bundle == null || (longArray2 = bundle.getLongArray(com.planner5d.library.services.r.selectedSnapshotIds.f224891a)) == null) ? null : ArraysKt.toMutableList(longArray2);
        List<Long> mutableList2 = (bundle == null || (longArray = bundle.getLongArray(com.planner5d.library.services.r.selectedSnapshotLocalIds.f224891a)) == null) ? null : ArraysKt.toMutableList(longArray);
        List<com.planner5d.library.database.model.j> listB = eVar != null ? eVar.b() : null;
        Folder folder = (Folder) jVar;
        long jLongValue = (folder == null || (id2 = folder.getId()) == null) ? 0L : id2.longValue();
        if ((mutableList != null && (!mutableList.isEmpty())) || (mutableList2 != null && (!mutableList2.isEmpty()))) {
            this.f135934b.H0(this.f135936d.a(), mutableList, mutableList2, jLongValue);
        }
        if (listB != null) {
            if ((listB.isEmpty() ? null : listB) != null) {
                this.f135937e.L(listB, jLongValue);
            }
        }
        onMoved.invoke();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void J(@NotNull Bundle state, @NotNull com.planner5d.library.database.model.j folder) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(folder, "folder");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(state, (Folder) folder, null), 3, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void L() {
        this.f135934b.R0(this.f135936d.a()).toBlocking().firstOrDefault(null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public int N() {
        return Folder.f180530c;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    @NotNull
    public int[] Q() {
        return new int[0];
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    @Override // com.planner5d.library.activity.fragment.list.g0
    public void T(@NotNull Bundle state, @Nullable List<? extends Object> list) {
        ArrayList<Parcelable> arrayList;
        long[] longArray;
        long[] longArray2;
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
                if (obj2 instanceof Snapshot) {
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
                    Long id2 = ((Snapshot) it2.next()).getId();
                    arrayList5.add(Long.valueOf(id2 != null ? id2.longValue() : 0L));
                }
                longArray = CollectionsKt.toLongArray(arrayList5);
            } else {
                longArray = null;
            }
        } else {
            longArray = null;
        }
        if (list != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof SnapshotLocal) {
                    arrayList6.add(obj3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList6 = null;
            }
            if (arrayList6 != null) {
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    Long id3 = ((SnapshotLocal) it3.next()).getId();
                    arrayList7.add(Long.valueOf(id3 != null ? id3.longValue() : 0L));
                }
                longArray2 = CollectionsKt.toLongArray(arrayList7);
            } else {
                longArray2 = null;
            }
        } else {
            longArray2 = null;
        }
        com.planner5d.library.activity.fragment.x xVar = this.f135939g;
        com.planner5d.library.activity.fragment.list.u0 u0Var = com.planner5d.library.activity.fragment.list.u0.f134434a;
        com.planner5d.library.services.utility.i iVarM = new com.planner5d.library.services.utility.i(state).b(com.planner5d.library.services.r.scrollPosition).m(com.planner5d.library.services.r.folderSelectionMode, true);
        if (arrayList != null) {
            iVarM.k(com.planner5d.library.services.r.selectedFolders, arrayList);
        }
        if (longArray != null) {
            iVarM.q(com.planner5d.library.services.r.selectedSnapshotIds, longArray);
        }
        if (longArray2 != null) {
            iVarM.q(com.planner5d.library.services.r.selectedSnapshotLocalIds, longArray2);
        }
        Unit unit = Unit.f312394a;
        com.planner5d.library.activity.fragment.x.g(xVar, u0Var.g(iVarM.a()).n(com.planner5d.library.f.s.B2).k(u0Var.c(true)), false, 2, null);
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public void a(@NotNull Bundle state, @NotNull Object item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        r0((gd.b) item, state);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.activity.fragment.list.g0
    @Nullable
    public Object h(@NotNull l1.j jVar, @NotNull l1.d<com.planner5d.library.database.model.j> dVar, @NotNull kotlin.coroutines.d<? super List<com.planner5d.library.activity.fragment.list.h0>> dVar2) {
        b bVar;
        List<gd.b> listW;
        Long lG;
        List<T> listA;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i10 = bVar.f135955d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f135955d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object obj = bVar.f135953b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f135955d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) bVar.f135952a;
            ResultKt.m(obj);
            return list;
        }
        ResultKt.m(obj);
        id.a aVarA = this.f135936d.a();
        if (dVar.c()) {
            listW = CollectionsKt.emptyList();
        } else {
            b4 b4Var = this.f135934b;
            com.planner5d.library.database.model.j jVarB = dVar.b();
            listW = b4Var.W(aVarA, jVarB instanceof Folder ? (Folder) jVarB : null);
            Intrinsics.checkNotNull(listW);
        }
        com.planner5d.library.model.manager.c0 c0Var = this.f135937e;
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
        this.f135944l.clear();
        this.f135944l.addAll(arrayList);
        com.planner5d.library.activity.fragment.projects.l lVar = this.f135942j;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.planner5d.library.model.g((Folder) it.next(), 0, null, 4, null));
        }
        List<com.planner5d.library.activity.fragment.list.h0> listC = lVar.c(jVar, listW, arrayList2);
        bVar.f135952a = listC;
        bVar.f135955d = 1;
        return s0(listW, listC, bVar) == objL ? objL : listC;
    }

    public final void i0() {
        this.f135946n.r(null);
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c j0(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean zA = new com.planner5d.library.services.utility.j(state).a(com.planner5d.library.services.r.folder);
        Class cls = zA ? Snapshots.class : ProjectsPagesFragment.class;
        if (!zA) {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.tab;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.snapshotsList;
            state = iVar.t(rVar, rVar2).h(rVar2, state).a();
        }
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) cls, state).o(this.f135933a.c()).j(this.f135933a.f());
    }

    @NotNull
    public final androidx.lifecycle.w0<a> k0() {
        return this.f135946n;
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean l(@NotNull List<? extends Object> selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        return !CollectionsKt.subtract(this.f135944l, selected).isEmpty();
    }

    @Override // com.planner5d.library.activity.fragment.list.g0
    public boolean m(@NotNull final Activity activity, @NotNull Object item, @NotNull MenuItem itemMenu) {
        com.planner5d.library.model.manager.statistics.events.b4.e eVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemMenu, "itemMenu");
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        final gd.b bVar = (gd.b) item;
        int itemId = itemMenu.getItemId();
        if (itemId == com.planner5d.library.f.j.f168317q1) {
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.share, null, bVar.d(), this.f135943k, bVar);
            com.planner5d.library.services.f0 f0Var = new com.planner5d.library.services.f0(activity, bVar);
            vd.b bVarJ = bVar.j();
            if (bVarJ == null || (eVar = bVarJ.f385735f) == null) {
                eVar = com.planner5d.library.model.manager.statistics.events.b4.e.snapshot;
            }
            f0Var.b(activity, eVar);
            return false;
        }
        if (itemId == com.planner5d.library.f.j.f168269o1) {
            iVar.f(com.planner5d.library.services.r.type, SendToGallery.a.Snapshot.l());
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.id;
            Long id2 = bVar.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            iVar.g(rVar, id2.longValue());
            iVar.f(com.planner5d.library.services.r.folderType, N());
            this.f135938f.c(SendToGallery.class).i(iVar).g();
            return true;
        }
        if (itemId == com.planner5d.library.f.j.f168197l1) {
            if (this.f135934b.p0()) {
                return false;
            }
            com.planner5d.library.model.manager.statistics.events.b4.a aVar = com.planner5d.library.model.manager.statistics.events.b4.a.remove_from_folder;
            u2.D1(aVar, null, bVar.d(), this.f135943k, bVar);
            bVar.f(0L);
            this.f135934b.G0(this.f135936d.a(), bVar, null).subscribe((Subscriber<? super gd.b>) new com.planner5d.library.services.rx.e());
            u2.D1(aVar, p3.b.success, bVar.d(), this.f135943k, bVar);
            return true;
        }
        if (itemId != com.planner5d.library.f.j.f168029e1) {
            if (itemId != com.planner5d.library.f.j.f168173k1) {
                return false;
            }
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.archive, null, bVar.d(), this.f135943k, bVar);
            ConfirmDeleteMessage.show(this.f135938f, activity.getString(com.planner5d.library.f.s.LC), new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.fragment.snapshots.b1
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    c1.p0(this.f135925a, activity, bVar, (Boolean) obj);
                }
            });
            return true;
        }
        u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.to_folder, null, bVar.d(), this.f135943k, bVar);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.id;
        Long id3 = bVar.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
        iVar.g(rVar2, id3.longValue());
        iVar.j(com.planner5d.library.services.r.className, bVar.getClass().getName());
        iVar.f(com.planner5d.library.services.r.folderType, N());
        if (bVar.d() != null) {
            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.projectId;
            Long lD = bVar.d();
            Intrinsics.checkNotNullExpressionValue(lD, "getProjectId(...)");
            iVar.g(rVar3, lD.longValue());
        }
        iVar.t(com.planner5d.library.services.r.source, this.f135943k);
        this.f135938f.c(FolderSelection.class).i(iVar).g();
        return true;
    }

    @Nullable
    public final String m0() {
        return this.f135945m;
    }

    public final void n0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(null), 3, null);
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
                } else if (obj instanceof gd.b) {
                    arrayList2.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f135937e.u(this.f135936d.a(), arrayList);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.f135934b.N(activity, this.f135936d.a(), arrayList2);
        }
        onRemoved.invoke();
    }

    public final void q0(@NotNull l1.d<Folder> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f135943k = this.f135940h.a().b();
        u2 u2Var = u2.f217517b;
        Folder folder = (Folder) filter.b();
        u2Var.k0(folder != null ? folder.title : null, this.f135943k);
    }

    public final void t0(@Nullable String str) {
        this.f135945m = str;
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
    }
}
