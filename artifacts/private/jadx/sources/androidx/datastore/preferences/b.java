package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "PreferenceDataStoreFile")
public final class b {
    @NotNull
    public static final File a(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return androidx.datastore.c.a(context, name + ".preferences_pb");
    }
}
