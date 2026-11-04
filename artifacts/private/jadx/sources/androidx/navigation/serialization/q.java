package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateArgStore\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,186:1\n90#2:187\n*S KotlinDebug\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateArgStore\n*L\n183#1:187\n*E\n"})
final class q extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f71301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, d3<?>> f71302b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull Bundle savedState, @NotNull Map<String, ? extends d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.f71301a = savedState;
        this.f71302b = typeMap;
    }

    @Override // androidx.navigation.serialization.a
    public boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return androidx.savedstate.f.c(androidx.savedstate.f.b(this.f71301a), key);
    }

    @Override // androidx.navigation.serialization.a
    @Nullable
    public Object b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d3<?> d3Var = this.f71302b.get(key);
        if (d3Var != null) {
            return d3Var.get(this.f71301a, key);
        }
        return null;
    }
}
