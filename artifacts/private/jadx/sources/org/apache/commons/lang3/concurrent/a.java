package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.z1;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<T> implements g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f337075c = "open";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicReference<b> f337076a = new AtomicReference<>(b.f337078a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PropertyChangeSupport f337077b = new PropertyChangeSupport(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    protected static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f337078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f337079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f337080c;

        /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.a$b$a, reason: collision with other inner class name */
        static enum C2406a extends b {
            C2406a(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.concurrent.a.b
            public b k() {
                return b.f337079b;
            }
        }

        /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.a$b$b, reason: collision with other inner class name */
        static enum C2407b extends b {
            C2407b(String str, int i10) {
                super(str, i10);
            }

            @Override // org.apache.commons.lang3.concurrent.a.b
            public b k() {
                return b.f337078a;
            }
        }

        static {
            C2406a c2406a = new C2406a("CLOSED", 0);
            f337078a = c2406a;
            C2407b c2407b = new C2407b("OPEN", 1);
            f337079b = c2407b;
            f337080c = new b[]{c2406a, c2407b};
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f337080c.clone();
        }

        public abstract b k();
    }

    protected static boolean e(b bVar) {
        return bVar == b.f337079b;
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public abstract boolean a();

    @Override // org.apache.commons.lang3.concurrent.g
    public abstract boolean b(T t10);

    public void c(PropertyChangeListener propertyChangeListener) {
        this.f337077b.addPropertyChangeListener(propertyChangeListener);
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public void close() {
        d(b.f337078a);
    }

    protected void d(b bVar) {
        if (z1.a(this.f337076a, bVar.k(), bVar)) {
            this.f337077b.firePropertyChange("open", !e(bVar), e(bVar));
        }
    }

    public void f(PropertyChangeListener propertyChangeListener) {
        this.f337077b.removePropertyChangeListener(propertyChangeListener);
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public boolean isClosed() {
        return !isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public boolean isOpen() {
        return e(this.f337076a.get());
    }

    @Override // org.apache.commons.lang3.concurrent.g
    public void open() {
        d(b.f337079b);
    }
}
