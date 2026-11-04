package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.q3;
import androidx.compose.ui.text.y0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBlockExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockExtensions.kt\nio/intercom/android/sdk/survey/block/BlockExtensionsKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n1574#2:120\n1574#2:145\n1508#2,6:151\n31#3,4:121\n31#3,4:125\n31#3,4:129\n31#3,4:133\n31#3,4:146\n13409#4,2:137\n13409#4,2:139\n13409#4,2:141\n13409#4,2:143\n13409#4:150\n13410#4:157\n*S KotlinDebug\n*F\n+ 1 BlockExtensions.kt\nio/intercom/android/sdk/survey/block/BlockExtensionsKt\n*L\n39#1:120\n77#1:145\n107#1:151,6\n40#1:121,4\n41#1:125,4\n42#1:129,4\n43#1:133,4\n85#1:146,4\n47#1:137,2\n60#1:139,2\n65#1:141,2\n70#1:143,2\n87#1:150\n87#1:157\n*E\n"})
public final class BlockExtensionsKt {
    private static final void appendStringWithLink(androidx.compose.ui.text.f.b bVar, c3 c3Var, final Context context, Spanned spanned) {
        int i10 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i11 = 0;
        while (i10 < length) {
            final URLSpan uRLSpan = uRLSpanArr[i10];
            androidx.compose.ui.text.b0.a aVar = new androidx.compose.ui.text.b0.a("url", new q3(c3Var, null, null, null, 14, null), new androidx.compose.ui.text.c0() { // from class: io.intercom.android.sdk.survey.block.f
                @Override // androidx.compose.ui.text.c0
                public final void a(androidx.compose.ui.text.b0 b0Var) {
                    BlockExtensionsKt.appendStringWithLink$lambda$8$lambda$6(uRLSpan, context, b0Var);
                }
            });
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            if (spanStart > i11) {
                bVar.p(spanned.subSequence(i11, spanStart).toString());
            }
            int iW = bVar.w(aVar);
            try {
                bVar.p(spanned.subSequence(spanStart, spanEnd).toString());
                Unit unit = Unit.f312394a;
                bVar.u(iW);
                i10++;
                i11 = spanEnd;
            } catch (Throwable th2) {
                bVar.u(iW);
                throw th2;
            }
        }
        if (i11 < spanned.length()) {
            bVar.p(spanned.subSequence(i11, spanned.length()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendStringWithLink$lambda$8$lambda$6(URLSpan urlSpan, Context context, androidx.compose.ui.text.b0 it) {
        Intrinsics.checkNotNullParameter(urlSpan, "$urlSpan");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        String url = urlSpan.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
        if (!StringsKt.w3(url)) {
            LinkOpener.handleUrl(urlSpan.getURL(), context, Injector.get().getApi());
        }
    }

    public static final int getTextAlign(@NotNull BlockAlignment blockAlignment) {
        Intrinsics.checkNotNullParameter(blockAlignment, "<this>");
        int gravity = blockAlignment.getGravity();
        if (gravity == 1) {
            return androidx.compose.ui.text.style.j.f42206b.a();
        }
        if (gravity != 8388611 && gravity == 8388613) {
            return androidx.compose.ui.text.style.j.f42206b.b();
        }
        return androidx.compose.ui.text.style.j.f42206b.f();
    }

    @NotNull
    public static final androidx.compose.ui.text.f toAnnotatedString(@NotNull CharSequence charSequence, @NotNull Context context, @NotNull c3 urlSpanStyle) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlSpanStyle, "urlSpanStyle");
        if (!(charSequence instanceof Spanned)) {
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
            bVar.p(bVar.toString());
            return bVar.C();
        }
        androidx.compose.ui.text.f.b bVar2 = new androidx.compose.ui.text.f.b(0, 1, null);
        Spanned spanned = (Spanned) charSequence;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spanned.getSpans(0, spanned.length(), UnderlineSpan.class);
        StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spanned.getSpans(0, spanned.length(), StrikethroughSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class);
        appendStringWithLink(bVar2, urlSpanStyle, context, spanned);
        for (StyleSpan styleSpan : styleSpanArr) {
            int spanStart = spanned.getSpanStart(styleSpan);
            int spanEnd = spanned.getSpanEnd(styleSpan);
            int style = styleSpan.getStyle();
            if (style == 1) {
                bVar2.g(new c3(0L, 0L, v0.f41742b.c(), (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (style == 2) {
                bVar2.g(new c3(0L, 0L, (v0) null, androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (style == 3) {
                bVar2.g(new c3(0L, 0L, v0.f41742b.c(), androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
            }
        }
        for (UnderlineSpan underlineSpan : underlineSpanArr) {
            bVar2.g(new c3(0L, 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), spanned.getSpanStart(underlineSpan), spanned.getSpanEnd(underlineSpan));
        }
        for (StrikethroughSpan strikethroughSpan : strikethroughSpanArr) {
            bVar2.g(new c3(0L, 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.b(), (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), spanned.getSpanStart(strikethroughSpan), spanned.getSpanEnd(strikethroughSpan));
        }
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            bVar2.g(new c3(androidx.compose.ui.graphics.s0.b(foregroundColorSpan.getForegroundColor()), 0L, (v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, androidx.media3.extractor.y0.f69665l, (DefaultConstructorMarker) null), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
        }
        return bVar2.C();
    }
}
