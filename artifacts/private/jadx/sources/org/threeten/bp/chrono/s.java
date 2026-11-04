package org.threeten.bp.chrono;

import androidx.compose.animation.core.z1;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends cn.a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f339956d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f339957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f339958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f339959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f339960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f339961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f339962j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f339963k = 1466499369062886794L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReference<s[]> f339964l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f339965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient org.threeten.bp.g f339966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f339967c;

    static {
        s sVar = new s(-1, org.threeten.bp.g.C0(1868, 9, 8), "Meiji");
        f339957e = sVar;
        s sVar2 = new s(0, org.threeten.bp.g.C0(1912, 7, 30), "Taisho");
        f339958f = sVar2;
        s sVar3 = new s(1, org.threeten.bp.g.C0(1926, 12, 25), "Showa");
        f339959g = sVar3;
        s sVar4 = new s(2, org.threeten.bp.g.C0(1989, 1, 8), "Heisei");
        f339960h = sVar4;
        int i10 = 1 | 5;
        s sVar5 = new s(3, org.threeten.bp.g.C0(2019, 5, 1), "Reiwa");
        f339961i = sVar5;
        f339964l = new AtomicReference<>(new s[]{sVar, sVar2, sVar3, sVar4, sVar5});
    }

    private s(int i10, org.threeten.bp.g gVar, String str) {
        this.f339965a = i10;
        this.f339966b = gVar;
        this.f339967c = str;
    }

    private static int D(int i10) {
        return i10 + 1;
    }

    static s E(DataInput dataInput) throws IOException {
        return z(dataInput.readByte());
    }

    public static s H(org.threeten.bp.g gVar, String str) {
        AtomicReference<s[]> atomicReference = f339964l;
        s[] sVarArr = atomicReference.get();
        if (sVarArr.length > 5) {
            throw new org.threeten.bp.b("Only one additional Japanese era can be added");
        }
        cn.d.j(gVar, "since");
        cn.d.j(str, "name");
        if (!gVar.I(f339961i.f339966b)) {
            throw new org.threeten.bp.b("Invalid since date for additional Japanese era, must be after Reiwa");
        }
        s sVar = new s(4, gVar, str);
        s[] sVarArr2 = (s[]) Arrays.copyOf(sVarArr, 6);
        sVarArr2[5] = sVar;
        if (z1.a(atomicReference, sVarArr, sVarArr2)) {
            return sVar;
        }
        throw new org.threeten.bp.b("Only one additional Japanese era can be added");
    }

    public static s L(String str) {
        cn.d.j(str, "japaneseEra");
        for (s sVar : f339964l.get()) {
            if (str.equals(sVar.f339967c)) {
                return sVar;
            }
        }
        throw new IllegalArgumentException("Era not found: " + str);
    }

    public static s[] M() {
        s[] sVarArr = f339964l.get();
        return (s[]) Arrays.copyOf(sVarArr, sVarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return z(this.f339965a);
        } catch (org.threeten.bp.b e10) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e10);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new w((byte) 2, this);
    }

    static s x(org.threeten.bp.g gVar) {
        if (gVar.L(f339957e.f339966b)) {
            throw new org.threeten.bp.b("Date too early: " + gVar);
        }
        s[] sVarArr = f339964l.get();
        for (int length = sVarArr.length - 1; length >= 0; length--) {
            s sVar = sVarArr[length];
            if (gVar.compareTo(sVar.f339966b) >= 0) {
                return sVar;
            }
        }
        return null;
    }

    public static s z(int i10) {
        s[] sVarArr = f339964l.get();
        if (i10 < f339957e.f339965a || i10 > sVarArr[sVarArr.length - 1].f339965a) {
            throw new org.threeten.bp.b("japaneseEra is invalid");
        }
        return sVarArr[D(i10)];
    }

    org.threeten.bp.g I() {
        return this.f339966b;
    }

    void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
        return jVar == aVar ? q.f339942f.L(aVar) : super.c(jVar);
    }

    @Override // org.threeten.bp.chrono.k
    public int getValue() {
        return this.f339965a;
    }

    public String toString() {
        return this.f339967c;
    }

    org.threeten.bp.g w() {
        int iD = D(this.f339965a);
        s[] sVarArrM = M();
        return iD >= sVarArrM.length + (-1) ? org.threeten.bp.g.f340195f : sVarArrM[iD + 1].I().u0(1L);
    }
}
