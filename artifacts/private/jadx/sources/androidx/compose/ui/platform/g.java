package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,601:1\n35#2,5:602\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n163#1:602,5\n*E\n"})
public final class g {
    private static final int A = 8;
    private static final int B = 5;
    private static final int C = 4;
    private static final int D = 1;
    private static final int E = 1;
    private static final int F = 4;
    private static final int G = 8;
    private static final int H = 4;
    private static final int I = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f40445a = "plain text";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f40446b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f40447c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f40448d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f40449e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f40450f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f40451g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f40452h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f40453i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f40454j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f40455k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f40456l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte f40457m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f40458n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f40459o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte f40460p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte f40461q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte f40462r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte f40463s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f40464t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte f40465u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f40466v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f40467w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f40468x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f40469y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f40470z = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final androidx.compose.ui.text.f a(@Nullable CharSequence charSequence) {
        List list = null;
        Object[] objArr = 0;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new androidx.compose.ui.text.f(charSequence.toString(), list, 2, objArr == true ? 1 : 0);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int lastIndex = ArraysKt.getLastIndex(annotationArr);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new androidx.compose.ui.text.f.e(new s1(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return new androidx.compose.ui.text.f(charSequence.toString(), arrayList, null, 4, null);
    }

    @NotNull
    public static final CharSequence b(@NotNull androidx.compose.ui.text.f fVar) {
        if (fVar.i().isEmpty()) {
            return fVar.m();
        }
        SpannableString spannableString = new SpannableString(fVar.m());
        b2 b2Var = new b2();
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.c3>> listI = fVar.i();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.f.e<androidx.compose.ui.text.c3> eVar = listI.get(i10);
            androidx.compose.ui.text.c3 c3VarA = eVar.a();
            int iB = eVar.b();
            int iC = eVar.c();
            b2Var.q();
            b2Var.e(c3VarA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", b2Var.p()), iB, iC, 33);
        }
        return spannableString;
    }

    @NotNull
    public static final k1 c(@NotNull ClipData clipData) {
        return new k1(clipData);
    }

    @NotNull
    public static final l1 d(@NotNull ClipDescription clipDescription) {
        return new l1(clipDescription);
    }
}
