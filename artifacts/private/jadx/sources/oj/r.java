package oj;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class r extends Error {
    public r() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public r(@Nullable String str) {
        super(str);
    }

    public r(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public r(@Nullable Throwable th2) {
        super(th2);
    }
}
