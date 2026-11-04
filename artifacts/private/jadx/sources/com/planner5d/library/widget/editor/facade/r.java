package com.planner5d.library.widget.editor.facade;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.helper.h2;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.p2;
import com.planner5d.library.widget.editor.helper.q2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorFacadeDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorFacadeDefault.kt\ncom/planner5d/library/widget/editor/facade/EditorFacadeDefault\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class r implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f256123j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y f256124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j2.a f256125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q2 f256126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.helper.selector.a f256127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f256128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2 f256129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private e f256130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.helper.i f256131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final h0 f256132i;

    static final class a implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f256133a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f256133a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f256133a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f256133a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j2.a f256134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f256135e;

        b(j2.a aVar, r rVar) {
            this.f256134d = aVar;
            this.f256135e = rVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f256134d.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f256135e.b0();
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.a.b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f256137e;

        c(Runnable runnable) {
            this.f256137e = runnable;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            onCompleted();
            r.this.f256125b.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.widget.editor.a.b bVar) {
            h2 h2Var = r.this.f256129f;
            if (h2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
                h2Var = null;
            }
            h2Var.d(bVar);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            h2 h2Var = r.this.f256129f;
            if (h2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
                h2Var = null;
            }
            h2Var.n(false);
            Runnable runnable = this.f256137e;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public r(@NotNull y synchronizer, @NotNull j2.a projectLoaderListener, @NotNull c0 interfaceManager, @NotNull q2 stateHolder, @NotNull com.planner5d.library.activity.fragment.c0 projectReloadingHelper, @NotNull com.planner5d.library.widget.editor.helper.selector.a itemSelector, @NotNull w supportingViewsController) {
        Intrinsics.checkNotNullParameter(synchronizer, "synchronizer");
        Intrinsics.checkNotNullParameter(projectLoaderListener, "projectLoaderListener");
        Intrinsics.checkNotNullParameter(interfaceManager, "interfaceManager");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(projectReloadingHelper, "projectReloadingHelper");
        Intrinsics.checkNotNullParameter(itemSelector, "itemSelector");
        Intrinsics.checkNotNullParameter(supportingViewsController, "supportingViewsController");
        this.f256124a = synchronizer;
        this.f256125b = projectLoaderListener;
        this.f256126c = stateHolder;
        this.f256127d = itemSelector;
        this.f256128e = supportingViewsController;
        com.planner5d.library.widget.editor.helper.i iVar = new com.planner5d.library.widget.editor.helper.i(projectReloadingHelper);
        this.f256131h = iVar;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.planner5d.library.widget.editor.facade.StateAccessor");
        this.f256132i = new h0(interfaceManager, this, iVar, itemSelector, supportingViewsController, projectLoaderListener, new ij.c() { // from class: com.planner5d.library.widget.editor.facade.q
            @Override // ij.c
            public final Object get() {
                return r.d0(this.f256122a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(we.c cVar, com.planner5d.library.services.l.c cVar2) {
        if (cVar2 != null) {
            cVar.l(cVar2);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V(r rVar) {
        ItemProject item = rVar.getItem();
        if (item != null) {
            return item.getNextFreeUid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(r rVar, j2.a aVar, final Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Observable<Void> observableB = rVar.f256124a.b();
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.facade.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.X((Throwable) obj);
            }
        };
        observableB.onErrorReturn(new Func1() { // from class: com.planner5d.library.widget.editor.facade.j
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return r.Y(function1, obj);
            }
        }).concatWith(k5.S()).observeOn(com.planner5d.library.services.rx.c.f224934d).doOnTerminate(new Action0() { // from class: com.planner5d.library.widget.editor.facade.k
            @Override // rx.functions.Action0
            public final void call() {
                r.Z(subscriber);
            }
        }).subscribe((Subscriber<? super Void>) new b(aVar, rVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void X(Throwable th2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Y(Function1 function1, Object obj) {
        return (Void) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(Subscriber subscriber) {
        subscriber.onCompleted();
    }

    private final void a0() {
        h2 h2Var = new h2(this.f256130g, G(), F(), w());
        this.f256129f = h2Var;
        h2Var.k(true);
        h2 h2Var2 = this.f256129f;
        if (h2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
            h2Var2 = null;
        }
        h2Var2.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        h2 h2Var = this.f256129f;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
            h2Var = null;
        }
        h2Var.l(null);
        h2Var.m(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(boolean z10, r rVar) {
        if (z10) {
            h2 h2Var = rVar.f256129f;
            if (h2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
                h2Var = null;
            }
            h2Var.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Subscriber d0(r rVar) {
        return h.a.b(rVar, null, 1, null);
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public g A() {
        return this.f256132i;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public Observable<Void> B(@Nullable Bundle bundle, @NotNull final j2.a projectLoadingListener, boolean z10, @Nullable h2 h2Var) {
        Intrinsics.checkNotNullParameter(projectLoadingListener, "projectLoadingListener");
        f(bundle);
        if (h2Var == null) {
            a0();
        } else {
            this.f256129f = h2Var;
        }
        if (z10) {
            Observable<Void> observableSubscribeOn = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.facade.o
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    r.W(this.f256119a, projectLoadingListener, (Subscriber) obj);
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
            Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
            return observableSubscribeOn;
        }
        Observable<Void> observableSubscribeOn2 = com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.widget.editor.facade.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f256118a.b0();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn2, "subscribeOn(...)");
        return observableSubscribeOn2;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public com.planner5d.library.widget.editor.helper.selector.a C() {
        return this.f256127d;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public i0.b D() {
        return this.f256132i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // com.planner5d.library.widget.editor.facade.k0
    public boolean E() {
        boolean z10;
        synchronized (this.f256126c.get().h()) {
            try {
                p2 p2Var = this.f256126c.get();
                if (p2Var.d() > 0 && !p2Var.e()) {
                    z10 = true;
                } else if (p2Var.l()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public e0 F() {
        return this.f256132i;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public f G() {
        return this.f256132i;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public Observable<Void> L(final boolean z10) {
        androidx.fragment.app.s sVarA;
        Window window;
        g(true);
        e eVar = this.f256130g;
        if (eVar != null && (sVarA = eVar.a()) != null && (window = sVarA.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        F().n();
        Observable<Void> observableH = com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.widget.editor.facade.m
            @Override // java.lang.Runnable
            public final void run() {
                r.c0(z10, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableH, "fromRunnable(...)");
        return observableH;
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    public boolean a() {
        return this.f256126c.get().k();
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @Nullable
    public com.planner5d.library.widget.editor.a b() {
        return this.f256126c.get().c();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public boolean c(@Nullable com.planner5d.library.widget.editor.a aVar) {
        if (b() == aVar) {
            return false;
        }
        this.f256126c.get().q(aVar);
        if (aVar == null) {
            return true;
        }
        aVar.setListeners(new u(A(), C(), D(), G(), null, 16, null));
        return true;
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void clear() {
        this.f256126c.get().a();
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @Nullable
    public Bundle d() {
        return this.f256126c.get().b();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    @NotNull
    public Object e() {
        return this.f256126c.get().h();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void f(@Nullable Bundle bundle) {
        this.f256126c.get().n(bundle);
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void g(boolean z10) {
        this.f256126c.get().u(z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @Nullable
    public ItemProject getItem() {
        return this.f256126c.get().g();
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @Nullable
    public Project getModel() {
        return this.f256126c.get().i();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void h(@Nullable Project project, @Nullable ItemProject itemProject) {
        this.f256126c.get().p(project, itemProject);
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    public boolean i() {
        return this.f256126c.get().m();
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @NotNull
    public ProviderUid j() {
        return new ProviderUid() { // from class: com.planner5d.library.widget.editor.facade.p
            @Override // com.planner5d.library.model.item.ProviderUid
            public final String createUid() {
                return r.V(this.f256121a);
            }
        };
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void k(@Nullable String str) {
        this.f256126c.get().t(str);
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    public boolean l() {
        return this.f256126c.get().f();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void m(boolean z10) {
        this.f256126c.get().s(z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    public void n(boolean z10) {
        h2 h2Var = this.f256129f;
        h2 h2Var2 = null;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
            h2Var = null;
        }
        h2Var.m(z10);
        if (z10) {
            h2 h2Var3 = this.f256129f;
            if (h2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
            } else {
                h2Var2 = h2Var3;
            }
            h2Var2.o();
            return;
        }
        h2 h2Var4 = this.f256129f;
        if (h2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
        } else {
            h2Var2 = h2Var4;
        }
        h2Var2.b();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public int o(boolean z10) {
        return this.f256126c.get().w(z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    public void p(@NotNull final we.c historyManager) {
        o0 o0VarF;
        Intrinsics.checkNotNullParameter(historyManager, "historyManager");
        v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
        e eVar = this.f256130g;
        if (eVar == null || (o0VarF = eVar.F()) == null) {
            return;
        }
        aVar.k(o0VarF, new a(new Function1() { // from class: com.planner5d.library.widget.editor.facade.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.U(historyManager, (com.planner5d.library.services.l.c) obj);
            }
        }));
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public Subscriber<com.planner5d.library.widget.editor.a.b> q(@Nullable Runnable runnable) {
        h2 h2Var = this.f256129f;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperPreloader");
            h2Var = null;
        }
        h2Var.n(true);
        return new c(runnable);
    }

    @Override // com.planner5d.library.widget.editor.facade.k0
    @Nullable
    public String r() {
        return this.f256126c.get().j();
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void s() {
        this.f256126c.get().o();
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    public void t() {
        this.f256131h.b(getModel());
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    public void u(@NotNull e contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f256130g = contextProvider;
        this.f256132i.p(contextProvider);
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public w v() {
        return this.f256128e;
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    @NotNull
    public v w() {
        return this.f256132i;
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void x(boolean z10) {
        this.f256126c.get().v(z10);
    }

    @Override // com.planner5d.library.widget.editor.facade.h
    public boolean y() {
        return this.f256131h.a(getModel());
    }

    @Override // com.planner5d.library.widget.editor.facade.l0
    public void z(boolean z10) {
        this.f256126c.get().r(z10);
    }
}
