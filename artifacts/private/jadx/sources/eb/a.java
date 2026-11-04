package eb;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public final class a implements m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f274734i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f274735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f274736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f274737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f274738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Integer f274739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Integer f274740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f274741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f274742h;

    public a(boolean z10, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4) {
        this.f274735a = z10;
        this.f274736b = str;
        this.f274737c = str2;
        this.f274738d = num;
        this.f274739e = num2;
        this.f274740f = num3;
        this.f274741g = str3;
        this.f274742h = str4;
    }

    public static /* synthetic */ a j(a aVar, boolean z10, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f274735a;
        }
        if ((i10 & 2) != 0) {
            str = aVar.f274736b;
        }
        if ((i10 & 4) != 0) {
            str2 = aVar.f274737c;
        }
        if ((i10 & 8) != 0) {
            num = aVar.f274738d;
        }
        if ((i10 & 16) != 0) {
            num2 = aVar.f274739e;
        }
        if ((i10 & 32) != 0) {
            num3 = aVar.f274740f;
        }
        if ((i10 & 64) != 0) {
            str3 = aVar.f274741g;
        }
        if ((i10 & 128) != 0) {
            str4 = aVar.f274742h;
        }
        String str5 = str3;
        String str6 = str4;
        Integer num4 = num2;
        Integer num5 = num3;
        return aVar.i(z10, str, str2, num, num4, num5, str5, str6);
    }

    @Override // com.planner5d.library.model.m
    @Nullable
    public String E0() {
        return this.f274742h;
    }

    public final boolean a() {
        return this.f274735a;
    }

    @Nullable
    public final String b() {
        return this.f274736b;
    }

    @Nullable
    public final String c() {
        return this.f274737c;
    }

    @Nullable
    public final Integer d() {
        return this.f274738d;
    }

    @Nullable
    public final Integer e() {
        return this.f274739e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f274735a == aVar.f274735a && Intrinsics.areEqual(this.f274736b, aVar.f274736b) && Intrinsics.areEqual(this.f274737c, aVar.f274737c) && Intrinsics.areEqual(this.f274738d, aVar.f274738d) && Intrinsics.areEqual(this.f274739e, aVar.f274739e) && Intrinsics.areEqual(this.f274740f, aVar.f274740f) && Intrinsics.areEqual(this.f274741g, aVar.f274741g) && Intrinsics.areEqual(this.f274742h, aVar.f274742h);
    }

    @Nullable
    public final Integer f() {
        return this.f274740f;
    }

    @Nullable
    public final String g() {
        return this.f274741g;
    }

    @Nullable
    public final String h() {
        return this.f274742h;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274735a) * 31;
        String str = this.f274736b;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f274737c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f274738d;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f274739e;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f274740f;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f274741g;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f274742h;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return iHashCode8 + iHashCode2;
    }

    @NotNull
    public final a i(boolean z10, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @Nullable String str4) {
        return new a(z10, str, str2, num, num2, num3, str3, str4);
    }

    public final boolean k() {
        return this.f274735a;
    }

    @Nullable
    public final String l() {
        return this.f274741g;
    }

    @Nullable
    public final String m() {
        return this.f274736b;
    }

    @Nullable
    public final Integer n() {
        return this.f274738d;
    }

    @Nullable
    public final Integer o() {
        return this.f274739e;
    }

    @Nullable
    public final Integer p() {
        return this.f274740f;
    }

    @Nullable
    public final String q() {
        return this.f274737c;
    }

    @NotNull
    public String toString() {
        return "ContestParticipant(fromCurrentUser=" + this.f274735a + ", name=" + this.f274736b + ", userPicUrl=" + this.f274737c + ", place=" + this.f274738d + ", rate=" + this.f274739e + ", rateRatio=" + this.f274740f + ", image=" + this.f274741g + ", imageUrl=" + this.f274742h + ")";
    }

    public /* synthetic */ a(boolean z10, String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, str, str2, num, num2, num3, str3, (i10 & 128) != 0 ? str3 : str4);
    }
}
