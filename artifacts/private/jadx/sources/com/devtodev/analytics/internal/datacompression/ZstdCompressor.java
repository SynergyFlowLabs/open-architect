package com.devtodev.analytics.internal.datacompression;

import com.github.luben.zstd.Zstd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZstdCompressor implements IDataCompressor {
    @Override // com.devtodev.analytics.internal.datacompression.IDataCompressor
    @NotNull
    public byte[] compressData(@NotNull byte[] data, int i10) throws Throwable {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrO = Zstd.o(data, i10);
        Intrinsics.checkNotNullExpressionValue(bArrO, "compress(data, compressionLevel)");
        return bArrO;
    }
}
