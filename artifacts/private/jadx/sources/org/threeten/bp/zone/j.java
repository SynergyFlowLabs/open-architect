package org.threeten.bp.zone;

import androidx.compose.animation.core.z1;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f340556a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f340557b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference<j> f340558c = new AtomicReference<>();

    static class a extends j {
        a() {
        }

        @Override // org.threeten.bp.zone.j
        protected void b() {
        }
    }

    static class b extends j {
        b() {
        }

        @Override // org.threeten.bp.zone.j
        protected void b() {
            Iterator it = ServiceLoader.load(k.class, k.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    k.j((k) it.next());
                } catch (ServiceConfigurationError e10) {
                    if (!(e10.getCause() instanceof SecurityException)) {
                        throw e10;
                    }
                }
            }
        }
    }

    static void a() {
        if (f340557b.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<j> atomicReference = f340558c;
        z1.a(atomicReference, null, new b());
        atomicReference.get().b();
    }

    public static void c(j jVar) {
        if (f340557b.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!z1.a(f340558c, null, jVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    protected abstract void b();
}
