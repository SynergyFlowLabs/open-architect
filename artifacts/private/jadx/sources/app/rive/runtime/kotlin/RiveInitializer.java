package app.rive.runtime.kotlin;

import android.content.Context;
import app.rive.runtime.kotlin.core.Rive;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RiveInitializer implements androidx.startup.b<Unit> {
    @Override // androidx.startup.b
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.f312394a;
    }

    @Override // androidx.startup.b
    @NotNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Rive.init$default(Rive.INSTANCE, context, null, 2, null);
    }
}
