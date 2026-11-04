package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class y implements Appendable, CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f298617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<a> f298618b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f298619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f298620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f298621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f298622d;

        a(@NonNull Object obj, int i10, int i11, int i12) {
            this.f298619a = obj;
            this.f298620b = i10;
            this.f298621c = i11;
            this.f298622d = i12;
        }
    }

    static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public y() {
        this("");
    }

    private void g(int i10, @p0 CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z10) {
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj = spans[i11];
                        n(obj, spanned.getSpanStart(obj) + i10, spanned.getSpanEnd(obj) + i10, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i12 = length - 1; i12 >= 0; i12--) {
                    Object obj2 = spans[i12];
                    n(obj2, spanned.getSpanStart(obj2) + i10, spanned.getSpanEnd(obj2) + i10, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    @l1
    static boolean i(int i10, int i11, int i12) {
        return i12 > i11 && i11 >= 0 && i12 <= i10;
    }

    public static void o(@NonNull y yVar, @p0 Object obj, int i10, int i11) {
        if (obj != null && i(yVar.length(), i10, i11)) {
            p(yVar, obj, i10, i11);
        }
    }

    private static void p(@NonNull y yVar, @p0 Object obj, int i10, int i11) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                yVar.n(obj, i10, i11, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                p(yVar, obj2, i10, i11);
            }
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y append(char c10) {
        this.f298617a.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y append(@NonNull CharSequence charSequence) {
        g(length(), charSequence);
        this.f298617a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y append(CharSequence charSequence, int i10, int i11) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
        g(length(), charSequenceSubSequence);
        this.f298617a.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f298617a.charAt(i10);
    }

    public void clear() {
        this.f298617a.setLength(0);
        this.f298618b.clear();
    }

    @NonNull
    public y d(@NonNull CharSequence charSequence, @NonNull Object obj) {
        int length = length();
        append(charSequence);
        l(obj, length);
        return this;
    }

    @NonNull
    public y e(@NonNull CharSequence charSequence, @NonNull Object obj, int i10) {
        int length = length();
        append(charSequence);
        n(obj, length, length(), i10);
        return this;
    }

    @NonNull
    public y f(@NonNull String str) {
        this.f298617a.append(str);
        return this;
    }

    @NonNull
    public List<a> h(int i10, int i11) {
        int i12;
        int length = length();
        if (!i(length, i10, i11)) {
            return Collections.EMPTY_LIST;
        }
        if (i10 == 0 && length == i11) {
            ArrayList arrayList = new ArrayList(this.f298618b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.f298618b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i13 = next.f298620b;
            if ((i13 >= i10 && i13 < i11) || (((i12 = next.f298621c) <= i11 && i12 > i10) || (i13 < i10 && i12 > i11))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char j() {
        return this.f298617a.charAt(length() - 1);
    }

    @NonNull
    public CharSequence k(int i10) {
        a next;
        int i11;
        int length = length();
        b bVar = new b(this.f298617a.subSequence(i10, length));
        Iterator<a> it = this.f298618b.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            int i12 = next.f298620b;
            if (i12 >= i10 && (i11 = next.f298621c) <= length) {
                bVar.setSpan(next.f298619a, i12 - i10, i11 - i10, 33);
                it.remove();
            }
        }
        this.f298617a.replace(i10, length, "");
        return bVar;
    }

    @NonNull
    public y l(@NonNull Object obj, int i10) {
        return m(obj, i10, length());
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f298617a.length();
    }

    @NonNull
    public y m(@NonNull Object obj, int i10, int i11) {
        return n(obj, i10, i11, 33);
    }

    @NonNull
    public y n(@NonNull Object obj, int i10, int i11, int i12) {
        this.f298618b.push(new a(obj, i10, i11, i12));
        return this;
    }

    @NonNull
    public SpannableStringBuilder q() {
        b bVar = new b(this.f298617a);
        for (a aVar : this.f298618b) {
            bVar.setSpan(aVar.f298619a, aVar.f298620b, aVar.f298621c, aVar.f298622d);
        }
        return bVar;
    }

    @NonNull
    public CharSequence r() {
        return q();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        List<a> listH = h(i10, i11);
        if (listH.isEmpty()) {
            return this.f298617a.subSequence(i10, i11);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f298617a.subSequence(i10, i11));
        int length = spannableStringBuilder.length();
        for (a aVar : listH) {
            int iMax = Math.max(0, aVar.f298620b - i10);
            spannableStringBuilder.setSpan(aVar.f298619a, iMax, Math.min(length, (aVar.f298621c - aVar.f298620b) + iMax), aVar.f298622d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f298617a.toString();
    }

    public y(@NonNull CharSequence charSequence) {
        this.f298618b = new ArrayDeque(8);
        this.f298617a = new StringBuilder(charSequence);
        g(0, charSequence);
    }
}
