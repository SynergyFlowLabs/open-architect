package qf;

import com.sdk.growthbook.serializable_model.SerializableGBTrackData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class t {
    @NotNull
    public static final com.sdk.growthbook.utils.m a(@NotNull SerializableGBTrackData serializableGBTrackData) {
        Intrinsics.checkNotNullParameter(serializableGBTrackData, "<this>");
        return new com.sdk.growthbook.utils.m(h.a(serializableGBTrackData.e()), i.a(serializableGBTrackData.f()));
    }
}
