package io.customer.sdk.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.c0;
import eh.d;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j0<b> f288618a = q0.b(1, 0, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f288619b = d.f274883c.y().b();

    /* JADX INFO: renamed from: io.customer.sdk.lifecycle.a$a, reason: collision with other inner class name */
    @f(c = "io.customer.sdk.lifecycle.CustomerIOActivityLifecycleCallbacks$subscribe$1", f = "CustomerIOActivityLifecycleCallbacks.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class C1964a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f288621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<s0, o0<b>, kotlin.coroutines.d<? super Unit>, Object> f288622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f288623d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1964a(n<? super s0, ? super o0<b>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, a aVar, kotlin.coroutines.d<? super C1964a> dVar) {
            super(2, dVar);
            this.f288622c = nVar;
            this.f288623d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1964a c1964a = new C1964a(this.f288622c, this.f288623d, dVar);
            c1964a.f288621b = obj;
            return c1964a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288620a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f288621b;
                n<s0, o0<b>, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f288622c;
                j0 j0Var = this.f288623d.f288618a;
                this.f288620a = 1;
                if (nVar.invoke(s0Var, j0Var, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1964a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final boolean c(Activity activity, c0.a aVar, Bundle bundle) {
        return this.f288618a.f(new b(new WeakReference(activity), aVar, bundle));
    }

    static /* synthetic */ boolean d(a aVar, Activity activity, c0.a aVar2, Bundle bundle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        return aVar.c(activity, aVar2, bundle);
    }

    public final void b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void e(@NotNull n<? super s0, ? super o0<b>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        k.f(this.f288619b, null, null, new C1964a(block, this, null), 3, null);
    }

    public final void f(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.unregisterActivityLifecycleCallbacks(this);
        t0.f(this.f288619b, null, 1, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        c(activity, c0.a.ON_CREATE, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(this, activity, c0.a.ON_DESTROY, null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(this, activity, c0.a.ON_PAUSE, null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(this, activity, c0.a.ON_RESUME, null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(this, activity, c0.a.ON_START, null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d(this, activity, c0.a.ON_STOP, null, 4, null);
    }
}
