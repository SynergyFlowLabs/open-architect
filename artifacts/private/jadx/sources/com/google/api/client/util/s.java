package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class s extends AbstractMap<String, Object> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Object> f116157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f116158b;

    final class a implements Iterator<Map.Entry<String, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f116159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<Map.Entry<String, Object>> f116160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<Map.Entry<String, Object>> f116161c;

        a(o.c cVar) {
            this.f116160b = cVar.iterator();
            this.f116161c = s.this.f116157a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<String, Object> next() {
            if (!this.f116159a) {
                if (this.f116160b.hasNext()) {
                    return this.f116160b.next();
                }
                this.f116159a = true;
            }
            return this.f116161c.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f116160b.hasNext() || this.f116161c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f116159a) {
                this.f116161c.remove();
            }
            this.f116160b.remove();
        }
    }

    final class b extends AbstractSet<Map.Entry<String, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o.c f116163a;

        b() {
            this.f116163a = new o(s.this, s.this.f116158b.d()).entrySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.f116157a.clear();
            this.f116163a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, Object>> iterator() {
            return s.this.new a(this.f116163a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f116157a.size() + this.f116163a.size();
        }
    }

    public enum c {
        IGNORE_CASE
    }

    public s() {
        this(EnumSet.noneOf(c.class));
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s clone() {
        try {
            s sVar = (s) super.clone();
            n.b(this, sVar);
            sVar.f116157a = (Map) n.a(this.f116157a);
            return sVar;
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final k b() {
        return this.f116158b;
    }

    public final Map<String, Object> c() {
        return this.f116157a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(String str, Object obj) {
        r rVarB = this.f116158b.b(str);
        if (rVarB != null) {
            Object objH = rVarB.h(this);
            rVarB.n(this, obj);
            return objH;
        }
        if (this.f116158b.d()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f116157a.put(str, obj);
    }

    public s e(String str, Object obj) {
        r rVarB = this.f116158b.b(str);
        if (rVarB != null) {
            rVarB.n(this, obj);
            return this;
        }
        if (this.f116158b.d()) {
            str = str.toLowerCase(Locale.US);
        }
        this.f116157a.put(str, obj);
        return this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new b();
    }

    public final void f(Map<String, Object> map) {
        this.f116157a = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        r rVarB = this.f116158b.b(lowerCase);
        if (rVarB != null) {
            return rVarB.h(this);
        }
        if (this.f116158b.d()) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.f116157a.get(lowerCase);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        if (this.f116158b.b(lowerCase) != null) {
            throw new UnsupportedOperationException();
        }
        if (this.f116158b.d()) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.f116157a.remove(lowerCase);
    }

    public s(EnumSet<c> enumSet) {
        this.f116157a = com.google.api.client.util.a.c();
        this.f116158b = k.i(getClass(), enumSet.contains(c.IGNORE_CASE));
    }
}
