package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "DataStoreFile")
public final class c {
    @NotNull
    public static final File a(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
