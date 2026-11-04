package io.ktor.http.cio.internals;

import io.ktor.http.j1;
import io.ktor.utils.io.p;
import io.ktor.utils.io.t;
import io.sentry.protocol.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nChars.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chars.kt\nio/ktor/http/cio/internals/CharsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n34#1:134\n34#1:135\n1#2:136\n1563#3:137\n1634#3,3:138\n1563#3:141\n1634#3,3:142\n*S KotlinDebug\n*F\n+ 1 Chars.kt\nio/ktor/http/cio/internals/CharsKt\n*L\n15#1:134\n26#1:135\n39#1:137\n39#1:138,3\n48#1:141\n48#1:142,3\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f295565a = '\t';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c<j1> f295566b = c.f295545b.d(j1.f295897b.a(), new Function1() { // from class: io.ktor.http.cio.internals.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Integer.valueOf(i.c((j1) obj));
        }
    }, new Function2() { // from class: io.ktor.http.cio.internals.h
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Character.valueOf(i.d((j1) obj, ((Integer) obj2).intValue()));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final long[] f295567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final byte[] f295568d;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {110, 118}, m = "writeIntHex", n = {"$this$writeIntHex", "table", b0.b.f306151f, "digits", "$this$writeIntHex", "table", b0.b.f306151f, "digits"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f295573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f295574f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295573e = obj;
            this.f295574f |= Integer.MIN_VALUE;
            return i.r(null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061 A[PHI: r6
      0x0061: PHI (r6v2 long) = (r6v1 long), (r6v0 long) binds: [B:18:0x0072, B:13:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        long j10;
        IntRange intRange = new IntRange(0, 255);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                long j11 = iNextInt;
                long j12 = 97;
                if (j11 < 97 || j11 > 102) {
                    j12 = 65;
                    if (j11 < 65 || j11 > 70) {
                        j10 = -1;
                    } else {
                        j10 = (j11 - j12) + ((long) 10);
                    }
                } else {
                    j10 = (j11 - j12) + ((long) 10);
                }
            } else {
                j10 = ((long) iNextInt) - 48;
            }
            arrayList.add(Long.valueOf(j10));
        }
        f295567c = CollectionsKt.toLongArray(arrayList);
        IntRange intRange2 = new IntRange(0, 15);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterator<Integer> it2 = intRange2.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
        }
        f295568d = CollectionsKt.toByteArray(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(j1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.l().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char d(j1 m10, int i10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return m10.l().charAt(i10);
    }

    public static final boolean e(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 - i10 != other.length()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            int iCharAt = charSequence.charAt(i12);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = other.charAt(i12 - i10);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return e(charSequence, i10, i11, charSequence2);
    }

    @NotNull
    public static final c<j1> g() {
        return f295566b;
    }

    @NotNull
    public static final byte[] h() {
        return f295568d;
    }

    public static final int i(@NotNull CharSequence charSequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i12 = 0;
        while (i10 < i11) {
            int iCharAt = charSequence.charAt(i10);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i12 = (i12 * 31) + iCharAt;
            i10++;
        }
        return i12;
    }

    public static /* synthetic */ int j(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return i(charSequence, i10, i11);
    }

    private static final Void k(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10));
    }

    private static final void l(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }

    private static final void m(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10) + " at position " + i10);
    }

    public static final long n(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            l(charSequence);
        }
        if (length == 19) {
            return o(charSequence);
        }
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                m(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
        }
        return j10;
    }

    private static final long o(CharSequence charSequence) {
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                m(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
            if (j10 < 0) {
                l(charSequence);
            }
        }
        return j10;
    }

    public static final long p(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        long[] jArr = f295567c;
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = charSequence.charAt(i10) & r.f312787c;
            long j11 = iCharAt < 255 ? jArr[iCharAt] : -1L;
            if (j11 == -1) {
                k(charSequence, i10);
                throw new a0();
            }
            j10 = (j10 << 4) | j11;
        }
        return j10;
    }

    private static final int q(int i10) {
        return (65 > i10 || i10 >= 91) ? i10 : i10 + 32;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object r(@NotNull p pVar, int i10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        byte[] bArr;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f295574f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f295574f = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f295573e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = aVar.f295574f;
        if (i13 != 0) {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = aVar.f295572d;
            i10 = aVar.f295571c;
            bArr = (byte[]) aVar.f295570b;
            p pVar2 = (p) aVar.f295569a;
            ResultKt.m(obj);
            i11 = i14;
            pVar = pVar2;
            break;
        }
        ResultKt.m(obj);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Does only work for positive numbers");
        }
        bArr = f295568d;
        int i15 = 0;
        while (true) {
            i11 = i15 + 1;
            if (i15 < 8) {
                int i16 = i10 >>> 28;
                i10 <<= 4;
                if (i16 != 0) {
                    byte b10 = bArr[i16];
                    aVar.f295569a = pVar;
                    aVar.f295570b = bArr;
                    aVar.f295571c = i10;
                    aVar.f295572d = i11;
                    aVar.f295574f = 1;
                    if (t.p(pVar, b10, aVar) != objL) {
                        break;
                    }
                } else {
                    i15 = i11;
                }
            }
            return objL;
        }
        while (true) {
            int i17 = i11 + 1;
            if (i11 >= 8) {
                return Unit.f312394a;
            }
            int i18 = i10 >>> 28;
            i10 <<= 4;
            byte b11 = bArr[i18];
            aVar.f295569a = pVar;
            aVar.f295570b = bArr;
            aVar.f295571c = i10;
            aVar.f295572d = i17;
            aVar.f295574f = 2;
            if (t.p(pVar, b11, aVar) == objL) {
                return objL;
            }
            i11 = i17;
        }
    }
}
