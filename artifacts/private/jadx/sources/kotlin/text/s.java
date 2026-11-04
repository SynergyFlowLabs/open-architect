package kotlin.text;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class s extends r {
    @kotlin.internal.f
    private static final Regex t(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex(str);
    }

    @kotlin.internal.f
    private static final Regex u(String str, Set<? extends n> options) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Regex(str, options);
    }

    @kotlin.internal.f
    private static final Regex v(String str, n option) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        return new Regex(str, option);
    }
}
