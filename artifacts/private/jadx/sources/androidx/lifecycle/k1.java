package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class k1 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f52422b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f52423c = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private a f52424a;

    public interface a {
        void l();

        void m();

        void n();
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void c(Activity activity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.n
        public final void a(@NotNull Activity activity, @NotNull c0.a event) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof s0) {
                ((s0) activity).getLifecycle().o(event);
                return;
            }
            if (activity instanceof o0) {
                c0 lifecycle = ((o0) activity).getLifecycle();
                if (lifecycle instanceof q0) {
                    ((q0) lifecycle).o(event);
                }
            }
        }

        @oj.i(name = "get")
        @NotNull
        public final k1 b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(k1.f52423c);
            Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (k1) fragmentFindFragmentByTag;
        }

        @oj.n
        public final void d(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            c.Companion.a(activity);
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(k1.f52423c) == null) {
                fragmentManager.beginTransaction().add(new k1(), k1.f52423c).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    @androidx.annotation.w0(29)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @oj.n
            public final void a(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private a() {
            }
        }

        @oj.n
        public static final void registerIn(@NotNull Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.a(activity, c0.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private final void a(c0.a aVar) {
    }

    @oj.n
    public static final void b(@NotNull Activity activity, @NotNull c0.a aVar) {
        f52422b.a(activity, aVar);
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.n();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.l();
        }
    }

    private final void e(a aVar) {
        if (aVar != null) {
            aVar.m();
        }
    }

    @oj.i(name = "get")
    @NotNull
    public static final k1 f(@NotNull Activity activity) {
        return f52422b.b(activity);
    }

    @oj.n
    public static final void g(@NotNull Activity activity) {
        f52422b.d(activity);
    }

    public final void h(@Nullable a aVar) {
        this.f52424a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f52424a);
        a(c0.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(c0.a.ON_DESTROY);
        int i10 = 4 | 0;
        this.f52424a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(c0.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f52424a);
        a(c0.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f52424a);
        a(c0.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(c0.a.ON_STOP);
    }
}
