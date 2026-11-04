package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73684b;

    @SourceDebugExtension({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f73685a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f73686b = true;

        @NotNull
        public final b a() {
            return new b(this.f73685a, this.f73686b);
        }

        @NotNull
        public final a b(@NotNull String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f73685a = adsSdkName;
            return this;
        }

        @NotNull
        public final a c(boolean z10) {
            this.f73686b = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.f73683a;
    }

    @oj.i(name = "shouldRecordObservation")
    public final boolean b() {
        return this.f73684b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f73683a, bVar.f73683a) && this.f73684b == bVar.f73684b;
    }

    public int hashCode() {
        return (this.f73683a.hashCode() * 31) + Boolean.hashCode(this.f73684b);
    }

    @NotNull
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f73683a + ", shouldRecordObservation=" + this.f73684b;
    }

    public b(@NotNull String adsSdkName, boolean z10) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f73683a = adsSdkName;
        this.f73684b = z10;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
