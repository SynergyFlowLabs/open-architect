package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
@w0(19)
@b1({b1.a.LIBRARY})
final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51227f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51228g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51229h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51230i = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final androidx.emoji2.text.f.m f51231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final p f51232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private androidx.emoji2.text.f.InterfaceC0462f f51233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final int[] f51235e;

    @w0(19)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f51236a = -1;

        private a() {
        }

        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10) {
                return -1;
            }
            if (i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10) {
                return -1;
            }
            if (i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public t f51237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.f.m f51238b;

        b(@p0 t tVar, androidx.emoji2.text.f.m mVar) {
            this.f51237a = tVar;
            this.f51238b = mVar;
        }

        @Override // androidx.emoji2.text.j.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, r rVar) {
            if (rVar.m()) {
                return true;
            }
            if (this.f51237a == null) {
                this.f51237a = new t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f51237a.setSpan(this.f51238b.a(rVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.j.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t getResult() {
            return this.f51237a;
        }
    }

    private interface c<T> {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, r rVar);

        T getResult();
    }

    private static class d implements c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51240b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51241c = -1;

        d(int i10) {
            int i11 = 6 ^ (-1);
            this.f51239a = i10;
        }

        @Override // androidx.emoji2.text.j.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, r rVar) {
            int i12 = this.f51239a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f51240b = i10;
            this.f51241c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.j.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }

    private static class e implements c<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51242a;

        e(String str) {
            this.f51242a = str;
        }

        @Override // androidx.emoji2.text.j.c
        public boolean a(@NonNull CharSequence charSequence, int i10, int i11, r rVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f51242a)) {
                return true;
            }
            rVar.o(true);
            return false;
        }

        @Override // androidx.emoji2.text.j.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e getResult() {
            return this;
        }
    }

    static final class f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f51243i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f51244j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51245a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p.a f51246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p.a f51247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p.a f51248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f51251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f51252h;

        f(p.a aVar, boolean z10, int[] iArr) {
            this.f51246b = aVar;
            this.f51247c = aVar;
            this.f51251g = z10;
            this.f51252h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f51245a = 1;
            this.f51247c = this.f51246b;
            this.f51250f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f51247c.b().l() || d(this.f51249e)) {
                return true;
            }
            if (this.f51251g) {
                if (this.f51252h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f51252h, this.f51247c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            p.a aVarA = this.f51247c.a(i10);
            int iG = 2;
            if (this.f51245a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f51245a = 2;
                    this.f51247c = aVarA;
                    this.f51250f = 1;
                }
            } else if (aVarA != null) {
                this.f51247c = aVarA;
                this.f51250f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f51247c.b() != null) {
                    iG = 3;
                    if (this.f51250f != 1 || h()) {
                        this.f51248d = this.f51247c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f51249e = i10;
            return iG;
        }

        r b() {
            return this.f51247c.b();
        }

        r c() {
            return this.f51248d.b();
        }

        boolean e() {
            if (this.f51245a != 2 || this.f51247c.b() == null) {
                return false;
            }
            return this.f51250f > 1 || h();
        }
    }

    j(@NonNull p pVar, @NonNull androidx.emoji2.text.f.m mVar, @NonNull androidx.emoji2.text.f.InterfaceC0462f interfaceC0462f, boolean z10, @p0 int[] iArr, @NonNull Set<int[]> set) {
        this.f51231a = mVar;
        this.f51232b = pVar;
        this.f51233c = interfaceC0462f;
        this.f51234d = z10;
        this.f51235e = iArr;
        k(set);
    }

    private static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        k[] kVarArr;
        if (j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!i(selectionStart, selectionEnd) && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean f(@NonNull InputConnection inputConnection, @NonNull Editable editable, @g0(from = 0) int i10, @g0(from = 0) int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            k[] kVarArr = (k[]) editable.getSpans(iMax, iMin, k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                for (k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean g(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        boolean zA;
        if (i10 != 67) {
            zA = i10 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean h(CharSequence charSequence, int i10, int i11, r rVar) {
        if (rVar.e() == 0) {
            rVar.p(this.f51233c.a(charSequence, i10, i11, rVar.i()));
        }
        return rVar.e() == 2;
    }

    private static boolean i(int i10, int i11) {
        if (i10 != -1 && i11 != -1 && i10 == i11) {
            return false;
        }
        return true;
    }

    private static boolean j(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void k(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            int i10 = 4 & 0;
            String str = new String(iArr, 0, iArr.length);
            m(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private <T> T m(@NonNull CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        f fVar = new f(this.f51232b.i(), this.f51234d, this.f51235e);
        int i13 = 2 & 0;
        int i14 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (true) {
                if (i10 >= i11 || i14 >= i12 || !zA) {
                    break loop0;
                }
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA != 3) {
                }
            }
            if (z10 || !h(charSequence, iCharCount, i10, fVar.c())) {
                zA = cVar.a(charSequence, iCharCount, i10, fVar.c());
                i14++;
            }
        }
        if (fVar.e() && i14 < i12 && zA && (z10 || !h(charSequence, iCharCount, i10, fVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, fVar.b());
        }
        return cVar.getResult();
    }

    int b(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                k[] kVarArr = (k[]) spanned.getSpans(i10, i10 + 1, k.class);
                if (kVarArr.length > 0) {
                    return spanned.getSpanEnd(kVarArr[0]);
                }
            }
            return ((d) m(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f51241c;
        }
        return -1;
    }

    int c(@NonNull CharSequence charSequence) {
        return d(charSequence, this.f51232b.h());
    }

    int d(@NonNull CharSequence charSequence, int i10) {
        f fVar = new f(this.f51232b.i(), this.f51234d, this.f51235e);
        int length = charSequence.length();
        int iCharCount = 0;
        int i11 = 0;
        int i12 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iA = fVar.a(iCodePointAt);
            r rVarB = fVar.b();
            if (iA == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i12 = 0;
            } else if (iA != 2) {
                int i13 = 7 << 3;
                if (iA == 3) {
                    rVarB = fVar.c();
                    if (rVarB.d() <= i10) {
                        i11++;
                    }
                }
            } else {
                iCharCount += Character.charCount(iCodePointAt);
            }
            if (rVarB != null && rVarB.d() <= i10) {
                i12++;
            }
        }
        if (i11 != 0) {
            return 2;
        }
        if (!fVar.e() || fVar.b().d() > i10) {
            return i12 == 0 ? 0 : 2;
        }
        return 1;
    }

    int e(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            k[] kVarArr = (k[]) spanned.getSpans(i10, i10 + 1, k.class);
            if (kVarArr.length > 0) {
                return spanned.getSpanStart(kVarArr[0]);
            }
        }
        return ((d) m(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f51240b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0025, B:22:0x003e, B:24:0x0046, B:26:0x0049, B:28:0x004d, B:30:0x0059, B:31:0x005c, B:41:0x007b), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0025, B:22:0x003e, B:24:0x0046, B:26:0x0049, B:28:0x004d, B:30:0x0059, B:31:0x005c, B:41:0x007b), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    CharSequence l(@NonNull CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, boolean z10) throws Throwable {
        t tVar;
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        k[] kVarArr;
        int i15;
        int spanStart;
        boolean z11 = charSequence instanceof q;
        if (z11) {
            ((q) charSequence).a();
        }
        if (z11) {
            tVar = new t((Spannable) charSequence);
            if (tVar != null) {
                for (k kVar : kVarArr) {
                    spanStart = tVar.getSpanStart(kVar);
                    int spanEnd = tVar.getSpanEnd(kVar);
                    if (spanStart != i11) {
                        tVar.removeSpan(kVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                ((q) charSequence2).d();
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
                ((q) charSequence2).d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    tVar = new t((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((q) charSequence2).d();
                    throw th2;
                }
            } else {
                tVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, k.class) > i11) ? null : new t(charSequence);
            }
            if (tVar != null && (kVarArr = (k[]) tVar.getSpans(i10, i11, k.class)) != null && kVarArr.length > 0) {
                while (i15 < r5) {
                    spanStart = tVar.getSpanStart(kVar);
                    int spanEnd2 = tVar.getSpanEnd(kVar);
                    if (spanStart != i11) {
                        tVar.removeSpan(kVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14 && i13 < charSequence.length()) {
                if (i12 != Integer.MAX_VALUE && tVar != null) {
                    i12 -= ((k[]) tVar.getSpans(0, tVar.length(), k.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    t tVar2 = (t) m(charSequence2, i13, i14, i12, z10, new b(tVar, this.f51231a));
                    if (tVar2 == null) {
                        if (z11) {
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = tVar2.b();
                    if (z11) {
                        ((q) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((q) charSequence2).d();
                    throw th2;
                }
            }
            charSequence2 = charSequence;
            if (!z11) {
                return charSequence2;
            }
            ((q) charSequence2).d();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((q) charSequence2).d();
        throw th2;
    }
}
