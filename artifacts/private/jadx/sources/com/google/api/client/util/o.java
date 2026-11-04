package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class o extends AbstractMap<String, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f116111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f116112b;

    final class a implements Map.Entry<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f116113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f116114b;

        a(r rVar, Object obj) {
            this.f116114b = rVar;
            this.f116113a = h0.d(obj);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            String strF = this.f116114b.f();
            return o.this.f116112b.d() ? strF.toLowerCase(Locale.US) : strF;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f116113a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getValue().hashCode() ^ getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f116113a;
            this.f116113a = h0.d(obj);
            this.f116114b.n(o.this.f116111a, obj);
            return obj2;
        }
    }

    final class b implements Iterator<Map.Entry<String, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f116116a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r f116117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f116118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f116119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f116120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private r f116121f;

        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<String, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            r rVar = this.f116117b;
            this.f116121f = rVar;
            Object obj = this.f116118c;
            this.f116120e = false;
            this.f116119d = false;
            this.f116117b = null;
            this.f116118c = null;
            return o.this.new a(rVar, obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f116120e) {
                this.f116120e = true;
                this.f116118c = null;
                while (this.f116118c == null) {
                    int i10 = this.f116116a + 1;
                    this.f116116a = i10;
                    if (i10 >= o.this.f116112b.f116093d.size()) {
                        break;
                    }
                    k kVar = o.this.f116112b;
                    r rVarB = kVar.b(kVar.f116093d.get(this.f116116a));
                    this.f116117b = rVarB;
                    this.f116118c = rVarB.h(o.this.f116111a);
                }
            }
            return this.f116118c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            h0.g((this.f116121f == null || this.f116119d) ? false : true);
            this.f116119d = true;
            this.f116121f.n(o.this.f116111a, null);
        }
    }

    final class c extends AbstractSet<Map.Entry<String, Object>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b iterator() {
            return o.this.new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterator<String> it = o.this.f116112b.f116093d.iterator();
            while (it.hasNext()) {
                o.this.f116112b.b(it.next()).n(o.this.f116111a, null);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            Iterator<String> it = o.this.f116112b.f116093d.iterator();
            while (it.hasNext()) {
                if (o.this.f116112b.b(it.next()).h(o.this.f116111a) != null) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<String> it = o.this.f116112b.f116093d.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (o.this.f116112b.b(it.next()).h(o.this.f116111a) != null) {
                    i10++;
                }
            }
            return i10;
        }
    }

    o(Object obj, boolean z10) {
        this.f116111a = obj;
        k kVarI = k.i(obj.getClass(), z10);
        this.f116112b = kVarI;
        h0.a(!kVarI.g());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c entrySet() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        r rVarB = this.f116112b.b(str);
        h0.e(rVarB, "no field of key " + str);
        Object objH = rVarB.h(this.f116111a);
        rVarB.n(this.f116111a, h0.d(obj));
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        r rVarB;
        if ((obj instanceof String) && (rVarB = this.f116112b.b((String) obj)) != null) {
            return rVarB.h(this.f116111a);
        }
        return null;
    }
}
