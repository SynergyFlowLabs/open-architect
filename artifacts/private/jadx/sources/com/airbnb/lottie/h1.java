package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f88230a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<b> f88231b = new androidx.collection.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.h> f88232c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<androidx.core.util.p<String, Float>> f88233d = new a();

    class a implements Comparator<androidx.core.util.p<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.core.util.p<String, Float> pVar, androidx.core.util.p<String, Float> pVar2) {
            float fFloatValue = pVar.f48412b.floatValue();
            float fFloatValue2 = pVar2.f48412b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f10);
    }

    public void a(b bVar) {
        this.f88231b.add(bVar);
    }

    public void b() {
        this.f88232c.clear();
    }

    public List<androidx.core.util.p<String, Float>> c() {
        if (!this.f88230a) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f88232c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.h> entry : this.f88232c.entrySet()) {
            arrayList.add(new androidx.core.util.p(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f88233d);
        return arrayList;
    }

    public void d() {
        if (this.f88230a) {
            List<androidx.core.util.p<String, Float>> listC = c();
            for (int i10 = 0; i10 < listC.size(); i10++) {
                androidx.core.util.p<String, Float> pVar = listC.get(i10);
                String.format("\t\t%30s:%.2f", pVar.f48411a, pVar.f48412b);
            }
        }
    }

    public void e(String str, float f10) {
        if (this.f88230a) {
            com.airbnb.lottie.utils.h hVar = this.f88232c.get(str);
            if (hVar == null) {
                hVar = new com.airbnb.lottie.utils.h();
                this.f88232c.put(str, hVar);
            }
            hVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f88231b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f88231b.remove(bVar);
    }

    void g(boolean z10) {
        this.f88230a = z10;
    }
}
