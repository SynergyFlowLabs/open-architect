package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.y6;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,587:1\n80#2:588\n80#2:589\n85#2:590\n90#2:591\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n554#1:588\n560#1:589\n571#1:590\n575#1:591\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19805a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19806a;

        static {
            int[] iArr = new int[y6.values().length];
            try {
                iArr[y6.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y6.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19806a = iArr;
        }
    }

    private /* synthetic */ c(long j10) {
        this.f19805a = j10;
    }

    public static final /* synthetic */ c a(long j10) {
        return new c(j10);
    }

    public static final int b(long j10) {
        return i(j10);
    }

    @Nullable
    public static final y6 c(long j10) {
        return j(j10);
    }

    public static long d(int i10) {
        return f((((long) i10) << 32) | (((long) (-1)) & com.rabbitmq.client.k0.f265952a));
    }

    public static long e(int i10, @Nullable y6 y6Var) {
        int i11 = -1;
        int i12 = y6Var == null ? -1 : a.f19806a[y6Var.ordinal()];
        if (i12 != -1) {
            i11 = 1;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 != 2) {
                throw new kotlin.k0();
            }
        }
        return f((((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a));
    }

    public static long f(long j10) {
        return j10;
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof c) && j10 == ((c) obj).m();
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static final int i(long j10) {
        return (int) (j10 >> 32);
    }

    @Nullable
    public static final y6 j(long j10) {
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (i10 < 0) {
            return null;
        }
        return i10 == 0 ? y6.Start : y6.End;
    }

    public static int k(long j10) {
        return Long.hashCode(j10);
    }

    public static String l(long j10) {
        return "CursorAndWedgeAffinity(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f19805a, obj);
    }

    public int hashCode() {
        return k(this.f19805a);
    }

    public final /* synthetic */ long m() {
        return this.f19805a;
    }

    public String toString() {
        return l(this.f19805a);
    }
}
