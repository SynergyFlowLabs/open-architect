package ek;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.bytestring.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@a
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f274886a = new b();

    private b() {
    }

    public final void a(@NotNull c byteString, @NotNull Function1<? super byte[], Unit> block) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(byteString.q());
    }

    @NotNull
    public final c b(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return c.f315746c.b(array);
    }
}
