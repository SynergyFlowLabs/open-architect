package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@y
final class t2<T> implements r3<T> {
    private static final int A = 256;
    private static final int B = 512;
    private static final int C = 1024;
    private static final int D = 2048;
    private static final int E = 4096;
    static final int F = 51;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f50597r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f50598s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f50599t = 1048575;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f50600u = 267386880;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f50601v = 268435456;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f50602w = 536870912;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f50603x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f50604y = 1048575;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f50606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f50607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q2 f50610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f50612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j3 f50613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f50614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f50615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f50616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f50617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a3 f50618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c2 f50619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r4<?, ?> f50620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w0<?> f50621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l2 f50622q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f50605z = new int[0];
    private static final Unsafe G = w4.T();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50623a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50623a = iArr;
            try {
                iArr[a5.b.f49974j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50623a[a5.b.f49978n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50623a[a5.b.f49967c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50623a[a5.b.f49973i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50623a[a5.b.f49981t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50623a[a5.b.f49972h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50623a[a5.b.f49982v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50623a[a5.b.f49968d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50623a[a5.b.f49980s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50623a[a5.b.f49971g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50623a[a5.b.f49979o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50623a[a5.b.f49969e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50623a[a5.b.f49970f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50623a[a5.b.f49977m.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f50623a[a5.b.f49983w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f50623a[a5.b.X.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f50623a[a5.b.f49975k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private t2(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, q2 defaultInstance, j3 syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, a3 newInstanceSchema, c2 listFieldSchema, r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, l2 mapFieldSchema) {
        this.f50606a = buffer;
        this.f50607b = objects;
        this.f50608c = minFieldNumber;
        this.f50609d = maxFieldNumber;
        this.f50612g = defaultInstance instanceof l1;
        this.f50613h = syntax;
        this.f50611f = extensionSchema != null && extensionSchema.e(defaultInstance);
        this.f50614i = useCachedSizeField;
        this.f50615j = intArray;
        this.f50616k = checkInitialized;
        this.f50617l = mapFieldPositions;
        this.f50618m = newInstanceSchema;
        this.f50619n = listFieldSchema;
        this.f50620o = unknownFieldSchema;
        this.f50621p = extensionSchema;
        this.f50610e = defaultInstance;
        this.f50622q = mapFieldSchema;
    }

    private static <T> int A(T message, long offset) {
        return w4.K(message, offset);
    }

    private <K, V> void A0(c5 writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.P(number, this.f50622q.b(v(pos)), this.f50622q.g(mapField));
        }
    }

    private static boolean B(int value) {
        return (value & 536870912) != 0;
    }

    private void B0(int fieldNumber, Object value, c5 writer) throws IOException {
        if (value instanceof String) {
            writer.e(fieldNumber, (String) value);
        } else {
            writer.N(fieldNumber, (u) value);
        }
    }

    private boolean C(T message, int pos) {
        boolean zEquals;
        int iK0 = k0(pos);
        long j10 = 1048575 & iK0;
        if (j10 != 1048575) {
            return ((1 << (iK0 >>> 20)) & w4.K(message, j10)) != 0;
        }
        int iX0 = x0(pos);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return Double.doubleToRawLongBits(w4.F(message, jY)) != 0;
            case 1:
                return Float.floatToRawIntBits(w4.H(message, jY)) != 0;
            case 2:
                return w4.N(message, jY) != 0;
            case 3:
                return w4.N(message, jY) != 0;
            case 4:
                return w4.K(message, jY) != 0;
            case 5:
                return w4.N(message, jY) != 0;
            case 6:
                return w4.K(message, jY) != 0;
            case 7:
                return w4.w(message, jY);
            case 8:
                Object objQ = w4.Q(message, jY);
                if (objQ instanceof String) {
                    zEquals = ((String) objQ).isEmpty();
                } else {
                    if (!(objQ instanceof u)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = u.f50632f.equals(objQ);
                }
                break;
            case 9:
                return w4.Q(message, jY) != null;
            case 10:
                zEquals = u.f50632f.equals(w4.Q(message, jY));
                break;
            case 11:
                return w4.K(message, jY) != 0;
            case 12:
                return w4.K(message, jY) != 0;
            case 13:
                return w4.K(message, jY) != 0;
            case 14:
                return w4.N(message, jY) != 0;
            case 15:
                return w4.K(message, jY) != 0;
            case 16:
                return w4.N(message, jY) != 0;
            case 17:
                return w4.Q(message, jY) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private <UT, UB> void C0(r4<UT, UB> schema, T message, c5 writer) throws IOException {
        schema.u(schema.g(message), writer);
    }

    private boolean D(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        if (presenceFieldOffset == 1048575) {
            return C(message, pos);
        }
        return (presenceField & presenceMask) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object message, int typeAndOffset, r3 schema) {
        return schema.d(w4.Q(message, Y(typeAndOffset)));
    }

    private static boolean F(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object message, int typeAndOffset, int pos) {
        List list = (List) w4.Q(message, Y(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        r3 r3VarW = w(pos);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!r3VarW.d(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.datastore.preferences.protobuf.r3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private boolean H(T t10, int i10, int i11) {
        Map<?, ?> mapG = this.f50622q.g(w4.Q(t10, Y(i10)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.f50622q.b(v(i11)).f50397c.k() != a5.c.MESSAGE) {
            return true;
        }
        ?? I = 0;
        for (Object obj : mapG.values()) {
            if (I == 0) {
                I = I;
                I = k3.a().i(obj.getClass());
            }
            I = I;
            if (!I.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof l1) {
            return ((l1) message).A4();
        }
        return true;
    }

    private boolean J(T message, T other, int pos) {
        long jK0 = k0(pos) & 1048575;
        return w4.K(message, jK0) == w4.K(other, jK0);
    }

    private boolean K(T message, int fieldNumber, int pos) {
        return w4.K(message, (long) (k0(pos) & 1048575)) == fieldNumber;
    }

    private static boolean L(int value) {
        return (value & 268435456) != 0;
    }

    private static <T> long M(T message, long offset) {
        return w4.N(message, offset);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.f1.c<ET>> void N(androidx.datastore.preferences.protobuf.r4<UT, UB> r18, androidx.datastore.preferences.protobuf.w0<ET> r19, T r20, androidx.datastore.preferences.protobuf.o3 r21, androidx.datastore.preferences.protobuf.v0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t2.N(androidx.datastore.preferences.protobuf.r4, androidx.datastore.preferences.protobuf.w0, java.lang.Object, androidx.datastore.preferences.protobuf.o3, androidx.datastore.preferences.protobuf.v0):void");
    }

    private final <K, V> void O(Object message, int pos, Object mapDefaultEntry, v0 extensionRegistry, o3 reader) throws IOException {
        long jY = Y(x0(pos));
        Object objQ = w4.Q(message, jY);
        if (objQ == null) {
            objQ = this.f50622q.f(mapDefaultEntry);
            w4.t0(message, jY, objQ);
        } else if (this.f50622q.h(objQ)) {
            Object objF = this.f50622q.f(mapDefaultEntry);
            this.f50622q.a(objF, objQ);
            w4.t0(message, jY, objF);
            objQ = objF;
        }
        reader.S(this.f50622q.e(objQ), this.f50622q.b(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(T targetParent, T sourceParent, int pos) {
        if (C(sourceParent, pos)) {
            long jY = Y(x0(pos));
            Unsafe unsafe = G;
            Object object = unsafe.getObject(sourceParent, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(pos) + " is present but null: " + sourceParent);
            }
            r3 r3VarW = w(pos);
            if (!C(targetParent, pos)) {
                if (I(object)) {
                    Object objG = r3VarW.g();
                    r3VarW.a(objG, object);
                    unsafe.putObject(targetParent, jY, objG);
                } else {
                    unsafe.putObject(targetParent, jY, object);
                }
                q0(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jY);
            if (!I(object2)) {
                Object objG2 = r3VarW.g();
                r3VarW.a(objG2, object2);
                unsafe.putObject(targetParent, jY, objG2);
                object2 = objG2;
            }
            r3VarW.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T targetParent, T sourceParent, int pos) {
        int iX = X(pos);
        if (K(sourceParent, iX, pos)) {
            long jY = Y(x0(pos));
            Unsafe unsafe = G;
            Object object = unsafe.getObject(sourceParent, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(pos) + " is present but null: " + sourceParent);
            }
            r3 r3VarW = w(pos);
            if (!K(targetParent, iX, pos)) {
                if (I(object)) {
                    Object objG = r3VarW.g();
                    r3VarW.a(objG, object);
                    unsafe.putObject(targetParent, jY, objG);
                } else {
                    unsafe.putObject(targetParent, jY, object);
                }
                r0(targetParent, iX, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, jY);
            if (!I(object2)) {
                Object objG2 = r3VarW.g();
                r3VarW.a(objG2, object2);
                unsafe.putObject(targetParent, jY, objG2);
                object2 = objG2;
            }
            r3VarW.a(object2, object);
        }
    }

    private void R(T message, T other, int pos) {
        int iX0 = x0(pos);
        long jY = Y(iX0);
        int iX = X(pos);
        switch (w0(iX0)) {
            case 0:
                if (C(other, pos)) {
                    w4.j0(message, jY, w4.F(other, jY));
                    q0(message, pos);
                }
                break;
            case 1:
                if (C(other, pos)) {
                    w4.l0(message, jY, w4.H(other, jY));
                    q0(message, pos);
                }
                break;
            case 2:
                if (C(other, pos)) {
                    w4.r0(message, jY, w4.N(other, jY));
                    q0(message, pos);
                }
                break;
            case 3:
                if (C(other, pos)) {
                    w4.r0(message, jY, w4.N(other, jY));
                    q0(message, pos);
                }
                break;
            case 4:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 5:
                if (C(other, pos)) {
                    w4.r0(message, jY, w4.N(other, jY));
                    q0(message, pos);
                }
                break;
            case 6:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 7:
                if (C(other, pos)) {
                    w4.a0(message, jY, w4.w(other, jY));
                    q0(message, pos);
                }
                break;
            case 8:
                if (C(other, pos)) {
                    w4.t0(message, jY, w4.Q(other, jY));
                    q0(message, pos);
                }
                break;
            case 9:
                P(message, other, pos);
                break;
            case 10:
                if (C(other, pos)) {
                    w4.t0(message, jY, w4.Q(other, jY));
                    q0(message, pos);
                }
                break;
            case 11:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 12:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 13:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 14:
                if (C(other, pos)) {
                    w4.r0(message, jY, w4.N(other, jY));
                    q0(message, pos);
                }
                break;
            case 15:
                if (C(other, pos)) {
                    w4.o0(message, jY, w4.K(other, jY));
                    q0(message, pos);
                }
                break;
            case 16:
                if (C(other, pos)) {
                    w4.r0(message, jY, w4.N(other, jY));
                    q0(message, pos);
                }
                break;
            case 17:
                P(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f50619n.a(message, other, jY);
                break;
            case 50:
                t3.I(this.f50622q, message, other, jY);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                if (K(other, iX, pos)) {
                    w4.t0(message, jY, w4.Q(other, jY));
                    r0(message, iX, pos);
                }
                break;
            case 60:
                Q(message, other, pos);
                break;
            case 61:
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (K(other, iX, pos)) {
                    w4.t0(message, jY, w4.Q(other, jY));
                    r0(message, iX, pos);
                }
                break;
            case com.planner5d.library.engine.input.f.b.V /* 68 */:
                Q(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object S(T message, int pos) {
        r3 r3VarW = w(pos);
        long jY = Y(x0(pos));
        if (!C(message, pos)) {
            return r3VarW.g();
        }
        Object object = G.getObject(message, jY);
        if (I(object)) {
            return object;
        }
        Object objG = r3VarW.g();
        if (object != null) {
            r3VarW.a(objG, object);
        }
        return objG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T message, int fieldNumber, int pos) {
        r3 r3VarW = w(pos);
        if (!K(message, fieldNumber, pos)) {
            return r3VarW.g();
        }
        Object object = G.getObject(message, Y(x0(pos)));
        if (I(object)) {
            return object;
        }
        Object objG = r3VarW.g();
        if (object != null) {
            r3VarW.a(objG, object);
        }
        return objG;
    }

    static <T> t2<T> U(Class<T> messageClass, o2 messageInfo, a3 newInstanceSchema, c2 listFieldSchema, r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, l2 mapFieldSchema) {
        return messageInfo instanceof n3 ? W((n3) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : V((d4) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> t2<T> V(d4 messageInfo, a3 newInstanceSchema, c2 listFieldSchema, r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, l2 mapFieldSchema) {
        int iV;
        int iV2;
        a1[] a1VarArrD = messageInfo.d();
        if (a1VarArrD.length == 0) {
            iV = 0;
            iV2 = 0;
        } else {
            iV = a1VarArrD[0].v();
            iV2 = a1VarArrD[a1VarArrD.length - 1].v();
        }
        int length = a1VarArrD.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (a1 a1Var : a1VarArrD) {
            if (a1Var.L() == g1.J3) {
                i10++;
            } else if (a1Var.L().n() >= 18 && a1Var.L().n() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] iArrC = messageInfo.c();
        if (iArrC == null) {
            iArrC = f50605z;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < a1VarArrD.length) {
            a1 a1Var2 = a1VarArrD[i12];
            int iV3 = a1Var2.v();
            t0(a1Var2, iArr, i13, objArr);
            if (i14 < iArrC.length && iArrC[i14] == iV3) {
                iArrC[i14] = i13;
                i14++;
            }
            if (a1Var2.L() == g1.J3) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (a1Var2.L().n() >= 18 && a1Var2.L().n() <= 49) {
                    iArr3[i16] = (int) w4.Z(a1Var2.t());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = f50605z;
        }
        if (iArr3 == null) {
            iArr3 = f50605z;
        }
        int[] iArr4 = new int[iArrC.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrC, 0, iArr4, 0, iArrC.length);
        System.arraycopy(iArr2, 0, iArr4, iArrC.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrC.length + iArr2.length, iArr3.length);
        return new t2<>(iArr, objArr, iV, iV2, messageInfo.b(), messageInfo.p(), true, iArr4, iArrC.length, iArrC.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0264  */
    /* JADX WARN: Code duplicated, block: B:122:0x0267  */
    /* JADX WARN: Code duplicated, block: B:125:0x027e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0281  */
    /* JADX WARN: Code duplicated, block: B:163:0x0341  */
    /* JADX WARN: Code duplicated, block: B:180:0x0396  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a4  */
    static <T> t2<T> W(n3 messageInfo, a3 newInstanceSchema, c2 listFieldSchema, r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, l2 mapFieldSchema) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int i31;
        Field fieldP0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldP1;
        int i35;
        Object obj2;
        Field fieldP2;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strD = messageInfo.d();
        int length = strD.length();
        char c10 = 55296;
        if (strD.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strD.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strD.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strD.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f50605z;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strD.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strD.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strD.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strD.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strD.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strD.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strD.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strD.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = strD.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strD.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strD.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strD.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strD.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strD.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strD.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strD.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i68 = iCharAt7;
            i12 = iCharAt5;
            i13 = i68;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i41 = i65;
            i16 = iCharAt6;
        }
        Unsafe unsafe = G;
        Object[] objArrC = messageInfo.c();
        Class<?> cls = messageInfo.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strD.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strD.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i38;
            } else {
                i25 = i74;
            }
            int i78 = i25 + 1;
            int iCharAt11 = strD.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strD.charAt(i80);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i37;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = strD.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strD.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i33 = i11 + 1;
                    objArr[((i73 / 3) * 2) + 1] = objArrC[i11];
                } else {
                    if (i87 == 12 && (messageInfo.p().equals(j3.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrC[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrC[i34];
                    if (obj instanceof Field) {
                        fieldP1 = (Field) obj;
                    } else {
                        fieldP1 = p0(cls, (String) obj);
                        objArrC[i34] = fieldP1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldP1);
                    i35 = i34 + 1;
                    obj2 = objArrC[i35];
                    if (obj2 instanceof Field) {
                        fieldP2 = (Field) obj2;
                    } else {
                        fieldP2 = p0(cls, (String) obj2);
                        objArrC[i35] = fieldP2;
                    }
                    strD = strD;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrC[i34];
                if (obj instanceof Field) {
                    fieldP1 = (Field) obj;
                } else {
                    fieldP1 = p0(cls, (String) obj);
                    objArrC[i34] = fieldP1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldP1);
                i35 = i34 + 1;
                obj2 = objArrC[i35];
                if (obj2 instanceof Field) {
                    fieldP2 = (Field) obj2;
                } else {
                    fieldP2 = p0(cls, (String) obj2);
                    objArrC[i35] = fieldP2;
                }
                strD = strD;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldP3 = p0(cls, (String) objArrC[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldP3.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrC[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (messageInfo.p() == j3.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrC[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strD.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strD.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i29;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i29 = i90;
                            }
                            int i93 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrC[i93];
                            if (obj3 instanceof Field) {
                                fieldP0 = (Field) obj3;
                            } else {
                                fieldP0 = p0(cls, (String) obj3);
                                objArrC[i93] = fieldP0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP0);
                            i30 = iCharAt13 % 32;
                        }
                        int i94 = iObjectFieldOffset2;
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i94;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    } else {
                        if (i82 == 50) {
                            int i95 = i71 + 1;
                            iArr[i71] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i11 + 2;
                            objArr[i96] = objArrC[i89];
                            if ((iCharAt11 & 2048) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrC[i97];
                                i27 = iCharAt10;
                                i71 = i95;
                            } else {
                                i28 = i97;
                                i71 = i95;
                                i27 = iCharAt10;
                            }
                        } else {
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i82 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i98;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    int i99 = iObjectFieldOffset2;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    iObjectFieldOffset3 = i99;
                    i31 = iObjectFieldOffset;
                    i11 = i28;
                    i41 = i29;
                }
                i28 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                int i910 = iObjectFieldOffset2;
                if (i82 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                iObjectFieldOffset3 = i910;
                i31 = iObjectFieldOffset;
                i11 = i28;
                i41 = i29;
            }
            int i100 = i73 + 1;
            iArr4[i73] = i27;
            int i101 = i73 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            strD = strD;
            c10 = 55296;
        }
        return new t2<>(iArr3, objArr, i12, i16, messageInfo.b(), messageInfo.p(), false, iArr, i15, i69, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int X(int pos) {
        return this.f50606a[pos];
    }

    private static long Y(int value) {
        return value & 1048575;
    }

    private static <T> boolean Z(T message, long offset) {
        return ((Boolean) w4.Q(message, offset)).booleanValue();
    }

    private static <T> double a0(T message, long offset) {
        return ((Double) w4.Q(message, offset)).doubleValue();
    }

    private static <T> float b0(T message, long offset) {
        return ((Float) w4.Q(message, offset)).floatValue();
    }

    private static <T> int c0(T message, long offset) {
        return ((Integer) w4.Q(message, offset)).intValue();
    }

    private static <T> long d0(T message, long offset) {
        return ((Long) w4.Q(message, offset)).longValue();
    }

    private <K, V> int e0(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, l.b registers) throws IOException {
        Unsafe unsafe = G;
        Object objV = v(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.f50622q.h(object)) {
            Object objF = this.f50622q.f(objV);
            this.f50622q.a(objF, object);
            unsafe.putObject(message, fieldOffset, objF);
            object = objF;
        }
        return n(data, position, limit, this.f50622q.b(objV), this.f50622q.e(object), registers);
    }

    private int g0(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, l.b registers) throws IOException {
        Unsafe unsafe = G;
        long j10 = this.f50606a[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(l.e(data, position)));
                int i10 = position + 8;
                unsafe.putInt(message, j10, number);
                return i10;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(l.m(data, position)));
                int i11 = position + 4;
                unsafe.putInt(message, j10, number);
                return i11;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int iM = l.M(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.f50415b));
                unsafe.putInt(message, j10, number);
                return iM;
            case 55:
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                if (wireType != 0) {
                    return position;
                }
                int iJ = l.J(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.f50414a));
                unsafe.putInt(message, j10, number);
                return iJ;
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
            case 65:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(l.k(data, position)));
                int i12 = position + 8;
                unsafe.putInt(message, j10, number);
                return i12;
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(l.i(data, position)));
                int i13 = position + 4;
                unsafe.putInt(message, j10, number);
                return i13;
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                if (wireType != 0) {
                    return position;
                }
                int iM2 = l.M(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.f50415b != 0));
                unsafe.putInt(message, j10, number);
                return iM2;
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                if (wireType != 2) {
                    return position;
                }
                int iJ2 = l.J(data, position, registers);
                int i14 = registers.f50414a;
                if (i14 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & 536870912) != 0 && !x4.u(data, iJ2, iJ2 + i14)) {
                        throw t1.e();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, iJ2, i14, s1.f50561b));
                    iJ2 += i14;
                }
                unsafe.putInt(message, j10, number);
                return iJ2;
            case 60:
                if (wireType != 2) {
                    return position;
                }
                Object objT = T(message, number, bufferPosition);
                int iP = l.P(objT, w(bufferPosition), data, position, limit, registers);
                v0(message, number, bufferPosition, objT);
                return iP;
            case 61:
                if (wireType != 2) {
                    return position;
                }
                int iC = l.c(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.f50416c);
                unsafe.putInt(message, j10, number);
                return iC;
            case 63:
                if (wireType != 0) {
                    return position;
                }
                int iJ3 = l.J(data, position, registers);
                int i15 = registers.f50414a;
                s1.e eVarU = u(bufferPosition);
                if (eVarU != null && !eVarU.a(i15)) {
                    x(message).r(tag, Long.valueOf(i15));
                    return iJ3;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(i15));
                unsafe.putInt(message, j10, number);
                return iJ3;
            case 66:
                if (wireType != 0) {
                    return position;
                }
                int iJ4 = l.J(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(z.c(registers.f50414a)));
                unsafe.putInt(message, j10, number);
                return iJ4;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int iM3 = l.M(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(z.d(registers.f50415b)));
                unsafe.putInt(message, j10, number);
                return iM3;
            case com.planner5d.library.engine.input.f.b.V /* 68 */:
                if (wireType == 3) {
                    Object objT2 = T(message, number, bufferPosition);
                    int iO = l.O(objT2, w(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                    v0(message, number, bufferPosition, objT2);
                    return iO;
                }
                break;
        }
        return position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int h0(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, l.b registers) throws IOException {
        int iK;
        Unsafe unsafe = G;
        s1.l lVarB2 = (s1.l) unsafe.getObject(message, fieldOffset);
        if (!lVarB2.s1()) {
            int size = lVarB2.size();
            lVarB2 = lVarB2.b2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, lVarB2);
        }
        s1.l lVar = lVarB2;
        switch (fieldType) {
            case 18:
            case 35:
                if (wireType == 2) {
                    return l.t(data, position, lVar, registers);
                }
                if (wireType == 1) {
                    return l.f(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 19:
            case 36:
                if (wireType == 2) {
                    return l.w(data, position, lVar, registers);
                }
                if (wireType == 5) {
                    return l.n(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 20:
            case 21:
            case 37:
            case 38:
                if (wireType == 2) {
                    return l.A(data, position, lVar, registers);
                }
                if (wireType == 0) {
                    return l.N(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 22:
            case 29:
            case 39:
            case 43:
                if (wireType == 2) {
                    return l.z(data, position, lVar, registers);
                }
                if (wireType == 0) {
                    return l.K(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 23:
            case 32:
            case 40:
            case 46:
                if (wireType == 2) {
                    return l.v(data, position, lVar, registers);
                }
                if (wireType == 1) {
                    return l.l(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 24:
            case 31:
            case 41:
            case 45:
                if (wireType == 2) {
                    return l.u(data, position, lVar, registers);
                }
                if (wireType == 5) {
                    return l.j(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 25:
            case 42:
                if (wireType == 2) {
                    return l.s(data, position, lVar, registers);
                }
                if (wireType == 0) {
                    return l.b(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 26:
                if (wireType == 2) {
                    return (typeAndOffset & 536870912) == 0 ? l.E(tag, data, position, limit, lVar, registers) : l.F(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 27:
                if (wireType == 2) {
                    return l.r(w(bufferPosition), tag, data, position, limit, lVar, registers);
                }
                return position;
            case 28:
                if (wireType == 2) {
                    return l.d(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 30:
            case 44:
                if (wireType != 2) {
                    if (wireType == 0) {
                        iK = l.K(tag, data, position, limit, lVar, registers);
                    }
                    return position;
                }
                iK = l.z(data, position, lVar, registers);
                t3.C(message, number, lVar, u(bufferPosition), null, this.f50620o);
                return iK;
            case 33:
            case 47:
                if (wireType == 2) {
                    return l.x(data, position, lVar, registers);
                }
                if (wireType == 0) {
                    return l.B(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 34:
            case 48:
                if (wireType == 2) {
                    return l.y(data, position, lVar, registers);
                }
                if (wireType == 0) {
                    return l.C(tag, data, position, limit, lVar, registers);
                }
                return position;
            case 49:
                if (wireType == 3) {
                    return l.p(w(bufferPosition), tag, data, position, limit, lVar, registers);
                }
                return position;
            default:
                return position;
        }
    }

    private int i0(final int number) {
        if (number < this.f50608c || number > this.f50609d) {
            return -1;
        }
        return s0(number, 0);
    }

    private int j0(final int number, final int min) {
        if (number < this.f50608c || number > this.f50609d) {
            return -1;
        }
        return s0(number, min);
    }

    private boolean k(T message, T other, int pos) {
        return C(message, pos) == C(other, pos);
    }

    private int k0(int pos) {
        return this.f50606a[pos + 2];
    }

    private static <T> boolean l(T message, long offset) {
        return w4.w(message, offset);
    }

    private <E> void l0(Object message, long offset, o3 reader, r3<E> schema, v0 extensionRegistry) throws IOException {
        reader.U(this.f50619n.c(message, offset), schema, extensionRegistry);
    }

    private static void m(Object message) {
        if (I(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    private <E> void m0(Object message, int typeAndOffset, o3 reader, r3<E> schema, v0 extensionRegistry) throws IOException {
        reader.P(this.f50619n.c(message, Y(typeAndOffset)), schema, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int n(byte[] data, int position, int limit, j2.b<K, V> metadata, Map<K, V> target, l.b registers) throws IOException {
        int iJ = l.J(data, position, registers);
        int i10 = registers.f50414a;
        if (i10 < 0 || i10 > limit - iJ) {
            throw t1.n();
        }
        int i11 = iJ + i10;
        Object obj = metadata.f50396b;
        Object obj2 = metadata.f50398d;
        while (iJ < i11) {
            int I = iJ + 1;
            int i12 = data[iJ];
            if (i12 < 0) {
                I = l.I(i12, data, I, registers);
                i12 = registers.f50414a;
            }
            int i13 = I;
            int i14 = i12 >>> 3;
            int i15 = i12 & 7;
            if (i14 != 1) {
                if (i14 == 2 && i15 == metadata.f50397c.l()) {
                    iJ = o(data, i13, limit, metadata.f50397c, metadata.f50398d.getClass(), registers);
                    obj2 = registers.f50416c;
                } else {
                    iJ = l.R(i12, data, i13, limit, registers);
                }
            } else if (i15 == metadata.f50395a.l()) {
                iJ = o(data, i13, limit, metadata.f50395a, null, registers);
                obj = registers.f50416c;
            } else {
                iJ = l.R(i12, data, i13, limit, registers);
            }
        }
        if (iJ != i11) {
            throw t1.i();
        }
        target.put(obj, obj2);
        return i11;
    }

    private void n0(Object message, int typeAndOffset, o3 reader) throws IOException {
        if (B(typeAndOffset)) {
            w4.t0(message, Y(typeAndOffset), reader.J());
        } else if (this.f50612g) {
            w4.t0(message, Y(typeAndOffset), reader.H());
        } else {
            w4.t0(message, Y(typeAndOffset), reader.g());
        }
    }

    private int o(byte[] data, int position, int limit, a5.b fieldType, Class<?> messageType, l.b registers) throws IOException {
        switch (a.f50623a[fieldType.ordinal()]) {
            case 1:
                int iM = l.M(data, position, registers);
                registers.f50416c = Boolean.valueOf(registers.f50415b != 0);
                return iM;
            case 2:
                return l.c(data, position, registers);
            case 3:
                registers.f50416c = Double.valueOf(l.e(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.f50416c = Integer.valueOf(l.i(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.f50416c = Long.valueOf(l.k(data, position));
                return position + 8;
            case 8:
                registers.f50416c = Float.valueOf(l.m(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int iJ = l.J(data, position, registers);
                registers.f50416c = Integer.valueOf(registers.f50414a);
                return iJ;
            case 12:
            case 13:
                int iM2 = l.M(data, position, registers);
                registers.f50416c = Long.valueOf(registers.f50415b);
                return iM2;
            case 14:
                return l.q(k3.a().i(messageType), data, position, limit, registers);
            case 15:
                int iJ2 = l.J(data, position, registers);
                registers.f50416c = Integer.valueOf(z.c(registers.f50414a));
                return iJ2;
            case 16:
                int iM3 = l.M(data, position, registers);
                registers.f50416c = Long.valueOf(z.d(registers.f50415b));
                return iM3;
            case 17:
                return l.G(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void o0(Object message, int typeAndOffset, o3 reader) throws IOException {
        if (B(typeAndOffset)) {
            reader.A(this.f50619n.c(message, Y(typeAndOffset)));
        } else {
            reader.n(this.f50619n.c(message, Y(typeAndOffset)));
        }
    }

    private static <T> double p(T message, long offset) {
        return w4.F(message, offset);
    }

    private static Field p0(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = messageClass.getDeclaredFields();
            for (Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private boolean q(T message, T other, int pos) {
        int iX0 = x0(pos);
        long jY = Y(iX0);
        switch (w0(iX0)) {
            case 0:
                return k(message, other, pos) && Double.doubleToLongBits(w4.F(message, jY)) == Double.doubleToLongBits(w4.F(other, jY));
            case 1:
                return k(message, other, pos) && Float.floatToIntBits(w4.H(message, jY)) == Float.floatToIntBits(w4.H(other, jY));
            case 2:
                return k(message, other, pos) && w4.N(message, jY) == w4.N(other, jY);
            case 3:
                return k(message, other, pos) && w4.N(message, jY) == w4.N(other, jY);
            case 4:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 5:
                return k(message, other, pos) && w4.N(message, jY) == w4.N(other, jY);
            case 6:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 7:
                return k(message, other, pos) && w4.w(message, jY) == w4.w(other, jY);
            case 8:
                return k(message, other, pos) && t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 9:
                return k(message, other, pos) && t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 10:
                return k(message, other, pos) && t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 11:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 12:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 13:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 14:
                return k(message, other, pos) && w4.N(message, jY) == w4.N(other, jY);
            case 15:
                return k(message, other, pos) && w4.K(message, jY) == w4.K(other, jY);
            case 16:
                return k(message, other, pos) && w4.N(message, jY) == w4.N(other, jY);
            case 17:
                return k(message, other, pos) && t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 50:
                return t3.L(w4.Q(message, jY), w4.Q(other, jY));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
            case 60:
            case 61:
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case com.planner5d.library.engine.input.f.b.V /* 68 */:
                return J(message, other, pos) && t3.L(w4.Q(message, jY), w4.Q(other, jY));
            default:
                return true;
        }
    }

    private void q0(T message, int pos) {
        int iK0 = k0(pos);
        long j10 = 1048575 & iK0;
        if (j10 == 1048575) {
            return;
        }
        w4.o0(message, j10, (1 << (iK0 >>> 20)) | w4.K(message, j10));
    }

    private <UT, UB> UB r(Object obj, int i10, UB ub2, r4<UT, UB> r4Var, Object obj2) {
        s1.e eVarU;
        int iX = X(i10);
        Object objQ = w4.Q(obj, Y(x0(i10)));
        return (objQ == null || (eVarU = u(i10)) == null) ? ub2 : (UB) s(i10, iX, this.f50622q.e(objQ), eVarU, ub2, r4Var, obj2);
    }

    private void r0(T message, int fieldNumber, int pos) {
        w4.o0(message, k0(pos) & 1048575, fieldNumber);
    }

    private <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, s1.e eVar, UB ub2, r4<UT, UB> r4Var, Object obj) {
        j2.b<?, ?> bVarB = this.f50622q.b(v(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = r4Var.f(obj);
                }
                u.h hVarU = u.U(j2.b(bVarB, next.getKey(), next.getValue()));
                try {
                    j2.l(hVarU.b(), bVarB, next.getKey(), next.getValue());
                    r4Var.d(ub2, i11, hVarU.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private int s0(final int number, int min) {
        int length = (this.f50606a.length / 3) - 1;
        while (min <= length) {
            int i10 = (length + min) >>> 1;
            int i11 = i10 * 3;
            int iX = X(i11);
            if (number == iX) {
                return i11;
            }
            if (number < iX) {
                length = i10 - 1;
            } else {
                min = i10 + 1;
            }
        }
        return -1;
    }

    private static <T> float t(T message, long offset) {
        return w4.H(message, offset);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void t0(a1 fi2, int[] buffer, int bufferIndex, Object[] objects) {
        int iZ;
        int iN;
        long jZ;
        int iZ2;
        int iNumberOfTrailingZeros;
        int i10;
        Class<?> clsZ;
        int i11;
        e3 e3VarD = fi2.D();
        if (e3VarD == null) {
            g1 g1VarL = fi2.L();
            iZ = (int) w4.Z(fi2.t());
            iN = g1VarL.n();
            if (!g1VarL.o() && !g1VarL.p()) {
                Field fieldH = fi2.H();
                iZ2 = fieldH == null ? 1048575 : (int) w4.Z(fieldH);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fi2.I());
            } else if (fi2.r() == null) {
                iZ2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jZ = w4.Z(fi2.r());
            }
            buffer[bufferIndex] = fi2.v();
            int i12 = bufferIndex + 1;
            if (fi2.M()) {
                i10 = 536870912;
            } else {
                i10 = 0;
            }
            buffer[i12] = (fi2.O() ? 268435456 : 0) | i10 | (iN << 20) | iZ;
            buffer[bufferIndex + 2] = iZ2 | (iNumberOfTrailingZeros << 20);
            clsZ = fi2.z();
            if (fi2.x() != null) {
                if (clsZ != null) {
                    objects[((bufferIndex / 3) * 2) + 1] = clsZ;
                    return;
                } else {
                    if (fi2.s() != null) {
                        objects[((bufferIndex / 3) * 2) + 1] = fi2.s();
                        return;
                    }
                    return;
                }
            }
            i11 = (bufferIndex / 3) * 2;
            objects[i11] = fi2.x();
            if (clsZ != null) {
                objects[i11 + 1] = clsZ;
            } else if (fi2.s() != null) {
                objects[i11 + 1] = fi2.s();
            }
        }
        iN = fi2.L().n() + 51;
        iZ = (int) w4.Z(e3VarD.c());
        jZ = w4.Z(e3VarD.a());
        iZ2 = (int) jZ;
        iNumberOfTrailingZeros = 0;
        buffer[bufferIndex] = fi2.v();
        int i13 = bufferIndex + 1;
        if (fi2.M()) {
            i10 = 536870912;
        } else {
            i10 = 0;
        }
        buffer[i13] = (fi2.O() ? 268435456 : 0) | i10 | (iN << 20) | iZ;
        buffer[bufferIndex + 2] = iZ2 | (iNumberOfTrailingZeros << 20);
        clsZ = fi2.z();
        if (fi2.x() != null) {
            if (clsZ != null) {
                objects[((bufferIndex / 3) * 2) + 1] = clsZ;
                return;
            } else {
                if (fi2.s() != null) {
                    objects[((bufferIndex / 3) * 2) + 1] = fi2.s();
                    return;
                }
                return;
            }
        }
        i11 = (bufferIndex / 3) * 2;
        objects[i11] = fi2.x();
        if (clsZ != null) {
            objects[i11 + 1] = clsZ;
        } else if (fi2.s() != null) {
            objects[i11 + 1] = fi2.s();
        }
    }

    private s1.e u(int pos) {
        return (s1.e) this.f50607b[((pos / 3) * 2) + 1];
    }

    private void u0(T message, int pos, Object field) {
        G.putObject(message, Y(x0(pos)), field);
        q0(message, pos);
    }

    private Object v(int pos) {
        return this.f50607b[(pos / 3) * 2];
    }

    private void v0(T message, int fieldNumber, int pos, Object field) {
        G.putObject(message, Y(x0(pos)), field);
        r0(message, fieldNumber, pos);
    }

    private r3 w(int pos) {
        int i10 = (pos / 3) * 2;
        r3 r3Var = (r3) this.f50607b[i10];
        if (r3Var != null) {
            return r3Var;
        }
        r3<T> r3VarI = k3.a().i((Class) this.f50607b[i10 + 1]);
        this.f50607b[i10] = r3VarI;
        return r3VarI;
    }

    private static int w0(int value) {
        return (value & f50600u) >>> 20;
    }

    static s4 x(Object message) {
        l1 l1Var = (l1) message;
        s4 s4Var = l1Var.unknownFields;
        if (s4Var != s4.c()) {
            return s4Var;
        }
        s4 s4VarO = s4.o();
        l1Var.unknownFields = s4VarO;
        return s4VarO;
    }

    private int x0(int pos) {
        return this.f50606a[pos + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private void y0(T message, c5 writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        t2<T> t2Var = this;
        if (t2Var.f50611f) {
            f1<T> f1VarC = t2Var.f50621p.c(message);
            if (f1VarC.C()) {
                entry = null;
                it = null;
            } else {
                Iterator itI = f1VarC.I();
                entry = (Map.Entry) itI.next();
                it = itI;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = t2Var.f50606a.length;
        Unsafe unsafe = G;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iX0 = t2Var.x0(i14);
            int iX = t2Var.X(i14);
            int iW0 = w0(iX0);
            if (iW0 <= 17) {
                int i16 = t2Var.f50606a[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(message, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && t2Var.f50621p.a(entry) <= iX) {
                t2Var.f50621p.j(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jY = Y(iX0);
            switch (iW0) {
                case 0:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.B(iX, p(message, jY));
                    }
                    break;
                case 1:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.J(iX, t(message, jY));
                    }
                    t2Var = this;
                    break;
                case 2:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.F(iX, unsafe.getLong(message, jY));
                    }
                    t2Var = this;
                    break;
                case 3:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.f(iX, unsafe.getLong(message, jY));
                    }
                    t2Var = this;
                    break;
                case 4:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.h(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 5:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.n(iX, unsafe.getLong(message, jY));
                    }
                    t2Var = this;
                    break;
                case 6:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.c(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 7:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.p(iX, l(message, jY));
                    }
                    t2Var = this;
                    break;
                case 8:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        t2Var.B0(iX, unsafe.getObject(message, jY), writer);
                    }
                    break;
                case 9:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.O(iX, unsafe.getObject(message, jY), t2Var.w(i14));
                    }
                    break;
                case 10:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.N(iX, (u) unsafe.getObject(message, jY));
                    }
                    t2Var = this;
                    break;
                case 11:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.l(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 12:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.K(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 13:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.q(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 14:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.y(iX, unsafe.getLong(message, jY));
                    }
                    t2Var = this;
                    break;
                case 15:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.M(iX, unsafe.getInt(message, jY));
                    }
                    t2Var = this;
                    break;
                case 16:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.k(iX, unsafe.getLong(message, jY));
                    }
                    t2Var = this;
                    break;
                case 17:
                    if (t2Var.D(message, i14, i10, i11, i12)) {
                        writer.R(iX, unsafe.getObject(message, jY), t2Var.w(i14));
                    }
                    break;
                case 18:
                    t3.X(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 19:
                    t3.f0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 20:
                    t3.l0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 21:
                    t3.E0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 22:
                    t3.j0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 23:
                    t3.d0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 24:
                    t3.b0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 25:
                    t3.T(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 26:
                    t3.A0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer);
                    break;
                case 27:
                    t3.p0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, t2Var.w(i14));
                    break;
                case 28:
                    t3.V(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer);
                    break;
                case 29:
                    z11 = false;
                    t3.C0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 30:
                    z11 = false;
                    t3.Z(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 31:
                    z11 = false;
                    t3.r0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 32:
                    z11 = false;
                    t3.t0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 33:
                    z11 = false;
                    t3.v0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 34:
                    z11 = false;
                    t3.x0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, false);
                    break;
                case 35:
                    t3.X(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 36:
                    t3.f0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 37:
                    t3.l0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 38:
                    t3.E0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 39:
                    t3.j0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 40:
                    t3.d0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 41:
                    t3.b0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 42:
                    t3.T(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 43:
                    t3.C0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 44:
                    t3.Z(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 45:
                    t3.r0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 46:
                    t3.t0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 47:
                    t3.v0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 48:
                    t3.x0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, z10);
                    break;
                case 49:
                    t3.h0(t2Var.X(i14), (List) unsafe.getObject(message, jY), writer, t2Var.w(i14));
                    break;
                case 50:
                    t2Var.A0(writer, iX, unsafe.getObject(message, jY), i14);
                    break;
                case 51:
                    if (t2Var.K(message, iX, i14)) {
                        writer.B(iX, a0(message, jY));
                    }
                    break;
                case 52:
                    if (t2Var.K(message, iX, i14)) {
                        writer.J(iX, b0(message, jY));
                    }
                    break;
                case 53:
                    if (t2Var.K(message, iX, i14)) {
                        writer.F(iX, d0(message, jY));
                    }
                    break;
                case 54:
                    if (t2Var.K(message, iX, i14)) {
                        writer.f(iX, d0(message, jY));
                    }
                    break;
                case 55:
                    if (t2Var.K(message, iX, i14)) {
                        writer.h(iX, c0(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (t2Var.K(message, iX, i14)) {
                        writer.n(iX, d0(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (t2Var.K(message, iX, i14)) {
                        writer.c(iX, c0(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (t2Var.K(message, iX, i14)) {
                        writer.p(iX, Z(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (t2Var.K(message, iX, i14)) {
                        t2Var.B0(iX, unsafe.getObject(message, jY), writer);
                    }
                    break;
                case 60:
                    if (t2Var.K(message, iX, i14)) {
                        writer.O(iX, unsafe.getObject(message, jY), t2Var.w(i14));
                    }
                    break;
                case 61:
                    if (t2Var.K(message, iX, i14)) {
                        writer.N(iX, (u) unsafe.getObject(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (t2Var.K(message, iX, i14)) {
                        writer.l(iX, c0(message, jY));
                    }
                    break;
                case 63:
                    if (t2Var.K(message, iX, i14)) {
                        writer.K(iX, c0(message, jY));
                    }
                    break;
                case 64:
                    if (t2Var.K(message, iX, i14)) {
                        writer.q(iX, c0(message, jY));
                    }
                    break;
                case 65:
                    if (t2Var.K(message, iX, i14)) {
                        writer.y(iX, d0(message, jY));
                    }
                    break;
                case 66:
                    if (t2Var.K(message, iX, i14)) {
                        writer.M(iX, c0(message, jY));
                    }
                    break;
                case 67:
                    if (t2Var.K(message, iX, i14)) {
                        writer.k(iX, d0(message, jY));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (t2Var.K(message, iX, i14)) {
                        writer.R(iX, unsafe.getObject(message, jY), t2Var.w(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry;
        }
        while (entry != null) {
            t2Var.f50621p.j(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        t2Var.C0(t2Var.f50620o, message, writer);
    }

    private <UT, UB> int z(r4<UT, UB> schema, T message) {
        return schema.h(schema.g(message));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    private void z0(T message, c5 writer) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        C0(this.f50620o, message, writer);
        if (this.f50611f) {
            f1<T> f1VarC = this.f50621p.c(message);
            if (f1VarC.C()) {
                itR = null;
                entry = null;
            } else {
                itR = f1VarC.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        int length = this.f50606a.length;
        while (true) {
            length -= 3;
            if (length < 0) {
                while (entry != null) {
                    this.f50621p.j(writer, entry);
                    entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
                }
                return;
            }
            int iX0 = x0(length);
            int iX = X(length);
            while (entry != null && this.f50621p.a(entry) > iX) {
                this.f50621p.j(writer, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            switch (w0(iX0)) {
                case 0:
                    if (C(message, length)) {
                        writer.B(iX, p(message, Y(iX0)));
                    }
                    break;
                case 1:
                    if (C(message, length)) {
                        writer.J(iX, t(message, Y(iX0)));
                    }
                    break;
                case 2:
                    if (C(message, length)) {
                        writer.F(iX, M(message, Y(iX0)));
                    }
                    break;
                case 3:
                    if (C(message, length)) {
                        writer.f(iX, M(message, Y(iX0)));
                    }
                    break;
                case 4:
                    if (C(message, length)) {
                        writer.h(iX, A(message, Y(iX0)));
                    }
                    break;
                case 5:
                    if (C(message, length)) {
                        writer.n(iX, M(message, Y(iX0)));
                    }
                    break;
                case 6:
                    if (C(message, length)) {
                        writer.c(iX, A(message, Y(iX0)));
                    }
                    break;
                case 7:
                    if (C(message, length)) {
                        writer.p(iX, l(message, Y(iX0)));
                    }
                    break;
                case 8:
                    if (C(message, length)) {
                        B0(iX, w4.Q(message, Y(iX0)), writer);
                    }
                    break;
                case 9:
                    if (C(message, length)) {
                        writer.O(iX, w4.Q(message, Y(iX0)), w(length));
                    }
                    break;
                case 10:
                    if (C(message, length)) {
                        writer.N(iX, (u) w4.Q(message, Y(iX0)));
                    }
                    break;
                case 11:
                    if (C(message, length)) {
                        writer.l(iX, A(message, Y(iX0)));
                    }
                    break;
                case 12:
                    if (C(message, length)) {
                        writer.K(iX, A(message, Y(iX0)));
                    }
                    break;
                case 13:
                    if (C(message, length)) {
                        writer.q(iX, A(message, Y(iX0)));
                    }
                    break;
                case 14:
                    if (C(message, length)) {
                        writer.y(iX, M(message, Y(iX0)));
                    }
                    break;
                case 15:
                    if (C(message, length)) {
                        writer.M(iX, A(message, Y(iX0)));
                    }
                    break;
                case 16:
                    if (C(message, length)) {
                        writer.k(iX, M(message, Y(iX0)));
                    }
                    break;
                case 17:
                    if (C(message, length)) {
                        writer.R(iX, w4.Q(message, Y(iX0)), w(length));
                    }
                    break;
                case 18:
                    t3.X(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 19:
                    t3.f0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 20:
                    t3.l0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 21:
                    t3.E0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 22:
                    t3.j0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 23:
                    t3.d0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 24:
                    t3.b0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 25:
                    t3.T(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 26:
                    t3.A0(X(length), (List) w4.Q(message, Y(iX0)), writer);
                    break;
                case 27:
                    t3.p0(X(length), (List) w4.Q(message, Y(iX0)), writer, w(length));
                    break;
                case 28:
                    t3.V(X(length), (List) w4.Q(message, Y(iX0)), writer);
                    break;
                case 29:
                    t3.C0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 30:
                    t3.Z(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 31:
                    t3.r0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 32:
                    t3.t0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 33:
                    t3.v0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 34:
                    t3.x0(X(length), (List) w4.Q(message, Y(iX0)), writer, false);
                    break;
                case 35:
                    t3.X(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 36:
                    t3.f0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 37:
                    t3.l0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 38:
                    t3.E0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 39:
                    t3.j0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 40:
                    t3.d0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 41:
                    t3.b0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 42:
                    t3.T(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 43:
                    t3.C0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 44:
                    t3.Z(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 45:
                    t3.r0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 46:
                    t3.t0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 47:
                    t3.v0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 48:
                    t3.x0(X(length), (List) w4.Q(message, Y(iX0)), writer, true);
                    break;
                case 49:
                    t3.h0(X(length), (List) w4.Q(message, Y(iX0)), writer, w(length));
                    break;
                case 50:
                    A0(writer, iX, w4.Q(message, Y(iX0)), length);
                    break;
                case 51:
                    if (K(message, iX, length)) {
                        writer.B(iX, a0(message, Y(iX0)));
                    }
                    break;
                case 52:
                    if (K(message, iX, length)) {
                        writer.J(iX, b0(message, Y(iX0)));
                    }
                    break;
                case 53:
                    if (K(message, iX, length)) {
                        writer.F(iX, d0(message, Y(iX0)));
                    }
                    break;
                case 54:
                    if (K(message, iX, length)) {
                        writer.f(iX, d0(message, Y(iX0)));
                    }
                    break;
                case 55:
                    if (K(message, iX, length)) {
                        writer.h(iX, c0(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (K(message, iX, length)) {
                        writer.n(iX, d0(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (K(message, iX, length)) {
                        writer.c(iX, c0(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (K(message, iX, length)) {
                        writer.p(iX, Z(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (K(message, iX, length)) {
                        B0(iX, w4.Q(message, Y(iX0)), writer);
                    }
                    break;
                case 60:
                    if (K(message, iX, length)) {
                        writer.O(iX, w4.Q(message, Y(iX0)), w(length));
                    }
                    break;
                case 61:
                    if (K(message, iX, length)) {
                        writer.N(iX, (u) w4.Q(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (K(message, iX, length)) {
                        writer.l(iX, c0(message, Y(iX0)));
                    }
                    break;
                case 63:
                    if (K(message, iX, length)) {
                        writer.K(iX, c0(message, Y(iX0)));
                    }
                    break;
                case 64:
                    if (K(message, iX, length)) {
                        writer.q(iX, c0(message, Y(iX0)));
                    }
                    break;
                case 65:
                    if (K(message, iX, length)) {
                        writer.y(iX, d0(message, Y(iX0)));
                    }
                    break;
                case 66:
                    if (K(message, iX, length)) {
                        writer.M(iX, c0(message, Y(iX0)));
                    }
                    break;
                case 67:
                    if (K(message, iX, length)) {
                        writer.k(iX, d0(message, Y(iX0)));
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (K(message, iX, length)) {
                        writer.R(iX, w4.Q(message, Y(iX0)), w(length));
                    }
                    break;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void a(T message, T other) {
        m(message);
        other.getClass();
        for (int i10 = 0; i10 < this.f50606a.length; i10 += 3) {
            R(message, other, i10);
        }
        t3.J(this.f50620o, message, other);
        if (this.f50611f) {
            t3.H(this.f50621p, message, other);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public boolean b(T message, T other) {
        int length = this.f50606a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!q(message, other, i10)) {
                return false;
            }
        }
        if (!this.f50620o.g(message).equals(this.f50620o.g(other))) {
            return false;
        }
        if (this.f50611f) {
            return this.f50621p.c(message).equals(this.f50621p.c(other));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public int c(T message) {
        int i10;
        int iS;
        int length = this.f50606a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iX0 = x0(i12);
            int iX = X(i12);
            long jY = Y(iX0);
            int iHashCode = 37;
            switch (w0(iX0)) {
                case 0:
                    i10 = i11 * 53;
                    iS = s1.s(Double.doubleToLongBits(w4.F(message, jY)));
                    i11 = i10 + iS;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iS = Float.floatToIntBits(w4.H(message, jY));
                    i11 = i10 + iS;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iS = s1.s(w4.N(message, jY));
                    i11 = i10 + iS;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iS = s1.s(w4.N(message, jY));
                    i11 = i10 + iS;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iS = s1.s(w4.N(message, jY));
                    i11 = i10 + iS;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iS = s1.k(w4.w(message, jY));
                    i11 = i10 + iS;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iS = ((String) w4.Q(message, jY)).hashCode();
                    i11 = i10 + iS;
                    break;
                case 9:
                    Object objQ = w4.Q(message, jY);
                    if (objQ != null) {
                        iHashCode = objQ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iS = w4.Q(message, jY).hashCode();
                    i11 = i10 + iS;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iS = s1.s(w4.N(message, jY));
                    i11 = i10 + iS;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iS = w4.K(message, jY);
                    i11 = i10 + iS;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iS = s1.s(w4.N(message, jY));
                    i11 = i10 + iS;
                    break;
                case 17:
                    Object objQ2 = w4.Q(message, jY);
                    if (objQ2 != null) {
                        iHashCode = objQ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iS = w4.Q(message, jY).hashCode();
                    i11 = i10 + iS;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iS = w4.Q(message, jY).hashCode();
                    i11 = i10 + iS;
                    break;
                case 51:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(Double.doubleToLongBits(a0(message, jY)));
                        i11 = i10 + iS;
                    }
                    break;
                case 52:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = Float.floatToIntBits(b0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case 53:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(d0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case 54:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(d0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case 55:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(d0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.k(Z(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = ((String) w4.Q(message, jY)).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case 60:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = w4.Q(message, jY).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case 61:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = w4.Q(message, jY).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case 63:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case 64:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case 65:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(d0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case 66:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = c0(message, jY);
                        i11 = i10 + iS;
                    }
                    break;
                case 67:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = s1.s(d0(message, jY));
                        i11 = i10 + iS;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (K(message, iX, i12)) {
                        i10 = i11 * 53;
                        iS = w4.Q(message, jY).hashCode();
                        i11 = i10 + iS;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f50620o.g(message).hashCode();
        if (this.f50611f) {
            iHashCode2 = (iHashCode2 * 53) + this.f50621p.c(message).hashCode();
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0097 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.r3
    public final boolean d(T message) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f50616k) {
            int i15 = this.f50615j[i13];
            int iX = this.X(i15);
            int iX0 = this.x0(i15);
            int i16 = this.f50606a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = G.getInt(message, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            t2<T> t2Var = this;
            T t10 = message;
            if (L(iX0) && !t2Var.D(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iW0 = w0(iX0);
            if (iW0 == 9 || iW0 == 17) {
                if (t2Var.D(t10, i15, i10, i11, i18) && !E(t10, iX0, t2Var.w(i15))) {
                    return false;
                }
            } else if (iW0 == 27) {
                if (!t2Var.G(t10, iX0, i15)) {
                    return false;
                }
            } else if (iW0 == 60 || iW0 == 68) {
                if (t2Var.K(t10, iX, i15) && !E(t10, iX0, t2Var.w(i15))) {
                    return false;
                }
            } else if (iW0 != 49) {
                if (iW0 == 50 && !t2Var.H(t10, iX0, i15)) {
                    return false;
                }
            } else if (!t2Var.G(t10, iX0, i15)) {
                return false;
            }
            i13++;
            this = t2Var;
            message = t10;
            i12 = i10;
            i14 = i11;
        }
        t2<T> t2Var2 = this;
        return !t2Var2.f50611f || t2Var2.f50621p.c(message).E();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.r3
    public void e(T message) {
        if (I(message)) {
            if (message instanceof l1) {
                l1 l1Var = (l1) message;
                l1Var.g3();
                l1Var.b3();
                l1Var.F4();
            }
            int length = this.f50606a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iX0 = x0(i10);
                long jY = Y(iX0);
                int iW0 = w0(iX0);
                if (iW0 != 9) {
                    if (iW0 != 60 && iW0 != 68) {
                        switch (iW0) {
                            case 17:
                                if (C(message, i10)) {
                                    w(i10).e(G.getObject(message, jY));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f50619n.b(message, jY);
                                break;
                            case 50:
                                Unsafe unsafe = G;
                                Object object = unsafe.getObject(message, jY);
                                if (object != null) {
                                    unsafe.putObject(message, jY, this.f50622q.c(object));
                                }
                                break;
                        }
                    } else if (K(message, X(i10), i10)) {
                        w(i10).e(G.getObject(message, jY));
                    }
                } else if (C(message, i10)) {
                    w(i10).e(G.getObject(message, jY));
                }
            }
            this.f50620o.j(message);
            if (this.f50611f) {
                this.f50621p.f(message);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0565 A[PHI: r0 r1
      0x0565: PHI (r0v6 androidx.datastore.preferences.protobuf.t2<T>) = 
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v28 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v35 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
      (r0v2 androidx.datastore.preferences.protobuf.t2<T>)
     binds: [B:22:0x0063, B:245:0x0559, B:215:0x04b9, B:201:0x046f, B:193:0x0445, B:187:0x041c, B:164:0x0333, B:158:0x0315, B:152:0x02f7, B:146:0x02d9, B:140:0x02bb, B:134:0x029d, B:128:0x027f, B:122:0x0261, B:116:0x0243, B:110:0x0226, B:104:0x0209, B:98:0x01ec, B:92:0x01cf, B:85:0x01ad, B:80:0x0179, B:77:0x016d, B:74:0x015d, B:71:0x014d, B:68:0x013d, B:65:0x0131, B:62:0x0125, B:59:0x0118, B:53:0x00fa, B:50:0x00e7, B:47:0x00d6, B:44:0x00c7, B:41:0x00b8, B:38:0x00ad, B:35:0x00a2, B:32:0x0093, B:29:0x0084, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0565: PHI (r1v2 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v3 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x0063, B:245:0x0559, B:215:0x04b9, B:201:0x046f, B:193:0x0445, B:187:0x041c, B:164:0x0333, B:158:0x0315, B:152:0x02f7, B:146:0x02d9, B:140:0x02bb, B:134:0x029d, B:128:0x027f, B:122:0x0261, B:116:0x0243, B:110:0x0226, B:104:0x0209, B:98:0x01ec, B:92:0x01cf, B:85:0x01ad, B:80:0x0179, B:77:0x016d, B:74:0x015d, B:71:0x014d, B:68:0x013d, B:65:0x0131, B:62:0x0125, B:59:0x0118, B:53:0x00fa, B:50:0x00e7, B:47:0x00d6, B:44:0x00c7, B:41:0x00b8, B:38:0x00ad, B:35:0x00a2, B:32:0x0093, B:29:0x0084, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.r3
    public int f(T message) {
        int i10;
        int iI0;
        int iQ0;
        int iY0;
        int i11;
        int iX0;
        int iZ0;
        t2<T> t2Var = this;
        T t10 = message;
        Unsafe unsafe = G;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < t2Var.f50606a.length) {
            int iX1 = t2Var.x0(i13);
            int iW0 = w0(iX1);
            int iX = t2Var.X(i13);
            int i17 = t2Var.f50606a[i13 + 2];
            int i18 = i17 & i12;
            if (iW0 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(t10, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long jY = Y(iX1);
            if (iW0 < g1.f50354u3.n() || iW0 > g1.H3.n()) {
                i18 = 0;
            }
            switch (iW0) {
                case 0:
                    if (!t2Var.D(t10, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.i0(iX, 0.0d);
                        i15 = i19 + iI0;
                    }
                    break;
                case 1:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.q0(iX, 0.0f);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 2:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.y0(iX, unsafe.getLong(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 3:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.a1(iX, unsafe.getLong(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 4:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.w0(iX, unsafe.getInt(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 5:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.o0(iX, 0L);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 6:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.m0(iX, 0);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 7:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.a0(iX, true);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 8:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(t10, jY);
                        iY0 = object instanceof u ? b0.g0(iX, (u) object) : b0.V0(iX, (String) object);
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 9:
                    if (!t2Var.D(t10, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iI0 = t3.p(iX, unsafe.getObject(t10, jY), t2Var.w(i13));
                        i15 = i19 + iI0;
                    }
                    break;
                case 10:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.g0(iX, (u) unsafe.getObject(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 11:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.Y0(iX, unsafe.getInt(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 12:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.k0(iX, unsafe.getInt(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 13:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.N0(iX, 0);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 14:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iQ0 = b0.P0(iX, 0L);
                        i15 = i19 + iQ0;
                        t2Var = this;
                        t10 = message;
                    }
                    t2Var = this;
                    t10 = message;
                    i15 = i19;
                    break;
                case 15:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.R0(iX, unsafe.getInt(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 16:
                    if (t2Var.D(t10, i13, i16, i14, i10)) {
                        iY0 = b0.T0(iX, unsafe.getLong(t10, jY));
                        i15 = i19 + iY0;
                        t2Var = this;
                    }
                    t2Var = this;
                    i15 = i19;
                    break;
                case 17:
                    if (!t2Var.D(t10, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.t0(iX, (q2) unsafe.getObject(t10, jY), t2Var.w(i13));
                        i15 = i19 + iI0;
                    }
                    break;
                case 18:
                    iI0 = t3.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 19:
                    iI0 = t3.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 20:
                    iI0 = t3.n(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 21:
                    iI0 = t3.z(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 22:
                    iI0 = t3.l(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 23:
                    iI0 = t3.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 24:
                    iI0 = t3.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 25:
                    iI0 = t3.a(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 26:
                    iI0 = t3.w(iX, (List) unsafe.getObject(t10, jY));
                    i15 = i19 + iI0;
                    break;
                case 27:
                    iI0 = t3.r(iX, (List) unsafe.getObject(t10, jY), t2Var.w(i13));
                    i15 = i19 + iI0;
                    break;
                case 28:
                    iI0 = t3.c(iX, (List) unsafe.getObject(t10, jY));
                    i15 = i19 + iI0;
                    break;
                case 29:
                    iI0 = t3.x(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 30:
                    iI0 = t3.d(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 31:
                    iI0 = t3.f(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 32:
                    iI0 = t3.h(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 33:
                    iI0 = t3.s(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 34:
                    iI0 = t3.u(iX, (List) unsafe.getObject(t10, jY), false);
                    i15 = i19 + iI0;
                    break;
                case 35:
                    i11 = t3.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 36:
                    i11 = t3.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 37:
                    i11 = t3.o((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 38:
                    i11 = t3.A((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 39:
                    i11 = t3.m((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 40:
                    i11 = t3.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 41:
                    i11 = t3.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 42:
                    i11 = t3.b((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 43:
                    i11 = t3.y((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 44:
                    i11 = t3.e((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 45:
                    i11 = t3.g((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 46:
                    i11 = t3.i((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 47:
                    i11 = t3.t((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 48:
                    i11 = t3.v((List) unsafe.getObject(t10, jY));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t2Var.f50614i) {
                            unsafe.putInt(t10, i18, i11);
                        }
                        iX0 = b0.X0(iX);
                        iZ0 = b0.Z0(i11);
                        i15 = i19 + iX0 + iZ0 + i11;
                    }
                    break;
                case 49:
                    iI0 = t3.k(iX, (List) unsafe.getObject(t10, jY), t2Var.w(i13));
                    i15 = i19 + iI0;
                    break;
                case 50:
                    iI0 = t2Var.f50622q.d(iX, unsafe.getObject(t10, jY), t2Var.v(i13));
                    i15 = i19 + iI0;
                    break;
                case 51:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.i0(iX, 0.0d);
                        i15 = i19 + iI0;
                    }
                    break;
                case 52:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.q0(iX, 0.0f);
                        i15 = i19 + iI0;
                    }
                    break;
                case 53:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.y0(iX, d0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case 54:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.a1(iX, d0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case 55:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.w0(iX, c0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.o0(iX, 0L);
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.m0(iX, 0);
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.a0(iX, true);
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        Object object2 = unsafe.getObject(t10, jY);
                        iI0 = object2 instanceof u ? b0.g0(iX, (u) object2) : b0.V0(iX, (String) object2);
                        i15 = i19 + iI0;
                    }
                    break;
                case 60:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = t3.p(iX, unsafe.getObject(t10, jY), t2Var.w(i13));
                        i15 = i19 + iI0;
                    }
                    break;
                case 61:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.g0(iX, (u) unsafe.getObject(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.Y0(iX, c0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case 63:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.k0(iX, c0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case 64:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.N0(iX, 0);
                        i15 = i19 + iI0;
                    }
                    break;
                case 65:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.P0(iX, 0L);
                        i15 = i19 + iI0;
                    }
                    break;
                case 66:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.R0(iX, c0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case 67:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.T0(iX, d0(t10, jY));
                        i15 = i19 + iI0;
                    }
                    break;
                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                    if (!t2Var.K(t10, iX, i13)) {
                        i15 = i19;
                    } else {
                        iI0 = b0.t0(iX, (q2) unsafe.getObject(t10, jY), t2Var.w(i13));
                        i15 = i19 + iI0;
                    }
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iZ = i15 + t2Var.z(t2Var.f50620o, t10);
        return t2Var.f50611f ? iZ + t2Var.f50621p.c(t10).z() : iZ;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @androidx.datastore.preferences.protobuf.x
    int f0(T r27, byte[] r28, int r29, int r30, int r31, androidx.datastore.preferences.protobuf.l.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t2.f0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.l$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public T g() {
        return (T) this.f50618m.a(this.f50610e);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void h(T message, c5 writer) throws IOException {
        if (writer.D() == c5.a.DESCENDING) {
            z0(message, writer);
        } else {
            y0(message, writer);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void i(T message, o3 reader, v0 extensionRegistry) throws IOException {
        extensionRegistry.getClass();
        m(message);
        N(this.f50620o, this.f50621p, message, reader, extensionRegistry);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void j(T message, byte[] data, int position, int limit, l.b registers) throws IOException {
        f0(message, data, position, limit, 0, registers);
    }

    int y() {
        return this.f50606a.length * 3;
    }
}
