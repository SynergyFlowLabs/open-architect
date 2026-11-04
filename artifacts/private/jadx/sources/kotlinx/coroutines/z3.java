package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class z3 extends CancellationException implements h0<z3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @Nullable
    public final transient p2 f315736a;

    public z3(@NotNull String str, @Nullable p2 p2Var) {
        super(str);
        this.f315736a = p2Var;
    }

    @Override // kotlinx.coroutines.h0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3 b() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        z3 z3Var = new z3(message, this.f315736a);
        z3Var.initCause(this);
        return z3Var;
    }

    public z3(@NotNull String str) {
        this(str, null);
    }
}
