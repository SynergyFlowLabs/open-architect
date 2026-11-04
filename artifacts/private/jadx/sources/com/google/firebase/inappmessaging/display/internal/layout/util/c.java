package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.View;
import com.google.firebase.inappmessaging.display.internal.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d> f122457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f122458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f122459c;

    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            if (dVar.a() > dVar2.a()) {
                return -1;
            }
            return dVar.a() < dVar2.a() ? 1 : 0;
        }
    }

    public c(int i10, int i11) {
        this.f122457a = new ArrayList();
        this.f122458b = i10;
        this.f122459c = i11;
    }

    public void a(View view, boolean z10) {
        d dVar = new d(view, z10);
        dVar.h(this.f122458b, this.f122459c);
        this.f122457a.add(dVar);
    }

    public void b(int i10) {
        float f10;
        ArrayList<d> arrayList = new ArrayList();
        for (d dVar : this.f122457a) {
            if (dVar.f()) {
                arrayList.add(dVar);
            }
        }
        Collections.sort(arrayList, new a());
        Iterator it = arrayList.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((d) it.next()).a();
        }
        int size = arrayList.size();
        if (size >= 6) {
            throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
        }
        float f11 = 1.0f - ((size - 1) * 0.2f);
        l.d("VVGM (minFrac, maxFrac)", 0.2f, f11);
        float f12 = 0.0f;
        for (d dVar2 : arrayList) {
            float fA = dVar2.a() / iA;
            if (fA > f11) {
                f12 += fA - f11;
                f10 = f11;
            } else {
                f10 = fA;
            }
            if (fA < 0.2f) {
                float fMin = Math.min(0.2f - fA, f12);
                f12 -= fMin;
                f10 = fA + fMin;
            }
            l.d("\t(desired, granted)", fA, f10);
            dVar2.h(this.f122458b, (int) (f10 * i10));
        }
    }

    public int c() {
        int iA = 0;
        for (d dVar : this.f122457a) {
            if (!dVar.f()) {
                iA += dVar.a();
            }
        }
        return iA;
    }

    public int d() {
        Iterator<d> it = this.f122457a.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public List<d> e() {
        return this.f122457a;
    }

    public void f(int i10, int i11) {
        this.f122458b = i10;
        this.f122459c = i11;
        this.f122457a = new ArrayList();
    }

    public c() {
        this.f122457a = new ArrayList();
        this.f122458b = 0;
        this.f122459c = 0;
    }
}
