package v2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "InitializerViewModelFactoryKt")
public final class e {
    public static final /* synthetic */ <VM extends f2> void a(d dVar, Function1<? super a, ? extends VM> initializer) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        dVar.a(j1.d(f2.class), initializer);
    }

    @NotNull
    public static final j2.c b(@NotNull Function1<? super d, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        d dVar = new d();
        builder.invoke(dVar);
        return dVar.b();
    }
}
