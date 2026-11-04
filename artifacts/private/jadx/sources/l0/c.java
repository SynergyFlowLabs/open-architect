package l0;

import android.os.Bundle;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.f0;
import androidx.compose.runtime.saveable.g0;
import androidx.savedstate.serialization.h;
import androidx.savedstate.serialization.k;
import androidx.savedstate.serialization.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;
import kotlinx.serialization.modules.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ <Serializable> c0<Serializable, Bundle> c(h hVar) {
        f fVarC = hVar.c();
        Intrinsics.reifiedOperationMarker(6, "Serializable");
        q0.n("kotlinx.serialization.serializer.withModule");
        return d(m0.o(fVarC, null), hVar);
    }

    @NotNull
    public static final <Serializable> c0<Serializable, Bundle> d(@NotNull final KSerializer<Serializable> kSerializer, @NotNull final h hVar) {
        return f0.e(new Function2() { // from class: l0.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.g(kSerializer, hVar, (g0) obj, obj2);
            }
        }, new Function1() { // from class: l0.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.h(kSerializer, hVar, (Bundle) obj);
            }
        });
    }

    public static /* synthetic */ c0 e(h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.f75194e;
        }
        f fVarC = hVar.c();
        Intrinsics.reifiedOperationMarker(6, "Serializable");
        q0.n("kotlinx.serialization.serializer.withModule");
        return d(m0.o(fVarC, null), hVar);
    }

    public static /* synthetic */ c0 f(KSerializer kSerializer, h hVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = h.f75194e;
        }
        return d(kSerializer, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle g(KSerializer kSerializer, h hVar, g0 g0Var, Object obj) {
        return n.c(kSerializer, obj, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(KSerializer kSerializer, h hVar, Bundle bundle) {
        return k.c(kSerializer, bundle, hVar);
    }
}
