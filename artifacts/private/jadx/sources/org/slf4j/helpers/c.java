package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class c implements org.slf4j.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f339621c = -2849567615646933777L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f339622d = "[ ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f339623e = " ]";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f339624f = ", ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f339625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<org.slf4j.h> f339626b = new CopyOnWriteArrayList();

    c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.f339625a = str;
    }

    @Override // org.slf4j.h
    public boolean G3() {
        if (this.f339626b.size() <= 0) {
            return false;
        }
        int i10 = 6 << 1;
        return true;
    }

    @Override // org.slf4j.h
    public boolean contains(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.f339625a.equals(str)) {
            return true;
        }
        if (!G3()) {
            return false;
        }
        Iterator<org.slf4j.h> it = this.f339626b.iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof org.slf4j.h)) {
            return this.f339625a.equals(((org.slf4j.h) obj).getName());
        }
        return false;
    }

    @Override // org.slf4j.h
    public void f4(org.slf4j.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (!s2(hVar) && !hVar.s2(this)) {
            this.f339626b.add(hVar);
        }
    }

    @Override // org.slf4j.h
    public String getName() {
        return this.f339625a;
    }

    @Override // org.slf4j.h
    @Deprecated
    public boolean hasChildren() {
        return G3();
    }

    @Override // org.slf4j.h
    public int hashCode() {
        return this.f339625a.hashCode();
    }

    @Override // org.slf4j.h
    public Iterator<org.slf4j.h> iterator() {
        return this.f339626b.iterator();
    }

    @Override // org.slf4j.h
    public boolean r3(org.slf4j.h hVar) {
        return this.f339626b.remove(hVar);
    }

    @Override // org.slf4j.h
    public boolean s2(org.slf4j.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (equals(hVar)) {
            return true;
        }
        if (G3()) {
            Iterator<org.slf4j.h> it = this.f339626b.iterator();
            while (it.hasNext()) {
                if (it.next().s2(hVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        if (!G3()) {
            return getName();
        }
        Iterator<org.slf4j.h> it = iterator();
        StringBuilder sb2 = new StringBuilder(getName());
        sb2.append(' ');
        sb2.append(f339622d);
        while (it.hasNext()) {
            sb2.append(it.next().getName());
            if (it.hasNext()) {
                sb2.append(f339624f);
            }
        }
        sb2.append(f339623e);
        return sb2.toString();
    }
}
