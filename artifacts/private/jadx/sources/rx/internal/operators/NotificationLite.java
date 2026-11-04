package rx.internal.operators;

import java.io.Serializable;
import rx.Notification;
import rx.Observer;

/* JADX INFO: loaded from: classes14.dex */
public final class NotificationLite<T> {
    private static final NotificationLite INSTANCE = new NotificationLite();
    private static final Object ON_COMPLETED_SENTINEL = new Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object ON_NEXT_NULL_SENTINEL = new Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Throwable f366748e;

        public OnErrorSentinel(Throwable th2) {
            this.f366748e = th2;
        }

        public String toString() {
            return "Notification=>Error:" + this.f366748e;
        }
    }

    private NotificationLite() {
    }

    public static <T> NotificationLite<T> instance() {
        return INSTANCE;
    }

    public boolean accept(Observer<? super T> observer, Object obj) {
        if (obj == ON_COMPLETED_SENTINEL) {
            observer.onCompleted();
            return true;
        }
        if (obj == ON_NEXT_NULL_SENTINEL) {
            observer.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == OnErrorSentinel.class) {
            observer.onError(((OnErrorSentinel) obj).f366748e);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public Object completed() {
        return ON_COMPLETED_SENTINEL;
    }

    public Object error(Throwable th2) {
        return new OnErrorSentinel(th2);
    }

    public Throwable getError(Object obj) {
        return ((OnErrorSentinel) obj).f366748e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T getValue(Object obj) {
        if (obj == ON_NEXT_NULL_SENTINEL) {
            return null;
        }
        return obj;
    }

    public boolean isCompleted(Object obj) {
        return obj == ON_COMPLETED_SENTINEL;
    }

    public boolean isError(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    public boolean isNext(Object obj) {
        return (obj == null || isError(obj) || isCompleted(obj)) ? false : true;
    }

    public boolean isNull(Object obj) {
        return obj == ON_NEXT_NULL_SENTINEL;
    }

    public Notification.Kind kind(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj == ON_COMPLETED_SENTINEL) {
            return Notification.Kind.OnCompleted;
        }
        return obj instanceof OnErrorSentinel ? Notification.Kind.OnError : Notification.Kind.OnNext;
    }

    public Object next(T t10) {
        return t10 == null ? ON_NEXT_NULL_SENTINEL : t10;
    }
}
