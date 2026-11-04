package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends a<M, B>> implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Uri f101948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f101949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f101950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f101951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f101952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final ShareHashtag f101953f;

    public static abstract class a<M extends ShareContent<M, B>, B extends a<M, B>> implements com.facebook.share.model.a<M, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Uri f101954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private List<String> f101955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f101956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f101957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f101958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private ShareHashtag f101959f;

        @Nullable
        public final Uri b() {
            return this.f101954a;
        }

        @Nullable
        public final ShareHashtag c() {
            return this.f101959f;
        }

        @Nullable
        public final String d() {
            return this.f101957d;
        }

        @Nullable
        public final List<String> e() {
            return this.f101955b;
        }

        @Nullable
        public final String f() {
            return this.f101956c;
        }

        @Nullable
        public final String g() {
            return this.f101958e;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public B a(@Nullable M m10) {
            return m10 == null ? this : (B) i(m10.a()).n(m10.c()).p(m10.e()).l(m10.b()).r(m10.f()).t(m10.g());
        }

        @NotNull
        public final B i(@Nullable Uri uri) {
            this.f101954a = uri;
            return this;
        }

        public final void j(@Nullable Uri uri) {
            this.f101954a = uri;
        }

        public final void k(@Nullable ShareHashtag shareHashtag) {
            this.f101959f = shareHashtag;
        }

        @NotNull
        public final B l(@Nullable String str) {
            this.f101957d = str;
            return this;
        }

        public final void m(@Nullable String str) {
            this.f101957d = str;
        }

        @NotNull
        public final B n(@Nullable List<String> list) {
            this.f101955b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public final void o(@Nullable List<String> list) {
            this.f101955b = list;
        }

        @NotNull
        public final B p(@Nullable String str) {
            this.f101956c = str;
            return this;
        }

        public final void q(@Nullable String str) {
            this.f101956c = str;
        }

        @NotNull
        public final B r(@Nullable String str) {
            this.f101958e = str;
            return this;
        }

        public final void s(@Nullable String str) {
            this.f101958e = str;
        }

        @NotNull
        public final B t(@Nullable ShareHashtag shareHashtag) {
            this.f101959f = shareHashtag;
            return this;
        }
    }

    protected ShareContent(@NotNull a<M, B> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f101948a = builder.b();
        this.f101949b = builder.e();
        this.f101950c = builder.f();
        this.f101951d = builder.d();
        this.f101952e = builder.g();
        this.f101953f = builder.c();
    }

    private final List<String> h(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public final Uri a() {
        return this.f101948a;
    }

    @Nullable
    public final String b() {
        return this.f101951d;
    }

    @Nullable
    public final List<String> c() {
        return this.f101949b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.f101950c;
    }

    @Nullable
    public final String f() {
        return this.f101952e;
    }

    @Nullable
    public final ShareHashtag g() {
        return this.f101953f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f101948a, 0);
        out.writeStringList(this.f101949b);
        out.writeString(this.f101950c);
        out.writeString(this.f101951d);
        out.writeString(this.f101952e);
        out.writeParcelable(this.f101953f, 0);
    }

    protected ShareContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101948a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f101949b = h(parcel);
        this.f101950c = parcel.readString();
        this.f101951d = parcel.readString();
        this.f101952e = parcel.readString();
        this.f101953f = new ShareHashtag.a().e(parcel).build();
    }
}
