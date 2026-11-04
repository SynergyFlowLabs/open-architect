package rf;

import com.sdk.growthbook.utils.GBStickyAssignmentsDocument;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    @NotNull
    Map<String, GBStickyAssignmentsDocument> a(@NotNull Map<String, String> map);

    @Nullable
    GBStickyAssignmentsDocument b(@NotNull String str, @NotNull String str2);

    void c(@NotNull GBStickyAssignmentsDocument gBStickyAssignmentsDocument);
}
