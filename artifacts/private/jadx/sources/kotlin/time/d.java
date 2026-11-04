package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f313411a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<DecimalFormat>[] f313412b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f313412b = threadLocalArr;
    }

    private static final DecimalFormat a(int i10) {
        DecimalFormat decimalFormat = new DecimalFormat(com.facebook.appevents.p.f99189d0);
        if (i10 > 0) {
            decimalFormat.setMinimumFractionDigits(i10);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String b(double d10, int i10) {
        DecimalFormat decimalFormatA;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f313412b;
        if (i10 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i10];
            DecimalFormat decimalFormatA2 = threadLocal.get();
            if (decimalFormatA2 == null) {
                decimalFormatA2 = a(i10);
                threadLocal.set(decimalFormatA2);
            } else {
                Intrinsics.checkNotNull(decimalFormatA2);
            }
            decimalFormatA = decimalFormatA2;
        } else {
            decimalFormatA = a(i10);
        }
        String str = decimalFormatA.format(d10);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean c() {
        return f313411a;
    }
}
