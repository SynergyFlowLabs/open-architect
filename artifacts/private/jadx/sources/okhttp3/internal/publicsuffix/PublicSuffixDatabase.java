package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jk.f;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlin.sequences.o;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.h;
import okio.b0;
import okio.l0;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f334566f = "publicsuffixes.gz";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f334569i = '!';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f334571a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CountDownLatch f334572b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f334573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f334574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f334565e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final byte[] f334567g = {42};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final List<String> f334568h = CollectionsKt.listOf("*");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final PublicSuffixDatabase f334570j = new PublicSuffixDatabase();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iD;
            boolean z10;
            int iD2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iD = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iD = f.d(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    iD2 = iD - f.d(bArr[i14 + i19], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f334570j;
        }

        private a() {
        }
    }

    private final List<String> b(List<String> list) {
        String str;
        String strB;
        String str2;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        if (this.f334571a.get() || !this.f334571a.compareAndSet(false, true)) {
            try {
                this.f334572b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f334573c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = list.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            a aVar = f334565e;
            byte[] bArr2 = this.f334573c;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = aVar.b(bArr2, bArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            bArr3[i12] = f334567g;
            a aVar2 = f334565e;
            byte[] bArr4 = this.f334573c;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr4 = null;
            }
            String strB2 = aVar2.b(bArr4, bArr3, i12);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i12++;
        }
        if (str2 != null) {
            int i13 = size - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                a aVar3 = f334565e;
                byte[] bArr5 = this.f334574d;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strB3 = aVar3.b(bArr5, bArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return StringsKt.T4(f334569i + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f334568h;
        }
        if (strB == null || (listEmptyList = StringsKt.T4(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt.T4(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void d() throws IOException {
        try {
            i1.h hVar = new i1.h();
            i1.h hVar2 = new i1.h();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(f334566f);
            if (resourceAsStream != null) {
                n nVarE = l0.e(new b0(l0.u(resourceAsStream)));
                try {
                    hVar.f312751a = nVarE.tb(nVarE.readInt());
                    hVar2.f312751a = nVarE.tb(nVarE.readInt());
                    Unit unit = Unit.f312394a;
                    c.a(nVarE, null);
                    synchronized (this) {
                        try {
                            T t10 = hVar.f312751a;
                            Intrinsics.checkNotNull(t10);
                            this.f334573c = (byte[]) t10;
                            T t11 = hVar2.f312751a;
                            Intrinsics.checkNotNull(t11);
                            this.f334574d = (byte[]) t11;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        c.a(nVarE, th3);
                        throw th4;
                    }
                }
            }
            this.f334572b.countDown();
        } catch (Throwable th5) {
            this.f334572b.countDown();
            throw th5;
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    h.f334560a.g().m("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (!z10) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> g(String str) {
        List<String> listT4 = StringsKt.T4(str, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.areEqual(CollectionsKt.last((List) listT4), "") ? CollectionsKt.dropLast(listT4, 1) : listT4;
    }

    @Nullable
    public final String c(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> listG = g(unicodeDomain);
        List<String> listB = b(listG);
        if (listG.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        if (listB.get(0).charAt(0) == '!') {
            size = listG.size();
            size2 = listB.size();
        } else {
            size = listG.size();
            size2 = listB.size() + 1;
        }
        return o.e1(o.k0(CollectionsKt.asSequence(g(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void f(@NotNull byte[] publicSuffixListBytes, @NotNull byte[] publicSuffixExceptionListBytes) {
        Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.f334573c = publicSuffixListBytes;
        this.f334574d = publicSuffixExceptionListBytes;
        this.f334571a.set(true);
        this.f334572b.countDown();
    }
}
