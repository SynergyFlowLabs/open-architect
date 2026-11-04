package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,660:1\n13409#2,2:661\n1#3:663\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n*L\n570#1:661,2\n*E\n"})
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f19754a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f19755b = "StatelessIC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f19756c = "StatelessInputConnection";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f19757d = "EXTRA_INPUT_CONTENT_INFO";

    @androidx.annotation.l1
    public static /* synthetic */ void b() {
    }

    private static final androidx.compose.ui.text.font.y c(String str) {
        if (str != null && str.length() != 0) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (Intrinsics.areEqual(typefaceCreate, typeface) || Intrinsics.areEqual(typefaceCreate, Typeface.create(typeface, 0))) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null) {
                return androidx.compose.ui.text.font.m.a(typefaceCreate);
            }
        }
        return null;
    }

    private static final androidx.compose.ui.text.f.a d(Object obj) {
        if (obj instanceof BackgroundColorSpan) {
            return new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, androidx.compose.ui.graphics.s0.b(((BackgroundColorSpan) obj).getBackgroundColor()), (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 63487, (DefaultConstructorMarker) null);
        }
        if (obj instanceof ForegroundColorSpan) {
            return new androidx.compose.ui.text.c3(androidx.compose.ui.graphics.s0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, androidx.media3.extractor.y0.f69665l, (DefaultConstructorMarker) null);
        }
        if (obj instanceof StrikethroughSpan) {
            return new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.b(), (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null);
        }
        if (obj instanceof StyleSpan) {
            return g((StyleSpan) obj);
        }
        if (obj instanceof TypefaceSpan) {
            return h((TypefaceSpan) obj);
        }
        if (obj instanceof UnderlineSpan) {
            return new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null);
        }
        return null;
    }

    @androidx.annotation.l1
    @Nullable
    public static final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> e(@NotNull Spanned spanned) {
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            androidx.compose.ui.text.f.a aVarD = d(obj);
            if (aVarD != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new androidx.compose.ui.text.f.e<>(aVarD, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText f(androidx.compose.foundation.text.input.l lVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = lVar;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = lVar.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.w3.l(lVar.h());
        extractedText.selectionEnd = androidx.compose.ui.text.w3.k(lVar.h());
        extractedText.flags = !StringsKt.U2(lVar, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }

    private static final androidx.compose.ui.text.c3 g(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new androidx.compose.ui.text.c3(0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new androidx.compose.ui.text.c3(0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65523, (DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.c3 h(TypefaceSpan typefaceSpan) {
        androidx.compose.ui.text.font.y yVarE;
        String family = typefaceSpan.getFamily();
        androidx.compose.ui.text.font.y.a aVar = androidx.compose.ui.text.font.y.f41770b;
        if (Intrinsics.areEqual(family, aVar.a().s())) {
            yVarE = aVar.a();
        } else if (Intrinsics.areEqual(family, aVar.c().s())) {
            yVarE = aVar.c();
        } else if (Intrinsics.areEqual(family, aVar.d().s())) {
            yVarE = aVar.d();
        } else {
            yVarE = Intrinsics.areEqual(family, aVar.e().s()) ? aVar.e() : c(typefaceSpan.getFamily());
        }
        return new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, yVarE, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65503, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final w.g i(@NotNull androidx.core.view.inputmethod.d dVar, @Nullable Bundle bundle) {
        androidx.compose.ui.platform.k1 k1VarC = androidx.compose.ui.platform.g.c(new ClipData(dVar.b(), new ClipData.Item(dVar.a())));
        int iC = w.g.a.f385811b.c();
        androidx.compose.ui.platform.l1 l1VarD = androidx.compose.ui.platform.g.d(dVar.b());
        Uri uriC = dVar.c();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new w.g(k1VarC, l1VarD, iC, new w.b(uriC, bundle), null);
    }
}
