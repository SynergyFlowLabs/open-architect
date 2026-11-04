package tf;

import android.content.Context;
import android.content.SharedPreferences;
import com.segment.analytics.kotlin.core.utilities.j;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@l(message = "Use StorageProvider to create storage for Android instead")
public final class c extends d {
    public /* synthetic */ c(Context context, sovran.kotlin.e eVar, String str, n0 n0Var, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, eVar, str, n0Var, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
    }

    public c(@NotNull Context context, @NotNull sovran.kotlin.e store, @NotNull String writeKey, @NotNull n0 ioDispatcher, @Nullable String str, @Nullable String str2) {
        StringBuilder sb2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        SharedPreferences sharedPreferences = context.getSharedPreferences("analytics-android-" + writeKey, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…y\", Context.MODE_PRIVATE)");
        uf.a aVar = new uf.a(sharedPreferences);
        File dir = context.getDir(str == null ? "segment-disk-queue" : str, 0);
        Intrinsics.checkNotNullExpressionValue(dir, "context.getDir(directory…e\", Context.MODE_PRIVATE)");
        j jVar = new j(dir);
        if (str2 == null) {
            sb2 = new StringBuilder();
            sb2.append("segment.events.file.index.");
            sb2.append(writeKey);
        } else {
            sb2 = new StringBuilder();
            sb2.append("segment.events.file.index.");
            sb2.append(writeKey);
            sb2.append('.');
            sb2.append(str2);
        }
        super(aVar, jVar, store, writeKey, sb2.toString(), ioDispatcher);
    }
}
