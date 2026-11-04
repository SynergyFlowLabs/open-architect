package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/FixedScale\n+ 2 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,160:1\n31#2:161\n53#3,3:162\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/FixedScale\n*L\n140#1:161\n140#1:162,3\n*E\n"})
public final class p implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39469c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39470b;

    public p(float f10) {
        this.f39470b = f10;
    }

    public static /* synthetic */ p d(p pVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = pVar.f39470b;
        }
        return pVar.c(f10);
    }

    @Override // androidx.compose.ui.layout.l
    public long a(long j10, long j11) {
        float f10 = this.f39470b;
        return w2.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a));
    }

    public final float b() {
        return this.f39470b;
    }

    @NotNull
    public final p c(float f10) {
        return new p(f10);
    }

    public final float e() {
        return this.f39470b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Float.compare(this.f39470b, ((p) obj).f39470b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f39470b);
    }

    @NotNull
    public String toString() {
        return "FixedScale(value=" + this.f39470b + ')';
    }
}
