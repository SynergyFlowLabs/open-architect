package org.apache.commons.collections4.functors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class r0 {

    static class b<T> implements org.apache.commons.collections4.n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f335733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Method f335734b;

        private void a() {
            try {
                this.f335734b = this.f335733a.getClass().getMethod("clone", null);
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
            }
        }

        @Override // org.apache.commons.collections4.n
        public T k() {
            if (this.f335734b == null) {
                a();
            }
            try {
                return (T) this.f335734b.invoke(this.f335733a, null);
            } catch (IllegalAccessException e10) {
                throw new org.apache.commons.collections4.q("PrototypeCloneFactory: Clone method must be public", e10);
            } catch (InvocationTargetException e11) {
                throw new org.apache.commons.collections4.q("PrototypeCloneFactory: Clone method threw an exception", e11);
            }
        }

        private b(T t10, Method method) {
            this.f335733a = t10;
            this.f335734b = method;
        }
    }

    static class c<T extends Serializable> implements org.apache.commons.collections4.n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f335735a;

        /* JADX WARN: Code duplicated, block: B:38:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [org.apache.commons.collections4.functors.r0$c, org.apache.commons.collections4.functors.r0$c<T extends java.io.Serializable>] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.io.ByteArrayInputStream] */
        @Override // org.apache.commons.collections4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T k() throws Throwable {
            Throwable th2;
            ClassNotFoundException e10;
            IOException e11;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            try {
                try {
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(this.f335735a);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        T t10 = (T) new ObjectInputStream(byteArrayInputStream).readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        return t10;
                    } catch (IOException e12) {
                        e11 = e12;
                        throw new org.apache.commons.collections4.q(e11);
                    } catch (ClassNotFoundException e13) {
                        e10 = e13;
                        throw new org.apache.commons.collections4.q(e10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (this != 0) {
                        try {
                            this.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th2;
                    } catch (IOException unused4) {
                        throw th2;
                    }
                }
            } catch (IOException e14) {
                e11 = e14;
            } catch (ClassNotFoundException e15) {
                e10 = e15;
            } catch (Throwable th4) {
                th2 = th4;
                this = (c<T>) null;
                if (this != 0) {
                    this.close();
                }
                byteArrayOutputStream.close();
                throw th2;
            }
        }

        private c(T t10) {
            this.f335735a = t10;
        }
    }

    private r0() {
    }

    public static <T> org.apache.commons.collections4.n<T> a(T t10) {
        if (t10 == null) {
            return k.a(null);
        }
        try {
            try {
                return new b(t10, t10.getClass().getMethod("clone", null));
            } catch (NoSuchMethodException unused) {
                t10.getClass().getConstructor(t10.getClass());
                return new a0(t10.getClass(), new Class[]{t10.getClass()}, new Object[]{t10});
            }
        } catch (NoSuchMethodException unused2) {
            if (t10 instanceof Serializable) {
                return new c((Serializable) t10);
            }
            throw new IllegalArgumentException("The prototype must be cloneable via a public clone method");
        }
    }
}
