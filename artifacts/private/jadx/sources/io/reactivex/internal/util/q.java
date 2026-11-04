package io.reactivex.internal.util;

import io.reactivex.i0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public enum q {
    COMPLETE;

    static final class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303500b = -7482590109178395495L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.disposables.c f303501a;

        a(io.reactivex.disposables.c cVar) {
            this.f303501a = cVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f303501a + "]";
        }
    }

    static final class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303502b = -8759979445933046293L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f303503a;

        b(Throwable th2) {
            this.f303503a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return io.reactivex.internal.functions.b.c(this.f303503a, ((b) obj).f303503a);
            }
            return false;
        }

        public int hashCode() {
            return this.f303503a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f303503a + "]";
        }
    }

    static final class c implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303504b = -1322257508628817540L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.w f303505a;

        c(org.reactivestreams.w wVar) {
            this.f303505a = wVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f303505a + "]";
        }
    }

    public static <T> boolean b(Object obj, i0<? super T> i0Var) {
        if (obj == COMPLETE) {
            i0Var.onComplete();
            return true;
        }
        if (obj instanceof b) {
            i0Var.onError(((b) obj).f303503a);
            return true;
        }
        i0Var.onNext(obj);
        return false;
    }

    public static <T> boolean c(Object obj, org.reactivestreams.v<? super T> vVar) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            vVar.onError(((b) obj).f303503a);
            return true;
        }
        vVar.onNext(obj);
        return false;
    }

    public static <T> boolean d(Object obj, i0<? super T> i0Var) {
        if (obj == COMPLETE) {
            i0Var.onComplete();
            return true;
        }
        if (obj instanceof b) {
            i0Var.onError(((b) obj).f303503a);
            return true;
        }
        if (obj instanceof a) {
            i0Var.d(((a) obj).f303501a);
            return false;
        }
        i0Var.onNext(obj);
        return false;
    }

    public static <T> boolean e(Object obj, org.reactivestreams.v<? super T> vVar) {
        if (obj == COMPLETE) {
            vVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            vVar.onError(((b) obj).f303503a);
            return true;
        }
        if (obj instanceof c) {
            vVar.l(((c) obj).f303505a);
            return false;
        }
        vVar.onNext(obj);
        return false;
    }

    public static Object k() {
        return COMPLETE;
    }

    public static Object l(io.reactivex.disposables.c cVar) {
        return new a(cVar);
    }

    public static Object n(Throwable th2) {
        return new b(th2);
    }

    public static io.reactivex.disposables.c o(Object obj) {
        return ((a) obj).f303501a;
    }

    public static Throwable p(Object obj) {
        return ((b) obj).f303503a;
    }

    public static org.reactivestreams.w q(Object obj) {
        return ((c) obj).f303505a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T r(Object obj) {
        return obj;
    }

    public static boolean s(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean t(Object obj) {
        return obj instanceof a;
    }

    public static boolean v(Object obj) {
        return obj instanceof b;
    }

    public static boolean w(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object x(T t10) {
        return t10;
    }

    public static Object z(org.reactivestreams.w wVar) {
        return new c(wVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
