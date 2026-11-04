package kotlinx.io;

import androidx.media3.exoplayer.audio.s0;
import androidx.media3.exoplayer.c4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sinks.kt\nkotlinx/io/SinksKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,377:1\n374#1:378\n375#1,2:402\n374#1:408\n375#1,2:432\n262#2,23:379\n262#2,23:409\n179#3,4:404\n*S KotlinDebug\n*F\n+ 1 Sinks.kt\nkotlinx/io/SinksKt\n*L\n123#1:378\n123#1:402,2\n161#1:408\n161#1:432,2\n124#1:379,23\n162#1:409,23\n159#1:404,4\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f315745a;

    static {
        byte[] bArr = new byte[16];
        int i10 = 0;
        while (i10 < 16) {
            bArr[i10] = (byte) ((i10 < 10 ? 48 : 87) + i10);
            i10++;
        }
        f315745a = bArr;
    }

    public static final void a(@NotNull x xVar, long j10) {
        int i10;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (j10 == 0) {
            xVar.m6((byte) 48);
            return;
        }
        int i11 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                i0.r(xVar, "-9223372036854775808", 0, 0, 6, null);
                return;
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i11 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i11 = 2;
                }
            } else if (j10 < 1000000) {
                i11 = j10 < s0.f63372z ? 5 : 6;
            } else {
                i11 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < c4.f63520s) {
            if (j10 < okhttp3.internal.connection.f.f334128w) {
                i11 = j10 < 1000000000 ? 9 : 10;
            } else {
                i11 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i11 = 13;
            } else {
                i11 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i11 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i11 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (i10 != 0) {
            i11++;
        }
        b bVarN = xVar.n();
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        t tVarR = bVarN.R(i11);
        kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                long j11 = 10;
                cVar.c(tVarR, i12, f315745a[(byte) (j10 % j11)]);
                j10 /= j11;
                if (i12 == i10) {
                    break;
                } else {
                    i12--;
                }
            }
        }
        if (i10 != 0) {
            cVar.c(tVarR, 0, (byte) 45);
        }
        tVarR.x(tVarR.d() + i11);
        bVarN.H(bVarN.l() + ((long) i11));
        xVar.Z3();
    }

    public static final void b(@NotNull x xVar, double d10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.writeLong(Double.doubleToLongBits(d10));
    }

    public static final void c(@NotNull x xVar, double d10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        h(xVar, Double.doubleToLongBits(d10));
    }

    public static final void d(@NotNull x xVar, float f10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.writeInt(Float.floatToIntBits(f10));
    }

    public static final void e(@NotNull x xVar, float f10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        g(xVar, Float.floatToIntBits(f10));
    }

    public static final void f(@NotNull x xVar, long j10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (j10 == 0) {
            xVar.m6((byte) 48);
            return;
        }
        int iNumberOfLeadingZeros = j10 == 0 ? 1 : (67 - Long.numberOfLeadingZeros(j10)) / 4;
        b bVarN = xVar.n();
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        t tVarR = bVarN.R(iNumberOfLeadingZeros);
        kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
        for (int i10 = iNumberOfLeadingZeros - 1; -1 < i10; i10--) {
            cVar.c(tVarR, i10, f315745a[((int) j10) & 15]);
            j10 >>>= 4;
        }
        tVarR.x(tVarR.d() + iNumberOfLeadingZeros);
        bVarN.H(bVarN.l() + ((long) iNumberOfLeadingZeros));
        xVar.Z3();
    }

    public static final void g(@NotNull x xVar, int i10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.writeInt(l0.a(i10));
    }

    public static final void h(@NotNull x xVar, long j10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.writeLong(l0.b(j10));
    }

    public static final void i(@NotNull x xVar, short s10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        xVar.oc(l0.c(s10));
    }

    @h
    public static final void j(@NotNull x xVar, @NotNull Function1<? super b, Unit> lambda) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        lambda.invoke(xVar.n());
        xVar.Z3();
    }

    public static final void k(@NotNull x writeUByte, byte b10) {
        Intrinsics.checkNotNullParameter(writeUByte, "$this$writeUByte");
        writeUByte.m6(b10);
    }

    public static final void l(@NotNull x writeUInt, int i10) {
        Intrinsics.checkNotNullParameter(writeUInt, "$this$writeUInt");
        writeUInt.writeInt(i10);
    }

    public static final void m(@NotNull x writeUIntLe, int i10) {
        Intrinsics.checkNotNullParameter(writeUIntLe, "$this$writeUIntLe");
        g(writeUIntLe, i10);
    }

    public static final void n(@NotNull x writeULong, long j10) {
        Intrinsics.checkNotNullParameter(writeULong, "$this$writeULong");
        writeULong.writeLong(j10);
    }

    public static final void o(@NotNull x writeULongLe, long j10) {
        Intrinsics.checkNotNullParameter(writeULongLe, "$this$writeULongLe");
        h(writeULongLe, j10);
    }

    public static final void p(@NotNull x writeUShort, short s10) {
        Intrinsics.checkNotNullParameter(writeUShort, "$this$writeUShort");
        writeUShort.oc(s10);
    }

    public static final void q(@NotNull x writeUShortLe, short s10) {
        Intrinsics.checkNotNullParameter(writeUShortLe, "$this$writeUShortLe");
        i(writeUShortLe, s10);
    }
}
