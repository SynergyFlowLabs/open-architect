package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateConfig.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,2:34\n243#2:36\n243#2:37\n33#2:38\n*S KotlinDebug\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n*L\n26#1:34,2\n27#1:36\n28#1:37\n26#1:38\n*E\n"})
public final class g {
    @NotNull
    public static final kotlinx.serialization.modules.f b() {
        kotlinx.serialization.modules.g gVar = new kotlinx.serialization.modules.g();
        gVar.d(j1.d(Size.class), androidx.savedstate.serialization.serializers.p.f75247a);
        gVar.d(j1.d(SizeF.class), androidx.savedstate.serialization.serializers.o.f75245a);
        gVar.contextual(j1.d(SparseArray.class), new Function1() { // from class: androidx.savedstate.serialization.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.c((List) obj);
            }
        });
        return gVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer c(List argSerializers) {
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        return new SparseArraySerializer((KSerializer) CollectionsKt.first(argSerializers));
    }
}
