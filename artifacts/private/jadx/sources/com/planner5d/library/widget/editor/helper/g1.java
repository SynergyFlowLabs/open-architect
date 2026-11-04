package com.planner5d.library.widget.editor.helper;

import android.app.Activity;
import android.content.ClipData;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.message.PurchaseRequiredMessage;
import com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog;
import com.planner5d.library.activity.fragment.dialog.titleedit.FloorEdit;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.contest.view.ContestNavigationFragment;
import com.planner5d.library.contest.view.dialog.ContestRulesAgreement;
import com.planner5d.library.contest.view.dialog.ContestSubmittedDialog;
import com.planner5d.library.contest.view.dialog.ContestSubmittedShareDialog;
import com.planner5d.library.contest.view.voting.ContestVotingFragment;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemRuler;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.builder.ItemCloner;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.widget.VirtualJoystickView;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.editor.history.EditorHistoryButtons;
import com.planner5d.library.widget.editor.itemactionsbar.ItemActionsBar;
import com.planner5d.library.widget.editor.menu.EditorFloorsView;
import com.planner5d.library.widget.editor.propertiesbar.PropertiesBarView;
import com.planner5d.library.widget.editor.toolbar.EditorSubmenu;
import com.planner5d.library.widget.editor.toolbar.EditorToolbar;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes8.dex */
public class g1 implements View.OnGenericMotionListener, androidx.lifecycle.o0, j2.a, com.planner5d.library.widget.editor.helper.selector.a, com.planner5d.library.widget.editor.facade.f, com.planner5d.library.widget.editor.facade.e, com.planner5d.library.widget.editor.facade.e0, com.planner5d.library.widget.editor.facade.w, we.c, com.planner5d.library.widget.editor.facade.c, com.planner5d.library.widget.editor.facade.b, k2.b {

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    static final int f256308d4 = 12;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static boolean f256309e4 = false;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static int f256310f4 = -1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static boolean f256311g4;
    private final com.planner5d.library.widget.preloader.t A3;
    public final s2 B3;
    private final androidx.lifecycle.q0 C3;
    private final Handler D3;
    private Bundle E3;
    private boolean F3;
    private boolean G3;
    private boolean H3;
    private final com.planner5d.library.widget.rate.g I3;
    private final com.planner5d.library.model.manager.unlockeditems.b J3;
    private Integer K3;
    private e2 L3;
    private final f2 M3;
    private final com.planner5d.library.widget.editor.controls.a N3;
    private com.planner5d.library.widget.editor.facade.i0 O3;
    private final com.planner5d.library.widget.editor.facade.h P3;
    private final com.planner5d.library.widget.editor.facade.s Q3;
    private final w1 R3;
    private final m1 S3;
    private final com.planner5d.library.model.manager.t1 T3;
    private final com.planner5d.library.activity.fragment.smartwizard.a U3;
    private final k2 V3;
    private final com.planner5d.library.model.manager.config.j W3;
    private final com.planner5d.library.model.manager.statistics.events.l3 X;
    private final ta.a X3;
    private final xa.a Y3;
    private final n2 Z;
    private final n1 Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.d0 f256312a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private final com.planner5d.library.widget.event.directional.g f256313a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.m0 f256314b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private final we.c f256315b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.y1 f256316c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public com.planner5d.library.widget.editor.helper.g f256317c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.synchronization.i f256318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ItemBuilder f256319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f256320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t0 f256321g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private Subscription f256322g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.dialog.k f256323h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private PropertiesBarView f256324h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.popup.e f256325i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private ItemActionsBar f256326i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.model.manager.b2 f256327j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private View f256328j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n3 f256329k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private EditorToolbar f256330k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.model.manager.contest.g f256331l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private View f256332l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.x f256333m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private TextView f256334m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.application.d f256335n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private EditorHistoryButtons f256336n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w f256337o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private EditorFloorsView f256338o3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final kotlinx.coroutines.s0 f256341p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private View f256342p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.facade.c0 f256343q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final ItemLayout f256344r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r1 f256345s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private WeakReference<FragmentController> f256346s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u2 f256347t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private Bundle f256348t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public final h2 f256349u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.planner5d.library.services.utility.p0 f256350v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public final com.planner5d.library.activity.helper.l0 f256351v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.planner5d.library.model.manager.performancetracing.e f256352w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final j2 f256353w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.menu.j f256354x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private boolean f256355y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private com.planner5d.library.services.utility.j f256356z3;
    public final androidx.lifecycle.c1<Boolean> Y = new androidx.lifecycle.c1<>(Boolean.FALSE);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.helper.a f256339p0 = new com.planner5d.library.widget.editor.helper.a();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    com.planner5d.library.widget.editor.helper.e f256340p1 = null;
    private final Object H1 = new Object();

    class a implements com.planner5d.library.widget.event.directional.i {
        a() {
        }

        @Override // com.planner5d.library.widget.event.directional.i
        public void g(double d10) {
            com.planner5d.library.widget.editor.a aVarB = g1.this.P3.b();
            if (aVarB != null) {
                aVarB.g(d10);
            }
        }

        @Override // com.planner5d.library.widget.event.directional.i
        public void q(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
            com.planner5d.library.widget.editor.a aVarB = g1.this.P3.b();
            if (aVarB != null) {
                aVarB.q(kVar, kVar2);
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.f0 f256358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ItemProject f256359e;

        class a extends com.planner5d.library.services.rx.e<Boolean> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f256361d;

            a(boolean z10) {
                this.f256361d = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Unit e() {
                com.planner5d.library.widget.editor.helper.e eVar = g1.this.f256340p1;
                if (eVar != null) {
                    eVar.G();
                    g1.this.f256340p1.E();
                }
                return Unit.f312394a;
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public void onNext(Boolean bool) {
                if (bool.booleanValue() && this.f256361d) {
                    g1.this.J3.h(g1.this.f256323h, com.planner5d.library.model.manager.statistics.events.t3.c.editor, new Function0() { // from class: com.planner5d.library.widget.editor.helper.i1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f256431a.e();
                        }
                    });
                }
            }
        }

        b(com.planner5d.library.model.manager.statistics.f0 f0Var, ItemProject itemProject) {
            this.f256358d = f0Var;
            this.f256359e = itemProject;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            g1.this.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (!g1.this.P3.a()) {
                g1.this.f256349u3.b();
                g1.this.Y.r(Boolean.FALSE);
                boolean z10 = false;
                g1.this.f256349u3.m(false);
                this.f256358d.c();
                if (g1.f256311g4) {
                    g1.f256311g4 = false;
                    g1.this.f256347t.g();
                }
                g1.this.M3.i(g1.this.L1());
                g1.this.n();
                if (g1.this.f256338o3 != null) {
                    g1.this.f256338o3.d(this.f256359e, g1.this.z1(), g1.this.j1());
                }
                if (g1.this.N2().f258084o == com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.preview) {
                    g1.this.d3(true);
                }
                id.a aVarA = g1.this.f256320f.a();
                if (!g1.f256309e4) {
                    if (!g1.this.f256335n.a() && !g1.this.f256321g.n(aVarA)) {
                        g1.this.f256329k.P(g1.this.a(), g1.this.P3.getModel(), this.f256359e, false);
                        PurchaseRequiredMessage.show(g1.this.f256323h, null, false, false);
                    }
                    g1.f256309e4 = true;
                }
                if (g1.this.f256356z3.f(com.planner5d.library.services.r.openCatalog, false)) {
                    g1.this.f256340p1.E();
                }
                g1.this.J3.l(aVarA, g1.this.f256321g);
                if (!g1.this.z1() && !g1.this.N1()) {
                    z10 = true;
                }
                com.planner5d.library.widget.editor.helper.e eVar = g1.this.f256340p1;
                if (eVar != null) {
                    eVar.M(z10);
                }
                com.planner5d.library.modules.user.user.t0 t0Var = g1.this.f256321g;
                final com.planner5d.library.model.manager.unlockeditems.b bVar = g1.this.J3;
                Objects.requireNonNull(bVar);
                com.planner5d.library.services.utility.c0.u(aVarA, t0Var, new com.planner5d.library.services.utility.p3() { // from class: com.planner5d.library.widget.editor.helper.h1
                    @Override // com.planner5d.library.services.utility.p3
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        return bVar.e((id.a) obj, (com.planner5d.library.modules.user.user.t0) obj2, (kotlin.coroutines.d) obj3);
                    }
                }).subscribe((Subscriber) new a(z10));
            }
        }
    }

    class c implements EditorFloorsView.a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Pair pair) {
            com.planner5d.library.services.l.f224377c.o(new com.planner5d.library.services.l.d((ItemFloor) pair.first, null, com.planner5d.library.services.l.d.a.Add));
            g1.this.B3.i(com.planner5d.library.model.manager.statistics.events.o3.e.create);
        }

