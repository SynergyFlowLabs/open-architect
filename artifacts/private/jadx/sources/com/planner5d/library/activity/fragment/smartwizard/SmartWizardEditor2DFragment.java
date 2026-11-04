package com.planner5d.library.activity.fragment.smartwizard;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import com.planner5d.library.activity.fragment.smartwizard.s;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.editor.helper.g1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSmartWizardEditor2DFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartWizardEditor2DFragment.kt\ncom/planner5d/library/activity/fragment/smartwizard/SmartWizardEditor2DFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public abstract class SmartWizardEditor2DFragment<T extends s> extends Fragment implements c0, g1.j {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f135363a = g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.smartwizard.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SmartWizardEditor2DFragment.z(this.f135595a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.editor2d.o f135364b = new com.planner5d.library.widget.editor.editor2d.o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f135365c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CompositeSubscription f135366d = new CompositeSubscription();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f135367e;

    @ij.a
    public com.planner5d.library.widget.editor.facade.s editorFacadeFactory;

    public static final class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f135368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super Void> f135369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SmartWizardEditor2DFragment<T> f135370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ItemProject f135371g;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment$a$a, reason: collision with other inner class name */
        public static final class C1487a extends com.planner5d.library.services.rx.e<Void> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ SmartWizardEditor2DFragment<T> f135372d;

            C1487a(SmartWizardEditor2DFragment<T> smartWizardEditor2DFragment) {
                this.f135372d = smartWizardEditor2DFragment;
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                this.f135372d.K();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Subscriber<? super Void> subscriber, SmartWizardEditor2DFragment<T> smartWizardEditor2DFragment, ItemProject itemProject) {
            super(subscriber);
            this.f135369e = subscriber;
            this.f135370f = smartWizardEditor2DFragment;
            this.f135371g = itemProject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Subscriber subscriber) {
            subscriber.onNext(null);
            subscriber.onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            if (this.f135370f.getView() == null) {
                return;
            }
            this.f135370f.J(this.f135371g);
            this.f135368d = true;
            SmartWizardEditor2DFragment<T> smartWizardEditor2DFragment = this.f135370f;
            Observable<Void> observableV = smartWizardEditor2DFragment.getEditor().V();
            final Subscriber<? super Void> subscriber = this.f135369e;
            Subscription subscriptionSubscribe = observableV.doOnTerminate(new Action0() { // from class: com.planner5d.library.activity.fragment.smartwizard.j
                @Override // rx.functions.Action0
                public final void call() {
                    SmartWizardEditor2DFragment.a.f(subscriber);
                }
            }).subscribe((Subscriber<? super Void>) new C1487a(this.f135370f));
            Intrinsics.checkNotNullExpressionValue(subscriptionSubscribe, "subscribe(...)");
            smartWizardEditor2DFragment.y(subscriptionSubscribe);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (this.f135368d) {
                return;
            }
            this.f135369e.onCompleted();
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135373a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135373a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135373a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135373a.invoke(obj);
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

    public static final class c extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.a.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber<com.planner5d.library.widget.editor.a.b> f135374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Subscriber<com.planner5d.library.widget.editor.a.b> subscriber) {
            super(subscriber);
            this.f135374d = subscriber;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f135374d.onCompleted();
        }
    }

    public static final class d implements com.planner5d.library.widget.editor.facade.c {
        d() {
        }

        @Override // com.planner5d.library.widget.editor.facade.c
        public boolean s(Item item, boolean z10, t3.d triggerRule) {
            Intrinsics.checkNotNullParameter(triggerRule, "triggerRule");
            return item instanceof ItemWindow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SmartWizardEditor2DFragment smartWizardEditor2DFragment, ItemProject itemProject, Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Subscription subscriptionSubscribe = smartWizardEditor2DFragment.f135364b.v(itemProject, smartWizardEditor2DFragment.B().G().j(), !smartWizardEditor2DFragment.f135367e, true).subscribe((Subscriber<? super Void>) new a(subscriber, smartWizardEditor2DFragment, itemProject));
        Intrinsics.checkNotNullExpressionValue(subscriptionSubscribe, "subscribe(...)");
        smartWizardEditor2DFragment.y(subscriptionSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(SmartWizardEditor2DFragment smartWizardEditor2DFragment, Boolean bool) {
        com.planner5d.library.widget.editor.facade.h hVarB = smartWizardEditor2DFragment.B();
        Intrinsics.checkNotNull(bool);
        hVarB.n(bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(SmartWizardEditor2DFragment smartWizardEditor2DFragment, Throwable th2) {
        if (th2 != null) {
            smartWizardEditor2DFragment.B().t();
        }
        return Unit.f312394a;
    }

    private final void L() {
        getEditor().setInteractionEnabled(this.f135367e);
        B().c(getEditor());
        com.planner5d.library.widget.editor.facade.a aVar = new com.planner5d.library.widget.editor.facade.a(this);
        B().u(aVar);
        if (this.f135367e) {
            we.c cVarE = getEditorFacadeFactory().e(B(), aVar, null, null);
            getEditor().setListeners(new com.planner5d.library.widget.editor.facade.u(B().A(), B().C(), B().D(), B().G(), getEditorFacadeFactory().g(B(), cVarE, new d())));
            B().p(cVarE);
        }
        boolean z10 = false | false;
        Subscription subscriptionSubscribe = com.planner5d.library.widget.editor.facade.h.a.a(B(), null, getViewModel(), false, null, 8, null).doOnCompleted(new Action0() { // from class: com.planner5d.library.activity.fragment.smartwizard.g
            @Override // rx.functions.Action0
            public final void call() {
                SmartWizardEditor2DFragment.M(this.f135594a);
            }
        }).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
        Intrinsics.checkNotNullExpressionValue(subscriptionSubscribe, "subscribe(...)");
        y(subscriptionSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(SmartWizardEditor2DFragment smartWizardEditor2DFragment) {
        smartWizardEditor2DFragment.getViewModel().n0(smartWizardEditor2DFragment, smartWizardEditor2DFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.widget.editor.facade.h z(SmartWizardEditor2DFragment smartWizardEditor2DFragment) {
        return smartWizardEditor2DFragment.f135367e ? smartWizardEditor2DFragment.getEditorFacadeFactory().b(smartWizardEditor2DFragment.getViewModel(), new com.planner5d.library.widget.editor.facade.x()) : smartWizardEditor2DFragment.getEditorFacadeFactory().d(smartWizardEditor2DFragment.getViewModel());
    }

    @NotNull
    protected final AtomicBoolean A() {
        return this.f135365c;
    }

    @NotNull
    protected final com.planner5d.library.widget.editor.facade.h B() {
        return (com.planner5d.library.widget.editor.facade.h) this.f135363a.getValue();
    }

    protected final boolean C() {
        return this.f135367e;
    }

    @NotNull
    protected final com.planner5d.library.widget.editor.editor2d.o D() {
        return this.f135364b;
    }

    protected void F(@Nullable Project project, @Nullable ItemProject itemProject) {
        B().h(project, itemProject);
    }

    protected final void I(boolean z10) {
        this.f135367e = z10;
    }

    protected void J(@Nullable ItemProject itemProject) {
    }

    protected final void K() {
        Subscription subscriptionSubscribe = getEditor().T(this.f135364b).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new c(com.planner5d.library.widget.editor.facade.h.a.b(B(), null, 1, null)));
        Intrinsics.checkNotNullExpressionValue(subscriptionSubscribe, "subscribe(...)");
        y(subscriptionSubscribe);
    }

    @NotNull
    protected final Observable<Void> N() {
        if (this.f135365c.compareAndSet(false, true)) {
            getEditor().setVisibility(8);
            return B().L(true);
        }
        Observable<Void> observableJust = Observable.just(null);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @NotNull
    public abstract Editor2D getEditor();

    @NotNull
    public final com.planner5d.library.widget.editor.facade.s getEditorFacadeFactory() {
        com.planner5d.library.widget.editor.facade.s sVar = this.editorFacadeFactory;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editorFacadeFactory");
        return null;
    }

    @NotNull
    protected abstract T getViewModel();

    @Override // com.planner5d.library.widget.editor.helper.g1.j
    @NotNull
    public Observable<Void> loadedProject(@Nullable Project project, @Nullable final ItemProject itemProject, @Nullable Bundle bundle) {
        F(project, itemProject);
        Observable<Void> observableSubscribeOn = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.fragment.smartwizard.i
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SmartWizardEditor2DFragment.E(this.f135596a, itemProject, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        if (!Intrinsics.areEqual(getViewModel().c0().f(), Boolean.TRUE)) {
            return false;
        }
        getViewModel().k0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f135366d.unsubscribe();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        N().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getEditor().R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().t0(getArguments());
        getViewModel().r0();
        L();
        getViewModel().c0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmartWizardEditor2DFragment.G(this.f135592a, (Boolean) obj);
            }
        }));
        getViewModel().a0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SmartWizardEditor2DFragment.H(this.f135593a, (Throwable) obj);
            }
        }));
    }

    public final void setEditorFacadeFactory(@NotNull com.planner5d.library.widget.editor.facade.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.editorFacadeFactory = sVar;
    }

    protected final void y(@NotNull Subscription subscription) {
        Intrinsics.checkNotNullParameter(subscription, "<this>");
        this.f135366d.add(subscription);
    }
}
