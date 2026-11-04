package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.d3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends d3<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f71305a = new s();

    private s() {
        super(false);
    }

    @Override // androidx.navigation.d3
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(@NotNull Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // androidx.navigation.d3
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String parseValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return AbstractJsonLexerKt.NULL;
    }

    @Override // androidx.navigation.d3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // androidx.navigation.d3
    @NotNull
    public String getName() {
        return "unknown";
    }
}
