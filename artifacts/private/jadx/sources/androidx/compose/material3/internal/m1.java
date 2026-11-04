package androidx.compose.material3.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f29016a = 7;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f29017b = 86400000;

    @NotNull
    public static final v1 a(@NotNull String str) {
        String strJ4 = StringsKt.j4(StringsKt.k2(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        MatchResult matchResultD = Regex.d(new Regex("[/\\-.]"), strJ4, 0, 2, null);
        Intrinsics.checkNotNull(matchResultD);
        MatchGroup matchGroup = matchResultD.b().get(0);
        Intrinsics.checkNotNull(matchGroup);
        return new v1(strJ4, matchGroup.f().charAt(0));
    }
}
