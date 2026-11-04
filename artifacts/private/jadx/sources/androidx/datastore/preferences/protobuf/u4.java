package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class u4 extends AbstractList<String> implements b2, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f50691a;

    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f50692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50693b;

        a(final int val$index) {
            this.f50693b = val$index;
            this.f50692a = u4.this.f50691a.listIterator(val$index);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f50692a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f50692a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f50692a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f50692a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f50692a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f50692a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f50695a;

        b() {
            this.f50695a = u4.this.f50691a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f50695a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50695a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u4(b2 list) {
        this.f50691a = list;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public List<byte[]> B0() {
        return Collections.unmodifiableList(this.f50691a.B0());
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void E1(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public Object J1(int index) {
        return this.f50691a.J1(index);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void O2(u element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public boolean Q0(Collection<? extends u> element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public b2 T0() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        return this.f50691a.get(index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public List<?> j1() {
        return this.f50691a.j1();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public u l1(int index) {
        return this.f50691a.l1(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new a(index);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void n3(int index, u element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public List<u> p1() {
        return Collections.unmodifiableList(this.f50691a.p1());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50691a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void v3(b2 other) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public byte[] w0(int index) {
        return this.f50691a.w0(index);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void x(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public boolean x0(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }
}
