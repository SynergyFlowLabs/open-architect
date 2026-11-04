package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f20203a = "AndroidLegacyPlatformTextInputServiceAdapter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static Function1<? super View, ? extends q3> f20204b = a.f20205a;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<View, s3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20205a = new a();

        a() {
            super(1, s3.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final s3 invoke(View view) {
            return new s3(view);
        }
    }

    @NotNull
    public static final x3 b() {
        return new c();
    }

    @NotNull
    public static final Function1<View, q3> c() {
        return f20204b;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void d() {
    }

    public static final void e(@NotNull Function1<? super View, ? extends q3> function1) {
        f20204b = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.q()) {
            androidx.emoji2.text.f.c().G(editorInfo);
        }
    }
}
