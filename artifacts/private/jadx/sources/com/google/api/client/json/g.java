package com.google.api.client.json;

import com.google.api.client.util.h0;
import com.google.api.client.util.j0;
import com.google.api.client.util.n;
import com.google.api.client.util.q0;
import com.google.api.client.util.r;
import com.google.api.client.util.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<Class<?>, Field> f115768a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lock f115769b = new ReentrantLock();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115770a;

        static {
            int[] iArr = new int[j.values().length];
            f115770a = iArr;
            try {
                iArr[j.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115770a[j.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115770a[j.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115770a[j.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115770a[j.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115770a[j.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115770a[j.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f115770a[j.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f115770a[j.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f115770a[j.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f115770a[j.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void C(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, com.google.api.client.json.a aVar) throws IOException {
        j jVarP = P();
        while (jVarP != j.END_ARRAY) {
            g gVar = this;
            collection.add(gVar.K(field, type, arrayList, collection, aVar, true));
            jVarP = gVar.o();
            this = gVar;
        }
    }

    private void J(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, com.google.api.client.json.a aVar) throws IOException {
        j jVarP = P();
        while (jVarP == j.FIELD_NAME) {
            String strN = this.n();
            this.o();
            if (aVar != null && aVar.d(map, strN)) {
                return;
            }
            g gVar = this;
            map.put(strN, gVar.K(field, type, arrayList, map, aVar, true));
            jVarP = gVar.o();
            this = gVar;
        }
    }

    private final Object K(Field field, Type type, ArrayList<Type> arrayList, Object obj, com.google.api.client.json.a aVar, boolean z10) throws IOException {
        g gVar;
        Class<?> clsRef;
        Field field2 = field;
        Type typeK = n.k(arrayList, type);
        Type typeD = null;
        Class<?> clsG = typeK instanceof Class ? (Class) typeK : null;
        if (typeK instanceof ParameterizedType) {
            clsG = q0.g((ParameterizedType) typeK);
        }
        if (clsG == Void.class) {
            L();
            return null;
        }
        j jVarF = f();
        try {
            int i10 = a.f115770a[f().ordinal()];
            Class<?> cls = Double.TYPE;
            Class<?> cls2 = Float.TYPE;
            try {
                switch (i10) {
                    case 1:
                    case 4:
                    case 5:
                        h0.c(!q0.j(typeK), "expected object or map type but got %s", typeK);
                        Field fieldD = z10 ? d(clsG) : null;
                        Object objC = (clsG == null || aVar == null) ? null : aVar.c(obj, clsG);
                        boolean z11 = clsG != null && q0.k(clsG, Map.class);
                        if (fieldD != null) {
                            objC = new b();
                        } else if (objC == null) {
                            objC = (z11 || clsG == null) ? n.h(clsG) : q0.m(clsG);
                        }
                        int size = arrayList.size();
                        if (typeK != null) {
                            arrayList.add(typeK);
                        }
                        if (z11 && !s.class.isAssignableFrom(clsG)) {
                            Type typeE = Map.class.isAssignableFrom(clsG) ? q0.e(typeK) : null;
                            if (typeE != null) {
                                J(field, (Map) objC, typeE, arrayList, aVar);
                                return objC;
                            }
                        }
                        gVar = this;
                        try {
                            gVar.v(arrayList, objC, aVar);
                            if (typeK != null) {
                                arrayList.remove(size);
                            }
                            if (fieldD == null) {
                                return objC;
                            }
                            Object obj2 = ((b) objC).get(fieldD.getName());
                            h0.b(obj2 != null, "No value specified for @JsonPolymorphicTypeMap field");
                            String string = obj2.toString();
                            h.a[] aVarArrTypeDefinitions = ((h) fieldD.getAnnotation(h.class)).typeDefinitions();
                            int length = aVarArrTypeDefinitions.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    h.a aVar2 = aVarArrTypeDefinitions[i11];
                                    if (aVar2.key().equals(string)) {
                                        clsRef = aVar2.ref();
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    clsRef = null;
                                }
                            }
                            h0.b(clsRef != null, "No TypeDef annotation found with key: " + string);
                            d dVarI = gVar.i();
                            g gVarG = dVarI.g(dVarI.o(objC));
                            gVarG.O();
                            try {
                                return gVarG.K(field, clsRef, arrayList, null, null, false);
                            } catch (IllegalArgumentException e10) {
                                e = e10;
                                field2 = field;
                            }
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            field2 = field;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String strE = gVar.e();
                        if (strE != null) {
                            sb2.append("key ");
                            sb2.append(strE);
                        }
                        if (field2 != null) {
                            if (strE != null) {
                                sb2.append(", ");
                            }
                            sb2.append("field ");
                            sb2.append(field2);
                        }
                        throw new IllegalArgumentException(sb2.toString(), e);
                    case 2:
                    case 3:
                        boolean zJ = q0.j(typeK);
                        h0.c(typeK == null || zJ || (clsG != null && q0.k(clsG, Collection.class)), "expected collection or array type but got %s", typeK);
                        Collection<Object> collectionB = (aVar == null || field2 == null) ? null : aVar.b(obj, field2);
                        if (collectionB == null) {
                            collectionB = n.g(typeK);
                        }
                        if (zJ) {
                            typeD = q0.b(typeK);
                        } else if (clsG != null && Iterable.class.isAssignableFrom(clsG)) {
                            typeD = q0.d(typeK);
                        }
                        Type typeK2 = n.k(arrayList, typeD);
                        Collection<Object> collection = collectionB;
                        C(field2, collection, typeK2, arrayList, aVar);
                        return zJ ? q0.o(collection, q0.f(arrayList, typeK2)) : collection;
                    case 6:
                    case 7:
                        h0.c(typeK == null || clsG == Boolean.TYPE || (clsG != null && clsG.isAssignableFrom(Boolean.class)), "expected type Boolean or boolean but got %s", typeK);
                        return jVarF == j.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
                    case 8:
                    case 9:
                        h0.b(field2 == null || field2.getAnnotation(i.class) == null, "number type formatted as a JSON number cannot use @JsonString annotation");
                        if (clsG != null && !clsG.isAssignableFrom(BigDecimal.class)) {
                            if (clsG == BigInteger.class) {
                                return b();
                            }
                            if (clsG != Double.class && clsG != cls) {
                                if (clsG != Long.class && clsG != Long.TYPE) {
                                    if (clsG != Float.class && clsG != cls2) {
                                        if (clsG != Integer.class && clsG != Integer.TYPE) {
                                            if (clsG != Short.class && clsG != Short.TYPE) {
                                                if (clsG != Byte.class && clsG != Byte.TYPE) {
                                                    throw new IllegalArgumentException("expected numeric type but got " + typeK);
                                                }
                                                return Byte.valueOf(c());
                                            }
                                            return Short.valueOf(m());
                                        }
                                        return Integer.valueOf(k());
                                    }
                                    return Float.valueOf(j());
                                }
                                return Long.valueOf(l());
                            }
                            return Double.valueOf(h());
                        }
                        return g();
                    case 10:
                        String lowerCase = n().trim().toLowerCase(Locale.US);
                        if ((clsG != cls2 && clsG != Float.class && clsG != cls && clsG != Double.class) || (!lowerCase.equals("nan") && !lowerCase.equals("infinity") && !lowerCase.equals("-infinity"))) {
                            h0.b((clsG != null && Number.class.isAssignableFrom(clsG) && (field2 == null || field2.getAnnotation(i.class) == null)) ? false : true, "number field formatted as a JSON string must use the @JsonString annotation");
                        }
                        return n.j(typeK, n());
                    case 11:
                        h0.b(clsG == null || !clsG.isPrimitive(), "primitive number field but found a JSON null");
                        if (clsG != null && (clsG.getModifiers() & 1536) != 0) {
                            if (q0.k(clsG, Collection.class)) {
                                return n.i(n.g(typeK).getClass());
                            }
                            if (q0.k(clsG, Map.class)) {
                                return n.i(n.h(clsG).getClass());
                            }
                        }
                        return n.i(q0.f(arrayList, typeK));
                    default:
                        throw new IllegalArgumentException("unexpected JSON node type: " + jVarF);
                }
            } catch (IllegalArgumentException e12) {
                e = e12;
                gVar = this;
            }
        } catch (IllegalArgumentException e13) {
            e = e13;
            gVar = this;
        }
    }

    private j O() throws IOException {
        j jVarF = f();
        if (jVarF == null) {
            jVarF = o();
        }
        h0.b(jVarF != null, "no JSON input found");
        return jVarF;
    }

    private j P() throws IOException {
        j jVarO = O();
        int i10 = a.f115770a[jVarO.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            return i10 != 2 ? jVarO : o();
        }
        j jVarO2 = o();
        if (jVarO2 != j.FIELD_NAME && jVarO2 != j.END_OBJECT) {
            z10 = false;
        }
        h0.b(z10, jVarO2);
        return jVarO2;
    }

    private static Field d(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f115769b;
        lock.lock();
        try {
            if (f115768a.containsKey(cls)) {
                Field field2 = f115768a.get(cls);
                lock.unlock();
                return field2;
            }
            Iterator<r> it = com.google.api.client.util.k.h(cls).c().iterator();
            while (it.hasNext()) {
                Field fieldC = it.next().c();
                h hVar = (h) fieldC.getAnnotation(h.class);
                if (hVar != null) {
                    boolean z10 = true;
                    h0.c(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    h0.c(n.d(fieldC.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, fieldC.getType());
                    h.a[] aVarArrTypeDefinitions = hVar.typeDefinitions();
                    HashSet hashSetA = j0.a();
                    if (aVarArrTypeDefinitions.length <= 0) {
                        z10 = false;
                    }
                    h0.b(z10, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (h.a aVar : aVarArrTypeDefinitions) {
                        h0.c(hashSetA.add(aVar.key()), "Class contains two @TypeDef annotations with identical key: %s", aVar.key());
                    }
                    field = fieldC;
                }
            }
            f115768a.put(cls, field);
            f115769b.unlock();
            return field;
        } catch (Throwable th2) {
            f115769b.unlock();
            throw th2;
        }
    }

    private void v(ArrayList<Type> arrayList, Object obj, com.google.api.client.json.a aVar) throws IOException {
        if (obj instanceof b) {
            ((b) obj).j(i());
        }
        j jVarP = P();
        Class<?> cls = obj.getClass();
        com.google.api.client.util.k kVarH = com.google.api.client.util.k.h(cls);
        boolean zIsAssignableFrom = s.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom && Map.class.isAssignableFrom(cls)) {
            J(null, (Map) obj, q0.e(cls), arrayList, aVar);
            return;
        }
        while (jVarP == j.FIELD_NAME) {
            String strN = n();
            o();
            if (aVar != null && aVar.d(obj, strN)) {
                break;
            }
            r rVarB = kVarH.b(strN);
            if (rVarB != null) {
                if (rVarB.i() && !rVarB.j()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                Field fieldC = rVarB.c();
                int size = arrayList.size();
                arrayList.add(fieldC.getGenericType());
                Object objK = K(fieldC, rVarB.e(), arrayList, obj, aVar, true);
                arrayList.remove(size);
                rVarB.n(obj, objK);
            } else if (zIsAssignableFrom) {
                ((s) obj).p(strN, K(null, null, arrayList, obj, aVar, true));
            } else {
                if (aVar != null) {
                    aVar.a(obj, strN);
                }
                L();
            }
            jVarP = o();
        }
    }

    public final <T> Collection<T> A(Class<?> cls, Class<T> cls2) throws IOException {
        return B(cls, cls2, null);
    }

    @com.google.api.client.util.f
    public final <T> Collection<T> B(Class<?> cls, Class<T> cls2, com.google.api.client.json.a aVar) throws IOException {
        Collection<T> collection = (Collection<T>) n.g(cls);
        E(collection, cls2, aVar);
        return collection;
    }

    public final <T> void D(Collection<? super T> collection, Class<T> cls) throws IOException {
        E(collection, cls, null);
    }

    @com.google.api.client.util.f
    public final <T> void E(Collection<? super T> collection, Class<T> cls, com.google.api.client.json.a aVar) throws IOException {
        C(null, collection, cls, new ArrayList<>(), aVar);
    }

    public final <T> Collection<T> F(Class<?> cls, Class<T> cls2) throws IOException {
        return G(cls, cls2, null);
    }

    @com.google.api.client.util.f
    public final <T> Collection<T> G(Class<?> cls, Class<T> cls2, com.google.api.client.json.a aVar) throws IOException {
        try {
            return B(cls, cls2, aVar);
        } finally {
            a();
        }
    }

    public final <T> void H(Collection<? super T> collection, Class<T> cls) throws IOException {
        I(collection, cls, null);
    }

    @com.google.api.client.util.f
    public final <T> void I(Collection<? super T> collection, Class<T> cls, com.google.api.client.json.a aVar) throws IOException {
        try {
            E(collection, cls, aVar);
            a();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    public abstract g L() throws IOException;

    public final String M(Set<String> set) throws IOException {
        j jVarP = P();
        while (jVarP == j.FIELD_NAME) {
            String strN = n();
            o();
            if (set.contains(strN)) {
                return strN;
            }
            L();
            jVarP = o();
        }
        return null;
    }

    public final void N(String str) throws IOException {
        M(Collections.singleton(str));
    }

    public abstract void a() throws IOException;

    public abstract BigInteger b() throws IOException;

    public abstract byte c() throws IOException;

    public abstract String e() throws IOException;

    public abstract j f();

    public abstract BigDecimal g() throws IOException;

    public abstract double h() throws IOException;

    public abstract d i();

    public abstract float j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract short m() throws IOException;

    public abstract String n() throws IOException;

    public abstract j o() throws IOException;

    public final <T> T p(Class<T> cls) throws IOException {
        return (T) q(cls, null);
    }

    @com.google.api.client.util.f
    public final <T> T q(Class<T> cls, com.google.api.client.json.a aVar) throws IOException {
        return (T) s(cls, false, aVar);
    }

    public Object r(Type type, boolean z10) throws IOException {
        return s(type, z10, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:? A[SYNTHETIC] */
    @com.google.api.client.util.f
    public Object s(Type type, boolean z10, com.google.api.client.json.a aVar) throws Throwable {
        g gVar;
        Throwable th2;
        try {
            if (!Void.class.equals(type)) {
                try {
                    O();
                } catch (Throwable th3) {
                    th2 = th3;
                    gVar = this;
                    if (z10) {
                        throw th2;
                    }
                    gVar.a();
                    throw th2;
                }
            }
            gVar = this;
            try {
                Object objK = gVar.K(null, type, new ArrayList<>(), null, aVar, true);
                if (z10) {
                    gVar.a();
                }
                return objK;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                if (z10) {
                    throw th2;
                }
                gVar.a();
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            gVar = this;
        }
    }

    public final void t(Object obj) throws IOException {
        u(obj, null);
    }

    @com.google.api.client.util.f
    public final void u(Object obj, com.google.api.client.json.a aVar) throws IOException {
        ArrayList<Type> arrayList = new ArrayList<>();
        arrayList.add(obj.getClass());
        v(arrayList, obj, aVar);
    }

    public final <T> T w(Class<T> cls) throws IOException {
        return (T) x(cls, null);
    }

    @com.google.api.client.util.f
    public final <T> T x(Class<T> cls, com.google.api.client.json.a aVar) throws IOException {
        try {
            T t10 = (T) q(cls, aVar);
            a();
            return t10;
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    public final void y(Object obj) throws IOException {
        z(obj, null);
    }

    @com.google.api.client.util.f
    public final void z(Object obj, com.google.api.client.json.a aVar) throws IOException {
        try {
            u(obj, aVar);
            a();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
