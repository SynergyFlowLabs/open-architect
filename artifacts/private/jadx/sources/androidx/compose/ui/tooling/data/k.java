package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.s;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@n
public interface k {
    @NotNull
    s getBounds();

    int getDepth();

    @Nullable
    m getLocation();

    @Nullable
    String getName();

    @NotNull
    List<h> getParameters();

    default boolean isInline() {
        return false;
    }
}
