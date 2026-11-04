package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n318#2,11:92\n*S KotlinDebug\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n*L\n70#1:92,11\n*E\n"})
public final class g {

    public static final class a extends androidx.core.content.res.i.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<Typeface> f41590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f41591b;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.n<? super Typeface> nVar, l1 l1Var) {
            this.f41590a = nVar;
            this.f41591b = l1Var;
        }

        @Override // androidx.core.content.res.i.f
        public void f(int i10) {
            this.f41590a.c(new IllegalStateException("Unable to load font " + this.f41591b + " (reason=" + i10 + ')'));
        }

        @Override // androidx.core.content.res.i.f
        public void g(Typeface typeface) {
            kotlinx.coroutines.n<Typeface> nVar = this.f41590a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(l1 l1Var, Context context) {
        Typeface typefaceJ = androidx.core.content.res.i.j(context, l1Var.i());
        Intrinsics.checkNotNull(typefaceJ);
        return typefaceJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(l1 l1Var, Context context, kotlin.coroutines.d<? super Typeface> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        androidx.core.content.res.i.l(context, l1Var.i(), new a(pVar, l1Var), null);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }
}
