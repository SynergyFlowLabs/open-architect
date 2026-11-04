package rx;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class Notification<T> {
    private static final Notification<Void> ON_COMPLETED = new Notification<>(Kind.OnCompleted, null, null);
    private final Kind kind;
    private final Throwable throwable;
    private final T value;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    private Notification(Kind kind, T t10, Throwable th2) {
        this.value = t10;
        this.throwable = th2;
        this.kind = kind;
    }

    public static <T> Notification<T> createOnCompleted() {
        return (Notification<T>) ON_COMPLETED;
    }

    public static <T> Notification<T> createOnError(Throwable th2) {
        return new Notification<>(Kind.OnError, null, th2);
    }

    public static <T> Notification<T> createOnNext(T t10) {
        return new Notification<>(Kind.OnNext, t10, null);
    }

    public void accept(Observer<? super T> observer) {
        Kind kind = this.kind;
        if (kind == Kind.OnNext) {
            observer.onNext(getValue());
        } else if (kind == Kind.OnCompleted) {
            observer.onCompleted();
        } else {
            observer.onError(getThrowable());
        }
    }

    public boolean equals(Object obj) {
        T t10;
        T t11;
        Throwable th2;
        Throwable th3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        return notification.getKind() == getKind() && ((t10 = this.value) == (t11 = notification.value) || (t10 != null && t10.equals(t11))) && ((th2 = this.throwable) == (th3 = notification.throwable) || (th2 != null && th2.equals(th3)));
    }

    public Kind getKind() {
        return this.kind;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public T getValue() {
        return this.value;
    }

    public boolean hasThrowable() {
        return isOnError() && this.throwable != null;
    }

    public boolean hasValue() {
        return isOnNext() && this.value != null;
    }

    public int hashCode() {
        int iHashCode = getKind().hashCode();
        if (hasValue()) {
            iHashCode = (iHashCode * 31) + getValue().hashCode();
        }
        return hasThrowable() ? (iHashCode * 31) + getThrowable().hashCode() : iHashCode;
    }

    public boolean isOnCompleted() {
        return getKind() == Kind.OnCompleted;
    }

    public boolean isOnError() {
        return getKind() == Kind.OnError;
    }

    public boolean isOnNext() {
        return getKind() == Kind.OnNext;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(super.toString());
        sb2.append(' ');
        sb2.append(getKind());
        if (hasValue()) {
            sb2.append(' ');
            sb2.append(getValue());
        }
        if (hasThrowable()) {
            sb2.append(' ');
            sb2.append(getThrowable().getMessage());
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Deprecated
    public static <T> Notification<T> createOnCompleted(Class<T> cls) {
        return (Notification<T>) ON_COMPLETED;
    }
}
