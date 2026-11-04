package yb;

import android.content.Context;
import com.planner5d.library.engine.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements p {
    @Override // com.planner5d.library.engine.p
    @NotNull
    public com.planner5d.library.engine.o a(@NotNull Context context, @NotNull gc.g errorHandler, @NotNull Function0<? extends com.planner5d.library.engine.a> application) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(application, "application");
        return new n(context, errorHandler, application);
    }
}
