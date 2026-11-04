package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<c> f44157h;

    public b(char[] cArr) {
        super(cArr);
        this.f44157h = new ArrayList<>();
    }

    public static c N(char[] cArr) {
        return new b(cArr);
    }

    public void M(c cVar) {
        this.f44157h.add(cVar);
        if (g.f44169d) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    @Override // androidx.constraintlayout.core.parser.c
    @NonNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.clone();
        ArrayList<c> arrayList = new ArrayList<>(this.f44157h.size());
        Iterator<c> it = this.f44157h.iterator();
        while (it.hasNext()) {
            c cVarClone = it.next().clone();
            cVarClone.D(bVar);
            arrayList.add(cVarClone);
        }
        bVar.f44157h = arrayList;
        return bVar;
    }

    public c P(int i10) throws h {
        if (i10 >= 0 && i10 < this.f44157h.size()) {
            return this.f44157h.get(i10);
        }
        throw new h("no element at index " + i10, this);
    }

    public c Q(String str) throws h {
        Iterator<c> it = this.f44157h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.k().equals(str)) {
                return dVar.D0();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }

    public a S(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP instanceof a) {
            return (a) cVarP;
        }
        throw new h("no array at index " + i10, this);
    }

    public a T(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ instanceof a) {
            return (a) cVarQ;
        }
        throw new h("no array found for key <" + str + ">, found [" + cVarQ.v() + "] : " + cVarQ, this);
    }

    public a U(String str) {
        a aVarV = V(str);
        if (aVarV != null) {
            return aVarV;
        }
        a aVar = new a(new char[0]);
        t0(str, aVar);
        return aVar;
    }

    public a V(String str) {
        c cVarI0 = i0(str);
        if (cVarI0 instanceof a) {
            return (a) cVarI0;
        }
        return null;
    }

    public boolean W(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ instanceof j) {
            return ((j) cVarQ).N();
        }
        throw new h("no boolean found for key <" + str + ">, found [" + cVarQ.v() + "] : " + cVarQ, this);
    }

    public float Y(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ != null) {
            return cVarQ.r();
        }
        throw new h("no float found for key <" + str + ">, found [" + cVarQ.v() + "] : " + cVarQ, this);
    }

    public float Z(String str) {
        c cVarI0 = i0(str);
        if (cVarI0 instanceof e) {
            return cVarI0.r();
        }
        return Float.NaN;
    }

    public int a0(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ != null) {
            return cVarQ.s();
        }
        throw new h("no int found for key <" + str + ">, found [" + cVarQ.v() + "] : " + cVarQ, this);
    }

    public f b0(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP instanceof f) {
            return (f) cVarP;
        }
        throw new h("no object at index " + i10, this);
    }

    public f c0(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ instanceof f) {
            return (f) cVarQ;
        }
        throw new h("no object found for key <" + str + ">, found [" + cVarQ.v() + "] : " + cVarQ, this);
    }

    public void clear() {
        this.f44157h.clear();
    }

    public f e0(String str) {
        c cVarI0 = i0(str);
        if (cVarI0 instanceof f) {
            return (f) cVarI0;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f44157h.equals(((b) obj).f44157h);
        }
        return false;
    }

    public float getFloat(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP != null) {
            return cVarP.r();
        }
        throw new h("no float at index " + i10, this);
    }

    public int getInt(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP != null) {
            return cVarP.s();
        }
        throw new h("no int at index " + i10, this);
    }

    public c h0(int i10) {
        if (i10 < 0 || i10 >= this.f44157h.size()) {
            return null;
        }
        return this.f44157h.get(i10);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        return Objects.hash(this.f44157h, Integer.valueOf(super.hashCode()));
    }

    public c i0(String str) {
        Iterator<c> it = this.f44157h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.k().equals(str)) {
                return dVar.D0();
            }
        }
        return null;
    }

    public boolean j0(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP instanceof j) {
            return ((j) cVarP).N();
        }
        throw new h("no boolean at index " + i10, this);
    }

    public String l0(int i10) throws h {
        c cVarP = P(i10);
        if (cVarP instanceof i) {
            return cVarP.k();
        }
        throw new h("no string at index " + i10, this);
    }

    public String m0(String str) throws h {
        c cVarQ = Q(str);
        if (cVarQ instanceof i) {
            return cVarQ.k();
        }
        throw new h("no string found for key <" + str + ">, found [" + (cVarQ != null ? cVarQ.v() : null) + "] : " + cVarQ, this);
    }

    public String n0(int i10) {
        c cVarH0 = h0(i10);
        if (cVarH0 instanceof i) {
            return cVarH0.k();
        }
        return null;
    }

    public String p0(String str) {
        c cVarI0 = i0(str);
        if (cVarI0 instanceof i) {
            return cVarI0.k();
        }
        return null;
    }

    public boolean q0(String str) {
        for (c cVar : this.f44157h) {
            if ((cVar instanceof d) && ((d) cVar).k().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> s0() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (c cVar : this.f44157h) {
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).k());
            }
        }
        return arrayList;
    }

    public int size() {
        return this.f44157h.size();
    }

    public void t0(String str, c cVar) {
        Iterator<c> it = this.f44157h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.k().equals(str)) {
                dVar.E0(cVar);
                return;
            }
        }
        this.f44157h.add((d) d.A0(str, cVar));
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c cVar : this.f44157h) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public void u0(String str, float f10) {
        t0(str, new e(f10));
    }

    public void v0(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.J(0L);
        iVar.F(str2.length() - 1);
        t0(str, iVar);
    }

    public void z0(String str) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f44157h) {
            if (((d) cVar).k().equals(str)) {
                arrayList.add(cVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f44157h.remove((c) it.next());
        }
    }
}
