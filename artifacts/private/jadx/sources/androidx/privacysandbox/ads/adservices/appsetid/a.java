package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAppSetId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetId.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0701a f73469c = new C0701a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73470d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f73471e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73473b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.a$a, reason: collision with other inner class name */
    public static final class C0701a {
        public /* synthetic */ C0701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0701a() {
        }
    }

    public a(@NotNull String id2, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f73472a = id2;
        this.f73473b = i10;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    @NotNull
    public final String a() {
        return this.f73472a;
    }

    public final int b() {
        return this.f73473b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f73472a, aVar.f73472a) && this.f73473b == aVar.f73473b;
    }

    public int hashCode() {
        return (this.f73472a.hashCode() * 31) + Integer.hashCode(this.f73473b);
    }

    @NotNull
    public String toString() {
        return "AppSetId: id=" + this.f73472a + ", scope=" + (this.f73473b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
