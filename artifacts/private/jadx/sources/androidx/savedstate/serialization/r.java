package androidx.savedstate.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final /* synthetic */ <T> kotlin.properties.f<Object, T> a(androidx.savedstate.m mVar, String str, h configuration, Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return b(mVar, m0.o(fVarC, null), str, configuration, init);
    }

    @NotNull
    public static final <T> kotlin.properties.f<Object, T> b(@NotNull androidx.savedstate.m mVar, @NotNull KSerializer<T> serializer, @Nullable String str, @NotNull h configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        return new q(mVar.getSavedStateRegistry(), serializer, str, configuration, init);
    }

    public static /* synthetic */ kotlin.properties.f c(androidx.savedstate.m mVar, String str, h configuration, Function0 init, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            configuration = h.f75194e;
        }
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return b(mVar, m0.o(fVarC, null), str, configuration, init);
    }

    public static /* synthetic */ kotlin.properties.f d(androidx.savedstate.m mVar, KSerializer kSerializer, String str, h hVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            hVar = h.f75194e;
        }
        return b(mVar, kSerializer, str, hVar, function0);
    }
}
