package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l1
    static final String f120445d = "com.google.firebase.abt";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l1
    static final String f120446e = "%s_lastKnownExperimentStartTime";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.b<com.google.firebase.analytics.connector.a> f120447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Integer f120449c = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final String Q1 = "frc";
        public static final String R1 = "fiam";
    }

    public d(Context context, z8.b<com.google.firebase.analytics.connector.a> bVar, String str) {
        this.f120447a = bVar;
        this.f120448b = str;
    }

    private void a(com.google.firebase.analytics.connector.a.c cVar) {
        this.f120447a.get().f(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (b bVar : list) {
            while (arrayDeque.size() >= i10) {
                k(((com.google.firebase.analytics.connector.a.c) arrayDeque.pollFirst()).f120693b);
            }
            com.google.firebase.analytics.connector.a.c cVarI = bVar.i(this.f120448b);
            a(cVarI);
            arrayDeque.offer(cVarI);
        }
    }

    private static List<b> c(List<Map<String, String>> list) throws com.google.firebase.abt.a {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<b> list, b bVar) {
        String strC = bVar.c();
        String strH = bVar.h();
        for (b bVar2 : list) {
            if (bVar2.c().equals(strC) && bVar2.h().equals(strH)) {
                return true;
            }
        }
        return false;
    }

    @m1
    private List<com.google.firebase.analytics.connector.a.c> f() {
        return this.f120447a.get().d(this.f120448b, "");
    }

    private ArrayList<b> g(List<b> list, List<b> list2) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<com.google.firebase.analytics.connector.a.c> h(List<b> list, List<b> list2) {
        ArrayList<com.google.firebase.analytics.connector.a.c> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!d(list2, bVar)) {
                arrayList.add(bVar.i(this.f120448b));
            }
        }
        return arrayList;
    }

    @m1
    private int i() {
        if (this.f120449c == null) {
            this.f120449c = Integer.valueOf(this.f120447a.get().c(this.f120448b));
        }
        return this.f120449c.intValue();
    }

    private void k(String str) {
        this.f120447a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<com.google.firebase.analytics.connector.a.c> collection) {
        Iterator<com.google.firebase.analytics.connector.a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f120693b);
        }
    }

    private void n(List<b> list) throws com.google.firebase.abt.a {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<b> listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void p() throws com.google.firebase.abt.a {
        if (this.f120447a.get() == null) {
            throw new com.google.firebase.abt.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @m1
    public List<b> e() throws com.google.firebase.abt.a {
        p();
        List<com.google.firebase.analytics.connector.a.c> listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.firebase.analytics.connector.a.c> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a(it.next()));
        }
        return arrayList;
    }

    @m1
    public void j() throws com.google.firebase.abt.a {
        p();
        l(f());
    }

    @m1
    public void m(List<Map<String, String>> list) throws com.google.firebase.abt.a {
        p();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    @m1
    public void o(b bVar) throws com.google.firebase.abt.a {
        p();
        b.k(bVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapJ = bVar.j();
        mapJ.remove("triggerEvent");
        arrayList.add(b.b(mapJ));
        b(arrayList);
    }

    @m1
    public void q(List<b> list) throws com.google.firebase.abt.a {
        p();
        l(h(e(), list));
    }
}
