package androidx.datastore.preferences.protobuf;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
final class a0 implements o3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f49905g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f49906h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f49907i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f49908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49911f = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49912a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f49912a = iArr;
            try {
                iArr[a5.b.f49974j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49912a[a5.b.f49978n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49912a[a5.b.f49967c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49912a[a5.b.f49980s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49912a[a5.b.f49973i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49912a[a5.b.f49972h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49912a[a5.b.f49968d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f49912a[a5.b.f49971g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f49912a[a5.b.f49969e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f49912a[a5.b.f49977m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f49912a[a5.b.f49981t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f49912a[a5.b.f49982v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f49912a[a5.b.f49983w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f49912a[a5.b.X.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f49912a[a5.b.f49975k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f49912a[a5.b.f49979o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f49912a[a5.b.f49970f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private a0(z input) {
        z zVar = (z) s1.e(input, MetricTracker.Object.INPUT);
        this.f49908c = zVar;
        zVar.f50792d = this;
    }

    public static a0 V(z input) {
        a0 a0Var = input.f50792d;
        return a0Var != null ? a0Var : new a0(input);
    }

    private <T> void W(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
        int i10 = this.f49910e;
        this.f49910e = a5.c(a5.a(this.f49909d), 4);
        try {
            schema.i(target, this, extensionRegistry);
            if (this.f49909d != this.f49910e) {
                throw t1.i();
            }
            this.f49910e = i10;
        } catch (Throwable th2) {
            this.f49910e = i10;
            throw th2;
        }
    }

    private <T> void X(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
        int iA0 = this.f49908c.a0();
        z zVar = this.f49908c;
        if (zVar.f50789a >= zVar.f50790b) {
            throw t1.j();
        }
        int iU = zVar.u(iA0);
        this.f49908c.f50789a++;
        schema.i(target, this, extensionRegistry);
        this.f49908c.a(0);
        z zVar2 = this.f49908c;
        zVar2.f50789a--;
        zVar2.t(iU);
    }

    private Object Y(a5.b fieldType, Class<?> messageType, v0 extensionRegistry) throws IOException {
        switch (a.f49912a[fieldType.ordinal()]) {
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
                return L(messageType, extensionRegistry);
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

    private <T> T Z(r3<T> schema, v0 extensionRegistry) throws IOException {
        T tG = schema.g();
        W(tG, schema, extensionRegistry);
        schema.e(tG);
        return tG;
    }

    private <T> T a0(r3<T> schema, v0 extensionRegistry) throws IOException {
        T tG = schema.g();
        X(tG, schema, extensionRegistry);
        schema.e(tG);
        return tG;
    }

    private void c0(int expectedPosition) throws IOException {
        if (this.f49908c.i() != expectedPosition) {
            throw t1.n();
        }
    }

    private void d0(int requiredWireType) throws IOException {
        if (a5.b(this.f49909d) != requiredWireType) {
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

    @Override // androidx.datastore.preferences.protobuf.o3
    public void A(List<String> target) throws IOException {
        b0(target, true);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int B() throws IOException {
        d0(0);
        return this.f49908c.G();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void C(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h2)) {
            int iB = a5.b(this.f49909d);
            if (iB == 1) {
                do {
                    target.add(Long.valueOf(this.f49908c.C()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f49908c.a0();
            f0(iA0);
            int i10 = this.f49908c.i() + iA0;
            do {
                target.add(Long.valueOf(this.f49908c.C()));
            } while (this.f49908c.i() < i10);
            return;
        }
        h2 h2Var = (h2) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 1) {
            do {
                h2Var.M0(this.f49908c.C());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int iA1 = this.f49908c.a0();
        f0(iA1);
        int i11 = this.f49908c.i() + iA1;
        do {
            h2Var.M0(this.f49908c.C());
        } while (this.f49908c.i() < i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void D(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f49908c.a0()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Integer.valueOf(this.f49908c.a0()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f49908c.a0());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            r1Var.w1(this.f49908c.a0());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int E() {
        return this.f49909d;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int F() throws IOException {
        d0(5);
        return this.f49908c.B();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public long G() throws IOException {
        d0(0);
        return this.f49908c.W();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public String H() throws IOException {
        d0(2);
        return this.f49908c.X();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int I() throws IOException {
        d0(5);
        return this.f49908c.T();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public String J() throws IOException {
        d0(2);
        return this.f49908c.Y();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    @Deprecated
    public <T> T K(r3<T> r3Var, v0 v0Var) throws IOException {
        d0(3);
        return (T) Z(r3Var, v0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> T L(Class<T> cls, v0 v0Var) throws IOException {
        d0(2);
        return (T) a0(k3.a().i(cls), v0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    @Deprecated
    public <T> void M(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
        U(target, k3.a().i(targetType), extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> T N(r3<T> r3Var, v0 v0Var) throws IOException {
        d0(2);
        return (T) a0(r3Var, v0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> void O(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
        d0(2);
        X(target, schema, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> void P(List<T> target, r3<T> schema, v0 extensionRegistry) throws IOException {
        int iZ;
        if (a5.b(this.f49909d) != 2) {
            throw t1.f();
        }
        int i10 = this.f49909d;
        do {
            target.add(a0(schema, extensionRegistry));
            if (this.f49908c.j() || this.f49911f != 0) {
                return;
            } else {
                iZ = this.f49908c.Z();
            }
        } while (iZ == i10);
        this.f49911f = iZ;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    @Deprecated
    public <T> T Q(Class<T> cls, v0 v0Var) throws IOException {
        d0(3);
        return (T) Z(k3.a().i(cls), v0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> void R(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException {
        P(target, k3.a().i(targetType), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.o3
    public <K, V> void S(Map<K, V> target, j2.b<K, V> metadata, v0 extensionRegistry) throws IOException {
        d0(2);
        int iU = this.f49908c.u(this.f49908c.a0());
        Object objY = metadata.f50396b;
        Object objY2 = metadata.f50398d;
        while (true) {
            try {
                int iM = m();
                if (iM == Integer.MAX_VALUE || this.f49908c.j()) {
                    break;
                }
                if (iM == 1) {
                    objY = Y(metadata.f50395a, null, null);
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
                    objY2 = Y(metadata.f50397c, metadata.f50398d.getClass(), extensionRegistry);
                }
            } catch (Throwable th2) {
                this.f49908c.t(iU);
                throw th2;
            }
        }
        target.put(objY, objY2);
        this.f49908c.t(iU);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public <T> void T(T target, r3<T> schema, v0 extensionRegistry) throws IOException {
        d0(3);
        W(target, schema, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.o3
    @Deprecated
    public <T> void U(List<T> target, r3<T> schema, v0 extensionRegistry) throws IOException {
        int iZ;
        if (a5.b(this.f49909d) != 3) {
            throw t1.f();
        }
        int i10 = this.f49909d;
        do {
            target.add(Z(schema, extensionRegistry));
            if (!this.f49908c.j() && this.f49911f == 0) {
                iZ = this.f49908c.Z();
            }
        } while (iZ == i10);
        this.f49911f = iZ;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void a(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h2)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f49908c.W()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Long.valueOf(this.f49908c.W()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        h2 h2Var = (h2) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                h2Var.M0(this.f49908c.W());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            h2Var.M0(this.f49908c.W());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public long b() throws IOException {
        d0(1);
        return this.f49908c.U();
    }

    public void b0(List<String> target, boolean requireUtf8) throws IOException {
        int iZ;
        int iZ2;
        if (a5.b(this.f49909d) != 2) {
            throw t1.f();
        }
        if (!(target instanceof b2) || requireUtf8) {
            do {
                target.add(requireUtf8 ? J() : H());
                if (!this.f49908c.j()) {
                    iZ = this.f49908c.Z();
                }
            } while (iZ == this.f49909d);
            this.f49911f = iZ;
            return;
        }
        b2 b2Var = (b2) target;
        do {
            b2Var.O2(g());
            if (!this.f49908c.j()) {
                iZ2 = this.f49908c.Z();
            }
        } while (iZ2 == this.f49909d);
        this.f49911f = iZ2;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int c() throws IOException {
        d0(0);
        return this.f49908c.a0();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int d() throws IOException {
        d0(0);
        return this.f49908c.A();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int e() throws IOException {
        d0(0);
        return this.f49908c.V();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void f(List<Boolean> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof q)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Boolean.valueOf(this.f49908c.v()));
                    if (!this.f49908c.j()) {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Boolean.valueOf(this.f49908c.v()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        q qVar = (q) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                qVar.y0(this.f49908c.v());
                if (!this.f49908c.j()) {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            qVar.y0(this.f49908c.v());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public u g() throws IOException {
        d0(2);
        return this.f49908c.y();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void h(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f49908c.V()));
                    if (!this.f49908c.j()) {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Integer.valueOf(this.f49908c.V()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f49908c.V());
                if (!this.f49908c.j()) {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            r1Var.w1(this.f49908c.V());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public long i() throws IOException {
        d0(0);
        return this.f49908c.b0();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void j(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h2)) {
            int iB = a5.b(this.f49909d);
            if (iB == 1) {
                do {
                    target.add(Long.valueOf(this.f49908c.U()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f49908c.a0();
            f0(iA0);
            int i10 = this.f49908c.i() + iA0;
            do {
                target.add(Long.valueOf(this.f49908c.U()));
            } while (this.f49908c.i() < i10);
            return;
        }
        h2 h2Var = (h2) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 1) {
            do {
                h2Var.M0(this.f49908c.U());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int iA1 = this.f49908c.a0();
        f0(iA1);
        int i11 = this.f49908c.i() + iA1;
        do {
            h2Var.M0(this.f49908c.U());
        } while (this.f49908c.i() < i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void k(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f49908c.G()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Integer.valueOf(this.f49908c.G()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f49908c.G());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            r1Var.w1(this.f49908c.G());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void l(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof r1) {
            r1 r1Var = (r1) target;
            int iB = a5.b(this.f49909d);
            if (iB != 2) {
                if (iB != 5) {
                    throw t1.f();
                }
                do {
                    r1Var.w1(this.f49908c.B());
                    if (!this.f49908c.j()) {
                        iZ2 = this.f49908c.Z();
                    }
                } while (iZ2 == this.f49909d);
                this.f49911f = iZ2;
                return;
            }
            int iA0 = this.f49908c.a0();
            e0(iA0);
            int i10 = this.f49908c.i() + iA0;
            do {
                r1Var.w1(this.f49908c.B());
            } while (this.f49908c.i() < i10);
        } else {
            int iB2 = a5.b(this.f49909d);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw t1.f();
                }
                do {
                    target.add(Integer.valueOf(this.f49908c.B()));
                    if (!this.f49908c.j()) {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            int iA1 = this.f49908c.a0();
            e0(iA1);
            int i11 = this.f49908c.i() + iA1;
            do {
                target.add(Integer.valueOf(this.f49908c.B()));
            } while (this.f49908c.i() < i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public int m() throws IOException {
        int i10 = this.f49911f;
        if (i10 != 0) {
            this.f49909d = i10;
            this.f49911f = 0;
        } else {
            this.f49909d = this.f49908c.Z();
        }
        int i11 = this.f49909d;
        if (i11 != 0 && i11 != this.f49910e) {
            return a5.a(i11);
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void n(List<String> target) throws IOException {
        b0(target, false);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void o(List<Float> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h1)) {
            int iB = a5.b(this.f49909d);
            if (iB == 2) {
                int iA0 = this.f49908c.a0();
                e0(iA0);
                int i10 = this.f49908c.i() + iA0;
                do {
                    target.add(Float.valueOf(this.f49908c.D()));
                } while (this.f49908c.i() < i10);
                return;
            }
            if (iB != 5) {
                throw t1.f();
            }
            do {
                target.add(Float.valueOf(this.f49908c.D()));
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ = this.f49908c.Z();
                }
            } while (iZ == this.f49909d);
            this.f49911f = iZ;
            return;
        }
        h1 h1Var = (h1) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 2) {
            int iA1 = this.f49908c.a0();
            e0(iA1);
            int i11 = this.f49908c.i() + iA1;
            do {
                h1Var.b1(this.f49908c.D());
            } while (this.f49908c.i() < i11);
            return;
        }
        if (iB2 != 5) {
            throw t1.f();
        }
        do {
            h1Var.b1(this.f49908c.D());
            if (this.f49908c.j()) {
                return;
            } else {
                iZ2 = this.f49908c.Z();
            }
        } while (iZ2 == this.f49909d);
        this.f49911f = iZ2;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public boolean p() {
        return this.f49908c.g0();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public boolean q() throws IOException {
        int i10;
        if (this.f49908c.j() || (i10 = this.f49909d) == this.f49910e) {
            return false;
        }
        return this.f49908c.h0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void r(List<u> target) throws IOException {
        int iZ;
        if (a5.b(this.f49909d) != 2) {
            throw t1.f();
        }
        do {
            target.add(g());
            if (this.f49908c.j()) {
                return;
            } else {
                iZ = this.f49908c.Z();
            }
        } while (iZ == this.f49909d);
        this.f49911f = iZ;
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public double readDouble() throws IOException {
        d0(1);
        return this.f49908c.z();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public float readFloat() throws IOException {
        d0(5);
        return this.f49908c.D();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void s(List<Double> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof f0) {
            f0 f0Var = (f0) target;
            int iB = a5.b(this.f49909d);
            if (iB == 1) {
                do {
                    f0Var.R0(this.f49908c.z());
                    if (!this.f49908c.j()) {
                        iZ2 = this.f49908c.Z();
                    }
                } while (iZ2 == this.f49909d);
                this.f49911f = iZ2;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int iA0 = this.f49908c.a0();
            f0(iA0);
            int i10 = this.f49908c.i() + iA0;
            do {
                f0Var.R0(this.f49908c.z());
            } while (this.f49908c.i() < i10);
        } else {
            int iB2 = a5.b(this.f49909d);
            if (iB2 == 1) {
                do {
                    target.add(Double.valueOf(this.f49908c.z()));
                    if (!this.f49908c.j()) {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB2 != 2) {
                throw t1.f();
            }
            int iA1 = this.f49908c.a0();
            f0(iA1);
            int i11 = this.f49908c.i() + iA1;
            do {
                target.add(Double.valueOf(this.f49908c.z()));
            } while (this.f49908c.i() < i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public long t() throws IOException {
        d0(0);
        return this.f49908c.H();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public long u() throws IOException {
        d0(1);
        return this.f49908c.C();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void v(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (target instanceof r1) {
            r1 r1Var = (r1) target;
            int iB = a5.b(this.f49909d);
            if (iB != 2) {
                if (iB != 5) {
                    throw t1.f();
                }
                do {
                    r1Var.w1(this.f49908c.T());
                    if (!this.f49908c.j()) {
                        iZ2 = this.f49908c.Z();
                    }
                } while (iZ2 == this.f49909d);
                this.f49911f = iZ2;
                return;
            }
            int iA0 = this.f49908c.a0();
            e0(iA0);
            int i10 = this.f49908c.i() + iA0;
            do {
                r1Var.w1(this.f49908c.T());
            } while (this.f49908c.i() < i10);
        } else {
            int iB2 = a5.b(this.f49909d);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw t1.f();
                }
                do {
                    target.add(Integer.valueOf(this.f49908c.T()));
                    if (!this.f49908c.j()) {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            int iA1 = this.f49908c.a0();
            e0(iA1);
            int i11 = this.f49908c.i() + iA1;
            do {
                target.add(Integer.valueOf(this.f49908c.T()));
            } while (this.f49908c.i() < i11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public boolean w() throws IOException {
        d0(0);
        return this.f49908c.v();
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void x(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h2)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f49908c.b0()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Long.valueOf(this.f49908c.b0()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        h2 h2Var = (h2) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                h2Var.M0(this.f49908c.b0());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            h2Var.M0(this.f49908c.b0());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void y(List<Long> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof h2)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Long.valueOf(this.f49908c.H()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Long.valueOf(this.f49908c.H()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        h2 h2Var = (h2) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                h2Var.M0(this.f49908c.H());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            h2Var.M0(this.f49908c.H());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.o3
    public void z(List<Integer> target) throws IOException {
        int iZ;
        int iZ2;
        if (!(target instanceof r1)) {
            int iB = a5.b(this.f49909d);
            if (iB == 0) {
                do {
                    target.add(Integer.valueOf(this.f49908c.A()));
                    if (this.f49908c.j()) {
                        return;
                    } else {
                        iZ = this.f49908c.Z();
                    }
                } while (iZ == this.f49909d);
                this.f49911f = iZ;
                return;
            }
            if (iB != 2) {
                throw t1.f();
            }
            int i10 = this.f49908c.i() + this.f49908c.a0();
            do {
                target.add(Integer.valueOf(this.f49908c.A()));
            } while (this.f49908c.i() < i10);
            c0(i10);
            return;
        }
        r1 r1Var = (r1) target;
        int iB2 = a5.b(this.f49909d);
        if (iB2 == 0) {
            do {
                r1Var.w1(this.f49908c.A());
                if (this.f49908c.j()) {
                    return;
                } else {
                    iZ2 = this.f49908c.Z();
                }
            } while (iZ2 == this.f49909d);
            this.f49911f = iZ2;
            return;
        }
        if (iB2 != 2) {
            throw t1.f();
        }
        int i11 = this.f49908c.i() + this.f49908c.a0();
        do {
            r1Var.w1(this.f49908c.A());
        } while (this.f49908c.i() < i11);
        c0(i11);
    }
}
