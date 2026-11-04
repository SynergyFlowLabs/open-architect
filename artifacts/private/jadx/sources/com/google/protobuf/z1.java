package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class z1 extends c<String> implements a2, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z1 f126630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final a2 f126631e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f126632c;

    private static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z1 f126633a;

        a(z1 list) {
            this.f126633a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(int index, byte[] s10) {
            this.f126633a.s(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] get(int index) {
            return this.f126633a.w0(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int index) {
            String strRemove = this.f126633a.remove(index);
            ((AbstractList) this).modCount++;
            return z1.t(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public byte[] set(int index, byte[] s10) {
            Object objG = this.f126633a.G(index, s10);
            ((AbstractList) this).modCount++;
            return z1.t(objG);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f126633a.size();
        }
    }

    private static class b extends AbstractList<u> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z1 f126634a;

        b(z1 list) {
            this.f126634a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(int index, u s10) {
            this.f126634a.p(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u get(int index) {
            return this.f126634a.l1(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public u remove(int index) {
            String strRemove = this.f126634a.remove(index);
            ((AbstractList) this).modCount++;
            return z1.u(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public u set(int index, u s10) {
            Object objF = this.f126634a.F(index, s10);
            ((AbstractList) this).modCount++;
            return z1.u(objF);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f126634a.size();
        }
    }

    static {
        z1 z1Var = new z1(false);
        f126630d = z1Var;
        f126631e = z1Var;
    }

    public z1() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object F(int index, u s10) {
        c();
        return this.f126632c.set(index, s10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object G(int index, byte[] s10) {
        c();
        return this.f126632c.set(index, s10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int index, u element) {
        c();
        this.f126632c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int index, byte[] element) {
        c();
        this.f126632c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] t(Object o10) {
        if (o10 instanceof byte[]) {
            return (byte[]) o10;
        }
        return o10 instanceof String ? s1.y((String) o10) : ((u) o10).q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u u(Object o10) {
        if (o10 instanceof u) {
            return (u) o10;
        }
        return o10 instanceof String ? u.C((String) o10) : u.A((byte[]) o10);
    }

    private static String v(Object o10) {
        if (o10 instanceof String) {
            return (String) o10;
        }
        return o10 instanceof u ? ((u) o10).z0() : s1.z((byte[]) o10);
    }

    public static z1 w() {
        return f126630d;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        Object obj = this.f126632c.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            String strZ0 = uVar.z0();
            if (uVar.S()) {
                this.f126632c.set(index, strZ0);
            }
            return strZ0;
        }
        byte[] bArr = (byte[]) obj;
        String strZ = s1.z(bArr);
        if (s1.u(bArr)) {
            this.f126632c.set(index, strZ);
        }
        return strZ;
    }

    @Override // com.google.protobuf.s1.k, com.google.protobuf.s1.i
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public z1 b2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.f126632c);
        return new z1((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.a2
    public List<byte[]> B0() {
        return new a(this);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public String remove(int index) {
        c();
        Object objRemove = this.f126632c.remove(index);
        ((AbstractList) this).modCount++;
        return v(objRemove);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public String set(int index, String s10) {
        c();
        return v(this.f126632c.set(index, s10));
    }

    @Override // com.google.protobuf.a2
    public void E1(int index, byte[] s10) {
        G(index, s10);
    }

    @Override // com.google.protobuf.a2
    public Object J1(int index) {
        return this.f126632c.get(index);
    }

    @Override // com.google.protobuf.a2
    public boolean Q0(Collection<? extends u> values) {
        c();
        boolean zAddAll = this.f126632c.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.a2
    public a2 T0() {
        return s1() ? new r4(this) : this;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c10) {
        return addAll(size(), c10);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f126632c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.a2
    public void d2(u element) {
        c();
        this.f126632c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o10) {
        return super.equals(o10);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.a2
    public void i2(a2 other) {
        c();
        for (Object obj : other.j1()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f126632c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f126632c.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.a2
    public List<?> j1() {
        return Collections.unmodifiableList(this.f126632c);
    }

    @Override // com.google.protobuf.a2
    public void j4(int index, u s10) {
        F(index, s10);
    }

    @Override // com.google.protobuf.a2
    public u l1(int index) {
        Object obj = this.f126632c.get(index);
        u uVarU = u(obj);
        if (uVarU != obj) {
            this.f126632c.set(index, uVarU);
        }
        return uVarU;
    }

    @Override // com.google.protobuf.k3
    public List<u> p1() {
        return new b(this);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void add(int index, String element) {
        c();
        this.f126632c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c10) {
        return super.removeAll(c10);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c10) {
        return super.retainAll(c10);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.s1.k
    public /* bridge */ /* synthetic */ boolean s1() {
        return super.s1();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126632c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.a2
    public byte[] w0(int i10) {
        Object obj = this.f126632c.get(i10);
        byte[] bArrT = t(obj);
        if (bArrT != obj) {
            this.f126632c.set(i10, bArrT);
        }
        return bArrT;
    }

    @Override // com.google.protobuf.a2
    public void x(byte[] element) {
        c();
        this.f126632c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.a2
    public boolean x0(Collection<byte[]> c10) {
        c();
        boolean zAddAll = this.f126632c.addAll(c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    private z1(boolean isMutable) {
        super(isMutable);
        this.f126632c = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object e10) {
        return super.add(e10);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c10) {
        c();
        if (c10 instanceof a2) {
            c10 = ((a2) c10).j1();
        }
        boolean zAddAll = this.f126632c.addAll(index, c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o10) {
        return super.remove(o10);
    }

    public z1(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public z1(a2 from) {
        this.f126632c = new ArrayList(from.size());
        addAll(from);
    }

    public z1(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private z1(ArrayList<Object> list) {
        this.f126632c = list;
    }
}
