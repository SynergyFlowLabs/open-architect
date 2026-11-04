package okio;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
@oj.i(name = "Utf8")
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f334906a = 63;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f334907b = 65533;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f334908c = 65533;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f334909d = 55232;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f334910e = 56320;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f334911f = 3968;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f334912g = -123008;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f334913h = 3678080;

    public static final boolean a(int i10) {
        return (i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160);
    }

    public static final boolean b(byte b10) {
        return (b10 & org.msgpack.core.h.a.f339269e) == 128;
    }

    public static final int c(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(65533);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(65533);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int d(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(65533);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & org.msgpack.core.h.a.f339269e) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << com.google.common.base.c.f116461n);
        if (i14 < 2048) {
            yield.invoke(65533);
        } else if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
        } else {
            yield.invoke(65533);
        }
        return 3;
    }

    public static final int e(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(65533);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & org.msgpack.core.h.a.f339269e) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & org.msgpack.core.h.a.f339269e) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & org.msgpack.core.h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << com.google.common.base.c.f116461n)) ^ (b10 << com.google.common.base.c.f116468u);
        if (i15 > 1114111) {
            yield.invoke(65533);
        } else if ((55296 > i15 || i15 >= 57344) && i15 >= 65536) {
            yield.invoke(Integer.valueOf(i15));
        } else {
            yield.invoke(65533);
        }
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public static final void f(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Character, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i10 < i11) {
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                yield.invoke(Character.valueOf((char) b10));
                i10++;
                while (i10 < i11) {
                    byte b11 = bArr[i10];
                    if (b11 < 0) {
                        break;
                    }
                    i10++;
                    yield.invoke(Character.valueOf((char) b11));
                }
            } else {
                int i12 = 2;
                if ((b10 >> 5) == -2) {
                    int i13 = i10 + 1;
                    if (i11 > i13) {
                        byte b12 = bArr[i13];
                        if ((b12 & org.msgpack.core.h.a.f339269e) == 128) {
                            int i14 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(Character.valueOf(i14 < 128 ? (char) 65533 : (char) i14));
                            Unit unit = Unit.f312394a;
                        }
                        i10 += i12;
                    }
                    yield.invoke(Character.valueOf((char) 65533));
                    Unit unit2 = Unit.f312394a;
                    i12 = 1;
                    i10 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i15 = i10 + 2;
                    if (i11 <= i15) {
                        yield.invoke(Character.valueOf((char) 65533));
                        Unit unit3 = Unit.f312394a;
                        int i16 = i10 + 1;
                        if (i11 <= i16 || (bArr[i16] & org.msgpack.core.h.a.f339269e) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & org.msgpack.core.h.a.f339269e) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & org.msgpack.core.h.a.f339269e) == 128) {
                                int i17 = (b10 << com.google.common.base.c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                yield.invoke(Character.valueOf((i17 >= 2048 && (55296 > i17 || i17 >= 57344)) ? (char) i17 : (char) 65533));
                                Unit unit4 = Unit.f312394a;
                                i12 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) 65533));
                                Unit unit5 = Unit.f312394a;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) 65533));
                            Unit unit6 = Unit.f312394a;
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i18 = i10 + 3;
                    if (i11 <= i18) {
                        yield.invoke((char) 65533);
                        Unit unit7 = Unit.f312394a;
                        int i19 = i10 + 1;
                        if (i11 <= i19 || (bArr[i19] & org.msgpack.core.h.a.f339269e) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & org.msgpack.core.h.a.f339269e) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & org.msgpack.core.h.a.f339269e) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & org.msgpack.core.h.a.f339269e) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & org.msgpack.core.h.a.f339269e) == 128) {
                                    int i21 = (b10 << com.google.common.base.c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << com.google.common.base.c.f116461n));
                                    if (i21 <= 1114111 && ((55296 > i21 || i21 >= 57344) && i21 >= 65536 && i21 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i21 >>> 10) + 55232)));
                                        yield.invoke(Character.valueOf((char) ((i21 & 1023) + 56320)));
                                    } else {
                                        yield.invoke((char) 65533);
                                    }
                                    Unit unit8 = Unit.f312394a;
                                    i12 = 4;
                                } else {
                                    yield.invoke((char) 65533);
                                    Unit unit9 = Unit.f312394a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke((char) 65533);
                                Unit unit10 = Unit.f312394a;
                            }
                        } else {
                            yield.invoke((char) 65533);
                            Unit unit11 = Unit.f312394a;
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else {
                    yield.invoke((char) 65533);
                    i10++;
                }
            }
        }
    }

    public static final void g(@NotNull String str, int i10, int i11, @NotNull Function1<? super Byte, Unit> yield) {
        int i12;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && Intrinsics.compare((int) str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) cCharAt2, com.fasterxml.jackson.core.base.a.f102233h) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = str.charAt(i12)) || cCharAt >= 57344) {
                    yield.invoke((byte) 63);
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i12)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static final void h(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i10 < i11) {
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                yield.invoke(Integer.valueOf(b10));
                i10++;
                while (i10 < i11) {
                    byte b11 = bArr[i10];
                    if (b11 < 0) {
                        break;
                    }
                    i10++;
                    yield.invoke(Integer.valueOf(b11));
                }
            } else {
                int i12 = 2;
                if ((b10 >> 5) == -2) {
                    int i13 = i10 + 1;
                    if (i11 > i13) {
                        byte b12 = bArr[i13];
                        if ((b12 & org.msgpack.core.h.a.f339269e) == 128) {
                            int i14 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i14 < 128) {
                                yield.invoke(65533);
                            } else {
                                yield.invoke(Integer.valueOf(i14));
                            }
                            Unit unit = Unit.f312394a;
                        }
                        i10 += i12;
                    }
                    yield.invoke(65533);
                    Unit unit2 = Unit.f312394a;
                    i12 = 1;
                    i10 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i15 = i10 + 2;
                    if (i11 <= i15) {
                        yield.invoke(65533);
                        Unit unit3 = Unit.f312394a;
                        int i16 = i10 + 1;
                        if (i11 <= i16 || (bArr[i16] & org.msgpack.core.h.a.f339269e) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & org.msgpack.core.h.a.f339269e) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & org.msgpack.core.h.a.f339269e) == 128) {
                                int i17 = (b10 << com.google.common.base.c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i17 >= 2048 && (55296 > i17 || i17 >= 57344)) {
                                    yield.invoke(Integer.valueOf(i17));
                                } else {
                                    yield.invoke(65533);
                                }
                                Unit unit4 = Unit.f312394a;
                                i12 = 3;
                            } else {
                                yield.invoke(65533);
                                Unit unit5 = Unit.f312394a;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit6 = Unit.f312394a;
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i18 = i10 + 3;
                    if (i11 <= i18) {
                        yield.invoke(65533);
                        Unit unit7 = Unit.f312394a;
                        int i19 = i10 + 1;
                        if (i11 <= i19 || (bArr[i19] & org.msgpack.core.h.a.f339269e) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & org.msgpack.core.h.a.f339269e) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & org.msgpack.core.h.a.f339269e) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & org.msgpack.core.h.a.f339269e) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & org.msgpack.core.h.a.f339269e) == 128) {
                                    int i21 = (b10 << com.google.common.base.c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << com.google.common.base.c.f116461n));
                                    if (i21 <= 1114111 && ((55296 > i21 || i21 >= 57344) && i21 >= 65536)) {
                                        yield.invoke(Integer.valueOf(i21));
                                    } else {
                                        yield.invoke(65533);
                                    }
                                    Unit unit8 = Unit.f312394a;
                                    i12 = 4;
                                } else {
                                    yield.invoke(65533);
                                    Unit unit9 = Unit.f312394a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(65533);
                                Unit unit10 = Unit.f312394a;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit11 = Unit.f312394a;
                            i12 = 1;
                        }
                    }
                    i10 += i12;
                } else {
                    yield.invoke(65533);
                    i10++;
                }
            }
        }
    }

    @oj.j
    @oj.i(name = "size")
    public static final long i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, 0, 0, 3, null);
    }

    @oj.j
    @oj.i(name = "size")
    public static final long j(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, i10, 0, 2, null);
    }

    @oj.j
    @oj.i(name = "size")
    public static final long k(@NotNull String str, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
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

    public static /* synthetic */ long l(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return k(str, i10, i11);
    }
}
