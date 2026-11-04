package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
final class c0 implements z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f125816a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125817a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f125817a = iArr;
            try {
                iArr[x4.b.f126489j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125817a[x4.b.f126488i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125817a[x4.b.f126486g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125817a[x4.b.f126496t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125817a[x4.b.f126498w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125817a[x4.b.f126494o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125817a[x4.b.f126487h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f125817a[x4.b.f126484e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f125817a[x4.b.f126497v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f125817a[x4.b.X.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f125817a[x4.b.f126485f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f125817a[x4.b.f126490k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private c0(b0 output) {
        b0 b0Var = (b0) s1.e(output, "output");
        this.f125816a = b0Var;
        b0Var.f125766a = this;
    }

    public static c0 T(b0 output) {
        c0 c0Var = output.f125766a;
        return c0Var != null ? c0Var : new c0(output);
    }

    private <V> void V(int fieldNumber, boolean key, V value, g2.b<Boolean, V> metadata) throws IOException {
        this.f125816a.g2(fieldNumber, 2);
        this.f125816a.h2(g2.b(metadata, Boolean.valueOf(key), value));
        g2.l(this.f125816a, metadata, Boolean.valueOf(key), value);
    }

    private <V> void W(int fieldNumber, g2.b<Integer, V> metadata, Map<Integer, V> map) throws IOException {
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
            this.f125816a.g2(fieldNumber, 2);
            this.f125816a.h2(g2.b(metadata, Integer.valueOf(i12), v10));
            g2.l(this.f125816a, metadata, Integer.valueOf(i12), v10);
        }
    }

    private <V> void X(int fieldNumber, g2.b<Long, V> metadata, Map<Long, V> map) throws IOException {
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
            this.f125816a.g2(fieldNumber, 2);
            this.f125816a.h2(g2.b(metadata, Long.valueOf(j10), v10));
            g2.l(this.f125816a, metadata, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void Y(int fieldNumber, g2.b<K, V> metadata, Map<K, V> map) throws IOException {
        switch (a.f125817a[metadata.f126000a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    V(fieldNumber, false, v10, metadata);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    V(fieldNumber, true, v11, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                W(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                X(fieldNumber, metadata, map);
                return;
            case 12:
                Z(fieldNumber, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f126000a);
        }
    }

    private <V> void Z(int fieldNumber, g2.b<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = it.next();
            i10++;
        }
        Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            String str = strArr[i11];
            V v10 = map.get(str);
            this.f125816a.g2(fieldNumber, 2);
            this.f125816a.h2(g2.b(metadata, str, v10));
            g2.l(this.f125816a, metadata, str, v10);
        }
    }

    private void a0(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            this.f125816a.e(fieldNumber, (String) value);
        } else {
            this.f125816a.N(fieldNumber, (u) value);
        }
    }

    @Override // com.google.protobuf.z4
    public void A(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.K(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iL0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iL0 += b0.l0(value.get(i11).intValue());
        }
        this.f125816a.h2(iL0);
        while (i10 < value.size()) {
            this.f125816a.B1(value.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void B(int fieldNumber, double value) throws IOException {
        this.f125816a.B(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void C(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            int i11 = 5 & 2;
            this.f125816a.g2(fieldNumber, 2);
            int iQ0 = 0;
            for (int i12 = 0; i12 < value.size(); i12++) {
                iQ0 += b0.Q0(value.get(i12).longValue());
            }
            this.f125816a.h2(iQ0);
            while (i10 < value.size()) {
                this.f125816a.c2(value.get(i10).longValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f125816a.y(fieldNumber, value.get(i10).longValue());
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.z4
    public z4.a D() {
        return z4.a.ASCENDING;
    }

    @Override // com.google.protobuf.z4
    public void E(int fieldNumber, Object value) throws IOException {
        this.f125816a.L1(fieldNumber, (n2) value);
    }

    @Override // com.google.protobuf.z4
    public void F(int fieldNumber, long value) throws IOException {
        this.f125816a.F(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void G(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f125816a.g2(fieldNumber, 2);
            int iO0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iO0 += b0.O0(value.get(i11).intValue());
            }
            this.f125816a.h2(iO0);
            while (i10 < value.size()) {
                this.f125816a.b2(value.get(i10).intValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f125816a.q(fieldNumber, value.get(i10).intValue());
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.z4
    public void H(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.p(fieldNumber, value.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iB0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iB0 += b0.b0(value.get(i11).booleanValue());
        }
        this.f125816a.h2(iB0);
        while (i10 < value.size()) {
            this.f125816a.t1(value.get(i10).booleanValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    @Deprecated
    public void I(int fieldNumber, Object value) throws IOException {
        this.f125816a.F1(fieldNumber, (n2) value);
    }

    @Override // com.google.protobuf.z4
    public void J(int fieldNumber, float value) throws IOException {
        this.f125816a.J(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void K(int fieldNumber, int value) throws IOException {
        this.f125816a.K(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void L(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.F(fieldNumber, value.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iZ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iZ0 += b0.z0(value.get(i11).longValue());
        }
        this.f125816a.h2(iZ0);
        while (i10 < value.size()) {
            this.f125816a.K1(value.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void M(int fieldNumber, int value) throws IOException {
        this.f125816a.M(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void N(int fieldNumber, u value) throws IOException {
        this.f125816a.N(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public <K, V> void O(int fieldNumber, g2.b<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.f125816a.h1()) {
            Y(fieldNumber, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f125816a.g2(fieldNumber, 2);
            this.f125816a.h2(g2.b(metadata, entry.getKey(), entry.getValue()));
            g2.l(this.f125816a, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.z4
    public void P(int fieldNumber, List<?> value, o3 schema) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            S(fieldNumber, value.get(i10), schema);
        }
    }

    @Override // com.google.protobuf.z4
    public void Q(int fieldNumber, Object value, o3 schema) throws IOException {
        this.f125816a.G1(fieldNumber, (n2) value, schema);
    }

    @Override // com.google.protobuf.z4
    public void R(int fieldNumber, List<?> value, o3 schema) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            Q(fieldNumber, value.get(i10), schema);
        }
    }

    @Override // com.google.protobuf.z4
    public void S(int fieldNumber, Object value, o3 schema) throws IOException {
        this.f125816a.M1(fieldNumber, (n2) value, schema);
    }

    public int U() {
        return this.f125816a.f1();
    }

    @Override // com.google.protobuf.z4
    public void a(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.J(fieldNumber, value.get(i10).floatValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iR0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iR0 += b0.r0(value.get(i11).floatValue());
        }
        this.f125816a.h2(iR0);
        while (i10 < value.size()) {
            this.f125816a.E1(value.get(i10).floatValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public final void b(int fieldNumber, Object value) throws IOException {
        if (value instanceof u) {
            this.f125816a.Y1(fieldNumber, (u) value);
        } else {
            this.f125816a.P1(fieldNumber, (n2) value);
        }
    }

    @Override // com.google.protobuf.z4
    public void c(int fieldNumber, int value) throws IOException {
        this.f125816a.c(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    @Deprecated
    public void d(int fieldNumber, List<?> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            I(fieldNumber, value.get(i10));
        }
    }

    @Override // com.google.protobuf.z4
    public void e(int fieldNumber, String value) throws IOException {
        this.f125816a.e(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void f(int fieldNumber, long value) throws IOException {
        this.f125816a.f(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void g(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f125816a.g2(fieldNumber, 2);
            int iX0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iX0 += b0.x0(value.get(i11).intValue());
            }
            this.f125816a.h2(iX0);
            while (i10 < value.size()) {
                this.f125816a.J1(value.get(i10).intValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f125816a.h(fieldNumber, value.get(i10).intValue());
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.z4
    public void h(int fieldNumber, int value) throws IOException {
        this.f125816a.h(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void i(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.c(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iN0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iN0 += b0.n0(value.get(i11).intValue());
        }
        this.f125816a.h2(iN0);
        while (i10 < value.size()) {
            this.f125816a.C1(value.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void j(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f125816a.g2(fieldNumber, 2);
            int iZ0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iZ0 += b0.Z0(value.get(i11).intValue());
            }
            this.f125816a.h2(iZ0);
            while (i10 < value.size()) {
                this.f125816a.h2(value.get(i10).intValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f125816a.l(fieldNumber, value.get(i10).intValue());
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.z4
    public void k(int fieldNumber, long value) throws IOException {
        this.f125816a.k(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void l(int fieldNumber, int value) throws IOException {
        this.f125816a.l(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void m(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.f(fieldNumber, value.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iB1 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iB1 += b0.b1(value.get(i11).longValue());
        }
        this.f125816a.h2(iB1);
        while (i10 < value.size()) {
            this.f125816a.i2(value.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void n(int fieldNumber, long value) throws IOException {
        this.f125816a.n(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void o(int fieldNumber, List<?> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            E(fieldNumber, value.get(i10));
        }
    }

    @Override // com.google.protobuf.z4
    public void p(int fieldNumber, boolean value) throws IOException {
        this.f125816a.p(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void q(int fieldNumber, int value) throws IOException {
        this.f125816a.q(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    @Deprecated
    public void r(int fieldNumber) throws IOException {
        this.f125816a.g2(fieldNumber, 3);
    }

    @Override // com.google.protobuf.z4
    public void s(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.n(fieldNumber, value.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iP0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iP0 += b0.p0(value.get(i11).longValue());
        }
        this.f125816a.h2(iP0);
        while (i10 < value.size()) {
            this.f125816a.D1(value.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    @Deprecated
    public void t(int fieldNumber) throws IOException {
        this.f125816a.g2(fieldNumber, 4);
    }

    @Override // com.google.protobuf.z4
    public void u(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.M(fieldNumber, value.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iS0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iS0 += b0.S0(value.get(i11).intValue());
        }
        this.f125816a.h2(iS0);
        while (i10 < value.size()) {
            this.f125816a.d2(value.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void v(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        int i10 = 0;
        if (!packed) {
            while (i10 < value.size()) {
                this.f125816a.B(fieldNumber, value.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        this.f125816a.g2(fieldNumber, 2);
        int iJ0 = 0;
        for (int i11 = 0; i11 < value.size(); i11++) {
            iJ0 += b0.j0(value.get(i11).doubleValue());
        }
        this.f125816a.h2(iJ0);
        while (i10 < value.size()) {
            this.f125816a.A1(value.get(i10).doubleValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.z4
    public void w(int fieldNumber, List<u> value) throws IOException {
        for (int i10 = 0; i10 < value.size(); i10++) {
            this.f125816a.N(fieldNumber, value.get(i10));
        }
    }

    @Override // com.google.protobuf.z4
    public void x(int fieldNumber, List<String> value) throws IOException {
        int i10 = 0;
        if (!(value instanceof a2)) {
            while (i10 < value.size()) {
                this.f125816a.e(fieldNumber, value.get(i10));
                i10++;
            }
        } else {
            a2 a2Var = (a2) value;
            while (i10 < value.size()) {
                a0(fieldNumber, a2Var.J1(i10));
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.z4
    public void y(int fieldNumber, long value) throws IOException {
        this.f125816a.y(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public void z(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i10 = 0;
        if (packed) {
            this.f125816a.g2(fieldNumber, 2);
            int iU0 = 0;
            for (int i11 = 0; i11 < value.size(); i11++) {
                iU0 += b0.U0(value.get(i11).longValue());
            }
            this.f125816a.h2(iU0);
            while (i10 < value.size()) {
                this.f125816a.e2(value.get(i10).longValue());
                i10++;
            }
        } else {
            while (i10 < value.size()) {
                this.f125816a.k(fieldNumber, value.get(i10).longValue());
                i10++;
            }
        }
    }
}
