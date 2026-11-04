package com.google.gson;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c0<String, l> f125556a = new com.google.gson.internal.c0<>(false);

    public void L(String str, l lVar) {
        com.google.gson.internal.c0<String, l> c0Var = this.f125556a;
        if (lVar == null) {
            lVar = n.f125555a;
        }
        c0Var.put(str, lVar);
    }

    public void M(String str, Boolean bool) {
        L(str, bool == null ? n.f125555a : new r(bool));
    }

    public void N(String str, Character ch2) {
        L(str, ch2 == null ? n.f125555a : new r(ch2));
    }

    public void O(String str, Number number) {
        L(str, number == null ? n.f125555a : new r(number));
    }

    public void P(String str, String str2) {
        L(str, str2 == null ? n.f125555a : new r(str2));
    }

    public Map<String, l> Q() {
        return this.f125556a;
    }

    @Override // com.google.gson.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public o c() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f125556a.entrySet()) {
            oVar.L(entry.getKey(), entry.getValue().c());
        }
        return oVar;
    }

    public l S(String str) {
        return this.f125556a.get(str);
    }

    public i T(String str) {
        return (i) this.f125556a.get(str);
    }

    public o U(String str) {
        return (o) this.f125556a.get(str);
    }

    public r V(String str) {
        return (r) this.f125556a.get(str);
    }

    public boolean W(String str) {
        return this.f125556a.containsKey(str);
    }

    public Set<String> Y() {
        return this.f125556a.keySet();
    }

    @z7.a
    public l Z(String str) {
        return this.f125556a.remove(str);
    }

    public Set<Map.Entry<String, l>> entrySet() {
        return this.f125556a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f125556a.equals(this.f125556a));
    }

    public int hashCode() {
        return this.f125556a.hashCode();
    }

    public boolean isEmpty() {
        return this.f125556a.isEmpty();
    }

    public int size() {
        return this.f125556a.size();
    }
}
