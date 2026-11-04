package androidx.compose.foundation.internal;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.text.c3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/ClipboardUtils_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,557:1\n35#2,5:558\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/ClipboardUtils_androidKt\n*L\n95#1:558,5\n*E\n"})
public final class b {
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
    private static final String f15655a = "plain text";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f15656b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f15657c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f15658d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f15659e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f15660f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f15661g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f15662h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f15663i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f15664j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f15665k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f15666l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte f15667m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f15668n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f15669o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte f15670p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte f15671q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte f15672r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte f15673s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f15674t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte f15675u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte f15676v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f15677w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f15678x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f15679y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f15680z = 8;

    @Nullable
    public static final androidx.compose.ui.text.f a(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new androidx.compose.ui.text.f(charSequence.toString(), null, 2, null);
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
                    arrayList.add(new androidx.compose.ui.text.f.e(new c(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
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
        d dVar = new d();
        List<androidx.compose.ui.text.f.e<c3>> listI = fVar.i();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.f.e<c3> eVar = listI.get(i10);
            c3 c3VarA = eVar.a();
            int iB = eVar.b();
            int iC = eVar.c();
            dVar.q();
            dVar.e(c3VarA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", dVar.p()), iB, iC, 33);
        }
        return spannableString;
    }

    public static final boolean c(@Nullable k1 k1Var) {
        return a.a(k1Var);
    }

    @Nullable
    public static final Object d(@NotNull k1 k1Var, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.text.f> dVar) {
        return a.b(k1Var);
    }

    @Nullable
    public static final Object e(@NotNull k1 k1Var, @NotNull kotlin.coroutines.d<? super String> dVar) {
        return a.c(k1Var);
    }

    @Nullable
    public static final k1 f(@Nullable androidx.compose.ui.text.f fVar) {
        return a.d(fVar);
    }
}
