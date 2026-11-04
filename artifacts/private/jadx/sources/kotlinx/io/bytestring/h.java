package kotlinx.io.bytestring;

import kotlin.jvm.internal.Intrinsics;
import kotlin.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {
    @s
    @NotNull
    public static final c a(@NotNull String str, @NotNull kotlin.text.h format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return c.f315746c.b(kotlin.text.g.t(str, format));
    }

    public static /* synthetic */ c b(String str, kotlin.text.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = kotlin.text.h.f313318d.a();
        }
        return a(str, hVar);
    }

    @s
    @NotNull
    public static final String c(@NotNull c cVar, int i10, int i11, @NotNull kotlin.text.h format) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.g.c0(cVar.q(), i10, i11, format);
    }

    @s
    @NotNull
    public static final String d(@NotNull c cVar, @NotNull kotlin.text.h format) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return kotlin.text.g.c0(cVar.q(), 0, cVar.q().length, format);
    }

    public static /* synthetic */ String e(c cVar, int i10, int i11, kotlin.text.h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.r();
        }
        if ((i12 & 4) != 0) {
            hVar = kotlin.text.h.f313318d.a();
        }
        return c(cVar, i10, i11, hVar);
    }

    public static /* synthetic */ String f(c cVar, kotlin.text.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = kotlin.text.h.f313318d.a();
        }
        return d(cVar, hVar);
    }
}
