package androidx.media2.exoplayer.external.text.cea;

import android.text.Layout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b extends androidx.media2.exoplayer.external.text.b implements Comparable<b> {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f56599g3 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final int f56600p2;

    public b(CharSequence text, Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, boolean windowColorSet, int windowColor, int priority) {
        super(text, textAlignment, line, lineType, lineAnchor, position, positionAnchor, size, windowColorSet, windowColor);
        this.f56600p2 = priority;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull b other) {
        int i10 = other.f56600p2;
        int i11 = this.f56600p2;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
