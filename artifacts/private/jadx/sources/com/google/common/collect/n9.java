package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true, serializable = true)
final class n9<K, V> extends n6<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f117811j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f117812k = 128;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f117813l = 32768;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f117814m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f117815n = 65535;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final n6<Object, Object> f117816o = new n9(null, new Object[0], 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @com.google.common.annotations.d
    private static final long f117817s = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.a
    private final transient Object f117818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.e
    final transient Object[] f117819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f117820i;

    static class a<K, V> extends z6<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final transient n6<K, V> f117821i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final transient Object[] f117822j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final transient int f117823k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final transient int f117824l;

        /* JADX INFO: renamed from: com.google.common.collect.n9$a$a, reason: collision with other inner class name */
        class C1073a extends l6<Map.Entry<K, V>> {
            C1073a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int index) {
                com.google.common.base.j0.C(index, a.this.f117824l);
                int i10 = index * 2;
                Object obj = a.this.f117822j[a.this.f117823k + i10];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f117822j[i10 + (a.this.f117823k ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.h6
            public boolean m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f117824l;
            }

            @Override // com.google.common.collect.l6, com.google.common.collect.h6
            @com.google.common.annotations.d
            Object writeReplace() {
                return super.writeReplace();
            }
        }

        a(n6<K, V> map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.f117821i = map;
            this.f117822j = alternatingKeysAndValues;
            this.f117823k = keyOffset;
            this.f117824l = size;
        }

        @Override // com.google.common.collect.z6
        l6<Map.Entry<K, V>> D() {
            return new C1073a();
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f117821i.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.h6
        int d(Object[] dst, int offset) {
            return c().d(dst, offset);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<Map.Entry<K, V>> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f117824l;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class b<K> extends z6<K> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final transient n6<K, ?> f117826i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final transient l6<K> f117827j;

        b(n6<K, ?> map, l6<K> list) {
            this.f117826i = map;
            this.f117827j = list;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6
        public l6<K> c() {
            return this.f117827j;
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return this.f117826i.get(object) != null;
        }

        @Override // com.google.common.collect.h6
        int d(Object[] dst, int offset) {
            return c().d(dst, offset);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<K> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f117826i.size();
        }

        @Override // com.google.common.collect.z6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static final class c extends l6<Object> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient Object[] f117828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final transient int f117829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final transient int f117830h;

        c(Object[] alternatingKeysAndValues, int offset, int size) {
            this.f117828f = alternatingKeysAndValues;
            this.f117829g = offset;
            this.f117830h = size;
        }

        @Override // java.util.List
        public Object get(int index) {
            com.google.common.base.j0.C(index, this.f117830h);
            Object obj = this.f117828f[(index * 2) + this.f117829g];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f117830h;
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private n9(@fj.a Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.f117818g = hashTable;
        this.f117819h = alternatingKeysAndValues;
        this.f117820i = size;
    }

    static <K, V> n9<K, V> G(int n10, Object[] alternatingKeysAndValues) {
        return H(n10, alternatingKeysAndValues, null);
    }

    static <K, V> n9<K, V> H(int n10, Object[] alternatingKeysAndValues, n6.b<K, V> builder) {
        if (n10 == 0) {
            return (n9) f117816o;
        }
        if (n10 == 1) {
            Object obj = alternatingKeysAndValues[0];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[1];
            Objects.requireNonNull(obj2);
            a3.a(obj, obj2);
            return new n9<>(null, alternatingKeysAndValues, 1);
        }
        com.google.common.base.j0.d0(n10, alternatingKeysAndValues.length >> 1);
        Object objI = I(alternatingKeysAndValues, n10, z6.u(n10), 0);
        if (objI instanceof Object[]) {
            Object[] objArr = (Object[]) objI;
            n6.b.a aVar = (n6.b.a) objArr[2];
            if (builder == null) {
                throw aVar.a();
            }
            builder.f117760e = aVar;
            Object obj3 = objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, iIntValue * 2);
            objI = obj3;
            n10 = iIntValue;
        }
        return new n9<>(objI, alternatingKeysAndValues, n10);
    }

    @fj.a
    private static Object I(Object[] alternatingKeysAndValues, int n10, int tableSize, int keyOffset) {
        int i10;
        n6.b.a aVar = null;
        int i11 = 1;
        if (n10 == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            a3.a(obj, obj2);
            return null;
        }
        int i12 = tableSize - 1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < n10; i14++) {
                int i15 = (i14 * 2) + keyOffset;
                int i16 = (i13 * 2) + keyOffset;
                Object obj3 = alternatingKeysAndValues[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = alternatingKeysAndValues[i15 ^ 1];
                Objects.requireNonNull(obj4);
                a3.a(obj3, obj4);
                int iC = c6.c(obj3.hashCode());
                while (true) {
                    int i17 = iC & i12;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            alternatingKeysAndValues[i16] = obj3;
                            alternatingKeysAndValues[i16 ^ 1] = obj4;
                        }
                        i13++;
                        break;
                    }
                    if (obj3.equals(alternatingKeysAndValues[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj5 = alternatingKeysAndValues[i19];
                        Objects.requireNonNull(obj5);
                        aVar = new n6.b.a(obj3, obj4, obj5);
                        alternatingKeysAndValues[i19] = obj4;
                        break;
                    }
                    iC = i17 + 1;
                }
            }
            return i13 == n10 ? bArr : new Object[]{bArr, Integer.valueOf(i13), aVar};
        }
        if (tableSize <= 32768) {
            short[] sArr = new short[tableSize];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < n10; i21++) {
                int i22 = (i21 * 2) + keyOffset;
                int i23 = (i20 * 2) + keyOffset;
                Object obj6 = alternatingKeysAndValues[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = alternatingKeysAndValues[i22 ^ 1];
                Objects.requireNonNull(obj7);
                a3.a(obj6, obj7);
                int iC2 = c6.c(obj6.hashCode());
                while (true) {
                    int i24 = iC2 & i12;
                    int i25 = sArr[i24] & kotlin.e2.f312492d;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            alternatingKeysAndValues[i23] = obj6;
                            alternatingKeysAndValues[i23 ^ 1] = obj7;
                        }
                        i20++;
                        break;
                    }
                    if (obj6.equals(alternatingKeysAndValues[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj8 = alternatingKeysAndValues[i26];
                        Objects.requireNonNull(obj8);
                        aVar = new n6.b.a(obj6, obj7, obj8);
                        alternatingKeysAndValues[i26] = obj7;
                        break;
                    }
                    iC2 = i24 + 1;
                }
            }
            return i20 == n10 ? sArr : new Object[]{sArr, Integer.valueOf(i20), aVar};
        }
        int[] iArr = new int[tableSize];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < n10) {
            int i29 = (i27 * 2) + keyOffset;
            int i30 = (i28 * 2) + keyOffset;
            Object obj9 = alternatingKeysAndValues[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = alternatingKeysAndValues[i29 ^ i11];
            Objects.requireNonNull(obj10);
            a3.a(obj9, obj10);
            int iC3 = c6.c(obj9.hashCode());
            while (true) {
                int i31 = iC3 & i12;
                int i32 = iArr[i31];
                if (i32 == -1) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        alternatingKeysAndValues[i30] = obj9;
                        alternatingKeysAndValues[i30 ^ 1] = obj10;
                    }
                    i28++;
                    i10 = i11;
                    break;
                }
                i10 = i11;
                if (obj9.equals(alternatingKeysAndValues[i32])) {
                    int i33 = i32 ^ 1;
                    Object obj11 = alternatingKeysAndValues[i33];
                    Objects.requireNonNull(obj11);
                    aVar = new n6.b.a(obj9, obj10, obj11);
                    alternatingKeysAndValues[i33] = obj10;
                    break;
                }
                iC3 = i31 + 1;
                i11 = i10;
            }
            i27++;
            i11 = i10;
        }
        int i34 = i11;
        if (i28 == n10) {
            return iArr;
        }
        Object[] objArr = new Object[3];
        objArr[0] = iArr;
        objArr[i34] = Integer.valueOf(i28);
        objArr[2] = aVar;
        return objArr;
    }

    @fj.a
    static Object J(Object[] alternatingKeysAndValues, int n10, int tableSize, int keyOffset) {
        Object objI = I(alternatingKeysAndValues, n10, tableSize, keyOffset);
        if (objI instanceof Object[]) {
            throw ((n6.b.a) ((Object[]) objI)[2]).a();
        }
        return objI;
    }

    @fj.a
    static Object K(@fj.a Object hashTableObject, Object[] alternatingKeysAndValues, int size, int keyOffset, @fj.a Object key) {
        if (key == null) {
            return null;
        }
        if (size == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            if (!obj.equals(key)) {
                return null;
            }
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int iC = c6.c(key.hashCode());
            while (true) {
                int i10 = iC & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i11])) {
                    return alternatingKeysAndValues[i11 ^ 1];
                }
                iC = i10 + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int iC2 = c6.c(key.hashCode());
            while (true) {
                int i12 = iC2 & length2;
                int i13 = sArr[i12] & kotlin.e2.f312492d;
                if (i13 == 65535) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i13])) {
                    return alternatingKeysAndValues[i13 ^ 1];
                }
                iC2 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int iC3 = c6.c(key.hashCode());
            while (true) {
                int i14 = iC3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i15])) {
                    return alternatingKeysAndValues[i15 ^ 1];
                }
                iC3 = i14 + 1;
            }
        }
    }

    @Override // com.google.common.collect.n6, java.util.Map
    @fj.a
    public V get(@fj.a Object obj) {
        V v10 = (V) K(this.f117818g, this.f117819h, this.f117820i, 0, obj);
        if (v10 == null) {
            v10 = null;
        }
        return v10;
    }

    @Override // com.google.common.collect.n6
    z6<Map.Entry<K, V>> h() {
        return new a(this, this.f117819h, 0, this.f117820i);
    }

    @Override // com.google.common.collect.n6
    z6<K> i() {
        return new b(this, new c(this.f117819h, 0, this.f117820i));
    }

    @Override // com.google.common.collect.n6
    h6<V> j() {
        return new c(this.f117819h, 1, this.f117820i);
    }

    @Override // com.google.common.collect.n6
    boolean n() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f117820i;
    }

    @Override // com.google.common.collect.n6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
