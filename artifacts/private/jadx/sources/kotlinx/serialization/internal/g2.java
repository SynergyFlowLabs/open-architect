package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 {
    @kotlinx.serialization.i
    public static final void a(@NotNull int[] seenArray, @NotNull int[] goldenMaskArray, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = goldenMaskArray[i10] & (~seenArray[i10]);
            if (i11 != 0) {
                for (int i12 = 0; i12 < 32; i12++) {
                    if ((i11 & 1) != 0) {
                        arrayList.add(descriptor.getElementName((i10 * 32) + i12));
                    }
                    i11 >>>= 1;
                }
            }
        }
        throw new kotlinx.serialization.l(arrayList, descriptor.getSerialName());
    }

    @kotlinx.serialization.i
    public static final void b(int i10, int i11, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.getElementName(i13));
            }
            i12 >>>= 1;
        }
        throw new kotlinx.serialization.l(arrayList, descriptor.getSerialName());
    }
}
