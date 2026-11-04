package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116424a;

    class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f116425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f116426c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(final a0 this$0, a0 prototype, final String val$nullText) {
            super(prototype, null);
            this.f116425b = val$nullText;
            this.f116426c = this$0;
        }

        @Override // com.google.common.base.a0
        public a0 q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.a0
        CharSequence r(@fj.a Object part) {
            return part == null ? this.f116425b : this.f116426c.r(part);
        }

        @Override // com.google.common.base.a0
        public a0 s(String nullText) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    class b extends a0 {
        b(a0 prototype) {
            super(prototype, null);
        }

        @Override // com.google.common.base.a0
        public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
            j0.F(appendable, "appendable");
            j0.F(parts, "parts");
            while (parts.hasNext()) {
                Object next = parts.next();
                if (next != null) {
                    appendable.append(a0.this.r(next));
                    break;
                }
            }
            while (parts.hasNext()) {
                Object next2 = parts.next();
                if (next2 != null) {
                    appendable.append(a0.this.f116424a);
                    appendable.append(a0.this.r(next2));
                }
            }
            return appendable;
        }

        @Override // com.google.common.base.a0
        public a0 s(String nullText) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.a0
        public d u(String kvs) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    class c extends AbstractList<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f116428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f116429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f116430c;

        c(final Object[] val$rest, final Object val$first, final Object val$second) {
            this.f116428a = val$rest;
            this.f116429b = val$first;
            this.f116430c = val$second;
        }

        @Override // java.util.AbstractList, java.util.List
        @fj.a
        public Object get(int index) {
            if (index != 0) {
                return index != 1 ? this.f116428a[index - 2] : this.f116430c;
            }
            return this.f116429b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f116428a.length + 2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f116431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f116432b;

        /* synthetic */ d(a0 a0Var, String str, a aVar) {
            this(a0Var, str);
        }

        @z7.a
        public <A extends Appendable> A a(A a10, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a10, iterable.iterator());
        }

        @z7.a
        public <A extends Appendable> A b(A appendable, Iterator<? extends Map.Entry<?, ?>> parts) throws IOException {
            j0.E(appendable);
            if (parts.hasNext()) {
                Map.Entry<?, ?> next = parts.next();
                appendable.append(this.f116431a.r(next.getKey()));
                appendable.append(this.f116432b);
                appendable.append(this.f116431a.r(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.f116431a.f116424a);
                    Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.f116431a.r(next2.getKey()));
                    appendable.append(this.f116432b);
                    appendable.append(this.f116431a.r(next2.getValue()));
                }
            }
            return appendable;
        }

        @z7.a
        public <A extends Appendable> A c(A a10, Map<?, ?> map) throws IOException {
            return (A) a(a10, map.entrySet());
        }

        @z7.a
        public StringBuilder d(StringBuilder builder, Iterable<? extends Map.Entry<?, ?>> entries) {
            return e(builder, entries.iterator());
        }

        @z7.a
        public StringBuilder e(StringBuilder builder, Iterator<? extends Map.Entry<?, ?>> entries) {
            try {
                b(builder, entries);
                return builder;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @z7.a
        public StringBuilder f(StringBuilder builder, Map<?, ?> map) {
            return d(builder, map.entrySet());
        }

        public String g(Iterable<? extends Map.Entry<?, ?>> entries) {
            return h(entries.iterator());
        }

        public String h(Iterator<? extends Map.Entry<?, ?>> entries) {
            return e(new StringBuilder(), entries).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String nullText) {
            return new d(this.f116431a.s(nullText), this.f116432b);
        }

        private d(a0 joiner, String keyValueSeparator) {
            this.f116431a = joiner;
            this.f116432b = (String) j0.E(keyValueSeparator);
        }
    }

    /* synthetic */ a0(a0 a0Var, a aVar) {
        this(a0Var);
    }

    private static Iterable<Object> j(@fj.a Object first, @fj.a Object second, Object[] rest) {
        j0.E(rest);
        return new c(rest, first, second);
    }

    public static a0 o(char separator) {
        return new a0(String.valueOf(separator));
    }

    public static a0 p(String separator) {
        return new a0(separator);
    }

    @z7.a
    public <A extends Appendable> A b(A a10, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a10, iterable.iterator());
    }

    @z7.a
    public final <A extends Appendable> A c(A a10, @fj.a Object obj, @fj.a Object obj2, Object... objArr) throws IOException {
        return (A) b(a10, j(obj, obj2, objArr));
    }

    @z7.a
    public <A extends Appendable> A d(A appendable, Iterator<? extends Object> parts) throws IOException {
        j0.E(appendable);
        if (parts.hasNext()) {
            appendable.append(r(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.f116424a);
                appendable.append(r(parts.next()));
            }
        }
        return appendable;
    }

    @z7.a
    public final <A extends Appendable> A e(A a10, Object[] objArr) throws IOException {
        return (A) b(a10, Arrays.asList(objArr));
    }

    @z7.a
    public final StringBuilder f(StringBuilder builder, Iterable<? extends Object> parts) {
        return h(builder, parts.iterator());
    }

    @z7.a
    public final StringBuilder g(StringBuilder builder, @fj.a Object first, @fj.a Object second, Object... rest) {
        return f(builder, j(first, second, rest));
    }

    @z7.a
    public final StringBuilder h(StringBuilder builder, Iterator<? extends Object> parts) {
        try {
            d(builder, parts);
            return builder;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @z7.a
    public final StringBuilder i(StringBuilder builder, Object[] parts) {
        return f(builder, Arrays.asList(parts));
    }

    public final String k(Iterable<? extends Object> parts) {
        return m(parts.iterator());
    }

    public final String l(@fj.a Object first, @fj.a Object second, Object... rest) {
        return k(j(first, second, rest));
    }

    public final String m(Iterator<? extends Object> parts) {
        return h(new StringBuilder(), parts).toString();
    }

    public final String n(Object[] parts) {
        return k(Arrays.asList(parts));
    }

    public a0 q() {
        return new b(this);
    }

    CharSequence r(@fj.a Object part) {
        Objects.requireNonNull(part);
        return part instanceof CharSequence ? (CharSequence) part : part.toString();
    }

    public a0 s(String nullText) {
        j0.E(nullText);
        return new a(this, this, nullText);
    }

    public d t(char keyValueSeparator) {
        return u(String.valueOf(keyValueSeparator));
    }

    public d u(String keyValueSeparator) {
        return new d(this, keyValueSeparator, null);
    }

    private a0(String separator) {
        this.f116424a = (String) j0.E(separator);
    }

    private a0(a0 prototype) {
        this.f116424a = prototype.f116424a;
    }
}
