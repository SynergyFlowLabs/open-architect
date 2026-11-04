package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.compose.animation.core.z1;
import androidx.core.os.t0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.x;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.n0;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f122059k = "FirebaseApp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final String f122060l = "[DEFAULT]";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f122061m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @b0("LOCK")
    static final Map<String, h> f122062n = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f122063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f122065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.components.s f122066d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.components.b0<e9.a> f122069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z8.b<com.google.firebase.heartbeatinfo.g> f122070h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f122067e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f122068f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<a> f122071i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<i> f122072j = new CopyOnWriteArrayList();

    @g6.a
    public interface a {
        @g6.a
        void a(boolean z10);
    }

    @e.b(14)
    private static class b implements com.google.android.gms.common.api.internal.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f122073a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.v.c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f122073a.get() == null) {
                    b bVar = new b();
                    if (z1.a(f122073a, null, bVar)) {
                        com.google.android.gms.common.api.internal.d.c(application);
                        com.google.android.gms.common.api.internal.d.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.d.a
        public void a(boolean z10) {
            synchronized (h.f122061m) {
                try {
                    for (h hVar : new ArrayList(h.f122062n.values())) {
                        if (hVar.f122067e.get()) {
                            hVar.D(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @e.b(24)
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f122074b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f122075a;

        public c(Context context) {
            this.f122075a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f122074b.get() == null) {
                c cVar = new c(context);
                if (z1.a(f122074b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f122075a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (h.f122061m) {
                try {
                    Iterator<h> it = h.f122062n.values().iterator();
                    while (it.hasNext()) {
                        it.next().v();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    protected h(final Context context, String str, s sVar) {
        this.f122063a = (Context) w.r(context);
        this.f122064b = w.l(str);
        this.f122065c = (s) w.r(sVar);
        v vVarB = FirebaseInitProvider.b();
        n9.c.b("Firebase");
        n9.c.b("ComponentDiscovery");
        List<z8.b<ComponentRegistrar>> listC = com.google.firebase.components.j.d(context, ComponentDiscoveryService.class).c();
        n9.c.a();
        n9.c.b("Runtime");
        com.google.firebase.components.s.b bVarF = com.google.firebase.components.s.p(n0.INSTANCE).d(listC).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(com.google.firebase.components.g.y(context, Context.class, new Class[0])).b(com.google.firebase.components.g.y(this, h.class, new Class[0])).b(com.google.firebase.components.g.y(sVar, s.class, new Class[0])).f(new n9.b());
        if (t0.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(com.google.firebase.components.g.y(vVarB, v.class, new Class[0]));
        }
        com.google.firebase.components.s sVarE = bVarF.e();
        this.f122066d = sVarE;
        n9.c.a();
        this.f122069g = new com.google.firebase.components.b0<>(new z8.b() { // from class: com.google.firebase.f
            @Override // z8.b
            public final Object get() {
                return h.b(this.f122056a, context);
            }
        });
        this.f122070h = sVarE.e(com.google.firebase.heartbeatinfo.g.class);
        g(new a() { // from class: com.google.firebase.g
            @Override // com.google.firebase.h.a
            public final void a(boolean z10) {
                h.a(this.f122058a, z10);
            }
        });
        n9.c.a();
    }

    private static String C(@NonNull String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z10) {
        Iterator<a> it = this.f122071i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }

    private void E() {
        Iterator<i> it = this.f122072j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f122064b, this.f122065c);
        }
    }

    public static /* synthetic */ void a(h hVar, boolean z10) {
        if (z10) {
            hVar.getClass();
        } else {
            hVar.f122070h.get().h();
        }
    }

    public static /* synthetic */ e9.a b(h hVar, Context context) {
        return new e9.a(context, hVar.t(), (m8.c) hVar.f122066d.a(m8.c.class));
    }

    private void i() {
        w.y(!this.f122068f.get(), "FirebaseApp was deleted");
    }

    @l1
    public static void j() {
        synchronized (f122061m) {
            try {
                f122062n.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List<String> m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f122061m) {
            try {
                Iterator<h> it = f122062n.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().r());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    public static List<h> o(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f122061m) {
            try {
                arrayList = new ArrayList(f122062n.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @NonNull
    public static h p() {
        h hVar;
        synchronized (f122061m) {
            try {
                hVar = f122062n.get(f122060l);
                if (hVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                hVar.f122070h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @NonNull
    public static h q(@NonNull String str) {
        h hVar;
        String str2;
        synchronized (f122061m) {
            try {
                hVar = f122062n.get(C(str));
                if (hVar == null) {
                    List<String> listM = m();
                    if (listM.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listM);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                hVar.f122070h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @g6.a
    public static String u(String str, s sVar) {
        return com.google.android.gms.common.util.c.f(str.getBytes(Charset.defaultCharset())) + org.slf4j.h.f339615a3 + com.google.android.gms.common.util.c.f(sVar.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (!t0.a(this.f122063a)) {
            r();
            c.b(this.f122063a);
        } else {
            r();
            this.f122066d.u(B());
            this.f122070h.get().h();
        }
    }

    @p0
    public static h x(@NonNull Context context) {
        synchronized (f122061m) {
            try {
                if (f122062n.containsKey(f122060l)) {
                    return p();
                }
                s sVarH = s.h(context);
                if (sVarH == null) {
                    return null;
                }
                return y(context, sVarH);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static h y(@NonNull Context context, @NonNull s sVar) {
        return z(context, sVar, f122060l);
    }

    @NonNull
    public static h z(@NonNull Context context, @NonNull s sVar, @NonNull String str) {
        h hVar;
        b.c(context);
        String strC = C(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f122061m) {
            Map<String, h> map = f122062n;
            w.y(!map.containsKey(strC), "FirebaseApp name " + strC + " already exists!");
            w.s(context, "Application context cannot be null.");
            hVar = new h(context, strC, sVar);
            map.put(strC, hVar);
        }
        hVar.v();
        return hVar;
    }

    @g6.a
    public boolean A() {
        i();
        return this.f122069g.get().b();
    }

    @l1
    @g6.a
    public boolean B() {
        return f122060l.equals(r());
    }

    @g6.a
    public void F(a aVar) {
        i();
        this.f122071i.remove(aVar);
    }

    @g6.a
    public void G(@NonNull i iVar) {
        i();
        w.r(iVar);
        this.f122072j.remove(iVar);
    }

    public void H(boolean z10) {
        i();
        if (this.f122067e.compareAndSet(!z10, z10)) {
            boolean zD = com.google.android.gms.common.api.internal.d.b().d();
            if (z10 && zD) {
                D(true);
            } else {
                if (z10 || !zD) {
                    return;
                }
                D(false);
            }
        }
    }

    @g6.a
    public void I(Boolean bool) {
        i();
        this.f122069g.get().e(bool);
    }

    @g6.a
    @Deprecated
    public void J(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f122064b.equals(((h) obj).r());
        }
        return false;
    }

    @g6.a
    public void g(a aVar) {
        i();
        if (this.f122067e.get() && com.google.android.gms.common.api.internal.d.b().d()) {
            aVar.a(true);
        }
        this.f122071i.add(aVar);
    }

    @g6.a
    public void h(@NonNull i iVar) {
        i();
        w.r(iVar);
        this.f122072j.add(iVar);
    }

    public int hashCode() {
        return this.f122064b.hashCode();
    }

    public void k() {
        if (this.f122068f.compareAndSet(false, true)) {
            synchronized (f122061m) {
                try {
                    f122062n.remove(this.f122064b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            E();
        }
    }

    @g6.a
    public <T> T l(Class<T> cls) {
        i();
        return (T) this.f122066d.a(cls);
    }

    @NonNull
    public Context n() {
        i();
        return this.f122063a;
    }

    @NonNull
    public String r() {
        i();
        return this.f122064b;
    }

    @NonNull
    public s s() {
        i();
        return this.f122065c;
    }

    @g6.a
    public String t() {
        return com.google.android.gms.common.util.c.f(r().getBytes(Charset.defaultCharset())) + org.slf4j.h.f339615a3 + com.google.android.gms.common.util.c.f(s().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return com.google.android.gms.common.internal.u.d(this).a("name", this.f122064b).a(io.sentry.rrweb.h.f306695g, this.f122065c).toString();
    }

    @l1
    @b1({b1.a.TESTS})
    void w() {
        this.f122066d.t();
    }
}
