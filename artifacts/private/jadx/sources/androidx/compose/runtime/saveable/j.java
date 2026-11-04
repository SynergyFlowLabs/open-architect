package androidx.compose.runtime.saveable;

import androidx.compose.runtime.n3;
import androidx.media3.exoplayer.a5;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    @androidx.compose.runtime.o
    public static final /* synthetic */ <T> n3<T> a(Object[] objArr, androidx.savedstate.serialization.h hVar, Function0<? extends n3<T>> function0, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            hVar = androidx.savedstate.serialization.h.f75194e;
        }
        androidx.savedstate.serialization.h hVar2 = hVar;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlinx.serialization.modules.f fVarC = hVar2.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return b(objArrCopyOf, m0.o(fVarC, null), hVar2, function0, c0Var, (i10 << 3) & 8064, 0);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n3<T> b(@NotNull Object[] objArr, @NotNull KSerializer<T> kSerializer, @Nullable androidx.savedstate.serialization.h hVar, @NotNull Function0<? extends n3<T>> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            hVar = androidx.savedstate.serialization.h.f75194e;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1248826527, i10, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:163)");
        }
        int i12 = 6 << 0;
        n3<T> n3Var = (n3) i.i(Arrays.copyOf(objArr, objArr.length), i.e(l0.c.d(kSerializer, hVar)), null, function0, c0Var, (i10 & 7168) | a5.S0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n3Var;
    }

    @androidx.compose.runtime.o
    public static final /* synthetic */ <T> T c(Object[] objArr, androidx.savedstate.serialization.h hVar, Function0<? extends T> function0, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            hVar = androidx.savedstate.serialization.h.f75194e;
        }
        androidx.savedstate.serialization.h hVar2 = hVar;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlinx.serialization.modules.f fVarC = hVar2.c();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.withModule");
        return (T) d(objArrCopyOf, m0.o(fVarC, null), hVar2, function0, c0Var, (i10 << 3) & 8064, 0);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> T d(@NotNull Object[] objArr, @NotNull KSerializer<T> kSerializer, @Nullable androidx.savedstate.serialization.h hVar, @NotNull Function0<? extends T> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            hVar = androidx.savedstate.serialization.h.f75194e;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1261607160, i10, -1, "androidx.compose.runtime.saveable.rememberSerializable (RememberSerializable.kt:93)");
        }
        T t10 = (T) i.i(Arrays.copyOf(objArr, objArr.length), l0.c.d(kSerializer, hVar), null, function0, c0Var, (i10 & 7168) | a5.S0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return t10;
    }
}
