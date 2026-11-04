package com.planner5d.library.widget.editor.facade;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.widget.editor.helper.j2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class h0 implements g, i0.b, f, e0, v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f256097j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f256098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j0 f256099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.helper.i f256100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.helper.selector.a f256101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f256102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final j2.a f256103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ij.c<Subscriber<com.planner5d.library.widget.editor.a.b>> f256104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Handler f256105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f256106i;

    public h0(@NotNull c0 interfaceManager, @NotNull j0 stateAccessor, @NotNull com.planner5d.library.widget.editor.helper.i lowMemoryHandler, @NotNull com.planner5d.library.widget.editor.helper.selector.a editorItemSelector, @NotNull w supportingViewsController, @NotNull j2.a projectLoaderListener, @NotNull ij.c<Subscriber<com.planner5d.library.widget.editor.a.b>> sceneLoadingSubscriber) {
        Intrinsics.checkNotNullParameter(interfaceManager, "interfaceManager");
        Intrinsics.checkNotNullParameter(stateAccessor, "stateAccessor");
        Intrinsics.checkNotNullParameter(lowMemoryHandler, "lowMemoryHandler");
        Intrinsics.checkNotNullParameter(editorItemSelector, "editorItemSelector");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        Intrinsics.checkNotNullParameter(sceneLoadingSubscriber, "sceneLoadingSubscriber");
        this.f256098a = interfaceManager;
        this.f256099b = stateAccessor;
        this.f256100c = lowMemoryHandler;
        this.f256101d = editorItemSelector;
        this.f256102e = supportingViewsController;
        this.f256103f = projectLoaderListener;
        this.f256104g = sceneLoadingSubscriber;
        this.f256105h = new Handler(Looper.getMainLooper());
    }

    private final com.planner5d.library.widget.editor.a g() {
        return this.f256099b.b();
    }

    private final ItemProject i() {
        return this.f256099b.getItem();
    }

    private final Project k() {
        return this.f256099b.getModel();
    }

    private final boolean l() {
        return this.f256099b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(h0 h0Var) {
        h0Var.n();
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    public boolean A1() {
        return this.f256098a.l(g());
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Nullable
    public ItemEditability B1() {
        return this.f256098a.e(k());
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    public boolean C1(@Nullable String str) {
        return this.f256098a.m(str);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    public boolean D1() {
        return this.f256098a.k(g());
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @NotNull
    public PointF E1() {
        return this.f256098a.d(i());
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @NotNull
    public com.planner5d.library.model.p.b F1() {
        return this.f256098a.g();
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Nullable
    public com.planner5d.library.widget.editor.projectresources.viewoptions.b G1() {
        return this.f256098a.h(k());
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    public boolean H1() {
        return this.f256098a.j(g());
    }

    @Override // com.planner5d.library.widget.editor.facade.i0.b
    public void a() {
        c0 c0Var = this.f256098a;
        e eVar = this.f256106i;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            eVar = null;
        }
        c0Var.s(eVar.getView());
    }

    @Override // com.planner5d.library.widget.editor.facade.v
    public void b(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        this.f256098a.p(str, str2, th2);
    }

    @Override // com.planner5d.library.widget.editor.facade.g
    public void c(@NotNull ErrorMessageException message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f256098a.z(message);
    }

    @Override // com.planner5d.library.widget.editor.facade.v
    public void d(@Nullable String str, @Nullable String str2) {
        v.a.a(this, str, str2);
    }

    @Override // com.planner5d.library.widget.editor.facade.g
    public void e() {
        this.f256100c.c(this.f256103f);
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void h(boolean z10, boolean z11) {
        synchronized (this.f256099b.e()) {
            this.f256099b.x(false);
            this.f256099b.z(z11);
            int iO = this.f256099b.o(z10);
            if (iO == 0 || (iO == 1 && z10)) {
                this.f256102e.f();
                n();
            }
            Unit unit = Unit.f312394a;
        }
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    @Nullable
    public com.planner5d.library.widget.editor.projectresources.j j() {
        return this.f256098a.f(k());
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    @NotNull
    public Observable<com.planner5d.library.widget.editor.a.b> m() {
        return this.f256098a.u(i(), l(), this.f256104g, g());
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void n() {
        if (!o3.b()) {
            this.f256105h.post(new Runnable() { // from class: com.planner5d.library.widget.editor.facade.f0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.o(this.f256095a);
                }
            });
            return;
        }
        c0 c0Var = this.f256098a;
        e eVar = this.f256106i;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            eVar = null;
        }
        androidx.fragment.app.s sVarA = eVar.a();
        final w wVar = this.f256102e;
        c0Var.i(sVarA, new Runnable() { // from class: com.planner5d.library.widget.editor.facade.g0
            @Override // java.lang.Runnable
            public final void run() {
                wVar.N();
            }
        });
    }

    public final void p(@NotNull e contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f256106i = contextProvider;
        com.planner5d.library.widget.editor.helper.selector.a aVar = this.f256101d;
        if (aVar instanceof com.planner5d.library.widget.editor.helper.selector.e) {
            ((com.planner5d.library.widget.editor.helper.selector.e) aVar).a(contextProvider, this, this.f256099b, this, this.f256102e);
        }
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void r() {
        this.f256098a.w(g());
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void u() {
        this.f256098a.x(k());
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void w(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b viewOptions) {
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        this.f256098a.y(viewOptions, k());
    }

    @Override // com.planner5d.library.widget.editor.facade.e0
    public void x() {
        this.f256098a.t(k(), g(), this.f256101d);
    }

    @Override // com.planner5d.library.widget.editor.facade.f
    public boolean z1() {
        return this.f256098a.n(new com.planner5d.library.services.utility.j(this.f256099b.d()), this.f256099b.l());
    }
}
