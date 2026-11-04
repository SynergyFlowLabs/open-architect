package jc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements yc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f307419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f307420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f307421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f307422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f307423f;

    public e(@NotNull String author, @NotNull String title, @NotNull String imageUrl, @NotNull String avatarUrl, @NotNull String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f307418a = author;
        this.f307419b = title;
        this.f307420c = imageUrl;
        this.f307421d = avatarUrl;
        this.f307422e = id2;
        this.f307423f = z10;
    }

    public static /* synthetic */ e h(e eVar, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.f307418a;
        }
        if ((i10 & 2) != 0) {
            str2 = eVar.f307419b;
        }
        if ((i10 & 4) != 0) {
            str3 = eVar.f307420c;
        }
        if ((i10 & 8) != 0) {
            str4 = eVar.f307421d;
        }
        if ((i10 & 16) != 0) {
            str5 = eVar.f307422e;
        }
        if ((i10 & 32) != 0) {
            z10 = eVar.f307423f;
        }
        String str6 = str5;
        boolean z11 = z10;
        return eVar.g(str, str2, str3, str4, str6, z11);
    }

    @NotNull
    public final String a() {
        return this.f307418a;
    }

    @NotNull
    public final String b() {
        return this.f307419b;
    }

    @NotNull
    public final String c() {
        return this.f307420c;
    }

    @NotNull
    public final String d() {
        return this.f307421d;
    }

    @NotNull
    public final String e() {
        return this.f307422e;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.f307418a, eVar.f307418a) && Intrinsics.areEqual(this.f307419b, eVar.f307419b) && Intrinsics.areEqual(this.f307420c, eVar.f307420c) && Intrinsics.areEqual(this.f307421d, eVar.f307421d) && Intrinsics.areEqual(this.f307422e, eVar.f307422e) && this.f307423f == eVar.f307423f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f307423f;
    }

    @NotNull
    public final e g(@NotNull String author, @NotNull String title, @NotNull String imageUrl, @NotNull String avatarUrl, @NotNull String id2, boolean z10) {
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new e(author, title, imageUrl, avatarUrl, id2, z10);
    }

    public int hashCode() {
        return (((((((((this.f307418a.hashCode() * 31) + this.f307419b.hashCode()) * 31) + this.f307420c.hashCode()) * 31) + this.f307421d.hashCode()) * 31) + this.f307422e.hashCode()) * 31) + Boolean.hashCode(this.f307423f);
    }

    @NotNull
    public final String i() {
        return this.f307418a;
    }

    @NotNull
    public final String j() {
        return this.f307421d;
    }

    public final boolean k() {
        return this.f307423f;
    }

    @NotNull
    public final String l() {
        return this.f307422e;
    }

    @NotNull
    public final String m() {
        return this.f307420c;
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        return equals(obj);
    }

    @NotNull
    public final String o() {
        return this.f307419b;
    }

    @NotNull
    public String toString() {
        return "DesignOfTheDayListItem(author=" + this.f307418a + ", title=" + this.f307419b + ", imageUrl=" + this.f307420c + ", avatarUrl=" + this.f307421d + ", id=" + this.f307422e + ", favorite=" + this.f307423f + ")";
    }
}