        @Override // com.planner5d.library.widget.editor.menu.EditorFloorsView.a
        public void a() {
            if (g1.this.a() != null) {
                g1.this.B3.h();
                com.planner5d.library.widget.editor.popup.e eVar = g1.this.f256325i;
                androidx.fragment.app.s sVarA = g1.this.a();
                g1 g1Var = g1.this;
                eVar.f(sVarA, g1Var, g1Var.f256342p3, g1.this.w1(), g1.this.z1(), g1.this.B3);
            }
        }

        @Override // com.planner5d.library.widget.editor.menu.EditorFloorsView.a
        public void b() {
            if (g1.this.w1() == null) {
                return;
            }
            g1.this.f256323h.c(FloorEdit.class).k(g1.this.w1()).o(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.j1
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    this.f256444a.d((Pair) obj);
                }
            }).g();
        }
    }

    class d extends com.planner5d.library.services.rx.e<Void> {
        d() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            g1.this.f256333m.j();
        }
    }

    class e extends com.planner5d.library.services.rx.e<String> {
        e() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            g1.this.f256327j.c(th2);
            g1.this.f256349u3.i(false);
            g1.this.B3.A(Boolean.FALSE);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            g1.this.f256349u3.i(false);
            g1.this.B3.A(Boolean.TRUE);
        }
    }

    class f extends com.planner5d.library.services.rx.e<t3> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f256366d;

        f(boolean z10) {
            this.f256366d = z10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            g1.this.P3.w().b("project_changed_load", null, th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(t3 t3Var) {
            if (t3Var.b() != null) {
                String str = t3Var.b().title;
                com.planner5d.library.activity.helper.ui.d.h((Fragment) g1.this.f256346s3.get(), str != null ? new com.planner5d.library.services.utility.k3(str) : null);
                if (g1.this.P3.getModel().uid == null) {
                    g1.this.P3.getModel().uid = t3Var.b().uid;
                }
            }
            if (this.f256366d) {
                g1.this.n();
            }
        }
    }

    class g extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f256368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vd.a f256369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f256370f;

        g(Activity activity, vd.a aVar, int i10) {
            this.f256368d = activity;
            this.f256369e = aVar;
            this.f256370f = i10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            g1.this.A3.a().b();
            g1.this.f256327j.c(th2);
            g1.this.M1(this.f256369e, this.f256370f);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            g1.this.E2(this.f256368d);
        }
    }

    class h extends com.planner5d.library.services.utility.w.c<Void> {
        h() {
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void d() {
            g1.this.f256318d.f(g1.this.f256331l);
            return null;
        }
    }

    class i extends com.planner5d.library.services.rx.e<Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Item f256373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.events.t3.d f256374e;

        i(Item item, com.planner5d.library.model.manager.statistics.events.t3.d dVar) {
            this.f256373d = item;
            this.f256374e = dVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(@fj.h Throwable th2) {
            g1.this.f256327j.b(com.planner5d.library.f.s.f169148h5, new Object[0]);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Unit unit) {
            g1.this.L2(this.f256373d, this.f256374e);
        }
    }

    public interface j {
        Observable<Void> loadedProject(Project project, ItemProject itemProject, @fj.h Bundle bundle);
    }

    @ij.a
    public g1(com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.project.m0 m0Var, com.planner5d.library.model.manager.y1 y1Var, com.planner5d.library.model.manager.synchronization.i iVar, ItemBuilder itemBuilder, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.activity.fragment.dialog.k kVar, @fj.h com.planner5d.library.model.manager.builtin.i iVar2, com.planner5d.library.widget.editor.popup.e eVar, com.planner5d.library.application.d dVar, com.planner5d.library.model.manager.b2 b2Var, n3 n3Var, com.planner5d.library.widget.editor.menu.j jVar, com.planner5d.library.activity.helper.l0 l0Var, com.planner5d.library.model.manager.contest.g gVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.widget.rate.g gVar2, com.planner5d.library.model.manager.unlockeditems.b bVar, com.planner5d.library.widget.editor.controls.a aVar, com.planner5d.library.widget.editor.facade.c0 c0Var, w1 w1Var, com.planner5d.library.model.manager.t1 t1Var, com.planner5d.library.activity.fragment.smartwizard.a aVar2, sd.e eVar2, com.planner5d.library.widget.editor.facade.s sVar, r1 r1Var, k2.a aVar3, com.planner5d.library.services.utility.p0 p0Var, com.planner5d.library.model.manager.performancetracing.e eVar3, com.planner5d.library.model.manager.statistics.events.l3 l3Var, com.planner5d.library.services.utility.w wVar, u2 u2Var, n2.a aVar4, com.planner5d.library.model.manager.config.j jVar2, com.planner5d.library.model.converter.json.from.x xVar2, com.planner5d.library.model.converter.json.from.z zVar) {
        j2 j2Var;
        com.planner5d.library.widget.editor.facade.h hVar;
        kotlinx.coroutines.s0 s0Var;
        n2 n2VarA;
        kotlinx.coroutines.s0 s0VarA = kotlinx.coroutines.t0.a(kotlinx.coroutines.s2.a(null));
        this.f256341p2 = s0VarA;
        this.f256324h3 = null;
        this.f256326i3 = null;
        this.f256328j3 = null;
        this.f256330k3 = null;
        this.f256332l3 = null;
        this.f256336n3 = null;
        this.f256338o3 = null;
        this.f256342p3 = null;
        ItemLayout itemLayout = new ItemLayout();
        this.f256344r3 = itemLayout;
        this.f256346s3 = new WeakReference<>(null);
        this.f256348t3 = null;
        this.f256355y3 = false;
        this.f256356z3 = new com.planner5d.library.services.utility.j(null);
        this.A3 = new com.planner5d.library.widget.preloader.t();
        this.C3 = new com.planner5d.library.activity.helper.ui.c(this);
        this.D3 = new Handler(Looper.getMainLooper());
        this.E3 = null;
        this.F3 = false;
        this.G3 = false;
        this.H3 = false;
        this.K3 = null;
        this.L3 = null;
        this.f256313a4 = new com.planner5d.library.widget.event.directional.g(new a());
        this.f256312a = d0Var;
        this.f256314b = m0Var;
        this.f256316c = y1Var;
        this.f256318d = iVar;
        this.f256319e = itemBuilder;
        this.f256320f = tVar;
        this.f256321g = t0Var;
        this.f256323h = kVar;
        this.f256325i = eVar;
        this.f256335n = dVar;
        this.f256327j = b2Var;
        this.f256329k = n3Var;
        this.f256331l = gVar;
        this.f256333m = xVar;
        this.R3 = w1Var;
        this.T3 = t1Var;
        this.Q3 = sVar;
        this.f256345s = r1Var;
        this.f256347t = u2Var;
        this.f256337o = wVar;
        this.f256350v = p0Var;
        this.f256352w = eVar3;
        this.X = l3Var;
        S2(androidx.lifecycle.c0.b.CREATED);
        n1 n1Var = new n1();
        this.Z3 = n1Var;
        com.planner5d.library.widget.editor.facade.h hVarC = sVar.c(this, this, n1Var);
        this.P3 = hVarC;
        h2 h2Var = new h2(this, hVarC.G(), hVarC.F(), hVarC.w());
        this.f256349u3 = h2Var;
        s2 s2Var = new s2(hVarC.G(), hVarC, iVar2);
        this.B3 = s2Var;
        this.f256315b4 = sVar.e(hVarC, this, s2Var, n3Var);
        if (kVar == null) {
            hVar = hVarC;
            j2Var = null;
        } else {
            hVar = hVarC;
            j2Var = new j2(this, kVar, n3Var, s2Var, null, eVar2);
        }
        this.f256353w3 = j2Var;
        this.f256354x3 = jVar;
        this.f256351v3 = l0Var;
        if (aVar4 != null) {
            n2VarA = aVar4.a(this, hVar, this, h2Var, s0VarA);
            s0Var = s0VarA;
        } else {
            s0Var = s0VarA;
            n2VarA = null;
        }
        this.Z = n2VarA;
        this.I3 = gVar2;
        this.J3 = bVar;
        this.M3 = new f2(this, s2Var, y1Var, xVar);
        this.f256343q3 = c0Var;
        this.N3 = aVar;
        m1 m1Var = new m1(this, hVar, itemBuilder, hVar.j(), itemLayout, gVar2, t1Var);
        this.S3 = m1Var;
        this.U3 = aVar2;
        this.V3 = aVar3 != null ? aVar3.a(this, s0Var, this) : null;
        this.W3 = jVar2;
        if (iVar2 != null) {
            com.planner5d.library.widget.editor.facade.h hVar2 = hVar;
            this.X3 = new com.planner5d.library.widget.editor.actions.a(iVar2, m1Var, new c2(this, hVar2, iVar2, xVar2, zVar), new y1(this, hVar2), t1Var);
        } else {
            this.X3 = null;
        }
        this.Y3 = new com.planner5d.library.widget.editor.helper.f(n1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2(@fj.h com.planner5d.library.widget.editor.editaction.e eVar) {
        if (this.P3.getModel() == null || z1()) {
            n();
        } else {
            com.planner5d.library.services.rx.a.c("loadAfterChange_" + (this.P3.getModel().getId() + "_" + this.P3.getModel().uid), this.f256329k.F(this.P3.getModel())).subscribe((Subscriber) new f(!(eVar instanceof com.planner5d.library.widget.editor.editaction.q)));
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2(com.planner5d.library.services.l.d dVar) {
        ItemFloor itemFloorB = dVar.b();
        ItemProject item = this.P3.getItem();
        if (itemFloorB == null || item == null || this.f256338o3 == null) {
            return;
        }
        androidx.fragment.app.s sVarA = a();
        if (dVar.e() == com.planner5d.library.services.l.d.a.SetActive) {
            d(null);
            ItemFloor activeFloor = item.getActiveFloor();
            if (activeFloor == null) {
                com.planner5d.library.widget.editor.facade.v vVarW = this.P3.w();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("for project: ");
                sb2.append(this.P3.getModel() == null ? com.planner5d.library.model.payments.a.f222474i : this.P3.getModel().uid);
                sb2.append(", ");
                sb2.append(item.getActiveFloorNumber());
                sb2.append(", ");
                sb2.append(item.getFloorArray().length);
                vVarW.d("editor_set_active", sb2.toString());
                activeFloor = itemFloorB;
            }
            A(new com.planner5d.library.widget.editor.editaction.j(itemFloorB.getUid()), new com.planner5d.library.widget.editor.editaction.j(activeFloor.getUid()), true);
        } else if (dVar.e() == com.planner5d.library.services.l.d.a.Add) {
            d(null);
            Integer nextFreeFloorNumber = item.getNextFreeFloorNumber();
            if (nextFreeFloorNumber != null) {
                A(new com.planner5d.library.widget.editor.editaction.k(itemFloorB, nextFreeFloorNumber.intValue()), new com.planner5d.library.widget.editor.editaction.n(itemFloorB.getUid()), true);
            }
        } else if (dVar.e() == com.planner5d.library.services.l.d.a.Clone) {
            d(null);
            Integer nextFreeFloorNumber2 = item.getNextFreeFloorNumber();
            if (nextFreeFloorNumber2 == null) {
                return;
            }
            ItemFloor itemFloor = (ItemFloor) ItemCloner.clone(itemFloorB, null, new oa.b(item));
            if (sVarA != null) {
                itemFloor.title = sVarA.getString(com.planner5d.library.f.s.EF, itemFloorB.title);
            }
            A(new com.planner5d.library.widget.editor.editaction.k(itemFloor, nextFreeFloorNumber2.intValue()), new com.planner5d.library.widget.editor.editaction.n(itemFloor.getUid()), true);
        } else if (dVar.e() == com.planner5d.library.services.l.d.a.Remove) {
            d(null);
            Integer floorNumber = item.getFloorNumber(itemFloorB);
            if (floorNumber != null) {
                A(new com.planner5d.library.widget.editor.editaction.n(itemFloorB.getUid()), new com.planner5d.library.widget.editor.editaction.k(itemFloorB, floorNumber.intValue()), true);
            }
        } else if (dVar.e() == com.planner5d.library.services.l.d.a.Edit) {
            A(new com.planner5d.library.widget.editor.editaction.o(itemFloorB.getUid(), dVar.d()), new com.planner5d.library.widget.editor.editaction.o(itemFloorB.getUid(), itemFloorB.title), true);
        } else if (dVar.e() == com.planner5d.library.services.l.d.a.PositionChange) {
            A(new com.planner5d.library.widget.editor.editaction.m(itemFloorB.getUid(), dVar.c().intValue()), new com.planner5d.library.widget.editor.editaction.m(itemFloorB.getUid(), dVar.a().intValue()), true);
        }
        this.f256338o3.e(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2(Activity activity) {
        Long l10;
        Project model = this.P3.getModel();
        if (model != null && (l10 = model.contestId) != null) {
            this.X.z0(l10);
        }
        N2().f258084o = com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.submitted;
        this.A3.a().b();
        this.f256337o.f(new h());
        this.f256333m.e(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestNavigationFragment.class, (Bundle) null));
        e3(activity);
    }

    private Observable<Long> I2() {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.helper.w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f256812a.b2();
            }
        }).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.helper.x0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return g1.y0((Observable) obj);
            }
        });
    }

    private boolean K2(id.a aVar, Item item, @NonNull com.planner5d.library.model.manager.statistics.events.t3.d dVar) {
        kotlinx.coroutines.flow.i<Unit> iVarD0 = this.f256321g.d0(aVar);
        if (iVarD0 == null) {
            return false;
        }
        this.f256327j.b(com.planner5d.library.f.s.CF, new Object[0]);
        if (this.f256322g3 != null) {
            return true;
        }
        this.f256322g3 = com.planner5d.library.services.utility.c0.D(iVarD0).doAfterTerminate(new Action0() { // from class: com.planner5d.library.widget.editor.helper.i0
            @Override // rx.functions.Action0
            public final void call() {
                this.f256430a.c2();
            }
        }).subscribe((Subscriber) new i(item, dVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(Item item, @NonNull com.planner5d.library.model.manager.statistics.events.t3.d dVar) {
        String modelId = item instanceof ItemNs ? ((ItemNs) item).getModelId() : null;
        this.B3.C(modelId);
        this.f256351v3.A(y3.c.editing, modelId, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1(vd.a aVar, int i10) {
        N2().f258084o = com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.draft;
        n();
        com.planner5d.library.widget.editor.editor3d.w wVar = (a() == null || !D1()) ? null : (com.planner5d.library.widget.editor.editor3d.w) this.P3.b();
        if (wVar == null) {
            return;
        }
        g1(wVar, aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public com.planner5d.library.widget.editor.projectresources.viewoptions.b N2() {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        if (bVarG1 != null) {
            return bVarG1;
        }
        throw new RuntimeException("ViewOptions is empty");
    }

    public static /* synthetic */ com.planner5d.library.widget.editor.helper.g O() {
        return null;
    }

    private boolean O1() {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        return (z1() || this.f256349u3.f() || T1() || bVarG1 == null || bVarG1.f258084o == com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.preview) ? false : true;
    }

    private boolean R1(Item item) {
        return (item instanceof ItemPoint) && (item.getParentItem() instanceof ItemRuler);
    }

    private void S2(@NonNull final androidx.lifecycle.c0.b bVar) {
        if (com.planner5d.library.services.utility.o3.b()) {
            this.C3.v(bVar);
        } else {
            this.D3.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f256854a.d2(bVar);
                }
            });
        }
    }

    private boolean T1() {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        return (bVarG1 == null || this.P3.b() == null || G1().f258084o == com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.preview || G1().f258084o == com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.submitted || this.f256349u3.f() || (!bVarG1.f258083n && (bVarG1.f258085p != com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a.FirstPerson || !D1()))) ? false : true;
    }

    public static /* synthetic */ LogRecord V(Long l10) {
        return new LogRecord("no_camera_to_animate_to", l10 != null ? String.valueOf(l10) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(Activity activity, vd.a aVar, int i10, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            M1(aVar, i10);
        } else {
            this.A3.a().a(com.planner5d.library.f.s.Q4, true);
            l3(activity, aVar, i10);
        }
    }

    private void V2(View view) {
        EditorToolbar editorToolbar = (EditorToolbar) view.findViewById(com.planner5d.library.f.j.f168424ub);
        this.f256330k3 = editorToolbar;
        editorToolbar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit W1(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f256333m.j();
        }
        return Unit.f312394a;
    }

    private void W2(View view) {
        EditorFloorsView editorFloorsView = (EditorFloorsView) view.findViewById(com.planner5d.library.f.j.Cb);
        this.f256338o3 = editorFloorsView;
        editorFloorsView.setVisibility(0);
        if (!this.f256338o3.c() && this.P3.getItem() != null) {
            this.f256338o3.d(this.P3.getItem(), z1(), j1());
        }
        this.f256342p3 = view.findViewById(com.planner5d.library.f.j.Bb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit X1() {
        this.f256333m.e(this.f256316c.d());
        return Unit.f312394a;
    }

    private void X2(View view) {
        this.f256336n3 = (EditorHistoryButtons) view.findViewById(com.planner5d.library.f.j.f168351rb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void Y1(Long l10, Long l11) {
        return a3(a(), l11, l10);
    }

    private void Y2() {
        if (this.f256334m3 != null && this.f256350v != null) {
            if (!this.f256356z3.f(com.planner5d.library.services.r.showTitle, false)) {
                this.f256334m3.setVisibility(8);
                return;
            }
            String strT = this.f256356z3.t(com.planner5d.library.services.r.projectTitle, null);
            if (strT == null) {
                androidx.fragment.app.s sVarA = a();
                Date dateJ1 = J1();
                if (sVarA != null && dateJ1 != null) {
                    strT = this.f256350v.v(sVarA, dateJ1);
                }
            }
            this.f256334m3.setVisibility(strT == null ? 8 : 0);
            this.f256334m3.setText(strT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1() {
        Long id2 = this.P3.getModel().getId();
        com.planner5d.library.services.utility.i iVarH = new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.id, id2.longValue()).h(com.planner5d.library.services.r.viewOptions, G1() == null ? null : G1().h());
        this.B3.D(iVarH);
        ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog = new ProjectSettingsBottomSheetDialog();
        projectSettingsBottomSheetDialog.setArguments(iVarH.a());
        projectSettingsBottomSheetDialog.showNow(this.f256346s3.get().getChildFragmentManager(), "projectSettings");
        s2.f256732d.c(this.f256346s3.get(), id2);
    }

    private void Z2(View view) {
        this.f256332l3 = view.findViewById(com.planner5d.library.f.j.Q3);
        this.f256334m3 = (TextView) view.findViewById(com.planner5d.library.f.j.mo);
        View viewFindViewById = view.findViewById(com.planner5d.library.f.j.f167934a5);
        this.f256328j3 = view.findViewById(com.planner5d.library.f.j.f168279ob);
        ef.g gVar = new ef.g(view.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167232r3));
        this.f256339p0.a(this.f256332l3, gVar);
        this.f256339p0.a(this.f256334m3, gVar);
        this.f256339p0.a(this.f256328j3, gVar);
        this.f256339p0.a(viewFindViewById, gVar);
        this.f256332l3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.helper.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f256245a.k2(view2);
            }
        });
        this.f256328j3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.helper.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f256291a.l2(view2);
            }
        });
        this.R3.i(viewFindViewById);
        this.Z.O(new WeakReference<>((TextView) view.findViewById(com.planner5d.library.f.j.tv)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable a2(kotlin.Pair pair) {
        Contest contest = (Contest) pair.getFirst();
        Date date = (Date) pair.getSecond();
        if (this.P3.getModel().B() != com.planner5d.library.database.model.project.a.Submitted && contest != null && contest.M(date)) {
            return this.f256331l.U(contest);
        }
        this.P3.m(true);
        return Observable.just(null);
    }

    private Void a3(androidx.fragment.app.s sVar, Long l10, Long l11) {
        if (sVar != null && !this.P3.a()) {
            com.planner5d.library.activity.helper.m1.t(sVar.getWindow(), 48);
            this.f256340p1 = new com.planner5d.library.widget.editor.helper.e(sVar, (FrameLayout) sVar.findViewById(com.planner5d.library.f.j.E4), com.planner5d.library.f.j.Rc, D1(), l10, this, l11, this.X3, this.Y3, this.Z3, this.W3);
            this.Z3.i(getView(), this.f256340p1, this.f256347t);
            Bundle bundle = this.E3;
            if (bundle != null) {
                this.f256340p1.K(bundle);
                this.E3 = null;
            }
            this.L3 = null;
            View decorView = sVar.getWindow().getDecorView();
            e2 e2Var = new e2(new com.planner5d.library.widget.editor.itemactionsbar.k(this.P3.b()), this.P3.b() instanceof com.planner5d.library.widget.editor.editor3d.l ? this.f256324h3 : null, this.f256326i3, this.f256332l3, this.f256330k3, this.f256336n3, this.f256338o3, this.f256340p1, new Rect(0, 0, decorView.getRight(), decorView.getBottom()), this.P3.b() instanceof Editor2D, this.T3, this.f256341p2);
            this.L3 = e2Var;
            this.f256317c4 = this.Q3.f(this.P3, this.f256315b4, this.O3, this.f256340p1, e2Var, this);
            this.f256336n3.c(this.f256340p1.n());
            com.planner5d.library.widget.editor.controls.a aVar = this.N3;
            if (aVar instanceof com.planner5d.library.widget.editor.controls.b) {
                ((com.planner5d.library.widget.editor.controls.b) aVar).h(this, this.f256313a4, this.f256340p1);
            }
            this.Z.M(this.f256340p1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable b2() throws Exception {
        this.P3.getItem().fixDuplicateUids();
        new k().d(this.P3.getItem());
        new com.planner5d.library.widget.editor.helper.j().b(this.P3.getItem());
        Long l10 = this.P3.getModel() == null ? null : this.P3.getModel().contestId;
        if (l10 == null) {
            return Observable.just(null);
        }
        final com.planner5d.library.model.manager.contest.g gVar = this.f256331l;
        Objects.requireNonNull(gVar);
        Observable observableY = com.planner5d.library.services.utility.c0.y(l10, new BiFunction() { // from class: com.planner5d.library.widget.editor.helper.l0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return gVar.j((Long) obj, (kotlin.coroutines.d) obj2);
            }
        });
        final com.planner5d.library.model.manager.contest.g gVar2 = this.f256331l;
        Objects.requireNonNull(gVar2);
        return observableY.zipWith(com.planner5d.library.services.utility.c0.A(new Function() { // from class: com.planner5d.library.widget.editor.helper.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return gVar2.v((kotlin.coroutines.d) obj);
            }
        }), new Func2() { // from class: com.planner5d.library.widget.editor.helper.n0
            @Override // rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return new kotlin.Pair((Contest) obj, (Date) obj2);
            }
        }).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.helper.o0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f256639a.a2((kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2() {
        this.f256322g3 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3, reason: merged with bridge method [inline-methods] */
    public void n2(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            this.f256331l.h0(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(androidx.lifecycle.c0.b bVar) {
        this.C3.v(bVar);
    }

    private void e1() {
        ItemProject item = this.P3.getItem();
        if (item == null || this.P3.a()) {
            return;
        }
        if (this.H3) {
            f1(item);
        }
        String strR = this.P3.r();
        this.P3.k(null);
        if (strR != null) {
            d(item.getChild(strR));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(com.planner5d.library.services.l.b bVar) {
        c1(bVar.a(), bVar.b(), com.planner5d.library.model.manager.statistics.events.o3.g.item_info);
    }

    private void e3(final Activity activity) {
        if (this.W3.a(com.planner5d.library.model.manager.config.f.ContestsSharing)) {
            this.f256323h.c(ContestSubmittedShareDialog.class).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.o
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    this.f256637a.n2(activity, (Boolean) obj);
                }
            }).g();
        } else {
            this.f256323h.c(ContestSubmittedDialog.class).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.p
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    this.f256647a.g3((Boolean) obj);
                }
            }).g();
        }
    }

    private void f1(ItemProject itemProject) {
        byte[] bArrJ = this.f256356z3.j(com.planner5d.library.services.r.projectDataForEditor, null);
        int iHashCode = Arrays.hashCode(bArrJ);
        if (f256310f4 != iHashCode) {
            f256310f4 = iHashCode;
            String strT = this.f256356z3.t(com.planner5d.library.services.r.aiDesignerRoomId, null);
            if (bArrJ != null && bArrJ.length > 0) {
                l1.d(this, this.P3, itemProject, this.f256319e.createItemsFromByteArray(bArrJ, itemProject.getActiveFloor(), this.P3.j()), strT, com.planner5d.library.model.manager.statistics.events.o3.g.room_wizard);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2(Integer num) {
        A2(null);
    }

    private void g1(@NonNull com.planner5d.library.widget.editor.editor3d.w wVar, @fj.h vd.a aVar, int i10) {
        if (aVar != null) {
            wVar.C0(aVar, i10);
            return;
        }
        Project model = this.P3.getModel();
        final Long l10 = model == null ? null : model.projectId;
        this.T3.v(new ij.c() { // from class: com.planner5d.library.widget.editor.helper.u0
            @Override // ij.c
            public final Object get() {
                return g1.V(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g2(ItemRoom itemRoom) {
        this.B3.q(itemRoom, com.planner5d.library.model.manager.statistics.events.o3.h.rotated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(final Boolean bool) {
        this.I3.l(com.planner5d.library.widget.rate.c.OnContestProjectSubmitted, com.planner5d.library.model.manager.statistics.events.t3.c.editor, new Function1() { // from class: com.planner5d.library.widget.editor.helper.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f256529a.o2(bool, (Boolean) obj);
            }
        });
    }

    @androidx.annotation.m1
    private boolean h1(Item item, boolean z10, @NonNull com.planner5d.library.model.manager.statistics.events.t3.d dVar, boolean z11) {
        if (item == null) {
            return false;
        }
        if (i1() != null && ((item instanceof ItemWindow) || ((item instanceof ItemNs) && C1(((ItemNs) item).getModelId())))) {
            return true;
        }
        id.a aVarA = this.f256320f.a();
        if (this.f256321g.I(aVarA, item instanceof ItemNs ? ((ItemNs) item).getModelId() : null, z10)) {
            return true;
        }
        if (z11 && !K2(aVarA, item, dVar)) {
            L2(item, dVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit h2() {
        b(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit i2() {
        b(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditorFloorsView.a j1() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(Bundle bundle, Bundle bundle2, j jVar) {
        this.f256353w3.g(bundle, bundle2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(View view) {
        q1();
    }

    private ze.b l1(Item item) {
        ItemProject itemProjectW1;
        Project projectI1 = I1();
        if (projectI1 == null || projectI1.getId() == null || item == null || (itemProjectW1 = w1()) == null) {
            return null;
        }
        return new ze.b(projectI1, itemProjectW1, item, D1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(View view) {
        d3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.widget.editor.helper.g m2() {
        return this.f256317c4;
    }

    @NonNull
    private j m3(@NonNull final j jVar) {
        com.planner5d.library.widget.editor.a aVarS1 = s1();
        String editorCode = aVarS1 != null ? aVarS1.getEditorCode() : "";
        com.planner5d.library.model.manager.performancetracing.c.a.C1605a c1605a = com.planner5d.library.model.manager.performancetracing.c.a.C1605a.f193075b;
        final com.planner5d.library.model.manager.performancetracing.g gVarA = this.f256352w.a("ProjectLoading" + editorCode, c1605a, null);
        this.f256352w.d("TestingNestedTrace1", c1605a, new Function0() { // from class: com.planner5d.library.widget.editor.helper.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f256872a.v2();
            }
        });
        return new j() { // from class: com.planner5d.library.widget.editor.helper.a0
            @Override // com.planner5d.library.widget.editor.helper.g1.j
            public final Observable loadedProject(Project project, ItemProject itemProject, Bundle bundle) {
                return g1.w0(gVarA, jVar, project, itemProject, bundle);
            }
        };
    }

    public static void n1() {
        f256309e4 = false;
        n3.s();
        com.planner5d.library.widget.editor.projectresources.e.a();
        l1.f256518a.e();
        f256311g4 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit o2(Boolean bool, Boolean bool2) {
        if (bool != null && bool.booleanValue()) {
            x2();
        }
        return Unit.f312394a;
    }

    private void o3() {
        int i10 = O1() ? 0 : 8;
        this.f256336n3.setVisibility(i10);
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        if (eVar != null) {
            eVar.J(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2() {
        if (!z1()) {
            this.Z.P();
        }
        this.Y.o(Boolean.FALSE);
        this.R3.f(I1(), this.f256356z3);
        if (this.F3) {
            d3(this.G3);
        }
        e1();
    }

    private void p3() {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        if (z1() || bVarG1 == null || bVarG1.f258084o != com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.draft || this.f256349u3.f()) {
            this.f256328j3.setVisibility(8);
        } else {
            this.f256328j3.setVisibility(0);
        }
    }

    private void q1() {
        k3(true).subscribe((Subscriber<? super Void>) new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable q2(Project project, Bitmap bitmap) {
        return this.f256312a.O0(a(), project, bitmap).map(new Func1() { // from class: com.planner5d.library.widget.editor.helper.v
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return g1.v0((File) obj);
            }
        });
    }

    private void q3() {
        g();
        o3();
        C();
        if (this.f256328j3 != null) {
            p3();
        }
    }

    private void r1(boolean z10) {
        final androidx.fragment.app.s sVarA = a();
        com.planner5d.library.widget.editor.editor3d.w wVar = (sVarA == null || !D1()) ? null : (com.planner5d.library.widget.editor.editor3d.w) this.P3.b();
        if (wVar == null) {
            return;
        }
        final int integer = sVarA.getResources().getInteger(com.planner5d.library.f.k.f168572i);
        final vd.a aVarP0 = wVar.p0();
        d(null);
        ItemProject item = this.P3.getItem();
        g1(wVar, item != null ? item.getContestCamera() : null, integer);
        if (z10) {
            this.f256340p1.g(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f256873a.U1(sVarA, aVarP0, integer);
                }
            });
        } else {
            this.f256340p1.g(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2() {
        this.f256324h3.n(new ij.c() { // from class: com.planner5d.library.widget.editor.helper.t0
            @Override // ij.c
            public final Object get() {
                return g1.O();
            }
        }, null);
    }

    private void r3() {
        if (this.f256338o3 == null) {
            return;
        }
        int dimensionPixelSize = O1() ? this.f256338o3.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167056j3) : this.f256338o3.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f256338o3.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelSize);
        this.f256338o3.setLayoutParams(marginLayoutParams);
        ItemActionsBar itemActionsBar = this.f256326i3;
        if (itemActionsBar != null) {
            itemActionsBar.l2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s2() {
        this.P3.b().z().doOnTerminate(new Action0() { // from class: com.planner5d.library.widget.editor.helper.a1
            @Override // rx.functions.Action0
            public final void call() {
                this.f256181a.r2();
            }
        }).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void t2() throws Exception {
        Long l10;
        Project model = this.P3.getModel();
        if (model == null || (l10 = model.contestId) == null) {
            throw new NullPointerException("Project or it's contest is empty");
        }
        return this.f256331l.k0(l10.longValue(), model.uid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable u2(Void r10) {
        return com.planner5d.library.services.rx.i.g(new Callable() { // from class: com.planner5d.library.widget.editor.helper.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f256217a.t2();
            }
        });
    }

    public static /* synthetic */ Void v0(File file) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit v2() {
        this.f256352w.d("TestingNestedTrace2", com.planner5d.library.model.manager.performancetracing.c.a.C1605a.f193075b, new Function0() { // from class: com.planner5d.library.widget.editor.helper.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        });
        return Unit.f312394a;
    }

    public static /* synthetic */ Observable w0(com.planner5d.library.model.manager.performancetracing.g gVar, j jVar, Project project, ItemProject itemProject, Bundle bundle) {
        gVar.complete();
        return jVar.loadedProject(project, itemProject, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void U1(final Activity activity, final vd.a aVar, final int i10) {
        N2().f258084o = com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.preview;
        n();
        q3();
        this.f256323h.c(ContestRulesAgreement.class).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.k0
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                this.f256482a.V1(activity, aVar, i10, (Boolean) obj);
            }
        }).g();
    }

    private void x2() {
        Long l10;
        Project model = this.P3.getModel();
        this.f256333m.e(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestVotingFragment.class, new com.planner5d.library.services.utility.i().g(com.planner5d.library.services.r.contestUid, (model == null || (l10 = model.contestId) == null) ? -1L : l10.longValue()).a()).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a())));
    }

    public static /* synthetic */ Observable y0(Observable observable) {
        return observable;
    }

    @Override // we.c
    public void A(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.e eVar2, boolean z10) {
        this.f256315b4.A(eVar, eVar2, z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public boolean A1() {
        return this.P3.G().A1();
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @Deprecated(since = "Use EditorItemSelector instead of direct usages of HelperEditor")
    public boolean B(@fj.h Item item) {
        return this.P3.C().B(item);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public ItemEditability B1() {
        return this.P3.G().B1();
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    public void C() {
        if (this.f256338o3 == null) {
            return;
        }
        if (N1() || T1() || this.f256349u3.f() || this.Z.E()) {
            this.f256338o3.setVisibility(8);
        } else {
            r3();
            this.f256338o3.setVisibility(0);
        }
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @androidx.annotation.m1
    public boolean C1(String str) {
        return this.P3.G().C1(str);
    }

    public void C2(Bundle bundle) {
        this.Z.K(bundle);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.utility.j jVar2 = new com.planner5d.library.services.utility.j(jVar.h(com.planner5d.library.services.r.editor, null));
        if (this.f256340p1 != null && this.P3.getModel() != null && this.P3.getItem() != null) {
            this.f256340p1.H(jVar.h(com.planner5d.library.services.r.bottomMenuState, null), this.P3.getModel(), this.P3.getItem());
        }
        Bundle bundleH = jVar2.h(com.planner5d.library.services.r.editorState, null);
        if (bundleH != null) {
            com.planner5d.library.widget.editor.a aVarB = this.P3.b();
            if (aVarB == null) {
                this.f256348t3 = bundleH;
            } else {
                aVarB.setState(bundleH);
            }
        }
        this.E3 = jVar2.h(com.planner5d.library.services.r.editorCatalog, null);
        this.F3 = jVar2.f(com.planner5d.library.services.r.flyToContestPreview, false);
        this.G3 = jVar2.f(com.planner5d.library.services.r.launchAgreementsDialog, false);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.a
    public void D(@NonNull j jVar, Bundle bundle, @NonNull t3 t3Var, @NonNull com.planner5d.library.model.manager.statistics.f0 f0Var) {
        if (t3Var.a() == null) {
            I(new NullPointerException(), true);
            return;
        }
        Project projectB = t3Var.b();
        if (this.P3.y()) {
            this.f256349u3.b();
            return;
        }
        final Long id2 = projectB != null ? projectB.getId() : null;
        ItemProject itemProjectA = t3Var.a();
        this.P3.h(projectB, itemProjectA);
        Observable<Long> observableSubscribeOn = I2().subscribeOn(com.planner5d.library.services.rx.c.f224933c);
        Scheduler scheduler = com.planner5d.library.services.rx.c.f224934d;
        observableSubscribeOn.observeOn(scheduler).map(new Func1() { // from class: com.planner5d.library.widget.editor.helper.r0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f256681a.Y1(id2, (Long) obj);
            }
        }).concatWith(jVar.loadedProject(this.P3.getModel(), itemProjectA, bundle)).observeOn(scheduler).subscribe((Subscriber) new b(f0Var, itemProjectA));
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public boolean D1() {
        return this.P3.G().D1();
    }

    public void D2(Bundle bundle) {
        this.Z.L(bundle);
        bundle.putBundle(com.planner5d.library.services.r.editor.f224891a, t1());
        String str = com.planner5d.library.services.r.bottomMenuState.f224891a;
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        bundle.putBundle(str, eVar != null ? eVar.r() : null);
    }

    @Override // com.planner5d.library.widget.editor.helper.k2.b
    @androidx.annotation.l0
    public boolean E(@NonNull Item item) {
        com.planner5d.library.widget.editor.a aVarB = this.P3.b();
        if (this.f256324h3 == null || aVarB == null) {
            return false;
        }
        this.f256324h3.q(item, aVarB.x(item.getLayout(new ItemLayout()).getPosition(new com.planner5d.library.math.m())));
        return true;
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @NonNull
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public PointF E1() {
        return this.P3.G().E1();
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @fj.h
    public androidx.lifecycle.o0 F() {
        return this;
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @NonNull
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public com.planner5d.library.model.p.b F1() {
        return this.P3.G().F1();
    }

    public void F2() {
        this.f256340p1.C();
    }

    @Override // com.planner5d.library.widget.editor.helper.k2.b
    @androidx.annotation.l0
    public void G(@NonNull List<com.planner5d.library.widget.editor.itemactionsbar.b> list) {
        this.f256326i3.setActions(list);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public com.planner5d.library.widget.editor.projectresources.viewoptions.b G1() {
        return this.P3.G().G1();
    }

    public void G2() {
        if (this.P3.getModel() == null || this.P3.getModel().getId() == null) {
            return;
        }
        this.f256340p1.g(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f256811a.Z1();
            }
        });
    }

    @Override // we.c
    public boolean H(com.planner5d.library.widget.editor.projectresources.a aVar) {
        return this.f256315b4.H(aVar);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public boolean H1() {
        return this.P3.G().H1();
    }

    public void H2() {
        com.planner5d.library.widget.editor.helper.g gVar = this.f256317c4;
        if (gVar != null) {
            gVar.i();
            this.f256317c4.h();
        }
        S2(androidx.lifecycle.c0.b.STARTED);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.a
    public void I(Throwable th2, boolean z10) {
        this.f256349u3.b();
        if (th2 instanceof com.planner5d.library.widget.editor.editor3d.q.a) {
            return;
        }
        Project model = this.P3.getModel();
        View view = getView();
        if (z10) {
            this.P3.w().b("error_project_load", model == null ? com.planner5d.library.model.payments.a.f222474i : model.uid, th2);
        }
        if (th2 instanceof OutOfMemoryError) {
            this.P3.t();
        } else if (view != null) {
            this.f256327j.e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new com.planner5d.library.services.utility.k3(com.planner5d.library.f.s.D9, new Object[0]), new com.planner5d.library.model.u.a(new com.planner5d.library.services.utility.k3(com.planner5d.library.f.s.ss, new Object[0]), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.widget.editor.helper.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f256862a.X1();
                }
            })));
        }
    }

    public Project I1() {
        return this.P3.getModel();
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    public void J(@NonNull gd.a aVar) {
        this.M3.g(false, false, this.G3, aVar);
    }

    @fj.h
    public Date J1() {
        Serializable serializableS = this.f256356z3.s(com.planner5d.library.services.r.projectRevisionDate, null);
        if (serializableS instanceof Date) {
            return (Date) serializableS;
        }
        return null;
    }

    @androidx.annotation.d
    public void J2(Item item) {
        this.V3.d(item);
    }

    public ProviderUid K1() {
        return this.P3.j();
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    @androidx.annotation.d
    public void L(@NonNull Item item) {
        this.V3.e(item);
    }

    public com.planner5d.library.services.utility.j L1() {
        return this.f256356z3;
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @NonNull
    @Deprecated(since = "Use EditorItemSelector instead of direct usages of HelperEditor")
    public Observable<Void> M(@NonNull PointF pointF, Item[] itemArr) {
        return this.P3.C().M(pointF, itemArr);
    }

    public void M2() {
        d(null);
        this.Z.D();
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    public void N() {
        View view = getView();
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        if (view == null || bVarG1 == null) {
            return;
        }
        if (!com.planner5d.library.services.utility.o3.b()) {
            view.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f256573a.N();
                }
            });
            return;
        }
        VirtualJoystickView virtualJoystickView = (VirtualJoystickView) view.findViewById(com.planner5d.library.f.j.Pf);
        VirtualJoystickView virtualJoystickView2 = (VirtualJoystickView) view.findViewById(com.planner5d.library.f.j.Qf);
        virtualJoystickView2.setVisibility(8);
        virtualJoystickView.setVisibility(8);
        if (T1()) {
            virtualJoystickView.setVisibility(0);
            if (D1()) {
                virtualJoystickView2.setVisibility(0);
            }
        }
        q3();
        com.planner5d.library.widget.event.directional.g gVar = this.f256313a4;
        com.planner5d.library.widget.editor.a.d dVar = com.planner5d.library.widget.editor.a.d.Left;
        if (virtualJoystickView.getVisibility() != 0) {
            virtualJoystickView = null;
        }
        gVar.j(dVar, virtualJoystickView);
        com.planner5d.library.widget.event.directional.g gVar2 = this.f256313a4;
        com.planner5d.library.widget.editor.a.d dVar2 = com.planner5d.library.widget.editor.a.d.Right;
        if (virtualJoystickView2.getVisibility() != 0) {
            virtualJoystickView2 = null;
        }
        gVar2.j(dVar2, virtualJoystickView2);
    }

    public boolean N1() {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        return (bVarG1 == null || bVarG1.f258084o == null) ? false : true;
    }

    public void O2() {
        S2(androidx.lifecycle.c0.b.RESUMED);
    }

    public boolean P1() {
        return this.f256356z3.a(com.planner5d.library.services.r.projectRevisionId);
    }

    public void P2() {
        this.B3.A(null);
        this.f256349u3.i(true);
        this.f256329k.Q(this.P3.getModel(), this.P3.getItem()).subscribe((Subscriber<? super String>) new e());
    }

    public boolean Q1() {
        long jE = this.f256320f.e();
        return (this.P3.getModel() == null || this.P3.getModel().userId != jE || jE == 0) ? false : true;
    }

    public void Q2(com.planner5d.library.widget.editor.a aVar, Bundle bundle) {
        if (this.P3.c(aVar) && aVar != null) {
            aVar.setHelper(this);
            Bundle bundle2 = this.f256348t3;
            if (bundle2 != null) {
                aVar.setState(bundle2);
                this.f256348t3 = null;
            } else if (bundle.containsKey(com.planner5d.library.services.r.editor.f224891a)) {
                C2(bundle);
            }
        }
    }

    public void R2(com.planner5d.library.widget.editor.facade.i0 i0Var) {
        this.O3 = i0Var;
        if (i0Var.f256112b == null) {
            i0Var.f256112b = this.P3.D();
        }
    }

    public boolean S1() {
        return this.P3.a();
    }

    public void T2(com.planner5d.library.widget.editor.editor3d.controller.navigation.c.a aVar) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = G1();
        if (bVarG1 != null) {
            y(new com.planner5d.library.widget.editor.editaction.g0(new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVarG1).j(aVar).a()), true, false);
            n();
        }
    }

    public Observable<Void> U2(FragmentController fragmentController, @fj.h final Bundle bundle, final Bundle bundle2, @NonNull j jVar) {
        if (bundle2 == null) {
            return Observable.empty();
        }
        this.P3.u(this);
        com.planner5d.library.services.utility.j jVar2 = new com.planner5d.library.services.utility.j(bundle2);
        this.f256356z3 = jVar2;
        this.H3 = jVar2.a(com.planner5d.library.services.r.projectDataForEditor);
        com.planner5d.library.services.utility.v1.r(com.planner5d.library.services.l.f224376b, this, new androidx.lifecycle.d1() { // from class: com.planner5d.library.widget.editor.helper.b0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f256200a.e2((com.planner5d.library.services.l.b) obj);
            }
        });
        com.planner5d.library.services.utility.v1.r(com.planner5d.library.services.m0.f224430c, this, new androidx.lifecycle.d1() { // from class: com.planner5d.library.widget.editor.helper.c0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f256205a.f2((Integer) obj);
            }
        });
        com.planner5d.library.services.utility.v1.r(com.planner5d.library.services.l.f224377c, this, new androidx.lifecycle.d1() { // from class: com.planner5d.library.widget.editor.helper.d0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f256216a.B2((com.planner5d.library.services.l.d) obj);
            }
        });
        this.P3.p(this.f256315b4);
        com.planner5d.library.services.l.f224379e.k(this, new androidx.lifecycle.d1() { // from class: com.planner5d.library.widget.editor.helper.e0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f256244a.A2((com.planner5d.library.widget.editor.editaction.e) obj);
            }
        });
        com.planner5d.library.services.utility.v1.r(com.planner5d.library.services.l.f224380f, this, new androidx.lifecycle.d1() { // from class: com.planner5d.library.widget.editor.helper.f0
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f256290a.g2((ItemRoom) obj);
            }
        });
        this.f256329k.S(z1());
        this.f256346s3 = new WeakReference<>(fragmentController);
        Y2();
        boolean zP1 = P1();
        boolean z10 = !zP1;
        this.A3.b(com.planner5d.library.services.utility.h2.b(getView()).findViewById(com.planner5d.library.f.j.f168361rl));
        if (!zP1) {
            this.f256349u3.l(Integer.valueOf(com.planner5d.library.f.s.gF));
        }
        this.f256349u3.k(true);
        this.f256349u3.o();
        EditorHistoryButtons editorHistoryButtons = this.f256336n3;
        if (editorHistoryButtons != null) {
            editorHistoryButtons.e(new Function0() { // from class: com.planner5d.library.widget.editor.helper.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f256307a.h2();
                }
            }, new Function0() { // from class: com.planner5d.library.widget.editor.helper.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f256399a.i2();
                }
            });
        }
        final j jVarM3 = m3(jVar);
        return this.P3.B(bundle2, this, z10, this.f256349u3).doOnCompleted(new Action0() { // from class: com.planner5d.library.widget.editor.helper.j0
            @Override // rx.functions.Action0
            public final void call() {
                this.f256440a.j2(bundle2, bundle, jVarM3);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    public androidx.fragment.app.s a() {
        FragmentController fragmentController = this.f256346s3.get();
        if (fragmentController == null) {
            return null;
        }
        return fragmentController.getActivity();
    }

    @Override // we.c
    public com.planner5d.library.widget.editor.projectresources.a a6() {
        return this.f256315b4.a6();
    }

    @Override // we.c
    public void b(boolean z10) {
        this.f256315b4.b(z10);
    }

    public void b3(View view, boolean z10) {
        if (view == null) {
            return;
        }
        this.f256326i3 = (ItemActionsBar) view.findViewById(com.planner5d.library.f.j.f168380sf);
        PropertiesBarView propertiesBarView = (PropertiesBarView) view.findViewById(com.planner5d.library.f.j.xo);
        this.f256324h3 = propertiesBarView;
        propertiesBarView.n(new ij.c() { // from class: com.planner5d.library.widget.editor.helper.y
            @Override // ij.c
            public final Object get() {
                return this.f256861a.m2();
            }
        }, this.P3.G());
        this.f256324h3.setFor3D(z10);
        Z2(view);
        V2(view);
        W2(view);
        X2(view);
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    public void c() {
        ItemActionsBar itemActionsBar = this.f256326i3;
        if (itemActionsBar != null && itemActionsBar.getVisibility() == 0) {
            if (!com.planner5d.library.services.utility.o3.b()) {
                itemActionsBar.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f256201a.c();
                    }
                });
                return;
            }
            this.L3.n();
        }
    }

    @androidx.annotation.l0
    public void c1(CatalogItem catalogItem, ItemMaterialSet itemMaterialSet, com.planner5d.library.model.manager.statistics.events.o3.g gVar) {
        this.S3.i(getView(), catalogItem, itemMaterialSet, gVar);
        f();
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @Deprecated(since = "Use EditorItemSelector instead of direct usages of HelperEditor")
    public void d(Item item) {
        this.P3.C().d(item);
    }

    public Boolean d1(ClipData clipData, float f10, float f11, com.planner5d.library.model.manager.statistics.events.o3.g gVar) {
        Boolean boolValueOf = Boolean.valueOf(this.S3.h(clipData, f10, f11, gVar));
        f();
        return boolValueOf;
    }

    public void d3(boolean z10) {
        if (this.P3.G().H1()) {
            this.M3.g(false, true, z10, null);
        } else {
            r1(z10);
        }
    }

    @Override // we.c
    public boolean e(com.planner5d.library.widget.editor.projectresources.a aVar) {
        return this.f256315b4.e(aVar);
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    @androidx.annotation.d
    public void f() {
        if (!com.planner5d.library.services.utility.o3.b()) {
            this.D3.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f256672a.f();
                }
            });
            return;
        }
        if (this.f256336n3 != null) {
            boolean z10 = false;
            if (this.P3.E()) {
                this.f256336n3.d(false, false);
                return;
            }
            com.planner5d.library.widget.editor.projectresources.a aVarA6 = this.f256315b4.a6();
            EditorHistoryButtons editorHistoryButtons = this.f256336n3;
            boolean z11 = this.f256315b4.e(aVarA6) && !this.f256355y3;
            if (this.f256315b4.H(aVarA6) && !this.f256355y3) {
                z10 = true;
            }
            editorHistoryButtons.d(z11, z10);
        }
    }

    public void f3(Item item) {
        if (this.f256340p1 != null) {
            ze.b bVarL1 = item == null ? null : l1(item);
            if (h1(item, true, com.planner5d.library.model.manager.statistics.events.t3.d.on_item_edit, false) && bVarL1 != null) {
                this.f256340p1.F(bVarL1);
                return;
            }
            this.f256340p1.h();
        }
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    public void g() {
        boolean z10 = (this.f256349u3.f() || this.Z.E()) ? false : true;
        this.f256330k3.setVisibility(z10 ? 0 : 8);
        this.f256347t.h(this.f256330k3, (!z10 || N1() || z1()) ? 8 : 0, this.P3.G().H1());
    }

    @Override // androidx.lifecycle.o0
    @NonNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.C3;
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    public View getView() {
        FragmentController fragmentController = this.f256346s3.get();
        if (fragmentController == null) {
            return null;
        }
        return fragmentController.getView();
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void h(boolean z10, boolean z11) {
        this.P3.F().h(z10, z11);
    }

    public Subscriber<com.planner5d.library.widget.editor.a.b> h3() {
        this.Y.o(Boolean.TRUE);
        return this.P3.q(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f256805a.p2();
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.facade.e
    @fj.h
    public Fragment i() {
        return this.f256346s3.get();
    }

    public Long i1() {
        if (this.P3.getModel() == null) {
            return null;
        }
        return this.P3.getModel().contestId;
    }

    public void i3() {
        this.f256333m.f(new oe.a(this.U3.a(), new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.smartWizardForEditor, true).m(com.planner5d.library.services.r.smartWizardPipeline, true).a()), true);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public com.planner5d.library.widget.editor.projectresources.j j() {
        return this.P3.G().j();
    }

    public Observable<Void> j3() {
        return k3(!this.M3.j());
    }

    @Override // com.planner5d.library.widget.editor.facade.b
    public void k(@NonNull com.planner5d.library.widget.editor.facade.k0 k0Var, @NonNull com.planner5d.library.widget.editor.facade.e eVar, @fj.h ItemRoom itemRoom, @NonNull StatisticsEventAiDesigner.d dVar) {
        this.f256345s.k(k0Var, eVar, itemRoom, dVar);
    }

    public com.planner5d.library.widget.menu.l k1(Menu menu, MenuInflater menuInflater) {
        com.planner5d.library.widget.menu.l lVarM = this.f256354x3.m(menu, menuInflater, this, this.f256349u3.f(), this.M3);
        Activity activityA = com.planner5d.library.services.utility.h2.a(a());
        ((EditorToolbar) com.planner5d.library.services.utility.h2.b(getView()).findViewById(com.planner5d.library.f.j.f168424ub)).E(activityA, menu, lVarM.a());
        EditorSubmenu editorSubmenu = (EditorSubmenu) activityA.findViewById(com.planner5d.library.f.j.f168400tb);
        editorSubmenu.e();
        editorSubmenu.setHasPro(this.f256321g.r());
        q3();
        return lVarM;
    }

    Observable<Void> k3(boolean z10) {
        Subscription subscription = this.f256322g3;
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
        Long l10 = null;
        kotlinx.coroutines.t0.d(this.f256341p2, null);
        this.Z.v();
        this.f256339p0.b();
        S2(androidx.lifecycle.c0.b.DESTROYED);
        f3(null);
        n();
        View view = this.f256328j3;
        if (view != null) {
            view.setOnClickListener(null);
            this.f256328j3 = null;
        }
        Observable<Void> observableL = this.P3.L(z10);
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        if (eVar != null) {
            eVar.j(a(), z10);
        }
        if (!this.P3.i()) {
            return observableL;
        }
        final Project model = this.P3.getModel();
        s2 s2Var = this.B3;
        if (model != null) {
            l10 = model.contestId;
        }
        s2Var.g(l10);
        final com.planner5d.library.model.manager.project.m0 m0Var = this.f256314b;
        if (model != null && m0Var != null) {
            observableL = observableL.mergeWith(com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.q
                @Override // java.lang.Runnable
                public final void run() {
                    m0Var.p(model);
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224933c));
        }
        if (!this.f256335n.a() && !this.f256321g.c()) {
            return observableL;
        }
        this.A3.a().a(com.planner5d.library.f.s.DA, true);
        return observableL.mergeWith(this.P3.b().o().flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.helper.r
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f256679a.q2(model, (Bitmap) obj);
            }
        }).doOnTerminate(new Action0() { // from class: com.planner5d.library.widget.editor.helper.s
            @Override // rx.functions.Action0
            public final void call() {
                this.f256720a.s2();
            }
        }));
    }

    @Override // we.c
    public void l(com.planner5d.library.services.l.c cVar) {
        this.f256315b4.l(cVar);
    }

    public void l3(Activity activity, vd.a aVar, int i10) {
        this.f256318d.r(this.P3.getModel()).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.helper.p0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f256648a.u2((Void) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new g(activity, aVar, i10));
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @NonNull
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public Observable<com.planner5d.library.widget.editor.a.b> m() {
        return this.f256343q3.u(this.P3.getItem(), this.P3.a(), new ij.c() { // from class: com.planner5d.library.widget.editor.helper.c1
            @Override // ij.c
            public final Object get() {
                return this.f256206a.h3();
            }
        }, this.P3.b());
    }

    public boolean m1() {
        return this.Z.x();
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void n() {
        this.P3.F().n();
    }

    @androidx.annotation.d
    public void n3() {
        synchronized (this.H1) {
            try {
                this.P3.x(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
    }

    @Override // com.planner5d.library.widget.editor.facade.w
    @androidx.annotation.d
    public void o() {
        PropertiesBarView propertiesBarView = this.f256324h3;
        if (this.f256326i3.getVisibility() == 0 || !(propertiesBarView == null || propertiesBarView.h())) {
            if (!com.planner5d.library.services.utility.o3.b()) {
                propertiesBarView.post(new Runnable() { // from class: com.planner5d.library.widget.editor.helper.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f256769a.o();
                    }
                });
                return;
            }
            c();
            if (this.P3.b() != null && this.P3.b().getSelectedItem() == null) {
                this.f256340p1.h();
            }
            propertiesBarView.f();
            n();
        }
    }

    public void o1(@NotNull ItemRoom itemRoom) {
        itemRoom.startRotation();
        o();
        this.f256340p1.h();
        r();
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        return this.N3.a(motionEvent) ? this.N3.c(motionEvent) : this.f256313a4.onGenericMotion(view, motionEvent);
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @Deprecated(since = "Use EditorItemSelector instead of direct usages of HelperEditor")
    public void p(@fj.h String str) {
        this.P3.C().p(str);
    }

    public com.planner5d.library.widget.editor.facade.g p1() {
        return this.P3.A();
    }

    @Override // we.c
    public void q(boolean z10) {
        this.f256329k.P(a(), this.P3.getModel(), this.P3.getItem(), z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void r() {
        this.P3.F().r();
    }

    @Override // com.planner5d.library.widget.editor.facade.c
    @androidx.annotation.m1
    public boolean s(Item item, boolean z10, @NonNull com.planner5d.library.model.manager.statistics.events.t3.d dVar) {
        return h1(item, z10, dVar, true);
    }

    @fj.h
    public com.planner5d.library.widget.editor.a s1() {
        return this.P3.b();
    }

    @Override // com.planner5d.library.widget.editor.helper.selector.a
    @Deprecated(since = "Use EditorItemSelector instead of direct usages of HelperEditor")
    public void t(Item item, boolean z10) {
        this.P3.C().t(item, z10);
    }

    public Bundle t1() {
        return u1(false);
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void u() {
        this.P3.F().u();
    }

    public Bundle u1(boolean z10) {
        com.planner5d.library.services.utility.i iVarH = new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.editorState, (this.P3.b() == null || (!z10 && this.f256349u3.f())) ? null : this.P3.b().getState());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.editorCatalog;
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        return iVarH.h(rVar, eVar != null ? eVar.p() : null).a();
    }

    @Override // com.planner5d.library.widget.editor.helper.k2.b
    @androidx.annotation.l0
    public void v(@NonNull Item item, @NonNull List<com.planner5d.library.widget.editor.itemactionsbar.b> list) {
        this.f256326i3.setActions(list);
        e2 e2Var = this.L3;
        if (e2Var != null) {
            e2Var.q(item);
        }
        if (!item.equals(this.f256340p1.i()) && this.f256340p1.y()) {
            f3(item);
        }
        n();
    }

    public com.planner5d.library.widget.editor.facade.h v1() {
        return this.P3;
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void w(com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        this.P3.F().w(bVar);
    }

    public ItemProject w1() {
        return this.P3.getItem();
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @Deprecated(since = "Use EditorViewController instead of direct usages of HelperEditor")
    public void x() {
        this.P3.F().x();
        N();
    }

    @fj.h
    public Long x1() {
        if (this.P3.getModel() != null) {
            return this.P3.getModel().projectId;
        }
        return null;
    }

    @Override // we.c
    public boolean y(com.planner5d.library.widget.editor.editaction.e eVar, boolean z10, boolean z11) {
        return this.f256315b4.y(eVar, z10, z11);
    }

    public com.planner5d.library.widget.preloader.t y1() {
        return this.A3;
    }

    public boolean y2() {
        com.planner5d.library.model.manager.unlockeditems.b bVar;
        if (this.Z.E()) {
            this.Z.D();
            return true;
        }
        this.P3.s();
        if (!this.f256335n.a() && !this.f256321g.c()) {
            this.f256329k.P(a(), this.P3.getModel(), this.P3.getItem(), false);
            PurchaseRequiredMessage.show(this.f256323h, null, false, true);
            return true;
        }
        if (this.I3 != null && (bVar = this.J3) != null && bVar.a()) {
            this.I3.l(com.planner5d.library.widget.rate.c.OnEditorExitAfterTrialUnlock, com.planner5d.library.model.manager.statistics.events.t3.c.editor, new Function1() { // from class: com.planner5d.library.widget.editor.helper.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f256721a.W1((Boolean) obj);
                }
            });
            return true;
        }
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        if (eVar == null || !eVar.x()) {
            this.f256325i.h();
            return false;
        }
        this.f256340p1.s();
        return true;
    }

    @Override // we.c
    public boolean z(com.planner5d.library.widget.editor.editaction.e eVar, boolean z10) {
        return this.f256315b4.z(eVar, z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Deprecated(since = "Use EditorDataProvider instead of direct usages of HelperEditor")
    public boolean z1() {
        return this.P3.G().z1();
    }

    public void z2(Configuration configuration) {
        r3();
        int i10 = configuration.orientation;
        Integer num = this.K3;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.K3 = Integer.valueOf(i10);
        com.planner5d.library.widget.editor.helper.e eVar = this.f256340p1;
        if (eVar != null) {
            eVar.z(i10);
        }
        s2 s2Var = this.B3;
        if (s2Var != null) {
            s2Var.z(i10);
        }
        this.Z.V();
    }
}
