package androidx.compose.ui.platform;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v3 implements androidx.compose.ui.node.y1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f40909g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<v3> f40911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Float f40912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Float f40913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.semantics.l f40914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.semantics.l f40915f;

    public v3(int i10, @NotNull List<v3> list, @Nullable Float f10, @Nullable Float f11, @Nullable androidx.compose.ui.semantics.l lVar, @Nullable androidx.compose.ui.semantics.l lVar2) {
        this.f40910a = i10;
        this.f40911b = list;
        this.f40912c = f10;
        this.f40913d = f11;
        this.f40914e = lVar;
        this.f40915f = lVar2;
    }

    @Override // androidx.compose.ui.node.y1
    public boolean H2() {
        return this.f40911b.contains(this);
    }

    @NotNull
    public final List<v3> a() {
        return this.f40911b;
    }

    @Nullable
    public final androidx.compose.ui.semantics.l b() {
        return this.f40914e;
    }

    @Nullable
    public final Float c() {
        return this.f40912c;
    }

    @Nullable
    public final Float d() {
        return this.f40913d;
    }

    public final int e() {
        return this.f40910a;
    }

    @Nullable
    public final androidx.compose.ui.semantics.l f() {
        return this.f40915f;
    }

    public final void g(@Nullable androidx.compose.ui.semantics.l lVar) {
        this.f40914e = lVar;
    }

    public final void h(@Nullable Float f10) {
        this.f40912c = f10;
    }

    public final void i(@Nullable Float f10) {
        this.f40913d = f10;
    }

    public final void j(@Nullable androidx.compose.ui.semantics.l lVar) {
        this.f40915f = lVar;
    }
}
