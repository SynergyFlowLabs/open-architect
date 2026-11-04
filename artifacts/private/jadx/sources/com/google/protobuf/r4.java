package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class r4 extends AbstractList<String> implements a2, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2 f126311a;

    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f126312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f126313b;

        a(final int val$index) {
            this.f126313b = val$index;
            this.f126312a = r4.this.f126311a.listIterator(val$index);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f126312a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f126312a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f126312a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f126312a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f126312a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f126312a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f126315a;

        b() {
            this.f126315a = r4.this.f126311a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f126315a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f126315a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r4(a2 list) {
        this.f126311a = list;
    }

    @Override // com.google.protobuf.a2
    public List<byte[]> B0() {
        return Collections.unmodifiableList(this.f126311a.B0());
    }

    @Override // com.google.protobuf.a2
    public void E1(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.a2
    public Object J1(int index) {
        return this.f126311a.J1(index);
    }

    @Override // com.google.protobuf.a2
    public boolean Q0(Collection<? extends u> element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.a2
    public a2 T0() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        return this.f126311a.get(index);
    }

    @Override // com.google.protobuf.a2
    public void d2(u element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.a2
    public void i2(a2 other) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.protobuf.a2
    public List<?> j1() {
        return this.f126311a.j1();
    }

    @Override // com.google.protobuf.a2
    public void j4(int index, u element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.a2
    public u l1(int index) {
        return this.f126311a.l1(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new a(index);
    }

    @Override // com.google.protobuf.k3
    public List<u> p1() {
        return Collections.unmodifiableList(this.f126311a.p1());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126311a.size();
    }

    @Override // com.google.protobuf.a2
    public byte[] w0(int index) {
        return this.f126311a.w0(index);
    }

    @Override // com.google.protobuf.a2
    public void x(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.a2
    public boolean x0(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }
}
