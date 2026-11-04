package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class a implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f267100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f> f267101b;

    /* JADX INFO: renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    class C1870a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f267102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f267103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f267104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f267105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f267106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Type f267107f;

        C1870a(f fVar, h hVar, w wVar, f fVar2, Set set, Type type) {
            this.f267102a = fVar;
            this.f267103b = hVar;
            this.f267104c = wVar;
            this.f267105d = fVar2;
            this.f267106e = set;
            this.f267107f = type;
        }

        @Override // com.squareup.moshi.h
        @fj.h
        public Object b(m mVar) throws IOException {
            f fVar = this.f267105d;
            if (fVar == null) {
                return this.f267103b.b(mVar);
            }
            if (!fVar.f267125g && mVar.f() == m.c.NULL) {
                mVar.c();
                return null;
            }
            try {
                return this.f267105d.b(this.f267104c, mVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + mVar.S(), cause);
            }
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, @fj.h Object obj) throws IOException {
            f fVar = this.f267102a;
            if (fVar == null) {
                this.f267103b.m(tVar, obj);
                return;
            }
            if (!fVar.f267125g && obj == null) {
                tVar.q();
                return;
            }
            try {
                fVar.e(this.f267104c, tVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + tVar.S(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f267106e + "(" + this.f267107f + ")";
        }
    }

    class b extends f {
        b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // com.squareup.moshi.a.f
        public void e(w wVar, t tVar, @fj.h Object obj) throws IOException, InvocationTargetException {
            d(tVar, obj);
        }
    }

    class c extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private h<Object> f267109h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f267110i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f267111j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f267112k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f267113l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f267110i = typeArr;
            this.f267111j = type2;
            this.f267112k = set2;
            this.f267113l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f267109h = (a0.e(this.f267110i[0], this.f267111j) && this.f267112k.equals(this.f267113l)) ? wVar.m(eVar, this.f267111j, this.f267113l) : wVar.f(this.f267111j, this.f267113l);
        }

        @Override // com.squareup.moshi.a.f
        public void e(w wVar, t tVar, @fj.h Object obj) throws IOException, InvocationTargetException {
            this.f267109h.m(tVar, c(obj));
        }
    }

    class d extends f {
        d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(w wVar, m mVar) throws IOException, InvocationTargetException {
            return c(mVar);
        }
    }

    class e extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        h<Object> f267114h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f267115i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f267116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f267117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f267118l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f267115i = typeArr;
            this.f267116j = type2;
            this.f267117k = set2;
            this.f267118l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f267114h = (a0.e(this.f267115i[0], this.f267116j) && this.f267117k.equals(this.f267118l)) ? wVar.m(eVar, this.f267115i[0], this.f267117k) : wVar.f(this.f267115i[0], this.f267117k);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(w wVar, m mVar) throws IOException, InvocationTargetException {
            return c(this.f267114h.b(mVar));
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Type f267119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<? extends Annotation> f267120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f267121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f267122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f267123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final h<?>[] f267124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f267125g;

        f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f267119a = Util.b(type);
            this.f267120b = set;
            this.f267121c = obj;
            this.f267122d = method;
            this.f267123e = i11;
            this.f267124f = new h[i10 - i11];
            this.f267125g = z10;
        }

        public void a(w wVar, h.e eVar) {
            if (this.f267124f.length > 0) {
                Type[] genericParameterTypes = this.f267122d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f267122d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f267123e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setO = Util.o(parameterAnnotations[i10]);
                    this.f267124f[i10 - this.f267123e] = (a0.e(this.f267119a, type) && this.f267120b.equals(setO)) ? wVar.m(eVar, type, setO) : wVar.f(type, setO);
                }
            }
        }

        @fj.h
        public Object b(w wVar, m mVar) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        @fj.h
        protected Object c(@fj.h Object obj) throws InvocationTargetException {
            h<?>[] hVarArr = this.f267124f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f267122d.invoke(this.f267121c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(@fj.h Object obj, @fj.h Object obj2) throws InvocationTargetException {
            h<?>[] hVarArr = this.f267124f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f267122d.invoke(this.f267121c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(w wVar, t tVar, @fj.h Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }

    a(List<f> list, List<f> list2) {
        this.f267100a = list;
        this.f267101b = list2;
    }

    static f b(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> setN = Util.n(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == m.class && genericReturnType != cls && e(1, genericParameterTypes)) {
            return new d(genericReturnType, setN, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, setN, obj, method, genericParameterTypes.length, 1, Util.h(parameterAnnotations[0]), genericParameterTypes, genericReturnType, Util.o(parameterAnnotations[0]), setN);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    @fj.h
    private static f c(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (a0.e(fVar.f267119a, type) && fVar.f267120b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a d(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(z.class)) {
                    f fVarF = f(obj, method);
                    f fVarC = c(arrayList, fVarF.f267119a, fVarF.f267120b);
                    if (fVarC != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarC.f267122d + "\n    " + fVarF.f267122d);
                    }
                    arrayList.add(fVarF);
                }
                if (method.isAnnotationPresent(com.squareup.moshi.f.class)) {
                    f fVarB = b(obj, method);
                    f fVarC2 = c(arrayList2, fVarB.f267119a, fVarB.f267120b);
                    if (fVarC2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarC2.f267122d + "\n    " + fVarB.f267122d);
                    }
                    arrayList2.add(fVarB);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    private static boolean e(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == h.class) {
                i10++;
            }
            return false;
        }
        return true;
    }

    static f f(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == t.class && genericReturnType == cls && e(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], Util.o(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> setN = Util.n(method);
            Set<? extends Annotation> setO = Util.o(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setO, obj, method, genericParameterTypes.length, 1, Util.h(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setO, setN);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // com.squareup.moshi.h.e
    @fj.h
    public h<?> a(Type type, Set<? extends Annotation> set, w wVar) {
        f fVarC = c(this.f267100a, type, set);
        f fVarC2 = c(this.f267101b, type, set);
        h hVarM = null;
        int i10 = 5 ^ 0;
        if (fVarC == null && fVarC2 == null) {
            return null;
        }
        if (fVarC == null || fVarC2 == null) {
            try {
                hVarM = wVar.m(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarC == null ? "@ToJson" : "@FromJson") + " adapter for " + Util.y(type, set), e10);
            }
        }
        h hVar = hVarM;
        if (fVarC != null) {
            fVarC.a(wVar, this);
        }
        if (fVarC2 != null) {
            fVarC2.a(wVar, this);
        }
        return new C1870a(fVarC, hVar, wVar, fVarC2, set, type);
    }
}
