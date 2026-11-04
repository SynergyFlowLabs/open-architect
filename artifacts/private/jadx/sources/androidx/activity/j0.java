package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1747#2,3:403\n533#2,6:406\n533#2,6:412\n533#2,6:418\n533#2,6:424\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n109#1:403,3\n221#1:406,6\n240#1:412,6\n257#1:418,6\n274#1:424,6\n*E\n"})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Runnable f9920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.core.util.e<Boolean> f9921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<i0> f9922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private i0 f9923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private OnBackInvokedCallback f9924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private OnBackInvokedDispatcher f9925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9927h;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.activity.d, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.activity.d backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            j0.this.r(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.activity.d dVar) {
            c(dVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.activity.d, Unit> {
        b() {
            super(1);
        }

        public final void c(androidx.activity.d backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            j0.this.q(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.activity.d dVar) {
            c(dVar);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            j0.this.p();
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            j0.this.o();
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            j0.this.p();
        }
    }

    @w0(33)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f9933a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 function0) {
            function0.invoke();
        }

        @NotNull
        public final OnBackInvokedCallback b(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.k0
                public final void onBackInvoked() {
                    j0.f.c(onBackInvoked);
                }
            };
        }

        public final void d(@NotNull Object dispatcher, int i10, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @w0(34)
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f9934a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<androidx.activity.d, Unit> f9935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<androidx.activity.d, Unit> f9936b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f9937c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f9938d;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super androidx.activity.d, Unit> function1, Function1<? super androidx.activity.d, Unit> function2, Function0<Unit> function0, Function0<Unit> function3) {
                this.f9935a = function1;
                this.f9936b = function2;
                this.f9937c = function0;
                this.f9938d = function3;
            }

            public void onBackCancelled() {
                this.f9938d.invoke();
            }

            public void onBackInvoked() {
                this.f9937c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f9936b.invoke(new androidx.activity.d(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f9935a.invoke(new androidx.activity.d(backEvent));
            }
        }

        private g() {
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super androidx.activity.d, Unit> onBackStarted, @NotNull Function1<? super androidx.activity.d, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class h implements androidx.lifecycle.j0, androidx.activity.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.lifecycle.c0 f9939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final i0 f9940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private androidx.activity.e f9941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f9942d;

        public h(@NotNull j0 j0Var, @NotNull androidx.lifecycle.c0 lifecycle, i0 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f9942d = j0Var;
            this.f9939a = lifecycle;
            this.f9940b = onBackPressedCallback;
            lifecycle.c(this);
        }

        @Override // androidx.activity.e
        public void cancel() {
            this.f9939a.g(this);
            this.f9940b.removeCancellable(this);
            androidx.activity.e eVar = this.f9941c;
            if (eVar != null) {
                eVar.cancel();
            }
            this.f9941c = null;
        }

        @Override // androidx.lifecycle.j0
        public void e(@NotNull androidx.lifecycle.o0 source, @NotNull androidx.lifecycle.c0.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == androidx.lifecycle.c0.a.ON_START) {
                this.f9941c = this.f9942d.j(this.f9940b);
                return;
            }
            if (event == androidx.lifecycle.c0.a.ON_STOP) {
                androidx.activity.e eVar = this.f9941c;
                if (eVar != null) {
                    eVar.cancel();
                }
            } else if (event == androidx.lifecycle.c0.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private final class i implements androidx.activity.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final i0 f9943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f9944b;

        public i(@NotNull j0 j0Var, i0 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f9944b = j0Var;
            this.f9943a = onBackPressedCallback;
        }

        @Override // androidx.activity.e
        public void cancel() {
            this.f9944b.f9922c.remove(this.f9943a);
            if (Intrinsics.areEqual(this.f9944b.f9923d, this.f9943a)) {
                this.f9943a.handleOnBackCancelled();
                this.f9944b.f9923d = null;
            }
            this.f9943a.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.f9943a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f9943a.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        j(Object obj) {
            super(0, obj, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((j0) this.receiver).u();
        }
    }

    /* synthetic */ class k extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        k(Object obj) {
            super(0, obj, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((j0) this.receiver).u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public j0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void o() {
        i0 i0VarPrevious;
        i0 i0Var = this.f9923d;
        if (i0Var == null) {
            ArrayDeque<i0> arrayDeque = this.f9922c;
            ListIterator<i0> listIterator = arrayDeque.listIterator(arrayDeque.size());
            do {
                if (!listIterator.hasPrevious()) {
                    i0VarPrevious = null;
                    break;
                }
                i0VarPrevious = listIterator.previous();
            } while (!i0VarPrevious.isEnabled());
            i0Var = i0VarPrevious;
        }
        this.f9923d = null;
        if (i0Var != null) {
            i0Var.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void q(androidx.activity.d dVar) {
        i0 i0VarPrevious;
        i0 i0Var = this.f9923d;
        if (i0Var == null) {
            ArrayDeque<i0> arrayDeque = this.f9922c;
            ListIterator<i0> listIterator = arrayDeque.listIterator(arrayDeque.size());
            do {
                if (!listIterator.hasPrevious()) {
                    i0VarPrevious = null;
                    break;
                }
                i0VarPrevious = listIterator.previous();
            } while (!i0VarPrevious.isEnabled());
            i0Var = i0VarPrevious;
        }
        if (i0Var != null) {
            i0Var.handleOnBackProgressed(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.l0
    public final void r(androidx.activity.d dVar) {
        i0 i0VarPrevious;
        ArrayDeque<i0> arrayDeque = this.f9922c;
        ListIterator<i0> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                i0VarPrevious = null;
                break;
            }
            i0VarPrevious = listIterator.previous();
        } while (!i0VarPrevious.isEnabled());
        i0 i0Var = i0VarPrevious;
        if (this.f9923d != null) {
            o();
        }
        this.f9923d = i0Var;
        if (i0Var != null) {
            i0Var.handleOnBackStarted(dVar);
        }
    }

    @w0(33)
    private final void t(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f9925f;
        OnBackInvokedCallback onBackInvokedCallback = this.f9924e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f9926g) {
                f.f9933a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f9926g = true;
            } else if (!z10 && this.f9926g) {
                f.f9933a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f9926g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        boolean z10 = this.f9927h;
        ArrayDeque<i0> arrayDeque = this.f9922c;
        boolean z11 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<i0> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f9927h = z11;
        if (z11 != z10) {
            androidx.core.util.e<Boolean> eVar = this.f9921b;
            if (eVar != null) {
                eVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                t(z11);
            }
        }
    }

    @androidx.annotation.l0
    public final void h(@NotNull i0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    @androidx.annotation.l0
    public final void i(@NotNull androidx.lifecycle.o0 owner, @NotNull i0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.c0 lifecycle = owner.getLifecycle();
        if (lifecycle.d() == androidx.lifecycle.c0.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new h(this, lifecycle, onBackPressedCallback));
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
    }

    @androidx.annotation.l0
    @NotNull
    public final androidx.activity.e j(@NotNull i0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f9922c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(iVar);
        u();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new k(this));
        return iVar;
    }

    @l1
    @androidx.annotation.l0
    public final void k() {
        o();
    }

    @l1
    @androidx.annotation.l0
    public final void l(@NotNull androidx.activity.d backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        q(backEvent);
    }

    @l1
    @androidx.annotation.l0
    public final void m(@NotNull androidx.activity.d backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        r(backEvent);
    }

    @androidx.annotation.l0
    public final boolean n() {
        return this.f9927h;
    }

    @androidx.annotation.l0
    public final void p() {
        i0 i0VarPrevious;
        i0 i0Var = this.f9923d;
        if (i0Var == null) {
            ArrayDeque<i0> arrayDeque = this.f9922c;
            ListIterator<i0> listIterator = arrayDeque.listIterator(arrayDeque.size());
            do {
                if (!listIterator.hasPrevious()) {
                    i0VarPrevious = null;
                    break;
                }
                i0VarPrevious = listIterator.previous();
            } while (!i0VarPrevious.isEnabled());
            i0Var = i0VarPrevious;
        }
        this.f9923d = null;
        if (i0Var != null) {
            i0Var.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f9920a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @w0(33)
    public final void s(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f9925f = invoker;
        t(this.f9927h);
    }

    public j0(@Nullable Runnable runnable, @Nullable androidx.core.util.e<Boolean> eVar) {
        this.f9920a = runnable;
        this.f9921b = eVar;
        this.f9922c = new ArrayDeque<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f9924e = i10 >= 34 ? g.f9934a.a(new a(), new b(), new c(), new d()) : f.f9933a.b(new e());
        }
    }

    @oj.j
    public j0(@Nullable Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ j0(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
