package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.AssemblyStackTraceException;

/* JADX INFO: loaded from: classes14.dex */
public final class OnSubscribeOnAssembly<T> implements Observable.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    final Observable.OnSubscribe<T> source;
    final String stacktrace = createStacktrace();

    static final class OnAssemblySubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        final String stacktrace;

        public OnAssemblySubscriber(Subscriber<? super T> subscriber, String str) {
            super(subscriber);
            this.actual = subscriber;
            this.stacktrace = str;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.actual.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.stacktrace).attachTo(th2);
            this.actual.onError(th2);
        }

        @Override // rx.Observer
        public void onNext(T t10) {
            this.actual.onNext(t10);
        }
    }

    public OnSubscribeOnAssembly(Observable.OnSubscribe<T> onSubscribe) {
        this.source = onSubscribe;
    }

    static String createStacktrace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb2 = new StringBuilder("Assembly trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String string = stackTraceElement.toString();
            if (fullStackTrace || (stackTraceElement.getLineNumber() > 1 && !string.contains("RxJavaHooks.") && !string.contains("OnSubscribeOnAssembly") && !string.contains(".junit.runner") && !string.contains(".junit4.runner") && !string.contains(".junit.internal") && !string.contains("sun.reflect") && !string.contains("java.lang.Thread.") && !string.contains("ThreadPoolExecutor") && !string.contains("org.apache.catalina.") && !string.contains("org.apache.tomcat."))) {
                sb2.append("\n at ");
                sb2.append(string);
            }
        }
        sb2.append("\nOriginal exception:");
        return sb2.toString();
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.source.call((T) new OnAssemblySubscriber(subscriber, this.stacktrace));
    }
}
