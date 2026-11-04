package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,378:1\n1#2:379\n13409#3,2:380\n173#4,2:382\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n*L\n115#1:380,2\n145#1:382,2\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f42318a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f42319b = "ContentHandlerReplacementTag";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f42320c = "annotation";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f42321d = "li";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f42322e = "ul";

    public static final class a implements Html.TagHandler {
        a() {
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z10 || !Intrinsics.areEqual(str, w.f42319b)) {
                return;
            }
            xMLReader.setContentHandler(new m(xMLReader.getContentHandler(), editable));
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42323a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f42323a = iArr;
        }
    }

    private static final void a(f.b bVar, Object obj, int i10, int i11, q3 q3Var, c0 c0Var) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            bVar.f(h((AlignmentSpan) obj), i10, i11);
            return;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            bVar.e(nVar.a(), nVar.b(), i10, i11);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            bVar.g(new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, androidx.compose.ui.graphics.s0.b(((BackgroundColorSpan) obj).getBackgroundColor()), (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 63487, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof q) {
            long jB = p.f42031h.b();
            q qVar = (q) obj;
            int iG = qVar.g();
            androidx.compose.ui.unit.a0.b(jB);
            bVar.b(qVar.f(), androidx.compose.ui.unit.a0.v(androidx.compose.ui.unit.z.l(jB), androidx.compose.ui.unit.z.n(jB) * iG), i10, i11);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            bVar.g(new c3(androidx.compose.ui.graphics.s0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, androidx.media3.extractor.y0.f69665l, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            bVar.g(new c3(0L, androidx.compose.ui.unit.a0.f(((RelativeSizeSpan) obj).getSizeChange()), (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65533, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            bVar.g(new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.b(), (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof StyleSpan) {
            c3 c3VarI = i((StyleSpan) obj);
            if (c3VarI != null) {
                bVar.g(c3VarI, i10, i11);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            bVar.g(new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, androidx.compose.ui.text.style.a.d(androidx.compose.ui.text.style.a.f42141b.c()), (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65279, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            bVar.g(new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, androidx.compose.ui.text.style.a.d(androidx.compose.ui.text.style.a.f42141b.e()), (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65279, (DefaultConstructorMarker) null), i10, i11);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            bVar.g(j((TypefaceSpan) obj), i10, i11);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            bVar.g(new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), i10, i11);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            bVar.d(new b0.b(url, q3Var, c0Var), i10, i11);
        }
    }

    private static final void b(f.b bVar, Spanned spanned, q3 q3Var, c0 c0Var) {
        for (Object obj : spanned.getSpans(0, bVar.r(), Object.class)) {
            long jB = x3.b(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            a(bVar, obj, w3.n(jB), w3.i(jB), q3Var, c0Var);
        }
    }

    @NotNull
    public static final f c(@NotNull f.c cVar, @NotNull String str, @Nullable q3 q3Var, @Nullable c0 c0Var) {
        return f(androidx.core.text.c.b("<ContentHandlerReplacementTag />" + str, 63, null, f42318a), q3Var, c0Var);
    }

    public static /* synthetic */ f d(f.c cVar, String str, q3 q3Var, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q3Var = null;
        }
        if ((i10 & 4) != 0) {
            c0Var = null;
        }
        return c(cVar, str, q3Var, c0Var);
    }

    private static final androidx.compose.ui.text.font.y e(String str) {
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

    @androidx.annotation.l1
    @NotNull
    public static final f f(@NotNull Spanned spanned, @Nullable q3 q3Var, @Nullable c0 c0Var) {
        f.b bVarAppend = new f.b(spanned.length()).append(spanned);
        b(bVarAppend, spanned, q3Var, c0Var);
        return bVarAppend.C();
    }

    public static /* synthetic */ f g(Spanned spanned, q3 q3Var, c0 c0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = null;
        }
        if ((i10 & 2) != 0) {
            c0Var = null;
        }
        return f(spanned, q3Var, c0Var);
    }

    private static final t0 h(AlignmentSpan alignmentSpan) {
        int iF;
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i10 = alignment == null ? -1 : b.f42323a[alignment.ordinal()];
        if (i10 == 1) {
            iF = androidx.compose.ui.text.style.j.f42206b.f();
        } else if (i10 != 2) {
            iF = i10 != 3 ? androidx.compose.ui.text.style.j.f42206b.g() : androidx.compose.ui.text.style.j.f42206b.b();
        } else {
            iF = androidx.compose.ui.text.style.j.f42206b.a();
        }
        int i11 = 5 << 0;
        return new t0(iF, 0, 0L, (androidx.compose.ui.text.style.s) null, (x0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, androidx.constraintlayout.core.motion.utils.v.g.f44098r, (DefaultConstructorMarker) null);
    }

    private static final c3 i(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new c3(0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new c3(0L, 0L, androidx.compose.ui.text.font.v0.f41742b.c(), androidx.compose.ui.text.font.q0.c(androidx.compose.ui.text.font.q0.f41690b.a()), (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65523, (DefaultConstructorMarker) null);
    }

    private static final c3 j(TypefaceSpan typefaceSpan) {
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
            yVarE = Intrinsics.areEqual(family, aVar.e().s()) ? aVar.e() : e(typefaceSpan.getFamily());
        }
        return new c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, yVarE, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65503, (DefaultConstructorMarker) null);
    }
}
