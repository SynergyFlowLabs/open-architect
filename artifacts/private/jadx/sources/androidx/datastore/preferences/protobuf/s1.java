package androidx.datastore.preferences.protobuf;

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

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f50560a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f50561b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f50562c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50563d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f50564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteBuffer f50565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f50566g;

    public interface a extends l<Boolean> {
        @x
        boolean E(int index, boolean element);

        @Override // androidx.datastore.preferences.protobuf.s1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        l<Boolean> b2(int capacity);

        boolean j0(int index);

        void y0(boolean element);
    }

    public interface b extends l<Double> {
        void R0(double element);

        @Override // androidx.datastore.preferences.protobuf.s1.l
        /* JADX INFO: renamed from: b */
        l<Double> b2(int capacity);

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

    public interface f extends l<Float> {
        @Override // androidx.datastore.preferences.protobuf.s1.l
        /* JADX INFO: renamed from: b */
        l<Float> b2(int capacity);

        void b1(float element);

        @x
        float d0(int index, float element);

        float getFloat(int index);
    }

    public interface g extends l<Integer> {
        @x
        int X(int index, int element);

        @Override // androidx.datastore.preferences.protobuf.s1.l
        /* JADX INFO: renamed from: b */
        l<Integer> b2(int capacity);

        int getInt(int index);

        void w1(int element);
    }

    public static class h<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f50567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<T> f50568b;

        public interface a<T> {
            T a(int from);
        }

        public h(g fromList, a<T> converter) {
            this.f50567a = fromList;
            this.f50568b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int index) {
            return this.f50568b.a(this.f50567a.getInt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f50567a.size();
        }
    }

    public static class i<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<F> f50569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a<F, T> f50570b;

        public interface a<F, T> {
            T convert(F from);
        }

        public i(List<F> fromList, a<F, T> converter) {
            this.f50569a = fromList;
            this.f50570b = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f50570b.convert(this.f50569a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f50569a.size();
        }
    }

    public interface j extends l<Long> {
        void M0(long element);

        @Override // androidx.datastore.preferences.protobuf.s1.l
        /* JADX INFO: renamed from: b */
        l<Long> b2(int capacity);

        long getLong(int index);

        @x
        long k0(int index, long element);
    }

    public static class k<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<K, RealValue> f50571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<RealValue, V> f50572b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f50573a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f50574b;

            a(final d val$enumMap, final c val$unrecognizedValue) {
                this.f50573a = val$enumMap;
                this.f50574b = val$unrecognizedValue;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.s1.k.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c value) {
                return Integer.valueOf(value.i());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.s1.k.b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer value) {
                c cVarA = this.f50573a.a(value.intValue());
                return cVarA == null ? this.f50574b : cVarA;
            }
        }

        public interface b<A, B> {
            B a(A object);

            A b(B object);
        }

        private class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Map.Entry<K, RealValue> f50575a;

            public c(Map.Entry<K, RealValue> realEntry) {
                this.f50575a = realEntry;
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
                return this.f50575a.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) k.this.f50572b.a(this.f50575a.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f50575a.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                RealValue value = this.f50575a.setValue((RealValue) k.this.f50572b.b(v10));
                if (value == null) {
                    return null;
                }
                return (V) k.this.f50572b.a(value);
            }
        }

        private class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f50577a;

            public d(Iterator<Map.Entry<K, RealValue>> realIterator) {
                this.f50577a = realIterator;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f50577a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f50577a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f50577a.remove();
            }
        }

        private class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f50579a;

            public e(Set<Map.Entry<K, RealValue>> realSet) {
                this.f50579a = realSet;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f50579a.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f50579a.size();
            }
        }

        public k(Map<K, RealValue> realMap, b<RealValue, V> valueConverter) {
            this.f50571a = realMap;
            this.f50572b = valueConverter;
        }

        public static <T extends c> b<Integer, T> b(final d<T> enumMap, final T unrecognizedValue) {
            return new a(enumMap, unrecognizedValue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f50571a.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object key) {
            RealValue realvalue = this.f50571a.get(key);
            if (realvalue == null) {
                return null;
            }
            return this.f50572b.a(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue realvaluePut = this.f50571a.put(k10, this.f50572b.b(v10));
            if (realvaluePut == null) {
                return null;
            }
            return this.f50572b.a(realvaluePut);
        }
    }

    public interface l<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: b */
        l<E> b2(int capacity);

        void e1();

        boolean s1();
    }

    static {
        byte[] bArr = new byte[0];
        f50564e = bArr;
        f50565f = ByteBuffer.wrap(bArr);
        f50566g = z.q(bArr);
    }

    private s1() {
    }

    public static byte[] a(String bytes) {
        return bytes.getBytes(f50562c);
    }

    public static ByteBuffer b(String bytes) {
        return ByteBuffer.wrap(a(bytes));
    }

    public static u c(String bytes) {
        return u.A(bytes.getBytes(f50562c));
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

    public static <T extends q2> T j(Class<T> clazz) {
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
            return 1;
        }
        return iW;
    }

    public static int o(ByteBuffer bytes) {
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
        return x4.t(byteArray);
    }

    static Object v(Object destination, Object source) {
        return ((q2) destination).r1().i8((q2) source).B1();
    }

    static int w(int h10, byte[] bytes, int offset, int length) {
        for (int i10 = offset; i10 < offset + length; i10++) {
            h10 = (h10 * 31) + bytes[i10];
        }
        return h10;
    }

    public static String x(String bytes) {
        return new String(bytes.getBytes(f50562c), f50561b);
    }

    public static byte[] y(String value) {
        return value.getBytes(f50561b);
    }

    public static String z(byte[] bytes) {
        return new String(bytes, f50561b);
    }
}
