package androidx.sqlite.db.framework;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements w3.e.c {
    @Override // w3.e.c
    @NotNull
    public w3.e a(@NotNull w3.e.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new d(configuration.f385896a, configuration.f385897b, configuration.f385898c, configuration.f385899d, configuration.f385900e);
    }
}
