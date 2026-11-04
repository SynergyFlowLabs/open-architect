package com.planner5d.library.database.model.spaces.documents;

import android.os.Bundle;
import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import com.planner5d.library.database.model.g;
import com.planner5d.library.database.model.j;
import com.planner5d.library.services.r;
import java.util.Date;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@u(tableName = "document_folder")
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(defaultValue = "", name = "hash")
    @u0
    @NotNull
    private String f154234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(name = "parent_hash")
    @Nullable
    private String f154235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "space_hash")
    @Nullable
    private String f154236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i(name = "name")
    @Nullable
    private String f154237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i(name = "tags")
    @Nullable
    private List<String> f154238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @i(name = "date_created")
    @Nullable
    private Date f154239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @i(name = "date_updated")
    @Nullable
    private Date f154240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final f0 f154241h;

    public enum a {
        colorPurple(r.colorPurple.f224891a),
        colorBlue(r.colorBlue.f224891a),
        colorGreen(r.colorGreen.f224891a),
        colorPink(r.colorPink.f224891a),
        colorYellow(r.colorYellow.f224891a),
        unsorted(r.unsorted.f224891a),
        builtIn(r.builtin.f224891a);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f154250j = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f154251a;

        a(String str) {
            this.f154251a = str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f154250j;
        }

        @NotNull
        public final String n() {
            return this.f154251a;
        }
    }

    public c() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(c cVar) {
        List<String> list = cVar.f154238e;
        return list != null && list.contains(a.unsorted.n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c l(c cVar, String str, String str2, String str3, String str4, List list, Date date, Date date2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f154234a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f154235b;
        }
        if ((i10 & 4) != 0) {
            str3 = cVar.f154236c;
        }
        if ((i10 & 8) != 0) {
            str4 = cVar.f154237d;
        }
        if ((i10 & 16) != 0) {
            list = cVar.f154238e;
        }
        if ((i10 & 32) != 0) {
            date = cVar.f154239f;
        }
        if ((i10 & 64) != 0) {
            date2 = cVar.f154240g;
        }
        Date date3 = date;
        Date date4 = date2;
        List list2 = list;
        String str5 = str3;
        return cVar.k(str, str2, str5, str4, list2, date3, date4);
    }

    public final void A(@Nullable String str) {
        this.f154236c = str;
    }

    public final void B(@Nullable List<String> list) {
        this.f154238e = list;
    }

    @Override // com.planner5d.library.database.model.j
    @NotNull
    public Bundle b() {
        return new com.planner5d.library.services.utility.i().f(r.type, c()).j(r.spaceHash, this.f154236c).j(r.hash, this.f154234a).a();
    }

    @Override // com.planner5d.library.database.model.j
    public int c() {
        return g.TYPE_DOCUMENTS.n();
    }

    @NotNull
    public final String d() {
        return this.f154234a;
    }

    @Nullable
    public final String e() {
        return this.f154235b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f154234a, cVar.f154234a) && Intrinsics.areEqual(this.f154235b, cVar.f154235b) && Intrinsics.areEqual(this.f154236c, cVar.f154236c) && Intrinsics.areEqual(this.f154237d, cVar.f154237d) && Intrinsics.areEqual(this.f154238e, cVar.f154238e) && Intrinsics.areEqual(this.f154239f, cVar.f154239f) && Intrinsics.areEqual(this.f154240g, cVar.f154240g);
    }

    @Nullable
    public final String f() {
        return this.f154236c;
    }

    @Nullable
    public final String g() {
        return this.f154237d;
    }

    @Override // com.planner5d.library.database.model.j
    @Nullable
    public String getTitle() {
        return this.f154237d;
    }

    @Nullable
    public final List<String> h() {
        return this.f154238e;
    }

    public int hashCode() {
        int iHashCode = this.f154234a.hashCode() * 31;
        String str = this.f154235b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154236c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154237d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f154238e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Date date = this.f154239f;
        int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f154240g;
        return iHashCode6 + (date2 != null ? date2.hashCode() : 0);
    }

    @Nullable
    public final Date i() {
        return this.f154239f;
    }

    @Nullable
    public final Date j() {
        return this.f154240g;
    }

    @NotNull
    public final c k(@NotNull String hash, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Date date, @Nullable Date date2) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new c(hash, str, str2, str3, list, date, date2);
    }

    @Override // com.planner5d.library.database.model.j
    @Nullable
    public Date m() {
        return this.f154240g;
    }

    @Nullable
    public final Date n() {
        return this.f154239f;
    }

    @Nullable
    public final Date o() {
        return this.f154240g;
    }

    @NotNull
    public final String p() {
        return this.f154234a;
    }

    @Nullable
    public final String q() {
        return this.f154237d;
    }

    @Nullable
    public final String r() {
        return this.f154235b;
    }

    @Nullable
    public final String s() {
        return this.f154236c;
    }

    @Nullable
    public final List<String> t() {
        return this.f154238e;
    }

    @NotNull
    public String toString() {
        return "DocumentFolder(hash=" + this.f154234a + ", parentHash=" + this.f154235b + ", spaceHash=" + this.f154236c + ", name=" + this.f154237d + ", tags=" + this.f154238e + ", dateCreated=" + this.f154239f + ", dateUpdated=" + this.f154240g + ")";
    }

    public final boolean u() {
        return ((Boolean) this.f154241h.getValue()).booleanValue();
    }

    public final void v(@Nullable Date date) {
        this.f154239f = date;
    }

    public final void w(@Nullable Date date) {
        this.f154240g = date;
    }

    public final void x(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f154234a = str;
    }

    public final void y(@Nullable String str) {
        this.f154237d = str;
    }

    public final void z(@Nullable String str) {
        this.f154235b = str;
    }

    public c(@NotNull String hash, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Date date, @Nullable Date date2) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f154234a = hash;
        this.f154235b = str;
        this.f154236c = str2;
        this.f154237d = str3;
        this.f154238e = list;
        this.f154239f = date;
        this.f154240g = date2;
        this.f154241h = g0.c(new Function0() { // from class: com.planner5d.library.database.model.spaces.documents.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(c.C(this.f154233a));
            }
        });
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, List list, Date date, Date date2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : date, (i10 & 64) != 0 ? null : date2);
    }
}
