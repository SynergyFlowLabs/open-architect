package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f111948a = 0.33333334f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f111949b = 0.6666667f;

    @w0(34)
    private static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Activity> f111950a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f111951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private UiModeManager$ContrastChangeListener f111952c;

        /* JADX INFO: renamed from: com.google.android.material.color.d$a$a, reason: collision with other inner class name */
        class C0983a implements UiModeManager$ContrastChangeListener {
            C0983a() {
            }

            public void onContrastChanged(float f10) {
                Iterator it = a.this.f111950a.iterator();
                while (it.hasNext()) {
                    ((Activity) it.next()).recreate();
                }
            }
        }

        a(e eVar) {
            this.f111951b = eVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @p0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            this.f111950a.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.f111952c != null && this.f111950a.isEmpty()) {
                uiModeManager.removeContrastChangeListener(this.f111952c);
                this.f111952c = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @p0 Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.f111950a.isEmpty() && this.f111952c == null) {
                this.f111952c = new C0983a();
                uiModeManager.addContrastChangeListener(androidx.core.content.d.o(activity.getApplicationContext()), this.f111952c);
            }
            this.f111950a.add(activity);
            if (uiModeManager != null) {
                d.b(activity, this.f111951b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    private d() {
    }

    public static void a(@NonNull Application application, @NonNull e eVar) {
        if (d()) {
            application.registerActivityLifecycleCallbacks(new a(eVar));
        }
    }

    public static void b(@NonNull Activity activity, @NonNull e eVar) {
        int iC;
        if (d() && (iC = c(activity, eVar)) != 0) {
            y.a(activity, iC);
        }
    }

    private static int c(Context context, e eVar) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (d() && uiModeManager != null) {
            float contrast = uiModeManager.getContrast();
            int iB = eVar.b();
            int iA = eVar.a();
            if (contrast >= f111949b) {
                if (iA == 0) {
                }
            }
            if (contrast >= f111948a) {
                return iB == 0 ? iA : iB;
            }
        }
        return 0;
    }

    @androidx.annotation.k(api = 34)
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public static Context e(@NonNull Context context, @NonNull e eVar) {
        int iC;
        if (d() && (iC = c(context, eVar)) != 0) {
            return new ContextThemeWrapper(context, iC);
        }
        return context;
    }
}
