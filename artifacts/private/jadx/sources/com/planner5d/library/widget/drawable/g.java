package com.planner5d.library.widget.drawable;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNinePatchFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NinePatchFactory.kt\ncom/planner5d/library/widget/drawable/NinePatchFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class g {
    private final byte[] b(int i10, int i11, int i12, int i13) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i10);
        byteBufferOrder.putInt(i11);
        byteBufferOrder.putInt(i12);
        byteBufferOrder.putInt(i13);
        for (int i14 = 0; i14 < 9; i14++) {
            byteBufferOrder.putInt(1);
        }
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    @NotNull
    public final NinePatch a(@NotNull Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new NinePatch(bitmap, b(i10, i11, i12, i13));
    }
}
