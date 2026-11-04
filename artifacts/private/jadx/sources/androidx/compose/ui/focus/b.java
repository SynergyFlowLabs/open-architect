package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37386c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37388b;

    public /* synthetic */ b(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @Override // androidx.compose.ui.focus.g
    public void a() {
        this.f37388b = true;
    }

    @Override // androidx.compose.ui.focus.g
    public int c() {
        return this.f37387a;
    }

    public final boolean d() {
        return this.f37388b;
    }

    private b(int i10) {
        this.f37387a = i10;
    }
}
