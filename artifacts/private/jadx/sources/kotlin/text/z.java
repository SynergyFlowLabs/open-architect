package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f313392a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f313393b;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        f313393b = property;
    }

    private z() {
    }
}
