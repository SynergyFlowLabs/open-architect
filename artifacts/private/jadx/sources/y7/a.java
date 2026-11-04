package y7;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f395329d = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f395330e = "com.google.common.base.FinalizableReference";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @fj.a
    private static final Constructor<Thread> f395331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.a
    private static final Field f395332g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Class<?>> f395333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PhantomReference<Object> f395334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReferenceQueue<Object> f395335c;

    static {
        Constructor<Thread> constructorC = c();
        f395331f = constructorC;
        f395332g = constructorC == null ? e() : null;
    }

    private a(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        this.f395335c = queue;
        this.f395333a = new WeakReference<>(finalizableReferenceClass);
        this.f395334b = frqReference;
    }

    private boolean a(Reference<?> firstReference) {
        Reference<? extends Object> referencePoll;
        Method methodD = d();
        if (methodD == null || !b(firstReference, methodD)) {
            return false;
        }
        do {
            referencePoll = this.f395335c.poll();
            if (referencePoll == null) {
                return true;
            }
        } while (b(referencePoll, methodD));
        return false;
    }

    private boolean b(Reference<?> reference, Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.f395334b) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, null);
            return true;
        } catch (Throwable th2) {
            f395329d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            return true;
        }
    }

    @fj.a
    private static Constructor<Thread> c() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @fj.a
    private Method d() {
        Class<?> cls = this.f395333a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    @fj.a
    private static Field e() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f395329d.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public static void f(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        Thread thread;
        if (!finalizableReferenceClass.getName().equals("com.google.common.base.p")) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        a aVar = new a(finalizableReferenceClass, queue, frqReference);
        String name = a.class.getName();
        Constructor<Thread> constructor = f395331f;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, aVar, name, 0L, Boolean.FALSE);
            } catch (Throwable th2) {
                f395329d.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th2);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new Thread(null, aVar, name);
        }
        thread.setDaemon(true);
        try {
            Field field = f395332g;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (Throwable th3) {
            f395329d.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th3);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.f395335c.remove())) {
        }
    }
}
