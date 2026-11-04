package com.planner5d.library.activity.fragment.dialog;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.o3;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
@SourceDebugExtension({"SMAP\nDialogLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogLauncher.kt\ncom/planner5d/library/activity/fragment/dialog/DialogLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,141:1\n1#2:142\n318#3,11:143\n*S KotlinDebug\n*F\n+ 1 DialogLauncher.kt\ncom/planner5d/library/activity/fragment/dialog/DialogLauncher\n*L\n87#1:143,11\n*E\n"})
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.d0 f132109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u1 f132110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private a<?> f132111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f132112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private WeakReference<FragmentManager> f132113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f132114f;

    @SourceDebugExtension({"SMAP\nDialogLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogLauncher.kt\ncom/planner5d/library/activity/fragment/dialog/DialogLauncher$Launch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,141:1\n1#2:142\n171#3,8:143\n*S KotlinDebug\n*F\n+ 1 DialogLauncher.kt\ncom/planner5d/library/activity/fragment/dialog/DialogLauncher$Launch\n*L\n134#1:143,8\n*E\n"})
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k f132115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<? extends Dialog<T>> f132116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f132117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private u<T> f132118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Object f132119e;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.DialogLauncher$Launch$launch$$inlined$executeOnMainThread$1", f = "DialogLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$executeOnMainThread$1\n+ 2 DialogLauncher.kt\ncom/planner5d/library/activity/fragment/dialog/DialogLauncher$Launch\n*L\n1#1,176:1\n135#2,2:177\n*E\n"})
        public static final class C1455a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f132120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f132121b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1455a(kotlin.coroutines.d dVar, a aVar) {
                super(2, dVar);
                this.f132121b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1455a(dVar, this.f132121b);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f132120a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f132121b.f132115a.h(this.f132121b);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1455a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public a(@NotNull k launcher, @NotNull Class<? extends Dialog<T>> fragment) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f132115a = launcher;
            this.f132116b = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(u uVar, Object obj) {
            if (obj != null) {
                uVar.a(obj);
            }
        }

        @Nullable
        public final Bundle c() {
            return this.f132117c;
        }

        @Nullable
        public final Object d() {
            return this.f132119e;
        }

        @NotNull
        public final Class<? extends Dialog<T>> e() {
            return this.f132116b;
        }

        @Nullable
        public final u<T> f() {
            return this.f132118d;
        }

        @androidx.annotation.d
        public final void g() {
            com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
            if (o3.b()) {
                this.f132115a.h(this);
            } else {
                kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.a(), null, new C1455a(null, this), 2, null);
            }
        }

        @NotNull
        public final a<T> h(@Nullable Bundle bundle) {
            this.f132117c = bundle;
            return this;
        }

        @NotNull
        public final a<T> i(@NotNull com.planner5d.library.services.utility.i argumentsBuilder) {
            Intrinsics.checkNotNullParameter(argumentsBuilder, "argumentsBuilder");
            return h(argumentsBuilder.a());
        }

        public final void j(@Nullable Bundle bundle) {
            this.f132117c = bundle;
        }

        @NotNull
        public final a<T> k(@Nullable Object obj) {
            this.f132119e = obj;
            return this;
        }

        public final void l(@Nullable Object obj) {
            this.f132119e = obj;
        }

        @NotNull
        public final a<T> m(@Nullable u<T> uVar) {
            this.f132118d = uVar;
            return this;
        }

        public final void n(@Nullable u<T> uVar) {
            this.f132118d = uVar;
        }

        @NotNull
        public final a<T> o(@NotNull final u<T> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f132118d = new u() { // from class: com.planner5d.library.activity.fragment.dialog.j
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    k.a.p(listener, obj);
                }
            };
            return this;
        }
    }

    static final class b implements Function1<Throwable, Unit> {
        b() {
        }

        public final void c(Throwable th2) {
            k.this.f132114f.set(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    static final class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentManager f132123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Bundle> f132124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f132125c;

        static final class a implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132126a = new a();

            a() {
            }

            public final void c(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(FragmentManager fragmentManager, kotlinx.coroutines.n<? super Bundle> nVar, k kVar) {
            this.f132123a = fragmentManager;
            this.f132124b = nVar;
            this.f132125c = kVar;
        }

        @Override // androidx.fragment.app.o0
        public final void a(String str, Bundle result) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(result, "result");
            this.f132123a.b(com.planner5d.library.services.r.purchase_request_key.f224891a);
            if (this.f132124b.isActive()) {
                this.f132124b.M(result.getBundle(com.planner5d.library.services.r.result_bundle_key.f224891a), a.f132126a);
            }
            this.f132125c.f132114f.set(false);
        }
    }

    @ij.a
    public k(@NotNull com.planner5d.library.model.manager.statistics.d0 statisticsManager, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f132109a = statisticsManager;
        this.f132110b = logRecordManager;
        this.f132113e = new WeakReference<>(null);
        this.f132114f = new AtomicBoolean(false);
    }

    private final void j() {
        FragmentManager fragmentManager;
        a<?> aVar;
        if (!this.f132112d || (fragmentManager = this.f132113e.get()) == null) {
            return;
        }
        if (fragmentManager.a1()) {
            fragmentManager = null;
        }
        if (fragmentManager == null || (aVar = this.f132111c) == null) {
            return;
        }
        this.f132111c = null;
        k(fragmentManager, aVar);
    }

    private final <T> void k(FragmentManager fragmentManager, a<T> aVar) {
        try {
            Dialog<T> dialogNewInstance = aVar.e().newInstance();
            dialogNewInstance.setup(aVar.c(), aVar.f(), aVar.d());
            dialogNewInstance.show(fragmentManager, com.planner5d.library.services.r.dialog.f224891a);
            this.f132109a.a(aVar.e());
        } catch (Throwable th2) {
            this.f132110b.b("dialog_open", aVar.e().getName(), th2);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.l
    public void a(@NotNull androidx.fragment.app.m dialog, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(tag, "tag");
        FragmentManager fragmentManager = this.f132113e.get();
        if (fragmentManager != null && !fragmentManager.i1()) {
            dialog.show(fragmentManager, tag);
        }
    }

    @NotNull
    public final <T> a<T> c(@NotNull Class<? extends Dialog<T>> fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new a<>(this, fragment);
    }

    public final void d() {
        FragmentManager fragmentManager = this.f132113e.get();
        Fragment fragmentW0 = fragmentManager != null ? fragmentManager.w0(com.planner5d.library.services.r.dialog.f224891a) : null;
        androidx.fragment.app.m mVar = fragmentW0 instanceof androidx.fragment.app.m ? (androidx.fragment.app.m) fragmentW0 : null;
        if (mVar != null) {
            mVar.dismissAllowingStateLoss();
        }
    }

    @Nullable
    public final Object e(@NotNull androidx.lifecycle.o0 o0Var, @NotNull androidx.fragment.app.m mVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super Bundle> dVar) {
        FragmentManager fragmentManager = this.f132113e.get();
        if (fragmentManager == null) {
            return null;
        }
        if (!this.f132114f.compareAndSet(false, true)) {
            timber.log.b.f381052a.x("The dialog is already opened", new Object[0]);
            return null;
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new b());
        fragmentManager.c(com.planner5d.library.services.r.purchase_request_key.f224891a, o0Var, new c(fragmentManager, pVar, this));
        if (!fragmentManager.i1()) {
            mVar.show(fragmentManager, str);
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : (Bundle) objU;
    }

    public final void f() {
        this.f132112d = false;
    }

    public final void g() {
        this.f132112d = true;
        j();
    }

    public final void h(@NotNull a<?> launch) {
        Intrinsics.checkNotNullParameter(launch, "launch");
        this.f132111c = launch;
        j();
    }

    @NotNull
    public final k i(@NotNull androidx.fragment.app.s activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f132113e = new WeakReference<>(activity.getSupportFragmentManager());
        return this;
    }
}
