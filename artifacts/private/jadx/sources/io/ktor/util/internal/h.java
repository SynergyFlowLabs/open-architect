package io.ktor.util.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final f f296673a;

    public h(@NotNull f ref) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.f296673a = ref;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.f296673a + AbstractJsonLexerKt.END_LIST;
    }
}
