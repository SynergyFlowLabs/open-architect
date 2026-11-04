package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/LongNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/LongNavType\n*L\n493#1:884\n498#1:885\n*E\n"})
public final class a0 extends d3<Long> {
    public a0() {
        super(false);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return Long.valueOf(androidx.savedstate.f.Q(androidx.savedstate.f.b(bundle), key));
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long parseValue(@NotNull String value) {
        String strSubstring;
        long j10;
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.M1(value, "L", false, 2, null)) {
            strSubstring = value.substring(0, value.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (StringsKt.u2(value, "0x", false, 2, null)) {
            String strSubstring2 = strSubstring.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            j10 = Long.parseLong(strSubstring2, CharsKt.checkRadix(16));
        } else {
            j10 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j10);
    }

    public void c(@NotNull Bundle bundle, @NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.savedstate.n.x(androidx.savedstate.n.c(bundle), key, j10);
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "long";
    }

    @Override // androidx.navigation.d3
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l10) {
        c(bundle, str, l10.longValue());
    }
}
