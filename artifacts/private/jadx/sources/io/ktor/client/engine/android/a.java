package io.ktor.client.engine.android;

import io.ktor.client.engine.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements l<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294287a = new a();

    private a() {
    }

    @Override // io.ktor.client.engine.l
    @NotNull
    public io.ktor.client.engine.b a(@NotNull Function1<? super h, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        h hVar = new h();
        block.invoke(hVar);
        return new d(hVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj && !(obj instanceof a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 885084173;
    }

    @NotNull
    public String toString() {
        return "Android";
    }
}
