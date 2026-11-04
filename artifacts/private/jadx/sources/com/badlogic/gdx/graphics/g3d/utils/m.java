package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.e;

/* JADX INFO: loaded from: classes3.dex */
public class m<T extends com.badlogic.gdx.graphics.e> implements Comparable<m<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f94685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.graphics.k.a f94686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.graphics.k.a f94687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.graphics.k.b f94688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.graphics.k.b f94689e;

    public m(T t10, com.badlogic.gdx.graphics.k.a aVar, com.badlogic.gdx.graphics.k.a aVar2, com.badlogic.gdx.graphics.k.b bVar, com.badlogic.gdx.graphics.k.b bVar2) {
        this.f94685a = null;
        c(t10, aVar, aVar2, bVar, bVar2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(m<T> mVar) {
        int iL = 0;
        if (mVar == this) {
            return 0;
        }
        T t10 = this.f94685a;
        int i10 = t10 == null ? 0 : t10.f94201a;
        T t11 = mVar.f94685a;
        int i11 = t11 == null ? 0 : t11.f94201a;
        if (i10 != i11) {
            return i10 - i11;
        }
        int i12 = t10 == null ? 0 : t10.i();
        T t12 = mVar.f94685a;
        int i13 = t12 == null ? 0 : t12.i();
        if (i12 != i13) {
            return i12 - i13;
        }
        com.badlogic.gdx.graphics.k.a aVar = this.f94686b;
        if (aVar != mVar.f94686b) {
            int iL2 = aVar == null ? 0 : aVar.l();
            com.badlogic.gdx.graphics.k.a aVar2 = mVar.f94686b;
            return iL2 - (aVar2 != null ? aVar2.l() : 0);
        }
        com.badlogic.gdx.graphics.k.a aVar3 = this.f94687c;
        if (aVar3 != mVar.f94687c) {
            int iL3 = aVar3 == null ? 0 : aVar3.l();
            com.badlogic.gdx.graphics.k.a aVar4 = mVar.f94687c;
            if (aVar4 != null) {
                iL = aVar4.l();
            }
            return iL3 - iL;
        }
        com.badlogic.gdx.graphics.k.b bVar = this.f94688d;
        if (bVar != mVar.f94688d) {
            int iL4 = bVar == null ? 0 : bVar.l();
            com.badlogic.gdx.graphics.k.b bVar2 = mVar.f94688d;
            if (bVar2 != null) {
                iL = bVar2.l();
            }
            return iL4 - iL;
        }
        com.badlogic.gdx.graphics.k.b bVar3 = this.f94689e;
        if (bVar3 == mVar.f94689e) {
            return 0;
        }
        int iL5 = bVar3 == null ? 0 : bVar3.l();
        com.badlogic.gdx.graphics.k.b bVar4 = mVar.f94689e;
        if (bVar4 != null) {
            iL = bVar4.l();
        }
        return iL5 - iL;
    }

    public void c(T t10, com.badlogic.gdx.graphics.k.a aVar, com.badlogic.gdx.graphics.k.a aVar2, com.badlogic.gdx.graphics.k.b bVar, com.badlogic.gdx.graphics.k.b bVar2) {
        this.f94685a = t10;
        this.f94686b = aVar;
        this.f94687c = aVar2;
        this.f94688d = bVar;
        this.f94689e = bVar2;
    }

    public <V extends T> void d(m<V> mVar) {
        this.f94685a = mVar.f94685a;
        this.f94686b = mVar.f94686b;
        this.f94687c = mVar.f94687c;
        this.f94688d = mVar.f94688d;
        this.f94689e = mVar.f94689e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f94685a == this.f94685a && mVar.f94686b == this.f94686b && mVar.f94687c == this.f94687c && mVar.f94688d == this.f94688d && mVar.f94689e == this.f94689e;
    }

    public int hashCode() {
        T t10 = this.f94685a;
        int i10 = 6 ^ 0;
        long jI = ((((long) (t10 == null ? 0 : t10.f94201a)) * 811) + ((long) (t10 == null ? 0 : t10.i()))) * 811;
        com.badlogic.gdx.graphics.k.a aVar = this.f94686b;
        long jL = (jI + ((long) (aVar == null ? 0 : aVar.l()))) * 811;
        com.badlogic.gdx.graphics.k.a aVar2 = this.f94687c;
        long jL2 = (jL + ((long) (aVar2 == null ? 0 : aVar2.l()))) * 811;
        com.badlogic.gdx.graphics.k.b bVar = this.f94688d;
        long jL3 = (jL2 + ((long) (bVar == null ? 0 : bVar.l()))) * 811;
        com.badlogic.gdx.graphics.k.b bVar2 = this.f94689e;
        long jL4 = jL3 + ((long) (bVar2 != null ? bVar2.l() : 0));
        return (int) ((jL4 >> 32) ^ jL4);
    }

    public m(T t10) {
        this(t10, null, null, null, null);
    }

    public m() {
        this.f94685a = null;
    }
}
