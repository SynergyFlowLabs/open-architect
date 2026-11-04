package io.customer.sdk.data.store;

import android.content.Context;
import android.content.SharedPreferences;
import io.customer.sdk.data.model.Settings;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGlobalPreferenceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalPreferenceStore.kt\nio/customer/sdk/data/store/GlobalPreferenceStoreImpl\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 3 PreferenceStore.kt\nio/customer/sdk/data/store/PreferenceStoreKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n39#2,12:59\n39#2,12:71\n40#3:83\n40#3:85\n1#4:84\n1#4:86\n*S KotlinDebug\n*F\n+ 1 GlobalPreferenceStore.kt\nio/customer/sdk/data/store/GlobalPreferenceStoreImpl\n*L\n30#1:59,12\n34#1:71,12\n38#1:83\n42#1:85\n38#1:84\n42#1:86\n*E\n"})
public final class l extends m implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f288536b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f288537c = "device_token";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f288538d = "config_settings";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f288539a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f288539a = g0.c(new Function0() { // from class: io.customer.sdk.data.store.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.prefsName_delegate$lambda$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefsName_delegate$lambda$0(Context context) {
        return "io.customer.sdk." + context.getPackageName();
    }

    @Override // io.customer.sdk.data.store.j
    @Nullable
    public String b() {
        Object objM785constructorimpl;
        SharedPreferences prefs = getPrefs();
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(prefs.getString(f288537c, null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }

    @Override // io.customer.sdk.data.store.j
    public void c() {
        clear(f288537c);
    }

    @Override // io.customer.sdk.data.store.j
    public void d(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putString(f288537c, token);
        editorEdit.apply();
    }

    @Override // io.customer.sdk.data.store.j
    @Nullable
    public Settings e() {
        Object objM785constructorimpl;
        Object objM785constructorimpl2;
        SharedPreferences prefs = getPrefs();
        try {
            Result.a aVar = Result.Companion;
            try {
                Json.Default r10 = Json.Default;
                KSerializer<Settings> kSerializerSerializer = Settings.Companion.serializer();
                String string = prefs.getString(f288538d, null);
                if (string == null) {
                    return null;
                }
                objM785constructorimpl2 = Result.m785constructorimpl((Settings) r10.decodeFromString(kSerializerSerializer, string));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl2 = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m786isFailureimpl(objM785constructorimpl2)) {
                objM785constructorimpl2 = null;
            }
            objM785constructorimpl = Result.m785constructorimpl((Settings) objM785constructorimpl2);
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th3));
        }
        return (Settings) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }

    @Override // io.customer.sdk.data.store.m
    @NotNull
    public String getPrefsName() {
        return (String) this.f288539a.getValue();
    }

    @Override // io.customer.sdk.data.store.j
    public void h(@NotNull Settings value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorEdit = getPrefs().edit();
        editorEdit.putString(f288538d, Json.Default.encodeToString(Settings.Companion.serializer(), value));
        editorEdit.apply();
    }
}
