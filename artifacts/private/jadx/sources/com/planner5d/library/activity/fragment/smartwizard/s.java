package com.planner5d.library.activity.fragment.smartwizard;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.a4;
import com.planner5d.library.model.manager.statistics.events.p2;
import com.planner5d.library.model.manager.statistics.f0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.t3;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSmartWizardEditorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartWizardEditorViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/SmartWizardEditorViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public abstract class s extends f2 implements j2.a, j2.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f135853m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f135854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f135855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c2 f135856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f135857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private StatisticsEventAiDesigner.EventData f135858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f135859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bundle f135860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a4.e f135861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Bundle f135862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f135863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f135864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Throwable> f135865l;

    protected static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f135867b = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f135866a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final com.planner5d.library.activity.fragment.smartwizard.roomshape.i f135868c = com.planner5d.library.activity.fragment.smartwizard.roomshape.i.lType;

        private a() {
        }

        @NotNull
        public final com.planner5d.library.activity.fragment.smartwizard.roomshape.i a() {
            return f135868c;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135869a;

        static {
            int[] iArr = new int[a4.f.values().length];
            try {
                iArr[a4.f.room_wizard_shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a4.f.room_wizard_dimensions.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a4.f.room_wizard_style.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135869a = iArr;
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<Void> {
        c() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            s.this.v0(a4.c.other);
            s.this.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            s.this.d0().o(Boolean.FALSE);
        }
    }

    public s(@NotNull b2 messageManager, @NotNull x navigator, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.application.b application) {
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f135854a = messageManager;
        this.f135855b = navigator;
        this.f135856c = networkStateUtility;
        this.f135857d = application;
        Boolean bool = Boolean.TRUE;
        this.f135859f = new c1<>(bool);
        this.f135860g = new Bundle();
        this.f135862i = new Bundle();
        c1<Boolean> c1Var = new c1<>(bool);
        this.f135863j = c1Var;
        this.f135864k = c1Var;
        this.f135865l = new c1(null);
    }

    private final a4.f h0() {
        if (this instanceof com.planner5d.library.activity.fragment.smartwizard.roomshape.f) {
            return a4.f.room_wizard_shape;
        }
        return this instanceof com.planner5d.library.activity.fragment.smartwizard.dimensions.t ? a4.f.room_wizard_dimensions : a4.f.room_wizard_style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(s sVar) {
        sVar.f135855b.j();
        return Unit.f312394a;
    }

    public static /* synthetic */ void o0(s sVar, g1.j jVar, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEditorSetupComplete");
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        sVar.n0(jVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void q0(ItemProject itemProject) {
        if (itemProject != null) {
            itemProject.fixDuplicateUids();
            new com.planner5d.library.widget.editor.helper.k().d(itemProject);
            new com.planner5d.library.widget.editor.helper.j().b(itemProject);
        }
        return null;
    }

    private final void w0(a4.a aVar) {
        int i10 = b.f135869a[h0().ordinal()];
        if (i10 == 1) {
            a4.b.d(p2.f217307b, f0(), aVar, null, this.f135862i.getBoolean(com.planner5d.library.services.r.smartWizardStatisticsChangeShape.f224891a), this.f135860g.getString(com.planner5d.library.services.r.smartWizardStatisticsRoomShape.f224891a), 4, null);
            return;
        }
        if (i10 == 2) {
            p2.f217307b.E(f0(), aVar, this.f135862i.getBoolean(com.planner5d.library.services.r.smartWizardStatisticsChangeSlider.f224891a), this.f135862i.getBoolean(com.planner5d.library.services.r.smartWizardStatisticsChangeInput.f224891a));
        } else {
            if (i10 != 3) {
                return;
            }
            p2.f217307b.b1(f0(), aVar, this.f135860g.getString(com.planner5d.library.services.r.smartWizardStatisticsRoomStyle.f224891a));
        }
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.a
    public void D(@NotNull g1.j listener, @Nullable Bundle bundle, @NotNull t3 value, @NotNull f0 loadCounter) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(loadCounter, "loadCounter");
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.a
    public void I(@Nullable Throwable th2, boolean z10) {
        l0(th2, false);
    }

    public void W() {
    }

    @Nullable
    public final StatisticsEventAiDesigner.EventData X() {
        return this.f135858e;
    }

    @NotNull
    protected final Bundle Y() {
        return this.f135860g;
    }

    @NotNull
    public final c1<Boolean> Z() {
        return this.f135859f;
    }

    @NotNull
    public final androidx.lifecycle.w0<Throwable> a0() {
        return this.f135865l;
    }

    @NotNull
    protected final b2 b0() {
        return this.f135854a;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> c0() {
        return this.f135864k;
    }

    @NotNull
    protected final c1<Boolean> d0() {
        return this.f135863j;
    }

    @NotNull
    protected final a4.e f0() {
        a4.e eVar = this.f135861h;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("source");
        return null;
    }

    @NotNull
    protected final Bundle g0() {
        return this.f135862i;
    }

    public final boolean i0() {
        StatisticsEventAiDesigner.EventData eventData = this.f135858e;
        return (eventData != null ? eventData.q() : null) != null;
    }

    public final boolean j0() {
        return this.f135856c.d(this.f135857d);
    }

    public final void k0() {
        w0(a4.a.back);
    }

    public final void l0(@Nullable Throwable th2, boolean z10) {
        this.f135863j.o(Boolean.FALSE);
        v0(a4.c.other);
        if (z10) {
            return;
        }
        if (th2 instanceof OutOfMemoryError) {
            androidx.lifecycle.w0<Throwable> w0Var = this.f135865l;
            Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Throwable?>");
            ((c1) w0Var).o(th2);
        } else {
            if (th2 instanceof com.planner5d.library.widget.editor.editor3d.q.a) {
                return;
            }
            this.f135854a.e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.D9, new Object[0]), new com.planner5d.library.model.u.a(new k3(com.planner5d.library.f.s.ss, new Object[0]), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.activity.fragment.smartwizard.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.m0(this.f135604a);
                }
            })));
        }
    }

    public abstract void n0(@NotNull g1.j jVar, @Nullable Bundle bundle);

    protected final void p0(@Nullable Project project, @Nullable final ItemProject itemProject, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Observable observableSubscribeOn = com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.activity.fragment.smartwizard.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.q0(itemProject);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
        Scheduler scheduler = com.planner5d.library.services.rx.c.f224934d;
        observableSubscribeOn.observeOn(scheduler).concatWith(listener.loadedProject(project, itemProject, null)).observeOn(scheduler).subscribe((Subscriber) new c());
    }

    public final void r0() {
        p2.f217307b.e(h0(), f0());
    }

    public final void s0(@Nullable StatisticsEventAiDesigner.EventData eventData) {
        this.f135858e = eventData;
    }

    public final void t0(@Nullable Bundle bundle) {
        if (bundle != null) {
            this.f135860g.putAll(bundle);
        }
        u0(this.f135860g.getBoolean(com.planner5d.library.services.r.smartWizardForEditor.f224891a, false) ? a4.e.catalog : a4.e.welcome_screen);
    }

    protected final void u0(@NotNull a4.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f135861h = eVar;
    }

    protected final void v0(@NotNull a4.c errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        p2.f217307b.w0(h0(), f0(), errorType);
    }

    protected final void x0() {
        w0(a4.a.next);
    }
}
