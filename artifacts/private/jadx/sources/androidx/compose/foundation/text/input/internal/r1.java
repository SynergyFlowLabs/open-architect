package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(34)
final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r1 f19777a = new r1();

    private r1() {
    }

    public final void a(@NotNull EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf((Object[]) new Class[]{i1.a(), m1.a(), j1.a(), k1.a(), n1.a(), o1.a(), p1.a()}));
        editorInfo.setSupportedHandwritingGesturePreviews(SetsKt.setOf((Object[]) new Class[]{i1.a(), m1.a(), j1.a(), k1.a()}));
    }
}
