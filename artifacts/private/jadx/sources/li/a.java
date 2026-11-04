package li;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f322682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f322683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f322684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f322685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f322686e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a() {
        this(null, null, null, null, null, 31, null);
        int i10 = (7 | 0) << 0;
    }

    public static /* synthetic */ a i(a aVar, String str, String str2, String str3, Long l10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f322682a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f322683b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f322684c;
        }
        if ((i10 & 8) != 0) {
            l10 = aVar.f322685d;
        }
        if ((i10 & 16) != 0) {
            str4 = aVar.f322686e;
        }
        String str5 = str4;
        String str6 = str3;
        return aVar.h(str, str2, str6, l10, str5);
    }

    @Override // li.c
    @Nullable
    public Long a() {
        return this.f322685d;
    }

    @Override // li.c
    @Nullable
    public String b() {
        return this.f322686e;
    }

    @Nullable
    public final String c() {
        return this.f322682a;
    }

    @Nullable
    public final String d() {
        return this.f322683b;
    }

    @Nullable
    public final String e() {
        return this.f322684c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f322682a, aVar.f322682a) && Intrinsics.areEqual(this.f322683b, aVar.f322683b) && Intrinsics.areEqual(this.f322684c, aVar.f322684c) && Intrinsics.areEqual(this.f322685d, aVar.f322685d) && Intrinsics.areEqual(this.f322686e, aVar.f322686e);
    }

    @Nullable
    public final Long f() {
        return this.f322685d;
    }

    @Nullable
    public final String g() {
        return this.f322686e;
    }

    @Override // li.c
    @Nullable
    public String getEvent() {
        return this.f322683b;
    }

    @Override // li.c
    @Nullable
    public String getId() {
        return this.f322684c;
    }

    @NotNull
    public final a h(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable String str4) {
        return new a(str, str2, str3, l10, str4);
    }

    public int hashCode() {
        String str = this.f322682a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f322683b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f322684c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f322685d;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.f322686e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // li.c
    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String getData() {
        return this.f322682a;
    }

    @NotNull
    public String toString() {
        return b.c(getData(), getEvent(), getId(), a(), b());
    }

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable String str4) {
        this.f322682a = str;
        this.f322683b = str2;
        this.f322684c = str3;
        this.f322685d = l10;
        this.f322686e = str4;
    }

    public /* synthetic */ a(String str, String str2, String str3, Long l10, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : str4);
    }
}
