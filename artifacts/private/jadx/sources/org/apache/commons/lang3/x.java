package org.apache.commons.lang3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class x {

    static class a extends ObjectInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Map<String, Class<?>> f337536b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassLoader f337537a;

        static {
            HashMap map = new HashMap();
            f337536b = map;
            map.put(io.sentry.profilemeasurements.a.f306070m, Byte.TYPE);
            map.put("short", Short.TYPE);
            map.put("int", Integer.TYPE);
            map.put("long", Long.TYPE);
            map.put("float", Float.TYPE);
            map.put("double", Double.TYPE);
            map.put("boolean", Boolean.TYPE);
            map.put("char", Character.TYPE);
            map.put("void", Void.TYPE);
        }

        a(InputStream inputStream, ClassLoader classLoader) throws IOException {
            super(inputStream);
            this.f337537a = classLoader;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            String name = objectStreamClass.getName();
            try {
                try {
                    return Class.forName(name, false, this.f337537a);
                } catch (ClassNotFoundException e10) {
                    Class<?> cls = f337536b.get(name);
                    if (cls != null) {
                        return cls;
                    }
                    throw e10;
                }
            } catch (ClassNotFoundException unused) {
                return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
            }
        }
    }

    public static <T extends Serializable> T a(T t10) {
        if (t10 == null) {
            return null;
        }
        try {
            a aVar = new a(new ByteArrayInputStream(f(t10)), t10.getClass().getClassLoader());
            try {
                T t11 = (T) aVar.readObject();
                aVar.close();
                return t11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        aVar.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException e10) {
            throw new w("IOException while reading or closing cloned object data", e10);
        } catch (ClassNotFoundException e11) {
            throw new w("ClassNotFoundException while reading cloned object data", e11);
        }
    }

    public static <T> T b(InputStream inputStream) {
        c0.v(inputStream != null, "The InputStream must not be null", new Object[0]);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            try {
                T t10 = (T) objectInputStream.readObject();
                objectInputStream.close();
                return t10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        objectInputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException | ClassNotFoundException e10) {
            throw new w(e10);
        }
    }

    public static <T> T c(byte[] bArr) {
        c0.v(bArr != null, "The byte[] must not be null", new Object[0]);
        return (T) b(new ByteArrayInputStream(bArr));
    }

    public static <T extends Serializable> T d(T t10) {
        return (T) c(f(t10));
    }

    public static void e(Serializable serializable, OutputStream outputStream) {
        c0.v(outputStream != null, "The OutputStream must not be null", new Object[0]);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        } catch (IOException e10) {
            throw new w(e10);
        }
    }

    public static byte[] f(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        e(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
