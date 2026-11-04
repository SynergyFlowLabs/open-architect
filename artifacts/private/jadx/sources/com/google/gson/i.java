package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<l> f125316a;

    public i() {
        this.f125316a = new ArrayList<>();
    }

    private l V() {
        int size = this.f125316a.size();
        if (size == 1) {
            return this.f125316a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // com.google.gson.l
    public long A() {
        return V().A();
    }

    @Override // com.google.gson.l
    public Number B() {
        return V().B();
    }

    @Override // com.google.gson.l
    public short C() {
        return V().C();
    }

    @Override // com.google.gson.l
    public String D() {
        return V().D();
    }

    public void L(l lVar) {
        if (lVar == null) {
            lVar = n.f125555a;
        }
        this.f125316a.add(lVar);
    }

    public void M(Boolean bool) {
        this.f125316a.add(bool == null ? n.f125555a : new r(bool));
    }

    public void N(Character ch2) {
        this.f125316a.add(ch2 == null ? n.f125555a : new r(ch2));
    }

    public void O(Number number) {
        this.f125316a.add(number == null ? n.f125555a : new r(number));
    }

    public void P(String str) {
        this.f125316a.add(str == null ? n.f125555a : new r(str));
    }

    public void Q(i iVar) {
        this.f125316a.addAll(iVar.f125316a);
    }

    public List<l> R() {
        return new com.google.gson.internal.d0(this.f125316a);
    }

    public boolean S(l lVar) {
        return this.f125316a.contains(lVar);
    }

    @Override // com.google.gson.l
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public i c() {
        if (this.f125316a.isEmpty()) {
            return new i();
        }
        i iVar = new i(this.f125316a.size());
        Iterator<l> it = this.f125316a.iterator();
        while (it.hasNext()) {
            iVar.L(it.next().c());
        }
        return iVar;
    }

    public l U(int i10) {
        return this.f125316a.get(i10);
    }

    @z7.a
    public l W(int i10) {
        return this.f125316a.remove(i10);
    }

    @z7.a
    public boolean Y(l lVar) {
        return this.f125316a.remove(lVar);
    }

    @z7.a
    public l Z(int i10, l lVar) {
        ArrayList<l> arrayList = this.f125316a;
        if (lVar == null) {
            lVar = n.f125555a;
        }
        return arrayList.set(i10, lVar);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof i) || !((i) obj).f125316a.equals(this.f125316a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f125316a.hashCode();
    }

    @Override // com.google.gson.l
    public BigDecimal i() {
        return V().i();
    }

    public boolean isEmpty() {
        return this.f125316a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f125316a.iterator();
    }

    @Override // com.google.gson.l
    public BigInteger k() {
        return V().k();
    }

    @Override // com.google.gson.l
    public boolean l() {
        return V().l();
    }

    @Override // com.google.gson.l
    public byte m() {
        return V().m();
    }

    @Override // com.google.gson.l
    @Deprecated
    public char n() {
        return V().n();
    }

    @Override // com.google.gson.l
    public double p() {
        return V().p();
    }

    @Override // com.google.gson.l
    public float r() {
        return V().r();
    }

    @Override // com.google.gson.l
    public int s() {
        return V().s();
    }

    public int size() {
        return this.f125316a.size();
    }

    public i(int i10) {
        this.f125316a = new ArrayList<>(i10);
    }
}
