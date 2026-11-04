package androidx.lifecycle.serialization;

import androidx.lifecycle.l1;
import androidx.savedstate.serialization.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.properties.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ <T> f<Object, T> a(l1 l1Var, String str, h configuration, Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return b(l1Var, m0.o(fVarC, null), str, configuration, init);
    }

    @NotNull
    public static final <T> f<Object, T> b(@NotNull l1 l1Var, @NotNull KSerializer<T> serializer, @Nullable String str, @NotNull h configuration, @NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        return new b(l1Var, serializer, str, configuration, init);
    }

    public static /* synthetic */ f c(l1 l1Var, String str, h configuration, Function0 init, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            configuration = h.f75194e;
        }
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        kotlinx.serialization.modules.f fVarC = configuration.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return b(l1Var, m0.o(fVarC, null), str, configuration, init);
    }

    public static /* synthetic */ f d(l1 l1Var, KSerializer kSerializer, String str, h hVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            hVar = h.f75194e;
        }
        return b(l1Var, kSerializer, str, hVar, function0);
    }
}
