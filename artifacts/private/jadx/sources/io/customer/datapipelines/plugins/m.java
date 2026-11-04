package io.customer.datapipelines.plugins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class m {
    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("Activity|ListActivity|FragmentActivity|DialogActivity", n.IGNORE_CASE).replace(str, "");
    }
}
