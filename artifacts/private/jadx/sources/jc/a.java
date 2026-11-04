package jc;

import androidx.room.i;
import androidx.room.u;
import androidx.room.u0;
import com.rabbitmq.client.r;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@u(tableName = "blog_posts")
public final class a implements yc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @i(index = true, name = "id")
    @u0(autoGenerate = false)
    private int f307380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @i(name = "category_id")
    @Nullable
    private Integer f307381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @i(name = "title")
    @Nullable
    private String f307382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @i(name = "image_uri")
    @Nullable
    private String f307383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @i(name = "thumbnail_image_uri")
    @Nullable
    private String f307384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @i(name = "announcement")
    @Nullable
    private String f307385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @i(name = "content_uri")
    @Nullable
    private String f307386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @i(name = "video_uri")
    @Nullable
    private String f307387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @i(name = "public_uri")
    @Nullable
    private String f307388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @i(name = "ghost_uri")
    @Nullable
    private String f307389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @i(name = "created_at")
    @Nullable
    private String f307390k;

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    public enum EnumC2240a {
        id,
        categoryId,
        title,
        imageUri,
        thumbnailImageUri,
        announcement,
        contentUri,
        videoUri,
        publicUri,
        ghostUri,
        createdAt;


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f307403m = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<EnumC2240a> l() {
            return f307403m;
        }
    }

    public a() {
        this(0, null, null, null, null, null, null, null, null, null, null, r.f265987x3, null);
    }

    @Nullable
    public final String a() {
        return this.f307385f;
    }

    @Nullable
    public final Integer b() {
        return this.f307381b;
    }

    @Nullable
    public final String c() {
        return this.f307386g;
    }

    @Nullable
    public final String d() {
        return this.f307390k;
    }

    @Nullable
    public final String e() {
        return this.f307389j;
    }

    @Override // yc.b
    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (this.f307380a == aVar.f307380a && Intrinsics.areEqual(this.f307381b, aVar.f307381b) && Intrinsics.areEqual(this.f307382c, aVar.f307382c) && Intrinsics.areEqual(this.f307383d, aVar.f307383d) && Intrinsics.areEqual(this.f307384e, aVar.f307384e) && Intrinsics.areEqual(this.f307385f, aVar.f307385f) && Intrinsics.areEqual(this.f307386g, aVar.f307386g) && Intrinsics.areEqual(this.f307387h, aVar.f307387h) && Intrinsics.areEqual(this.f307388i, aVar.f307388i) && Intrinsics.areEqual(this.f307389j, aVar.f307389j) && Intrinsics.areEqual(this.f307390k, aVar.f307390k)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f307380a;
    }

    @Nullable
    public final String g() {
        return this.f307383d;
    }

    @Nullable
    public final String h() {
        return this.f307388i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f307380a), this.f307381b, this.f307382c, this.f307383d, this.f307384e, this.f307385f, this.f307386g, this.f307387h, this.f307388i, this.f307389j, this.f307390k);
    }

    @Nullable
    public final String i() {
        return this.f307384e;
    }

    @Nullable
    public final String j() {
        return this.f307382c;
    }

    @Nullable
    public final String k() {
        return this.f307387h;
    }

    public final void l(@Nullable String str) {
        this.f307385f = str;
    }

    public final void m(@Nullable Integer num) {
        this.f307381b = num;
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        int i10 = this.f307380a;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.planner5d.library.feed.model.BlogPost");
        return i10 == ((a) obj).f307380a;
    }

    public final void o(@Nullable String str) {
        this.f307386g = str;
    }

    public final void p(@Nullable String str) {
        this.f307390k = str;
    }

    public final void q(@Nullable String str) {
        this.f307389j = str;
    }

    public final void r(int i10) {
        this.f307380a = i10;
    }

    public final void s(@Nullable String str) {
        this.f307383d = str;
    }

    public final void t(@Nullable String str) {
        this.f307388i = str;
    }

    public final void u(@Nullable String str) {
        this.f307384e = str;
    }

    public final void v(@Nullable String str) {
        this.f307382c = str;
    }

    public final void w(@Nullable String str) {
        this.f307387h = str;
    }

    public a(int i10, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f307380a = i10;
        this.f307381b = num;
        this.f307382c = str;
        this.f307383d = str2;
        this.f307384e = str3;
        this.f307385f = str4;
        this.f307386g = str5;
        this.f307387h = str6;
        this.f307388i = str7;
        this.f307389j = str8;
        this.f307390k = str9;
    }

    public /* synthetic */ a(int i10, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9);
    }
}
