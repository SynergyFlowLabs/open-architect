package rx.exceptions;

import java.util.HashSet;
import java.util.List;
import rx.Observer;
import rx.SingleSubscriber;
import rx.annotations.Beta;

/* JADX INFO: loaded from: classes14.dex */
public final class Exceptions {
    private static final int MAX_DEPTH = 25;

    private Exceptions() {
        throw new IllegalStateException("No instances!");
    }

    public static void addCause(Throwable th2, Throwable th3) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (th2.getCause() != null) {
            int i11 = i10 + 1;
            if (i10 >= 25) {
                return;
            }
            th2 = th2.getCause();
            if (hashSet.contains(th2.getCause())) {
                break;
            }
            hashSet.add(th2.getCause());
            i10 = i11;
        }
        try {
            th2.initCause(th3);
        } catch (Throwable unused) {
        }
    }

    public static Throwable getFinalCause(Throwable th2) {
        int i10 = 0;
        while (th2.getCause() != null) {
            int i11 = i10 + 1;
            if (i10 >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th2 = th2.getCause();
            i10 = i11;
        }
        return th2;
    }

    public static RuntimeException propagate(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new RuntimeException(th2);
    }

    public static void throwIfAny(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new RuntimeException(th2);
        }
        throw ((Error) th2);
    }

    public static void throwIfFatal(Throwable th2) {
        if (th2 instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th2);
        }
        if (th2 instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th2);
        }
        if (th2 instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    @Beta
    public static void throwOrReport(Throwable th2, Observer<?> observer, Object obj) {
        throwIfFatal(th2);
        observer.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }

    @Beta
    public static void throwOrReport(Throwable th2, SingleSubscriber<?> singleSubscriber, Object obj) {
        throwIfFatal(th2);
        singleSubscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }

    @Beta
    public static void throwOrReport(Throwable th2, Observer<?> observer) {
        throwIfFatal(th2);
        observer.onError(th2);
    }

    @Beta
    public static void throwOrReport(Throwable th2, SingleSubscriber<?> singleSubscriber) {
        throwIfFatal(th2);
        singleSubscriber.onError(th2);
    }
}
