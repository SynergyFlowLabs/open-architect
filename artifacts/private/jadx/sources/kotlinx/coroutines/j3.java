package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class j3 extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f315159e;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f315159e = dVar;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        kotlin.coroutines.d<Unit> dVar = this.f315159e;
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
    }
}
