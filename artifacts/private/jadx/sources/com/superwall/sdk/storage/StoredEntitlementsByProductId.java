package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.entitlements.Entitlement;
import hk.a;
import java.io.File;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class StoredEntitlementsByProductId implements Storable<Map<String, ? extends Set<? extends Entitlement>>> {

    @NotNull
    public static final StoredEntitlementsByProductId INSTANCE = new StoredEntitlementsByProductId();

    private StoredEntitlementsByProductId() {
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public File file(@NotNull Context context) {
        return Storable.DefaultImpls.file(this, context);
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public SearchPathDirectory getDirectory() {
        return SearchPathDirectory.APP_SPECIFIC_DOCUMENTS;
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public String getKey() {
        return "store.entitlementByProductId";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Map<String, ? extends Set<? extends Entitlement>>> getSerializer() {
        return a.l(a.K(q1.f312784a), a.o(Entitlement.Companion.serializer()));
    }
}
