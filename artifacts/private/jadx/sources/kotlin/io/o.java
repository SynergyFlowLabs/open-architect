package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class o extends n {
    @NotNull
    public static final k M(@NotNull File file, @NotNull FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new k(file, direction);
    }

    public static /* synthetic */ k N(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return M(file, fileWalkDirection);
    }

    @NotNull
    public static final k O(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return M(file, FileWalkDirection.BOTTOM_UP);
    }

    @NotNull
    public static final k P(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return M(file, FileWalkDirection.TOP_DOWN);
    }
}
