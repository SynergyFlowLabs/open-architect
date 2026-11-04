package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@y
final class x0 extends w0<l1.g> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50748a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50748a = iArr;
            try {
                iArr[a5.b.f49967c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50748a[a5.b.f49968d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50748a[a5.b.f49969e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50748a[a5.b.f49970f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50748a[a5.b.f49971g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50748a[a5.b.f49972h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50748a[a5.b.f49973i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50748a[a5.b.f49974j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50748a[a5.b.f49979o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50748a[a5.b.f49981t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50748a[a5.b.f49982v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f50748a[a5.b.f49983w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50748a[a5.b.X.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50748a[a5.b.f49980s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f50748a[a5.b.f49978n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f50748a[a5.b.f49975k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f50748a[a5.b.f49976l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f50748a[a5.b.f49977m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    x0() {
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    int a(Map.Entry<?, ?> extension) {
        return ((l1.g) extension.getKey()).i();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    Object b(v0 extensionRegistry, q2 defaultInstance, int number) {
        return extensionRegistry.c(defaultInstance, number);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    f1<l1.g> c(Object message) {
        return ((l1.e) message).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    f1<l1.g> d(Object message) {
        return ((l1.e) message).j7();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    boolean e(q2 prototype) {
        return prototype instanceof l1.e;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    void f(Object message) {
        c(message).J();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    <UT, UB> UB g(Object obj, o3 o3Var, Object obj2, v0 v0Var, f1<l1.g> f1Var, UB ub2, r4<UT, UB> r4Var) throws IOException {
        Object objValueOf;
        Object objU;
        ArrayList arrayList;
        l1.h hVar = (l1.h) obj2;
        int iD = hVar.d();
        if (hVar.f50436d.F() && hVar.f50436d.K()) {
            switch (a.f50748a[hVar.b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    o3Var.s(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    o3Var.o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    o3Var.y(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    o3Var.x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    o3Var.k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    o3Var.C(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    o3Var.l(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    o3Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    o3Var.D(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    o3Var.v(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    o3Var.j(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    o3Var.h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    o3Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    o3Var.z(arrayList);
                    ub2 = (UB) t3.B(obj, iD, arrayList, hVar.f50436d.A(), ub2, r4Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hVar.f50436d.u());
            }
            f1Var.P(hVar.f50436d, arrayList);
            return ub2;
        }
        if (hVar.b() != a5.b.f49980s) {
            switch (a.f50748a[hVar.b().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(o3Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(o3Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(o3Var.t());
                    break;
                case 4:
                    objValueOf = Long.valueOf(o3Var.i());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(o3Var.B());
                    break;
                case 6:
                    objValueOf = Long.valueOf(o3Var.u());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(o3Var.F());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(o3Var.w());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(o3Var.c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(o3Var.I());
                    break;
                case 11:
                    objValueOf = Long.valueOf(o3Var.b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(o3Var.e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(o3Var.G());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = o3Var.g();
                    break;
                case 16:
                    objValueOf = o3Var.H();
                    break;
                case 17:
                    if (!hVar.f()) {
                        Object objU2 = f1Var.u(hVar.f50436d);
                        if (objU2 instanceof l1) {
                            r3 r3VarJ = k3.a().j(objU2);
                            if (!((l1) objU2).A4()) {
                                Object objG = r3VarJ.g();
                                r3VarJ.a(objG, objU2);
                                f1Var.P(hVar.f50436d, objG);
                                objU2 = objG;
                            }
                            o3Var.T(objU2, r3VarJ, v0Var);
                            return ub2;
                        }
                    }
                    objValueOf = o3Var.Q(hVar.c().getClass(), v0Var);
                    break;
                case 18:
                    if (!hVar.f()) {
                        Object objU3 = f1Var.u(hVar.f50436d);
                        if (objU3 instanceof l1) {
                            r3 r3VarJ2 = k3.a().j(objU3);
                            if (!((l1) objU3).A4()) {
                                Object objG2 = r3VarJ2.g();
                                r3VarJ2.a(objG2, objU3);
                                f1Var.P(hVar.f50436d, objG2);
                                objU3 = objG2;
                            }
                            o3Var.O(objU3, r3VarJ2, v0Var);
                            return ub2;
                        }
                    }
                    objValueOf = o3Var.L(hVar.c().getClass(), v0Var);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iB = o3Var.B();
            if (hVar.f50436d.A().a(iB) == null) {
                return (UB) t3.O(obj, iD, iB, ub2, r4Var);
            }
            objValueOf = Integer.valueOf(iB);
        }
        if (hVar.f()) {
            f1Var.h(hVar.f50436d, objValueOf);
            return ub2;
        }
        int i10 = a.f50748a[hVar.b().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objU = f1Var.u(hVar.f50436d)) != null) {
            objValueOf = s1.v(objU, objValueOf);
        }
        f1Var.P(hVar.f50436d, objValueOf);
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    void h(o3 reader, Object extensionObject, v0 extensionRegistry, f1<l1.g> extensions) throws IOException {
        l1.h hVar = (l1.h) extensionObject;
        extensions.P(hVar.f50436d, reader.L(hVar.c().getClass(), extensionRegistry));
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    void i(u data, Object extensionObject, v0 extensionRegistry, f1<l1.g> extensions) throws IOException {
        l1.h hVar = (l1.h) extensionObject;
        q2.a aVarG1 = hVar.c().G1();
        z zVarV = data.V();
        aVarG1.g3(zVarV, extensionRegistry);
        extensions.P(hVar.f50436d, aVarG1.B1());
        zVarV.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    void j(c5 writer, Map.Entry<?, ?> extension) throws IOException {
        l1.g gVar = (l1.g) extension.getKey();
        if (!gVar.F()) {
            switch (a.f50748a[gVar.u().ordinal()]) {
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
                    writer.R(gVar.i(), extension.getValue(), k3.a().i(extension.getValue().getClass()));
                    break;
                case 18:
                    writer.O(gVar.i(), extension.getValue(), k3.a().i(extension.getValue().getClass()));
                    break;
            }
        }
        switch (a.f50748a[gVar.u().ordinal()]) {
            case 1:
                t3.X(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 2:
                t3.f0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 3:
                t3.l0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 4:
                t3.E0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 5:
                t3.j0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 6:
                t3.d0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 7:
                t3.b0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 8:
                t3.T(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 9:
                t3.C0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 10:
                t3.r0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 11:
                t3.t0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 12:
                t3.v0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 13:
                t3.x0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 14:
                t3.j0(gVar.i(), (List) extension.getValue(), writer, gVar.K());
                break;
            case 15:
                t3.V(gVar.i(), (List) extension.getValue(), writer);
                break;
            case 16:
                t3.A0(gVar.i(), (List) extension.getValue(), writer);
                break;
            case 17:
                List list = (List) extension.getValue();
                if (list != null && !list.isEmpty()) {
                    t3.h0(gVar.i(), (List) extension.getValue(), writer, k3.a().i(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) extension.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    t3.p0(gVar.i(), (List) extension.getValue(), writer, k3.a().i(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    void k(Object message, f1<l1.g> extensions) {
        ((l1.e) message).extensions = extensions;
    }
}
