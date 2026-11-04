package io.ktor.http.cio.internals;

import java.util.ArrayList;
import java.util.List;
import kotlin.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCharArrayBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArrayBuilder.kt\nio/ktor/http/cio/internals/CharArrayBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class d implements CharSequence, Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.utils.io.pool.h<char[]> f295551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<char[]> f295552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private char[] f295553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f295554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f295555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f295556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f295557g;

    @SourceDebugExtension({"SMAP\nCharArrayBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharArrayBuilder.kt\nio/ktor/http/cio/internals/CharArrayBuilder$SubSequenceImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
    private final class a implements CharSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f295558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f295559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f295560c;

        public a(int i10, int i11) {
            this.f295558a = i10;
            this.f295559b = i11;
        }

        public char a(int i10) {
            int i11 = this.f295558a + i10;
            if (i10 < 0) {
                throw new IllegalArgumentException(("index is negative: " + i10).toString());
            }
            if (i11 < this.f295559b) {
                return d.this.j(i11);
            }
            throw new IllegalArgumentException(("index (" + i10 + ") should be less than length (" + length() + ')').toString());
        }

        public final int b() {
            return this.f295559b;
        }

        public int c() {
            return this.f295559b - this.f295558a;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            return a(i10);
        }

        public final int d() {
            return this.f295558a;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return d.this.o(this.f295558a, charSequence, 0, length());
        }

        public int hashCode() {
            String str = this.f295560c;
            return str != null ? str.hashCode() : d.this.m(this.f295558a, this.f295559b);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return c();
        }

        @Override // java.lang.CharSequence
        @NotNull
        public CharSequence subSequence(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException(("start is negative: " + i10).toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
            }
            int i12 = this.f295559b;
            int i13 = this.f295558a;
            if (i11 <= i12 - i13) {
                return i10 == i11 ? "" : d.this.new a(i10 + i13, i13 + i11);
            }
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }

        @Override // java.lang.CharSequence
        @NotNull
        public String toString() {
            String str = this.f295560c;
            if (str != null) {
                return str;
            }
            String string = d.this.g(this.f295558a, this.f295559b).toString();
            this.f295560c = string;
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final char[] e() {
        List list;
        char[] cArrJc = this.f295551a.Jc();
        char[] cArr = this.f295553c;
        this.f295553c = cArrJc;
        this.f295556f = cArrJc.length;
        this.f295555e = false;
        if (cArr != null) {
            List<char[]> list2 = this.f295552b;
            if (list2 == null) {
                list = list2;
                ArrayList arrayList = new ArrayList();
                this.f295552b = arrayList;
                arrayList.add(cArr);
                list = arrayList;
            }
            list = list2;
            list.add(cArrJc);
        }
        return cArrJc;
    }

    private final char[] f(int i10) {
        List<char[]> list = this.f295552b;
        if (list != null) {
            char[] cArr = this.f295553c;
            Intrinsics.checkNotNull(cArr);
            return list.get(i10 / cArr.length);
        }
        if (i10 >= 2048) {
            q(i10);
            throw new a0();
        }
        char[] cArr2 = this.f295553c;
        if (cArr2 != null) {
            return cArr2;
        }
        q(i10);
        throw new a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence g(int i10, int i11) {
        if (i10 == i11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i11 - i10);
        for (int i12 = i10 - (i10 % 2048); i12 < i11; i12 += 2048) {
            char[] cArrF = f(i12);
            int i13 = 5 & 0;
            int iMin = Math.min(i11 - i12, 2048);
            for (int iMax = Math.max(0, i10 - i12); iMax < iMin; iMax++) {
                sb2.append(cArrF[iMax]);
            }
        }
        return sb2;
    }

    private final int h() {
        char[] cArr = this.f295553c;
        Intrinsics.checkNotNull(cArr);
        return cArr.length - this.f295556f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final char j(int i10) {
        char[] cArrF = f(i10);
        char[] cArr = this.f295553c;
        Intrinsics.checkNotNull(cArr);
        return cArrF[i10 % cArr.length];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(int i10, int i11) {
        int iJ = 0;
        while (i10 < i11) {
            iJ = (iJ * 31) + j(i10);
            i10++;
        }
        return iJ;
    }

    private final char[] n() {
        if (this.f295556f == 0) {
            return e();
        }
        char[] cArr = this.f295553c;
        Intrinsics.checkNotNull(cArr);
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(int i10, CharSequence charSequence, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (j(i10 + i13) != charSequence.charAt(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    private final Void q(int i10) {
        if (this.f295555e) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i10 + " is not in range [0; " + h() + ')');
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c10) {
        char[] cArrN = n();
        char[] cArr = this.f295553c;
        Intrinsics.checkNotNull(cArr);
        int length = cArr.length;
        int i10 = this.f295556f;
        cArrN[length - i10] = c10;
        this.f295554d = null;
        this.f295556f = i10 - 1;
        this.f295557g = length() + 1;
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return i(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return o(0, charSequence, 0, length());
    }

    public int hashCode() {
        String str = this.f295554d;
        return str != null ? str.hashCode() : m(0, length());
    }

    public char i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("index is negative: " + i10).toString());
        }
        if (i10 < length()) {
            return j(i10);
        }
        throw new IllegalArgumentException(("index " + i10 + " is not in range [0, " + length() + ')').toString());
    }

    public int k() {
        return this.f295557g;
    }

    @NotNull
    public final io.ktor.utils.io.pool.h<char[]> l() {
        return this.f295551a;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return k();
    }

    public final void p() {
        List<char[]> list = this.f295552b;
        if (list != null) {
            this.f295553c = null;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f295551a.h8(list.get(i10));
            }
        } else {
            char[] cArr = this.f295553c;
            if (cArr != null) {
                this.f295551a.h8(cArr);
            }
            this.f295553c = null;
        }
        this.f295555e = true;
        this.f295552b = null;
        this.f295554d = null;
        this.f295557g = 0;
        this.f295556f = 0;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("startIndex (" + i10 + ") should be less or equal to endIndex (" + i11 + ')').toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex is negative: " + i10).toString());
        }
        if (i11 <= length()) {
            return new a(i10, i11);
        }
        throw new IllegalArgumentException(("endIndex (" + i11 + ") is greater than length (" + length() + ')').toString());
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        String string = this.f295554d;
        if (string == null) {
            string = g(0, length()).toString();
            this.f295554d = string;
        }
        return string;
    }

    public d(@NotNull io.ktor.utils.io.pool.h<char[]> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f295551a = pool;
    }

    public /* synthetic */ d(io.ktor.utils.io.pool.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f.a() : hVar);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return this;
        }
        int i12 = i10;
        while (i12 < i11) {
            char[] cArrN = n();
            int length = cArrN.length;
            int i13 = this.f295556f;
            int i14 = length - i13;
            int iMin = Math.min(i11 - i12, i13);
            for (int i15 = 0; i15 < iMin; i15++) {
                cArrN[i14 + i15] = charSequence.charAt(i12 + i15);
            }
            i12 += iMin;
            this.f295556f -= iMin;
        }
        this.f295554d = null;
        this.f295557g = length() + (i11 - i10);
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }
}
