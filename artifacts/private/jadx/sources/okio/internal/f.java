package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.b1;
import okio.e1;
import okio.u0;
import okio.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
@oj.i(name = "-RealBufferedSink")
public final class f {
    public static final void a(@NotNull u0 u0Var) throws Throwable {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            return;
        }
        if (u0Var.f335112b.size() > 0) {
            z0 z0Var = u0Var.f335111a;
            okio.l lVar = u0Var.f335112b;
            z0Var.Ga(lVar, lVar.size());
        }
        th = null;
        try {
            u0Var.f335111a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        u0Var.f335113c = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final okio.m b(@NotNull u0 u0Var) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long size = u0Var.f335112b.size();
        if (size > 0) {
            u0Var.f335111a.Ga(u0Var.f335112b, size);
        }
        return u0Var;
    }

    @NotNull
    public static final okio.m c(@NotNull u0 u0Var) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jE = u0Var.f335112b.e();
        if (jE > 0) {
            u0Var.f335111a.Ga(u0Var.f335112b, jE);
        }
        return u0Var;
    }

    public static final void d(@NotNull u0 u0Var) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (u0Var.f335112b.size() > 0) {
            z0 z0Var = u0Var.f335111a;
            okio.l lVar = u0Var.f335112b;
            z0Var.Ga(lVar, lVar.size());
        }
        u0Var.f335111a.flush();
    }

    @NotNull
    public static final e1 e(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        return u0Var.f335111a.timeout();
    }

    @NotNull
    public static final String f(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        return "buffer(" + u0Var.f335111a + ')';
    }

    @NotNull
    public static final okio.m g(@NotNull u0 u0Var, @NotNull okio.o byteString) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.U7(byteString);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m h(@NotNull u0 u0Var, @NotNull okio.o byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.P5(byteString, i10, i11);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m i(@NotNull u0 u0Var, @NotNull b1 source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(u0Var.f335112b, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
            u0Var.L9();
        }
        return u0Var;
    }

    @NotNull
    public static final okio.m j(@NotNull u0 u0Var, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.write(source);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m k(@NotNull u0 u0Var, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.write(source, i10, i11);
        return u0Var.L9();
    }

    public static final void l(@NotNull u0 u0Var, @NotNull okio.l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.Ga(source, j10);
        u0Var.L9();
    }

    public static final long m(@NotNull u0 u0Var, @NotNull b1 source) throws IOException {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(u0Var.f335112b, PlaybackStateCompat.f9665p2);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            u0Var.L9();
        }
    }

    @NotNull
    public static final okio.m n(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.writeByte(i10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m o(@NotNull u0 u0Var, long j10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.h5(j10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m p(@NotNull u0 u0Var, long j10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.q7(j10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m q(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.writeInt(i10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m r(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.f6(i10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m s(@NotNull u0 u0Var, long j10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.writeLong(j10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m t(@NotNull u0 u0Var, long j10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.m2(j10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m u(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.writeShort(i10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m v(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.O6(i10);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m w(@NotNull u0 u0Var, @NotNull String string) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.pa(string);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m x(@NotNull u0 u0Var, @NotNull String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.K3(string, i10, i11);
        return u0Var.L9();
    }

    @NotNull
    public static final okio.m y(@NotNull u0 u0Var, int i10) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        if (u0Var.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        u0Var.f335112b.d9(i10);
        return u0Var.L9();
    }
}
