package coil.decode;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@i4.a
public final class a extends v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87122a;

    public a(@NotNull String str) {
        this.f87122a = str;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Migrate to filePath as it supports assets inside subfolders.")
    public static /* synthetic */ void b() {
    }

    @NotNull
    public final String a() {
        return StringsKt.s5(this.f87122a, '/', null, 2, null);
    }

    @NotNull
    public final String c() {
        return this.f87122a;
    }
}
