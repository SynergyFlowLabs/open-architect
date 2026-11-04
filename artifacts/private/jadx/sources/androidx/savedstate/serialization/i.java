package androidx.savedstate.serialization;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,138:1\n31#2,2:139\n243#2:141\n33#2:142\n*S KotlinDebug\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n*L\n137#1:139,2\n137#1:141\n137#1:142\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.serialization.modules.f f75201a;

    static {
        kotlinx.serialization.modules.g gVar = new kotlinx.serialization.modules.g();
        gVar.d(j1.d(Bundle.class), androidx.savedstate.serialization.serializers.n.f75243a);
        f75201a = kotlinx.serialization.modules.k.d(gVar.g(), g.b());
    }

    @oj.j
    @NotNull
    public static final h a(@NotNull h from, @NotNull Function1<? super h.a, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        h.a aVar = new h.a(from);
        builderAction.invoke(aVar);
        return aVar.a();
    }

    @oj.j
    @NotNull
    public static final h b(@NotNull Function1<? super h.a, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        boolean z10 = false & true;
        return c(null, builderAction, 1, null);
    }

    public static /* synthetic */ h c(h hVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f75194e;
        }
        return a(hVar, function1);
    }
}
