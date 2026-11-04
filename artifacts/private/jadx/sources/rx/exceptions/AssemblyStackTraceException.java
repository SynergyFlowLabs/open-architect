package rx.exceptions;

import java.util.HashSet;
import rx.annotations.Experimental;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes14.dex */
@Experimental
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str) {
        super(str);
    }

    public static AssemblyStackTraceException find(Throwable th2) {
        HashSet hashSet = new HashSet();
        while (!(th2 instanceof AssemblyStackTraceException)) {
            if (th2 != null && th2.getCause() != null) {
                th2 = th2.getCause();
                if (!hashSet.add(th2)) {
                }
            }
            return null;
        }
        return (AssemblyStackTraceException) th2;
    }

    public void attachTo(Throwable th2) {
        HashSet hashSet = new HashSet();
        while (th2.getCause() != null) {
            th2 = th2.getCause();
            if (!hashSet.add(th2)) {
                RxJavaHooks.onError(this);
                return;
            }
        }
        th2.initCause(this);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
