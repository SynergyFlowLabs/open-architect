package androidx.window.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76258a = new a();

    private a() {
    }

    @Override // androidx.window.core.f
    public void a(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
