package fk;

import com.google.common.base.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nkotlinx/io/internal/_Utf8Kt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,405:1\n111#1,17:406\n129#1:424\n252#1,9:425\n52#1:434\n261#1,13:436\n132#1,3:449\n288#1,4:452\n52#1:456\n294#1,10:457\n52#1:467\n304#1,5:468\n52#1:473\n309#1,23:474\n137#1,3:497\n347#1,3:500\n140#1,12:503\n350#1:515\n52#1:516\n353#1,2:517\n52#1:519\n357#1,10:520\n52#1:530\n367#1,5:531\n52#1:536\n372#1,5:537\n52#1:542\n377#1,28:543\n157#1,6:571\n252#1,9:579\n52#1:588\n261#1,13:590\n288#1,4:604\n52#1:608\n294#1,10:610\n52#1:620\n304#1,5:621\n52#1:626\n309#1,23:627\n347#1,4:651\n52#1:655\n353#1,2:657\n52#1:659\n357#1,10:660\n52#1:670\n367#1,5:671\n52#1:676\n372#1,5:677\n52#1:682\n377#1,28:683\n252#1,9:712\n52#1:721\n261#1,13:723\n288#1,4:737\n52#1:741\n294#1,10:743\n52#1:753\n304#1,5:754\n52#1:759\n309#1,23:760\n347#1,4:784\n52#1:788\n353#1,2:790\n52#1:792\n357#1,10:793\n52#1:803\n367#1,5:804\n52#1:809\n372#1,5:810\n52#1:815\n377#1,28:816\n52#1:844\n52#1:846\n52#1:848\n52#1:850\n52#1:852\n52#1:854\n52#1:856\n52#1:858\n52#1:860\n89#2:423\n95#2:435\n95#2:577\n89#2:578\n95#2:589\n89#2:603\n95#2:609\n89#2:650\n95#2:656\n89#2:711\n95#2:722\n89#2:736\n95#2:742\n89#2:783\n95#2:789\n95#2:845\n95#2:847\n95#2:849\n95#2:851\n95#2:853\n95#2:855\n95#2:857\n95#2:859\n95#2:861\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nkotlinx/io/internal/_Utf8Kt\n*L\n34#1:406,17\n34#1:424\n34#1:425,9\n34#1:434\n34#1:436,13\n34#1:449,3\n34#1:452,4\n34#1:456\n34#1:457,10\n34#1:467\n34#1:468,5\n34#1:473\n34#1:474,23\n34#1:497,3\n34#1:500,3\n34#1:503,12\n34#1:515\n34#1:516\n34#1:517,2\n34#1:519\n34#1:520,10\n34#1:530\n34#1:531,5\n34#1:536\n34#1:537,5\n34#1:542\n34#1:543,28\n34#1:571,6\n77#1:579,9\n77#1:588\n77#1:590,13\n82#1:604,4\n82#1:608\n82#1:610,10\n82#1:620\n82#1:621,5\n82#1:626\n82#1:627,23\n87#1:651,4\n87#1:655\n87#1:657,2\n87#1:659\n87#1:660,10\n87#1:670\n87#1:671,5\n87#1:676\n87#1:677,5\n87#1:682\n87#1:683,28\n129#1:712,9\n129#1:721\n129#1:723,13\n134#1:737,4\n134#1:741\n134#1:743,10\n134#1:753\n134#1:754,5\n134#1:759\n134#1:760,23\n139#1:784,4\n139#1:788\n139#1:790,2\n139#1:792\n139#1:793,10\n139#1:803\n139#1:804,5\n139#1:809\n139#1:810,5\n139#1:815\n139#1:816,28\n260#1:844\n291#1:846\n303#1:848\n308#1:850\n350#1:852\n354#1:854\n366#1:856\n371#1:858\n376#1:860\n34#1:423\n34#1:435\n52#1:577\n75#1:578\n77#1:589\n80#1:603\n82#1:609\n85#1:650\n87#1:656\n127#1:711\n129#1:722\n132#1:736\n134#1:742\n137#1:783\n139#1:789\n260#1:845\n291#1:847\n303#1:849\n308#1:851\n350#1:853\n354#1:855\n366#1:857\n371#1:859\n376#1:861\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f275299a = 63;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f275300b = 65533;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f275301c = 65533;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f275302d = 55232;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f275303e = 56320;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f275304f = 3968;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f275305g = -123008;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f275306h = 3678080;

    @NotNull
    public static final String a(@NotNull byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i18 < 0 || i11 > bArr.length || i18 > i11) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i18 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i18];
        int i19 = 0;
        while (i18 < i11) {
            byte b10 = bArr[i18];
            if (b10 >= 0) {
                i12 = i19 + 1;
                cArr[i19] = (char) b10;
                i18++;
                while (i18 < i11) {
                    byte b11 = bArr[i18];
                    if (b11 < 0) {
                        break;
                    }
                    i18++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                Unit unit = Unit.f312394a;
            } else if ((b10 >> 5) == -2) {
                int i20 = i18 + 1;
                if (i11 <= i20) {
                    i12 = i19 + 1;
                    cArr[i19] = (char) 65533;
                } else {
                    byte b12 = bArr[i20];
                    if ((b12 & h.a.f339269e) == 128) {
                        int i21 = (b10 << 6) ^ (b12 ^ 3968);
                        if (i21 < 128) {
                            i12 = i19 + 1;
                            cArr[i19] = (char) 65533;
                        } else {
                            i12 = i19 + 1;
                            cArr[i19] = (char) i21;
                        }
                        Unit unit2 = Unit.f312394a;
                        i13 = 2;
                    } else {
                        i12 = i19 + 1;
                        cArr[i19] = (char) 65533;
                    }
                    i18 += i13;
                    Unit unit3 = Unit.f312394a;
                }
                Unit unit4 = Unit.f312394a;
                i13 = 1;
                i18 += i13;
                Unit unit5 = Unit.f312394a;
            } else if ((b10 >> 4) == -2) {
                int i22 = i18 + 2;
                if (i11 <= i22) {
                    i12 = i19 + 1;
                    cArr[i19] = (char) 65533;
                    Unit unit6 = Unit.f312394a;
                    int i23 = i18 + 1;
                    i14 = (i11 <= i23 || (bArr[i23] & h.a.f339269e) != 128) ? 1 : 2;
                } else {
                    byte b13 = bArr[i18 + 1];
                    if ((b13 & h.a.f339269e) == 128) {
                        byte b14 = bArr[i22];
                        if ((b14 & h.a.f339269e) == 128) {
                            int i24 = (b10 << c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                            if (i24 < 2048) {
                                i12 = i19 + 1;
                                cArr[i19] = (char) 65533;
                            } else if (55296 > i24 || i24 >= 57344) {
                                i12 = i19 + 1;
                                cArr[i19] = (char) i24;
                            } else {
                                i12 = i19 + 1;
                                cArr[i19] = (char) 65533;
                            }
                            Unit unit7 = Unit.f312394a;
                            i14 = 3;
                        } else {
                            i12 = i19 + 1;
                            cArr[i19] = (char) 65533;
                            Unit unit8 = Unit.f312394a;
                        }
                    } else {
                        i12 = i19 + 1;
                        cArr[i19] = (char) 65533;
                        Unit unit9 = Unit.f312394a;
                    }
                }
                i18 += i14;
                Unit unit10 = Unit.f312394a;
            } else {
                if ((b10 >> 3) == -2) {
                    int i25 = i18 + 3;
                    if (i11 <= i25) {
                        i15 = i19 + 1;
                        cArr[i19] = 65533;
                        Unit unit11 = Unit.f312394a;
                        int i26 = i18 + 1;
                        if (i11 <= i26 || (bArr[i26] & h.a.f339269e) != 128) {
                            i17 = 1;
                        } else {
                            int i27 = i18 + 2;
                            i17 = (i11 <= i27 || (bArr[i27] & h.a.f339269e) != 128) ? 2 : 3;
                        }
                    } else {
                        byte b15 = bArr[i18 + 1];
                        if ((b15 & h.a.f339269e) == 128) {
                            byte b16 = bArr[i18 + 2];
                            if ((b16 & h.a.f339269e) == 128) {
                                byte b17 = bArr[i25];
                                if ((b17 & h.a.f339269e) == 128) {
                                    int i28 = (b10 << c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << c.f116461n));
                                    if (i28 > 1114111) {
                                        i15 = i19 + 1;
                                        cArr[i19] = 65533;
                                    } else {
                                        if ((55296 > i28 || i28 >= 57344) && i28 >= 65536) {
                                            if (i28 != 65533) {
                                                cArr[i19] = (char) ((i28 >>> 10) + 55232);
                                                i16 = i19 + 2;
                                                cArr[i19 + 1] = (char) ((i28 & 1023) + 56320);
                                            } else {
                                                cArr[i19] = 65533;
                                                i16 = i19 + 1;
                                            }
                                            Unit unit12 = Unit.f312394a;
                                            i15 = i16;
                                        } else {
                                            i15 = i19 + 1;
                                            cArr[i19] = 65533;
                                        }
                                        i17 = 4;
                                    }
                                    Unit unit13 = Unit.f312394a;
                                    i17 = 4;
                                } else {
                                    i15 = i19 + 1;
                                    cArr[i19] = 65533;
                                    Unit unit14 = Unit.f312394a;
                                }
                            } else {
                                i15 = i19 + 1;
                                cArr[i19] = 65533;
                                Unit unit15 = Unit.f312394a;
                            }
                        } else {
                            i15 = i19 + 1;
                            cArr[i19] = 65533;
                            Unit unit16 = Unit.f312394a;
                            i17 = 1;
                        }
                    }
                    i18 += i17;
                    Unit unit17 = Unit.f312394a;
                } else {
                    i15 = i19 + 1;
                    cArr[i19] = 65533;
                    i18++;
                }
                i19 = i15;
            }
            i19 = i12;
        }
        return StringsKt.x1(cArr, 0, i19);
    }

    public static /* synthetic */ String b(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return a(bArr, i10, i11);
    }

    public static final boolean c(int i10) {
        if (i10 < 0 || i10 >= 32) {
            return 127 <= i10 && i10 < 160;
        }
        return true;
    }

    public static final boolean d(byte b10) {
        return (b10 & h.a.f339269e) == 128;
    }

    public static final int e(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(65533);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(65533);
        } else {
            yield.invoke(Integer.valueOf(i13));
        }
        return 2;
    }

    public static final int f(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(65533);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & h.a.f339269e) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << c.f116461n);
        if (i14 < 2048) {
            yield.invoke(65533);
        } else if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
        } else {
            yield.invoke(65533);
        }
        return 3;
    }

    public static final int g(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(65533);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & h.a.f339269e) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & h.a.f339269e) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & h.a.f339269e) != 128) {
            yield.invoke(65533);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << c.f116461n)) ^ (b10 << c.f116468u);
        if (i15 > 1114111) {
            yield.invoke(65533);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            yield.invoke(65533);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(65533);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    public static final void h(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Character, Unit> yield) {
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
                        if ((b12 & h.a.f339269e) == 128) {
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
                        if (i11 <= i16 || (bArr[i16] & h.a.f339269e) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & h.a.f339269e) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & h.a.f339269e) == 128) {
                                int i17 = (b10 << c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
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
                        if (i11 <= i19 || (bArr[i19] & h.a.f339269e) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & h.a.f339269e) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & h.a.f339269e) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & h.a.f339269e) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & h.a.f339269e) == 128) {
                                    int i21 = (b10 << c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << c.f116461n));
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

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public static final void i(@NotNull byte[] bArr, int i10, int i11, @NotNull Function1<? super Integer, Unit> yield) {
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
                        if ((b12 & h.a.f339269e) == 128) {
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
                        if (i11 <= i16 || (bArr[i16] & h.a.f339269e) != 128) {
                            i12 = 1;
                        }
                    } else {
                        byte b13 = bArr[i10 + 1];
                        if ((b13 & h.a.f339269e) == 128) {
                            byte b14 = bArr[i15];
                            if ((b14 & h.a.f339269e) == 128) {
                                int i17 = (b10 << c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
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
                        if (i11 <= i19 || (bArr[i19] & h.a.f339269e) != 128) {
                            i12 = 1;
                        } else {
                            int i20 = i10 + 2;
                            if (i11 > i20 && (bArr[i20] & h.a.f339269e) == 128) {
                                i12 = 3;
                            }
                        }
                    } else {
                        byte b15 = bArr[i10 + 1];
                        if ((b15 & h.a.f339269e) == 128) {
                            byte b16 = bArr[i10 + 2];
                            if ((b16 & h.a.f339269e) == 128) {
                                byte b17 = bArr[i18];
                                if ((b17 & h.a.f339269e) == 128) {
                                    int i21 = (b10 << c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << c.f116461n));
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
}
