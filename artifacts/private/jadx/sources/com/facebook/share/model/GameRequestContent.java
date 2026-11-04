package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class GameRequestContent implements ShareModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f101914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f101915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<String> f101916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f101917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f101918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final a f101919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f101920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final e f101921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final List<String> f101922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f101913j = new d(null);

    @f
    @NotNull
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new c();

    public enum a {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    public static final class b implements com.facebook.share.model.a<GameRequestContent, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f101928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f101929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private List<String> f101930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f101931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f101932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private a f101933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f101934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private e f101935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private List<String> f101936i;

        public final void A(@Nullable List<String> list) {
            this.f101930c = list;
        }

        @NotNull
        public final b B(@Nullable List<String> list) {
            this.f101936i = list;
            return this;
        }

        public final void C(@Nullable List<String> list) {
            this.f101936i = list;
        }

        @NotNull
        public final b D(@Nullable String str) {
            this.f101932e = str;
            return this;
        }

        public final void E(@Nullable String str) {
            this.f101932e = str;
        }

        @l(message = "Replaced by {@link #setRecipients(List)}")
        @NotNull
        public final b F(@Nullable String str) {
            if (str != null) {
                this.f101930c = CollectionsKt.toList(StringsKt.T4(str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, null));
            }
            return this;
        }

        @Override // v5.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent build() {
            return new GameRequestContent(this, null);
        }

        @Nullable
        public final a c() {
            return this.f101933f;
        }

        @Nullable
        public final String d() {
            return this.f101929b;
        }

        @Nullable
        public final String e() {
            return this.f101931d;
        }

        @Nullable
        public final e f() {
            return this.f101935h;
        }

        @Nullable
        public final String g() {
            return this.f101928a;
        }

        @Nullable
        public final String h() {
            return this.f101934g;
        }

        @Nullable
        public final List<String> i() {
            return this.f101930c;
        }

        @Nullable
        public final List<String> j() {
            return this.f101936i;
        }

        @Nullable
        public final String k() {
            return this.f101932e;
        }

        @Override // com.facebook.share.model.a
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b a(@Nullable GameRequestContent gameRequestContent) {
            return gameRequestContent == null ? this : v(gameRequestContent.f()).p(gameRequestContent.b()).z(gameRequestContent.h()).D(gameRequestContent.j()).r(gameRequestContent.c()).n(gameRequestContent.a()).x(gameRequestContent.g()).t(gameRequestContent.e()).B(gameRequestContent.i());
        }

        @NotNull
        public final b m(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return a((GameRequestContent) parcel.readParcelable(GameRequestContent.class.getClassLoader()));
        }

        @NotNull
        public final b n(@Nullable a aVar) {
            this.f101933f = aVar;
            return this;
        }

        public final void o(@Nullable a aVar) {
            this.f101933f = aVar;
        }

        @NotNull
        public final b p(@Nullable String str) {
            this.f101929b = str;
            return this;
        }

        public final void q(@Nullable String str) {
            this.f101929b = str;
        }

        @NotNull
        public final b r(@Nullable String str) {
            this.f101931d = str;
            return this;
        }

        public final void s(@Nullable String str) {
            this.f101931d = str;
        }

        @NotNull
        public final b t(@Nullable e eVar) {
            this.f101935h = eVar;
            return this;
        }

        public final void u(@Nullable e eVar) {
            this.f101935h = eVar;
        }

        @NotNull
        public final b v(@Nullable String str) {
            this.f101928a = str;
            return this;
        }

        public final void w(@Nullable String str) {
            this.f101928a = str;
        }

        @NotNull
        public final b x(@Nullable String str) {
            this.f101934g = str;
            return this;
        }

        public final void y(@Nullable String str) {
            this.f101934g = str;
        }

        @NotNull
        public final b z(@Nullable List<String> list) {
            this.f101930c = list;
            return this;
        }
    }

    public static final class c implements Parcelable.Creator<GameRequestContent> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int i10) {
            return new GameRequestContent[i10];
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public enum e {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            e[] eVarArrValuesCustom = values();
            return (e[]) Arrays.copyOf(eVarArrValuesCustom, eVarArrValuesCustom.length);
        }
    }

    public /* synthetic */ GameRequestContent(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Nullable
    public final a a() {
        return this.f101919f;
    }

    @Nullable
    public final String b() {
        return this.f101915b;
    }

    @Nullable
    public final String c() {
        return this.f101918e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final e e() {
        return this.f101921h;
    }

    @Nullable
    public final String f() {
        return this.f101914a;
    }

    @Nullable
    public final String g() {
        return this.f101920g;
    }

    @Nullable
    public final List<String> h() {
        return this.f101916c;
    }

    @Nullable
    public final List<String> i() {
        return this.f101922i;
    }

    @Nullable
    public final String j() {
        return this.f101917d;
    }

    @l(message = "Replaced by [getRecipients()]", replaceWith = @b1(expression = "getRecipients", imports = {}))
    @Nullable
    public final String k() {
        List<String> list = this.f101916c;
        if (list != null) {
            return TextUtils.join(",", list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f101914a);
        out.writeString(this.f101915b);
        out.writeStringList(this.f101916c);
        out.writeString(this.f101917d);
        out.writeString(this.f101918e);
        out.writeSerializable(this.f101919f);
        out.writeString(this.f101920g);
        out.writeSerializable(this.f101921h);
        out.writeStringList(this.f101922i);
    }

    private GameRequestContent(b bVar) {
        this.f101914a = bVar.g();
        this.f101915b = bVar.d();
        this.f101916c = bVar.i();
        this.f101917d = bVar.k();
        this.f101918e = bVar.e();
        this.f101919f = bVar.c();
        this.f101920g = bVar.h();
        this.f101921h = bVar.f();
        this.f101922i = bVar.j();
    }

    public GameRequestContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f101914a = parcel.readString();
        this.f101915b = parcel.readString();
        this.f101916c = parcel.createStringArrayList();
        this.f101917d = parcel.readString();
        this.f101918e = parcel.readString();
        this.f101919f = (a) parcel.readSerializable();
        this.f101920g = parcel.readString();
        this.f101921h = (e) parcel.readSerializable();
        this.f101922i = parcel.createStringArrayList();
    }
}
