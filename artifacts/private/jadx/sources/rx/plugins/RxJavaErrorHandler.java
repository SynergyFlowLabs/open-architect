package rx.plugins;

import rx.annotations.Beta;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public abstract class RxJavaErrorHandler {
    protected static final String ERROR_IN_RENDERING_SUFFIX = ".errorRendering";

    @Deprecated
    public void handleError(Throwable th2) {
    }

    @Beta
    public final String handleOnNextValueRendering(Object obj) {
        try {
            return render(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ERROR_IN_RENDERING_SUFFIX;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            return obj.getClass().getName() + ERROR_IN_RENDERING_SUFFIX;
        }
    }

    @Beta
    protected String render(Object obj) throws InterruptedException {
        return null;
    }
}
