package io.ktor.http;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCodecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1104#2,3:323\n13479#3,2:326\n1563#4:328\n1634#4,3:329\n1563#4:332\n1634#4,3:333\n1563#4:336\n1634#4,3:337\n*S KotlinDebug\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n*L\n150#1:323,3\n161#1:326,2\n11#1:328\n11#1:329,3\n22#1:332\n22#1:333,3\n44#1:336\n44#1:337,3\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Byte> f295850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<Byte> f295853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Set<Character> f295855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<Byte> f295856g;

    static {
        Character chValueOf = Character.valueOf(AbstractJsonLexerKt.COLON);
        Character chValueOf2 = Character.valueOf(kotlin.text.b0.f313279d);
        Character chValueOf3 = Character.valueOf(org.apache.commons.codec.language.l.f335457d);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.c('a', ni.f.f333372i), (Iterable) new kotlin.ranges.c('A', 'Z')), (Iterable) new kotlin.ranges.c(org.locationtech.jts.geom.l.f338160j, '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f295850a = CollectionsKt.toSet(arrayList);
        f295851b = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.c('a', ni.f.f333372i), (Iterable) new kotlin.ranges.c('A', 'Z')), (Iterable) new kotlin.ranges.c(org.locationtech.jts.geom.l.f338160j, '9')));
        f295852c = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.c('a', 'f'), (Iterable) new kotlin.ranges.c('A', org.locationtech.jts.geom.l.f338157g)), (Iterable) new kotlin.ranges.c(org.locationtech.jts.geom.l.f338160j, '9')));
        Set of2 = SetsKt.setOf((Object[]) new Character[]{chValueOf, '/', '?', '#', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '@', '!', '$', chValueOf2, '\'', '(', ')', '*', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', '=', chValueOf3, '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f295853d = arrayList2;
        f295854e = SetsKt.setOf((Object[]) new Character[]{chValueOf, '@', '!', '$', chValueOf2, '\'', '(', ')', '*', '+', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', '=', chValueOf3, '.', '_', '~'});
        f295855f = SetsKt.plus((Set) f295851b, (Iterable) SetsKt.setOf((Object[]) new Character[]{'!', '#', '$', chValueOf2, '+', chValueOf3, '.', '^', '_', '`', '|', '~'}));
        List listListOf = CollectionsKt.listOf((Object[]) new Character[]{chValueOf3, '.', '_', '~'});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f295856g = arrayList3;
    }

    private static final char A(int i10) {
        return (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48);
    }

    private static final String B(byte b10) {
        return StringsKt.w1(new char[]{'%', A((b10 & 255) >> 4), A(b10 & com.google.common.base.c.f116464q)});
    }

    @NotNull
    public static final String C(@NotNull String str, @NotNull Set<Character> allowedSet) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(allowedSet, "allowedSet");
        boolean z10 = false | false;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!allowedSet.contains(Character.valueOf(str.charAt(i11)))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        byte[] bArrL = ui.u.l(str, Charsets.UTF_8);
        int length = str.length() - i10;
        char[] cArr = new char[length + ((bArrL.length - length) * 3)];
        int i12 = 0;
        for (byte b10 : bArrL) {
            char c10 = (char) b10;
            if (allowedSet.contains(Character.valueOf(c10))) {
                cArr[i12] = c10;
                i12++;
            } else {
                cArr[i12] = '%';
                int i13 = i12 + 2;
                cArr[i12 + 1] = A((b10 & 255) >> 4);
                i12 += 3;
                cArr[i13] = A(b10 & com.google.common.base.c.f116464q);
            }
        }
        return StringsKt.w1(cArr);
    }

    private static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - org.locationtech.jts.geom.l.f338160j;
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    private static final String f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) throws o2 {
        int i13;
        int i14 = i11 - i10;
        if (i14 > 255) {
            i14 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i14);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char cCharAt = charSequence.charAt(i12);
            if (z10 && cCharAt == '+') {
                sb2.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i11 - i12) / 3];
                }
                byte[] bArr2 = bArr;
                int i15 = 0;
                while (true) {
                    i13 = i15;
                    if (i12 >= i11 || charSequence.charAt(i12) != '%') {
                        break;
                    }
                    int i16 = i12 + 2;
                    if (i16 >= i11) {
                        throw new o2("Incomplete trailing HEX escape: " + charSequence.subSequence(i12, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i12);
                    }
                    int i17 = i12 + 1;
                    int iE = e(charSequence.charAt(i17));
                    int iE2 = e(charSequence.charAt(i16));
                    if (iE == -1 || iE2 == -1) {
                        throw new o2("Wrong HEX escape: %" + charSequence.charAt(i17) + charSequence.charAt(i16) + ", in " + ((Object) charSequence) + ", at " + i12);
                    }
                    i15 = i13 + 1;
                    bArr2[i13] = (byte) ((iE * 16) + iE2);
                    i12 += 3;
                }
                sb2.append(StringsKt.H1(bArr2, 0, i13, false, 4, null));
                bArr = bArr2;
            } else {
                sb2.append(cCharAt);
            }
            i12++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String h(@NotNull String str, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return h(str, i10, i11, charset);
    }

    @NotNull
    public static final String j(@NotNull String str, int i10, int i11, boolean z10, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return j(str, i10, i11, z10, charset);
    }

    @NotNull
    public static final String l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return n(str, false, 1, null);
    }

    @NotNull
    public static final String m(@NotNull String str, final boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        x(ti.b.e(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1() { // from class: io.ktor.http.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.o(sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String n(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(StringBuilder sb2, boolean z10, byte b10) {
        if (f295850a.contains(Byte.valueOf(b10)) || f295856g.contains(Byte.valueOf(b10))) {
            sb2.append((char) b10);
        } else if (z10 && b10 == 32) {
            sb2.append('+');
        } else {
            sb2.append(B(b10));
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final String p(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m(str, true);
    }

    @NotNull
    public static final String q(@NotNull String str, boolean z10, boolean z11) {
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        Charset charset = Charsets.UTF_8;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((!z10 && cCharAt == '/') || f295851b.contains(Character.valueOf(cCharAt)) || f295854e.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                i11++;
            } else {
                if (!z11 && cCharAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set<Character> set = f295852c;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(cCharAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = CharsKt.K(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
                int i14 = i13 + i11;
                x(ti.b.c(charsetEncoderNewEncoder, str, i11, i14), new Function1() { // from class: io.ktor.http.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h.s(sb2, ((Byte) obj).byteValue());
                    }
                });
                i11 = i14;
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String r(String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return q(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(StringBuilder sb2, byte b10) {
        sb2.append(B(b10));
        return Unit.f312394a;
    }

    @NotNull
    public static final String t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return r(str, true, false, 2, null);
    }

    @NotNull
    public static final String u(@NotNull String str, final boolean z10, final boolean z11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "newEncoder(...)");
        x(ti.b.e(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1() { // from class: io.ktor.http.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.w(z11, sb2, z10, ((Byte) obj).byteValue());
            }
        });
        return sb2.toString();
    }

    public static /* synthetic */ String v(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return u(str, z10, z11, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(boolean z10, StringBuilder sb2, boolean z11, byte b10) {
        if (b10 == 32) {
            if (z10) {
                sb2.append('+');
            } else {
                sb2.append("%20");
            }
        } else if (f295850a.contains(Byte.valueOf(b10)) || (!z11 && f295853d.contains(Byte.valueOf(b10)))) {
            sb2.append((char) b10);
        } else {
            sb2.append(B(b10));
        }
        return Unit.f312394a;
    }

    private static final void x(kotlinx.io.c0 c0Var, final Function1<? super Byte, Unit> function1) {
        ui.l.s(c0Var, new Function1() { // from class: io.ktor.http.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h.y(function1, (kotlinx.io.b) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(Function1 function1, kotlinx.io.b buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (ui.b.b(buffer)) {
            function1.invoke(Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    @NotNull
    public static final Set<Character> z() {
        return f295855f;
    }
}
