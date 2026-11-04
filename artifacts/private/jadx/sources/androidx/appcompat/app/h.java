package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final int X = 108;
    public static final int Y = 109;
    public static final int Z = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f10343a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f10344b = "AppCompatDelegate";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f10346d = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10347e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f10348f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f10349g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10350h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10351i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10352j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f10353k = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static d f10345c = new d(new e());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f10354l = -100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static androidx.core.os.p f10355m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static androidx.core.os.p f10356n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Boolean f10357o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f10358s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final androidx.collection.c<WeakReference<h>> f10359t = new androidx.collection.c<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f10360v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Object f10361w = new Object();

    @w0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @w0(33)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @androidx.annotation.u
        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    static class d implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f10362a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<Runnable> f10363b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f10364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f10365d;

        d(Executor executor) {
            this.f10364c = executor;
        }

        public static /* synthetic */ void a(d dVar, Runnable runnable) {
            dVar.getClass();
            try {
                runnable.run();
                dVar.b();
            } catch (Throwable th2) {
                dVar.b();
                throw th2;
            }
        }

        protected void b() {
            synchronized (this.f10362a) {
                try {
                    Runnable runnablePoll = this.f10363b.poll();
                    this.f10365d = runnablePoll;
                    if (runnablePoll != null) {
                        this.f10364c.execute(runnablePoll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f10362a) {
                try {
                    this.f10363b.add(new Runnable() { // from class: androidx.appcompat.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.d.a(this.f10366a, runnable);
                        }
                    });
                    if (this.f10365d == null) {
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class e implements Executor {
        e() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    h() {
    }

    @p0
    static androidx.core.os.p A() {
        return f10355m;
    }

    @p0
    static androidx.core.os.p B() {
        return f10356n;
    }

    static boolean G(Context context) {
        if (f10357o == null) {
            try {
                Bundle bundle = t.a(context).metaData;
                if (bundle != null) {
                    f10357o = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f10357o = Boolean.FALSE;
            }
        }
        return f10357o.booleanValue();
    }

    public static boolean H() {
        return u1.b();
    }

    static void R(@NonNull h hVar) {
        synchronized (f10360v) {
            try {
                S(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void S(@NonNull h hVar) {
        synchronized (f10360v) {
            try {
                Iterator<WeakReference<h>> it = f10359t.iterator();
                while (it.hasNext()) {
                    h hVar2 = it.next().get();
                    if (hVar2 == hVar || hVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    @l1
    static void U() {
        f10355m = null;
        f10356n = null;
    }

    public static void V(@NonNull androidx.core.os.p pVar) {
        Objects.requireNonNull(pVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objY = y();
            if (objY != null) {
                b.b(objY, a.a(pVar.m()));
                return;
            }
            return;
        }
        if (pVar.equals(f10355m)) {
            return;
        }
        synchronized (f10360v) {
            try {
                f10355m = pVar;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void W(boolean z10) {
        u1.c(z10);
    }

    public static void a0(int i10) {
        if (i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            if (f10354l != i10) {
                f10354l = i10;
                i();
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        j0(context);
        f10358s = true;
    }

    @l1
    static void c0(boolean z10) {
        f10357o = Boolean.valueOf(z10);
    }

    static void e(@NonNull h hVar) {
        synchronized (f10360v) {
            try {
                S(hVar);
                f10359t.add(new WeakReference<>(hVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i() {
        synchronized (f10360v) {
            try {
                Iterator<WeakReference<h>> it = f10359t.iterator();
                while (it.hasNext()) {
                    h hVar = it.next().get();
                    if (hVar != null) {
                        hVar.h();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void j() {
        Iterator<WeakReference<h>> it = f10359t.iterator();
        while (it.hasNext()) {
            h hVar = it.next().get();
            if (hVar != null) {
                hVar.g();
            }
        }
    }

    static void j0(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f10346d);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (t().j()) {
                    String strB = androidx.core.app.j.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k0(final Context context) {
        if (G(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f10358s) {
                    return;
                }
                f10345c.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.c(context);
                    }
                });
                return;
            }
            synchronized (f10361w) {
                try {
                    androidx.core.os.p pVar = f10355m;
                    if (pVar == null) {
                        if (f10356n == null) {
                            f10356n = androidx.core.os.p.c(androidx.core.app.j.b(context));
                        }
                        if (f10356n.j()) {
                        } else {
                            f10355m = f10356n;
                        }
                    } else if (!pVar.equals(f10356n)) {
                        androidx.core.os.p pVar2 = f10355m;
                        f10356n = pVar2;
                        androidx.core.app.j.a(context, pVar2.m());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NonNull
    public static h n(@NonNull Activity activity, @p0 androidx.appcompat.app.e eVar) {
        return new AppCompatDelegateImpl(activity, eVar);
    }

    @NonNull
    public static h o(@NonNull Dialog dialog, @p0 androidx.appcompat.app.e eVar) {
        return new AppCompatDelegateImpl(dialog, eVar);
    }

    @NonNull
    public static h p(@NonNull Context context, @NonNull Activity activity, @p0 androidx.appcompat.app.e eVar) {
        return new AppCompatDelegateImpl(context, activity, eVar);
    }

    @NonNull
    public static h q(@NonNull Context context, @NonNull Window window, @p0 androidx.appcompat.app.e eVar) {
        return new AppCompatDelegateImpl(context, window, eVar);
    }

    @NonNull
    @androidx.annotation.d
    public static androidx.core.os.p t() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objY = y();
            if (objY != null) {
                return androidx.core.os.p.o(b.a(objY));
            }
        } else {
            androidx.core.os.p pVar = f10355m;
            if (pVar != null) {
                return pVar;
            }
        }
        return androidx.core.os.p.g();
    }

    public static int v() {
        return f10354l;
    }

    @w0(33)
    static Object y() {
        Context contextU;
        Iterator<WeakReference<h>> it = f10359t.iterator();
        while (it.hasNext()) {
            h hVar = it.next().get();
            if (hVar != null && (contextU = hVar.u()) != null) {
                return contextU.getSystemService("locale");
            }
        }
        return null;
    }

    @p0
    public abstract androidx.appcompat.app.a C();

    public abstract boolean D(int i10);

    public abstract void E();

    public abstract void F();

    public abstract boolean I();

    public abstract void J(Configuration configuration);

    public abstract void K(Bundle bundle);

    public abstract void L();

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O(Bundle bundle);

    public abstract void P();

    public abstract void Q();

    public abstract boolean T(int i10);

    public abstract void X(@j0 int i10);

    public abstract void Y(View view);

    public abstract void Z(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b0(boolean z10);

    public abstract void d0(int i10);

    @androidx.annotation.i
    @w0(33)
    public void e0(@p0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f0(@p0 Toolbar toolbar);

    boolean g() {
        return false;
    }

    public void g0(@g1 int i10) {
    }

    public abstract boolean h();

    public abstract void h0(@p0 CharSequence charSequence);

    @p0
    public abstract androidx.appcompat.view.b i0(@NonNull androidx.appcompat.view.b.a aVar);

    void k(final Context context) {
        f10345c.execute(new Runnable() { // from class: androidx.appcompat.app.g
            @Override // java.lang.Runnable
            public final void run() {
                h.k0(context);
            }
        });
    }

    @Deprecated
    public void l(Context context) {
    }

    @NonNull
    @androidx.annotation.i
    public Context m(@NonNull Context context) {
        l(context);
        return context;
    }

    public abstract View r(@p0 View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    @p0
    public abstract <T extends View> T s(@d0 int i10);

    @p0
    public Context u() {
        return null;
    }

    @p0
    public abstract androidx.appcompat.app.b.InterfaceC0030b w();

    public int x() {
        return -100;
    }

    public abstract MenuInflater z();
}
