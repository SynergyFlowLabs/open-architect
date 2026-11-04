package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import com.google.gson.internal.f0;
import com.google.gson.internal.h0;
import com.google.gson.internal.i0;
import com.google.gson.internal.k0;
import com.google.gson.internal.v;
import com.google.gson.internal.w;
import com.google.gson.internal.y;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.d f125367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f125368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.e f125369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<x> f125370e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends b0<T> {
        a() {
        }

        @Override // com.google.gson.b0
        public T read(com.google.gson.stream.a aVar) throws IOException {
            aVar.a9();
            return null;
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        @Override // com.google.gson.b0
        public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
            dVar.y();
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f125372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f125373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f125374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f125375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f125376h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f125377i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z10, Method method, b0 b0Var, b0 b0Var2, boolean z11, boolean z12) {
            super(str, field);
            this.f125372d = z10;
            this.f125373e = method;
            this.f125374f = b0Var;
            this.f125375g = b0Var2;
            this.f125376h = z11;
            this.f125377i = z12;
        }

        @Override // com.google.gson.internal.bind.l.d
        void a(com.google.gson.stream.a aVar, int i10, Object[] objArr) throws IOException, com.google.gson.p {
            Object obj = this.f125375g.read(aVar);
            if (obj == null && this.f125376h) {
                throw new com.google.gson.p("null is not allowed as value for record component '" + this.f125382c + "' of primitive type; at path " + aVar.S());
            }
            objArr[i10] = obj;
        }

        @Override // com.google.gson.internal.bind.l.d
        void b(com.google.gson.stream.a aVar, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f125375g.read(aVar);
            if (obj2 == null && this.f125376h) {
                return;
            }
            if (this.f125372d) {
                l.b(obj, this.f125381b);
            } else if (this.f125377i) {
                throw new com.google.gson.m("Cannot set value of 'static final' " + com.google.gson.internal.reflect.a.g(this.f125381b, false));
            }
            this.f125381b.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.l.d
        void c(com.google.gson.stream.d dVar, Object obj) throws IllegalAccessException, IOException {
            Object objInvoke;
            if (this.f125372d) {
                Method method = this.f125373e;
                if (method == null) {
                    l.b(obj, this.f125381b);
                } else {
                    l.b(obj, method);
                }
            }
            Method method2 = this.f125373e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new com.google.gson.m("Accessor " + com.google.gson.internal.reflect.a.g(this.f125373e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.f125381b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            dVar.t(this.f125380a);
            this.f125374f.write(dVar, objInvoke);
        }
    }

    public static abstract class c<T, A> extends b0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f125379a;

        c(f fVar) {
            this.f125379a = fVar;
        }

        abstract A a();

        abstract T b(A a10);

        abstract void c(A a10, com.google.gson.stream.a aVar, d dVar) throws IllegalAccessException, IOException;

        @Override // com.google.gson.b0
        public T read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            A a10 = a();
            Map<String, d> map = this.f125379a.f125385a;
            try {
                aVar.m1();
                while (aVar.hasNext()) {
                    d dVar = map.get(aVar.na());
                    if (dVar == null) {
                        aVar.a9();
                    } else {
                        c(a10, aVar, dVar);
                    }
                }
                aVar.F1();
                return b(a10);
            } catch (IllegalAccessException e10) {
                throw com.google.gson.internal.reflect.a.e(e10);
            } catch (IllegalStateException e11) {
                throw new com.google.gson.v(e11);
            }
        }

        @Override // com.google.gson.b0
        public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
            if (t10 == null) {
                dVar.y();
                return;
            }
            dVar.e();
            try {
                Iterator<d> it = this.f125379a.f125386b.iterator();
                while (it.hasNext()) {
                    it.next().c(dVar, t10);
                }
                dVar.h();
            } catch (IllegalAccessException e10) {
                throw com.google.gson.internal.reflect.a.e(e10);
            }
        }
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f125380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f125381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f125382c;

        protected d(String str, Field field) {
            this.f125380a = str;
            this.f125381b = field;
            this.f125382c = field.getName();
        }

        abstract void a(com.google.gson.stream.a aVar, int i10, Object[] objArr) throws IOException, com.google.gson.p;

        abstract void b(com.google.gson.stream.a aVar, Object obj) throws IllegalAccessException, IOException;

        abstract void c(com.google.gson.stream.d dVar, Object obj) throws IllegalAccessException, IOException;
    }

    private static final class e<T> extends c<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0<T> f125383b;

        e(f0<T> f0Var, f fVar) {
            super(fVar);
            this.f125383b = f0Var;
        }

        @Override // com.google.gson.internal.bind.l.c
        T a() {
            return this.f125383b.a();
        }

        @Override // com.google.gson.internal.bind.l.c
        T b(T t10) {
            return t10;
        }

        @Override // com.google.gson.internal.bind.l.c
        void c(T t10, com.google.gson.stream.a aVar, d dVar) throws IllegalAccessException, IOException {
            dVar.b(aVar, t10);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f125384c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, d> f125385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f125386b;

        f(Map<String, d> map, List<d> list) {
            this.f125385a = map;
            this.f125386b = list;
        }
    }

    private static final class g<T> extends c<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f125387e = f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor<T> f125388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f125389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f125390d;

        g(Class<T> cls, f fVar, boolean z10) {
            super(fVar);
            this.f125390d = new HashMap();
            Constructor<T> constructorI = com.google.gson.internal.reflect.a.i(cls);
            this.f125388b = constructorI;
            if (z10) {
                l.b(null, constructorI);
            } else {
                com.google.gson.internal.reflect.a.o(constructorI);
            }
            String[] strArrK = com.google.gson.internal.reflect.a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f125390d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f125388b.getParameterTypes();
            this.f125389c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f125389c[i11] = f125387e.get(parameterTypes[i11]);
            }
        }

        private static Map<Class<?>, Object> f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.f125389c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(Object[] objArr) {
            try {
                return this.f125388b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw com.google.gson.internal.reflect.a.e(e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.a.c(this.f125388b) + "' with args " + Arrays.toString(objArr), e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.a.c(this.f125388b) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.l.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, com.google.gson.stream.a aVar, d dVar) throws IOException {
            Integer num = this.f125390d.get(dVar.f125382c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + com.google.gson.internal.reflect.a.c(this.f125388b) + "' for field with name '" + dVar.f125382c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public l(v vVar, com.google.gson.d dVar, w wVar, com.google.gson.internal.bind.e eVar, List<x> list) {
        this.f125366a = vVar;
        this.f125367b = dVar;
        this.f125368c = wVar;
        this.f125369d = eVar;
        this.f125370e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void b(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (i0.a(m10, obj)) {
            return;
        }
        throw new com.google.gson.m(com.google.gson.internal.reflect.a.g(m10, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d c(com.google.gson.f fVar, Field field, Method method, String str, com.google.gson.reflect.a<?> aVar, boolean z10, boolean z11) {
        b0<?> oVar;
        boolean zA = h0.a(aVar.getRawType());
        int modifiers = field.getModifiers();
        boolean z12 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = true;
        }
        com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) field.getAnnotation(com.google.gson.annotations.b.class);
        b0<?> b0VarC = bVar != null ? this.f125369d.c(this.f125366a, fVar, aVar, bVar, false) : null;
        boolean z13 = b0VarC != null;
        if (b0VarC == null) {
            b0VarC = fVar.t(aVar);
        }
        b0<?> b0Var = b0VarC;
        if (z10) {
            oVar = z13 ? b0Var : new o<>(fVar, b0Var, aVar.getType());
        } else {
            oVar = b0Var;
        }
        return new b(str, field, z11, method, oVar, b0Var, zA, z12);
    }

    private static IllegalArgumentException d(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + com.google.gson.internal.reflect.a.f(field) + " and " + com.google.gson.internal.reflect.a.f(field2) + "\nSee " + k0.a("duplicate-fields"));
    }

    private f e(com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, Class<?> cls, boolean z10, boolean z11) {
        boolean z12;
        com.google.gson.reflect.a<?> aVar2;
        boolean z13;
        int i10;
        int i11;
        d dVar;
        if (cls.isInterface()) {
            return f.f125384c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.google.gson.reflect.a<?> aVar3 = aVar;
        boolean z14 = z10;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z15 = true;
            boolean z16 = false;
            if (rawType != cls && declaredFields.length > 0) {
                x.e eVarB = i0.b(this.f125370e, rawType);
                if (eVarB == x.e.BLOCK_ALL) {
                    throw new com.google.gson.m("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z14 = eVarB == x.e.BLOCK_INACCESSIBLE;
            }
            boolean z17 = z14;
            int length = declaredFields.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12;
                Field field = declaredFields[i13];
                boolean zG = this.g(field, z15);
                boolean zG2 = this.g(field, z16);
                if (zG || zG2) {
                    Method methodH = null;
                    if (!z11) {
                        z12 = zG2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z12 = z16;
                    } else {
                        methodH = com.google.gson.internal.reflect.a.h(rawType, field);
                        if (!z17) {
                            com.google.gson.internal.reflect.a.o(methodH);
                        }
                        if (methodH.getAnnotation(com.google.gson.annotations.c.class) != null && field.getAnnotation(com.google.gson.annotations.c.class) == null) {
                            throw new com.google.gson.m("@SerializedName on " + com.google.gson.internal.reflect.a.g(methodH, z16) + " is not supported");
                        }
                        z12 = zG2;
                    }
                    if (!z17 && methodH == null) {
                        com.google.gson.internal.reflect.a.o(field);
                    }
                    Type typeP = y.p(aVar3.getType(), rawType, field.getGenericType());
                    List<String> listF = this.f(field);
                    aVar2 = aVar3;
                    z13 = false;
                    String str = listF.get(0);
                    i10 = i13;
                    i11 = length;
                    d dVarC = this.c(fVar, field, methodH, str, com.google.gson.reflect.a.get(typeP), zG, z17);
                    if (z12) {
                        for (String str2 : listF) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarC);
                            if (dVar2 != null) {
                                throw d(cls, str2, dVar2.f125381b, field);
                            }
                        }
                    }
                    if (zG && (dVar = (d) linkedHashMap2.put(str, dVarC)) != null) {
                        throw d(cls, str, dVar.f125381b, field);
                    }
                } else {
                    i11 = length;
                    i10 = i13;
                    aVar2 = aVar3;
                    z13 = z16;
                }
                i12 = i10 + 1;
                this = this;
                z16 = z13;
                aVar3 = aVar2;
                length = i11;
                z15 = true;
            }
            aVar3 = com.google.gson.reflect.a.get(y.p(aVar3.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = aVar3.getRawType();
            z14 = z17;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> f(Field field) {
        String strC;
        List<String> listB;
        com.google.gson.annotations.c cVar = (com.google.gson.annotations.c) field.getAnnotation(com.google.gson.annotations.c.class);
        if (cVar == null) {
            strC = this.f125367b.c(field);
            listB = this.f125367b.b(field);
        } else {
            String strValue = cVar.value();
            List<String> listAsList = Arrays.asList(cVar.alternate());
            strC = strValue;
            listB = listAsList;
        }
        if (listB.isEmpty()) {
            return Collections.singletonList(strC);
        }
        ArrayList arrayList = new ArrayList(listB.size() + 1);
        arrayList.add(strC);
        arrayList.addAll(listB);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f125368c.d(field, z10);
    }

    @Override // com.google.gson.c0
    public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (com.google.gson.internal.reflect.a.l(rawType)) {
            return new a();
        }
        x.e eVarB = i0.b(this.f125370e, rawType);
        if (eVarB != x.e.BLOCK_ALL) {
            boolean z10 = eVarB == x.e.BLOCK_INACCESSIBLE;
            return com.google.gson.internal.reflect.a.m(rawType) ? new g(rawType, e(fVar, aVar, rawType, z10, true), z10) : new e(this.f125366a.x(aVar, true), e(fVar, aVar, rawType, z10, false));
        }
        throw new com.google.gson.m("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
