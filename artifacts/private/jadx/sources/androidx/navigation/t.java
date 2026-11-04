package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/FloatNavType\n*L\n590#1:884\n595#1:885\n*E\n"})
public final class t extends d3<Float> {
    public t() {
        super(false);
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return Float.valueOf(androidx.savedstate.f.C(androidx.savedstate.f.b(bundle), key));
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Float.valueOf(Float.parseFloat(value));
    }

    public void c(@NotNull Bundle bundle, @NotNull String key, float f10) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.savedstate.n.r(androidx.savedstate.n.c(bundle), key, f10);
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "float";
    }

    @Override // androidx.navigation.d3
    public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f10) {
        c(bundle, str, f10.floatValue());
    }
}
