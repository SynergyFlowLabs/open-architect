package ph;

import android.content.Context;
import android.content.SharedPreferences;
import io.customer.sdk.data.store.m;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSitePreferenceRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SitePreferenceRepository.kt\nio/customer/tracking/migration/repository/preference/SitePreferenceRepositoryImpl\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 3 PreferenceStore.kt\nio/customer/sdk/data/store/PreferenceStoreKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n39#2,12:59\n39#2,12:71\n39#2,12:85\n39#2,12:99\n40#3:83\n40#3:97\n1#4:84\n1#4:98\n*S KotlinDebug\n*F\n+ 1 SitePreferenceRepository.kt\nio/customer/tracking/migration/repository/preference/SitePreferenceRepositoryImpl\n*L\n34#1:59,12\n38#1:71,12\n46#1:85,12\n54#1:99,12\n42#1:83\n50#1:97\n42#1:84\n50#1:98\n*E\n"})
public final class c extends m implements ph.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f350189c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f350190d = "identifier";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f350191e = "device_token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f350192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f350193b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull final Context context, @NotNull String siteId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        this.f350192a = siteId;
        this.f350193b = g0.c(new Function0() { // from class: ph.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.j(context, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Context context, c cVar) {
        return "io.customer.sdk." + context.getPackageName() + "." + cVar.f350192a;
    }

    @Override // ph.a
    @Nullable
    public String a() {
        Object objM785constructorimpl;
        SharedPreferences prefs = getPrefs();
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(prefs.getString("identifier", null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }

    @Override // ph.a
    @Nullable
    public String b() {
        Object objM785constructorimpl;
        SharedPreferences prefs = getPrefs();
        Object obj = null;
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(prefs.getString(f350191e, null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m786isFailureimpl(objM785constructorimpl)) {
            obj = objM785constructorimpl;
        }
        return (String) obj;
    }

    @Override // ph.a
    public void c() {
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.remove(f350191e);
        editorEdit.apply();
    }

    @Override // ph.a
    public void d(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putString(f350191e, token);
        editorEdit.apply();
    }

    @Override // ph.a
    public void f(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.remove("identifier");
        editorEdit.apply();
    }

    @Override // ph.a
    public void g(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putString("identifier", identifier);
        editorEdit.apply();
    }

    @Override // io.customer.sdk.data.store.m
    @NotNull
    public String getPrefsName() {
        return (String) this.f350193b.getValue();
    }
}
