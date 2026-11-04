package com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f126323a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f126324b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f126325c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f126326d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f126327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteBuffer f126328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f126329g;

    public interface a extends k<Boolean> {
        @x
        boolean E(int index, boolean element);

        @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        k<Boolean> b2(int capacity);

        boolean j0(int index);

        void y0(boolean element);
    }

    public interface b extends k<Double> {
        void R0(double element);

        @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
        /* JADX INFO: renamed from: b */
        k<Double> b2(int capacity);

        @x
        double g0(int index, double element);

        double getDouble(int index);
    }

    public interface c {
        int i();
    }

    public interface d<T extends c> {
        T a(int number);
    }

    public interface e {
        boolean a(int number);
    }

    public interface f extends k<Float> {
        @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
        /* JADX INFO: renamed from: b */
        k<Float> b2(int capacity);

        void b1(float element);

        @x
        float d0(int index, float element);

        float getFloat(int index);
    }

    public interface g extends k<Integer> {
        @x
        int X(int index, int element);

        @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
        /* JADX INFO: renamed from: b */
        k<Integer> b2(int capacity);

        int getInt(int index);

        void w1(int element);
    }

    public static class h<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<F> f126330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<F, T> f126331b;

        public interface a<F, T> {
            T convert(F from);
        }

        public h(List<F> fromList, a<F, T> converter) {
            this.f126330a = fromList;
            this.f126331b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f126331b.convert(this.f126330a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f126330a.size();
        }
    }

    public interface i extends k<Long> {
        void M0(long element);

        @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
        /* JADX INFO: renamed from: b */
        k<Long> b2(int capacity);

        long getLong(int index);

        @x
        long k0(int index, long element);
    }

    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<K, RealValue> f126332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<RealValue, V> f126333b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f126334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f126335b;

            a(final d val$enumMap, final c val$unrecognizedValue) {
                this.f126334a = val$enumMap;
                this.f126335b = val$unrecognizedValue;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // com.google.protobuf.s1.j.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c value) {
                return Integer.valueOf(value.i());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // com.google.protobuf.s1.j.b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer value) {
                c cVarA = this.f126334a.a(value.intValue());
                return cVarA == null ? this.f126335b : cVarA;
            }
        }

        public interface b<A, B> {
            B a(A object);

            A b(B object);
        }

        private class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map.Entry<K, RealValue> f126336a;

            public c(Map.Entry<K, RealValue> realEntry) {
                this.f126336a = realEntry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object o10) {
                if (o10 == this) {
                    return true;
                }
                return (o10 instanceof Map.Entry) && getKey().equals(((Map.Entry) o10).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f126336a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.f126333b.a(this.f126336a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f126336a.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                RealValue value = this.f126336a.setValue((RealValue) j.this.f126333b.b(v10));
                if (value == null) {
                    return null;
                }
                return (V) j.this.f126333b.a(value);
            }
        }

        private class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f126338a;

            public d(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.f126338a = realIterator;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f126338a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f126338a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f126338a.remove();
            }
        }

        private class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f126340a;

            public e(Set<Map.Entry<K, RealValue>> realSet) {
                this.f126340a = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f126340a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f126340a.size();
            }
        }

        public j(Map<K, RealValue> realMap, b<RealValue, V> valueConverter) {
            this.f126332a = realMap;
            this.f126333b = valueConverter;
        }

        public static <T extends c> b<Integer, T> b(final d<T> enumMap, final T unrecognizedValue) {
            return new a(enumMap, unrecognizedValue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f126332a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.f126332a.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.f126333b.a(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue realvaluePut = this.f126332a.put(k10, this.f126333b.b(v10));
            if (realvaluePut != null) {
                return this.f126333b.a(realvaluePut);
            }
            int i10 = 2 | 0;
            return null;
        }
    }

    public interface k<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: b */
        k<E> b2(int capacity);

        void e1();

        boolean s1();
    }

    static {
        byte[] bArr = new byte[0];
        f126327e = bArr;
        f126328f = ByteBuffer.wrap(bArr);
        f126329g = z.q(bArr);
    }

    private s1() {
    }

    public static byte[] a(String bytes) {
        return bytes.getBytes(f126325c);
    }

    public static ByteBuffer b(String bytes) {
        return ByteBuffer.wrap(a(bytes));
    }

    public static u c(String bytes) {
        return u.A(bytes.getBytes(f126325c));
    }

    static <T> T d(T obj) {
        obj.getClass();
        return obj;
    }

    static <T> T e(T obj, String message) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(message);
    }

    public static ByteBuffer f(ByteBuffer source) {
        ByteBuffer byteBufferDuplicate = source.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean g(List<byte[]> a10, List<byte[]> b10) {
        if (a10.size() != b10.size()) {
            return false;
        }
        for (int i10 = 0; i10 < a10.size(); i10++) {
            if (!Arrays.equals(a10.get(i10), b10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer a10, ByteBuffer b10) {
        if (a10.capacity() != b10.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = a10.duplicate();
        v1.a(byteBufferDuplicate);
        ByteBuffer byteBufferDuplicate2 = b10.duplicate();
        v1.a(byteBufferDuplicate2);
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static boolean i(List<ByteBuffer> a10, List<ByteBuffer> b10) {
        if (a10.size() != b10.size()) {
            return false;
        }
        for (int i10 = 0; i10 < a10.size(); i10++) {
            if (!h(a10.get(i10), b10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends n2> T j(Class<T> clazz) {
        try {
            Method method = clazz.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + clazz, e10);
        }
    }

    public static int k(boolean b10) {
        return b10 ? 1231 : 1237;
    }

    public static int l(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iM = 1;
        while (it.hasNext()) {
            iM = (iM * 31) + m(it.next());
        }
        return iM;
    }

    public static int m(byte[] bytes) {
        return n(bytes, 0, bytes.length);
    }

    static int n(byte[] bytes, int offset, int length) {
        int iW = w(length, bytes, offset, length);
        if (iW == 0) {
            iW = 1;
        }
        return iW;
    }

    public static int o(ByteBuffer bytes) {
        int i10 = 3 | 1;
        if (bytes.hasArray()) {
            int iW = w(bytes.capacity(), bytes.array(), bytes.arrayOffset(), bytes.capacity());
            if (iW == 0) {
                return 1;
            }
            return iW;
        }
        int iCapacity = bytes.capacity() <= 4096 ? bytes.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = bytes.duplicate();
        v1.a(byteBufferDuplicate);
        int iCapacity2 = bytes.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = w(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static int p(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iO = 1;
        while (it.hasNext()) {
            iO = (iO * 31) + o(it.next());
        }
        return iO;
    }

    public static int q(c e10) {
        return e10.i();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iQ = 1;
        while (it.hasNext()) {
            iQ = (iQ * 31) + q(it.next());
        }
        return iQ;
    }

    public static int s(long n10) {
        return (int) (n10 ^ (n10 >>> 32));
    }

    public static boolean t(u byteString) {
        return byteString.S();
    }

    public static boolean u(byte[] byteArray) {
        return u4.t(byteArray);
    }

    static Object v(Object destination, Object source) {
        return ((n2) destination).r1().T9((n2) source).B1();
    }

    static int w(int h10, byte[] bytes, int offset, int length) {
        for (int i10 = offset; i10 < offset + length; i10++) {
            h10 = (h10 * 31) + bytes[i10];
        }
        return h10;
    }

    public static String x(String bytes) {
        return new String(bytes.getBytes(f126325c), f126324b);
    }

    public static byte[] y(String value) {
        return value.getBytes(f126324b);
    }

    public static String z(byte[] bytes) {
        return new String(bytes, f126324b);
    }
}
