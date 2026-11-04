package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
final class c0 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f50035a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50036a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50036a = iArr;
            try {
                iArr[a5.b.f49974j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50036a[a5.b.f49973i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50036a[a5.b.f49971g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50036a[a5.b.f49981t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50036a[a5.b.f49983w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50036a[a5.b.f49979o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50036a[a5.b.f49972h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50036a[a5.b.f49969e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50036a[a5.b.f49982v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50036a[a5.b.X.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50036a[a5.b.f49970f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50036a[a5.b.f49975k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private c0(b0 output) {
        b0 b0Var = (b0) s1.e(output, "output");
        this.f50035a = b0Var;
        b0Var.f50006a = this;
    }

    private void B0(int fieldNumber, h2 value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iB1 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iB1 += b0.b1(value.getLong(i11));
            }
            this.f50035a.h2(iB1);
            while (i10 < value.size()) {
                this.f50035a.i2(value.getLong(i10));
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.f(fieldNumber, value.getLong(i10));
                i10++;
            }
        }
    }

    private void C0(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iB1 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iB1 += b0.b1(value.get(i11).longValue());
            }
            this.f50035a.h2(iB1);
            while (i10 < value.size()) {
                this.f50035a.i2(value.get(i10).longValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.f(fieldNumber, value.get(i10).longValue());
                i10++;
            }
        }
    }

    public static c0 T(b0 output) {
        c0 c0Var = output.f50006a;
        return c0Var != null ? c0Var : new c0(output);
    }

    private void V(int fieldNumber, q value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.p(fieldNumber, value.j0(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iB0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iB0 += b0.b0(value.j0(i11));
        }
        this.f50035a.h2(iB0);
        while (i10 < value.size()) {
            this.f50035a.t1(value.j0(i10));
            i10++;
        }
    }

    private void W(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iB0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iB0 += b0.b0(value.get(i11).booleanValue());
            }
            this.f50035a.h2(iB0);
            while (i10 < value.size()) {
                this.f50035a.t1(value.get(i10).booleanValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.p(fieldNumber, value.get(i10).booleanValue());
                i10++;
            }
        }
    }

    private <V> void X(int fieldNumber, boolean key, V value, j2.b<Boolean, V> metadata) throws IOException {
        this.f50035a.g2(fieldNumber, 2);
        this.f50035a.h2(j2.b(metadata, Boolean.valueOf(key), value));
        j2.l(this.f50035a, metadata, Boolean.valueOf(key), value);
    }

    private <V> void Y(int fieldNumber, j2.b<Integer, V> metadata, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        Arrays.sort(iArr);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            V v10 = map.get(Integer.valueOf(i12));
            this.f50035a.g2(fieldNumber, 2);
            this.f50035a.h2(j2.b(metadata, Integer.valueOf(i12), v10));
            j2.l(this.f50035a, metadata, Integer.valueOf(i12), v10);
        }
    }

    private <V> void Z(int fieldNumber, j2.b<Long, V> metadata, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        Arrays.sort(jArr);
        for (int i11 = 0; i11 < size; i11++) {
            long j10 = jArr[i11];
            V v10 = map.get(Long.valueOf(j10));
            this.f50035a.g2(fieldNumber, 2);
            this.f50035a.h2(j2.b(metadata, Long.valueOf(j10), v10));
            j2.l(this.f50035a, metadata, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void a0(int fieldNumber, j2.b<K, V> metadata, Map<K, V> map) throws IOException {
        switch (a.f50036a[metadata.f50395a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    X(fieldNumber, false, v10, metadata);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    X(fieldNumber, true, v11, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                Y(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                Z(fieldNumber, metadata, map);
                return;
            case 12:
                b0(fieldNumber, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f50395a);
        }
    }

    private <V> void b0(int fieldNumber, j2.b<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i10 = 4 ^ 0;
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f50035a.g2(fieldNumber, 2);
            this.f50035a.h2(j2.b(metadata, str, v10));
            j2.l(this.f50035a, metadata, str, v10);
        }
    }

    private void c0(int fieldNumber, f0 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.B(fieldNumber, value.getDouble(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iJ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iJ0 += b0.j0(value.getDouble(i11));
        }
        this.f50035a.h2(iJ0);
        while (i10 < value.size()) {
            this.f50035a.A1(value.getDouble(i10));
            i10++;
        }
    }

    private void d0(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.B(fieldNumber, value.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iJ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iJ0 += b0.j0(value.get(i11).doubleValue());
        }
        this.f50035a.h2(iJ0);
        while (i10 < value.size()) {
            this.f50035a.A1(value.get(i10).doubleValue());
            i10++;
        }
    }

    private void e0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.K(fieldNumber, value.getInt(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iL0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iL0 += b0.l0(value.getInt(i11));
        }
        this.f50035a.h2(iL0);
        while (i10 < value.size()) {
            this.f50035a.B1(value.getInt(i10));
            i10++;
        }
    }

    private void f0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.K(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iL0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iL0 += b0.l0(value.get(i11).intValue());
        }
        this.f50035a.h2(iL0);
        while (i10 < value.size()) {
            this.f50035a.B1(value.get(i10).intValue());
            i10++;
        }
    }

    private void g0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iN0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iN0 += b0.n0(value.getInt(i11));
            }
            this.f50035a.h2(iN0);
            while (i10 < value.size()) {
                this.f50035a.C1(value.getInt(i10));
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.c(fieldNumber, value.getInt(i10));
                i10++;
            }
        }
    }

    private void h0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.c(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iN0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iN0 += b0.n0(value.get(i11).intValue());
        }
        this.f50035a.h2(iN0);
        while (i10 < value.size()) {
            this.f50035a.C1(value.get(i10).intValue());
            i10++;
        }
    }

    private void i0(int fieldNumber, h2 value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iP0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iP0 += b0.p0(value.getLong(i11));
            }
            this.f50035a.h2(iP0);
            while (i10 < value.size()) {
                this.f50035a.D1(value.getLong(i10));
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.n(fieldNumber, value.getLong(i10));
                i10++;
            }
        }
    }

    private void j0(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iP0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iP0 += b0.p0(value.get(i11).longValue());
            }
            this.f50035a.h2(iP0);
            while (i10 < value.size()) {
                this.f50035a.D1(value.get(i10).longValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.n(fieldNumber, value.get(i10).longValue());
                i10++;
            }
        }
    }

    private void k0(int fieldNumber, h1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.J(fieldNumber, value.getFloat(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iR0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iR0 += b0.r0(value.getFloat(i11));
        }
        this.f50035a.h2(iR0);
        while (i10 < value.size()) {
            this.f50035a.E1(value.getFloat(i10));
            i10++;
        }
    }

    private void l0(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iR0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iR0 += b0.r0(value.get(i11).floatValue());
            }
            this.f50035a.h2(iR0);
            while (i10 < value.size()) {
                this.f50035a.E1(value.get(i10).floatValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.J(fieldNumber, value.get(i10).floatValue());
                i10++;
            }
        }
    }

    private void m0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.h(fieldNumber, value.getInt(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iX0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iX0 += b0.x0(value.getInt(i11));
        }
        this.f50035a.h2(iX0);
        while (i10 < value.size()) {
            this.f50035a.J1(value.getInt(i10));
            i10++;
        }
    }

    private void n0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.h(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iX0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iX0 += b0.x0(value.get(i11).intValue());
        }
        this.f50035a.h2(iX0);
        while (i10 < value.size()) {
            this.f50035a.J1(value.get(i10).intValue());
            i10++;
        }
    }

    private void o0(int fieldNumber, h2 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.F(fieldNumber, value.getLong(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iZ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iZ0 += b0.z0(value.getLong(i11));
        }
        this.f50035a.h2(iZ0);
        while (i10 < value.size()) {
            this.f50035a.K1(value.getLong(i10));
            i10++;
        }
    }

    private void p0(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.F(fieldNumber, value.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iZ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iZ0 += b0.z0(value.get(i11).longValue());
        }
        this.f50035a.h2(iZ0);
        while (i10 < value.size()) {
            this.f50035a.K1(value.get(i10).longValue());
            i10++;
        }
    }

    private void q0(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            this.f50035a.e(fieldNumber, (String) value);
        } else {
            this.f50035a.N(fieldNumber, (u) value);
        }
    }

    private void r0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.q(fieldNumber, value.getInt(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iO0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iO0 += b0.O0(value.getInt(i11));
        }
        this.f50035a.h2(iO0);
        while (i10 < value.size()) {
            this.f50035a.b2(value.getInt(i10));
            i10++;
        }
    }

    private void s0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.q(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iO0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iO0 += b0.O0(value.get(i11).intValue());
        }
        this.f50035a.h2(iO0);
        while (i10 < value.size()) {
            this.f50035a.b2(value.get(i10).intValue());
            i10++;
        }
    }

    private void t0(int fieldNumber, h2 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.y(fieldNumber, value.getLong(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iQ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iQ0 += b0.Q0(value.getLong(i11));
        }
        this.f50035a.h2(iQ0);
        while (i10 < value.size()) {
            this.f50035a.c2(value.getLong(i10));
            i10++;
        }
    }

    private void u0(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iQ0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iQ0 += b0.Q0(value.get(i11).longValue());
            }
            this.f50035a.h2(iQ0);
            while (i10 < value.size()) {
                this.f50035a.c2(value.get(i10).longValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.y(fieldNumber, value.get(i10).longValue());
                i10++;
            }
        }
    }

    private void v0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.M(fieldNumber, value.getInt(i10));
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iS0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iS0 += b0.S0(value.getInt(i11));
        }
        this.f50035a.h2(iS0);
        while (i10 < value.size()) {
            this.f50035a.d2(value.getInt(i10));
            i10++;
        }
    }

    private void x0(int fieldNumber, h2 value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iU0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iU0 += b0.U0(value.getLong(i11));
            }
            this.f50035a.h2(iU0);
            while (i10 < value.size()) {
                this.f50035a.e2(value.getLong(i10));
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.k(fieldNumber, value.getLong(i10));
                i10++;
            }
        }
    }

    private void y0(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.k(fieldNumber, value.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iU0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iU0 += b0.U0(value.get(i11).longValue());
        }
        this.f50035a.h2(iU0);
        while (i10 < value.size()) {
            this.f50035a.e2(value.get(i10).longValue());
            i10++;
        }
    }

    private void z0(int fieldNumber, r1 value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f50035a.g2(fieldNumber, 2);
            int iZ0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iZ0 += b0.Z0(value.getInt(i11));
            }
            this.f50035a.h2(iZ0);
            while (i10 < value.size()) {
                this.f50035a.h2(value.getInt(i10));
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f50035a.l(fieldNumber, value.getInt(i10));
                i10++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void A(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            e0(fieldNumber, (r1) value, packed);
        } else {
            f0(fieldNumber, value, packed);
        }
    }

    public void A0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.l(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iZ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iZ0 += b0.Z0(value.get(i11).intValue());
        }
        this.f50035a.h2(iZ0);
        while (i10 < value.size()) {
            this.f50035a.h2(value.get(i10).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void B(int fieldNumber, double value) throws IOException {
        this.f50035a.B(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void C(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof h2) {
            t0(fieldNumber, (h2) value, packed);
        } else {
            u0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public c5.a D() {
        return c5.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void E(int fieldNumber, Object value) throws IOException {
        this.f50035a.L1(fieldNumber, (q2) value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void F(int fieldNumber, long value) throws IOException {
        this.f50035a.F(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void G(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            r0(fieldNumber, (r1) value, packed);
        } else {
            s0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void H(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        if (value instanceof q) {
            V(fieldNumber, (q) value, packed);
        } else {
            W(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    @Deprecated
    public void I(int fieldNumber, Object value) throws IOException {
        this.f50035a.F1(fieldNumber, (q2) value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void J(int fieldNumber, float value) throws IOException {
        this.f50035a.J(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void K(int fieldNumber, int value) throws IOException {
        this.f50035a.K(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void L(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof h2) {
            o0(fieldNumber, (h2) value, packed);
        } else {
            p0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void M(int fieldNumber, int value) throws IOException {
        this.f50035a.M(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void N(int fieldNumber, u value) throws IOException {
        this.f50035a.N(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void O(int fieldNumber, Object value, r3 schema) throws IOException {
        this.f50035a.M1(fieldNumber, (q2) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public <K, V> void P(int fieldNumber, j2.b<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.f50035a.h1()) {
            a0(fieldNumber, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f50035a.g2(fieldNumber, 2);
            this.f50035a.h2(j2.b(metadata, entry.getKey(), entry.getValue()));
            j2.l(this.f50035a, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void Q(int fieldNumber, List<?> value, r3 schema) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            R(fieldNumber, value.get(i10), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void R(int fieldNumber, Object value, r3 schema) throws IOException {
        this.f50035a.G1(fieldNumber, (q2) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void S(int fieldNumber, List<?> value, r3 schema) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            O(fieldNumber, value.get(i10), schema);
        }
    }

    public int U() {
        return this.f50035a.f1();
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void a(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        if (value instanceof h1) {
            k0(fieldNumber, (h1) value, packed);
        } else {
            l0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public final void b(int fieldNumber, Object value) throws IOException {
        if (value instanceof u) {
            this.f50035a.Y1(fieldNumber, (u) value);
        } else {
            this.f50035a.P1(fieldNumber, (q2) value);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void c(int fieldNumber, int value) throws IOException {
        this.f50035a.c(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    @Deprecated
    public void d(int fieldNumber, List<?> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            I(fieldNumber, value.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void e(int fieldNumber, String value) throws IOException {
        this.f50035a.e(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void f(int fieldNumber, long value) throws IOException {
        this.f50035a.f(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void g(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            m0(fieldNumber, (r1) value, packed);
        } else {
            n0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void h(int fieldNumber, int value) throws IOException {
        this.f50035a.h(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void i(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            g0(fieldNumber, (r1) value, packed);
        } else {
            h0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void j(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            z0(fieldNumber, (r1) value, packed);
        } else {
            A0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void k(int fieldNumber, long value) throws IOException {
        this.f50035a.k(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void l(int fieldNumber, int value) throws IOException {
        this.f50035a.l(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void m(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof h2) {
            B0(fieldNumber, (h2) value, packed);
        } else {
            C0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void n(int fieldNumber, long value) throws IOException {
        this.f50035a.n(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void o(int fieldNumber, List<?> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            E(fieldNumber, value.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void p(int fieldNumber, boolean value) throws IOException {
        this.f50035a.p(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void q(int fieldNumber, int value) throws IOException {
        this.f50035a.q(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    @Deprecated
    public void r(int fieldNumber) throws IOException {
        this.f50035a.g2(fieldNumber, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void s(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof h2) {
            i0(fieldNumber, (h2) value, packed);
        } else {
            j0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    @Deprecated
    public void t(int fieldNumber) throws IOException {
        this.f50035a.g2(fieldNumber, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void u(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof r1) {
            v0(fieldNumber, (r1) value, packed);
        } else {
            w0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void v(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        if (value instanceof f0) {
            c0(fieldNumber, (f0) value, packed);
        } else {
            d0(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void w(int fieldNumber, List<u> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            this.f50035a.N(fieldNumber, value.get(i10));
        }
    }

    public void w0(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f50035a.M(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f50035a.g2(fieldNumber, 2);
        int iS0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iS0 += b0.S0(value.get(i11).intValue());
        }
        this.f50035a.h2(iS0);
        while (i10 < value.size()) {
            this.f50035a.d2(value.get(i10).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void x(int fieldNumber, List<String> value) throws IOException {
        int i10 = 0;
        if (!(value instanceof b2)) {
            while (i10 < value.size()) {
                this.f50035a.e(fieldNumber, value.get(i10));
                i10++;
            }
        } else {
            b2 b2Var = (b2) value;
            while (i10 < value.size()) {
                q0(fieldNumber, b2Var.J1(i10));
                i10++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void y(int fieldNumber, long value) throws IOException {
        this.f50035a.y(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.c5
    public void z(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof h2) {
            x0(fieldNumber, (h2) value, packed);
        } else {
            y0(fieldNumber, value, packed);
        }
    }
}
