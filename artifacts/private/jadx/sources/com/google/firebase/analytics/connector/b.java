package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.d1;
import androidx.annotation.l1;
import androidx.annotation.m1;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.measurement.internal.db;
import com.google.android.gms.measurement.internal.n8;
import com.google.firebase.analytics.connector.internal.g;
import com.google.firebase.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b implements com.google.firebase.analytics.connector.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.connector.a f120707c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    final n6.a f120708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    final Map f120709b;

    class a implements com.google.firebase.analytics.connector.a.InterfaceC1123a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f120710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f120711b;

        a(b bVar, String str) {
            this.f120710a = str;
            Objects.requireNonNull(bVar);
            this.f120711b = bVar;
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        public final void a() {
            b bVar = this.f120711b;
            String str = this.f120710a;
            if (bVar.l(str)) {
                Map map = bVar.f120709b;
                com.google.firebase.analytics.connector.a.b bVarA = ((com.google.firebase.analytics.connector.internal.a) map.get(str)).a();
                if (bVarA != null) {
                    int i10 = 5 >> 0;
                    bVarA.a(0, null);
                }
                map.remove(str);
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        @g6.a
        public void b() {
            b bVar = this.f120711b;
            String str = this.f120710a;
            if (bVar.l(str) && str.equals("fiam")) {
                ((com.google.firebase.analytics.connector.internal.a) bVar.f120709b.get(str)).h();
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        @g6.a
        public void c(Set<String> set) {
            b bVar = this.f120711b;
            String str = this.f120710a;
            if (bVar.l(str) && str.equals("fiam") && set != null && !set.isEmpty()) {
                ((com.google.firebase.analytics.connector.internal.a) bVar.f120709b.get(str)).b(set);
            }
        }
    }

    b(n6.a aVar) {
        w.r(aVar);
        this.f120708a = aVar;
        this.f120709b = new ConcurrentHashMap();
    }

    @NonNull
    @g6.a
    public static com.google.firebase.analytics.connector.a h() {
        return i(h.p());
    }

    @NonNull
    @g6.a
    public static com.google.firebase.analytics.connector.a i(@NonNull h hVar) {
        return (com.google.firebase.analytics.connector.a) hVar.l(com.google.firebase.analytics.connector.a.class);
    }

    @NonNull
    @a1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @g6.a
    public static com.google.firebase.analytics.connector.a j(@NonNull h hVar, @NonNull Context context, @NonNull m8.d dVar) {
        w.r(hVar);
        w.r(context);
        w.r(dVar);
        w.r(context.getApplicationContext());
        if (f120707c == null) {
            synchronized (b.class) {
                try {
                    if (f120707c == null) {
                        Bundle bundle = new Bundle(1);
                        if (hVar.B()) {
                            dVar.b(com.google.firebase.c.class, e.f120713a, d.f120712a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", hVar.A());
                        }
                        f120707c = new b(f4.v(context, bundle).w());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f120707c;
    }

    static /* synthetic */ void k(m8.a aVar) {
        boolean z10 = ((com.google.firebase.c) aVar.a()).f120739a;
        synchronized (b.class) {
            try {
                ((b) w.r(f120707c)).f120708a.B(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean l(@NonNull String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f120709b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // com.google.firebase.analytics.connector.a
    @g6.a
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.b(str2, bundle) && com.google.firebase.analytics.connector.internal.c.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f120708a.o(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @g6.a
    public void b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.d(str, str2)) {
            this.f120708a.z(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @m1
    @g6.a
    public int c(@NonNull @d1(min = 1) String str) {
        return this.f120708a.m(str);
    }

    @Override // com.google.firebase.analytics.connector.a
    @g6.a
    public void clearConditionalUserProperty(@NonNull @d1(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.c.b(str2, bundle)) {
            this.f120708a.b(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    @m1
    @g6.a
    public List<com.google.firebase.analytics.connector.a.c> d(@NonNull String str, @NonNull @d1(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f120708a.g(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.c.f120721g;
            w.r(bundle);
            com.google.firebase.analytics.connector.a.c cVar = new com.google.firebase.analytics.connector.a.c();
            cVar.f120692a = (String) w.r((String) n8.b(bundle, "origin", String.class, null));
            cVar.f120693b = (String) w.r((String) n8.b(bundle, "name", String.class, null));
            cVar.f120694c = n8.b(bundle, "value", Object.class, null);
            cVar.f120695d = (String) n8.b(bundle, n6.a.C2338a.f332736d, String.class, null);
            cVar.f120696e = ((Long) n8.b(bundle, n6.a.C2338a.f332737e, Long.class, 0L)).longValue();
            cVar.f120697f = (String) n8.b(bundle, n6.a.C2338a.f332738f, String.class, null);
            cVar.f120698g = (Bundle) n8.b(bundle, n6.a.C2338a.f332739g, Bundle.class, null);
            cVar.f120699h = (String) n8.b(bundle, n6.a.C2338a.f332740h, String.class, null);
            cVar.f120700i = (Bundle) n8.b(bundle, n6.a.C2338a.f332741i, Bundle.class, null);
            cVar.f120701j = ((Long) n8.b(bundle, n6.a.C2338a.f332742j, Long.class, 0L)).longValue();
            cVar.f120702k = (String) n8.b(bundle, n6.a.C2338a.f332743k, String.class, null);
            cVar.f120703l = (Bundle) n8.b(bundle, n6.a.C2338a.f332744l, Bundle.class, null);
            cVar.f120705n = ((Boolean) n8.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f120704m = ((Long) n8.b(bundle, n6.a.C2338a.f332745m, Long.class, 0L)).longValue();
            cVar.f120706o = ((Long) n8.b(bundle, n6.a.C2338a.f332747o, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    @m1
    @g6.a
    public com.google.firebase.analytics.connector.a.InterfaceC1123a e(@NonNull String str, @NonNull com.google.firebase.analytics.connector.a.b bVar) {
        com.google.firebase.analytics.connector.internal.a gVar;
        w.r(bVar);
        if (com.google.firebase.analytics.connector.internal.c.a(str) && !l(str)) {
            n6.a aVar = this.f120708a;
            if ("fiam".equals(str)) {
                gVar = new com.google.firebase.analytics.connector.internal.e(aVar, bVar);
            } else {
                gVar = "clx".equals(str) ? new g(aVar, bVar) : null;
            }
            if (gVar != null) {
                this.f120709b.put(str, gVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.a
    @g6.a
    public void f(@NonNull com.google.firebase.analytics.connector.a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.c.f120721g;
        if (cVar == null || (str = cVar.f120692a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f120694c;
        if ((obj == null || db.b(obj) != null) && com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.d(str, cVar.f120693b)) {
            String str2 = cVar.f120702k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.c.b(str2, cVar.f120703l) && com.google.firebase.analytics.connector.internal.c.e(str, cVar.f120702k, cVar.f120703l))) {
                String str3 = cVar.f120699h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.c.b(str3, cVar.f120700i) && com.google.firebase.analytics.connector.internal.c.e(str, cVar.f120699h, cVar.f120700i))) {
                    String str4 = cVar.f120697f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.c.b(str4, cVar.f120698g) && com.google.firebase.analytics.connector.internal.c.e(str, cVar.f120697f, cVar.f120698g))) {
                        n6.a aVar = this.f120708a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f120692a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f120693b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f120694c;
                        if (obj2 != null) {
                            n8.a(bundle, obj2);
                        }
                        String str7 = cVar.f120695d;
                        if (str7 != null) {
                            bundle.putString(n6.a.C2338a.f332736d, str7);
                        }
                        bundle.putLong(n6.a.C2338a.f332737e, cVar.f120696e);
                        String str8 = cVar.f120697f;
                        if (str8 != null) {
                            bundle.putString(n6.a.C2338a.f332738f, str8);
                        }
                        Bundle bundle2 = cVar.f120698g;
                        if (bundle2 != null) {
                            bundle.putBundle(n6.a.C2338a.f332739g, bundle2);
                        }
                        String str9 = cVar.f120699h;
                        if (str9 != null) {
                            bundle.putString(n6.a.C2338a.f332740h, str9);
                        }
                        Bundle bundle3 = cVar.f120700i;
                        if (bundle3 != null) {
                            bundle.putBundle(n6.a.C2338a.f332741i, bundle3);
                        }
                        bundle.putLong(n6.a.C2338a.f332742j, cVar.f120701j);
                        String str10 = cVar.f120702k;
                        if (str10 != null) {
                            bundle.putString(n6.a.C2338a.f332743k, str10);
                        }
                        Bundle bundle4 = cVar.f120703l;
                        if (bundle4 != null) {
                            bundle.putBundle(n6.a.C2338a.f332744l, bundle4);
                        }
                        bundle.putLong(n6.a.C2338a.f332745m, cVar.f120704m);
                        bundle.putBoolean("active", cVar.f120705n);
                        bundle.putLong(n6.a.C2338a.f332747o, cVar.f120706o);
                        aVar.t(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    @m1
    @g6.a
    public Map<String, Object> g(boolean z10) {
        return this.f120708a.n(null, null, z10);
    }
}
