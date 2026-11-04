package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class a2 extends c<String> implements b2, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a2 f49939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b2 f49940e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f49941c;

    private static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a2 f49942a;

        a(a2 list) {
            this.f49942a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(int index, byte[] s10) {
            this.f49942a.s(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] get(int index) {
            return this.f49942a.w0(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int index) {
            String strRemove = this.f49942a.remove(index);
            ((AbstractList) this).modCount++;
            return a2.u(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public byte[] set(int index, byte[] s10) {
            Object objJ = this.f49942a.J(index, s10);
            ((AbstractList) this).modCount++;
            return a2.u(objJ);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f49942a.size();
        }
    }

    private static class b extends AbstractList<u> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a2 f49943a;

        b(a2 list) {
            this.f49943a = list;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(int index, u s10) {
            this.f49943a.p(index, s10);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u get(int index) {
            return this.f49943a.l1(index);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public u remove(int index) {
            String strRemove = this.f49943a.remove(index);
            ((AbstractList) this).modCount++;
            return a2.v(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public u set(int index, u s10) {
            Object objG = this.f49943a.G(index, s10);
            ((AbstractList) this).modCount++;
            return a2.v(objG);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f49943a.size();
        }
    }

    static {
        a2 a2Var = new a2(false);
        f49939d = a2Var;
        f49940e = a2Var;
    }

    public a2() {
        this(10);
    }

    public static a2 A() {
        return f49939d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object G(int index, u s10) {
        c();
        return this.f49941c.set(index, s10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object J(int index, byte[] s10) {
        c();
        return this.f49941c.set(index, s10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int index, u element) {
        c();
        this.f49941c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int index, byte[] element) {
        c();
        this.f49941c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] u(Object o10) {
        if (o10 instanceof byte[]) {
            return (byte[]) o10;
        }
        return o10 instanceof String ? s1.y((String) o10) : ((u) o10).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u v(Object o10) {
        if (o10 instanceof u) {
            return (u) o10;
        }
        return o10 instanceof String ? u.C((String) o10) : u.A((byte[]) o10);
    }

    private static String w(Object o10) {
        if (o10 instanceof String) {
            return (String) o10;
        }
        return o10 instanceof u ? ((u) o10).A0() : s1.z((byte[]) o10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        Object obj = this.f49941c.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            String strA0 = uVar.A0();
            if (uVar.S()) {
                this.f49941c.set(index, strA0);
            }
            return strA0;
        }
        byte[] bArr = (byte[]) obj;
        String strZ = s1.z(bArr);
        if (s1.u(bArr)) {
            this.f49941c.set(index, strZ);
        }
        return strZ;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public List<byte[]> B0() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.s1.l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a2 b2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.f49941c);
        return new a2((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public String remove(int index) {
        c();
        Object objRemove = this.f49941c.remove(index);
        ((AbstractList) this).modCount++;
        return w(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void E1(int index, byte[] s10) {
        J(index, s10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public String set(int index, String s10) {
        c();
        return w(this.f49941c.set(index, s10));
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public Object J1(int index) {
        return this.f49941c.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void O2(u element) {
        c();
        this.f49941c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public boolean Q0(Collection<? extends u> values) {
        c();
        boolean zAddAll = this.f49941c.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public b2 T0() {
        return s1() ? new u4(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c10) {
        return addAll(size(), c10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f49941c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o10) {
        return super.equals(o10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public List<?> j1() {
        return Collections.unmodifiableList(this.f49941c);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public u l1(int index) {
        Object obj = this.f49941c.get(index);
        u uVarV = v(obj);
        if (uVarV != obj) {
            this.f49941c.set(index, uVarV);
        }
        return uVarV;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void n3(int index, u s10) {
        G(index, s10);
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public List<u> p1() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void add(int index, String element) {
        c();
        this.f49941c.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c10) {
        return super.removeAll(c10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c10) {
        return super.retainAll(c10);
    }

    @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.s1.l
    public /* bridge */ /* synthetic */ boolean s1() {
        return super.s1();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f49941c.size();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @x
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean add(String element) {
        c();
        this.f49941c.add(element);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void v3(b2 other) {
        c();
        for (Object obj : other.j1()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f49941c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f49941c.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.b2
    public byte[] w0(int i10) {
        Object obj = this.f49941c.get(i10);
        byte[] bArrU = u(obj);
        if (bArrU != obj) {
            this.f49941c.set(i10, bArrU);
        }
        return bArrU;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public void x(byte[] element) {
        c();
        this.f49941c.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public boolean x0(Collection<byte[]> c10) {
        c();
        boolean zAddAll = this.f49941c.addAll(c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    private a2(boolean isMutable) {
        super(isMutable);
        this.f49941c = Collections.EMPTY_LIST;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c10) {
        c();
        if (c10 instanceof b2) {
            c10 = ((b2) c10).j1();
        }
        boolean zAddAll = this.f49941c.addAll(index, c10);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o10) {
        return super.remove(o10);
    }

    public a2(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public a2(b2 from) {
        this.f49941c = new ArrayList(from.size());
        addAll(from);
    }

    public a2(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private a2(ArrayList<Object> list) {
        this.f49941c = list;
    }
}
