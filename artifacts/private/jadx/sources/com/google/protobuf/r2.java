package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
final class r2<T> implements o3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n2 f126286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o4<?, ?> f126287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0<?> f126289d;

    private r2(o4<?, ?> unknownFieldSchema, w0<?> extensionSchema, n2 defaultInstance) {
        this.f126287b = unknownFieldSchema;
        this.f126288c = extensionSchema.e(defaultInstance);
        this.f126289d = extensionSchema;
        this.f126286a = defaultInstance;
    }

    private <UT, UB> int k(o4<UT, UB> schema, T message) {
        return schema.i(schema.g(message));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends f1.c<ET>> void l(o4<UT, UB> o4Var, w0<ET> w0Var, T t10, m3 m3Var, v0 v0Var) throws Throwable {
        o4<UT, UB> o4Var2;
        UB ubF = o4Var.f(t10);
        Object objD = w0Var.d(t10);
        while (m3Var.m() != Integer.MAX_VALUE) {
            try {
                r2 r2Var = this;
                o4Var2 = o4Var;
                w0<ET> w0Var2 = w0Var;
                m3 m3Var2 = m3Var;
                v0 v0Var2 = v0Var;
                try {
                    if (!r2Var.n(m3Var2, v0Var2, w0Var2, objD, o4Var2, ubF)) {
                        o4Var2.o(t10, ubF);
                        return;
                    }
                    this = (r2<T>) r2Var;
                    m3Var = m3Var2;
                    v0Var = v0Var2;
                    w0Var = w0Var2;
                    o4Var = o4Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    o4Var2.o(t10, ubF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                o4Var2 = o4Var;
            }
        }
        o4Var.o(t10, ubF);
    }

    static <T> r2<T> m(o4<?, ?> unknownFieldSchema, w0<?> extensionSchema, n2 defaultInstance) {
        return new r2<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends f1.c<ET>> boolean n(m3 reader, v0 extensionRegistry, w0<ET> extensionSchema, f1<ET> extensions, o4<UT, UB> unknownFieldSchema, UB unknownFields) throws IOException {
        int iE = reader.E();
        int iC = 0;
        if (iE != x4.f126477q) {
            if (x4.b(iE) != 2) {
                return reader.q();
            }
            Object objB = extensionSchema.b(extensionRegistry, this.f126286a, x4.a(iE));
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
            if (iE2 == x4.f126479s) {
                iC = reader.c();
                objB2 = extensionSchema.b(extensionRegistry, this.f126286a, iC);
            } else if (iE2 == x4.f126480t) {
                if (objB2 != null) {
                    extensionSchema.h(reader, objB2, extensionRegistry, extensions);
                } else {
                    uVarG = reader.g();
                }
            } else if (!reader.q()) {
                break;
            }
        }
        if (reader.E() != x4.f126478r) {
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

    private <UT, UB> void o(o4<UT, UB> unknownFieldSchema, T message, z4 writer) throws IOException {
        unknownFieldSchema.t(unknownFieldSchema.g(message), writer);
    }

    @Override // com.google.protobuf.o3
    public void a(T message, T other) {
        q3.J(this.f126287b, message, other);
        if (this.f126288c) {
            q3.H(this.f126289d, message, other);
        }
    }

    @Override // com.google.protobuf.o3
    public boolean b(T message, T other) {
        if (!this.f126287b.g(message).equals(this.f126287b.g(other))) {
            return false;
        }
        if (this.f126288c) {
            return this.f126289d.c(message).equals(this.f126289d.c(other));
        }
        return true;
    }

    @Override // com.google.protobuf.o3
    public int c(T message) {
        int iHashCode = this.f126287b.g(message).hashCode();
        return this.f126288c ? (iHashCode * 53) + this.f126289d.c(message).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.o3
    public final boolean d(T message) {
        return this.f126289d.c(message).E();
    }

    @Override // com.google.protobuf.o3
    public void e(T message) {
        this.f126287b.j(message);
        this.f126289d.f(message);
    }

    @Override // com.google.protobuf.o3
    public int f(T message) {
        int iK = k(this.f126287b, message);
        if (this.f126288c) {
            iK += this.f126289d.c(message).v();
        }
        return iK;
    }

    @Override // com.google.protobuf.o3
    public T g() {
        n2 n2Var = this.f126286a;
        return n2Var instanceof l1 ? (T) ((l1) n2Var).Bl() : (T) n2Var.G1().B1();
    }

    @Override // com.google.protobuf.o3
    public void h(T message, z4 writer) throws IOException {
        Iterator itI = this.f126289d.c(message).I();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            f1.c cVar = (f1.c) entry.getKey();
            if (cVar.B() != x4.c.MESSAGE || cVar.F() || cVar.K()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof x1.b) {
                writer.b(cVar.i(), ((x1.b) entry).a().n());
            } else {
                writer.b(cVar.i(), entry.getValue());
            }
        }
        o(this.f126287b, message, writer);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[EDGE_INSN: B:62:0x00d3->B:34:0x00d3 BREAK  A[LOOP:1: B:17:0x0073->B:65:0x0073], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.o3
    public void i(T message, byte[] data, int position, int limit, l.b registers) throws IOException {
        int iJ;
        l1 l1Var = (l1) message;
        p4 p4VarO = l1Var.unknownFields;
        if (p4VarO == p4.c()) {
            p4VarO = p4.o();
            l1Var.unknownFields = p4VarO;
        }
        p4 p4Var = p4VarO;
        f1<l1.g> f1VarAm = ((l1.e) message).am();
        l1.h hVar = null;
        while (position < limit) {
            int iJ2 = l.J(data, position, registers);
            int i10 = registers.f126030a;
            if (i10 == x4.f126477q) {
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
                    int i13 = bVar.f126030a;
                    int iA = x4.a(i13);
                    int iB = x4.b(i13);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (hVar != null) {
                                iJ2 = l.q(i3.a().i(hVar.c().getClass()), data, iJ, i11, bVar);
                                f1VarAm.P(hVar.f126052d, bVar.f126032c);
                            } else if (iB == 2) {
                                iJ2 = l.c(data, iJ, bVar);
                                uVar = (u) bVar.f126032c;
                            }
                        }
                        if (i13 == x4.f126478r) {
                            break;
                        } else {
                            iJ2 = l.R(i13, data, iJ, i11, bVar);
                        }
                    } else if (iB == 0) {
                        iJ2 = l.J(data, iJ, bVar);
                        i12 = bVar.f126030a;
                        hVar = (l1.h) this.f126289d.b(bVar.f126033d, this.f126286a, i12);
                    } else {
                        if (i13 == x4.f126478r) {
                            break;
                            break;
                        }
                        iJ2 = l.R(i13, data, iJ, i11, bVar);
                    }
                }
                if (uVar != null) {
                    p4Var.r(x4.c(i12, 2), uVar);
                }
                position = iJ;
                limit = i11;
                registers = bVar;
            } else if (x4.b(i10) == 2) {
                hVar = (l1.h) this.f126289d.b(registers.f126033d, this.f126286a, x4.a(i10));
                if (hVar != null) {
                    position = l.q(i3.a().i(hVar.c().getClass()), data, iJ2, limit, registers);
                    f1VarAm.P(hVar.f126052d, registers.f126032c);
                } else {
                    position = l.H(i10, data, iJ2, limit, p4Var, registers);
                }
            } else {
                position = l.R(i10, data, iJ2, limit, registers);
            }
        }
        if (position != limit) {
            throw t1.i();
        }
    }

    @Override // com.google.protobuf.o3
    public void j(T message, m3 reader, v0 extensionRegistry) throws Throwable {
        l(this.f126287b, this.f126289d, message, reader, extensionRegistry);
    }
}
