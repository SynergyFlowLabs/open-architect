package com.google.protobuf.nano;

import com.google.protobuf.nano.c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d<M extends c<M>, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f126154e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f126155f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f126156g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f126157h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f126158i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f126159j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f126160k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f126161l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f126162m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f126163n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f126164o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f126165p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f126166q = 13;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f126167r = 14;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f126168s = 15;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f126169t = 16;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f126170u = 17;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f126171v = 18;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f126172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class<T> f126173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f126175d;

    private static class b<M extends c<M>, T> extends d<M, T> {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f126176w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f126177x;

        public b(int i10, Class<T> cls, int i11, boolean z10, int i12, int i13) {
            super(i10, cls, i11, z10);
            this.f126176w = i12;
            this.f126177x = i13;
        }

        private int q(Object obj) {
            int length = Array.getLength(obj);
            int i10 = 0;
            switch (this.f126172a) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    int iV = 0;
                    while (i10 < length) {
                        iV += com.google.protobuf.nano.b.v(Array.getLong(obj, i10));
                        i10++;
                    }
                    return iV;
                case 4:
                    int iO = 0;
                    while (i10 < length) {
                        iO += com.google.protobuf.nano.b.O(Array.getLong(obj, i10));
                        i10++;
                    }
                    return iO;
                case 5:
                    int iT = 0;
                    while (i10 < length) {
                        iT += com.google.protobuf.nano.b.t(Array.getInt(obj, i10));
                        i10++;
                    }
                    return iT;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.f126172a);
                case 13:
                    int iM = 0;
                    while (i10 < length) {
                        iM += com.google.protobuf.nano.b.M(Array.getInt(obj, i10));
                        i10++;
                    }
                    return iM;
                case 14:
                    int i11 = 0;
                    while (i10 < length) {
                        i11 += com.google.protobuf.nano.b.i(Array.getInt(obj, i10));
                        i10++;
                    }
                    return i11;
                case 17:
                    int iF = 0;
                    while (i10 < length) {
                        iF += com.google.protobuf.nano.b.F(Array.getInt(obj, i10));
                        i10++;
                    }
                    return iF;
                case 18:
                    int iH = 0;
                    while (i10 < length) {
                        iH += com.google.protobuf.nano.b.H(Array.getLong(obj, i10));
                        i10++;
                    }
                    return iH;
            }
        }

        @Override // com.google.protobuf.nano.d
        protected int a(Object obj) {
            int i10 = this.f126174c;
            if (i10 == this.f126176w) {
                return super.a(obj);
            }
            if (i10 == this.f126177x) {
                int iQ = q(obj);
                return iQ + com.google.protobuf.nano.b.y(iQ) + com.google.protobuf.nano.b.y(this.f126174c);
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.f126174c + ", unequal to both non-packed variant " + this.f126176w + " and packed variant " + this.f126177x);
        }

        @Override // com.google.protobuf.nano.d
        protected final int c(Object obj) {
            int iB = m.b(this.f126174c);
            switch (this.f126172a) {
                case 1:
                    return com.google.protobuf.nano.b.f(iB, ((Double) obj).doubleValue());
                case 2:
                    return com.google.protobuf.nano.b.o(iB, ((Float) obj).floatValue());
                case 3:
                    return com.google.protobuf.nano.b.u(iB, ((Long) obj).longValue());
                case 4:
                    return com.google.protobuf.nano.b.N(iB, ((Long) obj).longValue());
                case 5:
                    return com.google.protobuf.nano.b.s(iB, ((Integer) obj).intValue());
                case 6:
                    return com.google.protobuf.nano.b.m(iB, ((Long) obj).longValue());
                case 7:
                    return com.google.protobuf.nano.b.k(iB, ((Integer) obj).intValue());
                case 8:
                    return com.google.protobuf.nano.b.b(iB, ((Boolean) obj).booleanValue());
                case 9:
                    return com.google.protobuf.nano.b.I(iB, (String) obj);
                case 10:
                case 11:
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f126172a);
                case 12:
                    return com.google.protobuf.nano.b.d(iB, (byte[]) obj);
                case 13:
                    return com.google.protobuf.nano.b.L(iB, ((Integer) obj).intValue());
                case 14:
                    return com.google.protobuf.nano.b.h(iB, ((Integer) obj).intValue());
                case 15:
                    return com.google.protobuf.nano.b.A(iB, ((Integer) obj).intValue());
                case 16:
                    return com.google.protobuf.nano.b.C(iB, ((Long) obj).longValue());
                case 17:
                    return com.google.protobuf.nano.b.E(iB, ((Integer) obj).intValue());
                case 18:
                    return com.google.protobuf.nano.b.G(iB, ((Long) obj).longValue());
            }
        }

        @Override // com.google.protobuf.nano.d
        protected Object l(com.google.protobuf.nano.a aVar) {
            try {
                return aVar.w(this.f126172a);
            } catch (IOException e10) {
                throw new IllegalArgumentException("Error reading extension field", e10);
            }
        }

        @Override // com.google.protobuf.nano.d
        protected void m(l lVar, List<Object> list) {
            if (lVar.f126212a == this.f126176w) {
                list.add(l(com.google.protobuf.nano.a.h(lVar.f126213b)));
                return;
            }
            com.google.protobuf.nano.a aVarH = com.google.protobuf.nano.a.h(lVar.f126213b);
            try {
                aVarH.k(aVarH.B());
                while (!aVarH.g()) {
                    list.add(l(aVarH));
                }
            } catch (IOException e10) {
                throw new IllegalArgumentException("Error reading extension field", e10);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.protobuf.nano.d
        protected void n(Object obj, com.google.protobuf.nano.b bVar) {
            int i10 = this.f126174c;
            if (i10 == this.f126176w) {
                super.n(obj, bVar);
                return;
            }
            if (i10 != this.f126177x) {
                throw new IllegalArgumentException("Unexpected repeated extension tag " + this.f126174c + ", unequal to both non-packed variant " + this.f126176w + " and packed variant " + this.f126177x);
            }
            int length = Array.getLength(obj);
            int iQ = q(obj);
            try {
                bVar.E0(this.f126174c);
                bVar.E0(iQ);
                int i11 = 0;
                switch (this.f126172a) {
                    case 1:
                        while (i11 < length) {
                            bVar.g0(Array.getDouble(obj, i11));
                            i11++;
                        }
                        return;
                    case 2:
                        while (i11 < length) {
                            bVar.p0(Array.getFloat(obj, i11));
                            i11++;
                        }
                        return;
                    case 3:
                        while (i11 < length) {
                            bVar.v0(Array.getLong(obj, i11));
                            i11++;
                        }
                        return;
                    case 4:
                        while (i11 < length) {
                            bVar.U0(Array.getLong(obj, i11));
                            i11++;
                        }
                        return;
                    case 5:
                        while (i11 < length) {
                            bVar.t0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 6:
                        while (i11 < length) {
                            bVar.n0(Array.getLong(obj, i11));
                            i11++;
                        }
                        return;
                    case 7:
                        while (i11 < length) {
                            bVar.l0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 8:
                        while (i11 < length) {
                            bVar.c0(Array.getBoolean(obj, i11));
                            i11++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.f126172a);
                    case 13:
                        while (i11 < length) {
                            bVar.S0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 14:
                        while (i11 < length) {
                            bVar.i0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 15:
                        while (i11 < length) {
                            bVar.H0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 16:
                        while (i11 < length) {
                            bVar.J0(Array.getLong(obj, i11));
                            i11++;
                        }
                        return;
                    case 17:
                        while (i11 < length) {
                            bVar.L0(Array.getInt(obj, i11));
                            i11++;
                        }
                        return;
                    case 18:
                        while (i11 < length) {
                            bVar.N0(Array.getLong(obj, i11));
                            i11++;
                        }
                        return;
                }
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.protobuf.nano.d
        protected final void o(Object obj, com.google.protobuf.nano.b bVar) {
            try {
                bVar.E0(this.f126174c);
                switch (this.f126172a) {
                    case 1:
                        bVar.g0(((Double) obj).doubleValue());
                        return;
                    case 2:
                        bVar.p0(((Float) obj).floatValue());
                        return;
                    case 3:
                        bVar.v0(((Long) obj).longValue());
                        return;
                    case 4:
                        bVar.U0(((Long) obj).longValue());
                        return;
                    case 5:
                        bVar.t0(((Integer) obj).intValue());
                        return;
                    case 6:
                        bVar.n0(((Long) obj).longValue());
                        return;
                    case 7:
                        bVar.l0(((Integer) obj).intValue());
                        return;
                    case 8:
                        bVar.c0(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        bVar.P0((String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.f126172a);
                    case 12:
                        bVar.e0((byte[]) obj);
                        return;
                    case 13:
                        bVar.S0(((Integer) obj).intValue());
                        return;
                    case 14:
                        bVar.i0(((Integer) obj).intValue());
                        return;
                    case 15:
                        bVar.H0(((Integer) obj).intValue());
                        return;
                    case 16:
                        bVar.J0(((Long) obj).longValue());
                        return;
                    case 17:
                        bVar.L0(((Integer) obj).intValue());
                        return;
                    case 18:
                        bVar.N0(((Long) obj).longValue());
                        return;
                }
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    @Deprecated
    public static <M extends c<M>, T extends j> d<M, T> d(int i10, Class<T> cls, int i11) {
        return new d<>(i10, cls, i11, false);
    }

    public static <M extends c<M>, T extends j> d<M, T> e(int i10, Class<T> cls, long j10) {
        return new d<>(i10, cls, (int) j10, false);
    }

    public static <M extends c<M>, T> d<M, T> f(int i10, Class<T> cls, long j10) {
        return new b(i10, cls, (int) j10, false, 0, 0);
    }

    public static <M extends c<M>, T extends j> d<M, T[]> g(int i10, Class<T[]> cls, long j10) {
        return new d<>(i10, cls, (int) j10, true);
    }

    public static <M extends c<M>, T> d<M, T> h(int i10, Class<T> cls, long j10, long j11, long j12) {
        return new b(i10, cls, (int) j10, true, (int) j11, (int) j12);
    }

    private T i(List<l> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            l lVar = list.get(i11);
            if (lVar.f126213b.length != 0) {
                m(lVar, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class<T> cls = this.f126173b;
        T tCast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int i12 = 0; i12 < size; i12++) {
            Array.set(tCast, i12, arrayList.get(i12));
        }
        return tCast;
    }

    private T j(List<l> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.f126173b.cast(l(com.google.protobuf.nano.a.h(list.get(list.size() - 1).f126213b)));
    }

    protected int a(Object obj) {
        int length = Array.getLength(obj);
        int iC = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (Array.get(obj, i10) != null) {
                iC += c(Array.get(obj, i10));
            }
        }
        return iC;
    }

    int b(Object obj) {
        return this.f126175d ? a(obj) : c(obj);
    }

    protected int c(Object obj) {
        int iB = m.b(this.f126174c);
        int i10 = this.f126172a;
        if (i10 == 10) {
            return com.google.protobuf.nano.b.q(iB, (j) obj);
        }
        if (i10 == 11) {
            return com.google.protobuf.nano.b.w(iB, (j) obj);
        }
        throw new IllegalArgumentException("Unknown type " + this.f126172a);
    }

    final T k(List<l> list) {
        if (list == null) {
            return null;
        }
        return this.f126175d ? i(list) : j(list);
    }

    protected Object l(com.google.protobuf.nano.a aVar) {
        Class componentType = this.f126175d ? this.f126173b.getComponentType() : this.f126173b;
        try {
            int i10 = this.f126172a;
            if (i10 == 10) {
                j jVar = (j) componentType.newInstance();
                aVar.s(jVar, m.b(this.f126174c));
                return jVar;
            }
            if (i10 == 11) {
                j jVar2 = (j) componentType.newInstance();
                aVar.v(jVar2);
                return jVar2;
            }
            throw new IllegalArgumentException("Unknown type " + this.f126172a);
        } catch (IOException e10) {
            throw new IllegalArgumentException("Error reading extension field", e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e11);
        } catch (InstantiationException e12) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e12);
        }
    }

    protected void m(l lVar, List<Object> list) {
        list.add(l(com.google.protobuf.nano.a.h(lVar.f126213b)));
    }

    protected void n(Object obj, com.google.protobuf.nano.b bVar) {
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null) {
                o(obj2, bVar);
            }
        }
    }

    protected void o(Object obj, com.google.protobuf.nano.b bVar) {
        try {
            bVar.E0(this.f126174c);
            int i10 = this.f126172a;
            if (i10 == 10) {
                int iB = m.b(this.f126174c);
                bVar.r0((j) obj);
                bVar.Q0(iB, 4);
            } else {
                if (i10 == 11) {
                    bVar.x0((j) obj);
                    return;
                }
                throw new IllegalArgumentException("Unknown type " + this.f126172a);
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    void p(Object obj, com.google.protobuf.nano.b bVar) throws IOException {
        if (this.f126175d) {
            n(obj, bVar);
        } else {
            o(obj, bVar);
        }
    }

    private d(int i10, Class<T> cls, int i11, boolean z10) {
        this.f126172a = i10;
        this.f126173b = cls;
        this.f126174c = i11;
        this.f126175d = z10;
    }
}
