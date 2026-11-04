package androidx.compose.runtime.snapshots;

import androidx.collection.y1;
import java.util.Arrays;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotId.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/LongListKt\n+ 4 LongList.kt\nandroidx/collection/MutableLongList\n+ 5 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,148:1\n1#2:149\n1#2:151\n939#3:150\n908#3:154\n673#4,2:152\n65#5:155\n251#5,6:156\n*S KotlinDebug\n*F\n+ 1 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder\n*L\n128#1:151\n128#1:150\n128#1:154\n128#1:152,2\n135#1:155\n138#1:156,6\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36594b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f36595a;

    public u(@Nullable long[] jArr) {
        y1 y1Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            y1Var = new y1(jArrCopyOf.length);
            y1Var.d0(y1Var.f12447b, jArrCopyOf);
        } else {
            y1Var = new y1(0, 1, null);
        }
        this.f36595a = y1Var;
    }

    public final void a(long j10) {
        this.f36595a.b0(j10);
    }

    @Nullable
    public final long[] b() {
        y1 y1Var = this.f36595a;
        int i10 = y1Var.f12447b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = y1Var.f12446a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
