package tf;

import com.segment.analytics.kotlin.core.utilities.f;
import com.segment.analytics.kotlin.core.utilities.p;
import com.segment.analytics.kotlin.core.utilities.s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class d extends s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull p propertiesFile, @NotNull f eventStream, @NotNull sovran.kotlin.e store, @NotNull String writeKey, @NotNull String fileIndexKey, @NotNull n0 ioDispatcher) {
        super(propertiesFile, eventStream, store, writeKey, fileIndexKey, ioDispatcher);
        Intrinsics.checkNotNullParameter(propertiesFile, "propertiesFile");
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(fileIndexKey, "fileIndexKey");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
    }

    @Override // com.segment.analytics.kotlin.core.utilities.s, com.segment.analytics.kotlin.core.s
    @Nullable
    public String d(@NotNull com.segment.analytics.kotlin.core.s.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key != com.segment.analytics.kotlin.core.s.b.LegacyAppBuild) {
            return super.d(key);
        }
        int iC = r().c(key.l(), -1);
        if (iC != -1) {
            return String.valueOf(iC);
        }
        return null;
    }
}
