package com.google.common.reflect;

import com.google.common.base.j0;
import com.google.common.collect.l6;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@d
public abstract class g<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f119828c = k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibleObject f119829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Member f119830b;

    static class a<T> extends g<T, T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Constructor<?> f119831d;

        a(Constructor<?> constructor) {
            super(constructor);
            this.f119831d = constructor;
        }

        private boolean F() {
            Class<?> declaringClass = this.f119831d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.g
        Type[] d() {
            return this.f119831d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.g
        Type[] e() {
            Type[] genericParameterTypes = this.f119831d.getGenericParameterTypes();
            if (genericParameterTypes.length > 0 && F()) {
                Class<?>[] parameterTypes = this.f119831d.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                    return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
            return genericParameterTypes;
        }

        @Override // com.google.common.reflect.g
        Type f() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? t.l(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.g
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f119831d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.g
        final Annotation[][] h() {
            return this.f119831d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.g
        final Object m(@fj.a Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.f119831d.newInstance(args);
            } catch (InstantiationException e10) {
                throw new RuntimeException(this.f119831d + " failed.", e10);
            }
        }

        @Override // com.google.common.reflect.g
        public final boolean r() {
            return false;
        }

        @Override // com.google.common.reflect.g
        public final boolean z() {
            return this.f119831d.isVarArgs();
        }
    }

    static class b<T> extends g<T, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f119832d;

        b(Method method) {
            super(method);
            this.f119832d = method;
        }

        @Override // com.google.common.reflect.g
        Type[] d() {
            return this.f119832d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.g
        Type[] e() {
            return this.f119832d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.g
        Type f() {
            return this.f119832d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.g
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f119832d.getTypeParameters();
        }

        @Override // com.google.common.reflect.g
        final Annotation[][] h() {
            return this.f119832d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.g
        @fj.a
        final Object m(@fj.a Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException {
            return this.f119832d.invoke(receiver, args);
        }

        @Override // com.google.common.reflect.g
        public final boolean r() {
            return (p() || t() || w() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.g
        public final boolean z() {
            return this.f119832d.isVarArgs();
        }
    }

    <M extends AccessibleObject & Member> g(M member) {
        j0.E(member);
        this.f119829a = member;
        this.f119830b = member;
    }

    public static <T> g<T, T> a(Constructor<T> constructor) {
        return new a(constructor);
    }

    public static g<?, Object> b(Method method) {
        return new b(method);
    }

    private static boolean k() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final boolean A() {
        return Modifier.isVolatile(getModifiers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> g<T, R1> B(q<R1> returnType) {
        if (returnType.M(j())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + j() + ", not " + returnType);
    }

    public final <R1 extends R> g<T, R1> C(Class<R1> returnType) {
        return B(q.S(returnType));
    }

    public final void D(boolean flag) {
        this.f119829a.setAccessible(flag);
    }

    public final boolean E() {
        try {
            this.f119829a.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final l6<q<? extends Throwable>> c() {
        l6.a aVarS = l6.s();
        for (Type type : d()) {
            aVarS.a(q.T(type));
        }
        return aVarS.e();
    }

    abstract Type[] d();

    abstract Type[] e();

    public boolean equals(@fj.a Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (g().equals(gVar.g()) && this.f119830b.equals(gVar.f119830b)) {
                return true;
            }
        }
        return false;
    }

    abstract Type f();

    public q<T> g() {
        return q.S(getDeclaringClass());
    }

    @Override // java.lang.reflect.AnnotatedElement
    @fj.a
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f119829a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f119829a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f119829a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f119830b.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f119830b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f119830b.getName();
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    abstract Annotation[][] h();

    public int hashCode() {
        return this.f119830b.hashCode();
    }

    @e
    public final l6<j> i() {
        Type[] typeArrE = e();
        Annotation[][] annotationArrH = h();
        Object[] objArr = new Object[typeArrE.length];
        l6.a aVarS = l6.s();
        for (int i10 = 0; i10 < typeArrE.length; i10++) {
            aVarS.a(new j(this, i10, q.T(typeArrE[i10]), annotationArrH[i10], objArr[i10]));
        }
        return aVarS.e();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
        return this.f119829a.isAnnotationPresent(annotationClass);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f119830b.isSynthetic();
    }

    public final q<? extends R> j() {
        return (q<? extends R>) q.T(f());
    }

    @z7.a
    @fj.a
    public final R l(@fj.a T t10, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) m(t10, (Object[]) j0.E(objArr));
    }

    @fj.a
    abstract Object m(@fj.a Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException;

    public final boolean n() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean o() {
        return this.f119829a.isAccessible();
    }

    public final boolean p() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean q() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean r();

    public final boolean s() {
        return (t() || v() || u()) ? false : true;
    }

    public final boolean t() {
        return Modifier.isPrivate(getModifiers());
    }

    public String toString() {
        return this.f119830b.toString();
    }

    public final boolean u() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean v() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean w() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean x() {
        return Modifier.isSynchronized(getModifiers());
    }

    final boolean y() {
        return Modifier.isTransient(getModifiers());
    }

    public abstract boolean z();
}
