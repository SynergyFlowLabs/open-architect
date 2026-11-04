package kotlinx.io.bytestring;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public static final void a(@NotNull d dVar, @NotNull c byteString) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        d.c(dVar, byteString.q(), 0, 0, 6, null);
    }

    public static final void b(@NotNull d dVar, @NotNull byte... bytes) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        d.c(dVar, bytes, 0, 0, 6, null);
    }

    public static final void c(@NotNull d append, byte b10) {
        Intrinsics.checkNotNullParameter(append, "$this$append");
        append.a(b10);
    }

    @NotNull
    public static final c d(int i10, @NotNull Function1<? super d, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        d dVar = new d(i10);
        builderAction.invoke(dVar);
        return dVar.g();
    }

    public static /* synthetic */ c e(int i10, Function1 builderAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        d dVar = new d(i10);
        builderAction.invoke(dVar);
        return dVar.g();
    }
}
