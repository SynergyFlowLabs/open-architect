package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringNavType\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,883:1\n106#2:884\n90#2:885\n1#3:886\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/StringNavType\n*L\n774#1:884\n783#1:885\n*E\n"})
public final class d4 extends d3<String> {
    public d4() {
        super(true);
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleB = androidx.savedstate.f.b(bundle);
        if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
            return null;
        }
        return androidx.savedstate.f.u0(bundleB, key);
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
            return value;
        }
        int i10 = 5 ^ 0;
        return null;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleC = androidx.savedstate.n.c(bundle);
        if (str != null) {
            androidx.savedstate.n.J(bundleC, key, str);
        } else {
            androidx.savedstate.n.z(bundleC, key);
        }
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String serializeAsValue(@Nullable String str) {
        if (str == null) {
            return AbstractJsonLexerKt.NULL;
        }
        int i10 = (5 << 2) >> 0;
        String strC = g3.c(g3.f71010a, str, null, 2, null);
        return strC == null ? AbstractJsonLexerKt.NULL : strC;
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return androidx.constraintlayout.core.motion.utils.v.b.f43988e;
    }
}
