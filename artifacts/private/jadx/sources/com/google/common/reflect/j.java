package com.google.common.reflect;

import com.google.common.base.j0;
import com.google.common.collect.l6;
import com.google.common.collect.nb;
import com.google.common.collect.s4;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* JADX INFO: loaded from: classes5.dex */
@d
public final class j implements AnnotatedElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<?, ?> f119836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q<?> f119838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l6<Annotation> f119839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f119840e;

    j(g<?, ?> declaration, int position, q<?> type, Annotation[] annotations, Object annotatedType) {
        this.f119836a = declaration;
        this.f119837b = position;
        this.f119838c = type;
        this.f119839d = l6.B(annotations);
        this.f119840e = annotatedType;
    }

    public g<?, ?> a() {
        return this.f119836a;
    }

    public q<?> b() {
        return this.f119838c;
    }

    public boolean equals(@fj.a Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f119837b == jVar.f119837b && this.f119836a.equals(jVar.f119836a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @fj.a
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        j0.E(annotationType);
        nb<Annotation> it = this.f119839d.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (annotationType.isInstance(next)) {
                return annotationType.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @fj.a
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationType) {
        j0.E(annotationType);
        return (A) s4.D(this.f119839d).w(annotationType).A().j();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f119839d.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) s4.D(this.f119839d).w(cls).Q(cls));
    }

    public int hashCode() {
        return this.f119837b;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        return getAnnotation(annotationType) != null;
    }

    public String toString() {
        return this.f119838c + " arg" + this.f119837b;
    }
}
