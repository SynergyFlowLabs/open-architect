package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/IntNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/IntNavType\n*L\n401#1:884\n406#1:885\n*E\n"})
public final class x extends d3<Integer> {
    public x() {
        super(false);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return Integer.valueOf(androidx.savedstate.f.G(androidx.savedstate.f.b(bundle), key));
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer parseValue(@NotNull String value) {
        int i10;
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.u2(value, "0x", false, 2, null)) {
            String strSubstring = value.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            i10 = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
        } else {
            i10 = Integer.parseInt(value);
        }
        return Integer.valueOf(i10);
    }

    public void c(@NotNull Bundle bundle, @NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.savedstate.n.t(androidx.savedstate.n.c(bundle), key, i10);
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "integer";
    }

    @Override // androidx.navigation.d3
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
        c(bundle, str, num.intValue());
    }
}
