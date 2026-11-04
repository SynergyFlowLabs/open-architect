package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class f1<T extends c<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f1<?> f50310d = new f1<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u3<T, Object> f50311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50313c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50315b;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50315b = iArr;
            try {
                iArr[a5.b.f49967c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50315b[a5.b.f49968d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50315b[a5.b.f49969e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50315b[a5.b.f49970f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50315b[a5.b.f49971g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50315b[a5.b.f49972h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50315b[a5.b.f49973i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50315b[a5.b.f49974j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50315b[a5.b.f49976l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50315b[a5.b.f49977m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50315b[a5.b.f49975k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50315b[a5.b.f49978n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50315b[a5.b.f49979o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50315b[a5.b.f49981t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f50315b[a5.b.f49982v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f50315b[a5.b.f49983w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f50315b[a5.b.X.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f50315b[a5.b.f49980s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[a5.c.values().length];
            f50314a = iArr2;
            try {
                iArr2[a5.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f50314a[a5.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f50314a[a5.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f50314a[a5.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f50314a[a5.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f50314a[a5.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f50314a[a5.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f50314a[a5.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f50314a[a5.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static final class b<T extends c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u3<T, Object> f50316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f50318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f50319d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private f1<T> c(boolean partial) {
            if (this.f50316a.isEmpty()) {
                return f1.s();
            }
            this.f50318c = false;
            u3<T, Object> u3VarL = this.f50316a;
            if (this.f50319d) {
                u3VarL = f1.l(u3VarL, false, false);
                t(u3VarL, partial);
            }
            f1<T> f1Var = new f1<>(u3VarL, null);
            ((f1) f1Var).f50313c = this.f50317b;
            return f1Var;
        }

        private void f() {
            if (!this.f50318c) {
                this.f50316a = f1.l(this.f50316a, true, false);
                this.f50318c = true;
            }
        }

        public static <T extends c<T>> b<T> g(f1<T> fieldSet) {
            b<T> bVar = new b<>(f1.l(((f1) fieldSet).f50311a, true, false));
            ((b) bVar).f50317b = ((f1) fieldSet).f50313c;
            return bVar;
        }

        private void q(final Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            boolean z10 = value instanceof y1;
            if (key.F()) {
                if (z10) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                List arrayList = (List) j(key);
                List list = (List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(size);
                    this.f50316a.put(key, arrayList);
                }
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(f1.n(list.get(i10)));
                }
            } else {
                if (key.B() != a5.c.MESSAGE) {
                    if (z10) {
                        throw new IllegalStateException("Lazy fields must be message-valued");
                    }
                    this.f50316a.put(key, f1.n(value));
                    return;
                }
                Object objJ = j(key);
                if (objJ != null) {
                    if (z10) {
                        value = ((y1) value).p();
                    }
                    if (objJ instanceof q2.a) {
                        key.b0((q2.a) objJ, (q2) value);
                        return;
                    } else {
                        this.f50316a.put(key, key.b0(((q2) objJ).r1(), (q2) value).build());
                        return;
                    }
                }
                this.f50316a.put(key, f1.n(value));
                if (z10) {
                    this.f50317b = true;
                }
            }
        }

        private static Object r(Object value, boolean partial) {
            if (!(value instanceof q2.a)) {
                return value;
            }
            q2.a aVar = (q2.a) value;
            return partial ? aVar.B1() : aVar.build();
        }

        private static <T extends c<T>> Object s(T descriptor, Object value, boolean partial) {
            if (value == null || descriptor.B() != a5.c.MESSAGE) {
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

        private static <T extends c<T>> void t(u3<T, Object> fieldMap, boolean partial) {
            int iK = fieldMap.k();
            for (int i10 = 0; i10 < iK; i10++) {
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
            if (descriptor.u().k() != a5.c.MESSAGE || !(value instanceof q2.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.i()), descriptor.u().k(), value.getClass().getName()));
            }
        }

        public void a(final T descriptor, final Object value) {
            List arrayList;
            f();
            if (!descriptor.F()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f50319d = this.f50319d || (value instanceof q2.a);
            x(descriptor, value);
            Object objJ = j(descriptor);
            if (objJ == null) {
                arrayList = new ArrayList();
                this.f50316a.put(descriptor, arrayList);
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
            this.f50316a.remove(descriptor);
            if (this.f50316a.isEmpty()) {
                this.f50317b = false;
            }
        }

        public Map<T, Object> h() {
            if (!this.f50317b) {
                boolean zO = this.f50316a.o();
                u3<T, Object> u3Var = this.f50316a;
                return zO ? u3Var : Collections.unmodifiableMap(u3Var);
            }
            u3 u3VarL = f1.l(this.f50316a, false, true);
            if (this.f50316a.o()) {
                u3VarL.p();
                return u3VarL;
            }
            t(u3VarL, true);
            return u3VarL;
        }

        public Object i(final T descriptor) {
            return s(descriptor, j(descriptor), true);
        }

        Object j(final T descriptor) {
            Object obj = this.f50316a.get(descriptor);
            return obj instanceof y1 ? ((y1) obj).p() : obj;
        }

        public Object k(final T descriptor, final int index) {
            if (this.f50319d) {
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
            return this.f50316a.get(descriptor) != null;
        }

        public boolean o() {
            int iK = this.f50316a.k();
            for (int i10 = 0; i10 < iK; i10++) {
                if (!f1.F(this.f50316a.j(i10))) {
                    return false;
                }
            }
            Iterator it = this.f50316a.m().iterator();
            while (it.hasNext()) {
                if (!f1.F((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void p(final f1<T> other) {
            f();
            int iK = ((f1) other).f50311a.k();
            for (int i10 = 0; i10 < iK; i10++) {
                q(((f1) other).f50311a.j(i10));
            }
            Iterator it = ((f1) other).f50311a.m().iterator();
            while (it.hasNext()) {
                q((Map.Entry) it.next());
            }
        }

        public void v(T t10, Object obj) {
            f();
            boolean z10 = !false;
            if (!t10.F()) {
                x(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = arrayList.get(i10);
                    x(t10, obj2);
                    this.f50319d = this.f50319d || (obj2 instanceof q2.a);
                }
                obj = arrayList;
            }
            if (obj instanceof y1) {
                this.f50317b = true;
            }
            this.f50319d = this.f50319d || (obj instanceof q2.a);
            this.f50316a.put(t10, obj);
        }

        public void w(final T descriptor, final int index, final Object value) {
            f();
            if (!descriptor.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f50319d = this.f50319d || (value instanceof q2.a);
            Object objJ = j(descriptor);
            if (objJ == null) {
                throw new IndexOutOfBoundsException();
            }
            x(descriptor, value);
            ((List) objJ).set(index, value);
        }

        private b() {
            this(u3.q());
        }

        private b(u3<T, Object> fields) {
            this.f50316a = fields;
            this.f50318c = true;
        }
    }

    public interface c<T extends c<T>> extends Comparable<T> {
        s1.d<?> A();

        a5.c B();

        boolean F();

        boolean K();

        q2.a b0(q2.a to, q2 from);

        int i();

        a5.b u();
    }

    /* synthetic */ f1(u3 u3Var, a aVar) {
        this(u3Var);
    }

    static int A(final a5.b type, boolean isPacked) {
        if (isPacked) {
            return 2;
        }
        return type.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean F(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.B() == a5.c.MESSAGE) {
            if (!key.F()) {
                return G(entry.getValue());
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!G(list.get(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean G(Object value) {
        if (value instanceof r2) {
            return ((r2) value).Z();
        }
        if (value instanceof y1) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(final a5.b type, final Object value) {
        s1.d(value);
        switch (a.f50314a[type.k().ordinal()]) {
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
                if (!(value instanceof u) && !(value instanceof byte[])) {
                    return false;
                }
                return true;
            case 8:
                return (value instanceof Integer) || (value instanceof s1.c);
            case 9:
                return (value instanceof q2) || (value instanceof y1);
            default:
                return false;
        }
    }

    private void L(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof y1;
        if (key.F()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objU = u(key);
            if (objU == null) {
                objU = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objU).add(n(it.next()));
            }
            this.f50311a.put(key, objU);
            return;
        }
        if (key.B() != a5.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f50311a.put(key, n(value));
            return;
        }
        Object objU2 = u(key);
        if (objU2 == null) {
            this.f50311a.put(key, n(value));
            if (z10) {
                this.f50313c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((y1) value).p();
        }
        this.f50311a.put(key, key.b0(((q2) objU2).r1(), (q2) value).build());
    }

    public static <T extends c<T>> b<T> M() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> f1<T> N() {
        return new f1<>();
    }

    public static Object O(z input, final a5.b type, boolean checkUtf8) throws IOException {
        return checkUtf8 ? a5.d(input, type, a5.d.f49998b) : a5.d(input, type, a5.d.f49997a);
    }

    private void R(final T descriptor, final Object value) {
        if (!H(descriptor.u(), value)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(descriptor.i()), descriptor.u().k(), value.getClass().getName()));
        }
    }

    static void S(final b0 output, final a5.b type, final int number, final Object value) throws IOException {
        if (type == a5.b.f49976l) {
            output.F1(number, (q2) value);
        } else {
            output.g2(number, A(type, false));
            T(output, type, value);
        }
    }

    static void T(final b0 output, final a5.b type, final Object value) throws IOException {
        switch (a.f50315b[type.ordinal()]) {
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
                output.H1((q2) value);
                break;
            case 10:
                output.N1((q2) value);
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
        a5.b bVarU = descriptor.u();
        int i10 = descriptor.i();
        if (!descriptor.F()) {
            if (value instanceof y1) {
                S(output, bVarU, i10, ((y1) value).p());
                return;
            } else {
                S(output, bVarU, i10, value);
                return;
            }
        }
        List list = (List) value;
        int size = list.size();
        int i11 = 0;
        if (!descriptor.K()) {
            while (i11 < size) {
                S(output, bVarU, i10, list.get(i11));
                i11++;
            }
        } else if (!list.isEmpty()) {
            output.g2(i10, 2);
            int iP = 0;
            for (int i12 = 0; i12 < size; i12++) {
                iP += p(bVarU, list.get(i12));
            }
            output.h2(iP);
            while (i11 < size) {
                T(output, bVarU, list.get(i11));
                i11++;
            }
        }
    }

    private void W(final Map.Entry<T, Object> entry, final b0 output) throws IOException {
        T key = entry.getKey();
        if (key.B() != a5.c.MESSAGE || key.F() || key.K()) {
            U(key, entry.getValue(), output);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof y1)) {
            output.P1(entry.getKey().i(), (q2) value);
        } else {
            output.Y1(entry.getKey().i(), ((y1) value).n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> u3<T, Object> l(u3<T, Object> fields, boolean copyList, boolean resolveLazyFields) {
        u3<T, Object> u3VarQ = u3.q();
        int iK = fields.k();
        for (int i10 = 0; i10 < iK; i10++) {
            m(u3VarQ, fields.j(i10), copyList, resolveLazyFields);
        }
        Iterator it = fields.m().iterator();
        while (it.hasNext()) {
            m(u3VarQ, (Map.Entry) it.next(), copyList, resolveLazyFields);
        }
        return u3VarQ;
    }

    private static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean copyList, boolean resolveLazyFields) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (resolveLazyFields && (value instanceof y1)) {
            map.put(key, ((y1) value).p());
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

    static int o(final a5.b type, final int number, final Object value) {
        int iX0 = b0.X0(number);
        if (type == a5.b.f49976l) {
            iX0 *= 2;
        }
        return iX0 + p(type, value);
    }

    static int p(final a5.b type, final Object value) {
        switch (a.f50315b[type.ordinal()]) {
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
                return b0.u0((q2) value);
            case 10:
                return value instanceof y1 ? b0.C0((y1) value) : b0.H0((q2) value);
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
        a5.b bVarU = descriptor.u();
        int i10 = descriptor.i();
        if (!descriptor.F()) {
            return o(bVarU, i10, value);
        }
        List list = (List) value;
        int size = list.size();
        int i11 = 0;
        if (!descriptor.K()) {
            int iO = 0;
            while (i11 < size) {
                iO += o(bVarU, i10, list.get(i11));
                i11++;
            }
            return iO;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iP = 0;
        while (i11 < size) {
            iP += p(bVarU, list.get(i11));
            i11++;
        }
        return b0.X0(i10) + iP + b0.Z0(iP);
    }

    public static <T extends c<T>> f1<T> s() {
        return (f1<T>) f50310d;
    }

    private int w(final Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.B() != a5.c.MESSAGE || key.F() || key.K()) {
            return q(key, value);
        }
        return value instanceof y1 ? b0.A0(entry.getKey().i(), (y1) value) : b0.E0(entry.getKey().i(), (q2) value);
    }

    public boolean B(final T descriptor) {
        if (descriptor.F()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f50311a.get(descriptor) != null;
    }

    boolean C() {
        return this.f50311a.isEmpty();
    }

    public boolean D() {
        return this.f50312b;
    }

    public boolean E() {
        int iK = this.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            if (!F(this.f50311a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f50311a.m().iterator();
        while (it.hasNext()) {
            if (!F((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> I() {
        if (C()) {
            return Collections.emptyIterator();
        }
        return this.f50313c ? new y1.c(this.f50311a.entrySet().iterator()) : this.f50311a.entrySet().iterator();
    }

    public void J() {
        if (this.f50312b) {
            return;
        }
        int iK = this.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry<K, Object> entryJ = this.f50311a.j(i10);
            if (entryJ.getValue() instanceof l1) {
                ((l1) entryJ.getValue()).E4();
            }
        }
        this.f50311a.p();
        this.f50312b = true;
    }

    public void K(final f1<T> other) {
        int iK = other.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            L(other.f50311a.j(i10));
        }
        Iterator it = other.f50311a.m().iterator();
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
        if (obj instanceof y1) {
            this.f50313c = true;
        }
        this.f50311a.put(t10, obj);
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
        int iK = this.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            W(this.f50311a.j(i10), output);
        }
        Iterator it = this.f50311a.m().iterator();
        while (it.hasNext()) {
            W((Map.Entry) it.next(), output);
        }
    }

    public void X(final b0 output) throws IOException {
        int iK = this.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry<K, Object> entryJ = this.f50311a.j(i10);
            U((c) entryJ.getKey(), entryJ.getValue(), output);
        }
        Iterator it = this.f50311a.m().iterator();
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
            return this.f50311a.equals(((f1) o10).f50311a);
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
            this.f50311a.put(descriptor, arrayList);
        } else {
            arrayList = (List) objU;
        }
        arrayList.add(value);
    }

    public int hashCode() {
        return this.f50311a.hashCode();
    }

    public void i() {
        this.f50311a.clear();
        this.f50313c = false;
    }

    public void j(final T descriptor) {
        this.f50311a.remove(descriptor);
        if (this.f50311a.isEmpty()) {
            this.f50313c = false;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public f1<T> clone() {
        f1<T> f1VarN = N();
        int iK = this.f50311a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry<K, Object> entryJ = this.f50311a.j(i10);
            f1VarN.P((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f50311a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f1VarN.P((c) entry.getKey(), entry.getValue());
        }
        f1VarN.f50313c = this.f50313c;
        return f1VarN;
    }

    Iterator<Map.Entry<T, Object>> r() {
        if (C()) {
            return Collections.emptyIterator();
        }
        return this.f50313c ? new y1.c(this.f50311a.h().iterator()) : this.f50311a.h().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f50313c) {
            boolean zO = this.f50311a.o();
            u3<T, Object> u3Var = this.f50311a;
            return zO ? u3Var : Collections.unmodifiableMap(u3Var);
        }
        u3 u3VarL = l(this.f50311a, false, true);
        if (this.f50311a.o()) {
            u3VarL.p();
        }
        return u3VarL;
    }

    public Object u(final T descriptor) {
        Object obj = this.f50311a.get(descriptor);
        return obj instanceof y1 ? ((y1) obj).p() : obj;
    }

    public int v() {
        int iK = this.f50311a.k();
        int iW = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iW += w(this.f50311a.j(i10));
        }
        Iterator it = this.f50311a.m().iterator();
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
        int iK = this.f50311a.k();
        int iQ = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry<K, Object> entryJ = this.f50311a.j(i10);
            iQ += q((c) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f50311a.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iQ += q((c) entry.getKey(), entry.getValue());
        }
        return iQ;
    }

    private f1() {
        this.f50311a = u3.q();
    }

    private f1(final boolean dummy) {
        this(u3.q());
        J();
    }

    private f1(u3<T, Object> fields) {
        this.f50311a = fields;
        J();
    }
}
