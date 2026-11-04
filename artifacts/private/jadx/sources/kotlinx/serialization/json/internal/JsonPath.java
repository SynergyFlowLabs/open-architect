package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class JsonPath {
    private int currentDepth;

    @NotNull
    private Object[] currentObjectPath = new Object[8];

    @NotNull
    private int[] indicies;

    private static final class Tombstone {

        @NotNull
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final String prettyString(Object obj) {
        String serialName;
        SerialDescriptor serialDescriptor = obj instanceof SerialDescriptor ? (SerialDescriptor) obj : null;
        return (serialDescriptor == null || (serialName = serialDescriptor.getSerialName()) == null) ? String.valueOf(obj) : serialName;
    }

    private final void resize() {
        int i10 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    @NotNull
    public final String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.currentDepth + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.currentObjectPath[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(serialDescriptor.getKind(), m.b.f315862a)) {
                    int i12 = 6 | (-1);
                    if (this.indicies[i11] != -1) {
                        sb2.append("[");
                        sb2.append(this.indicies[i11]);
                        sb2.append("]");
                    }
                } else {
                    int i13 = this.indicies[i11];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.getElementName(i13));
                    }
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void popDescriptor() {
        int i10 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.currentDepth = i10 - 1;
        }
        int i11 = this.currentDepth;
        if (i11 != -1) {
            this.currentDepth = i11 - 1;
        }
    }

    public final void pushDescriptor(@NotNull SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i10 = this.currentDepth + 1;
        this.currentDepth = i10;
        if (i10 == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i10] = sd2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] == -2) {
            this.currentObjectPath[i10] = Tombstone.INSTANCE;
        }
    }

    @NotNull
    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(@Nullable Object obj) {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.currentDepth = i11;
            if (i11 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i12 = this.currentDepth;
        objArr[i12] = obj;
        this.indicies[i12] = -2;
    }

    public final void updateDescriptorIndex(int i10) {
        this.indicies[this.currentDepth] = i10;
    }
}
