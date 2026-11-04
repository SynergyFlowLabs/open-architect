package androidx.core.text.util;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.r;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f48308a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<b> f48309b = new Comparator() { // from class: androidx.core.text.util.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.a((c.b) obj, (c.b) obj2);
        }
    };

    @w0(24)
    static class a {
        private a() {
        }

        static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        URLSpan f48310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f48311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f48313d;

        b() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.util.c$c, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0407c {
    }

    private c() {
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        int i10 = bVar.f48312c;
        int i11 = bVar2.f48312c;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return Integer.compare(bVar2.f48313d, bVar.f48313d);
    }

    private static void b(@NonNull TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void c(@NonNull TextView textView, @NonNull Pattern pattern, @p0 String str) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            e(textView, pattern, str, null, null, null);
        }
    }

    public static void d(@NonNull TextView textView, @NonNull Pattern pattern, @p0 String str, @p0 Linkify.MatchFilter matchFilter, @p0 Linkify.TransformFilter transformFilter) {
        if (q()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            e(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void e(@NonNull TextView textView, @NonNull Pattern pattern, @p0 String str, @p0 String[] strArr, @p0 Linkify.MatchFilter matchFilter, @p0 Linkify.TransformFilter transformFilter) {
        if (q()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (i(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            b(textView);
        }
    }

    public static boolean f(@NonNull Spannable spannable, int i10) {
        Spannable spannable2;
        if (q()) {
            return Linkify.addLinks(spannable, i10);
        }
        if (i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<b> arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            spannable2 = spannable;
            m(arrayList, spannable2, r.f48435w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        } else {
            spannable2 = spannable;
        }
        if ((i10 & 2) != 0) {
            m(arrayList, spannable2, r.A, new String[]{androidx.core.net.c.f48012b}, null, null);
        }
        if ((i10 & 8) != 0) {
            n(arrayList, spannable2);
        }
        p(arrayList, spannable2);
        if (arrayList.size() == 0) {
            return false;
        }
        for (b bVar : arrayList) {
            if (bVar.f48310a == null) {
                k(bVar.f48311b, bVar.f48312c, bVar.f48313d, spannable2);
            }
        }
        return true;
    }

    public static boolean g(@NonNull Spannable spannable, @NonNull Pattern pattern, @p0 String str) {
        return q() ? Linkify.addLinks(spannable, pattern, str) : i(spannable, pattern, str, null, null, null);
    }

    public static boolean h(@NonNull Spannable spannable, @NonNull Pattern pattern, @p0 String str, @p0 Linkify.MatchFilter matchFilter, @p0 Linkify.TransformFilter transformFilter) {
        return q() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : i(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean i(@NonNull Spannable spannable, @NonNull Pattern pattern, @p0 String str, @p0 String[] strArr, @p0 Linkify.MatchFilter matchFilter, @p0 Linkify.TransformFilter transformFilter) {
        if (q()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f48308a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str2 = strArr[i10];
            i10++;
            strArr2[i10] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z10 = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, iStart, iEnd) : true) && strGroup != null) {
                k(o(strGroup, strArr2, matcher, transformFilter), iStart, iEnd, spannable);
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean j(@NonNull TextView textView, int i10) {
        if (q()) {
            return Linkify.addLinks(textView, i10);
        }
        if (i10 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (f(spannableStringValueOf, i10)) {
                b(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        } else if (f((Spannable) text, i10)) {
            b(textView);
            return true;
        }
        return false;
    }

    private static void k(String str, int i10, int i11, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i10, i11, 33);
    }

    private static String l(String str) {
        return WebView.findAddress(str);
    }

    private static void m(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    b bVar = new b();
                    bVar.f48311b = o(strGroup, strArr, matcher, transformFilter);
                    bVar.f48312c = iStart;
                    bVar.f48313d = iEnd;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void n(ArrayList<b> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i10 = 0;
        while (true) {
            try {
                String strL = l(string);
                if (strL == null || (iIndexOf = string.indexOf(strL)) < 0) {
                    break;
                    break;
                }
                b bVar = new b();
                int length = strL.length() + iIndexOf;
                bVar.f48312c = iIndexOf + i10;
                i10 += length;
                bVar.f48313d = i10;
                string = string.substring(length);
                try {
                    bVar.f48311b = "geo:0,0?q=" + URLEncoder.encode(strL, "UTF-8");
                    arrayList.add(bVar);
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
            }
        }
    }

    private static String o(@NonNull String str, @NonNull String[] strArr, Matcher matcher, @p0 Linkify.TransformFilter transformFilter) {
        boolean z10;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String str2 = str;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            String str3 = strArr[i10];
            if (str2.regionMatches(true, 0, str3, 0, str3.length())) {
                z10 = true;
                if (!str2.regionMatches(false, 0, str3, 0, str3.length())) {
                    str2 = str3 + str2.substring(str3.length());
                    break;
                }
                break;
            }
            i10++;
        }
        if (z10 || strArr.length <= 0) {
            return str2;
        }
        return strArr[0] + str2;
    }

    private static void p(ArrayList<b> arrayList, Spannable spannable) {
        int i10;
        int i11 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f48310a = uRLSpan;
            bVar.f48312c = spannable.getSpanStart(uRLSpan);
            bVar.f48313d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f48309b);
        int size = arrayList.size();
        while (i11 < size - 1) {
            b bVar2 = arrayList.get(i11);
            int i12 = i11 + 1;
            b bVar3 = arrayList.get(i12);
            int i13 = bVar2.f48312c;
            int i14 = bVar3.f48312c;
            if (i13 <= i14 && (i10 = bVar2.f48313d) > i14) {
                int i15 = bVar3.f48313d;
                int i16 = (i15 > i10 && i10 - i13 <= i15 - i14) ? i10 - i13 < i15 - i14 ? i11 : -1 : i12;
                if (i16 != -1) {
                    Object obj = arrayList.get(i16).f48310a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i16);
                    size--;
                }
            }
            i11 = i12;
        }
    }

    private static boolean q() {
        return true;
    }
}
