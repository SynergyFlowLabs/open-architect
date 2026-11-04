package kotlinx.io;

import java.io.EOFException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nkotlinx/io/Utf8Kt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 Sinks.kt\nkotlinx/io/SinksKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n*L\n1#1,624:1\n471#1,7:631\n478#1,15:640\n496#1,57:674\n471#1,7:735\n478#1,15:744\n496#1,57:778\n38#2:625\n38#2:629\n38#2:733\n95#2:838\n95#2:839\n95#2:840\n95#2:841\n95#2:842\n95#2:843\n95#2:844\n95#2:845\n95#2:846\n95#2:847\n374#3,3:626\n374#3:630\n375#3,2:731\n374#3:734\n375#3,2:835\n262#4,2:638\n266#4,19:655\n262#4,2:742\n266#4,19:759\n262#4,23:848\n262#4,23:871\n262#4,23:894\n262#4,23:917\n262#4,23:940\n262#4,23:963\n262#4,23:986\n378#4,3:1009\n381#4,3:1013\n1#5:837\n434#6:1012\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nkotlinx/io/Utf8Kt\n*L\n173#1:631,7\n173#1:640,15\n173#1:674,57\n194#1:735,7\n194#1:744,15\n194#1:778,57\n89#1:625\n171#1:629\n192#1:733\n395#1:838\n397#1:839\n402#1:840\n404#1:841\n409#1:842\n411#1:843\n416#1:844\n418#1:845\n439#1:846\n442#1:847\n153#1:626,3\n173#1:630\n173#1:731,2\n194#1:734\n194#1:835,2\n173#1:638,2\n173#1:655,19\n194#1:742,2\n194#1:759,19\n477#1:848,23\n498#1:871,23\n511#1:894,23\n538#1:917,23\n570#1:940,23\n584#1:963,23\n594#1:986,23\n610#1:1009,3\n610#1:1013,3\n613#1:1012\n*E\n"})
public final class i0 {
    private static final String a(b bVar, long j10) throws EOFException {
        if (j10 == 0) {
            return "";
        }
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        t tVarG = bVar.g();
        if (tVarG == null) {
            throw new IllegalStateException("Unreacheable");
        }
        kotlinx.io.unsafe.b unused = kotlinx.io.unsafe.f.f315800a;
        if (tVarG.n() < j10) {
            int i10 = 1 >> 0;
            return fk.a.b(g0.d(bVar, (int) j10), 0, 0, 3, null);
        }
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        String strA = fk.a.a(bArrB, iH, Math.min(tVarG.d(), ((int) j10) + iH));
        bVar.skip(j10);
        return strA;
    }

