package com.google.api.client.repackaged.com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115881a;

    class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, String str) {
            super(kVar, null);
            this.f115882b = str;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        public k q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        CharSequence r(@fj.h Object obj) {
            return obj == null ? this.f115882b : k.this.r(obj);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        public k s(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    class b extends k {
        b(k kVar) {
            super(kVar, null);
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        public <A extends Appendable> A d(A a10, Iterator<?> it) throws IOException {
            q.F(a10, "appendable");
            q.F(it, "parts");
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a10.append(k.this.r(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a10.append(k.this.f115881a);
                    a10.append(k.this.r(next2));
                }
            }
            return a10;
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        public k s(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.api.client.repackaged.com.google.common.base.k
        public d u(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    static class c extends AbstractList<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f115885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f115886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f115887c;

        c(Object[] objArr, Object obj, Object obj2) {
            this.f115885a = objArr;
            this.f115886b = obj;
            this.f115887c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? this.f115885a[i10 - 2] : this.f115887c;
            }
            return this.f115886b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f115885a.length + 2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f115888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f115889b;

        /* synthetic */ d(k kVar, String str, a aVar) {
            this(kVar, str);
        }

        @r7.a
        @z7.a
        public <A extends Appendable> A a(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a10, iterable.iterator());
        }

        @r7.a
        @z7.a
        public <A extends Appendable> A b(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            q.E(a10);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a10.append(this.f115888a.r(next.getKey()));
                a10.append(this.f115889b);
                a10.append(this.f115888a.r(next.getValue()));
                while (it.hasNext()) {
                    a10.append(this.f115888a.f115881a);
                    Map.Entry<?, ?> next2 = it.next();
                    a10.append(this.f115888a.r(next2.getKey()));
                    a10.append(this.f115889b);
                    a10.append(this.f115888a.r(next2.getValue()));
                }
            }
            return a10;
        }

        @z7.a
        public <A extends Appendable> A c(A a10, Map<?, ?> map) throws IOException {
            return (A) a(a10, map.entrySet());
        }

        @r7.a
        @z7.a
        public StringBuilder d(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return e(sb2, iterable.iterator());
        }

        @r7.a
        @z7.a
        public StringBuilder e(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                b(sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @z7.a
        public StringBuilder f(StringBuilder sb2, Map<?, ?> map) {
            return d(sb2, map.entrySet());
        }

        @r7.a
        public String g(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return h(iterable.iterator());
        }

        @r7.a
        public String h(Iterator<? extends Map.Entry<?, ?>> it) {
            return e(new StringBuilder(), it).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String str) {
            return new d(this.f115888a.s(str), this.f115889b);
        }

        private d(k kVar, String str) {
            this.f115888a = kVar;
            this.f115889b = (String) q.E(str);
        }
    }

    /* synthetic */ k(k kVar, a aVar) {
        this(kVar);
    }

    private static Iterable<Object> j(Object obj, Object obj2, Object[] objArr) {
        q.E(objArr);
        return new c(objArr, obj, obj2);
    }

    public static k o(char c10) {
        return new k(String.valueOf(c10));
    }

    public static k p(String str) {
        return new k(str);
    }

    @z7.a
    public <A extends Appendable> A b(A a10, Iterable<?> iterable) throws IOException {
        return (A) d(a10, iterable.iterator());
    }

    @z7.a
    public final <A extends Appendable> A c(A a10, @fj.h Object obj, @fj.h Object obj2, Object... objArr) throws IOException {
        return (A) b(a10, j(obj, obj2, objArr));
    }

    @z7.a
    public <A extends Appendable> A d(A a10, Iterator<?> it) throws IOException {
        q.E(a10);
        if (it.hasNext()) {
            a10.append(r(it.next()));
            while (it.hasNext()) {
                a10.append(this.f115881a);
                a10.append(r(it.next()));
            }
        }
        return a10;
    }

    @z7.a
    public final <A extends Appendable> A e(A a10, Object[] objArr) throws IOException {
        return (A) b(a10, Arrays.asList(objArr));
    }

    @z7.a
    public final StringBuilder f(StringBuilder sb2, Iterable<?> iterable) {
        return h(sb2, iterable.iterator());
    }

    @z7.a
    public final StringBuilder g(StringBuilder sb2, @fj.h Object obj, @fj.h Object obj2, Object... objArr) {
        return f(sb2, j(obj, obj2, objArr));
    }

    @z7.a
    public final StringBuilder h(StringBuilder sb2, Iterator<?> it) {
        try {
            d(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @z7.a
    public final StringBuilder i(StringBuilder sb2, Object[] objArr) {
        return f(sb2, Arrays.asList(objArr));
    }

    public final String k(Iterable<?> iterable) {
        return m(iterable.iterator());
    }

    public final String l(@fj.h Object obj, @fj.h Object obj2, Object... objArr) {
        return k(j(obj, obj2, objArr));
    }

    public final String m(Iterator<?> it) {
        return h(new StringBuilder(), it).toString();
    }

    public final String n(Object[] objArr) {
        return k(Arrays.asList(objArr));
    }

    public k q() {
        return new b(this);
    }

    CharSequence r(Object obj) {
        q.E(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public k s(String str) {
        q.E(str);
        return new a(this, str);
    }

    public d t(char c10) {
        return u(String.valueOf(c10));
    }

    public d u(String str) {
        return new d(this, str, null);
    }

    private k(String str) {
        this.f115881a = (String) q.E(str);
    }

    private k(k kVar) {
        this.f115881a = kVar.f115881a;
    }
}
