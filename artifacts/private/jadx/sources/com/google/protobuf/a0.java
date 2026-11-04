package com.google.protobuf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
final class a0 implements m3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f125713g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125714h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f125715i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f125716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f125717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f125718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f125719f = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125720a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f125720a = iArr;
            try {
                iArr[x4.b.f126489j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125720a[x4.b.f126493n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 0 ^ 3;
                f125720a[x4.b.f126482c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125720a[x4.b.f126495s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125720a[x4.b.f126488i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125720a[x4.b.f126487h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125720a[x4.b.f126483d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f125720a[x4.b.f126486g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f125720a[x4.b.f126484e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f125720a[x4.b.f126492m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f125720a[x4.b.f126496t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f125720a[x4.b.f126497v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f125720a[x4.b.f126498w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f125720a[x4.b.X.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f125720a[x4.b.f126490k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f125720a[x4.b.f126494o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f125720a[x4.b.f126485f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private a0(z input) {
        z zVar = (z) s1.e(input, MetricTracker.Object.INPUT);
        this.f125716c = zVar;
        zVar.f126529d = this;
    }

    public static a0 V(z input) {
        a0 a0Var = input.f126529d;
        return a0Var != null ? a0Var : new a0(input);
    }

    private <T> void W(T target, o3<T> schema, v0 extensionRegistry) throws IOException {
        int i10 = this.f125718e;
        this.f125718e = x4.c(x4.a(this.f125717d), 4);
        try {
            schema.j(target, this, extensionRegistry);
            if (this.f125717d != this.f125718e) {
                throw t1.i();
            }
            this.f125718e = i10;
        } catch (Throwable th2) {
            this.f125718e = i10;
            throw th2;
        }
    }

    private <T> void X(T target, o3<T> schema, v0 extensionRegistry) throws IOException {
        int iA0 = this.f125716c.a0();
        z zVar = this.f125716c;
        if (zVar.f126526a >= zVar.f126527b) {
            throw t1.j();
        }
        int iU = zVar.u(iA0);
        this.f125716c.f126526a++;
        schema.j(target, this, extensionRegistry);
        this.f125716c.a(0);
        z zVar2 = this.f125716c;
        zVar2.f126526a--;
        zVar2.t(iU);
    }

    private Object Y(x4.b fieldType, Class<?> messageType, v0 extensionRegistry) throws IOException {
        switch (a.f125720a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(w());
            case 2:
                return g();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(d());
            case 5:
                return Integer.valueOf(F());
            case 6:
                return Long.valueOf(u());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(B());
            case 9:
                return Long.valueOf(t());
            case 10:
                return S(messageType, extensionRegistry);
            case 11:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(b());
            case 13:
                return Integer.valueOf(e());
            case 14:
                return Long.valueOf(G());
            case 15:
                return J();
            case 16:
                return Integer.valueOf(c());
            case 17:
                return Long.valueOf(i());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T Z(o3<T> schema, v0 extensionRegistry) throws IOException {
        T tG = schema.g();
        W(tG, schema, extensionRegistry);
        schema.e(tG);
        return tG;
    }

    private <T> T a0(o3<T> schema, v0 extensionRegistry) throws IOException {
        T tG = schema.g();
        X(tG, schema, extensionRegistry);
        schema.e(tG);
        return tG;
    }

    private void c0(int expectedPosition) throws IOException {
        if (this.f125716c.i() != expectedPosition) {
            throw t1.n();
        }
    }

    private void d0(int requiredWireType) throws IOException {
        if (x4.b(this.f125717d) != requiredWireType) {
            throw t1.f();
        }
    }

    private void e0(int bytes) throws IOException {
        if ((bytes & 3) != 0) {
            throw t1.i();
        }
    }

    private void f0(int bytes) throws IOException {
        if ((bytes & 7) != 0) {
            throw t1.i();
        }
    }

    @Override // com.google.protobuf.m3
    public void A(List<String> target) throws IOException {
        b0(target, true);
    }

    @Override // com.google.protobuf.m3
    public int B() throws IOException {
        d0(0);
        return this.f125716c.G();
    }

    @Override // com.google.protobuf.m3
    public void C(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof e2) {
            e2 e2Var = (e2) target;
            int iB = x4.b(this.f125717d);
            if (iB == 1) {
                do {
                    e2Var.M0(this.f125716c.C());
                    if (!this.f125716c.j()) {
                        iZ2 = this.f125716c.Z();
                    }
                } while (iZ2 == this.f125717d);
                this.f125719f = iZ2;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f125716c.a0();
            f0(iA0);
            int i10 = this.f125716c.i() + iA0;
            do {
                e2Var.M0(this.f125716c.C());
            } while (this.f125716c.i() < i10);
        } else {
            int iB2 = x4.b(this.f125717d);
            if (iB2 == 1) {
                do {
                    target.add(Long.valueOf(this.f125716c.C()));
                    if (!this.f125716c.j()) {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iA1 = this.f125716c.a0();
            f0(iA1);
            int i11 = this.f125716c.i() + iA1;
            do {
                target.add(Long.valueOf(this.f125716c.C()));
            } while (this.f125716c.i() < i11);
        }
    }

    @Override // com.google.protobuf.m3
    public void D(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f125716c.a0()));
                    if (!this.f125716c.j()) {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Integer.valueOf(this.f125716c.a0()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f125716c.a0());
                if (!this.f125716c.j()) {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            r1Var.w1(this.f125716c.a0());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public int E() {
        return this.f125717d;
    }

    @Override // com.google.protobuf.m3
    public int F() throws IOException {
        d0(5);
        return this.f125716c.B();
    }

    @Override // com.google.protobuf.m3
    public long G() throws IOException {
        d0(0);
        return this.f125716c.W();
    }

    @Override // com.google.protobuf.m3
    public String H() throws IOException {
        d0(2);
        return this.f125716c.X();
    }

    @Override // com.google.protobuf.m3
    public int I() throws IOException {
        d0(5);
        return this.f125716c.T();
    }

    @Override // com.google.protobuf.m3
    public String J() throws IOException {
        d0(2);
        return this.f125716c.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.m3
    public <K, V> void K(Map<K, V> target, g2.b<K, V> metadata, v0 extensionRegistry) throws IOException {
        d0(2);
        int iU = this.f125716c.u(this.f125716c.a0());
        Object objY = metadata.f126001b;
        Object objY2 = metadata.f126003d;
        while (true) {
            try {
                int iM = m();
                if (iM == Integer.MAX_VALUE || this.f125716c.j()) {
                    break;
                }
                if (iM == 1) {
                    objY = Y(metadata.f126000a, null, null);
                } else if (iM != 2) {
                    try {
                        if (!q()) {
                            throw new t1("Unable to parse map entry.");
                        }
                    } catch (t1.a unused) {
                        if (!q()) {
                            throw new t1("Unable to parse map entry.");
                        }
                    }
                } else {
                    objY2 = Y(metadata.f126002c, metadata.f126003d.getClass(), extensionRegistry);
                }
            } catch (Throwable th2) {
                this.f125716c.t(iU);
                throw th2;
            }
        }
        target.put(objY, objY2);
        this.f125716c.t(iU);
    }

    @Override // com.google.protobuf.m3
    public <T> void L(T target, o3<T> schema, v0 extensionRegistry) throws IOException {
        d0(3);
        W(target, schema, extensionRegistry);
    }

    @Override // com.google.protobuf.m3
    @Deprecated
    public <T> T M(o3<T> o3Var, v0 v0Var) throws IOException {
        d0(3);
        return (T) Z(o3Var, v0Var);
    }

    @Override // com.google.protobuf.m3
    public <T> void N(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
        Q(target, i3.a().i(targetType), extensionRegistry);
    }

    @Override // com.google.protobuf.m3
    public <T> void O(T target, o3<T> schema, v0 extensionRegistry) throws IOException {
        d0(2);
        X(target, schema, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.m3
    @Deprecated
    public <T> void P(List<T> target, o3<T> schema, v0 extensionRegistry) throws IOException {
        int iZ;
        if (x4.b(this.f125717d) != 3) {
            throw t1.f();
        }
        int i10 = this.f125717d;
        do {
            target.add(Z(schema, extensionRegistry));
            if (this.f125716c.j() || this.f125719f != 0) {
                return;
            } else {
                iZ = this.f125716c.Z();
            }
        } while (iZ == i10);
        this.f125719f = iZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.m3
    public <T> void Q(List<T> target, o3<T> schema, v0 extensionRegistry) throws IOException {
        int iZ;
        if (x4.b(this.f125717d) != 2) {
            throw t1.f();
        }
        int i10 = this.f125717d;
        do {
            target.add(a0(schema, extensionRegistry));
            if (this.f125716c.j() || this.f125719f != 0) {
                return;
            } else {
                iZ = this.f125716c.Z();
            }
        } while (iZ == i10);
        this.f125719f = iZ;
    }

    @Override // com.google.protobuf.m3
    @Deprecated
    public <T> T R(Class<T> cls, v0 v0Var) throws IOException {
        d0(3);
        return (T) Z(i3.a().i(cls), v0Var);
    }

    @Override // com.google.protobuf.m3
    public <T> T S(Class<T> cls, v0 v0Var) throws IOException {
        d0(2);
        return (T) a0(i3.a().i(cls), v0Var);
    }

    @Override // com.google.protobuf.m3
    @Deprecated
    public <T> void T(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
        P(target, i3.a().i(targetType), extensionRegistry);
    }

    @Override // com.google.protobuf.m3
    public <T> T U(o3<T> o3Var, v0 v0Var) throws IOException {
        d0(2);
        return (T) a0(o3Var, v0Var);
    }

    @Override // com.google.protobuf.m3
    public void a(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof e2)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f125716c.W()));
                    if (!this.f125716c.j()) {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Long.valueOf(this.f125716c.W()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        e2 e2Var = (e2) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                e2Var.M0(this.f125716c.W());
                if (!this.f125716c.j()) {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            e2Var.M0(this.f125716c.W());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public long b() throws IOException {
        d0(1);
        return this.f125716c.U();
    }

    public void b0(List<String> target, boolean requireUtf8) throws IOException {
        int iZ;
        int iZ2;
        if (x4.b(this.f125717d) != 2) {
            throw t1.f();
        }
        if (!(target instanceof a2) || requireUtf8) {
            do {
                target.add(requireUtf8 ? J() : H());
                if (!this.f125716c.j()) {
                    iZ = this.f125716c.Z();
                }
            } while (iZ == this.f125717d);
            this.f125719f = iZ;
            return;
        }
        a2 a2Var = (a2) target;
        do {
            a2Var.d2(g());
            if (!this.f125716c.j()) {
                iZ2 = this.f125716c.Z();
            }
        } while (iZ2 == this.f125717d);
        this.f125719f = iZ2;
    }

    @Override // com.google.protobuf.m3
    public int c() throws IOException {
        d0(0);
        return this.f125716c.a0();
    }

    @Override // com.google.protobuf.m3
    public int d() throws IOException {
        d0(0);
        return this.f125716c.A();
    }

    @Override // com.google.protobuf.m3
    public int e() throws IOException {
        d0(0);
        return this.f125716c.V();
    }

    @Override // com.google.protobuf.m3
    public void f(List<Boolean> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof q)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Boolean.valueOf(this.f125716c.v()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Boolean.valueOf(this.f125716c.v()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        q qVar = (q) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                qVar.y0(this.f125716c.v());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            qVar.y0(this.f125716c.v());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public u g() throws IOException {
        d0(2);
        return this.f125716c.y();
    }

    @Override // com.google.protobuf.m3
    public void h(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f125716c.V()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Integer.valueOf(this.f125716c.V()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f125716c.V());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            r1Var.w1(this.f125716c.V());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public long i() throws IOException {
        d0(0);
        return this.f125716c.b0();
    }

    @Override // com.google.protobuf.m3
    public void j(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof e2)) {
            int iB = x4.b(this.f125717d);
            if (iB == 1) {
                do {
                    target.add(Long.valueOf(this.f125716c.U()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f125716c.a0();
            f0(iA0);
            int i10 = this.f125716c.i() + iA0;
            do {
                target.add(Long.valueOf(this.f125716c.U()));
            } while (this.f125716c.i() < i10);
            return;
        }
        e2 e2Var = (e2) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 1) {
            do {
                e2Var.M0(this.f125716c.U());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int iA1 = this.f125716c.a0();
        f0(iA1);
        int i11 = this.f125716c.i() + iA1;
        do {
            e2Var.M0(this.f125716c.U());
        } while (this.f125716c.i() < i11);
    }

    @Override // com.google.protobuf.m3
    public void k(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f125716c.G()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Integer.valueOf(this.f125716c.G()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f125716c.G());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            r1Var.w1(this.f125716c.G());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public void l(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 2) {
                int iA0 = this.f125716c.a0();
                e0(iA0);
                int i10 = this.f125716c.i() + iA0;
                do {
                    target.add(Integer.valueOf(this.f125716c.B()));
                } while (this.f125716c.i() < i10);
                return;
            }
            if (iB != 5) {
                throw t1.f();
            }
            do {
                target.add(Integer.valueOf(this.f125716c.B()));
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ = this.f125716c.Z();
                }
            } while (iZ == this.f125717d);
            this.f125719f = iZ;
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 2) {
            int iA1 = this.f125716c.a0();
            e0(iA1);
            int i11 = this.f125716c.i() + iA1;
            do {
                r1Var.w1(this.f125716c.B());
            } while (this.f125716c.i() < i11);
            return;
        }
        if (iB2 != 5) {
            throw t1.f();
        }
        do {
            r1Var.w1(this.f125716c.B());
            if (this.f125716c.j()) {
                return;
            } else {
                iZ2 = this.f125716c.Z();
            }
        } while (iZ2 == this.f125717d);
        this.f125719f = iZ2;
    }

    @Override // com.google.protobuf.m3
    public int m() throws IOException {
        int i10 = this.f125719f;
        if (i10 != 0) {
            this.f125717d = i10;
            this.f125719f = 0;
        } else {
            this.f125717d = this.f125716c.Z();
        }
        int i11 = this.f125717d;
        if (i11 == 0 || i11 == this.f125718e) {
            return Integer.MAX_VALUE;
        }
        return x4.a(i11);
    }

    @Override // com.google.protobuf.m3
    public void n(List<String> target) throws IOException {
        b0(target, false);
    }

    @Override // com.google.protobuf.m3
    public void o(List<Float> target) throws IOException {
        int iZ;
        int iZ2;
        int i10 = 5 >> 2;
        if (!(target instanceof h1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 2) {
                int iA0 = this.f125716c.a0();
                e0(iA0);
                int i11 = this.f125716c.i() + iA0;
                do {
                    target.add(Float.valueOf(this.f125716c.D()));
                } while (this.f125716c.i() < i11);
                return;
            }
            if (iB != 5) {
                throw t1.f();
            }
            do {
                target.add(Float.valueOf(this.f125716c.D()));
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ = this.f125716c.Z();
                }
            } while (iZ == this.f125717d);
            this.f125719f = iZ;
            return;
        }
        h1 h1Var = (h1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 2) {
            int iA1 = this.f125716c.a0();
            e0(iA1);
            int i12 = this.f125716c.i() + iA1;
            do {
                h1Var.b1(this.f125716c.D());
            } while (this.f125716c.i() < i12);
            return;
        }
        if (iB2 != 5) {
            throw t1.f();
        }
        do {
            h1Var.b1(this.f125716c.D());
            if (this.f125716c.j()) {
                return;
            } else {
                iZ2 = this.f125716c.Z();
            }
        } while (iZ2 == this.f125717d);
        this.f125719f = iZ2;
    }

    @Override // com.google.protobuf.m3
    public boolean p() {
        return this.f125716c.g0();
    }

    @Override // com.google.protobuf.m3
    public boolean q() throws IOException {
        int i10;
        if (this.f125716c.j() || (i10 = this.f125717d) == this.f125718e) {
            return false;
        }
        return this.f125716c.h0(i10);
    }

    @Override // com.google.protobuf.m3
    public void r(List<u> target) throws IOException {
        int iZ;
        if (x4.b(this.f125717d) != 2) {
            throw t1.f();
        }
        do {
            target.add(g());
            if (this.f125716c.j()) {
                return;
            } else {
                iZ = this.f125716c.Z();
            }
        } while (iZ == this.f125717d);
        this.f125719f = iZ;
    }

    @Override // com.google.protobuf.m3
    public double readDouble() throws IOException {
        d0(1);
        return this.f125716c.z();
    }

    @Override // com.google.protobuf.m3
    public float readFloat() throws IOException {
        d0(5);
        return this.f125716c.D();
    }

    @Override // com.google.protobuf.m3
    public void s(List<Double> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof f0) {
            f0 f0Var = (f0) target;
            int iB = x4.b(this.f125717d);
            if (iB == 1) {
                do {
                    f0Var.R0(this.f125716c.z());
                    if (!this.f125716c.j()) {
                        iZ2 = this.f125716c.Z();
                    }
                } while (iZ2 == this.f125717d);
                this.f125719f = iZ2;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f125716c.a0();
            f0(iA0);
            int i10 = this.f125716c.i() + iA0;
            do {
                f0Var.R0(this.f125716c.z());
            } while (this.f125716c.i() < i10);
        } else {
            int iB2 = x4.b(this.f125717d);
            if (iB2 == 1) {
                do {
                    target.add(Double.valueOf(this.f125716c.z()));
                    if (!this.f125716c.j()) {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iA1 = this.f125716c.a0();
            f0(iA1);
            int i11 = this.f125716c.i() + iA1;
            do {
                target.add(Double.valueOf(this.f125716c.z()));
            } while (this.f125716c.i() < i11);
        }
    }

    @Override // com.google.protobuf.m3
    public long t() throws IOException {
        d0(0);
        return this.f125716c.H();
    }

    @Override // com.google.protobuf.m3
    public long u() throws IOException {
        d0(1);
        return this.f125716c.C();
    }

    @Override // com.google.protobuf.m3
    public void v(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof r1) {
            r1 r1Var = (r1) target;
            int iB = x4.b(this.f125717d);
            if (iB != 2) {
                if (iB != 5) {
                    throw t1.f();
                }
                do {
                    r1Var.w1(this.f125716c.T());
                    if (!this.f125716c.j()) {
                        iZ2 = this.f125716c.Z();
                    }
                } while (iZ2 == this.f125717d);
                this.f125719f = iZ2;
                return;
            }
            int iA0 = this.f125716c.a0();
            e0(iA0);
            int i10 = this.f125716c.i() + iA0;
            do {
                r1Var.w1(this.f125716c.T());
            } while (this.f125716c.i() < i10);
        } else {
            int iB2 = x4.b(this.f125717d);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw t1.f();
                }
                do {
                    target.add(Integer.valueOf(this.f125716c.T()));
                    if (!this.f125716c.j()) {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            int iA1 = this.f125716c.a0();
            e0(iA1);
            int i11 = this.f125716c.i() + iA1;
            do {
                target.add(Integer.valueOf(this.f125716c.T()));
            } while (this.f125716c.i() < i11);
        }
    }

    @Override // com.google.protobuf.m3
    public boolean w() throws IOException {
        d0(0);
        return this.f125716c.v();
    }

    @Override // com.google.protobuf.m3
    public void x(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof e2)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f125716c.b0()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Long.valueOf(this.f125716c.b0()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        e2 e2Var = (e2) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                e2Var.M0(this.f125716c.b0());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            e2Var.M0(this.f125716c.b0());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public void y(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof e2)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f125716c.H()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Long.valueOf(this.f125716c.H()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        e2 e2Var = (e2) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                e2Var.M0(this.f125716c.H());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            e2Var.M0(this.f125716c.H());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }

    @Override // com.google.protobuf.m3
    public void z(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = x4.b(this.f125717d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f125716c.A()));
                    if (this.f125716c.j()) {
                        return;
                    } else {
                        iZ = this.f125716c.Z();
                    }
                } while (iZ == this.f125717d);
                this.f125719f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f125716c.i() + this.f125716c.a0();
            do {
                target.add(Integer.valueOf(this.f125716c.A()));
            } while (this.f125716c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = x4.b(this.f125717d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f125716c.A());
                if (this.f125716c.j()) {
                    return;
                } else {
                    iZ2 = this.f125716c.Z();
                }
            } while (iZ2 == this.f125717d);
            this.f125719f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f125716c.i() + this.f125716c.a0();
        do {
            r1Var.w1(this.f125716c.A());
        } while (this.f125716c.i() < i11);
        c0(i11);
    }
}
