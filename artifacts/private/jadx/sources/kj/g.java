package kj;

import kotlin.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@f
@e1(version = "1.3")
@kotlin.internal.b
public enum g {
    AT_MOST_ONCE,
    AT_LEAST_ONCE,
    EXACTLY_ONCE,
    UNKNOWN;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f312234f = kotlin.enums.c.c(k());

    static {
        int i10 = 0 >> 0;
    }

    @NotNull
    public static kotlin.enums.a<g> l() {
        return f312234f;
    }
}
