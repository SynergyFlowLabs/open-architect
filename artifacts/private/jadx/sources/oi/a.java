package oi;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2349a f333633b = new C2349a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333634a;

    /* JADX INFO: renamed from: oi.a$a, reason: collision with other inner class name */
    public static final class C2349a implements CoroutineContext.b<a> {
        public /* synthetic */ C2349a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2349a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String pluginName) {
        super(f333633b);
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.f333634a = pluginName;
    }

    public static /* synthetic */ a N(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f333634a;
        }
        return aVar.j(str);
    }

    @NotNull
    public final String T() {
        return this.f333634a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f333634a, ((a) obj).f333634a);
    }

    @NotNull
    public final String h() {
        return this.f333634a;
    }

    public int hashCode() {
        return this.f333634a.hashCode();
    }

    @NotNull
    public final a j(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return new a(pluginName);
    }

    @NotNull
    public String toString() {
        return "PluginName(" + this.f333634a + ')';
    }
}
