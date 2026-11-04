package org.apache.commons.lang3.event;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class a<L> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f337145d = 3593265990380473632L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<L> f337146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient L f337147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient L[] f337148c;

    /* JADX INFO: renamed from: org.apache.commons.lang3.event.a$a, reason: collision with other inner class name */
    protected class C2408a implements InvocationHandler {
        protected C2408a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Iterator it = a.this.f337146a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            return null;
        }
    }

    public a(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    public static <T> a<T> d(Class<T> cls) {
        return new a<>(cls);
    }

    private void f(Class<L> cls, ClassLoader classLoader) {
        this.f337147b = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, e()));
    }

    private void j(Class<L> cls, ClassLoader classLoader) {
        this.f337148c = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        f(cls, classLoader);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.f337146a = new CopyOnWriteArrayList(objArr);
        j(objArr.getClass().getComponentType(), Thread.currentThread().getContextClassLoader());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l10 : this.f337146a) {
            try {
                objectOutputStream2.writeObject(l10);
                arrayList.add(l10);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.f337148c));
    }

    public void b(L l10) {
        c(l10, true);
    }

    public void c(L l10, boolean z10) {
        c0.P(l10, "Listener object cannot be null.", new Object[0]);
        if (z10) {
            this.f337146a.add(l10);
        } else {
            if (this.f337146a.contains(l10)) {
                return;
            }
            this.f337146a.add(l10);
        }
    }

    protected InvocationHandler e() {
        return new C2408a();
    }

    public L g() {
        return this.f337147b;
    }

    int h() {
        return this.f337146a.size();
    }

    public L[] i() {
        return (L[]) this.f337146a.toArray(this.f337148c);
    }

    public void k(L l10) {
        c0.P(l10, "Listener object cannot be null.", new Object[0]);
        this.f337146a.remove(l10);
    }

    public a(Class<L> cls, ClassLoader classLoader) {
        this();
        c0.P(cls, "Listener interface cannot be null.", new Object[0]);
        c0.P(classLoader, "ClassLoader cannot be null.", new Object[0]);
        c0.v(cls.isInterface(), "Class {0} is not an interface", cls.getName());
        j(cls, classLoader);
    }

    private a() {
        this.f337146a = new CopyOnWriteArrayList();
    }
}