    private static final int b(b bVar) throws EOFException {
        int i10;
        int i11;
        int i12;
        bVar.q1(1L);
        byte bF = bVar.f(0L);
        if ((bF & 128) == 0) {
            i10 = bF & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bF & org.msgpack.core.h.a.K) == 192) {
            i10 = bF & com.google.common.base.c.I;
            i11 = 2;
            i12 = 128;
        } else if ((bF & 240) == 224) {
            i10 = bF & com.google.common.base.c.f116464q;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bF & 248) != 240) {
                bVar.skip(1L);
                return 65533;
            }
            i10 = bF & 7;
            i11 = 4;
            int i13 = 3 << 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (bVar.j() < j10) {
            throw new EOFException("size < " + i11 + ": " + bVar.j() + " (to read code point prefixed 0x" + k0.q(bF) + ')');
        }
        for (int i14 = 1; i14 < i11; i14++) {
            long j11 = i14;
            byte bF2 = bVar.f(j11);
            if ((bF2 & org.msgpack.core.h.a.f339269e) != 128) {
                bVar.skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bF2 & 63);
        }
        bVar.skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    private static final void c(b bVar, int i10, int i11, Function1<? super Integer, Character> function1) {
        char cCharValue;
        while (i10 < i11) {
            char cCharValue2 = function1.invoke(Integer.valueOf(i10)).charValue();
            if (cCharValue2 < 128) {
                kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
                t tVarR = bVar.R(1);
                kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
                int i12 = -i10;
                int iMin = Math.min(i11, tVarR.l() + i10);
                int i13 = i10 + 1;
                cVar.c(tVarR, i10 + i12, (byte) cCharValue2);
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharValue = function1.invoke(Integer.valueOf(i10)).charValue()) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    cVar.c(tVarR, i10 + i12, (byte) cCharValue);
                }
                int i14 = i12 + i10;
                if (i14 == 1) {
                    tVarR.x(tVarR.d() + i14);
                    bVar.H(bVar.l() + ((long) i14));
                } else {
                    if (i14 < 0 || i14 > tVarR.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i14 + ". Should be in 0.." + tVarR.l()).toString());
                    }
                    if (i14 != 0) {
                        tVarR.x(tVarR.d() + i14);
                        bVar.H(bVar.l() + ((long) i14));
                    } else if (v.d(tVarR)) {
                        bVar.y();
                    }
                }
            } else {
                if (cCharValue2 < 2048) {
                    kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
                    t tVarR2 = bVar.R(2);
                    kotlinx.io.unsafe.f.f315801b.a(tVarR2, 0, (byte) ((cCharValue2 >> 6) | 192), (byte) ((cCharValue2 & '?') | 128));
                    tVarR2.x(tVarR2.d() + 2);
                    bVar.H(bVar.l() + ((long) 2));
                } else if (cCharValue2 < 55296 || cCharValue2 > 57343) {
                    kotlinx.io.unsafe.d dVar3 = kotlinx.io.unsafe.d.f315799a;
                    t tVarR3 = bVar.R(3);
                    kotlinx.io.unsafe.f.f315801b.b(tVarR3, 0, (byte) ((cCharValue2 >> '\f') | 224), (byte) (((cCharValue2 >> 6) & 63) | 128), (byte) ((cCharValue2 & '?') | 128));
                    tVarR3.x(tVarR3.d() + 3);
                    bVar.H(bVar.l() + ((long) 3));
                } else {
                    int i15 = i10 + 1;
                    char cCharValue3 = i15 < i11 ? function1.invoke(Integer.valueOf(i15)).charValue() : (char) 0;
                    if (cCharValue2 > 56319 || 56320 > cCharValue3 || cCharValue3 >= 57344) {
                        bVar.m6((byte) 63);
                        i10 = i15;
                    } else {
                        int i16 = (((cCharValue2 & 1023) << 10) | (cCharValue3 & 1023)) + 65536;
                        kotlinx.io.unsafe.d dVar4 = kotlinx.io.unsafe.d.f315799a;
                        t tVarR4 = bVar.R(4);
                        kotlinx.io.unsafe.f.f315801b.d(tVarR4, 0, (byte) ((i16 >> 18) | 240), (byte) (((i16 >> 12) & 63) | 128), (byte) (((i16 >> 6) & 63) | 128), (byte) ((i16 & 63) | 128));
                        tVarR4.x(tVarR4.d() + 4);
                        bVar.H(bVar.l() + ((long) 4));
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    private static final void d(b bVar, int i10) {
        if (i10 < 0 || i10 > 1114111) {
            throw new IllegalArgumentException("Code point value is out of Unicode codespace 0..0x10ffff: 0x" + k0.r(i10) + " (" + i10 + ')');
        }
        if (i10 < 128) {
            bVar.m6((byte) i10);
            return;
        }
        if (i10 < 2048) {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            t tVarR = bVar.R(2);
            kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
            cVar.c(tVarR, 0, (byte) ((i10 >> 6) | 192));
            cVar.c(tVarR, 1, (byte) ((i10 & 63) | 128));
            tVarR.x(tVarR.d() + 2);
            bVar.H(bVar.l() + ((long) 2));
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            bVar.m6((byte) 63);
            return;
        }
        if (i10 < 65536) {
            kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
            t tVarR2 = bVar.R(3);
            kotlinx.io.unsafe.c cVar2 = kotlinx.io.unsafe.f.f315801b;
            cVar2.c(tVarR2, 0, (byte) ((i10 >> 12) | 224));
            cVar2.c(tVarR2, 1, (byte) (((i10 >> 6) & 63) | 128));
            cVar2.c(tVarR2, 2, (byte) ((i10 & 63) | 128));
            tVarR2.x(tVarR2.d() + 3);
            bVar.H(bVar.l() + ((long) 3));
            return;
        }
        kotlinx.io.unsafe.d dVar3 = kotlinx.io.unsafe.d.f315799a;
        t tVarR3 = bVar.R(4);
        kotlinx.io.unsafe.c cVar3 = kotlinx.io.unsafe.f.f315801b;
        cVar3.c(tVarR3, 0, (byte) ((i10 >> 18) | 240));
        cVar3.c(tVarR3, 1, (byte) (((i10 >> 12) & 63) | 128));
        cVar3.c(tVarR3, 2, (byte) (((i10 >> 6) & 63) | 128));
        cVar3.c(tVarR3, 3, (byte) ((i10 & 63) | 128));
        tVarR3.x(tVarR3.d() + 4);
        bVar.H(bVar.l() + ((long) 4));
    }

    public static final int e(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (c0Var instanceof b) {
            return b((b) c0Var);
        }
        c0Var.q1(1L);
        byte bF = c0Var.n().f(0L);
        if ((bF & org.msgpack.core.h.a.K) == 192) {
            c0Var.q1(2L);
        } else if ((bF & 240) == 224) {
            c0Var.q1(3L);
        } else if ((bF & 248) == 240) {
            c0Var.q1(4L);
        }
        return b(c0Var.n());
    }

    @Nullable
    public static final String f(@NotNull c0 c0Var) {
        int i10;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (!c0Var.request(1L)) {
            return null;
        }
        long jB = g0.b(c0Var, (byte) 10, 0L, 0L, 6, null);
        if (jB == -1) {
            return j(c0Var);
        }
        if (jB == 0) {
            c0Var.skip(1L);
            return "";
        }
        long j10 = jB - 1;
        if (c0Var.n().f(j10) == 13) {
            i10 = 2;
            int i11 = 3 >> 2;
            jB = j10;
        } else {
            i10 = 1;
        }
        String strK = k(c0Var, jB);
        c0Var.skip(i10);
        return strK;
    }

    @NotNull
    public static final String g(@NotNull c0 c0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit (" + j10 + ") < 0").toString());
        }
        long j11 = 1;
        c0Var.q1(1L);
        long jA = g0.a(c0Var, (byte) 10, 0L, j10);
        if (jA == 0) {
            c0Var.skip(1L);
            return "";
        }
        if (jA > 0) {
            long j12 = jA - 1;
            if (c0Var.n().f(j12) == 13) {
                j11 = 2;
                jA = j12;
            }
            String strK = k(c0Var, jA);
            c0Var.skip(j11);
            return strK;
        }
        if (c0Var.n().j() < j10) {
            throw new EOFException();
        }
        if (j10 == Long.MAX_VALUE) {
            throw new EOFException();
        }
        long j13 = j10 + 1;
        if (!c0Var.request(j13)) {
            throw new EOFException();
        }
        byte bF = c0Var.n().f(j10);
        if (bF == 10) {
            String strK2 = k(c0Var, j10);
            c0Var.skip(1L);
            return strK2;
        }
        if (bF != 13 || !c0Var.request(((long) 2) + j10)) {
            throw new EOFException();
        }
        if (c0Var.n().f(j13) != 10) {
            throw new EOFException();
        }
        String strK3 = k(c0Var, j10);
        c0Var.skip(2L);
        return strK3;
    }

    public static /* synthetic */ String h(c0 c0Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return g(c0Var, j10);
    }

    @NotNull
    public static final String i(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return a(bVar, bVar.j());
    }

    @NotNull
    public static final String j(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.request(Long.MAX_VALUE);
        return a(c0Var.n(), c0Var.n().j());
    }

    @NotNull
    public static final String k(@NotNull c0 c0Var, long j10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.q1(j10);
        return a(c0Var.n(), j10);
    }

    public static final long l(@NotNull String str, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        k0.e(str.length(), i10, i11);
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    public static /* synthetic */ long m(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return l(str, i10, i11);
    }

    public static final void n(@NotNull x xVar, int i10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        d(xVar.n(), i10);
        xVar.Z3();
    }

    public static final void o(@NotNull x xVar, @NotNull CharSequence chars, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int i13 = i10;
        k0.e(chars.length(), i13, i11);
        b bVarN = xVar.n();
        while (i13 < i11) {
            i1.f fVar = new i1.f();
            char cCharAt = chars.charAt(i13);
            fVar.f312749a = cCharAt;
            if (cCharAt < 128) {
                kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
                t tVarR = bVarN.R(1);
                kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
                int i14 = -i13;
                int iMin = Math.min(i11, tVarR.l() + i13);
                cVar.c(tVarR, i13 + i14, (byte) fVar.f312749a);
                i13++;
                while (i13 < iMin) {
                    char cCharAt2 = chars.charAt(i13);
                    fVar.f312749a = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    cVar.c(tVarR, i13 + i14, (byte) cCharAt2);
                    i13++;
                }
                int i15 = i14 + i13;
                if (i15 == 1) {
                    tVarR.x(tVarR.d() + i15);
                    bVarN.H(bVarN.l() + ((long) i15));
                } else {
                    if (i15 < 0 || i15 > tVarR.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i15 + ". Should be in 0.." + tVarR.l()).toString());
                    }
                    if (i15 != 0) {
                        tVarR.x(tVarR.d() + i15);
                        bVarN.H(bVarN.l() + ((long) i15));
                    } else if (v.d(tVarR)) {
                        bVarN.y();
                    }
                }
            } else {
                if (cCharAt < 2048) {
                    kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
                    i12 = 2;
                    t tVarR2 = bVarN.R(2);
                    kotlinx.io.unsafe.c cVar2 = kotlinx.io.unsafe.f.f315801b;
                    int i16 = fVar.f312749a;
                    cVar2.a(tVarR2, 0, (byte) ((i16 >> 6) | 192), (byte) ((i16 & 63) | 128));
                    tVarR2.x(tVarR2.d() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    kotlinx.io.unsafe.d dVar3 = kotlinx.io.unsafe.d.f315799a;
                    i12 = 3;
                    t tVarR3 = bVarN.R(3);
                    kotlinx.io.unsafe.c cVar3 = kotlinx.io.unsafe.f.f315801b;
                    int i17 = fVar.f312749a;
                    cVar3.b(tVarR3, 0, (byte) ((i17 >> 12) | 224), (byte) (((i17 >> 6) & 63) | 128), (byte) ((i17 & 63) | 128));
                    tVarR3.x(tVarR3.d() + 3);
                } else {
                    int i18 = i13 + 1;
                    char cCharAt3 = i18 < i11 ? chars.charAt(i18) : (char) 0;
                    int i19 = fVar.f312749a;
                    if (i19 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        bVarN.m6((byte) 63);
                        i13 = i18;
                    } else {
                        int i20 = (((i19 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        kotlinx.io.unsafe.d dVar4 = kotlinx.io.unsafe.d.f315799a;
                        t tVarR4 = bVarN.R(4);
                        kotlinx.io.unsafe.f.f315801b.d(tVarR4, 0, (byte) ((i20 >> 18) | 240), (byte) (((i20 >> 12) & 63) | 128), (byte) (((i20 >> 6) & 63) | 128), (byte) ((i20 & 63) | 128));
                        tVarR4.x(tVarR4.d() + 4);
                        bVarN.H(bVarN.l() + ((long) 4));
                        i13 += 2;
                    }
                }
                bVarN.H(bVarN.l() + ((long) i12));
                i13++;
            }
        }
        xVar.Z3();
    }

    public static final void p(@NotNull x xVar, @NotNull String string, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        int i13 = i10;
        k0.e(string.length(), i13, i11);
        b bVarN = xVar.n();
        while (i13 < i11) {
            i1.f fVar = new i1.f();
            char cCharAt = string.charAt(i13);
            fVar.f312749a = cCharAt;
            if (cCharAt < 128) {
                kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
                t tVarR = bVarN.R(1);
                kotlinx.io.unsafe.c cVar = kotlinx.io.unsafe.f.f315801b;
                int i14 = -i13;
                int iMin = Math.min(i11, tVarR.l() + i13);
                cVar.c(tVarR, i13 + i14, (byte) fVar.f312749a);
                i13++;
                while (i13 < iMin) {
                    char cCharAt2 = string.charAt(i13);
                    fVar.f312749a = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    cVar.c(tVarR, i13 + i14, (byte) cCharAt2);
                    i13++;
                }
                int i15 = i14 + i13;
                if (i15 == 1) {
                    tVarR.x(tVarR.d() + i15);
                    bVarN.H(bVarN.l() + ((long) i15));
                } else {
                    if (i15 < 0 || i15 > tVarR.l()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i15 + ". Should be in 0.." + tVarR.l()).toString());
                    }
                    if (i15 != 0) {
                        tVarR.x(tVarR.d() + i15);
                        bVarN.H(bVarN.l() + ((long) i15));
                    } else if (v.d(tVarR)) {
                        bVarN.y();
                    }
                }
            } else {
                if (cCharAt < 2048) {
                    kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
                    i12 = 2;
                    t tVarR2 = bVarN.R(2);
                    kotlinx.io.unsafe.c cVar2 = kotlinx.io.unsafe.f.f315801b;
                    int i16 = fVar.f312749a;
                    cVar2.a(tVarR2, 0, (byte) ((i16 >> 6) | 192), (byte) ((i16 & 63) | 128));
                    tVarR2.x(tVarR2.d() + 2);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    kotlinx.io.unsafe.d dVar3 = kotlinx.io.unsafe.d.f315799a;
                    i12 = 3;
                    t tVarR3 = bVarN.R(3);
                    kotlinx.io.unsafe.c cVar3 = kotlinx.io.unsafe.f.f315801b;
                    int i17 = fVar.f312749a;
                    cVar3.b(tVarR3, 0, (byte) ((i17 >> 12) | 224), (byte) (((i17 >> 6) & 63) | 128), (byte) ((i17 & 63) | 128));
                    tVarR3.x(tVarR3.d() + 3);
                } else {
                    int i18 = i13 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    int i19 = fVar.f312749a;
                    if (i19 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        bVarN.m6((byte) 63);
                        i13 = i18;
                    } else {
                        int i20 = (((i19 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        kotlinx.io.unsafe.d dVar4 = kotlinx.io.unsafe.d.f315799a;
                        t tVarR4 = bVarN.R(4);
                        kotlinx.io.unsafe.f.f315801b.d(tVarR4, 0, (byte) ((i20 >> 18) | 240), (byte) (((i20 >> 12) & 63) | 128), (byte) (((i20 >> 6) & 63) | 128), (byte) ((i20 & 63) | 128));
                        tVarR4.x(tVarR4.d() + 4);
                        bVarN.H(bVarN.l() + ((long) 4));
                        i13 += 2;
                    }
                }
                bVarN.H(bVarN.l() + ((long) i12));
                i13++;
            }
        }
        xVar.Z3();
    }

    public static /* synthetic */ void q(x xVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        o(xVar, charSequence, i10, i11);
    }

    public static /* synthetic */ void r(x xVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        p(xVar, str, i10, i11);
    }
}
