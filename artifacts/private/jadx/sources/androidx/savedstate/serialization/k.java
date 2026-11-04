package androidx.savedstate.serialization;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final /* synthetic */ <T> T a(Bundle savedState, h configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return (T) c(m0.o(fVarC, null), savedState, configuration);
    }

    @oj.j
    @NotNull
    public static final <T> T b(@NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        return (T) e(deserializer, savedState, null, 4, null);
    }

    @oj.j
    @NotNull
    public static final <T> T c(@NotNull kotlinx.serialization.e<? extends T> deserializer, @NotNull Bundle savedState, @NotNull h configuration) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return (T) new j(savedState, configuration).decodeSerializableValue(deserializer);
    }

    public static /* synthetic */ Object d(Bundle savedState, h configuration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            configuration = h.f75194e;
        }
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return c(m0.o(fVarC, null), savedState, configuration);
    }

    public static /* synthetic */ Object e(kotlinx.serialization.e eVar, Bundle bundle, h hVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            hVar = h.f75194e;
        }
        return c(eVar, bundle, hVar);
    }
}
