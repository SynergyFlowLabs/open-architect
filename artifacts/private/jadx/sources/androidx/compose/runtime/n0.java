package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCompositeKeyHashCode.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n*L\n1#1,49:1\n35#2:50\n27#2:51\n35#2:52\n35#2:53\n*S KotlinDebug\n*F\n+ 1 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n*L\n33#1:50\n36#1:51\n39#1:52\n44#1:53\n*E\n"})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36259a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f36260b = 0;

    public static final long a(int i10) {
        return i10;
    }

    public static final long b(long j10, int i10, int i11) {
        return j10 ^ Long.rotateLeft(i10, i11);
    }

    public static final long c(long j10, long j11, int i10) {
        return j10 ^ Long.rotateLeft(j11, i10);
    }

    public static final long d(long j10, int i10, int i11) {
        return Long.rotateLeft(j10, i11) ^ ((long) i10);
    }

    public static final long e(long j10) {
        return j10;
    }

    @NotNull
    public static final String f(long j10, int i10) {
        String string = Long.toString(j10, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final long g(long j10, int i10, int i11) {
        return Long.rotateRight(j10 ^ ((long) i10), i11);
    }
}
