package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class o4 implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final o4 f19727b = new o4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f19728c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f19729d = 13;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f19730e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f19731f = 65279;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f19732g = 0;

    private o4() {
    }

    @Override // androidx.compose.foundation.text.input.internal.t
    public int a(int i10, int i11) {
        if (i11 == 10) {
            return 32;
        }
        return i11 == 13 ? f19731f : i11;
    }

    @NotNull
    public String toString() {
        return "SingleLineCodepointTransformation";
    }
}
