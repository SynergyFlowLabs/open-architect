package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<g<?>> getComponents() {
        return CollectionsKt.emptyList();
    }
}
