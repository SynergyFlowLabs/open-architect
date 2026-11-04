package com.planner5d.library.activity.fragment;

import com.planner5d.library.model.manager.y1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func0;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
@SourceDebugExtension({"SMAP\nFragmentControllerNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentControllerNavigator.kt\ncom/planner5d/library/activity/fragment/FragmentControllerNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f136650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f136651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ij.c<Observable<Void>> f136652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.activity.helper.event.content.c> f136653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f136654e;

    @ij.a
    public x(@NotNull y1 menuManager, @NotNull j contentRequestLauncherService) {
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(contentRequestLauncherService, "contentRequestLauncherService");
        this.f136650a = menuManager;
        this.f136651b = contentRequestLauncherService;
        this.f136652c = new ij.c() { // from class: com.planner5d.library.activity.fragment.u
            @Override // ij.c
            public final Object get() {
                return x.l();
            }
        };
        this.f136653d = new ArrayList();
        this.f136654e = new Object();
    }

    public static /* synthetic */ void g(x xVar, com.planner5d.library.activity.helper.event.content.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        xVar.f(cVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable h(ij.c cVar, final x xVar, final com.planner5d.library.activity.helper.event.content.c cVar2) {
        return ((Observable) cVar.get()).observeOn(com.planner5d.library.services.rx.c.f224934d).finallyDo(new Action0() { // from class: com.planner5d.library.activity.fragment.v
            @Override // rx.functions.Action0
            public final void call() {
                x.i(this.f136645a, cVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(x xVar, com.planner5d.library.activity.helper.event.content.c cVar) {
        xVar.f136651b.a(cVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable l() {
        return Observable.empty();
    }

    @Nullable
    public final com.planner5d.library.activity.helper.event.content.c d(@NotNull Class<? extends FragmentController> target) {
        com.planner5d.library.activity.helper.event.content.a aVarI;
        Intrinsics.checkNotNullParameter(target, "target");
        com.planner5d.library.activity.helper.event.content.a aVarF = this.f136650a.f();
        if (aVarF == null || (aVarI = aVarF.i(target)) == null) {
            return null;
        }
        return new com.planner5d.library.activity.helper.event.content.c(aVarI);
    }

    @oj.j
    public final void e(@NotNull com.planner5d.library.activity.helper.event.content.c destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        g(this, destination, false, 2, null);
    }

    @oj.j
    public final void f(@NotNull final com.planner5d.library.activity.helper.event.content.c destination, boolean z10) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (z10) {
            destination.j(this.f136650a.a());
        }
        synchronized (this.f136654e) {
            try {
                final ij.c<Observable<Void>> cVar = this.f136652c;
                if (cVar == null) {
                    this.f136653d.add(destination);
                } else {
                    this.f136652c = null;
                    Observable.defer(new Func0() { // from class: com.planner5d.library.activity.fragment.w
                        @Override // rx.functions.Func0, java.util.concurrent.Callable
                        public final Object call() {
                            return x.h(cVar, this, destination);
                        }
                    }).subscribeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j() {
        com.planner5d.library.activity.helper.event.content.a aVarF = this.f136650a.f();
        if (aVarF == null) {
            return false;
        }
        g(this, new com.planner5d.library.activity.helper.event.content.c(aVarF), false, 2, null);
        return true;
    }

    @kotlin.l(message = "This is a temporary method to be used for migration to fragments and will be dropped eventually")
    @NotNull
    public final x k(@NotNull ij.c<Observable<Void>> providerStop) {
        Intrinsics.checkNotNullParameter(providerStop, "providerStop");
        synchronized (this.f136654e) {
            try {
                this.f136652c = providerStop;
                com.planner5d.library.activity.helper.event.content.c cVar = (com.planner5d.library.activity.helper.event.content.c) CollectionsKt.removeFirstOrNull(this.f136653d);
                if (cVar != null) {
                    g(this, cVar, false, 2, null);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }
}
