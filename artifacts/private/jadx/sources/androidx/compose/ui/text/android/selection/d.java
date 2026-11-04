package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.w0;
import java.text.BreakIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSegmentFinder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentFinder.android.kt\nandroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41423f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CharSequence f41424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BreakIterator f41425e;

    public d(@NotNull CharSequence charSequence) {
        this.f41424d = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f41425e = characterInstance;
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int e(int i10) {
        return this.f41425e.following(i10);
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int f(int i10) {
        return this.f41425e.preceding(i10);
    }
}
