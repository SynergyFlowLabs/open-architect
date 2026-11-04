package kotlin.uuid;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f313444a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SecureRandom f313445b = new SecureRandom();

    private b() {
    }

    @NotNull
    public final SecureRandom a() {
        return f313445b;
    }
}
