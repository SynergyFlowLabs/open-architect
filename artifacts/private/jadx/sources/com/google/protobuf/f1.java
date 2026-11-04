package com.google.protobuf;

import com.google.protobuf.f1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class f1<T extends c<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125928d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f1 f125929e = new f1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r3<T, Object> f125930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f125931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f125932c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f125934b;

        static {
            int[] iArr = new int[x4.b.values().length];
            f125934b = iArr;
            try {
                iArr[x4.b.f126482c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125934b[x4.b.f126483d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125934b[x4.b.f126484e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125934b[x4.b.f126485f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125934b[x4.b.f126486g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125934b[x4.b.f126487h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125934b[x4.b.f126488i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f125934b[x4.b.f126489j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f125934b[x4.b.f126491l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f125934b[x4.b.f126492m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f125934b[x4.b.f126490k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f125934b[x4.b.f126493n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f125934b[x4.b.f126494o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f125934b[x4.b.f126496t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f125934b[x4.b.f126497v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f125934b[x4.b.f126498w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f125934b[x4.b.X.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f125934b[x4.b.f126495s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[x4.c.values().length];
            f125933a = iArr2;
            try {
                iArr2[x4.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f125933a[x4.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f125933a[x4.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f125933a[x4.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f125933a[x4.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f125933a[x4.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f125933a[x4.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f125933a[x4.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f125933a[x4.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r3<T, Object> f125935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f125936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f125937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f125938d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private f1<T> c(boolean partial) {
            if (this.f125935a.isEmpty()) {
                return f1.s();
            }
            this.f125937c = false;
            r3<T, Object> r3VarL = this.f125935a;
            if (this.f125938d) {
                r3VarL = f1.l(r3VarL, false);
                t(r3VarL, partial);
            }
            f1<T> f1Var = new f1<>(r3VarL, null);
            ((f1) f1Var).f125932c = this.f125936b;
            return f1Var;
        }

        private void f() {
            if (this.f125937c) {
                return;
            }
            this.f125935a = f1.l(this.f125935a, true);
            this.f125937c = true;
        }

        public static <T extends c<T>> b<T> g(f1<T> fieldSet) {
            b<T> bVar = new b<>(f1.l(((f1) fieldSet).f125930a, true));
            ((b) bVar).f125936b = ((f1) fieldSet).f125932c;
            return bVar;
        }

        private void q(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof x1) {
                value = ((x1) value).p();
            }
            if (key.F()) {
                List arrayList = (List) j(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f125935a.put(key, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(f1.n(it.next()));
                }
                return;
            }
            if (key.B() != x4.c.MESSAGE) {
                this.f125935a.put(key, f1.n(value));
                return;
            }
            Object objJ = j(key);
            if (objJ == null) {
                this.f125935a.put(key, f1.n(value));
            } else if (objJ instanceof n2.a) {
                key.P((n2.a) objJ, (n2) value);
            } else {
                this.f125935a.put(key, key.P(((n2) objJ).r1(), (n2) value).build());
            }
        }

        private static Object r(Object value, boolean partial) {
            if (!(value instanceof n2.a)) {
                return value;
            }
            n2.a aVar = (n2.a) value;
            return partial ? aVar.B1() : aVar.build();
        }

        private static <T extends c<T>> Object s(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.B() != x4.c.MESSAGE) {
                return value;
            }
            if (!descriptor.F()) {
                return r(value, partial);
            }
            if (!(value instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + value.getClass());
            }
            List arrayList = (List) value;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                Object objR = r(obj, partial);
                if (objR != obj) {
                    if (arrayList == value) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objR);
                }
            }
            return arrayList;
        }

        private static <T extends c<T>> void t(r3<T, Object> fieldMap, boolean partial) {
            for (int i10 = 0; i10 < fieldMap.k(); i10++) {
                u(fieldMap.j(i10), partial);
            }
            Iterator it = fieldMap.m().iterator();
            while (it.hasNext()) {
                u((Map.Entry) it.next(), partial);
            }
        }

        private static <T extends c<T>> void u(Map.Entry<T, Object> entry, boolean partial) {
            entry.setValue(s(entry.getKey(), entry.getValue(), partial));
        }

        private void x(final T descriptor, final Object value) {
            if (f1.H(descriptor.u(), value)) {
                return;
            }
            if (descriptor.u().k() != x4.c.MESSAGE || !(value instanceof n2.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.i()), descriptor.u().k(), value.getClass().getName()));
            }
        }

        public void a(final T descriptor, final Object value) {
            List arrayList;
            f();
            if (!descriptor.F()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f125938d = this.f125938d || (value instanceof n2.a);
            x(descriptor, value);
            Object objJ = j(descriptor);
            if (objJ == null) {
                arrayList = new ArrayList();
                this.f125935a.put(descriptor, arrayList);
            } else {
                arrayList = (List) objJ;
            }
            arrayList.add(value);
        }

        public f1<T> b() {
            return c(false);
        }

        public f1<T> d() {
            return c(true);
        }

        public void e(final T descriptor) {
            f();
            this.f125935a.remove(descriptor);
            if (this.f125935a.isEmpty()) {
                int i10 = 5 | 0;
                this.f125936b = false;
            }
        }

        public Map<T, Object> h() {
            if (!this.f125936b) {
                boolean zP = this.f125935a.p();
                r3<T, Object> r3Var = this.f125935a;
                return zP ? r3Var : Collections.unmodifiableMap(r3Var);
            }
            r3 r3VarL = f1.l(this.f125935a, false);
            if (this.f125935a.p()) {
                r3VarL.q();
                return r3VarL;
            }
            t(r3VarL, true);
            return r3VarL;
        }

        public Object i(final T descriptor) {
            return s(descriptor, j(descriptor), true);
        }

        Object j(final T descriptor) {
            Object objP = this.f125935a.get(descriptor);
            if (objP instanceof x1) {
                objP = ((x1) objP).p();
            }
            return objP;
        }

        public Object k(final T descriptor, final int index) {
            if (this.f125938d) {
                f();
            }
            return r(l(descriptor, index), true);
        }

        Object l(final T descriptor, final int index) {
            if (!descriptor.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objJ = j(descriptor);
            if (objJ != null) {
                return ((List) objJ).get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public int m(final T descriptor) {
            if (!descriptor.F()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objJ = j(descriptor);
            if (objJ == null) {
                return 0;
            }
            return ((List) objJ).size();
        }

        public boolean n(final T descriptor) {
            if (descriptor.F()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f125935a.get(descriptor) != null;
        }

        public boolean o() {
            for (int i10 = 0; i10 < this.f125935a.k(); i10++) {
                if (!f1.F(this.f125935a.j(i10))) {
                    return false;
                }
            }
            Iterator it = this.f125935a.m().iterator();
            while (it.hasNext()) {
                if (!f1.F((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void p(final f1<T> other) {
            f();
            for (int i10 = 0; i10 < ((f1) other).f125930a.k(); i10++) {
                q(((f1) other).f125930a.j(i10));
            }
            Iterator it = ((f1) other).f125930a.m().iterator();
            while (it.hasNext()) {
                q((Map.Entry) it.next());
            }
        }

        public void v(T t10, Object obj) {
            f();
            if (!t10.F()) {
                x(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    x(t10, obj2);
                    this.f125938d = this.f125938d || (obj2 instanceof n2.a);
                }
                obj = arrayList;
            }
            if (obj instanceof x1) {
                this.f125936b = true;
            }
            this.f125938d = this.f125938d || (obj instanceof n2.a);
            this.f125935a.put(t10, obj);
        }

        public void w(final T descriptor, final int index, final Object value) {
            f();
            if (!descriptor.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f125938d = this.f125938d || (value instanceof n2.a);
            Object objJ = j(descriptor);
            if (objJ == null) {
                throw new IndexOutOfBoundsException();
            }
            x(descriptor, value);
            ((List) objJ).set(index, value);
        }

        private b() {
            this(r3.s(16));
        }

        private b(r3<T, Object> fields) {
            this.f125935a = fields;
            this.f125937c = true;
        }
    }

    public interface c<T extends c<T>> extends Comparable<T> {
        s1.d<?> A();

        x4.c B();

        boolean F();

        boolean K();

        n2.a P(n2.a to, n2 from);

        int i();

        x4.b u();
    }

    /* synthetic */ f1(r3 r3Var, a aVar) {
        this(r3Var);
    }

    static int A(final x4.b type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean F(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.B() != x4.c.MESSAGE) {
            return true;
        }
        if (!key.F()) {
            return G(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!G(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(Object value) {
        if (value instanceof o2) {
            return ((o2) value).Z();
        }
        if (value instanceof x1) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(final x4.b type, final Object value) {
        s1.d(value);
        switch (a.f125933a[type.k().ordinal()]) {
            case 1:
                return value instanceof Integer;
            case 2:
                return value instanceof Long;
            case 3:
                return value instanceof Float;
            case 4:
                return value instanceof Double;
            case 5:
                return value instanceof Boolean;
            case 6:
                return value instanceof String;
            case 7:
                return (value instanceof u) || (value instanceof byte[]);
            case 8:
                return (value instanceof Integer) || (value instanceof s1.c);
            case 9:
                if (!(value instanceof n2) && !(value instanceof x1)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    private void L(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof x1) {
            value = ((x1) value).p();
        }
        if (key.F()) {
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objU).add(n(it.next()));
            }
            this.f125930a.put(key, objU);
            return;
        }
        if (key.B() != x4.c.MESSAGE) {
            this.f125930a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.f125930a.put(key, n(value));
        } else {
            this.f125930a.put(key, key.P(((n2) objU2).r1(), (n2) value).build());
        }
    }

    public static <T extends c<T>> b<T> M() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> f1<T> N() {
        return new f1<>();
    }

    public static Object O(z input, final x4.b type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? x4.d(input, type, x4.d.f126513b) : x4.d(input, type, x4.d.f126512a);
    }

    private void R(final T descriptor, final Object value) {
        if (!H(descriptor.u(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.i()), descriptor.u().k(), value.getClass().getName()));
        }
    }

    static void S(final b0 output, final x4.b type, final int number, final Object value) throws IOException {
        if (type == x4.b.f126491l) {
            output.F1(number, (n2) value);
        } else {
            output.g2(number, A(type, false));
            T(output, type, value);
        }
    }

    static void T(final b0 output, final x4.b type, final Object value) throws IOException {
        switch (a.f125934b[type.ordinal()]) {
            case 1:
                output.A1(((Double) value).doubleValue());
                break;
            case 2:
                output.E1(((Float) value).floatValue());
                break;
            case 3:
                output.K1(((Long) value).longValue());
                break;
            case 4:
                output.i2(((Long) value).longValue());
                break;
            case 5:
                output.J1(((Integer) value).intValue());
                break;
            case 6:
                output.D1(((Long) value).longValue());
                break;
            case 7:
                output.C1(((Integer) value).intValue());
                break;
            case 8:
                output.t1(((Boolean) value).booleanValue());
                break;
            case 9:
                output.H1((n2) value);
                break;
            case 10:
                output.N1((n2) value);
                break;
            case 11:
                if (!(value instanceof u)) {
                    output.f2((String) value);
                } else {
                    output.z1((u) value);
                }
                break;
            case 12:
                if (!(value instanceof u)) {
                    output.w1((byte[]) value);
                } else {
                    output.z1((u) value);
                }
                break;
            case 13:
                output.h2(((Integer) value).intValue());
                break;
            case 14:
                output.b2(((Integer) value).intValue());
                break;
            case 15:
                output.c2(((Long) value).longValue());
                break;
            case 16:
                output.d2(((Integer) value).intValue());
                break;
            case 17:
                output.e2(((Long) value).longValue());
                break;
            case 18:
                if (!(value instanceof s1.c)) {
                    output.B1(((Integer) value).intValue());
                } else {
                    output.B1(((s1.c) value).i());
                }
                break;
        }
    }

    public static void U(final c<?> descriptor, final Object value, final b0 output) throws IOException {
        x4.b bVarU = descriptor.u();
        int i10 = descriptor.i();
        if (!descriptor.F()) {
            if (value instanceof x1) {
                S(output, bVarU, i10, ((x1) value).p());
                return;
            } else {
                S(output, bVarU, i10, value);
                return;
            }
        }
        List list = (List) value;
        if (!descriptor.K()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                S(output, bVarU, i10, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            output.g2(i10, 2);
            Iterator it2 = list.iterator();
            int iP = 0;
            while (it2.hasNext()) {
                iP += p(bVarU, it2.next());
            }
            output.h2(iP);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                T(output, bVarU, it3.next());
            }
        }
    }

    private void W(final Map.Entry<T, Object> entry, final b0 output) throws IOException {
        T key = entry.getKey();
        if (key.B() != x4.c.MESSAGE || key.F() || key.K()) {
            U(key, entry.getValue(), output);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof x1)) {
            output.P1(entry.getKey().i(), (n2) value);
        } else {
            output.Y1(entry.getKey().i(), ((x1) value).n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> r3<T, Object> l(r3<T, Object> fields, boolean copyList) {
        r3<T, Object> r3VarS = r3.s(16);
        for (int i10 = 0; i10 < fields.k(); i10++) {
            m(r3VarS, fields.j(i10), copyList);
        }
        Iterator it = fields.m().iterator();
        while (it.hasNext()) {
            m(r3VarS, (Map.Entry) it.next(), copyList);
        }
        return r3VarS;
    }

    private static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof x1) {
            map.put(key, ((x1) value).p());
        } else if (copyList && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n(Object value) {
        if (!(value instanceof byte[])) {
            return value;
        }
        byte[] bArr = (byte[]) value;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int o(final x4.b type, final int number, final Object value) {
        int iX0 = b0.X0(number);
        if (type == x4.b.f126491l) {
            iX0 *= 2;
        }
        return iX0 + p(type, value);
    }

    static int p(final x4.b type, final Object value) {
        switch (a.f125934b[type.ordinal()]) {
            case 1:
                return b0.j0(((Double) value).doubleValue());
            case 2:
                return b0.r0(((Float) value).floatValue());
            case 3:
                return b0.z0(((Long) value).longValue());
            case 4:
                return b0.b1(((Long) value).longValue());
            case 5:
                return b0.x0(((Integer) value).intValue());
            case 6:
                return b0.p0(((Long) value).longValue());
            case 7:
                return b0.n0(((Integer) value).intValue());
            case 8:
                return b0.b0(((Boolean) value).booleanValue());
            case 9:
                return b0.u0((n2) value);
            case 10:
                return value instanceof x1 ? b0.C0((x1) value) : b0.H0((n2) value);
            case 11:
                return value instanceof u ? b0.h0((u) value) : b0.W0((String) value);
            case 12:
                return value instanceof u ? b0.h0((u) value) : b0.d0((byte[]) value);
            case 13:
                return b0.Z0(((Integer) value).intValue());
            case 14:
                return b0.O0(((Integer) value).intValue());
            case 15:
                return b0.Q0(((Long) value).longValue());
            case 16:
                return b0.S0(((Integer) value).intValue());
            case 17:
                return b0.U0(((Long) value).longValue());
            case 18:
                return value instanceof s1.c ? b0.l0(((s1.c) value).i()) : b0.l0(((Integer) value).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(final c<?> descriptor, final Object value) {
        x4.b bVarU = descriptor.u();
        int i10 = descriptor.i();
        if (!descriptor.F()) {
            return o(bVarU, i10, value);
        }
        List list = (List) value;
        int iO = 0;
        if (!descriptor.K()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iO += o(bVarU, i10, it.next());
            }
            return iO;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iO += p(bVarU, it2.next());
        }
        return b0.X0(i10) + iO + b0.Z0(iO);
    }

    public static <T extends c<T>> f1<T> s() {
        return f125929e;
    }

    private int w(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.B() != x4.c.MESSAGE || key.F() || key.K()) {
            return q(key, value);
        }
        return value instanceof x1 ? b0.A0(entry.getKey().i(), (x1) value) : b0.E0(entry.getKey().i(), (n2) value);
    }

    public boolean B(final T descriptor) {
        if (descriptor.F()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f125930a.get(descriptor) != null;
    }

    boolean C() {
        return this.f125930a.isEmpty();
    }

    public boolean D() {
        return this.f125931b;
    }

    public boolean E() {
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            if (!F(this.f125930a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            if (!F((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> I() {
        return this.f125932c ? new x1.c(this.f125930a.entrySet().iterator()) : this.f125930a.entrySet().iterator();
    }

    public void J() {
        if (this.f125931b) {
            return;
        }
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f125930a.j(i10);
            if (entryJ.getValue() instanceof l1) {
                ((l1) entryJ.getValue()).ol();
            }
        }
        this.f125930a.q();
        this.f125931b = true;
    }

    public void K(final f1<T> other) {
        for (int i10 = 0; i10 < other.f125930a.k(); i10++) {
            L(other.f125930a.j(i10));
        }
        Iterator it = other.f125930a.m().iterator();
        while (it.hasNext()) {
            L((Map.Entry) it.next());
        }
    }

    public void P(T t10, Object obj) {
        if (!t10.F()) {
            R(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof x1) {
            this.f125932c = true;
        }
        this.f125930a.put(t10, obj);
    }

    public void Q(final T descriptor, final int index, final Object value) {
        if (!descriptor.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU == null) {
            throw new IndexOutOfBoundsException();
        }
        R(descriptor, value);
        ((List) objU).set(index, value);
    }

    public void V(final b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            W(this.f125930a.j(i10), output);
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            W((Map.Entry) it.next(), output);
        }
    }

    public void X(final b0 output) throws IOException {
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f125930a.j(i10);
            U((c) entryJ.getKey(), entryJ.getValue(), output);
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            U((c) entry.getKey(), entry.getValue(), output);
        }
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 instanceof f1) {
            return this.f125930a.equals(((f1) o10).f125930a);
        }
        return false;
    }

    public void h(final T descriptor, final Object value) {
        List arrayList;
        if (!descriptor.F()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        R(descriptor, value);
        Object objU = u(descriptor);
        if (objU == null) {
            arrayList = new ArrayList();
            this.f125930a.put(descriptor, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(value);
    }

    public int hashCode() {
        return this.f125930a.hashCode();
    }

    public void i() {
        this.f125930a.clear();
        this.f125932c = false;
    }

    public void j(final T descriptor) {
        this.f125930a.remove(descriptor);
        if (this.f125930a.isEmpty()) {
            this.f125932c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f1<T> clone() {
        f1<T> f1VarN = N();
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f125930a.j(i10);
            f1VarN.P((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f1VarN.P((c) entry.getKey(), entry.getValue());
        }
        f1VarN.f125932c = this.f125932c;
        return f1VarN;
    }

    Iterator<Map.Entry<T, Object>> r() {
        return this.f125932c ? new x1.c(this.f125930a.h().iterator()) : this.f125930a.h().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f125932c) {
            boolean zP = this.f125930a.p();
            r3<T, Object> r3Var = this.f125930a;
            return zP ? r3Var : Collections.unmodifiableMap(r3Var);
        }
        r3 r3VarL = l(this.f125930a, false);
        if (this.f125930a.p()) {
            r3VarL.q();
        }
        return r3VarL;
    }

    public Object u(final T descriptor) {
        Object obj = this.f125930a.get(descriptor);
        return obj instanceof x1 ? ((x1) obj).p() : obj;
    }

    public int v() {
        int iW = 0;
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            iW += w(this.f125930a.j(i10));
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            iW += w((Map.Entry) it.next());
        }
        return iW;
    }

    public Object x(final T descriptor, final int index) {
        if (!descriptor.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU != null) {
            return ((List) objU).get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(final T descriptor) {
        if (!descriptor.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objU = u(descriptor);
        if (objU == null) {
            return 0;
        }
        return ((List) objU).size();
    }

    public int z() {
        int iQ = 0;
        for (int i10 = 0; i10 < this.f125930a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f125930a.j(i10);
            iQ += q((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f125930a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQ += q((c) entry.getKey(), entry.getValue());
        }
        return iQ;
    }

    private f1() {
        this.f125930a = r3.s(16);
    }

    private f1(final boolean dummy) {
        this(r3.s(0));
        J();
    }

    private f1(r3<T, Object> fields) {
        this.f125930a = fields;
        J();
    }
}
