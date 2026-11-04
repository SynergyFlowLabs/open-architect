package retrofit2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
final class KotlinExtensions$awaitResponse$2$1 extends l0 implements Function1<Throwable, Unit> {
    final /* synthetic */ Call<T> $this_awaitResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinExtensions$awaitResponse$2$1(Call<T> call) {
        super(1);
        this.$this_awaitResponse = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        this.$this_awaitResponse.cancel();
    }
}
