package io.ktor.websocket;

import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFrameCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,202:1\n1#2:203\n21#3,3:204\n21#3,3:207\n*S KotlinDebug\n*F\n+ 1 FrameCommon.kt\nio/ktor/websocket/FrameCommonKt\n*L\n169#1:204,3\n191#1:207,3\n*E\n"})
public final class f {
    @NotNull
    public static final byte[] a(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        byte[] bArrD = eVar.d();
        byte[] bArrCopyOf = Arrays.copyOf(bArrD, bArrD.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Nullable
    public static final a b(@NotNull e.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar.d().length < 2) {
            return null;
        }
        kotlinx.io.b bVar2 = new kotlinx.io.b();
        ui.j.i(bVar2, bVar.d(), 0, 0, 6, null);
        int i10 = 2 ^ 3;
        return new a(bVar2.readShort(), ui.u.g(bVar2, null, 0, 3, null));
    }

    @NotNull
    public static final String c(@NotNull e.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (!fVar.f()) {
            throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame");
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        kotlinx.io.b bVar = new kotlinx.io.b();
        ui.j.i(bVar, fVar.d(), 0, 0, 6, null);
        boolean z10 = false & false;
        return ti.b.b(charsetDecoderNewDecoder, bVar, 0, 2, null);
    }
}
