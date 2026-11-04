package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.w0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(31)
final class h<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<R> f48041a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull kotlin.coroutines.d<? super R> dVar) {
        super(false);
        this.f48041a = dVar;
    }

    public void onError(@NotNull E e10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.f48041a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.f48041a;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
