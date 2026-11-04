package com.segment.analytics.kotlin.core;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends Throwable {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f266771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f266771a = cause;
        }

        public static /* synthetic */ a c(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.getCause();
            }
            return aVar.b(bVar);
        }

        @NotNull
        public final b a() {
            return getCause();
        }

        @NotNull
        public final a b(@NotNull b cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new a(cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b getCause() {
            return this.f266771a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(getCause(), ((a) obj).getCause());
        }

        public int hashCode() {
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "BatchUploadFail(cause=" + getCause() + ')';
        }
    }

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.b$b, reason: collision with other inner class name */
    public static final class C1861b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f266772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1861b(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f266772a = message;
        }

        public static /* synthetic */ C1861b c(C1861b c1861b, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = c1861b.getMessage();
            }
            return c1861b.b(str);
        }

        @NotNull
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final C1861b b(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new C1861b(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1861b) && Intrinsics.areEqual(getMessage(), ((C1861b) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.f266772a;
        }

        public int hashCode() {
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "EnrichmentError(message=" + getMessage() + ')';
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Throwable f266773a;

        public c(@Nullable Throwable th2) {
            super(null);
            this.f266773a = th2;
        }

        public static /* synthetic */ c c(c cVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = cVar.getCause();
            }
            return cVar.b(th2);
        }

        @Nullable
        public final Throwable a() {
            return getCause();
        }

        @NotNull
        public final c b(@Nullable Throwable th2) {
            return new c(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(getCause(), ((c) obj).getCause());
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266773a;
        }

        public int hashCode() {
            if (getCause() == null) {
                return 0;
            }
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "JsonUnableToDeserialize(cause=" + getCause() + ')';
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Throwable f266774a;

        public d(@Nullable Throwable th2) {
            super(null);
            this.f266774a = th2;
        }

        public static /* synthetic */ d c(d dVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = dVar.getCause();
            }
            return dVar.b(th2);
        }

        @Nullable
        public final Throwable a() {
            return getCause();
        }

        @NotNull
        public final d b(@Nullable Throwable th2) {
            return new d(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(getCause(), ((d) obj).getCause());
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266774a;
        }

        public int hashCode() {
            if (getCause() == null) {
                return 0;
            }
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "JsonUnableToSerialize(cause=" + getCause() + ')';
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Throwable f266775a;

        public e(@Nullable Throwable th2) {
            super(null);
            this.f266775a = th2;
        }

        public static /* synthetic */ e c(e eVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = eVar.getCause();
            }
            return eVar.b(th2);
        }

        @Nullable
        public final Throwable a() {
            return getCause();
        }

        @NotNull
        public final e b(@Nullable Throwable th2) {
            return new e(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(getCause(), ((e) obj).getCause());
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266775a;
        }

        public int hashCode() {
            if (getCause() != null) {
                return getCause().hashCode();
            }
            int i10 = 1 << 0;
            return 0;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "JsonUnknown(cause=" + getCause() + ')';
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266776a;

        public f(@Nullable String str) {
            super(null);
            this.f266776a = str;
        }

        public static /* synthetic */ f c(f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fVar.getMessage();
            }
            return fVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final f b(@Nullable String str) {
            return new f(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(getMessage(), ((f) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266776a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NetworkInvalidData(message=" + getMessage() + ')';
        }
    }

    public static final class g extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final URL f266777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f266778b;

        public g(@Nullable URL url, int i10) {
            super(null);
            this.f266777a = url;
            this.f266778b = i10;
        }

        public static /* synthetic */ g d(g gVar, URL url, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                url = gVar.f266777a;
            }
            if ((i11 & 2) != 0) {
                i10 = gVar.f266778b;
            }
            return gVar.c(url, i10);
        }

        @Nullable
        public final URL a() {
            return this.f266777a;
        }

        public final int b() {
            return this.f266778b;
        }

        @NotNull
        public final g c(@Nullable URL url, int i10) {
            return new g(url, i10);
        }

        public final int e() {
            return this.f266778b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f266777a, gVar.f266777a) && this.f266778b == gVar.f266778b;
        }

        @Nullable
        public final URL f() {
            return this.f266777a;
        }

        public int hashCode() {
            URL url = this.f266777a;
            return ((url == null ? 0 : url.hashCode()) * 31) + Integer.hashCode(this.f266778b);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NetworkServerLimited(uri=" + this.f266777a + ", code=" + this.f266778b + ')';
        }
    }

    public static final class h extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final URL f266779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f266780b;

        public h(@Nullable URL url, int i10) {
            super(null);
            this.f266779a = url;
            this.f266780b = i10;
        }

        public static /* synthetic */ h d(h hVar, URL url, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                url = hVar.f266779a;
            }
            if ((i11 & 2) != 0) {
                i10 = hVar.f266780b;
            }
            return hVar.c(url, i10);
        }

        @Nullable
        public final URL a() {
            return this.f266779a;
        }

        public final int b() {
            return this.f266780b;
        }

        @NotNull
        public final h c(@Nullable URL url, int i10) {
            return new h(url, i10);
        }

        public final int e() {
            return this.f266780b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f266779a, hVar.f266779a) && this.f266780b == hVar.f266780b;
        }

        @Nullable
        public final URL f() {
            return this.f266779a;
        }

        public int hashCode() {
            URL url = this.f266779a;
            return ((url == null ? 0 : url.hashCode()) * 31) + Integer.hashCode(this.f266780b);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NetworkServerRejected(uri=" + this.f266779a + ", code=" + this.f266780b + ')';
        }
    }

    public static final class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final URL f266781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f266782b;

        public i(@Nullable URL url, int i10) {
            super(null);
            this.f266781a = url;
            this.f266782b = i10;
        }

        public static /* synthetic */ i d(i iVar, URL url, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                url = iVar.f266781a;
            }
            if ((i11 & 2) != 0) {
                i10 = iVar.f266782b;
            }
            return iVar.c(url, i10);
        }

        @Nullable
        public final URL a() {
            return this.f266781a;
        }

        public final int b() {
            return this.f266782b;
        }

        @NotNull
        public final i c(@Nullable URL url, int i10) {
            return new i(url, i10);
        }

        public final int e() {
            return this.f266782b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f266781a, iVar.f266781a) && this.f266782b == iVar.f266782b;
        }

        @Nullable
        public final URL f() {
            return this.f266781a;
        }

        public int hashCode() {
            URL url = this.f266781a;
            return ((url == null ? 0 : url.hashCode()) * 31) + Integer.hashCode(this.f266782b);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NetworkUnexpectedHTTPCode(uri=" + this.f266781a + ", code=" + this.f266782b + ')';
        }
    }

    public static final class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final URL f266783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Throwable f266784b;

        public j(@Nullable URL url, @Nullable Throwable th2) {
            super(null);
            this.f266783a = url;
            this.f266784b = th2;
        }

        public static /* synthetic */ j d(j jVar, URL url, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                url = jVar.f266783a;
            }
            if ((i10 & 2) != 0) {
                th2 = jVar.getCause();
            }
            return jVar.c(url, th2);
        }

        @Nullable
        public final URL a() {
            return this.f266783a;
        }

        @Nullable
        public final Throwable b() {
            return getCause();
        }

        @NotNull
        public final j c(@Nullable URL url, @Nullable Throwable th2) {
            return new j(url, th2);
        }

        @Nullable
        public final URL e() {
            return this.f266783a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Intrinsics.areEqual(this.f266783a, jVar.f266783a) && Intrinsics.areEqual(getCause(), jVar.getCause())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266784b;
        }

        public int hashCode() {
            URL url = this.f266783a;
            int iHashCode = 0;
            int iHashCode2 = (url == null ? 0 : url.hashCode()) * 31;
            if (getCause() != null) {
                iHashCode = getCause().hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "NetworkUnknown(uri=" + this.f266783a + ", cause=" + getCause() + ')';
        }
    }

    public static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Throwable f266785a;

        public k(@Nullable Throwable th2) {
            super(null);
            this.f266785a = th2;
        }

        public static /* synthetic */ k c(k kVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = kVar.getCause();
            }
            return kVar.b(th2);
        }

        @Nullable
        public final Throwable a() {
            return getCause();
        }

        @NotNull
        public final k b(@Nullable Throwable th2) {
            return new k(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(getCause(), ((k) obj).getCause());
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266785a;
        }

        public int hashCode() {
            if (getCause() == null) {
                return 0;
            }
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "PluginError(cause=" + getCause() + ')';
        }
    }

    public static final class l extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f266786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NotNull b cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f266786a = cause;
        }

        public static /* synthetic */ l c(l lVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = lVar.getCause();
            }
            return lVar.b(bVar);
        }

        @NotNull
        public final b a() {
            return getCause();
        }

        @NotNull
        public final l b(@NotNull b cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new l(cause);
        }

        @Override // java.lang.Throwable
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b getCause() {
            return this.f266786a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(getCause(), ((l) obj).getCause());
        }

        public int hashCode() {
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "SettingsFail(cause=" + getCause() + ')';
        }
    }

    public static final class m extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266787a;

        public m(@Nullable String str) {
            super(null);
            this.f266787a = str;
        }

        public static /* synthetic */ m c(m mVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mVar.getMessage();
            }
            return mVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final m b(@Nullable String str) {
            return new m(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual(getMessage(), ((m) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266787a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageInvalid(message=" + getMessage() + ')';
        }
    }

    public static final class n extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266788a;

        public n(@Nullable String str) {
            super(null);
            this.f266788a = str;
        }

        public static /* synthetic */ n c(n nVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = nVar.getMessage();
            }
            return nVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final n b(@Nullable String str) {
            return new n(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && Intrinsics.areEqual(getMessage(), ((n) obj).getMessage())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266788a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnableToClose(message=" + getMessage() + ')';
        }
    }

    public static final class o extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266789a;

        public o(@Nullable String str) {
            super(null);
            this.f266789a = str;
        }

        public static /* synthetic */ o c(o oVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = oVar.getMessage();
            }
            return oVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final o b(@Nullable String str) {
            return new o(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && Intrinsics.areEqual(getMessage(), ((o) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266789a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnableToCreate(message=" + getMessage() + ')';
        }
    }

    public static final class p extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266790a;

        public p(@Nullable String str) {
            super(null);
            this.f266790a = str;
        }

        public static /* synthetic */ p c(p pVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pVar.getMessage();
            }
            return pVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final p b(@Nullable String str) {
            return new p(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && Intrinsics.areEqual(getMessage(), ((p) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266790a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnableToOpen(message=" + getMessage() + ')';
        }
    }

    public static final class q extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266791a;

        public q(@Nullable String str) {
            super(null);
            this.f266791a = str;
        }

        public static /* synthetic */ q c(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.getMessage();
            }
            return qVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final q b(@Nullable String str) {
            return new q(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.areEqual(getMessage(), ((q) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266791a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnableToRename(message=" + getMessage() + ')';
        }
    }

    public static final class r extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f266792a;

        public r(@Nullable String str) {
            super(null);
            this.f266792a = str;
        }

        public static /* synthetic */ r c(r rVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = rVar.getMessage();
            }
            return rVar.b(str);
        }

        @Nullable
        public final String a() {
            return getMessage();
        }

        @NotNull
        public final r b(@Nullable String str) {
            return new r(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Intrinsics.areEqual(getMessage(), ((r) obj).getMessage());
        }

        @Override // java.lang.Throwable
        @Nullable
        public String getMessage() {
            return this.f266792a;
        }

        public int hashCode() {
            if (getMessage() == null) {
                return 0;
            }
            return getMessage().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnableToWrite(message=" + getMessage() + ')';
        }
    }

    public static final class s extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final Throwable f266793a;

        public s(@Nullable Throwable th2) {
            super(null);
            this.f266793a = th2;
        }

        public static /* synthetic */ s c(s sVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = sVar.getCause();
            }
            return sVar.b(th2);
        }

        @Nullable
        public final Throwable a() {
            return getCause();
        }

        @NotNull
        public final s b(@Nullable Throwable th2) {
            return new s(th2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.areEqual(getCause(), ((s) obj).getCause());
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.f266793a;
        }

        public int hashCode() {
            if (getCause() == null) {
                return 0;
            }
            return getCause().hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "StorageUnknown(cause=" + getCause() + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
