package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
@e.a({"NewApi"})
public final class n implements Consumer<List<? extends SplitInfo>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l.a f76311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f76312b;

    public n(@NotNull l.a callback, @NotNull i adapter) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f76311a = callback;
        this.f76312b = adapter;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(@NotNull List<? extends SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        this.f76311a.a(this.f76312b.i(splitInfoList));
    }
}
