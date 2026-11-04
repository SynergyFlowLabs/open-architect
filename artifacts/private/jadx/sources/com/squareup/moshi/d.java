package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
final class d<T> extends h<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h.e f267140d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<T> f267141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<?>[] f267142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.b f267143c;

    class a implements h.e {
        a() {
        }

        private void b(w wVar, Type type, Map<String, b<?>> map) {
            g gVar;
            Class<?> clsJ = a0.j(type);
            boolean zM = Util.m(clsJ);
            for (Field field : clsJ.getDeclaredFields()) {
                if (c(zM, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeU = Util.u(type, clsJ, field.getGenericType());
                    Set<? extends Annotation> setN = Util.n(field);
                    String name = field.getName();
                    h<T> hVarG = wVar.g(typeU, setN, name);
                    field.setAccessible(true);
                    String strP = Util.p(name, gVar);
                    b<?> bVar = new b<>(strP, field, hVarG);
                    b<?> bVarPut = map.put(strP, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f267145b + "\n    " + bVar.f267145b);
                    }
                }
            }
        }

        private boolean c(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            if (!Modifier.isPublic(i10) && !Modifier.isProtected(i10) && z10) {
                return false;
            }
            return true;
        }

        private void d(Type type, Class<?> cls) {
            Class<?> clsJ = a0.j(type);
            if (cls.isAssignableFrom(clsJ)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsJ.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.h.e
        @fj.h
        public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsJ = a0.j(type);
            if (clsJ.isInterface() || clsJ.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (Util.m(clsJ)) {
                d(type, List.class);
                d(type, Set.class);
                d(type, Map.class);
                d(type, Collection.class);
                String str = "Platform " + clsJ;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsJ.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsJ.getName());
            }
            if (clsJ.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsJ.getName());
            }
            if (clsJ.getEnclosingClass() != null && !Modifier.isStatic(clsJ.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsJ.getName());
            }
            if (Modifier.isAbstract(clsJ.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsJ.getName());
            }
            if (Util.l(clsJ)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsJ.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c cVarA = c.a(clsJ);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                b(wVar, type, treeMap);
                type = a0.i(type);
            }
            return new d(cVarA, treeMap).j();
        }
    }

    static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f267144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f267145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h<T> f267146c;

        b(String str, Field field, h<T> hVar) {
            this.f267144a = str;
            this.f267145b = field;
            this.f267146c = hVar;
        }

        void a(m mVar, Object obj) throws IllegalAccessException, IOException {
            this.f267145b.set(obj, this.f267146c.b(mVar));
        }

        void b(t tVar, Object obj) throws IllegalAccessException, IOException {
            this.f267146c.m(tVar, (T) this.f267145b.get(obj));
        }
    }

    d(c<T> cVar, Map<String, b<?>> map) {
        this.f267141a = cVar;
        this.f267142b = (b[]) map.values().toArray(new b[map.size()]);
        this.f267143c = m.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.h
    public T b(m mVar) throws IOException {
        try {
            T tB = this.f267141a.b();
            try {
                mVar.m1();
                while (mVar.hasNext()) {
                    int iM = mVar.m(this.f267143c);
                    if (iM == -1) {
                        mVar.t();
                        mVar.a9();
                    } else {
                        this.f267142b[iM].a(mVar, tB);
                    }
                }
                mVar.F1();
                return tB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw Util.x(e11);
        }
    }

    @Override // com.squareup.moshi.h
    public void m(t tVar, T t10) throws IOException {
        try {
            tVar.c();
            for (b<?> bVar : this.f267142b) {
                tVar.o(bVar.f267144a);
                bVar.b(tVar, t10);
            }
            tVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f267141a + ")";
    }
}
