package com.segment.analytics.kotlin.core.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f267017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Properties f267018b;

    public q(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f267017a = file;
        this.f267018b = new Properties();
        g();
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean a(@NotNull String key, @NotNull String value) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f267018b.setProperty(key, value);
        i();
        return true;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @Nullable
    public String b(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f267018b.getProperty(key, str);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public int c(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        String property = this.f267018b.getProperty(key, "");
        Intrinsics.checkNotNullExpressionValue(property, "properties.getProperty(key, \"\")");
        Integer intOrNull = StringsKt.toIntOrNull(property);
        return intOrNull != null ? intOrNull.intValue() : i10;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f267018b.containsKey(key);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean d(@NotNull String key, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f267018b.setProperty(key, String.valueOf(i10));
        i();
        return true;
    }

    @NotNull
    public final File e() {
        return this.f267017a;
    }

    @Nullable
    public final String f(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f267018b.getProperty(key, str);
    }

    public final void g() throws IOException {
        if (!this.f267017a.exists()) {
            this.f267017a.getParentFile().mkdirs();
            this.f267017a.createNewFile();
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f267017a);
        try {
            this.f267018b.load(fileInputStream);
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @kotlin.l(message = "Deprecated in favor of `get`", replaceWith = @b1(expression = "get(key, defaultVal)", imports = {}))
    public int getInt(@NotNull String str, int i10) {
        return p.a.a(this, str, i10);
    }

    public final boolean h(@NotNull String key, @NotNull String value) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f267018b.setProperty(key, value);
        i();
        return true;
    }

    public final void i() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.f267017a);
        try {
            this.f267018b.store(fileOutputStream, (String) null);
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    @kotlin.l(message = "Deprecated in favor of `put`", replaceWith = @b1(expression = "put(key, value)", imports = {}))
    public boolean putInt(@NotNull String str, int i10) {
        return p.a.b(this, str, i10);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.p
    public boolean remove(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f267018b.remove(key);
        i();
        return true;
    }
}
