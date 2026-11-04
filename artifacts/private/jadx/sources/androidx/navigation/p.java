package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/BoolNavType\n*L\n678#1:884\n683#1:885\n*E\n"})
public final class p extends d3<Boolean> {
    public p() {
        super(false);
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (androidx.savedstate.f.c(bundleB, key) && !androidx.savedstate.f.C0(bundleB, key)) {
            return Boolean.valueOf(androidx.savedstate.f.k(bundleB, key));
        }
        return null;
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean parseValue(@NotNull String value) {
        boolean z10;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, com.facebook.internal.z0.P)) {
            z10 = true;
        } else {
            if (!Intrinsics.areEqual(value, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void c(@NotNull Bundle bundle, @NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.savedstate.n.i(androidx.savedstate.n.c(bundle), key, z10);
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "boolean";
    }

    @Override // androidx.navigation.d3
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
        c(bundle, str, bool.booleanValue());
    }
}
