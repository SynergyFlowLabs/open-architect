package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f95152p = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d0 f95153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f95155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d0.c f95156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f95158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f95160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k0<Class, m0<String, a>> f95161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k0<String, Class> f95162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0<Class, String> f95163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k0<Class, d> f95164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k0<Class, Object[]> f95165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f95166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object[] f95167o;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.badlogic.gdx.utils.reflect.e f95168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Class f95169b;

        public a(com.badlogic.gdx.utils.reflect.e eVar) {
            this.f95168a = eVar;
            this.f95169b = eVar.e((com.badlogic.gdx.utils.reflect.c.r(k0.class, eVar.g()) || com.badlogic.gdx.utils.reflect.c.r(Map.class, eVar.g())) ? 1 : 0);
        }
    }

    public static abstract class b<T> implements d<T> {
        @Override // com.badlogic.gdx.utils.a0.d
        public void a(a0 a0Var, T t10, Class cls) {
        }

        @Override // com.badlogic.gdx.utils.a0.d
        public abstract T b(a0 a0Var, c0 c0Var, Class cls);
    }

    public interface c {
        void a(a0 a0Var);

        void b(a0 a0Var, c0 c0Var);
    }

    public interface d<T> {
        void a(a0 a0Var, T t10, Class cls);

        T b(a0 a0Var, c0 c0Var, Class cls);
    }

    public a0() {
        this.f95154b = "class";
        this.f95155c = true;
        this.f95159g = true;
        this.f95161i = new k0<>();
        this.f95162j = new k0<>();
        this.f95163k = new k0<>();
        this.f95164l = new k0<>();
        this.f95165m = new k0<>();
        this.f95166n = new Object[]{null};
        this.f95167o = new Object[]{null};
        this.f95156d = d0.c.minimal;
    }

    private String b(Enum r10) {
        return this.f95159g ? r10.name() : r10.toString();
    }

    private String c(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return obj instanceof Class ? ((Class) obj).getName() : String.valueOf(obj);
    }

    private Object[] o(Class cls) {
        if (!this.f95155c) {
            return null;
        }
        if (this.f95165m.d(cls)) {
            return this.f95165m.p(cls);
        }
        try {
            Object objT = t(cls);
            m0<String, a> m0VarP = p(cls);
            Object[] objArr = new Object[m0VarP.f95612a];
            this.f95165m.C(cls, objArr);
            k0.e<a> it = m0VarP.R().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                com.badlogic.gdx.utils.reflect.e eVar = it.next().f95168a;
                int i11 = i10 + 1;
                try {
                    objArr[i10] = eVar.a(objT);
                    i10 = i11;
                } catch (com.badlogic.gdx.utils.reflect.g e10) {
                    throw new y0("Error accessing field: " + eVar.f() + " (" + cls.getName() + ")", e10);
                } catch (y0 e11) {
                    e11.a(eVar + " (" + cls.getName() + ")");
                    throw e11;
                } catch (RuntimeException e12) {
                    y0 y0Var = new y0(e12);
                    y0Var.a(eVar + " (" + cls.getName() + ")");
                    throw y0Var;
                }
            }
            return objArr;
        } catch (Exception unused) {
            this.f95165m.C(cls, null);
            return null;
        }
    }

    private m0<String, a> p(Class cls) {
        m0<String, a> m0VarP = this.f95161i.p(cls);
        if (m0VarP != null) {
            return m0VarP;
        }
        com.badlogic.gdx.utils.b bVar = new com.badlogic.gdx.utils.b();
        for (Class superclass = cls; superclass != Object.class; superclass = superclass.getSuperclass()) {
            bVar.c(superclass);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = bVar.f95174b - 1; i10 >= 0; i10--) {
            Collections.addAll(arrayList, com.badlogic.gdx.utils.reflect.c.h((Class) bVar.get(i10)));
        }
        m0<String, a> m0Var = new m0<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.badlogic.gdx.utils.reflect.e eVar = (com.badlogic.gdx.utils.reflect.e) arrayList.get(i11);
            if (!eVar.q() && !eVar.o() && !eVar.p()) {
                if (!eVar.h()) {
                    try {
                        eVar.t(true);
                    } catch (AccessControlException unused) {
                    }
                }
                m0Var.C(eVar.f(), new a(eVar));
            }
        }
        this.f95161i.C(cls, m0Var);
        return m0Var;
    }

    public void A(Object obj, com.badlogic.gdx.utils.reflect.e eVar, String str, Class cls, c0 c0Var) {
        c0 c0VarK = c0Var.K(str);
        if (c0VarK == null) {
            return;
        }
        try {
            eVar.s(obj, H(eVar.g(), cls, c0VarK));
        } catch (com.badlogic.gdx.utils.reflect.g e10) {
            throw new y0("Error accessing field: " + eVar.f() + " (" + eVar.d().getName() + ")", e10);
        } catch (y0 e11) {
            e11.a(eVar.f() + " (" + eVar.d().getName() + ")");
            throw e11;
        } catch (RuntimeException e12) {
            y0 y0Var = new y0(e12);
            y0Var.a(eVar.f() + " (" + eVar.d().getName() + ")");
            throw y0Var;
        }
    }

    public void B(Object obj, String str, c0 c0Var) {
        E(obj, str, str, null, c0Var);
    }

    public void C(Object obj, String str, Class cls, c0 c0Var) {
        E(obj, str, str, cls, c0Var);
    }

    public void D(Object obj, String str, String str2, c0 c0Var) {
        E(obj, str, str2, null, c0Var);
    }

    public void E(Object obj, String str, String str2, Class cls, c0 c0Var) {
        Class<?> cls2 = obj.getClass();
        a aVarP = p(cls2).p(str);
        if (aVarP != null) {
            com.badlogic.gdx.utils.reflect.e eVar = aVarP.f95168a;
            if (cls == null) {
                cls = aVarP.f95169b;
            }
            A(obj, eVar, str2, cls, c0Var);
            return;
        }
        throw new y0("Field not found: " + str + " (" + cls2.getName() + ")");
    }

    public void F(Object obj, c0 c0Var) {
        Class<?> cls = obj.getClass();
        m0<String, a> m0VarP = p(cls);
        for (c0 c0Var2 = c0Var.f95234f; c0Var2 != null; c0Var2 = c0Var2.f95235g) {
            a aVarP = m0VarP.p(c0Var2.J0());
            if (aVarP != null) {
                com.badlogic.gdx.utils.reflect.e eVar = aVarP.f95168a;
                try {
                    eVar.s(obj, H(eVar.g(), aVarP.f95169b, c0Var2));
                } catch (com.badlogic.gdx.utils.reflect.g e10) {
                    throw new y0("Error accessing field: " + eVar.f() + " (" + cls.getName() + ")", e10);
                } catch (y0 e11) {
                    e11.a(eVar.f() + " (" + cls.getName() + ")");
                    throw e11;
                } catch (RuntimeException e12) {
                    y0 y0Var = new y0(e12);
                    y0Var.a(eVar.f() + " (" + cls.getName() + ")");
                    throw y0Var;
                }
            } else if (!this.f95158f) {
                throw new y0("Field not found: " + c0Var2.J0() + " (" + cls.getName() + ")");
            }
        }
    }

    public <T> T G(Class<T> cls, c0 c0Var) {
        return (T) H(cls, null, c0Var);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x026f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.badlogic.gdx.utils.c0] */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, com.badlogic.gdx.utils.c] */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, com.badlogic.gdx.utils.k0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> T H(Class<T> cls, Class cls2, c0 c0Var) {
        Class clsN;
        c0 c0Var2;
        c0 c0Var3;
        Class cls3;
        c0 c0Var4;
        boolean z10;
        Class cls4 = cls2;
        ?? r10 = (T) c0Var;
        if (r10 == 0) {
            return null;
        }
        if (r10.F0()) {
            String str = this.f95154b;
            String strN0 = str == null ? null : r10.n0(str, null);
            if (strN0 != null) {
                r10.V0(this.f95154b);
                clsN = n(strN0);
                if (clsN == null) {
                    try {
                        clsN = com.badlogic.gdx.utils.reflect.c.a(strN0);
                    } catch (com.badlogic.gdx.utils.reflect.g e10) {
                        throw new y0(e10);
                    }
                }
            } else {
                clsN = cls;
            }
            if (clsN == null) {
                d dVar = this.f95160h;
                return dVar != 0 ? (T) dVar.b(this, r10, clsN) : r10;
            }
            if (clsN == String.class || clsN == Integer.class || clsN == Boolean.class || clsN == Float.class || clsN == Long.class || clsN == Double.class || clsN == Short.class || clsN == Byte.class || clsN == Character.class || com.badlogic.gdx.utils.reflect.c.r(Enum.class, clsN)) {
                return (T) J("value", clsN, r10);
            }
            if (this.f95154b == null || !com.badlogic.gdx.utils.reflect.c.r(Collection.class, clsN)) {
                d dVarP = this.f95164l.p(clsN);
                if (dVarP != 0) {
                    return (T) dVarP.b(this, r10, clsN);
                }
                T t10 = (T) t(clsN);
                if (t10 instanceof c) {
                    ((c) t10).b(this, r10);
                    return t10;
                }
                if (t10 instanceof k0) {
                    ?? r11 = (T) ((k0) t10);
                    for (c0 c0Var5 = r10.f95234f; c0Var5 != null; c0Var5 = c0Var5.f95235g) {
                        r11.C(c0Var5.J0(), H(cls4, null, c0Var5));
                    }
                    return r11;
                }
                if (t10 instanceof com.badlogic.gdx.utils.c) {
                    ?? r12 = (T) ((com.badlogic.gdx.utils.c) t10);
                    for (c0 c0Var6 = r10.f95234f; c0Var6 != null; c0Var6 = c0Var6.f95235g) {
                        r12.D(c0Var6.J0(), H(cls4, null, c0Var6));
                    }
                    return r12;
                }
                if (!(t10 instanceof Map)) {
                    F(t10, r10);
                    return t10;
                }
                ?? r13 = (T) ((Map) t10);
                for (c0 c0Var7 = r10.f95234f; c0Var7 != null; c0Var7 = c0Var7.f95235g) {
                    r13.put(c0Var7.J0(), H(cls4, null, c0Var7));
                }
                return r13;
            }
            z10 = (T) r10.K("items");
        } else {
            clsN = cls;
        }
        if (clsN != null) {
            c0Var2 = r10;
            d dVarP2 = this.f95164l.p(clsN);
            if (dVarP2 != null) {
                c0Var2 = z10;
                return (T) dVarP2.b(this, c0Var2, clsN);
            }
        }
        c0Var2 = r10;
        c0Var2 = z10;
        c0Var2 = z10;
        String str2 = ")";
        if (c0Var2.t0()) {
            if (clsN == null || clsN == Object.class) {
                clsN = com.badlogic.gdx.utils.b.class;
            }
            if (com.badlogic.gdx.utils.reflect.c.r(com.badlogic.gdx.utils.b.class, clsN)) {
                Object obj = clsN == com.badlogic.gdx.utils.b.class ? (T) new com.badlogic.gdx.utils.b() : (T) ((com.badlogic.gdx.utils.b) t(clsN));
                for (c0 c0Var8 = c0Var2.f95234f; c0Var8 != null; c0Var8 = c0Var8.f95235g) {
                    ((com.badlogic.gdx.utils.b) obj).c(H(cls4, null, c0Var8));
                }
                return (T) obj;
            }
            if (com.badlogic.gdx.utils.reflect.c.r(Collection.class, clsN)) {
                T t11 = clsN.isInterface() ? (T) new ArrayList() : (T) ((Collection) t(clsN));
                for (c0 c0Var9 = c0Var2.f95234f; c0Var9 != null; c0Var9 = c0Var9.f95235g) {
                    ((Collection) t11).add(H(cls4, null, c0Var9));
                }
                return t11;
            }
            if (!clsN.isArray()) {
                throw new y0("Unable to convert value to required type: " + c0Var2 + " (" + clsN.getName() + ")");
            }
            Class<?> componentType = clsN.getComponentType();
            if (cls4 == null) {
                cls4 = componentType;
            }
            T t12 = (T) com.badlogic.gdx.utils.reflect.b.c(componentType, c0Var2.f95237i);
            c0 c0Var10 = c0Var2.f95234f;
            int i10 = 0;
            while (c0Var10 != null) {
                com.badlogic.gdx.utils.reflect.b.d(t12, i10, H(cls4, null, c0Var10));
                c0Var10 = c0Var10.f95235g;
                i10++;
            }
            return t12;
        }
        boolean zD0 = c0Var2.D0();
        Class cls5 = Double.TYPE;
        Class cls6 = Long.TYPE;
        Class cls7 = Integer.TYPE;
        c0 c0Var11 = c0Var2;
        Class cls8 = Float.TYPE;
        if (zD0) {
            try {
                if (clsN == null || clsN == cls8 || clsN == Float.class) {
                    return (T) Float.valueOf(c0Var11.s());
                }
                if (clsN == cls7 || clsN == Integer.class) {
                    return (T) Integer.valueOf(c0Var11.u());
                }
                if (clsN == cls6 || clsN == Long.class) {
                    return (T) Long.valueOf(c0Var11.w());
                }
                if (clsN == cls5 || clsN == Double.class) {
                    return (T) Double.valueOf(c0Var11.p());
                }
                if (clsN != String.class) {
                    if (clsN != Short.TYPE && clsN != Short.class) {
                        if (clsN == Byte.TYPE || clsN == Byte.class) {
                            return (T) Byte.valueOf(c0Var11.k());
                        }
                    }
                    return (T) Short.valueOf(c0Var11.B());
                }
                try {
                    return (T) c0Var11.D();
                } catch (NumberFormatException unused) {
                }
                c0Var3 = new c0(c0Var11.D());
            } catch (NumberFormatException unused2) {
            }
        } else {
            str2 = ")";
            c0Var3 = c0Var11;
        }
        if (!c0Var3.u0()) {
            cls3 = Boolean.class;
            c0Var4 = c0Var3;
        } else {
            if (clsN == null) {
                cls3 = Boolean.class;
                return (T) Boolean.valueOf(c0Var3.c());
            }
            try {
                if (clsN != Boolean.TYPE) {
                    cls3 = Boolean.class;
                    if (clsN == cls3) {
                    }
                    c0Var4 = new c0(c0Var3.D());
                } else {
                    cls3 = Boolean.class;
                }
                try {
                    return (T) Boolean.valueOf(c0Var3.c());
                } catch (NumberFormatException unused3) {
                }
            } catch (NumberFormatException unused4) {
                cls3 = Boolean.class;
            }
        }
        if (!c0Var4.G0()) {
            return null;
        }
        ?? r14 = (T) c0Var4.D();
        if (clsN != null && clsN != String.class) {
            try {
                if (clsN == cls7 || clsN == Integer.class) {
                    return (T) Integer.valueOf((String) r14);
                }
                if (clsN == cls8 || clsN == Float.class) {
                    return (T) Float.valueOf((String) r14);
                }
                if (clsN == cls6 || clsN == Long.class) {
                    return (T) Long.valueOf((String) r14);
                }
                if (clsN == cls5 || clsN == Double.class) {
                    return (T) Double.valueOf((String) r14);
                }
                if (clsN != Short.TYPE && clsN != Short.class) {
                    if (clsN == Byte.TYPE || clsN == Byte.class) {
                        return (T) Byte.valueOf((String) r14);
                    }
                    if (clsN == Boolean.TYPE || clsN == cls3) {
                        return (T) Boolean.valueOf((String) r14);
                    }
                    if (clsN == Character.TYPE || clsN == Character.class) {
                        return (T) Character.valueOf(r14.charAt(0));
                    }
                    if (com.badlogic.gdx.utils.reflect.c.r(Enum.class, clsN)) {
                        for (Object obj2 : (Enum[]) clsN.getEnumConstants()) {
                            ?? r15 = (T) obj2;
                            if (r14.equals(b(r15))) {
                                return r15;
                            }
                        }
                    }
                    if (clsN != CharSequence.class) {
                        throw new y0("Unable to convert value to required type: " + c0Var4 + " (" + clsN.getName() + str2);
                    }
                }
                return (T) Short.valueOf((String) r14);
            } catch (NumberFormatException unused5) {
            }
        }
        return r14;
    }

    public <T> T I(Class<T> cls, Class cls2, T t10, c0 c0Var) {
        return (T) H(cls, cls2, c0Var);
    }

    public <T> T J(String str, Class<T> cls, c0 c0Var) {
        return (T) H(cls, null, c0Var.K(str));
    }

    public <T> T K(String str, Class<T> cls, Class cls2, c0 c0Var) {
        return (T) H(cls, cls2, c0Var.K(str));
    }

    public <T> T L(String str, Class<T> cls, Class cls2, T t10, c0 c0Var) {
        c0 c0VarK = c0Var.K(str);
        return c0VarK == null ? t10 : (T) H(cls, cls2, c0VarK);
    }

    public <T> T M(String str, Class<T> cls, T t10, c0 c0Var) {
        c0 c0VarK = c0Var.K(str);
        return c0VarK == null ? t10 : (T) H(cls, null, c0VarK);
    }

    public void N(d dVar) {
        this.f95160h = dVar;
    }

    public void O(Class cls, String str, Class cls2) {
        a aVarP = p(cls).p(str);
        if (aVarP != null) {
            aVarP.f95169b = cls2;
            return;
        }
        throw new y0("Field not found: " + str + " (" + cls.getName() + ")");
    }

    public void P(boolean z10) {
        this.f95159g = z10;
    }

    public void Q(boolean z10) {
        this.f95158f = z10;
    }

    public void R(d0.c cVar) {
        this.f95156d = cVar;
    }

    public void S(boolean z10) {
        this.f95157e = z10;
    }

    public <T> void T(Class<T> cls, d<T> dVar) {
        this.f95164l.C(cls, dVar);
    }

    public void U(String str) {
        this.f95154b = str;
    }

    public void V(boolean z10) {
        this.f95155c = z10;
    }

    public void W(Writer writer) {
        if (!(writer instanceof d0)) {
            writer = new d0(writer);
        }
        d0 d0Var = (d0) writer;
        this.f95153a = d0Var;
        d0Var.o(this.f95156d);
        this.f95153a.q(this.f95157e);
    }

    public String X(Object obj) {
        return Z(obj, obj == null ? null : obj.getClass(), null);
    }

    public String Y(Object obj, Class cls) {
        return Z(obj, cls, null);
    }

    public String Z(Object obj, Class cls, Class cls2) {
        StringWriter stringWriter = new StringWriter();
        f0(obj, cls, cls2, stringWriter);
        return stringWriter.toString();
    }

    public void a(String str, Class cls) {
        this.f95162j.C(str, cls);
        this.f95163k.C(cls, str);
    }

    public void a0(Object obj, com.badlogic.gdx.files.a aVar) {
        e0(obj, obj == null ? null : obj.getClass(), null, aVar);
    }

    public void b0(Object obj, Writer writer) {
        f0(obj, obj == null ? null : obj.getClass(), null, writer);
    }

    public void c0(Object obj, Class cls, com.badlogic.gdx.files.a aVar) {
        e0(obj, cls, null, aVar);
    }

    public <T> T d(Class<T> cls, com.badlogic.gdx.files.a aVar) {
        try {
            return (T) H(cls, null, new b0().b(aVar));
        } catch (Exception e10) {
            throw new y0("Error reading file: " + aVar, e10);
        }
    }

    public void d0(Object obj, Class cls, Writer writer) {
        f0(obj, cls, null, writer);
    }

    public <T> T e(Class<T> cls, InputStream inputStream) {
        return (T) H(cls, null, new b0().a(inputStream));
    }

    public void e0(Object obj, Class cls, Class cls2, com.badlogic.gdx.files.a aVar) {
        Writer writerV = null;
        try {
            try {
                writerV = aVar.V(false, "UTF-8");
                f0(obj, cls, cls2, writerV);
                e1.a(writerV);
            } catch (Exception e10) {
                throw new y0("Error writing file: " + aVar, e10);
            }
        } catch (Throwable th2) {
            e1.a(writerV);
            throw th2;
        }
    }

    public <T> T f(Class<T> cls, Reader reader) {
        return (T) H(cls, null, new b0().q(reader));
    }

    public void f0(Object obj, Class cls, Class cls2, Writer writer) {
        W(writer);
        try {
            w0(obj, cls, cls2);
        } finally {
            e1.a(this.f95153a);
            this.f95153a = null;
        }
    }

    public <T> T g(Class<T> cls, Class cls2, com.badlogic.gdx.files.a aVar) {
        try {
            return (T) H(cls, cls2, new b0().b(aVar));
        } catch (Exception e10) {
            throw new y0("Error reading file: " + aVar, e10);
        }
    }

    public void g0() {
        try {
            this.f95153a.j();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public <T> T h(Class<T> cls, Class cls2, InputStream inputStream) {
        return (T) H(cls, cls2, new b0().a(inputStream));
    }

    public void h0() {
        try {
            this.f95153a.a();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public <T> T i(Class<T> cls, Class cls2, Reader reader) {
        return (T) H(cls, cls2, new b0().q(reader));
    }

    public void i0(String str) {
        try {
            this.f95153a.f(str);
            this.f95153a.a();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public <T> T j(Class<T> cls, Class cls2, String str) {
        return (T) H(cls, cls2, new b0().r(str));
    }

    public void j0(Object obj, String str) {
        m0(obj, str, str, null);
    }

    public <T> T k(Class<T> cls, Class cls2, char[] cArr, int i10, int i11) {
        return (T) H(cls, cls2, new b0().s(cArr, i10, i11));
    }

    public void k0(Object obj, String str, Class cls) {
        m0(obj, str, str, cls);
    }

    public <T> T l(Class<T> cls, String str) {
        return (T) H(cls, null, new b0().r(str));
    }

    public void l0(Object obj, String str, String str2) {
        m0(obj, str, str2, null);
    }

    public <T> T m(Class<T> cls, char[] cArr, int i10, int i11) {
        return (T) H(cls, null, new b0().s(cArr, i10, i11));
    }

    public void m0(Object obj, String str, String str2, Class cls) {
        Class<?> cls2 = obj.getClass();
        a aVarP = p(cls2).p(str);
        if (aVarP == null) {
            throw new y0("Field not found: " + str + " (" + cls2.getName() + ")");
        }
        com.badlogic.gdx.utils.reflect.e eVar = aVarP.f95168a;
        if (cls == null) {
            cls = aVarP.f95169b;
        }
        try {
            this.f95153a.f(str2);
            w0(eVar.a(obj), eVar.g(), cls);
        } catch (com.badlogic.gdx.utils.reflect.g e10) {
            throw new y0("Error accessing field: " + eVar.f() + " (" + cls2.getName() + ")", e10);
        } catch (y0 e11) {
            e11.a(eVar + " (" + cls2.getName() + ")");
            throw e11;
        } catch (Exception e12) {
            y0 y0Var = new y0(e12);
            y0Var.a(eVar + " (" + cls2.getName() + ")");
            throw y0Var;
        }
    }

    public Class n(String str) {
        return this.f95162j.p(str);
    }

    public void n0(Object obj) {
        Class<?> cls = obj.getClass();
        Object[] objArrO = o(cls);
        k0.d it = new m0.c(p(cls)).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            com.badlogic.gdx.utils.reflect.e eVar = aVar.f95168a;
            try {
                Object objA = eVar.a(obj);
                if (objArrO != null) {
                    int i11 = i10 + 1;
                    Object obj2 = objArrO[i10];
                    if (objA != null || obj2 != null) {
                        if (objA != null && obj2 != null) {
                            if (!objA.equals(obj2)) {
                                if (objA.getClass().isArray() && obj2.getClass().isArray()) {
                                    Object[] objArr = this.f95166n;
                                    objArr[0] = objA;
                                    Object[] objArr2 = this.f95167o;
                                    objArr2[0] = obj2;
                                    if (Arrays.deepEquals(objArr, objArr2)) {
                                    }
                                }
                            }
                        }
                        i10 = i11;
                    }
                    i10 = i11;
                }
                this.f95153a.f(eVar.f());
                w0(objA, eVar.g(), aVar.f95169b);
            } catch (com.badlogic.gdx.utils.reflect.g e10) {
                throw new y0("Error accessing field: " + eVar.f() + " (" + cls.getName() + ")", e10);
            } catch (y0 e11) {
                e11.a(eVar + " (" + cls.getName() + ")");
                throw e11;
            } catch (Exception e12) {
                y0 y0Var = new y0(e12);
                y0Var.a(eVar + " (" + cls.getName() + ")");
                throw y0Var;
            }
        }
    }

    public void o0() {
        try {
            this.f95153a.j();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public void p0() {
        try {
            this.f95153a.g();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public <T> d<T> q(Class<T> cls) {
        return this.f95164l.p(cls);
    }

    public void q0(Class cls, Class cls2) {
        try {
            this.f95153a.g();
            if (cls2 != null && cls2 == cls) {
                return;
            }
            t0(cls);
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public String r(Class cls) {
        return this.f95163k.p(cls);
    }

    public void r0(String str) {
        try {
            this.f95153a.f(str);
            p0();
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public d0 s() {
        return this.f95153a;
    }

    public void s0(String str, Class cls, Class cls2) {
        try {
            this.f95153a.f(str);
            q0(cls, cls2);
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    protected Object t(Class cls) {
        try {
            return com.badlogic.gdx.utils.reflect.c.v(cls);
        } catch (Exception e10) {
            e = e10;
            try {
                com.badlogic.gdx.utils.reflect.d dVarF = com.badlogic.gdx.utils.reflect.c.f(cls, new Class[0]);
                dVarF.e(true);
                return dVarF.d(new Object[0]);
            } catch (com.badlogic.gdx.utils.reflect.g unused) {
                if (com.badlogic.gdx.utils.reflect.c.r(Enum.class, cls)) {
                    if (cls.getEnumConstants() == null) {
                        cls = cls.getSuperclass();
                    }
                    return cls.getEnumConstants()[0];
                }
                if (cls.isArray()) {
                    throw new y0("Encountered JSON object when expected array of type: " + cls.getName(), e);
                }
                if (!com.badlogic.gdx.utils.reflect.c.t(cls) || com.badlogic.gdx.utils.reflect.c.u(cls)) {
                    throw new y0("Class cannot be created (missing no-arg constructor): " + cls.getName(), e);
                }
                throw new y0("Class cannot be created (non-static member class): " + cls.getName(), e);
            } catch (SecurityException unused2) {
                throw new y0("Error constructing instance of class: " + cls.getName(), e);
            } catch (Exception e11) {
                e = e11;
                throw new y0("Error constructing instance of class: " + cls.getName(), e);
            }
        }
    }

    public void t0(Class cls) {
        if (this.f95154b == null) {
            return;
        }
        String strR = r(cls);
        if (strR == null) {
            strR = cls.getName();
        }
        try {
            this.f95153a.m(this.f95154b, strR);
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public String u(Object obj) {
        return v(obj, 0);
    }

    public void u0(Object obj) {
        if (obj == null) {
            w0(obj, null, null);
        } else {
            w0(obj, obj.getClass(), null);
        }
    }

    public String v(Object obj, int i10) {
        return y(X(obj), i10);
    }

    public void v0(Object obj, Class cls) {
        w0(obj, cls, null);
    }

    public String w(Object obj, c0.c cVar) {
        return z(X(obj), cVar);
    }

    public void w0(Object obj, Class cls, Class cls2) {
        Class cls3 = cls;
        try {
            if (obj == null) {
                this.f95153a.r(null);
                return;
            }
            if ((cls3 != null && cls3.isPrimitive()) || cls3 == String.class || cls3 == Integer.class || cls3 == Boolean.class || cls3 == Float.class || cls3 == Long.class || cls3 == Double.class || cls3 == Short.class || cls3 == Byte.class || cls3 == Character.class) {
                this.f95153a.r(obj);
                return;
            }
            Class<?> superclass = obj.getClass();
            if (superclass.isPrimitive() || superclass == String.class || superclass == Integer.class || superclass == Boolean.class || superclass == Float.class || superclass == Long.class || superclass == Double.class || superclass == Short.class || superclass == Byte.class || superclass == Character.class) {
                q0(superclass, null);
                x0("value", obj);
                o0();
                return;
            }
            if (obj instanceof c) {
                q0(superclass, cls3);
                ((c) obj).a(this);
                o0();
                return;
            }
            d dVarP = this.f95164l.p(superclass);
            if (dVarP != null) {
                dVarP.a(this, obj, cls3);
                return;
            }
            int i10 = 0;
            if (obj instanceof com.badlogic.gdx.utils.b) {
                if (cls3 != null && superclass != cls3 && superclass != com.badlogic.gdx.utils.b.class) {
                    throw new y0("Serialization of an Array other than the known type is not supported.\nKnown type: " + cls3 + "\nActual type: " + superclass);
                }
                h0();
                com.badlogic.gdx.utils.b bVar = (com.badlogic.gdx.utils.b) obj;
                int i11 = bVar.f95174b;
                while (i10 < i11) {
                    w0(bVar.get(i10), cls2, null);
                    i10++;
                }
                g0();
                return;
            }
            if (obj instanceof Collection) {
                if (this.f95154b == null || superclass == ArrayList.class || (cls3 != null && cls3 == superclass)) {
                    h0();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        w0(it.next(), cls2, null);
                    }
                    g0();
                    return;
                }
                q0(superclass, cls3);
                i0("items");
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    w0(it2.next(), cls2, null);
                }
                g0();
                o0();
                return;
            }
            if (superclass.isArray()) {
                Class componentType = cls2 == null ? superclass.getComponentType() : cls2;
                int iB = com.badlogic.gdx.utils.reflect.b.b(obj);
                h0();
                while (i10 < iB) {
                    w0(com.badlogic.gdx.utils.reflect.b.a(obj, i10), componentType, null);
                    i10++;
                }
                g0();
                return;
            }
            if (obj instanceof k0) {
                if (cls3 == null) {
                    cls3 = k0.class;
                }
                q0(superclass, cls3);
                k0.a it3 = ((k0) obj).m().iterator();
                while (it3.hasNext()) {
                    k0.b next = it3.next();
                    this.f95153a.f(c(next.f95630a));
                    w0(next.f95631b, cls2, null);
                }
                o0();
                return;
            }
            if (obj instanceof com.badlogic.gdx.utils.c) {
                if (cls3 == null) {
                    cls3 = com.badlogic.gdx.utils.c.class;
                }
                q0(superclass, cls3);
                com.badlogic.gdx.utils.c cVar = (com.badlogic.gdx.utils.c) obj;
                int i12 = cVar.f95211c;
                while (i10 < i12) {
                    this.f95153a.f(c(cVar.f95209a[i10]));
                    w0(cVar.f95210b[i10], cls2, null);
                    i10++;
                }
                o0();
                return;
            }
            if (obj instanceof Map) {
                if (cls3 == null) {
                    cls3 = HashMap.class;
                }
                q0(superclass, cls3);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    this.f95153a.f(c(entry.getKey()));
                    w0(entry.getValue(), cls2, null);
                }
                o0();
                return;
            }
            if (!com.badlogic.gdx.utils.reflect.c.r(Enum.class, superclass)) {
                q0(superclass, cls3);
                n0(obj);
                o0();
            } else {
                if (this.f95154b == null || (cls3 != null && cls3 == superclass)) {
                    this.f95153a.r(b((Enum) obj));
                    return;
                }
                if (superclass.getEnumConstants() == null) {
                    superclass = superclass.getSuperclass();
                }
                q0(superclass, null);
                this.f95153a.f("value");
                this.f95153a.r(b((Enum) obj));
                o0();
            }
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public String x(String str) {
        return y(str, 0);
    }

    public void x0(String str, Object obj) {
        try {
            this.f95153a.f(str);
            if (obj == null) {
                w0(obj, null, null);
            } else {
                w0(obj, obj.getClass(), null);
            }
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public String y(String str, int i10) {
        return new b0().r(str).N0(this.f95156d, i10);
    }

    public void y0(String str, Object obj, Class cls) {
        try {
            this.f95153a.f(str);
            w0(obj, cls, null);
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public String z(String str, c0.c cVar) {
        return new b0().r(str).L0(cVar);
    }

    public void z0(String str, Object obj, Class cls, Class cls2) {
        try {
            this.f95153a.f(str);
            w0(obj, cls, cls2);
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public a0(d0.c cVar) {
        this.f95154b = "class";
        this.f95155c = true;
        this.f95159g = true;
        this.f95161i = new k0<>();
        this.f95162j = new k0<>();
        this.f95163k = new k0<>();
        this.f95164l = new k0<>();
        this.f95165m = new k0<>();
        this.f95166n = new Object[]{null};
        this.f95167o = new Object[]{null};
        this.f95156d = cVar;
    }
}
