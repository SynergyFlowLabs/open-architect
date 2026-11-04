package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@e
public final class c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36676i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f36679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f36680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<y> f36681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f36682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<v> f36683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f36684h;

    public c0(boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @NotNull List<y> list, @Nullable String str3, @NotNull List<v> list2, @NotNull String str4) {
        this.f36677a = z10;
        this.f36678b = z11;
        this.f36679c = str;
        this.f36680d = str2;
        this.f36681e = list;
        this.f36682f = str3;
        this.f36683g = list2;
        this.f36684h = str4;
    }

    @Nullable
    public final String a() {
        return this.f36679c;
    }

    @NotNull
    public final List<v> b() {
        return this.f36683g;
    }

    @Nullable
    public final String c() {
        return this.f36682f;
    }

    @NotNull
    public final List<y> d() {
        return this.f36681e;
    }

    @NotNull
    public final String e() {
        return this.f36684h;
    }

    @Nullable
    public final String f() {
        return this.f36680d;
    }

    public final boolean g() {
        return this.f36677a;
    }

    public final boolean h() {
        return this.f36678b;
    }
}
