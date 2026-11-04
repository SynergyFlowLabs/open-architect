package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class l4 implements kotlin.f0<Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f16206d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16207e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Integer> f16208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16210c = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l4(@NotNull Function0<Integer> function0, @NotNull String str) {
        this.f16208a = function0;
        this.f16209b = str;
    }

    @Override // kotlin.f0
    public boolean Z() {
        if (this.f16210c == -1) {
            return false;
        }
        int i10 = 0 << 1;
        return true;
    }

    @NotNull
    public final String a() {
        return this.f16209b;
    }

    @NotNull
    public final Function0<Integer> b() {
        return this.f16208a;
    }

    @Override // kotlin.f0
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        if (this.f16210c == -1) {
            this.f16210c = this.f16208a.invoke().intValue();
        }
        int i10 = this.f16210c;
        if (i10 != -1) {
            return Integer.valueOf(i10);
        }
        throw new IllegalStateException(this.f16209b);
    }

    @NotNull
    public String toString() {
        return Z() ? String.valueOf(getValue().intValue()) : this.f16209b;
    }
}
