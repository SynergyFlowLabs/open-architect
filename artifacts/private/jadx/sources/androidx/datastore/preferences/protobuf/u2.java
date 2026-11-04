package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
final class u2<T> implements r3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f50668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r4<?, ?> f50669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0<?> f50671d;

    private u2(r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, q2 defaultInstance) {
        this.f50669b = unknownFieldSchema;
        this.f50670c = extensionSchema.e(defaultInstance);
        this.f50671d = extensionSchema;
        this.f50668a = defaultInstance;
    }

    private <UT, UB> int k(r4<UT, UB> schema, T message) {
        return schema.i(schema.g(message));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends f1.c<ET>> void l(r4<UT, UB> r4Var, w0<ET> w0Var, T t10, o3 o3Var, v0 v0Var) throws Throwable {
        r4<UT, UB> r4Var2;
        UB ubF = r4Var.f(t10);
        Object objD = w0Var.d(t10);
        while (o3Var.m() != Integer.MAX_VALUE) {
            try {
                u2 u2Var = this;
                r4Var2 = r4Var;
                w0<ET> w0Var2 = w0Var;
                o3 o3Var2 = o3Var;
                v0 v0Var2 = v0Var;
                try {
                    if (!u2Var.n(o3Var2, v0Var2, w0Var2, objD, r4Var2, ubF)) {
                        r4Var2.o(t10, ubF);
                        return;
                    }
                    this = (u2<T>) u2Var;
                    o3Var = o3Var2;
                    v0Var = v0Var2;
                    w0Var = w0Var2;
                    r4Var = r4Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    r4Var2.o(t10, ubF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r4Var2 = r4Var;
            }
        }
        r4Var.o(t10, ubF);
    }

    static <T> u2<T> m(r4<?, ?> unknownFieldSchema, w0<?> extensionSchema, q2 defaultInstance) {
        return new u2<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends f1.c<ET>> boolean n(o3 reader, v0 extensionRegistry, w0<ET> extensionSchema, f1<ET> extensions, r4<UT, UB> unknownFieldSchema, UB unknownFields) throws IOException {
        int iE = reader.E();
        int iC = 0;
        if (iE != a5.f49962q) {
            if (a5.b(iE) != 2) {
                return reader.q();
            }
            Object objB = extensionSchema.b(extensionRegistry, this.f50668a, a5.a(iE));
            if (objB == null) {
                return unknownFieldSchema.m(unknownFields, reader, 0);
            }
            extensionSchema.h(reader, objB, extensionRegistry, extensions);
            return true;
        }
        Object objB2 = null;
        u uVarG = null;
        while (reader.m() != Integer.MAX_VALUE) {
            int iE2 = reader.E();
            if (iE2 == a5.f49964s) {
                iC = reader.c();
                objB2 = extensionSchema.b(extensionRegistry, this.f50668a, iC);
            } else if (iE2 == a5.f49965t) {
                if (objB2 != null) {
                    extensionSchema.h(reader, objB2, extensionRegistry, extensions);
                } else {
                    uVarG = reader.g();
                }
            } else if (!reader.q()) {
                break;
            }
        }
        if (reader.E() != a5.f49963r) {
            throw t1.c();
        }
        if (uVarG != null) {
            if (objB2 != null) {
                extensionSchema.i(uVarG, objB2, extensionRegistry, extensions);
            } else {
                unknownFieldSchema.d(unknownFields, iC, uVarG);
            }
        }
        return true;
    }

    private <UT, UB> void o(r4<UT, UB> unknownFieldSchema, T message, c5 writer) throws IOException {
        unknownFieldSchema.t(unknownFieldSchema.g(message), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void a(T message, T other) {
        t3.J(this.f50669b, message, other);
        if (this.f50670c) {
            t3.H(this.f50671d, message, other);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public boolean b(T message, T other) {
        if (!this.f50669b.g(message).equals(this.f50669b.g(other))) {
            return false;
        }
        if (this.f50670c) {
            return this.f50671d.c(message).equals(this.f50671d.c(other));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public int c(T message) {
        int iHashCode = this.f50669b.g(message).hashCode();
        return this.f50670c ? (iHashCode * 53) + this.f50671d.c(message).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public final boolean d(T message) {
        return this.f50671d.c(message).E();
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void e(T message) {
        this.f50669b.j(message);
        this.f50671d.f(message);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public int f(T message) {
        int iK = k(this.f50669b, message);
        return this.f50670c ? iK + this.f50671d.c(message).v() : iK;
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public T g() {
        q2 q2Var = this.f50668a;
        return q2Var instanceof l1 ? (T) ((l1) q2Var).B5() : (T) q2Var.G1().B1();
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void h(T message, c5 writer) throws IOException {
        Iterator itI = this.f50671d.c(message).I();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            f1.c cVar = (f1.c) entry.getKey();
            if (cVar.B() != a5.c.MESSAGE || cVar.F() || cVar.K()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof y1.b) {
                writer.b(cVar.i(), ((y1.b) entry).a().n());
            } else {
                writer.b(cVar.i(), entry.getValue());
            }
        }
        o(this.f50669b, message, writer);
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public void i(T message, o3 reader, v0 extensionRegistry) throws Throwable {
        l(this.f50669b, this.f50671d, message, reader, extensionRegistry);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[EDGE_INSN: B:62:0x00d2->B:34:0x00d2 BREAK  A[LOOP:1: B:17:0x0072->B:65:0x0072], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.r3
    public void j(T message, byte[] data, int position, int limit, l.b registers) throws IOException {
        int iJ;
        l1 l1Var = (l1) message;
        s4 s4VarO = l1Var.unknownFields;
        if (s4VarO == s4.c()) {
            s4VarO = s4.o();
            l1Var.unknownFields = s4VarO;
        }
        s4 s4Var = s4VarO;
        f1<l1.g> f1VarJ7 = ((l1.e) message).j7();
        l1.h hVar = null;
        while (position < limit) {
            int iJ2 = l.J(data, position, registers);
            int i10 = registers.f50414a;
            if (i10 == a5.f49962q) {
                int i11 = limit;
                l.b bVar = registers;
                int i12 = 0;
                u uVar = null;
                while (true) {
                    if (iJ2 >= i11) {
                        iJ = iJ2;
                        break;
                    }
                    iJ = l.J(data, iJ2, bVar);
                    int i13 = bVar.f50414a;
                    int iA = a5.a(i13);
                    int iB = a5.b(i13);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (hVar != null) {
                                iJ2 = l.q(k3.a().i(hVar.c().getClass()), data, iJ, i11, bVar);
                                f1VarJ7.P(hVar.f50436d, bVar.f50416c);
                            } else if (iB == 2) {
                                iJ2 = l.c(data, iJ, bVar);
                                uVar = (u) bVar.f50416c;
                            }
                        }
                        if (i13 == a5.f49963r) {
                            break;
                        } else {
                            iJ2 = l.R(i13, data, iJ, i11, bVar);
                        }
                    } else if (iB == 0) {
                        iJ2 = l.J(data, iJ, bVar);
                        i12 = bVar.f50414a;
                        hVar = (l1.h) this.f50671d.b(bVar.f50417d, this.f50668a, i12);
                    } else {
                        if (i13 == a5.f49963r) {
                            break;
                            break;
                        }
                        iJ2 = l.R(i13, data, iJ, i11, bVar);
                    }
                }
                if (uVar != null) {
                    s4Var.r(a5.c(i12, 2), uVar);
                }
                position = iJ;
                limit = i11;
                registers = bVar;
            } else if (a5.b(i10) == 2) {
                hVar = (l1.h) this.f50671d.b(registers.f50417d, this.f50668a, a5.a(i10));
                if (hVar != null) {
                    position = l.q(k3.a().i(hVar.c().getClass()), data, iJ2, limit, registers);
                    f1VarJ7.P(hVar.f50436d, registers.f50416c);
                } else {
                    position = l.H(i10, data, iJ2, limit, s4Var, registers);
                }
            } else {
                position = l.R(i10, data, iJ2, limit, registers);
            }
        }
        if (position != limit) {
            throw t1.i();
        }
    }
}
