package kotlinx.coroutines.selects;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public enum s {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f315566f = kotlin.enums.c.c(k());

    static {
        int i10 = 6 << 3;
    }

    @NotNull
    public static kotlin.enums.a<s> l() {
        return f315566f;
    }
}
