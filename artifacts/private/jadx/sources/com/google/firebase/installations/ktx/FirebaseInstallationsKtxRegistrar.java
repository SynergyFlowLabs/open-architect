package com.google.firebase.installations.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@l(message = "com.google.firebase.installations.FirebaseInstallationsKtxRegistrar has been deprecated. Use `com.google.firebase.installationsFirebaseInstallationsKtxRegistrar` instead.", replaceWith = @b1(expression = "", imports = {}))
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<g<?>> getComponents() {
        return CollectionsKt.emptyList();
    }
}
