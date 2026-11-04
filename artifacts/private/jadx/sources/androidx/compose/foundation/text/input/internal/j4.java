package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,316:1\n97#2,4:317\n97#2,4:321\n97#2,4:325\n97#2,4:329\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n*L\n231#1:317,4\n232#1:321,4\n233#1:325,4\n234#1:329,4\n*E\n"})
public final class j4 implements CharSequence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f19636e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19637f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f19638g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f19639h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f19640i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private CharSequence f19641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private t1 f19642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19643c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19644d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j4(@NotNull CharSequence charSequence) {
        this.f19641a = charSequence;
    }

    public static /* synthetic */ void e(j4 j4Var, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        j4Var.d(i10, i11, charSequence, i15, i13);
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        return Intrinsics.areEqual(toString(), charSequence.toString());
    }

    public char b(int i10) {
        t1 t1Var = this.f19642b;
        if (t1Var != null && i10 >= this.f19643c) {
            int iE = t1Var.e();
            int i11 = this.f19643c;
            return i10 < iE + i11 ? t1Var.d(i10 - i11) : this.f19641a.charAt(i10 - ((iE - this.f19644d) + i11));
        }
        return this.f19641a.charAt(i10);
    }

    public int c() {
        t1 t1Var = this.f19642b;
        return t1Var == null ? this.f19641a.length() : (this.f19641a.length() - (this.f19644d - this.f19643c)) + t1Var.e();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    public final void d(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        boolean z10 = true;
        int i14 = 1 << 0;
        if (!(i10 <= i11)) {
            androidx.compose.foundation.internal.e.g("start=" + i10 + " > end=" + i11);
        }
        if (!(i12 <= i13)) {
            androidx.compose.foundation.internal.e.g("textStart=" + i12 + " > textEnd=" + i13);
        }
        if (!(i10 >= 0)) {
            androidx.compose.foundation.internal.e.g("start must be non-negative, but was " + i10);
        }
        if (i12 < 0) {
            z10 = false;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.g("textStart must be non-negative, but was " + i12);
        }
        t1 t1Var = this.f19642b;
        int i15 = i13 - i12;
        if (t1Var != null) {
            int i16 = this.f19643c;
            int i17 = i10 - i16;
            int i18 = i11 - i16;
            if (i17 >= 0 && i18 <= t1Var.e()) {
                t1Var.g(i17, i18, charSequence, i12, i13);
                return;
            }
            this.f19641a = toString();
            this.f19642b = null;
            this.f19643c = -1;
            this.f19644d = -1;
            d(i10, i11, charSequence, i12, i13);
            return;
        }
        int iMax = Math.max(255, i15 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f19641a.length() - i11, 64);
        int i19 = i10 - iMin;
        s6.a(this.f19641a, cArr, 0, i19, i10);
        int i20 = iMax - iMin2;
        int i21 = iMin2 + i11;
        s6.a(this.f19641a, cArr, i20, i11, i21);
        s6.a(charSequence, cArr, iMin, i12, i13);
        this.f19642b = new t1(cArr, iMin + i15, i20);
        this.f19643c = i19;
        this.f19644d = i21;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        t1 t1Var = this.f19642b;
        if (t1Var == null) {
            return this.f19641a.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19641a, 0, this.f19643c);
        t1Var.a(sb2);
        CharSequence charSequence = this.f19641a;
        sb2.append(charSequence, this.f19644d, charSequence.length());
        return sb2.toString();
    }
}
