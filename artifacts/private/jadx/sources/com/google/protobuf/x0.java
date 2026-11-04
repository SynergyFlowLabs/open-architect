package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@y
final class x0 extends w0<l1.g> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126455a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f126455a = iArr;
            try {
                iArr[x4.b.f126482c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126455a[x4.b.f126483d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126455a[x4.b.f126484e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126455a[x4.b.f126485f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126455a[x4.b.f126486g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126455a[x4.b.f126487h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126455a[x4.b.f126488i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f126455a[x4.b.f126489j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f126455a[x4.b.f126494o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f126455a[x4.b.f126496t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f126455a[x4.b.f126497v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f126455a[x4.b.f126498w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f126455a[x4.b.X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f126455a[x4.b.f126495s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f126455a[x4.b.f126493n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f126455a[x4.b.f126490k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f126455a[x4.b.f126491l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f126455a[x4.b.f126492m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    x0() {
    }

    @Override // com.google.protobuf.w0
    int a(Map.Entry<?, ?> extension) {
        return ((l1.g) extension.getKey()).i();
    }

    @Override // com.google.protobuf.w0
    Object b(v0 extensionRegistry, n2 defaultInstance, int number) {
        return extensionRegistry.c(defaultInstance, number);
    }

    @Override // com.google.protobuf.w0
    f1<l1.g> c(Object message) {
        return ((l1.e) message).extensions;
    }

    @Override // com.google.protobuf.w0
    f1<l1.g> d(Object message) {
        return ((l1.e) message).am();
    }

    @Override // com.google.protobuf.w0
    boolean e(n2 prototype) {
        return prototype instanceof l1.e;
    }

    @Override // com.google.protobuf.w0
    void f(Object message) {
        c(message).J();
    }

    @Override // com.google.protobuf.w0
    <UT, UB> UB g(Object obj, m3 m3Var, Object obj2, v0 v0Var, f1<l1.g> f1Var, UB ub2, o4<UT, UB> o4Var) throws IOException {
        Object objValueOf;
        Object objU;
        ArrayList arrayList;
        l1.h hVar = (l1.h) obj2;
        int iD = hVar.d();
        if (hVar.f126052d.F() && hVar.f126052d.K()) {
            switch (a.f126455a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    m3Var.s(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    m3Var.o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    m3Var.y(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    m3Var.x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    m3Var.k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    m3Var.C(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    m3Var.l(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    m3Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    m3Var.D(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    m3Var.v(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    m3Var.j(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    m3Var.h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    m3Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    m3Var.z(arrayList);
                    ub2 = (UB) q3.B(obj, iD, arrayList, hVar.f126052d.A(), ub2, o4Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f126052d.u());
            }
            f1Var.P(hVar.f126052d, arrayList);
            return ub2;
        }
        if (hVar.b() != x4.b.f126495s) {
            switch (a.f126455a[hVar.b().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m3Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(m3Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(m3Var.t());
                    break;
                case 4:
                    objValueOf = Long.valueOf(m3Var.i());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(m3Var.B());
                    break;
                case 6:
                    objValueOf = Long.valueOf(m3Var.u());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(m3Var.F());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(m3Var.w());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(m3Var.c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(m3Var.I());
                    break;
                case 11:
                    objValueOf = Long.valueOf(m3Var.b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(m3Var.e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(m3Var.G());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = m3Var.g();
                    break;
                case 16:
                    objValueOf = m3Var.H();
                    break;
                case 17:
                    if (!hVar.f()) {
                        Object objU2 = f1Var.u(hVar.f126052d);
                        if (objU2 instanceof l1) {
                            o3 o3VarJ = i3.a().j(objU2);
                            if (!((l1) objU2).nl()) {
                                Object objG = o3VarJ.g();
                                o3VarJ.a(objG, objU2);
                                f1Var.P(hVar.f126052d, objG);
                                objU2 = objG;
                            }
                            m3Var.L(objU2, o3VarJ, v0Var);
                            return ub2;
                        }
                    }
                    objValueOf = m3Var.R(hVar.c().getClass(), v0Var);
                    break;
                case 18:
                    if (!hVar.f()) {
                        Object objU3 = f1Var.u(hVar.f126052d);
                        if (objU3 instanceof l1) {
                            o3 o3VarJ2 = i3.a().j(objU3);
                            if (!((l1) objU3).nl()) {
                                Object objG2 = o3VarJ2.g();
                                o3VarJ2.a(objG2, objU3);
                                f1Var.P(hVar.f126052d, objG2);
                                objU3 = objG2;
                            }
                            m3Var.O(objU3, o3VarJ2, v0Var);
                            return ub2;
                        }
                    }
                    objValueOf = m3Var.S(hVar.c().getClass(), v0Var);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iB = m3Var.B();
            if (hVar.f126052d.A().a(iB) == null) {
                return (UB) q3.O(obj, iD, iB, ub2, o4Var);
            }
            objValueOf = Integer.valueOf(iB);
        }
        if (hVar.f()) {
            f1Var.h(hVar.f126052d, objValueOf);
            return ub2;
        }
        int i10 = a.f126455a[hVar.b().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objU = f1Var.u(hVar.f126052d)) != null) {
            objValueOf = s1.v(objU, objValueOf);
        }
        f1Var.P(hVar.f126052d, objValueOf);
        return ub2;
    }

    @Override // com.google.protobuf.w0
    void h(m3 reader, Object extensionObject, v0 extensionRegistry, f1<l1.g> extensions) throws IOException {
        l1.h hVar = (l1.h) extensionObject;
        extensions.P(hVar.f126052d, reader.S(hVar.c().getClass(), extensionRegistry));
    }

    @Override // com.google.protobuf.w0
    void i(u data, Object extensionObject, v0 extensionRegistry, f1<l1.g> extensions) throws IOException {
        l1.h hVar = (l1.h) extensionObject;
        n2.a aVarG1 = hVar.c().G1();
        z zVarV = data.V();
        aVarG1.rl(zVarV, extensionRegistry);
        extensions.P(hVar.f126052d, aVarG1.B1());
        zVarV.a(0);
    }

    @Override // com.google.protobuf.w0
    void j(z4 writer, Map.Entry<?, ?> extension) throws IOException {
        l1.g gVar = (l1.g) extension.getKey();
        if (!gVar.F()) {
            switch (a.f126455a[gVar.u().ordinal()]) {
                case 1:
                    writer.B(gVar.i(), ((Double) extension.getValue()).doubleValue());
                    break;
                case 2:
                    writer.J(gVar.i(), ((Float) extension.getValue()).floatValue());
                    break;
                case 3:
                    writer.F(gVar.i(), ((Long) extension.getValue()).longValue());
                    break;
                case 4:
                    writer.f(gVar.i(), ((Long) extension.getValue()).longValue());
                    break;
                case 5:
                    writer.h(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 6:
                    writer.n(gVar.i(), ((Long) extension.getValue()).longValue());
                    break;
                case 7:
                    writer.c(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 8:
                    writer.p(gVar.i(), ((Boolean) extension.getValue()).booleanValue());
                    break;
                case 9:
                    writer.l(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 10:
                    writer.q(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 11:
                    writer.y(gVar.i(), ((Long) extension.getValue()).longValue());
                    break;
                case 12:
                    writer.M(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 13:
                    writer.k(gVar.i(), ((Long) extension.getValue()).longValue());
                    break;
                case 14:
                    writer.h(gVar.i(), ((Integer) extension.getValue()).intValue());
                    break;
                case 15:
                    writer.N(gVar.i(), (u) extension.getValue());
                    break;
                case 16:
                    writer.e(gVar.i(), (String) extension.getValue());
                    break;
                case 17:
                    writer.Q(gVar.i(), extension.getValue(), i3.a().i(extension.getValue().getClass()));
                    break;
                case 18:
                    writer.S(gVar.i(), extension.getValue(), i3.a().i(extension.getValue().getClass()));
                    break;
            }
        }
        switch (a.f126455a[gVar.u().ordinal()]) {
            case 1:
                q3.X(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 2:
                q3.f0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 3:
                q3.l0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 4:
                q3.E0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 5:
                q3.j0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 6:
                q3.d0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 7:
                q3.b0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 8:
                q3.T(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 9:
                q3.C0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 10:
                q3.r0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 11:
                q3.t0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 12:
                q3.v0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 13:
                q3.x0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 14:
                q3.j0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 15:
                q3.V(gVar.i(), (List) extension.getValue(), writer);
                break;
            case 16:
                q3.A0(gVar.i(), (List) extension.getValue(), writer);
                break;
            case 17:
                List list = (List) extension.getValue();
                if (list != null && !list.isEmpty()) {
                    q3.h0(gVar.i(), (List) extension.getValue(), writer, i3.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) extension.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    q3.p0(gVar.i(), (List) extension.getValue(), writer, i3.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.protobuf.w0
    void k(Object message, f1<l1.g> extensions) {
        ((l1.e) message).extensions = extensions;
    }
}
