package uf;

import android.content.SharedPreferences;
import com.segment.analytics.kotlin.core.utilities.p;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f381250a;

    public a(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f381250a = sharedPreferences;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f381250a.edit().putString(key, value).commit();
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @Nullable
    public String b(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.f381250a.getString(key, str);
        return string == null ? str : string;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public int c(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f381250a.getInt(key, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f381250a.contains(key);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean d(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f381250a.edit().putInt(key, i10).commit();
    }

    @NotNull
    public final SharedPreferences e() {
        return this.f381250a;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @l(message = "Deprecated in favor of `get`", replaceWith = @b1(expression = "get(key, defaultVal)", imports = {}))
    public int getInt(@NotNull String str, int i10) {
        return p.a.a(this, str, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @l(message = "Deprecated in favor of `put`", replaceWith = @b1(expression = "put(key, value)", imports = {}))
    public boolean putInt(@NotNull String str, int i10) {
        return p.a.b(this, str, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f381250a.edit().remove(key).commit();
    }
}
