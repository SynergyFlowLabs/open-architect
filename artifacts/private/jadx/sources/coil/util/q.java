package coil.util;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class q implements okhttp3.f, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.e f87855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n<f0> f87856b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull okhttp3.e eVar, @NotNull kotlinx.coroutines.n<? super f0> nVar) {
        this.f87855a = eVar;
        this.f87856b = nVar;
    }

    public void c(@Nullable Throwable th2) {
        try {
            this.f87855a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        c(th2);
        return Unit.f312394a;
    }

    @Override // okhttp3.f
    public void onFailure(@NotNull okhttp3.e eVar, @NotNull IOException iOException) {
        if (!eVar.isCanceled()) {
            kotlinx.coroutines.n<f0> nVar = this.f87856b;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(iOException)));
        }
    }

    @Override // okhttp3.f
    public void onResponse(@NotNull okhttp3.e eVar, @NotNull f0 f0Var) {
        kotlinx.coroutines.n<f0> nVar = this.f87856b;
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m785constructorimpl(f0Var));
    }
}
