package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
final class i3<T> extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final p<T> f315037e;

    /* JADX WARN: Multi-variable type inference failed */
    public i3(@NotNull p<? super T> pVar) {
        this.f315037e = pVar;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        Object objC1 = C().c1();
        if (objC1 instanceof c0) {
            p<T> pVar = this.f315037e;
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(((c0) objC1).f313551a)));
        } else {
            p<T> pVar2 = this.f315037e;
            Result.a aVar2 = Result.Companion;
            pVar2.resumeWith(Result.m785constructorimpl(x2.h(objC1)));
        }
    }
}
