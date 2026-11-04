package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.serialization.AnySerializer;
import hk.a;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class UserAttributes implements Storable<Map<String, ? extends Object>> {

    @NotNull
    public static final UserAttributes INSTANCE = new UserAttributes();

    private UserAttributes() {
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public File file(@NotNull Context context) {
        return Storable.DefaultImpls.file(this, context);
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public SearchPathDirectory getDirectory() {
        return SearchPathDirectory.USER_SPECIFIC_DOCUMENTS;
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public String getKey() {
        return "store.userAttributes";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Map<String, ? extends Object>> getSerializer() {
        return a.l(a.K(q1.f312784a), AnySerializer.INSTANCE);
    }
}
