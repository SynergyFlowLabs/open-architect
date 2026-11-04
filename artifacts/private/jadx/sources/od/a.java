package od;

import com.planner5d.library.model.a0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C2347a f333624e = new C2347a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f333625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a0 f333626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f333627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f333628d;

    /* JADX INFO: renamed from: od.a$a, reason: collision with other inner class name */
    public static final class C2347a {
        public /* synthetic */ C2347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer b(int i10) {
            if (i10 == 0) {
                return Integer.valueOf(b.h.Wd);
            }
            if (i10 == 1) {
                return Integer.valueOf(b.h.Ud);
            }
            if (i10 == 2) {
                return Integer.valueOf(b.h.K3);
            }
            if (i10 == 5) {
                return Integer.valueOf(b.h.Yf);
            }
            if (i10 == 9) {
                return Integer.valueOf(b.h.J3);
            }
            if (i10 != 11) {
                return null;
            }
            return Integer.valueOf(b.h.f324965i4);
        }

        @NotNull
        public final a a(@NotNull JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            int i10 = json.getInt(r.id.f224891a);
            return new a(i10, new a0(json, r.title.f224891a), b(i10), k1.b(json, r.usedInAiDesignGenerator.f224891a));
        }

        @Nullable
        public final String c(@Nullable Integer num) {
            if (num != null && num.intValue() == 9) {
                return "bathroom";
            }
            if (num != null && num.intValue() == 2) {
                return "bedroom";
            }
            if (num != null && num.intValue() == 0) {
                return "living_room";
            }
            if (num != null && num.intValue() == 1) {
                return "kitchen";
            }
            if (num != null && num.intValue() == 11) {
                return "child_room";
            }
            if (num != null && num.intValue() == 5) {
                return "office";
            }
            return null;
        }

        private C2347a() {
        }
    }

    public a(int i10, @NotNull a0 title, @Nullable Integer num, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f333625a = i10;
        this.f333626b = title;
        this.f333627c = num;
        this.f333628d = z10;
    }

    public static /* synthetic */ a f(a aVar, int i10, a0 a0Var, Integer num, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f333625a;
        }
        if ((i11 & 2) != 0) {
            a0Var = aVar.f333626b;
        }
        if ((i11 & 4) != 0) {
            num = aVar.f333627c;
        }
        if ((i11 & 8) != 0) {
            z10 = aVar.f333628d;
        }
        return aVar.e(i10, a0Var, num, z10);
    }

    public final int a() {
        return this.f333625a;
    }

    @NotNull
    public final a0 b() {
        return this.f333626b;
    }

    @Nullable
    public final Integer c() {
        return this.f333627c;
    }

    public final boolean d() {
        return this.f333628d;
    }

    @NotNull
    public final a e(int i10, @NotNull a0 title, @Nullable Integer num, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new a(i10, title, num, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f333625a == aVar.f333625a && Intrinsics.areEqual(this.f333626b, aVar.f333626b) && Intrinsics.areEqual(this.f333627c, aVar.f333627c) && this.f333628d == aVar.f333628d;
    }

    public final int g() {
        return this.f333625a;
    }

    @Nullable
    public final Integer h() {
        return this.f333627c;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f333625a) * 31) + this.f333626b.hashCode()) * 31;
        Integer num = this.f333627c;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f333628d);
    }

    @NotNull
    public final a0 i() {
        return this.f333626b;
    }

    public final boolean j() {
        return this.f333628d;
    }

    @NotNull
    public String toString() {
        return "RoomType(id=" + this.f333625a + ", title=" + this.f333626b + ", image=" + this.f333627c + ", usedInAiDesignGenerator=" + this.f333628d + ")";
    }
}
