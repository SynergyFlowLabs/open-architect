package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47014a = "ActivityRecreator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Class<?> f47015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f47016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Field f47017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f47018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f47019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final Method f47020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Handler f47021h = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f47022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f47023b;

        a(d dVar, Object obj) {
            this.f47022a = dVar;
            this.f47023b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47022a.f47028a = this.f47023b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f47024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f47025b;

        b(Application application, d dVar) {
            this.f47024a = application;
            this.f47025b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47024a.unregisterActivityLifecycleCallbacks(this.f47025b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f47026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f47027b;

        c(Object obj, Object obj2) {
            this.f47026a = obj;
            this.f47027b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f.f47018e;
                if (method != null) {
                    method.invoke(this.f47026a, this.f47027b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    f.f47019f.invoke(this.f47026a, this.f47027b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f47028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f47029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47031d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47032e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f47033f = false;

        d(@NonNull Activity activity) {
            this.f47029b = activity;
            this.f47030c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f47029b == activity) {
                this.f47029b = null;
                this.f47032e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f47032e || this.f47033f || this.f47031d || !f.h(this.f47028a, this.f47030c, activity)) {
                return;
            }
            this.f47033f = true;
            this.f47028a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f47029b == activity) {
                this.f47031d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f47015b = clsA;
        f47016c = b();
        f47017d = f();
        f47018e = d(clsA);
        f47019f = c(clsA);
        f47020g = e(clsA);
    }

    private f() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        return false;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f47017d.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f47021h.postAtFrontOfQueue(new c(f47016c.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static boolean i(@NonNull Activity activity) {
        activity.recreate();
        return true;
    }
}
