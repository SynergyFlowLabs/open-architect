package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f41035a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f41036b = "ScrollCapture";

    static final class a extends l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f41037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f41037a = cancellationSignal;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            if (th2 != null) {
                this.f41037a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 c(s0 s0Var, CancellationSignal cancellationSignal, Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        int i10 = 2 ^ 0;
        final p2 p2VarF = kotlinx.coroutines.k.f(s0Var, null, null, function2, 3, null);
        p2VarF.E(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                e.d(p2VarF);
            }
        });
        return p2VarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p2 p2Var) {
        p2.a.b(p2Var, null, 1, null);
    }
}
