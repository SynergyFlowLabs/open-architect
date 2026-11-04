package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48648b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48649c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48650d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48651e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48652f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48653g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48654h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final g f48655a;

    @androidx.annotation.w0(31)
    private static final class a {
        private a() {
        }

        @NonNull
        public static Pair<ContentInfo, ContentInfo> a(@NonNull ContentInfo contentInfo, @NonNull final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = zTest ? contentInfo : null;
                if (zTest) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> pairH = e.h(clip, new androidx.core.util.z() { // from class: androidx.core.view.d
                @Override // androidx.core.util.z
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (pairH.first == null) {
                return Pair.create(null, contentInfo);
            }
            return pairH.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairH.second).build());
        }
    }

    private interface d {
        void a(@androidx.annotation.p0 Uri uri);

        void b(@NonNull ClipData clipData);

        @NonNull
        e build();

        void c(int i10);

        void setExtras(@androidx.annotation.p0 Bundle bundle);

        void v(int i10);
    }

    @androidx.annotation.w0(31)
    private static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ContentInfo f48663a;

        f(@NonNull ContentInfo contentInfo) {
            this.f48663a = androidx.core.view.c.a(androidx.core.util.t.l(contentInfo));
        }

        @Override // androidx.core.view.e.g
        public int I() {
            return this.f48663a.getFlags();
        }

        @Override // androidx.core.view.e.g
        public int P() {
            return this.f48663a.getSource();
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Uri a() {
            return this.f48663a.getLinkUri();
        }

        @Override // androidx.core.view.e.g
        @NonNull
        public ClipData b() {
            return this.f48663a.getClip();
        }

        @Override // androidx.core.view.e.g
        @NonNull
        public ContentInfo c() {
            return this.f48663a;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Bundle getExtras() {
            return this.f48663a.getExtras();
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.f48663a + "}";
        }
    }

    private interface g {
        int I();

        int P();

        @androidx.annotation.p0
        Uri a();

        @NonNull
        ClipData b();

        @androidx.annotation.p0
        ContentInfo c();

        @androidx.annotation.p0
        Bundle getExtras();
    }

    private static final class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ClipData f48664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final Uri f48667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private final Bundle f48668e;

        h(C0414e c0414e) {
            this.f48664a = (ClipData) androidx.core.util.t.l(c0414e.f48658a);
            this.f48665b = androidx.core.util.t.g(c0414e.f48659b, 0, 5, "source");
            this.f48666c = androidx.core.util.t.k(c0414e.f48660c, 1);
            this.f48667d = c0414e.f48661d;
            this.f48668e = c0414e.f48662e;
        }

        @Override // androidx.core.view.e.g
        public int I() {
            return this.f48666c;
        }

        @Override // androidx.core.view.e.g
        public int P() {
            return this.f48665b;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Uri a() {
            return this.f48667d;
        }

        @Override // androidx.core.view.e.g
        @NonNull
        public ClipData b() {
            return this.f48664a;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.e.g
        @androidx.annotation.p0
        public Bundle getExtras() {
            return this.f48668e;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f48664a.getDescription());
            sb2.append(", source=");
            sb2.append(e.k(this.f48665b));
            sb2.append(", flags=");
            sb2.append(e.b(this.f48666c));
            if (this.f48667d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f48667d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f48668e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    e(@NonNull g gVar) {
        this.f48655a = gVar;
    }

    @NonNull
    static ClipData a(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipData.addItem(list.get(i10));
        }
        return clipData;
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    static String b(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    @NonNull
    static Pair<ClipData, ClipData> h(@NonNull ClipData clipData, @NonNull androidx.core.util.z<ClipData.Item> zVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (zVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        return arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @NonNull
    @androidx.annotation.w0(31)
    public static Pair<ContentInfo, ContentInfo> i(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    static String k(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    @NonNull
    @androidx.annotation.w0(31)
    public static e m(@NonNull ContentInfo contentInfo) {
        return new e(new f(contentInfo));
    }

    @NonNull
    public ClipData c() {
        return this.f48655a.b();
    }

    @androidx.annotation.p0
    public Bundle d() {
        return this.f48655a.getExtras();
    }

    public int e() {
        return this.f48655a.I();
    }

    @androidx.annotation.p0
    public Uri f() {
        return this.f48655a.a();
    }

    public int g() {
        return this.f48655a.P();
    }

    @NonNull
    public Pair<e, e> j(@NonNull androidx.core.util.z<ClipData.Item> zVar) {
        ClipData clipDataB = this.f48655a.b();
        int i10 = 7 | 0;
        if (clipDataB.getItemCount() != 1) {
            Pair<ClipData, ClipData> pairH = h(clipDataB, zVar);
            if (pairH.first == null) {
                return Pair.create(null, this);
            }
            return pairH.second == null ? Pair.create(this, null) : Pair.create(new b(this).b((ClipData) pairH.first).a(), new b(this).b((ClipData) pairH.second).a());
        }
        boolean zTest = zVar.test(clipDataB.getItemAt(0));
        e eVar = zTest ? this : null;
        if (zTest) {
            this = null;
        }
        return Pair.create(eVar, this);
    }

    @NonNull
    @androidx.annotation.w0(31)
    public ContentInfo l() {
        ContentInfo contentInfoC = this.f48655a.c();
        Objects.requireNonNull(contentInfoC);
        return androidx.core.view.c.a(contentInfoC);
    }

    @NonNull
    public String toString() {
        return this.f48655a.toString();
    }

    @androidx.annotation.w0(31)
    private static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ContentInfo.Builder f48657a;

        c(@NonNull ClipData clipData, int i10) {
            this.f48657a = l.a(clipData, i10);
        }

        @Override // androidx.core.view.e.d
        public void a(@androidx.annotation.p0 Uri uri) {
            this.f48657a.setLinkUri(uri);
        }

        @Override // androidx.core.view.e.d
        public void b(@NonNull ClipData clipData) {
            this.f48657a.setClip(clipData);
        }

        @Override // androidx.core.view.e.d
        @NonNull
        public e build() {
            return new e(new f(this.f48657a.build()));
        }

        @Override // androidx.core.view.e.d
        public void c(int i10) {
            this.f48657a.setSource(i10);
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.p0 Bundle bundle) {
            this.f48657a.setExtras(bundle);
        }

        @Override // androidx.core.view.e.d
        public void v(int i10) {
            this.f48657a.setFlags(i10);
        }

        c(@NonNull e eVar) {
            n.a();
            this.f48657a = m.a(eVar.l());
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.e$e, reason: collision with other inner class name */
    private static final class C0414e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        ClipData f48658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f48659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        Uri f48661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        Bundle f48662e;

        C0414e(@NonNull ClipData clipData, int i10) {
            this.f48658a = clipData;
            this.f48659b = i10;
        }

        @Override // androidx.core.view.e.d
        public void a(@androidx.annotation.p0 Uri uri) {
            this.f48661d = uri;
        }

        @Override // androidx.core.view.e.d
        public void b(@NonNull ClipData clipData) {
            this.f48658a = clipData;
        }

        @Override // androidx.core.view.e.d
        @NonNull
        public e build() {
            return new e(new h(this));
        }

        @Override // androidx.core.view.e.d
        public void c(int i10) {
            this.f48659b = i10;
        }

        @Override // androidx.core.view.e.d
        public void setExtras(@androidx.annotation.p0 Bundle bundle) {
            this.f48662e = bundle;
        }

        @Override // androidx.core.view.e.d
        public void v(int i10) {
            this.f48660c = i10;
        }

        C0414e(@NonNull e eVar) {
            this.f48658a = eVar.c();
            this.f48659b = eVar.g();
            this.f48660c = eVar.e();
            this.f48661d = eVar.f();
            this.f48662e = eVar.d();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final d f48656a;

        public b(@NonNull e eVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f48656a = new c(eVar);
            } else {
                this.f48656a = new C0414e(eVar);
            }
        }

        @NonNull
        public e a() {
            return this.f48656a.build();
        }

        @NonNull
        public b b(@NonNull ClipData clipData) {
            this.f48656a.b(clipData);
            return this;
        }

        @NonNull
        public b c(@androidx.annotation.p0 Bundle bundle) {
            this.f48656a.setExtras(bundle);
            return this;
        }

        @NonNull
        public b d(int i10) {
            this.f48656a.v(i10);
            return this;
        }

        @NonNull
        public b e(@androidx.annotation.p0 Uri uri) {
            this.f48656a.a(uri);
            return this;
        }

        @NonNull
        public b f(int i10) {
            this.f48656a.c(i10);
            return this;
        }

        public b(@NonNull ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f48656a = new c(clipData, i10);
            } else {
                this.f48656a = new C0414e(clipData, i10);
            }
        }
    }
}
