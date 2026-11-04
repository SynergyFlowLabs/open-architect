package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class l implements Handler.Callback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final String f97212i = "com.bumptech.glide.manager";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f97213j = "RMRetriever";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f97214k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f97215l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f97216m = "key";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final b f97217n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f97218a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f97221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f97222e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    final Map<FragmentManager, k> f97219b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    final Map<androidx.fragment.app.FragmentManager, o> f97220c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f97223f = new androidx.collection.a<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f97224g = new androidx.collection.a<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f97225h = new Bundle();

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.l.b
        @NonNull
        public com.bumptech.glide.l a(@NonNull com.bumptech.glide.b bVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context) {
            return new com.bumptech.glide.l(bVar, hVar, mVar, context);
        }
    }

    public interface b {
        @NonNull
        com.bumptech.glide.l a(@NonNull com.bumptech.glide.b bVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context);
    }

    public l(@p0 b bVar) {
        this.f97222e = bVar == null ? f97217n : bVar;
        this.f97221d = new Handler(Looper.getMainLooper(), this);
    }

    @e.b(17)
    private static void a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @p0
    private static Activity b(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @e.b(26)
    @Deprecated
    private void c(@NonNull FragmentManager fragmentManager, @NonNull androidx.collection.a<View, android.app.Fragment> aVar) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager(), aVar);
            }
        }
    }

    @Deprecated
    private void d(@NonNull FragmentManager fragmentManager, @NonNull androidx.collection.a<View, android.app.Fragment> aVar) {
        android.app.Fragment fragment;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.f97225h.putInt(f97216m, i10);
            try {
                fragment = fragmentManager.getFragment(this.f97225h, f97216m);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager(), aVar);
            }
            i10 = i11;
        }
    }

    private static void e(@p0 Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                e(fragment.getChildFragmentManager().N0(), map);
            }
        }
    }

    @p0
    @Deprecated
    private android.app.Fragment f(@NonNull View view, @NonNull Activity activity) {
        this.f97224g.clear();
        c(activity.getFragmentManager(), this.f97224g);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f97224g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f97224g.clear();
        return fragment;
    }

    @p0
    private Fragment g(@NonNull View view, @NonNull s sVar) {
        this.f97223f.clear();
        e(sVar.getSupportFragmentManager().N0(), this.f97223f);
        View viewFindViewById = sVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f97223f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f97223f.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    private com.bumptech.glide.l h(@NonNull Context context, @NonNull FragmentManager fragmentManager, @p0 android.app.Fragment fragment, boolean z10) {
        k kVarQ = q(fragmentManager, fragment, z10);
        com.bumptech.glide.l lVarE = kVarQ.e();
        if (lVarE != null) {
            return lVarE;
        }
        com.bumptech.glide.l lVarA = this.f97222e.a(com.bumptech.glide.b.d(context), kVarQ.c(), kVarQ.f(), context);
        kVarQ.k(lVarA);
        return lVarA;
    }

    @NonNull
    private com.bumptech.glide.l o(@NonNull Context context) {
        if (this.f97218a == null) {
            synchronized (this) {
                try {
                    if (this.f97218a == null) {
                        this.f97218a = this.f97222e.a(com.bumptech.glide.b.d(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97218a;
    }

    @NonNull
    private k q(@NonNull FragmentManager fragmentManager, @p0 android.app.Fragment fragment, boolean z10) {
        k kVar = (k) fragmentManager.findFragmentByTag(f97212i);
        if (kVar == null && (kVar = this.f97219b.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.j(fragment);
            if (z10) {
                kVar.c().d();
            }
            this.f97219b.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, f97212i).commitAllowingStateLoss();
            this.f97221d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @NonNull
    private o s(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @p0 Fragment fragment, boolean z10) {
        o oVar = (o) fragmentManager.w0(f97212i);
        if (oVar == null && (oVar = this.f97220c.get(fragmentManager)) == null) {
            oVar = new o();
            oVar.D(fragment);
            if (z10) {
                oVar.v().d();
            }
            this.f97220c.put(fragmentManager, oVar);
            fragmentManager.w().g(oVar, f97212i).n();
            this.f97221d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    private static boolean t(Context context) {
        Activity activityB = b(context);
        return activityB == null || !activityB.isFinishing();
    }

    @NonNull
    private com.bumptech.glide.l u(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @p0 Fragment fragment, boolean z10) {
        o oVarS = s(fragmentManager, fragment, z10);
        com.bumptech.glide.l lVarX = oVarS.x();
        if (lVarX != null) {
            return lVarX;
        }
        com.bumptech.glide.l lVarA = this.f97222e.a(com.bumptech.glide.b.d(context), oVarS.v(), oVarS.y(), context);
        oVarS.E(lVarA);
        return lVarA;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks componentCallbacksRemove;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 == 1) {
            obj = (FragmentManager) message.obj;
            componentCallbacksRemove = this.f97219b.remove(obj);
        } else if (i10 != 2) {
            componentCallbacksRemove = null;
            z10 = false;
            obj = null;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            componentCallbacksRemove = this.f97220c.remove(obj);
        }
        if (z10 && componentCallbacksRemove == null && Log.isLoggable(f97213j, 5)) {
            Objects.toString(obj);
        }
        return z10;
    }

    @NonNull
    public com.bumptech.glide.l i(@NonNull Activity activity) {
        if (com.bumptech.glide.util.m.s()) {
            return k(activity.getApplicationContext());
        }
        a(activity);
        return h(activity, activity.getFragmentManager(), null, t(activity));
    }

    @NonNull
    @e.b(17)
    @Deprecated
    public com.bumptech.glide.l j(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (com.bumptech.glide.util.m.s()) {
            return k(fragment.getActivity().getApplicationContext());
        }
        return h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    public com.bumptech.glide.l k(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.m.t() && !(context instanceof Application)) {
            if (context instanceof s) {
                return n((s) context);
            }
            if (context instanceof Activity) {
                return i((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return k(contextWrapper.getBaseContext());
                }
            }
        }
        return o(context);
    }

    @NonNull
    public com.bumptech.glide.l l(@NonNull View view) {
        if (com.bumptech.glide.util.m.s()) {
            return k(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.k.d(view);
        com.bumptech.glide.util.k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityB = b(view.getContext());
        if (activityB == null) {
            return k(view.getContext().getApplicationContext());
        }
        if (!(activityB instanceof s)) {
            android.app.Fragment fragmentF = f(view, activityB);
            return fragmentF == null ? i(activityB) : j(fragmentF);
        }
        s sVar = (s) activityB;
        Fragment fragmentG = g(view, sVar);
        return fragmentG != null ? m(fragmentG) : n(sVar);
    }

    @NonNull
    public com.bumptech.glide.l m(@NonNull Fragment fragment) {
        com.bumptech.glide.util.k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.m.s()) {
            return k(fragment.getContext().getApplicationContext());
        }
        return u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    public com.bumptech.glide.l n(@NonNull s sVar) {
        if (com.bumptech.glide.util.m.s()) {
            return k(sVar.getApplicationContext());
        }
        a(sVar);
        return u(sVar, sVar.getSupportFragmentManager(), null, t(sVar));
    }

    @NonNull
    @Deprecated
    k p(Activity activity) {
        return q(activity.getFragmentManager(), null, t(activity));
    }

    @NonNull
    o r(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return s(fragmentManager, null, t(context));
    }
}
