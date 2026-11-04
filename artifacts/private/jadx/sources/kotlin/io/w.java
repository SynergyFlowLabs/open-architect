package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class w extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull File file) {
        super(file, null, null, 6, null);
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
