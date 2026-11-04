package org.apache.commons.io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class d extends ObjectInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f336822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f336823b;

    public d(InputStream inputStream) throws IOException {
        super(inputStream);
        this.f336822a = new ArrayList();
        this.f336823b = new ArrayList();
    }

    private void l(String str) throws InvalidClassException {
        Iterator<a> it = this.f336823b.iterator();
        while (it.hasNext()) {
            if (it.next().a(str)) {
                e(str);
            }
        }
        Iterator<a> it2 = this.f336822a.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(str)) {
                return;
            }
        }
        e(str);
    }

    public d a(Pattern pattern) {
        this.f336822a.add(new c(pattern));
        return this;
    }

    public d b(a aVar) {
        this.f336822a.add(aVar);
        return this;
    }

    public d c(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f336822a.add(new b(cls.getName()));
        }
        return this;
    }

    public d d(String... strArr) {
        for (String str : strArr) {
            this.f336822a.add(new e(str));
        }
        return this;
    }

    protected void e(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    public d f(Pattern pattern) {
        this.f336823b.add(new c(pattern));
        return this;
    }

    public d g(a aVar) {
        this.f336823b.add(aVar);
        return this;
    }

    public d h(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f336823b.add(new b(cls.getName()));
        }
        return this;
    }

    public d j(String... strArr) {
        for (String str : strArr) {
            this.f336823b.add(new e(str));
        }
        return this;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        l(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }
}
