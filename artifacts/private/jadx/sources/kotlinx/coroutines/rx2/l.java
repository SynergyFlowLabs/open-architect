package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class l extends kotlinx.coroutines.a<Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.reactivex.e f315379d;

    public l(@NotNull CoroutineContext coroutineContext, @NotNull io.reactivex.e eVar) {
        super(coroutineContext, false, true);
        this.f315379d = eVar;
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        try {
            if (this.f315379d.a(th2)) {
                return;
            }
        } catch (Throwable th3) {
            kotlin.p.a(th2, th3);
        }
        j.a(th2, getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public void g2(@NotNull Unit unit) {
        try {
            this.f315379d.onComplete();
        } catch (Throwable th2) {
            j.a(th2, getContext());
        }
    }
}
