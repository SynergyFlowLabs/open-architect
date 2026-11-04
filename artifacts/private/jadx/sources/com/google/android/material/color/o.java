package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import com.google.android.material.color.utilities.f6;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f112036a = {r6.a.c.f359514r6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f112037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e.a({"PrivateApi"})
    private static final c f112038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, c> f112039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, c> f112040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f112041f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f112042g;

    class a implements c {
        a() {
        }

        @Override // com.google.android.material.color.o.c
        public boolean b() {
            return true;
        }
    }

    class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f112043a;

        b() {
        }

        @Override // com.google.android.material.color.o.c
        public boolean b() {
            if (this.f112043a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l10 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l10.longValue();
                    this.f112043a = l10;
                } catch (Exception unused) {
                    this.f112043a = -1L;
                }
            }
            return this.f112043a.longValue() >= 40100;
        }
    }

    private interface c {
        boolean b();
    }

    private static class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f112044a;

        d(@NonNull p pVar) {
            this.f112044a = pVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @p0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @p0 Bundle bundle) {
            o.j(activity, this.f112044a);
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

    public interface e {
        void a(@NonNull Activity activity);
    }

    public interface f {
        boolean a(@NonNull Activity activity, @g1 int i10);
    }

    static {
        a aVar = new a();
        f112037b = aVar;
        b bVar = new b();
        f112038c = bVar;
        HashMap map = new HashMap();
        map.put("fcnt", aVar);
        map.put("google", aVar);
        map.put("hmd global", aVar);
        map.put("infinix", aVar);
        map.put("infinix mobility limited", aVar);
        map.put("itel", aVar);
        map.put("kyocera", aVar);
        map.put("lenovo", aVar);
        map.put("lge", aVar);
        map.put("meizu", aVar);
        map.put("motorola", aVar);
        map.put("nothing", aVar);
        map.put("oneplus", aVar);
        map.put("oppo", aVar);
        map.put("realme", aVar);
        map.put("robolectric", aVar);
        map.put("samsung", bVar);
        map.put("sharp", aVar);
        map.put("shift", aVar);
        map.put("sony", aVar);
        map.put("tcl", aVar);
        map.put("tecno", aVar);
        map.put("tecno mobile limited", aVar);
        map.put("vivo", aVar);
        map.put("wingtech", aVar);
        map.put("xiaomi", aVar);
        f112039d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", aVar);
        map2.put("jio", aVar);
        f112040e = Collections.unmodifiableMap(map2);
        f112042g = o.class.getSimpleName();
    }

    private o() {
    }

    @Deprecated
    public static void a(@NonNull Activity activity) {
        i(activity);
    }

    @Deprecated
    public static void b(@NonNull Activity activity, @g1 int i10) {
        j(activity, new p.c().k(i10).f());
    }

    @Deprecated
    public static void c(@NonNull Activity activity, @NonNull f fVar) {
        j(activity, new p.c().j(fVar).f());
    }

    public static void d(@NonNull Application application) {
        h(application, new p.c().f());
    }

    @Deprecated
    public static void e(@NonNull Application application, @g1 int i10) {
        h(application, new p.c().k(i10).f());
    }

    @Deprecated
    public static void f(@NonNull Application application, @g1 int i10, @NonNull f fVar) {
        h(application, new p.c().k(i10).j(fVar).f());
    }

    @Deprecated
    public static void g(@NonNull Application application, @NonNull f fVar) {
        h(application, new p.c().j(fVar).f());
    }

    public static void h(@NonNull Application application, @NonNull p pVar) {
        application.registerActivityLifecycleCallbacks(new d(pVar));
    }

    public static void i(@NonNull Activity activity) {
        j(activity, new p.c().f());
    }

    public static void j(@NonNull Activity activity, @NonNull p pVar) {
        int iK;
        if (m()) {
            if (pVar.d() == null) {
                iK = pVar.g() == 0 ? k(activity, f112036a) : pVar.g();
            } else {
                iK = 0;
            }
            if (pVar.f().a(activity, iK)) {
                if (pVar.d() != null) {
                    f6 f6Var = new f6(com.google.android.material.color.utilities.l.b(pVar.d().intValue()), !u.r(activity), l(activity));
                    l lVarK = l.k();
                    if (lVarK == null) {
                        return;
                    }
                    if (!lVarK.b(activity, t.a(f6Var))) {
                        return;
                    }
                } else {
                    y.a(activity, iK);
                }
                pVar.e().a(activity);
            }
        }
    }

    private static int k(@NonNull Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static float l(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    @e.a({"DefaultLocale"})
    @androidx.annotation.k(api = 31)
    public static boolean m() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (androidx.core.os.b.k()) {
            return true;
        }
        Map<String, c> map = f112039d;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        c cVar = map.get(str.toLowerCase(locale));
        if (cVar == null) {
            cVar = f112040e.get(Build.BRAND.toLowerCase(locale));
        }
        return cVar != null && cVar.b();
    }

    @NonNull
    public static Context n(@NonNull Context context) {
        return o(context, 0);
    }

    @NonNull
    public static Context o(@NonNull Context context, @g1 int i10) {
        return p(context, new p.c().k(i10).f());
    }

    @NonNull
    public static Context p(@NonNull Context context, @NonNull p pVar) {
        if (m()) {
            int iG = pVar.g();
            if (iG == 0) {
                iG = k(context, f112036a);
            }
            if (iG != 0) {
                if (pVar.d() != null) {
                    f6 f6Var = new f6(com.google.android.material.color.utilities.l.b(pVar.d().intValue()), !u.r(context), l(context));
                    l lVarK = l.k();
                    if (lVarK != null) {
                        return lVarK.a(context, t.a(f6Var));
                    }
                }
                return new ContextThemeWrapper(context, iG);
            }
        }
        return context;
    }
}
