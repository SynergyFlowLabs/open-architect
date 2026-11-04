package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,532:1\n252#2:533\n147#3,2:534\n147#3,2:536\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n520#1:533\n523#1:534,2\n525#1:536,2\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f20614a = androidx.compose.ui.unit.a0.m(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, long j11) {
        if (!androidx.compose.ui.unit.z.p(j11)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) androidx.compose.ui.unit.z.u(j11)) + '.');
        }
        if (androidx.compose.ui.unit.z.p(j10)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) androidx.compose.ui.unit.z.u(j11)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (androidx.compose.ui.unit.z.l(j10) != 0) {
            float fN = androidx.compose.ui.unit.z.n(j11);
            androidx.compose.ui.unit.a0.b(j10);
            return androidx.compose.ui.unit.a0.v(androidx.compose.ui.unit.z.l(j10), androidx.compose.ui.unit.z.n(j10) * fN);
        }
        long j12 = f20614a;
        float fN2 = androidx.compose.ui.unit.z.n(j11);
        androidx.compose.ui.unit.a0.b(j12);
        return androidx.compose.ui.unit.a0.v(androidx.compose.ui.unit.z.l(j12), androidx.compose.ui.unit.z.n(j12) * fN2);
    }
}
