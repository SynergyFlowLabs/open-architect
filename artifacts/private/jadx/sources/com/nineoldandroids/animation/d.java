package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends com.nineoldandroids.animation.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<com.nineoldandroids.animation.a> f131170b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, f> f131171c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<f> f131172d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<f> f131173e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f131174f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f131175g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f131176h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f131177i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f131178j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q f131179k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f131180l = -1;

    class a extends com.nineoldandroids.animation.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f131181a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f131182b;

        a(ArrayList arrayList) {
            this.f131182b = arrayList;
        }

        @Override // com.nineoldandroids.animation.c, com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (this.f131181a) {
                return;
            }
            int size = this.f131182b.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f131182b.get(i10);
                fVar.f131195a.r();
                d.this.f131170b.add(fVar.f131195a);
            }
        }

        @Override // com.nineoldandroids.animation.c, com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
            this.f131181a = true;
        }
    }

    private class b implements com.nineoldandroids.animation.a.InterfaceC1443a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f131184a;

        b(d dVar) {
            this.f131184a = dVar;
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            aVar.j(this);
            d.this.f131170b.remove(aVar);
            ((f) this.f131184a.f131171c.get(aVar)).f131200f = true;
            if (d.this.f131176h) {
                return;
            }
            ArrayList arrayList = this.f131184a.f131173e;
            int size = arrayList.size();
            int i10 = 2 >> 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (!((f) arrayList.get(i11)).f131200f) {
                    return;
                }
            }
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList2 = d.this.f131154a;
            if (arrayList2 != null) {
                ArrayList arrayList3 = (ArrayList) arrayList2.clone();
                int size2 = arrayList3.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList3.get(i12)).b(this.f131184a);
                }
            }
            this.f131184a.f131177i = false;
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList;
            d dVar = d.this;
            if (dVar.f131176h || dVar.f131170b.size() != 0 || (arrayList = d.this.f131154a) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d.this.f131154a.get(i10).d(this.f131184a);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f131186a;

        c(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f131171c.get(aVar);
            this.f131186a = fVar;
            if (fVar == null) {
                this.f131186a = new f(aVar);
                d.this.f131171c.put(aVar, this.f131186a);
                d.this.f131172d.add(this.f131186a);
            }
        }

        public c a(long j10) {
            q qVarX = q.X(0.0f, 1.0f);
            qVarX.k(j10);
            b(qVarX);
            return this;
        }

        public c b(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f131171c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f131171c.put(aVar, fVar);
                d.this.f131172d.add(fVar);
            }
            this.f131186a.a(new C1444d(fVar, 1));
            return this;
        }

        public c c(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f131171c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f131171c.put(aVar, fVar);
                d.this.f131172d.add(fVar);
            }
            fVar.a(new C1444d(this.f131186a, 1));
            return this;
        }

        public c d(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f131171c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f131171c.put(aVar, fVar);
                d.this.f131172d.add(fVar);
            }
            fVar.a(new C1444d(this.f131186a, 0));
            return this;
        }
    }

    /* JADX INFO: renamed from: com.nineoldandroids.animation.d$d, reason: collision with other inner class name */
    private static class C1444d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f131188c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f131189d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f131190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f131191b;

        public C1444d(f fVar, int i10) {
            this.f131190a = fVar;
            this.f131191b = i10;
        }
    }

    private static class e implements com.nineoldandroids.animation.a.InterfaceC1443a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f131192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f131193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f131194c;

        public e(d dVar, f fVar, int i10) {
            this.f131192a = dVar;
            this.f131193b = fVar;
            this.f131194c = i10;
        }

        private void c(com.nineoldandroids.animation.a aVar) {
            C1444d c1444d;
            if (this.f131192a.f131176h) {
                return;
            }
            int size = this.f131193b.f131197c.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c1444d = null;
                    break;
                }
                c1444d = this.f131193b.f131197c.get(i10);
                if (c1444d.f131191b == this.f131194c && c1444d.f131190a.f131195a == aVar) {
                    aVar.j(this);
                    break;
                }
                i10++;
            }
            this.f131193b.f131197c.remove(c1444d);
            if (this.f131193b.f131197c.size() == 0) {
                this.f131193b.f131195a.r();
                this.f131192a.f131170b.add(this.f131193b.f131195a);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
            if (this.f131194c == 1) {
                c(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
            if (this.f131194c == 0) {
                c(aVar);
            }
        }
    }

    private static class f implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.nineoldandroids.animation.a f131195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<C1444d> f131196b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<C1444d> f131197c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<f> f131198d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<f> f131199e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f131200f = false;

        public f(com.nineoldandroids.animation.a aVar) {
            this.f131195a = aVar;
        }

        public void a(C1444d c1444d) {
            if (this.f131196b == null) {
                this.f131196b = new ArrayList<>();
                this.f131198d = new ArrayList<>();
            }
            this.f131196b.add(c1444d);
            if (!this.f131198d.contains(c1444d.f131190a)) {
                this.f131198d.add(c1444d.f131190a);
            }
            f fVar = c1444d.f131190a;
            if (fVar.f131199e == null) {
                fVar.f131199e = new ArrayList<>();
            }
            fVar.f131199e.add(this);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f clone() {
            try {
                f fVar = (f) super.clone();
                fVar.f131195a = this.f131195a.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    private void G() {
        if (this.f131174f) {
            this.f131173e.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f131172d.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f131172d.get(i10);
                ArrayList<C1444d> arrayList2 = fVar.f131196b;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList.add(fVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    f fVar2 = (f) arrayList.get(i11);
                    this.f131173e.add(fVar2);
                    ArrayList<f> arrayList4 = fVar2.f131199e;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            f fVar3 = fVar2.f131199e.get(i12);
                            fVar3.f131198d.remove(fVar2);
                            if (fVar3.f131198d.size() == 0) {
                                arrayList3.add(fVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                arrayList3.clear();
            }
            this.f131174f = false;
            if (this.f131173e.size() != this.f131172d.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
        } else {
            int size4 = this.f131172d.size();
            for (int i13 = 0; i13 < size4; i13++) {
                f fVar4 = this.f131172d.get(i13);
                ArrayList<C1444d> arrayList5 = fVar4.f131196b;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    int size5 = fVar4.f131196b.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        C1444d c1444d = fVar4.f131196b.get(i14);
                        if (fVar4.f131198d == null) {
                            fVar4.f131198d = new ArrayList<>();
                        }
                        if (!fVar4.f131198d.contains(c1444d.f131190a)) {
                            fVar4.f131198d.add(c1444d.f131190a);
                        }
                    }
                }
                fVar4.f131200f = false;
            }
        }
    }

    public c A(com.nineoldandroids.animation.a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f131174f = true;
        return new c(aVar);
    }

    public void B(List<com.nineoldandroids.animation.a> list) {
        if (list != null && list.size() > 0) {
            this.f131174f = true;
            int i10 = 0;
            if (list.size() == 1) {
                A(list.get(0));
                return;
            }
            while (i10 < list.size() - 1) {
                c cVarA = A(list.get(i10));
                i10++;
                cVarA.c(list.get(i10));
            }
        }
    }

    public void C(com.nineoldandroids.animation.a... aVarArr) {
        if (aVarArr != null) {
            this.f131174f = true;
            int i10 = 0;
            if (aVarArr.length == 1) {
                A(aVarArr[0]);
                return;
            }
            while (i10 < aVarArr.length - 1) {
                c cVarA = A(aVarArr[i10]);
                i10++;
                cVarA.c(aVarArr[i10]);
            }
        }
    }

    public void D(Collection<com.nineoldandroids.animation.a> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f131174f = true;
        c cVarA = null;
        for (com.nineoldandroids.animation.a aVar : collection) {
            if (cVarA == null) {
                cVarA = A(aVar);
            } else {
                cVarA.d(aVar);
            }
        }
    }

    public void E(com.nineoldandroids.animation.a... aVarArr) {
        if (aVarArr != null) {
            this.f131174f = true;
            c cVarA = A(aVarArr[0]);
            for (int i10 = 1; i10 < aVarArr.length; i10++) {
                cVarA.d(aVarArr[i10]);
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d k(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            it.next().f131195a.k(j10);
        }
        this.f131180l = j10;
        return this;
    }

    @Override // com.nineoldandroids.animation.a
    public void c() {
        this.f131176h = true;
        if (h()) {
            if (this.f131173e.size() != this.f131172d.size()) {
                G();
                for (f fVar : this.f131173e) {
                    if (this.f131175g == null) {
                        this.f131175g = new b(this);
                    }
                    fVar.f131195a.a(this.f131175g);
                }
            }
            q qVar = this.f131179k;
            if (qVar != null) {
                qVar.cancel();
            }
            if (this.f131173e.size() > 0) {
                Iterator<f> it = this.f131173e.iterator();
                while (it.hasNext()) {
                    it.next().f131195a.c();
                }
            }
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList = this.f131154a;
            if (arrayList != null) {
                Iterator it2 = ((ArrayList) arrayList.clone()).iterator();
                while (it2.hasNext()) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) it2.next()).b(this);
                }
            }
            this.f131177i = false;
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void cancel() {
        ArrayList arrayList;
        this.f131176h = true;
        if (h()) {
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList2 = this.f131154a;
            if (arrayList2 != null) {
                arrayList = (ArrayList) arrayList2.clone();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) it.next()).d(this);
                }
            } else {
                arrayList = null;
            }
            q qVar = this.f131179k;
            if (qVar != null && qVar.g()) {
                this.f131179k.cancel();
            } else if (this.f131173e.size() > 0) {
                Iterator<f> it2 = this.f131173e.iterator();
                while (it2.hasNext()) {
                    it2.next().f131195a.cancel();
                }
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) it3.next()).b(this);
                }
            }
            this.f131177i = false;
        }
    }

    @Override // com.nineoldandroids.animation.a
    public long d() {
        return this.f131180l;
    }

    @Override // com.nineoldandroids.animation.a
    public long f() {
        return this.f131178j;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean g() {
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            if (it.next().f131195a.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean h() {
        return this.f131177i;
    }

    @Override // com.nineoldandroids.animation.a
    public void l(Interpolator interpolator) {
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            it.next().f131195a.l(interpolator);
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void n(long j10) {
        this.f131178j = j10;
    }

    @Override // com.nineoldandroids.animation.a
    public void o(Object obj) {
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            com.nineoldandroids.animation.a aVar = it.next().f131195a;
            if (aVar instanceof d) {
                ((d) aVar).o(obj);
            } else if (aVar instanceof l) {
                ((l) aVar).o(obj);
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void p() {
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            it.next().f131195a.p();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void q() {
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            it.next().f131195a.q();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void r() {
        this.f131176h = false;
        this.f131177i = true;
        G();
        int size = this.f131173e.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f131173e.get(i10);
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayListE = fVar.f131195a.e();
            if (arrayListE != null && arrayListE.size() > 0) {
                for (com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a : new ArrayList(arrayListE)) {
                    if ((interfaceC1443a instanceof e) || (interfaceC1443a instanceof b)) {
                        fVar.f131195a.j(interfaceC1443a);
                    }
                }
            }
        }
        ArrayList<f> arrayList = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar2 = this.f131173e.get(i11);
            if (this.f131175g == null) {
                this.f131175g = new b(this);
            }
            ArrayList<C1444d> arrayList2 = fVar2.f131196b;
            if (arrayList2 == null || arrayList2.size() == 0) {
                arrayList.add(fVar2);
            } else {
                int size2 = fVar2.f131196b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    C1444d c1444d = fVar2.f131196b.get(i12);
                    c1444d.f131190a.f131195a.a(new e(this, fVar2, c1444d.f131191b));
                }
                fVar2.f131197c = (ArrayList) fVar2.f131196b.clone();
            }
            fVar2.f131195a.a(this.f131175g);
        }
        if (this.f131178j <= 0) {
            for (f fVar3 : arrayList) {
                fVar3.f131195a.r();
                this.f131170b.add(fVar3.f131195a);
            }
        } else {
            q qVarX = q.X(0.0f, 1.0f);
            this.f131179k = qVarX;
            qVarX.k(this.f131178j);
            this.f131179k.a(new a(arrayList));
            this.f131179k.r();
        }
        ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList3 = this.f131154a;
        if (arrayList3 != null) {
            ArrayList arrayList4 = (ArrayList) arrayList3.clone();
            int size3 = arrayList4.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList4.get(i13)).e(this);
            }
        }
        if (this.f131172d.size() == 0 && this.f131178j == 0) {
            this.f131177i = false;
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList5 = this.f131154a;
            if (arrayList5 != null) {
                ArrayList arrayList6 = (ArrayList) arrayList5.clone();
                int size4 = arrayList6.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList6.get(i14)).b(this);
                }
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public d clone() {
        d dVar = (d) super.clone();
        dVar.f131174f = true;
        dVar.f131176h = false;
        dVar.f131177i = false;
        dVar.f131170b = new ArrayList<>();
        dVar.f131171c = new HashMap<>();
        dVar.f131172d = new ArrayList<>();
        dVar.f131173e = new ArrayList<>();
        HashMap map = new HashMap();
        for (f fVar : this.f131172d) {
            f fVarClone = fVar.clone();
            map.put(fVar, fVarClone);
            dVar.f131172d.add(fVarClone);
            dVar.f131171c.put(fVarClone.f131195a, fVarClone);
            ArrayList arrayList = null;
            fVarClone.f131196b = null;
            fVarClone.f131197c = null;
            fVarClone.f131199e = null;
            fVarClone.f131198d = null;
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayListE = fVarClone.f131195a.e();
            if (arrayListE != null) {
                for (com.nineoldandroids.animation.a.InterfaceC1443a interfaceC1443a : arrayListE) {
                    if (interfaceC1443a instanceof b) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(interfaceC1443a);
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayListE.remove((com.nineoldandroids.animation.a.InterfaceC1443a) it.next());
                    }
                }
            }
        }
        for (f fVar2 : this.f131172d) {
            f fVar3 = (f) map.get(fVar2);
            ArrayList<C1444d> arrayList2 = fVar2.f131196b;
            if (arrayList2 != null) {
                for (C1444d c1444d : arrayList2) {
                    fVar3.a(new C1444d((f) map.get(c1444d.f131190a), c1444d.f131191b));
                }
            }
        }
        return dVar;
    }

    public ArrayList<com.nineoldandroids.animation.a> z() {
        ArrayList<com.nineoldandroids.animation.a> arrayList = new ArrayList<>();
        Iterator<f> it = this.f131172d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f131195a);
        }
        return arrayList;
    }
}
