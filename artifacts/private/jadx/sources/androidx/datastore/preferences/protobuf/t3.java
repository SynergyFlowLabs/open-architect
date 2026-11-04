package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
@y
final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f50624a = D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r4<?, ?> f50625b = F();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r4<?, ?> f50626c = new t4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50627d = 40;

    private t3() {
    }

    static int A(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2)) {
            int iB1 = 0;
            while (i10 < size) {
                iB1 += b0.b1(list.get(i10).longValue());
                i10++;
            }
            return iB1;
        }
        h2 h2Var = (h2) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += b0.b1(h2Var.getLong(i10));
            i10++;
        }
        return iB2;
    }

    public static void A0(int fieldNumber, List<String> value, c5 writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.x(fieldNumber, value);
    }

    @x
    static <UT, UB> UB B(Object obj, int i10, List<Integer> list, s1.d<?> dVar, UB ub2, r4<UT, UB> r4Var) {
        if (dVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.a(iIntValue) == null) {
                    ub2 = (UB) O(obj, i10, iIntValue, ub2, r4Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (dVar.a(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) O(obj, i10, iIntValue2, ub2, r4Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static void B0(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.l(fieldNumber, value);
        }
    }

    @x
    static <UT, UB> UB C(Object obj, int i10, List<Integer> list, s1.e eVar, UB ub2, r4<UT, UB> r4Var) {
        if (eVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.a(iIntValue)) {
                    ub2 = (UB) O(obj, i10, iIntValue, ub2, r4Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) O(obj, i10, iIntValue2, ub2, r4Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static void C0(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.j(fieldNumber, value, packed);
    }

    private static Class<?> D() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D0(int fieldNumber, long value, c5 writer) throws IOException {
        if (value != 0) {
            writer.f(fieldNumber, value);
        }
    }

    static Object E(Class<?> clazz, String name) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(clazz.getName());
            sb2.append("$");
            int i10 = 6 >> 1;
            sb2.append(P(name, true));
            sb2.append("DefaultEntryHolder");
            Field[] declaredFields = Class.forName(sb2.toString()).getDeclaredFields();
            if (declaredFields.length == 1) {
                int i11 = 7 | 0;
                return w4.S(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public static void E0(int fieldNumber, List<Long> value, c5 writer, boolean packed) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.m(fieldNumber, value, packed);
        }
    }

    private static r4<?, ?> F() {
        try {
            Class<?> clsG = G();
            if (clsG == null) {
                return null;
            }
            return (r4) clsG.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> G() {
        if (k3.f50408d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends f1.c<FT>> void H(w0<FT> schema, T message, T other) {
        f1<T> f1VarC = schema.c(other);
        if (f1VarC.C()) {
            return;
        }
        schema.d(message).K(f1VarC);
    }

    static <T> void I(l2 mapFieldSchema, T message, T o10, long offset) {
        w4.t0(message, offset, mapFieldSchema.a(w4.Q(message, offset), w4.Q(o10, offset)));
    }

    static <T, UT, UB> void J(r4<UT, UB> schema, T message, T other) {
        schema.q(message, schema.k(schema.g(message), schema.g(other)));
    }

    public static void K(Class<?> messageType) {
        Class<?> cls;
        if (!l1.class.isAssignableFrom(messageType) && !k3.f50408d && (cls = f50624a) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean L(Object a10, Object b10) {
        if (a10 != b10) {
            return a10 != null && a10.equals(b10);
        }
        return true;
    }

    public static boolean M(int lo, int hi2, int numFields) {
        if (hi2 < 40) {
            return true;
        }
        long j10 = ((long) hi2) - ((long) lo);
        long j11 = numFields;
        return j10 + 10 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    public static boolean N(a1[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return M(fields[0].v(), fields[fields.length - 1].v(), fields.length);
    }

    @x
    static <UT, UB> UB O(Object obj, int i10, int i11, UB ub2, r4<UT, UB> r4Var) {
        if (ub2 == null) {
            ub2 = r4Var.f(obj);
        }
        r4Var.e(ub2, i10, i11);
        return ub2;
    }

    static String P(String name, boolean capNext) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < name.length(); i10++) {
            char cCharAt = name.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    capNext = true;
                } else if (i10 != 0 || capNext) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (capNext) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            capNext = false;
        }
        return sb2.toString();
    }

    public static r4<?, ?> Q() {
        return f50625b;
    }

    public static r4<?, ?> R() {
        return f50626c;
    }

    public static void S(int fieldNumber, boolean value, c5 writer) throws IOException {
        if (value) {
            writer.p(fieldNumber, true);
        }
    }

    public static void T(int fieldNumber, List<Boolean> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.H(fieldNumber, value, packed);
    }

    public static void U(int fieldNumber, u value, c5 writer) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.N(fieldNumber, value);
        }
    }

    public static void V(int fieldNumber, List<u> value, c5 writer) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.w(fieldNumber, value);
        }
    }

    public static void W(int fieldNumber, double value, c5 writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.B(fieldNumber, value);
        }
    }

    public static void X(int fieldNumber, List<Double> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.v(fieldNumber, value, packed);
    }

    public static void Y(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.K(fieldNumber, value);
        }
    }

    public static void Z(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.A(fieldNumber, value, packed);
    }

    static int a(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? b0.X0(fieldNumber) + b0.D0(size) : size * b0.a0(fieldNumber, true);
    }

    public static void a0(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.c(fieldNumber, value);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.i(fieldNumber, value, packed);
        }
    }

    static int c(int fieldNumber, List<u> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = size * b0.X0(fieldNumber);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iX0 += b0.h0(list.get(i10));
        }
        return iX0;
    }

    public static void c0(int fieldNumber, long value, c5 writer) throws IOException {
        if (value != 0) {
            writer.n(fieldNumber, value);
        }
    }

    static int d(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iE) : iE + (size * b0.X0(fieldNumber));
    }

    public static void d0(int fieldNumber, List<Long> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.s(fieldNumber, value, packed);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r1)) {
            int iL0 = 0;
            while (i10 < size) {
                iL0 += b0.l0(list.get(i10).intValue());
                i10++;
            }
            return iL0;
        }
        r1 r1Var = (r1) list;
        int iL1 = 0;
        while (i10 < size) {
            iL1 += b0.l0(r1Var.getInt(i10));
            i10++;
        }
        return iL1;
    }

    public static void e0(int fieldNumber, float value, c5 writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.J(fieldNumber, value);
        }
    }

    static int f(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? b0.X0(fieldNumber) + b0.D0(size * 4) : size * b0.m0(fieldNumber, 0);
    }

    public static void f0(int fieldNumber, List<Float> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.a(fieldNumber, value, packed);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int fieldNumber, List<?> value, c5 writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.d(fieldNumber, value);
    }

    static int h(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? b0.X0(fieldNumber) + b0.D0(size * 8) : size * b0.o0(fieldNumber, 0L);
    }

    public static void h0(int fieldNumber, List<?> value, c5 writer, r3 schema) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.Q(fieldNumber, value, schema);
        }
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.h(fieldNumber, value);
        }
    }

    static int j(int fieldNumber, List<q2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS0 += b0.s0(fieldNumber, list.get(i10));
        }
        return iS0;
    }

    public static void j0(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.g(fieldNumber, value, packed);
    }

    static int k(int fieldNumber, List<q2> list, r3 schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT0 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iT0 += b0.t0(fieldNumber, list.get(i10), schema);
        }
        return iT0;
    }

    public static void k0(int fieldNumber, long value, c5 writer) throws IOException {
        if (value != 0) {
            writer.F(fieldNumber, value);
        }
    }

    static int l(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = m(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iM) : iM + (size * b0.X0(fieldNumber));
    }

    public static void l0(int fieldNumber, List<Long> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.L(fieldNumber, value, packed);
    }

    static int m(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r1)) {
            int iX0 = 0;
            while (i10 < size) {
                iX0 += b0.x0(list.get(i10).intValue());
                i10++;
            }
            return iX0;
        }
        r1 r1Var = (r1) list;
        int iX1 = 0;
        while (i10 < size) {
            iX1 += b0.x0(r1Var.getInt(i10));
            i10++;
        }
        return iX1;
    }

    public static void m0(int fieldNumber, List<?> value, c5 writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((z1) it.next()).o(writer, fieldNumber);
        }
    }

    static int n(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int iO = o(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iO) : iO + (list.size() * b0.X0(fieldNumber));
    }

    public static void n0(int fieldNumber, Object value, c5 writer) throws IOException {
        if (value != null) {
            writer.E(fieldNumber, value);
        }
    }

    static int o(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2)) {
            int iZ0 = 0;
            while (i10 < size) {
                iZ0 += b0.z0(list.get(i10).longValue());
                i10++;
            }
            return iZ0;
        }
        h2 h2Var = (h2) list;
        int iZ1 = 0;
        while (i10 < size) {
            iZ1 += b0.z0(h2Var.getLong(i10));
            i10++;
        }
        return iZ1;
    }

    public static void o0(int fieldNumber, List<?> value, c5 writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.o(fieldNumber, value);
    }

    static int p(int fieldNumber, Object value, r3 schema) {
        return value instanceof z1 ? b0.B0(fieldNumber, (z1) value) : b0.G0(fieldNumber, (q2) value, schema);
    }

    public static void p0(int fieldNumber, List<?> value, c5 writer, r3 schema) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.S(fieldNumber, value, schema);
        }
    }

    static int q(int fieldNumber, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = b0.X0(fieldNumber) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iX0 += obj instanceof z1 ? b0.C0((z1) obj) : b0.H0((q2) obj);
        }
        return iX0;
    }

    public static void q0(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.q(fieldNumber, value);
        }
    }

    static int r(int fieldNumber, List<?> list, r3 schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX0 = b0.X0(fieldNumber) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iX0 += obj instanceof z1 ? b0.C0((z1) obj) : b0.I0((q2) obj, schema);
        }
        return iX0;
    }

    public static void r0(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.G(fieldNumber, value, packed);
    }

    static int s(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            int i10 = 2 ^ 0;
            return 0;
        }
        int iT = t(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iT) : iT + (size * b0.X0(fieldNumber));
    }

    public static void s0(int fieldNumber, long value, c5 writer) throws IOException {
        if (value != 0) {
            writer.y(fieldNumber, value);
        }
    }

    static int t(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r1)) {
            int iS0 = 0;
            while (i10 < size) {
                iS0 += b0.S0(list.get(i10).intValue());
                i10++;
            }
            return iS0;
        }
        r1 r1Var = (r1) list;
        int iS1 = 0;
        while (i10 < size) {
            iS1 += b0.S0(r1Var.getInt(i10));
            i10++;
        }
        return iS1;
    }

    public static void t0(int fieldNumber, List<Long> value, c5 writer, boolean packed) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.C(fieldNumber, value, packed);
        }
    }

    static int u(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = v(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iV) : iV + (size * b0.X0(fieldNumber));
    }

    public static void u0(int fieldNumber, int value, c5 writer) throws IOException {
        if (value != 0) {
            writer.M(fieldNumber, value);
        }
    }

    static int v(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h2)) {
            int iU0 = 0;
            while (i10 < size) {
                iU0 += b0.U0(list.get(i10).longValue());
                i10++;
            }
            return iU0;
        }
        h2 h2Var = (h2) list;
        int iU1 = 0;
        while (i10 < size) {
            iU1 += b0.U0(h2Var.getLong(i10));
            i10++;
        }
        return iU1;
    }

    public static void v0(int fieldNumber, List<Integer> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.u(fieldNumber, value, packed);
    }

    static int w(int fieldNumber, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iX0 = b0.X0(fieldNumber) * size;
        if (!(list instanceof b2)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iX0 += obj instanceof u ? b0.h0((u) obj) : b0.W0((String) obj);
                i10++;
            }
            return iX0;
        }
        b2 b2Var = (b2) list;
        while (i10 < size) {
            Object objJ1 = b2Var.J1(i10);
            iX0 += objJ1 instanceof u ? b0.h0((u) objJ1) : b0.W0((String) objJ1);
            i10++;
        }
        return iX0;
    }

    public static void w0(int fieldNumber, long value, c5 writer) throws IOException {
        if (value != 0) {
            writer.k(fieldNumber, value);
        }
    }

    static int x(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iY) : iY + (size * b0.X0(fieldNumber));
    }

    public static void x0(int fieldNumber, List<Long> value, c5 writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.z(fieldNumber, value, packed);
    }

    static int y(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r1)) {
            int iZ0 = 0;
            while (i10 < size) {
                iZ0 += b0.Z0(list.get(i10).intValue());
                i10++;
            }
            return iZ0;
        }
        r1 r1Var = (r1) list;
        int iZ1 = 0;
        while (i10 < size) {
            iZ1 += b0.Z0(r1Var.getInt(i10));
            i10++;
        }
        return iZ1;
    }

    public static void y0(int fieldNumber, Object value, c5 writer) throws IOException {
        if (value instanceof String) {
            z0(fieldNumber, (String) value, writer);
        } else {
            U(fieldNumber, (u) value, writer);
        }
    }

    static int z(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = A(list);
        return packed ? b0.X0(fieldNumber) + b0.D0(iA) : iA + (size * b0.X0(fieldNumber));
    }

    private static void z0(int fieldNumber, String value, c5 writer) throws IOException {
        if (value != null && !value.isEmpty()) {
            writer.e(fieldNumber, value);
        }
    }
}
