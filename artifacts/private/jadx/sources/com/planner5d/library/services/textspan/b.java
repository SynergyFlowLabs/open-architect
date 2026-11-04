package com.planner5d.library.services.textspan;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.core.content.d;
import com.facebook.AuthenticationTokenClaims;
import com.planner5d.library.services.utility.i2;
import com.planner5d.library.services.utility.o2;
import java.util.function.Function;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    class a implements Linkify.MatchFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f224994a = {"png", "jpg", "sh", AuthenticationTokenClaims.f98407i3, "guess"};

        a() {
        }

        @Override // android.text.util.Linkify.MatchFilter
        public boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
            String[] strArrSplit = charSequence.subSequence(i10, i11).toString().split("\\.");
            if (strArrSplit.length == 2) {
                for (String str : this.f224994a) {
                    if (str.equals(strArrSplit[1].toLowerCase())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    private b() {
    }

    public static /* synthetic */ void a(Activity activity, Function function, String str) {
        try {
            i2.b(activity, str);
        } catch (ActivityNotFoundException unused) {
            if (function != null) {
                function.apply(str);
            }
        }
    }

    public static CharSequence b(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        Linkify.addLinks(spannableString, 2);
        Linkify.addLinks(spannableString, Patterns.WEB_URL, (String) null, new a(), (Linkify.TransformFilter) null);
        return spannableString;
    }

    public static Spanned c(Context context, @f1 int i10, Object... objArr) {
        return d(context == null ? null : context.getString(i10, objArr));
    }

    public static Spanned d(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    public static CharSequence e(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder.getSpans(0, charSequence.length(), ClickableSpan.class)) {
            spannableStringBuilder.removeSpan(clickableSpan);
        }
        return spannableStringBuilder;
    }

    public static CharSequence f(CharSequence charSequence, UrlSpanWithListener.a aVar, @l Integer num, boolean z10) {
        return g(charSequence, aVar, num, z10, false, true);
    }

    public static CharSequence g(CharSequence charSequence, UrlSpanWithListener.a aVar, @l Integer num, boolean z10, boolean z11, boolean z12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, charSequence.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (!z10 || (url != null && url.startsWith("p5d://"))) {
                spannableStringBuilder.setSpan(new UrlSpanWithListener(uRLSpan.getURL(), aVar, num, z11, z12), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                spannableStringBuilder.removeSpan(uRLSpan);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence h(String str, UrlSpanWithListener.a aVar, @l Integer num, boolean z10) {
        return i(str, aVar, num, z10, false, true);
    }

    public static CharSequence i(String str, UrlSpanWithListener.a aVar, @l Integer num, boolean z10, boolean z11, boolean z12) {
        return g(d(str), aVar, num, z10, z11, z12);
    }

    public static void j(Activity activity, TextView textView, @f1 int i10, @p0 Function<String, Unit> function) {
        l(activity, textView, i10, false, true, function, new Object[0]);
    }

    public static void k(Activity activity, TextView textView, @f1 int i10, boolean z10, @p0 Function<String, Unit> function) {
        l(activity, textView, i10, false, z10, function, new Object[0]);
    }

    public static void l(final Activity activity, TextView textView, @f1 int i10, boolean z10, boolean z11, @p0 final Function<String, Unit> function, Object... objArr) {
        n(textView, i(textView.getContext().getString(i10, objArr), new UrlSpanWithListener.a() { // from class: com.planner5d.library.services.textspan.a
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                b.a(activity, function, str);
            }
        }, Integer.valueOf(d.g(activity, o2.e.Rf)), false, z10, z11));
    }

    @NonNull
    public static SpannableStringBuilder m(@NonNull String str, int i10, int i11, int i12, @NonNull Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, i10, i11, i12);
        }
        return spannableStringBuilder;
    }

    public static void n(TextView textView, CharSequence... charSequenceArr) {
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setAutoLinkMask(0);
        if (charSequenceArr.length <= 1) {
            textView.setText(charSequenceArr.length == 0 ? null : charSequenceArr[0]);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            spannableStringBuilder.append(charSequence);
        }
        textView.setText(spannableStringBuilder);
    }
}
