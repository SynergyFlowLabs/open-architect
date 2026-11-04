package b0;

import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77499e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextClassification f77500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f77501d;

    public h(@NotNull Object obj, @NotNull TextClassification textClassification, int i10) {
        super(obj);
        this.f77500c = textClassification;
        this.f77501d = i10;
    }

    public final int b() {
        return this.f77501d;
    }

    @NotNull
    public final TextClassification c() {
        return this.f77500c;
    }

    @NotNull
    public String toString() {
        return "TextContextMenuRemoteActionItem(key=" + a() + ", textClassification=" + this.f77500c + ", index=" + this.f77501d + ')';
    }
}
