package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
final class b extends g implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f340466h = 3044319355680032515L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f340467i = 2100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f340468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s[] f340469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f340470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.h[] f340471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s[] f340472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f[] f340473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentMap<Integer, e[]> f340474g = new ConcurrentHashMap();

    b(s sVar, s sVar2, List<e> list, List<e> list2, List<f> list3) {
        this.f340468a = new long[list.size()];
        s[] sVarArr = new s[list.size() + 1];
        this.f340469b = sVarArr;
        sVarArr[0] = sVar;
        int i10 = 0;
        while (i10 < list.size()) {
            this.f340468a[i10] = list.get(i10).toEpochSecond();
            int i11 = i10 + 1;
            this.f340469b[i11] = list.get(i10).q();
            i10 = i11;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sVar2);
        for (e eVar : list2) {
            if (eVar.t()) {
                arrayList.add(eVar.l());
                arrayList.add(eVar.k());
            } else {
                arrayList.add(eVar.k());
                arrayList.add(eVar.l());
            }
            arrayList2.add(eVar.q());
        }
        this.f340471d = (org.threeten.bp.h[]) arrayList.toArray(new org.threeten.bp.h[arrayList.size()]);
        this.f340472e = (s[]) arrayList2.toArray(new s[arrayList2.size()]);
        this.f340470c = new long[list2.size()];
        for (int i12 = 0; i12 < list2.size(); i12++) {
            this.f340470c[i12] = list2.get(i12).p().H();
        }
        if (list3.size() > 15) {
            throw new IllegalArgumentException("Too many transition rules");
        }
        this.f340473f = (f[]) list3.toArray(new f[list3.size()]);
    }

    private Object p(org.threeten.bp.h hVar, e eVar) {
        org.threeten.bp.h hVarL = eVar.l();
        if (eVar.t()) {
            if (hVar.I(hVarL)) {
                return eVar.r();
            }
            if (!hVar.I(eVar.k())) {
                return eVar.q();
            }
        } else {
            if (!hVar.I(hVarL)) {
                return eVar.q();
            }
            if (hVar.I(eVar.k())) {
                return eVar.r();
            }
        }
        return eVar;
    }

    private e[] q(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        e[] eVarArr = this.f340474g.get(numValueOf);
        if (eVarArr != null) {
            return eVarArr;
        }
        f[] fVarArr = this.f340473f;
        e[] eVarArr2 = new e[fVarArr.length];
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            eVarArr2[i11] = fVarArr[i11].b(i10);
        }
        if (i10 < f340467i) {
            this.f340474g.putIfAbsent(numValueOf, eVarArr2);
        }
        return eVarArr2;
    }

    private int r(long j10, s sVar) {
        return org.threeten.bp.g.E0(cn.d.e(j10 + ((long) sVar.S()), 86400L)).r0();
    }

    private Object s(org.threeten.bp.h hVar) {
        int i10 = 0;
        if (this.f340473f.length > 0) {
            org.threeten.bp.h[] hVarArr = this.f340471d;
            if (hVarArr.length == 0 || hVar.H(hVarArr[hVarArr.length - 1])) {
                e[] eVarArrQ = q(hVar.n0());
                int length = eVarArrQ.length;
                Object obj = null;
                while (i10 < length) {
                    e eVar = eVarArrQ[i10];
                    Object objP = p(hVar, eVar);
                    if ((objP instanceof e) || objP.equals(eVar.r())) {
                        return objP;
                    }
                    i10++;
                    obj = objP;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f340471d, hVar);
        if (iBinarySearch == -1) {
            return this.f340472e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f340471d;
            if (iBinarySearch < objArr.length - 1) {
                int i11 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i11])) {
                    iBinarySearch = i11;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.f340472e[(iBinarySearch / 2) + 1];
        }
        org.threeten.bp.h[] hVarArr2 = this.f340471d;
        org.threeten.bp.h hVar2 = hVarArr2[iBinarySearch];
        org.threeten.bp.h hVar3 = hVarArr2[iBinarySearch + 1];
        s[] sVarArr = this.f340472e;
        int i12 = iBinarySearch / 2;
        s sVar = sVarArr[i12];
        s sVar2 = sVarArr[i12 + 1];
        return sVar2.S() > sVar.S() ? new e(hVar2, sVar, sVar2) : new e(hVar3, sVar, sVar2);
    }

    static b t(DataInput dataInput) throws IOException, ClassNotFoundException {
        int i10 = dataInput.readInt();
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = a.b(dataInput);
        }
        int i12 = i10 + 1;
        s[] sVarArr = new s[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            sVarArr[i13] = a.d(dataInput);
        }
        int i14 = dataInput.readInt();
        long[] jArr2 = new long[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            jArr2[i15] = a.b(dataInput);
        }
        int i16 = i14 + 1;
        s[] sVarArr2 = new s[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            sVarArr2[i17] = a.d(dataInput);
        }
        int i18 = dataInput.readByte();
        f[] fVarArr = new f[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            fVarArr[i19] = f.m(dataInput);
        }
        return new b(jArr, sVarArr, jArr2, sVarArr2, fVarArr);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // org.threeten.bp.zone.g
    public org.threeten.bp.e a(org.threeten.bp.f fVar) {
        return org.threeten.bp.e.Y(b(fVar).S() - d(fVar).S());
    }

    @Override // org.threeten.bp.zone.g
    public s b(org.threeten.bp.f fVar) {
        long jH = fVar.H();
        if (this.f340473f.length > 0) {
            long[] jArr = this.f340470c;
            if (jArr.length == 0 || jH > jArr[jArr.length - 1]) {
                s[] sVarArr = this.f340472e;
                e[] eVarArrQ = q(r(jH, sVarArr[sVarArr.length - 1]));
                e eVar = null;
                for (int i10 = 0; i10 < eVarArrQ.length; i10++) {
                    eVar = eVarArrQ[i10];
                    if (jH < eVar.toEpochSecond()) {
                        return eVar.r();
                    }
                }
                return eVar.q();
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f340470c, jH);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f340472e[iBinarySearch + 1];
    }

    @Override // org.threeten.bp.zone.g
    public s c(org.threeten.bp.h hVar) {
        Object objS = s(hVar);
        return objS instanceof e ? ((e) objS).r() : (s) objS;
    }

    @Override // org.threeten.bp.zone.g
    public s d(org.threeten.bp.f fVar) {
        int iBinarySearch = Arrays.binarySearch(this.f340468a, fVar.H());
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f340469b[iBinarySearch + 1];
    }

    @Override // org.threeten.bp.zone.g
    public e e(org.threeten.bp.h hVar) {
        Object objS = s(hVar);
        if (objS instanceof e) {
            return (e) objS;
        }
        return null;
    }

    @Override // org.threeten.bp.zone.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f340468a, bVar.f340468a) && Arrays.equals(this.f340469b, bVar.f340469b) && Arrays.equals(this.f340470c, bVar.f340470c) && Arrays.equals(this.f340472e, bVar.f340472e) && Arrays.equals(this.f340473f, bVar.f340473f);
        }
        if ((obj instanceof g.a) && j()) {
            org.threeten.bp.f fVar = org.threeten.bp.f.f340021c;
            if (b(fVar).equals(((g.a) obj).b(fVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.zone.g
    public List<f> f() {
        return Collections.unmodifiableList(Arrays.asList(this.f340473f));
    }

    @Override // org.threeten.bp.zone.g
    public List<e> g() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            long[] jArr = this.f340470c;
            if (i10 >= jArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            long j10 = jArr[i10];
            s[] sVarArr = this.f340472e;
            s sVar = sVarArr[i10];
            i10++;
            arrayList.add(new e(j10, sVar, sVarArr[i10]));
        }
    }

    @Override // org.threeten.bp.zone.g
    public List<s> h(org.threeten.bp.h hVar) {
        Object objS = s(hVar);
        return objS instanceof e ? ((e) objS).s() : Collections.singletonList((s) objS);
    }

    @Override // org.threeten.bp.zone.g
    public int hashCode() {
        return Arrays.hashCode(this.f340473f) ^ (((Arrays.hashCode(this.f340468a) ^ Arrays.hashCode(this.f340469b)) ^ Arrays.hashCode(this.f340470c)) ^ Arrays.hashCode(this.f340472e));
    }

    @Override // org.threeten.bp.zone.g
    public boolean i(org.threeten.bp.f fVar) {
        return !d(fVar).equals(b(fVar));
    }

    @Override // org.threeten.bp.zone.g
    public boolean j() {
        return this.f340470c.length == 0 && this.f340473f.length == 0 && this.f340472e[0].equals(this.f340469b[0]);
    }

    @Override // org.threeten.bp.zone.g
    public boolean k(org.threeten.bp.h hVar, s sVar) {
        return h(hVar).contains(sVar);
    }

    @Override // org.threeten.bp.zone.g
    public e l(org.threeten.bp.f fVar) {
        if (this.f340470c.length == 0) {
            return null;
        }
        long jH = fVar.H();
        long[] jArr = this.f340470c;
        if (jH < jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, jH);
            int i10 = iBinarySearch < 0 ? (-iBinarySearch) - 1 : iBinarySearch + 1;
            long j10 = this.f340470c[i10];
            s[] sVarArr = this.f340472e;
            return new e(j10, sVarArr[i10], sVarArr[i10 + 1]);
        }
        if (this.f340473f.length == 0) {
            return null;
        }
        s[] sVarArr2 = this.f340472e;
        int iR = r(jH, sVarArr2[sVarArr2.length - 1]);
        for (e eVar : q(iR)) {
            if (jH < eVar.toEpochSecond()) {
                return eVar;
            }
        }
        if (iR < 999999999) {
            return q(iR + 1)[0];
        }
        return null;
    }

    @Override // org.threeten.bp.zone.g
    public e o(org.threeten.bp.f fVar) {
        if (this.f340470c.length == 0) {
            return null;
        }
        long jH = fVar.H();
        if (fVar.I() > 0 && jH < Long.MAX_VALUE) {
            jH++;
        }
        long[] jArr = this.f340470c;
        long j10 = jArr[jArr.length - 1];
        if (this.f340473f.length > 0 && jH > j10) {
            s[] sVarArr = this.f340472e;
            s sVar = sVarArr[sVarArr.length - 1];
            int iR = r(jH, sVar);
            e[] eVarArrQ = q(iR);
            int length = eVarArrQ.length;
            do {
                length--;
                if (length < 0) {
                    int i10 = iR - 1;
                    if (i10 > r(j10, sVar)) {
                        e[] eVarArrQ2 = q(i10);
                        return eVarArrQ2[eVarArrQ2.length - 1];
                    }
                }
            } while (jH <= eVarArrQ[length].toEpochSecond());
            return eVarArrQ[length];
        }
        int iBinarySearch = Arrays.binarySearch(this.f340470c, jH);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        if (iBinarySearch <= 0) {
            return null;
        }
        int i11 = iBinarySearch - 1;
        long j11 = this.f340470c[i11];
        s[] sVarArr2 = this.f340472e;
        return new e(j11, sVarArr2[i11], sVarArr2[iBinarySearch]);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StandardZoneRules[currentStandardOffset=");
        s[] sVarArr = this.f340469b;
        sb2.append(sVarArr[sVarArr.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }

    void u(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f340468a.length);
        for (long j10 : this.f340468a) {
            a.f(j10, dataOutput);
        }
        for (s sVar : this.f340469b) {
            a.h(sVar, dataOutput);
        }
        dataOutput.writeInt(this.f340470c.length);
        for (long j11 : this.f340470c) {
            a.f(j11, dataOutput);
        }
        for (s sVar2 : this.f340472e) {
            a.h(sVar2, dataOutput);
        }
        dataOutput.writeByte(this.f340473f.length);
        for (f fVar : this.f340473f) {
            fVar.n(dataOutput);
        }
    }

    private b(long[] jArr, s[] sVarArr, long[] jArr2, s[] sVarArr2, f[] fVarArr) {
        this.f340468a = jArr;
        this.f340469b = sVarArr;
        this.f340470c = jArr2;
        this.f340472e = sVarArr2;
        this.f340473f = fVarArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr2.length) {
            int i11 = i10 + 1;
            e eVar = new e(jArr2[i10], sVarArr2[i10], sVarArr2[i11]);
            if (eVar.t()) {
                arrayList.add(eVar.l());
                arrayList.add(eVar.k());
            } else {
                arrayList.add(eVar.k());
                arrayList.add(eVar.l());
            }
            i10 = i11;
        }
        this.f340471d = (org.threeten.bp.h[]) arrayList.toArray(new org.threeten.bp.h[arrayList.size()]);
    }
}
