package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Executor f74143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f74144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final k.f<T> f74145c;

    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Object f74146d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Executor f74147e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private Executor f74148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f74149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k.f<T> f74150c;

        public a(@NonNull k.f<T> fVar) {
            this.f74150c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.f74149b == null) {
                synchronized (f74146d) {
                    try {
                        if (f74147e == null) {
                            f74147e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f74149b = f74147e;
            }
            return new c<>(this.f74148a, this.f74149b, this.f74150c);
        }

        @NonNull
        public a<T> b(@p0 Executor executor) {
            this.f74149b = executor;
            return this;
        }

        @NonNull
        @b1({b1.a.LIBRARY})
        public a<T> c(@p0 Executor executor) {
            this.f74148a = executor;
            return this;
        }
    }

    c(@p0 Executor executor, @NonNull Executor executor2, @NonNull k.f<T> fVar) {
        this.f74143a = executor;
        this.f74144b = executor2;
        this.f74145c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.f74144b;
    }

    @NonNull
    public k.f<T> b() {
        return this.f74145c;
    }

    @b1({b1.a.LIBRARY})
    @p0
    public Executor c() {
        return this.f74143a;
    }
}
