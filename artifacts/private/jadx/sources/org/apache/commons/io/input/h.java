package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes14.dex */
public class h extends ObjectInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f336616a;

    public h(ClassLoader classLoader, InputStream inputStream) throws IOException {
        super(inputStream);
        this.f336616a = classLoader;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        try {
            return Class.forName(objectStreamClass.getName(), false, this.f336616a);
        } catch (ClassNotFoundException unused) {
            return super.resolveClass(objectStreamClass);
        }
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveProxyClass(String[] strArr) throws IOException, ClassNotFoundException {
        Class[] clsArr = new Class[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            clsArr[i10] = Class.forName(strArr[i10], false, this.f336616a);
        }
        try {
            return Proxy.getProxyClass(this.f336616a, clsArr);
        } catch (IllegalArgumentException unused) {
            return super.resolveProxyClass(strArr);
        }
    }
}
