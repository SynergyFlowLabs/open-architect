package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.models.triggers.Experiment;
import hk.a;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfirmedAssignments implements Storable<Map<String, ? extends Experiment.Variant>> {

    @NotNull
    public static final ConfirmedAssignments INSTANCE = new ConfirmedAssignments();

    private ConfirmedAssignments() {
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
        return "store.confirmedAssignments";
    }

    @Override // com.superwall.sdk.storage.Storable
    @NotNull
    public KSerializer<Map<String, ? extends Experiment.Variant>> getSerializer() {
        return a.l(a.K(q1.f312784a), Experiment.Variant.Companion.serializer());
    }
}
